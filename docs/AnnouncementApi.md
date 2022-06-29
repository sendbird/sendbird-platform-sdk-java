# AnnouncementApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetailedOpenRateOfAnnouncementById**](AnnouncementApi.md#getDetailedOpenRateOfAnnouncementById) | **GET** /v3/announcement_open_rate/{unique_id} | Get detailed open rate of an announcement |
| [**getDetailedOpenRateOfAnnouncementGroup**](AnnouncementApi.md#getDetailedOpenRateOfAnnouncementGroup) | **GET** /v3/announcement_open_rate_by_group/{announcement_group} | Get detailed open rate of an announcement group |
| [**getDetailedOpenStatusOfAnnouncementById**](AnnouncementApi.md#getDetailedOpenStatusOfAnnouncementById) | **GET** /v3/announcement_open_status/{unique_id} | Get detailed open status of an announcement |
| [**viewAnnouncementById**](AnnouncementApi.md#viewAnnouncementById) | **GET** /v3/announcements/{unique_id} | View an announcement |


<a name="getDetailedOpenRateOfAnnouncementById"></a>
# **getDetailedOpenRateOfAnnouncementById**
> GetDetailedOpenRateOfAnnouncementByIdResponse getDetailedOpenRateOfAnnouncementById(apiToken, uniqueId)

Get detailed open rate of an announcement

## Get detailed open rate of an announcement  Retrieves the detailed open rate information of an announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement ----------------------------   &#x60;unique_id&#x60;      Type: string      Description: Specifies the unique ID of the announcement to get its open rate.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String uniqueId = "uniqueId_example"; // String | 
    try {
      GetDetailedOpenRateOfAnnouncementByIdResponse result = apiInstance.getDetailedOpenRateOfAnnouncementById(apiToken, uniqueId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#getDetailedOpenRateOfAnnouncementById");
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

<a name="getDetailedOpenRateOfAnnouncementGroup"></a>
# **getDetailedOpenRateOfAnnouncementGroup**
> GetDetailedOpenRateOfAnnouncementGroupResponse getDetailedOpenRateOfAnnouncementGroup(apiToken, announcementGroup)

Get detailed open rate of an announcement group

## Get detailed open rate of an announcement group  Retrieves the detailed open rate information of an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement-group ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String announcementGroup = "announcementGroup_example"; // String | 
    try {
      GetDetailedOpenRateOfAnnouncementGroupResponse result = apiInstance.getDetailedOpenRateOfAnnouncementGroup(apiToken, announcementGroup);
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
| **apiToken** | **String**|  | |
| **announcementGroup** | **String**|  | |

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

<a name="getDetailedOpenStatusOfAnnouncementById"></a>
# **getDetailedOpenStatusOfAnnouncementById**
> GetDetailedOpenStatusOfAnnouncementByIdResponse getDetailedOpenStatusOfAnnouncementById(apiToken, uniqueId, limit, next, uniqueIds, channelUrls, hasOpened)

Get detailed open status of an announcement

## Get detailed open status of an announcement  Retrieves the detailed open status information of a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-status-of-an-announcement ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String uniqueId = "uniqueId_example"; // String | 
    Integer limit = 56; // Integer | 
    String next = "next_example"; // String | 
    List<String> uniqueIds = Arrays.asList(); // List<String> | 
    List<String> channelUrls = Arrays.asList(); // List<String> | 
    Boolean hasOpened = true; // Boolean | 
    try {
      GetDetailedOpenStatusOfAnnouncementByIdResponse result = apiInstance.getDetailedOpenStatusOfAnnouncementById(apiToken, uniqueId, limit, next, uniqueIds, channelUrls, hasOpened);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#getDetailedOpenStatusOfAnnouncementById");
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
| **uniqueIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **channelUrls** | [**List&lt;String&gt;**](String.md)|  | [optional] |
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

<a name="viewAnnouncementById"></a>
# **viewAnnouncementById**
> ViewAnnouncementByIdResponse viewAnnouncementById(apiToken, uniqueId)

View an announcement

## View an announcement  Retrieves information on a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-view-an-announcement ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.AnnouncementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String uniqueId = "uniqueId_example"; // String | 
    try {
      ViewAnnouncementByIdResponse result = apiInstance.viewAnnouncementById(apiToken, uniqueId);
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
| **apiToken** | **String**|  | |
| **uniqueId** | **String**|  | |

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

