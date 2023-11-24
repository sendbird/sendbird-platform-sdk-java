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
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcCreateChannelData
 */
@JsonPropertyOrder({
  GcCreateChannelData.JSON_PROPERTY_USER_IDS,
  GcCreateChannelData.JSON_PROPERTY_USERS,
  GcCreateChannelData.JSON_PROPERTY_NAME,
  GcCreateChannelData.JSON_PROPERTY_CHANNEL_URL,
  GcCreateChannelData.JSON_PROPERTY_COVER_URL,
  GcCreateChannelData.JSON_PROPERTY_COVER_FILE,
  GcCreateChannelData.JSON_PROPERTY_CUSTOM_TYPE,
  GcCreateChannelData.JSON_PROPERTY_DATA,
  GcCreateChannelData.JSON_PROPERTY_IS_DISTINCT,
  GcCreateChannelData.JSON_PROPERTY_IS_PUBLIC,
  GcCreateChannelData.JSON_PROPERTY_IS_SUPER,
  GcCreateChannelData.JSON_PROPERTY_IS_EPHEMERAL,
  GcCreateChannelData.JSON_PROPERTY_ACCESS_CODE,
  GcCreateChannelData.JSON_PROPERTY_INVITER_ID,
  GcCreateChannelData.JSON_PROPERTY_STRICT,
  GcCreateChannelData.JSON_PROPERTY_INVITATION_STATUS,
  GcCreateChannelData.JSON_PROPERTY_HIDDEN_STATUS,
  GcCreateChannelData.JSON_PROPERTY_OPERATOR_IDS,
  GcCreateChannelData.JSON_PROPERTY_BLOCK_SDK_USER_CHANNEL_JOIN
})
@JsonTypeName("gcCreateChannelData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
public class GcCreateChannelData {
  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = new ArrayList<>();

  public static final String JSON_PROPERTY_USERS = "users";
  private List<SendBirdUser> users = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_COVER_URL = "cover_url";
  private String coverUrl;

  public static final String JSON_PROPERTY_COVER_FILE = "cover_file";
  private File coverFile;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_IS_DISTINCT = "is_distinct";
  private Boolean isDistinct;

  public static final String JSON_PROPERTY_IS_PUBLIC = "is_public";
  private Boolean isPublic;

  public static final String JSON_PROPERTY_IS_SUPER = "is_super";
  private Boolean isSuper;

  public static final String JSON_PROPERTY_IS_EPHEMERAL = "is_ephemeral";
  private Boolean isEphemeral;

  public static final String JSON_PROPERTY_ACCESS_CODE = "access_code";
  private String accessCode;

  public static final String JSON_PROPERTY_INVITER_ID = "inviter_id";
  private String inviterId;

  public static final String JSON_PROPERTY_STRICT = "strict";
  private Boolean strict;

  public static final String JSON_PROPERTY_INVITATION_STATUS = "invitation_status";
  private Object invitationStatus;

  public static final String JSON_PROPERTY_HIDDEN_STATUS = "hidden_status";
  private Object hiddenStatus;

  public static final String JSON_PROPERTY_OPERATOR_IDS = "operator_ids";
  private List<String> operatorIds = null;

  public static final String JSON_PROPERTY_BLOCK_SDK_USER_CHANNEL_JOIN = "block_sdk_user_channel_join";
  private Boolean blockSdkUserChannelJoin;

  public GcCreateChannelData() { 
  }

  public GcCreateChannelData userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public GcCreateChannelData addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The users below and this property can be used interchangeably.
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The users below and this property can be used interchangeably.")
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public GcCreateChannelData users(List<SendBirdUser> users) {
    this.users = users;
    return this;
  }

  public GcCreateChannelData addUsersItem(SendBirdUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The user_ids above and this property can be used interchangeably.
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The user_ids above and this property can be used interchangeably.")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SendBirdUser> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<SendBirdUser> users) {
    this.users = users;
  }


  public GcCreateChannelData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the channel, or the channel topic. The length is limited to 191 characters. (Default: group channel)
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the channel, or the channel topic. The length is limited to 191 characters. (Default: group channel)")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public GcCreateChannelData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel. Only numbers, characters, and underscores are allowed. The length is 4 to 100 characters, inclusive. If not specified, a URL is automatically generated.
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the channel. Only numbers, characters, and underscores are allowed. The length is 4 to 100 characters, inclusive. If not specified, a URL is automatically generated.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcCreateChannelData coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Specifies the URL of the cover image for the channel. The length is limited to 2,048 characters.
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the cover image for the channel. The length is limited to 2,048 characters.")
  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverUrl() {
    return coverUrl;
  }


  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public GcCreateChannelData coverFile(File coverFile) {
    this.coverFile = coverFile;
    return this;
  }

   /**
   * Uploads the cover image file for the channel.
   * @return coverFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uploads the cover image file for the channel.")
  @JsonProperty(JSON_PROPERTY_COVER_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getCoverFile() {
    return coverFile;
  }


  @JsonProperty(JSON_PROPERTY_COVER_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverFile(File coverFile) {
    this.coverFile = coverFile;
  }


  public GcCreateChannelData customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.<br /><br /> Custom types are also used within Sendbird's [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomType() {
    return customType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public GcCreateChannelData data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies additional channel information such as a long description of the channel or `JSON` formatted string.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public GcCreateChannelData isDistinct(Boolean isDistinct) {
    this.isDistinct = isDistinct;
    return this;
  }

   /**
   * Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the same users in the user_ids or users property or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)&lt;br /&gt;&lt;br /&gt; Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.
   * @return isDistinct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the same users in the user_ids or users property or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)<br /><br /> Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.")
  @JsonProperty(JSON_PROPERTY_IS_DISTINCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDistinct() {
    return isDistinct;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISTINCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDistinct(Boolean isDistinct) {
    this.isDistinct = isDistinct;
  }


  public GcCreateChannelData isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Determines whether to allow a user to join the channel without an invitation. (Default: false)
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to allow a user to join the channel without an invitation. (Default: false)")
  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPublic() {
    return isPublic;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUBLIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public GcCreateChannelData isSuper(Boolean isSuper) {
    this.isSuper = isSuper;
    return this;
  }

   /**
   * Determines whether to allow the channel to accommodate more than 2,000 members. (Default: false) &lt;br/&gt;&lt;br/&gt; Supergroup channels are not supported with the is_distinct property and the property is false by default.
   * @return isSuper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to allow the channel to accommodate more than 2,000 members. (Default: false) <br/><br/> Supergroup channels are not supported with the is_distinct property and the property is false by default.")
  @JsonProperty(JSON_PROPERTY_IS_SUPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSuper() {
    return isSuper;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSuper(Boolean isSuper) {
    this.isSuper = isSuper;
  }


  public GcCreateChannelData isEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
    return this;
  }

   /**
   * Determines whether to preserve the messages in the channel for the purpose of retrieving chat history. (Default: false)
   * @return isEphemeral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to preserve the messages in the channel for the purpose of retrieving chat history. (Default: false)")
  @JsonProperty(JSON_PROPERTY_IS_EPHEMERAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEphemeral() {
    return isEphemeral;
  }


  @JsonProperty(JSON_PROPERTY_IS_EPHEMERAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
  }


  public GcCreateChannelData accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * This parameter can only be used when the channel operator creates a public group channel. They can set an access code for the corresponding type of channel. The channel then requires the specified access code to a user who attempts to join. If specified, the is_access_code_required property of the channel resource is set to true.
   * @return accessCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This parameter can only be used when the channel operator creates a public group channel. They can set an access code for the corresponding type of channel. The channel then requires the specified access code to a user who attempts to join. If specified, the is_access_code_required property of the channel resource is set to true.")
  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessCode() {
    return accessCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  public GcCreateChannelData inviterId(String inviterId) {
    this.inviterId = inviterId;
    return this;
  }

   /**
   * Specifies the ID of the user who has invited other users as members of the channel. The inviter is not automatically registered to the channel as a member, so you should specify the ID of the inviter in the user_ids property below if needed.
   * @return inviterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the ID of the user who has invited other users as members of the channel. The inviter is not automatically registered to the channel as a member, so you should specify the ID of the inviter in the user_ids property below if needed.")
  @JsonProperty(JSON_PROPERTY_INVITER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInviterId() {
    return inviterId;
  }


  @JsonProperty(JSON_PROPERTY_INVITER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInviterId(String inviterId) {
    this.inviterId = inviterId;
  }


  public GcCreateChannelData strict(Boolean strict) {
    this.strict = strict;
    return this;
  }

   /**
   * Determines whether to receive a &#x60;400111&#x60; error and cease channel creation when there is at least one non-existing user in the specified user_ids or users property above. If set to false, the channel will be created excluding the non-existing users without receiving the mentioned error. (Default: false)
   * @return strict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to receive a `400111` error and cease channel creation when there is at least one non-existing user in the specified user_ids or users property above. If set to false, the channel will be created excluding the non-existing users without receiving the mentioned error. (Default: false)")
  @JsonProperty(JSON_PROPERTY_STRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStrict() {
    return strict;
  }


  @JsonProperty(JSON_PROPERTY_STRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrict(Boolean strict) {
    this.strict = strict;
  }


  public GcCreateChannelData invitationStatus(Object invitationStatus) {
    this.invitationStatus = invitationStatus;
    return this;
  }

   /**
   * Specifies one or more key-value pair items which set the invitation status of each user invited to the channel. The key should be a user_id and the value should be their joining status. Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)
   * @return invitationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies one or more key-value pair items which set the invitation status of each user invited to the channel. The key should be a user_id and the value should be their joining status. Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)")
  @JsonProperty(JSON_PROPERTY_INVITATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getInvitationStatus() {
    return invitationStatus;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationStatus(Object invitationStatus) {
    this.invitationStatus = invitationStatus;
  }


  public GcCreateChannelData hiddenStatus(Object hiddenStatus) {
    this.hiddenStatus = hiddenStatus;
    return this;
  }

   /**
   * Specifies one or more key-value pair items which set the channel&#39;s hidden status for each user. The key should be a user_id and the value should be their hidden status. Acceptable values are limited to the following:&lt;br /&gt;- unhidden (default): the channel is included in when retrieving a list of group channels.&lt;br /&gt;- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.&lt;br /&gt;- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.
   * @return hiddenStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies one or more key-value pair items which set the channel's hidden status for each user. The key should be a user_id and the value should be their hidden status. Acceptable values are limited to the following:<br />- unhidden (default): the channel is included in when retrieving a list of group channels.<br />- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.<br />- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.")
  @JsonProperty(JSON_PROPERTY_HIDDEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getHiddenStatus() {
    return hiddenStatus;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHiddenStatus(Object hiddenStatus) {
    this.hiddenStatus = hiddenStatus;
  }


  public GcCreateChannelData operatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
    return this;
  }

  public GcCreateChannelData addOperatorIdsItem(String operatorIdsItem) {
    if (this.operatorIds == null) {
      this.operatorIds = new ArrayList<>();
    }
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to register as operators of the channel. You should also include these IDs in the user_ids property to invite them to the channel as members. They can delete any messages in the channel, and also view all messages without any filtering or throttling. The maximum allowed number of operators per channel is 100.
   * @return operatorIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more IDs of users to register as operators of the channel. You should also include these IDs in the user_ids property to invite them to the channel as members. They can delete any messages in the channel, and also view all messages without any filtering or throttling. The maximum allowed number of operators per channel is 100.")
  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  public GcCreateChannelData blockSdkUserChannelJoin(Boolean blockSdkUserChannelJoin) {
    this.blockSdkUserChannelJoin = blockSdkUserChannelJoin;
    return this;
  }

   /**
   * Determines whether to block users from joining the channel through the Chat SDK. This parameter can be used in order to restrict the ways for users to join the channel, and only using the [join a channel](#2-join-a-channel) action can add a user to the channel. (Default: false)
   * @return blockSdkUserChannelJoin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to block users from joining the channel through the Chat SDK. This parameter can be used in order to restrict the ways for users to join the channel, and only using the [join a channel](#2-join-a-channel) action can add a user to the channel. (Default: false)")
  @JsonProperty(JSON_PROPERTY_BLOCK_SDK_USER_CHANNEL_JOIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBlockSdkUserChannelJoin() {
    return blockSdkUserChannelJoin;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_SDK_USER_CHANNEL_JOIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockSdkUserChannelJoin(Boolean blockSdkUserChannelJoin) {
    this.blockSdkUserChannelJoin = blockSdkUserChannelJoin;
  }


  /**
   * Return true if this gcCreateChannelData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcCreateChannelData gcCreateChannelData = (GcCreateChannelData) o;
    return Objects.equals(this.userIds, gcCreateChannelData.userIds) &&
        Objects.equals(this.users, gcCreateChannelData.users) &&
        Objects.equals(this.name, gcCreateChannelData.name) &&
        Objects.equals(this.channelUrl, gcCreateChannelData.channelUrl) &&
        Objects.equals(this.coverUrl, gcCreateChannelData.coverUrl) &&
        Objects.equals(this.coverFile, gcCreateChannelData.coverFile) &&
        Objects.equals(this.customType, gcCreateChannelData.customType) &&
        Objects.equals(this.data, gcCreateChannelData.data) &&
        Objects.equals(this.isDistinct, gcCreateChannelData.isDistinct) &&
        Objects.equals(this.isPublic, gcCreateChannelData.isPublic) &&
        Objects.equals(this.isSuper, gcCreateChannelData.isSuper) &&
        Objects.equals(this.isEphemeral, gcCreateChannelData.isEphemeral) &&
        Objects.equals(this.accessCode, gcCreateChannelData.accessCode) &&
        Objects.equals(this.inviterId, gcCreateChannelData.inviterId) &&
        Objects.equals(this.strict, gcCreateChannelData.strict) &&
        Objects.equals(this.invitationStatus, gcCreateChannelData.invitationStatus) &&
        Objects.equals(this.hiddenStatus, gcCreateChannelData.hiddenStatus) &&
        Objects.equals(this.operatorIds, gcCreateChannelData.operatorIds) &&
        Objects.equals(this.blockSdkUserChannelJoin, gcCreateChannelData.blockSdkUserChannelJoin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, users, name, channelUrl, coverUrl, coverFile, customType, data, isDistinct, isPublic, isSuper, isEphemeral, accessCode, inviterId, strict, invitationStatus, hiddenStatus, operatorIds, blockSdkUserChannelJoin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcCreateChannelData {\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    coverFile: ").append(toIndentedString(coverFile)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isDistinct: ").append(toIndentedString(isDistinct)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isSuper: ").append(toIndentedString(isSuper)).append("\n");
    sb.append("    isEphemeral: ").append(toIndentedString(isEphemeral)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    inviterId: ").append(toIndentedString(inviterId)).append("\n");
    sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
    sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
    sb.append("    hiddenStatus: ").append(toIndentedString(hiddenStatus)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
    sb.append("    blockSdkUserChannelJoin: ").append(toIndentedString(blockSdkUserChannelJoin)).append("\n");
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

