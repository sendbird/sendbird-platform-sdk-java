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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * GcViewNumberOfEachMembersUnreadMessagesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:32:02.424301+01:00[Europe/London]")
public class GcViewNumberOfEachMembersUnreadMessagesResponse {
  public static final String SERIALIZED_NAME_UNREAD = "unread";
  @SerializedName(SERIALIZED_NAME_UNREAD)
  private Map<String, BigDecimal> unread = null;

  public GcViewNumberOfEachMembersUnreadMessagesResponse() { 
  }

  public GcViewNumberOfEachMembersUnreadMessagesResponse unread(Map<String, BigDecimal> unread) {
    
    this.unread = unread;
    return this;
  }

  public GcViewNumberOfEachMembersUnreadMessagesResponse putUnreadItem(String key, BigDecimal unreadItem) {
    if (this.unread == null) {
      this.unread = new HashMap<>();
    }
    this.unread.put(key, unreadItem);
    return this;
  }

   /**
   * Get unread
   * @return unread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, BigDecimal> getUnread() {
    return unread;
  }


  public void setUnread(Map<String, BigDecimal> unread) {
    this.unread = unread;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcViewNumberOfEachMembersUnreadMessagesResponse gcViewNumberOfEachMembersUnreadMessagesResponse = (GcViewNumberOfEachMembersUnreadMessagesResponse) o;
    return Objects.equals(this.unread, gcViewNumberOfEachMembersUnreadMessagesResponse.unread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcViewNumberOfEachMembersUnreadMessagesResponse {\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
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
    openapiFields.add("unread");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcViewNumberOfEachMembersUnreadMessagesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcViewNumberOfEachMembersUnreadMessagesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcViewNumberOfEachMembersUnreadMessagesResponse is not found in the empty JSON string", GcViewNumberOfEachMembersUnreadMessagesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcViewNumberOfEachMembersUnreadMessagesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcViewNumberOfEachMembersUnreadMessagesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcViewNumberOfEachMembersUnreadMessagesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcViewNumberOfEachMembersUnreadMessagesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcViewNumberOfEachMembersUnreadMessagesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcViewNumberOfEachMembersUnreadMessagesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GcViewNumberOfEachMembersUnreadMessagesResponse>() {
           @Override
           public void write(JsonWriter out, GcViewNumberOfEachMembersUnreadMessagesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcViewNumberOfEachMembersUnreadMessagesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcViewNumberOfEachMembersUnreadMessagesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcViewNumberOfEachMembersUnreadMessagesResponse
  * @throws IOException if the JSON string is invalid with respect to GcViewNumberOfEachMembersUnreadMessagesResponse
  */
  public static GcViewNumberOfEachMembersUnreadMessagesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcViewNumberOfEachMembersUnreadMessagesResponse.class);
  }

 /**
  * Convert an instance of GcViewNumberOfEachMembersUnreadMessagesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

