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
 * AddHmsPushConfigurationData
 */
@JsonPropertyOrder({
  AddHmsPushConfigurationData.JSON_PROPERTY_HUAWEI_APP_ID,
  AddHmsPushConfigurationData.JSON_PROPERTY_HUAWEI_APP_SECRET,
  AddHmsPushConfigurationData.JSON_PROPERTY_PUSH_SOUND
})
@JsonTypeName("addHmsPushConfigurationData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class AddHmsPushConfigurationData {
  public static final String JSON_PROPERTY_HUAWEI_APP_ID = "huawei_app_id";
  private String huaweiAppId;

  public static final String JSON_PROPERTY_HUAWEI_APP_SECRET = "huawei_app_secret";
  private String huaweiAppSecret;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public AddHmsPushConfigurationData() { 
  }

  public AddHmsPushConfigurationData huaweiAppId(String huaweiAppId) {
    this.huaweiAppId = huaweiAppId;
    return this;
  }

   /**
   * Specifies the unique ID of application registered to the HMS server.
   * @return huaweiAppId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of application registered to the HMS server.")
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


  public AddHmsPushConfigurationData huaweiAppSecret(String huaweiAppSecret) {
    this.huaweiAppSecret = huaweiAppSecret;
    return this;
  }

   /**
   * Specifies the secret key allocated to the application.
   * @return huaweiAppSecret
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the secret key allocated to the application.")
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


  public AddHmsPushConfigurationData pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Specifies the name of a sound file to be played when a push notification is delivered to your client app. The file should be located in the &#x60;/res/raw&#x60; folder.
   * @return pushSound
  **/
  @jakarta.annotation.Nonnull
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
   * Return true if this addHmsPushConfigurationData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHmsPushConfigurationData addHmsPushConfigurationData = (AddHmsPushConfigurationData) o;
    return Objects.equals(this.huaweiAppId, addHmsPushConfigurationData.huaweiAppId) &&
        Objects.equals(this.huaweiAppSecret, addHmsPushConfigurationData.huaweiAppSecret) &&
        Objects.equals(this.pushSound, addHmsPushConfigurationData.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(huaweiAppId, huaweiAppSecret, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHmsPushConfigurationData {\n");
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

