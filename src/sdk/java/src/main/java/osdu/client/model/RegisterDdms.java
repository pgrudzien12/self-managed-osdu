/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package osdu.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import osdu.client.model.RegisterDdmsInterface;

/**
 * RegisterDdms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-08T01:37:46.955Z")
public class RegisterDdms {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("contactEmail")
  private String contactEmail = null;

  @SerializedName("interfaces")
  private List<RegisterDdmsInterface> interfaces = null;

  public RegisterDdms id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegisterDdms name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegisterDdms description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RegisterDdms contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @ApiModelProperty(value = "")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public RegisterDdms interfaces(List<RegisterDdmsInterface> interfaces) {
    this.interfaces = interfaces;
    return this;
  }

  public RegisterDdms addInterfacesItem(RegisterDdmsInterface interfacesItem) {
    if (this.interfaces == null) {
      this.interfaces = new ArrayList<RegisterDdmsInterface>();
    }
    this.interfaces.add(interfacesItem);
    return this;
  }

   /**
   * Get interfaces
   * @return interfaces
  **/
  @ApiModelProperty(value = "")
  public List<RegisterDdmsInterface> getInterfaces() {
    return interfaces;
  }

  public void setInterfaces(List<RegisterDdmsInterface> interfaces) {
    this.interfaces = interfaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterDdms registerDdms = (RegisterDdms) o;
    return Objects.equals(this.id, registerDdms.id) &&
        Objects.equals(this.name, registerDdms.name) &&
        Objects.equals(this.description, registerDdms.description) &&
        Objects.equals(this.contactEmail, registerDdms.contactEmail) &&
        Objects.equals(this.interfaces, registerDdms.interfaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, contactEmail, interfaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterDdms {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
