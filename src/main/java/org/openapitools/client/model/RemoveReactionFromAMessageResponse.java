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
 * RemoveReactionFromAMessageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class RemoveReactionFromAMessageResponse {
  public static final String SERIALIZED_NAME_REACTION = "reaction";
  @SerializedName(SERIALIZED_NAME_REACTION)
  private String reaction;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private BigDecimal userId;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MSG_ID = "msg_id";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private BigDecimal msgId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private BigDecimal updatedAt;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public RemoveReactionFromAMessageResponse() { 
  }

  public RemoveReactionFromAMessageResponse reaction(String reaction) {
    
    this.reaction = reaction;
    return this;
  }

   /**
   * Get reaction
   * @return reaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReaction() {
    return reaction;
  }


  public void setReaction(String reaction) {
    this.reaction = reaction;
  }


  public RemoveReactionFromAMessageResponse userId(BigDecimal userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getUserId() {
    return userId;
  }


  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }


  public RemoveReactionFromAMessageResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public RemoveReactionFromAMessageResponse msgId(BigDecimal msgId) {
    
    this.msgId = msgId;
    return this;
  }

   /**
   * Get msgId
   * @return msgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMsgId() {
    return msgId;
  }


  public void setMsgId(BigDecimal msgId) {
    this.msgId = msgId;
  }


  public RemoveReactionFromAMessageResponse updatedAt(BigDecimal updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(BigDecimal updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RemoveReactionFromAMessageResponse operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveReactionFromAMessageResponse removeReactionFromAMessageResponse = (RemoveReactionFromAMessageResponse) o;
    return Objects.equals(this.reaction, removeReactionFromAMessageResponse.reaction) &&
        Objects.equals(this.userId, removeReactionFromAMessageResponse.userId) &&
        Objects.equals(this.success, removeReactionFromAMessageResponse.success) &&
        Objects.equals(this.msgId, removeReactionFromAMessageResponse.msgId) &&
        Objects.equals(this.updatedAt, removeReactionFromAMessageResponse.updatedAt) &&
        Objects.equals(this.operation, removeReactionFromAMessageResponse.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reaction, userId, success, msgId, updatedAt, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveReactionFromAMessageResponse {\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("reaction");
    openapiFields.add("user_id");
    openapiFields.add("success");
    openapiFields.add("msg_id");
    openapiFields.add("updated_at");
    openapiFields.add("operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RemoveReactionFromAMessageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RemoveReactionFromAMessageResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemoveReactionFromAMessageResponse is not found in the empty JSON string", RemoveReactionFromAMessageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RemoveReactionFromAMessageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemoveReactionFromAMessageResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("reaction") != null && !jsonObj.get("reaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reaction").toString()));
      }
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemoveReactionFromAMessageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemoveReactionFromAMessageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemoveReactionFromAMessageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemoveReactionFromAMessageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RemoveReactionFromAMessageResponse>() {
           @Override
           public void write(JsonWriter out, RemoveReactionFromAMessageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemoveReactionFromAMessageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RemoveReactionFromAMessageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemoveReactionFromAMessageResponse
  * @throws IOException if the JSON string is invalid with respect to RemoveReactionFromAMessageResponse
  */
  public static RemoveReactionFromAMessageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemoveReactionFromAMessageResponse.class);
  }

 /**
  * Convert an instance of RemoveReactionFromAMessageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

