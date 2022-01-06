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
import java.util.Map;

/**
 * SearchCursorQueryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:46:16.718Z")
public class SearchCursorQueryResponse {
  @SerializedName("cursor")
  private String cursor = null;

  @SerializedName("results")
  private List<Map<String, Object>> results = null;

  @SerializedName("totalCount")
  private Long totalCount = null;

  public SearchCursorQueryResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public SearchCursorQueryResponse results(List<Map<String, Object>> results) {
    this.results = results;
    return this;
  }

  public SearchCursorQueryResponse addResultsItem(Map<String, Object> resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Map<String, Object>>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<Map<String, Object>> getResults() {
    return results;
  }

  public void setResults(List<Map<String, Object>> results) {
    this.results = results;
  }

  public SearchCursorQueryResponse totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
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
    SearchCursorQueryResponse searchCursorQueryResponse = (SearchCursorQueryResponse) o;
    return Objects.equals(this.cursor, searchCursorQueryResponse.cursor) &&
        Objects.equals(this.results, searchCursorQueryResponse.results) &&
        Objects.equals(this.totalCount, searchCursorQueryResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, results, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCursorQueryResponse {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

