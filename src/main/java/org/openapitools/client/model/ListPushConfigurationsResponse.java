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
import org.openapitools.client.model.ListPushConfigurationsResponsePushConfigurationsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListPushConfigurationsResponse
 */
@JsonPropertyOrder({
  ListPushConfigurationsResponse.JSON_PROPERTY_PUSH_CONFIGURATIONS
})
@JsonTypeName("listPushConfigurationsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class ListPushConfigurationsResponse {
  public static final String JSON_PROPERTY_PUSH_CONFIGURATIONS = "push_configurations";
  private List<ListPushConfigurationsResponsePushConfigurationsInner> pushConfigurations = null;

  public ListPushConfigurationsResponse() { 
  }

  public ListPushConfigurationsResponse pushConfigurations(List<ListPushConfigurationsResponsePushConfigurationsInner> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
    return this;
  }

  public ListPushConfigurationsResponse addPushConfigurationsItem(ListPushConfigurationsResponsePushConfigurationsInner pushConfigurationsItem) {
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

  public List<ListPushConfigurationsResponsePushConfigurationsInner> getPushConfigurations() {
    return pushConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushConfigurations(List<ListPushConfigurationsResponsePushConfigurationsInner> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
  }


  /**
   * Return true if this listPushConfigurationsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushConfigurationsResponse listPushConfigurationsResponse = (ListPushConfigurationsResponse) o;
    return Objects.equals(this.pushConfigurations, listPushConfigurationsResponse.pushConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushConfigurationsResponse {\n");
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

