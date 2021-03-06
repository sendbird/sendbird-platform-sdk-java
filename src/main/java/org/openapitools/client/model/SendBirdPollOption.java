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
 * SendBirdPollOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class SendBirdPollOption {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_PARTIAL_VOTERS = "partial_voters";
  @SerializedName(SERIALIZED_NAME_PARTIAL_VOTERS)
  private List<SendBirdUser> partialVoters = null;

  public static final String SERIALIZED_NAME_POLL_ID = "poll_id";
  @SerializedName(SERIALIZED_NAME_POLL_ID)
  private BigDecimal pollId;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private BigDecimal updatedAt;

  public static final String SERIALIZED_NAME_VOTE_COUNT = "vote_count";
  @SerializedName(SERIALIZED_NAME_VOTE_COUNT)
  private BigDecimal voteCount;

  public SendBirdPollOption() { 
  }

  public SendBirdPollOption createdAt(BigDecimal createdAt) {
    
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


  public SendBirdPollOption createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public SendBirdPollOption id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public SendBirdPollOption partialVoters(List<SendBirdUser> partialVoters) {
    
    this.partialVoters = partialVoters;
    return this;
  }

  public SendBirdPollOption addPartialVotersItem(SendBirdUser partialVotersItem) {
    if (this.partialVoters == null) {
      this.partialVoters = new ArrayList<>();
    }
    this.partialVoters.add(partialVotersItem);
    return this;
  }

   /**
   * Get partialVoters
   * @return partialVoters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdUser> getPartialVoters() {
    return partialVoters;
  }


  public void setPartialVoters(List<SendBirdUser> partialVoters) {
    this.partialVoters = partialVoters;
  }


  public SendBirdPollOption pollId(BigDecimal pollId) {
    
    this.pollId = pollId;
    return this;
  }

   /**
   * Get pollId
   * @return pollId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPollId() {
    return pollId;
  }


  public void setPollId(BigDecimal pollId) {
    this.pollId = pollId;
  }


  public SendBirdPollOption text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public SendBirdPollOption updatedAt(BigDecimal updatedAt) {
    
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


  public SendBirdPollOption voteCount(BigDecimal voteCount) {
    
    this.voteCount = voteCount;
    return this;
  }

   /**
   * Get voteCount
   * @return voteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getVoteCount() {
    return voteCount;
  }


  public void setVoteCount(BigDecimal voteCount) {
    this.voteCount = voteCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdPollOption sendBirdPollOption = (SendBirdPollOption) o;
    return Objects.equals(this.createdAt, sendBirdPollOption.createdAt) &&
        Objects.equals(this.createdBy, sendBirdPollOption.createdBy) &&
        Objects.equals(this.id, sendBirdPollOption.id) &&
        Objects.equals(this.partialVoters, sendBirdPollOption.partialVoters) &&
        Objects.equals(this.pollId, sendBirdPollOption.pollId) &&
        Objects.equals(this.text, sendBirdPollOption.text) &&
        Objects.equals(this.updatedAt, sendBirdPollOption.updatedAt) &&
        Objects.equals(this.voteCount, sendBirdPollOption.voteCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, id, partialVoters, pollId, text, updatedAt, voteCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdPollOption {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partialVoters: ").append(toIndentedString(partialVoters)).append("\n");
    sb.append("    pollId: ").append(toIndentedString(pollId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    voteCount: ").append(toIndentedString(voteCount)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("id");
    openapiFields.add("partial_voters");
    openapiFields.add("poll_id");
    openapiFields.add("text");
    openapiFields.add("updated_at");
    openapiFields.add("vote_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdPollOption
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdPollOption.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdPollOption is not found in the empty JSON string", SendBirdPollOption.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdPollOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdPollOption` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      JsonArray jsonArraypartialVoters = jsonObj.getAsJsonArray("partial_voters");
      if (jsonArraypartialVoters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("partial_voters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `partial_voters` to be an array in the JSON string but got `%s`", jsonObj.get("partial_voters").toString()));
        }

        // validate the optional field `partial_voters` (array)
        for (int i = 0; i < jsonArraypartialVoters.size(); i++) {
          SendBirdUser.validateJsonObject(jsonArraypartialVoters.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdPollOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdPollOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdPollOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdPollOption.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdPollOption>() {
           @Override
           public void write(JsonWriter out, SendBirdPollOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdPollOption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdPollOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdPollOption
  * @throws IOException if the JSON string is invalid with respect to SendBirdPollOption
  */
  public static SendBirdPollOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdPollOption.class);
  }

 /**
  * Convert an instance of SendBirdPollOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

