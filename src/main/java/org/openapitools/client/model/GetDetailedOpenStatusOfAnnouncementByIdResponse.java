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
import org.openapitools.client.model.GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GetDetailedOpenStatusOfAnnouncementByIdResponse
 */
@JsonPropertyOrder({
  GetDetailedOpenStatusOfAnnouncementByIdResponse.JSON_PROPERTY_OPEN_STATUS,
  GetDetailedOpenStatusOfAnnouncementByIdResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("getDetailedOpenStatusOfAnnouncementByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class GetDetailedOpenStatusOfAnnouncementByIdResponse {
  public static final String JSON_PROPERTY_OPEN_STATUS = "open_status";
  private List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> openStatus = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public GetDetailedOpenStatusOfAnnouncementByIdResponse() { 
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponse openStatus(List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> openStatus) {
    this.openStatus = openStatus;
    return this;
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponse addOpenStatusItem(GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner openStatusItem) {
    if (this.openStatus == null) {
      this.openStatus = new ArrayList<>();
    }
    this.openStatus.add(openStatusItem);
    return this;
  }

   /**
   * Get openStatus
   * @return openStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> getOpenStatus() {
    return openStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenStatus(List<GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner> openStatus) {
    this.openStatus = openStatus;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  /**
   * Return true if this getDetailedOpenStatusOfAnnouncementByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedOpenStatusOfAnnouncementByIdResponse getDetailedOpenStatusOfAnnouncementByIdResponse = (GetDetailedOpenStatusOfAnnouncementByIdResponse) o;
    return Objects.equals(this.openStatus, getDetailedOpenStatusOfAnnouncementByIdResponse.openStatus) &&
        Objects.equals(this.next, getDetailedOpenStatusOfAnnouncementByIdResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openStatus, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenStatusOfAnnouncementByIdResponse {\n");
    sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

