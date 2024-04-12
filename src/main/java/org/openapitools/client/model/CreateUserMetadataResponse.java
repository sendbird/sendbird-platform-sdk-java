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
 * CreateUserMetadataResponse
 */
@JsonPropertyOrder({
  CreateUserMetadataResponse.JSON_PROPERTY_ANY_OF
})
@JsonTypeName("createUserMetadataResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class CreateUserMetadataResponse {
  public static final String JSON_PROPERTY_ANY_OF = "anyOf";
  private String anyOf;

  public CreateUserMetadataResponse() { 
  }

  public CreateUserMetadataResponse anyOf(String anyOf) {
    this.anyOf = anyOf;
    return this;
  }

   /**
   * Get anyOf
   * @return anyOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANY_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnyOf() {
    return anyOf;
  }


  @JsonProperty(JSON_PROPERTY_ANY_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnyOf(String anyOf) {
    this.anyOf = anyOf;
  }


  /**
   * Return true if this createUserMetadataResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserMetadataResponse createUserMetadataResponse = (CreateUserMetadataResponse) o;
    return Objects.equals(this.anyOf, createUserMetadataResponse.anyOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserMetadataResponse {\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
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

