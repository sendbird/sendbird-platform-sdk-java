

# SendBirdMigrateMessagesFileMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** |  |  |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  |
|**url** | **String** |  |  |
|**timestamp** | **Long** |  |  |
|**fileName** | **String** |  |  [optional] |
|**fileSize** | **Integer** |  |  [optional] |
|**fileType** | **String** |  |  [optional] |
|**thumbnails** | [**List&lt;SendBirdMigrateMessagesFileMessageRequestThumbnailsInner&gt;**](SendBirdMigrateMessagesFileMessageRequestThumbnailsInner.md) |  |  [optional] |
|**requireAuth** | **Boolean** |  |  [optional] |
|**customType** | **String** |  |  [optional] |
|**customField** | **String** |  |  [optional] |
|**mentionedUserIds** | **List&lt;String&gt;** |  |  [optional] |
|**dedupId** | **String** |  |  [optional] |
|**sortedMetaarray** | **List&lt;Object&gt;** |  |  [optional] |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;FILE&quot; |



