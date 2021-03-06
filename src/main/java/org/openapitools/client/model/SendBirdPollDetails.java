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
import org.openapitools.client.model.SendBirdPollOption;

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
 * SendBirdPollDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class SendBirdPollDetails {
  public static final String SERIALIZED_NAME_ALLOW_MULTIPLE_VOTES = "allow_multiple_votes";
  @SerializedName(SERIALIZED_NAME_ALLOW_MULTIPLE_VOTES)
  private Boolean allowMultipleVotes;

  public static final String SERIALIZED_NAME_ALLOW_USER_SUGGESTION = "allow_user_suggestion";
  @SerializedName(SERIALIZED_NAME_ALLOW_USER_SUGGESTION)
  private Boolean allowUserSuggestion;

  public static final String SERIALIZED_NAME_CLOSE_AT = "close_at";
  @SerializedName(SERIALIZED_NAME_CLOSE_AT)
  private BigDecimal closeAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_IS_ANONYMOUS = "is_anonymous";
  @SerializedName(SERIALIZED_NAME_IS_ANONYMOUS)
  private Boolean isAnonymous;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<SendBirdPollOption> options = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CLOSED("closed"),
    
    OPEN("open"),
    
    REMOVED("removed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private BigDecimal updatedAt;

  public static final String SERIALIZED_NAME_VOTER_COUNT = "voter_count";
  @SerializedName(SERIALIZED_NAME_VOTER_COUNT)
  private BigDecimal voterCount;

  public SendBirdPollDetails() { 
  }

  public SendBirdPollDetails allowMultipleVotes(Boolean allowMultipleVotes) {
    
    this.allowMultipleVotes = allowMultipleVotes;
    return this;
  }

   /**
   * Get allowMultipleVotes
   * @return allowMultipleVotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowMultipleVotes() {
    return allowMultipleVotes;
  }


  public void setAllowMultipleVotes(Boolean allowMultipleVotes) {
    this.allowMultipleVotes = allowMultipleVotes;
  }


  public SendBirdPollDetails allowUserSuggestion(Boolean allowUserSuggestion) {
    
    this.allowUserSuggestion = allowUserSuggestion;
    return this;
  }

   /**
   * Get allowUserSuggestion
   * @return allowUserSuggestion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowUserSuggestion() {
    return allowUserSuggestion;
  }


  public void setAllowUserSuggestion(Boolean allowUserSuggestion) {
    this.allowUserSuggestion = allowUserSuggestion;
  }


  public SendBirdPollDetails closeAt(BigDecimal closeAt) {
    
    this.closeAt = closeAt;
    return this;
  }

   /**
   * Get closeAt
   * @return closeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCloseAt() {
    return closeAt;
  }


  public void setCloseAt(BigDecimal closeAt) {
    this.closeAt = closeAt;
  }


  public SendBirdPollDetails createdAt(BigDecimal createdAt) {
    
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


  public SendBirdPollDetails createdBy(String createdBy) {
    
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


  public SendBirdPollDetails isAnonymous(Boolean isAnonymous) {
    
    this.isAnonymous = isAnonymous;
    return this;
  }

   /**
   * Get isAnonymous
   * @return isAnonymous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAnonymous() {
    return isAnonymous;
  }


  public void setIsAnonymous(Boolean isAnonymous) {
    this.isAnonymous = isAnonymous;
  }


  public SendBirdPollDetails options(List<SendBirdPollOption> options) {
    
    this.options = options;
    return this;
  }

  public SendBirdPollDetails addOptionsItem(SendBirdPollOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SendBirdPollOption> getOptions() {
    return options;
  }


  public void setOptions(List<SendBirdPollOption> options) {
    this.options = options;
  }


  public SendBirdPollDetails status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SendBirdPollDetails updatedAt(BigDecimal updatedAt) {
    
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


  public SendBirdPollDetails voterCount(BigDecimal voterCount) {
    
    this.voterCount = voterCount;
    return this;
  }

   /**
   * Get voterCount
   * @return voterCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getVoterCount() {
    return voterCount;
  }


  public void setVoterCount(BigDecimal voterCount) {
    this.voterCount = voterCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdPollDetails sendBirdPollDetails = (SendBirdPollDetails) o;
    return Objects.equals(this.allowMultipleVotes, sendBirdPollDetails.allowMultipleVotes) &&
        Objects.equals(this.allowUserSuggestion, sendBirdPollDetails.allowUserSuggestion) &&
        Objects.equals(this.closeAt, sendBirdPollDetails.closeAt) &&
        Objects.equals(this.createdAt, sendBirdPollDetails.createdAt) &&
        Objects.equals(this.createdBy, sendBirdPollDetails.createdBy) &&
        Objects.equals(this.isAnonymous, sendBirdPollDetails.isAnonymous) &&
        Objects.equals(this.options, sendBirdPollDetails.options) &&
        Objects.equals(this.status, sendBirdPollDetails.status) &&
        Objects.equals(this.updatedAt, sendBirdPollDetails.updatedAt) &&
        Objects.equals(this.voterCount, sendBirdPollDetails.voterCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMultipleVotes, allowUserSuggestion, closeAt, createdAt, createdBy, isAnonymous, options, status, updatedAt, voterCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdPollDetails {\n");
    sb.append("    allowMultipleVotes: ").append(toIndentedString(allowMultipleVotes)).append("\n");
    sb.append("    allowUserSuggestion: ").append(toIndentedString(allowUserSuggestion)).append("\n");
    sb.append("    closeAt: ").append(toIndentedString(closeAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    isAnonymous: ").append(toIndentedString(isAnonymous)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    voterCount: ").append(toIndentedString(voterCount)).append("\n");
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
    openapiFields.add("allow_multiple_votes");
    openapiFields.add("allow_user_suggestion");
    openapiFields.add("close_at");
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("is_anonymous");
    openapiFields.add("options");
    openapiFields.add("status");
    openapiFields.add("updated_at");
    openapiFields.add("voter_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdPollDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdPollDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdPollDetails is not found in the empty JSON string", SendBirdPollDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdPollDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdPollDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
      if (jsonArrayoptions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("options").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
        }

        // validate the optional field `options` (array)
        for (int i = 0; i < jsonArrayoptions.size(); i++) {
          SendBirdPollOption.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdPollDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdPollDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdPollDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdPollDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdPollDetails>() {
           @Override
           public void write(JsonWriter out, SendBirdPollDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdPollDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdPollDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdPollDetails
  * @throws IOException if the JSON string is invalid with respect to SendBirdPollDetails
  */
  public static SendBirdPollDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdPollDetails.class);
  }

 /**
  * Convert an instance of SendBirdPollDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

