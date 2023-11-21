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
import org.openapitools.client.model.SendBirdGroupChannel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * SendBirdGroupChannelCollection
 */
@JsonPropertyOrder({
  SendBirdGroupChannelCollection.JSON_PROPERTY_CHANNEL_LIST,
  SendBirdGroupChannelCollection.JSON_PROPERTY_HAS_MORE
})
@JsonTypeName("SendBird.GroupChannelCollection")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T11:44:36.129327+09:00[Asia/Seoul]")
public class SendBirdGroupChannelCollection {
  public static final String JSON_PROPERTY_CHANNEL_LIST = "channel_list";
  private List<SendBirdGroupChannel> channelList = null;

  public static final String JSON_PROPERTY_HAS_MORE = "has_more";
  private Boolean hasMore;

  public SendBirdGroupChannelCollection() { 
  }

  public SendBirdGroupChannelCollection channelList(List<SendBirdGroupChannel> channelList) {
    this.channelList = channelList;
    return this;
  }

  public SendBirdGroupChannelCollection addChannelListItem(SendBirdGroupChannel channelListItem) {
    if (this.channelList == null) {
      this.channelList = new ArrayList<>();
    }
    this.channelList.add(channelListItem);
    return this;
  }

   /**
   * Get channelList
   * @return channelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdGroupChannel> getChannelList() {
    return channelList;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelList(List<SendBirdGroupChannel> channelList) {
    this.channelList = channelList;
  }


  public SendBirdGroupChannelCollection hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasMore() {
    return hasMore;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  /**
   * Return true if this SendBird.GroupChannelCollection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelCollection sendBirdGroupChannelCollection = (SendBirdGroupChannelCollection) o;
    return Objects.equals(this.channelList, sendBirdGroupChannelCollection.channelList) &&
        Objects.equals(this.hasMore, sendBirdGroupChannelCollection.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelList, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelCollection {\n");
    sb.append("    channelList: ").append(toIndentedString(channelList)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

