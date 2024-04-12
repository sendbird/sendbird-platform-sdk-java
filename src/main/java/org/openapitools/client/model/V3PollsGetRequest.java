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
 * V3PollsGetRequest
 */
@JsonPropertyOrder({
  V3PollsGetRequest.JSON_PROPERTY_TITLE,
  V3PollsGetRequest.JSON_PROPERTY_OPTIONS,
  V3PollsGetRequest.JSON_PROPERTY_ALLOW_USER_SUGGESTION,
  V3PollsGetRequest.JSON_PROPERTY_ALLOW_MULTIPLE_VOTES,
  V3PollsGetRequest.JSON_PROPERTY_CLOSE_AT,
  V3PollsGetRequest.JSON_PROPERTY_CREATED_BY,
  V3PollsGetRequest.JSON_PROPERTY_DATA
})
@JsonTypeName("_v3_polls_get_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class V3PollsGetRequest {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<String> options = null;

  public static final String JSON_PROPERTY_ALLOW_USER_SUGGESTION = "allow_user_suggestion";
  private Boolean allowUserSuggestion;

  public static final String JSON_PROPERTY_ALLOW_MULTIPLE_VOTES = "allow_multiple_votes";
  private Boolean allowMultipleVotes;

  public static final String JSON_PROPERTY_CLOSE_AT = "close_at";
  private Long closeAt = null;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public V3PollsGetRequest() { 
  }

  public V3PollsGetRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Specifies the title of a poll. The length is limited to 2,048 characters.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the title of a poll. The length is limited to 2,048 characters.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public V3PollsGetRequest options(List<String> options) {
    this.options = options;
    return this;
  }

  public V3PollsGetRequest addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Specifies an array of poll options that a user can vote for. At least one option should be provided, and the length of each option is limited to 2,000 characters.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of poll options that a user can vote for. At least one option should be provided, and the length of each option is limited to 2,000 characters.")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptions(List<String> options) {
    this.options = options;
  }


  public V3PollsGetRequest allowUserSuggestion(Boolean allowUserSuggestion) {
    this.allowUserSuggestion = allowUserSuggestion;
    return this;
  }

   /**
   * Determines whether to allow users other than the creator of the poll to add new options to the poll. (Default is false)
   * @return allowUserSuggestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to allow users other than the creator of the poll to add new options to the poll. (Default is false)")
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


  public V3PollsGetRequest allowMultipleVotes(Boolean allowMultipleVotes) {
    this.allowMultipleVotes = allowMultipleVotes;
    return this;
  }

   /**
   * Determines whether to allow users to vote for multiple options. (Default is false)
   * @return allowMultipleVotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to allow users to vote for multiple options. (Default is false)")
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


  public V3PollsGetRequest closeAt(Long closeAt) {
    this.closeAt = closeAt;
    return this;
  }

   /**
   * Specifies when the poll closes and no longer accepts votes in Unix seconds. If the value of this property is -1, the poll is open indefinitely.
   * @return closeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies when the poll closes and no longer accepts votes in Unix seconds. If the value of this property is -1, the poll is open indefinitely.")
  @JsonProperty(JSON_PROPERTY_CLOSE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCloseAt() {
    return closeAt;
  }


  @JsonProperty(JSON_PROPERTY_CLOSE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloseAt(Long closeAt) {
    this.closeAt = closeAt;
  }


  public V3PollsGetRequest createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Specifies the unique ID of the user who creates the poll.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID of the user who creates the poll.")
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


  public V3PollsGetRequest data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Specifies a JSON object of one or more key-value items to store additional poll information.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a JSON object of one or more key-value items to store additional poll information.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  /**
   * Return true if this _v3_polls_get_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PollsGetRequest v3PollsGetRequest = (V3PollsGetRequest) o;
    return Objects.equals(this.title, v3PollsGetRequest.title) &&
        Objects.equals(this.options, v3PollsGetRequest.options) &&
        Objects.equals(this.allowUserSuggestion, v3PollsGetRequest.allowUserSuggestion) &&
        Objects.equals(this.allowMultipleVotes, v3PollsGetRequest.allowMultipleVotes) &&
        Objects.equals(this.closeAt, v3PollsGetRequest.closeAt) &&
        Objects.equals(this.createdBy, v3PollsGetRequest.createdBy) &&
        Objects.equals(this.data, v3PollsGetRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, options, allowUserSuggestion, allowMultipleVotes, closeAt, createdBy, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PollsGetRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    allowUserSuggestion: ").append(toIndentedString(allowUserSuggestion)).append("\n");
    sb.append("    allowMultipleVotes: ").append(toIndentedString(allowMultipleVotes)).append("\n");
    sb.append("    closeAt: ").append(toIndentedString(closeAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

