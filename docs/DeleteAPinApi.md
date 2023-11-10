# DeleteAPinApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3ChannelTypeChannelUrlMessagesMessageIdPinDelete**](DeleteAPinApi.md#v3ChannelTypeChannelUrlMessagesMessageIdPinDelete) | **DELETE** /v3/{channel_type}/{channel_url}/messages/{message_id}/pin | Delete a pin |



## v3ChannelTypeChannelUrlMessagesMessageIdPinDelete

> SendBirdChannelResponse v3ChannelTypeChannelUrlMessagesMessageIdPinDelete(channelType, channelUrl, messageId).apiToken(apiToken).execute();

Delete a pin

## Delete a pin
Unpin a message from its channel.
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.DeleteAPinApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        DeleteAPinApi apiInstance = new DeleteAPinApi(defaultClient);
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        Integer messageId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        try {
            SendBirdChannelResponse result = api.v3ChannelTypeChannelUrlMessagesMessageIdPinDelete(channelType, channelUrl, messageId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeleteAPinApi#v3ChannelTypeChannelUrlMessagesMessageIdPinDelete");
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
| **channelType** | **String**|  | |
| **channelUrl** | **String**|  | |
| **messageId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdChannelResponse**](SendBirdChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

