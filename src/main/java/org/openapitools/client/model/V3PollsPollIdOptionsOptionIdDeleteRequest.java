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
 * V3PollsPollIdOptionsOptionIdDeleteRequest
 */
@JsonPropertyOrder({
  V3PollsPollIdOptionsOptionIdDeleteRequest.JSON_PROPERTY_TEXT,
  V3PollsPollIdOptionsOptionIdDeleteRequest.JSON_PROPERTY_CREATED_BY
})
@JsonTypeName("_v3_polls__poll_id__options__option_id__delete_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class V3PollsPollIdOptionsOptionIdDeleteRequest {
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public V3PollsPollIdOptionsOptionIdDeleteRequest() { 
  }

  public V3PollsPollIdOptionsOptionIdDeleteRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Specifies the description of a new option. The maximum length is 2,000 characters.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the description of a new option. The maximum length is 2,000 characters.")
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


  public V3PollsPollIdOptionsOptionIdDeleteRequest createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Specifies the unique ID of the user who creates the option.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID of the user who creates the option.")
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


  /**
   * Return true if this _v3_polls__poll_id__options__option_id__delete_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest = (V3PollsPollIdOptionsOptionIdDeleteRequest) o;
    return Objects.equals(this.text, v3PollsPollIdOptionsOptionIdDeleteRequest.text) &&
        Objects.equals(this.createdBy, v3PollsPollIdOptionsOptionIdDeleteRequest.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PollsPollIdOptionsOptionIdDeleteRequest {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

