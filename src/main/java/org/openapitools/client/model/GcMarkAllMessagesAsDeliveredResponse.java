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
 * GcMarkAllMessagesAsDeliveredResponse
 */
@JsonPropertyOrder({
  GcMarkAllMessagesAsDeliveredResponse.JSON_PROPERTY_TS
})
@JsonTypeName("gcMarkAllMessagesAsDeliveredResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class GcMarkAllMessagesAsDeliveredResponse {
  public static final String JSON_PROPERTY_TS = "ts";
  private BigDecimal ts;

  public GcMarkAllMessagesAsDeliveredResponse() { 
  }

  public GcMarkAllMessagesAsDeliveredResponse ts(BigDecimal ts) {
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTs() {
    return ts;
  }


  @JsonProperty(JSON_PROPERTY_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTs(BigDecimal ts) {
    this.ts = ts;
  }


  /**
   * Return true if this gcMarkAllMessagesAsDeliveredResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcMarkAllMessagesAsDeliveredResponse gcMarkAllMessagesAsDeliveredResponse = (GcMarkAllMessagesAsDeliveredResponse) o;
    return Objects.equals(this.ts, gcMarkAllMessagesAsDeliveredResponse.ts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcMarkAllMessagesAsDeliveredResponse {\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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

