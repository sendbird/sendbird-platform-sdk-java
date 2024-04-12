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
import org.openapitools.client.model.CreateBotResponseBot;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * CreateBotResponse
 */
@JsonPropertyOrder({
  CreateBotResponse.JSON_PROPERTY_BOT,
  CreateBotResponse.JSON_PROPERTY_BOT_CALLBACK_URL,
  CreateBotResponse.JSON_PROPERTY_ENABLE_MARK_AS_READ,
  CreateBotResponse.JSON_PROPERTY_IS_PRIVACY_MODE,
  CreateBotResponse.JSON_PROPERTY_SHOW_MEMBER,
  CreateBotResponse.JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE
})
@JsonTypeName("createBotResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class CreateBotResponse {
  public static final String JSON_PROPERTY_BOT = "bot";
  private CreateBotResponseBot bot;

  public static final String JSON_PROPERTY_BOT_CALLBACK_URL = "bot_callback_url";
  private String botCallbackUrl;

  public static final String JSON_PROPERTY_ENABLE_MARK_AS_READ = "enable_mark_as_read";
  private Boolean enableMarkAsRead;

  public static final String JSON_PROPERTY_IS_PRIVACY_MODE = "is_privacy_mode";
  private Boolean isPrivacyMode;

  public static final String JSON_PROPERTY_SHOW_MEMBER = "show_member";
  private Boolean showMember;

  public static final String JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE = "channel_invitation_preference";
  private BigDecimal channelInvitationPreference;

  public CreateBotResponse() { 
  }

  public CreateBotResponse bot(CreateBotResponseBot bot) {
    this.bot = bot;
    return this;
  }

   /**
   * Get bot
   * @return bot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateBotResponseBot getBot() {
    return bot;
  }


  @JsonProperty(JSON_PROPERTY_BOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBot(CreateBotResponseBot bot) {
    this.bot = bot;
  }


  public CreateBotResponse botCallbackUrl(String botCallbackUrl) {
    this.botCallbackUrl = botCallbackUrl;
    return this;
  }

   /**
   * Get botCallbackUrl
   * @return botCallbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOT_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotCallbackUrl() {
    return botCallbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_BOT_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotCallbackUrl(String botCallbackUrl) {
    this.botCallbackUrl = botCallbackUrl;
  }


  public CreateBotResponse enableMarkAsRead(Boolean enableMarkAsRead) {
    this.enableMarkAsRead = enableMarkAsRead;
    return this;
  }

   /**
   * Get enableMarkAsRead
   * @return enableMarkAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_MARK_AS_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableMarkAsRead() {
    return enableMarkAsRead;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_MARK_AS_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableMarkAsRead(Boolean enableMarkAsRead) {
    this.enableMarkAsRead = enableMarkAsRead;
  }


  public CreateBotResponse isPrivacyMode(Boolean isPrivacyMode) {
    this.isPrivacyMode = isPrivacyMode;
    return this;
  }

   /**
   * Get isPrivacyMode
   * @return isPrivacyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PRIVACY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrivacyMode() {
    return isPrivacyMode;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIVACY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrivacyMode(Boolean isPrivacyMode) {
    this.isPrivacyMode = isPrivacyMode;
  }


  public CreateBotResponse showMember(Boolean showMember) {
    this.showMember = showMember;
    return this;
  }

   /**
   * Get showMember
   * @return showMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOW_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowMember() {
    return showMember;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowMember(Boolean showMember) {
    this.showMember = showMember;
  }


  public CreateBotResponse channelInvitationPreference(BigDecimal channelInvitationPreference) {
    this.channelInvitationPreference = channelInvitationPreference;
    return this;
  }

   /**
   * Get channelInvitationPreference
   * @return channelInvitationPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getChannelInvitationPreference() {
    return channelInvitationPreference;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_INVITATION_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelInvitationPreference(BigDecimal channelInvitationPreference) {
    this.channelInvitationPreference = channelInvitationPreference;
  }


  /**
   * Return true if this createBotResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBotResponse createBotResponse = (CreateBotResponse) o;
    return Objects.equals(this.bot, createBotResponse.bot) &&
        Objects.equals(this.botCallbackUrl, createBotResponse.botCallbackUrl) &&
        Objects.equals(this.enableMarkAsRead, createBotResponse.enableMarkAsRead) &&
        Objects.equals(this.isPrivacyMode, createBotResponse.isPrivacyMode) &&
        Objects.equals(this.showMember, createBotResponse.showMember) &&
        Objects.equals(this.channelInvitationPreference, createBotResponse.channelInvitationPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bot, botCallbackUrl, enableMarkAsRead, isPrivacyMode, showMember, channelInvitationPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBotResponse {\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    botCallbackUrl: ").append(toIndentedString(botCallbackUrl)).append("\n");
    sb.append("    enableMarkAsRead: ").append(toIndentedString(enableMarkAsRead)).append("\n");
    sb.append("    isPrivacyMode: ").append(toIndentedString(isPrivacyMode)).append("\n");
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

