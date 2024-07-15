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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner
 */
@JsonPropertyOrder({
  ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.JSON_PROPERTY_ID,
  ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.JSON_PROPERTY_NAME,
  ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.JSON_PROPERTY_URL,
  ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.JSON_PROPERTY_EMOJIS
})
@JsonTypeName("listAllEmojisAndEmojiCategoriesResponse_emoji_categories_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner {
  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_EMOJIS = "emojis";
  private List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner> emojis = null;

  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner() { 
  }

  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner url(String url) {
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


  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner emojis(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner> emojis) {
    this.emojis = emojis;
    return this;
  }

  public ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner addEmojisItem(ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

   /**
   * Get emojis
   * @return emojis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMOJIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner> getEmojis() {
    return emojis;
  }


  @JsonProperty(JSON_PROPERTY_EMOJIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmojis(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner> emojis) {
    this.emojis = emojis;
  }


  /**
   * Return true if this listAllEmojisAndEmojiCategoriesResponse_emoji_categories_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner = (ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner) o;
    return Objects.equals(this.id, listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.id) &&
        Objects.equals(this.name, listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.name) &&
        Objects.equals(this.url, listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.url) &&
        Objects.equals(this.emojis, listAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner.emojis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, emojis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
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

