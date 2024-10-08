/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
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
import org.openapitools.client.model.SendBirdThumbnailSBObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdFile
 */
@JsonPropertyOrder({
  SendBirdFile.JSON_PROPERTY_URL,
  SendBirdFile.JSON_PROPERTY_FILE_NAME,
  SendBirdFile.JSON_PROPERTY_FILE_SIZE,
  SendBirdFile.JSON_PROPERTY_FILE_TYPE,
  SendBirdFile.JSON_PROPERTY_THUMBNAILS,
  SendBirdFile.JSON_PROPERTY_REQUIRE_AUTH
})
@JsonTypeName("SendBird.File")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class SendBirdFile {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_SIZE = "file_size";
  private BigDecimal fileSize;

  public static final String JSON_PROPERTY_FILE_TYPE = "file_type";
  private String fileType;

  public static final String JSON_PROPERTY_THUMBNAILS = "thumbnails";
  private List<SendBirdThumbnailSBObject> thumbnails = null;

  public static final String JSON_PROPERTY_REQUIRE_AUTH = "require_auth";
  private Boolean requireAuth;

  public SendBirdFile() { 
  }

  public SendBirdFile url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public SendBirdFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public SendBirdFile fileSize(BigDecimal fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(BigDecimal fileSize) {
    this.fileSize = fileSize;
  }


  public SendBirdFile fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  public SendBirdFile thumbnails(List<SendBirdThumbnailSBObject> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  public SendBirdFile addThumbnailsItem(SendBirdThumbnailSBObject thumbnailsItem) {
    if (this.thumbnails == null) {
      this.thumbnails = new ArrayList<>();
    }
    this.thumbnails.add(thumbnailsItem);
    return this;
  }

   /**
   * Get thumbnails
   * @return thumbnails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMBNAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdThumbnailSBObject> getThumbnails() {
    return thumbnails;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnails(List<SendBirdThumbnailSBObject> thumbnails) {
    this.thumbnails = thumbnails;
  }


  public SendBirdFile requireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
    return this;
  }

   /**
   * Get requireAuth
   * @return requireAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRE_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequireAuth() {
    return requireAuth;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
  }


  /**
   * Return true if this SendBird.File object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdFile sendBirdFile = (SendBirdFile) o;
    return Objects.equals(this.url, sendBirdFile.url) &&
        Objects.equals(this.fileName, sendBirdFile.fileName) &&
        Objects.equals(this.fileSize, sendBirdFile.fileSize) &&
        Objects.equals(this.fileType, sendBirdFile.fileType) &&
        Objects.equals(this.thumbnails, sendBirdFile.thumbnails) &&
        Objects.equals(this.requireAuth, sendBirdFile.requireAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, fileName, fileSize, fileType, thumbnails, requireAuth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdFile {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    requireAuth: ").append(toIndentedString(requireAuth)).append("\n");
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

