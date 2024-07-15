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
 * UseDefaultEmojisResponse
 */
@JsonPropertyOrder({
  UseDefaultEmojisResponse.JSON_PROPERTY_USE_DEFAULT_EMOJI
})
@JsonTypeName("useDefaultEmojisResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class UseDefaultEmojisResponse {
  public static final String JSON_PROPERTY_USE_DEFAULT_EMOJI = "use_default_emoji";
  private Boolean useDefaultEmoji;

  public UseDefaultEmojisResponse() { 
  }

  public UseDefaultEmojisResponse useDefaultEmoji(Boolean useDefaultEmoji) {
    this.useDefaultEmoji = useDefaultEmoji;
    return this;
  }

   /**
   * Get useDefaultEmoji
   * @return useDefaultEmoji
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_DEFAULT_EMOJI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseDefaultEmoji() {
    return useDefaultEmoji;
  }


  @JsonProperty(JSON_PROPERTY_USE_DEFAULT_EMOJI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseDefaultEmoji(Boolean useDefaultEmoji) {
    this.useDefaultEmoji = useDefaultEmoji;
  }


  /**
   * Return true if this useDefaultEmojisResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseDefaultEmojisResponse useDefaultEmojisResponse = (UseDefaultEmojisResponse) o;
    return Objects.equals(this.useDefaultEmoji, useDefaultEmojisResponse.useDefaultEmoji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useDefaultEmoji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseDefaultEmojisResponse {\n");
    sb.append("    useDefaultEmoji: ").append(toIndentedString(useDefaultEmoji)).append("\n");
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

