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
 * AddFcmPushConfigurationResponsePushConfigurationsInner
 */
@JsonPropertyOrder({
  AddFcmPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_ID,
  AddFcmPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_PUSH_TYPE,
  AddFcmPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_API_KEY,
  AddFcmPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_PUSH_SOUND
})
@JsonTypeName("addFcmPushConfigurationResponse_push_configurations_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class AddFcmPushConfigurationResponsePushConfigurationsInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PUSH_TYPE = "push_type";
  private String pushType;

  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public AddFcmPushConfigurationResponsePushConfigurationsInner() { 
  }

  public AddFcmPushConfigurationResponsePushConfigurationsInner id(String id) {
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AddFcmPushConfigurationResponsePushConfigurationsInner pushType(String pushType) {
    this.pushType = pushType;
    return this;
  }

   /**
   * Get pushType
   * @return pushType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushType() {
    return pushType;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushType(String pushType) {
    this.pushType = pushType;
  }


  public AddFcmPushConfigurationResponsePushConfigurationsInner apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public AddFcmPushConfigurationResponsePushConfigurationsInner pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  /**
   * Return true if this addFcmPushConfigurationResponse_push_configurations_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFcmPushConfigurationResponsePushConfigurationsInner addFcmPushConfigurationResponsePushConfigurationsInner = (AddFcmPushConfigurationResponsePushConfigurationsInner) o;
    return Objects.equals(this.id, addFcmPushConfigurationResponsePushConfigurationsInner.id) &&
        Objects.equals(this.pushType, addFcmPushConfigurationResponsePushConfigurationsInner.pushType) &&
        Objects.equals(this.apiKey, addFcmPushConfigurationResponsePushConfigurationsInner.apiKey) &&
        Objects.equals(this.pushSound, addFcmPushConfigurationResponsePushConfigurationsInner.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pushType, apiKey, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFcmPushConfigurationResponsePushConfigurationsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pushType: ").append(toIndentedString(pushType)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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

