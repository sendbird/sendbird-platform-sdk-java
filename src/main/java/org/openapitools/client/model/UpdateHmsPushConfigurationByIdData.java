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
 * UpdateHmsPushConfigurationByIdData
 */
@JsonPropertyOrder({
  UpdateHmsPushConfigurationByIdData.JSON_PROPERTY_PROVIDER_ID,
  UpdateHmsPushConfigurationByIdData.JSON_PROPERTY_HUAWEI_APP_ID,
  UpdateHmsPushConfigurationByIdData.JSON_PROPERTY_HUAWEI_APP_SECRET,
  UpdateHmsPushConfigurationByIdData.JSON_PROPERTY_PUSH_SOUND
})
@JsonTypeName("updateHmsPushConfigurationByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class UpdateHmsPushConfigurationByIdData {
  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private String providerId;

  public static final String JSON_PROPERTY_HUAWEI_APP_ID = "huawei_app_id";
  private String huaweiAppId;

  public static final String JSON_PROPERTY_HUAWEI_APP_SECRET = "huawei_app_secret";
  private String huaweiAppSecret;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public UpdateHmsPushConfigurationByIdData() { 
  }

  public UpdateHmsPushConfigurationByIdData providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Specifies the provider ID of the push configuration to update.
   * @return providerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the provider ID of the push configuration to update.")
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public UpdateHmsPushConfigurationByIdData huaweiAppId(String huaweiAppId) {
    this.huaweiAppId = huaweiAppId;
    return this;
  }

   /**
   * Specifies the unique ID of application for HMS to update.
   * @return huaweiAppId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of application for HMS to update.")
  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHuaweiAppId() {
    return huaweiAppId;
  }


  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHuaweiAppId(String huaweiAppId) {
    this.huaweiAppId = huaweiAppId;
  }


  public UpdateHmsPushConfigurationByIdData huaweiAppSecret(String huaweiAppSecret) {
    this.huaweiAppSecret = huaweiAppSecret;
    return this;
  }

   /**
   * Specifies the secret key of the application to update.
   * @return huaweiAppSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the secret key of the application to update.")
  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHuaweiAppSecret() {
    return huaweiAppSecret;
  }


  @JsonProperty(JSON_PROPERTY_HUAWEI_APP_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHuaweiAppSecret(String huaweiAppSecret) {
    this.huaweiAppSecret = huaweiAppSecret;
  }


  public UpdateHmsPushConfigurationByIdData pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the &#x60;/res/raw&#x60; folder.
   * @return pushSound
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the `/res/raw` folder.")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  /**
   * Return true if this updateHmsPushConfigurationByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData = (UpdateHmsPushConfigurationByIdData) o;
    return Objects.equals(this.providerId, updateHmsPushConfigurationByIdData.providerId) &&
        Objects.equals(this.huaweiAppId, updateHmsPushConfigurationByIdData.huaweiAppId) &&
        Objects.equals(this.huaweiAppSecret, updateHmsPushConfigurationByIdData.huaweiAppSecret) &&
        Objects.equals(this.pushSound, updateHmsPushConfigurationByIdData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, huaweiAppId, huaweiAppSecret, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateHmsPushConfigurationByIdData {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    huaweiAppId: ").append(toIndentedString(huaweiAppId)).append("\n");
    sb.append("    huaweiAppSecret: ").append(toIndentedString(huaweiAppSecret)).append("\n");
    sb.append("    pushSound: ").append(toIndentedString(pushSound)).append("\n");
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

