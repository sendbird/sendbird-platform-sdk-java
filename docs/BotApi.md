# BotApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBot**](BotApi.md#createBot) | **POST** /v3/bots | Create a bot |
| [**deleteBotById**](BotApi.md#deleteBotById) | **DELETE** /v3/bots/{bot_userid} | Delete a bot |
| [**joinChannels**](BotApi.md#joinChannels) | **POST** /v3/bots/{bot_userid}/channels | Join channels |
| [**leaveChannels**](BotApi.md#leaveChannels) | **DELETE** /v3/bots/{bot_userid}/channels | Leave channels - When leaving all channels |
| [**leaveChannelsByUrl**](BotApi.md#leaveChannelsByUrl) | **DELETE** /v3/bots/{bot_userid}/channels/{channel_url} | Leave channels - When leaving a channel by its channel URL |
| [**listBots**](BotApi.md#listBots) | **GET** /v3/bots | List bots |
| [**sendBotsMessage**](BotApi.md#sendBotsMessage) | **POST** /v3/bots/{bot_userid}/send | Send a bot&#39;s message |
| [**updateBotById**](BotApi.md#updateBotById) | **PUT** /v3/bots/{bot_userid} | Update a bot |
| [**viewBotById**](BotApi.md#viewBotById) | **GET** /v3/bots/{bot_userid} | View a bot |



## createBot

> CreateBotResponse createBot().apiToken(apiToken).createBotData(createBotData).execute();

Create a bot

## Create a bot

Creates a new bot within the application. Creating a bot is similar to creating a normal user, except that a callback URL is specified in order for the bot to receive events.

> __Note__: The bot must [join](#2-join-channels) a group channel first to interact with users. In group channels, you can invite a bot through the [invite as members](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members) action instead.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-create-a-bot

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        CreateBotData createBotData = new CreateBotData(); // CreateBotData | 
        try {
            CreateBotResponse result = api.createBot()
                .apiToken(apiToken)
                .createBotData(createBotData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#createBot");
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
| **createBotData** | [**CreateBotData**](CreateBotData.md)|  | [optional] |

### Return type

[**CreateBotResponse**](CreateBotResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteBotById

> Object deleteBotById(botUserid).apiToken(apiToken).execute();

Delete a bot

## Delete a bot

Deletes a bot from an application.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-delete-a-bot
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String botUserid = "botUserid_example"; // String | 
        try {
            Object result = api.deleteBotById(botUserid)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#deleteBotById");
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
| **botUserid** | **String**|  | |

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


## joinChannels

> JoinChannelsResponse joinChannels(botUserid).apiToken(apiToken).joinChannelsData(joinChannelsData).execute();

Join channels

## Join channels

Makes a bot join one or more channels.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-join-channels
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String botUserid = "botUserid_example"; // String | 
        JoinChannelsData joinChannelsData = new JoinChannelsData(); // JoinChannelsData | 
        try {
            JoinChannelsResponse result = api.joinChannels(botUserid)
                .apiToken(apiToken)
                .joinChannelsData(joinChannelsData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#joinChannels");
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
| **botUserid** | **String**|  | |
| **joinChannelsData** | [**JoinChannelsData**](JoinChannelsData.md)|  | [optional] |

### Return type

[**JoinChannelsResponse**](JoinChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## leaveChannels

> leaveChannels(botUserid).apiToken(apiToken).channelUrl(channelUrl).execute();

Leave channels - When leaving all channels

## Leave channels

Makes a bot leave one or more group channels.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String botUserid = "botUserid_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        try {
            api.leaveChannels(botUserid)
                .apiToken(apiToken)
                .channelUrl(channelUrl)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#leaveChannels");
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
| **botUserid** | **String**|  | |
| **channelUrl** | **String**|  | [optional] |

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


## leaveChannelsByUrl

> Object leaveChannelsByUrl(botUserid, channelUrl).apiToken(apiToken).execute();

Leave channels - When leaving a channel by its channel URL

## Leave channels

Makes a bot leave one or more group channels.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String botUserid = "botUserid_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        try {
            Object result = api.leaveChannelsByUrl(botUserid, channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#leaveChannelsByUrl");
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
| **botUserid** | **String**|  | |
| **channelUrl** | **String**|  | |

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


## listBots

> ListBotsResponse listBots().apiToken(apiToken).token(token).limit(limit).execute();

List bots

## List bots

Retrieves a list of all bots within an application.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListBotsResponse result = api.listBots()
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#listBots");
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListBotsResponse**](ListBotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## sendBotsMessage

> SendBirdMessageResponse sendBotsMessage(botUserid).apiToken(apiToken).sendBotSMessageData(sendBotSMessageData).execute();

Send a bot&#39;s message

## Send a bot's message

Sends a bot's message to a channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-send-a-bot-s-message
----------------------------

 `bot_userid`
     Type: string
     Description: Specifies the ID of the bot to send a message.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String botUserid = "botUserid_example"; // String | 
        SendBotSMessageData sendBotSMessageData = new SendBotSMessageData(); // SendBotSMessageData | 
        try {
            SendBirdMessageResponse result = api.sendBotsMessage(botUserid)
                .apiToken(apiToken)
                .sendBotSMessageData(sendBotSMessageData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#sendBotsMessage");
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
| **botUserid** | **String**|  | |
| **sendBotSMessageData** | [**SendBotSMessageData**](SendBotSMessageData.md)|  | [optional] |

### Return type

[**SendBirdMessageResponse**](SendBirdMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateBotById

> UpdateBotByIdResponse updateBotById(botUserid).apiToken(apiToken).updateBotByIdData(updateBotByIdData).execute();

Update a bot

## Update a bot

Updates information on a bot.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-update-a-bot
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String botUserid = "botUserid_example"; // String | 
        UpdateBotByIdData updateBotByIdData = new UpdateBotByIdData(); // UpdateBotByIdData | 
        try {
            UpdateBotByIdResponse result = api.updateBotById(botUserid)
                .apiToken(apiToken)
                .updateBotByIdData(updateBotByIdData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#updateBotById");
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
| **botUserid** | **String**|  | |
| **updateBotByIdData** | [**UpdateBotByIdData**](UpdateBotByIdData.md)|  | [optional] |

### Return type

[**UpdateBotByIdResponse**](UpdateBotByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewBotById

> ViewBotByIdResponse viewBotById(botUserid).apiToken(apiToken).execute();

View a bot

## View a bot

Retrieves information on a bot.

https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-view-a-bot
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        BotApi apiInstance = new BotApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String botUserid = "botUserid_example"; // String | 
        try {
            ViewBotByIdResponse result = api.viewBotById(botUserid)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#viewBotById");
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
| **botUserid** | **String**|  | |

### Return type

[**ViewBotByIdResponse**](ViewBotByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

