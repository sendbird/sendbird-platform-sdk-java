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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ModelFile
 */
@JsonPropertyOrder({
  ModelFile.JSON_PROPERTY_LAST_MODIFIED,
  ModelFile.JSON_PROPERTY_NAME,
  ModelFile.JSON_PROPERTY_SIZE,
  ModelFile.JSON_PROPERTY_TYPE,
  ModelFile.JSON_PROPERTY_WEBKIT_RELATIVE_PATH
})
@JsonTypeName("File")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class ModelFile {
  public static final String JSON_PROPERTY_LAST_MODIFIED = "last_modified";
  private BigDecimal lastModified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIZE = "size";
  private BigDecimal size;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_WEBKIT_RELATIVE_PATH = "webkit_relative_path";
  private String webkitRelativePath;

  public ModelFile() { 
  }

  public ModelFile lastModified(BigDecimal lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(BigDecimal lastModified) {
    this.lastModified = lastModified;
  }


  public ModelFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ModelFile size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public ModelFile type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ModelFile webkitRelativePath(String webkitRelativePath) {
    this.webkitRelativePath = webkitRelativePath;
    return this;
  }

   /**
   * Get webkitRelativePath
   * @return webkitRelativePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBKIT_RELATIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebkitRelativePath() {
    return webkitRelativePath;
  }


  @JsonProperty(JSON_PROPERTY_WEBKIT_RELATIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebkitRelativePath(String webkitRelativePath) {
    this.webkitRelativePath = webkitRelativePath;
  }


  /**
   * Return true if this File object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFile _file = (ModelFile) o;
    return Objects.equals(this.lastModified, _file.lastModified) &&
        Objects.equals(this.name, _file.name) &&
        Objects.equals(this.size, _file.size) &&
        Objects.equals(this.type, _file.type) &&
        Objects.equals(this.webkitRelativePath, _file.webkitRelativePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, name, size, type, webkitRelativePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFile {\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    webkitRelativePath: ").append(toIndentedString(webkitRelativePath)).append("\n");
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

