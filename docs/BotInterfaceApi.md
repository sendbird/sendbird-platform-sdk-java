# BotInterfaceApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBot**](BotInterfaceApi.md#createBot) | **POST** /v3/bots | Create a bot
[**deleteBotById**](BotInterfaceApi.md#deleteBotById) | **DELETE** /v3/bots/{bot_userid} | Delete a bot
[**joinChannels**](BotInterfaceApi.md#joinChannels) | **POST** /v3/bots/{bot_userid}/channels | Join channels
[**leaveChannels**](BotInterfaceApi.md#leaveChannels) | **DELETE** /v3/bots/{bot_userid}/channels | Leave channels - When leaving all channels
[**leaveChannelsByUrl**](BotInterfaceApi.md#leaveChannelsByUrl) | **DELETE** /v3/bots/{bot_userid}/channels/{channel_url} | Leave channels - When leaving a channel by its channel URL
[**listBots**](BotInterfaceApi.md#listBots) | **GET** /v3/bots | List bots
[**sendBotsMessage**](BotInterfaceApi.md#sendBotsMessage) | **POST** /v3/bots/{bot_userid}/send | Send a bot&#39;s message
[**updateBotById**](BotInterfaceApi.md#updateBotById) | **PUT** /v3/bots/{bot_userid} | Update a bot
[**viewBotById**](BotInterfaceApi.md#viewBotById) | **GET** /v3/bots/{bot_userid} | View a bot


<a name="createBot"></a>
# **createBot**
> CreateBotResponse createBot(apiToken, createBotData)

Create a bot

## Create a bot  Creates a new bot within the application. Creating a bot is similar to creating a normal user, except that a callback URL is specified in order for the bot to receive events.  &gt; __Note__: The bot must [join](#2-join-channels) a group channel first to interact with users. In group channels, you can invite a bot through the [invite as members](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members) action instead.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-create-a-bot

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    CreateBotData createBotData = new CreateBotData(); // CreateBotData | 
    try {
      CreateBotResponse result = apiInstance.createBot(apiToken, createBotData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#createBot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **createBotData** | [**CreateBotData**](CreateBotData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="deleteBotById"></a>
# **deleteBotById**
> deleteBotById(apiToken, botUserid)

Delete a bot

## Delete a bot  Deletes a bot from an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-delete-a-bot ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String botUserid = "botUserid_example"; // String | 
    try {
      apiInstance.deleteBotById(apiToken, botUserid);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#deleteBotById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **botUserid** | **String**|  |

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
**200** | Successful response |  -  |

<a name="joinChannels"></a>
# **joinChannels**
> SendBirdGroupChannelCollection joinChannels(apiToken, botUserid, joinChannelsData)

Join channels

## Join channels  Makes a bot join one or more channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-join-channels ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String botUserid = "botUserid_example"; // String | 
    JoinChannelsData joinChannelsData = new JoinChannelsData(); // JoinChannelsData | 
    try {
      SendBirdGroupChannelCollection result = apiInstance.joinChannels(apiToken, botUserid, joinChannelsData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#joinChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **botUserid** | **String**|  |
 **joinChannelsData** | [**JoinChannelsData**](JoinChannelsData.md)|  | [optional]

### Return type

[**SendBirdGroupChannelCollection**](SendBirdGroupChannelCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="leaveChannels"></a>
# **leaveChannels**
> leaveChannels(apiToken, botUserid, channelUrl)

Leave channels - When leaving all channels

## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String botUserid = "botUserid_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      apiInstance.leaveChannels(apiToken, botUserid, channelUrl);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#leaveChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **botUserid** | **String**|  |
 **channelUrl** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="leaveChannelsByUrl"></a>
# **leaveChannelsByUrl**
> leaveChannelsByUrl(apiToken, botUserid, channelUrl)

Leave channels - When leaving a channel by its channel URL

## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String botUserid = "botUserid_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      apiInstance.leaveChannelsByUrl(apiToken, botUserid, channelUrl);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#leaveChannelsByUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **botUserid** | **String**|  |
 **channelUrl** | **String**|  |

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
**200** | Successful response |  -  |

<a name="listBots"></a>
# **listBots**
> ListBotsResponse listBots(apiToken, token, limit)

List bots

## List bots  Retrieves a list of all bots within an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListBotsResponse result = apiInstance.listBots(apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#listBots");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

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
**200** | Successful response |  -  |

<a name="sendBotsMessage"></a>
# **sendBotsMessage**
> SendBirdMessageResponse sendBotsMessage(apiToken, botUserid, sendBotSMessageData)

Send a bot&#39;s message

## Send a bot&#39;s message  Sends a bot&#39;s message to a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-send-a-bot-s-message ----------------------------   &#x60;bot_userid&#x60;      Type: string      Description: Specifies the ID of the bot to send a message.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String botUserid = "botUserid_example"; // String | 
    SendBotSMessageData sendBotSMessageData = new SendBotSMessageData(); // SendBotSMessageData | 
    try {
      SendBirdMessageResponse result = apiInstance.sendBotsMessage(apiToken, botUserid, sendBotSMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#sendBotsMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **botUserid** | **String**|  |
 **sendBotSMessageData** | [**SendBotSMessageData**](SendBotSMessageData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="updateBotById"></a>
# **updateBotById**
> UpdateBotByIdResponse updateBotById(apiToken, botUserid, updateBotByIdData)

Update a bot

## Update a bot  Updates information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-update-a-bot ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String botUserid = "botUserid_example"; // String | 
    UpdateBotByIdData updateBotByIdData = new UpdateBotByIdData(); // UpdateBotByIdData | 
    try {
      UpdateBotByIdResponse result = apiInstance.updateBotById(apiToken, botUserid, updateBotByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#updateBotById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **botUserid** | **String**|  |
 **updateBotByIdData** | [**UpdateBotByIdData**](UpdateBotByIdData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="viewBotById"></a>
# **viewBotById**
> ViewBotByIdResponse viewBotById(apiToken, botUserid)

View a bot

## View a bot  Retrieves information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-view-a-bot ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.BotInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    BotInterfaceApi apiInstance = new BotInterfaceApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String botUserid = "botUserid_example"; // String | 
    try {
      ViewBotByIdResponse result = apiInstance.viewBotById(apiToken, botUserid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BotInterfaceApi#viewBotById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **botUserid** | **String**|  |

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
**200** | Successful response |  -  |

