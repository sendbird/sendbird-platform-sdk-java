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
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * RemoveRegistrationOrDeviceTokenResponse
 */
@JsonPropertyOrder({
  RemoveRegistrationOrDeviceTokenResponse.JSON_PROPERTY_TOKEN,
  RemoveRegistrationOrDeviceTokenResponse.JSON_PROPERTY_USER
})
@JsonTypeName("removeRegistrationOrDeviceTokenResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class RemoveRegistrationOrDeviceTokenResponse {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private List<String> token = null;

  public static final String JSON_PROPERTY_USER = "user";
  private SendBirdUser user;

  public RemoveRegistrationOrDeviceTokenResponse() { 
  }

  public RemoveRegistrationOrDeviceTokenResponse token(List<String> token) {
    this.token = token;
    return this;
  }

  public RemoveRegistrationOrDeviceTokenResponse addTokenItem(String tokenItem) {
    if (this.token == null) {
      this.token = new ArrayList<>();
    }
    this.token.add(tokenItem);
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(List<String> token) {
    this.token = token;
  }


  public RemoveRegistrationOrDeviceTokenResponse user(SendBirdUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SendBirdUser getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(SendBirdUser user) {
    this.user = user;
  }


  /**
   * Return true if this removeRegistrationOrDeviceTokenResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveRegistrationOrDeviceTokenResponse removeRegistrationOrDeviceTokenResponse = (RemoveRegistrationOrDeviceTokenResponse) o;
    return Objects.equals(this.token, removeRegistrationOrDeviceTokenResponse.token) &&
        Objects.equals(this.user, removeRegistrationOrDeviceTokenResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveRegistrationOrDeviceTokenResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

