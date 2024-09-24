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
 * JoinChannelsData
 */
@JsonPropertyOrder({
  JoinChannelsData.JSON_PROPERTY_BOT_USERID,
  JoinChannelsData.JSON_PROPERTY_CHANNEL_URLS
})
@JsonTypeName("joinChannelsData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T16:05:51.854046+09:00[Asia/Seoul]")
public class JoinChannelsData {
  public static final String JSON_PROPERTY_BOT_USERID = "bot_userid";
  private String botUserid;

  public static final String JSON_PROPERTY_CHANNEL_URLS = "channel_urls";
  private List<String> channelUrls = new ArrayList<>();

  public JoinChannelsData() { 
  }

  public JoinChannelsData botUserid(String botUserid) {
    this.botUserid = botUserid;
    return this;
  }

   /**
   * Specifies the ID of the bot to join the channels.
   * @return botUserid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the bot to join the channels.")
  @JsonProperty(JSON_PROPERTY_BOT_USERID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBotUserid() {
    return botUserid;
  }


  @JsonProperty(JSON_PROPERTY_BOT_USERID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBotUserid(String botUserid) {
    this.botUserid = botUserid;
  }


  public JoinChannelsData channelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public JoinChannelsData addChannelUrlsItem(String channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Specifies an array of one or more URLs of the channels to join.
   * @return channelUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more URLs of the channels to join.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getChannelUrls() {
    return channelUrls;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrls(List<String> channelUrls) {
    this.channelUrls = channelUrls;
  }


  /**
   * Return true if this joinChannelsData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinChannelsData joinChannelsData = (JoinChannelsData) o;
    return Objects.equals(this.botUserid, joinChannelsData.botUserid) &&
        Objects.equals(this.channelUrls, joinChannelsData.channelUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botUserid, channelUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinChannelsData {\n");
    sb.append("    botUserid: ").append(toIndentedString(botUserid)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
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

