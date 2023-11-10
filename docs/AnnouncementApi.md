# AnnouncementApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetailedOpenRateOfAnnouncementGroup**](AnnouncementApi.md#getDetailedOpenRateOfAnnouncementGroup) | **GET** /v3/announcement_open_rate_by_group/{announcement_group} | Get detailed open rate of an announcement group |
| [**getStatistics**](AnnouncementApi.md#getStatistics) | **GET** /v3/announcement_stats/weekly | Get statistics - weekly |
| [**getStatisticsDaily**](AnnouncementApi.md#getStatisticsDaily) | **GET** /v3/announcement_stats/daily | Get statistics - daily |
| [**getStatisticsMonthly**](AnnouncementApi.md#getStatisticsMonthly) | **GET** /v3/announcement_stats/monthly | Get statistics - monthly |
| [**listAnnouncementGroups**](AnnouncementApi.md#listAnnouncementGroups) | **GET** /v3/announcement_group | List announcement groups |
| [**scheduleAnnouncement**](AnnouncementApi.md#scheduleAnnouncement) | **POST** /v3/announcements | Schedule an announcement |
| [**updateAnnouncementById**](AnnouncementApi.md#updateAnnouncementById) | **PUT** /v3/announcements/{unique_id} | Update an announcement |
| [**viewAnnouncementById**](AnnouncementApi.md#viewAnnouncementById) | **GET** /v3/announcements/{unique_id} | View an announcement |



## getDetailedOpenRateOfAnnouncementGroup

> GetDetailedOpenRateOfAnnouncementGroupResponse getDetailedOpenRateOfAnnouncementGroup(announcementGroup).apiToken(apiToken).execute();

Get detailed open rate of an announcement group

## Get detailed open rate of an announcement group

Retrieves the detailed open rate information of an announcement group.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement-group
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String announcementGroup = "announcementGroup_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetDetailedOpenRateOfAnnouncementGroupResponse result = api.getDetailedOpenRateOfAnnouncementGroup(announcementGroup)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#getDetailedOpenRateOfAnnouncementGroup");
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
| **announcementGroup** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**GetDetailedOpenRateOfAnnouncementGroupResponse**](GetDetailedOpenRateOfAnnouncementGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getStatistics

> GetStatisticsResponse getStatistics().apiToken(apiToken).execute();

Get statistics - weekly

## Get statistics

Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetStatisticsResponse result = api.getStatistics()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#getStatistics");
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
| **apiToken** | **String**|  | [optional] |

### Return type

[**GetStatisticsResponse**](GetStatisticsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getStatisticsDaily

> GetStatisticsDailyResponse getStatisticsDaily().startDate(startDate).endDate(endDate).startWeek(startWeek).endWeek(endWeek).startMonth(startMonth).endMonth(endMonth).apiToken(apiToken).announcementGroup(announcementGroup).execute();

Get statistics - daily

## Get statistics

Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String startDate = "startDate_example"; // String | 
        String endDate = "endDate_example"; // String | 
        String startWeek = "startWeek_example"; // String | 
        String endWeek = "endWeek_example"; // String | 
        String startMonth = "startMonth_example"; // String | 
        String endMonth = "endMonth_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String announcementGroup = "announcementGroup_example"; // String | 
        try {
            GetStatisticsDailyResponse result = api.getStatisticsDaily()
                .startDate(startDate)
                .endDate(endDate)
                .startWeek(startWeek)
                .endWeek(endWeek)
                .startMonth(startMonth)
                .endMonth(endMonth)
                .apiToken(apiToken)
                .announcementGroup(announcementGroup)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#getStatisticsDaily");
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
| **startDate** | **String**|  | |
| **endDate** | **String**|  | |
| **startWeek** | **String**|  | |
| **endWeek** | **String**|  | |
| **startMonth** | **String**|  | |
| **endMonth** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **announcementGroup** | **String**|  | [optional] |

### Return type

[**GetStatisticsDailyResponse**](GetStatisticsDailyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## getStatisticsMonthly

> GetStatisticsMonthlyResponse getStatisticsMonthly().apiToken(apiToken).execute();

Get statistics - monthly

## Get statistics

Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetStatisticsMonthlyResponse result = api.getStatisticsMonthly()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#getStatisticsMonthly");
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
| **apiToken** | **String**|  | [optional] |

### Return type

[**GetStatisticsMonthlyResponse**](GetStatisticsMonthlyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listAnnouncementGroups

> ListAnnouncementGroupsResponse listAnnouncementGroups().apiToken(apiToken).token(token).limit(limit).execute();

List announcement groups

## List announcement groups

Retrieves a list of announcement groups.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListAnnouncementGroupsResponse result = api.listAnnouncementGroups()
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#listAnnouncementGroups");
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
| **apiToken** | **String**|  | [optional] |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListAnnouncementGroupsResponse**](ListAnnouncementGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## scheduleAnnouncement

> ScheduleAnnouncementResponse scheduleAnnouncement().apiToken(apiToken).scheduleAnnouncementData(scheduleAnnouncementData).execute();

Schedule an announcement

## Schedule an announcement

Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        ScheduleAnnouncementData scheduleAnnouncementData = new ScheduleAnnouncementData(); // ScheduleAnnouncementData | 
        try {
            ScheduleAnnouncementResponse result = api.scheduleAnnouncement()
                .apiToken(apiToken)
                .scheduleAnnouncementData(scheduleAnnouncementData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#scheduleAnnouncement");
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
| **apiToken** | **String**|  | [optional] |
| **scheduleAnnouncementData** | [**ScheduleAnnouncementData**](ScheduleAnnouncementData.md)|  | [optional] |

### Return type

[**ScheduleAnnouncementResponse**](ScheduleAnnouncementResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateAnnouncementById

> UpdateAnnouncementByIdResponse updateAnnouncementById(uniqueId).apiToken(apiToken).updateAnnouncementByIdData(updateAnnouncementByIdData).execute();

Update an announcement

## Update an announcement

Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.

>__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn't started yet.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String uniqueId = "uniqueId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateAnnouncementByIdData updateAnnouncementByIdData = new UpdateAnnouncementByIdData(); // UpdateAnnouncementByIdData | 
        try {
            UpdateAnnouncementByIdResponse result = api.updateAnnouncementById(uniqueId)
                .apiToken(apiToken)
                .updateAnnouncementByIdData(updateAnnouncementByIdData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#updateAnnouncementById");
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
| **uniqueId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **updateAnnouncementByIdData** | [**UpdateAnnouncementByIdData**](UpdateAnnouncementByIdData.md)|  | [optional] |

### Return type

[**UpdateAnnouncementByIdResponse**](UpdateAnnouncementByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewAnnouncementById

> ViewAnnouncementByIdResponse viewAnnouncementById(uniqueId).apiToken(apiToken).execute();

View an announcement

## View an announcement

Retrieves information on a specific announcement.

https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-view-an-announcement
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        String uniqueId = "uniqueId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewAnnouncementByIdResponse result = api.viewAnnouncementById(uniqueId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#viewAnnouncementById");
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
| **uniqueId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ViewAnnouncementByIdResponse**](ViewAnnouncementByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

