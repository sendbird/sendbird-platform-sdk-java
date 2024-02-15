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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdateUserMetadataResponse
 */
@JsonPropertyOrder({
  UpdateUserMetadataResponse.JSON_PROPERTY_METADATA,
  UpdateUserMetadataResponse.JSON_PROPERTY_UPSERT
})
@JsonTypeName("updateUserMetadataResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class UpdateUserMetadataResponse {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_UPSERT = "upsert";
  private Boolean upsert;

  public UpdateUserMetadataResponse() { 
  }

  public UpdateUserMetadataResponse metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public UpdateUserMetadataResponse putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public UpdateUserMetadataResponse upsert(Boolean upsert) {
    this.upsert = upsert;
    return this;
  }

   /**
   * Get upsert
   * @return upsert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUpsert() {
    return upsert;
  }


  @JsonProperty(JSON_PROPERTY_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpsert(Boolean upsert) {
    this.upsert = upsert;
  }


  /**
   * Return true if this updateUserMetadataResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserMetadataResponse updateUserMetadataResponse = (UpdateUserMetadataResponse) o;
    return Objects.equals(this.metadata, updateUserMetadataResponse.metadata) &&
        Objects.equals(this.upsert, updateUserMetadataResponse.upsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, upsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserMetadataResponse {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    upsert: ").append(toIndentedString(upsert)).append("\n");
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

