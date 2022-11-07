# MetadataApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChannelMetacounter**](MetadataApi.md#createChannelMetacounter) | **POST** /v3/{channel_type}/{channel_url}/metacounter | Create a channel metacounter |
| [**createChannelMetadata**](MetadataApi.md#createChannelMetadata) | **POST** /v3/{channel_type}/{channel_url}/metadata | Create a channel metadata |
| [**createUserMetadata**](MetadataApi.md#createUserMetadata) | **POST** /v3/users/{user_id}/metadata | Create a user metadata |
| [**deleteChannelMetacounter**](MetadataApi.md#deleteChannelMetacounter) | **DELETE** /v3/{channel_type}/{channel_url}/metacounter | Delete a channel metacounter - When deleting all items of a channel metacounter |
| [**deleteChannelMetacounterByKey**](MetadataApi.md#deleteChannelMetacounterByKey) | **DELETE** /v3/{channel_type}/{channel_url}/metacounter/{key} | Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key |
| [**deleteChannelMetadata**](MetadataApi.md#deleteChannelMetadata) | **DELETE** /v3/{channel_type}/{channel_url}/metadata | Delete a channel metadata - When deleting all items of a channel metadata |
| [**deleteChannelMetadataByKey**](MetadataApi.md#deleteChannelMetadataByKey) | **DELETE** /v3/{channel_type}/{channel_url}/metadata/{key} | Delete a channel metadata - When deleting a specific item of a channel metadata by its key |
| [**deleteUserMetadata**](MetadataApi.md#deleteUserMetadata) | **DELETE** /v3/users/{user_id}/metadata | Delete a user metadata - When deleting all items of a user metadata |
| [**deleteUserMetadataByKey**](MetadataApi.md#deleteUserMetadataByKey) | **DELETE** /v3/users/{user_id}/metadata/{key} | Delete a user metadata - When deleting a specific item of a user metadata by its key |
| [**updateChannelMetacounter**](MetadataApi.md#updateChannelMetacounter) | **PUT** /v3/{channel_type}/{channel_url}/metacounter | Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter |
| [**updateChannelMetacounterByKey**](MetadataApi.md#updateChannelMetacounterByKey) | **PUT** /v3/{channel_type}/{channel_url}/metacounter/{key} | Update a channel metacounter - When updating a specific item of a channel metacounter by its key |
| [**updateChannelMetadata**](MetadataApi.md#updateChannelMetadata) | **PUT** /v3/{channel_type}/{channel_url}/metadata | Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata |
| [**updateChannelMetadataByKey**](MetadataApi.md#updateChannelMetadataByKey) | **PUT** /v3/{channel_type}/{channel_url}/metadata/{key} | Update a channel metadata - When updating a specific item of a channel metadata by its key |
| [**updateUserMetadata**](MetadataApi.md#updateUserMetadata) | **PUT** /v3/users/{user_id}/metadata | Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata |
| [**updateUserMetadataByKey**](MetadataApi.md#updateUserMetadataByKey) | **PUT** /v3/users/{user_id}/metadata/{key} | Update a user metadata - When updating a specific item of a user metadata by its key |
| [**viewChannelMetacounter**](MetadataApi.md#viewChannelMetacounter) | **GET** /v3/{channel_type}/{channel_url}/metacounter | View a channel metacounter - When retrieving all items of a channel metacounter |
| [**viewChannelMetacounterByKey**](MetadataApi.md#viewChannelMetacounterByKey) | **GET** /v3/{channel_type}/{channel_url}/metacounter/{key} | View a channel metacounter - When retrieving a specific item of a channel metacounter by its key |
| [**viewChannelMetadata**](MetadataApi.md#viewChannelMetadata) | **GET** /v3/{channel_type}/{channel_url}/metadata | View a channel metadata - When retrieving all items of a channel metadata |
| [**viewChannelMetadataByKey**](MetadataApi.md#viewChannelMetadataByKey) | **GET** /v3/{channel_type}/{channel_url}/metadata/{key} | View a channel metadata - When retrieving a specific item of a channel metadata by its key |
| [**viewUserMetadata**](MetadataApi.md#viewUserMetadata) | **GET** /v3/users/{user_id}/metadata | View a user metadata - When retrieving all items of a user metadata |
| [**viewUserMetadataByKey**](MetadataApi.md#viewUserMetadataByKey) | **GET** /v3/users/{user_id}/metadata/{key} | View a user metadata - When retrieving a specific item of a user metadata by its key |



## createChannelMetacounter

> Object createChannelMetacounter(channelType, channelUrl).apiToken(apiToken).createChannelMetacounterData(createChannelMetacounterData).execute();

Create a channel metacounter

## Create a channel metacounter

Creates a channel metacounter's items to store in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metacounter
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        CreateChannelMetacounterData createChannelMetacounterData = new CreateChannelMetacounterData(); // CreateChannelMetacounterData | 
        try {
            Object result = api.createChannelMetacounter(channelType, channelUrl)
                .apiToken(apiToken)
                .createChannelMetacounterData(createChannelMetacounterData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#createChannelMetacounter");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **createChannelMetacounterData** | [**CreateChannelMetacounterData**](CreateChannelMetacounterData.md)|  | [optional] |

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


## createChannelMetadata

> CreateChannelMetadataResponse createChannelMetadata(channelType, channelUrl).apiToken(apiToken).createChannelMetadataData(createChannelMetadataData).execute();

Create a channel metadata

## Create a channel metadata

Creates a channel metadata's items to store in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        CreateChannelMetadataData createChannelMetadataData = new CreateChannelMetadataData(); // CreateChannelMetadataData | 
        try {
            CreateChannelMetadataResponse result = api.createChannelMetadata(channelType, channelUrl)
                .apiToken(apiToken)
                .createChannelMetadataData(createChannelMetadataData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#createChannelMetadata");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **createChannelMetadataData** | [**CreateChannelMetadataData**](CreateChannelMetadataData.md)|  | [optional] |

### Return type

[**CreateChannelMetadataResponse**](CreateChannelMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## createUserMetadata

> CreateUserMetadataResponse createUserMetadata(userId).apiToken(apiToken).createUserMetadataData(createUserMetadataData).execute();

Create a user metadata

## Create a user metadata

Creates a user metadata's items to store in a user.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-user-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String userId = "userId_example"; // String | 
        CreateUserMetadataData createUserMetadataData = new CreateUserMetadataData(); // CreateUserMetadataData | 
        try {
            CreateUserMetadataResponse result = api.createUserMetadata(userId)
                .apiToken(apiToken)
                .createUserMetadataData(createUserMetadataData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#createUserMetadata");
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **createUserMetadataData** | [**CreateUserMetadataData**](CreateUserMetadataData.md)|  | [optional] |

### Return type

[**CreateUserMetadataResponse**](CreateUserMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteChannelMetacounter

> deleteChannelMetacounter(channelType, channelUrl).apiToken(apiToken).execute();

Delete a channel metacounter - When deleting all items of a channel metacounter

## Delete a channel metacounter

Deletes a channel metacounter's item that is stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the channel which has the metacounter to delete.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        try {
            api.deleteChannelMetacounter(channelType, channelUrl)
                .apiToken(apiToken)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#deleteChannelMetacounter");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteChannelMetacounterByKey

> deleteChannelMetacounterByKey(channelType, channelUrl, key).apiToken(apiToken).execute();

Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key

## Delete a channel metacounter

Deletes a channel metacounter's item that is stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the channel which has the metacounter to delete.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        try {
            api.deleteChannelMetacounterByKey(channelType, channelUrl, key)
                .apiToken(apiToken)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#deleteChannelMetacounterByKey");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteChannelMetadata

> deleteChannelMetadata(channelType, channelUrl).apiToken(apiToken).key(key).execute();

Delete a channel metadata - When deleting all items of a channel metadata

## Delete a channel metadata

Deletes a channel metadata's one or all items that are stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        try {
            api.deleteChannelMetadata(channelType, channelUrl)
                .apiToken(apiToken)
                .key(key)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#deleteChannelMetadata");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteChannelMetadataByKey

> deleteChannelMetadataByKey(channelType, channelUrl, key).apiToken(apiToken).execute();

Delete a channel metadata - When deleting a specific item of a channel metadata by its key

## Delete a channel metadata

Deletes a channel metadata's one or all items that are stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        try {
            api.deleteChannelMetadataByKey(channelType, channelUrl, key)
                .apiToken(apiToken)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#deleteChannelMetadataByKey");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteUserMetadata

> deleteUserMetadata(userId).apiToken(apiToken).key(key).execute();

Delete a user metadata - When deleting all items of a user metadata

## Delete a user metadata

Deletes a user metadata's one or all items that are stored in a user.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata
----------------------------

 `user_id`
     Type: string
     Description: Specifies the ID of the user who has the metadata to delete.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String userId = "userId_example"; // String | 
        String key = "key_example"; // String | 
        try {
            api.deleteUserMetadata(userId)
                .apiToken(apiToken)
                .key(key)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#deleteUserMetadata");
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **key** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteUserMetadataByKey

> deleteUserMetadataByKey(userId, key).apiToken(apiToken).execute();

Delete a user metadata - When deleting a specific item of a user metadata by its key

## Delete a user metadata

Deletes a user metadata's one or all items that are stored in a user.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata
----------------------------

 `user_id`
     Type: string
     Description: Specifies the ID of the user who has the metadata to delete.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String userId = "userId_example"; // String | 
        String key = "key_example"; // String | 
        try {
            api.deleteUserMetadataByKey(userId, key)
                .apiToken(apiToken)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#deleteUserMetadataByKey");
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **key** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateChannelMetacounter

> Object updateChannelMetacounter(channelType, channelUrl).apiToken(apiToken).updateChannelMetacounterData(updateChannelMetacounterData).execute();

Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter

## Update a channel metacounter

Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        UpdateChannelMetacounterData updateChannelMetacounterData = new UpdateChannelMetacounterData(); // UpdateChannelMetacounterData | 
        try {
            Object result = api.updateChannelMetacounter(channelType, channelUrl)
                .apiToken(apiToken)
                .updateChannelMetacounterData(updateChannelMetacounterData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#updateChannelMetacounter");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **updateChannelMetacounterData** | [**UpdateChannelMetacounterData**](UpdateChannelMetacounterData.md)|  | [optional] |

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


## updateChannelMetacounterByKey

> Map&lt;String, String&gt; updateChannelMetacounterByKey(channelType, channelUrl, key).apiToken(apiToken).body(body).execute();

Update a channel metacounter - When updating a specific item of a channel metacounter by its key

## Update a channel metacounter

Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        Object body = null; // Object | 
        try {
            Map<String, String> result = api.updateChannelMetacounterByKey(channelType, channelUrl, key)
                .apiToken(apiToken)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#updateChannelMetacounterByKey");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | |
| **body** | **Object**|  | [optional] |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateChannelMetadata

> Map&lt;String, String&gt; updateChannelMetadata(channelType, channelUrl).apiToken(apiToken).updateChannelMetadataData(updateChannelMetadataData).execute();

Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata

## Update a channel metadata

Updates existing items of a channel metadata by their keys, or adds new items to the metadata.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        UpdateChannelMetadataData updateChannelMetadataData = new UpdateChannelMetadataData(); // UpdateChannelMetadataData | 
        try {
            Map<String, String> result = api.updateChannelMetadata(channelType, channelUrl)
                .apiToken(apiToken)
                .updateChannelMetadataData(updateChannelMetadataData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#updateChannelMetadata");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **updateChannelMetadataData** | [**UpdateChannelMetadataData**](UpdateChannelMetadataData.md)|  | [optional] |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateChannelMetadataByKey

> Map&lt;String, String&gt; updateChannelMetadataByKey(channelType, channelUrl, key).apiToken(apiToken).body(body).execute();

Update a channel metadata - When updating a specific item of a channel metadata by its key

## Update a channel metadata

Updates existing items of a channel metadata by their keys, or adds new items to the metadata.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        Object body = null; // Object | 
        try {
            Map<String, String> result = api.updateChannelMetadataByKey(channelType, channelUrl, key)
                .apiToken(apiToken)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#updateChannelMetadataByKey");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | |
| **body** | **Object**|  | [optional] |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateUserMetadata

> UpdateUserMetadataResponse updateUserMetadata(userId).apiToken(apiToken).updateUserMetadataData(updateUserMetadataData).execute();

Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata

## Update a user metadata

Updates existing items of a user metadata by their keys, or adds new items to the metadata.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata
----------------------------

 `user_id`
     Type: string
     Description: Specifies the ID of the user to update the metadata in.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String userId = "userId_example"; // String | 
        UpdateUserMetadataData updateUserMetadataData = new UpdateUserMetadataData(); // UpdateUserMetadataData | 
        try {
            UpdateUserMetadataResponse result = api.updateUserMetadata(userId)
                .apiToken(apiToken)
                .updateUserMetadataData(updateUserMetadataData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#updateUserMetadata");
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **updateUserMetadataData** | [**UpdateUserMetadataData**](UpdateUserMetadataData.md)|  | [optional] |

### Return type

[**UpdateUserMetadataResponse**](UpdateUserMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateUserMetadataByKey

> Map&lt;String, String&gt; updateUserMetadataByKey(userId, key).apiToken(apiToken).body(body).execute();

Update a user metadata - When updating a specific item of a user metadata by its key

## Update a user metadata

Updates existing items of a user metadata by their keys, or adds new items to the metadata.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata
----------------------------

 `user_id`
     Type: string
     Description: Specifies the ID of the user to update the metadata in.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String userId = "userId_example"; // String | 
        String key = "key_example"; // String | 
        Object body = null; // Object | 
        try {
            Map<String, String> result = api.updateUserMetadataByKey(userId, key)
                .apiToken(apiToken)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#updateUserMetadataByKey");
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **key** | **String**|  | |
| **body** | **Object**|  | [optional] |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewChannelMetacounter

> Map&lt;String, String&gt; viewChannelMetacounter(channelType, channelUrl).apiToken(apiToken).key(key).keys(keys).execute();

View a channel metacounter - When retrieving all items of a channel metacounter

## View a channel metacounter

Retrieves channel metacounter's one or more items that are stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        List<String> keys = Arrays.asList(); // List<String> | 
        try {
            Map<String, String> result = api.viewChannelMetacounter(channelType, channelUrl)
                .apiToken(apiToken)
                .key(key)
                .keys(keys)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#viewChannelMetacounter");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | [optional] |
| **keys** | **List&lt;String&gt;**|  | [optional] |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewChannelMetacounterByKey

> Object viewChannelMetacounterByKey(channelType, channelUrl, key).apiToken(apiToken).execute();

View a channel metacounter - When retrieving a specific item of a channel metacounter by its key

## View a channel metacounter

Retrieves channel metacounter's one or more items that are stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        try {
            Object result = api.viewChannelMetacounterByKey(channelType, channelUrl, key)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#viewChannelMetacounterByKey");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | |

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


## viewChannelMetadata

> Map&lt;String, String&gt; viewChannelMetadata(channelType, channelUrl).apiToken(apiToken).key(key).keys(keys).execute();

View a channel metadata - When retrieving all items of a channel metadata

## View a channel metadata

Retrieves a channel metadata's one or more items that are stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        List<String> keys = Arrays.asList(); // List<String> | 
        try {
            Map<String, String> result = api.viewChannelMetadata(channelType, channelUrl)
                .apiToken(apiToken)
                .key(key)
                .keys(keys)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#viewChannelMetadata");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | [optional] |
| **keys** | **List&lt;String&gt;**|  | [optional] |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewChannelMetadataByKey

> Map&lt;String, String&gt; viewChannelMetadataByKey(channelType, channelUrl, key).apiToken(apiToken).execute();

View a channel metadata - When retrieving a specific item of a channel metadata by its key

## View a channel metadata

Retrieves a channel metadata's one or more items that are stored in a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String key = "key_example"; // String | 
        try {
            Map<String, String> result = api.viewChannelMetadataByKey(channelType, channelUrl, key)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#viewChannelMetadataByKey");
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
| **apiToken** | **String**|  | |
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **key** | **String**|  | |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewUserMetadata

> ViewUserMetadataResponse viewUserMetadata(userId).apiToken(apiToken).key(key).keys(keys).execute();

View a user metadata - When retrieving all items of a user metadata

## View a user metadata

Retrieves a user metadata's one or more items that are stored in a user.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata
----------------------------

 `user_id`
     Type: string
     Description: Specifies the ID of the user to retrieve the metadata in.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String userId = "userId_example"; // String | 
        String key = "key_example"; // String | 
        List<String> keys = Arrays.asList(); // List<String> | 
        try {
            ViewUserMetadataResponse result = api.viewUserMetadata(userId)
                .apiToken(apiToken)
                .key(key)
                .keys(keys)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#viewUserMetadata");
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **key** | **String**|  | [optional] |
| **keys** | **List&lt;String&gt;**|  | [optional] |

### Return type

[**ViewUserMetadataResponse**](ViewUserMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewUserMetadataByKey

> Map&lt;String, String&gt; viewUserMetadataByKey(userId, key).apiToken(apiToken).execute();

View a user metadata - When retrieving a specific item of a user metadata by its key

## View a user metadata

Retrieves a user metadata's one or more items that are stored in a user.

https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata
----------------------------

 `user_id`
     Type: string
     Description: Specifies the ID of the user to retrieve the metadata in.

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String userId = "userId_example"; // String | 
        String key = "key_example"; // String | 
        try {
            Map<String, String> result = api.viewUserMetadataByKey(userId, key)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#viewUserMetadataByKey");
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **key** | **String**|  | |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

