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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ViewNumberOfConcurrentConnectionsResponse
 */
@JsonPropertyOrder({
  ViewNumberOfConcurrentConnectionsResponse.JSON_PROPERTY_CCU
})
@JsonTypeName("viewNumberOfConcurrentConnectionsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class ViewNumberOfConcurrentConnectionsResponse {
  public static final String JSON_PROPERTY_CCU = "ccu";
  private BigDecimal ccu;

  public ViewNumberOfConcurrentConnectionsResponse() { 
  }

  public ViewNumberOfConcurrentConnectionsResponse ccu(BigDecimal ccu) {
    this.ccu = ccu;
    return this;
  }

   /**
   * Get ccu
   * @return ccu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CCU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCcu() {
    return ccu;
  }


  @JsonProperty(JSON_PROPERTY_CCU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCcu(BigDecimal ccu) {
    this.ccu = ccu;
  }


  /**
   * Return true if this viewNumberOfConcurrentConnectionsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfConcurrentConnectionsResponse viewNumberOfConcurrentConnectionsResponse = (ViewNumberOfConcurrentConnectionsResponse) o;
    return Objects.equals(this.ccu, viewNumberOfConcurrentConnectionsResponse.ccu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfConcurrentConnectionsResponse {\n");
    sb.append("    ccu: ").append(toIndentedString(ccu)).append("\n");
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

