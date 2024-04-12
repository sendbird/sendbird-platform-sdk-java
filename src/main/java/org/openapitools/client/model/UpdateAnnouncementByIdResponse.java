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
import org.openapitools.client.model.UpdateAnnouncementByIdResponseMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdateAnnouncementByIdResponse
 */
@JsonPropertyOrder({
  UpdateAnnouncementByIdResponse.JSON_PROPERTY_UNIQUE_ID,
  UpdateAnnouncementByIdResponse.JSON_PROPERTY_ANNOUNCEMENT_GROUP,
  UpdateAnnouncementByIdResponse.JSON_PROPERTY_MESSAGE
})
@JsonTypeName("updateAnnouncementByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class UpdateAnnouncementByIdResponse {
  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private String uniqueId;

  public static final String JSON_PROPERTY_ANNOUNCEMENT_GROUP = "announcement_group";
  private String announcementGroup;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private UpdateAnnouncementByIdResponseMessage message;

  public UpdateAnnouncementByIdResponse() { 
  }

  public UpdateAnnouncementByIdResponse uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public UpdateAnnouncementByIdResponse announcementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
    return this;
  }

   /**
   * Get announcementGroup
   * @return announcementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnouncementGroup() {
    return announcementGroup;
  }


  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnouncementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public UpdateAnnouncementByIdResponse message(UpdateAnnouncementByIdResponseMessage message) {
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

  public UpdateAnnouncementByIdResponseMessage getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(UpdateAnnouncementByIdResponseMessage message) {
    this.message = message;
  }


  /**
   * Return true if this updateAnnouncementByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAnnouncementByIdResponse updateAnnouncementByIdResponse = (UpdateAnnouncementByIdResponse) o;
    return Objects.equals(this.uniqueId, updateAnnouncementByIdResponse.uniqueId) &&
        Objects.equals(this.announcementGroup, updateAnnouncementByIdResponse.announcementGroup) &&
        Objects.equals(this.message, updateAnnouncementByIdResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, announcementGroup, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAnnouncementByIdResponse {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
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

