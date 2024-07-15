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
 * AddReactionToAMessageResponse
 */
@JsonPropertyOrder({
  AddReactionToAMessageResponse.JSON_PROPERTY_USER_ID,
  AddReactionToAMessageResponse.JSON_PROPERTY_OPERATION,
  AddReactionToAMessageResponse.JSON_PROPERTY_SUCCESS,
  AddReactionToAMessageResponse.JSON_PROPERTY_REACTION,
  AddReactionToAMessageResponse.JSON_PROPERTY_UPDATED_AT,
  AddReactionToAMessageResponse.JSON_PROPERTY_MSG_ID
})
@JsonTypeName("addReactionToAMessageResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class AddReactionToAMessageResponse {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_REACTION = "reaction";
  private String reaction;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private BigDecimal updatedAt;

  public static final String JSON_PROPERTY_MSG_ID = "msg_id";
  private BigDecimal msgId;

  public AddReactionToAMessageResponse() { 
  }

  public AddReactionToAMessageResponse userId(String userId) {
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

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AddReactionToAMessageResponse operation(String operation) {
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


  public AddReactionToAMessageResponse success(Boolean success) {
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


  public AddReactionToAMessageResponse reaction(String reaction) {
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


  public AddReactionToAMessageResponse updatedAt(BigDecimal updatedAt) {
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


  public AddReactionToAMessageResponse msgId(BigDecimal msgId) {
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


  /**
   * Return true if this addReactionToAMessageResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddReactionToAMessageResponse addReactionToAMessageResponse = (AddReactionToAMessageResponse) o;
    return Objects.equals(this.userId, addReactionToAMessageResponse.userId) &&
        Objects.equals(this.operation, addReactionToAMessageResponse.operation) &&
        Objects.equals(this.success, addReactionToAMessageResponse.success) &&
        Objects.equals(this.reaction, addReactionToAMessageResponse.reaction) &&
        Objects.equals(this.updatedAt, addReactionToAMessageResponse.updatedAt) &&
        Objects.equals(this.msgId, addReactionToAMessageResponse.msgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, operation, success, reaction, updatedAt, msgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddReactionToAMessageResponse {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
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

