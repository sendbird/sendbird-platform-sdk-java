# PinAMessageApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3ChannelTypeChannelUrlMessagesMessageIdPinPost**](PinAMessageApi.md#v3ChannelTypeChannelUrlMessagesMessageIdPinPost) | **POST** /v3/{channel_type}/{channel_url}/messages/{message_id}/pin | Add a new pin |



## v3ChannelTypeChannelUrlMessagesMessageIdPinPost

> SendBirdChannelResponse v3ChannelTypeChannelUrlMessagesMessageIdPinPost(channelType, channelUrl, messageId).apiToken(apiToken).execute();

Add a new pin

## Add a new pin
Pin a message to its channel.
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PinAMessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PinAMessageApi apiInstance = new PinAMessageApi(defaultClient);
        String channelType = "channelType_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        Integer messageId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        try {
            SendBirdChannelResponse result = api.v3ChannelTypeChannelUrlMessagesMessageIdPinPost(channelType, channelUrl, messageId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PinAMessageApi#v3ChannelTypeChannelUrlMessagesMessageIdPinPost");
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

