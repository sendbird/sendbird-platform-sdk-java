

# SendTextMessageRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**message** | **String** |  |  |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Specifies the type of the message. The value of MESG represents a text message. |  |
|**pollId** | **Integer** |  |  [optional] |
|**pushMessageTemplate** | [**SendTextMessageRequestBodyPushMessageTemplate**](SendTextMessageRequestBodyPushMessageTemplate.md) |  |  [optional] |
|**sendPush** | **Boolean** |  |  [optional] |
|**sortedMetaarray** | [**List&lt;SendbirdSortedMetaarrayInner&gt;**](SendbirdSortedMetaarrayInner.md) |  |  [optional] |
|**sound** | **String** |  |  [optional] |
|**volume** | **BigDecimal** |  |  [optional] |



## Enum: MentionTypeEnum

| Name | Value |
|---- | -----|
| USERS | &quot;users&quot; |
| CHANNEL | &quot;channel&quot; |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| MESG | &quot;MESG&quot; |



