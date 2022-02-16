# DataExportApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDataExportsByMessageChannelOrUser**](DataExportApi.md#listDataExportsByMessageChannelOrUser) | **GET** /v3/export/{data_type} | List data exports by message, channel, or user
[**registerAndScheduleDataExport**](DataExportApi.md#registerAndScheduleDataExport) | **POST** /v3/export/{data_type} | Register and schedule a data export
[**viewDataExportById**](DataExportApi.md#viewDataExportById) | **GET** /v3/export/{data_type}/{request_id} | View a data export


<a name="listDataExportsByMessageChannelOrUser"></a>
# **listDataExportsByMessageChannelOrUser**
> ListDataExportsByMessageChannelOrUserResponse listDataExportsByMessageChannelOrUser(apiToken, dataType, token, limit)

List data exports by message, channel, or user

## List data exports by message, channel, or user  Retrieves a list of message, channel or user data exports  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-list-data-exports-by-message,-channel,-or-user ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a data export to retrieve. Acceptable values are messages, channels, users, and failed_webhooks.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.DataExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    DataExportApi apiInstance = new DataExportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String dataType = "dataType_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListDataExportsByMessageChannelOrUserResponse result = apiInstance.listDataExportsByMessageChannelOrUser(apiToken, dataType, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExportApi#listDataExportsByMessageChannelOrUser");
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
 **dataType** | **String**|  |
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**ListDataExportsByMessageChannelOrUserResponse**](ListDataExportsByMessageChannelOrUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="registerAndScheduleDataExport"></a>
# **registerAndScheduleDataExport**
> RegisterAndScheduleDataExportResponse registerAndScheduleDataExport(apiToken, dataType, registerAndScheduleDataExportData)

Register and schedule a data export

## Register and schedule a data export  Registers and schedules a message, channel, or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-register-and-schedule-a-data-export ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.DataExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    DataExportApi apiInstance = new DataExportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String dataType = "dataType_example"; // String | 
    RegisterAndScheduleDataExportData registerAndScheduleDataExportData = new RegisterAndScheduleDataExportData(); // RegisterAndScheduleDataExportData | 
    try {
      RegisterAndScheduleDataExportResponse result = apiInstance.registerAndScheduleDataExport(apiToken, dataType, registerAndScheduleDataExportData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExportApi#registerAndScheduleDataExport");
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
 **dataType** | **String**|  |
 **registerAndScheduleDataExportData** | [**RegisterAndScheduleDataExportData**](RegisterAndScheduleDataExportData.md)|  | [optional]

### Return type

[**RegisterAndScheduleDataExportResponse**](RegisterAndScheduleDataExportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewDataExportById"></a>
# **viewDataExportById**
> ViewDataExportByIdResponse viewDataExportById(apiToken, dataType, requestId)

View a data export

## View a data export  Retrieves information on a message, channel or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-view-a-data-export ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a targeted data export. Acceptable values are messages, channels,  users, and failed_webhooks.  &#x60;request_id&#x60;      Type: string      Description: Specifies the unique ID of a data export to retrieve.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.DataExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    DataExportApi apiInstance = new DataExportApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String dataType = "dataType_example"; // String | 
    String requestId = "requestId_example"; // String | 
    try {
      ViewDataExportByIdResponse result = apiInstance.viewDataExportById(apiToken, dataType, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataExportApi#viewDataExportById");
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
 **dataType** | **String**|  |
 **requestId** | **String**|  |

### Return type

[**ViewDataExportByIdResponse**](ViewDataExportByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

