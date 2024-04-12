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
 * ViewNumberOfUnreadItemsResponse
 */
@JsonPropertyOrder({
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_SUPER_GROUP_CHANNEL_INVITATION_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_GROUP_CHANNEL_INVITATION_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MENTION_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT,
  ViewNumberOfUnreadItemsResponse.JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_INVITATION_COUNT
})
@JsonTypeName("viewNumberOfUnreadItemsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class ViewNumberOfUnreadItemsResponse {
  public static final String JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT = "non_super_group_channel_unread_message_count";
  private BigDecimal nonSuperGroupChannelUnreadMessageCount;

  public static final String JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT = "super_group_channel_unread_message_count";
  private BigDecimal superGroupChannelUnreadMessageCount;

  public static final String JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT = "group_channel_unread_message_count";
  private BigDecimal groupChannelUnreadMessageCount;

  public static final String JSON_PROPERTY_SUPER_GROUP_CHANNEL_INVITATION_COUNT = "super_group_channel_invitation_count";
  private BigDecimal superGroupChannelInvitationCount;

  public static final String JSON_PROPERTY_GROUP_CHANNEL_INVITATION_COUNT = "group_channel_invitation_count";
  private BigDecimal groupChannelInvitationCount;

  public static final String JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT = "super_group_channel_unread_mention_count";
  private BigDecimal superGroupChannelUnreadMentionCount;

  public static final String JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MENTION_COUNT = "group_channel_unread_mention_count";
  private BigDecimal groupChannelUnreadMentionCount;

  public static final String JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT = "non_super_group_channel_unread_mention_count";
  private BigDecimal nonSuperGroupChannelUnreadMentionCount;

  public static final String JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_INVITATION_COUNT = "non_super_group_channel_invitation_count";
  private BigDecimal nonSuperGroupChannelInvitationCount;

  public ViewNumberOfUnreadItemsResponse() { 
  }

  public ViewNumberOfUnreadItemsResponse nonSuperGroupChannelUnreadMessageCount(BigDecimal nonSuperGroupChannelUnreadMessageCount) {
    this.nonSuperGroupChannelUnreadMessageCount = nonSuperGroupChannelUnreadMessageCount;
    return this;
  }

   /**
   * Get nonSuperGroupChannelUnreadMessageCount
   * @return nonSuperGroupChannelUnreadMessageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNonSuperGroupChannelUnreadMessageCount() {
    return nonSuperGroupChannelUnreadMessageCount;
  }


  @JsonProperty(JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonSuperGroupChannelUnreadMessageCount(BigDecimal nonSuperGroupChannelUnreadMessageCount) {
    this.nonSuperGroupChannelUnreadMessageCount = nonSuperGroupChannelUnreadMessageCount;
  }


  public ViewNumberOfUnreadItemsResponse superGroupChannelUnreadMessageCount(BigDecimal superGroupChannelUnreadMessageCount) {
    this.superGroupChannelUnreadMessageCount = superGroupChannelUnreadMessageCount;
    return this;
  }

   /**
   * Get superGroupChannelUnreadMessageCount
   * @return superGroupChannelUnreadMessageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSuperGroupChannelUnreadMessageCount() {
    return superGroupChannelUnreadMessageCount;
  }


  @JsonProperty(JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuperGroupChannelUnreadMessageCount(BigDecimal superGroupChannelUnreadMessageCount) {
    this.superGroupChannelUnreadMessageCount = superGroupChannelUnreadMessageCount;
  }


  public ViewNumberOfUnreadItemsResponse groupChannelUnreadMessageCount(BigDecimal groupChannelUnreadMessageCount) {
    this.groupChannelUnreadMessageCount = groupChannelUnreadMessageCount;
    return this;
  }

   /**
   * Get groupChannelUnreadMessageCount
   * @return groupChannelUnreadMessageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGroupChannelUnreadMessageCount() {
    return groupChannelUnreadMessageCount;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupChannelUnreadMessageCount(BigDecimal groupChannelUnreadMessageCount) {
    this.groupChannelUnreadMessageCount = groupChannelUnreadMessageCount;
  }


  public ViewNumberOfUnreadItemsResponse superGroupChannelInvitationCount(BigDecimal superGroupChannelInvitationCount) {
    this.superGroupChannelInvitationCount = superGroupChannelInvitationCount;
    return this;
  }

   /**
   * Get superGroupChannelInvitationCount
   * @return superGroupChannelInvitationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPER_GROUP_CHANNEL_INVITATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSuperGroupChannelInvitationCount() {
    return superGroupChannelInvitationCount;
  }


  @JsonProperty(JSON_PROPERTY_SUPER_GROUP_CHANNEL_INVITATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuperGroupChannelInvitationCount(BigDecimal superGroupChannelInvitationCount) {
    this.superGroupChannelInvitationCount = superGroupChannelInvitationCount;
  }


  public ViewNumberOfUnreadItemsResponse groupChannelInvitationCount(BigDecimal groupChannelInvitationCount) {
    this.groupChannelInvitationCount = groupChannelInvitationCount;
    return this;
  }

   /**
   * Get groupChannelInvitationCount
   * @return groupChannelInvitationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_CHANNEL_INVITATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGroupChannelInvitationCount() {
    return groupChannelInvitationCount;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_CHANNEL_INVITATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupChannelInvitationCount(BigDecimal groupChannelInvitationCount) {
    this.groupChannelInvitationCount = groupChannelInvitationCount;
  }


  public ViewNumberOfUnreadItemsResponse superGroupChannelUnreadMentionCount(BigDecimal superGroupChannelUnreadMentionCount) {
    this.superGroupChannelUnreadMentionCount = superGroupChannelUnreadMentionCount;
    return this;
  }

   /**
   * Get superGroupChannelUnreadMentionCount
   * @return superGroupChannelUnreadMentionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSuperGroupChannelUnreadMentionCount() {
    return superGroupChannelUnreadMentionCount;
  }


  @JsonProperty(JSON_PROPERTY_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuperGroupChannelUnreadMentionCount(BigDecimal superGroupChannelUnreadMentionCount) {
    this.superGroupChannelUnreadMentionCount = superGroupChannelUnreadMentionCount;
  }


  public ViewNumberOfUnreadItemsResponse groupChannelUnreadMentionCount(BigDecimal groupChannelUnreadMentionCount) {
    this.groupChannelUnreadMentionCount = groupChannelUnreadMentionCount;
    return this;
  }

   /**
   * Get groupChannelUnreadMentionCount
   * @return groupChannelUnreadMentionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGroupChannelUnreadMentionCount() {
    return groupChannelUnreadMentionCount;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupChannelUnreadMentionCount(BigDecimal groupChannelUnreadMentionCount) {
    this.groupChannelUnreadMentionCount = groupChannelUnreadMentionCount;
  }


  public ViewNumberOfUnreadItemsResponse nonSuperGroupChannelUnreadMentionCount(BigDecimal nonSuperGroupChannelUnreadMentionCount) {
    this.nonSuperGroupChannelUnreadMentionCount = nonSuperGroupChannelUnreadMentionCount;
    return this;
  }

   /**
   * Get nonSuperGroupChannelUnreadMentionCount
   * @return nonSuperGroupChannelUnreadMentionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNonSuperGroupChannelUnreadMentionCount() {
    return nonSuperGroupChannelUnreadMentionCount;
  }


  @JsonProperty(JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonSuperGroupChannelUnreadMentionCount(BigDecimal nonSuperGroupChannelUnreadMentionCount) {
    this.nonSuperGroupChannelUnreadMentionCount = nonSuperGroupChannelUnreadMentionCount;
  }


  public ViewNumberOfUnreadItemsResponse nonSuperGroupChannelInvitationCount(BigDecimal nonSuperGroupChannelInvitationCount) {
    this.nonSuperGroupChannelInvitationCount = nonSuperGroupChannelInvitationCount;
    return this;
  }

   /**
   * Get nonSuperGroupChannelInvitationCount
   * @return nonSuperGroupChannelInvitationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_INVITATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNonSuperGroupChannelInvitationCount() {
    return nonSuperGroupChannelInvitationCount;
  }


  @JsonProperty(JSON_PROPERTY_NON_SUPER_GROUP_CHANNEL_INVITATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonSuperGroupChannelInvitationCount(BigDecimal nonSuperGroupChannelInvitationCount) {
    this.nonSuperGroupChannelInvitationCount = nonSuperGroupChannelInvitationCount;
  }


  /**
   * Return true if this viewNumberOfUnreadItemsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfUnreadItemsResponse viewNumberOfUnreadItemsResponse = (ViewNumberOfUnreadItemsResponse) o;
    return Objects.equals(this.nonSuperGroupChannelUnreadMessageCount, viewNumberOfUnreadItemsResponse.nonSuperGroupChannelUnreadMessageCount) &&
        Objects.equals(this.superGroupChannelUnreadMessageCount, viewNumberOfUnreadItemsResponse.superGroupChannelUnreadMessageCount) &&
        Objects.equals(this.groupChannelUnreadMessageCount, viewNumberOfUnreadItemsResponse.groupChannelUnreadMessageCount) &&
        Objects.equals(this.superGroupChannelInvitationCount, viewNumberOfUnreadItemsResponse.superGroupChannelInvitationCount) &&
        Objects.equals(this.groupChannelInvitationCount, viewNumberOfUnreadItemsResponse.groupChannelInvitationCount) &&
        Objects.equals(this.superGroupChannelUnreadMentionCount, viewNumberOfUnreadItemsResponse.superGroupChannelUnreadMentionCount) &&
        Objects.equals(this.groupChannelUnreadMentionCount, viewNumberOfUnreadItemsResponse.groupChannelUnreadMentionCount) &&
        Objects.equals(this.nonSuperGroupChannelUnreadMentionCount, viewNumberOfUnreadItemsResponse.nonSuperGroupChannelUnreadMentionCount) &&
        Objects.equals(this.nonSuperGroupChannelInvitationCount, viewNumberOfUnreadItemsResponse.nonSuperGroupChannelInvitationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonSuperGroupChannelUnreadMessageCount, superGroupChannelUnreadMessageCount, groupChannelUnreadMessageCount, superGroupChannelInvitationCount, groupChannelInvitationCount, superGroupChannelUnreadMentionCount, groupChannelUnreadMentionCount, nonSuperGroupChannelUnreadMentionCount, nonSuperGroupChannelInvitationCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfUnreadItemsResponse {\n");
    sb.append("    nonSuperGroupChannelUnreadMessageCount: ").append(toIndentedString(nonSuperGroupChannelUnreadMessageCount)).append("\n");
    sb.append("    superGroupChannelUnreadMessageCount: ").append(toIndentedString(superGroupChannelUnreadMessageCount)).append("\n");
    sb.append("    groupChannelUnreadMessageCount: ").append(toIndentedString(groupChannelUnreadMessageCount)).append("\n");
    sb.append("    superGroupChannelInvitationCount: ").append(toIndentedString(superGroupChannelInvitationCount)).append("\n");
    sb.append("    groupChannelInvitationCount: ").append(toIndentedString(groupChannelInvitationCount)).append("\n");
    sb.append("    superGroupChannelUnreadMentionCount: ").append(toIndentedString(superGroupChannelUnreadMentionCount)).append("\n");
    sb.append("    groupChannelUnreadMentionCount: ").append(toIndentedString(groupChannelUnreadMentionCount)).append("\n");
    sb.append("    nonSuperGroupChannelUnreadMentionCount: ").append(toIndentedString(nonSuperGroupChannelUnreadMentionCount)).append("\n");
    sb.append("    nonSuperGroupChannelInvitationCount: ").append(toIndentedString(nonSuperGroupChannelInvitationCount)).append("\n");
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

