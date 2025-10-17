# AnnouncementApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scheduleAnAnnouncement**](AnnouncementApi.md#scheduleAnAnnouncement) | **POST** /v3/announcements | Schedule an announcement |



## scheduleAnAnnouncement

> ScheduleAnAnnouncementResponse scheduleAnAnnouncement().apiToken(apiToken).scheduleAnAnnouncementRequest(scheduleAnAnnouncementRequest).execute();

Schedule an announcement

## Schedule an announcement

Creates an announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).

[https://sendbird.com/docs/chat/platform-api/v3/message/announcements/create-an-announcement#1-create-an-announcement](https://sendbird.com/docs/chat/platform-api/v3/message/announcements/create-an-announcement#1-create-an-announcement)

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
        ScheduleAnAnnouncementRequest scheduleAnAnnouncementRequest = new ScheduleAnAnnouncementRequest(); // ScheduleAnAnnouncementRequest | 
        try {
            ScheduleAnAnnouncementResponse result = api.scheduleAnAnnouncement()
                .apiToken(apiToken)
                .scheduleAnAnnouncementRequest(scheduleAnAnnouncementRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#scheduleAnAnnouncement");
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
| **scheduleAnAnnouncementRequest** | [**ScheduleAnAnnouncementRequest**](ScheduleAnAnnouncementRequest.md)|  | [optional] |

### Return type

[**ScheduleAnAnnouncementResponse**](ScheduleAnAnnouncementResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

