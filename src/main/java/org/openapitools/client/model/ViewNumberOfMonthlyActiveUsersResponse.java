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
 * ViewNumberOfMonthlyActiveUsersResponse
 */
@JsonPropertyOrder({
  ViewNumberOfMonthlyActiveUsersResponse.JSON_PROPERTY_MAU
})
@JsonTypeName("viewNumberOfMonthlyActiveUsersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ViewNumberOfMonthlyActiveUsersResponse {
  public static final String JSON_PROPERTY_MAU = "mau";
  private BigDecimal mau;

  public ViewNumberOfMonthlyActiveUsersResponse() { 
  }

  public ViewNumberOfMonthlyActiveUsersResponse mau(BigDecimal mau) {
    this.mau = mau;
    return this;
  }

   /**
   * Get mau
   * @return mau
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMau() {
    return mau;
  }


  @JsonProperty(JSON_PROPERTY_MAU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMau(BigDecimal mau) {
    this.mau = mau;
  }


  /**
   * Return true if this viewNumberOfMonthlyActiveUsersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfMonthlyActiveUsersResponse viewNumberOfMonthlyActiveUsersResponse = (ViewNumberOfMonthlyActiveUsersResponse) o;
    return Objects.equals(this.mau, viewNumberOfMonthlyActiveUsersResponse.mau);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mau);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfMonthlyActiveUsersResponse {\n");
    sb.append("    mau: ").append(toIndentedString(mau)).append("\n");
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

