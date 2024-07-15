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
import org.openapitools.client.model.ListSecondaryApiTokensResponseApiTokensInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListSecondaryApiTokensResponse
 */
@JsonPropertyOrder({
  ListSecondaryApiTokensResponse.JSON_PROPERTY_API_TOKENS
})
@JsonTypeName("listSecondaryApiTokensResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class ListSecondaryApiTokensResponse {
  public static final String JSON_PROPERTY_API_TOKENS = "api_tokens";
  private List<ListSecondaryApiTokensResponseApiTokensInner> apiTokens = null;

  public ListSecondaryApiTokensResponse() { 
  }

  public ListSecondaryApiTokensResponse apiTokens(List<ListSecondaryApiTokensResponseApiTokensInner> apiTokens) {
    this.apiTokens = apiTokens;
    return this;
  }

  public ListSecondaryApiTokensResponse addApiTokensItem(ListSecondaryApiTokensResponseApiTokensInner apiTokensItem) {
    if (this.apiTokens == null) {
      this.apiTokens = new ArrayList<>();
    }
    this.apiTokens.add(apiTokensItem);
    return this;
  }

   /**
   * Get apiTokens
   * @return apiTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_API_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListSecondaryApiTokensResponseApiTokensInner> getApiTokens() {
    return apiTokens;
  }


  @JsonProperty(JSON_PROPERTY_API_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiTokens(List<ListSecondaryApiTokensResponseApiTokensInner> apiTokens) {
    this.apiTokens = apiTokens;
  }


  /**
   * Return true if this listSecondaryApiTokensResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSecondaryApiTokensResponse listSecondaryApiTokensResponse = (ListSecondaryApiTokensResponse) o;
    return Objects.equals(this.apiTokens, listSecondaryApiTokensResponse.apiTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSecondaryApiTokensResponse {\n");
    sb.append("    apiTokens: ").append(toIndentedString(apiTokens)).append("\n");
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

