# OpenChannelApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ocCancelTheRegistrationOfOperators**](OpenChannelApi.md#ocCancelTheRegistrationOfOperators) | **DELETE** /v3/open_channels/{channel_url}/operators | Cancel the registration of operators |
| [**ocCreateChannel**](OpenChannelApi.md#ocCreateChannel) | **POST** /v3/open_channels | Create a channel |
| [**ocDeleteChannelByUrl**](OpenChannelApi.md#ocDeleteChannelByUrl) | **DELETE** /v3/open_channels/{channel_url} | Delete a channel |
| [**ocListChannels**](OpenChannelApi.md#ocListChannels) | **GET** /v3/open_channels | List channels |
| [**ocListOperators**](OpenChannelApi.md#ocListOperators) | **GET** /v3/open_channels/{channel_url}/operators | List operators |
| [**ocListParticipants**](OpenChannelApi.md#ocListParticipants) | **GET** /v3/open_channels/{channel_url}/participants | List participants |
| [**ocRegisterOperators**](OpenChannelApi.md#ocRegisterOperators) | **POST** /v3/open_channels/{channel_url}/operators | Register operators |
| [**ocUpdateChannelByUrl**](OpenChannelApi.md#ocUpdateChannelByUrl) | **PUT** /v3/open_channels/{channel_url} | Update a channel |
| [**ocViewChannelByUrl**](OpenChannelApi.md#ocViewChannelByUrl) | **GET** /v3/open_channels/{channel_url} | View a channel |



## ocCancelTheRegistrationOfOperators

> ocCancelTheRegistrationOfOperators(channelUrl).operatorIds(operatorIds).apiToken(apiToken).deleteAll(deleteAll).execute();

Cancel the registration of operators

## Cancel the registration of operators

Cancels the registration of operators from an open channel but leave them as participants.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-cancel-the-registration-of-operators
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        List<String> operatorIds = Arrays.asList(); // List<String> | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        Boolean deleteAll = true; // Boolean | 
        try {
            api.ocCancelTheRegistrationOfOperators(channelUrl)
                .operatorIds(operatorIds)
                .apiToken(apiToken)
                .deleteAll(deleteAll)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocCancelTheRegistrationOfOperators");
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
| **channelUrl** | **String**|  | |
| **operatorIds** | **List&lt;String&gt;**|  | |
| **apiToken** | **String**|  | [optional] |
| **deleteAll** | **Boolean**|  | [optional] |

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


## ocCreateChannel

> SendBirdOpenChannel ocCreateChannel().apiToken(apiToken).ocCreateChannelData(ocCreateChannelData).execute();

Create a channel

## Create a channel

Creates an open channel.

>__Note__: Classic open channels created before the deprecation date of March 2021 will maintain their original form and functions. However, new applications created after December 15, 2020, will be able to create dynamic partitioning open channels only.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel

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
        OcCreateChannelData ocCreateChannelData = new OcCreateChannelData(); // OcCreateChannelData | 
        try {
            SendBirdOpenChannel result = api.ocCreateChannel()
                .apiToken(apiToken)
                .ocCreateChannelData(ocCreateChannelData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocCreateChannel");
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
| **ocCreateChannelData** | [**OcCreateChannelData**](OcCreateChannelData.md)|  | [optional] |

### Return type

[**SendBirdOpenChannel**](SendBirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## ocDeleteChannelByUrl

> OcDeleteChannelByUrl200Response ocDeleteChannelByUrl(channelUrl).apiToken(apiToken).execute();

Delete a channel

## Delete a channel

Deletes an open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-delete-a-channel
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            OcDeleteChannelByUrl200Response result = api.ocDeleteChannelByUrl(channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocDeleteChannelByUrl");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## ocListChannels

> OcListChannelsResponse ocListChannels().apiToken(apiToken).token(token).limit(limit).customTypes(customTypes).nameContains(nameContains).urlContains(urlContains).showFrozen(showFrozen).showMetadata(showMetadata).customType(customType).execute();

List channels

## List channels

Retrieves a list of open channels. You can query the list using various parameters.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-channels
----------------------------

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
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String customTypes = "customTypes_example"; // String | 
        String nameContains = "nameContains_example"; // String | 
        String urlContains = "urlContains_example"; // String | 
        Boolean showFrozen = true; // Boolean | 
        Boolean showMetadata = true; // Boolean | 
        String customType = "customType_example"; // String | 
        try {
            OcListChannelsResponse result = api.ocListChannels()
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .customTypes(customTypes)
                .nameContains(nameContains)
                .urlContains(urlContains)
                .showFrozen(showFrozen)
                .showMetadata(showMetadata)
                .customType(customType)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocListChannels");
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **customTypes** | **String**|  | [optional] |
| **nameContains** | **String**|  | [optional] |
| **urlContains** | **String**|  | [optional] |
| **showFrozen** | **Boolean**|  | [optional] |
| **showMetadata** | **Boolean**|  | [optional] |
| **customType** | **String**|  | [optional] |

### Return type

[**OcListChannelsResponse**](OcListChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## ocListOperators

> OcListOperatorsResponse ocListOperators(channelUrl).apiToken(apiToken).token(token).limit(limit).execute();

List operators

## List operators

Retrieves a list of operators of an open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-operators
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            OcListOperatorsResponse result = api.ocListOperators(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocListOperators");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**OcListOperatorsResponse**](OcListOperatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## ocListParticipants

> OcListParticipantsResponse ocListParticipants(channelUrl).apiToken(apiToken).token(token).limit(limit).execute();

List participants

## List participants

Retrieves a list of the participants of an open channel. A participant refers to a user who has entered the open channel and is currently online.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-participants
----------------------------

 `channel_url`
     Type: string
     Description: Specifies the URL of the channel to retrieve a list of participants in.

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            OcListParticipantsResponse result = api.ocListParticipants(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocListParticipants");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**OcListParticipantsResponse**](OcListParticipantsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## ocRegisterOperators

> OcDeleteChannelByUrl200Response ocRegisterOperators(channelUrl).apiToken(apiToken).ocRegisterOperatorsData(ocRegisterOperatorsData).execute();

Register operators

## Register operators

Registers one or more operators to an open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-register-operators
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        OcRegisterOperatorsData ocRegisterOperatorsData = new OcRegisterOperatorsData(); // OcRegisterOperatorsData | 
        try {
            OcDeleteChannelByUrl200Response result = api.ocRegisterOperators(channelUrl)
                .apiToken(apiToken)
                .ocRegisterOperatorsData(ocRegisterOperatorsData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocRegisterOperators");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **ocRegisterOperatorsData** | [**OcRegisterOperatorsData**](OcRegisterOperatorsData.md)|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## ocUpdateChannelByUrl

> SendBirdOpenChannel ocUpdateChannelByUrl(channelUrl).apiToken(apiToken).ocUpdateChannelByUrlData(ocUpdateChannelByUrlData).execute();

Update a channel

## Update a channel

Updates information on an open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-channel
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        OcUpdateChannelByUrlData ocUpdateChannelByUrlData = new OcUpdateChannelByUrlData(); // OcUpdateChannelByUrlData | 
        try {
            SendBirdOpenChannel result = api.ocUpdateChannelByUrl(channelUrl)
                .apiToken(apiToken)
                .ocUpdateChannelByUrlData(ocUpdateChannelByUrlData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocUpdateChannelByUrl");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **ocUpdateChannelByUrlData** | [**OcUpdateChannelByUrlData**](OcUpdateChannelByUrlData.md)|  | [optional] |

### Return type

[**SendBirdOpenChannel**](SendBirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## ocViewChannelByUrl

> SendBirdOpenChannel ocViewChannelByUrl(channelUrl).apiToken(apiToken).execute();

View a channel

## View a channel

Retrieves information on a specific open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-channel
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            SendBirdOpenChannel result = api.ocViewChannelByUrl(channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OpenChannelApi#ocViewChannelByUrl");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdOpenChannel**](SendBirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

