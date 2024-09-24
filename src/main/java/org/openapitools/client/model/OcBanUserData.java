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
 * OcBanUserData
 */
@JsonPropertyOrder({
  OcBanUserData.JSON_PROPERTY_CHANNEL_URL,
  OcBanUserData.JSON_PROPERTY_USER_ID,
  OcBanUserData.JSON_PROPERTY_AGENT_ID,
  OcBanUserData.JSON_PROPERTY_SECONDS,
  OcBanUserData.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("ocBanUserData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class OcBanUserData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_AGENT_ID = "agent_id";
  private String agentId;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Integer seconds;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public OcBanUserData() { 
  }

  public OcBanUserData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel where to ban the specified user.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel where to ban the specified user.")
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


  public OcBanUserData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the user to ban.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user to ban.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public OcBanUserData agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Specifies the ID of the operator (agent) who bans the user.
   * @return agentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the operator (agent) who bans the user.")
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public OcBanUserData seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Specifies the ban duration. If set to -1, the user will be banned permanently (10 years, technically). (Default: -1)
   * @return seconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ban duration. If set to -1, the user will be banned permanently (10 years, technically). (Default: -1)")
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSeconds() {
    return seconds;
  }


  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }


  public OcBanUserData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Specifies a reason for the banning. The length is limited to 250 characters.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a reason for the banning. The length is limited to 250 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this ocBanUserData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcBanUserData ocBanUserData = (OcBanUserData) o;
    return Objects.equals(this.channelUrl, ocBanUserData.channelUrl) &&
        Objects.equals(this.userId, ocBanUserData.userId) &&
        Objects.equals(this.agentId, ocBanUserData.agentId) &&
        Objects.equals(this.seconds, ocBanUserData.seconds) &&
        Objects.equals(this.description, ocBanUserData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userId, agentId, seconds, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcBanUserData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

