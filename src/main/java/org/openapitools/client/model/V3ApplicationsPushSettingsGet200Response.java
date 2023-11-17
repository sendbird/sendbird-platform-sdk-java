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
 * V3ApplicationsPushSettingsGet200Response
 */
@JsonPropertyOrder({
  V3ApplicationsPushSettingsGet200Response.JSON_PROPERTY_PUSH_ENABLED
})
@JsonTypeName("_v3_applications_push_settings_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class V3ApplicationsPushSettingsGet200Response {
  public static final String JSON_PROPERTY_PUSH_ENABLED = "push_enabled";
  private Boolean pushEnabled;

  public V3ApplicationsPushSettingsGet200Response() { 
  }

  public V3ApplicationsPushSettingsGet200Response pushEnabled(Boolean pushEnabled) {
    this.pushEnabled = pushEnabled;
    return this;
  }

   /**
   * Get pushEnabled
   * @return pushEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPushEnabled() {
    return pushEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushEnabled(Boolean pushEnabled) {
    this.pushEnabled = pushEnabled;
  }


  /**
   * Return true if this _v3_applications_push_settings_get_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ApplicationsPushSettingsGet200Response v3ApplicationsPushSettingsGet200Response = (V3ApplicationsPushSettingsGet200Response) o;
    return Objects.equals(this.pushEnabled, v3ApplicationsPushSettingsGet200Response.pushEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ApplicationsPushSettingsGet200Response {\n");
    sb.append("    pushEnabled: ").append(toIndentedString(pushEnabled)).append("\n");
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

