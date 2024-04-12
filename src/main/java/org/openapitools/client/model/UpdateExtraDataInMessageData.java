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
 * UpdateExtraDataInMessageData
 */
@JsonPropertyOrder({
  UpdateExtraDataInMessageData.JSON_PROPERTY_CHANNEL_TYPE,
  UpdateExtraDataInMessageData.JSON_PROPERTY_CHANNEL_URL,
  UpdateExtraDataInMessageData.JSON_PROPERTY_MESSAGE_ID,
  UpdateExtraDataInMessageData.JSON_PROPERTY_SORTED_METAARRAY,
  UpdateExtraDataInMessageData.JSON_PROPERTY_MODE,
  UpdateExtraDataInMessageData.JSON_PROPERTY_UPSERT
})
@JsonTypeName("updateExtraDataInMessageData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class UpdateExtraDataInMessageData {
  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
  private Integer messageId;

  public static final String JSON_PROPERTY_SORTED_METAARRAY = "sorted_metaarray";
  private String sortedMetaarray;

  public static final String JSON_PROPERTY_MODE = "mode";
  private String mode;

  public static final String JSON_PROPERTY_UPSERT = "upsert";
  private Boolean upsert;

  public UpdateExtraDataInMessageData() { 
  }

  public UpdateExtraDataInMessageData channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Either open_channels or group_channels.
   * @return channelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the channel. Either open_channels or group_channels.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelType() {
    return channelType;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public UpdateExtraDataInMessageData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel.")
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


  public UpdateExtraDataInMessageData messageId(Integer messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Specifies the unique ID of the message to update key-values items.
   * @return messageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the message to update key-values items.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }


  public UpdateExtraDataInMessageData sortedMetaarray(String sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object of one or more key-values items which store additional message information. Each item consists of a key and the values in an array. Items are saved and will be returned in the exact order they&#39;ve been specified.
   * @return sortedMetaarray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object of one or more key-values items which store additional message information. Each item consists of a key and the values in an array. Items are saved and will be returned in the exact order they've been specified.")
  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSortedMetaarray() {
    return sortedMetaarray;
  }


  @JsonProperty(JSON_PROPERTY_SORTED_METAARRAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSortedMetaarray(String sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  public UpdateExtraDataInMessageData mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Determines whether to add the specified values in the items or remove the specified values from the existing items. Acceptable values are limited to add and remove. If set to add, the specified values are added only when they are different from the existing values. If set to remove, the specified values are removed only when they have the corresponding ones in the existing values.
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to add the specified values in the items or remove the specified values from the existing items. Acceptable values are limited to add and remove. If set to add, the specified values are added only when they are different from the existing values. If set to remove, the specified values are removed only when they have the corresponding ones in the existing values.")
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMode(String mode) {
    this.mode = mode;
  }


  public UpdateExtraDataInMessageData upsert(Boolean upsert) {
    this.upsert = upsert;
    return this;
  }

   /**
   * Determines whether to add new items in addition to updating existing items. If true, new key-values items are added when there are no items with the keys. The existing items are updated with new values when there are already items with the keys. If false, only the items of which keys match the ones you specify are updated with new values. (Default: false)
   * @return upsert
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to add new items in addition to updating existing items. If true, new key-values items are added when there are no items with the keys. The existing items are updated with new values when there are already items with the keys. If false, only the items of which keys match the ones you specify are updated with new values. (Default: false)")
  @JsonProperty(JSON_PROPERTY_UPSERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUpsert() {
    return upsert;
  }


  @JsonProperty(JSON_PROPERTY_UPSERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpsert(Boolean upsert) {
    this.upsert = upsert;
  }


  /**
   * Return true if this updateExtraDataInMessageData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExtraDataInMessageData updateExtraDataInMessageData = (UpdateExtraDataInMessageData) o;
    return Objects.equals(this.channelType, updateExtraDataInMessageData.channelType) &&
        Objects.equals(this.channelUrl, updateExtraDataInMessageData.channelUrl) &&
        Objects.equals(this.messageId, updateExtraDataInMessageData.messageId) &&
        Objects.equals(this.sortedMetaarray, updateExtraDataInMessageData.sortedMetaarray) &&
        Objects.equals(this.mode, updateExtraDataInMessageData.mode) &&
        Objects.equals(this.upsert, updateExtraDataInMessageData.upsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, messageId, sortedMetaarray, mode, upsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExtraDataInMessageData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    upsert: ").append(toIndentedString(upsert)).append("\n");
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

