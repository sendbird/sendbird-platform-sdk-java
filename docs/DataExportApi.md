# DataExportApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDataExportsByMessageChannelOrUser**](DataExportApi.md#listDataExportsByMessageChannelOrUser) | **GET** /v3/export/{data_type} | List data exports by message, channel, or user |
| [**registerAndScheduleDataExport**](DataExportApi.md#registerAndScheduleDataExport) | **POST** /v3/export/{data_type} | Register and schedule a data export |
| [**viewDataExportById**](DataExportApi.md#viewDataExportById) | **GET** /v3/export/{data_type}/{request_id} | View a data export |



## listDataExportsByMessageChannelOrUser

> ListDataExportsByMessageChannelOrUserResponse listDataExportsByMessageChannelOrUser(dataType).apiToken(apiToken).token(token).limit(limit).execute();

List data exports by message, channel, or user

## List data exports by message, channel, or user

Retrieves a list of message, channel or user data exports

https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-list-data-exports-by-message,-channel,-or-user
----------------------------

 `data_type`
     Type: string
     Description: Specifies the type of a data export to retrieve. Acceptable values are messages, channels, users, and failed_webhooks.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.DataExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        DataExportApi apiInstance = new DataExportApi(defaultClient);
        String dataType = "dataType_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListDataExportsByMessageChannelOrUserResponse result = api.listDataExportsByMessageChannelOrUser(dataType)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dataType** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

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
| **200** | Successful response |  -  |


## registerAndScheduleDataExport

> RegisterAndScheduleDataExportResponse registerAndScheduleDataExport(dataType).apiToken(apiToken).registerAndScheduleDataExportData(registerAndScheduleDataExportData).execute();

Register and schedule a data export

## Register and schedule a data export

Registers and schedules a message, channel, or user data export.

https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-register-and-schedule-a-data-export
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.DataExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        DataExportApi apiInstance = new DataExportApi(defaultClient);
        String dataType = "dataType_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        RegisterAndScheduleDataExportData registerAndScheduleDataExportData = new RegisterAndScheduleDataExportData(); // RegisterAndScheduleDataExportData | 
        try {
            RegisterAndScheduleDataExportResponse result = api.registerAndScheduleDataExport(dataType)
                .apiToken(apiToken)
                .registerAndScheduleDataExportData(registerAndScheduleDataExportData)
                .execute();
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dataType** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **registerAndScheduleDataExportData** | [**RegisterAndScheduleDataExportData**](RegisterAndScheduleDataExportData.md)|  | [optional] |

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
| **200** | Successful response |  -  |


## viewDataExportById

> ViewDataExportByIdResponse viewDataExportById(dataType, requestId).apiToken(apiToken).execute();

View a data export

## View a data export

Retrieves information on a message, channel or user data export.

https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-view-a-data-export
----------------------------

 `data_type`
     Type: string
     Description: Specifies the type of a targeted data export. Acceptable values are messages, channels,  users, and failed_webhooks.
 `request_id`
     Type: string
     Description: Specifies the unique ID of a data export to retrieve.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.DataExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        DataExportApi apiInstance = new DataExportApi(defaultClient);
        String dataType = "dataType_example"; // String | 
        String requestId = "requestId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewDataExportByIdResponse result = api.viewDataExportById(dataType, requestId)
                .apiToken(apiToken)
                .execute();
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dataType** | **String**|  | |
| **requestId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

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
| **200** | Successful response |  -  |

