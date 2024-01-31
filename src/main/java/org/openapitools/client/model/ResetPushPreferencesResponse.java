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
 * ResetPushPreferencesResponse
 */
@JsonPropertyOrder({
  ResetPushPreferencesResponse.JSON_PROPERTY_SNOOZE_START_TS,
  ResetPushPreferencesResponse.JSON_PROPERTY_START_HOUR,
  ResetPushPreferencesResponse.JSON_PROPERTY_SNOOZE_ENABLED,
  ResetPushPreferencesResponse.JSON_PROPERTY_END_MIN,
  ResetPushPreferencesResponse.JSON_PROPERTY_TIMEZONE,
  ResetPushPreferencesResponse.JSON_PROPERTY_BLOCK_PUSH_FROM_BOTS,
  ResetPushPreferencesResponse.JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS,
  ResetPushPreferencesResponse.JSON_PROPERTY_START_MIN,
  ResetPushPreferencesResponse.JSON_PROPERTY_SNOOZE_END_TS,
  ResetPushPreferencesResponse.JSON_PROPERTY_DO_NOT_DISTURB,
  ResetPushPreferencesResponse.JSON_PROPERTY_END_HOUR,
  ResetPushPreferencesResponse.JSON_PROPERTY_ENABLE_PUSH_FOR_REPLIES,
  ResetPushPreferencesResponse.JSON_PROPERTY_PUSH_SOUND,
  ResetPushPreferencesResponse.JSON_PROPERTY_PUSH_TRIGGER_OPTION
})
@JsonTypeName("resetPushPreferencesResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ResetPushPreferencesResponse {
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
  private List<BigDecimal> pushBlockedBotIds = null;

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

  public ResetPushPreferencesResponse() { 
  }

  public ResetPushPreferencesResponse snoozeStartTs(String snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
    return this;
  }

   /**
   * Get snoozeStartTs
   * @return snoozeStartTs
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse startHour(BigDecimal startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * Get startHour
   * @return startHour
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse snoozeEnabled(Boolean snoozeEnabled) {
    this.snoozeEnabled = snoozeEnabled;
    return this;
  }

   /**
   * Get snoozeEnabled
   * @return snoozeEnabled
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse endMin(BigDecimal endMin) {
    this.endMin = endMin;
    return this;
  }

   /**
   * Get endMin
   * @return endMin
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse blockPushFromBots(Boolean blockPushFromBots) {
    this.blockPushFromBots = blockPushFromBots;
    return this;
  }

   /**
   * Get blockPushFromBots
   * @return blockPushFromBots
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse pushBlockedBotIds(List<BigDecimal> pushBlockedBotIds) {
    this.pushBlockedBotIds = pushBlockedBotIds;
    return this;
  }

  public ResetPushPreferencesResponse addPushBlockedBotIdsItem(BigDecimal pushBlockedBotIdsItem) {
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
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BigDecimal> getPushBlockedBotIds() {
    return pushBlockedBotIds;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_BLOCKED_BOT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushBlockedBotIds(List<BigDecimal> pushBlockedBotIds) {
    this.pushBlockedBotIds = pushBlockedBotIds;
  }


  public ResetPushPreferencesResponse startMin(BigDecimal startMin) {
    this.startMin = startMin;
    return this;
  }

   /**
   * Get startMin
   * @return startMin
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse snoozeEndTs(String snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
    return this;
  }

   /**
   * Get snoozeEndTs
   * @return snoozeEndTs
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse doNotDisturb(Boolean doNotDisturb) {
    this.doNotDisturb = doNotDisturb;
    return this;
  }

   /**
   * Get doNotDisturb
   * @return doNotDisturb
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse endHour(BigDecimal endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Get endHour
   * @return endHour
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse enablePushForReplies(Boolean enablePushForReplies) {
    this.enablePushForReplies = enablePushForReplies;
    return this;
  }

   /**
   * Get enablePushForReplies
   * @return enablePushForReplies
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @jakarta.annotation.Nullable
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


  public ResetPushPreferencesResponse pushTriggerOption(String pushTriggerOption) {
    this.pushTriggerOption = pushTriggerOption;
    return this;
  }

   /**
   * Get pushTriggerOption
   * @return pushTriggerOption
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this resetPushPreferencesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPushPreferencesResponse resetPushPreferencesResponse = (ResetPushPreferencesResponse) o;
    return Objects.equals(this.snoozeStartTs, resetPushPreferencesResponse.snoozeStartTs) &&
        Objects.equals(this.startHour, resetPushPreferencesResponse.startHour) &&
        Objects.equals(this.snoozeEnabled, resetPushPreferencesResponse.snoozeEnabled) &&
        Objects.equals(this.endMin, resetPushPreferencesResponse.endMin) &&
        Objects.equals(this.timezone, resetPushPreferencesResponse.timezone) &&
        Objects.equals(this.blockPushFromBots, resetPushPreferencesResponse.blockPushFromBots) &&
        Objects.equals(this.pushBlockedBotIds, resetPushPreferencesResponse.pushBlockedBotIds) &&
        Objects.equals(this.startMin, resetPushPreferencesResponse.startMin) &&
        Objects.equals(this.snoozeEndTs, resetPushPreferencesResponse.snoozeEndTs) &&
        Objects.equals(this.doNotDisturb, resetPushPreferencesResponse.doNotDisturb) &&
        Objects.equals(this.endHour, resetPushPreferencesResponse.endHour) &&
        Objects.equals(this.enablePushForReplies, resetPushPreferencesResponse.enablePushForReplies) &&
        Objects.equals(this.pushSound, resetPushPreferencesResponse.pushSound) &&
        Objects.equals(this.pushTriggerOption, resetPushPreferencesResponse.pushTriggerOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snoozeStartTs, startHour, snoozeEnabled, endMin, timezone, blockPushFromBots, pushBlockedBotIds, startMin, snoozeEndTs, doNotDisturb, endHour, enablePushForReplies, pushSound, pushTriggerOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPushPreferencesResponse {\n");
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

