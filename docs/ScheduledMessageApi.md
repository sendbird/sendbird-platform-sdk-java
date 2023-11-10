# ScheduledMessageApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost**](ScheduledMessageApi.md#v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost) | **POST** /v3/{channel_type}/{channel_url}/scheduled_messages/{scheduled_message_id}/send_now | Send a scheduled message immediately |
| [**v3GroupChannelsChannelUrlScheduledMessagesPost**](ScheduledMessageApi.md#v3GroupChannelsChannelUrlScheduledMessagesPost) | **POST** /v3/group_channels/{channel_url}/scheduled_messages | Create a scheduled message |
| [**v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete**](ScheduledMessageApi.md#v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete) | **DELETE** /v3/group_channels/{channel_url}/scheduled_messages/{scheduled_message_id} | Cancel a scheduled message |
| [**v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet**](ScheduledMessageApi.md#v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet) | **GET** /v3/group_channels/{channel_url}/scheduled_messages/{scheduled_message_id} | View a scheduled message |
| [**v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost**](ScheduledMessageApi.md#v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost) | **POST** /v3/group_channels/{channel_url}/scheduled_messages/{scheduled_message_id} | Update a scheduled message |
| [**v3ScheduledMessagesCountGet**](ScheduledMessageApi.md#v3ScheduledMessagesCountGet) | **GET** /v3/scheduled_messages/count | View number of scheduled messages |
| [**v3ScheduledMessagesGet**](ScheduledMessageApi.md#v3ScheduledMessagesGet) | **GET** /v3/scheduled_messages | List scheduled messages |



## v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost

> Object v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost(channelType, channelUrl, scheduledMessageId).apiToken(apiToken).execute();

Send a scheduled message immediately

## Send a scheduled message immediately
This action sends a scheduled message immediately. A user can only send their own scheduled messages immediately.
https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/send-a-scheduled-message-immediately
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ScheduledMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ScheduledMessageApi apiInstance = new ScheduledMessageApi(defaultClient);
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        Long scheduledMessageId = 56L; // Long | 
        String apiToken = "apiToken_example"; // String | 
        try {
            Object result = api.v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost(channelType, channelUrl, scheduledMessageId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledMessageApi#v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost");
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
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **scheduledMessageId** | **Long**|  | |
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


## v3GroupChannelsChannelUrlScheduledMessagesPost

> V3ScheduledMessagesGet200Response v3GroupChannelsChannelUrlScheduledMessagesPost(channelUrl).apiToken(apiToken).v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest).execute();

Create a scheduled message

## Create a scheduled message
This action creates a new scheduled message. If a user leaves the channel before the scheduled time for the message to be sent, the scheduled message will be removed.
https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/create-a-scheduled-message
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ScheduledMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ScheduledMessageApi apiInstance = new ScheduledMessageApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "apiToken_example"; // String | 
        V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest = new V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(); // V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest | 
        try {
            V3ScheduledMessagesGet200Response result = api.v3GroupChannelsChannelUrlScheduledMessagesPost(channelUrl)
                .apiToken(apiToken)
                .v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledMessageApi#v3GroupChannelsChannelUrlScheduledMessagesPost");
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
| **v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest** | [**V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest**](V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.md)|  | [optional] |

### Return type

[**V3ScheduledMessagesGet200Response**](V3ScheduledMessagesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete

> V3ScheduledMessagesGet200Response v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete(channelUrl, scheduledMessageId).apiToken(apiToken).execute();

Cancel a scheduled message

## Cancel a scheduled message
This action cancels a message that a user has scheduled to send at a later time.
https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/cancel-a-scheduled-message
-----------------------------                      

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ScheduledMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ScheduledMessageApi apiInstance = new ScheduledMessageApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        Long scheduledMessageId = 56L; // Long | 
        String apiToken = "apiToken_example"; // String | 
        try {
            V3ScheduledMessagesGet200Response result = api.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete(channelUrl, scheduledMessageId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledMessageApi#v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete");
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
| **scheduledMessageId** | **Long**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**V3ScheduledMessagesGet200Response**](V3ScheduledMessagesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet

> V3ScheduledMessagesGet200Response v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet(channelUrl, scheduledMessageId).apiToken(apiToken).execute();

View a scheduled message

## View a scheduled message
This action retrieves information on a specific scheduled message.
https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/view-a-scheduled-message
-----------------------------                      

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ScheduledMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ScheduledMessageApi apiInstance = new ScheduledMessageApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        Long scheduledMessageId = 56L; // Long | 
        String apiToken = "apiToken_example"; // String | 
        try {
            V3ScheduledMessagesGet200Response result = api.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet(channelUrl, scheduledMessageId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledMessageApi#v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet");
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
| **scheduledMessageId** | **Long**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**V3ScheduledMessagesGet200Response**](V3ScheduledMessagesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost

> V3ScheduledMessagesGet200Response v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost(channelUrl, scheduledMessageId).apiToken(apiToken).v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest).execute();

Update a scheduled message

## Update a scheduled message
This action updates information on a specific scheduled message. You can’t change the message type. Update operation should be done at least 5 minutes prior to the original scheduled time.
https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/update-a-scheduled-message
-----------------------------      

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ScheduledMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ScheduledMessageApi apiInstance = new ScheduledMessageApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        Long scheduledMessageId = 56L; // Long | 
        String apiToken = "apiToken_example"; // String | 
        V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest = new V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(); // V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest | 
        try {
            V3ScheduledMessagesGet200Response result = api.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost(channelUrl, scheduledMessageId)
                .apiToken(apiToken)
                .v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledMessageApi#v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost");
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
| **scheduledMessageId** | **Long**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest** | [**V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest**](V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest.md)|  | [optional] |

### Return type

[**V3ScheduledMessagesGet200Response**](V3ScheduledMessagesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3ScheduledMessagesCountGet

> V3ScheduledMessagesCountGet200Response v3ScheduledMessagesCountGet(channelType, channelUrl, senderId, status, messageType).apiToken(apiToken).execute();

View number of scheduled messages

## View number of scheduled messages
This action retrieves the total number of scheduled messages that a user has.
https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/view-number-of-scheduled-messages
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ScheduledMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ScheduledMessageApi apiInstance = new ScheduledMessageApi(defaultClient);
        String apiToken = "apiToken_example"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String senderId = "senderId_example"; // String | 
        List<Object> status = null; // List<Object> | 
        String messageType = "messageType_example"; // String | 
        try {
            V3ScheduledMessagesCountGet200Response result = api.v3ScheduledMessagesCountGet(channelType, channelUrl, senderId, status, messageType)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledMessageApi#v3ScheduledMessagesCountGet");
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
| **channelType** | **String**|  | [optional] |
| **channelUrl** | **String**|  | [optional] |
| **senderId** | **String**|  | [optional] |
| **status** | **List&lt;Object&gt;**|  | [optional] |
| **messageType** | **String**|  | [optional] |

### Return type

[**V3ScheduledMessagesCountGet200Response**](V3ScheduledMessagesCountGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3ScheduledMessagesGet

> V3ScheduledMessagesGet200Response v3ScheduledMessagesGet(channelType, channelUrl, senderId, token, limit, order, reverse, status, messageType).apiToken(apiToken).execute();

List scheduled messages

## List scheduled messages
This action retrieves a list of scheduled messages. A user can only see the list of their own scheduled messages.
https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/list-scheduled-messages
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ScheduledMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ScheduledMessageApi apiInstance = new ScheduledMessageApi(defaultClient);
        String apiToken = "apiToken_example"; // String | 
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String senderId = "senderId_example"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String order = "order_example"; // String | 
        Boolean reverse = true; // Boolean | 
        List<Object> status = null; // List<Object> | 
        String messageType = "messageType_example"; // String | 
        try {
            V3ScheduledMessagesGet200Response result = api.v3ScheduledMessagesGet(channelType, channelUrl, senderId, token, limit, order, reverse, status, messageType)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduledMessageApi#v3ScheduledMessagesGet");
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
| **channelType** | **String**|  | [optional] |
| **channelUrl** | **String**|  | [optional] |
| **senderId** | **String**|  | [optional] |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **order** | **String**|  | [optional] |
| **reverse** | **Boolean**|  | [optional] |
| **status** | **List&lt;Object&gt;**|  | [optional] |
| **messageType** | **String**|  | [optional] |

### Return type

[**V3ScheduledMessagesGet200Response**](V3ScheduledMessagesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

