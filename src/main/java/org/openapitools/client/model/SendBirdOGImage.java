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
 * SendBirdOGImage
 */
@JsonPropertyOrder({
  SendBirdOGImage.JSON_PROPERTY_ALT,
  SendBirdOGImage.JSON_PROPERTY_HEIGHT,
  SendBirdOGImage.JSON_PROPERTY_SECURE_URL,
  SendBirdOGImage.JSON_PROPERTY_TYPE,
  SendBirdOGImage.JSON_PROPERTY_URL,
  SendBirdOGImage.JSON_PROPERTY_WIDTH
})
@JsonTypeName("SendBird.OGImage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class SendBirdOGImage {
  public static final String JSON_PROPERTY_ALT = "alt";
  private String alt;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private BigDecimal height;

  public static final String JSON_PROPERTY_SECURE_URL = "secure_url";
  private String secureUrl;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private BigDecimal width;

  public SendBirdOGImage() { 
  }

  public SendBirdOGImage alt(String alt) {
    this.alt = alt;
    return this;
  }

   /**
   * Get alt
   * @return alt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlt() {
    return alt;
  }


  @JsonProperty(JSON_PROPERTY_ALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlt(String alt) {
    this.alt = alt;
  }


  public SendBirdOGImage height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public SendBirdOGImage secureUrl(String secureUrl) {
    this.secureUrl = secureUrl;
    return this;
  }

   /**
   * Get secureUrl
   * @return secureUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecureUrl() {
    return secureUrl;
  }


  @JsonProperty(JSON_PROPERTY_SECURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecureUrl(String secureUrl) {
    this.secureUrl = secureUrl;
  }


  public SendBirdOGImage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public SendBirdOGImage url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public SendBirdOGImage width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  /**
   * Return true if this SendBird.OGImage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdOGImage sendBirdOGImage = (SendBirdOGImage) o;
    return Objects.equals(this.alt, sendBirdOGImage.alt) &&
        Objects.equals(this.height, sendBirdOGImage.height) &&
        Objects.equals(this.secureUrl, sendBirdOGImage.secureUrl) &&
        Objects.equals(this.type, sendBirdOGImage.type) &&
        Objects.equals(this.url, sendBirdOGImage.url) &&
        Objects.equals(this.width, sendBirdOGImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, height, secureUrl, type, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdOGImage {\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    secureUrl: ").append(toIndentedString(secureUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

