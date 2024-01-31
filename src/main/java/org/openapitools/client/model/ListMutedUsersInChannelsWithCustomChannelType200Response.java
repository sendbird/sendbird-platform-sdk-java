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
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListMutedUsersInChannelsWithCustomChannelType200Response
 */
@JsonPropertyOrder({
  ListMutedUsersInChannelsWithCustomChannelType200Response.JSON_PROPERTY_MUTED_LIST,
  ListMutedUsersInChannelsWithCustomChannelType200Response.JSON_PROPERTY_NEXT
})
@JsonTypeName("listMutedUsersInChannelsWithCustomChannelType_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ListMutedUsersInChannelsWithCustomChannelType200Response {
  public static final String JSON_PROPERTY_MUTED_LIST = "muted_list";
  private List<SendBirdUser> mutedList = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public ListMutedUsersInChannelsWithCustomChannelType200Response() { 
  }

  public ListMutedUsersInChannelsWithCustomChannelType200Response mutedList(List<SendBirdUser> mutedList) {
    this.mutedList = mutedList;
    return this;
  }

  public ListMutedUsersInChannelsWithCustomChannelType200Response addMutedListItem(SendBirdUser mutedListItem) {
    if (this.mutedList == null) {
      this.mutedList = new ArrayList<>();
    }
    this.mutedList.add(mutedListItem);
    return this;
  }

   /**
   * Get mutedList
   * @return mutedList
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUTED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdUser> getMutedList() {
    return mutedList;
  }


  @JsonProperty(JSON_PROPERTY_MUTED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutedList(List<SendBirdUser> mutedList) {
    this.mutedList = mutedList;
  }


  public ListMutedUsersInChannelsWithCustomChannelType200Response next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this listMutedUsersInChannelsWithCustomChannelType_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMutedUsersInChannelsWithCustomChannelType200Response listMutedUsersInChannelsWithCustomChannelType200Response = (ListMutedUsersInChannelsWithCustomChannelType200Response) o;
    return Objects.equals(this.mutedList, listMutedUsersInChannelsWithCustomChannelType200Response.mutedList) &&
        Objects.equals(this.next, listMutedUsersInChannelsWithCustomChannelType200Response.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutedList, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMutedUsersInChannelsWithCustomChannelType200Response {\n");
    sb.append("    mutedList: ").append(toIndentedString(mutedList)).append("\n");
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

