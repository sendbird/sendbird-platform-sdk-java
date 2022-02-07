# ReportContentSubjectApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listReports**](ReportContentSubjectApi.md#listReports) | **GET** /v3/report | List reports
[**listReportsOnChannelByUrl**](ReportContentSubjectApi.md#listReportsOnChannelByUrl) | **GET** /v3/report/{channel_type}/{channel_url} | List reports on a channel
[**listReportsOnMessageById**](ReportContentSubjectApi.md#listReportsOnMessageById) | **GET** /v3/report/{channel_type}/{channel_url}/messages/{message_id} | List reports on a message
[**listReportsOnUserById**](ReportContentSubjectApi.md#listReportsOnUserById) | **GET** /v3/report/users/{offending_user_id} | List reports on a user
[**reportChannelByUrl**](ReportContentSubjectApi.md#reportChannelByUrl) | **POST** /v3/report/{channel_type}/{channel_url} | Report a channel
[**reportMessageById**](ReportContentSubjectApi.md#reportMessageById) | **POST** /v3/report/{channel_type}/{channel_url}/messages/{message_id} | Report a message
[**reportUserById**](ReportContentSubjectApi.md#reportUserById) | **POST** /v3/report/users/{offending_user_id} | Report a user
[**viewModeratedMessageById**](ReportContentSubjectApi.md#viewModeratedMessageById) | **GET** /v3/report/{channel_type}/{channel_url}/profanity_messages/{message_id} | View a moderated message


<a name="listReports"></a>
# **listReports**
> InlineResponse20070 listReports(apiToken, token, limit, startTs, endTs)

List reports

## List reports  Retrieves a list of reports within an application regardless of object types.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    Integer startTs = 56; // Integer | 
    Integer endTs = 56; // Integer | 
    try {
      InlineResponse20070 result = apiInstance.listReports(apiToken, token, limit, startTs, endTs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#listReports");
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
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **startTs** | **Integer**|  | [optional]
 **endTs** | **Integer**|  | [optional]

### Return type

[**InlineResponse20070**](InlineResponse20070.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listReportsOnChannelByUrl"></a>
# **listReportsOnChannelByUrl**
> InlineResponse20071 listReportsOnChannelByUrl(channelType, channelUrl, apiToken, token, limit)

List reports on a channel

## List reports on a channel  Retrieves a list of reports on a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-channel ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which is reported for offensive messages or inappropriate activities.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20071 result = apiInstance.listReportsOnChannelByUrl(channelType, channelUrl, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#listReportsOnChannelByUrl");
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
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listReportsOnMessageById"></a>
# **listReportsOnMessageById**
> InlineResponse20071 listReportsOnMessageById(channelType, channelUrl, messageId, apiToken, token, limit)

List reports on a message

## List reports on a message  Retrieves a list of reports on a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where the reported message is in.  &#x60;message_id&#x60;      Type: string      Description: Specifies the unique ID of the reported message.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20071 result = apiInstance.listReportsOnMessageById(channelType, channelUrl, messageId, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#listReportsOnMessageById");
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
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="listReportsOnUserById"></a>
# **listReportsOnUserById**
> InlineResponse20071 listReportsOnUserById(offendingUserId, apiToken, token, limit)

List reports on a user

## List reports on a user  Retrieves a list of reports on a user who sends an offensive message.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-user ----------------------------   &#x60;offending_user_id&#x60;      Type: string      Description: Specifies the unique ID of the user who has sent the message to report.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String offendingUserId = "offendingUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20071 result = apiInstance.listReportsOnUserById(offendingUserId, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#listReportsOnUserById");
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
 **offendingUserId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="reportChannelByUrl"></a>
# **reportChannelByUrl**
> InlineResponse20071ReportLogs reportChannelByUrl(channelType, channelUrl, apiToken, reportChannelByUrlData)

Report a channel

## Report a channel  Reports a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    ReportChannelByUrlData reportChannelByUrlData = new ReportChannelByUrlData(); // ReportChannelByUrlData | 
    try {
      InlineResponse20071ReportLogs result = apiInstance.reportChannelByUrl(channelType, channelUrl, apiToken, reportChannelByUrlData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#reportChannelByUrl");
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
 **reportChannelByUrlData** | [**ReportChannelByUrlData**](ReportChannelByUrlData.md)|  | [optional]

### Return type

[**InlineResponse20071ReportLogs**](InlineResponse20071ReportLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="reportMessageById"></a>
# **reportMessageById**
> InlineResponse20071ReportLogs reportMessageById(channelType, channelUrl, messageId, apiToken, reportMessageByIdData)

Report a message

## Report a message  Reports a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    ReportMessageByIdData reportMessageByIdData = new ReportMessageByIdData(); // ReportMessageByIdData | 
    try {
      InlineResponse20071ReportLogs result = apiInstance.reportMessageById(channelType, channelUrl, messageId, apiToken, reportMessageByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#reportMessageById");
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
 **messageId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **reportMessageByIdData** | [**ReportMessageByIdData**](ReportMessageByIdData.md)|  | [optional]

### Return type

[**InlineResponse20071ReportLogs**](InlineResponse20071ReportLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="reportUserById"></a>
# **reportUserById**
> InlineResponse20071ReportLogs reportUserById(offendingUserId, apiToken, reportUserByIdData)

Report a user

## Report a user  Reports a user who sends an offensive message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String offendingUserId = "offendingUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    ReportUserByIdData reportUserByIdData = new ReportUserByIdData(); // ReportUserByIdData | 
    try {
      InlineResponse20071ReportLogs result = apiInstance.reportUserById(offendingUserId, apiToken, reportUserByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#reportUserById");
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
 **offendingUserId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **reportUserByIdData** | [**ReportUserByIdData**](ReportUserByIdData.md)|  | [optional]

### Return type

[**InlineResponse20071ReportLogs**](InlineResponse20071ReportLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewModeratedMessageById"></a>
# **viewModeratedMessageById**
> Map&lt;String, String&gt; viewModeratedMessageById(channelType, channelUrl, messageId, apiToken)

View a moderated message

## View a moderated message  Retrieves information on a message that has been moderated by the [profanity filter](https://sendbird.com/docs/chat/v3/platform-api/guides/filter-and-moderation#2-profanity-filter).  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-view-a-moderated-message ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ReportContentSubjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ReportContentSubjectApi apiInstance = new ReportContentSubjectApi(defaultClient);
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String messageId = "messageId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      Map<String, String> result = apiInstance.viewModeratedMessageById(channelType, channelUrl, messageId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportContentSubjectApi#viewModeratedMessageById");
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
 **messageId** | **String**|  |
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

