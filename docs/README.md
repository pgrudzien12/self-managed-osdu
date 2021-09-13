# VS Code Container Provisioning

An environment can be installed using the vscode `remote-container` feature.  This method uses a base container that is controlled to ensure all the required dependencies exist to be able to execute terraform provisionings and includes a wrapper terraform script.

The solution helps you managing your custom OSDU on Azure deployment on Microsoft Azure and is composed of two parts:

**A docker container**
  - Allows a consistent experience with the right tools.
  - Native integration with [Visual Studio Code](https://code.visualstudio.com/docs/remote/containers).
  - Contains the versioned infra-azure-provisioning you need to override.


**A Terraform wrapper**
  - Helps you store and retrieve Terraform state files on Azure storage account.
  - Enables seamless experience (state connection, execution traces, etc.).


### Open VS Code in Container

The solution leverages [Visual Studio Code Remote - Containers](https://code.visualstudio.com/docs/remote/containers) to deploy the infrastructure.

Open the solution with VSCode `Reopen in Container` and login to the Azure CLI

> This process requires the logged in user to have access to the builder keyvault secrets and the storage account.

```bash
# Login to Azure CLI and set the subscription.
az login
az account set --subscription <your_subscription>
```


### Install Infrastructure from the Container

```bash
# Download and set the environment variables
VAULT=<your_builer_vault>
az keyvault set-policy --name $VAULT --secret-permissions get list \
  --object-id $(az ad user show --id $(az account show --query user.name -otsv) --query objectId -otsv)
az keyvault secret show --id https://$VAULT.vault.azure.net/secrets/envrc --query value -otsv > .envrc

# Allow environment variable loading
direnv allow
```

__SSH Keys__

Retrieve the required environment SSH Keys

```bash
export SSH_DIR='.ssh'
mkdir $SSH_DIR

## Download SSH Keys ##
az storage file download-batch \
  --account-key $(az keyvault secret show --id https://$VAULT.vault.azure.net/secrets/storage-key --query value -otsv) \
  --account-name $(az keyvault secret show --id https://$VAULT.vault.azure.net/secrets/storage --query value -otsv) \
  --source ssh-keys \
  --destination $SSH_DIR
```


__Infrastructure Configuration__

Each template has a custom configuration file that should be used to customize the environment settings.

| name             | description                                                     |
| ---------------- | --------------------------------------------------------------- |
| central.tfvars   | Custom Override Terraform Configuration for Central Resources   |
| partition.tfvars | Custom Override Terraform Configuration for Partition Resources |
| service.tfvars   | Custom Override Terraform Configuration for Service Resources   |

```bash
## Download and edit files as necessary ##
az storage file download-batch \
  --account-key $(az keyvault secret show --id https://$VAULT.vault.azure.net/secrets/storage-key --query value -otsv) \
  --account-name $(az keyvault secret show --id https://$VAULT.vault.azure.net/secrets/storage --query value -otsv) \
  --source configuration \
  --destination .

## Move the custom configurations to templates ##
mv central.tfvars templates/osdu-r3-mvp/central_resources/custom.tfvars
mv partition.tfvars templates/osdu-r3-mvp/data_partition/custom.tfvars
mv service.tfvars templates/osdu-r3-mvp/service_resources/custom.tfvars

## Upload the custom configurations back to storage ##
az storage file upload-batch \
  --account-key $(az keyvault secret show --id https://$VAULT.vault.azure.net/secrets/storage-key --query value -otsv) \
  --account-name $(az keyvault secret show --id https://$VAULT.vault.azure.net/secrets/storage --query value -otsv) \
  --destination configuration \
  --source $(realpath .) \
  --pattern **/custom.tfvars
```

__Infrastructure Deployment__

Provision the infrastructure using the terraform.sh wrapper.

```bash
## Install the Central Resources ##
export TF_VAR_workspace="cr-${UNIQUE}" && cd /osdu-azure/templates/osdu-r3-mvp/central_resources
terraform.sh show  # Show the Terraform Plan
terraform.sh run   # Apply the Terraform Plan

## Install the Data Partition ##
export TF_VAR_workspace="dp1-${UNIQUE}" && cd /osdu-azure/templates/osdu-r3-mvp/data_partition
terraform.sh show  # Show the Terraform Plan
terraform.sh run   # Apply the Terraform Plan

## Install the Service Resources ##
export TF_VAR_workspace="sr-${UNIQUE}" && cd /osdu-azure/templates/osdu-r3-mvp/service_resources
terraform.sh show  # Show the Terraform Plan
terraform.sh run   # Apply the Terraform Plan
```