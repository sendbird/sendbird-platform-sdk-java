

# UpdateExtraDataInMessageData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channelType** | **String** | Specifies the type of the channel. Either open_channels or group_channels. | 
**channelUrl** | **String** | Specifies the URL of the target channel. | 
**messageId** | **Integer** | Specifies the unique ID of the message to update key-values items. | 
**sortedMetaarray** | **String** | Specifies a &#x60;JSON&#x60; object of one or more key-values items which store additional message information. Each item consists of a key and the values in an array. Items are saved and will be returned in the exact order they&#39;ve been specified. | 
**mode** | **String** | Determines whether to add the specified values in the items or remove the specified values from the existing items. Acceptable values are limited to add and remove. If set to add, the specified values are added only when they are different from the existing values. If set to remove, the specified values are removed only when they have the corresponding ones in the existing values. | 
**upsert** | **Boolean** | Determines whether to add new items in addition to updating existing items. If true, new key-values items are added when there are no items with the keys. The existing items are updated with new values when there are already items with the keys. If false, only the items of which keys match the ones you specify are updated with new values. (Default: false) | 



