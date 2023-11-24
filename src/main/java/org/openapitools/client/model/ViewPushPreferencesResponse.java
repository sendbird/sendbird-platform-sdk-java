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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ViewPushPreferencesResponse
 */
@JsonPropertyOrder({
  ViewPushPreferencesResponse.JSON_PROPERTY_SNOOZE_START_TS,
  ViewPushPreferencesResponse.JSON_PROPERTY_START_HOUR,
  ViewPushPreferencesResponse.JSON_PROPERTY_SNOOZE_ENABLED,
  ViewPushPreferencesResponse.JSON_PROPERTY_END_MIN,
  ViewPushPreferencesResponse.JSON_PROPERTY_TIMEZONE,
  ViewPushPreferencesResponse.JSON_PROPERTY_BLOCK_PUSH_FROM_BOTS,
  ViewPushPreferencesResponse.JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS,
  ViewPushPreferencesResponse.JSON_PROPERTY_START_MIN,
  ViewPushPreferencesResponse.JSON_PROPERTY_SNOOZE_END_TS,
  ViewPushPreferencesResponse.JSON_PROPERTY_DO_NOT_DISTURB,
  ViewPushPreferencesResponse.JSON_PROPERTY_END_HOUR,
  ViewPushPreferencesResponse.JSON_PROPERTY_ENABLE_PUSH_FOR_REPLIES,
  ViewPushPreferencesResponse.JSON_PROPERTY_PUSH_SOUND,
  ViewPushPreferencesResponse.JSON_PROPERTY_PUSH_TRIGGER_OPTION
})
@JsonTypeName("viewPushPreferencesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ViewPushPreferencesResponse {
  public static final String JSON_PROPERTY_SNOOZE_START_TS = "snooze_start_ts";
  private String snoozeStartTs;

  public static final String JSON_PROPERTY_START_HOUR = "start_hour";
  private BigDecimal startHour;

  public static final String JSON_PROPERTY_SNOOZE_ENABLED = "snooze_enabled";
  private Boolean snoozeEnabled;

  public static final String JSON_PROPERTY_END_MIN = "end_min";
  private BigDecimal endMin;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_BLOCK_PUSH_FROM_BOTS = "block_push_from_bots";
  private Boolean blockPushFromBots;

  public static final String JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS = "push_blocked_bot_ids";
  private List<String> pushBlockedBotIds = null;

  public static final String JSON_PROPERTY_START_MIN = "start_min";
  private BigDecimal startMin;

  public static final String JSON_PROPERTY_SNOOZE_END_TS = "snooze_end_ts";
  private String snoozeEndTs;

  public static final String JSON_PROPERTY_DO_NOT_DISTURB = "do_not_disturb";
  private Boolean doNotDisturb;

  public static final String JSON_PROPERTY_END_HOUR = "end_hour";
  private BigDecimal endHour;

  public static final String JSON_PROPERTY_ENABLE_PUSH_FOR_REPLIES = "enable_push_for_replies";
  private Boolean enablePushForReplies;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public static final String JSON_PROPERTY_PUSH_TRIGGER_OPTION = "push_trigger_option";
  private String pushTriggerOption;

  public ViewPushPreferencesResponse() { 
  }

  public ViewPushPreferencesResponse snoozeStartTs(String snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
    return this;
  }

   /**
   * Get snoozeStartTs
   * @return snoozeStartTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNOOZE_START_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnoozeStartTs() {
    return snoozeStartTs;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_START_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnoozeStartTs(String snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
  }


  public ViewPushPreferencesResponse startHour(BigDecimal startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * Get startHour
   * @return startHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartHour() {
    return startHour;
  }


  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartHour(BigDecimal startHour) {
    this.startHour = startHour;
  }


  public ViewPushPreferencesResponse snoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
    return this;
  }

   /**
   * Get snoozeEnabled
   * @return snoozeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNOOZE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSnoozeEnabled() {
    return snoozeEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
  }


  public ViewPushPreferencesResponse endMin(BigDecimal endMin) {
    this.endMin = endMin;
    return this;
  }

   /**
   * Get endMin
   * @return endMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEndMin() {
    return endMin;
  }


  @JsonProperty(JSON_PROPERTY_END_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndMin(BigDecimal endMin) {
    this.endMin = endMin;
  }


  public ViewPushPreferencesResponse timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public ViewPushPreferencesResponse blockPushFromBots(Boolean blockPushFromBots) {
    this.blockPushFromBots = blockPushFromBots;
    return this;
  }

   /**
   * Get blockPushFromBots
   * @return blockPushFromBots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ViewPushPreferencesResponse pushBlockedBotIds(List<String> pushBlockedBotIds) {
    this.pushBlockedBotIds = pushBlockedBotIds;
    return this;
  }

  public ViewPushPreferencesResponse addPushBlockedBotIdsItem(String pushBlockedBotIdsItem) {
    if (this.pushBlockedBotIds == null) {
      this.pushBlockedBotIds = new ArrayList<>();
    }
    this.pushBlockedBotIds.add(pushBlockedBotIdsItem);
    return this;
  }

   /**
   * Get pushBlockedBotIds
   * @return pushBlockedBotIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ViewPushPreferencesResponse startMin(BigDecimal startMin) {
    this.startMin = startMin;
    return this;
  }

   /**
   * Get startMin
   * @return startMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartMin() {
    return startMin;
  }


  @JsonProperty(JSON_PROPERTY_START_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartMin(BigDecimal startMin) {
    this.startMin = startMin;
  }


  public ViewPushPreferencesResponse snoozeEndTs(String snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
    return this;
  }

   /**
   * Get snoozeEndTs
   * @return snoozeEndTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNOOZE_END_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnoozeEndTs() {
    return snoozeEndTs;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_END_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnoozeEndTs(String snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
  }


  public ViewPushPreferencesResponse doNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
    return this;
  }

   /**
   * Get doNotDisturb
   * @return doNotDisturb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DO_NOT_DISTURB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDoNotDisturb() {
    return doNotDisturb;
  }


  @JsonProperty(JSON_PROPERTY_DO_NOT_DISTURB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
  }


  public ViewPushPreferencesResponse endHour(BigDecimal endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Get endHour
   * @return endHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEndHour() {
    return endHour;
  }


  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndHour(BigDecimal endHour) {
    this.endHour = endHour;
  }


  public ViewPushPreferencesResponse enablePushForReplies(Boolean enablePushForReplies) {
    this.enablePushForReplies = enablePushForReplies;
    return this;
  }

   /**
   * Get enablePushForReplies
   * @return enablePushForReplies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH_FOR_REPLIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePushForReplies() {
    return enablePushForReplies;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH_FOR_REPLIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePushForReplies(Boolean enablePushForReplies) {
    this.enablePushForReplies = enablePushForReplies;
  }


  public ViewPushPreferencesResponse pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  public ViewPushPreferencesResponse pushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
    return this;
  }

   /**
   * Get pushTriggerOption
   * @return pushTriggerOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_TRIGGER_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushTriggerOption() {
    return pushTriggerOption;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_TRIGGER_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
  }


  /**
   * Return true if this viewPushPreferencesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewPushPreferencesResponse viewPushPreferencesResponse = (ViewPushPreferencesResponse) o;
    return Objects.equals(this.snoozeStartTs, viewPushPreferencesResponse.snoozeStartTs) &&
        Objects.equals(this.startHour, viewPushPreferencesResponse.startHour) &&
        Objects.equals(this.snoozeEnabled, viewPushPreferencesResponse.snoozeEnabled) &&
        Objects.equals(this.endMin, viewPushPreferencesResponse.endMin) &&
        Objects.equals(this.timezone, viewPushPreferencesResponse.timezone) &&
        Objects.equals(this.blockPushFromBots, viewPushPreferencesResponse.blockPushFromBots) &&
        Objects.equals(this.pushBlockedBotIds, viewPushPreferencesResponse.pushBlockedBotIds) &&
        Objects.equals(this.startMin, viewPushPreferencesResponse.startMin) &&
        Objects.equals(this.snoozeEndTs, viewPushPreferencesResponse.snoozeEndTs) &&
        Objects.equals(this.doNotDisturb, viewPushPreferencesResponse.doNotDisturb) &&
        Objects.equals(this.endHour, viewPushPreferencesResponse.endHour) &&
        Objects.equals(this.enablePushForReplies, viewPushPreferencesResponse.enablePushForReplies) &&
        Objects.equals(this.pushSound, viewPushPreferencesResponse.pushSound) &&
        Objects.equals(this.pushTriggerOption, viewPushPreferencesResponse.pushTriggerOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snoozeStartTs, startHour, snoozeEnabled, endMin, timezone, blockPushFromBots, pushBlockedBotIds, startMin, snoozeEndTs, doNotDisturb, endHour, enablePushForReplies, pushSound, pushTriggerOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewPushPreferencesResponse {\n");
    sb.append("    snoozeStartTs: ").append(toIndentedString(snoozeStartTs)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    snoozeEnabled: ").append(toIndentedString(snoozeEnabled)).append("\n");
    sb.append("    endMin: ").append(toIndentedString(endMin)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    blockPushFromBots: ").append(toIndentedString(blockPushFromBots)).append("\n");
    sb.append("    pushBlockedBotIds: ").append(toIndentedString(pushBlockedBotIds)).append("\n");
    sb.append("    startMin: ").append(toIndentedString(startMin)).append("\n");
    sb.append("    snoozeEndTs: ").append(toIndentedString(snoozeEndTs)).append("\n");
    sb.append("    doNotDisturb: ").append(toIndentedString(doNotDisturb)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    enablePushForReplies: ").append(toIndentedString(enablePushForReplies)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
    sb.append("    pushTriggerOption: ").append(toIndentedString(pushTriggerOption)).append("\n");
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

