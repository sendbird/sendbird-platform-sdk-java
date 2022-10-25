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
 * UpdateChannelInvitationPreferenceData
 */
@JsonPropertyOrder({
  UpdateChannelInvitationPreferenceData.JSON_PROPERTY_AUTO_ACCEPT
})
@JsonTypeName("updateChannelInvitationPreferenceData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
public class UpdateChannelInvitationPreferenceData {
  public static final String JSON_PROPERTY_AUTO_ACCEPT = "auto_accept";
  private Boolean autoAccept;

  public UpdateChannelInvitationPreferenceData() { 
  }

  public UpdateChannelInvitationPreferenceData autoAccept(Boolean autoAccept) {
    this.autoAccept = autoAccept;
    return this;
  }

   /**
   * Determines for the user whether or not to automatically join a [private](/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channel promptly from an invitation without having to accept it. (Default: true)
   * @return autoAccept
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines for the user whether or not to automatically join a [private](/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channel promptly from an invitation without having to accept it. (Default: true)")
  @JsonProperty(JSON_PROPERTY_AUTO_ACCEPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAutoAccept() {
    return autoAccept;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_ACCEPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutoAccept(Boolean autoAccept) {
    this.autoAccept = autoAccept;
  }


  /**
   * Return true if this updateChannelInvitationPreferenceData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData = (UpdateChannelInvitationPreferenceData) o;
    return Objects.equals(this.autoAccept, updateChannelInvitationPreferenceData.autoAccept);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAccept);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChannelInvitationPreferenceData {\n");
    sb.append("    autoAccept: ").append(toIndentedString(autoAccept)).append("\n");
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

