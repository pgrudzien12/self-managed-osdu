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


package io.swagger.client.model;

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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A relationship from this entity to many other entities either by natural key (name) or explicit id, optionally classified by confidence level.
 */
@ApiModel(description = "A relationship from this entity to many other entities either by natural key (name) or explicit id, optionally classified by confidence level.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:33:05.130Z")
public class FileToManyRelationship {
  @SerializedName("confidences")
  private List<BigDecimal> confidences = null;

  @SerializedName("ids")
  private List<String> ids = null;

  @SerializedName("names")
  private List<String> names = null;

  @SerializedName("versions")
  private List<BigDecimal> versions = null;

  public FileToManyRelationship confidences(List<BigDecimal> confidences) {
    this.confidences = confidences;
    return this;
  }

  public FileToManyRelationship addConfidencesItem(BigDecimal confidencesItem) {
    if (this.confidences == null) {
      this.confidences = new ArrayList<BigDecimal>();
    }
    this.confidences.add(confidencesItem);
    return this;
  }

   /**
   * The confidences of the relationships. Keep all the arrays ordered and aligned.
   * @return confidences
  **/
  @ApiModelProperty(value = "The confidences of the relationships. Keep all the arrays ordered and aligned.")
  public List<BigDecimal> getConfidences() {
    return confidences;
  }

  public void setConfidences(List<BigDecimal> confidences) {
    this.confidences = confidences;
  }

  public FileToManyRelationship ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FileToManyRelationship addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The ids of the related objects. It is populated for an explicit relationship where the target entity is present as a record in the data ecosystem. Keep all the arrays ordered and aligned.
   * @return ids
  **/
  @ApiModelProperty(value = "The ids of the related objects. It is populated for an explicit relationship where the target entity is present as a record in the data ecosystem. Keep all the arrays ordered and aligned.")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public FileToManyRelationship names(List<String> names) {
    this.names = names;
    return this;
  }

  public FileToManyRelationship addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The names or natural keys of the related objects. Keep all the arrays ordered and aligned.
   * @return names
  **/
  @ApiModelProperty(value = "The names or natural keys of the related objects. Keep all the arrays ordered and aligned.")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public FileToManyRelationship versions(List<BigDecimal> versions) {
    this.versions = versions;
    return this;
  }

  public FileToManyRelationship addVersionsItem(BigDecimal versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<BigDecimal>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * The specific version numbers of the related instances. This is only specified if a specific version is required. If not populated the last version is implied. Keep all the arrays ordered and aligned.
   * @return versions
  **/
  @ApiModelProperty(value = "The specific version numbers of the related instances. This is only specified if a specific version is required. If not populated the last version is implied. Keep all the arrays ordered and aligned.")
  public List<BigDecimal> getVersions() {
    return versions;
  }

  public void setVersions(List<BigDecimal> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileToManyRelationship fileToManyRelationship = (FileToManyRelationship) o;
    return Objects.equals(this.confidences, fileToManyRelationship.confidences) &&
        Objects.equals(this.ids, fileToManyRelationship.ids) &&
        Objects.equals(this.names, fileToManyRelationship.names) &&
        Objects.equals(this.versions, fileToManyRelationship.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidences, ids, names, versions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileToManyRelationship {\n");
    
    sb.append("    confidences: ").append(toIndentedString(confidences)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

