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
import org.openapitools.client.model.SendBirdChannelResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListMutedChannelsResponse
 */
@JsonPropertyOrder({
  ListMutedChannelsResponse.JSON_PROPERTY_MUTED_CHANNELS,
  ListMutedChannelsResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("listMutedChannelsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class ListMutedChannelsResponse {
  public static final String JSON_PROPERTY_MUTED_CHANNELS = "muted_channels";
  private List<SendBirdChannelResponse> mutedChannels = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public ListMutedChannelsResponse() { 
  }

  public ListMutedChannelsResponse mutedChannels(List<SendBirdChannelResponse> mutedChannels) {
    this.mutedChannels = mutedChannels;
    return this;
  }

  public ListMutedChannelsResponse addMutedChannelsItem(SendBirdChannelResponse mutedChannelsItem) {
    if (this.mutedChannels == null) {
      this.mutedChannels = new ArrayList<>();
    }
    this.mutedChannels.add(mutedChannelsItem);
    return this;
  }

   /**
   * Get mutedChannels
   * @return mutedChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUTED_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdChannelResponse> getMutedChannels() {
    return mutedChannels;
  }


  @JsonProperty(JSON_PROPERTY_MUTED_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutedChannels(List<SendBirdChannelResponse> mutedChannels) {
    this.mutedChannels = mutedChannels;
  }


  public ListMutedChannelsResponse next(String next) {
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
   * Return true if this listMutedChannelsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMutedChannelsResponse listMutedChannelsResponse = (ListMutedChannelsResponse) o;
    return Objects.equals(this.mutedChannels, listMutedChannelsResponse.mutedChannels) &&
        Objects.equals(this.next, listMutedChannelsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutedChannels, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMutedChannelsResponse {\n");
    sb.append("    mutedChannels: ").append(toIndentedString(mutedChannels)).append("\n");
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

