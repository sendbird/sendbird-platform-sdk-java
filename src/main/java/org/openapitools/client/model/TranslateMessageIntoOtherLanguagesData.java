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
 * TranslateMessageIntoOtherLanguagesData
 */
@JsonPropertyOrder({
  TranslateMessageIntoOtherLanguagesData.JSON_PROPERTY_TARGET_LANGS
})
@JsonTypeName("translateMessageIntoOtherLanguagesData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class TranslateMessageIntoOtherLanguagesData {
  public static final String JSON_PROPERTY_TARGET_LANGS = "target_langs";
  private List<String> targetLangs = null;

  public TranslateMessageIntoOtherLanguagesData() { 
  }

  public TranslateMessageIntoOtherLanguagesData targetLangs(List<String> targetLangs) {
    this.targetLangs = targetLangs;
    return this;
  }

  public TranslateMessageIntoOtherLanguagesData addTargetLangsItem(String targetLangsItem) {
    if (this.targetLangs == null) {
      this.targetLangs = new ArrayList<>();
    }
    this.targetLangs.add(targetLangsItem);
    return this;
  }

   /**
   * Specifies an array of one or more codes of [translation](/docs/chat/v3/platform-api/message/translations/translation-engine) to translate the message.
   * @return targetLangs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more codes of [translation](/docs/chat/v3/platform-api/message/translations/translation-engine) to translate the message.")
  @JsonProperty(JSON_PROPERTY_TARGET_LANGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTargetLangs() {
    return targetLangs;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LANGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetLangs(List<String> targetLangs) {
    this.targetLangs = targetLangs;
  }


  /**
   * Return true if this translateMessageIntoOtherLanguagesData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateMessageIntoOtherLanguagesData translateMessageIntoOtherLanguagesData = (TranslateMessageIntoOtherLanguagesData) o;
    return Objects.equals(this.targetLangs, translateMessageIntoOtherLanguagesData.targetLangs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetLangs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateMessageIntoOtherLanguagesData {\n");
    sb.append("    targetLangs: ").append(toIndentedString(targetLangs)).append("\n");
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

