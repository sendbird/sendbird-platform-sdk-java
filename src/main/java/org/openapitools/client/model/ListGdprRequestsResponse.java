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
import org.openapitools.client.model.ListGdprRequestsResponseRequestsInner;

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
 * ListGdprRequestsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:32:02.424301+01:00[Europe/London]")
public class ListGdprRequestsResponse {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<ListGdprRequestsResponseRequestsInner> requests = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public ListGdprRequestsResponse() { 
  }

  public ListGdprRequestsResponse requests(List<ListGdprRequestsResponseRequestsInner> requests) {
    
    this.requests = requests;
    return this;
  }

  public ListGdprRequestsResponse addRequestsItem(ListGdprRequestsResponseRequestsInner requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListGdprRequestsResponseRequestsInner> getRequests() {
    return requests;
  }


  public void setRequests(List<ListGdprRequestsResponseRequestsInner> requests) {
    this.requests = requests;
  }


  public ListGdprRequestsResponse next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGdprRequestsResponse listGdprRequestsResponse = (ListGdprRequestsResponse) o;
    return Objects.equals(this.requests, listGdprRequestsResponse.requests) &&
        Objects.equals(this.next, listGdprRequestsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGdprRequestsResponse {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("requests");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListGdprRequestsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListGdprRequestsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListGdprRequestsResponse is not found in the empty JSON string", ListGdprRequestsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListGdprRequestsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListGdprRequestsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayrequests = jsonObj.getAsJsonArray("requests");
      if (jsonArrayrequests != null) {
        // ensure the json data is an array
        if (!jsonObj.get("requests").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
        }

        // validate the optional field `requests` (array)
        for (int i = 0; i < jsonArrayrequests.size(); i++) {
          ListGdprRequestsResponseRequestsInner.validateJsonObject(jsonArrayrequests.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("next") != null && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListGdprRequestsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListGdprRequestsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListGdprRequestsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListGdprRequestsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListGdprRequestsResponse>() {
           @Override
           public void write(JsonWriter out, ListGdprRequestsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListGdprRequestsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListGdprRequestsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListGdprRequestsResponse
  * @throws IOException if the JSON string is invalid with respect to ListGdprRequestsResponse
  */
  public static ListGdprRequestsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListGdprRequestsResponse.class);
  }

 /**
  * Convert an instance of ListGdprRequestsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

