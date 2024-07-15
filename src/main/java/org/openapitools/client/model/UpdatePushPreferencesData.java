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
 * UpdatePushPreferencesData
 */
@JsonPropertyOrder({
  UpdatePushPreferencesData.JSON_PROPERTY_PUSH_TRIGGER_OPTION,
  UpdatePushPreferencesData.JSON_PROPERTY_DO_NOT_DISTURB,
  UpdatePushPreferencesData.JSON_PROPERTY_START_HOUR,
  UpdatePushPreferencesData.JSON_PROPERTY_START_MIN,
  UpdatePushPreferencesData.JSON_PROPERTY_END_HOUR,
  UpdatePushPreferencesData.JSON_PROPERTY_END_MIN,
  UpdatePushPreferencesData.JSON_PROPERTY_SNOOZE_ENABLED,
  UpdatePushPreferencesData.JSON_PROPERTY_SNOOZE_START_TS,
  UpdatePushPreferencesData.JSON_PROPERTY_SNOOZE_END_TS,
  UpdatePushPreferencesData.JSON_PROPERTY_BLOCK_PUSH_FROM_BOTS,
  UpdatePushPreferencesData.JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS,
  UpdatePushPreferencesData.JSON_PROPERTY_TIMEZONE,
  UpdatePushPreferencesData.JSON_PROPERTY_PUSH_SOUND
})
@JsonTypeName("updatePushPreferencesData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class UpdatePushPreferencesData {
  public static final String JSON_PROPERTY_PUSH_TRIGGER_OPTION = "push_trigger_option";
  private String pushTriggerOption;

  public static final String JSON_PROPERTY_DO_NOT_DISTURB = "do_not_disturb";
  private Boolean doNotDisturb;

  public static final String JSON_PROPERTY_START_HOUR = "start_hour";
  private Integer startHour;

  public static final String JSON_PROPERTY_START_MIN = "start_min";
  private Integer startMin;

  public static final String JSON_PROPERTY_END_HOUR = "end_hour";
  private Integer endHour;

  public static final String JSON_PROPERTY_END_MIN = "end_min";
  private Integer endMin;

  public static final String JSON_PROPERTY_SNOOZE_ENABLED = "snooze_enabled";
  private Boolean snoozeEnabled;

  public static final String JSON_PROPERTY_SNOOZE_START_TS = "snooze_start_ts";
  private Integer snoozeStartTs;

  public static final String JSON_PROPERTY_SNOOZE_END_TS = "snooze_end_ts";
  private Integer snoozeEndTs;

  public static final String JSON_PROPERTY_BLOCK_PUSH_FROM_BOTS = "block_push_from_bots";
  private Boolean blockPushFromBots;

  public static final String JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS = "push_blocked_bot_ids";
  private List<String> pushBlockedBotIds = null;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public UpdatePushPreferencesData() { 
  }

  public UpdatePushPreferencesData pushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
    return this;
  }

   /**
   * Determines the type of push notification trigger to apply to the user&#39;s joined group channels. Valid values are the following:&lt;br /&gt;- all (default): when disconnected from Sendbird server, the user receives notifications for all new messages including mentioned messages the user has been mentioned in.&lt;br /&gt;- mention_only: when disconnected from Sendbird server, the user only receives notifications for messages the user has been mentioned in.&lt;br /&gt;- off: the user doesn&#39;t receive any notifications.
   * @return pushTriggerOption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the type of push notification trigger to apply to the user's joined group channels. Valid values are the following:<br />- all (default): when disconnected from Sendbird server, the user receives notifications for all new messages including mentioned messages the user has been mentioned in.<br />- mention_only: when disconnected from Sendbird server, the user only receives notifications for messages the user has been mentioned in.<br />- off: the user doesn't receive any notifications.")
  @JsonProperty(JSON_PROPERTY_PUSH_TRIGGER_OPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPushTriggerOption() {
    return pushTriggerOption;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_TRIGGER_OPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
  }


  public UpdatePushPreferencesData doNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
    return this;
  }

   /**
   * Determines whether to pause notification messages for the user during a specific time of day. (Default: false)
   * @return doNotDisturb
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to pause notification messages for the user during a specific time of day. (Default: false)")
  @JsonProperty(JSON_PROPERTY_DO_NOT_DISTURB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDoNotDisturb() {
    return doNotDisturb;
  }


  @JsonProperty(JSON_PROPERTY_DO_NOT_DISTURB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDoNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
  }


  public UpdatePushPreferencesData startHour(Integer startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * Specifies the hour to start pausing the notifications for Do Not Disturb of the user.
   * @return startHour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the hour to start pausing the notifications for Do Not Disturb of the user.")
  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartHour() {
    return startHour;
  }


  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }


  public UpdatePushPreferencesData startMin(Integer startMin) {
    this.startMin = startMin;
    return this;
  }

   /**
   * Specifies the minute of the hour to start pausing the notifications for Do Not Disturb of the user.
   * @return startMin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the minute of the hour to start pausing the notifications for Do Not Disturb of the user.")
  @JsonProperty(JSON_PROPERTY_START_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartMin() {
    return startMin;
  }


  @JsonProperty(JSON_PROPERTY_START_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartMin(Integer startMin) {
    this.startMin = startMin;
  }


  public UpdatePushPreferencesData endHour(Integer endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Specifies the hour to stop pausing the notifications for Do Not Disturb of the user.
   * @return endHour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the hour to stop pausing the notifications for Do Not Disturb of the user.")
  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEndHour() {
    return endHour;
  }


  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }


  public UpdatePushPreferencesData endMin(Integer endMin) {
    this.endMin = endMin;
    return this;
  }

   /**
   * Specifies the minute of the hour to stop pausing the notifications for Do Not Disturb of the user.
   * @return endMin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the minute of the hour to stop pausing the notifications for Do Not Disturb of the user.")
  @JsonProperty(JSON_PROPERTY_END_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEndMin() {
    return endMin;
  }


  @JsonProperty(JSON_PROPERTY_END_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndMin(Integer endMin) {
    this.endMin = endMin;
  }


  public UpdatePushPreferencesData snoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
    return this;
  }

   /**
   * Determines whether to snooze notification messages for the user during a specific period of time. (Default: false)
   * @return snoozeEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to snooze notification messages for the user during a specific period of time. (Default: false)")
  @JsonProperty(JSON_PROPERTY_SNOOZE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSnoozeEnabled() {
    return snoozeEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSnoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
  }


  public UpdatePushPreferencesData snoozeStartTs(Integer snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
    return this;
  }

   /**
   * Specifies the timestamp of when to start snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).
   * @return snoozeStartTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the timestamp of when to start snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).")
  @JsonProperty(JSON_PROPERTY_SNOOZE_START_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSnoozeStartTs() {
    return snoozeStartTs;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_START_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSnoozeStartTs(Integer snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
  }


  public UpdatePushPreferencesData snoozeEndTs(Integer snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
    return this;
  }

   /**
   * Specifies the timestamp of when to end snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).
   * @return snoozeEndTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the timestamp of when to end snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps).")
  @JsonProperty(JSON_PROPERTY_SNOOZE_END_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSnoozeEndTs() {
    return snoozeEndTs;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_END_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSnoozeEndTs(Integer snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
  }


  public UpdatePushPreferencesData blockPushFromBots(Boolean blockPushFromBots) {
    this.blockPushFromBots = blockPushFromBots;
    return this;
  }

   /**
   * Determines whether to block push notifications from [all bots](/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots) within the application. If the push_blocked_bot_ids is specified, notifications only from the bots in the property are blocked. (Default: false)
   * @return blockPushFromBots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to block push notifications from [all bots](/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots) within the application. If the push_blocked_bot_ids is specified, notifications only from the bots in the property are blocked. (Default: false)")
  @JsonProperty(JSON_PROPERTY_BLOCK_PUSH_FROM_BOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBlockPushFromBots() {
    return blockPushFromBots;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_PUSH_FROM_BOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockPushFromBots(Boolean blockPushFromBots) {
    this.blockPushFromBots = blockPushFromBots;
  }


  public UpdatePushPreferencesData pushBlockedBotIds(List<String> pushBlockedBotIds) {
    this.pushBlockedBotIds = pushBlockedBotIds;
    return this;
  }

  public UpdatePushPreferencesData addPushBlockedBotIdsItem(String pushBlockedBotIdsItem) {
    if (this.pushBlockedBotIds == null) {
      this.pushBlockedBotIds = new ArrayList<>();
    }
    this.pushBlockedBotIds.add(pushBlockedBotIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of bots whose push notifications are blocked. This property is effective only when the block_push_from_bots is set to true.
   * @return pushBlockedBotIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of bots whose push notifications are blocked. This property is effective only when the block_push_from_bots is set to true.")
  @JsonProperty(JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPushBlockedBotIds() {
    return pushBlockedBotIds;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushBlockedBotIds(List<String> pushBlockedBotIds) {
    this.pushBlockedBotIds = pushBlockedBotIds;
  }


  public UpdatePushPreferencesData timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Specifies the timezone to be applied to push preferences with a value such as UTC, Asia/Seoul, Europe/London, etc.
   * @return timezone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the timezone to be applied to push preferences with a value such as UTC, Asia/Seoul, Europe/London, etc.")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public UpdatePushPreferencesData pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app.")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  /**
   * Return true if this updatePushPreferencesData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePushPreferencesData updatePushPreferencesData = (UpdatePushPreferencesData) o;
    return Objects.equals(this.pushTriggerOption, updatePushPreferencesData.pushTriggerOption) &&
        Objects.equals(this.doNotDisturb, updatePushPreferencesData.doNotDisturb) &&
        Objects.equals(this.startHour, updatePushPreferencesData.startHour) &&
        Objects.equals(this.startMin, updatePushPreferencesData.startMin) &&
        Objects.equals(this.endHour, updatePushPreferencesData.endHour) &&
        Objects.equals(this.endMin, updatePushPreferencesData.endMin) &&
        Objects.equals(this.snoozeEnabled, updatePushPreferencesData.snoozeEnabled) &&
        Objects.equals(this.snoozeStartTs, updatePushPreferencesData.snoozeStartTs) &&
        Objects.equals(this.snoozeEndTs, updatePushPreferencesData.snoozeEndTs) &&
        Objects.equals(this.blockPushFromBots, updatePushPreferencesData.blockPushFromBots) &&
        Objects.equals(this.pushBlockedBotIds, updatePushPreferencesData.pushBlockedBotIds) &&
        Objects.equals(this.timezone, updatePushPreferencesData.timezone) &&
        Objects.equals(this.pushSound, updatePushPreferencesData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushTriggerOption, doNotDisturb, startHour, startMin, endHour, endMin, snoozeEnabled, snoozeStartTs, snoozeEndTs, blockPushFromBots, pushBlockedBotIds, timezone, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushPreferencesData {\n");
    sb.append("    pushTriggerOption: ").append(toIndentedString(pushTriggerOption)).append("\n");
    sb.append("    doNotDisturb: ").append(toIndentedString(doNotDisturb)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startMin: ").append(toIndentedString(startMin)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMin: ").append(toIndentedString(endMin)).append("\n");
    sb.append("    snoozeEnabled: ").append(toIndentedString(snoozeEnabled)).append("\n");
    sb.append("    snoozeStartTs: ").append(toIndentedString(snoozeStartTs)).append("\n");
    sb.append("    snoozeEndTs: ").append(toIndentedString(snoozeEndTs)).append("\n");
    sb.append("    blockPushFromBots: ").append(toIndentedString(blockPushFromBots)).append("\n");
    sb.append("    pushBlockedBotIds: ").append(toIndentedString(pushBlockedBotIds)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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

