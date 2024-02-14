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
 * SendBirdScheduledMessage
 */
@JsonPropertyOrder({
  SendBirdScheduledMessage.JSON_PROPERTY_SCHEDULED_MESSAGE_ID,
  SendBirdScheduledMessage.JSON_PROPERTY_MESSAGE_TYPE,
  SendBirdScheduledMessage.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("SendBird.ScheduledMessage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class SendBirdScheduledMessage {
  public static final String JSON_PROPERTY_SCHEDULED_MESSAGE_ID = "scheduled_message_id";
  private BigDecimal scheduledMessageId;

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "message_type";
  private String messageType;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public SendBirdScheduledMessage() { 
  }

  public SendBirdScheduledMessage scheduledMessageId(BigDecimal scheduledMessageId) {
    this.scheduledMessageId = scheduledMessageId;
    return this;
  }

   /**
   * Get scheduledMessageId
   * @return scheduledMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getScheduledMessageId() {
    return scheduledMessageId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledMessageId(BigDecimal scheduledMessageId) {
    this.scheduledMessageId = scheduledMessageId;
  }


  public SendBirdScheduledMessage messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public SendBirdScheduledMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Return true if this SendBird.ScheduledMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdScheduledMessage sendBirdScheduledMessage = (SendBirdScheduledMessage) o;
    return Objects.equals(this.scheduledMessageId, sendBirdScheduledMessage.scheduledMessageId) &&
        Objects.equals(this.messageType, sendBirdScheduledMessage.messageType) &&
        Objects.equals(this.message, sendBirdScheduledMessage.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledMessageId, messageType, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdScheduledMessage {\n");
    sb.append("    scheduledMessageId: ").append(toIndentedString(scheduledMessageId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

