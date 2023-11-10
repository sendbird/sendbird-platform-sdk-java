# PushNotificationsApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3ApplicationsPushSettingsGet**](PushNotificationsApi.md#v3ApplicationsPushSettingsGet) | **GET** /v3/applications/push/settings | Check push notifications |
| [**v3ApplicationsPushSettingsPut**](PushNotificationsApi.md#v3ApplicationsPushSettingsPut) | **PUT** /v3/applications/push/settings | Turn on push notifications |



## v3ApplicationsPushSettingsGet

> V3ApplicationsPushSettingsGet200Response v3ApplicationsPushSettingsGet().apiToken(apiToken).execute();

Check push notifications

## Check push notifications
Shows whether the push notifications feature is turned on for an application.
https://sendbird.com/docs/chat/v3/platform-api/application/managing-notifications/check-push-notifications
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PushNotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PushNotificationsApi apiInstance = new PushNotificationsApi(defaultClient);
        String apiToken = "apiToken_example"; // String | 
        try {
            V3ApplicationsPushSettingsGet200Response result = api.v3ApplicationsPushSettingsGet()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushNotificationsApi#v3ApplicationsPushSettingsGet");
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

[**V3ApplicationsPushSettingsGet200Response**](V3ApplicationsPushSettingsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3ApplicationsPushSettingsPut

> ListPushConfigurationsResponse v3ApplicationsPushSettingsPut().apiToken(apiToken).v3ApplicationsPushSettingsGetRequest(v3ApplicationsPushSettingsGetRequest).execute();

Turn on push notifications

## Turn on push notifications
Determines whether to turn on the push notifications feature for an application.
https://sendbird.com/docs/chat/v3/platform-api/application/managing-notifications/turn-on-push-notifications
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PushNotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PushNotificationsApi apiInstance = new PushNotificationsApi(defaultClient);
        String apiToken = "apiToken_example"; // String | 
        V3ApplicationsPushSettingsGetRequest v3ApplicationsPushSettingsGetRequest = new V3ApplicationsPushSettingsGetRequest(); // V3ApplicationsPushSettingsGetRequest | 
        try {
            ListPushConfigurationsResponse result = api.v3ApplicationsPushSettingsPut()
                .apiToken(apiToken)
                .v3ApplicationsPushSettingsGetRequest(v3ApplicationsPushSettingsGetRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushNotificationsApi#v3ApplicationsPushSettingsPut");
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
| **v3ApplicationsPushSettingsGetRequest** | [**V3ApplicationsPushSettingsGetRequest**](V3ApplicationsPushSettingsGetRequest.md)|  | [optional] |

### Return type

[**ListPushConfigurationsResponse**](ListPushConfigurationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

