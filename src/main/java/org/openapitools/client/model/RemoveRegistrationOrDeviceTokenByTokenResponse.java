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
import org.openapitools.client.model.SendBirdUser;

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
 * RemoveRegistrationOrDeviceTokenByTokenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class RemoveRegistrationOrDeviceTokenByTokenResponse {
  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private List<String> token = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private SendBirdUser user;

  public RemoveRegistrationOrDeviceTokenByTokenResponse() { 
  }

  public RemoveRegistrationOrDeviceTokenByTokenResponse token(List<String> token) {
    
    this.token = token;
    return this;
  }

  public RemoveRegistrationOrDeviceTokenByTokenResponse addTokenItem(String tokenItem) {
    if (this.token == null) {
      this.token = new ArrayList<>();
    }
    this.token.add(tokenItem);
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getToken() {
    return token;
  }


  public void setToken(List<String> token) {
    this.token = token;
  }


  public RemoveRegistrationOrDeviceTokenByTokenResponse user(SendBirdUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getUser() {
    return user;
  }


  public void setUser(SendBirdUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveRegistrationOrDeviceTokenByTokenResponse removeRegistrationOrDeviceTokenByTokenResponse = (RemoveRegistrationOrDeviceTokenByTokenResponse) o;
    return Objects.equals(this.token, removeRegistrationOrDeviceTokenByTokenResponse.token) &&
        Objects.equals(this.user, removeRegistrationOrDeviceTokenByTokenResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveRegistrationOrDeviceTokenByTokenResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RemoveRegistrationOrDeviceTokenByTokenResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RemoveRegistrationOrDeviceTokenByTokenResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemoveRegistrationOrDeviceTokenByTokenResponse is not found in the empty JSON string", RemoveRegistrationOrDeviceTokenByTokenResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RemoveRegistrationOrDeviceTokenByTokenResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemoveRegistrationOrDeviceTokenByTokenResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("token") != null && !jsonObj.get("token").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be an array in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.getAsJsonObject("user") != null) {
        SendBirdUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemoveRegistrationOrDeviceTokenByTokenResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemoveRegistrationOrDeviceTokenByTokenResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemoveRegistrationOrDeviceTokenByTokenResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemoveRegistrationOrDeviceTokenByTokenResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RemoveRegistrationOrDeviceTokenByTokenResponse>() {
           @Override
           public void write(JsonWriter out, RemoveRegistrationOrDeviceTokenByTokenResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemoveRegistrationOrDeviceTokenByTokenResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RemoveRegistrationOrDeviceTokenByTokenResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemoveRegistrationOrDeviceTokenByTokenResponse
  * @throws IOException if the JSON string is invalid with respect to RemoveRegistrationOrDeviceTokenByTokenResponse
  */
  public static RemoveRegistrationOrDeviceTokenByTokenResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemoveRegistrationOrDeviceTokenByTokenResponse.class);
  }

 /**
  * Convert an instance of RemoveRegistrationOrDeviceTokenByTokenResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

