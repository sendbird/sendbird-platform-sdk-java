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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcViewNumberOfEachMembersUnreadMessagesResponse
 */
@JsonPropertyOrder({
  GcViewNumberOfEachMembersUnreadMessagesResponse.JSON_PROPERTY_UNREAD
})
@JsonTypeName("gcViewNumberOfEachMembersUnreadMessagesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class GcViewNumberOfEachMembersUnreadMessagesResponse {
  public static final String JSON_PROPERTY_UNREAD = "unread";
  private Map<String, BigDecimal> unread = null;

  public GcViewNumberOfEachMembersUnreadMessagesResponse() { 
  }

  public GcViewNumberOfEachMembersUnreadMessagesResponse unread(Map<String, BigDecimal> unread) {
    this.unread = unread;
    return this;
  }

  public GcViewNumberOfEachMembersUnreadMessagesResponse putUnreadItem(String key, BigDecimal unreadItem) {
    if (this.unread == null) {
      this.unread = new HashMap<>();
    }
    this.unread.put(key, unreadItem);
    return this;
  }

   /**
   * Get unread
   * @return unread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, BigDecimal> getUnread() {
    return unread;
  }


  @JsonProperty(JSON_PROPERTY_UNREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnread(Map<String, BigDecimal> unread) {
    this.unread = unread;
  }


  /**
   * Return true if this gcViewNumberOfEachMembersUnreadMessagesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcViewNumberOfEachMembersUnreadMessagesResponse gcViewNumberOfEachMembersUnreadMessagesResponse = (GcViewNumberOfEachMembersUnreadMessagesResponse) o;
    return Objects.equals(this.unread, gcViewNumberOfEachMembersUnreadMessagesResponse.unread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcViewNumberOfEachMembersUnreadMessagesResponse {\n");
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
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

