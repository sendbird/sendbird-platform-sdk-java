

# UpdateMessageByIdData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channelType** | **String** | Specifies the type of the channel. Either open_channels or group_channels. |  [optional]
**channelUrl** | **String** | Specifies the URL of the target channel. |  [optional]
**messageId** | **Integer** | Specifies the unique ID of the message to update. | 
**messageType** | **String** | Specifies the type of the message as ADMM. |  [optional]
**message** | **String** | Specifies the content of the message. |  [optional]
**customType** | **String** | Specifies a custom message type which is used for message grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views. |  [optional]
**data** | **String** | Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string. |  [optional]
**mentionType** | **String** | Specifies the mentioning method which indicates the user scope who will get a notification for the message. Acceptable values are users and channel. If set to users, only the specified users with the mentioned_users property below will get notified. If set to channel, all users in the channel will get notified. (Default: users) |  [optional]
**mentionedUserIds** | **List&lt;Integer&gt;** | Specifies an array of one or more IDs of the users who will get a notification for the message. |  [optional]



