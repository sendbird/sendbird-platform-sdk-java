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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ChooseWhichEventsToSubscribeToResponseWebhook
 */
@JsonPropertyOrder({
  ChooseWhichEventsToSubscribeToResponseWebhook.JSON_PROPERTY_ENABLED,
  ChooseWhichEventsToSubscribeToResponseWebhook.JSON_PROPERTY_URL,
  ChooseWhichEventsToSubscribeToResponseWebhook.JSON_PROPERTY_INCLUDE_MEMBERS,
  ChooseWhichEventsToSubscribeToResponseWebhook.JSON_PROPERTY_ENABLED_EVENTS,
  ChooseWhichEventsToSubscribeToResponseWebhook.JSON_PROPERTY_INCLUDE_UNREAD_COUNT
})
@JsonTypeName("chooseWhichEventsToSubscribeToResponse_webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class ChooseWhichEventsToSubscribeToResponseWebhook {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_INCLUDE_MEMBERS = "include_members";
  private Boolean includeMembers;

  public static final String JSON_PROPERTY_ENABLED_EVENTS = "enabled_events";
  private List<String> enabledEvents = null;

  public static final String JSON_PROPERTY_INCLUDE_UNREAD_COUNT = "include_unread_count";
  private Boolean includeUnreadCount;

  public ChooseWhichEventsToSubscribeToResponseWebhook() { 
  }

  public ChooseWhichEventsToSubscribeToResponseWebhook enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook url(String url) {
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


  public ChooseWhichEventsToSubscribeToResponseWebhook includeMembers(Boolean includeMembers) {
    this.includeMembers = includeMembers;
    return this;
  }

   /**
   * Get includeMembers
   * @return includeMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeMembers() {
    return includeMembers;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeMembers(Boolean includeMembers) {
    this.includeMembers = includeMembers;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook enabledEvents(List<String> enabledEvents) {
    this.enabledEvents = enabledEvents;
    return this;
  }

  public ChooseWhichEventsToSubscribeToResponseWebhook addEnabledEventsItem(String enabledEventsItem) {
    if (this.enabledEvents == null) {
      this.enabledEvents = new ArrayList<>();
    }
    this.enabledEvents.add(enabledEventsItem);
    return this;
  }

   /**
   * Get enabledEvents
   * @return enabledEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEnabledEvents() {
    return enabledEvents;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledEvents(List<String> enabledEvents) {
    this.enabledEvents = enabledEvents;
  }


  public ChooseWhichEventsToSubscribeToResponseWebhook includeUnreadCount(Boolean includeUnreadCount) {
    this.includeUnreadCount = includeUnreadCount;
    return this;
  }

   /**
   * Get includeUnreadCount
   * @return includeUnreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_UNREAD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeUnreadCount() {
    return includeUnreadCount;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_UNREAD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeUnreadCount(Boolean includeUnreadCount) {
    this.includeUnreadCount = includeUnreadCount;
  }


  /**
   * Return true if this chooseWhichEventsToSubscribeToResponse_webhook object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChooseWhichEventsToSubscribeToResponseWebhook chooseWhichEventsToSubscribeToResponseWebhook = (ChooseWhichEventsToSubscribeToResponseWebhook) o;
    return Objects.equals(this.enabled, chooseWhichEventsToSubscribeToResponseWebhook.enabled) &&
        Objects.equals(this.url, chooseWhichEventsToSubscribeToResponseWebhook.url) &&
        Objects.equals(this.includeMembers, chooseWhichEventsToSubscribeToResponseWebhook.includeMembers) &&
        Objects.equals(this.enabledEvents, chooseWhichEventsToSubscribeToResponseWebhook.enabledEvents) &&
        Objects.equals(this.includeUnreadCount, chooseWhichEventsToSubscribeToResponseWebhook.includeUnreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, url, includeMembers, enabledEvents, includeUnreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChooseWhichEventsToSubscribeToResponseWebhook {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    includeMembers: ").append(toIndentedString(includeMembers)).append("\n");
    sb.append("    enabledEvents: ").append(toIndentedString(enabledEvents)).append("\n");
    sb.append("    includeUnreadCount: ").append(toIndentedString(includeUnreadCount)).append("\n");
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

