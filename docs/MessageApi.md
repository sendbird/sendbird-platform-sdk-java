# MessageApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExtraDataToAMessage**](MessageApi.md#addExtraDataToAMessage) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Add extra data to a message |
| [**deleteAMessage**](MessageApi.md#deleteAMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id} | Delete a message |
| [**getAMessage**](MessageApi.md#getAMessage) | **GET** /v3/{channel_type}/{channel_url}/messages/{message_id} | Get a message |
| [**getTotalNumberOfMessagesInAChannel**](MessageApi.md#getTotalNumberOfMessagesInAChannel) | **GET** /v3/{channel_type}/{channel_url}/messages/total_count | Get total number of messages in a channel |
| [**listMessages**](MessageApi.md#listMessages) | **GET** /v3/{channel_type}/{channel_url}/messages | List messages |
| [**markChannelMessagesAsRead**](MessageApi.md#markChannelMessagesAsRead) | **PUT** /v3/group_channels/{channel_url}/messages/mark_as_read | Mark all messages as read |
| [**migrateMessages**](MessageApi.md#migrateMessages) | **POST** /v3/migration/{target_channel_url} | Migrate messages |
| [**removeExtraDataFromAMessage**](MessageApi.md#removeExtraDataFromAMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Remove extra data from a message |
| [**sendAMessage**](MessageApi.md#sendAMessage) | **POST** /v3/{channel_type}/{channel_url}/messages | Send a message |
| [**updateAMessage**](MessageApi.md#updateAMessage) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id} | Update a message |
| [**updateExtraDataInAMessage**](MessageApi.md#updateExtraDataInAMessage) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Update extra data in a message |



## addExtraDataToAMessage

> AddExtraDataToAMessageResponse addExtraDataToAMessage(channelType, channelUrl, messageId).apiToken(apiToken).addExtraDataToAMessageRequest(addExtraDataToAMessageRequest).execute();

Add extra data to a message

## Add extra data to a message

Adds one or more key-values items which store additional information for a message.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/message-add-metadata#1-add-metadata
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        Long messageId = 56L; // Long | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        AddExtraDataToAMessageRequest addExtraDataToAMessageRequest = new AddExtraDataToAMessageRequest(); // AddExtraDataToAMessageRequest | 
        try {
            AddExtraDataToAMessageResponse result = api.addExtraDataToAMessage(channelType, channelUrl, messageId)
                .apiToken(apiToken)
                .addExtraDataToAMessageRequest(addExtraDataToAMessageRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#addExtraDataToAMessage");
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
| **messageId** | **Long**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **addExtraDataToAMessageRequest** | [**AddExtraDataToAMessageRequest**](AddExtraDataToAMessageRequest.md)|  | [optional] |

### Return type

[**AddExtraDataToAMessageResponse**](AddExtraDataToAMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteAMessage

> Object deleteAMessage(channelType, channelUrl, messageId).apiToken(apiToken).execute();

Delete a message

## Delete a message

Deletes a message from a channel.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/delete-a-message#1-delete-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        Long messageId = 56L; // Long | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.deleteAMessage(channelType, channelUrl, messageId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#deleteAMessage");
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
| **messageId** | **Long**| (Required)  | |
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


## getAMessage

> SendBirdMessageResponse getAMessage(channelType, channelUrl, messageId).includeReactions(includeReactions).includeThreadInfo(includeThreadInfo).includeParentMessageInfo(includeParentMessageInfo).includePollDetails(includePollDetails).withSortedMetaArray(withSortedMetaArray).apiToken(apiToken).execute();

Get a message

## Get a message

Retrieves information on a specific message.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/get-a-message#1-get-a-message
----------------------------

 `channel_type`
     Type: string
     Description: Specifies the type of the channel. Either open_channels or group_channels.
 `channel_url`
     Type: string
     Description: Specifies the URL of the target channel.
 `message_id`
     Type: long
     Description: Specifies the unique ID of the message to retrieve.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        Long messageId = 56L; // Long | (Required) 
        Boolean includeReactions = true; // Boolean | 
        Boolean includeThreadInfo = true; // Boolean | 
        Boolean includeParentMessageInfo = true; // Boolean | 
        Boolean includePollDetails = true; // Boolean | Determines whether to include all properties of a poll resource with a full list of options in the results. If set to false, a selection of poll resource properties consisting of id, title, close_at, created_at, updated_at, status, and message_id are returned. (Default: false) * To use this property, the polls feature should be turned on in Settings > Chat > Features on Sendbird Dashboard.
        Boolean withSortedMetaArray = true; // Boolean | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            SendBirdMessageResponse result = api.getAMessage(channelType, channelUrl, messageId)
                .includeReactions(includeReactions)
                .includeThreadInfo(includeThreadInfo)
                .includeParentMessageInfo(includeParentMessageInfo)
                .includePollDetails(includePollDetails)
                .withSortedMetaArray(withSortedMetaArray)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#getAMessage");
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
| **messageId** | **Long**| (Required)  | |
| **includeReactions** | **Boolean**|  | [optional] |
| **includeThreadInfo** | **Boolean**|  | [optional] |
| **includeParentMessageInfo** | **Boolean**|  | [optional] |
| **includePollDetails** | **Boolean**| Determines whether to include all properties of a poll resource with a full list of options in the results. If set to false, a selection of poll resource properties consisting of id, title, close_at, created_at, updated_at, status, and message_id are returned. (Default: false) * To use this property, the polls feature should be turned on in Settings &gt; Chat &gt; Features on Sendbird Dashboard. | [optional] |
| **withSortedMetaArray** | **Boolean**|  | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdMessageResponse**](SendBirdMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getTotalNumberOfMessagesInAChannel

> GetTotalNumberOfMessagesInAChannelResponse getTotalNumberOfMessagesInAChannel(channelType, channelUrl).apiToken(apiToken).execute();

Get total number of messages in a channel

## Get total number of messages in a channel

Retrieves the total number of messages in a specific channel.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/get-total-number-of-messages-in-a-channel#1-get-total-number-of-messages-in-a-channel
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetTotalNumberOfMessagesInAChannelResponse result = api.getTotalNumberOfMessagesInAChannel(channelType, channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#getTotalNumberOfMessagesInAChannel");
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

### Return type

[**GetTotalNumberOfMessagesInAChannelResponse**](GetTotalNumberOfMessagesInAChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listMessages

> ListMessagesResponse listMessages(channelType, channelUrl).messageTs(messageTs).messageId(messageId).prevLimit(prevLimit).nextLimit(nextLimit).include(include).reverse(reverse).senderId(senderId).senderIds(senderIds).operatorFilter(operatorFilter).customTypes(customTypes).messageType(messageType).includingRemoved(includingRemoved).includeReactions(includeReactions).includeReplyType(includeReplyType).includeParentMessageInfo(includeParentMessageInfo).includeThreadInfo(includeThreadInfo).includePollDetails(includePollDetails).withSortedMetaArray(withSortedMetaArray).showSubchannelMessagesOnly(showSubchannelMessagesOnly).userId(userId).apiToken(apiToken).execute();

List messages

## List messages

You can retrieve a list of past messages of a specific channel with this API.

By default, this action returns a list of messages in the order they were created. Replies in threaded messages are also listed in the chronological order of their creation like other messages, not grouped with their parent messages.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/list-messages#1-list-messages

`channel_type`  
Type: string  
Description: Specifies the type of the channel. Either open_channels or group_channels.  
`channel_url`  
Type: string  
Description: Specifies the URL of the channel to retrieve a list of past messages.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        Long messageTs = 56L; // Long | Specifies the timestamp to be the reference point of the query in Unix milliseconds. Either this or the message_id parameter below should be specified in your query URL to retrieve a list. It fetches messages that were sent prior to and after the specified message_ts and the default value for both prev_limit and next_limit is 15.
        Long messageId = 56L; // Long | Specifies the unique ID of the message to be the reference point of the query. Either this or the message_ts parameter above should be specified in your query URL to retrieve a list. It fetches messages that were sent prior to and after the specified message_id and the default value for both prev_limit and next_limit is 15.
        Integer prevLimit = 56; // Integer | Specifies the number of previously sent messages to retrieve before message_ts. For example, if message_ts=1484202848298, then prev_limit=50 returns 50 messages sent by 1484202848297 (message_ts - 1). Acceptable values range from 0 to 200. (Default: 15)
        Integer nextLimit = 56; // Integer | Specifies the number of sent messages to retrieve after message_ts. For example, if message_ts=1484202848298, then next_limit=50 returns 50 messages sent from 1484202848299 (message_ts + 1). Acceptable values range from 0 to 200. (Default: 15)
        Boolean include = true; // Boolean | Determines whether to include messages sent exactly on the specified message_ts in the results. (Default: true)
        Boolean reverse = true; // Boolean | Determines whether to sort the results in reverse chronological order. If set to true, messages appear in reverse chronological order where the newest comes first and the oldest last. (Default: false)
        String senderId = "senderId_example"; // String | Restricts the search scope to only retrieve messages sent by the user with the specified ID.
        String senderIds = "senderIds_example"; // String | Restricts the search scope to only retrieve messages sent by one or more users with the specified IDs listed in a comma-separated string.
        String operatorFilter = "all"; // String | 
        String customTypes = "customTypes_example"; // String | Specifies a comma-separated string of one or more custom message types to retrieve. The value set to this parameter can serve as a filter as follows: - A string of specific custom types: Messages with the corresponding custom types are returned. - Empty like &custom_types=&...: Messages whose custom_type property is empty or has a value of null are returned. - An asterisk (\\*) (default): All messages are returned regardless of their custom_type.
        String messageType = "MESG"; // String | 
        Boolean includingRemoved = true; // Boolean | 
        Boolean includeReactions = true; // Boolean | 
        String includeReplyType = "NONE"; // String | One of following values: NONE, ALL, ONLY_REPLY_TO_CHANNEL
        Boolean includeParentMessageInfo = true; // Boolean | 
        Boolean includeThreadInfo = true; // Boolean | 
        Boolean includePollDetails = true; // Boolean | Determines whether to include all properties of a poll resource with a full list of options in the results. If set to false, a selection of poll resource properties consisting of id, title, close_at, created_at, updated_at, status, and message_id are returned. (Default: false) * To use this property, the polls feature should be turned on in Settings > Chat > Features on Sendbird Dashboard.
        Boolean withSortedMetaArray = true; // Boolean | Determines whether to include the sorted_metaarray property in the response. (Default: false)
        Boolean showSubchannelMessagesOnly = true; // Boolean | 
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListMessagesResponse result = api.listMessages(channelType, channelUrl)
                .messageTs(messageTs)
                .messageId(messageId)
                .prevLimit(prevLimit)
                .nextLimit(nextLimit)
                .include(include)
                .reverse(reverse)
                .senderId(senderId)
                .senderIds(senderIds)
                .operatorFilter(operatorFilter)
                .customTypes(customTypes)
                .messageType(messageType)
                .includingRemoved(includingRemoved)
                .includeReactions(includeReactions)
                .includeReplyType(includeReplyType)
                .includeParentMessageInfo(includeParentMessageInfo)
                .includeThreadInfo(includeThreadInfo)
                .includePollDetails(includePollDetails)
                .withSortedMetaArray(withSortedMetaArray)
                .showSubchannelMessagesOnly(showSubchannelMessagesOnly)
                .userId(userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listMessages");
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
| **messageTs** | **Long**| Specifies the timestamp to be the reference point of the query in Unix milliseconds. Either this or the message_id parameter below should be specified in your query URL to retrieve a list. It fetches messages that were sent prior to and after the specified message_ts and the default value for both prev_limit and next_limit is 15. | |
| **messageId** | **Long**| Specifies the unique ID of the message to be the reference point of the query. Either this or the message_ts parameter above should be specified in your query URL to retrieve a list. It fetches messages that were sent prior to and after the specified message_id and the default value for both prev_limit and next_limit is 15. | |
| **prevLimit** | **Integer**| Specifies the number of previously sent messages to retrieve before message_ts. For example, if message_ts&#x3D;1484202848298, then prev_limit&#x3D;50 returns 50 messages sent by 1484202848297 (message_ts - 1). Acceptable values range from 0 to 200. (Default: 15) | [optional] |
| **nextLimit** | **Integer**| Specifies the number of sent messages to retrieve after message_ts. For example, if message_ts&#x3D;1484202848298, then next_limit&#x3D;50 returns 50 messages sent from 1484202848299 (message_ts + 1). Acceptable values range from 0 to 200. (Default: 15) | [optional] |
| **include** | **Boolean**| Determines whether to include messages sent exactly on the specified message_ts in the results. (Default: true) | [optional] |
| **reverse** | **Boolean**| Determines whether to sort the results in reverse chronological order. If set to true, messages appear in reverse chronological order where the newest comes first and the oldest last. (Default: false) | [optional] |
| **senderId** | **String**| Restricts the search scope to only retrieve messages sent by the user with the specified ID. | [optional] |
| **senderIds** | **String**| Restricts the search scope to only retrieve messages sent by one or more users with the specified IDs listed in a comma-separated string. | [optional] |
| **operatorFilter** | **String**|  | [optional] [enum: all, operator, nonoperator] |
| **customTypes** | **String**| Specifies a comma-separated string of one or more custom message types to retrieve. The value set to this parameter can serve as a filter as follows: - A string of specific custom types: Messages with the corresponding custom types are returned. - Empty like &amp;custom_types&#x3D;&amp;...: Messages whose custom_type property is empty or has a value of null are returned. - An asterisk (\\*) (default): All messages are returned regardless of their custom_type. | [optional] |
| **messageType** | **String**|  | [optional] [enum: MESG, FILE, ADMM] |
| **includingRemoved** | **Boolean**|  | [optional] |
| **includeReactions** | **Boolean**|  | [optional] |
| **includeReplyType** | **String**| One of following values: NONE, ALL, ONLY_REPLY_TO_CHANNEL | [optional] [enum: NONE, ALL, ONLY_REPLY_TO_CHANNEL] |
| **includeParentMessageInfo** | **Boolean**|  | [optional] |
| **includeThreadInfo** | **Boolean**|  | [optional] |
| **includePollDetails** | **Boolean**| Determines whether to include all properties of a poll resource with a full list of options in the results. If set to false, a selection of poll resource properties consisting of id, title, close_at, created_at, updated_at, status, and message_id are returned. (Default: false) * To use this property, the polls feature should be turned on in Settings &gt; Chat &gt; Features on Sendbird Dashboard. | [optional] |
| **withSortedMetaArray** | **Boolean**| Determines whether to include the sorted_metaarray property in the response. (Default: false) | [optional] |
| **showSubchannelMessagesOnly** | **Boolean**|  | [optional] |
| **userId** | **String**|  | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## markChannelMessagesAsRead

> Object markChannelMessagesAsRead(channelUrl).apiToken(apiToken).markChannelMessagesAsReadRequest(markChannelMessagesAsReadRequest).execute();

Mark all messages as read

## Mark all messages as read

Marks all messages in a group channel as read for a specific user. This action is only applicable for users in a group channel.

https://sendbird.com/docs/chat/platform-api/v3/message/read-receipts/mark-all-messages-as-read-message#1-mark-all-messages-as-read

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        MarkChannelMessagesAsReadRequest markChannelMessagesAsReadRequest = new MarkChannelMessagesAsReadRequest(); // MarkChannelMessagesAsReadRequest | 
        try {
            Object result = api.markChannelMessagesAsRead(channelUrl)
                .apiToken(apiToken)
                .markChannelMessagesAsReadRequest(markChannelMessagesAsReadRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#markChannelMessagesAsRead");
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
| **markChannelMessagesAsReadRequest** | [**MarkChannelMessagesAsReadRequest**](MarkChannelMessagesAsReadRequest.md)|  | [optional] |

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


## migrateMessages

> Object migrateMessages(targetChannelUrl).apiToken(apiToken).migrateMessagesRequest(migrateMessagesRequest).execute();

Migrate messages

## Migrate messages

Using our migration API, you can migrate the messages from another system into a Sendbird system's [channel](https://sendbird.com/docs/chat/v3/platform-api/guides/channel-types) which consists of users, messages, and other chat-related data.

> To turn on this feature, [contact our support team](https://dashboard.sendbird.com/settings/contact_us). 
  

There are three things to do in advance before the migration. Follow the instructions below:

1. Register the users of your current chat solution to your Sendbird application. You can migrate the users into the Sendbird system using the [user creation API](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user).
    
2. Create either an [open](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel) or a [group](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel) channel to migrate the messages of your chat solution. The Sendbird system doesn't create a channel for your migration automatically.
    
3. The maximum number of migrated messages per call is 100. To avoid the failure during your migration, you must adjust the number of messages to process at once via the API.
    

https://sendbird.com/docs/chat/platform-api/v3/message/migration/migrate-messages#1-migrate-messages

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String targetChannelUrl = "targetChannelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        MigrateMessagesRequest migrateMessagesRequest = new MigrateMessagesRequest(); // MigrateMessagesRequest | 
        try {
            Object result = api.migrateMessages(targetChannelUrl)
                .apiToken(apiToken)
                .migrateMessagesRequest(migrateMessagesRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#migrateMessages");
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
| **targetChannelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **migrateMessagesRequest** | [**MigrateMessagesRequest**](MigrateMessagesRequest.md)|  | [optional] |

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


## removeExtraDataFromAMessage

> Object removeExtraDataFromAMessage(channelType, channelUrl, messageId).keys(keys).apiToken(apiToken).execute();

Remove extra data from a message

## Remove extra data from a message

Removes specific items from a message by their keys.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/message-remove-metadata#1-remove-metadata
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        Long messageId = 56L; // Long | (Required) 
        String keys = "keys_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.removeExtraDataFromAMessage(channelType, channelUrl, messageId)
                .keys(keys)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#removeExtraDataFromAMessage");
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
| **messageId** | **Long**| (Required)  | |
| **keys** | **String**|  | [optional] |
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


## sendAMessage

> SendBirdMessageResponse sendAMessage(channelType, channelUrl).apiToken(apiToken).sendAMessageRequest(sendAMessageRequest).execute();

Send a message

## Send a message

You can use this action to send a text message, a file message, or an admin message to a specific channel. Sendbird Chat SDKs and the platform API allows you to upload any type of files in messages to the Sendbird server. See [Message Overview](https://sendbird.com/docs/chat/platform-api/v3/message/message-overview) for more information on each message type.
Messages are sent between client devices running the Sendbird Chat SDK or UIKit as well as programmatically from businesses to their customers. For instance, a delivery app can automatically send a message like "Arriving in one minute!" on behalf of a delivery driver.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/send-a-message#1-send-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        SendAMessageRequest sendAMessageRequest = new SendAMessageRequest(); // SendAMessageRequest | 
        try {
            SendBirdMessageResponse result = api.sendAMessage(channelType, channelUrl)
                .apiToken(apiToken)
                .sendAMessageRequest(sendAMessageRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#sendAMessage");
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
| **sendAMessageRequest** | [**SendAMessageRequest**](SendAMessageRequest.md)|  | [optional] |

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


## updateAMessage

> SendBirdMessageResponse updateAMessage(channelType, channelUrl, messageId).apiToken(apiToken).updateAMessageRequest(updateAMessageRequest).execute();

Update a message

## Update a message

Updates specific information on a message.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/update-a-message#1-update-a-message
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        Long messageId = 56L; // Long | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateAMessageRequest updateAMessageRequest = new UpdateAMessageRequest(); // UpdateAMessageRequest | 
        try {
            SendBirdMessageResponse result = api.updateAMessage(channelType, channelUrl, messageId)
                .apiToken(apiToken)
                .updateAMessageRequest(updateAMessageRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#updateAMessage");
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
| **messageId** | **Long**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **updateAMessageRequest** | [**UpdateAMessageRequest**](UpdateAMessageRequest.md)|  | [optional] |

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


## updateExtraDataInAMessage

> UpdateExtraDataInAMessageResponse updateExtraDataInAMessage(channelType, channelUrl, messageId).apiToken(apiToken).updateExtraDataInAMessageRequest(updateExtraDataInAMessageRequest).execute();

Update extra data in a message

## Update extra data in a message

Updates the values of specific items by their keys.

https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/message-update-metadata#1-update-metadata
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String channelType = "open_channels"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        Long messageId = 56L; // Long | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateExtraDataInAMessageRequest updateExtraDataInAMessageRequest = new UpdateExtraDataInAMessageRequest(); // UpdateExtraDataInAMessageRequest | 
        try {
            UpdateExtraDataInAMessageResponse result = api.updateExtraDataInAMessage(channelType, channelUrl, messageId)
                .apiToken(apiToken)
                .updateExtraDataInAMessageRequest(updateExtraDataInAMessageRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#updateExtraDataInAMessage");
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
| **messageId** | **Long**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **updateExtraDataInAMessageRequest** | [**UpdateExtraDataInAMessageRequest**](UpdateExtraDataInAMessageRequest.md)|  | [optional] |

### Return type

[**UpdateExtraDataInAMessageResponse**](UpdateExtraDataInAMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

