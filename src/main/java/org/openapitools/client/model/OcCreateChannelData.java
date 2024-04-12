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
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * OcCreateChannelData
 */
@JsonPropertyOrder({
  OcCreateChannelData.JSON_PROPERTY_NAME,
  OcCreateChannelData.JSON_PROPERTY_CHANNEL_URL,
  OcCreateChannelData.JSON_PROPERTY_COVER_URL,
  OcCreateChannelData.JSON_PROPERTY_COVER_FILE,
  OcCreateChannelData.JSON_PROPERTY_CUSTOM_TYPE,
  OcCreateChannelData.JSON_PROPERTY_DATA,
  OcCreateChannelData.JSON_PROPERTY_IS_EPHEMERAL,
  OcCreateChannelData.JSON_PROPERTY_IS_DYNAMIC_PARTITIONED_HASH2_HOW_DYNAMIC_PARTITIONING_WORKS,
  OcCreateChannelData.JSON_PROPERTY_OPERATOR_IDS,
  OcCreateChannelData.JSON_PROPERTY_OPERATORS
})
@JsonTypeName("ocCreateChannelData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class OcCreateChannelData {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_COVER_URL = "cover_url";
  private String coverUrl;

  public static final String JSON_PROPERTY_COVER_FILE = "cover_file";
  private File coverFile;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_IS_EPHEMERAL = "is_ephemeral";
  private Boolean isEphemeral;

  public static final String JSON_PROPERTY_IS_DYNAMIC_PARTITIONED_HASH2_HOW_DYNAMIC_PARTITIONING_WORKS = "[is_dynamic_partitioned](#2-how-dynamic-partitioning-works)";
  private Boolean isDynamicPartitionedHash2HowDynamicPartitioningWorks;

  public static final String JSON_PROPERTY_OPERATOR_IDS = "operator_ids";
  private List<String> operatorIds = null;

  public static final String JSON_PROPERTY_OPERATORS = "operators";
  private List<String> operators = null;

  public OcCreateChannelData() { 
  }

  public OcCreateChannelData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the channel topic, or the name of the channel. The length is limited to 191 characters. (Default: open channel)
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the channel topic, or the name of the channel. The length is limited to 191 characters. (Default: open channel)")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public OcCreateChannelData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel. Only numbers, characters, and underscores are allowed. The length is 4 to 100 characters, inclusive. If not specified, a URL is automatically generated.
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the channel. Only numbers, characters, and underscores are allowed. The length is 4 to 100 characters, inclusive. If not specified, a URL is automatically generated.")
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


  public OcCreateChannelData coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Specifies the URL of the cover image. The length is limited to 2,048 characters.
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the cover image. The length is limited to 2,048 characters.")
  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverUrl() {
    return coverUrl;
  }


  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public OcCreateChannelData coverFile(File coverFile) {
    this.coverFile = coverFile;
    return this;
  }

   /**
   * Uploads a file for the channel cover image.
   * @return coverFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uploads a file for the channel cover image.")
  @JsonProperty(JSON_PROPERTY_COVER_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getCoverFile() {
    return coverFile;
  }


  @JsonProperty(JSON_PROPERTY_COVER_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverFile(File coverFile) {
    this.coverFile = coverFile;
  }


  public OcCreateChannelData customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.<br /><br /> Custom types are also used within Sendbird's [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.")
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


  public OcCreateChannelData data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional channel information such as a long description of the channel or `JSON` formatted string.")
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


  public OcCreateChannelData isEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
    return this;
  }

   /**
   * Determines whether to preserve the messages in the channel for the purpose of retrieving chat history or not. It set to true, the messages in the channel are not saved in the Sendbird database and the chat history can&#39;t be retrieved. (Default: false)
   * @return isEphemeral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to preserve the messages in the channel for the purpose of retrieving chat history or not. It set to true, the messages in the channel are not saved in the Sendbird database and the chat history can't be retrieved. (Default: false)")
  @JsonProperty(JSON_PROPERTY_IS_EPHEMERAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEphemeral() {
    return isEphemeral;
  }


  @JsonProperty(JSON_PROPERTY_IS_EPHEMERAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
  }


  public OcCreateChannelData isDynamicPartitionedHash2HowDynamicPartitioningWorks(Boolean isDynamicPartitionedHash2HowDynamicPartitioningWorks) {
    this.isDynamicPartitionedHash2HowDynamicPartitioningWorks = isDynamicPartitionedHash2HowDynamicPartitioningWorks;
    return this;
  }

   /**
   * Determines whether the channel is an open channel with dynamic partitioning or not. If the value of this property is true, the open channel can create several subchannels in order to accommodate a massive number of usres. (Default: false)&lt;br/&gt;&lt;br/&gt;  For the new Sendbird applications created after December 15, 2020, this property will be automatically set to true.
   * @return isDynamicPartitionedHash2HowDynamicPartitioningWorks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the channel is an open channel with dynamic partitioning or not. If the value of this property is true, the open channel can create several subchannels in order to accommodate a massive number of usres. (Default: false)<br/><br/>  For the new Sendbird applications created after December 15, 2020, this property will be automatically set to true.")
  @JsonProperty(JSON_PROPERTY_IS_DYNAMIC_PARTITIONED_HASH2_HOW_DYNAMIC_PARTITIONING_WORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDynamicPartitionedHash2HowDynamicPartitioningWorks() {
    return isDynamicPartitionedHash2HowDynamicPartitioningWorks;
  }


  @JsonProperty(JSON_PROPERTY_IS_DYNAMIC_PARTITIONED_HASH2_HOW_DYNAMIC_PARTITIONING_WORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDynamicPartitionedHash2HowDynamicPartitioningWorks(Boolean isDynamicPartitionedHash2HowDynamicPartitioningWorks) {
    this.isDynamicPartitionedHash2HowDynamicPartitioningWorks = isDynamicPartitionedHash2HowDynamicPartitioningWorks;
  }


  public OcCreateChannelData operatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
    return this;
  }

  public OcCreateChannelData addOperatorIdsItem(String operatorIdsItem) {
    if (this.operatorIds == null) {
      this.operatorIds = new ArrayList<>();
    }
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more user IDs to register as operators of the channel. The maximum allowed number of operators per channel is 100. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.&lt;br/&gt;&lt;br/&gt;  Operators cannot view messages that have been [moderated by](/docs/chat/v3/platform-api/guides/filter-and-moderation) the domain filter or profanity filter. Only the sender will be notified that the message has been blocked.
   * @return operatorIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more user IDs to register as operators of the channel. The maximum allowed number of operators per channel is 100. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.<br/><br/>  Operators cannot view messages that have been [moderated by](/docs/chat/v3/platform-api/guides/filter-and-moderation) the domain filter or profanity filter. Only the sender will be notified that the message has been blocked.")
  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  public OcCreateChannelData operators(List<String> operators) {
    this.operators = operators;
    return this;
  }

  public OcCreateChannelData addOperatorsItem(String operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * (Deprecated) Specifies the string IDs of the users registered as channel operators. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.
   * @return operators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Deprecated) Specifies the string IDs of the users registered as channel operators. Operators can delete any messages in the channel, and can also receive all messages that have been throttled.")
  @JsonProperty(JSON_PROPERTY_OPERATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOperators() {
    return operators;
  }


  @JsonProperty(JSON_PROPERTY_OPERATORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperators(List<String> operators) {
    this.operators = operators;
  }


  /**
   * Return true if this ocCreateChannelData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcCreateChannelData ocCreateChannelData = (OcCreateChannelData) o;
    return Objects.equals(this.name, ocCreateChannelData.name) &&
        Objects.equals(this.channelUrl, ocCreateChannelData.channelUrl) &&
        Objects.equals(this.coverUrl, ocCreateChannelData.coverUrl) &&
        Objects.equals(this.coverFile, ocCreateChannelData.coverFile) &&
        Objects.equals(this.customType, ocCreateChannelData.customType) &&
        Objects.equals(this.data, ocCreateChannelData.data) &&
        Objects.equals(this.isEphemeral, ocCreateChannelData.isEphemeral) &&
        Objects.equals(this.isDynamicPartitionedHash2HowDynamicPartitioningWorks, ocCreateChannelData.isDynamicPartitionedHash2HowDynamicPartitioningWorks) &&
        Objects.equals(this.operatorIds, ocCreateChannelData.operatorIds) &&
        Objects.equals(this.operators, ocCreateChannelData.operators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, channelUrl, coverUrl, coverFile, customType, data, isEphemeral, isDynamicPartitionedHash2HowDynamicPartitioningWorks, operatorIds, operators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcCreateChannelData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    coverFile: ").append(toIndentedString(coverFile)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isEphemeral: ").append(toIndentedString(isEphemeral)).append("\n");
    sb.append("    isDynamicPartitionedHash2HowDynamicPartitioningWorks: ").append(toIndentedString(isDynamicPartitionedHash2HowDynamicPartitioningWorks)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
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

