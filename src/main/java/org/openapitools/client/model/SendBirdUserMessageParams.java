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
import org.openapitools.client.model.SendBirdAppleCriticalAlertOptions;
import org.openapitools.client.model.SendBirdMessageMetaArray;
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdUserMessageParams
 */
@JsonPropertyOrder({
  SendBirdUserMessageParams.JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS,
  SendBirdUserMessageParams.JSON_PROPERTY_CUSTOM_TYPE,
  SendBirdUserMessageParams.JSON_PROPERTY_DATA,
  SendBirdUserMessageParams.JSON_PROPERTY_IS_REPLY_TO_CHANNEL,
  SendBirdUserMessageParams.JSON_PROPERTY_MENTION_TYPE,
  SendBirdUserMessageParams.JSON_PROPERTY_MENTIONED_USER_IDS,
  SendBirdUserMessageParams.JSON_PROPERTY_MENTIONED_USERS,
  SendBirdUserMessageParams.JSON_PROPERTY_MESSAGE,
  SendBirdUserMessageParams.JSON_PROPERTY_META_ARRAY_KEYS,
  SendBirdUserMessageParams.JSON_PROPERTY_META_ARRAYS,
  SendBirdUserMessageParams.JSON_PROPERTY_PARENT_MESSAGE_ID,
  SendBirdUserMessageParams.JSON_PROPERTY_POLL_ID,
  SendBirdUserMessageParams.JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION,
  SendBirdUserMessageParams.JSON_PROPERTY_TARGET_LANGUAGES,
  SendBirdUserMessageParams.JSON_PROPERTY_TRANSLATION_TARGET_LANGUAGES
})
@JsonTypeName("SendBird.UserMessageParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class SendBirdUserMessageParams {
  public static final String JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS = "apple_critical_alert_options";
  private SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_IS_REPLY_TO_CHANNEL = "is_reply_to_channel";
  private Boolean isReplyToChannel;

  /**
   * Gets or Sets mentionType
   */
  public enum MentionTypeEnum {
    CHANNEL("channel"),
    
    USERS("users");

    private String value;

    MentionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MentionTypeEnum fromValue(String value) {
      for (MentionTypeEnum b : MentionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MENTION_TYPE = "mention_type";
  private MentionTypeEnum mentionType;

  public static final String JSON_PROPERTY_MENTIONED_USER_IDS = "mentioned_user_ids";
  private List<String> mentionedUserIds = null;

  public static final String JSON_PROPERTY_MENTIONED_USERS = "mentioned_users";
  private List<SendBirdUser> mentionedUsers = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_META_ARRAY_KEYS = "meta_array_keys";
  private List<String> metaArrayKeys = null;

  public static final String JSON_PROPERTY_META_ARRAYS = "meta_arrays";
  private List<SendBirdMessageMetaArray> metaArrays = null;

  public static final String JSON_PROPERTY_PARENT_MESSAGE_ID = "parent_message_id";
  private BigDecimal parentMessageId;

  public static final String JSON_PROPERTY_POLL_ID = "poll_id";
  private BigDecimal pollId;

  /**
   * Gets or Sets pushNotificationDeliveryOption
   */
  public enum PushNotificationDeliveryOptionEnum {
    DEFAULT("default"),
    
    SUPPRESS("suppress");

    private String value;

    PushNotificationDeliveryOptionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PushNotificationDeliveryOptionEnum fromValue(String value) {
      for (PushNotificationDeliveryOptionEnum b : PushNotificationDeliveryOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION = "push_notification_delivery_option";
  private PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption;

  public static final String JSON_PROPERTY_TARGET_LANGUAGES = "target_languages";
  private List<String> targetLanguages = null;

  public static final String JSON_PROPERTY_TRANSLATION_TARGET_LANGUAGES = "translation_target_languages";
  private List<String> translationTargetLanguages = null;

  public SendBirdUserMessageParams() { 
  }

  public SendBirdUserMessageParams appleCriticalAlertOptions(SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions) {
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
    return this;
  }

   /**
   * Get appleCriticalAlertOptions
   * @return appleCriticalAlertOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdAppleCriticalAlertOptions getAppleCriticalAlertOptions() {
    return appleCriticalAlertOptions;
  }


  @JsonProperty(JSON_PROPERTY_APPLE_CRITICAL_ALERT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppleCriticalAlertOptions(SendBirdAppleCriticalAlertOptions appleCriticalAlertOptions) {
    this.appleCriticalAlertOptions = appleCriticalAlertOptions;
  }


  public SendBirdUserMessageParams customType(String customType) {
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


  public SendBirdUserMessageParams data(String data) {
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


  public SendBirdUserMessageParams isReplyToChannel(Boolean isReplyToChannel) {
    this.isReplyToChannel = isReplyToChannel;
    return this;
  }

   /**
   * Get isReplyToChannel
   * @return isReplyToChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REPLY_TO_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReplyToChannel() {
    return isReplyToChannel;
  }


  @JsonProperty(JSON_PROPERTY_IS_REPLY_TO_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsReplyToChannel(Boolean isReplyToChannel) {
    this.isReplyToChannel = isReplyToChannel;
  }


  public SendBirdUserMessageParams mentionType(MentionTypeEnum mentionType) {
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

  public MentionTypeEnum getMentionType() {
    return mentionType;
  }


  @JsonProperty(JSON_PROPERTY_MENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionType(MentionTypeEnum mentionType) {
    this.mentionType = mentionType;
  }


  public SendBirdUserMessageParams mentionedUserIds(List<String> mentionedUserIds) {
    this.mentionedUserIds = mentionedUserIds;
    return this;
  }

  public SendBirdUserMessageParams addMentionedUserIdsItem(String mentionedUserIdsItem) {
    if (this.mentionedUserIds == null) {
      this.mentionedUserIds = new ArrayList<>();
    }
    this.mentionedUserIds.add(mentionedUserIdsItem);
    return this;
  }

   /**
   * Get mentionedUserIds
   * @return mentionedUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SendBirdUserMessageParams mentionedUsers(List<SendBirdUser> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
    return this;
  }

  public SendBirdUserMessageParams addMentionedUsersItem(SendBirdUser mentionedUsersItem) {
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

  public List<SendBirdUser> getMentionedUsers() {
    return mentionedUsers;
  }


  @JsonProperty(JSON_PROPERTY_MENTIONED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMentionedUsers(List<SendBirdUser> mentionedUsers) {
    this.mentionedUsers = mentionedUsers;
  }


  public SendBirdUserMessageParams message(String message) {
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


  public SendBirdUserMessageParams metaArrayKeys(List<String> metaArrayKeys) {
    this.metaArrayKeys = metaArrayKeys;
    return this;
  }

  public SendBirdUserMessageParams addMetaArrayKeysItem(String metaArrayKeysItem) {
    if (this.metaArrayKeys == null) {
      this.metaArrayKeys = new ArrayList<>();
    }
    this.metaArrayKeys.add(metaArrayKeysItem);
    return this;
  }

   /**
   * Get metaArrayKeys
   * @return metaArrayKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META_ARRAY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMetaArrayKeys() {
    return metaArrayKeys;
  }


  @JsonProperty(JSON_PROPERTY_META_ARRAY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaArrayKeys(List<String> metaArrayKeys) {
    this.metaArrayKeys = metaArrayKeys;
  }


  public SendBirdUserMessageParams metaArrays(List<SendBirdMessageMetaArray> metaArrays) {
    this.metaArrays = metaArrays;
    return this;
  }

  public SendBirdUserMessageParams addMetaArraysItem(SendBirdMessageMetaArray metaArraysItem) {
    if (this.metaArrays == null) {
      this.metaArrays = new ArrayList<>();
    }
    this.metaArrays.add(metaArraysItem);
    return this;
  }

   /**
   * Get metaArrays
   * @return metaArrays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META_ARRAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdMessageMetaArray> getMetaArrays() {
    return metaArrays;
  }


  @JsonProperty(JSON_PROPERTY_META_ARRAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaArrays(List<SendBirdMessageMetaArray> metaArrays) {
    this.metaArrays = metaArrays;
  }


  public SendBirdUserMessageParams parentMessageId(BigDecimal parentMessageId) {
    this.parentMessageId = parentMessageId;
    return this;
  }

   /**
   * Get parentMessageId
   * @return parentMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getParentMessageId() {
    return parentMessageId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentMessageId(BigDecimal parentMessageId) {
    this.parentMessageId = parentMessageId;
  }


  public SendBirdUserMessageParams pollId(BigDecimal pollId) {
    this.pollId = pollId;
    return this;
  }

   /**
   * Get pollId
   * @return pollId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPollId() {
    return pollId;
  }


  @JsonProperty(JSON_PROPERTY_POLL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPollId(BigDecimal pollId) {
    this.pollId = pollId;
  }


  public SendBirdUserMessageParams pushNotificationDeliveryOption(PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption) {
    this.pushNotificationDeliveryOption = pushNotificationDeliveryOption;
    return this;
  }

   /**
   * Get pushNotificationDeliveryOption
   * @return pushNotificationDeliveryOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PushNotificationDeliveryOptionEnum getPushNotificationDeliveryOption() {
    return pushNotificationDeliveryOption;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATION_DELIVERY_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushNotificationDeliveryOption(PushNotificationDeliveryOptionEnum pushNotificationDeliveryOption) {
    this.pushNotificationDeliveryOption = pushNotificationDeliveryOption;
  }


  public SendBirdUserMessageParams targetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
    return this;
  }

  public SendBirdUserMessageParams addTargetLanguagesItem(String targetLanguagesItem) {
    if (this.targetLanguages == null) {
      this.targetLanguages = new ArrayList<>();
    }
    this.targetLanguages.add(targetLanguagesItem);
    return this;
  }

   /**
   * Get targetLanguages
   * @return targetLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTargetLanguages() {
    return targetLanguages;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetLanguages(List<String> targetLanguages) {
    this.targetLanguages = targetLanguages;
  }


  public SendBirdUserMessageParams translationTargetLanguages(List<String> translationTargetLanguages) {
    this.translationTargetLanguages = translationTargetLanguages;
    return this;
  }

  public SendBirdUserMessageParams addTranslationTargetLanguagesItem(String translationTargetLanguagesItem) {
    if (this.translationTargetLanguages == null) {
      this.translationTargetLanguages = new ArrayList<>();
    }
    this.translationTargetLanguages.add(translationTargetLanguagesItem);
    return this;
  }

   /**
   * Get translationTargetLanguages
   * @return translationTargetLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSLATION_TARGET_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTranslationTargetLanguages() {
    return translationTargetLanguages;
  }


  @JsonProperty(JSON_PROPERTY_TRANSLATION_TARGET_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslationTargetLanguages(List<String> translationTargetLanguages) {
    this.translationTargetLanguages = translationTargetLanguages;
  }


  /**
   * Return true if this SendBird.UserMessageParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdUserMessageParams sendBirdUserMessageParams = (SendBirdUserMessageParams) o;
    return Objects.equals(this.appleCriticalAlertOptions, sendBirdUserMessageParams.appleCriticalAlertOptions) &&
        Objects.equals(this.customType, sendBirdUserMessageParams.customType) &&
        Objects.equals(this.data, sendBirdUserMessageParams.data) &&
        Objects.equals(this.isReplyToChannel, sendBirdUserMessageParams.isReplyToChannel) &&
        Objects.equals(this.mentionType, sendBirdUserMessageParams.mentionType) &&
        Objects.equals(this.mentionedUserIds, sendBirdUserMessageParams.mentionedUserIds) &&
        Objects.equals(this.mentionedUsers, sendBirdUserMessageParams.mentionedUsers) &&
        Objects.equals(this.message, sendBirdUserMessageParams.message) &&
        Objects.equals(this.metaArrayKeys, sendBirdUserMessageParams.metaArrayKeys) &&
        Objects.equals(this.metaArrays, sendBirdUserMessageParams.metaArrays) &&
        Objects.equals(this.parentMessageId, sendBirdUserMessageParams.parentMessageId) &&
        Objects.equals(this.pollId, sendBirdUserMessageParams.pollId) &&
        Objects.equals(this.pushNotificationDeliveryOption, sendBirdUserMessageParams.pushNotificationDeliveryOption) &&
        Objects.equals(this.targetLanguages, sendBirdUserMessageParams.targetLanguages) &&
        Objects.equals(this.translationTargetLanguages, sendBirdUserMessageParams.translationTargetLanguages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appleCriticalAlertOptions, customType, data, isReplyToChannel, mentionType, mentionedUserIds, mentionedUsers, message, metaArrayKeys, metaArrays, parentMessageId, pollId, pushNotificationDeliveryOption, targetLanguages, translationTargetLanguages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdUserMessageParams {\n");
    sb.append("    appleCriticalAlertOptions: ").append(toIndentedString(appleCriticalAlertOptions)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isReplyToChannel: ").append(toIndentedString(isReplyToChannel)).append("\n");
    sb.append("    mentionType: ").append(toIndentedString(mentionType)).append("\n");
    sb.append("    mentionedUserIds: ").append(toIndentedString(mentionedUserIds)).append("\n");
    sb.append("    mentionedUsers: ").append(toIndentedString(mentionedUsers)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metaArrayKeys: ").append(toIndentedString(metaArrayKeys)).append("\n");
    sb.append("    metaArrays: ").append(toIndentedString(metaArrays)).append("\n");
    sb.append("    parentMessageId: ").append(toIndentedString(parentMessageId)).append("\n");
    sb.append("    pollId: ").append(toIndentedString(pollId)).append("\n");
    sb.append("    pushNotificationDeliveryOption: ").append(toIndentedString(pushNotificationDeliveryOption)).append("\n");
    sb.append("    targetLanguages: ").append(toIndentedString(targetLanguages)).append("\n");
    sb.append("    translationTargetLanguages: ").append(toIndentedString(translationTargetLanguages)).append("\n");
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

