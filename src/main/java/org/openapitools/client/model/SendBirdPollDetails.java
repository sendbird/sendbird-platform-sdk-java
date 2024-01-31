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
import org.openapitools.client.model.SendBirdPollOption;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdPollDetails
 */
@JsonPropertyOrder({
  SendBirdPollDetails.JSON_PROPERTY_ALLOW_MULTIPLE_VOTES,
  SendBirdPollDetails.JSON_PROPERTY_ALLOW_USER_SUGGESTION,
  SendBirdPollDetails.JSON_PROPERTY_CLOSE_AT,
  SendBirdPollDetails.JSON_PROPERTY_CREATED_AT,
  SendBirdPollDetails.JSON_PROPERTY_CREATED_BY,
  SendBirdPollDetails.JSON_PROPERTY_IS_ANONYMOUS,
  SendBirdPollDetails.JSON_PROPERTY_OPTIONS,
  SendBirdPollDetails.JSON_PROPERTY_STATUS,
  SendBirdPollDetails.JSON_PROPERTY_UPDATED_AT,
  SendBirdPollDetails.JSON_PROPERTY_VOTER_COUNT
})
@JsonTypeName("SendBird.PollDetails")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class SendBirdPollDetails {
  public static final String JSON_PROPERTY_ALLOW_MULTIPLE_VOTES = "allow_multiple_votes";
  private Boolean allowMultipleVotes;

  public static final String JSON_PROPERTY_ALLOW_USER_SUGGESTION = "allow_user_suggestion";
  private Boolean allowUserSuggestion;

  public static final String JSON_PROPERTY_CLOSE_AT = "close_at";
  private BigDecimal closeAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_IS_ANONYMOUS = "is_anonymous";
  private Boolean isAnonymous;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<SendBirdPollOption> options = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CLOSED("closed"),
    
    OPEN("open"),
    
    REMOVED("removed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private BigDecimal updatedAt;

  public static final String JSON_PROPERTY_VOTER_COUNT = "voter_count";
  private BigDecimal voterCount;

  public SendBirdPollDetails() { 
  }

  public SendBirdPollDetails allowMultipleVotes(Boolean allowMultipleVotes) {
    this.allowMultipleVotes = allowMultipleVotes;
    return this;
  }

   /**
   * Get allowMultipleVotes
   * @return allowMultipleVotes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOW_MULTIPLE_VOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowMultipleVotes() {
    return allowMultipleVotes;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_MULTIPLE_VOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowMultipleVotes(Boolean allowMultipleVotes) {
    this.allowMultipleVotes = allowMultipleVotes;
  }


  public SendBirdPollDetails allowUserSuggestion(Boolean allowUserSuggestion) {
    this.allowUserSuggestion = allowUserSuggestion;
    return this;
  }

   /**
   * Get allowUserSuggestion
   * @return allowUserSuggestion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOW_USER_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowUserSuggestion() {
    return allowUserSuggestion;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_USER_SUGGESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowUserSuggestion(Boolean allowUserSuggestion) {
    this.allowUserSuggestion = allowUserSuggestion;
  }


  public SendBirdPollDetails closeAt(BigDecimal closeAt) {
    this.closeAt = closeAt;
    return this;
  }

   /**
   * Get closeAt
   * @return closeAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOSE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCloseAt() {
    return closeAt;
  }


  @JsonProperty(JSON_PROPERTY_CLOSE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloseAt(BigDecimal closeAt) {
    this.closeAt = closeAt;
  }


  public SendBirdPollDetails createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
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


  public SendBirdPollDetails createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
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


  public SendBirdPollDetails isAnonymous(Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
    return this;
  }

   /**
   * Get isAnonymous
   * @return isAnonymous
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ANONYMOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAnonymous() {
    return isAnonymous;
  }


  @JsonProperty(JSON_PROPERTY_IS_ANONYMOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAnonymous(Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }


  public SendBirdPollDetails options(List<SendBirdPollOption> options) {
    this.options = options;
    return this;
  }

  public SendBirdPollDetails addOptionsItem(SendBirdPollOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdPollOption> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(List<SendBirdPollOption> options) {
    this.options = options;
  }


  public SendBirdPollDetails status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SendBirdPollDetails updatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
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


  public SendBirdPollDetails voterCount(BigDecimal voterCount) {
    this.voterCount = voterCount;
    return this;
  }

   /**
   * Get voterCount
   * @return voterCount
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOTER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVoterCount() {
    return voterCount;
  }


  @JsonProperty(JSON_PROPERTY_VOTER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoterCount(BigDecimal voterCount) {
    this.voterCount = voterCount;
  }


  /**
   * Return true if this SendBird.PollDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdPollDetails sendBirdPollDetails = (SendBirdPollDetails) o;
    return Objects.equals(this.allowMultipleVotes, sendBirdPollDetails.allowMultipleVotes) &&
        Objects.equals(this.allowUserSuggestion, sendBirdPollDetails.allowUserSuggestion) &&
        Objects.equals(this.closeAt, sendBirdPollDetails.closeAt) &&
        Objects.equals(this.createdAt, sendBirdPollDetails.createdAt) &&
        Objects.equals(this.createdBy, sendBirdPollDetails.createdBy) &&
        Objects.equals(this.isAnonymous, sendBirdPollDetails.isAnonymous) &&
        Objects.equals(this.options, sendBirdPollDetails.options) &&
        Objects.equals(this.status, sendBirdPollDetails.status) &&
        Objects.equals(this.updatedAt, sendBirdPollDetails.updatedAt) &&
        Objects.equals(this.voterCount, sendBirdPollDetails.voterCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMultipleVotes, allowUserSuggestion, closeAt, createdAt, createdBy, isAnonymous, options, status, updatedAt, voterCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdPollDetails {\n");
    sb.append("    allowMultipleVotes: ").append(toIndentedString(allowMultipleVotes)).append("\n");
    sb.append("    allowUserSuggestion: ").append(toIndentedString(allowUserSuggestion)).append("\n");
    sb.append("    closeAt: ").append(toIndentedString(closeAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    isAnonymous: ").append(toIndentedString(isAnonymous)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    voterCount: ").append(toIndentedString(voterCount)).append("\n");
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

