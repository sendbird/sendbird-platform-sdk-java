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
import org.openapitools.client.model.ConfigureAutoEventDataAutoEventMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ConfigureAutoEventData
 */
@JsonPropertyOrder({
  ConfigureAutoEventData.JSON_PROPERTY_AUTO_EVENT_MESSAGE
})
@JsonTypeName("configureAutoEventData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class ConfigureAutoEventData {
  public static final String JSON_PROPERTY_AUTO_EVENT_MESSAGE = "auto_event_message";
  private ConfigureAutoEventDataAutoEventMessage autoEventMessage;

  public ConfigureAutoEventData() { 
  }

  public ConfigureAutoEventData autoEventMessage(ConfigureAutoEventDataAutoEventMessage autoEventMessage) {
    this.autoEventMessage = autoEventMessage;
    return this;
  }

   /**
   * Get autoEventMessage
   * @return autoEventMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_EVENT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigureAutoEventDataAutoEventMessage getAutoEventMessage() {
    return autoEventMessage;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_EVENT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoEventMessage(ConfigureAutoEventDataAutoEventMessage autoEventMessage) {
    this.autoEventMessage = autoEventMessage;
  }


  /**
   * Return true if this configureAutoEventData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureAutoEventData configureAutoEventData = (ConfigureAutoEventData) o;
    return Objects.equals(this.autoEventMessage, configureAutoEventData.autoEventMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoEventMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureAutoEventData {\n");
    sb.append("    autoEventMessage: ").append(toIndentedString(autoEventMessage)).append("\n");
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

