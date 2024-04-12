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
 * RemoveReactionFromAMessageResponse
 */
@JsonPropertyOrder({
  RemoveReactionFromAMessageResponse.JSON_PROPERTY_REACTION,
  RemoveReactionFromAMessageResponse.JSON_PROPERTY_USER_ID,
  RemoveReactionFromAMessageResponse.JSON_PROPERTY_SUCCESS,
  RemoveReactionFromAMessageResponse.JSON_PROPERTY_MSG_ID,
  RemoveReactionFromAMessageResponse.JSON_PROPERTY_UPDATED_AT,
  RemoveReactionFromAMessageResponse.JSON_PROPERTY_OPERATION
})
@JsonTypeName("removeReactionFromAMessageResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class RemoveReactionFromAMessageResponse {
  public static final String JSON_PROPERTY_REACTION = "reaction";
  private String reaction;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private BigDecimal userId;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_MSG_ID = "msg_id";
  private BigDecimal msgId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private BigDecimal updatedAt;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public RemoveReactionFromAMessageResponse() { 
  }

  public RemoveReactionFromAMessageResponse reaction(String reaction) {
    this.reaction = reaction;
    return this;
  }

   /**
   * Get reaction
   * @return reaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReaction() {
    return reaction;
  }


  @JsonProperty(JSON_PROPERTY_REACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReaction(String reaction) {
    this.reaction = reaction;
  }


  public RemoveReactionFromAMessageResponse userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }


  public RemoveReactionFromAMessageResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public RemoveReactionFromAMessageResponse msgId(BigDecimal msgId) {
    this.msgId = msgId;
    return this;
  }

   /**
   * Get msgId
   * @return msgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MSG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMsgId() {
    return msgId;
  }


  @JsonProperty(JSON_PROPERTY_MSG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsgId(BigDecimal msgId) {
    this.msgId = msgId;
  }


  public RemoveReactionFromAMessageResponse updatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RemoveReactionFromAMessageResponse operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(String operation) {
    this.operation = operation;
  }


  /**
   * Return true if this removeReactionFromAMessageResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveReactionFromAMessageResponse removeReactionFromAMessageResponse = (RemoveReactionFromAMessageResponse) o;
    return Objects.equals(this.reaction, removeReactionFromAMessageResponse.reaction) &&
        Objects.equals(this.userId, removeReactionFromAMessageResponse.userId) &&
        Objects.equals(this.success, removeReactionFromAMessageResponse.success) &&
        Objects.equals(this.msgId, removeReactionFromAMessageResponse.msgId) &&
        Objects.equals(this.updatedAt, removeReactionFromAMessageResponse.updatedAt) &&
        Objects.equals(this.operation, removeReactionFromAMessageResponse.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reaction, userId, success, msgId, updatedAt, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveReactionFromAMessageResponse {\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

