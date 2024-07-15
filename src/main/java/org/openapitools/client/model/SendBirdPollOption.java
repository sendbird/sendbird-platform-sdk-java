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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdPollOption
 */
@JsonPropertyOrder({
  SendBirdPollOption.JSON_PROPERTY_CREATED_AT,
  SendBirdPollOption.JSON_PROPERTY_CREATED_BY,
  SendBirdPollOption.JSON_PROPERTY_ID,
  SendBirdPollOption.JSON_PROPERTY_PARTIAL_VOTERS,
  SendBirdPollOption.JSON_PROPERTY_POLL_ID,
  SendBirdPollOption.JSON_PROPERTY_TEXT,
  SendBirdPollOption.JSON_PROPERTY_UPDATED_AT,
  SendBirdPollOption.JSON_PROPERTY_VOTE_COUNT
})
@JsonTypeName("SendBird.PollOption")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class SendBirdPollOption {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_PARTIAL_VOTERS = "partial_voters";
  private List<SendBirdUser> partialVoters = null;

  public static final String JSON_PROPERTY_POLL_ID = "poll_id";
  private BigDecimal pollId;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private BigDecimal updatedAt;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private BigDecimal voteCount;

  public SendBirdPollOption() { 
  }

  public SendBirdPollOption createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public SendBirdPollOption createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public SendBirdPollOption id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public SendBirdPollOption partialVoters(List<SendBirdUser> partialVoters) {
    this.partialVoters = partialVoters;
    return this;
  }

  public SendBirdPollOption addPartialVotersItem(SendBirdUser partialVotersItem) {
    if (this.partialVoters == null) {
      this.partialVoters = new ArrayList<>();
    }
    this.partialVoters.add(partialVotersItem);
    return this;
  }

   /**
   * Get partialVoters
   * @return partialVoters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTIAL_VOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdUser> getPartialVoters() {
    return partialVoters;
  }


  @JsonProperty(JSON_PROPERTY_PARTIAL_VOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartialVoters(List<SendBirdUser> partialVoters) {
    this.partialVoters = partialVoters;
  }


  public SendBirdPollOption pollId(BigDecimal pollId) {
    this.pollId = pollId;
    return this;
  }

   /**
   * Get pollId
   * @return pollId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POLL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPollId() {
    return pollId;
  }


  @JsonProperty(JSON_PROPERTY_POLL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPollId(BigDecimal pollId) {
    this.pollId = pollId;
  }


  public SendBirdPollOption text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public SendBirdPollOption updatedAt(BigDecimal updatedAt) {
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


  public SendBirdPollOption voteCount(BigDecimal voteCount) {
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVoteCount() {
    return voteCount;
  }


  @JsonProperty(JSON_PROPERTY_VOTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoteCount(BigDecimal voteCount) {
    this.voteCount = voteCount;
  }


  /**
   * Return true if this SendBird.PollOption object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdPollOption sendBirdPollOption = (SendBirdPollOption) o;
    return Objects.equals(this.createdAt, sendBirdPollOption.createdAt) &&
        Objects.equals(this.createdBy, sendBirdPollOption.createdBy) &&
        Objects.equals(this.id, sendBirdPollOption.id) &&
        Objects.equals(this.partialVoters, sendBirdPollOption.partialVoters) &&
        Objects.equals(this.pollId, sendBirdPollOption.pollId) &&
        Objects.equals(this.text, sendBirdPollOption.text) &&
        Objects.equals(this.updatedAt, sendBirdPollOption.updatedAt) &&
        Objects.equals(this.voteCount, sendBirdPollOption.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, id, partialVoters, pollId, text, updatedAt, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdPollOption {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partialVoters: ").append(toIndentedString(partialVoters)).append("\n");
    sb.append("    pollId: ").append(toIndentedString(pollId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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

