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
 * UseDefaultEmojisData
 */
@JsonPropertyOrder({
  UseDefaultEmojisData.JSON_PROPERTY_USE_DEFAULT_EMOJI
})
@JsonTypeName("useDefaultEmojisData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
public class UseDefaultEmojisData {
  public static final String JSON_PROPERTY_USE_DEFAULT_EMOJI = "use_default_emoji";
  private Boolean useDefaultEmoji;

  public UseDefaultEmojisData() { 
  }

  public UseDefaultEmojisData useDefaultEmoji(Boolean useDefaultEmoji) {
    this.useDefaultEmoji = useDefaultEmoji;
    return this;
  }

   /**
   * Determines whether to use the 7 default emojis initially provided.
   * @return useDefaultEmoji
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to use the 7 default emojis initially provided.")
  @JsonProperty(JSON_PROPERTY_USE_DEFAULT_EMOJI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUseDefaultEmoji() {
    return useDefaultEmoji;
  }


  @JsonProperty(JSON_PROPERTY_USE_DEFAULT_EMOJI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUseDefaultEmoji(Boolean useDefaultEmoji) {
    this.useDefaultEmoji = useDefaultEmoji;
  }


  /**
   * Return true if this useDefaultEmojisData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseDefaultEmojisData useDefaultEmojisData = (UseDefaultEmojisData) o;
    return Objects.equals(this.useDefaultEmoji, useDefaultEmojisData.useDefaultEmoji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useDefaultEmoji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseDefaultEmojisData {\n");
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

