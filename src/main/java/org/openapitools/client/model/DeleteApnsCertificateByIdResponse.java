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
 * DeleteApnsCertificateByIdResponse
 */
@JsonPropertyOrder({
  DeleteApnsCertificateByIdResponse.JSON_PROPERTY_PUSH_CONFIGURATIONS
})
@JsonTypeName("deleteApnsCertificateByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
public class DeleteApnsCertificateByIdResponse {
  public static final String JSON_PROPERTY_PUSH_CONFIGURATIONS = "push_configurations";
  private List<String> pushConfigurations = null;

  public DeleteApnsCertificateByIdResponse() { 
  }

  public DeleteApnsCertificateByIdResponse pushConfigurations(List<String> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
    return this;
  }

  public DeleteApnsCertificateByIdResponse addPushConfigurationsItem(String pushConfigurationsItem) {
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

  public List<String> getPushConfigurations() {
    return pushConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushConfigurations(List<String> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
  }


  /**
   * Return true if this deleteApnsCertificateByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteApnsCertificateByIdResponse deleteApnsCertificateByIdResponse = (DeleteApnsCertificateByIdResponse) o;
    return Objects.equals(this.pushConfigurations, deleteApnsCertificateByIdResponse.pushConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteApnsCertificateByIdResponse {\n");
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

