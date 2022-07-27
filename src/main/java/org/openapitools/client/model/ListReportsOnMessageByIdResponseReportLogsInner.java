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
import org.openapitools.client.model.SendBirdChannelResponse;
import org.openapitools.client.model.SendBirdMessageResponse;
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
 * ListReportsOnMessageByIdResponseReportLogsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:32:02.424301+01:00[Europe/London]")
public class ListReportsOnMessageByIdResponseReportLogsInner {
  public static final String SERIALIZED_NAME_REPORT_TYPE = "report_type";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private String reportType;

  public static final String SERIALIZED_NAME_REPORT_CATEGORY = "report_category";
  @SerializedName(SERIALIZED_NAME_REPORT_CATEGORY)
  private String reportCategory;

  public static final String SERIALIZED_NAME_REPORTING_USER = "reporting_user";
  @SerializedName(SERIALIZED_NAME_REPORTING_USER)
  private SendBirdUser reportingUser;

  public static final String SERIALIZED_NAME_OFFENDING_USER = "offending_user";
  @SerializedName(SERIALIZED_NAME_OFFENDING_USER)
  private SendBirdUser offendingUser;

  public static final String SERIALIZED_NAME_REPORTED_MESSAGE = "reported_message";
  @SerializedName(SERIALIZED_NAME_REPORTED_MESSAGE)
  private SendBirdMessageResponse reportedMessage;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private SendBirdChannelResponse channel;

  public static final String SERIALIZED_NAME_REPORT_DESCRIPTION = "report_description";
  @SerializedName(SERIALIZED_NAME_REPORT_DESCRIPTION)
  private String reportDescription;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public ListReportsOnMessageByIdResponseReportLogsInner() { 
  }

