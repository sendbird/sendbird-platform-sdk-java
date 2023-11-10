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
 * UpdateBotByIdData
 */
@JsonPropertyOrder({
  UpdateBotByIdData.JSON_PROPERTY_BOT_USERID,
  UpdateBotByIdData.JSON_PROPERTY_BOT_NICKNAME,
  UpdateBotByIdData.JSON_PROPERTY_BOT_PROFILE_URL,
  UpdateBotByIdData.JSON_PROPERTY_BOT_CALLBACK_URL,
  UpdateBotByIdData.JSON_PROPERTY_IS_PRIVACY_MODE,
  UpdateBotByIdData.JSON_PROPERTY_ENABLE_MARK_AS_READ,
  UpdateBotByIdData.JSON_PROPERTY_SHOW_MEMBER,
  UpdateBotByIdData.JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE
})
@JsonTypeName("updateBotByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class UpdateBotByIdData {
  public static final String JSON_PROPERTY_BOT_USERID = "bot_userid";
  private String botUserid;

  public static final String JSON_PROPERTY_BOT_NICKNAME = "bot_nickname";
  private String botNickname;

  public static final String JSON_PROPERTY_BOT_PROFILE_URL = "bot_profile_url";
  private String botProfileUrl;

  public static final String JSON_PROPERTY_BOT_CALLBACK_URL = "bot_callback_url";
  private String botCallbackUrl;

  public static final String JSON_PROPERTY_IS_PRIVACY_MODE = "is_privacy_mode";
  private Boolean isPrivacyMode;

  public static final String JSON_PROPERTY_ENABLE_MARK_AS_READ = "enable_mark_as_read";
  private Boolean enableMarkAsRead;

  public static final String JSON_PROPERTY_SHOW_MEMBER = "show_member";
  private Boolean showMember;

  public static final String JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE = "channel_invitation_preference";
  private Integer channelInvitationPreference;

  public UpdateBotByIdData() { 
  }

  public UpdateBotByIdData botUserid(String botUserid) {
    this.botUserid = botUserid;
    return this;
  }

   /**
   * Specifies the ID of the bot to update.
   * @return botUserid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the bot to update.")
  @JsonProperty(JSON_PROPERTY_BOT_USERID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBotUserid() {
    return botUserid;
  }


  @JsonProperty(JSON_PROPERTY_BOT_USERID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBotUserid(String botUserid) {
    this.botUserid = botUserid;
  }


  public UpdateBotByIdData botNickname(String botNickname) {
    this.botNickname = botNickname;
    return this;
  }

   /**
   * Specifies the bot&#39;s nickname. The length is limited to 80 characters.
   * @return botNickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the bot's nickname. The length is limited to 80 characters.")
  @JsonProperty(JSON_PROPERTY_BOT_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBotNickname() {
    return botNickname;
  }


  @JsonProperty(JSON_PROPERTY_BOT_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBotNickname(String botNickname) {
    this.botNickname = botNickname;
  }


  public UpdateBotByIdData botProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
    return this;
  }

   /**
   * Specifies the URL of the bot&#39;s profile image. The size is limited to 2,048 characters.
   * @return botProfileUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the bot's profile image. The size is limited to 2,048 characters.")
  @JsonProperty(JSON_PROPERTY_BOT_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBotProfileUrl() {
    return botProfileUrl;
  }


  @JsonProperty(JSON_PROPERTY_BOT_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBotProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
  }


  public UpdateBotByIdData botCallbackUrl(String botCallbackUrl) {
    this.botCallbackUrl = botCallbackUrl;
    return this;
  }

   /**
   * Specifies the server URL where bot is located to receive all events, requests, and data forwarded from an application. For security reasons, it is highly recommended that you use an SSL server. The length is limited to 1,024 characters.
   * @return botCallbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the server URL where bot is located to receive all events, requests, and data forwarded from an application. For security reasons, it is highly recommended that you use an SSL server. The length is limited to 1,024 characters.")
  @JsonProperty(JSON_PROPERTY_BOT_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBotCallbackUrl() {
    return botCallbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_BOT_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBotCallbackUrl(String botCallbackUrl) {
    this.botCallbackUrl = botCallbackUrl;
  }


  public UpdateBotByIdData isPrivacyMode(Boolean isPrivacyMode) {
    this.isPrivacyMode = isPrivacyMode;
    return this;
  }

   /**
   * In the channels of where the bot is a member, determines whether to only forward the messages with the specific conditions to the bot or forword all messages to the bot, for privacy concerns. If set to true, only messages that start with a &#39;/&#39; or mention the bot_userid are forwarded to the bot. If set to false, all messages are forwarded.
   * @return isPrivacyMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "In the channels of where the bot is a member, determines whether to only forward the messages with the specific conditions to the bot or forword all messages to the bot, for privacy concerns. If set to true, only messages that start with a '/' or mention the bot_userid are forwarded to the bot. If set to false, all messages are forwarded.")
  @JsonProperty(JSON_PROPERTY_IS_PRIVACY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPrivacyMode() {
    return isPrivacyMode;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIVACY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPrivacyMode(Boolean isPrivacyMode) {
    this.isPrivacyMode = isPrivacyMode;
  }


  public UpdateBotByIdData enableMarkAsRead(Boolean enableMarkAsRead) {
    this.enableMarkAsRead = enableMarkAsRead;
    return this;
  }

   /**
   * Determines whether to mark the bot&#39;s message as read upon sending it. (Default: true)
   * @return enableMarkAsRead
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to mark the bot's message as read upon sending it. (Default: true)")
  @JsonProperty(JSON_PROPERTY_ENABLE_MARK_AS_READ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnableMarkAsRead() {
    return enableMarkAsRead;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_MARK_AS_READ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnableMarkAsRead(Boolean enableMarkAsRead) {
    this.enableMarkAsRead = enableMarkAsRead;
  }


  public UpdateBotByIdData showMember(Boolean showMember) {
    this.showMember = showMember;
    return this;
  }

   /**
   * Determines whether to include information about the members of each channel in a callback response. (Default: false)
   * @return showMember
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to include information about the members of each channel in a callback response. (Default: false)")
  @JsonProperty(JSON_PROPERTY_SHOW_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getShowMember() {
    return showMember;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_MEMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShowMember(Boolean showMember) {
    this.showMember = showMember;
  }


  public UpdateBotByIdData channelInvitationPreference(Integer channelInvitationPreference) {
    this.channelInvitationPreference = channelInvitationPreference;
    return this;
  }

   /**
   * Determines whether the bot automatically joins the channel when invited or joins the channel after manually accepting an invitation using the API. If set to 0, it automatically joins the channel. If set to 1, the latter takes place. (Default: 0)
   * @return channelInvitationPreference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether the bot automatically joins the channel when invited or joins the channel after manually accepting an invitation using the API. If set to 0, it automatically joins the channel. If set to 1, the latter takes place. (Default: 0)")
  @JsonProperty(JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getChannelInvitationPreference() {
    return channelInvitationPreference;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelInvitationPreference(Integer channelInvitationPreference) {
    this.channelInvitationPreference = channelInvitationPreference;
  }


  /**
   * Return true if this updateBotByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBotByIdData updateBotByIdData = (UpdateBotByIdData) o;
    return Objects.equals(this.botUserid, updateBotByIdData.botUserid) &&
        Objects.equals(this.botNickname, updateBotByIdData.botNickname) &&
        Objects.equals(this.botProfileUrl, updateBotByIdData.botProfileUrl) &&
        Objects.equals(this.botCallbackUrl, updateBotByIdData.botCallbackUrl) &&
        Objects.equals(this.isPrivacyMode, updateBotByIdData.isPrivacyMode) &&
        Objects.equals(this.enableMarkAsRead, updateBotByIdData.enableMarkAsRead) &&
        Objects.equals(this.showMember, updateBotByIdData.showMember) &&
        Objects.equals(this.channelInvitationPreference, updateBotByIdData.channelInvitationPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botUserid, botNickname, botProfileUrl, botCallbackUrl, isPrivacyMode, enableMarkAsRead, showMember, channelInvitationPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBotByIdData {\n");
    sb.append("    botUserid: ").append(toIndentedString(botUserid)).append("\n");
    sb.append("    botNickname: ").append(toIndentedString(botNickname)).append("\n");
    sb.append("    botProfileUrl: ").append(toIndentedString(botProfileUrl)).append("\n");
    sb.append("    botCallbackUrl: ").append(toIndentedString(botCallbackUrl)).append("\n");
    sb.append("    isPrivacyMode: ").append(toIndentedString(isPrivacyMode)).append("\n");
    sb.append("    enableMarkAsRead: ").append(toIndentedString(enableMarkAsRead)).append("\n");
    sb.append("    showMember: ").append(toIndentedString(showMember)).append("\n");
    sb.append("    channelInvitationPreference: ").append(toIndentedString(channelInvitationPreference)).append("\n");
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

