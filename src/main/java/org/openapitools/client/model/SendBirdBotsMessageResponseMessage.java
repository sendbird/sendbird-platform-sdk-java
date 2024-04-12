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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdBotsMessageResponseMessageExtendedMessagePayload;
import org.openapitools.client.model.SendBirdBotsMessageResponseMessageMessageEvents;
import org.openapitools.client.model.SendBirdMessageResponseMentionedUsersInner;
import org.openapitools.client.model.SendBirdMessageResponseUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdBotsMessageResponseMessage
 */
@JsonPropertyOrder({
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_CUSTOM_TYPE,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_MENTIONED_USERS,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_TRANSLATIONS,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_UPDATED_AT,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_IS_OP_MSG,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_IS_REMOVED,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_USER,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_FILE,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_MESSAGE,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_DATA,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_MESSAGE_RETENTION_HOUR,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_SILENT,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_TYPE,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_CREATED_AT,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_CHANNEL_TYPE,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_MENTION_TYPE,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_CHANNEL_URL,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_MESSAGE_ID,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_MESSAGE_EVENTS,
  SendBirdBotsMessageResponseMessage.JSON_PROPERTY_EXTENDED_MESSAGE_PAYLOAD
})
@JsonTypeName("SendBird_BotsMessageResponse_message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class SendBirdBotsMessageResponseMessage {
  public static final String JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS = "message_survival_seconds";
  private BigDecimal messageSurvivalSeconds;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_MENTIONED_USERS = "mentioned_users";
  private List<SendBirdMessageResponseMentionedUsersInner> mentionedUsers = null;

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private Object translations;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private BigDecimal updatedAt;

  public static final String JSON_PROPERTY_IS_OP_MSG = "is_op_msg";
  private Boolean isOpMsg;

  public static final String JSON_PROPERTY_IS_REMOVED = "is_removed";
  private Boolean isRemoved;

  public static final String JSON_PROPERTY_USER = "user";
  private SendBirdMessageResponseUser user;

  public static final String JSON_PROPERTY_FILE = "file";
  private Object _file;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_MESSAGE_RETENTION_HOUR = "message_retention_hour";
  private BigDecimal messageRetentionHour;

  public static final String JSON_PROPERTY_SILENT = "silent";
  private Boolean silent;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_MENTION_TYPE = "mention_type";
  private String mentionType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
  private BigDecimal messageId;

  public static final String JSON_PROPERTY_MESSAGE_EVENTS = "message_events";
  private SendBirdBotsMessageResponseMessageMessageEvents messageEvents;

  public static final String JSON_PROPERTY_EXTENDED_MESSAGE_PAYLOAD = "extended_message_payload";
  private SendBirdBotsMessageResponseMessageExtendedMessagePayload extendedMessagePayload;

  public SendBirdBotsMessageResponseMessage() { 
  }

  public SendBirdBotsMessageResponseMessage messageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
    return this;
  }

   /**
   * Get messageSurvivalSeconds
   * @return messageSurvivalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageSurvivalSeconds() {
    return messageSurvivalSeconds;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_SURVIVAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
  }


  public SendBirdBotsMessageResponseMessage customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Get customType
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendBirdBotsMessageResponseMessage mentionedUsers(List<SendBirdMessageResponseMentionedUsersInner> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public SendBirdBotsMessageResponseMessage addMentionedUsersItem(SendBirdMessageResponseMentionedUsersInner mentionedUsersItem) {
    if (this.mentionedUsers == null) {
      this.mentionedUsers = new ArrayList<>();
    }
    this.mentionedUsers.add(mentionedUsersItem);
    return this;
  }

   /**
   * Get mentionedUsers
   * @return mentionedUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MENTIONED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdMessageResponseMentionedUsersInner> getMentionedUsers() {
    return mentionedUsers;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionedUsers(List<SendBirdMessageResponseMentionedUsersInner> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public SendBirdBotsMessageResponseMessage translations(Object translations) {
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTranslations() {
    return translations;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslations(Object translations) {
    this.translations = translations;
  }


  public SendBirdBotsMessageResponseMessage updatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SendBirdBotsMessageResponseMessage isOpMsg(Boolean isOpMsg) {
    this.isOpMsg = isOpMsg;
    return this;
  }

   /**
   * Get isOpMsg
   * @return isOpMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_OP_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOpMsg() {
    return isOpMsg;
  }


  @JsonProperty(JSON_PROPERTY_IS_OP_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOpMsg(Boolean isOpMsg) {
    this.isOpMsg = isOpMsg;
  }


  public SendBirdBotsMessageResponseMessage isRemoved(Boolean isRemoved) {
    this.isRemoved = isRemoved;
    return this;
  }

   /**
   * Get isRemoved
   * @return isRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRemoved() {
    return isRemoved;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoved(Boolean isRemoved) {
    this.isRemoved = isRemoved;
  }


  public SendBirdBotsMessageResponseMessage user(SendBirdMessageResponseUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdMessageResponseUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(SendBirdMessageResponseUser user) {
    this.user = user;
  }


  public SendBirdBotsMessageResponseMessage _file(Object _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(Object _file) {
    this._file = _file;
  }


  public SendBirdBotsMessageResponseMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendBirdBotsMessageResponseMessage data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendBirdBotsMessageResponseMessage messageRetentionHour(BigDecimal messageRetentionHour) {
    this.messageRetentionHour = messageRetentionHour;
    return this;
  }

   /**
   * Get messageRetentionHour
   * @return messageRetentionHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_RETENTION_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageRetentionHour() {
    return messageRetentionHour;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_RETENTION_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageRetentionHour(BigDecimal messageRetentionHour) {
    this.messageRetentionHour = messageRetentionHour;
  }


  public SendBirdBotsMessageResponseMessage silent(Boolean silent) {
    this.silent = silent;
    return this;
  }

   /**
   * Get silent
   * @return silent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SILENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSilent() {
    return silent;
  }


  @JsonProperty(JSON_PROPERTY_SILENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSilent(Boolean silent) {
    this.silent = silent;
  }


  public SendBirdBotsMessageResponseMessage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public SendBirdBotsMessageResponseMessage createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public SendBirdBotsMessageResponseMessage channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendBirdBotsMessageResponseMessage mentionType(String mentionType) {
    this.mentionType = mentionType;
    return this;
  }

   /**
   * Get mentionType
   * @return mentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendBirdBotsMessageResponseMessage channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Get channelUrl
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendBirdBotsMessageResponseMessage messageId(BigDecimal messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(BigDecimal messageId) {
    this.messageId = messageId;
  }


  public SendBirdBotsMessageResponseMessage messageEvents(SendBirdBotsMessageResponseMessageMessageEvents messageEvents) {
    this.messageEvents = messageEvents;
    return this;
  }

   /**
   * Get messageEvents
   * @return messageEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdBotsMessageResponseMessageMessageEvents getMessageEvents() {
    return messageEvents;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageEvents(SendBirdBotsMessageResponseMessageMessageEvents messageEvents) {
    this.messageEvents = messageEvents;
  }


  public SendBirdBotsMessageResponseMessage extendedMessagePayload(SendBirdBotsMessageResponseMessageExtendedMessagePayload extendedMessagePayload) {
    this.extendedMessagePayload = extendedMessagePayload;
    return this;
  }

   /**
   * Get extendedMessagePayload
   * @return extendedMessagePayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTENDED_MESSAGE_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdBotsMessageResponseMessageExtendedMessagePayload getExtendedMessagePayload() {
    return extendedMessagePayload;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_MESSAGE_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedMessagePayload(SendBirdBotsMessageResponseMessageExtendedMessagePayload extendedMessagePayload) {
    this.extendedMessagePayload = extendedMessagePayload;
  }


  /**
   * Return true if this SendBird_BotsMessageResponse_message object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdBotsMessageResponseMessage sendBirdBotsMessageResponseMessage = (SendBirdBotsMessageResponseMessage) o;
    return Objects.equals(this.messageSurvivalSeconds, sendBirdBotsMessageResponseMessage.messageSurvivalSeconds) &&
        Objects.equals(this.customType, sendBirdBotsMessageResponseMessage.customType) &&
        Objects.equals(this.mentionedUsers, sendBirdBotsMessageResponseMessage.mentionedUsers) &&
        Objects.equals(this.translations, sendBirdBotsMessageResponseMessage.translations) &&
        Objects.equals(this.updatedAt, sendBirdBotsMessageResponseMessage.updatedAt) &&
        Objects.equals(this.isOpMsg, sendBirdBotsMessageResponseMessage.isOpMsg) &&
        Objects.equals(this.isRemoved, sendBirdBotsMessageResponseMessage.isRemoved) &&
        Objects.equals(this.user, sendBirdBotsMessageResponseMessage.user) &&
        Objects.equals(this._file, sendBirdBotsMessageResponseMessage._file) &&
        Objects.equals(this.message, sendBirdBotsMessageResponseMessage.message) &&
        Objects.equals(this.data, sendBirdBotsMessageResponseMessage.data) &&
        Objects.equals(this.messageRetentionHour, sendBirdBotsMessageResponseMessage.messageRetentionHour) &&
        Objects.equals(this.silent, sendBirdBotsMessageResponseMessage.silent) &&
        Objects.equals(this.type, sendBirdBotsMessageResponseMessage.type) &&
        Objects.equals(this.createdAt, sendBirdBotsMessageResponseMessage.createdAt) &&
        Objects.equals(this.channelType, sendBirdBotsMessageResponseMessage.channelType) &&
        Objects.equals(this.mentionType, sendBirdBotsMessageResponseMessage.mentionType) &&
        Objects.equals(this.channelUrl, sendBirdBotsMessageResponseMessage.channelUrl) &&
        Objects.equals(this.messageId, sendBirdBotsMessageResponseMessage.messageId) &&
        Objects.equals(this.messageEvents, sendBirdBotsMessageResponseMessage.messageEvents) &&
        Objects.equals(this.extendedMessagePayload, sendBirdBotsMessageResponseMessage.extendedMessagePayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSurvivalSeconds, customType, mentionedUsers, translations, updatedAt, isOpMsg, isRemoved, user, _file, message, data, messageRetentionHour, silent, type, createdAt, channelType, mentionType, channelUrl, messageId, messageEvents, extendedMessagePayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdBotsMessageResponseMessage {\n");
    sb.append("    messageSurvivalSeconds: ").append(toIndentedString(messageSurvivalSeconds)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    isOpMsg: ").append(toIndentedString(isOpMsg)).append("\n");
    sb.append("    isRemoved: ").append(toIndentedString(isRemoved)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    messageRetentionHour: ").append(toIndentedString(messageRetentionHour)).append("\n");
    sb.append("    silent: ").append(toIndentedString(silent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageEvents: ").append(toIndentedString(messageEvents)).append("\n");
    sb.append("    extendedMessagePayload: ").append(toIndentedString(extendedMessagePayload)).append("\n");
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

