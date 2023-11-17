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
 * ViewNumberOfDailyActiveUsersResponse
 */
@JsonPropertyOrder({
  ViewNumberOfDailyActiveUsersResponse.JSON_PROPERTY_DAU
})
@JsonTypeName("viewNumberOfDailyActiveUsersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class ViewNumberOfDailyActiveUsersResponse {
  public static final String JSON_PROPERTY_DAU = "dau";
  private BigDecimal dau;

  public ViewNumberOfDailyActiveUsersResponse() { 
  }

  public ViewNumberOfDailyActiveUsersResponse dau(BigDecimal dau) {
    this.dau = dau;
    return this;
  }

   /**
   * Get dau
   * @return dau
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDau() {
    return dau;
  }


  @JsonProperty(JSON_PROPERTY_DAU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDau(BigDecimal dau) {
    this.dau = dau;
  }


  /**
   * Return true if this viewNumberOfDailyActiveUsersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfDailyActiveUsersResponse viewNumberOfDailyActiveUsersResponse = (ViewNumberOfDailyActiveUsersResponse) o;
    return Objects.equals(this.dau, viewNumberOfDailyActiveUsersResponse.dau);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dau);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfDailyActiveUsersResponse {\n");
    sb.append("    dau: ").append(toIndentedString(dau)).append("\n");
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

