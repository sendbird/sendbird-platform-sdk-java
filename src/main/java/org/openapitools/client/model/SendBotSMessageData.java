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
 * SendBotSMessageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:32:02.424301+01:00[Europe/London]")
public class SendBotSMessageData {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_SEND_PUSH = "send_push";
  @SerializedName(SERIALIZED_NAME_SEND_PUSH)
  private Boolean sendPush;

  public static final String SERIALIZED_NAME_MENTIONED = "mentioned";
  @SerializedName(SERIALIZED_NAME_MENTIONED)
  private List<String> mentioned = null;

  public static final String SERIALIZED_NAME_MARK_AS_READ = "mark_as_read";
  @SerializedName(SERIALIZED_NAME_MARK_AS_READ)
  private Boolean markAsRead;

  public static final String SERIALIZED_NAME_DEDUP_ID = "dedup_id";
  @SerializedName(SERIALIZED_NAME_DEDUP_ID)
  private String dedupId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public SendBotSMessageData() { 
  }

  public SendBotSMessageData message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Specifies the content of the message sent by the bot.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the content of the message sent by the bot.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SendBotSMessageData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel where the message is sent to.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel where the message is sent to.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public SendBotSMessageData customType(String customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.")

  public String getCustomType() {
    return customType;
  }


  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public SendBotSMessageData data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional message information such as custom font size, font type or `JSON` formatted string.")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public SendBotSMessageData sendPush(Boolean sendPush) {
    
    this.sendPush = sendPush;
    return this;
  }

   /**
   * Determines whether to send a push notification for the message to the members of the channel (Default: true)
   * @return sendPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to send a push notification for the message to the members of the channel (Default: true)")

  public Boolean getSendPush() {
    return sendPush;
  }


  public void setSendPush(Boolean sendPush) {
    this.sendPush = sendPush;
  }


  public SendBotSMessageData mentioned(List<String> mentioned) {
    
    this.mentioned = mentioned;
    return this;
  }

  public SendBotSMessageData addMentionedItem(String mentionedItem) {
    if (this.mentioned == null) {
      this.mentioned = new ArrayList<>();
    }
    this.mentioned.add(mentionedItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of the users who get a notification for the message.
   * @return mentioned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of the users who get a notification for the message.")

  public List<String> getMentioned() {
    return mentioned;
  }


  public void setMentioned(List<String> mentioned) {
    this.mentioned = mentioned;
  }


  public SendBotSMessageData markAsRead(Boolean markAsRead) {
    
    this.markAsRead = markAsRead;
    return this;
  }

   /**
   * Determines whether to mark the message as read for the bot. If set to false, the bot&#39;s unread_count and read_receipt remain unchanged after the message is sent. (Default: true)
   * @return markAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to mark the message as read for the bot. If set to false, the bot's unread_count and read_receipt remain unchanged after the message is sent. (Default: true)")

  public Boolean getMarkAsRead() {
    return markAsRead;
  }


  public void setMarkAsRead(Boolean markAsRead) {
    this.markAsRead = markAsRead;
  }


  public SendBotSMessageData dedupId(String dedupId) {
    
    this.dedupId = dedupId;
    return this;
  }

   /**
   * Specifies the unique ID for the message to prevent the same message data from getting sent to the channel.
   * @return dedupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID for the message to prevent the same message data from getting sent to the channel.")

  public String getDedupId() {
    return dedupId;
  }


  public void setDedupId(String dedupId) {
    this.dedupId = dedupId;
  }


  public SendBotSMessageData createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Specifies the time that the message was sent, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time that the message was sent, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBotSMessageData sendBotSMessageData = (SendBotSMessageData) o;
    return Objects.equals(this.message, sendBotSMessageData.message) &&
        Objects.equals(this.channelUrl, sendBotSMessageData.channelUrl) &&
        Objects.equals(this.customType, sendBotSMessageData.customType) &&
        Objects.equals(this.data, sendBotSMessageData.data) &&
        Objects.equals(this.sendPush, sendBotSMessageData.sendPush) &&
        Objects.equals(this.mentioned, sendBotSMessageData.mentioned) &&
        Objects.equals(this.markAsRead, sendBotSMessageData.markAsRead) &&
        Objects.equals(this.dedupId, sendBotSMessageData.dedupId) &&
        Objects.equals(this.createdAt, sendBotSMessageData.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, channelUrl, customType, data, sendPush, mentioned, markAsRead, dedupId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBotSMessageData {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sendPush: ").append(toIndentedString(sendPush)).append("\n");
    sb.append("    mentioned: ").append(toIndentedString(mentioned)).append("\n");
    sb.append("    markAsRead: ").append(toIndentedString(markAsRead)).append("\n");
    sb.append("    dedupId: ").append(toIndentedString(dedupId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("channel_url");
    openapiFields.add("custom_type");
    openapiFields.add("data");
    openapiFields.add("send_push");
    openapiFields.add("mentioned");
    openapiFields.add("mark_as_read");
    openapiFields.add("dedup_id");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("channel_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBotSMessageData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBotSMessageData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBotSMessageData is not found in the empty JSON string", SendBotSMessageData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBotSMessageData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBotSMessageData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SendBotSMessageData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      if (jsonObj.get("custom_type") != null && !jsonObj.get("custom_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_type").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("mentioned") != null && !jsonObj.get("mentioned").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mentioned` to be an array in the JSON string but got `%s`", jsonObj.get("mentioned").toString()));
      }
      if (jsonObj.get("dedup_id") != null && !jsonObj.get("dedup_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dedup_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dedup_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBotSMessageData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBotSMessageData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBotSMessageData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBotSMessageData.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBotSMessageData>() {
           @Override
           public void write(JsonWriter out, SendBotSMessageData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBotSMessageData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBotSMessageData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBotSMessageData
  * @throws IOException if the JSON string is invalid with respect to SendBotSMessageData
  */
  public static SendBotSMessageData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBotSMessageData.class);
  }

 /**
  * Convert an instance of SendBotSMessageData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

