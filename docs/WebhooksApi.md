# WebhooksApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chooseWhichEventsToSubscribeTo**](WebhooksApi.md#chooseWhichEventsToSubscribeTo) | **PUT** /v3/applications/settings/webhook | Choose which events to subscribe to
[**retrieveListOfSubscribedEvents**](WebhooksApi.md#retrieveListOfSubscribedEvents) | **GET** /v3/applications/settings/webhook | Retrieve a list of subscribed events


<a name="chooseWhichEventsToSubscribeTo"></a>
# **chooseWhichEventsToSubscribeTo**
> ChooseWhichEventsToSubscribeToResponse chooseWhichEventsToSubscribeTo(apiToken, chooseWhichEventsToSubscribeToData)

Choose which events to subscribe to

## Choose which events to subscribe to  Chooses which events for your webhook server to receive payloads for. By subscribing to specific events based on your own needs, you can control the number of HTTP requests to your webhook server.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-choose-which-events-to-subscribe-to

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData = new ChooseWhichEventsToSubscribeToData(); // ChooseWhichEventsToSubscribeToData | 
    try {
      ChooseWhichEventsToSubscribeToResponse result = apiInstance.chooseWhichEventsToSubscribeTo(apiToken, chooseWhichEventsToSubscribeToData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#chooseWhichEventsToSubscribeTo");
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
 **chooseWhichEventsToSubscribeToData** | [**ChooseWhichEventsToSubscribeToData**](ChooseWhichEventsToSubscribeToData.md)|  | [optional]

### Return type

[**ChooseWhichEventsToSubscribeToResponse**](ChooseWhichEventsToSubscribeToResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="retrieveListOfSubscribedEvents"></a>
# **retrieveListOfSubscribedEvents**
> RetrieveListOfSubscribedEventsResponse retrieveListOfSubscribedEvents(apiToken, displayAllWebhookCategories)

Retrieve a list of subscribed events

## Retrieve a list of subscribed events  Retrieves a list of events for your webhook server to receive payloads for.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-retrieve-a-list-of-subscribed-events ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    Boolean displayAllWebhookCategories = true; // Boolean | 
    try {
      RetrieveListOfSubscribedEventsResponse result = apiInstance.retrieveListOfSubscribedEvents(apiToken, displayAllWebhookCategories);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#retrieveListOfSubscribedEvents");
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
 **displayAllWebhookCategories** | **Boolean**|  | [optional]

### Return type

[**RetrieveListOfSubscribedEventsResponse**](RetrieveListOfSubscribedEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

