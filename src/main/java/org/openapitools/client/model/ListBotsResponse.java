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
import org.openapitools.client.model.ListBotsResponseBotsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListBotsResponse
 */
@JsonPropertyOrder({
  ListBotsResponse.JSON_PROPERTY_BOTS,
  ListBotsResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("listBotsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class ListBotsResponse {
  public static final String JSON_PROPERTY_BOTS = "bots";
  private List<ListBotsResponseBotsInner> bots = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public ListBotsResponse() { 
  }

  public ListBotsResponse bots(List<ListBotsResponseBotsInner> bots) {
    this.bots = bots;
    return this;
  }

  public ListBotsResponse addBotsItem(ListBotsResponseBotsInner botsItem) {
    if (this.bots == null) {
      this.bots = new ArrayList<>();
    }
    this.bots.add(botsItem);
    return this;
  }

   /**
   * Get bots
   * @return bots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListBotsResponseBotsInner> getBots() {
    return bots;
  }


  @JsonProperty(JSON_PROPERTY_BOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBots(List<ListBotsResponseBotsInner> bots) {
    this.bots = bots;
  }


  public ListBotsResponse next(String next) {
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
   * Return true if this listBotsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBotsResponse listBotsResponse = (ListBotsResponse) o;
    return Objects.equals(this.bots, listBotsResponse.bots) &&
        Objects.equals(this.next, listBotsResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bots, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBotsResponse {\n");
    sb.append("    bots: ").append(toIndentedString(bots)).append("\n");
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

