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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddApnsPushConfigurationResponsePushConfigurationsInner
 */
@JsonPropertyOrder({
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_ID,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_PUSH_TYPE,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_CREATED_AT,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_APNS_CER_ENV_TYPE,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_APNS_EXPIRATION,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_APNS_NAME,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_CONTENT_AVAILABLE,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_MUTABLE_CONTENT,
  AddApnsPushConfigurationResponsePushConfigurationsInner.JSON_PROPERTY_PUSH_SOUND
})
@JsonTypeName("addApnsPushConfigurationResponse_push_configurations_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class AddApnsPushConfigurationResponsePushConfigurationsInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PUSH_TYPE = "push_type";
  private String pushType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_APNS_CER_ENV_TYPE = "apns_cer_env_type";
  private String apnsCerEnvType;

  public static final String JSON_PROPERTY_APNS_EXPIRATION = "apns_expiration";
  private BigDecimal apnsExpiration;

  public static final String JSON_PROPERTY_APNS_NAME = "apns_name";
  private String apnsName;

  public static final String JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE = "has_unread_count_badge";
  private BigDecimal hasUnreadCountBadge;

  public static final String JSON_PROPERTY_CONTENT_AVAILABLE = "content_available";
  private Boolean contentAvailable;

  public static final String JSON_PROPERTY_MUTABLE_CONTENT = "mutable_content";
  private Boolean mutableContent;

  public static final String JSON_PROPERTY_PUSH_SOUND = "push_sound";
  private String pushSound;

  public AddApnsPushConfigurationResponsePushConfigurationsInner() { 
  }

  public AddApnsPushConfigurationResponsePushConfigurationsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner pushType(String pushType) {
    this.pushType = pushType;
    return this;
  }

   /**
   * Get pushType
   * @return pushType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushType() {
    return pushType;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushType(String pushType) {
    this.pushType = pushType;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner apnsCerEnvType(String apnsCerEnvType) {
    this.apnsCerEnvType = apnsCerEnvType;
    return this;
  }

   /**
   * Get apnsCerEnvType
   * @return apnsCerEnvType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APNS_CER_ENV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApnsCerEnvType() {
    return apnsCerEnvType;
  }


  @JsonProperty(JSON_PROPERTY_APNS_CER_ENV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApnsCerEnvType(String apnsCerEnvType) {
    this.apnsCerEnvType = apnsCerEnvType;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner apnsExpiration(BigDecimal apnsExpiration) {
    this.apnsExpiration = apnsExpiration;
    return this;
  }

   /**
   * Get apnsExpiration
   * @return apnsExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APNS_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getApnsExpiration() {
    return apnsExpiration;
  }


  @JsonProperty(JSON_PROPERTY_APNS_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApnsExpiration(BigDecimal apnsExpiration) {
    this.apnsExpiration = apnsExpiration;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner apnsName(String apnsName) {
    this.apnsName = apnsName;
    return this;
  }

   /**
   * Get apnsName
   * @return apnsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APNS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApnsName() {
    return apnsName;
  }


  @JsonProperty(JSON_PROPERTY_APNS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApnsName(String apnsName) {
    this.apnsName = apnsName;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner hasUnreadCountBadge(BigDecimal hasUnreadCountBadge) {
    this.hasUnreadCountBadge = hasUnreadCountBadge;
    return this;
  }

   /**
   * Get hasUnreadCountBadge
   * @return hasUnreadCountBadge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHasUnreadCountBadge() {
    return hasUnreadCountBadge;
  }


  @JsonProperty(JSON_PROPERTY_HAS_UNREAD_COUNT_BADGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasUnreadCountBadge(BigDecimal hasUnreadCountBadge) {
    this.hasUnreadCountBadge = hasUnreadCountBadge;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner contentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
    return this;
  }

   /**
   * Get contentAvailable
   * @return contentAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContentAvailable() {
    return contentAvailable;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentAvailable(Boolean contentAvailable) {
    this.contentAvailable = contentAvailable;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner mutableContent(Boolean mutableContent) {
    this.mutableContent = mutableContent;
    return this;
  }

   /**
   * Get mutableContent
   * @return mutableContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUTABLE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMutableContent() {
    return mutableContent;
  }


  @JsonProperty(JSON_PROPERTY_MUTABLE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMutableContent(Boolean mutableContent) {
    this.mutableContent = mutableContent;
  }


  public AddApnsPushConfigurationResponsePushConfigurationsInner pushSound(String pushSound) {
    this.pushSound = pushSound;
    return this;
  }

   /**
   * Get pushSound
   * @return pushSound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPushSound() {
    return pushSound;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_SOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushSound(String pushSound) {
    this.pushSound = pushSound;
  }


  /**
   * Return true if this addApnsPushConfigurationResponse_push_configurations_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddApnsPushConfigurationResponsePushConfigurationsInner addApnsPushConfigurationResponsePushConfigurationsInner = (AddApnsPushConfigurationResponsePushConfigurationsInner) o;
    return Objects.equals(this.id, addApnsPushConfigurationResponsePushConfigurationsInner.id) &&
        Objects.equals(this.pushType, addApnsPushConfigurationResponsePushConfigurationsInner.pushType) &&
        Objects.equals(this.createdAt, addApnsPushConfigurationResponsePushConfigurationsInner.createdAt) &&
        Objects.equals(this.apnsCerEnvType, addApnsPushConfigurationResponsePushConfigurationsInner.apnsCerEnvType) &&
        Objects.equals(this.apnsExpiration, addApnsPushConfigurationResponsePushConfigurationsInner.apnsExpiration) &&
        Objects.equals(this.apnsName, addApnsPushConfigurationResponsePushConfigurationsInner.apnsName) &&
        Objects.equals(this.hasUnreadCountBadge, addApnsPushConfigurationResponsePushConfigurationsInner.hasUnreadCountBadge) &&
        Objects.equals(this.contentAvailable, addApnsPushConfigurationResponsePushConfigurationsInner.contentAvailable) &&
        Objects.equals(this.mutableContent, addApnsPushConfigurationResponsePushConfigurationsInner.mutableContent) &&
        Objects.equals(this.pushSound, addApnsPushConfigurationResponsePushConfigurationsInner.pushSound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pushType, createdAt, apnsCerEnvType, apnsExpiration, apnsName, hasUnreadCountBadge, contentAvailable, mutableContent, pushSound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddApnsPushConfigurationResponsePushConfigurationsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pushType: ").append(toIndentedString(pushType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    apnsCerEnvType: ").append(toIndentedString(apnsCerEnvType)).append("\n");
    sb.append("    apnsExpiration: ").append(toIndentedString(apnsExpiration)).append("\n");
    sb.append("    apnsName: ").append(toIndentedString(apnsName)).append("\n");
    sb.append("    hasUnreadCountBadge: ").append(toIndentedString(hasUnreadCountBadge)).append("\n");
    sb.append("    contentAvailable: ").append(toIndentedString(contentAvailable)).append("\n");
    sb.append("    mutableContent: ").append(toIndentedString(mutableContent)).append("\n");
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

