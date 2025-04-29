# MetadataApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAChannelMetadata**](MetadataApi.md#createAChannelMetadata) | **POST** /v3/{channel_type}/{channel_url}/metadata | Create a channel metadata |
| [**deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata**](MetadataApi.md#deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata) | **DELETE** /v3/{channel_type}/{channel_url}/metadata | Delete a channel metadata - When deleting all items of a channel metadata |
| [**updateAChannelMetadata**](MetadataApi.md#updateAChannelMetadata) | **PUT** /v3/{channel_type}/{channel_url}/metadata | Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata |
| [**viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata**](MetadataApi.md#viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata) | **GET** /v3/{channel_type}/{channel_url}/metadata | View a channel metadata - When retrieving all items of a channel metadata |



## createAChannelMetadata

> CreateAChannelMetadataResponse createAChannelMetadata(channelType, channelUrl).apiToken(apiToken).createAChannelMetadataRequest(createAChannelMetadataRequest).execute();

Create a channel metadata

## Create a channel metadata

Creates a channel metadata's items to store in a channel.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-create-metadata#1-create-metadata
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        CreateAChannelMetadataRequest createAChannelMetadataRequest = new CreateAChannelMetadataRequest(); // CreateAChannelMetadataRequest | 
        try {
            CreateAChannelMetadataResponse result = api.createAChannelMetadata(channelType, channelUrl)
                .apiToken(apiToken)
                .createAChannelMetadataRequest(createAChannelMetadataRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#createAChannelMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelType** | **String**| (Required)  | [enum: open_channels, group_channels] |
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **createAChannelMetadataRequest** | [**CreateAChannelMetadataRequest**](CreateAChannelMetadataRequest.md)|  | [optional] |

### Return type

[**CreateAChannelMetadataResponse**](CreateAChannelMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata

> Object deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata(channelType, channelUrl).key(key).apiToken(apiToken).execute();

Delete a channel metadata - When deleting all items of a channel metadata

## Delete a channel metadata

Deletes a channel metadata's one or all items that are stored in a channel.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-delete-metadata#1-delete-metadata
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the channel which has the metadata to delete.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String key = "key_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata(channelType, channelUrl)
                .key(key)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelType** | **String**| (Required)  | [enum: open_channels, group_channels] |
| **channelUrl** | **String**| (Required)  | |
| **key** | **String**|  | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateAChannelMetadata

> Object updateAChannelMetadata(channelType, channelUrl).apiToken(apiToken).updateAChannelMetadataRequest(updateAChannelMetadataRequest).execute();

Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata

## Update a channel metadata

Updates existing items of a channel metadata by their keys, or adds new items to the metadata.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-update-metadata#1-update-metadata
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the target channel.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateAChannelMetadataRequest updateAChannelMetadataRequest = new UpdateAChannelMetadataRequest(); // UpdateAChannelMetadataRequest | 
        try {
            Object result = api.updateAChannelMetadata(channelType, channelUrl)
                .apiToken(apiToken)
                .updateAChannelMetadataRequest(updateAChannelMetadataRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#updateAChannelMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelType** | **String**| (Required)  | [enum: open_channels, group_channels] |
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **updateAChannelMetadataRequest** | [**UpdateAChannelMetadataRequest**](UpdateAChannelMetadataRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata

> Object viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata(channelType, channelUrl).key(key).keys(keys).apiToken(apiToken).execute();

View a channel metadata - When retrieving all items of a channel metadata

## View a channel metadata

Retrieves a channel metadata's one or more items that are stored in a channel.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-get-metadata#1-get-metadata
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the target channel.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String key = "key_example"; // String | 
        String keys = "keys_example"; // String | In a query string, specifies an array of one or more keys of the metadata items. If not specified, all items of the metadata are returned. If specified, only the items that match the parameter values are returned. URL encoding each key is recommended.
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata(channelType, channelUrl)
                .key(key)
                .keys(keys)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelType** | **String**| (Required)  | [enum: open_channels, group_channels] |
| **channelUrl** | **String**| (Required)  | |
| **key** | **String**|  | [optional] |
| **keys** | **String**| In a query string, specifies an array of one or more keys of the metadata items. If not specified, all items of the metadata are returned. If specified, only the items that match the parameter values are returned. URL encoding each key is recommended. | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

