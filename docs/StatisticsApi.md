# StatisticsApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetailedOpenRateOfAnnouncementById**](StatisticsApi.md#getDetailedOpenRateOfAnnouncementById) | **GET** /v3/announcement_open_rate/{unique_id} | Get detailed open rate of an announcement |
| [**getDetailedOpenStatusOfAnnouncementById**](StatisticsApi.md#getDetailedOpenStatusOfAnnouncementById) | **GET** /v3/announcement_open_status/{unique_id} | Get detailed open status of an announcement |
| [**retrieveAdvancedAnalyticsMetrics**](StatisticsApi.md#retrieveAdvancedAnalyticsMetrics) | **GET** /v3/statistics/metric | Retrieve Advanced analytics metrics |
| [**viewNumberOfConcurrentConnections**](StatisticsApi.md#viewNumberOfConcurrentConnections) | **GET** /v3/applications/ccu | View number of concurrent connections |
| [**viewNumberOfDailyActiveUsers**](StatisticsApi.md#viewNumberOfDailyActiveUsers) | **GET** /v3/applications/dau | View number of daily active users |
| [**viewNumberOfMonthlyActiveUsers**](StatisticsApi.md#viewNumberOfMonthlyActiveUsers) | **GET** /v3/applications/mau | View number of monthly active users |
| [**viewNumberOfPeakConnections**](StatisticsApi.md#viewNumberOfPeakConnections) | **GET** /v3/applications/peak_connections | View number of peak connections |



## getDetailedOpenRateOfAnnouncementById

> GetDetailedOpenRateOfAnnouncementByIdResponse getDetailedOpenRateOfAnnouncementById(uniqueId).apiToken(apiToken).execute();

Get detailed open rate of an announcement

## Get detailed open rate of an announcement

Retrieves the detailed open rate information of an announcement.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement
----------------------------

 `unique_id`
     Type: string
     Description: Specifies the unique ID of the announcement to get its open rate.

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
        String uniqueId = "uniqueId_example"; // String | 
        try {
            GetDetailedOpenRateOfAnnouncementByIdResponse result = api.getDetailedOpenRateOfAnnouncementById(uniqueId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#getDetailedOpenRateOfAnnouncementById");
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
| **uniqueId** | **String**|  | |

### Return type

[**GetDetailedOpenRateOfAnnouncementByIdResponse**](GetDetailedOpenRateOfAnnouncementByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getDetailedOpenStatusOfAnnouncementById

> GetDetailedOpenStatusOfAnnouncementByIdResponse getDetailedOpenStatusOfAnnouncementById(uniqueId).apiToken(apiToken).limit(limit).next(next).uniqueIds(uniqueIds).channelUrls(channelUrls).hasOpened(hasOpened).execute();

Get detailed open status of an announcement

## Get detailed open status of an announcement

Retrieves the detailed open status information of a specific announcement.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-status-of-an-announcement
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
        String uniqueId = "uniqueId_example"; // String | 
        Integer limit = 56; // Integer | 
        String next = "next_example"; // String | 
        List<String> uniqueIds = Arrays.asList(); // List<String> | 
        List<String> channelUrls = Arrays.asList(); // List<String> | 
        Boolean hasOpened = true; // Boolean | 
        try {
            GetDetailedOpenStatusOfAnnouncementByIdResponse result = api.getDetailedOpenStatusOfAnnouncementById(uniqueId)
                .apiToken(apiToken)
                .limit(limit)
                .next(next)
                .uniqueIds(uniqueIds)
                .channelUrls(channelUrls)
                .hasOpened(hasOpened)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatisticsApi#getDetailedOpenStatusOfAnnouncementById");
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
| **uniqueId** | **String**|  | |
| **limit** | **Integer**|  | [optional] |
| **next** | **String**|  | [optional] |
| **uniqueIds** | **List&lt;String&gt;**|  | [optional] |
| **channelUrls** | **List&lt;String&gt;**|  | [optional] |
| **hasOpened** | **Boolean**|  | [optional] |

### Return type

[**GetDetailedOpenStatusOfAnnouncementByIdResponse**](GetDetailedOpenStatusOfAnnouncementByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## retrieveAdvancedAnalyticsMetrics

> RetrieveAdvancedAnalyticsMetricsResponse retrieveAdvancedAnalyticsMetrics().apiToken(apiToken).execute();

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
            RetrieveAdvancedAnalyticsMetricsResponse result = api.retrieveAdvancedAnalyticsMetrics()
                .apiToken(apiToken)
                .execute();
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

> ViewNumberOfConcurrentConnectionsResponse viewNumberOfConcurrentConnections().apiToken(apiToken).execute();

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
            ViewNumberOfConcurrentConnectionsResponse result = api.viewNumberOfConcurrentConnections()
                .apiToken(apiToken)
                .execute();
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

> ViewNumberOfDailyActiveUsersResponse viewNumberOfDailyActiveUsers().apiToken(apiToken).date(date).execute();

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
            ViewNumberOfDailyActiveUsersResponse result = api.viewNumberOfDailyActiveUsers()
                .apiToken(apiToken)
                .date(date)
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

> ViewNumberOfMonthlyActiveUsersResponse viewNumberOfMonthlyActiveUsers().apiToken(apiToken).date(date).execute();

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
            ViewNumberOfMonthlyActiveUsersResponse result = api.viewNumberOfMonthlyActiveUsers()
                .apiToken(apiToken)
                .date(date)
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

> ViewNumberOfPeakConnectionsResponse viewNumberOfPeakConnections().apiToken(apiToken).timeDimension(timeDimension).startYear(startYear).startMonth(startMonth).endYear(endYear).endMonth(endMonth).startDay(startDay).endDay(endDay).execute();

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
            ViewNumberOfPeakConnectionsResponse result = api.viewNumberOfPeakConnections()
                .apiToken(apiToken)
                .timeDimension(timeDimension)
                .startYear(startYear)
                .startMonth(startMonth)
                .endYear(endYear)
                .endMonth(endMonth)
                .startDay(startDay)
                .endDay(endDay)
                .execute();
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

