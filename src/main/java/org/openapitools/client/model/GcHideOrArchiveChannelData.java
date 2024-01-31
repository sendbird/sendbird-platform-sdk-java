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
 * GcHideOrArchiveChannelData
 */
@JsonPropertyOrder({
  GcHideOrArchiveChannelData.JSON_PROPERTY_CHANNEL_URL,
  GcHideOrArchiveChannelData.JSON_PROPERTY_USER_ID,
  GcHideOrArchiveChannelData.JSON_PROPERTY_ALLOW_AUTO_UNHIDE,
  GcHideOrArchiveChannelData.JSON_PROPERTY_SHOULD_HIDE_ALL,
  GcHideOrArchiveChannelData.JSON_PROPERTY_HIDE_PREVIOUS_MESSAGES
})
@JsonTypeName("gcHideOrArchiveChannelData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class GcHideOrArchiveChannelData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_ALLOW_AUTO_UNHIDE = "allow_auto_unhide";
  private Boolean allowAutoUnhide;

  public static final String JSON_PROPERTY_SHOULD_HIDE_ALL = "should_hide_all";
  private Boolean shouldHideAll;

  public static final String JSON_PROPERTY_HIDE_PREVIOUS_MESSAGES = "hide_previous_messages";
  private Boolean hidePreviousMessages;

  public GcHideOrArchiveChannelData() { 
  }

  public GcHideOrArchiveChannelData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to hide or archive.
   * @return channelUrl
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to hide or archive.")
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


  public GcHideOrArchiveChannelData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user whose channel will be hidden or archived from the list. This property is required when should_hide_all is set to false, which is the default value. However, when should_hide_all is set to true, this property isn&#39;t effective.
   * @return userId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user whose channel will be hidden or archived from the list. This property is required when should_hide_all is set to false, which is the default value. However, when should_hide_all is set to true, this property isn't effective.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GcHideOrArchiveChannelData allowAutoUnhide(Boolean allowAutoUnhide) {
    this.allowAutoUnhide = allowAutoUnhide;
    return this;
  }

   /**
   * Determines the state and operating behavior of the channel in a channel list. If set to true, the channel is hidden from a user&#39;s channel list but it will reappear when there is a new message. If set to false, the channel is hidden from a user&#39;s channel list and it will remain hidden unless the value of the property changes to true through [unarchiving](#2-unhide-or-unarchive-a-channel). (Default: true)&lt;br /&gt;&lt;br /&gt; When a user who has hidden the channel sends a message in that channel through the [Platform API](/docs/chat/v3/platform-api/guides/messages#2-send-a-message), the &#x60;allow_auto_unhide&#x60; property is changed to true, making the channel reappear in the channel list.
   * @return allowAutoUnhide
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the state and operating behavior of the channel in a channel list. If set to true, the channel is hidden from a user's channel list but it will reappear when there is a new message. If set to false, the channel is hidden from a user's channel list and it will remain hidden unless the value of the property changes to true through [unarchiving](#2-unhide-or-unarchive-a-channel). (Default: true)<br /><br /> When a user who has hidden the channel sends a message in that channel through the [Platform API](/docs/chat/v3/platform-api/guides/messages#2-send-a-message), the `allow_auto_unhide` property is changed to true, making the channel reappear in the channel list.")
  @JsonProperty(JSON_PROPERTY_ALLOW_AUTO_UNHIDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAllowAutoUnhide() {
    return allowAutoUnhide;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_AUTO_UNHIDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowAutoUnhide(Boolean allowAutoUnhide) {
    this.allowAutoUnhide = allowAutoUnhide;
  }


  public GcHideOrArchiveChannelData shouldHideAll(Boolean shouldHideAll) {
    this.shouldHideAll = shouldHideAll;
    return this;
  }

   /**
   * Determines whether to make the specified channel disappear from the channel list of all channel members. When this is set to true, the user_id property isn&#39;t effective and doesn&#39;t need to be specified in the request. (Default: false)
   * @return shouldHideAll
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to make the specified channel disappear from the channel list of all channel members. When this is set to true, the user_id property isn't effective and doesn't need to be specified in the request. (Default: false)")
  @JsonProperty(JSON_PROPERTY_SHOULD_HIDE_ALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getShouldHideAll() {
    return shouldHideAll;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_HIDE_ALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShouldHideAll(Boolean shouldHideAll) {
    this.shouldHideAll = shouldHideAll;
  }


  public GcHideOrArchiveChannelData hidePreviousMessages(Boolean hidePreviousMessages) {
    this.hidePreviousMessages = hidePreviousMessages;
    return this;
  }

   /**
   * When the channel gets appeared back in either the list of the user in the user_id property or the lists of all channel members (should_hide_all &#x3D; true), determines whether to conceal the messages sent and received before hiding or archiving the channel. (Default: false)&lt;br /&gt;&lt;br /&gt; This property is effective only when the value of the [global application settings resource](/docs/chat/v3/platform-api/guides/global-application-settings#-3-resource-representation)&#39;s display_past_message property is false.
   * @return hidePreviousMessages
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When the channel gets appeared back in either the list of the user in the user_id property or the lists of all channel members (should_hide_all = true), determines whether to conceal the messages sent and received before hiding or archiving the channel. (Default: false)<br /><br /> This property is effective only when the value of the [global application settings resource](/docs/chat/v3/platform-api/guides/global-application-settings#-3-resource-representation)'s display_past_message property is false.")
  @JsonProperty(JSON_PROPERTY_HIDE_PREVIOUS_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHidePreviousMessages() {
    return hidePreviousMessages;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_PREVIOUS_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHidePreviousMessages(Boolean hidePreviousMessages) {
    this.hidePreviousMessages = hidePreviousMessages;
  }


  /**
   * Return true if this gcHideOrArchiveChannelData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcHideOrArchiveChannelData gcHideOrArchiveChannelData = (GcHideOrArchiveChannelData) o;
    return Objects.equals(this.channelUrl, gcHideOrArchiveChannelData.channelUrl) &&
        Objects.equals(this.userId, gcHideOrArchiveChannelData.userId) &&
        Objects.equals(this.allowAutoUnhide, gcHideOrArchiveChannelData.allowAutoUnhide) &&
        Objects.equals(this.shouldHideAll, gcHideOrArchiveChannelData.shouldHideAll) &&
        Objects.equals(this.hidePreviousMessages, gcHideOrArchiveChannelData.hidePreviousMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userId, allowAutoUnhide, shouldHideAll, hidePreviousMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcHideOrArchiveChannelData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    allowAutoUnhide: ").append(toIndentedString(allowAutoUnhide)).append("\n");
    sb.append("    shouldHideAll: ").append(toIndentedString(shouldHideAll)).append("\n");
    sb.append("    hidePreviousMessages: ").append(toIndentedString(hidePreviousMessages)).append("\n");
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

