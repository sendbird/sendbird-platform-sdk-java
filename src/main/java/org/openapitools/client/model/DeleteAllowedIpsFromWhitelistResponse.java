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
 * DeleteAllowedIpsFromWhitelistResponse
 */
@JsonPropertyOrder({
  DeleteAllowedIpsFromWhitelistResponse.JSON_PROPERTY_IP_WHITELIST_ADDRESSES
})
@JsonTypeName("deleteAllowedIpsFromWhitelistResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class DeleteAllowedIpsFromWhitelistResponse {
  public static final String JSON_PROPERTY_IP_WHITELIST_ADDRESSES = "ip_whitelist_addresses";
  private List<String> ipWhitelistAddresses = null;

  public DeleteAllowedIpsFromWhitelistResponse() { 
  }

  public DeleteAllowedIpsFromWhitelistResponse ipWhitelistAddresses(List<String> ipWhitelistAddresses) {
    this.ipWhitelistAddresses = ipWhitelistAddresses;
    return this;
  }

  public DeleteAllowedIpsFromWhitelistResponse addIpWhitelistAddressesItem(String ipWhitelistAddressesItem) {
    if (this.ipWhitelistAddresses == null) {
      this.ipWhitelistAddresses = new ArrayList<>();
    }
    this.ipWhitelistAddresses.add(ipWhitelistAddressesItem);
    return this;
  }

   /**
   * Get ipWhitelistAddresses
   * @return ipWhitelistAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IP_WHITELIST_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpWhitelistAddresses() {
    return ipWhitelistAddresses;
  }


  @JsonProperty(JSON_PROPERTY_IP_WHITELIST_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpWhitelistAddresses(List<String> ipWhitelistAddresses) {
    this.ipWhitelistAddresses = ipWhitelistAddresses;
  }


  /**
   * Return true if this deleteAllowedIpsFromWhitelistResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAllowedIpsFromWhitelistResponse deleteAllowedIpsFromWhitelistResponse = (DeleteAllowedIpsFromWhitelistResponse) o;
    return Objects.equals(this.ipWhitelistAddresses, deleteAllowedIpsFromWhitelistResponse.ipWhitelistAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipWhitelistAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAllowedIpsFromWhitelistResponse {\n");
    sb.append("    ipWhitelistAddresses: ").append(toIndentedString(ipWhitelistAddresses)).append("\n");
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

