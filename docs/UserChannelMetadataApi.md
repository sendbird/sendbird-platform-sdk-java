# UserChannelMetadataApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChannelMetacounter**](UserChannelMetadataApi.md#createChannelMetacounter) | **POST** /v3/{channel_type}/{channel_url}/metacounter | Create a channel metacounter
[**createChannelMetadata**](UserChannelMetadataApi.md#createChannelMetadata) | **POST** /v3/{channel_type}/{channel_url}/metadata | Create a channel metadata
[**createUserMetadata**](UserChannelMetadataApi.md#createUserMetadata) | **POST** /v3/users/{user_id}/metadata | Create a user metadata
[**deleteChannelMetacounter**](UserChannelMetadataApi.md#deleteChannelMetacounter) | **DELETE** /v3/{channel_type}/{channel_url}/metacounter | Delete a channel metacounter - When deleting all items of a channel metacounter
[**deleteChannelMetacounterByKey**](UserChannelMetadataApi.md#deleteChannelMetacounterByKey) | **DELETE** /v3/{channel_type}/{channel_url}/metacounter/{key} | Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key
[**deleteChannelMetadata**](UserChannelMetadataApi.md#deleteChannelMetadata) | **DELETE** /v3/{channel_type}/{channel_url}/metadata | Delete a channel metadata - When deleting all items of a channel metadata
[**deleteChannelMetadataByKey**](UserChannelMetadataApi.md#deleteChannelMetadataByKey) | **DELETE** /v3/{channel_type}/{channel_url}/metadata/{key} | Delete a channel metadata - When deleting a specific item of a channel metadata by its key
[**deleteUserMetadata**](UserChannelMetadataApi.md#deleteUserMetadata) | **DELETE** /v3/users/{user_id}/metadata | Delete a user metadata - When deleting all items of a user metadata
[**deleteUserMetadataByKey**](UserChannelMetadataApi.md#deleteUserMetadataByKey) | **DELETE** /v3/users/{user_id}/metadata/{key} | Delete a user metadata - When deleting a specific item of a user metadata by its key
[**updateChannelMetacounter**](UserChannelMetadataApi.md#updateChannelMetacounter) | **PUT** /v3/{channel_type}/{channel_url}/metacounter | Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter
[**updateChannelMetacounterByKey**](UserChannelMetadataApi.md#updateChannelMetacounterByKey) | **PUT** /v3/{channel_type}/{channel_url}/metacounter/{key} | Update a channel metacounter - When updating a specific item of a channel metacounter by its key
[**updateChannelMetadata**](UserChannelMetadataApi.md#updateChannelMetadata) | **PUT** /v3/{channel_type}/{channel_url}/metadata | Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata
[**updateChannelMetadataByKey**](UserChannelMetadataApi.md#updateChannelMetadataByKey) | **PUT** /v3/{channel_type}/{channel_url}/metadata/{key} | Update a channel metadata - When updating a specific item of a channel metadata by its key
[**updateUserMetadata**](UserChannelMetadataApi.md#updateUserMetadata) | **PUT** /v3/users/{user_id}/metadata | Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata
[**updateUserMetadataByKey**](UserChannelMetadataApi.md#updateUserMetadataByKey) | **PUT** /v3/users/{user_id}/metadata/{key} | Update a user metadata - When updating a specific item of a user metadata by its key
[**viewChannelMetacounter**](UserChannelMetadataApi.md#viewChannelMetacounter) | **GET** /v3/{channel_type}/{channel_url}/metacounter | View a channel metacounter - When retrieving all items of a channel metacounter
[**viewChannelMetacounterByKey**](UserChannelMetadataApi.md#viewChannelMetacounterByKey) | **GET** /v3/{channel_type}/{channel_url}/metacounter/{key} | View a channel metacounter - When retrieving a specific item of a channel metacounter by its key
[**viewChannelMetadata**](UserChannelMetadataApi.md#viewChannelMetadata) | **GET** /v3/{channel_type}/{channel_url}/metadata | View a channel metadata - When retrieving all items of a channel metadata
[**viewChannelMetadataByKey**](UserChannelMetadataApi.md#viewChannelMetadataByKey) | **GET** /v3/{channel_type}/{channel_url}/metadata/{key} | View a channel metadata - When retrieving a specific item of a channel metadata by its key
[**viewUserMetadata**](UserChannelMetadataApi.md#viewUserMetadata) | **GET** /v3/users/{user_id}/metadata | View a user metadata - When retrieving all items of a user metadata
[**viewUserMetadataByKey**](UserChannelMetadataApi.md#viewUserMetadataByKey) | **GET** /v3/users/{user_id}/metadata/{key} | View a user metadata - When retrieving a specific item of a user metadata by its key


<a name="createChannelMetacounter"></a>
# **createChannelMetacounter**
> Map&lt;String, SendBirdAdditionalProperties&gt; createChannelMetacounter(channelType, channelUrl, apiToken, createChannelMetacounterData)

Create a channel metacounter

## Create a channel metacounter  Creates a channel metacounter&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metacounter ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    CreateChannelMetacounterData createChannelMetacounterData = new CreateChannelMetacounterData(); // CreateChannelMetacounterData | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.createChannelMetacounter(channelType, channelUrl, apiToken, createChannelMetacounterData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#createChannelMetacounter");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **createChannelMetacounterData** | [**CreateChannelMetacounterData**](CreateChannelMetacounterData.md)|  | [optional]

### Return type

[**Map&lt;String, SendBirdAdditionalProperties&gt;**](SendBirdAdditionalProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createChannelMetadata"></a>
# **createChannelMetadata**
> InlineResponse20061 createChannelMetadata(channelType, channelUrl, apiToken, createChannelMetadataData)

Create a channel metadata

## Create a channel metadata  Creates a channel metadata&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metadata ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    CreateChannelMetadataData createChannelMetadataData = new CreateChannelMetadataData(); // CreateChannelMetadataData | 
    try {
      InlineResponse20061 result = apiInstance.createChannelMetadata(channelType, channelUrl, apiToken, createChannelMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#createChannelMetadata");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **createChannelMetadataData** | [**CreateChannelMetadataData**](CreateChannelMetadataData.md)|  | [optional]

### Return type

[**InlineResponse20061**](InlineResponse20061.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createUserMetadata"></a>
# **createUserMetadata**
> InlineResponse20047UserMetadata createUserMetadata(userId, apiToken, createUserMetadataData)

Create a user metadata

## Create a user metadata  Creates a user metadata&#39;s items to store in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-user-metadata ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    CreateUserMetadataData createUserMetadataData = new CreateUserMetadataData(); // CreateUserMetadataData | 
    try {
      InlineResponse20047UserMetadata result = apiInstance.createUserMetadata(userId, apiToken, createUserMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#createUserMetadata");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **createUserMetadataData** | [**CreateUserMetadataData**](CreateUserMetadataData.md)|  | [optional]

### Return type

[**InlineResponse20047UserMetadata**](InlineResponse20047UserMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="deleteChannelMetacounter"></a>
# **deleteChannelMetacounter**
> deleteChannelMetacounter(channelType, channelUrl, apiToken)

Delete a channel metacounter - When deleting all items of a channel metacounter

## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteChannelMetacounter(channelType, channelUrl, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#deleteChannelMetacounter");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]

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

<a name="deleteChannelMetacounterByKey"></a>
# **deleteChannelMetacounterByKey**
> deleteChannelMetacounterByKey(channelType, channelUrl, key, apiToken)

Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key

## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteChannelMetacounterByKey(channelType, channelUrl, key, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#deleteChannelMetacounterByKey");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]

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

<a name="deleteChannelMetadata"></a>
# **deleteChannelMetadata**
> deleteChannelMetadata(channelType, channelUrl, apiToken, key)

Delete a channel metadata - When deleting all items of a channel metadata

## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.deleteChannelMetadata(channelType, channelUrl, apiToken, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#deleteChannelMetadata");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **key** | **String**|  | [optional]

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

<a name="deleteChannelMetadataByKey"></a>
# **deleteChannelMetadataByKey**
> deleteChannelMetadataByKey(channelType, channelUrl, key, apiToken)

Delete a channel metadata - When deleting a specific item of a channel metadata by its key

## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteChannelMetadataByKey(channelType, channelUrl, key, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#deleteChannelMetadataByKey");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]

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

<a name="deleteUserMetadata"></a>
# **deleteUserMetadata**
> deleteUserMetadata(userId, apiToken, key)

Delete a user metadata - When deleting all items of a user metadata

## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.deleteUserMetadata(userId, apiToken, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#deleteUserMetadata");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **key** | **String**|  | [optional]

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

<a name="deleteUserMetadataByKey"></a>
# **deleteUserMetadataByKey**
> deleteUserMetadataByKey(userId, key, apiToken)

Delete a user metadata - When deleting a specific item of a user metadata by its key

## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.deleteUserMetadataByKey(userId, key, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#deleteUserMetadataByKey");
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
 **userId** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]

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

<a name="updateChannelMetacounter"></a>
# **updateChannelMetacounter**
> Map&lt;String, SendBirdAdditionalProperties&gt; updateChannelMetacounter(channelType, channelUrl, apiToken, updateChannelMetacounterData)

Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter

## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateChannelMetacounterData updateChannelMetacounterData = new UpdateChannelMetacounterData(); // UpdateChannelMetacounterData | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.updateChannelMetacounter(channelType, channelUrl, apiToken, updateChannelMetacounterData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#updateChannelMetacounter");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateChannelMetacounterData** | [**UpdateChannelMetacounterData**](UpdateChannelMetacounterData.md)|  | [optional]

### Return type

[**Map&lt;String, SendBirdAdditionalProperties&gt;**](SendBirdAdditionalProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateChannelMetacounterByKey"></a>
# **updateChannelMetacounterByKey**
> Map&lt;String, String&gt; updateChannelMetacounterByKey(channelType, channelUrl, key, apiToken, body)

Update a channel metacounter - When updating a specific item of a channel metacounter by its key

## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Object body = null; // Object | 
    try {
      Map<String, String> result = apiInstance.updateChannelMetacounterByKey(channelType, channelUrl, key, apiToken, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#updateChannelMetacounterByKey");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **body** | **Object**|  | [optional]

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
**200** | Successful response |  -  |

<a name="updateChannelMetadata"></a>
# **updateChannelMetadata**
> Map&lt;String, String&gt; updateChannelMetadata(channelType, channelUrl, apiToken, updateChannelMetadataData)

Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata

## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateChannelMetadataData updateChannelMetadataData = new UpdateChannelMetadataData(); // UpdateChannelMetadataData | 
    try {
      Map<String, String> result = apiInstance.updateChannelMetadata(channelType, channelUrl, apiToken, updateChannelMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#updateChannelMetadata");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateChannelMetadataData** | [**UpdateChannelMetadataData**](UpdateChannelMetadataData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="updateChannelMetadataByKey"></a>
# **updateChannelMetadataByKey**
> Map&lt;String, String&gt; updateChannelMetadataByKey(channelType, channelUrl, key, apiToken, body)

Update a channel metadata - When updating a specific item of a channel metadata by its key

## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Object body = null; // Object | 
    try {
      Map<String, String> result = apiInstance.updateChannelMetadataByKey(channelType, channelUrl, key, apiToken, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#updateChannelMetadataByKey");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **body** | **Object**|  | [optional]

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
**200** | Successful response |  -  |

<a name="updateUserMetadata"></a>
# **updateUserMetadata**
> InlineResponse20060 updateUserMetadata(userId, apiToken, updateUserMetadataData)

Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata

## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    UpdateUserMetadataData updateUserMetadataData = new UpdateUserMetadataData(); // UpdateUserMetadataData | 
    try {
      InlineResponse20060 result = apiInstance.updateUserMetadata(userId, apiToken, updateUserMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#updateUserMetadata");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **updateUserMetadataData** | [**UpdateUserMetadataData**](UpdateUserMetadataData.md)|  | [optional]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateUserMetadataByKey"></a>
# **updateUserMetadataByKey**
> Map&lt;String, String&gt; updateUserMetadataByKey(userId, key, apiToken, body)

Update a user metadata - When updating a specific item of a user metadata by its key

## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Object body = null; // Object | 
    try {
      Map<String, String> result = apiInstance.updateUserMetadataByKey(userId, key, apiToken, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#updateUserMetadataByKey");
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
 **userId** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **body** | **Object**|  | [optional]

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
**200** | Successful response |  -  |

<a name="viewChannelMetacounter"></a>
# **viewChannelMetacounter**
> Map&lt;String, SendBirdAdditionalProperties&gt; viewChannelMetacounter(channelType, channelUrl, apiToken, key, keys)

View a channel metacounter - When retrieving all items of a channel metacounter

## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String key = "key_example"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.viewChannelMetacounter(channelType, channelUrl, apiToken, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#viewChannelMetacounter");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **key** | **String**|  | [optional]
 **keys** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**Map&lt;String, SendBirdAdditionalProperties&gt;**](SendBirdAdditionalProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewChannelMetacounterByKey"></a>
# **viewChannelMetacounterByKey**
> Map&lt;String, SendBirdAdditionalProperties&gt; viewChannelMetacounterByKey(channelType, channelUrl, key, apiToken)

View a channel metacounter - When retrieving a specific item of a channel metacounter by its key

## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.viewChannelMetacounterByKey(channelType, channelUrl, key, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#viewChannelMetacounterByKey");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**Map&lt;String, SendBirdAdditionalProperties&gt;**](SendBirdAdditionalProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewChannelMetadata"></a>
# **viewChannelMetadata**
> Map&lt;String, String&gt; viewChannelMetadata(channelType, channelUrl, apiToken, key, keys)

View a channel metadata - When retrieving all items of a channel metadata

## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String key = "key_example"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      Map<String, String> result = apiInstance.viewChannelMetadata(channelType, channelUrl, apiToken, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#viewChannelMetadata");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **key** | **String**|  | [optional]
 **keys** | [**List&lt;String&gt;**](String.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="viewChannelMetadataByKey"></a>
# **viewChannelMetadataByKey**
> Map&lt;String, String&gt; viewChannelMetadataByKey(channelType, channelUrl, key, apiToken)

View a channel metadata - When retrieving a specific item of a channel metadata by its key

## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      Map<String, String> result = apiInstance.viewChannelMetadataByKey(channelType, channelUrl, key, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#viewChannelMetadataByKey");
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
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="viewUserMetadata"></a>
# **viewUserMetadata**
> InlineResponse20047UserMetadata viewUserMetadata(userId, apiToken, key, keys)

View a user metadata - When retrieving all items of a user metadata

## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String userId = "userId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String key = "key_example"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      InlineResponse20047UserMetadata result = apiInstance.viewUserMetadata(userId, apiToken, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#viewUserMetadata");
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
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **key** | **String**|  | [optional]
 **keys** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**InlineResponse20047UserMetadata**](InlineResponse20047UserMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewUserMetadataByKey"></a>
# **viewUserMetadataByKey**
> Map&lt;String, String&gt; viewUserMetadataByKey(userId, key, apiToken)

View a user metadata - When retrieving a specific item of a user metadata by its key

## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserChannelMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserChannelMetadataApi apiInstance = new UserChannelMetadataApi(defaultClient);
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      Map<String, String> result = apiInstance.viewUserMetadataByKey(userId, key, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserChannelMetadataApi#viewUserMetadataByKey");
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
 **userId** | **String**|  |
 **key** | **String**|  |
 **apiToken** | **String**|  | [optional]

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
**200** | Successful response |  -  |

