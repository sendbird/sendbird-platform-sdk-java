# BotApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createABot**](BotApi.md#createABot) | **POST** /v3/bots | Create a bot |
| [**joinChannels**](BotApi.md#joinChannels) | **POST** /v3/bots/{bot_userid}/channels | Join channels |
| [**leaveAGroupChannel**](BotApi.md#leaveAGroupChannel) | **DELETE** /v3/bots/{bot_userid}/channels/{channel_url} | Leave channels - When leaving a specific channel |
| [**leaveGroupChannels**](BotApi.md#leaveGroupChannels) | **DELETE** /v3/bots/{bot_userid}/channels | Leave channels - When leaving all channels |
| [**listBots**](BotApi.md#listBots) | **GET** /v3/bots | List bots |
| [**sendABotMessage**](BotApi.md#sendABotMessage) | **POST** /v3/bots/{bot_userid}/send | Send a bot&#39;s message |



## createABot

> CreateABotResponse createABot().apiToken(apiToken).createABotRequest(createABotRequest).execute();

Create a bot

## Create a bot

Creates a new bot within an application. Creating a bot is similar to creating a normal user, except a callback URL should be specified for a bot to receive events.

> **Note**: The bot must first [join a group channel](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/join-channels) to interact with users. In group channels, you can also invite a bot through the [invite as members](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel) action. 
  

[https://sendbird.com/docs/chat/platform-api/v3/bot/creating-a-bot/create-a-bot#1-create-a-bot](https://sendbird.com/docs/chat/platform-api/v3/bot/creating-a-bot/create-a-bot#1-create-a-bot)

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
        CreateABotRequest createABotRequest = new CreateABotRequest(); // CreateABotRequest | 
        try {
            CreateABotResponse result = api.createABot()
                .apiToken(apiToken)
                .createABotRequest(createABotRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#createABot");
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
| **createABotRequest** | [**CreateABotRequest**](CreateABotRequest.md)|  | [optional] |

### Return type

[**CreateABotResponse**](CreateABotResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## joinChannels

> SendbirdGroupChannelDetail joinChannels(botUserid).apiToken(apiToken).joinChannelsRequest(joinChannelsRequest).execute();

Join channels

## Join channels

Makes a bot join one or more group channels.

[https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/join-channels#1-join-channels](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/join-channels#1-join-channels)

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
        String botUserid = "botUserid_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        JoinChannelsRequest joinChannelsRequest = new JoinChannelsRequest(); // JoinChannelsRequest | 
        try {
            SendbirdGroupChannelDetail result = api.joinChannels(botUserid)
                .apiToken(apiToken)
                .joinChannelsRequest(joinChannelsRequest)
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
| **botUserid** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **joinChannelsRequest** | [**JoinChannelsRequest**](JoinChannelsRequest.md)|  | [optional] |

### Return type

[**SendbirdGroupChannelDetail**](SendbirdGroupChannelDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## leaveAGroupChannel

> Object leaveAGroupChannel(channelUrl, botUserid).apiToken(apiToken).execute();

Leave channels - When leaving a specific channel

## Leave channels

Makes a bot leave a specific channel

[https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels)

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
        String channelUrl = "channelUrl_example"; // String | 
        String botUserid = "botUserid_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.leaveAGroupChannel(channelUrl, botUserid)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#leaveAGroupChannel");
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
| **botUserid** | **String**| (Required)  | |
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


## leaveGroupChannels

> Object leaveGroupChannels(botUserid).apiToken(apiToken).execute();

Leave channels - When leaving all channels

## Leave channels

Makes a bot leave all group channels.

[https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels)

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
        String botUserid = "botUserid_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.leaveGroupChannels(botUserid)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#leaveGroupChannels");
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
| **botUserid** | **String**| (Required)  | |
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


## listBots

> ListBotsResponse listBots().token(token).limit(limit).apiToken(apiToken).execute();

List bots

## List bots

Retrieves a list of all bots within an application.

https://sendbird.com/docs/chat/platform-api/v3/bot/listing-bots/list-bots#1-list-bots

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
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListBotsResponse result = api.listBots()
                .token(token)
                .limit(limit)
                .apiToken(apiToken)
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **apiToken** | **String**|  | [optional] |

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


## sendABotMessage

> SendbirdMessageResponse sendABotMessage(botUserid).apiToken(apiToken).sendABotMessageRequest(sendABotMessageRequest).execute();

Send a bot&#39;s message

## Send a bot message

Sends a bot message to a group channel.

[https://sendbird.com/docs/chat/platform-api/v3/bot/sending-a-bot-message/send-a-bot-message#1-send-a-bot-message](https://sendbird.com/docs/chat/platform-api/v3/bot/sending-a-bot-message/send-a-bot-message#1-send-a-bot-message)

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
        String botUserid = "botUserid_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        SendABotMessageRequest sendABotMessageRequest = new SendABotMessageRequest(); // SendABotMessageRequest | 
        try {
            SendbirdMessageResponse result = api.sendABotMessage(botUserid)
                .apiToken(apiToken)
                .sendABotMessageRequest(sendABotMessageRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#sendABotMessage");
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
| **botUserid** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **sendABotMessageRequest** | [**SendABotMessageRequest**](SendABotMessageRequest.md)|  | [optional] |

### Return type

[**SendbirdMessageResponse**](SendbirdMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

