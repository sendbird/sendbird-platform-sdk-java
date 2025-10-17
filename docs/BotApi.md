# BotApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createABot**](BotApi.md#createABot) | **POST** /v3/bots | Create a bot |
| [**deleteBotById**](BotApi.md#deleteBotById) | **DELETE** /v3/bots/{bot_userid} | Delete a bot |
| [**joinChannels**](BotApi.md#joinChannels) | **POST** /v3/bots/{bot_userid}/channels | Join channels |
| [**leaveAGroupChannel**](BotApi.md#leaveAGroupChannel) | **DELETE** /v3/bots/{bot_userid}/channels/{channel_url} | Leave channels - When leaving a specific channel |
| [**leaveGroupChannels**](BotApi.md#leaveGroupChannels) | **DELETE** /v3/bots/{bot_userid}/channels | Leave channels - When leaving all channels |
| [**listBots**](BotApi.md#listBots) | **GET** /v3/bots | List bots |
| [**sendABotMessage**](BotApi.md#sendABotMessage) | **POST** /v3/bots/{bot_userid}/send | Send a bot&#39;s message |
| [**updateBotById**](BotApi.md#updateBotById) | **PUT** /v3/bots/{bot_userid} | Update a bot |
| [**viewBotById**](BotApi.md#viewBotById) | **GET** /v3/bots/{bot_userid} | View a bot |



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
        String botUserid = "botUserid_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
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
| **botUserid** | **String**|  | |
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

> SendABotMessageResponse sendABotMessage(botUserid).messageType(messageType).channelUrl(channelUrl).apiToken(apiToken).message(message).mentioned(mentioned).extendedMessagePayload(extendedMessagePayload)._file(_file).requireAuth(requireAuth).mentionType(mentionType).mentionedUserIds(mentionedUserIds).isSilent(isSilent).sortedMetaarray(sortedMetaarray).apnsBundleId(apnsBundleId).appleCriticalAlertOptions(appleCriticalAlertOptions).sound(sound).volume(volume).createdAt(createdAt).customType(customType).data(data).dedupId(dedupId).markAsRead(markAsRead).sendPush(sendPush).execute();

Send a bot&#39;s message

## Send a bot message

Sends a bot message to a group channel.

[https://sendbird.com/docs/chat/platform-api/v3/bot/sending-a-bot-message/send-a-bot-message#1-send-a-bot-message](https://sendbird.com/docs/chat/platform-api/v3/bot/sending-a-bot-message/send-a-bot-message#1-send-a-bot-message)

`bot_userid`  
Type: string  
Description: Specifies the ID of the bot to send a message.

### Example

```java
import java.io.File;
import java.math.BigDecimal;
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
        String messageType = "MESG"; // String | Specifies the type of message to send. MESG for text message, FILE for file message.
        String channelUrl = "channelUrl_example"; // String | Specifies the URL of the channel to send the message to.
        String apiToken = "{{API_TOKEN}}"; // String | 
        String message = "message_example"; // String | Specifies the content of the message. * This property is required when message_type is MESG.
        List<String> mentioned = Arrays.asList(); // List<String> | * This property is available when message_type is MESG.
        SendbirdExtendedMessagePayload extendedMessagePayload = new SendbirdExtendedMessagePayload(); // SendbirdExtendedMessagePayload | 
        File _file = new File("/path/to/file"); // File | When sending a single file with a message, specifies the data of the file to upload to the Sendbird server in raw binary format. When sending a request containing a file, change the value of the content-type header to multipart/form-data;boundary={your_unique_boundary_string} in the request. * This property is required when message_type is FILE. * This doesn't allow a converted base64-encoded string from a file as its value.
        Boolean requireAuth = true; // Boolean | Determines whether to require an authentication key to verify if the file is being properly accessed. Only the user who uploaded the file or users who are in the channel where the file was uploaded should have access. The authentication key managed internally by the Sendbird system is generated every time a user logs in to the Sendbird server and is valid for three days starting from the last login. If set to false, Sendbird tries to access a file without any key. To access encrypted files, such as the files in the Sendbird server which are by default encrypted, the property must be set to true. (Default: false) The require_auth parameter only works if the file or URL is managed by Sendbird, which means that when you upload files using multipart format or provide URLs that point to the files hosted on the Sendbird server. However, if the file is hosted on a server or service that is not managed by Sendbird, access control and authentication for the file should be handled by the respective server or service hosting the file. * This property is available when message_type is FILE.
        String mentionType = "users"; // String | * This property is available when message_type is FILE.
        List<String> mentionedUserIds = Arrays.asList(); // List<String> | * This property is available when message_type is FILE.
        Boolean isSilent = true; // Boolean | * This property is available when message_type is FILE.
        List<SendbirdSortedMetaarrayInner> sortedMetaarray = Arrays.asList(); // List<SendbirdSortedMetaarrayInner> | 
        String apnsBundleId = "apnsBundleId_example"; // String | * This property is available when message_type is FILE.
        Object appleCriticalAlertOptions = null; // Object | * This property is available when message_type is FILE.
        String sound = "sound_example"; // String | * This property is available when message_type is FILE.
        BigDecimal volume = new BigDecimal(78); // BigDecimal | * This property is available when message_type is FILE.
        Long createdAt = 56L; // Long | 
        String customType = "customType_example"; // String | 
        String data = "data_example"; // String | 
        String dedupId = "dedupId_example"; // String | 
        Boolean markAsRead = true; // Boolean | 
        Boolean sendPush = true; // Boolean | 
        try {
            SendABotMessageResponse result = api.sendABotMessage(botUserid)
                .messageType(messageType)
                .channelUrl(channelUrl)
                .apiToken(apiToken)
                .message(message)
                .mentioned(mentioned)
                .extendedMessagePayload(extendedMessagePayload)
                ._file(_file)
                .requireAuth(requireAuth)
                .mentionType(mentionType)
                .mentionedUserIds(mentionedUserIds)
                .isSilent(isSilent)
                .sortedMetaarray(sortedMetaarray)
                .apnsBundleId(apnsBundleId)
                .appleCriticalAlertOptions(appleCriticalAlertOptions)
                .sound(sound)
                .volume(volume)
                .createdAt(createdAt)
                .customType(customType)
                .data(data)
                .dedupId(dedupId)
                .markAsRead(markAsRead)
                .sendPush(sendPush)
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
| **messageType** | **String**| Specifies the type of message to send. MESG for text message, FILE for file message. | [enum: MESG, FILE] |
| **channelUrl** | **String**| Specifies the URL of the channel to send the message to. | |
| **apiToken** | **String**|  | [optional] |
| **message** | **String**| Specifies the content of the message. * This property is required when message_type is MESG. | [optional] |
| **mentioned** | **List&lt;String&gt;**| * This property is available when message_type is MESG. | [optional] |
| **extendedMessagePayload** | [**SendbirdExtendedMessagePayload**](SendbirdExtendedMessagePayload.md)|  | [optional] |
| **_file** | **File**| When sending a single file with a message, specifies the data of the file to upload to the Sendbird server in raw binary format. When sending a request containing a file, change the value of the content-type header to multipart/form-data;boundary&#x3D;{your_unique_boundary_string} in the request. * This property is required when message_type is FILE. * This doesn&#39;t allow a converted base64-encoded string from a file as its value. | [optional] |
| **requireAuth** | **Boolean**| Determines whether to require an authentication key to verify if the file is being properly accessed. Only the user who uploaded the file or users who are in the channel where the file was uploaded should have access. The authentication key managed internally by the Sendbird system is generated every time a user logs in to the Sendbird server and is valid for three days starting from the last login. If set to false, Sendbird tries to access a file without any key. To access encrypted files, such as the files in the Sendbird server which are by default encrypted, the property must be set to true. (Default: false) The require_auth parameter only works if the file or URL is managed by Sendbird, which means that when you upload files using multipart format or provide URLs that point to the files hosted on the Sendbird server. However, if the file is hosted on a server or service that is not managed by Sendbird, access control and authentication for the file should be handled by the respective server or service hosting the file. * This property is available when message_type is FILE. | [optional] |
| **mentionType** | **String**| * This property is available when message_type is FILE. | [optional] [enum: users, channel] |
| **mentionedUserIds** | **List&lt;String&gt;**| * This property is available when message_type is FILE. | [optional] |
| **isSilent** | **Boolean**| * This property is available when message_type is FILE. | [optional] |
| **sortedMetaarray** | [**List&lt;SendbirdSortedMetaarrayInner&gt;**](SendbirdSortedMetaarrayInner.md)|  | [optional] |
| **apnsBundleId** | **String**| * This property is available when message_type is FILE. | [optional] |
| **appleCriticalAlertOptions** | **Object**| * This property is available when message_type is FILE. | [optional] |
| **sound** | **String**| * This property is available when message_type is FILE. | [optional] |
| **volume** | **BigDecimal**| * This property is available when message_type is FILE. | [optional] |
| **createdAt** | **Long**|  | [optional] |
| **customType** | **String**|  | [optional] |
| **data** | **String**|  | [optional] |
| **dedupId** | **String**|  | [optional] |
| **markAsRead** | **Boolean**|  | [optional] |
| **sendPush** | **Boolean**|  | [optional] |

### Return type

[**SendABotMessageResponse**](SendABotMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
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
        String botUserid = "botUserid_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
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
| **botUserid** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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
        String botUserid = "botUserid_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
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
| **botUserid** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

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

