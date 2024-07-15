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
 * ReportUserByIdResponse
 */
@JsonPropertyOrder({
  ReportUserByIdResponse.JSON_PROPERTY_REPORT_TYPE,
  ReportUserByIdResponse.JSON_PROPERTY_REPORT_CATEGORY,
  ReportUserByIdResponse.JSON_PROPERTY_REPORTING_USER,
  ReportUserByIdResponse.JSON_PROPERTY_OFFENDING_USER,
  ReportUserByIdResponse.JSON_PROPERTY_REPORTED_MESSAGE,
  ReportUserByIdResponse.JSON_PROPERTY_CHANNEL,
  ReportUserByIdResponse.JSON_PROPERTY_REPORT_DESCRIPTION,
  ReportUserByIdResponse.JSON_PROPERTY_CREATED_AT
})
@JsonTypeName("reportUserByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class ReportUserByIdResponse {
  public static final String JSON_PROPERTY_REPORT_TYPE = "report_type";
  private String reportType;

  public static final String JSON_PROPERTY_REPORT_CATEGORY = "report_category";
  private String reportCategory;

  public static final String JSON_PROPERTY_REPORTING_USER = "reporting_user";
  private SendBirdUser reportingUser;

  public static final String JSON_PROPERTY_OFFENDING_USER = "offending_user";
  private SendBirdUser offendingUser;

  public static final String JSON_PROPERTY_REPORTED_MESSAGE = "reported_message";
  private JsonNullable<SendBirdMessageResponse> reportedMessage = JsonNullable.<SendBirdMessageResponse>undefined();

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private SendBirdChannelResponse channel;

  public static final String JSON_PROPERTY_REPORT_DESCRIPTION = "report_description";
  private String reportDescription;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public ReportUserByIdResponse() { 
  }

  public ReportUserByIdResponse reportType(String reportType) {
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


  public ReportUserByIdResponse reportCategory(String reportCategory) {
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


  public ReportUserByIdResponse reportingUser(SendBirdUser reportingUser) {
    this.reportingUser = reportingUser;
    return this;
  }

   /**
   * Get reportingUser
   * @return reportingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORTING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdUser getReportingUser() {
    return reportingUser;
  }


  @JsonProperty(JSON_PROPERTY_REPORTING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportingUser(SendBirdUser reportingUser) {
    this.reportingUser = reportingUser;
  }


  public ReportUserByIdResponse offendingUser(SendBirdUser offendingUser) {
    this.offendingUser = offendingUser;
    return this;
  }

   /**
   * Get offendingUser
   * @return offendingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFENDING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdUser getOffendingUser() {
    return offendingUser;
  }


  @JsonProperty(JSON_PROPERTY_OFFENDING_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffendingUser(SendBirdUser offendingUser) {
    this.offendingUser = offendingUser;
  }


  public ReportUserByIdResponse reportedMessage(SendBirdMessageResponse reportedMessage) {
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


  public ReportUserByIdResponse channel(SendBirdChannelResponse channel) {
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


  public ReportUserByIdResponse reportDescription(String reportDescription) {
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


  public ReportUserByIdResponse createdAt(BigDecimal createdAt) {
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
   * Return true if this reportUserByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportUserByIdResponse reportUserByIdResponse = (ReportUserByIdResponse) o;
    return Objects.equals(this.reportType, reportUserByIdResponse.reportType) &&
        Objects.equals(this.reportCategory, reportUserByIdResponse.reportCategory) &&
        Objects.equals(this.reportingUser, reportUserByIdResponse.reportingUser) &&
        Objects.equals(this.offendingUser, reportUserByIdResponse.offendingUser) &&
        equalsNullable(this.reportedMessage, reportUserByIdResponse.reportedMessage) &&
        Objects.equals(this.channel, reportUserByIdResponse.channel) &&
        Objects.equals(this.reportDescription, reportUserByIdResponse.reportDescription) &&
        Objects.equals(this.createdAt, reportUserByIdResponse.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, reportCategory, reportingUser, offendingUser, hashCodeNullable(reportedMessage), channel, reportDescription, createdAt);
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
    sb.append("class ReportUserByIdResponse {\n");
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

