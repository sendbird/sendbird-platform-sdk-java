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
 * ListMessagesResponseMessagesInnerOgTagOgImage
 */
@JsonPropertyOrder({
  ListMessagesResponseMessagesInnerOgTagOgImage.JSON_PROPERTY_URL,
  ListMessagesResponseMessagesInnerOgTagOgImage.JSON_PROPERTY_SECURE_URL,
  ListMessagesResponseMessagesInnerOgTagOgImage.JSON_PROPERTY_WIDTH,
  ListMessagesResponseMessagesInnerOgTagOgImage.JSON_PROPERTY_HEIGHT
})
@JsonTypeName("listMessagesResponse_messages_inner_og_tag_og_image")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class ListMessagesResponseMessagesInnerOgTagOgImage {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_SECURE_URL = "secure_url";
  private String secureUrl;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private BigDecimal width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private BigDecimal height;

  public ListMessagesResponseMessagesInnerOgTagOgImage() { 
  }

  public ListMessagesResponseMessagesInnerOgTagOgImage url(String url) {
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


  public ListMessagesResponseMessagesInnerOgTagOgImage secureUrl(String secureUrl) {
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


  public ListMessagesResponseMessagesInnerOgTagOgImage width(BigDecimal width) {
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


  public ListMessagesResponseMessagesInnerOgTagOgImage height(BigDecimal height) {
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


  /**
   * Return true if this listMessagesResponse_messages_inner_og_tag_og_image object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMessagesResponseMessagesInnerOgTagOgImage listMessagesResponseMessagesInnerOgTagOgImage = (ListMessagesResponseMessagesInnerOgTagOgImage) o;
    return Objects.equals(this.url, listMessagesResponseMessagesInnerOgTagOgImage.url) &&
        Objects.equals(this.secureUrl, listMessagesResponseMessagesInnerOgTagOgImage.secureUrl) &&
        Objects.equals(this.width, listMessagesResponseMessagesInnerOgTagOgImage.width) &&
        Objects.equals(this.height, listMessagesResponseMessagesInnerOgTagOgImage.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secureUrl, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessagesResponseMessagesInnerOgTagOgImage {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secureUrl: ").append(toIndentedString(secureUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

