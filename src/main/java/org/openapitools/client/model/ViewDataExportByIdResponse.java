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
import org.openapitools.client.model.ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ViewDataExportByIdResponse
 */
@JsonPropertyOrder({
  ViewDataExportByIdResponse.JSON_PROPERTY_REQUEST_ID,
  ViewDataExportByIdResponse.JSON_PROPERTY_DATA_TYPE,
  ViewDataExportByIdResponse.JSON_PROPERTY_STATUS,
  ViewDataExportByIdResponse.JSON_PROPERTY_FORMAT,
  ViewDataExportByIdResponse.JSON_PROPERTY_CSV_DELIMITER,
  ViewDataExportByIdResponse.JSON_PROPERTY_TIMEZONE,
  ViewDataExportByIdResponse.JSON_PROPERTY_CREATED_AT,
  ViewDataExportByIdResponse.JSON_PROPERTY_START_TS,
  ViewDataExportByIdResponse.JSON_PROPERTY_END_TS,
  ViewDataExportByIdResponse.JSON_PROPERTY_CHANNEL_URLS,
  ViewDataExportByIdResponse.JSON_PROPERTY_CHANNEL_CUSTOM_TYPES,
  ViewDataExportByIdResponse.JSON_PROPERTY_SENDER_IDS,
  ViewDataExportByIdResponse.JSON_PROPERTY_FILE,
  ViewDataExportByIdResponse.JSON_PROPERTY_USER_IDS
})
@JsonTypeName("viewDataExportByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class ViewDataExportByIdResponse {
  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_DATA_TYPE = "data_type";
  private String dataType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_CSV_DELIMITER = "csv_delimiter";
  private String csvDelimiter;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_START_TS = "start_ts";
  private BigDecimal startTs;

  public static final String JSON_PROPERTY_END_TS = "end_ts";
  private BigDecimal endTs;

  public static final String JSON_PROPERTY_CHANNEL_URLS = "channel_urls";
  private List<String> channelUrls = null;

  public static final String JSON_PROPERTY_CHANNEL_CUSTOM_TYPES = "channel_custom_types";
  private List<String> channelCustomTypes = null;

  public static final String JSON_PROPERTY_SENDER_IDS = "sender_ids";
  private List<String> senderIds = null;

  public static final String JSON_PROPERTY_FILE = "file";
  private ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile _file;

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = null;

  public ViewDataExportByIdResponse() { 
  }

  public ViewDataExportByIdResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ViewDataExportByIdResponse dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ViewDataExportByIdResponse status(String status) {
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


  public ViewDataExportByIdResponse format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(String format) {
    this.format = format;
  }


  public ViewDataExportByIdResponse csvDelimiter(String csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
    return this;
  }

   /**
   * Get csvDelimiter
   * @return csvDelimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CSV_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCsvDelimiter() {
    return csvDelimiter;
  }


  @JsonProperty(JSON_PROPERTY_CSV_DELIMITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCsvDelimiter(String csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
  }


  public ViewDataExportByIdResponse timezone(String timezone) {
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


  public ViewDataExportByIdResponse createdAt(BigDecimal createdAt) {
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


  public ViewDataExportByIdResponse startTs(BigDecimal startTs) {
    this.startTs = startTs;
    return this;
  }

   /**
   * Get startTs
   * @return startTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStartTs() {
    return startTs;
  }


  @JsonProperty(JSON_PROPERTY_START_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTs(BigDecimal startTs) {
    this.startTs = startTs;
  }


  public ViewDataExportByIdResponse endTs(BigDecimal endTs) {
    this.endTs = endTs;
    return this;
  }

   /**
   * Get endTs
   * @return endTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEndTs() {
    return endTs;
  }


  @JsonProperty(JSON_PROPERTY_END_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTs(BigDecimal endTs) {
    this.endTs = endTs;
  }


  public ViewDataExportByIdResponse channelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public ViewDataExportByIdResponse addChannelUrlsItem(String channelUrlsItem) {
    if (this.channelUrls == null) {
      this.channelUrls = new ArrayList<>();
    }
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Get channelUrls
   * @return channelUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getChannelUrls() {
    return channelUrls;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
  }


  public ViewDataExportByIdResponse channelCustomTypes(List<String> channelCustomTypes) {
    this.channelCustomTypes = channelCustomTypes;
    return this;
  }

  public ViewDataExportByIdResponse addChannelCustomTypesItem(String channelCustomTypesItem) {
    if (this.channelCustomTypes == null) {
      this.channelCustomTypes = new ArrayList<>();
    }
    this.channelCustomTypes.add(channelCustomTypesItem);
    return this;
  }

   /**
   * Get channelCustomTypes
   * @return channelCustomTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_CUSTOM_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getChannelCustomTypes() {
    return channelCustomTypes;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_CUSTOM_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelCustomTypes(List<String> channelCustomTypes) {
    this.channelCustomTypes = channelCustomTypes;
  }


  public ViewDataExportByIdResponse senderIds(List<String> senderIds) {
    this.senderIds = senderIds;
    return this;
  }

  public ViewDataExportByIdResponse addSenderIdsItem(String senderIdsItem) {
    if (this.senderIds == null) {
      this.senderIds = new ArrayList<>();
    }
    this.senderIds.add(senderIdsItem);
    return this;
  }

   /**
   * Get senderIds
   * @return senderIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSenderIds() {
    return senderIds;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderIds(List<String> senderIds) {
    this.senderIds = senderIds;
  }


  public ViewDataExportByIdResponse _file(ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile _file) {
    this._file = _file;
  }


  public ViewDataExportByIdResponse userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public ViewDataExportByIdResponse addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * Return true if this viewDataExportByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewDataExportByIdResponse viewDataExportByIdResponse = (ViewDataExportByIdResponse) o;
    return Objects.equals(this.requestId, viewDataExportByIdResponse.requestId) &&
        Objects.equals(this.dataType, viewDataExportByIdResponse.dataType) &&
        Objects.equals(this.status, viewDataExportByIdResponse.status) &&
        Objects.equals(this.format, viewDataExportByIdResponse.format) &&
        Objects.equals(this.csvDelimiter, viewDataExportByIdResponse.csvDelimiter) &&
        Objects.equals(this.timezone, viewDataExportByIdResponse.timezone) &&
        Objects.equals(this.createdAt, viewDataExportByIdResponse.createdAt) &&
        Objects.equals(this.startTs, viewDataExportByIdResponse.startTs) &&
        Objects.equals(this.endTs, viewDataExportByIdResponse.endTs) &&
        Objects.equals(this.channelUrls, viewDataExportByIdResponse.channelUrls) &&
        Objects.equals(this.channelCustomTypes, viewDataExportByIdResponse.channelCustomTypes) &&
        Objects.equals(this.senderIds, viewDataExportByIdResponse.senderIds) &&
        Objects.equals(this._file, viewDataExportByIdResponse._file) &&
        Objects.equals(this.userIds, viewDataExportByIdResponse.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, dataType, status, format, csvDelimiter, timezone, createdAt, startTs, endTs, channelUrls, channelCustomTypes, senderIds, _file, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewDataExportByIdResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    csvDelimiter: ").append(toIndentedString(csvDelimiter)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    channelCustomTypes: ").append(toIndentedString(channelCustomTypes)).append("\n");
    sb.append("    senderIds: ").append(toIndentedString(senderIds)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

