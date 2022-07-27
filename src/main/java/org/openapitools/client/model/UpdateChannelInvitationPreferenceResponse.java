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
 * UpdateChannelInvitationPreferenceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:32:02.424301+01:00[Europe/London]")
public class UpdateChannelInvitationPreferenceResponse {
  public static final String SERIALIZED_NAME_AUTO_ACCEPT = "auto_accept";
  @SerializedName(SERIALIZED_NAME_AUTO_ACCEPT)
  private Boolean autoAccept;

  public UpdateChannelInvitationPreferenceResponse() { 
  }

  public UpdateChannelInvitationPreferenceResponse autoAccept(Boolean autoAccept) {
    
    this.autoAccept = autoAccept;
    return this;
  }

   /**
   * Get autoAccept
   * @return autoAccept
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoAccept() {
    return autoAccept;
  }


  public void setAutoAccept(Boolean autoAccept) {
    this.autoAccept = autoAccept;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelInvitationPreferenceResponse updateChannelInvitationPreferenceResponse = (UpdateChannelInvitationPreferenceResponse) o;
    return Objects.equals(this.autoAccept, updateChannelInvitationPreferenceResponse.autoAccept);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAccept);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelInvitationPreferenceResponse {\n");
    sb.append("    autoAccept: ").append(toIndentedString(autoAccept)).append("\n");
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
    openapiFields.add("auto_accept");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateChannelInvitationPreferenceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateChannelInvitationPreferenceResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateChannelInvitationPreferenceResponse is not found in the empty JSON string", UpdateChannelInvitationPreferenceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateChannelInvitationPreferenceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateChannelInvitationPreferenceResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateChannelInvitationPreferenceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateChannelInvitationPreferenceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateChannelInvitationPreferenceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateChannelInvitationPreferenceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateChannelInvitationPreferenceResponse>() {
           @Override
           public void write(JsonWriter out, UpdateChannelInvitationPreferenceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateChannelInvitationPreferenceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateChannelInvitationPreferenceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateChannelInvitationPreferenceResponse
  * @throws IOException if the JSON string is invalid with respect to UpdateChannelInvitationPreferenceResponse
  */
  public static UpdateChannelInvitationPreferenceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateChannelInvitationPreferenceResponse.class);
  }

 /**
  * Convert an instance of UpdateChannelInvitationPreferenceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

