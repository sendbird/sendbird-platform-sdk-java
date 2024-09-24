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
 * Specifies the extended message payload which is used to send a message with a custom message type.
 */
@ApiModel(description = "Specifies the extended message payload which is used to send a message with a custom message type.")
@JsonPropertyOrder({
  SendBotSMessageDataExtendedMessagePayload.JSON_PROPERTY_SUGGESTED_REPLIES,
  SendBotSMessageDataExtendedMessagePayload.JSON_PROPERTY_CUSTOM_VIEW
})
@JsonTypeName("sendBot_sMessageData_extended_message_payload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class SendBotSMessageDataExtendedMessagePayload {
  public static final String JSON_PROPERTY_SUGGESTED_REPLIES = "suggested_replies";
  private List<String> suggestedReplies = null;

  public static final String JSON_PROPERTY_CUSTOM_VIEW = "custom_view";
  private Object customView;

  public SendBotSMessageDataExtendedMessagePayload() { 
  }

  public SendBotSMessageDataExtendedMessagePayload suggestedReplies(List<String> suggestedReplies) {
    this.suggestedReplies = suggestedReplies;
    return this;
  }

  public SendBotSMessageDataExtendedMessagePayload addSuggestedRepliesItem(String suggestedRepliesItem) {
    if (this.suggestedReplies == null) {
      this.suggestedReplies = new ArrayList<>();
    }
    this.suggestedReplies.add(suggestedRepliesItem);
    return this;
  }

   /**
   * Specifies an array of suggested replies to be sent with the message.
   * @return suggestedReplies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of suggested replies to be sent with the message.")
  @JsonProperty(JSON_PROPERTY_SUGGESTED_REPLIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSuggestedReplies() {
    return suggestedReplies;
  }


  @JsonProperty(JSON_PROPERTY_SUGGESTED_REPLIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuggestedReplies(List<String> suggestedReplies) {
    this.suggestedReplies = suggestedReplies;
  }


  public SendBotSMessageDataExtendedMessagePayload customView(Object customView) {
    this.customView = customView;
    return this;
  }

   /**
   * JSON format you want to embed in message, eq : {\&quot;title\&quot;: \&quot;title\&quot;, \&quot;image\&quot;: \&quot;https://link.to/image.jpg\&quot;}
   * @return customView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON format you want to embed in message, eq : {\"title\": \"title\", \"image\": \"https://link.to/image.jpg\"}")
  @JsonProperty(JSON_PROPERTY_CUSTOM_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomView() {
    return customView;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomView(Object customView) {
    this.customView = customView;
  }


  /**
   * Return true if this sendBot_sMessageData_extended_message_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBotSMessageDataExtendedMessagePayload sendBotSMessageDataExtendedMessagePayload = (SendBotSMessageDataExtendedMessagePayload) o;
    return Objects.equals(this.suggestedReplies, sendBotSMessageDataExtendedMessagePayload.suggestedReplies) &&
        Objects.equals(this.customView, sendBotSMessageDataExtendedMessagePayload.customView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedReplies, customView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBotSMessageDataExtendedMessagePayload {\n");
    sb.append("    suggestedReplies: ").append(toIndentedString(suggestedReplies)).append("\n");
    sb.append("    customView: ").append(toIndentedString(customView)).append("\n");
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

