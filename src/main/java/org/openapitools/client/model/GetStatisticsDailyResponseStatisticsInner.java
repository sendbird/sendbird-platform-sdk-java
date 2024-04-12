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
 * GetStatisticsDailyResponseStatisticsInner
 */
@JsonPropertyOrder({
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_DATE_RANGE,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_CANCELED_ANNOUNCEMENT_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_STOPPED_ANNOUNCEMENT_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_COMPLETED_ANNOUNCEMENT_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_TOTAL_ANNOUNCEMENT_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_TARGET_CHANNEL_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_TARGET_USER_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_SENT_CHANNEL_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_SENT_USER_COUNT,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_OPEN_RATE,
  GetStatisticsDailyResponseStatisticsInner.JSON_PROPERTY_OPEN_COUNT
})
@JsonTypeName("getStatisticsDailyResponse_statistics_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class GetStatisticsDailyResponseStatisticsInner {
  public static final String JSON_PROPERTY_DATE_RANGE = "date_range";
  private String dateRange;

  public static final String JSON_PROPERTY_CANCELED_ANNOUNCEMENT_COUNT = "canceled_announcement_count";
  private BigDecimal canceledAnnouncementCount;

  public static final String JSON_PROPERTY_STOPPED_ANNOUNCEMENT_COUNT = "stopped_announcement_count";
  private BigDecimal stoppedAnnouncementCount;

  public static final String JSON_PROPERTY_COMPLETED_ANNOUNCEMENT_COUNT = "completed_announcement_count";
  private BigDecimal completedAnnouncementCount;

  public static final String JSON_PROPERTY_TOTAL_ANNOUNCEMENT_COUNT = "total_announcement_count";
  private BigDecimal totalAnnouncementCount;

  public static final String JSON_PROPERTY_TARGET_CHANNEL_COUNT = "target_channel_count";
  private BigDecimal targetChannelCount;

  public static final String JSON_PROPERTY_TARGET_USER_COUNT = "target_user_count";
  private BigDecimal targetUserCount;

  public static final String JSON_PROPERTY_SENT_CHANNEL_COUNT = "sent_channel_count";
  private BigDecimal sentChannelCount;

  public static final String JSON_PROPERTY_SENT_USER_COUNT = "sent_user_count";
  private BigDecimal sentUserCount;

  public static final String JSON_PROPERTY_OPEN_RATE = "open_rate";
  private BigDecimal openRate;

  public static final String JSON_PROPERTY_OPEN_COUNT = "open_count";
  private BigDecimal openCount;

  public GetStatisticsDailyResponseStatisticsInner() { 
  }

  public GetStatisticsDailyResponseStatisticsInner dateRange(String dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateRange() {
    return dateRange;
  }


  @JsonProperty(JSON_PROPERTY_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateRange(String dateRange) {
    this.dateRange = dateRange;
  }


  public GetStatisticsDailyResponseStatisticsInner canceledAnnouncementCount(BigDecimal canceledAnnouncementCount) {
    this.canceledAnnouncementCount = canceledAnnouncementCount;
    return this;
  }

   /**
   * Get canceledAnnouncementCount
   * @return canceledAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CANCELED_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCanceledAnnouncementCount() {
    return canceledAnnouncementCount;
  }


  @JsonProperty(JSON_PROPERTY_CANCELED_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanceledAnnouncementCount(BigDecimal canceledAnnouncementCount) {
    this.canceledAnnouncementCount = canceledAnnouncementCount;
  }


  public GetStatisticsDailyResponseStatisticsInner stoppedAnnouncementCount(BigDecimal stoppedAnnouncementCount) {
    this.stoppedAnnouncementCount = stoppedAnnouncementCount;
    return this;
  }

   /**
   * Get stoppedAnnouncementCount
   * @return stoppedAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STOPPED_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStoppedAnnouncementCount() {
    return stoppedAnnouncementCount;
  }


  @JsonProperty(JSON_PROPERTY_STOPPED_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoppedAnnouncementCount(BigDecimal stoppedAnnouncementCount) {
    this.stoppedAnnouncementCount = stoppedAnnouncementCount;
  }


  public GetStatisticsDailyResponseStatisticsInner completedAnnouncementCount(BigDecimal completedAnnouncementCount) {
    this.completedAnnouncementCount = completedAnnouncementCount;
    return this;
  }

   /**
   * Get completedAnnouncementCount
   * @return completedAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLETED_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCompletedAnnouncementCount() {
    return completedAnnouncementCount;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAnnouncementCount(BigDecimal completedAnnouncementCount) {
    this.completedAnnouncementCount = completedAnnouncementCount;
  }


  public GetStatisticsDailyResponseStatisticsInner totalAnnouncementCount(BigDecimal totalAnnouncementCount) {
    this.totalAnnouncementCount = totalAnnouncementCount;
    return this;
  }

   /**
   * Get totalAnnouncementCount
   * @return totalAnnouncementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalAnnouncementCount() {
    return totalAnnouncementCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ANNOUNCEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAnnouncementCount(BigDecimal totalAnnouncementCount) {
    this.totalAnnouncementCount = totalAnnouncementCount;
  }


  public GetStatisticsDailyResponseStatisticsInner targetChannelCount(BigDecimal targetChannelCount) {
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


  public GetStatisticsDailyResponseStatisticsInner targetUserCount(BigDecimal targetUserCount) {
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


  public GetStatisticsDailyResponseStatisticsInner sentChannelCount(BigDecimal sentChannelCount) {
    this.sentChannelCount = sentChannelCount;
    return this;
  }

   /**
   * Get sentChannelCount
   * @return sentChannelCount
  **/
  @javax.annotation.Nullable
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


  public GetStatisticsDailyResponseStatisticsInner sentUserCount(BigDecimal sentUserCount) {
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


  public GetStatisticsDailyResponseStatisticsInner openRate(BigDecimal openRate) {
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


  public GetStatisticsDailyResponseStatisticsInner openCount(BigDecimal openCount) {
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


  /**
   * Return true if this getStatisticsDailyResponse_statistics_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatisticsDailyResponseStatisticsInner getStatisticsDailyResponseStatisticsInner = (GetStatisticsDailyResponseStatisticsInner) o;
    return Objects.equals(this.dateRange, getStatisticsDailyResponseStatisticsInner.dateRange) &&
        Objects.equals(this.canceledAnnouncementCount, getStatisticsDailyResponseStatisticsInner.canceledAnnouncementCount) &&
        Objects.equals(this.stoppedAnnouncementCount, getStatisticsDailyResponseStatisticsInner.stoppedAnnouncementCount) &&
        Objects.equals(this.completedAnnouncementCount, getStatisticsDailyResponseStatisticsInner.completedAnnouncementCount) &&
        Objects.equals(this.totalAnnouncementCount, getStatisticsDailyResponseStatisticsInner.totalAnnouncementCount) &&
        Objects.equals(this.targetChannelCount, getStatisticsDailyResponseStatisticsInner.targetChannelCount) &&
        Objects.equals(this.targetUserCount, getStatisticsDailyResponseStatisticsInner.targetUserCount) &&
        Objects.equals(this.sentChannelCount, getStatisticsDailyResponseStatisticsInner.sentChannelCount) &&
        Objects.equals(this.sentUserCount, getStatisticsDailyResponseStatisticsInner.sentUserCount) &&
        Objects.equals(this.openRate, getStatisticsDailyResponseStatisticsInner.openRate) &&
        Objects.equals(this.openCount, getStatisticsDailyResponseStatisticsInner.openCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRange, canceledAnnouncementCount, stoppedAnnouncementCount, completedAnnouncementCount, totalAnnouncementCount, targetChannelCount, targetUserCount, sentChannelCount, sentUserCount, openRate, openCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatisticsDailyResponseStatisticsInner {\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    canceledAnnouncementCount: ").append(toIndentedString(canceledAnnouncementCount)).append("\n");
    sb.append("    stoppedAnnouncementCount: ").append(toIndentedString(stoppedAnnouncementCount)).append("\n");
    sb.append("    completedAnnouncementCount: ").append(toIndentedString(completedAnnouncementCount)).append("\n");
    sb.append("    totalAnnouncementCount: ").append(toIndentedString(totalAnnouncementCount)).append("\n");
    sb.append("    targetChannelCount: ").append(toIndentedString(targetChannelCount)).append("\n");
    sb.append("    targetUserCount: ").append(toIndentedString(targetUserCount)).append("\n");
    sb.append("    sentChannelCount: ").append(toIndentedString(sentChannelCount)).append("\n");
    sb.append("    sentUserCount: ").append(toIndentedString(sentUserCount)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
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

