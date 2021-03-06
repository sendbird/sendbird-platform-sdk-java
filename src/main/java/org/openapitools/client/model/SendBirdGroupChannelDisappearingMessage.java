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
 * SendBirdGroupChannelDisappearingMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class SendBirdGroupChannelDisappearingMessage {
  public static final String SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS = "message_survival_seconds";
  @SerializedName(SERIALIZED_NAME_MESSAGE_SURVIVAL_SECONDS)
  private BigDecimal messageSurvivalSeconds;

  public static final String SERIALIZED_NAME_IS_TRIGGERED_BY_MESSAGE_READ = "is_triggered_by_message_read";
  @SerializedName(SERIALIZED_NAME_IS_TRIGGERED_BY_MESSAGE_READ)
  private Boolean isTriggeredByMessageRead;

  public SendBirdGroupChannelDisappearingMessage() { 
  }

  public SendBirdGroupChannelDisappearingMessage messageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    
    this.messageSurvivalSeconds = messageSurvivalSeconds;
    return this;
  }

   /**
   * Get messageSurvivalSeconds
   * @return messageSurvivalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMessageSurvivalSeconds() {
    return messageSurvivalSeconds;
  }


  public void setMessageSurvivalSeconds(BigDecimal messageSurvivalSeconds) {
    this.messageSurvivalSeconds = messageSurvivalSeconds;
  }


  public SendBirdGroupChannelDisappearingMessage isTriggeredByMessageRead(Boolean isTriggeredByMessageRead) {
    
    this.isTriggeredByMessageRead = isTriggeredByMessageRead;
    return this;
  }

   /**
   * Get isTriggeredByMessageRead
   * @return isTriggeredByMessageRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsTriggeredByMessageRead() {
    return isTriggeredByMessageRead;
  }


  public void setIsTriggeredByMessageRead(Boolean isTriggeredByMessageRead) {
    this.isTriggeredByMessageRead = isTriggeredByMessageRead;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelDisappearingMessage sendBirdGroupChannelDisappearingMessage = (SendBirdGroupChannelDisappearingMessage) o;
    return Objects.equals(this.messageSurvivalSeconds, sendBirdGroupChannelDisappearingMessage.messageSurvivalSeconds) &&
        Objects.equals(this.isTriggeredByMessageRead, sendBirdGroupChannelDisappearingMessage.isTriggeredByMessageRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSurvivalSeconds, isTriggeredByMessageRead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelDisappearingMessage {\n");
    sb.append("    messageSurvivalSeconds: ").append(toIndentedString(messageSurvivalSeconds)).append("\n");
    sb.append("    isTriggeredByMessageRead: ").append(toIndentedString(isTriggeredByMessageRead)).append("\n");
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
    openapiFields.add("message_survival_seconds");
    openapiFields.add("is_triggered_by_message_read");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdGroupChannelDisappearingMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdGroupChannelDisappearingMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdGroupChannelDisappearingMessage is not found in the empty JSON string", SendBirdGroupChannelDisappearingMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdGroupChannelDisappearingMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdGroupChannelDisappearingMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdGroupChannelDisappearingMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdGroupChannelDisappearingMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdGroupChannelDisappearingMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdGroupChannelDisappearingMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdGroupChannelDisappearingMessage>() {
           @Override
           public void write(JsonWriter out, SendBirdGroupChannelDisappearingMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdGroupChannelDisappearingMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdGroupChannelDisappearingMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdGroupChannelDisappearingMessage
  * @throws IOException if the JSON string is invalid with respect to SendBirdGroupChannelDisappearingMessage
  */
  public static SendBirdGroupChannelDisappearingMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdGroupChannelDisappearingMessage.class);
  }

 /**
  * Convert an instance of SendBirdGroupChannelDisappearingMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

