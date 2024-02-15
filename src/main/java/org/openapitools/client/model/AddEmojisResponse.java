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
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddEmojisResponse
 */
@JsonPropertyOrder({
  AddEmojisResponse.JSON_PROPERTY_EMOJIS
})
@JsonTypeName("addEmojisResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class AddEmojisResponse {
  public static final String JSON_PROPERTY_EMOJIS = "emojis";
  private List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner> emojis = null;

  public AddEmojisResponse() { 
  }

  public AddEmojisResponse emojis(List<ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner> emojis) {
    this.emojis = emojis;
    return this;
  }

  public AddEmojisResponse addEmojisItem(ListAllEmojisAndEmojiCategoriesResponseEmojiCategoriesInnerEmojisInner emojisItem) {
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
   * Return true if this addEmojisResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddEmojisResponse addEmojisResponse = (AddEmojisResponse) o;
    return Objects.equals(this.emojis, addEmojisResponse.emojis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEmojisResponse {\n");
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

