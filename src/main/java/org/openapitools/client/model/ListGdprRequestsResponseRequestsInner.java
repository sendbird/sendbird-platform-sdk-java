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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListGdprRequestsResponseRequestsInner
 */
@JsonPropertyOrder({
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_REQUEST_ID,
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_ACTION,
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_STATUS,
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_USER_ID,
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_FILES,
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_USER_IDS,
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_CHANNEL_DELETE_OPTION,
  ListGdprRequestsResponseRequestsInner.JSON_PROPERTY_CREATED_AT
})
@JsonTypeName("listGdprRequestsResponse_requests_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class ListGdprRequestsResponseRequestsInner {
  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_FILES = "files";
  private ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile files;

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = null;

  public static final String JSON_PROPERTY_CHANNEL_DELETE_OPTION = "channel_delete_option";
  private String channelDeleteOption;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public ListGdprRequestsResponseRequestsInner() { 
  }

  public ListGdprRequestsResponseRequestsInner requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ListGdprRequestsResponseRequestsInner action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(String action) {
    this.action = action;
  }


  public ListGdprRequestsResponseRequestsInner status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public ListGdprRequestsResponseRequestsInner userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ListGdprRequestsResponseRequestsInner files(ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile files) {
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile getFiles() {
    return files;
  }


  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiles(ListDataExportsByMessageChannelOrUserResponseExportedDataInnerFile files) {
    this.files = files;
  }


  public ListGdprRequestsResponseRequestsInner userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public ListGdprRequestsResponseRequestsInner addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
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
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public ListGdprRequestsResponseRequestsInner channelDeleteOption(String channelDeleteOption) {
    this.channelDeleteOption = channelDeleteOption;
    return this;
  }

   /**
   * Get channelDeleteOption
   * @return channelDeleteOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_DELETE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelDeleteOption() {
    return channelDeleteOption;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_DELETE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelDeleteOption(String channelDeleteOption) {
    this.channelDeleteOption = channelDeleteOption;
  }


  public ListGdprRequestsResponseRequestsInner createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Return true if this listGdprRequestsResponse_requests_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGdprRequestsResponseRequestsInner listGdprRequestsResponseRequestsInner = (ListGdprRequestsResponseRequestsInner) o;
    return Objects.equals(this.requestId, listGdprRequestsResponseRequestsInner.requestId) &&
        Objects.equals(this.action, listGdprRequestsResponseRequestsInner.action) &&
        Objects.equals(this.status, listGdprRequestsResponseRequestsInner.status) &&
        Objects.equals(this.userId, listGdprRequestsResponseRequestsInner.userId) &&
        Objects.equals(this.files, listGdprRequestsResponseRequestsInner.files) &&
        Objects.equals(this.userIds, listGdprRequestsResponseRequestsInner.userIds) &&
        Objects.equals(this.channelDeleteOption, listGdprRequestsResponseRequestsInner.channelDeleteOption) &&
        Objects.equals(this.createdAt, listGdprRequestsResponseRequestsInner.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, action, status, userId, files, userIds, channelDeleteOption, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGdprRequestsResponseRequestsInner {\n");
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

