# MetadataApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**viewChannelMetacounter**](MetadataApi.md#viewChannelMetacounter) | **GET** /v3/{channel_type}/{channel_url}/metacounter | View a channel metacounter - When retrieving all items of a channel metacounter
[**viewChannelMetacounterByKey**](MetadataApi.md#viewChannelMetacounterByKey) | **GET** /v3/{channel_type}/{channel_url}/metacounter/{key} | View a channel metacounter - When retrieving a specific item of a channel metacounter by its key
[**viewChannelMetadata**](MetadataApi.md#viewChannelMetadata) | **GET** /v3/{channel_type}/{channel_url}/metadata | View a channel metadata - When retrieving all items of a channel metadata
[**viewChannelMetadataByKey**](MetadataApi.md#viewChannelMetadataByKey) | **GET** /v3/{channel_type}/{channel_url}/metadata/{key} | View a channel metadata - When retrieving a specific item of a channel metadata by its key
[**viewUserMetadata**](MetadataApi.md#viewUserMetadata) | **GET** /v3/users/{user_id}/metadata | View a user metadata - When retrieving all items of a user metadata
[**viewUserMetadataByKey**](MetadataApi.md#viewUserMetadataByKey) | **GET** /v3/users/{user_id}/metadata/{key} | View a user metadata - When retrieving a specific item of a user metadata by its key


<a name="viewChannelMetacounter"></a>
# **viewChannelMetacounter**
> Map&lt;String, SendBirdAdditionalProperties&gt; viewChannelMetacounter(apiToken, channelType, channelUrl, key, keys)

View a channel metacounter - When retrieving all items of a channel metacounter

## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.viewChannelMetacounter(apiToken, channelType, channelUrl, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#viewChannelMetacounter");
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
> Map&lt;String, SendBirdAdditionalProperties&gt; viewChannelMetacounterByKey(apiToken, channelType, channelUrl, key)

View a channel metacounter - When retrieving a specific item of a channel metacounter by its key

## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.viewChannelMetacounterByKey(apiToken, channelType, channelUrl, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#viewChannelMetacounterByKey");
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
 **key** | **String**|  |

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
> Map&lt;String, String&gt; viewChannelMetadata(apiToken, channelType, channelUrl, key, keys)

View a channel metadata - When retrieving all items of a channel metadata

## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      Map<String, String> result = apiInstance.viewChannelMetadata(apiToken, channelType, channelUrl, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#viewChannelMetadata");
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
> Map&lt;String, String&gt; viewChannelMetadataByKey(apiToken, channelType, channelUrl, key)

View a channel metadata - When retrieving a specific item of a channel metadata by its key

## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    try {
      Map<String, String> result = apiInstance.viewChannelMetadataByKey(apiToken, channelType, channelUrl, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#viewChannelMetadataByKey");
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
 **key** | **String**|  |

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
> ViewUserMetadataResponse viewUserMetadata(apiToken, userId, key, keys)

View a user metadata - When retrieving all items of a user metadata

## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    List<String> keys = Arrays.asList(); // List<String> | 
    try {
      ViewUserMetadataResponse result = apiInstance.viewUserMetadata(apiToken, userId, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#viewUserMetadata");
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
 **userId** | **String**|  |
 **key** | **String**|  | [optional]
 **keys** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**ViewUserMetadataResponse**](ViewUserMetadataResponse.md)

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
> Map&lt;String, String&gt; viewUserMetadataByKey(apiToken, userId, key)

View a user metadata - When retrieving a specific item of a user metadata by its key

## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.MetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    MetadataApi apiInstance = new MetadataApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    try {
      Map<String, String> result = apiInstance.viewUserMetadataByKey(apiToken, userId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#viewUserMetadataByKey");
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
 **userId** | **String**|  |
 **key** | **String**|  |

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

