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
import org.openapitools.client.model.ListMessagesResponseMessagesInnerSortedMetaarrayInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddExtraDataToMessageResponse
 */
@JsonPropertyOrder({
  AddExtraDataToMessageResponse.JSON_PROPERTY_SORTED_METAARRAY
})
@JsonTypeName("addExtraDataToMessageResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class AddExtraDataToMessageResponse {
  public static final String JSON_PROPERTY_SORTED_METAARRAY = "sorted_metaarray";
  private List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> sortedMetaarray = null;

  public AddExtraDataToMessageResponse() { 
  }

  public AddExtraDataToMessageResponse sortedMetaarray(List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

  public AddExtraDataToMessageResponse addSortedMetaarrayItem(ListMessagesResponseMessagesInnerSortedMetaarrayInner sortedMetaarrayItem) {
    if (this.sortedMetaarray == null) {
      this.sortedMetaarray = new ArrayList<>();
    }
    this.sortedMetaarray.add(sortedMetaarrayItem);
    return this;
  }

   /**
   * Get sortedMetaarray
   * @return sortedMetaarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> getSortedMetaarray() {
    return sortedMetaarray;
  }


  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortedMetaarray(List<ListMessagesResponseMessagesInnerSortedMetaarrayInner> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  /**
   * Return true if this addExtraDataToMessageResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddExtraDataToMessageResponse addExtraDataToMessageResponse = (AddExtraDataToMessageResponse) o;
    return Objects.equals(this.sortedMetaarray, addExtraDataToMessageResponse.sortedMetaarray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortedMetaarray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddExtraDataToMessageResponse {\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
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

