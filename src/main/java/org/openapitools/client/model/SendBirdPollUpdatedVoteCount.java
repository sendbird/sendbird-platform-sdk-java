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
 * SendBirdPollUpdatedVoteCount
 */
@JsonPropertyOrder({
  SendBirdPollUpdatedVoteCount.JSON_PROPERTY_OPTION_ID,
  SendBirdPollUpdatedVoteCount.JSON_PROPERTY_VOTE_COUNT
})
@JsonTypeName("SendBird.PollUpdatedVoteCount")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class SendBirdPollUpdatedVoteCount {
  public static final String JSON_PROPERTY_OPTION_ID = "option_id";
  private BigDecimal optionId;

  public static final String JSON_PROPERTY_VOTE_COUNT = "vote_count";
  private BigDecimal voteCount;

  public SendBirdPollUpdatedVoteCount() { 
  }

  public SendBirdPollUpdatedVoteCount optionId(BigDecimal optionId) {
    this.optionId = optionId;
    return this;
  }

   /**
   * Get optionId
   * @return optionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOptionId() {
    return optionId;
  }


  @JsonProperty(JSON_PROPERTY_OPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionId(BigDecimal optionId) {
    this.optionId = optionId;
  }


  public SendBirdPollUpdatedVoteCount voteCount(BigDecimal voteCount) {
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
   * Return true if this SendBird.PollUpdatedVoteCount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdPollUpdatedVoteCount sendBirdPollUpdatedVoteCount = (SendBirdPollUpdatedVoteCount) o;
    return Objects.equals(this.optionId, sendBirdPollUpdatedVoteCount.optionId) &&
        Objects.equals(this.voteCount, sendBirdPollUpdatedVoteCount.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdPollUpdatedVoteCount {\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
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

