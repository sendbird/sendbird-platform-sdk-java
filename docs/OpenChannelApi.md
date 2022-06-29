# OpenChannelApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ocCancelTheRegistrationOfOperators**](OpenChannelApi.md#ocCancelTheRegistrationOfOperators) | **DELETE** /v3/open_channels/{channel_url}/operators | Cancel the registration of operators
[**ocCreateChannel**](OpenChannelApi.md#ocCreateChannel) | **POST** /v3/open_channels | Create a channel
[**ocDeleteChannelByUrl**](OpenChannelApi.md#ocDeleteChannelByUrl) | **DELETE** /v3/open_channels/{channel_url} | Delete a channel
[**ocListChannels**](OpenChannelApi.md#ocListChannels) | **GET** /v3/open_channels | List channels
[**ocListOperators**](OpenChannelApi.md#ocListOperators) | **GET** /v3/open_channels/{channel_url}/operators | List operators
[**ocListParticipants**](OpenChannelApi.md#ocListParticipants) | **GET** /v3/open_channels/{channel_url}/participants | List participants
[**ocRegisterOperators**](OpenChannelApi.md#ocRegisterOperators) | **POST** /v3/open_channels/{channel_url}/operators | Register operators
[**ocUpdateChannelByUrl**](OpenChannelApi.md#ocUpdateChannelByUrl) | **PUT** /v3/open_channels/{channel_url} | Update a channel
[**ocViewChannelByUrl**](OpenChannelApi.md#ocViewChannelByUrl) | **GET** /v3/open_channels/{channel_url} | View a channel


<a name="ocCancelTheRegistrationOfOperators"></a>
# **ocCancelTheRegistrationOfOperators**
> ocCancelTheRegistrationOfOperators(apiToken, channelUrl, operatorIds, deleteAll)

Cancel the registration of operators

## Cancel the registration of operators  Cancels the registration of operators from an open channel but leave them as participants.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-cancel-the-registration-of-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to cancel the registration of operators.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    List<String> operatorIds = Arrays.asList(); // List<String> | 
    Boolean deleteAll = true; // Boolean | 
    try {
      apiInstance.ocCancelTheRegistrationOfOperators(apiToken, channelUrl, operatorIds, deleteAll);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **channelUrl** | **String**|  |
 **operatorIds** | [**List&lt;String&gt;**](String.md)|  |
 **deleteAll** | **Boolean**|  | [optional]

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

<a name="ocCreateChannel"></a>
# **ocCreateChannel**
> SendBirdOpenChannel ocCreateChannel(apiToken, ocCreateChannelData)

Create a channel

## Create a channel  Creates an open channel.  &gt;__Note__: Classic open channels created before the deprecation date of March 2021 will maintain their original form and functions. However, new applications created after December 15, 2020, will be able to create dynamic partitioning open channels only.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcCreateChannelData ocCreateChannelData = new OcCreateChannelData(); // OcCreateChannelData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocCreateChannel(apiToken, ocCreateChannelData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **ocCreateChannelData** | [**OcCreateChannelData**](OcCreateChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocDeleteChannelByUrl"></a>
# **ocDeleteChannelByUrl**
> InlineResponse2001 ocDeleteChannelByUrl(apiToken, channelUrl)

Delete a channel

## Delete a channel  Deletes an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-delete-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      InlineResponse2001 result = apiInstance.ocDeleteChannelByUrl(apiToken, channelUrl);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **channelUrl** | **String**|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="ocListChannels"></a>
# **ocListChannels**
> OcListChannelsResponse ocListChannels(apiToken, token, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, customType)

List channels

## List channels  Retrieves a list of open channels. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-channels ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      OcListChannelsResponse result = apiInstance.ocListChannels(apiToken, token, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, customType);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **nameContains** | **String**|  | [optional]
 **urlContains** | **String**|  | [optional]
 **showFrozen** | **Boolean**|  | [optional]
 **showMetadata** | **Boolean**|  | [optional]
 **customType** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocListOperators"></a>
# **ocListOperators**
> OcListOperatorsResponse ocListOperators(apiToken, channelUrl, token, limit)

List operators

## List operators  Retrieves a list of operators of an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of operators.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      OcListOperatorsResponse result = apiInstance.ocListOperators(apiToken, channelUrl, token, limit);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **channelUrl** | **String**|  |
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocListParticipants"></a>
# **ocListParticipants**
> OcListParticipantsResponse ocListParticipants(apiToken, channelUrl, token, limit)

List participants

## List participants  Retrieves a list of the participants of an open channel. A participant refers to a user who has entered the open channel and is currently online.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-participants ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of participants in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      OcListParticipantsResponse result = apiInstance.ocListParticipants(apiToken, channelUrl, token, limit);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **channelUrl** | **String**|  |
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocRegisterOperators"></a>
# **ocRegisterOperators**
> InlineResponse2001 ocRegisterOperators(apiToken, channelUrl, ocRegisterOperatorsData)

Register operators

## Register operators  Registers one or more operators to an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-register-operators ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    OcRegisterOperatorsData ocRegisterOperatorsData = new OcRegisterOperatorsData(); // OcRegisterOperatorsData | 
    try {
      InlineResponse2001 result = apiInstance.ocRegisterOperators(apiToken, channelUrl, ocRegisterOperatorsData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **channelUrl** | **String**|  |
 **ocRegisterOperatorsData** | [**OcRegisterOperatorsData**](OcRegisterOperatorsData.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="ocUpdateChannelByUrl"></a>
# **ocUpdateChannelByUrl**
> SendBirdOpenChannel ocUpdateChannelByUrl(apiToken, channelUrl, ocUpdateChannelByUrlData)

Update a channel

## Update a channel  Updates information on an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    OcUpdateChannelByUrlData ocUpdateChannelByUrlData = new OcUpdateChannelByUrlData(); // OcUpdateChannelByUrlData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocUpdateChannelByUrl(apiToken, channelUrl, ocUpdateChannelByUrlData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **channelUrl** | **String**|  |
 **ocUpdateChannelByUrlData** | [**OcUpdateChannelByUrlData**](OcUpdateChannelByUrlData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocViewChannelByUrl"></a>
# **ocViewChannelByUrl**
> SendBirdOpenChannel ocViewChannelByUrl(apiToken, channelUrl)

View a channel

## View a channel  Retrieves information on a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      SendBirdOpenChannel result = apiInstance.ocViewChannelByUrl(apiToken, channelUrl);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **channelUrl** | **String**|  |

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
**200** | Successful response |  -  |

