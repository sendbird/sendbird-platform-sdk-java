# StatisticsApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**viewNumberOfDailyActiveUsers**](StatisticsApi.md#viewNumberOfDailyActiveUsers) | **GET** /v3/applications/dau | View number of daily active users |
| [**viewNumberOfMonthlyActiveUsers**](StatisticsApi.md#viewNumberOfMonthlyActiveUsers) | **GET** /v3/applications/mau | View number of monthly active users |



## viewNumberOfDailyActiveUsers

> SendBirdViewNumberOfDailyActiveUsersResponse viewNumberOfDailyActiveUsers().date(date).apiToken(apiToken).execute();

View number of daily active users

## View number of daily active users

Retrieves the number of daily active users of an application.

> **Note**: This metric is scheduled to be calculated every 30 minutes, starting at 00:00 UTC, with the first update at 00:30 UTC. 
  

[https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-daily-active-users#1-get-number-of-daily-active-users](https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-daily-active-users#1-get-number-of-daily-active-users)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.StatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        StatisticsApi apiInstance = new StatisticsApi(defaultClient);
        String date = "date_example"; // String | YYYY-MM-DD
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            SendBirdViewNumberOfDailyActiveUsersResponse result = api.viewNumberOfDailyActiveUsers()
                .date(date)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#viewNumberOfDailyActiveUsers");
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
| **date** | **String**| YYYY-MM-DD | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdViewNumberOfDailyActiveUsersResponse**](SendBirdViewNumberOfDailyActiveUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewNumberOfMonthlyActiveUsers

> SendBirdViewNumberOfMonthlyActiveUsersResponse viewNumberOfMonthlyActiveUsers().date(date).apiToken(apiToken).execute();

View number of monthly active users

## View number of monthly active users

Retrieves the number of monthly active users of an application.

> **Note**: This metric is scheduled to be calculated every 30 minutes, starting at 00:00 UTC, with the first update at 00:30 UTC. 
  

[https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-monthly-active-users#1-get-number-of-monthly-active-users](https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-monthly-active-users#1-get-number-of-monthly-active-users)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.StatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        StatisticsApi apiInstance = new StatisticsApi(defaultClient);
        String date = "date_example"; // String | YYYY-MM-DD
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            SendBirdViewNumberOfMonthlyActiveUsersResponse result = api.viewNumberOfMonthlyActiveUsers()
                .date(date)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#viewNumberOfMonthlyActiveUsers");
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
| **date** | **String**| YYYY-MM-DD | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdViewNumberOfMonthlyActiveUsersResponse**](SendBirdViewNumberOfMonthlyActiveUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

