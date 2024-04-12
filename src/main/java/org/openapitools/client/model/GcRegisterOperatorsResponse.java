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
 * GcRegisterOperatorsResponse
 */
@JsonPropertyOrder({
  GcRegisterOperatorsResponse.JSON_PROPERTY_OPERATOR_IDS
})
@JsonTypeName("gcRegisterOperatorsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class GcRegisterOperatorsResponse {
  public static final String JSON_PROPERTY_OPERATOR_IDS = "operator_ids";
  private List<String> operatorIds = null;

  public GcRegisterOperatorsResponse() { 
  }

  public GcRegisterOperatorsResponse operatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
    return this;
  }

  public GcRegisterOperatorsResponse addOperatorIdsItem(String operatorIdsItem) {
    if (this.operatorIds == null) {
      this.operatorIds = new ArrayList<>();
    }
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Get operatorIds
   * @return operatorIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  /**
   * Return true if this gcRegisterOperatorsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcRegisterOperatorsResponse gcRegisterOperatorsResponse = (GcRegisterOperatorsResponse) o;
    return Objects.equals(this.operatorIds, gcRegisterOperatorsResponse.operatorIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcRegisterOperatorsResponse {\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
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

