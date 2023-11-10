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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ViewNumberOfPeakConnectionsResponsePeakConnectionsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ViewNumberOfPeakConnectionsResponse
 */
@JsonPropertyOrder({
  ViewNumberOfPeakConnectionsResponse.JSON_PROPERTY_PEAK_CONNECTIONS
})
@JsonTypeName("viewNumberOfPeakConnectionsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class ViewNumberOfPeakConnectionsResponse {
  public static final String JSON_PROPERTY_PEAK_CONNECTIONS = "peak_connections";
  private List<ViewNumberOfPeakConnectionsResponsePeakConnectionsInner> peakConnections = null;

  public ViewNumberOfPeakConnectionsResponse() { 
  }

  public ViewNumberOfPeakConnectionsResponse peakConnections(List<ViewNumberOfPeakConnectionsResponsePeakConnectionsInner> peakConnections) {
    this.peakConnections = peakConnections;
    return this;
  }

  public ViewNumberOfPeakConnectionsResponse addPeakConnectionsItem(ViewNumberOfPeakConnectionsResponsePeakConnectionsInner peakConnectionsItem) {
    if (this.peakConnections == null) {
      this.peakConnections = new ArrayList<>();
    }
    this.peakConnections.add(peakConnectionsItem);
    return this;
  }

   /**
   * Get peakConnections
   * @return peakConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PEAK_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ViewNumberOfPeakConnectionsResponsePeakConnectionsInner> getPeakConnections() {
    return peakConnections;
  }


  @JsonProperty(JSON_PROPERTY_PEAK_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeakConnections(List<ViewNumberOfPeakConnectionsResponsePeakConnectionsInner> peakConnections) {
    this.peakConnections = peakConnections;
  }


  /**
   * Return true if this viewNumberOfPeakConnectionsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewNumberOfPeakConnectionsResponse viewNumberOfPeakConnectionsResponse = (ViewNumberOfPeakConnectionsResponse) o;
    return Objects.equals(this.peakConnections, viewNumberOfPeakConnectionsResponse.peakConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peakConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewNumberOfPeakConnectionsResponse {\n");
    sb.append("    peakConnections: ").append(toIndentedString(peakConnections)).append("\n");
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

