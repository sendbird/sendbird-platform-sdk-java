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
import org.openapitools.client.model.ScheduleAnnouncementDataMessage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ScheduleAnnouncementData
 */
@JsonPropertyOrder({
  ScheduleAnnouncementData.JSON_PROPERTY_MESSAGE,
  ScheduleAnnouncementData.JSON_PROPERTY_MESSAGE_TYPE,
  ScheduleAnnouncementData.JSON_PROPERTY_USER_ID,
  ScheduleAnnouncementData.JSON_PROPERTY_CONTENT,
  ScheduleAnnouncementData.JSON_PROPERTY_TARGET_AT,
  ScheduleAnnouncementData.JSON_PROPERTY_TARGET_LIST,
  ScheduleAnnouncementData.JSON_PROPERTY_TARGET_CHANNEL_TYPE,
  ScheduleAnnouncementData.JSON_PROPERTY_UNIQUE_ID,
  ScheduleAnnouncementData.JSON_PROPERTY_MESSAGE_CUSTOM_TYPE,
  ScheduleAnnouncementData.JSON_PROPERTY_MESSAGE_DATA,
  ScheduleAnnouncementData.JSON_PROPERTY_CREATE_CHANNEL,
  ScheduleAnnouncementData.JSON_PROPERTY_ANNOUNCEMENT_GROUP,
  ScheduleAnnouncementData.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS,
  ScheduleAnnouncementData.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_NAME,
  ScheduleAnnouncementData.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_COVER_URL,
  ScheduleAnnouncementData.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_CUSTOM_TYPE,
  ScheduleAnnouncementData.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DATA,
  ScheduleAnnouncementData.JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DISTINCT,
  ScheduleAnnouncementData.JSON_PROPERTY_SCHEDULED_AT,
  ScheduleAnnouncementData.JSON_PROPERTY_CEASE_AT,
  ScheduleAnnouncementData.JSON_PROPERTY_RESUME_AT,
  ScheduleAnnouncementData.JSON_PROPERTY_END_AT,
  ScheduleAnnouncementData.JSON_PROPERTY_ENABLE_PUSH,
  ScheduleAnnouncementData.JSON_PROPERTY_ASSIGN_SENDER_AS_CHANNEL_INVITER
})
@JsonTypeName("scheduleAnnouncementData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-10T16:14:48.686+09:00[Asia/Seoul]")
public class ScheduleAnnouncementData {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private ScheduleAnnouncementDataMessage message;

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "message_type";
  private String messageType;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_TARGET_AT = "target_at";
  private String targetAt;

  public static final String JSON_PROPERTY_TARGET_LIST = "target_list";
  private List<String> targetList = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET_CHANNEL_TYPE = "target_channel_type";
  private String targetChannelType;

  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private String uniqueId;

  public static final String JSON_PROPERTY_MESSAGE_CUSTOM_TYPE = "message.custom_type";
  private String messageCustomType;

  public static final String JSON_PROPERTY_MESSAGE_DATA = "message.data";
  private String messageData;

  public static final String JSON_PROPERTY_CREATE_CHANNEL = "create_channel";
  private Boolean createChannel;

  public static final String JSON_PROPERTY_ANNOUNCEMENT_GROUP = "announcement_group";
  private String announcementGroup;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS = "create_channel_options";
  private String createChannelOptions;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_NAME = "create_channel_options.name";
  private String createChannelOptionsName;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_COVER_URL = "create_channel_options.cover_url";
  private String createChannelOptionsCoverUrl;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_CUSTOM_TYPE = "create_channel_options.custom_type";
  private String createChannelOptionsCustomType;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DATA = "create_channel_options.data";
  private String createChannelOptionsData;

  public static final String JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DISTINCT = "create_channel_options.distinct";
  private String createChannelOptionsDistinct;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduled_at";
  private Integer scheduledAt;

  public static final String JSON_PROPERTY_CEASE_AT = "cease_at";
  private String ceaseAt;

