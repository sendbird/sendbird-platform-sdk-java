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
 * GenerateSecondaryApiTokenData
 */
@JsonPropertyOrder({
  GenerateSecondaryApiTokenData.JSON_PROPERTY_H_T_T_P_A_P_I_T_O_K_E_N
})
@JsonTypeName("generateSecondaryApiTokenData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class GenerateSecondaryApiTokenData {
  public static final String JSON_PROPERTY_H_T_T_P_A_P_I_T_O_K_E_N = "HTTP_API_TOKEN";
  private String HTTP_API_TOKEN;

  public GenerateSecondaryApiTokenData() { 
  }

  public GenerateSecondaryApiTokenData HTTP_API_TOKEN(String HTTP_API_TOKEN) {
    this.HTTP_API_TOKEN = HTTP_API_TOKEN;
    return this;
  }

   /**
   * Specifies the master API token of the application.
   * @return HTTP_API_TOKEN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the master API token of the application.")
  @JsonProperty(JSON_PROPERTY_H_T_T_P_A_P_I_T_O_K_E_N)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHTTPAPITOKEN() {
    return HTTP_API_TOKEN;
  }


  @JsonProperty(JSON_PROPERTY_H_T_T_P_A_P_I_T_O_K_E_N)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHTTPAPITOKEN(String HTTP_API_TOKEN) {
    this.HTTP_API_TOKEN = HTTP_API_TOKEN;
  }


  /**
   * Return true if this generateSecondaryApiTokenData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateSecondaryApiTokenData generateSecondaryApiTokenData = (GenerateSecondaryApiTokenData) o;
    return Objects.equals(this.HTTP_API_TOKEN, generateSecondaryApiTokenData.HTTP_API_TOKEN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(HTTP_API_TOKEN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateSecondaryApiTokenData {\n");
    sb.append("    HTTP_API_TOKEN: ").append(toIndentedString(HTTP_API_TOKEN)).append("\n");
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

