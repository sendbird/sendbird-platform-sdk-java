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
 * OcMuteUserData
 */
@JsonPropertyOrder({
  OcMuteUserData.JSON_PROPERTY_USER_ID,
  OcMuteUserData.JSON_PROPERTY_SECONDS,
  OcMuteUserData.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("ocMuteUserData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class OcMuteUserData {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Integer seconds;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public OcMuteUserData() { 
  }

  public OcMuteUserData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the target user to mute.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the target user to mute.")
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


  public OcMuteUserData seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Specifies the duration of mute status. If set to -1, the user will be muted permanently (10 years, technically). (Default: -1)
   * @return seconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the duration of mute status. If set to -1, the user will be muted permanently (10 years, technically). (Default: -1)")
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


  public OcMuteUserData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Specifies a reason for the muting.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a reason for the muting.")
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
   * Return true if this ocMuteUserData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcMuteUserData ocMuteUserData = (OcMuteUserData) o;
    return Objects.equals(this.userId, ocMuteUserData.userId) &&
        Objects.equals(this.seconds, ocMuteUserData.seconds) &&
        Objects.equals(this.description, ocMuteUserData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, seconds, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcMuteUserData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

