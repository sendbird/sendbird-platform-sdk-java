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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcFreezeChannelData
 */
@JsonPropertyOrder({
  GcFreezeChannelData.JSON_PROPERTY_CHANNEL_URL,
  GcFreezeChannelData.JSON_PROPERTY_FREEZE
})
@JsonTypeName("gcFreezeChannelData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class GcFreezeChannelData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_FREEZE = "freeze";
  private Boolean freeze;

  public GcFreezeChannelData() { 
  }

  public GcFreezeChannelData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to freeze.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to freeze.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcFreezeChannelData freeze(Boolean freeze) {
    this.freeze = freeze;
    return this;
  }

   /**
   * Determines whether to freeze the channel. (Default: false)
   * @return freeze
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to freeze the channel. (Default: false)")
  @JsonProperty(JSON_PROPERTY_FREEZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFreeze() {
    return freeze;
  }


  @JsonProperty(JSON_PROPERTY_FREEZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFreeze(Boolean freeze) {
    this.freeze = freeze;
  }


  /**
   * Return true if this gcFreezeChannelData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcFreezeChannelData gcFreezeChannelData = (GcFreezeChannelData) o;
    return Objects.equals(this.channelUrl, gcFreezeChannelData.channelUrl) &&
        Objects.equals(this.freeze, gcFreezeChannelData.freeze);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, freeze);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcFreezeChannelData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    freeze: ").append(toIndentedString(freeze)).append("\n");
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

