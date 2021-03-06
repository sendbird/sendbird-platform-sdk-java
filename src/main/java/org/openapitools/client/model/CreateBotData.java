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
 * CreateBotData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class CreateBotData {
  public static final String SERIALIZED_NAME_BOT_USERID = "bot_userid";
  @SerializedName(SERIALIZED_NAME_BOT_USERID)
  private String botUserid;

  public static final String SERIALIZED_NAME_BOT_NICKNAME = "bot_nickname";
  @SerializedName(SERIALIZED_NAME_BOT_NICKNAME)
  private String botNickname;

  public static final String SERIALIZED_NAME_BOT_PROFILE_URL = "bot_profile_url";
  @SerializedName(SERIALIZED_NAME_BOT_PROFILE_URL)
  private String botProfileUrl;

  public static final String SERIALIZED_NAME_BOT_TYPE = "bot_type";
  @SerializedName(SERIALIZED_NAME_BOT_TYPE)
  private String botType;

  public static final String SERIALIZED_NAME_BOT_CALLBACK_URL = "bot_callback_url";
  @SerializedName(SERIALIZED_NAME_BOT_CALLBACK_URL)
  private String botCallbackUrl;

  public static final String SERIALIZED_NAME_IS_PRIVACY_MODE = "is_privacy_mode";
  @SerializedName(SERIALIZED_NAME_IS_PRIVACY_MODE)
  private Boolean isPrivacyMode;

  public static final String SERIALIZED_NAME_ENABLE_MARK_AS_READ = "enable_mark_as_read";
  @SerializedName(SERIALIZED_NAME_ENABLE_MARK_AS_READ)
  private Boolean enableMarkAsRead;

  public static final String SERIALIZED_NAME_SHOW_MEMBER = "show_member";
  @SerializedName(SERIALIZED_NAME_SHOW_MEMBER)
  private Boolean showMember;

  public static final String SERIALIZED_NAME_CHANNEL_INVITATION_PREFERENCE = "channel_invitation_preference";
  @SerializedName(SERIALIZED_NAME_CHANNEL_INVITATION_PREFERENCE)
  private Integer channelInvitationPreference;

  public CreateBotData() { 
  }

  public CreateBotData botUserid(String botUserid) {
    
    this.botUserid = botUserid;
    return this;
  }

   /**
   * Specifies the unique ID of the bot. The length is limited to 80 characters.
   * @return botUserid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the bot. The length is limited to 80 characters.")

  public String getBotUserid() {
    return botUserid;
  }


  public void setBotUserid(String botUserid) {
    this.botUserid = botUserid;
  }


  public CreateBotData botNickname(String botNickname) {
    
    this.botNickname = botNickname;
    return this;
  }

   /**
   * Specifies the bot&#39;s nickname. The length is limited to 80 characters.
   * @return botNickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the bot's nickname. The length is limited to 80 characters.")

  public String getBotNickname() {
    return botNickname;
  }


  public void setBotNickname(String botNickname) {
    this.botNickname = botNickname;
  }


  public CreateBotData botProfileUrl(String botProfileUrl) {
    
    this.botProfileUrl = botProfileUrl;
    return this;
  }

   /**
   * Specifies the URL of the bot&#39;s profile image. The size is limited to 2,048 characters.
   * @return botProfileUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the bot's profile image. The size is limited to 2,048 characters.")

  public String getBotProfileUrl() {
    return botProfileUrl;
  }


  public void setBotProfileUrl(String botProfileUrl) {
    this.botProfileUrl = botProfileUrl;
  }


  public CreateBotData botType(String botType) {
    
    this.botType = botType;
    return this;
  }

   /**
   * Specifies the type of the bot that you can specify for categorization. The length is limited to 128 characters.
   * @return botType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the bot that you can specify for categorization. The length is limited to 128 characters.")

  public String getBotType() {
    return botType;
  }


  public void setBotType(String botType) {
    this.botType = botType;
  }


  public CreateBotData botCallbackUrl(String botCallbackUrl) {
    
    this.botCallbackUrl = botCallbackUrl;
    return this;
  }

   /**
   * Specifies the server URL where bot is located to receive all events, requests, and data forwarded from an application. For security reasons, it is highly recommended that you use an SSL server. The length is limited to 1,024 characters.
   * @return botCallbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the server URL where bot is located to receive all events, requests, and data forwarded from an application. For security reasons, it is highly recommended that you use an SSL server. The length is limited to 1,024 characters.")

  public String getBotCallbackUrl() {
    return botCallbackUrl;
  }


  public void setBotCallbackUrl(String botCallbackUrl) {
    this.botCallbackUrl = botCallbackUrl;
  }


  public CreateBotData isPrivacyMode(Boolean isPrivacyMode) {
    
    this.isPrivacyMode = isPrivacyMode;
    return this;
  }

   /**
   * In the channels of where the bot is a member, determines whether to only forward the messages with the specific conditions to the bot or forword all messages to the bot, for privacy concerns. If set to true, only messages that start with a &#39;/&#39; or mention the bot_userid are forwarded to the bot. If set to false, all messages are forwarded.
   * @return isPrivacyMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "In the channels of where the bot is a member, determines whether to only forward the messages with the specific conditions to the bot or forword all messages to the bot, for privacy concerns. If set to true, only messages that start with a '/' or mention the bot_userid are forwarded to the bot. If set to false, all messages are forwarded.")

  public Boolean getIsPrivacyMode() {
    return isPrivacyMode;
  }


  public void setIsPrivacyMode(Boolean isPrivacyMode) {
    this.isPrivacyMode = isPrivacyMode;
  }


  public CreateBotData enableMarkAsRead(Boolean enableMarkAsRead) {
    
    this.enableMarkAsRead = enableMarkAsRead;
    return this;
  }

   /**
   * Determines whether to mark the bot&#39;s message as read upon sending it. (Default: true)
   * @return enableMarkAsRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to mark the bot's message as read upon sending it. (Default: true)")

  public Boolean getEnableMarkAsRead() {
    return enableMarkAsRead;
  }


  public void setEnableMarkAsRead(Boolean enableMarkAsRead) {
    this.enableMarkAsRead = enableMarkAsRead;
  }


  public CreateBotData showMember(Boolean showMember) {
    
    this.showMember = showMember;
    return this;
  }

   /**
   * Determines whether to include information about the members of each channel in a callback response. (Default: false)
   * @return showMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to include information about the members of each channel in a callback response. (Default: false)")

  public Boolean getShowMember() {
    return showMember;
  }


  public void setShowMember(Boolean showMember) {
    this.showMember = showMember;
  }


  public CreateBotData channelInvitationPreference(Integer channelInvitationPreference) {
    
    this.channelInvitationPreference = channelInvitationPreference;
    return this;
  }

   /**
   * Get channelInvitationPreference
   * @return channelInvitationPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChannelInvitationPreference() {
    return channelInvitationPreference;
  }


  public void setChannelInvitationPreference(Integer channelInvitationPreference) {
    this.channelInvitationPreference = channelInvitationPreference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBotData createBotData = (CreateBotData) o;
    return Objects.equals(this.botUserid, createBotData.botUserid) &&
        Objects.equals(this.botNickname, createBotData.botNickname) &&
        Objects.equals(this.botProfileUrl, createBotData.botProfileUrl) &&
        Objects.equals(this.botType, createBotData.botType) &&
        Objects.equals(this.botCallbackUrl, createBotData.botCallbackUrl) &&
        Objects.equals(this.isPrivacyMode, createBotData.isPrivacyMode) &&
        Objects.equals(this.enableMarkAsRead, createBotData.enableMarkAsRead) &&
        Objects.equals(this.showMember, createBotData.showMember) &&
        Objects.equals(this.channelInvitationPreference, createBotData.channelInvitationPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botUserid, botNickname, botProfileUrl, botType, botCallbackUrl, isPrivacyMode, enableMarkAsRead, showMember, channelInvitationPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBotData {\n");
    sb.append("    botUserid: ").append(toIndentedString(botUserid)).append("\n");
    sb.append("    botNickname: ").append(toIndentedString(botNickname)).append("\n");
    sb.append("    botProfileUrl: ").append(toIndentedString(botProfileUrl)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    botCallbackUrl: ").append(toIndentedString(botCallbackUrl)).append("\n");
    sb.append("    isPrivacyMode: ").append(toIndentedString(isPrivacyMode)).append("\n");
    sb.append("    enableMarkAsRead: ").append(toIndentedString(enableMarkAsRead)).append("\n");
    sb.append("    showMember: ").append(toIndentedString(showMember)).append("\n");
    sb.append("    channelInvitationPreference: ").append(toIndentedString(channelInvitationPreference)).append("\n");
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
    openapiFields.add("bot_userid");
    openapiFields.add("bot_nickname");
    openapiFields.add("bot_profile_url");
    openapiFields.add("bot_type");
    openapiFields.add("bot_callback_url");
    openapiFields.add("is_privacy_mode");
    openapiFields.add("enable_mark_as_read");
    openapiFields.add("show_member");
    openapiFields.add("channel_invitation_preference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bot_userid");
    openapiRequiredFields.add("bot_nickname");
    openapiRequiredFields.add("bot_profile_url");
    openapiRequiredFields.add("bot_type");
    openapiRequiredFields.add("bot_callback_url");
    openapiRequiredFields.add("is_privacy_mode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateBotData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateBotData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBotData is not found in the empty JSON string", CreateBotData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateBotData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBotData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBotData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("bot_userid") != null && !jsonObj.get("bot_userid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_userid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_userid").toString()));
      }
      if (jsonObj.get("bot_nickname") != null && !jsonObj.get("bot_nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_nickname").toString()));
      }
      if (jsonObj.get("bot_profile_url") != null && !jsonObj.get("bot_profile_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_profile_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_profile_url").toString()));
      }
      if (jsonObj.get("bot_type") != null && !jsonObj.get("bot_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_type").toString()));
      }
      if (jsonObj.get("bot_callback_url") != null && !jsonObj.get("bot_callback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bot_callback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bot_callback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBotData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBotData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBotData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBotData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBotData>() {
           @Override
           public void write(JsonWriter out, CreateBotData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBotData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBotData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBotData
  * @throws IOException if the JSON string is invalid with respect to CreateBotData
  */
  public static CreateBotData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBotData.class);
  }

 /**
  * Convert an instance of CreateBotData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

