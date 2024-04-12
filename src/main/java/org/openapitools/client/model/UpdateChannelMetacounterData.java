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
 * UpdateChannelMetacounterData
 */
@JsonPropertyOrder({
  UpdateChannelMetacounterData.JSON_PROPERTY_METACOUNTER,
  UpdateChannelMetacounterData.JSON_PROPERTY_MODE,
  UpdateChannelMetacounterData.JSON_PROPERTY_UPSERT
})
@JsonTypeName("updateChannelMetacounterData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class UpdateChannelMetacounterData {
  public static final String JSON_PROPERTY_METACOUNTER = "metacounter";
  private String metacounter;

  public static final String JSON_PROPERTY_MODE = "mode";
  private String mode;

  public static final String JSON_PROPERTY_UPSERT = "upsert";
  private Boolean upsert;

  public UpdateChannelMetacounterData() { 
  }

  public UpdateChannelMetacounterData metacounter(String metacounter) {
    this.metacounter = metacounter;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be an integer. This property can have up to 5 items.
   * @return metacounter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be an integer. This property can have up to 5 items.")
  @JsonProperty(JSON_PROPERTY_METACOUNTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetacounter() {
    return metacounter;
  }


  @JsonProperty(JSON_PROPERTY_METACOUNTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetacounter(String metacounter) {
    this.metacounter = metacounter;
  }


  public UpdateChannelMetacounterData mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Specifies how to calculate the item value of the metacounter. Acceptable values are increase, decrease, and set. If set to increase, increments the item value of the metacounter by the value specified in the metacounter property, while decrease decrements. set sets the item value to the specified value exactly. (Default: set)
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies how to calculate the item value of the metacounter. Acceptable values are increase, decrease, and set. If set to increase, increments the item value of the metacounter by the value specified in the metacounter property, while decrease decrements. set sets the item value to the specified value exactly. (Default: set)")
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(String mode) {
    this.mode = mode;
  }


  public UpdateChannelMetacounterData upsert(Boolean upsert) {
    this.upsert = upsert;
    return this;
  }

   /**
   * Get upsert
   * @return upsert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpsert() {
    return upsert;
  }


  @JsonProperty(JSON_PROPERTY_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpsert(Boolean upsert) {
    this.upsert = upsert;
  }


  /**
   * Return true if this updateChannelMetacounterData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelMetacounterData updateChannelMetacounterData = (UpdateChannelMetacounterData) o;
    return Objects.equals(this.metacounter, updateChannelMetacounterData.metacounter) &&
        Objects.equals(this.mode, updateChannelMetacounterData.mode) &&
        Objects.equals(this.upsert, updateChannelMetacounterData.upsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metacounter, mode, upsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelMetacounterData {\n");
    sb.append("    metacounter: ").append(toIndentedString(metacounter)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    upsert: ").append(toIndentedString(upsert)).append("\n");
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

