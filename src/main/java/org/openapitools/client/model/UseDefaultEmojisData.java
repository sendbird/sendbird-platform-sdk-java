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
 * UseDefaultEmojisData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:32:02.424301+01:00[Europe/London]")
public class UseDefaultEmojisData {
  public static final String SERIALIZED_NAME_USE_DEFAULT_EMOJI = "use_default_emoji";
  @SerializedName(SERIALIZED_NAME_USE_DEFAULT_EMOJI)
  private Boolean useDefaultEmoji;

  public UseDefaultEmojisData() { 
  }

  public UseDefaultEmojisData useDefaultEmoji(Boolean useDefaultEmoji) {
    
    this.useDefaultEmoji = useDefaultEmoji;
    return this;
  }

   /**
   * Determines whether to use the 7 default emojis initially provided.
   * @return useDefaultEmoji
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to use the 7 default emojis initially provided.")

  public Boolean getUseDefaultEmoji() {
    return useDefaultEmoji;
  }


  public void setUseDefaultEmoji(Boolean useDefaultEmoji) {
    this.useDefaultEmoji = useDefaultEmoji;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseDefaultEmojisData useDefaultEmojisData = (UseDefaultEmojisData) o;
    return Objects.equals(this.useDefaultEmoji, useDefaultEmojisData.useDefaultEmoji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useDefaultEmoji);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseDefaultEmojisData {\n");
    sb.append("    useDefaultEmoji: ").append(toIndentedString(useDefaultEmoji)).append("\n");
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
    openapiFields.add("use_default_emoji");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("use_default_emoji");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UseDefaultEmojisData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UseDefaultEmojisData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UseDefaultEmojisData is not found in the empty JSON string", UseDefaultEmojisData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UseDefaultEmojisData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UseDefaultEmojisData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UseDefaultEmojisData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UseDefaultEmojisData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UseDefaultEmojisData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UseDefaultEmojisData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UseDefaultEmojisData.class));

       return (TypeAdapter<T>) new TypeAdapter<UseDefaultEmojisData>() {
           @Override
           public void write(JsonWriter out, UseDefaultEmojisData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UseDefaultEmojisData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UseDefaultEmojisData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UseDefaultEmojisData
  * @throws IOException if the JSON string is invalid with respect to UseDefaultEmojisData
  */
  public static UseDefaultEmojisData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UseDefaultEmojisData.class);
  }

 /**
  * Convert an instance of UseDefaultEmojisData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

