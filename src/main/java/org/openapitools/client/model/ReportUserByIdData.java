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
 * ReportUserByIdData
 */
@JsonPropertyOrder({
  ReportUserByIdData.JSON_PROPERTY_OFFENDING_USER_ID,
  ReportUserByIdData.JSON_PROPERTY_CHANNEL_TYPE,
  ReportUserByIdData.JSON_PROPERTY_CHANNEL_URL,
  ReportUserByIdData.JSON_PROPERTY_REPORT_CATEGORY,
  ReportUserByIdData.JSON_PROPERTY_REPORTING_USER_ID,
  ReportUserByIdData.JSON_PROPERTY_REPORT_DESCRIPTION
})
@JsonTypeName("reportUserByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class ReportUserByIdData {
  public static final String JSON_PROPERTY_OFFENDING_USER_ID = "offending_user_id";
  private String offendingUserId;

  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_REPORT_CATEGORY = "report_category";
  private String reportCategory;

  public static final String JSON_PROPERTY_REPORTING_USER_ID = "reporting_user_id";
  private String reportingUserId;

  public static final String JSON_PROPERTY_REPORT_DESCRIPTION = "report_description";
  private String reportDescription;

  public ReportUserByIdData() { 
  }

  public ReportUserByIdData offendingUserId(String offendingUserId) {
    this.offendingUserId = offendingUserId;
    return this;
  }

   /**
   * Specifies the unique ID of the user to report for using offensive or abusive language such as sending explicit messages or inappropriate comments.
   * @return offendingUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user to report for using offensive or abusive language such as sending explicit messages or inappropriate comments.")
  @JsonProperty(JSON_PROPERTY_OFFENDING_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOffendingUserId() {
    return offendingUserId;
  }


  @JsonProperty(JSON_PROPERTY_OFFENDING_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOffendingUserId(String offendingUserId) {
    this.offendingUserId = offendingUserId;
  }


  public ReportUserByIdData channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Either open_channels or group_channels.
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the channel. Either open_channels or group_channels.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelType() {
    return channelType;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public ReportUserByIdData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel where the user to report is in.
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the channel where the user to report is in.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public ReportUserByIdData reportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Specifies the category which indicates the reason for reporting. Acceptable values are suspicious, harassing, inappropriate, and spam.
   * @return reportCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the category which indicates the reason for reporting. Acceptable values are suspicious, harassing, inappropriate, and spam.")
  @JsonProperty(JSON_PROPERTY_REPORT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReportCategory() {
    return reportCategory;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }


  public ReportUserByIdData reportingUserId(String reportingUserId) {
    this.reportingUserId = reportingUserId;
    return this;
  }

   /**
   * Specifies the unique ID of the user who reports the offending user.
   * @return reportingUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID of the user who reports the offending user.")
  @JsonProperty(JSON_PROPERTY_REPORTING_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportingUserId() {
    return reportingUserId;
  }


  @JsonProperty(JSON_PROPERTY_REPORTING_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportingUserId(String reportingUserId) {
    this.reportingUserId = reportingUserId;
  }


  public ReportUserByIdData reportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
    return this;
  }

   /**
   * Specifies additional information to be included in the report.
   * @return reportDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional information to be included in the report.")
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


  /**
   * Return true if this reportUserByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportUserByIdData reportUserByIdData = (ReportUserByIdData) o;
    return Objects.equals(this.offendingUserId, reportUserByIdData.offendingUserId) &&
        Objects.equals(this.channelType, reportUserByIdData.channelType) &&
        Objects.equals(this.channelUrl, reportUserByIdData.channelUrl) &&
        Objects.equals(this.reportCategory, reportUserByIdData.reportCategory) &&
        Objects.equals(this.reportingUserId, reportUserByIdData.reportingUserId) &&
        Objects.equals(this.reportDescription, reportUserByIdData.reportDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offendingUserId, channelType, channelUrl, reportCategory, reportingUserId, reportDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportUserByIdData {\n");
    sb.append("    offendingUserId: ").append(toIndentedString(offendingUserId)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    reportingUserId: ").append(toIndentedString(reportingUserId)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
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

