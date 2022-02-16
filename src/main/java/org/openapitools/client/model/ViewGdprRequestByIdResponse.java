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
import org.openapitools.client.model.ListDataExportsByMessageChannelOrUserResponseFile;

/**
 * ViewGdprRequestByIdResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T16:47:24.427118Z[Europe/London]")
public class ViewGdprRequestByIdResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private ListDataExportsByMessageChannelOrUserResponseFile files;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = null;

  public static final String SERIALIZED_NAME_CHANNEL_DELETE_OPTION = "channel_delete_option";
  @SerializedName(SERIALIZED_NAME_CHANNEL_DELETE_OPTION)
  private String channelDeleteOption;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public ViewGdprRequestByIdResponse() { 
  }

  public ViewGdprRequestByIdResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ViewGdprRequestByIdResponse action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ViewGdprRequestByIdResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ViewGdprRequestByIdResponse userId(String userId) {
    
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


  public ViewGdprRequestByIdResponse files(ListDataExportsByMessageChannelOrUserResponseFile files) {
    
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListDataExportsByMessageChannelOrUserResponseFile getFiles() {
    return files;
  }


  public void setFiles(ListDataExportsByMessageChannelOrUserResponseFile files) {
    this.files = files;
  }


  public ViewGdprRequestByIdResponse userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public ViewGdprRequestByIdResponse addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<String>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public ViewGdprRequestByIdResponse channelDeleteOption(String channelDeleteOption) {
    
    this.channelDeleteOption = channelDeleteOption;
    return this;
  }

   /**
   * Get channelDeleteOption
   * @return channelDeleteOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelDeleteOption() {
    return channelDeleteOption;
  }


  public void setChannelDeleteOption(String channelDeleteOption) {
    this.channelDeleteOption = channelDeleteOption;
  }


  public ViewGdprRequestByIdResponse createdAt(BigDecimal createdAt) {
    
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
    ViewGdprRequestByIdResponse viewGdprRequestByIdResponse = (ViewGdprRequestByIdResponse) o;
    return Objects.equals(this.requestId, viewGdprRequestByIdResponse.requestId) &&
        Objects.equals(this.action, viewGdprRequestByIdResponse.action) &&
        Objects.equals(this.status, viewGdprRequestByIdResponse.status) &&
        Objects.equals(this.userId, viewGdprRequestByIdResponse.userId) &&
        Objects.equals(this.files, viewGdprRequestByIdResponse.files) &&
        Objects.equals(this.userIds, viewGdprRequestByIdResponse.userIds) &&
        Objects.equals(this.channelDeleteOption, viewGdprRequestByIdResponse.channelDeleteOption) &&
        Objects.equals(this.createdAt, viewGdprRequestByIdResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, action, status, userId, files, userIds, channelDeleteOption, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewGdprRequestByIdResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    channelDeleteOption: ").append(toIndentedString(channelDeleteOption)).append("\n");
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

}

