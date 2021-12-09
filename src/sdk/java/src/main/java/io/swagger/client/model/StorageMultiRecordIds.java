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
import java.util.ArrayList;
import java.util.List;

/**
 * Multiple storage record ids and filter attributes.
 */
@ApiModel(description = "Multiple storage record ids and filter attributes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-09T19:33:56.348Z")
public class StorageMultiRecordIds {
  @SerializedName("records")
  private List<String> records = new ArrayList<String>();

  @SerializedName("attributes")
  private List<String> attributes = null;

  public StorageMultiRecordIds records(List<String> records) {
    this.records = records;
    return this;
  }

  public StorageMultiRecordIds addRecordsItem(String recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * List of record ids. Each record id must follow the naming convention {OSDU-Account-Id}:{dataset-name}:{record-type}:{version}.
   * @return records
  **/
  @ApiModelProperty(example = "\"tenant1:well:123456789\"", required = true, value = "List of record ids. Each record id must follow the naming convention {OSDU-Account-Id}:{dataset-name}:{record-type}:{version}.")
  public List<String> getRecords() {
    return records;
  }

  public void setRecords(List<String> records) {
    this.records = records;
  }

  public StorageMultiRecordIds attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public StorageMultiRecordIds addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<String>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Filter attributes to restrict the returned fields of the record. Usage: data.{record-data-field-name}.
   * @return attributes
  **/
  @ApiModelProperty(example = "\"data.wellName\"", value = "Filter attributes to restrict the returned fields of the record. Usage: data.{record-data-field-name}.")
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageMultiRecordIds storageMultiRecordIds = (StorageMultiRecordIds) o;
    return Objects.equals(this.records, storageMultiRecordIds.records) &&
        Objects.equals(this.attributes, storageMultiRecordIds.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageMultiRecordIds {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

