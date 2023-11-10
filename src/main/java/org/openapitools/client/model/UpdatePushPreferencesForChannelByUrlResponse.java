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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdatePushPreferencesForChannelByUrlResponse
 */
@JsonPropertyOrder({
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_PUSH_TRIGGER_OPTION,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_DO_NOT_DISTURB,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_START_HOUR,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_START_MIN,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_END_HOUR,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_END_MIN,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_SNOOZE_ENABLED,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_SNOOZE_START_TS,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_SNOOZE_END_TS,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_TIMEZONE,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_PUSH_SOUND,
  UpdatePushPreferencesForChannelByUrlResponse.JSON_PROPERTY_ENABLE
})
@JsonTypeName("updatePushPreferencesForChannelByUrlResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class UpdatePushPreferencesForChannelByUrlResponse {
  public static final String JSON_PROPERTY_PUSH_TRIGGER_OPTION = "push_trigger_option";
  private String pushTriggerOption;

  public static final String JSON_PROPERTY_DO_NOT_DISTURB = "do_not_disturb";
  private Boolean doNotDisturb;

  public static final String JSON_PROPERTY_START_HOUR = "start_hour";
  private BigDecimal startHour;

  public static final String JSON_PROPERTY_START_MIN = "start_min";
  private BigDecimal startMin;

  public static final String JSON_PROPERTY_END_HOUR = "end_hour";
  private BigDecimal endHour;

  public static final String JSON_PROPERTY_END_MIN = "end_min";
  private BigDecimal endMin;

  public static final String JSON_PROPERTY_SNOOZE_ENABLED = "snooze_enabled";
  private Boolean snoozeEnabled;

  public static final String JSON_PROPERTY_SNOOZE_START_TS = "snooze_start_ts";
  private BigDecimal snoozeStartTs;

  public static final String JSON_PROPERTY_SNOOZE_END_TS = "snooze_end_ts";
  private BigDecimal snoozeEndTs;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public static final String JSON_PROPERTY_ENABLE = "enable";
  private Boolean enable;

  public UpdatePushPreferencesForChannelByUrlResponse() { 
  }

  public UpdatePushPreferencesForChannelByUrlResponse pushTriggerOption(String pushTriggerOption) {
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


  public UpdatePushPreferencesForChannelByUrlResponse doNotDisturb(Boolean doNotDisturb) {
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


  public UpdatePushPreferencesForChannelByUrlResponse startHour(BigDecimal startHour) {
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


  public UpdatePushPreferencesForChannelByUrlResponse startMin(BigDecimal startMin) {
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


  public UpdatePushPreferencesForChannelByUrlResponse endHour(BigDecimal endHour) {
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


  public UpdatePushPreferencesForChannelByUrlResponse endMin(BigDecimal endMin) {
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


  public UpdatePushPreferencesForChannelByUrlResponse snoozeEnabled(Boolean snoozeEnabled) {
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


  public UpdatePushPreferencesForChannelByUrlResponse snoozeStartTs(BigDecimal snoozeStartTs) {
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

  public BigDecimal getSnoozeStartTs() {
    return snoozeStartTs;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_START_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnoozeStartTs(BigDecimal snoozeStartTs) {
    this.snoozeStartTs = snoozeStartTs;
  }


  public UpdatePushPreferencesForChannelByUrlResponse snoozeEndTs(BigDecimal snoozeEndTs) {
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

  public BigDecimal getSnoozeEndTs() {
    return snoozeEndTs;
  }


  @JsonProperty(JSON_PROPERTY_SNOOZE_END_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnoozeEndTs(BigDecimal snoozeEndTs) {
    this.snoozeEndTs = snoozeEndTs;
  }


  public UpdatePushPreferencesForChannelByUrlResponse timezone(String timezone) {
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


  public UpdatePushPreferencesForChannelByUrlResponse pushSound(String pushSound) {
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


  public UpdatePushPreferencesForChannelByUrlResponse enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnable() {
    return enable;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  /**
   * Return true if this updatePushPreferencesForChannelByUrlResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePushPreferencesForChannelByUrlResponse updatePushPreferencesForChannelByUrlResponse = (UpdatePushPreferencesForChannelByUrlResponse) o;
    return Objects.equals(this.pushTriggerOption, updatePushPreferencesForChannelByUrlResponse.pushTriggerOption) &&
        Objects.equals(this.doNotDisturb, updatePushPreferencesForChannelByUrlResponse.doNotDisturb) &&
        Objects.equals(this.startHour, updatePushPreferencesForChannelByUrlResponse.startHour) &&
        Objects.equals(this.startMin, updatePushPreferencesForChannelByUrlResponse.startMin) &&
        Objects.equals(this.endHour, updatePushPreferencesForChannelByUrlResponse.endHour) &&
        Objects.equals(this.endMin, updatePushPreferencesForChannelByUrlResponse.endMin) &&
        Objects.equals(this.snoozeEnabled, updatePushPreferencesForChannelByUrlResponse.snoozeEnabled) &&
        Objects.equals(this.snoozeStartTs, updatePushPreferencesForChannelByUrlResponse.snoozeStartTs) &&
        Objects.equals(this.snoozeEndTs, updatePushPreferencesForChannelByUrlResponse.snoozeEndTs) &&
        Objects.equals(this.timezone, updatePushPreferencesForChannelByUrlResponse.timezone) &&
        Objects.equals(this.pushSound, updatePushPreferencesForChannelByUrlResponse.pushSound) &&
        Objects.equals(this.enable, updatePushPreferencesForChannelByUrlResponse.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushTriggerOption, doNotDisturb, startHour, startMin, endHour, endMin, snoozeEnabled, snoozeStartTs, snoozeEndTs, timezone, pushSound, enable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushPreferencesForChannelByUrlResponse {\n");
    sb.append("    pushTriggerOption: ").append(toIndentedString(pushTriggerOption)).append("\n");
    sb.append("    doNotDisturb: ").append(toIndentedString(doNotDisturb)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startMin: ").append(toIndentedString(startMin)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMin: ").append(toIndentedString(endMin)).append("\n");
    sb.append("    snoozeEnabled: ").append(toIndentedString(snoozeEnabled)).append("\n");
    sb.append("    snoozeStartTs: ").append(toIndentedString(snoozeStartTs)).append("\n");
    sb.append("    snoozeEndTs: ").append(toIndentedString(snoozeEndTs)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

