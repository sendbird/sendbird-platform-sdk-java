/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

/**
 * OcFreezeChannelData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T16:47:24.427118Z[Europe/London]")
public class OcFreezeChannelData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_FREEZE = "freeze";
  @SerializedName(SERIALIZED_NAME_FREEZE)
  private Boolean freeze;

  public OcFreezeChannelData() { 
  }

  public OcFreezeChannelData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to freeze.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to freeze.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public OcFreezeChannelData freeze(Boolean freeze) {
    
    this.freeze = freeze;
    return this;
  }

   /**
   * Determines whether to freeze the channel. (Default: false)
   * @return freeze
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to freeze the channel. (Default: false)")

  public Boolean getFreeze() {
    return freeze;
  }


  public void setFreeze(Boolean freeze) {
    this.freeze = freeze;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcFreezeChannelData ocFreezeChannelData = (OcFreezeChannelData) o;
    return Objects.equals(this.channelUrl, ocFreezeChannelData.channelUrl) &&
        Objects.equals(this.freeze, ocFreezeChannelData.freeze);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, freeze);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcFreezeChannelData {\n");
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

