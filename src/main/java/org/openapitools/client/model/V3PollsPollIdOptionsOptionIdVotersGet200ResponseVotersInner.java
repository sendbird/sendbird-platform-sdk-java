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
 * V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner
 */
@JsonPropertyOrder({
  V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.JSON_PROPERTY_NICKNAME,
  V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.JSON_PROPERTY_METADATA,
  V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.JSON_PROPERTY_PROFILE_URL,
  V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.JSON_PROPERTY_USER_ID
})
@JsonTypeName("_v3_polls__poll_id__options__option_id__voters_get_200_response_voters_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner {
  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_PROFILE_URL = "profile_url";
  private String profileUrl;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner() { 
  }

  public V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNickname() {
    return nickname;
  }


  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Get profileUrl
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileUrl() {
    return profileUrl;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner userId(String userId) {
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


  /**
   * Return true if this _v3_polls__poll_id__options__option_id__voters_get_200_response_voters_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner v3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner = (V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner) o;
    return Objects.equals(this.nickname, v3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.nickname) &&
        Objects.equals(this.metadata, v3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.metadata) &&
        Objects.equals(this.profileUrl, v3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.profileUrl) &&
        Objects.equals(this.userId, v3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname, metadata, profileUrl, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PollsPollIdOptionsOptionIdVotersGet200ResponseVotersInner {\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

