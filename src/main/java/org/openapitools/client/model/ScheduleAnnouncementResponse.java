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
import org.openapitools.client.model.ScheduleAnnouncementResponseCreateChannelOptions;
import org.openapitools.client.model.ScheduleAnnouncementResponseMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ScheduleAnnouncementResponse
 */
@JsonPropertyOrder({
  ScheduleAnnouncementResponse.JSON_PROPERTY_UNIQUE_ID,
  ScheduleAnnouncementResponse.JSON_PROPERTY_ANNOUNCEMENT_GROUP,
  ScheduleAnnouncementResponse.JSON_PROPERTY_MESSAGE,
  ScheduleAnnouncementResponse.JSON_PROPERTY_ENABLE_PUSH,
  ScheduleAnnouncementResponse.JSON_PROPERTY_TARGET_AT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_TARGET_USER_COUNT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_TARGET_CHANNEL_COUNT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_TARGET_CHANNEL_TYPE,
  ScheduleAnnouncementResponse.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS,
  ScheduleAnnouncementResponse.JSON_PROPERTY_STATUS,
  ScheduleAnnouncementResponse.JSON_PROPERTY_SCHEDULED_AT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_CEASE_AT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_RESUME_AT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_COMPLETED_AT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_SENT_USER_COUNT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_SENT_CHANNEL_COUNT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_OPEN_COUNT,
  ScheduleAnnouncementResponse.JSON_PROPERTY_OPEN_RATE
})
@JsonTypeName("scheduleAnnouncementResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ScheduleAnnouncementResponse {
  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private String uniqueId;

  public static final String JSON_PROPERTY_ANNOUNCEMENT_GROUP = "announcement_group";
  private String announcementGroup;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private ScheduleAnnouncementResponseMessage message;

  public static final String JSON_PROPERTY_ENABLE_PUSH = "enable_push";
  private Boolean enablePush;

  public static final String JSON_PROPERTY_TARGET_AT = "target_at";
  private String targetAt;

  public static final String JSON_PROPERTY_TARGET_USER_COUNT = "target_user_count";
  private BigDecimal targetUserCount;

  public static final String JSON_PROPERTY_TARGET_CHANNEL_COUNT = "target_channel_count";
  private BigDecimal targetChannelCount;

  public static final String JSON_PROPERTY_TARGET_CHANNEL_TYPE = "target_channel_type";
  private String targetChannelType;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS = "create_channel_options";
  private ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduled_at";
  private BigDecimal scheduledAt;

  public static final String JSON_PROPERTY_CEASE_AT = "cease_at";
  private String ceaseAt;

  public static final String JSON_PROPERTY_RESUME_AT = "resume_at";
  private String resumeAt;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private BigDecimal completedAt;

  public static final String JSON_PROPERTY_SENT_USER_COUNT = "sent_user_count";
  private BigDecimal sentUserCount;

  public static final String JSON_PROPERTY_SENT_CHANNEL_COUNT = "sent_channel_count";
  private BigDecimal sentChannelCount;

  public static final String JSON_PROPERTY_OPEN_COUNT = "open_count";
  private BigDecimal openCount;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public ScheduleAnnouncementResponse() { 
  }

  public ScheduleAnnouncementResponse uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public ScheduleAnnouncementResponse announcementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
    return this;
  }

   /**
   * Get announcementGroup
   * @return announcementGroup
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnouncementGroup() {
    return announcementGroup;
  }


  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnouncementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public ScheduleAnnouncementResponse message(ScheduleAnnouncementResponseMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleAnnouncementResponseMessage getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(ScheduleAnnouncementResponseMessage message) {
    this.message = message;
  }


  public ScheduleAnnouncementResponse enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Get enablePush
   * @return enablePush
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePush() {
    return enablePush;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }


  public ScheduleAnnouncementResponse targetAt(String targetAt) {
    this.targetAt = targetAt;
    return this;
  }

   /**
   * Get targetAt
   * @return targetAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetAt() {
    return targetAt;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetAt(String targetAt) {
    this.targetAt = targetAt;
  }


  public ScheduleAnnouncementResponse targetUserCount(BigDecimal targetUserCount) {
    this.targetUserCount = targetUserCount;
    return this;
  }

   /**
   * Get targetUserCount
   * @return targetUserCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTargetUserCount() {
    return targetUserCount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUserCount(BigDecimal targetUserCount) {
    this.targetUserCount = targetUserCount;
  }


  public ScheduleAnnouncementResponse targetChannelCount(BigDecimal targetChannelCount) {
    this.targetChannelCount = targetChannelCount;
    return this;
  }

   /**
   * Get targetChannelCount
   * @return targetChannelCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTargetChannelCount() {
    return targetChannelCount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetChannelCount(BigDecimal targetChannelCount) {
    this.targetChannelCount = targetChannelCount;
  }


  public ScheduleAnnouncementResponse targetChannelType(String targetChannelType) {
    this.targetChannelType = targetChannelType;
    return this;
  }

   /**
   * Get targetChannelType
   * @return targetChannelType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetChannelType() {
    return targetChannelType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetChannelType(String targetChannelType) {
    this.targetChannelType = targetChannelType;
  }


  public ScheduleAnnouncementResponse createChannelOptions(ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions) {
    this.createChannelOptions = createChannelOptions;
    return this;
  }

   /**
   * Get createChannelOptions
   * @return createChannelOptions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleAnnouncementResponseCreateChannelOptions getCreateChannelOptions() {
    return createChannelOptions;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptions(ScheduleAnnouncementResponseCreateChannelOptions createChannelOptions) {
    this.createChannelOptions = createChannelOptions;
  }


  public ScheduleAnnouncementResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public ScheduleAnnouncementResponse scheduledAt(BigDecimal scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Get scheduledAt
   * @return scheduledAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(BigDecimal scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ScheduleAnnouncementResponse ceaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
    return this;
  }

   /**
   * Get ceaseAt
   * @return ceaseAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CEASE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCeaseAt() {
    return ceaseAt;
  }


  @JsonProperty(JSON_PROPERTY_CEASE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCeaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
  }


  public ScheduleAnnouncementResponse resumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
    return this;
  }

   /**
   * Get resumeAt
   * @return resumeAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESUME_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResumeAt() {
    return resumeAt;
  }


  @JsonProperty(JSON_PROPERTY_RESUME_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
  }


  public ScheduleAnnouncementResponse completedAt(BigDecimal completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCompletedAt() {
    return completedAt;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAt(BigDecimal completedAt) {
    this.completedAt = completedAt;
  }


  public ScheduleAnnouncementResponse sentUserCount(BigDecimal sentUserCount) {
    this.sentUserCount = sentUserCount;
    return this;
  }

   /**
   * Get sentUserCount
   * @return sentUserCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENT_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSentUserCount() {
    return sentUserCount;
  }


  @JsonProperty(JSON_PROPERTY_SENT_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentUserCount(BigDecimal sentUserCount) {
    this.sentUserCount = sentUserCount;
  }


  public ScheduleAnnouncementResponse sentChannelCount(BigDecimal sentChannelCount) {
    this.sentChannelCount = sentChannelCount;
    return this;
  }

   /**
   * Get sentChannelCount
   * @return sentChannelCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENT_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSentChannelCount() {
    return sentChannelCount;
  }


  @JsonProperty(JSON_PROPERTY_SENT_CHANNEL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentChannelCount(BigDecimal sentChannelCount) {
    this.sentChannelCount = sentChannelCount;
  }


  public ScheduleAnnouncementResponse openCount(BigDecimal openCount) {
    this.openCount = openCount;
    return this;
  }

   /**
   * Get openCount
   * @return openCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenCount() {
    return openCount;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenCount(BigDecimal openCount) {
    this.openCount = openCount;
  }


  public ScheduleAnnouncementResponse openRate(BigDecimal openRate) {
    this.openRate = openRate;
    return this;
  }

   /**
   * Get openRate
   * @return openRate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenRate() {
    return openRate;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenRate(BigDecimal openRate) {
    this.openRate = openRate;
  }


  /**
   * Return true if this scheduleAnnouncementResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleAnnouncementResponse scheduleAnnouncementResponse = (ScheduleAnnouncementResponse) o;
    return Objects.equals(this.uniqueId, scheduleAnnouncementResponse.uniqueId) &&
        Objects.equals(this.announcementGroup, scheduleAnnouncementResponse.announcementGroup) &&
        Objects.equals(this.message, scheduleAnnouncementResponse.message) &&
        Objects.equals(this.enablePush, scheduleAnnouncementResponse.enablePush) &&
        Objects.equals(this.targetAt, scheduleAnnouncementResponse.targetAt) &&
        Objects.equals(this.targetUserCount, scheduleAnnouncementResponse.targetUserCount) &&
        Objects.equals(this.targetChannelCount, scheduleAnnouncementResponse.targetChannelCount) &&
        Objects.equals(this.targetChannelType, scheduleAnnouncementResponse.targetChannelType) &&
        Objects.equals(this.createChannelOptions, scheduleAnnouncementResponse.createChannelOptions) &&
        Objects.equals(this.status, scheduleAnnouncementResponse.status) &&
        Objects.equals(this.scheduledAt, scheduleAnnouncementResponse.scheduledAt) &&
        Objects.equals(this.ceaseAt, scheduleAnnouncementResponse.ceaseAt) &&
        Objects.equals(this.resumeAt, scheduleAnnouncementResponse.resumeAt) &&
        Objects.equals(this.completedAt, scheduleAnnouncementResponse.completedAt) &&
        Objects.equals(this.sentUserCount, scheduleAnnouncementResponse.sentUserCount) &&
        Objects.equals(this.sentChannelCount, scheduleAnnouncementResponse.sentChannelCount) &&
        Objects.equals(this.openCount, scheduleAnnouncementResponse.openCount) &&
        Objects.equals(this.openRate, scheduleAnnouncementResponse.openRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, announcementGroup, message, enablePush, targetAt, targetUserCount, targetChannelCount, targetChannelType, createChannelOptions, status, scheduledAt, ceaseAt, resumeAt, completedAt, sentUserCount, sentChannelCount, openCount, openRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAnnouncementResponse {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    targetAt: ").append(toIndentedString(targetAt)).append("\n");
    sb.append("    targetUserCount: ").append(toIndentedString(targetUserCount)).append("\n");
    sb.append("    targetChannelCount: ").append(toIndentedString(targetChannelCount)).append("\n");
    sb.append("    targetChannelType: ").append(toIndentedString(targetChannelType)).append("\n");
    sb.append("    createChannelOptions: ").append(toIndentedString(createChannelOptions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    ceaseAt: ").append(toIndentedString(ceaseAt)).append("\n");
    sb.append("    resumeAt: ").append(toIndentedString(resumeAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    sentUserCount: ").append(toIndentedString(sentUserCount)).append("\n");
    sb.append("    sentChannelCount: ").append(toIndentedString(sentChannelCount)).append("\n");
    sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
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

