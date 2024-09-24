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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class RemoveRegistrationOrDeviceTokenResponse {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private List<String> token = null;

  public static final String JSON_PROPERTY_USER = "user";
  private JsonNullable<SendBirdUser> user = JsonNullable.<SendBirdUser>undefined();

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
    this.user = JsonNullable.<SendBirdUser>of(user);
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public SendBirdUser getUser() {
        return user.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SendBirdUser> getUser_JsonNullable() {
    return user;
  }
  
  @JsonProperty(JSON_PROPERTY_USER)
  public void setUser_JsonNullable(JsonNullable<SendBirdUser> user) {
    this.user = user;
  }

  public void setUser(SendBirdUser user) {
    this.user = JsonNullable.<SendBirdUser>of(user);
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
        equalsNullable(this.user, removeRegistrationOrDeviceTokenResponse.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, hashCodeNullable(user));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

