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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListSecondaryApiTokensResponseApiTokensInner;

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
 * ListSecondaryApiTokensResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class ListSecondaryApiTokensResponse {
  public static final String SERIALIZED_NAME_API_TOKENS = "api_tokens";
  @SerializedName(SERIALIZED_NAME_API_TOKENS)
  private List<ListSecondaryApiTokensResponseApiTokensInner> apiTokens = null;

  public ListSecondaryApiTokensResponse() { 
  }

  public ListSecondaryApiTokensResponse apiTokens(List<ListSecondaryApiTokensResponseApiTokensInner> apiTokens) {
    
    this.apiTokens = apiTokens;
    return this;
  }

  public ListSecondaryApiTokensResponse addApiTokensItem(ListSecondaryApiTokensResponseApiTokensInner apiTokensItem) {
    if (this.apiTokens == null) {
      this.apiTokens = new ArrayList<>();
    }
    this.apiTokens.add(apiTokensItem);
    return this;
  }

   /**
   * Get apiTokens
   * @return apiTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListSecondaryApiTokensResponseApiTokensInner> getApiTokens() {
    return apiTokens;
  }


  public void setApiTokens(List<ListSecondaryApiTokensResponseApiTokensInner> apiTokens) {
    this.apiTokens = apiTokens;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSecondaryApiTokensResponse listSecondaryApiTokensResponse = (ListSecondaryApiTokensResponse) o;
    return Objects.equals(this.apiTokens, listSecondaryApiTokensResponse.apiTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSecondaryApiTokensResponse {\n");
    sb.append("    apiTokens: ").append(toIndentedString(apiTokens)).append("\n");
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
    openapiFields.add("api_tokens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListSecondaryApiTokensResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListSecondaryApiTokensResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListSecondaryApiTokensResponse is not found in the empty JSON string", ListSecondaryApiTokensResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListSecondaryApiTokensResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListSecondaryApiTokensResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayapiTokens = jsonObj.getAsJsonArray("api_tokens");
      if (jsonArrayapiTokens != null) {
        // ensure the json data is an array
        if (!jsonObj.get("api_tokens").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `api_tokens` to be an array in the JSON string but got `%s`", jsonObj.get("api_tokens").toString()));
        }

        // validate the optional field `api_tokens` (array)
        for (int i = 0; i < jsonArrayapiTokens.size(); i++) {
          ListSecondaryApiTokensResponseApiTokensInner.validateJsonObject(jsonArrayapiTokens.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListSecondaryApiTokensResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListSecondaryApiTokensResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListSecondaryApiTokensResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListSecondaryApiTokensResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListSecondaryApiTokensResponse>() {
           @Override
           public void write(JsonWriter out, ListSecondaryApiTokensResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListSecondaryApiTokensResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListSecondaryApiTokensResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListSecondaryApiTokensResponse
  * @throws IOException if the JSON string is invalid with respect to ListSecondaryApiTokensResponse
  */
  public static ListSecondaryApiTokensResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListSecondaryApiTokensResponse.class);
  }

 /**
  * Convert an instance of ListSecondaryApiTokensResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

