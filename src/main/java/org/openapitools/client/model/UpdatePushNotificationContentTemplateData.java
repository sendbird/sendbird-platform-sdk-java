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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdatePushNotificationContentTemplateData
 */
@JsonPropertyOrder({
  UpdatePushNotificationContentTemplateData.JSON_PROPERTY_TEMPLATE_NAME,
  UpdatePushNotificationContentTemplateData.JSON_PROPERTY_TEMPLATE,
  UpdatePushNotificationContentTemplateData.JSON_PROPERTY_TEMPLATE_M_E_S_G,
  UpdatePushNotificationContentTemplateData.JSON_PROPERTY_TEMPLATE_F_I_L_E,
  UpdatePushNotificationContentTemplateData.JSON_PROPERTY_TEMPLATE_A_D_M_N
})
@JsonTypeName("updatePushNotificationContentTemplateData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class UpdatePushNotificationContentTemplateData {
  public static final String JSON_PROPERTY_TEMPLATE_NAME = "template_name";
  private String templateName;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private String template;

  public static final String JSON_PROPERTY_TEMPLATE_M_E_S_G = "template.MESG";
  private String templateMESG;

  public static final String JSON_PROPERTY_TEMPLATE_F_I_L_E = "template.FILE";
  private String templateFILE;

  public static final String JSON_PROPERTY_TEMPLATE_A_D_M_N = "template.ADMN";
  private String templateADMN;

  public UpdatePushNotificationContentTemplateData() { 
  }

  public UpdatePushNotificationContentTemplateData templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * Specifies the name of a push notification content template to update. Acceptable values are default and alternative.
   * @return templateName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a push notification content template to update. Acceptable values are default and alternative.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateName() {
    return templateName;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public UpdatePushNotificationContentTemplateData template(String template) {
    this.template = template;
    return this;
  }

   /**
   * The push notification content template of which content types to be updated and their detailed format.
   * @return template
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The push notification content template of which content types to be updated and their detailed format.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplate(String template) {
    this.template = template;
  }


  public UpdatePushNotificationContentTemplateData templateMESG(String templateMESG) {
    this.templateMESG = templateMESG;
    return this;
  }

   /**
   * Specifies a format for text messages. We support customization of two fields, which are the sender_name and message. These fields will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.
   * @return templateMESG
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a format for text messages. We support customization of two fields, which are the sender_name and message. These fields will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_M_E_S_G)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateMESG() {
    return templateMESG;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_M_E_S_G)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateMESG(String templateMESG) {
    this.templateMESG = templateMESG;
  }


  public UpdatePushNotificationContentTemplateData templateFILE(String templateFILE) {
    this.templateFILE = templateFILE;
    return this;
  }

   /**
   * Specifies a format for file messages. We support customization with variables including filename and file_type_friendly. When sending notification requests to FCM, HMS, or APNs, the filename will be replaced with the corresponding string value while the file_type_friendly will indicate the type of the file sent, such as &#x60;Audio&#x60;, &#x60;Image&#x60;, and &#x60;Video&#x60;.
   * @return templateFILE
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a format for file messages. We support customization with variables including filename and file_type_friendly. When sending notification requests to FCM, HMS, or APNs, the filename will be replaced with the corresponding string value while the file_type_friendly will indicate the type of the file sent, such as `Audio`, `Image`, and `Video`.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_F_I_L_E)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateFILE() {
    return templateFILE;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_F_I_L_E)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateFILE(String templateFILE) {
    this.templateFILE = templateFILE;
  }


  public UpdatePushNotificationContentTemplateData templateADMN(String templateADMN) {
    this.templateADMN = templateADMN;
    return this;
  }

   /**
   * Specifies a format for admin messages. We support customization of one field, which is the message. This field will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.
   * @return templateADMN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a format for admin messages. We support customization of one field, which is the message. This field will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_A_D_M_N)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateADMN() {
    return templateADMN;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_A_D_M_N)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateADMN(String templateADMN) {
    this.templateADMN = templateADMN;
  }


  /**
   * Return true if this updatePushNotificationContentTemplateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData = (UpdatePushNotificationContentTemplateData) o;
    return Objects.equals(this.templateName, updatePushNotificationContentTemplateData.templateName) &&
        Objects.equals(this.template, updatePushNotificationContentTemplateData.template) &&
        Objects.equals(this.templateMESG, updatePushNotificationContentTemplateData.templateMESG) &&
        Objects.equals(this.templateFILE, updatePushNotificationContentTemplateData.templateFILE) &&
        Objects.equals(this.templateADMN, updatePushNotificationContentTemplateData.templateADMN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, template, templateMESG, templateFILE, templateADMN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushNotificationContentTemplateData {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateMESG: ").append(toIndentedString(templateMESG)).append("\n");
    sb.append("    templateFILE: ").append(toIndentedString(templateFILE)).append("\n");
    sb.append("    templateADMN: ").append(toIndentedString(templateADMN)).append("\n");
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

