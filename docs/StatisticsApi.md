# StatisticsApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**retrieveAdvancedAnalyticsMetrics**](StatisticsApi.md#retrieveAdvancedAnalyticsMetrics) | **GET** /v3/statistics/metric | Retrieve Advanced analytics metrics |
| [**viewNumberOfConcurrentConnections**](StatisticsApi.md#viewNumberOfConcurrentConnections) | **GET** /v3/applications/ccu | View number of concurrent connections |
| [**viewNumberOfDailyActiveUsers**](StatisticsApi.md#viewNumberOfDailyActiveUsers) | **GET** /v3/applications/dau | View number of daily active users |
| [**viewNumberOfMonthlyActiveUsers**](StatisticsApi.md#viewNumberOfMonthlyActiveUsers) | **GET** /v3/applications/mau | View number of monthly active users |
| [**viewNumberOfPeakConnections**](StatisticsApi.md#viewNumberOfPeakConnections) | **GET** /v3/applications/peak_connections | View number of peak connections |



## retrieveAdvancedAnalyticsMetrics

> RetrieveAdvancedAnalyticsMetricsResponse retrieveAdvancedAnalyticsMetrics(apiToken)

Retrieve Advanced analytics metrics

## Retrieve Advanced analytics metrics

Retrieves Advanced analytics metrics based on the specified parameters. You can retrieve either daily or monthly metrics using the time_dimension parameter.

>__Note__: Daily metrics are calculated and updated every three hours, starting at 1 a.m. in UTC. Meanwhile, monthly metrics are calculated after the last day of the month.

https://sendbird.com/docs/chat/v3/platform-api/guides/advanced-analytics#2-retrieve-advanced-analytics-metrics
----------------------------

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            RetrieveAdvancedAnalyticsMetricsResponse result = apiInstance.retrieveAdvancedAnalyticsMetrics(apiToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#retrieveAdvancedAnalyticsMetrics");
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

### Return type

[**RetrieveAdvancedAnalyticsMetricsResponse**](RetrieveAdvancedAnalyticsMetricsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewNumberOfConcurrentConnections

> ViewNumberOfConcurrentConnectionsResponse viewNumberOfConcurrentConnections(apiToken)

View number of concurrent connections

## View number of concurrent connections

Retrieves the number of devices and opened browser tabs which are currently connected to Sendbird server.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-concurrent-connections

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewNumberOfConcurrentConnectionsResponse result = apiInstance.viewNumberOfConcurrentConnections(apiToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#viewNumberOfConcurrentConnections");
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

### Return type

[**ViewNumberOfConcurrentConnectionsResponse**](ViewNumberOfConcurrentConnectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewNumberOfDailyActiveUsers

> ViewNumberOfDailyActiveUsersResponse viewNumberOfDailyActiveUsers(apiToken, date)

View number of daily active users

## View number of daily active users

Retrieves the number of daily active users of the application (DAU).

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-daily-active-users
----------------------------

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String date = "date_example"; // String | 
        try {
            ViewNumberOfDailyActiveUsersResponse result = apiInstance.viewNumberOfDailyActiveUsers(apiToken, date);
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
| **apiToken** | **String**|  | |
| **date** | **String**|  | [optional] |

### Return type

[**ViewNumberOfDailyActiveUsersResponse**](ViewNumberOfDailyActiveUsersResponse.md)

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

> ViewNumberOfMonthlyActiveUsersResponse viewNumberOfMonthlyActiveUsers(apiToken, date)

View number of monthly active users

## View number of monthly active users

Retrieves the number of monthly active users of the application (MAU).

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-monthly-active-users
----------------------------

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String date = "date_example"; // String | 
        try {
            ViewNumberOfMonthlyActiveUsersResponse result = apiInstance.viewNumberOfMonthlyActiveUsers(apiToken, date);
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
| **apiToken** | **String**|  | |
| **date** | **String**|  | [optional] |

### Return type

[**ViewNumberOfMonthlyActiveUsersResponse**](ViewNumberOfMonthlyActiveUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewNumberOfPeakConnections

> ViewNumberOfPeakConnectionsResponse viewNumberOfPeakConnections(apiToken, timeDimension, startYear, startMonth, endYear, endMonth, startDay, endDay)

View number of peak connections

## View number of peak connections

Retrieves the number of concurrently connected devices to Sendbird server during the requested time period.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-peak-connections
----------------------------

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String timeDimension = "timeDimension_example"; // String | 
        Integer startYear = 56; // Integer | 
        Integer startMonth = 56; // Integer | 
        Integer endYear = 56; // Integer | 
        Integer endMonth = 56; // Integer | 
        Integer startDay = 56; // Integer | 
        Integer endDay = 56; // Integer | 
        try {
            ViewNumberOfPeakConnectionsResponse result = apiInstance.viewNumberOfPeakConnections(apiToken, timeDimension, startYear, startMonth, endYear, endMonth, startDay, endDay);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#viewNumberOfPeakConnections");
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
| **timeDimension** | **String**|  | |
| **startYear** | **Integer**|  | |
| **startMonth** | **Integer**|  | |
| **endYear** | **Integer**|  | |
| **endMonth** | **Integer**|  | |
| **startDay** | **Integer**|  | [optional] |
| **endDay** | **Integer**|  | [optional] |

### Return type

[**ViewNumberOfPeakConnectionsResponse**](ViewNumberOfPeakConnectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

