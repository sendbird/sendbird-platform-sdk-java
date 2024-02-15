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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * RegisterAndScheduleDataExportData
 */
@JsonPropertyOrder({
  RegisterAndScheduleDataExportData.JSON_PROPERTY_START_TS,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_END_TS,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_FORMAT,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_CSV_DELIMITER,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_TIMEZONE,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_SENDER_IDS,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_EXCLUDE_SENDER_IDS,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_CHANNEL_URLS,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_EXCLUDE_CHANNEL_URLS,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_USER_IDS,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_SHOW_READ_RECEIPT,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_SHOW_CHANNEL_METADATA,
  RegisterAndScheduleDataExportData.JSON_PROPERTY_NEIGHBORING_MESSAGE_LIMIT
})
@JsonTypeName("registerAndScheduleDataExportData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class RegisterAndScheduleDataExportData {
  public static final String JSON_PROPERTY_START_TS = "start_ts";
  private Integer startTs;

  public static final String JSON_PROPERTY_END_TS = "end_ts";
  private Integer endTs;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_CSV_DELIMITER = "csv_delimiter";
  private String csvDelimiter;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_SENDER_IDS = "sender_ids";
  private List<String> senderIds = null;

  public static final String JSON_PROPERTY_EXCLUDE_SENDER_IDS = "exclude_sender_ids";
  private List<String> excludeSenderIds = null;

  public static final String JSON_PROPERTY_CHANNEL_URLS = "channel_urls";
  private List<String> channelUrls = null;

  public static final String JSON_PROPERTY_EXCLUDE_CHANNEL_URLS = "exclude_channel_urls";
  private List<String> excludeChannelUrls = null;

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = null;

  public static final String JSON_PROPERTY_SHOW_READ_RECEIPT = "show_read_receipt";
  private Boolean showReadReceipt;

  public static final String JSON_PROPERTY_SHOW_CHANNEL_METADATA = "show_channel_metadata";
  private Boolean showChannelMetadata;

  public static final String JSON_PROPERTY_NEIGHBORING_MESSAGE_LIMIT = "neighboring_message_limit";
  private Integer neighboringMessageLimit;

  public RegisterAndScheduleDataExportData() { 
  }

  public RegisterAndScheduleDataExportData startTs(Integer startTs) {
    this.startTs = startTs;
    return this;
  }

   /**
   * Specifies the starting timestamp of a period for target objects&#39; creation date, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The creation time of messages, channels, and users will be in-between the start_ts and end_ts.
   * @return startTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the starting timestamp of a period for target objects' creation date, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The creation time of messages, channels, and users will be in-between the start_ts and end_ts.")
  @JsonProperty(JSON_PROPERTY_START_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStartTs() {
    return startTs;
  }


  @JsonProperty(JSON_PROPERTY_START_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartTs(Integer startTs) {
    this.startTs = startTs;
  }


  public RegisterAndScheduleDataExportData endTs(Integer endTs) {
    this.endTs = endTs;
    return this;
  }

   /**
   * Specifies the ending timestamp of a period for target objects&#39; creation date, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The creation time of messages, channels, and users will be in-between the start_ts and end_ts.
   * @return endTs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ending timestamp of a period for target objects' creation date, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The creation time of messages, channels, and users will be in-between the start_ts and end_ts.")
  @JsonProperty(JSON_PROPERTY_END_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEndTs() {
    return endTs;
  }


  @JsonProperty(JSON_PROPERTY_END_TS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndTs(Integer endTs) {
    this.endTs = endTs;
  }


  public RegisterAndScheduleDataExportData format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Specifies the format of the file to export the messages to. Acceptable values are json and csv. (Default: json)
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the format of the file to export the messages to. Acceptable values are json and csv. (Default: json)")
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


  public RegisterAndScheduleDataExportData csvDelimiter(String csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
    return this;
  }

   /**
   * Sets a single character delimiter to separate the values in each row of the csv file which stores two-dimensional arrays of the exported message data. Either English alphabets or special characters can be used as a delimiter, including a horizontal tab (\\t), a line feed (\\n), a vertical bar (\\
   * @return csvDelimiter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets a single character delimiter to separate the values in each row of the csv file which stores two-dimensional arrays of the exported message data. Either English alphabets or special characters can be used as a delimiter, including a horizontal tab (\\t), a line feed (\\n), a vertical bar (\\")
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


  public RegisterAndScheduleDataExportData timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Specifies the timezone to be applied to the timestamp of the exported messages. For example, US/Pacific, Asia/Seoul, Europe/London, etc. (Default: UTC)
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the timezone to be applied to the timestamp of the exported messages. For example, US/Pacific, Asia/Seoul, Europe/London, etc. (Default: UTC)")
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


  public RegisterAndScheduleDataExportData senderIds(List<String> senderIds) {
    this.senderIds = senderIds;
    return this;
  }

  public RegisterAndScheduleDataExportData addSenderIdsItem(String senderIdsItem) {
    if (this.senderIds == null) {
      this.senderIds = new ArrayList<>();
    }
    this.senderIds.add(senderIdsItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users which are used to filter the messages by its sender for the export. This property is effective only when the data_type parameter is set to messages, and can be specified up to 10 IDs in the request. (Default: all messages sent by any user)
   * @return senderIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of the IDs of the users which are used to filter the messages by its sender for the export. This property is effective only when the data_type parameter is set to messages, and can be specified up to 10 IDs in the request. (Default: all messages sent by any user)")
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


  public RegisterAndScheduleDataExportData excludeSenderIds(List<String> excludeSenderIds) {
    this.excludeSenderIds = excludeSenderIds;
    return this;
  }

  public RegisterAndScheduleDataExportData addExcludeSenderIdsItem(String excludeSenderIdsItem) {
    if (this.excludeSenderIds == null) {
      this.excludeSenderIds = new ArrayList<>();
    }
    this.excludeSenderIds.add(excludeSenderIdsItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users which are used to exclude their sent messages from the export. This property is effective only when the data_type parameter is set to messages, and can be specified up to 10 IDs. (Default: all messages sent by any user)
   * @return excludeSenderIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of the IDs of the users which are used to exclude their sent messages from the export. This property is effective only when the data_type parameter is set to messages, and can be specified up to 10 IDs. (Default: all messages sent by any user)")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_SENDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExcludeSenderIds() {
    return excludeSenderIds;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_SENDER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeSenderIds(List<String> excludeSenderIds) {
    this.excludeSenderIds = excludeSenderIds;
  }


  public RegisterAndScheduleDataExportData channelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public RegisterAndScheduleDataExportData addChannelUrlsItem(String channelUrlsItem) {
    if (this.channelUrls == null) {
      this.channelUrls = new ArrayList<>();
    }
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Specifies an array of one or more URLs of channels to export the messages from. This property is effective only when the data_type parameter is set to messages or channels. (Default: all channels)
   * @return channelUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more URLs of channels to export the messages from. This property is effective only when the data_type parameter is set to messages or channels. (Default: all channels)")
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


  public RegisterAndScheduleDataExportData excludeChannelUrls(List<String> excludeChannelUrls) {
    this.excludeChannelUrls = excludeChannelUrls;
    return this;
  }

  public RegisterAndScheduleDataExportData addExcludeChannelUrlsItem(String excludeChannelUrlsItem) {
    if (this.excludeChannelUrls == null) {
      this.excludeChannelUrls = new ArrayList<>();
    }
    this.excludeChannelUrls.add(excludeChannelUrlsItem);
    return this;
  }

   /**
   * Specifies an array of one or more URLs of channels to exclude when exporting the messages. This property is effective only when the data_type parameter is set to messages or channels. (Default: include all channels)
   * @return excludeChannelUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more URLs of channels to exclude when exporting the messages. This property is effective only when the data_type parameter is set to messages or channels. (Default: include all channels)")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExcludeChannelUrls() {
    return excludeChannelUrls;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeChannelUrls(List<String> excludeChannelUrls) {
    this.excludeChannelUrls = excludeChannelUrls;
  }


  public RegisterAndScheduleDataExportData userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public RegisterAndScheduleDataExportData addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users to export their information. This property is effective only when the data_type parameter is set to users. (Default: all users)
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of the IDs of the users to export their information. This property is effective only when the data_type parameter is set to users. (Default: all users)")
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


  public RegisterAndScheduleDataExportData showReadReceipt(Boolean showReadReceipt) {
    this.showReadReceipt = showReadReceipt;
    return this;
  }

   /**
   * Determines whether to include information about the read receipts of each channel in the exported data. The read receipt indicates the timestamps of when each user has last read the messages in the channel, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps). (Default: true)
   * @return showReadReceipt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to include information about the read receipts of each channel in the exported data. The read receipt indicates the timestamps of when each user has last read the messages in the channel, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps). (Default: true)")
  @JsonProperty(JSON_PROPERTY_SHOW_READ_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowReadReceipt() {
    return showReadReceipt;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_READ_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowReadReceipt(Boolean showReadReceipt) {
    this.showReadReceipt = showReadReceipt;
  }


  public RegisterAndScheduleDataExportData showChannelMetadata(Boolean showChannelMetadata) {
    this.showChannelMetadata = showChannelMetadata;
    return this;
  }

   /**
   * Determines whether to include [channel metadata](/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata) in the result files.
   * @return showChannelMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to include [channel metadata](/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata) in the result files.")
  @JsonProperty(JSON_PROPERTY_SHOW_CHANNEL_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowChannelMetadata() {
    return showChannelMetadata;
  }


  @JsonProperty(JSON_PROPERTY_SHOW_CHANNEL_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowChannelMetadata(Boolean showChannelMetadata) {
    this.showChannelMetadata = showChannelMetadata;
  }


  public RegisterAndScheduleDataExportData neighboringMessageLimit(Integer neighboringMessageLimit) {
    this.neighboringMessageLimit = neighboringMessageLimit;
    return this;
  }

   /**
   * Specifies the maximum number of other users&#39; messages to be exported, which took place after the specified message of a user filtered by the sender_ids property. Even if there may be more messages that took place, if the quantity exceeds the number of the neighboring_message_limit, they are omitted. Only the messages that took place right after the specified message will be counted and exported. This can be used to better analyze the context. Acceptable values are 1 to 10, inclusive. (Default: 0)
   * @return neighboringMessageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the maximum number of other users' messages to be exported, which took place after the specified message of a user filtered by the sender_ids property. Even if there may be more messages that took place, if the quantity exceeds the number of the neighboring_message_limit, they are omitted. Only the messages that took place right after the specified message will be counted and exported. This can be used to better analyze the context. Acceptable values are 1 to 10, inclusive. (Default: 0)")
  @JsonProperty(JSON_PROPERTY_NEIGHBORING_MESSAGE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNeighboringMessageLimit() {
    return neighboringMessageLimit;
  }


  @JsonProperty(JSON_PROPERTY_NEIGHBORING_MESSAGE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeighboringMessageLimit(Integer neighboringMessageLimit) {
    this.neighboringMessageLimit = neighboringMessageLimit;
  }


  /**
   * Return true if this registerAndScheduleDataExportData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterAndScheduleDataExportData registerAndScheduleDataExportData = (RegisterAndScheduleDataExportData) o;
    return Objects.equals(this.startTs, registerAndScheduleDataExportData.startTs) &&
        Objects.equals(this.endTs, registerAndScheduleDataExportData.endTs) &&
        Objects.equals(this.format, registerAndScheduleDataExportData.format) &&
        Objects.equals(this.csvDelimiter, registerAndScheduleDataExportData.csvDelimiter) &&
        Objects.equals(this.timezone, registerAndScheduleDataExportData.timezone) &&
        Objects.equals(this.senderIds, registerAndScheduleDataExportData.senderIds) &&
        Objects.equals(this.excludeSenderIds, registerAndScheduleDataExportData.excludeSenderIds) &&
        Objects.equals(this.channelUrls, registerAndScheduleDataExportData.channelUrls) &&
        Objects.equals(this.excludeChannelUrls, registerAndScheduleDataExportData.excludeChannelUrls) &&
        Objects.equals(this.userIds, registerAndScheduleDataExportData.userIds) &&
        Objects.equals(this.showReadReceipt, registerAndScheduleDataExportData.showReadReceipt) &&
        Objects.equals(this.showChannelMetadata, registerAndScheduleDataExportData.showChannelMetadata) &&
        Objects.equals(this.neighboringMessageLimit, registerAndScheduleDataExportData.neighboringMessageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTs, endTs, format, csvDelimiter, timezone, senderIds, excludeSenderIds, channelUrls, excludeChannelUrls, userIds, showReadReceipt, showChannelMetadata, neighboringMessageLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterAndScheduleDataExportData {\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    csvDelimiter: ").append(toIndentedString(csvDelimiter)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    senderIds: ").append(toIndentedString(senderIds)).append("\n");
    sb.append("    excludeSenderIds: ").append(toIndentedString(excludeSenderIds)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    excludeChannelUrls: ").append(toIndentedString(excludeChannelUrls)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    showReadReceipt: ").append(toIndentedString(showReadReceipt)).append("\n");
    sb.append("    showChannelMetadata: ").append(toIndentedString(showChannelMetadata)).append("\n");
    sb.append("    neighboringMessageLimit: ").append(toIndentedString(neighboringMessageLimit)).append("\n");
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

