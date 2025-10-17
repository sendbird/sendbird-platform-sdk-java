

# SendAMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  |
|**userId** | **String** |  |  |
|**message** | **String** | Specifies the content of the message. * This property is required when message_type is MESG or ADMM. |  [optional] |
|**pushMessageTemplate** | [**SendAMessageRequestPushMessageTemplate**](SendAMessageRequestPushMessageTemplate.md) |  |  [optional] |
|**pollId** | **Integer** | Specifies the ID of the poll to be associated with the message. * This property is only available for group channels and message_type is MESG. |  [optional] |
|**files** | [**SendBirdFile**](SendBirdFile.md) |  |  [optional] |
|**requireAuth** | **Boolean** | Determines whether to require an authentication key to verify if the file is being properly accessed. Only the user who uploaded the file or users who are in the channel where the file was uploaded should have access. The authentication key managed internally by the Sendbird system is generated every time a user logs in to the Sendbird server and is valid for three days starting from the last login. If set to false, Sendbird tries to access a file without any key. To access encrypted files, such as the files in the Sendbird server which are by default encrypted, the property must be set to true. (Default: false) The require_auth parameter only works if the file or URL is managed by Sendbird, which means that when you upload files using multipart format or provide URLs that point to the files hosted on the Sendbird server. However, if the file is hosted on a server or service that is not managed by Sendbird, access control and authentication for the file should be handled by the respective server or service hosting the file. |  [optional] |
|**thumbnail1** | **String** | Specifies the URL of the thumbnail of the file. * This property is available when message_type is FILE. |  [optional] |
|**thumbnail2** | **String** | Specifies the URL of the thumbnail of the file. * This property is available when message_type is FILE. |  [optional] |
|**thumbnail3** | **String** | Specifies the URL of the thumbnail of the file. * This property is available when message_type is FILE. |  [optional] |
|**thumbnails** | **List&lt;String&gt;** | Specifies the URL of the thumbnail of the file. * This property is available when message_type is FILE. |  [optional] |
|**apnsBundleId** | **String** |  |  [optional] |
|**appleCriticalAlertOptions** | **Object** |  |  [optional] |
|**createdAt** | **Long** |  |  [optional] |
|**customType** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**dedupId** | **String** |  |  [optional] |
|**includePollDetails** | **Boolean** |  |  [optional] |
|**isSilent** | **Boolean** |  |  [optional] |
|**markAsRead** | **Boolean** |  |  [optional] |
|**mentionType** | [**MentionTypeEnum**](#MentionTypeEnum) |  |  [optional] |
|**mentionedUserIds** | **List&lt;String&gt;** |  |  [optional] |
|**sendPush** | **Boolean** |  |  [optional] |
|**sortedMetaarray** | [**List&lt;SendBirdSortedMetaarrayInner&gt;**](SendBirdSortedMetaarrayInner.md) |  |  [optional] |
|**sound** | **String** |  |  [optional] |
|**volume** | **BigDecimal** |  |  [optional] |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| MESG | &quot;MESG&quot; |
| ADMM | &quot;ADMM&quot; |
| FILE | &quot;FILE&quot; |



## Enum: MentionTypeEnum

| Name | Value |
|---- | -----|
| USERS | &quot;users&quot; |
| CHANNEL | &quot;channel&quot; |



