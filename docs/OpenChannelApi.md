# OpenChannelApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnOpenChannel**](OpenChannelApi.md#createAnOpenChannel) | **POST** /v3/open_channels | Create an open channel |
| [**deleteAnOpenChannel**](OpenChannelApi.md#deleteAnOpenChannel) | **DELETE** /v3/open_channels/{channel_url} | Delete an open channel |
| [**getAnOpenChannel**](OpenChannelApi.md#getAnOpenChannel) | **GET** /v3/open_channels/{channel_url} | Get an open channel |
| [**listChannelOperators**](OpenChannelApi.md#listChannelOperators) | **GET** /v3/open_channels/{channel_url}/operators | List operators of an open channel |
| [**listOpenChannels**](OpenChannelApi.md#listOpenChannels) | **GET** /v3/open_channels | List open channels |
| [**registerOperators**](OpenChannelApi.md#registerOperators) | **POST** /v3/open_channels/{channel_url}/operators | Register operators to an open channel |
| [**unregisterOperators**](OpenChannelApi.md#unregisterOperators) | **DELETE** /v3/open_channels/{channel_url}/operators | Unregister operators from an open channel |
| [**updateAnOpenChannel**](OpenChannelApi.md#updateAnOpenChannel) | **PUT** /v3/open_channels/{channel_url} | Update an open channel |



## createAnOpenChannel

> SendbirdOpenChannel createAnOpenChannel().apiToken(apiToken).createAnOpenChannelRequest(createAnOpenChannelRequest).execute();

Create an open channel

## Create an open channel

You can create an [open channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel) that facilitates conversations for millions of users. Open channels allow a seamless chat experience possible for all participants by using [dynamic partitioning](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#4-how-dynamic-partitioning-works) which creates subchannels that each handle up to tens of thousands of participants.

Because users don't need invitations to join open channels, short-lived live events like concerts or live streams that don't require a sustained membership are good use cases for open channels.

[https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        CreateAnOpenChannelRequest createAnOpenChannelRequest = new CreateAnOpenChannelRequest(); // CreateAnOpenChannelRequest | 
        try {
            SendbirdOpenChannel result = api.createAnOpenChannel()
                .apiToken(apiToken)
                .createAnOpenChannelRequest(createAnOpenChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#createAnOpenChannel");
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
| **apiToken** | **String**|  | [optional] |
| **createAnOpenChannelRequest** | [**CreateAnOpenChannelRequest**](CreateAnOpenChannelRequest.md)|  | [optional] |

### Return type

[**SendbirdOpenChannel**](SendbirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteAnOpenChannel

> Object deleteAnOpenChannel(channelUrl).apiToken(apiToken).execute();

Delete an open channel

## Delete an open channel

You can delete an open channel using this API. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/delete-an-open-channel#1-delete-an-open-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.deleteAnOpenChannel(channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#deleteAnOpenChannel");
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
| **channelUrl** | **String**| (Required)  | |
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


## getAnOpenChannel

> SendbirdOpenChannel getAnOpenChannel(channelUrl).apiToken(apiToken).includeOperators(includeOperators).execute();

Get an open channel

## Get an open channel

This action retrieves information about a specific [open channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel).

[https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/get-an-open-channel#1-get-an-open-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/get-an-open-channel#1-get-an-open-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        Boolean includeOperators = true; // Boolean | Determines whether to include a list of operators in the response. (Default: false)
        try {
            SendbirdOpenChannel result = api.getAnOpenChannel(channelUrl)
                .apiToken(apiToken)
                .includeOperators(includeOperators)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#getAnOpenChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **includeOperators** | **Boolean**| Determines whether to include a list of operators in the response. (Default: false) | [optional] |

### Return type

[**SendbirdOpenChannel**](SendbirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listChannelOperators

> ListOperatorsResponse listChannelOperators(channelUrl).token(token).limit(limit).apiToken(apiToken).execute();

List operators of an open channel

## List operators of an open channel

You can retrieve a list of operators of an open channel using this API.

https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/list-operators-of-an-open-channel#1-list-operators-of-an-open-channel

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to retrieve a list of operators.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListOperatorsResponse result = api.listChannelOperators(channelUrl)
                .token(token)
                .limit(limit)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#listChannelOperators");
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
| **channelUrl** | **String**| (Required)  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ListOperatorsResponse**](ListOperatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listOpenChannels

> ListOpenChannelsResponse listOpenChannels().token(token).channelUrls(channelUrls).limit(limit).customTypes(customTypes).nameContains(nameContains).urlContains(urlContains).showFrozen(showFrozen).showMetadata(showMetadata).apiToken(apiToken).execute();

List open channels

## List open channels

This action retrieves a list of [open channels](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel). You can use various query parameters to determine the search scope and select what kind of information you want to receive about the queried channels.

[https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-open-channels#1-list-open-channels](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-open-channels#1-list-open-channels)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String token = "token_example"; // String | 
        String channelUrls = "channelUrls_example"; // String | Specifies a comma-separated string of one or more open channel URLs to restrict the search scope. URL encoding each channel URL is recommended.
        Integer limit = 56; // Integer | 
        String customTypes = "customTypes_example"; // String | Specifies a comma-separated string of one or more custom types to filter open channels. Urlencoding each type is recommended (for example, ?custom_types=urlencoded_type_1,urlencoded_type_2). If not specified, all channels are returned, regardless of their custom type.
        String nameContains = "nameContains_example"; // String | 
        String urlContains = "urlContains_example"; // String | 
        Boolean showFrozen = true; // Boolean | Determines whether to include frozen channels in the response. Frozen channels are channels where only channel operators are allowed to send messages. (Default: true)
        Boolean showMetadata = true; // Boolean | Determines whether to include channel metadata in the response. (Default: false)
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListOpenChannelsResponse result = api.listOpenChannels()
                .token(token)
                .channelUrls(channelUrls)
                .limit(limit)
                .customTypes(customTypes)
                .nameContains(nameContains)
                .urlContains(urlContains)
                .showFrozen(showFrozen)
                .showMetadata(showMetadata)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#listOpenChannels");
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
| **token** | **String**|  | [optional] |
| **channelUrls** | **String**| Specifies a comma-separated string of one or more open channel URLs to restrict the search scope. URL encoding each channel URL is recommended. | [optional] |
| **limit** | **Integer**|  | [optional] |
| **customTypes** | **String**| Specifies a comma-separated string of one or more custom types to filter open channels. Urlencoding each type is recommended (for example, ?custom_types&#x3D;urlencoded_type_1,urlencoded_type_2). If not specified, all channels are returned, regardless of their custom type. | [optional] |
| **nameContains** | **String**|  | [optional] |
| **urlContains** | **String**|  | [optional] |
| **showFrozen** | **Boolean**| Determines whether to include frozen channels in the response. Frozen channels are channels where only channel operators are allowed to send messages. (Default: true) | [optional] |
| **showMetadata** | **Boolean**| Determines whether to include channel metadata in the response. (Default: false) | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ListOpenChannelsResponse**](ListOpenChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## registerOperators

> Object registerOperators(channelUrl).apiToken(apiToken).registerOperatorsToAGroupChannelRequest(registerOperatorsToAGroupChannelRequest).execute();

Register operators to an open channel

## Register operators to an open channel

You can register one or more operators to an open channel using this API.

https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/register-operators-to-an-open-channel#1-register-operators-to-an-open-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest = new RegisterOperatorsToAGroupChannelRequest(); // RegisterOperatorsToAGroupChannelRequest | 
        try {
            Object result = api.registerOperators(channelUrl)
                .apiToken(apiToken)
                .registerOperatorsToAGroupChannelRequest(registerOperatorsToAGroupChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#registerOperators");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **registerOperatorsToAGroupChannelRequest** | [**RegisterOperatorsToAGroupChannelRequest**](RegisterOperatorsToAGroupChannelRequest.md)|  | [optional] |

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


## unregisterOperators

> Object unregisterOperators(channelUrl).operatorIds(operatorIds).deleteAll(deleteAll).apiToken(apiToken).execute();

Unregister operators from an open channel

## Unregister operators from an open channel

You can unregister operators in an open channel but keep them in the channel as participants using this API.

https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/unregister-operators-from-an-open-channel#1-unregister-operators-from-an-open-channel

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to cancel the registration of operators.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String operatorIds = "operatorIds_example"; // String | Specifies an array of one or more operator IDs to unregister from the channel. The operators in this array remain as participants of the channel after losing their operational roles. Urlencoding each operator ID is recommended. An example of a Urlencoded array would be ?operator_ids=urlencoded_id_1,urlencoded_id_2.
        Boolean deleteAll = true; // Boolean | Determines whether to unregister all operators and leave them as the participants of the channel. When this is set to true, the operator_ids property isn't effective and doesn't need to be specified in the request. (Default: false)
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.unregisterOperators(channelUrl)
                .operatorIds(operatorIds)
                .deleteAll(deleteAll)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#unregisterOperators");
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
| **channelUrl** | **String**| (Required)  | |
| **operatorIds** | **String**| Specifies an array of one or more operator IDs to unregister from the channel. The operators in this array remain as participants of the channel after losing their operational roles. Urlencoding each operator ID is recommended. An example of a Urlencoded array would be ?operator_ids&#x3D;urlencoded_id_1,urlencoded_id_2. | |
| **deleteAll** | **Boolean**| Determines whether to unregister all operators and leave them as the participants of the channel. When this is set to true, the operator_ids property isn&#39;t effective and doesn&#39;t need to be specified in the request. (Default: false) | [optional] |
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


## updateAnOpenChannel

> SendbirdOpenChannel updateAnOpenChannel(channelUrl).apiToken(apiToken).updateAnOpenChannelRequest(updateAnOpenChannelRequest).execute();

Update an open channel

## Update an open channel

You can update information about an open channel using this API. You can add a cover image to a channel to better identify the channel or specify a custom channel type for grouping channels by custom type. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-an-open-channel#1-update-an-open-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateAnOpenChannelRequest updateAnOpenChannelRequest = new UpdateAnOpenChannelRequest(); // UpdateAnOpenChannelRequest | 
        try {
            SendbirdOpenChannel result = api.updateAnOpenChannel(channelUrl)
                .apiToken(apiToken)
                .updateAnOpenChannelRequest(updateAnOpenChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#updateAnOpenChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **updateAnOpenChannelRequest** | [**UpdateAnOpenChannelRequest**](UpdateAnOpenChannelRequest.md)|  | [optional] |

### Return type

[**SendbirdOpenChannel**](SendbirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

