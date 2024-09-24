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
import org.openapitools.client.model.SendBirdChannelResponse;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdUser;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ReportChannelByUrlResponse
 */
@JsonPropertyOrder({
  ReportChannelByUrlResponse.JSON_PROPERTY_REPORT_TYPE,
  ReportChannelByUrlResponse.JSON_PROPERTY_REPORT_CATEGORY,
  ReportChannelByUrlResponse.JSON_PROPERTY_REPORTING_USER,
  ReportChannelByUrlResponse.JSON_PROPERTY_OFFENDING_USER,
  ReportChannelByUrlResponse.JSON_PROPERTY_REPORTED_MESSAGE,
  ReportChannelByUrlResponse.JSON_PROPERTY_CHANNEL,
  ReportChannelByUrlResponse.JSON_PROPERTY_REPORT_DESCRIPTION,
  ReportChannelByUrlResponse.JSON_PROPERTY_CREATED_AT
})
@JsonTypeName("reportChannelByUrlResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class ReportChannelByUrlResponse {
  public static final String JSON_PROPERTY_REPORT_TYPE = "report_type";
  private String reportType;

  public static final String JSON_PROPERTY_REPORT_CATEGORY = "report_category";
  private String reportCategory;

  public static final String JSON_PROPERTY_REPORTING_USER = "reporting_user";
  private JsonNullable<SendBirdUser> reportingUser = JsonNullable.<SendBirdUser>undefined();

  public static final String JSON_PROPERTY_OFFENDING_USER = "offending_user";
  private JsonNullable<SendBirdUser> offendingUser = JsonNullable.<SendBirdUser>undefined();

  public static final String JSON_PROPERTY_REPORTED_MESSAGE = "reported_message";
  private JsonNullable<SendBirdMessageResponse> reportedMessage = JsonNullable.<SendBirdMessageResponse>undefined();

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private SendBirdChannelResponse channel;

  public static final String JSON_PROPERTY_REPORT_DESCRIPTION = "report_description";
  private String reportDescription;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public ReportChannelByUrlResponse() { 
  }

  public ReportChannelByUrlResponse reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportType() {
    return reportType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  public ReportChannelByUrlResponse reportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportCategory() {
    return reportCategory;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }


  public ReportChannelByUrlResponse reportingUser(SendBirdUser reportingUser) {
    this.reportingUser = JsonNullable.<SendBirdUser>of(reportingUser);
    return this;
  }

   /**
   * Get reportingUser
   * @return reportingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SendBirdUser getReportingUser() {
        return reportingUser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORTING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SendBirdUser> getReportingUser_JsonNullable() {
    return reportingUser;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORTING_USER)
  public void setReportingUser_JsonNullable(JsonNullable<SendBirdUser> reportingUser) {
    this.reportingUser = reportingUser;
  }

  public void setReportingUser(SendBirdUser reportingUser) {
    this.reportingUser = JsonNullable.<SendBirdUser>of(reportingUser);
  }


  public ReportChannelByUrlResponse offendingUser(SendBirdUser offendingUser) {
    this.offendingUser = JsonNullable.<SendBirdUser>of(offendingUser);
    return this;
  }

   /**
   * Get offendingUser
   * @return offendingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SendBirdUser getOffendingUser() {
        return offendingUser.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OFFENDING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SendBirdUser> getOffendingUser_JsonNullable() {
    return offendingUser;
  }
  
  @JsonProperty(JSON_PROPERTY_OFFENDING_USER)
  public void setOffendingUser_JsonNullable(JsonNullable<SendBirdUser> offendingUser) {
    this.offendingUser = offendingUser;
  }

  public void setOffendingUser(SendBirdUser offendingUser) {
    this.offendingUser = JsonNullable.<SendBirdUser>of(offendingUser);
  }


  public ReportChannelByUrlResponse reportedMessage(SendBirdMessageResponse reportedMessage) {
    this.reportedMessage = JsonNullable.<SendBirdMessageResponse>of(reportedMessage);
    return this;
  }

   /**
   * Get reportedMessage
   * @return reportedMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SendBirdMessageResponse getReportedMessage() {
        return reportedMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORTED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SendBirdMessageResponse> getReportedMessage_JsonNullable() {
    return reportedMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORTED_MESSAGE)
  public void setReportedMessage_JsonNullable(JsonNullable<SendBirdMessageResponse> reportedMessage) {
    this.reportedMessage = reportedMessage;
  }

  public void setReportedMessage(SendBirdMessageResponse reportedMessage) {
    this.reportedMessage = JsonNullable.<SendBirdMessageResponse>of(reportedMessage);
  }


  public ReportChannelByUrlResponse channel(SendBirdChannelResponse channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdChannelResponse getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(SendBirdChannelResponse channel) {
    this.channel = channel;
  }


  public ReportChannelByUrlResponse reportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
    return this;
  }

   /**
   * Get reportDescription
   * @return reportDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportDescription() {
    return reportDescription;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }


  public ReportChannelByUrlResponse createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Return true if this reportChannelByUrlResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportChannelByUrlResponse reportChannelByUrlResponse = (ReportChannelByUrlResponse) o;
    return Objects.equals(this.reportType, reportChannelByUrlResponse.reportType) &&
        Objects.equals(this.reportCategory, reportChannelByUrlResponse.reportCategory) &&
        equalsNullable(this.reportingUser, reportChannelByUrlResponse.reportingUser) &&
        equalsNullable(this.offendingUser, reportChannelByUrlResponse.offendingUser) &&
        equalsNullable(this.reportedMessage, reportChannelByUrlResponse.reportedMessage) &&
        Objects.equals(this.channel, reportChannelByUrlResponse.channel) &&
        Objects.equals(this.reportDescription, reportChannelByUrlResponse.reportDescription) &&
        Objects.equals(this.createdAt, reportChannelByUrlResponse.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, reportCategory, hashCodeNullable(reportingUser), hashCodeNullable(offendingUser), hashCodeNullable(reportedMessage), channel, reportDescription, createdAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportChannelByUrlResponse {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    reportingUser: ").append(toIndentedString(reportingUser)).append("\n");
    sb.append("    offendingUser: ").append(toIndentedString(offendingUser)).append("\n");
    sb.append("    reportedMessage: ").append(toIndentedString(reportedMessage)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

