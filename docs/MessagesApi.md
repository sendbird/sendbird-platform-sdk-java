# MessagesApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExtraDataToMessage**](MessagesApi.md#addExtraDataToMessage) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Add extra data to a message
[**addReactionToAMessage**](MessagesApi.md#addReactionToAMessage) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | Add a reaction to a message
[**deleteMessageById**](MessagesApi.md#deleteMessageById) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id} | Delete a message
[**gcMarkAllMessagesAsDelivered**](MessagesApi.md#gcMarkAllMessagesAsDelivered) | **PUT** /v3/group_channels/{channel_url}/messages/mark_as_delivered | Mark all messages as delivered
[**gcMarkAllMessagesAsRead**](MessagesApi.md#gcMarkAllMessagesAsRead) | **PUT** /v3/group_channels/{channel_url}/messages/mark_as_read | Mark all messages as read
[**gcViewNumberOfEachMembersUnreadMessages**](MessagesApi.md#gcViewNumberOfEachMembersUnreadMessages) | **GET** /v3/group_channels/{channel_url}/messages/unread_count | View number of each member&#39;s unread messages
[**listMessages**](MessagesApi.md#listMessages) | **GET** /v3/{channel_type}/{channel_url}/messages | List messages
[**listReactionsOfMessage**](MessagesApi.md#listReactionsOfMessage) | **GET** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | List reactions of a message
[**removeExtraDataFromMessage**](MessagesApi.md#removeExtraDataFromMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Remove extra data from a message
[**removeReactionFromAMessage**](MessagesApi.md#removeReactionFromAMessage) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/reactions | Remove a reaction from a message
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /v3/{channel_type}/{channel_url}/messages | Send a message
[**translateMessageIntoOtherLanguages**](MessagesApi.md#translateMessageIntoOtherLanguages) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/translation | Translate a message into other languages
[**updateExtraDataInMessage**](MessagesApi.md#updateExtraDataInMessage) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray | Update extra data in a message
[**updateMessageById**](MessagesApi.md#updateMessageById) | **PUT** /v3/{channel_type}/{channel_url}/messages/{message_id} | Update a message
[**viewMessageById**](MessagesApi.md#viewMessageById) | **GET** /v3/{channel_type}/{channel_url}/messages/{message_id} | View a message
[**viewTotalNumberOfMessagesInChannel**](MessagesApi.md#viewTotalNumberOfMessagesInChannel) | **GET** /v3/{channel_type}/{channel_url}/messages/total_count | View total number of messages in a channel


<a name="addExtraDataToMessage"></a>
# **addExtraDataToMessage**
> AddExtraDataToMessageResponse addExtraDataToMessage(apiToken, channelType, channelUrl, messageId, addExtraDataToMessageData)

Add extra data to a message

## Add extra data to a message  Adds one or more key-values items which store additional information for a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-extra-data-to-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    AddExtraDataToMessageData addExtraDataToMessageData = new AddExtraDataToMessageData(); // AddExtraDataToMessageData | 
    try {
      AddExtraDataToMessageResponse result = apiInstance.addExtraDataToMessage(apiToken, channelType, channelUrl, messageId, addExtraDataToMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#addExtraDataToMessage");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **addExtraDataToMessageData** | [**AddExtraDataToMessageData**](AddExtraDataToMessageData.md)|  | [optional]

### Return type

[**AddExtraDataToMessageResponse**](AddExtraDataToMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="addReactionToAMessage"></a>
# **addReactionToAMessage**
> AddReactionToAMessageResponse addReactionToAMessage(apiToken, channelType, channelUrl, messageId, addReactionToAMessageData)

Add a reaction to a message

## Add a reaction to a message  Adds a specific reaction to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-a-reaction-to-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    AddReactionToAMessageData addReactionToAMessageData = new AddReactionToAMessageData(); // AddReactionToAMessageData | 
    try {
      AddReactionToAMessageResponse result = apiInstance.addReactionToAMessage(apiToken, channelType, channelUrl, messageId, addReactionToAMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#addReactionToAMessage");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **addReactionToAMessageData** | [**AddReactionToAMessageData**](AddReactionToAMessageData.md)|  | [optional]

### Return type

[**AddReactionToAMessageResponse**](AddReactionToAMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="deleteMessageById"></a>
# **deleteMessageById**
> deleteMessageById(apiToken, channelType, channelUrl, messageId)

Delete a message

## Delete a message  Deletes a message from a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-delete-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    try {
      apiInstance.deleteMessageById(apiToken, channelType, channelUrl, messageId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#deleteMessageById");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |

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

<a name="gcMarkAllMessagesAsDelivered"></a>
# **gcMarkAllMessagesAsDelivered**
> GcMarkAllMessagesAsDeliveredResponse gcMarkAllMessagesAsDelivered(apiToken, channelUrl, gcMarkAllMessagesAsDeliveredData)

Mark all messages as delivered

## Mark all messages as delivered  Marks all messages in a group channel as delivered for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-delivered ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData = new GcMarkAllMessagesAsDeliveredData(); // GcMarkAllMessagesAsDeliveredData | 
    try {
      GcMarkAllMessagesAsDeliveredResponse result = apiInstance.gcMarkAllMessagesAsDelivered(apiToken, channelUrl, gcMarkAllMessagesAsDeliveredData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#gcMarkAllMessagesAsDelivered");
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
 **channelUrl** | **String**|  |
 **gcMarkAllMessagesAsDeliveredData** | [**GcMarkAllMessagesAsDeliveredData**](GcMarkAllMessagesAsDeliveredData.md)|  | [optional]

### Return type

[**GcMarkAllMessagesAsDeliveredResponse**](GcMarkAllMessagesAsDeliveredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcMarkAllMessagesAsRead"></a>
# **gcMarkAllMessagesAsRead**
> gcMarkAllMessagesAsRead(apiToken, channelUrl, gcMarkAllMessagesAsReadData)

Mark all messages as read

## Mark all messages as read  Marks all messages in a group channel as read for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-read ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData = new GcMarkAllMessagesAsReadData(); // GcMarkAllMessagesAsReadData | 
    try {
      apiInstance.gcMarkAllMessagesAsRead(apiToken, channelUrl, gcMarkAllMessagesAsReadData);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#gcMarkAllMessagesAsRead");
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
 **channelUrl** | **String**|  |
 **gcMarkAllMessagesAsReadData** | [**GcMarkAllMessagesAsReadData**](GcMarkAllMessagesAsReadData.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcViewNumberOfEachMembersUnreadMessages"></a>
# **gcViewNumberOfEachMembersUnreadMessages**
> GcViewNumberOfEachMembersUnreadMessagesResponse gcViewNumberOfEachMembersUnreadMessages(apiToken, channelUrl, userIds)

View number of each member&#39;s unread messages

## View number of each member&#39;s unread messages  Retrieves the total number of each member&#39;s unread messages in a group channel. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-number-of-each-member-s-unread-messages ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String userIds = "userIds_example"; // String | 
    try {
      GcViewNumberOfEachMembersUnreadMessagesResponse result = apiInstance.gcViewNumberOfEachMembersUnreadMessages(apiToken, channelUrl, userIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#gcViewNumberOfEachMembersUnreadMessages");
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
 **channelUrl** | **String**|  |
 **userIds** | **String**|  | [optional]

### Return type

[**GcViewNumberOfEachMembersUnreadMessagesResponse**](GcViewNumberOfEachMembersUnreadMessagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listMessages"></a>
# **listMessages**
> ListMessagesResponse listMessages(apiToken, channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray)

List messages

## List messages  Retrieves a list of past messages of a channel.  &gt; This message retrieval is one of Sendbird&#39;s [premium features](https://sendbird.com/docs/chat/v3/platform-api/guides/application#-3-sendbird-s-premium-features). Contact our [sales team](https://get.sendbird.com/talk-to-sales.html) for further assistance.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-messages ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of past messages.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    Integer messageTs = 56; // Integer | 
    Integer messageId = 56; // Integer | 
    Integer prevLimit = 56; // Integer | 
    Integer nextLimit = 56; // Integer | 
    Boolean include = true; // Boolean | 
    Boolean reverse = true; // Boolean | 
    String senderId = "senderId_example"; // String | 
    String senderIds = "senderIds_example"; // String | 
    String operatorFilter = "operatorFilter_example"; // String | 
    String customTypes = "customTypes_example"; // String | 
    String messageType = "messageType_example"; // String | 
    Boolean includingRemoved = true; // Boolean | 
    Boolean includeReactions = true; // Boolean | 
    Boolean withSortedMetaArray = true; // Boolean | 
    Boolean showSubchannelMessagesOnly = true; // Boolean | 
    String userId = "userId_example"; // String | 
    String customType = "customType_example"; // String | 
    Boolean withMetaArray = true; // Boolean | 
    try {
      ListMessagesResponse result = apiInstance.listMessages(apiToken, channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#listMessages");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageTs** | **Integer**|  | [optional]
 **messageId** | **Integer**|  | [optional]
 **prevLimit** | **Integer**|  | [optional]
 **nextLimit** | **Integer**|  | [optional]
 **include** | **Boolean**|  | [optional]
 **reverse** | **Boolean**|  | [optional]
 **senderId** | **String**|  | [optional]
 **senderIds** | **String**|  | [optional]
 **operatorFilter** | **String**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **messageType** | **String**|  | [optional]
 **includingRemoved** | **Boolean**|  | [optional]
 **includeReactions** | **Boolean**|  | [optional]
 **withSortedMetaArray** | **Boolean**|  | [optional]
 **showSubchannelMessagesOnly** | **Boolean**|  | [optional]
 **userId** | **String**|  | [optional]
 **customType** | **String**|  | [optional]
 **withMetaArray** | **Boolean**|  | [optional]

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
**200** | Successful response |  -  |

<a name="listReactionsOfMessage"></a>
# **listReactionsOfMessage**
> ListReactionsOfMessageResponse listReactionsOfMessage(apiToken, channelType, channelUrl, messageId, listUsers)

List reactions of a message

## List reactions of a message  Retrieves a list of reactions made to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-reactions-of-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to add a reaction to.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    Boolean listUsers = true; // Boolean | 
    try {
      ListReactionsOfMessageResponse result = apiInstance.listReactionsOfMessage(apiToken, channelType, channelUrl, messageId, listUsers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#listReactionsOfMessage");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **listUsers** | **Boolean**|  | [optional]

### Return type

[**ListReactionsOfMessageResponse**](ListReactionsOfMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="removeExtraDataFromMessage"></a>
# **removeExtraDataFromMessage**
> removeExtraDataFromMessage(apiToken, channelType, channelUrl, messageId, keys)

Remove extra data from a message

## Remove extra data from a message  Removes specific items from a message by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-extra-data-from-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      apiInstance.removeExtraDataFromMessage(apiToken, channelType, channelUrl, messageId, keys);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#removeExtraDataFromMessage");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **keys** | [**List&lt;String&gt;**](String.md)|  | [optional]

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

<a name="removeReactionFromAMessage"></a>
# **removeReactionFromAMessage**
> RemoveReactionFromAMessageResponse removeReactionFromAMessage(apiToken, channelType, channelUrl, messageId, userId, reaction)

Remove a reaction from a message

## Remove a reaction from a message  Removes a specific reaction from a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-a-reaction-from-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String userId = "userId_example"; // String | 
    String reaction = "reaction_example"; // String | 
    try {
      RemoveReactionFromAMessageResponse result = apiInstance.removeReactionFromAMessage(apiToken, channelType, channelUrl, messageId, userId, reaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#removeReactionFromAMessage");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **userId** | **String**|  | [optional]
 **reaction** | **String**|  | [optional]

### Return type

[**RemoveReactionFromAMessageResponse**](RemoveReactionFromAMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="sendMessage"></a>
# **sendMessage**
> SendBirdMessageResponse sendMessage(apiToken, channelType, channelUrl, sendMessageData)

Send a message

## Send a message  Sends a message to a channel. You can send a text message, a file message, and an admin message.  &gt;__Note__: With Sendbird Chat SDKs and the platform API, any type of files in messages can be uploaded to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-send-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    SendMessageData sendMessageData = new SendMessageData(); // SendMessageData | 
    try {
      SendBirdMessageResponse result = apiInstance.sendMessage(apiToken, channelType, channelUrl, sendMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#sendMessage");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **sendMessageData** | [**SendMessageData**](SendMessageData.md)|  | [optional]

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

<a name="translateMessageIntoOtherLanguages"></a>
# **translateMessageIntoOtherLanguages**
> SendBirdMessageResponse translateMessageIntoOtherLanguages(apiToken, channelType, channelUrl, messageId, body)

Translate a message into other languages

## Translate a message into other languages  Translates a message into specific languages. Only text messages of which type is MESG can be translated into other languages.  &gt; __Note__: Message translation is powered by [Google Cloud Translation API recognition engine](https://cloud.google.com/translate/). Find language codes supported by the engine in the [Miscellaneous](https://sendbird.com/docs/chat/v3/platform-api/guides/Miscellaneous) page or visit the [Language Support](https://cloud.google.com/translate/docs/languages) for Google Cloud Translation.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-translate-a-message-into-other-languages ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    Object body = null; // Object | 
    try {
      SendBirdMessageResponse result = apiInstance.translateMessageIntoOtherLanguages(apiToken, channelType, channelUrl, messageId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#translateMessageIntoOtherLanguages");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **body** | **Object**|  | [optional]

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

<a name="updateExtraDataInMessage"></a>
# **updateExtraDataInMessage**
> UpdateExtraDataInMessageResponse updateExtraDataInMessage(apiToken, channelType, channelUrl, messageId, updateExtraDataInMessageData)

Update extra data in a message

## Update extra data in a message  Updates the values of specific items by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-extra-data-in-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    UpdateExtraDataInMessageData updateExtraDataInMessageData = new UpdateExtraDataInMessageData(); // UpdateExtraDataInMessageData | 
    try {
      UpdateExtraDataInMessageResponse result = apiInstance.updateExtraDataInMessage(apiToken, channelType, channelUrl, messageId, updateExtraDataInMessageData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#updateExtraDataInMessage");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **updateExtraDataInMessageData** | [**UpdateExtraDataInMessageData**](UpdateExtraDataInMessageData.md)|  | [optional]

### Return type

[**UpdateExtraDataInMessageResponse**](UpdateExtraDataInMessageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateMessageById"></a>
# **updateMessageById**
> SendBirdMessageResponse updateMessageById(apiToken, channelType, channelUrl, messageId, updateMessageByIdData)

Update a message

## Update a message  Updates information on a message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    UpdateMessageByIdData updateMessageByIdData = new UpdateMessageByIdData(); // UpdateMessageByIdData | 
    try {
      SendBirdMessageResponse result = apiInstance.updateMessageById(apiToken, channelType, channelUrl, messageId, updateMessageByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#updateMessageById");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **updateMessageByIdData** | [**UpdateMessageByIdData**](UpdateMessageByIdData.md)|  | [optional]

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

<a name="viewMessageById"></a>
# **viewMessageById**
> SendBirdMessageResponse viewMessageById(apiToken, channelType, channelUrl, messageId, withSortedMetaArray, withMetaArray)

View a message

## View a message  Retrieves information on a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to retrieve.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    Boolean withSortedMetaArray = true; // Boolean | 
    Boolean withMetaArray = true; // Boolean | 
    try {
      SendBirdMessageResponse result = apiInstance.viewMessageById(apiToken, channelType, channelUrl, messageId, withSortedMetaArray, withMetaArray);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#viewMessageById");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **messageId** | **String**|  |
 **withSortedMetaArray** | **Boolean**|  | [optional]
 **withMetaArray** | **Boolean**|  | [optional]

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
**200** | Successful response |  -  |

<a name="viewTotalNumberOfMessagesInChannel"></a>
# **viewTotalNumberOfMessagesInChannel**
> ViewTotalNumberOfMessagesInChannelResponse viewTotalNumberOfMessagesInChannel(apiToken, channelType, channelUrl)

View total number of messages in a channel

## View total number of messages in a channel  Retrieves the total number of messages in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-total-number-of-messages-in-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      ViewTotalNumberOfMessagesInChannelResponse result = apiInstance.viewTotalNumberOfMessagesInChannel(apiToken, channelType, channelUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#viewTotalNumberOfMessagesInChannel");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |

### Return type

[**ViewTotalNumberOfMessagesInChannelResponse**](ViewTotalNumberOfMessagesInChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

