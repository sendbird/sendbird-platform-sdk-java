

# SendBirdUserMessageParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appleCriticalAlertOptions** | [**SendBirdAppleCriticalAlertOptions**](SendBirdAppleCriticalAlertOptions.md) |  |  [optional]
**customType** | **String** |  |  [optional]
**data** | **String** |  |  [optional]
**isReplyToChannel** | **Boolean** |  |  [optional]
**mentionType** | [**MentionTypeEnum**](#MentionTypeEnum) |  |  [optional]
**mentionedUserIds** | **List&lt;String&gt;** |  |  [optional]
**mentionedUsers** | [**List&lt;SendBirdUser&gt;**](SendBirdUser.md) |  |  [optional]
**message** | **String** |  |  [optional]
**metaArrayKeys** | **List&lt;String&gt;** |  |  [optional]
**metaArrays** | [**List&lt;SendBirdMessageMetaArray&gt;**](SendBirdMessageMetaArray.md) |  |  [optional]
**parentMessageId** | **BigDecimal** |  |  [optional]
**pollId** | **BigDecimal** |  |  [optional]
**pushNotificationDeliveryOption** | [**PushNotificationDeliveryOptionEnum**](#PushNotificationDeliveryOptionEnum) |  |  [optional]
**targetLanguages** | **List&lt;String&gt;** |  |  [optional]
**translationTargetLanguages** | **List&lt;String&gt;** |  |  [optional]



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



