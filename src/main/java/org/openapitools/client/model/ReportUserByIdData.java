/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReportUserByIdData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T16:47:24.427118Z[Europe/London]")
public class ReportUserByIdData {
  public static final String SERIALIZED_NAME_OFFENDING_USER_ID = "offending_user_id";
  @SerializedName(SERIALIZED_NAME_OFFENDING_USER_ID)
  private String offendingUserId;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_REPORT_CATEGORY = "report_category";
  @SerializedName(SERIALIZED_NAME_REPORT_CATEGORY)
  private String reportCategory;

  public static final String SERIALIZED_NAME_REPORTING_USER_ID = "reporting_user_id";
  @SerializedName(SERIALIZED_NAME_REPORTING_USER_ID)
  private String reportingUserId;

  public static final String SERIALIZED_NAME_REPORT_DESCRIPTION = "report_description";
  @SerializedName(SERIALIZED_NAME_REPORT_DESCRIPTION)
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

  public String getOffendingUserId() {
    return offendingUserId;
  }


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

  public String getChannelType() {
    return channelType;
  }


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

  public String getChannelUrl() {
    return channelUrl;
  }


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

  public String getReportCategory() {
    return reportCategory;
  }


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

  public String getReportingUserId() {
    return reportingUserId;
  }


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

  public String getReportDescription() {
    return reportDescription;
  }


  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }


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

