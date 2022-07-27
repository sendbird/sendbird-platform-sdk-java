

# CreateChannelMetadataData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelType** | **String** | Specifies the type of the channel. Either open_channels or group_channels. |  |
|**channelUrl** | **String** | Specifies the URL of the channel to store the metadata in. |  |
|**metadata** | **Object** | Specifies a &#x60;JSON&#x60; object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items. |  |
|**includeTs** | **Boolean** | Determines whether to include the timestamp of when a metadata has been created in the response. (Default: false) |  [optional] |



