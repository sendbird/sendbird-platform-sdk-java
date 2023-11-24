/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListDataExportsByMessageChannelOrUserResponseExportedDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListDataExportsByMessageChannelOrUserResponse
 */
@JsonPropertyOrder({
  ListDataExportsByMessageChannelOrUserResponse.JSON_PROPERTY_EXPORTED_DATA,
  ListDataExportsByMessageChannelOrUserResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("listDataExportsByMessageChannelOrUserResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ListDataExportsByMessageChannelOrUserResponse {
  public static final String JSON_PROPERTY_EXPORTED_DATA = "exported_data";
  private List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> exportedData = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public ListDataExportsByMessageChannelOrUserResponse() { 
  }

  public ListDataExportsByMessageChannelOrUserResponse exportedData(List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> exportedData) {
    this.exportedData = exportedData;
    return this;
  }

  public ListDataExportsByMessageChannelOrUserResponse addExportedDataItem(ListDataExportsByMessageChannelOrUserResponseExportedDataInner exportedDataItem) {
    if (this.exportedData == null) {
      this.exportedData = new ArrayList<>();
    }
    this.exportedData.add(exportedDataItem);
    return this;
  }

   /**
   * Get exportedData
   * @return exportedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPORTED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> getExportedData() {
    return exportedData;
  }


  @JsonProperty(JSON_PROPERTY_EXPORTED_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportedData(List<ListDataExportsByMessageChannelOrUserResponseExportedDataInner> exportedData) {
    this.exportedData = exportedData;
  }


  public ListDataExportsByMessageChannelOrUserResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  /**
   * Return true if this listDataExportsByMessageChannelOrUserResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDataExportsByMessageChannelOrUserResponse listDataExportsByMessageChannelOrUserResponse = (ListDataExportsByMessageChannelOrUserResponse) o;
    return Objects.equals(this.exportedData, listDataExportsByMessageChannelOrUserResponse.exportedData) &&
        Objects.equals(this.next, listDataExportsByMessageChannelOrUserResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportedData, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDataExportsByMessageChannelOrUserResponse {\n");
    sb.append("    exportedData: ").append(toIndentedString(exportedData)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

