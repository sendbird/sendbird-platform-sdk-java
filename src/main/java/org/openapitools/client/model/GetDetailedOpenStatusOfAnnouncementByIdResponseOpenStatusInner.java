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
 * GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_HAS_OPENED = "has_opened";
  @SerializedName(SERIALIZED_NAME_HAS_OPENED)
  private Boolean hasOpened;

  public static final String SERIALIZED_NAME_SENT_AT = "sent_at";
  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private BigDecimal sentAt;

  public static final String SERIALIZED_NAME_OPEN_AT = "open_at";
  @SerializedName(SERIALIZED_NAME_OPEN_AT)
  private BigDecimal openAt;

  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner() { 
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Get channelUrl
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner hasOpened(Boolean hasOpened) {
    
    this.hasOpened = hasOpened;
    return this;
  }

   /**
   * Get hasOpened
   * @return hasOpened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasOpened() {
    return hasOpened;
  }


  public void setHasOpened(Boolean hasOpened) {
    this.hasOpened = hasOpened;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner sentAt(BigDecimal sentAt) {
    
    this.sentAt = sentAt;
    return this;
  }

   /**
   * Get sentAt
   * @return sentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSentAt() {
    return sentAt;
  }


  public void setSentAt(BigDecimal sentAt) {
    this.sentAt = sentAt;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner openAt(BigDecimal openAt) {
    
    this.openAt = openAt;
    return this;
  }

   /**
   * Get openAt
   * @return openAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOpenAt() {
    return openAt;
  }


  public void setOpenAt(BigDecimal openAt) {
    this.openAt = openAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner = (GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner) o;
    return Objects.equals(this.userId, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.userId) &&
        Objects.equals(this.channelUrl, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.channelUrl) &&
        Objects.equals(this.hasOpened, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.hasOpened) &&
        Objects.equals(this.sentAt, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.sentAt) &&
        Objects.equals(this.openAt, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.openAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, channelUrl, hasOpened, sentAt, openAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    hasOpened: ").append(toIndentedString(hasOpened)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    openAt: ").append(toIndentedString(openAt)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("channel_url");
    openapiFields.add("has_opened");
    openapiFields.add("sent_at");
    openapiFields.add("open_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner is not found in the empty JSON string", GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner>() {
           @Override
           public void write(JsonWriter out, GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner
  * @throws IOException if the JSON string is invalid with respect to GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner
  */
  public static GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.class);
  }

 /**
  * Convert an instance of GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

