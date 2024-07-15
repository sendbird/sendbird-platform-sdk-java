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
 * UpdateAnnouncementByIdResponseMessage
 */
@JsonPropertyOrder({
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_TYPE,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_CUSTOM_TYPE,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_USER_ID,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_CONTENT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_DATA,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_ENABLE_PUSH,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_TARGET_AT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_TARGET_USER_COUNT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_TARGET_CHANNEL_COUNT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_STATUS,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_SCHEDULED_AT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_COMPLETED_AT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_SENT_USER_COUNT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_OPEN_COUNT,
  UpdateAnnouncementByIdResponseMessage.JSON_PROPERTY_OPEN_RATE
})
@JsonTypeName("updateAnnouncementByIdResponse_message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class UpdateAnnouncementByIdResponseMessage {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_ENABLE_PUSH = "enable_push";
  private Boolean enablePush;

  public static final String JSON_PROPERTY_TARGET_AT = "target_at";
  private String targetAt;

  public static final String JSON_PROPERTY_TARGET_USER_COUNT = "target_user_count";
  private BigDecimal targetUserCount;

  public static final String JSON_PROPERTY_TARGET_CHANNEL_COUNT = "target_channel_count";
  private BigDecimal targetChannelCount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduled_at";
  private BigDecimal scheduledAt;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private BigDecimal completedAt;

  public static final String JSON_PROPERTY_SENT_USER_COUNT = "sent_user_count";
  private BigDecimal sentUserCount;

  public static final String JSON_PROPERTY_OPEN_COUNT = "open_count";
  private BigDecimal openCount;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public UpdateAnnouncementByIdResponseMessage() { 
  }

  public UpdateAnnouncementByIdResponseMessage type(String type) {
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


  public UpdateAnnouncementByIdResponseMessage customType(String customType) {
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


  public UpdateAnnouncementByIdResponseMessage userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UpdateAnnouncementByIdResponseMessage content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public UpdateAnnouncementByIdResponseMessage data(String data) {
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


  public UpdateAnnouncementByIdResponseMessage enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Get enablePush
   * @return enablePush
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage targetAt(String targetAt) {
    this.targetAt = targetAt;
    return this;
  }

   /**
   * Get targetAt
   * @return targetAt
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage targetUserCount(BigDecimal targetUserCount) {
    this.targetUserCount = targetUserCount;
    return this;
  }

   /**
   * Get targetUserCount
   * @return targetUserCount
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage targetChannelCount(BigDecimal targetChannelCount) {
    this.targetChannelCount = targetChannelCount;
    return this;
  }

   /**
   * Get targetChannelCount
   * @return targetChannelCount
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage scheduledAt(BigDecimal scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Get scheduledAt
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage completedAt(BigDecimal completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage sentUserCount(BigDecimal sentUserCount) {
    this.sentUserCount = sentUserCount;
    return this;
  }

   /**
   * Get sentUserCount
   * @return sentUserCount
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage openCount(BigDecimal openCount) {
    this.openCount = openCount;
    return this;
  }

   /**
   * Get openCount
   * @return openCount
  **/
  @javax.annotation.Nullable
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


  public UpdateAnnouncementByIdResponseMessage openRate(BigDecimal openRate) {
    this.openRate = openRate;
    return this;
  }

   /**
   * Get openRate
   * @return openRate
  **/
  @javax.annotation.Nullable
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
   * Return true if this updateAnnouncementByIdResponse_message object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnnouncementByIdResponseMessage updateAnnouncementByIdResponseMessage = (UpdateAnnouncementByIdResponseMessage) o;
    return Objects.equals(this.type, updateAnnouncementByIdResponseMessage.type) &&
        Objects.equals(this.customType, updateAnnouncementByIdResponseMessage.customType) &&
        Objects.equals(this.userId, updateAnnouncementByIdResponseMessage.userId) &&
        Objects.equals(this.content, updateAnnouncementByIdResponseMessage.content) &&
        Objects.equals(this.data, updateAnnouncementByIdResponseMessage.data) &&
        Objects.equals(this.enablePush, updateAnnouncementByIdResponseMessage.enablePush) &&
        Objects.equals(this.targetAt, updateAnnouncementByIdResponseMessage.targetAt) &&
        Objects.equals(this.targetUserCount, updateAnnouncementByIdResponseMessage.targetUserCount) &&
        Objects.equals(this.targetChannelCount, updateAnnouncementByIdResponseMessage.targetChannelCount) &&
        Objects.equals(this.status, updateAnnouncementByIdResponseMessage.status) &&
        Objects.equals(this.scheduledAt, updateAnnouncementByIdResponseMessage.scheduledAt) &&
        Objects.equals(this.completedAt, updateAnnouncementByIdResponseMessage.completedAt) &&
        Objects.equals(this.sentUserCount, updateAnnouncementByIdResponseMessage.sentUserCount) &&
        Objects.equals(this.openCount, updateAnnouncementByIdResponseMessage.openCount) &&
        Objects.equals(this.openRate, updateAnnouncementByIdResponseMessage.openRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, customType, userId, content, data, enablePush, targetAt, targetUserCount, targetChannelCount, status, scheduledAt, completedAt, sentUserCount, openCount, openRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnnouncementByIdResponseMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    targetAt: ").append(toIndentedString(targetAt)).append("\n");
    sb.append("    targetUserCount: ").append(toIndentedString(targetUserCount)).append("\n");
    sb.append("    targetChannelCount: ").append(toIndentedString(targetChannelCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    sentUserCount: ").append(toIndentedString(sentUserCount)).append("\n");
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

