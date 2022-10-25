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
 * BanUsersInChannelsWithCustomChannelTypeDataBannedListInner
 */
@JsonPropertyOrder({
  BanUsersInChannelsWithCustomChannelTypeDataBannedListInner.JSON_PROPERTY_USER_ID,
  BanUsersInChannelsWithCustomChannelTypeDataBannedListInner.JSON_PROPERTY_SECONDS,
  BanUsersInChannelsWithCustomChannelTypeDataBannedListInner.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("banUsersInChannelsWithCustomChannelTypeData_banned_list_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
public class BanUsersInChannelsWithCustomChannelTypeDataBannedListInner {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private BigDecimal seconds;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public BanUsersInChannelsWithCustomChannelTypeDataBannedListInner() { 
  }

  public BanUsersInChannelsWithCustomChannelTypeDataBannedListInner userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public BanUsersInChannelsWithCustomChannelTypeDataBannedListInner seconds(BigDecimal seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSeconds() {
    return seconds;
  }


  @JsonProperty(JSON_PROPERTY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeconds(BigDecimal seconds) {
    this.seconds = seconds;
  }


  public BanUsersInChannelsWithCustomChannelTypeDataBannedListInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this banUsersInChannelsWithCustomChannelTypeData_banned_list_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BanUsersInChannelsWithCustomChannelTypeDataBannedListInner banUsersInChannelsWithCustomChannelTypeDataBannedListInner = (BanUsersInChannelsWithCustomChannelTypeDataBannedListInner) o;
    return Objects.equals(this.userId, banUsersInChannelsWithCustomChannelTypeDataBannedListInner.userId) &&
        Objects.equals(this.seconds, banUsersInChannelsWithCustomChannelTypeDataBannedListInner.seconds) &&
        Objects.equals(this.description, banUsersInChannelsWithCustomChannelTypeDataBannedListInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, seconds, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BanUsersInChannelsWithCustomChannelTypeDataBannedListInner {\n");
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

