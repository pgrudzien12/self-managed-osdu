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
import io.swagger.client.model.SchemaInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The response for a GET schema request
 */
@ApiModel(description = "The response for a GET schema request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:33:05.130Z")
public class SchemaInfoResponse {
  @SerializedName("schemaInfos")
  private List<SchemaInfo> schemaInfos = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  public SchemaInfoResponse schemaInfos(List<SchemaInfo> schemaInfos) {
    this.schemaInfos = schemaInfos;
    return this;
  }

  public SchemaInfoResponse addSchemaInfosItem(SchemaInfo schemaInfosItem) {
    if (this.schemaInfos == null) {
      this.schemaInfos = new ArrayList<SchemaInfo>();
    }
    this.schemaInfos.add(schemaInfosItem);
    return this;
  }

   /**
   * Get schemaInfos
   * @return schemaInfos
  **/
  @ApiModelProperty(value = "")
  public List<SchemaInfo> getSchemaInfos() {
    return schemaInfos;
  }

  public void setSchemaInfos(List<SchemaInfo> schemaInfos) {
    this.schemaInfos = schemaInfos;
  }

  public SchemaInfoResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The offset for the next query
   * minimum: 0
   * @return offset
  **/
  @ApiModelProperty(value = "The offset for the next query")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public SchemaInfoResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of schema versions in this response
   * minimum: 0
   * @return count
  **/
  @ApiModelProperty(value = "The number of schema versions in this response")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SchemaInfoResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of entity type codes in the repositories
   * minimum: 0
   * @return totalCount
  **/
  @ApiModelProperty(value = "The total number of entity type codes in the repositories")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaInfoResponse schemaInfoResponse = (SchemaInfoResponse) o;
    return Objects.equals(this.schemaInfos, schemaInfoResponse.schemaInfos) &&
        Objects.equals(this.offset, schemaInfoResponse.offset) &&
        Objects.equals(this.count, schemaInfoResponse.count) &&
        Objects.equals(this.totalCount, schemaInfoResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaInfos, offset, count, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaInfoResponse {\n");
    
    sb.append("    schemaInfos: ").append(toIndentedString(schemaInfos)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

