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
 * UpdateEmojiUrlByKeyData
 */
@JsonPropertyOrder({
  UpdateEmojiUrlByKeyData.JSON_PROPERTY_EMOJI_KEY,
  UpdateEmojiUrlByKeyData.JSON_PROPERTY_URL
})
@JsonTypeName("updateEmojiUrlByKeyData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class UpdateEmojiUrlByKeyData {
  public static final String JSON_PROPERTY_EMOJI_KEY = "emoji_key";
  private String emojiKey;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public UpdateEmojiUrlByKeyData() { 
  }

  public UpdateEmojiUrlByKeyData emojiKey(String emojiKey) {
    this.emojiKey = emojiKey;
    return this;
  }

   /**
   * Specifies the key of the emoji to update.
   * @return emojiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the key of the emoji to update.")
  @JsonProperty(JSON_PROPERTY_EMOJI_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmojiKey() {
    return emojiKey;
  }


  @JsonProperty(JSON_PROPERTY_EMOJI_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmojiKey(String emojiKey) {
    this.emojiKey = emojiKey;
  }


  public UpdateEmojiUrlByKeyData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the new image URL of the emoji.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the new image URL of the emoji.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this updateEmojiUrlByKeyData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData = (UpdateEmojiUrlByKeyData) o;
    return Objects.equals(this.emojiKey, updateEmojiUrlByKeyData.emojiKey) &&
        Objects.equals(this.url, updateEmojiUrlByKeyData.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiKey, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmojiUrlByKeyData {\n");
    sb.append("    emojiKey: ").append(toIndentedString(emojiKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

