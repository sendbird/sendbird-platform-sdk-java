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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddEmojisData
 */
@JsonPropertyOrder({
  AddEmojisData.JSON_PROPERTY_EMOJI_CATEGORY_ID,
  AddEmojisData.JSON_PROPERTY_EMOJIS
})
@JsonTypeName("addEmojisData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class AddEmojisData {
  public static final String JSON_PROPERTY_EMOJI_CATEGORY_ID = "emoji_category_id";
  private Integer emojiCategoryId;

  public static final String JSON_PROPERTY_EMOJIS = "emojis";
  private List<Object> emojis = new ArrayList<>();

  public AddEmojisData() { 
  }

  public AddEmojisData emojiCategoryId(Integer emojiCategoryId) {
    this.emojiCategoryId = emojiCategoryId;
    return this;
  }

   /**
   * Specifies the unique ID of the emoji category that a list of new emojis belong to.
   * @return emojiCategoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the emoji category that a list of new emojis belong to.")
  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEmojiCategoryId() {
    return emojiCategoryId;
  }


  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmojiCategoryId(Integer emojiCategoryId) {
    this.emojiCategoryId = emojiCategoryId;
  }


  public AddEmojisData emojis(List<Object> emojis) {
    this.emojis = emojis;
    return this;
  }

  public AddEmojisData addEmojisItem(Object emojisItem) {
    this.emojis.add(emojisItem);
    return this;
  }

   /**
   * Specifies a list of one or more new emojis to register.
   * @return emojis
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a list of one or more new emojis to register.")
  @JsonProperty(JSON_PROPERTY_EMOJIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getEmojis() {
    return emojis;
  }


  @JsonProperty(JSON_PROPERTY_EMOJIS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmojis(List<Object> emojis) {
    this.emojis = emojis;
  }


  /**
   * Return true if this addEmojisData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddEmojisData addEmojisData = (AddEmojisData) o;
    return Objects.equals(this.emojiCategoryId, addEmojisData.emojiCategoryId) &&
        Objects.equals(this.emojis, addEmojisData.emojis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCategoryId, emojis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEmojisData {\n");
    sb.append("    emojiCategoryId: ").append(toIndentedString(emojiCategoryId)).append("\n");
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

