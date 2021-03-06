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
 * ViewNumberOfUnreadItemsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class ViewNumberOfUnreadItemsResponse {
  public static final String SERIALIZED_NAME_NON_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT = "non_super_group_channel_unread_message_count";
  @SerializedName(SERIALIZED_NAME_NON_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  private BigDecimal nonSuperGroupChannelUnreadMessageCount;

  public static final String SERIALIZED_NAME_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT = "super_group_channel_unread_message_count";
  @SerializedName(SERIALIZED_NAME_SUPER_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  private BigDecimal superGroupChannelUnreadMessageCount;

  public static final String SERIALIZED_NAME_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT = "group_channel_unread_message_count";
  @SerializedName(SERIALIZED_NAME_GROUP_CHANNEL_UNREAD_MESSAGE_COUNT)
  private BigDecimal groupChannelUnreadMessageCount;

  public static final String SERIALIZED_NAME_SUPER_GROUP_CHANNEL_INVITATION_COUNT = "super_group_channel_invitation_count";
  @SerializedName(SERIALIZED_NAME_SUPER_GROUP_CHANNEL_INVITATION_COUNT)
  private BigDecimal superGroupChannelInvitationCount;

  public static final String SERIALIZED_NAME_GROUP_CHANNEL_INVITATION_COUNT = "group_channel_invitation_count";
  @SerializedName(SERIALIZED_NAME_GROUP_CHANNEL_INVITATION_COUNT)
  private BigDecimal groupChannelInvitationCount;

  public static final String SERIALIZED_NAME_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT = "super_group_channel_unread_mention_count";
  @SerializedName(SERIALIZED_NAME_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  private BigDecimal superGroupChannelUnreadMentionCount;

  public static final String SERIALIZED_NAME_GROUP_CHANNEL_UNREAD_MENTION_COUNT = "group_channel_unread_mention_count";
  @SerializedName(SERIALIZED_NAME_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  private BigDecimal groupChannelUnreadMentionCount;

  public static final String SERIALIZED_NAME_NON_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT = "non_super_group_channel_unread_mention_count";
  @SerializedName(SERIALIZED_NAME_NON_SUPER_GROUP_CHANNEL_UNREAD_MENTION_COUNT)
  private BigDecimal nonSuperGroupChannelUnreadMentionCount;

  public static final String SERIALIZED_NAME_NON_SUPER_GROUP_CHANNEL_INVITATION_COUNT = "non_super_group_channel_invitation_count";
  @SerializedName(SERIALIZED_NAME_NON_SUPER_GROUP_CHANNEL_INVITATION_COUNT)
  private BigDecimal nonSuperGroupChannelInvitationCount;

  public ViewNumberOfUnreadItemsResponse() { 
  }

  public ViewNumberOfUnreadItemsResponse nonSuperGroupChannelUnreadMessageCount(BigDecimal nonSuperGroupChannelUnreadMessageCount) {
    
    this.nonSuperGroupChannelUnreadMessageCount = nonSuperGroupChannelUnreadMessageCount;
    return this;
  }

   /**
   * Get nonSuperGroupChannelUnreadMessageCount
   * @return nonSuperGroupChannelUnreadMessageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNonSuperGroupChannelUnreadMessageCount() {
    return nonSuperGroupChannelUnreadMessageCount;
  }


  public void setNonSuperGroupChannelUnreadMessageCount(BigDecimal nonSuperGroupChannelUnreadMessageCount) {
    this.nonSuperGroupChannelUnreadMessageCount = nonSuperGroupChannelUnreadMessageCount;
  }


  public ViewNumberOfUnreadItemsResponse superGroupChannelUnreadMessageCount(BigDecimal superGroupChannelUnreadMessageCount) {
    
    this.superGroupChannelUnreadMessageCount = superGroupChannelUnreadMessageCount;
    return this;
  }

   /**
   * Get superGroupChannelUnreadMessageCount
   * @return superGroupChannelUnreadMessageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSuperGroupChannelUnreadMessageCount() {
    return superGroupChannelUnreadMessageCount;
  }


  public void setSuperGroupChannelUnreadMessageCount(BigDecimal superGroupChannelUnreadMessageCount) {
    this.superGroupChannelUnreadMessageCount = superGroupChannelUnreadMessageCount;
  }


  public ViewNumberOfUnreadItemsResponse groupChannelUnreadMessageCount(BigDecimal groupChannelUnreadMessageCount) {
    
    this.groupChannelUnreadMessageCount = groupChannelUnreadMessageCount;
    return this;
  }

   /**
   * Get groupChannelUnreadMessageCount
   * @return groupChannelUnreadMessageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getGroupChannelUnreadMessageCount() {
    return groupChannelUnreadMessageCount;
  }


  public void setGroupChannelUnreadMessageCount(BigDecimal groupChannelUnreadMessageCount) {
    this.groupChannelUnreadMessageCount = groupChannelUnreadMessageCount;
  }


  public ViewNumberOfUnreadItemsResponse superGroupChannelInvitationCount(BigDecimal superGroupChannelInvitationCount) {
    
    this.superGroupChannelInvitationCount = superGroupChannelInvitationCount;
    return this;
  }

   /**
   * Get superGroupChannelInvitationCount
   * @return superGroupChannelInvitationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSuperGroupChannelInvitationCount() {
    return superGroupChannelInvitationCount;
  }


  public void setSuperGroupChannelInvitationCount(BigDecimal superGroupChannelInvitationCount) {
    this.superGroupChannelInvitationCount = superGroupChannelInvitationCount;
  }


  public ViewNumberOfUnreadItemsResponse groupChannelInvitationCount(BigDecimal groupChannelInvitationCount) {
    
    this.groupChannelInvitationCount = groupChannelInvitationCount;
    return this;
  }

   /**
   * Get groupChannelInvitationCount
   * @return groupChannelInvitationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getGroupChannelInvitationCount() {
    return groupChannelInvitationCount;
  }


  public void setGroupChannelInvitationCount(BigDecimal groupChannelInvitationCount) {
    this.groupChannelInvitationCount = groupChannelInvitationCount;
  }


  public ViewNumberOfUnreadItemsResponse superGroupChannelUnreadMentionCount(BigDecimal superGroupChannelUnreadMentionCount) {
    
    this.superGroupChannelUnreadMentionCount = superGroupChannelUnreadMentionCount;
    return this;
  }

   /**
   * Get superGroupChannelUnreadMentionCount
   * @return superGroupChannelUnreadMentionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSuperGroupChannelUnreadMentionCount() {
    return superGroupChannelUnreadMentionCount;
  }


  public void setSuperGroupChannelUnreadMentionCount(BigDecimal superGroupChannelUnreadMentionCount) {
    this.superGroupChannelUnreadMentionCount = superGroupChannelUnreadMentionCount;
  }


  public ViewNumberOfUnreadItemsResponse groupChannelUnreadMentionCount(BigDecimal groupChannelUnreadMentionCount) {
    
    this.groupChannelUnreadMentionCount = groupChannelUnreadMentionCount;
    return this;
  }

   /**
   * Get groupChannelUnreadMentionCount
   * @return groupChannelUnreadMentionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getGroupChannelUnreadMentionCount() {
    return groupChannelUnreadMentionCount;
  }


  public void setGroupChannelUnreadMentionCount(BigDecimal groupChannelUnreadMentionCount) {
    this.groupChannelUnreadMentionCount = groupChannelUnreadMentionCount;
  }


  public ViewNumberOfUnreadItemsResponse nonSuperGroupChannelUnreadMentionCount(BigDecimal nonSuperGroupChannelUnreadMentionCount) {
    
    this.nonSuperGroupChannelUnreadMentionCount = nonSuperGroupChannelUnreadMentionCount;
    return this;
  }

   /**
   * Get nonSuperGroupChannelUnreadMentionCount
   * @return nonSuperGroupChannelUnreadMentionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNonSuperGroupChannelUnreadMentionCount() {
    return nonSuperGroupChannelUnreadMentionCount;
  }


  public void setNonSuperGroupChannelUnreadMentionCount(BigDecimal nonSuperGroupChannelUnreadMentionCount) {
    this.nonSuperGroupChannelUnreadMentionCount = nonSuperGroupChannelUnreadMentionCount;
  }


  public ViewNumberOfUnreadItemsResponse nonSuperGroupChannelInvitationCount(BigDecimal nonSuperGroupChannelInvitationCount) {
    
    this.nonSuperGroupChannelInvitationCount = nonSuperGroupChannelInvitationCount;
    return this;
  }

   /**
   * Get nonSuperGroupChannelInvitationCount
   * @return nonSuperGroupChannelInvitationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNonSuperGroupChannelInvitationCount() {
    return nonSuperGroupChannelInvitationCount;
  }


  public void setNonSuperGroupChannelInvitationCount(BigDecimal nonSuperGroupChannelInvitationCount) {
    this.nonSuperGroupChannelInvitationCount = nonSuperGroupChannelInvitationCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfUnreadItemsResponse viewNumberOfUnreadItemsResponse = (ViewNumberOfUnreadItemsResponse) o;
    return Objects.equals(this.nonSuperGroupChannelUnreadMessageCount, viewNumberOfUnreadItemsResponse.nonSuperGroupChannelUnreadMessageCount) &&
        Objects.equals(this.superGroupChannelUnreadMessageCount, viewNumberOfUnreadItemsResponse.superGroupChannelUnreadMessageCount) &&
        Objects.equals(this.groupChannelUnreadMessageCount, viewNumberOfUnreadItemsResponse.groupChannelUnreadMessageCount) &&
        Objects.equals(this.superGroupChannelInvitationCount, viewNumberOfUnreadItemsResponse.superGroupChannelInvitationCount) &&
        Objects.equals(this.groupChannelInvitationCount, viewNumberOfUnreadItemsResponse.groupChannelInvitationCount) &&
        Objects.equals(this.superGroupChannelUnreadMentionCount, viewNumberOfUnreadItemsResponse.superGroupChannelUnreadMentionCount) &&
        Objects.equals(this.groupChannelUnreadMentionCount, viewNumberOfUnreadItemsResponse.groupChannelUnreadMentionCount) &&
        Objects.equals(this.nonSuperGroupChannelUnreadMentionCount, viewNumberOfUnreadItemsResponse.nonSuperGroupChannelUnreadMentionCount) &&
        Objects.equals(this.nonSuperGroupChannelInvitationCount, viewNumberOfUnreadItemsResponse.nonSuperGroupChannelInvitationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonSuperGroupChannelUnreadMessageCount, superGroupChannelUnreadMessageCount, groupChannelUnreadMessageCount, superGroupChannelInvitationCount, groupChannelInvitationCount, superGroupChannelUnreadMentionCount, groupChannelUnreadMentionCount, nonSuperGroupChannelUnreadMentionCount, nonSuperGroupChannelInvitationCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfUnreadItemsResponse {\n");
    sb.append("    nonSuperGroupChannelUnreadMessageCount: ").append(toIndentedString(nonSuperGroupChannelUnreadMessageCount)).append("\n");
    sb.append("    superGroupChannelUnreadMessageCount: ").append(toIndentedString(superGroupChannelUnreadMessageCount)).append("\n");
    sb.append("    groupChannelUnreadMessageCount: ").append(toIndentedString(groupChannelUnreadMessageCount)).append("\n");
    sb.append("    superGroupChannelInvitationCount: ").append(toIndentedString(superGroupChannelInvitationCount)).append("\n");
    sb.append("    groupChannelInvitationCount: ").append(toIndentedString(groupChannelInvitationCount)).append("\n");
    sb.append("    superGroupChannelUnreadMentionCount: ").append(toIndentedString(superGroupChannelUnreadMentionCount)).append("\n");
    sb.append("    groupChannelUnreadMentionCount: ").append(toIndentedString(groupChannelUnreadMentionCount)).append("\n");
    sb.append("    nonSuperGroupChannelUnreadMentionCount: ").append(toIndentedString(nonSuperGroupChannelUnreadMentionCount)).append("\n");
    sb.append("    nonSuperGroupChannelInvitationCount: ").append(toIndentedString(nonSuperGroupChannelInvitationCount)).append("\n");
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
    openapiFields.add("non_super_group_channel_unread_message_count");
    openapiFields.add("super_group_channel_unread_message_count");
    openapiFields.add("group_channel_unread_message_count");
    openapiFields.add("super_group_channel_invitation_count");
    openapiFields.add("group_channel_invitation_count");
    openapiFields.add("super_group_channel_unread_mention_count");
    openapiFields.add("group_channel_unread_mention_count");
    openapiFields.add("non_super_group_channel_unread_mention_count");
    openapiFields.add("non_super_group_channel_invitation_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewNumberOfUnreadItemsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViewNumberOfUnreadItemsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewNumberOfUnreadItemsResponse is not found in the empty JSON string", ViewNumberOfUnreadItemsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewNumberOfUnreadItemsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewNumberOfUnreadItemsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewNumberOfUnreadItemsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewNumberOfUnreadItemsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewNumberOfUnreadItemsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewNumberOfUnreadItemsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewNumberOfUnreadItemsResponse>() {
           @Override
           public void write(JsonWriter out, ViewNumberOfUnreadItemsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewNumberOfUnreadItemsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewNumberOfUnreadItemsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewNumberOfUnreadItemsResponse
  * @throws IOException if the JSON string is invalid with respect to ViewNumberOfUnreadItemsResponse
  */
  public static ViewNumberOfUnreadItemsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewNumberOfUnreadItemsResponse.class);
  }

 /**
  * Convert an instance of ViewNumberOfUnreadItemsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

