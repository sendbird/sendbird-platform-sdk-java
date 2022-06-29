# ReportApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listReports**](ReportApi.md#listReports) | **GET** /v3/report | List reports |
| [**listReportsOnChannelByUrl**](ReportApi.md#listReportsOnChannelByUrl) | **GET** /v3/report/{channel_type}/{channel_url} | List reports on a channel |
| [**listReportsOnMessageById**](ReportApi.md#listReportsOnMessageById) | **GET** /v3/report/{channel_type}/{channel_url}/messages/{message_id} | List reports on a message |
| [**listReportsOnUserById**](ReportApi.md#listReportsOnUserById) | **GET** /v3/report/users/{offending_user_id} | List reports on a user |
| [**reportChannelByUrl**](ReportApi.md#reportChannelByUrl) | **POST** /v3/report/{channel_type}/{channel_url} | Report a channel |
| [**reportMessageById**](ReportApi.md#reportMessageById) | **POST** /v3/report/{channel_type}/{channel_url}/messages/{message_id} | Report a message |
| [**reportUserById**](ReportApi.md#reportUserById) | **POST** /v3/report/users/{offending_user_id} | Report a user |
| [**viewModeratedMessageById**](ReportApi.md#viewModeratedMessageById) | **GET** /v3/report/{channel_type}/{channel_url}/profanity_messages/{message_id} | View a moderated message |


<a name="listReports"></a>
# **listReports**
> ListReportsResponse listReports(apiToken, token, limit, startTs, endTs)

List reports

## List reports  Retrieves a list of reports within an application regardless of object types.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    Integer startTs = 56; // Integer | 
    Integer endTs = 56; // Integer | 
    try {
      ListReportsResponse result = apiInstance.listReports(apiToken, token, limit, startTs, endTs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#listReports");
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
| **startTs** | **Integer**|  | [optional] |
| **endTs** | **Integer**|  | [optional] |

### Return type

[**ListReportsResponse**](ListReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="listReportsOnChannelByUrl"></a>
# **listReportsOnChannelByUrl**
> ListReportsOnChannelByUrlResponse listReportsOnChannelByUrl(apiToken, channelType, channelUrl, token, limit)

List reports on a channel

## List reports on a channel  Retrieves a list of reports on a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-channel ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which is reported for offensive messages or inappropriate activities.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListReportsOnChannelByUrlResponse result = apiInstance.listReportsOnChannelByUrl(apiToken, channelType, channelUrl, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#listReportsOnChannelByUrl");
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
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListReportsOnChannelByUrlResponse**](ListReportsOnChannelByUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="listReportsOnMessageById"></a>
# **listReportsOnMessageById**
> ListReportsOnMessageByIdResponse listReportsOnMessageById(apiToken, channelType, channelUrl, messageId, token, limit)

List reports on a message

## List reports on a message  Retrieves a list of reports on a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where the reported message is in.  &#x60;message_id&#x60;      Type: string      Description: Specifies the unique ID of the reported message.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListReportsOnMessageByIdResponse result = apiInstance.listReportsOnMessageById(apiToken, channelType, channelUrl, messageId, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#listReportsOnMessageById");
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
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListReportsOnMessageByIdResponse**](ListReportsOnMessageByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="listReportsOnUserById"></a>
# **listReportsOnUserById**
> ListReportsOnUserByIdResponse listReportsOnUserById(apiToken, offendingUserId, token, limit)

List reports on a user

## List reports on a user  Retrieves a list of reports on a user who sends an offensive message.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-user ----------------------------   &#x60;offending_user_id&#x60;      Type: string      Description: Specifies the unique ID of the user who has sent the message to report.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String offendingUserId = "offendingUserId_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListReportsOnUserByIdResponse result = apiInstance.listReportsOnUserById(apiToken, offendingUserId, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#listReportsOnUserById");
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
| **offendingUserId** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListReportsOnUserByIdResponse**](ListReportsOnUserByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="reportChannelByUrl"></a>
# **reportChannelByUrl**
> ReportChannelByUrlResponse reportChannelByUrl(apiToken, channelType, channelUrl, reportChannelByUrlData)

Report a channel

## Report a channel  Reports a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    ReportChannelByUrlData reportChannelByUrlData = new ReportChannelByUrlData(); // ReportChannelByUrlData | 
    try {
      ReportChannelByUrlResponse result = apiInstance.reportChannelByUrl(apiToken, channelType, channelUrl, reportChannelByUrlData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#reportChannelByUrl");
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
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **reportChannelByUrlData** | [**ReportChannelByUrlData**](ReportChannelByUrlData.md)|  | [optional] |

### Return type

[**ReportChannelByUrlResponse**](ReportChannelByUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="reportMessageById"></a>
# **reportMessageById**
> ReportMessageByIdResponse reportMessageById(apiToken, channelType, channelUrl, messageId, reportMessageByIdData)

Report a message

## Report a message  Reports a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    ReportMessageByIdData reportMessageByIdData = new ReportMessageByIdData(); // ReportMessageByIdData | 
    try {
      ReportMessageByIdResponse result = apiInstance.reportMessageById(apiToken, channelType, channelUrl, messageId, reportMessageByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#reportMessageById");
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
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |
| **reportMessageByIdData** | [**ReportMessageByIdData**](ReportMessageByIdData.md)|  | [optional] |

### Return type

[**ReportMessageByIdResponse**](ReportMessageByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="reportUserById"></a>
# **reportUserById**
> ReportUserByIdResponse reportUserById(apiToken, offendingUserId, reportUserByIdData)

Report a user

## Report a user  Reports a user who sends an offensive message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String offendingUserId = "offendingUserId_example"; // String | 
    ReportUserByIdData reportUserByIdData = new ReportUserByIdData(); // ReportUserByIdData | 
    try {
      ReportUserByIdResponse result = apiInstance.reportUserById(apiToken, offendingUserId, reportUserByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#reportUserById");
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
| **offendingUserId** | **String**|  | |
| **reportUserByIdData** | [**ReportUserByIdData**](ReportUserByIdData.md)|  | [optional] |

### Return type

[**ReportUserByIdResponse**](ReportUserByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="viewModeratedMessageById"></a>
# **viewModeratedMessageById**
> Map&lt;String, String&gt; viewModeratedMessageById(apiToken, channelType, channelUrl, messageId)

View a moderated message

## View a moderated message  Retrieves information on a message that has been moderated by the [profanity filter](https://sendbird.com/docs/chat/v3/platform-api/guides/filter-and-moderation#2-profanity-filter).  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-view-a-moderated-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    try {
      Map<String, String> result = apiInstance.viewModeratedMessageById(apiToken, channelType, channelUrl, messageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#viewModeratedMessageById");
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
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **String**|  | |

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
| **200** | Successful response |  -  |

