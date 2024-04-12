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
 * SetDomainFilterDataProfanityFilterRegexFiltersInner
 */
@JsonPropertyOrder({
  SetDomainFilterDataProfanityFilterRegexFiltersInner.JSON_PROPERTY_REGEX
})
@JsonTypeName("setDomainFilterData_profanity_filter_regex_filters_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class SetDomainFilterDataProfanityFilterRegexFiltersInner {
  public static final String JSON_PROPERTY_REGEX = "regex";
  private String regex;

  public SetDomainFilterDataProfanityFilterRegexFiltersInner() { 
  }

  public SetDomainFilterDataProfanityFilterRegexFiltersInner regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegex() {
    return regex;
  }


  @JsonProperty(JSON_PROPERTY_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegex(String regex) {
    this.regex = regex;
  }


  /**
   * Return true if this setDomainFilterData_profanity_filter_regex_filters_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDomainFilterDataProfanityFilterRegexFiltersInner setDomainFilterDataProfanityFilterRegexFiltersInner = (SetDomainFilterDataProfanityFilterRegexFiltersInner) o;
    return Objects.equals(this.regex, setDomainFilterDataProfanityFilterRegexFiltersInner.regex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDomainFilterDataProfanityFilterRegexFiltersInner {\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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