  public static final String JSON_PROPERTY_RESUME_AT = "resume_at";
  private String resumeAt;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private Integer endAt;

  public static final String JSON_PROPERTY_ENABLE_PUSH = "enable_push";
  private Boolean enablePush;

  public static final String JSON_PROPERTY_ASSIGN_SENDER_AS_CHANNEL_INVITER = "assign_sender_as_channel_inviter";
  private Boolean assignSenderAsChannelInviter;

  public ScheduleAnnouncementData() { 
  }

  public ScheduleAnnouncementData message(ScheduleAnnouncementDataMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ScheduleAnnouncementDataMessage getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(ScheduleAnnouncementDataMessage message) {
    this.message = message;
  }


  public ScheduleAnnouncementData messageType(String messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Specifies the type of the message, which can be either MESG for a text message and ADMM for an admin message.
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the type of the message, which can be either MESG for a text message and ADMM for an admin message.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public ScheduleAnnouncementData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the sender when the message.type is MESG. When the message.type value is ADMM, this property is not effective.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID of the sender when the message.type is MESG. When the message.type value is ADMM, this property is not effective.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ScheduleAnnouncementData content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Specifies the content of the message.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the content of the message.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public ScheduleAnnouncementData targetAt(String targetAt) {
    this.targetAt = targetAt;
    return this;
  }

   /**
   * Specifies the target channels to send the announcement to. Acceptable values are the following: &lt;br/&gt; - sender_all_channels (Default): sends the announcement to all of the sender&#39;s group channels.&lt;br /&gt;- target_channels: sends the announcement to all target group channels. When the &#x60;message.type&#x60; of the announcement is ADMM, this is the only valid option. &lt;br /&gt; - target_users_included_channels: sends the announcement to group channels consisting of the sender, target users, and other members. &lt;br/&gt; - target_users_only_channels: sends the announcement to group channels consisting of the sender and target users only.
   * @return targetAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the target channels to send the announcement to. Acceptable values are the following: <br/> - sender_all_channels (Default): sends the announcement to all of the sender's group channels.<br />- target_channels: sends the announcement to all target group channels. When the `message.type` of the announcement is ADMM, this is the only valid option. <br /> - target_users_included_channels: sends the announcement to group channels consisting of the sender, target users, and other members. <br/> - target_users_only_channels: sends the announcement to group channels consisting of the sender and target users only.")
  @JsonProperty(JSON_PROPERTY_TARGET_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetAt() {
    return targetAt;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetAt(String targetAt) {
    this.targetAt = targetAt;
  }


  public ScheduleAnnouncementData targetList(List<String> targetList) {
    this.targetList = targetList;
    return this;
  }

  public ScheduleAnnouncementData addTargetListItem(String targetListItem) {
    this.targetList.add(targetListItem);
    return this;
  }

   /**
   * Specifies an array of one or more target user IDs or target channel URLs to send the announcement to when the target_at is  target_channels, target_users_only_channels, or target_users_included_channels.&lt;br /&gt;&lt;br /&gt;  When the target_at value is sender_all_channels, this property is not effective.
   * @return targetList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more target user IDs or target channel URLs to send the announcement to when the target_at is  target_channels, target_users_only_channels, or target_users_included_channels.<br /><br />  When the target_at value is sender_all_channels, this property is not effective.")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTargetList() {
    return targetList;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetList(List<String> targetList) {
    this.targetList = targetList;
  }


  public ScheduleAnnouncementData targetChannelType(String targetChannelType) {
    this.targetChannelType = targetChannelType;
    return this;
  }

   /**
   * Determines which type of group channel to send the announcement to, based on the target_at and target_list. This property is effective only when the target_at is either target_users_only_channels or target_users_included_channels and the target_list is specified. Acceptable values are limited to the following:&lt;br/&gt;- all: send the announcement to all channels that have all target users and the sender in them, regardless of channel type.&lt;br/&gt;- distinct (default): sends this announcement to the distinct channels. Distinct channels continue to use the same existing channels whenever someone attempts to create a new channel with the same members.&lt;br/&gt;- non-distinct: sends this announcement to the non-distinct channels. Non-distinct channels always create a new channel even if there is an existing channel with the same members.&lt;br/&gt;&lt;br/&gt; The distinct and non-distinct channels are a subtype of group channels, determined by the [is_distinct](/docs/chat/v3/platform-api/guides/group-channel#2-types-of-a-channel-3-resource-representation) property.
   * @return targetChannelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines which type of group channel to send the announcement to, based on the target_at and target_list. This property is effective only when the target_at is either target_users_only_channels or target_users_included_channels and the target_list is specified. Acceptable values are limited to the following:<br/>- all: send the announcement to all channels that have all target users and the sender in them, regardless of channel type.<br/>- distinct (default): sends this announcement to the distinct channels. Distinct channels continue to use the same existing channels whenever someone attempts to create a new channel with the same members.<br/>- non-distinct: sends this announcement to the non-distinct channels. Non-distinct channels always create a new channel even if there is an existing channel with the same members.<br/><br/> The distinct and non-distinct channels are a subtype of group channels, determined by the [is_distinct](/docs/chat/v3/platform-api/guides/group-channel#2-types-of-a-channel-3-resource-representation) property.")
  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetChannelType() {
    return targetChannelType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetChannelType(String targetChannelType) {
    this.targetChannelType = targetChannelType;
  }


  public ScheduleAnnouncementData uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Specifies the unique ID of the new announcement. The unique_id will be automatically created unless specified.
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the unique ID of the new announcement. The unique_id will be automatically created unless specified.")
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public ScheduleAnnouncementData messageCustomType(String messageCustomType) {
    this.messageCustomType = messageCustomType;
    return this;
  }

   /**
   * Specifies the custom message type of the message of the new announcement.
   * @return messageCustomType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the custom message type of the message of the new announcement.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageCustomType() {
    return messageCustomType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageCustomType(String messageCustomType) {
    this.messageCustomType = messageCustomType;
  }


  public ScheduleAnnouncementData messageData(String messageData) {
    this.messageData = messageData;
    return this;
  }

   /**
   * Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string.
   * @return messageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional message information such as custom font size, font type or `JSON` formatted string.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageData() {
    return messageData;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageData(String messageData) {
    this.messageData = messageData;
  }


  public ScheduleAnnouncementData createChannel(Boolean createChannel) {
    this.createChannel = createChannel;
    return this;
  }

   /**
   * Determines whether to create a new channel if there is no existing channel that matches with the target options including target_at and target_list. By specifying the create_channel_options, you can configure the properties of newly created channels. (Default: false)
   * @return createChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to create a new channel if there is no existing channel that matches with the target options including target_at and target_list. By specifying the create_channel_options, you can configure the properties of newly created channels. (Default: false)")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateChannel() {
    return createChannel;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannel(Boolean createChannel) {
    this.createChannel = createChannel;
  }


  public ScheduleAnnouncementData announcementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
    return this;
  }

   /**
   * Specifies the announcement group that the new announcement belongs to.&lt;br/&gt; &lt;br/&gt; This property is effective only when the target_at is either target_users_only_channels or target_users_included_channels.
   * @return announcementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the announcement group that the new announcement belongs to.<br/> <br/> This property is effective only when the target_at is either target_users_only_channels or target_users_included_channels.")
  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnouncementGroup() {
    return announcementGroup;
  }


  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnouncementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public ScheduleAnnouncementData createChannelOptions(String createChannelOptions) {
    this.createChannelOptions = createChannelOptions;
    return this;
  }

   /**
   * A newly created channel configuration.
   * @return createChannelOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A newly created channel configuration.")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateChannelOptions() {
    return createChannelOptions;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptions(String createChannelOptions) {
    this.createChannelOptions = createChannelOptions;
  }


  public ScheduleAnnouncementData createChannelOptionsName(String createChannelOptionsName) {
    this.createChannelOptionsName = createChannelOptionsName;
    return this;
  }

   /**
   * Specifies the name of channels to be created. (Default: Group Channel)
   * @return createChannelOptionsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of channels to be created. (Default: Group Channel)")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateChannelOptionsName() {
    return createChannelOptionsName;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptionsName(String createChannelOptionsName) {
    this.createChannelOptionsName = createChannelOptionsName;
  }


  public ScheduleAnnouncementData createChannelOptionsCoverUrl(String createChannelOptionsCoverUrl) {
    this.createChannelOptionsCoverUrl = createChannelOptionsCoverUrl;
    return this;
  }

   /**
   * Specifies the URL of the cover image for the new channels.
   * @return createChannelOptionsCoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the cover image for the new channels.")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateChannelOptionsCoverUrl() {
    return createChannelOptionsCoverUrl;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptionsCoverUrl(String createChannelOptionsCoverUrl) {
    this.createChannelOptionsCoverUrl = createChannelOptionsCoverUrl;
  }


  public ScheduleAnnouncementData createChannelOptionsCustomType(String createChannelOptionsCustomType) {
    this.createChannelOptionsCustomType = createChannelOptionsCustomType;
    return this;
  }

   /**
   * Specifies the custom channel type of the new channels.
   * @return createChannelOptionsCustomType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the custom channel type of the new channels.")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateChannelOptionsCustomType() {
    return createChannelOptionsCustomType;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptionsCustomType(String createChannelOptionsCustomType) {
    this.createChannelOptionsCustomType = createChannelOptionsCustomType;
  }


  public ScheduleAnnouncementData createChannelOptionsData(String createChannelOptionsData) {
    this.createChannelOptionsData = createChannelOptionsData;
    return this;
  }

   /**
   * Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string.
   * @return createChannelOptionsData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional channel information such as a long description of the channel or `JSON` formatted string.")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateChannelOptionsData() {
    return createChannelOptionsData;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptionsData(String createChannelOptionsData) {
    this.createChannelOptionsData = createChannelOptionsData;
  }


  public ScheduleAnnouncementData createChannelOptionsDistinct(String createChannelOptionsDistinct) {
    this.createChannelOptionsDistinct = createChannelOptionsDistinct;
    return this;
  }

   /**
   * Determines whether to create a [distinct](/docs/chat/v3/platform-api/guides/channel-types#2-group-channel) channel. (Default: true)
   * @return createChannelOptionsDistinct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to create a [distinct](/docs/chat/v3/platform-api/guides/channel-types#2-group-channel) channel. (Default: true)")
  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DISTINCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateChannelOptionsDistinct() {
    return createChannelOptionsDistinct;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_CHANNEL_OPTIONS_DISTINCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateChannelOptionsDistinct(String createChannelOptionsDistinct) {
    this.createChannelOptionsDistinct = createChannelOptionsDistinct;
  }


  public ScheduleAnnouncementData scheduledAt(Integer scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Specifies the time to start the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. If not specified, the default is the timestamp of when the request was delivered to Sendbird server. (Default: current timestamp)
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to start the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. If not specified, the default is the timestamp of when the request was delivered to Sendbird server. (Default: current timestamp)")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(Integer scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ScheduleAnnouncementData ceaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
    return this;
  }

   /**
   * Specifies the time to temporarily put the announcement on hold in UTC. The string is represented in HHMM format. This should be specified in conjunction with the resume_at property.&lt;br/&gt;&lt;br/&gt; If both the cease_at and resume_at are not specified, Sendbird server starts to send the announcement at the time of the scheduled_at above.
   * @return ceaseAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to temporarily put the announcement on hold in UTC. The string is represented in HHMM format. This should be specified in conjunction with the resume_at property.<br/><br/> If both the cease_at and resume_at are not specified, Sendbird server starts to send the announcement at the time of the scheduled_at above.")
  @JsonProperty(JSON_PROPERTY_CEASE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCeaseAt() {
    return ceaseAt;
  }


  @JsonProperty(JSON_PROPERTY_CEASE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCeaseAt(String ceaseAt) {
    this.ceaseAt = ceaseAt;
  }


  public ScheduleAnnouncementData resumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
    return this;
  }

   /**
   * Specifies the time to automatically resume the on-hold announcement in UTC. The string is represented in HHMM format. This should be specified in conjunction with the cease_at property above.&lt;br/&gt;&lt;br/&gt; If both the cease_at and resume_at are not specified, Sendbird server starts to send the announcement at the time of the scheduled_at above.
   * @return resumeAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to automatically resume the on-hold announcement in UTC. The string is represented in HHMM format. This should be specified in conjunction with the cease_at property above.<br/><br/> If both the cease_at and resume_at are not specified, Sendbird server starts to send the announcement at the time of the scheduled_at above.")
  @JsonProperty(JSON_PROPERTY_RESUME_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResumeAt() {
    return resumeAt;
  }


  @JsonProperty(JSON_PROPERTY_RESUME_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResumeAt(String resumeAt) {
    this.resumeAt = resumeAt;
  }


  public ScheduleAnnouncementData endAt(Integer endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Specifies the time to permanently end the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous##2-timestamps) format. If this property is specified, the announcement ends even when the announcement is not sent to all its targets. &lt;br/&gt;&lt;br/&gt; For the announcement to run safely, the end_at time should be set at least 10 minutes later than the scheduled_at time.
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time to permanently end the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous##2-timestamps) format. If this property is specified, the announcement ends even when the announcement is not sent to all its targets. <br/><br/> For the announcement to run safely, the end_at time should be set at least 10 minutes later than the scheduled_at time.")
  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndAt() {
    return endAt;
  }


  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAt(Integer endAt) {
    this.endAt = endAt;
  }


  public ScheduleAnnouncementData enablePush(Boolean enablePush) {
    this.enablePush = enablePush;
    return this;
  }

   /**
   * Determines whether to turn on push notification for the announcement. If set to true, push notifications will be sent for the announcement. (Default: true)
   * @return enablePush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to turn on push notification for the announcement. If set to true, push notifications will be sent for the announcement. (Default: true)")
  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePush() {
    return enablePush;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePush(Boolean enablePush) {
    this.enablePush = enablePush;
  }


  public ScheduleAnnouncementData assignSenderAsChannelInviter(Boolean assignSenderAsChannelInviter) {
    this.assignSenderAsChannelInviter = assignSenderAsChannelInviter;
    return this;
  }

   /**
   * Determines whether to assign an announcement sender as an inviter of the newly created channels. (Default: false)
   * @return assignSenderAsChannelInviter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to assign an announcement sender as an inviter of the newly created channels. (Default: false)")
  @JsonProperty(JSON_PROPERTY_ASSIGN_SENDER_AS_CHANNEL_INVITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAssignSenderAsChannelInviter() {
    return assignSenderAsChannelInviter;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGN_SENDER_AS_CHANNEL_INVITER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignSenderAsChannelInviter(Boolean assignSenderAsChannelInviter) {
    this.assignSenderAsChannelInviter = assignSenderAsChannelInviter;
  }


  /**
   * Return true if this scheduleAnnouncementData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleAnnouncementData scheduleAnnouncementData = (ScheduleAnnouncementData) o;
    return Objects.equals(this.message, scheduleAnnouncementData.message) &&
        Objects.equals(this.messageType, scheduleAnnouncementData.messageType) &&
        Objects.equals(this.userId, scheduleAnnouncementData.userId) &&
        Objects.equals(this.content, scheduleAnnouncementData.content) &&
        Objects.equals(this.targetAt, scheduleAnnouncementData.targetAt) &&
        Objects.equals(this.targetList, scheduleAnnouncementData.targetList) &&
        Objects.equals(this.targetChannelType, scheduleAnnouncementData.targetChannelType) &&
        Objects.equals(this.uniqueId, scheduleAnnouncementData.uniqueId) &&
        Objects.equals(this.messageCustomType, scheduleAnnouncementData.messageCustomType) &&
        Objects.equals(this.messageData, scheduleAnnouncementData.messageData) &&
        Objects.equals(this.createChannel, scheduleAnnouncementData.createChannel) &&
        Objects.equals(this.announcementGroup, scheduleAnnouncementData.announcementGroup) &&
        Objects.equals(this.createChannelOptions, scheduleAnnouncementData.createChannelOptions) &&
        Objects.equals(this.createChannelOptionsName, scheduleAnnouncementData.createChannelOptionsName) &&
        Objects.equals(this.createChannelOptionsCoverUrl, scheduleAnnouncementData.createChannelOptionsCoverUrl) &&
        Objects.equals(this.createChannelOptionsCustomType, scheduleAnnouncementData.createChannelOptionsCustomType) &&
        Objects.equals(this.createChannelOptionsData, scheduleAnnouncementData.createChannelOptionsData) &&
        Objects.equals(this.createChannelOptionsDistinct, scheduleAnnouncementData.createChannelOptionsDistinct) &&
        Objects.equals(this.scheduledAt, scheduleAnnouncementData.scheduledAt) &&
        Objects.equals(this.ceaseAt, scheduleAnnouncementData.ceaseAt) &&
        Objects.equals(this.resumeAt, scheduleAnnouncementData.resumeAt) &&
        Objects.equals(this.endAt, scheduleAnnouncementData.endAt) &&
        Objects.equals(this.enablePush, scheduleAnnouncementData.enablePush) &&
        Objects.equals(this.assignSenderAsChannelInviter, scheduleAnnouncementData.assignSenderAsChannelInviter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageType, userId, content, targetAt, targetList, targetChannelType, uniqueId, messageCustomType, messageData, createChannel, announcementGroup, createChannelOptions, createChannelOptionsName, createChannelOptionsCoverUrl, createChannelOptionsCustomType, createChannelOptionsData, createChannelOptionsDistinct, scheduledAt, ceaseAt, resumeAt, endAt, enablePush, assignSenderAsChannelInviter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAnnouncementData {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    targetAt: ").append(toIndentedString(targetAt)).append("\n");
    sb.append("    targetList: ").append(toIndentedString(targetList)).append("\n");
    sb.append("    targetChannelType: ").append(toIndentedString(targetChannelType)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    messageCustomType: ").append(toIndentedString(messageCustomType)).append("\n");
    sb.append("    messageData: ").append(toIndentedString(messageData)).append("\n");
    sb.append("    createChannel: ").append(toIndentedString(createChannel)).append("\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
    sb.append("    createChannelOptions: ").append(toIndentedString(createChannelOptions)).append("\n");
    sb.append("    createChannelOptionsName: ").append(toIndentedString(createChannelOptionsName)).append("\n");
    sb.append("    createChannelOptionsCoverUrl: ").append(toIndentedString(createChannelOptionsCoverUrl)).append("\n");
    sb.append("    createChannelOptionsCustomType: ").append(toIndentedString(createChannelOptionsCustomType)).append("\n");
    sb.append("    createChannelOptionsData: ").append(toIndentedString(createChannelOptionsData)).append("\n");
    sb.append("    createChannelOptionsDistinct: ").append(toIndentedString(createChannelOptionsDistinct)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    ceaseAt: ").append(toIndentedString(ceaseAt)).append("\n");
    sb.append("    resumeAt: ").append(toIndentedString(resumeAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    enablePush: ").append(toIndentedString(enablePush)).append("\n");
    sb.append("    assignSenderAsChannelInviter: ").append(toIndentedString(assignSenderAsChannelInviter)).append("\n");
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