  public ListReportsOnMessageByIdResponseReportLogsInner reportType(String reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportType() {
    return reportType;
  }


  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  public ListReportsOnMessageByIdResponseReportLogsInner reportCategory(String reportCategory) {
    
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportCategory() {
    return reportCategory;
  }


  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }


  public ListReportsOnMessageByIdResponseReportLogsInner reportingUser(SendBirdUser reportingUser) {
    
    this.reportingUser = reportingUser;
    return this;
  }

   /**
   * Get reportingUser
   * @return reportingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getReportingUser() {
    return reportingUser;
  }


  public void setReportingUser(SendBirdUser reportingUser) {
    this.reportingUser = reportingUser;
  }


  public ListReportsOnMessageByIdResponseReportLogsInner offendingUser(SendBirdUser offendingUser) {
    
    this.offendingUser = offendingUser;
    return this;
  }

   /**
   * Get offendingUser
   * @return offendingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getOffendingUser() {
    return offendingUser;
  }


  public void setOffendingUser(SendBirdUser offendingUser) {
    this.offendingUser = offendingUser;
  }


  public ListReportsOnMessageByIdResponseReportLogsInner reportedMessage(SendBirdMessageResponse reportedMessage) {
    
    this.reportedMessage = reportedMessage;
    return this;
  }

   /**
   * Get reportedMessage
   * @return reportedMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdMessageResponse getReportedMessage() {
    return reportedMessage;
  }


  public void setReportedMessage(SendBirdMessageResponse reportedMessage) {
    this.reportedMessage = reportedMessage;
  }


  public ListReportsOnMessageByIdResponseReportLogsInner channel(SendBirdChannelResponse channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdChannelResponse getChannel() {
    return channel;
  }


  public void setChannel(SendBirdChannelResponse channel) {
    this.channel = channel;
  }


  public ListReportsOnMessageByIdResponseReportLogsInner reportDescription(String reportDescription) {
    
    this.reportDescription = reportDescription;
    return this;
  }

   /**
   * Get reportDescription
   * @return reportDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportDescription() {
    return reportDescription;
  }


  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }


  public ListReportsOnMessageByIdResponseReportLogsInner createdAt(BigDecimal createdAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListReportsOnMessageByIdResponseReportLogsInner listReportsOnMessageByIdResponseReportLogsInner = (ListReportsOnMessageByIdResponseReportLogsInner) o;
    return Objects.equals(this.reportType, listReportsOnMessageByIdResponseReportLogsInner.reportType) &&
        Objects.equals(this.reportCategory, listReportsOnMessageByIdResponseReportLogsInner.reportCategory) &&
        Objects.equals(this.reportingUser, listReportsOnMessageByIdResponseReportLogsInner.reportingUser) &&
        Objects.equals(this.offendingUser, listReportsOnMessageByIdResponseReportLogsInner.offendingUser) &&
        Objects.equals(this.reportedMessage, listReportsOnMessageByIdResponseReportLogsInner.reportedMessage) &&
        Objects.equals(this.channel, listReportsOnMessageByIdResponseReportLogsInner.channel) &&
        Objects.equals(this.reportDescription, listReportsOnMessageByIdResponseReportLogsInner.reportDescription) &&
        Objects.equals(this.createdAt, listReportsOnMessageByIdResponseReportLogsInner.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, reportCategory, reportingUser, offendingUser, reportedMessage, channel, reportDescription, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListReportsOnMessageByIdResponseReportLogsInner {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    reportingUser: ").append(toIndentedString(reportingUser)).append("\n");
    sb.append("    offendingUser: ").append(toIndentedString(offendingUser)).append("\n");
    sb.append("    reportedMessage: ").append(toIndentedString(reportedMessage)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
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
    openapiFields.add("report_type");
    openapiFields.add("report_category");
    openapiFields.add("reporting_user");
    openapiFields.add("offending_user");
    openapiFields.add("reported_message");
    openapiFields.add("channel");
    openapiFields.add("report_description");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListReportsOnMessageByIdResponseReportLogsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListReportsOnMessageByIdResponseReportLogsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListReportsOnMessageByIdResponseReportLogsInner is not found in the empty JSON string", ListReportsOnMessageByIdResponseReportLogsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListReportsOnMessageByIdResponseReportLogsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListReportsOnMessageByIdResponseReportLogsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("report_type") != null && !jsonObj.get("report_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_type").toString()));
      }
      if (jsonObj.get("report_category") != null && !jsonObj.get("report_category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_category").toString()));
      }
      // validate the optional field `reporting_user`
      if (jsonObj.getAsJsonObject("reporting_user") != null) {
        SendBirdUser.validateJsonObject(jsonObj.getAsJsonObject("reporting_user"));
      }
      // validate the optional field `offending_user`
      if (jsonObj.getAsJsonObject("offending_user") != null) {
        SendBirdUser.validateJsonObject(jsonObj.getAsJsonObject("offending_user"));
      }
      // validate the optional field `reported_message`
      if (jsonObj.getAsJsonObject("reported_message") != null) {
        SendBirdMessageResponse.validateJsonObject(jsonObj.getAsJsonObject("reported_message"));
      }
      // validate the optional field `channel`
      if (jsonObj.getAsJsonObject("channel") != null) {
        SendBirdChannelResponse.validateJsonObject(jsonObj.getAsJsonObject("channel"));
      }
      if (jsonObj.get("report_description") != null && !jsonObj.get("report_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListReportsOnMessageByIdResponseReportLogsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListReportsOnMessageByIdResponseReportLogsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListReportsOnMessageByIdResponseReportLogsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListReportsOnMessageByIdResponseReportLogsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListReportsOnMessageByIdResponseReportLogsInner>() {
           @Override
           public void write(JsonWriter out, ListReportsOnMessageByIdResponseReportLogsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListReportsOnMessageByIdResponseReportLogsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListReportsOnMessageByIdResponseReportLogsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListReportsOnMessageByIdResponseReportLogsInner
  * @throws IOException if the JSON string is invalid with respect to ListReportsOnMessageByIdResponseReportLogsInner
  */
  public static ListReportsOnMessageByIdResponseReportLogsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListReportsOnMessageByIdResponseReportLogsInner.class);
  }

 /**
  * Convert an instance of ListReportsOnMessageByIdResponseReportLogsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

