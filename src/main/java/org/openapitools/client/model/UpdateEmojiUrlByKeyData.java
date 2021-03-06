/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sendbird.client.JSON;

/**
 * UpdateEmojiUrlByKeyData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class UpdateEmojiUrlByKeyData {
  public static final String SERIALIZED_NAME_EMOJI_KEY = "emoji_key";
  @SerializedName(SERIALIZED_NAME_EMOJI_KEY)
  private String emojiKey;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
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

  public String getEmojiKey() {
    return emojiKey;
  }


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

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("emoji_key");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("emoji_key");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateEmojiUrlByKeyData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateEmojiUrlByKeyData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateEmojiUrlByKeyData is not found in the empty JSON string", UpdateEmojiUrlByKeyData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateEmojiUrlByKeyData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateEmojiUrlByKeyData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateEmojiUrlByKeyData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("emoji_key") != null && !jsonObj.get("emoji_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emoji_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emoji_key").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateEmojiUrlByKeyData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateEmojiUrlByKeyData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateEmojiUrlByKeyData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateEmojiUrlByKeyData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateEmojiUrlByKeyData>() {
           @Override
           public void write(JsonWriter out, UpdateEmojiUrlByKeyData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateEmojiUrlByKeyData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateEmojiUrlByKeyData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateEmojiUrlByKeyData
  * @throws IOException if the JSON string is invalid with respect to UpdateEmojiUrlByKeyData
  */
  public static UpdateEmojiUrlByKeyData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateEmojiUrlByKeyData.class);
  }

 /**
  * Convert an instance of UpdateEmojiUrlByKeyData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

