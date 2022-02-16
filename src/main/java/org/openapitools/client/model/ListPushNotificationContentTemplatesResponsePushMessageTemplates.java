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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.ListPushNotificationContentTemplatesResponseTemplate;

/**
 * ListPushNotificationContentTemplatesResponsePushMessageTemplates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T16:47:24.427118Z[Europe/London]")
public class ListPushNotificationContentTemplatesResponsePushMessageTemplates {
  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "template_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private ListPushNotificationContentTemplatesResponseTemplate template;

  public ListPushNotificationContentTemplatesResponsePushMessageTemplates() { 
  }

  public ListPushNotificationContentTemplatesResponsePushMessageTemplates templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public ListPushNotificationContentTemplatesResponsePushMessageTemplates template(ListPushNotificationContentTemplatesResponseTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListPushNotificationContentTemplatesResponseTemplate getTemplate() {
    return template;
  }


  public void setTemplate(ListPushNotificationContentTemplatesResponseTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushNotificationContentTemplatesResponsePushMessageTemplates listPushNotificationContentTemplatesResponsePushMessageTemplates = (ListPushNotificationContentTemplatesResponsePushMessageTemplates) o;
    return Objects.equals(this.templateName, listPushNotificationContentTemplatesResponsePushMessageTemplates.templateName) &&
        Objects.equals(this.template, listPushNotificationContentTemplatesResponsePushMessageTemplates.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushNotificationContentTemplatesResponsePushMessageTemplates {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

