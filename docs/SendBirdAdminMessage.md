

# SendBirdAdminMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appleCriticalAlertOptions** | [**SendBirdAppleCriticalAlertOptions**](SendBirdAppleCriticalAlertOptions.md) |  |  [optional]
**channelType** | **String** |  |  [optional]
**channelUrl** | **String** |  |  [optional]
**createdAt** | **BigDecimal** |  |  [optional]
**customType** | **String** |  |  [optional]
**data** | **String** |  |  [optional]
**isReplyToChannel** | **Boolean** |  |  [optional]
**mentionType** | **String** |  |  [optional]
**mentionedUsers** | [**List&lt;SendBirdUser&gt;**](SendBirdUser.md) |  |  [optional]
**message** | **String** |  |  [optional]
**messageId** | **BigDecimal** |  |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  [optional]
**metaArray** | [**ModelObject**](ModelObject.md) |  |  [optional]
**metaArrays** | [**List&lt;SendBirdMessageMetaArray&gt;**](SendBirdMessageMetaArray.md) |  |  [optional]
**ogMetaData** | [**SendBirdOGMetaData**](SendBirdOGMetaData.md) |  |  [optional]
**parentMessage** | [**SendBirdMessageResponse**](SendBirdMessageResponse.md) |  |  [optional]
**parentMessageId** | **BigDecimal** |  |  [optional]
**parentMessageText** | **String** |  |  [optional]
**reactions** | [**List&lt;SendBirdReaction&gt;**](SendBirdReaction.md) |  |  [optional]
**sendingStatus** | [**SendingStatusEnum**](#SendingStatusEnum) |  |  [optional]
**silent** | **Boolean** |  |  [optional]
**threadInfo** | [**SendBirdThreadInfo**](SendBirdThreadInfo.md) |  |  [optional]
**translations** | [**ModelObject**](ModelObject.md) |  |  [optional]
**updatedAt** | **BigDecimal** |  |  [optional]



## Enum: MessageTypeEnum

Name | Value
---- | -----
MESG | &quot;MESG&quot;
ADMM | &quot;ADMM&quot;
FILE | &quot;FILE&quot;



## Enum: SendingStatusEnum

Name | Value
---- | -----
CANCELED | &quot;canceled&quot;
FAILED | &quot;failed&quot;
NONE | &quot;none&quot;
PENDING | &quot;pending&quot;
SUCCEEDED | &quot;succeeded&quot;



