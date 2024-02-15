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
import org.openapitools.client.model.ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ViewPushNotificationContentTemplateResponse
 */
@JsonPropertyOrder({
  ViewPushNotificationContentTemplateResponse.JSON_PROPERTY_PUSH_MESSAGE_TEMPLATES
})
@JsonTypeName("viewPushNotificationContentTemplateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class ViewPushNotificationContentTemplateResponse {
  public static final String JSON_PROPERTY_PUSH_MESSAGE_TEMPLATES = "push_message_templates";
  private List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> pushMessageTemplates = null;

  public ViewPushNotificationContentTemplateResponse() { 
  }

  public ViewPushNotificationContentTemplateResponse pushMessageTemplates(List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> pushMessageTemplates) {
    this.pushMessageTemplates = pushMessageTemplates;
    return this;
  }

  public ViewPushNotificationContentTemplateResponse addPushMessageTemplatesItem(ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner pushMessageTemplatesItem) {
    if (this.pushMessageTemplates == null) {
      this.pushMessageTemplates = new ArrayList<>();
    }
    this.pushMessageTemplates.add(pushMessageTemplatesItem);
    return this;
  }

   /**
   * Get pushMessageTemplates
   * @return pushMessageTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_MESSAGE_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> getPushMessageTemplates() {
    return pushMessageTemplates;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_MESSAGE_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushMessageTemplates(List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> pushMessageTemplates) {
    this.pushMessageTemplates = pushMessageTemplates;
  }


  /**
   * Return true if this viewPushNotificationContentTemplateResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewPushNotificationContentTemplateResponse viewPushNotificationContentTemplateResponse = (ViewPushNotificationContentTemplateResponse) o;
    return Objects.equals(this.pushMessageTemplates, viewPushNotificationContentTemplateResponse.pushMessageTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushMessageTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewPushNotificationContentTemplateResponse {\n");
    sb.append("    pushMessageTemplates: ").append(toIndentedString(pushMessageTemplates)).append("\n");
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

