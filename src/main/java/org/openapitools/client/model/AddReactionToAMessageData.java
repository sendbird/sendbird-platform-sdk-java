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
 * AddReactionToAMessageData
 */
@JsonPropertyOrder({
  AddReactionToAMessageData.JSON_PROPERTY_CHANNEL_TYPE,
  AddReactionToAMessageData.JSON_PROPERTY_CHANNEL_URL,
  AddReactionToAMessageData.JSON_PROPERTY_MESSAGE_ID,
  AddReactionToAMessageData.JSON_PROPERTY_USER_ID,
  AddReactionToAMessageData.JSON_PROPERTY_REACTION
})
@JsonTypeName("addReactionToAMessageData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class AddReactionToAMessageData {
  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_MESSAGE_ID = "message_id";
  private Integer messageId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_REACTION = "reaction";
  private String reaction;

  public AddReactionToAMessageData() { 
  }

  public AddReactionToAMessageData channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Currently, a value of group_channels is only available for the parameter.
   * @return channelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the channel. Currently, a value of group_channels is only available for the parameter.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelType() {
    return channelType;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public AddReactionToAMessageData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel.")
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


  public AddReactionToAMessageData messageId(Integer messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Specifies the unique ID of the message to add a reaction to.
   * @return messageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the message to add a reaction to.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }


  public AddReactionToAMessageData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the user who reacts to the message.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user who reacts to the message.")
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


  public AddReactionToAMessageData reaction(String reaction) {
    this.reaction = reaction;
    return this;
  }

   /**
   * Specifies the unique key of the reaction to be added to the message. The length is limited to 192 charaters.
   * @return reaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique key of the reaction to be added to the message. The length is limited to 192 charaters.")
  @JsonProperty(JSON_PROPERTY_REACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReaction() {
    return reaction;
  }


  @JsonProperty(JSON_PROPERTY_REACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReaction(String reaction) {
    this.reaction = reaction;
  }


  /**
   * Return true if this addReactionToAMessageData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddReactionToAMessageData addReactionToAMessageData = (AddReactionToAMessageData) o;
    return Objects.equals(this.channelType, addReactionToAMessageData.channelType) &&
        Objects.equals(this.channelUrl, addReactionToAMessageData.channelUrl) &&
        Objects.equals(this.messageId, addReactionToAMessageData.messageId) &&
        Objects.equals(this.userId, addReactionToAMessageData.userId) &&
        Objects.equals(this.reaction, addReactionToAMessageData.reaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, messageId, userId, reaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddReactionToAMessageData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
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

