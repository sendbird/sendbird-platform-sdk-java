

# SendBirdSendAdminMessageRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apnsBundleId** | **String** |  |  [optional] |
|**customType** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**dedupId** | **String** |  |  [optional] |
|**isSilent** | **Boolean** |  |  [optional] |
|**mentionType** | [**MentionTypeEnum**](#MentionTypeEnum) |  |  [optional] |
|**mentionedUserIds** | **List&lt;String&gt;** |  |  [optional] |
|**message** | **String** |  |  |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Specifies the type of the message. The value of ADMM represents an admin message. |  |
|**pushMessageTemplate** | [**SendBirdSendTextMessageRequestBodyPushMessageTemplate**](SendBirdSendTextMessageRequestBodyPushMessageTemplate.md) |  |  [optional] |
|**sendPush** | **Boolean** |  |  [optional] |
|**sortedMetaarray** | [**List&lt;SendBirdSendBirdSortedMetaarrayInner&gt;**](SendBirdSendBirdSortedMetaarrayInner.md) |  |  [optional] |



## Enum: MentionTypeEnum

| Name | Value |
|---- | -----|
| USERS | &quot;users&quot; |
| CHANNEL | &quot;channel&quot; |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| ADMM | &quot;ADMM&quot; |



