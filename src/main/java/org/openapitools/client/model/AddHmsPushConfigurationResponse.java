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
import org.openapitools.client.model.AddHmsPushConfigurationResponsePushConfigurationsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddHmsPushConfigurationResponse
 */
@JsonPropertyOrder({
  AddHmsPushConfigurationResponse.JSON_PROPERTY_PUSH_CONFIGURATIONS
})
@JsonTypeName("addHmsPushConfigurationResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class AddHmsPushConfigurationResponse {
  public static final String JSON_PROPERTY_PUSH_CONFIGURATIONS = "push_configurations";
  private List<AddHmsPushConfigurationResponsePushConfigurationsInner> pushConfigurations = null;

  public AddHmsPushConfigurationResponse() { 
  }

  public AddHmsPushConfigurationResponse pushConfigurations(List<AddHmsPushConfigurationResponsePushConfigurationsInner> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
    return this;
  }

  public AddHmsPushConfigurationResponse addPushConfigurationsItem(AddHmsPushConfigurationResponsePushConfigurationsInner pushConfigurationsItem) {
    if (this.pushConfigurations == null) {
      this.pushConfigurations = new ArrayList<>();
    }
    this.pushConfigurations.add(pushConfigurationsItem);
    return this;
  }

   /**
   * Get pushConfigurations
   * @return pushConfigurations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddHmsPushConfigurationResponsePushConfigurationsInner> getPushConfigurations() {
    return pushConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushConfigurations(List<AddHmsPushConfigurationResponsePushConfigurationsInner> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
  }


  /**
   * Return true if this addHmsPushConfigurationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHmsPushConfigurationResponse addHmsPushConfigurationResponse = (AddHmsPushConfigurationResponse) o;
    return Objects.equals(this.pushConfigurations, addHmsPushConfigurationResponse.pushConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHmsPushConfigurationResponse {\n");
    sb.append("    pushConfigurations: ").append(toIndentedString(pushConfigurations)).append("\n");
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

