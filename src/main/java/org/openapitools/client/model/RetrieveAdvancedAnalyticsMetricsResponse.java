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
 * RetrieveAdvancedAnalyticsMetricsResponse
 */
@JsonPropertyOrder({
  RetrieveAdvancedAnalyticsMetricsResponse.JSON_PROPERTY_SEGMENTS,
  RetrieveAdvancedAnalyticsMetricsResponse.JSON_PROPERTY_DATE,
  RetrieveAdvancedAnalyticsMetricsResponse.JSON_PROPERTY_VALUE,
  RetrieveAdvancedAnalyticsMetricsResponse.JSON_PROPERTY_CHANNEL_TYPE,
  RetrieveAdvancedAnalyticsMetricsResponse.JSON_PROPERTY_CUSTOM_CHANNEL_TYPE,
  RetrieveAdvancedAnalyticsMetricsResponse.JSON_PROPERTY_CUSTOM_MESSAGE_TYPE
})
@JsonTypeName("retrieveAdvancedAnalyticsMetricsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class RetrieveAdvancedAnalyticsMetricsResponse {
  public static final String JSON_PROPERTY_SEGMENTS = "segments";
  private String segments;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_CUSTOM_CHANNEL_TYPE = "custom_channel_type";
  private String customChannelType;

  public static final String JSON_PROPERTY_CUSTOM_MESSAGE_TYPE = "custom_message_type";
  private String customMessageType;

  public RetrieveAdvancedAnalyticsMetricsResponse() { 
  }

  public RetrieveAdvancedAnalyticsMetricsResponse segments(String segments) {
    this.segments = segments;
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSegments() {
    return segments;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegments(String segments) {
    this.segments = segments;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public RetrieveAdvancedAnalyticsMetricsResponse customChannelType(String customChannelType) {
    this.customChannelType = customChannelType;
    return this;
  }

   /**
   * Get customChannelType
   * @return customChannelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomChannelType() {
    return customChannelType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomChannelType(String customChannelType) {
    this.customChannelType = customChannelType;
  }


  public RetrieveAdvancedAnalyticsMetricsResponse customMessageType(String customMessageType) {
    this.customMessageType = customMessageType;
    return this;
  }

   /**
   * Get customMessageType
   * @return customMessageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomMessageType() {
    return customMessageType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomMessageType(String customMessageType) {
    this.customMessageType = customMessageType;
  }


  /**
   * Return true if this retrieveAdvancedAnalyticsMetricsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveAdvancedAnalyticsMetricsResponse retrieveAdvancedAnalyticsMetricsResponse = (RetrieveAdvancedAnalyticsMetricsResponse) o;
    return Objects.equals(this.segments, retrieveAdvancedAnalyticsMetricsResponse.segments) &&
        Objects.equals(this.date, retrieveAdvancedAnalyticsMetricsResponse.date) &&
        Objects.equals(this.value, retrieveAdvancedAnalyticsMetricsResponse.value) &&
        Objects.equals(this.channelType, retrieveAdvancedAnalyticsMetricsResponse.channelType) &&
        Objects.equals(this.customChannelType, retrieveAdvancedAnalyticsMetricsResponse.customChannelType) &&
        Objects.equals(this.customMessageType, retrieveAdvancedAnalyticsMetricsResponse.customMessageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments, date, value, channelType, customChannelType, customMessageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveAdvancedAnalyticsMetricsResponse {\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    customChannelType: ").append(toIndentedString(customChannelType)).append("\n");
    sb.append("    customMessageType: ").append(toIndentedString(customMessageType)).append("\n");
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

