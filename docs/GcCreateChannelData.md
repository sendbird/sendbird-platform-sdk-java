

# GcCreateChannelData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userIds** | **List&lt;String&gt;** | Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The users below and this property can be used interchangeably. |  |
|**users** | **List&lt;String&gt;** | Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The user_ids above and this property can be used interchangeably. |  |
|**name** | **String** | Specifies the name of the channel, or the channel topic. The length is limited to 191 characters. (Default: group channel) |  |
|**channelUrl** | **String** | Specifies the URL of the channel. Only numbers, characters, and underscores are allowed. The length is 4 to 100 characters, inclusive. If not specified, a URL is automatically generated. |  |
|**coverUrl** | **String** | Specifies the URL of the cover image for the channel. The length is limited to 2,048 characters. |  |
|**coverFile** | **File** | Uploads the cover image file for the channel. |  |
|**customType** | **String** | Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views. |  |
|**data** | **String** | Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string. |  |
|**isDistinct** | **Boolean** | Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the same users in the user_ids or users property or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)&lt;br /&gt;&lt;br /&gt; Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name. |  |
|**isPublic** | **Boolean** | Determines whether to allow a user to join the channel without an invitation. (Default: false) |  |
|**isSuper** | **Boolean** | Determines whether to allow the channel to accommodate more than 2,000 members. (Default: false) &lt;br/&gt;&lt;br/&gt; Supergroup channels are not supported with the is_distinct property and the property is false by default. |  |
|**isEphemeral** | **Boolean** | Determines whether to preserve the messages in the channel for the purpose of retrieving chat history. (Default: false) |  |
|**accessCode** | **String** | This parameter can only be used when the channel operator creates a public group channel. They can set an access code for the corresponding type of channel. The channel then requires the specified access code to a user who attempts to join. If specified, the is_access_code_required property of the channel resource is set to true. |  |
|**inviterId** | **String** | Specifies the ID of the user who has invited other users as members of the channel. The inviter is not automatically registered to the channel as a member, so you should specify the ID of the inviter in the user_ids property below if needed. |  |
|**strict** | **Boolean** | Determines whether to receive a &#x60;400111&#x60; error and cease channel creation when there is at least one non-existing user in the specified user_ids or users property above. If set to false, the channel will be created excluding the non-existing users without receiving the mentioned error. (Default: false) |  |
|**invitationStatus** | **List&lt;String&gt;** | Specifies an array of one or more information about the join status of each invited user to the channel. Each item of the array should be specified with a combination of the unique ID of a user in the user_ids or users property, a colon (:), and the user&#39;s join status (for example, user_id_1: join status). Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined) |  |
|**hiddenStatus** | **List&lt;String&gt;** | Specifies an array of one or more channel hidden statuses about whether to hide the channel from each invited user&#39;s list of group channels, and whether to automatically unhide the hidden channel when receiving a new message from other member of that channel. Each item of the array should be specified with a combination of the unique ID of a user in the user_ids or users property, a colon (:), and the channel hidden status (for example, user_id_1: channel hidden status). Acceptable values are limited to the following:&lt;br /&gt;- unhidden (default): the channel is included in when retrieving a list of group channels.&lt;br /&gt;- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.&lt;br /&gt;- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message. |  |
|**operatorIds** | **List&lt;Integer&gt;** | Specifies an array of one or more IDs of users to register as operators of the channel. You should also include these IDs in the user_ids property to invite them to the channel as members. They can delete any messages in the channel, and also view all messages without any filtering or throttling. The maximum allowed number of operators per channel is 100. |  |
|**blockSdkUserChannelJoin** | **Boolean** | Determines whether to block users from joining the channel through the Chat SDK. This parameter can be used in order to restrict the ways for users to join the channel, and only using the [join a channel](#2-join-a-channel) action can add a user to the channel. (Default: false) |  |



