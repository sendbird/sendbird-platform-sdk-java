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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdateMessageByIdData
 */
@JsonPropertyOrder({
  UpdateMessageByIdData.JSON_PROPERTY_CHANNEL_TYPE,
  UpdateMessageByIdData.JSON_PROPERTY_CHANNEL_URL,
  UpdateMessageByIdData.JSON_PROPERTY_MESSAGE_ID,
  UpdateMessageByIdData.JSON_PROPERTY_MESSAGE_TYPE,
  UpdateMessageByIdData.JSON_PROPERTY_MESSAGE,
  UpdateMessageByIdData.JSON_PROPERTY_CUSTOM_TYPE,
  UpdateMessageByIdData.JSON_PROPERTY_DATA,
  UpdateMessageByIdData.JSON_PROPERTY_MENTION_TYPE,
  UpdateMessageByIdData.JSON_PROPERTY_MENTIONED_USER_IDS
})
@JsonTypeName("updateMessageByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class UpdateMessageByIdData {
  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
  private Integer messageId;

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "message_type";
  private String messageType;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_MENTION_TYPE = "mention_type";
  private String mentionType;

  public static final String JSON_PROPERTY_MENTIONED_USER_IDS = "mentioned_user_ids";
  private List<String> mentionedUserIds = null;

  public UpdateMessageByIdData() { 
  }

  public UpdateMessageByIdData channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Either open_channels or group_channels.
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the channel. Either open_channels or group_channels.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelType() {
    return channelType;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public UpdateMessageByIdData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the target channel.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public UpdateMessageByIdData messageId(Integer messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Specifies the unique ID of the message to update.
   * @return messageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the message to update.")
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


  public UpdateMessageByIdData messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Specifies the type of the message as ADMM.
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the message as ADMM.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public UpdateMessageByIdData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Specifies the content of the message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the content of the message.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public UpdateMessageByIdData customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.<br /><br /> Custom types are also used within Sendbird's [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomType() {
    return customType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public UpdateMessageByIdData data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional message information such as custom font size, font type or `JSON` formatted string.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public UpdateMessageByIdData mentionType(String mentionType) {
    this.mentionType = mentionType;
    return this;
  }

   /**
   * Specifies the mentioning method which indicates the user scope who will get a notification for the message. Acceptable values are users and channel. If set to users, only the specified users with the mentioned_users property below will get notified. If set to channel, all users in the channel will get notified. (Default: users)
   * @return mentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the mentioning method which indicates the user scope who will get a notification for the message. Acceptable values are users and channel. If set to users, only the specified users with the mentioned_users property below will get notified. If set to channel, all users in the channel will get notified. (Default: users)")
  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMentionType() {
    return mentionType;
  }


  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionType(String mentionType) {
    this.mentionType = mentionType;
  }


  public UpdateMessageByIdData mentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
    return this;
  }

  public UpdateMessageByIdData addMentionedUserIdsItem(String mentionedUserIdsItem) {
    if (this.mentionedUserIds == null) {
      this.mentionedUserIds = new ArrayList<>();
    }
    this.mentionedUserIds.add(mentionedUserIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of the users who will get a notification for the message.
   * @return mentionedUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of the users who will get a notification for the message.")
  @JsonProperty(JSON_PROPERTY_MENTIONED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMentionedUserIds() {
    return mentionedUserIds;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
  }


  /**
   * Return true if this updateMessageByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMessageByIdData updateMessageByIdData = (UpdateMessageByIdData) o;
    return Objects.equals(this.channelType, updateMessageByIdData.channelType) &&
        Objects.equals(this.channelUrl, updateMessageByIdData.channelUrl) &&
        Objects.equals(this.messageId, updateMessageByIdData.messageId) &&
        Objects.equals(this.messageType, updateMessageByIdData.messageType) &&
        Objects.equals(this.message, updateMessageByIdData.message) &&
        Objects.equals(this.customType, updateMessageByIdData.customType) &&
        Objects.equals(this.data, updateMessageByIdData.data) &&
        Objects.equals(this.mentionType, updateMessageByIdData.mentionType) &&
        Objects.equals(this.mentionedUserIds, updateMessageByIdData.mentionedUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, messageId, messageType, message, customType, data, mentionType, mentionedUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMessageByIdData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    mentionedUserIds: ").append(toIndentedString(mentionedUserIds)).append("\n");
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

