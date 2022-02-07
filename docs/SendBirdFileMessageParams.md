

# SendBirdFileMessageParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appleCriticalAlertOptions** | [**SendBirdAppleCriticalAlertOptions**](SendBirdAppleCriticalAlertOptions.md) |  |  [optional]
**customType** | **String** |  |  [optional]
**data** | **String** |  |  [optional]
**file** | [**Blob**](Blob.md) |  |  [optional]
**fileName** | **String** |  |  [optional]
**fileSize** | **BigDecimal** |  |  [optional]
**fileUrl** | **String** |  |  [optional]
**isReplyToChannel** | **Boolean** |  |  [optional]
**mentionType** | [**MentionTypeEnum**](#MentionTypeEnum) |  |  [optional]
**mentionedUserIds** | **List&lt;String&gt;** |  |  [optional]
**mentionedUsers** | [**List&lt;SendBirdUser&gt;**](SendBirdUser.md) |  |  [optional]
**metaArrayKeys** | **List&lt;String&gt;** |  |  [optional]
**metaArrays** | [**List&lt;SendBirdMessageMetaArray&gt;**](SendBirdMessageMetaArray.md) |  |  [optional]
**mimeType** | **String** |  |  [optional]
**parentMessageId** | **BigDecimal** |  |  [optional]
**pushNotificationDeliveryOption** | [**PushNotificationDeliveryOptionEnum**](#PushNotificationDeliveryOptionEnum) |  |  [optional]
**thumbnailSizes** | [**List&lt;SendBirdThumbnailSize&gt;**](SendBirdThumbnailSize.md) |  |  [optional]



## Enum: MentionTypeEnum

Name | Value
---- | -----
CHANNEL | &quot;channel&quot;
USERS | &quot;users&quot;



## Enum: PushNotificationDeliveryOptionEnum

Name | Value
---- | -----
DEFAULT | &quot;default&quot;
SUPPRESS | &quot;suppress&quot;



