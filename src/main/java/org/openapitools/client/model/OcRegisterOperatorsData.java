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
 * OcRegisterOperatorsData
 */
@JsonPropertyOrder({
  OcRegisterOperatorsData.JSON_PROPERTY_CHANNEL_URL,
  OcRegisterOperatorsData.JSON_PROPERTY_OPERATOR_IDS
})
@JsonTypeName("ocRegisterOperatorsData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
public class OcRegisterOperatorsData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_OPERATOR_IDS = "operator_ids";
  private List<String> operatorIds = new ArrayList<>();

  public OcRegisterOperatorsData() { 
  }

  public OcRegisterOperatorsData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to register operators to.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to register operators to.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public OcRegisterOperatorsData operatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
    return this;
  }

  public OcRegisterOperatorsData addOperatorIdsItem(String operatorIdsItem) {
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to register as operators of the channel. The maximum allowed number of operators per channel is 100.
   * @return operatorIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to register as operators of the channel. The maximum allowed number of operators per channel is 100.")
  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  /**
   * Return true if this ocRegisterOperatorsData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcRegisterOperatorsData ocRegisterOperatorsData = (OcRegisterOperatorsData) o;
    return Objects.equals(this.channelUrl, ocRegisterOperatorsData.channelUrl) &&
        Objects.equals(this.operatorIds, ocRegisterOperatorsData.operatorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, operatorIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcRegisterOperatorsData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
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

