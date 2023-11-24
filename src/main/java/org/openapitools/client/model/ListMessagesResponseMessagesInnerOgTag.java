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
import org.openapitools.client.model.ListMessagesResponseMessagesInnerOgTagOgImage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListMessagesResponseMessagesInnerOgTag
 */
@JsonPropertyOrder({
  ListMessagesResponseMessagesInnerOgTag.JSON_PROPERTY_OG_COLON_URL,
  ListMessagesResponseMessagesInnerOgTag.JSON_PROPERTY_OG_COLON_TITLE,
  ListMessagesResponseMessagesInnerOgTag.JSON_PROPERTY_OG_COLON_DESCRIPTION,
  ListMessagesResponseMessagesInnerOgTag.JSON_PROPERTY_OG_COLON_IMAGE
})
@JsonTypeName("listMessagesResponse_messages_inner_og_tag")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class ListMessagesResponseMessagesInnerOgTag {
  public static final String JSON_PROPERTY_OG_COLON_URL = "og:url";
  private String ogColonUrl;

  public static final String JSON_PROPERTY_OG_COLON_TITLE = "og:title";
  private String ogColonTitle;

  public static final String JSON_PROPERTY_OG_COLON_DESCRIPTION = "og:description";
  private String ogColonDescription;

  public static final String JSON_PROPERTY_OG_COLON_IMAGE = "og:image";
  private ListMessagesResponseMessagesInnerOgTagOgImage ogColonImage;

  public ListMessagesResponseMessagesInnerOgTag() { 
  }

  public ListMessagesResponseMessagesInnerOgTag ogColonUrl(String ogColonUrl) {
    this.ogColonUrl = ogColonUrl;
    return this;
  }

   /**
   * Get ogColonUrl
   * @return ogColonUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OG_COLON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOgColonUrl() {
    return ogColonUrl;
  }


  @JsonProperty(JSON_PROPERTY_OG_COLON_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOgColonUrl(String ogColonUrl) {
    this.ogColonUrl = ogColonUrl;
  }


  public ListMessagesResponseMessagesInnerOgTag ogColonTitle(String ogColonTitle) {
    this.ogColonTitle = ogColonTitle;
    return this;
  }

   /**
   * Get ogColonTitle
   * @return ogColonTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OG_COLON_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOgColonTitle() {
    return ogColonTitle;
  }


  @JsonProperty(JSON_PROPERTY_OG_COLON_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOgColonTitle(String ogColonTitle) {
    this.ogColonTitle = ogColonTitle;
  }


  public ListMessagesResponseMessagesInnerOgTag ogColonDescription(String ogColonDescription) {
    this.ogColonDescription = ogColonDescription;
    return this;
  }

   /**
   * Get ogColonDescription
   * @return ogColonDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OG_COLON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOgColonDescription() {
    return ogColonDescription;
  }


  @JsonProperty(JSON_PROPERTY_OG_COLON_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOgColonDescription(String ogColonDescription) {
    this.ogColonDescription = ogColonDescription;
  }


  public ListMessagesResponseMessagesInnerOgTag ogColonImage(ListMessagesResponseMessagesInnerOgTagOgImage ogColonImage) {
    this.ogColonImage = ogColonImage;
    return this;
  }

   /**
   * Get ogColonImage
   * @return ogColonImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OG_COLON_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListMessagesResponseMessagesInnerOgTagOgImage getOgColonImage() {
    return ogColonImage;
  }


  @JsonProperty(JSON_PROPERTY_OG_COLON_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOgColonImage(ListMessagesResponseMessagesInnerOgTagOgImage ogColonImage) {
    this.ogColonImage = ogColonImage;
  }


  /**
   * Return true if this listMessagesResponse_messages_inner_og_tag object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMessagesResponseMessagesInnerOgTag listMessagesResponseMessagesInnerOgTag = (ListMessagesResponseMessagesInnerOgTag) o;
    return Objects.equals(this.ogColonUrl, listMessagesResponseMessagesInnerOgTag.ogColonUrl) &&
        Objects.equals(this.ogColonTitle, listMessagesResponseMessagesInnerOgTag.ogColonTitle) &&
        Objects.equals(this.ogColonDescription, listMessagesResponseMessagesInnerOgTag.ogColonDescription) &&
        Objects.equals(this.ogColonImage, listMessagesResponseMessagesInnerOgTag.ogColonImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ogColonUrl, ogColonTitle, ogColonDescription, ogColonImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMessagesResponseMessagesInnerOgTag {\n");
    sb.append("    ogColonUrl: ").append(toIndentedString(ogColonUrl)).append("\n");
    sb.append("    ogColonTitle: ").append(toIndentedString(ogColonTitle)).append("\n");
    sb.append("    ogColonDescription: ").append(toIndentedString(ogColonDescription)).append("\n");
    sb.append("    ogColonImage: ").append(toIndentedString(ogColonImage)).append("\n");
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

