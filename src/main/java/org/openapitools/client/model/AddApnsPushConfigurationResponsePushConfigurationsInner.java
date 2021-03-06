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
 * AddApnsPushConfigurationResponsePushConfigurationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class AddApnsPushConfigurationResponsePushConfigurationsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PUSH_TYPE = "push_type";
  @SerializedName(SERIALIZED_NAME_PUSH_TYPE)
  private String pushType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_APNS_CER_ENV_TYPE = "apns_cer_env_type";
  @SerializedName(SERIALIZED_NAME_APNS_CER_ENV_TYPE)
  private String apnsCerEnvType;

  public static final String SERIALIZED_NAME_APNS_EXPIRATION = "apns_expiration";
  @SerializedName(SERIALIZED_NAME_APNS_EXPIRATION)
  private BigDecimal apnsExpiration;

  public static final String SERIALIZED_NAME_APNS_NAME = "apns_name";
  @SerializedName(SERIALIZED_NAME_APNS_NAME)
  private String apnsName;

  public static final String SERIALIZED_NAME_HAS_UNREAD_COUNT_BADGE = "has_unread_count_badge";
  @SerializedName(SERIALIZED_NAME_HAS_UNREAD_COUNT_BADGE)
  private BigDecimal hasUnreadCountBadge;

  public static final String SERIALIZED_NAME_CONTENT_AVAILABLE = "content_available";
  @SerializedName(SERIALIZED_NAME_CONTENT_AVAILABLE)
  private Boolean contentAvailable;

  public static final String SERIALIZED_NAME_MUTABLE_CONTENT = "mutable_content";
  @SerializedName(SERIALIZED_NAME_MUTABLE_CONTENT)
  private Boolean mutableContent;

  public static final String SERIALIZED_NAME_PUSH_SOUND = "push_sound";
  @SerializedName(SERIALIZED_NAME_PUSH_SOUND)
  private String pushSound;

  public AddApnsPushConfigurationResponsePushConfigurationsInner() { 
  }

  public AddApnsPushConfigurationResponsePushConfigurationsInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner pushType(String pushType) {
    
    this.pushType = pushType;
    return this;
  }

   /**
   * Get pushType
   * @return pushType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushType() {
    return pushType;
  }


  public void setPushType(String pushType) {
    this.pushType = pushType;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner createdAt(BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner apnsCerEnvType(String apnsCerEnvType) {
    
    this.apnsCerEnvType = apnsCerEnvType;
    return this;
  }

   /**
   * Get apnsCerEnvType
   * @return apnsCerEnvType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApnsCerEnvType() {
    return apnsCerEnvType;
  }


  public void setApnsCerEnvType(String apnsCerEnvType) {
    this.apnsCerEnvType = apnsCerEnvType;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner apnsExpiration(BigDecimal apnsExpiration) {
    
    this.apnsExpiration = apnsExpiration;
    return this;
  }

   /**
   * Get apnsExpiration
   * @return apnsExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getApnsExpiration() {
    return apnsExpiration;
  }


  public void setApnsExpiration(BigDecimal apnsExpiration) {
    this.apnsExpiration = apnsExpiration;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner apnsName(String apnsName) {
    
    this.apnsName = apnsName;
    return this;
  }

   /**
   * Get apnsName
   * @return apnsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApnsName() {
    return apnsName;
  }


  public void setApnsName(String apnsName) {
    this.apnsName = apnsName;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner hasUnreadCountBadge(BigDecimal hasUnreadCountBadge) {
    
    this.hasUnreadCountBadge = hasUnreadCountBadge;
    return this;
  }

   /**
   * Get hasUnreadCountBadge
   * @return hasUnreadCountBadge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getHasUnreadCountBadge() {
    return hasUnreadCountBadge;
  }


  public void setHasUnreadCountBadge(BigDecimal hasUnreadCountBadge) {
    this.hasUnreadCountBadge = hasUnreadCountBadge;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner contentAvailable(Boolean contentAvailable) {
    
    this.contentAvailable = contentAvailable;
    return this;
  }

   /**
   * Get contentAvailable
   * @return contentAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getContentAvailable() {
    return contentAvailable;
  }


  public void setContentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner mutableContent(Boolean mutableContent) {
    
    this.mutableContent = mutableContent;
    return this;
  }

   /**
   * Get mutableContent
   * @return mutableContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMutableContent() {
    return mutableContent;
  }


  public void setMutableContent(Boolean mutableContent) {
    this.mutableContent = mutableContent;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner pushSound(String pushSound) {
    
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPushSound() {
    return pushSound;
  }


  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddApnsPushConfigurationResponsePushConfigurationsInner addApnsPushConfigurationResponsePushConfigurationsInner = (AddApnsPushConfigurationResponsePushConfigurationsInner) o;
    return Objects.equals(this.id, addApnsPushConfigurationResponsePushConfigurationsInner.id) &&
        Objects.equals(this.pushType, addApnsPushConfigurationResponsePushConfigurationsInner.pushType) &&
        Objects.equals(this.createdAt, addApnsPushConfigurationResponsePushConfigurationsInner.createdAt) &&
        Objects.equals(this.apnsCerEnvType, addApnsPushConfigurationResponsePushConfigurationsInner.apnsCerEnvType) &&
        Objects.equals(this.apnsExpiration, addApnsPushConfigurationResponsePushConfigurationsInner.apnsExpiration) &&
        Objects.equals(this.apnsName, addApnsPushConfigurationResponsePushConfigurationsInner.apnsName) &&
        Objects.equals(this.hasUnreadCountBadge, addApnsPushConfigurationResponsePushConfigurationsInner.hasUnreadCountBadge) &&
        Objects.equals(this.contentAvailable, addApnsPushConfigurationResponsePushConfigurationsInner.contentAvailable) &&
        Objects.equals(this.mutableContent, addApnsPushConfigurationResponsePushConfigurationsInner.mutableContent) &&
        Objects.equals(this.pushSound, addApnsPushConfigurationResponsePushConfigurationsInner.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pushType, createdAt, apnsCerEnvType, apnsExpiration, apnsName, hasUnreadCountBadge, contentAvailable, mutableContent, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddApnsPushConfigurationResponsePushConfigurationsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pushType: ").append(toIndentedString(pushType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    apnsCerEnvType: ").append(toIndentedString(apnsCerEnvType)).append("\n");
    sb.append("    apnsExpiration: ").append(toIndentedString(apnsExpiration)).append("\n");
    sb.append("    apnsName: ").append(toIndentedString(apnsName)).append("\n");
    sb.append("    hasUnreadCountBadge: ").append(toIndentedString(hasUnreadCountBadge)).append("\n");
    sb.append("    contentAvailable: ").append(toIndentedString(contentAvailable)).append("\n");
    sb.append("    mutableContent: ").append(toIndentedString(mutableContent)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("push_type");
    openapiFields.add("created_at");
    openapiFields.add("apns_cer_env_type");
    openapiFields.add("apns_expiration");
    openapiFields.add("apns_name");
    openapiFields.add("has_unread_count_badge");
    openapiFields.add("content_available");
    openapiFields.add("mutable_content");
    openapiFields.add("push_sound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddApnsPushConfigurationResponsePushConfigurationsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddApnsPushConfigurationResponsePushConfigurationsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddApnsPushConfigurationResponsePushConfigurationsInner is not found in the empty JSON string", AddApnsPushConfigurationResponsePushConfigurationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddApnsPushConfigurationResponsePushConfigurationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddApnsPushConfigurationResponsePushConfigurationsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("push_type") != null && !jsonObj.get("push_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_type").toString()));
      }
      if (jsonObj.get("apns_cer_env_type") != null && !jsonObj.get("apns_cer_env_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apns_cer_env_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apns_cer_env_type").toString()));
      }
      if (jsonObj.get("apns_name") != null && !jsonObj.get("apns_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apns_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apns_name").toString()));
      }
      if (jsonObj.get("push_sound") != null && !jsonObj.get("push_sound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push_sound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push_sound").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddApnsPushConfigurationResponsePushConfigurationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddApnsPushConfigurationResponsePushConfigurationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddApnsPushConfigurationResponsePushConfigurationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddApnsPushConfigurationResponsePushConfigurationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AddApnsPushConfigurationResponsePushConfigurationsInner>() {
           @Override
           public void write(JsonWriter out, AddApnsPushConfigurationResponsePushConfigurationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddApnsPushConfigurationResponsePushConfigurationsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddApnsPushConfigurationResponsePushConfigurationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddApnsPushConfigurationResponsePushConfigurationsInner
  * @throws IOException if the JSON string is invalid with respect to AddApnsPushConfigurationResponsePushConfigurationsInner
  */
  public static AddApnsPushConfigurationResponsePushConfigurationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddApnsPushConfigurationResponsePushConfigurationsInner.class);
  }

 /**
  * Convert an instance of AddApnsPushConfigurationResponsePushConfigurationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

