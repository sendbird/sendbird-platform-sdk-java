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
 * SendBirdThumbnailSize
 */
@JsonPropertyOrder({
  SendBirdThumbnailSize.JSON_PROPERTY_MAX_HEIGHT,
  SendBirdThumbnailSize.JSON_PROPERTY_MAX_WIDTH
})
@JsonTypeName("SendBird.ThumbnailSize")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class SendBirdThumbnailSize {
  public static final String JSON_PROPERTY_MAX_HEIGHT = "max_height";
  private BigDecimal maxHeight;

  public static final String JSON_PROPERTY_MAX_WIDTH = "max_width";
  private BigDecimal maxWidth;

  public SendBirdThumbnailSize() { 
  }

  public SendBirdThumbnailSize maxHeight(BigDecimal maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * Get maxHeight
   * @return maxHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxHeight() {
    return maxHeight;
  }


  @JsonProperty(JSON_PROPERTY_MAX_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxHeight(BigDecimal maxHeight) {
    this.maxHeight = maxHeight;
  }


  public SendBirdThumbnailSize maxWidth(BigDecimal maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * Get maxWidth
   * @return maxWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxWidth() {
    return maxWidth;
  }


  @JsonProperty(JSON_PROPERTY_MAX_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWidth(BigDecimal maxWidth) {
    this.maxWidth = maxWidth;
  }


  /**
   * Return true if this SendBird.ThumbnailSize object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdThumbnailSize sendBirdThumbnailSize = (SendBirdThumbnailSize) o;
    return Objects.equals(this.maxHeight, sendBirdThumbnailSize.maxHeight) &&
        Objects.equals(this.maxWidth, sendBirdThumbnailSize.maxWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxHeight, maxWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdThumbnailSize {\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
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

