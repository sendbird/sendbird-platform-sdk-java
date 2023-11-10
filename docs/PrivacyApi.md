# PrivacyApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelTheRegistrationOfGdprRequestById**](PrivacyApi.md#cancelTheRegistrationOfGdprRequestById) | **DELETE** /v3/privacy/gdpr/{request_id} | Cancel the registration of a GDPR request |
| [**listGdprRequests**](PrivacyApi.md#listGdprRequests) | **GET** /v3/privacy/gdpr | List GDPR requests |
| [**registerGdprRequest**](PrivacyApi.md#registerGdprRequest) | **POST** /v3/privacy/gdpr | Register a GDPR request |
| [**viewGdprRequestById**](PrivacyApi.md#viewGdprRequestById) | **GET** /v3/privacy/gdpr/{request_id} | View a GDPR request |



## cancelTheRegistrationOfGdprRequestById

> cancelTheRegistrationOfGdprRequestById(requestId).apiToken(apiToken).execute();

Cancel the registration of a GDPR request

## Cancel the registration of a GDPR request

Cancels the registration of a specific GDPR request.

https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-cancel-the-registration-of-a-gdpr-request
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PrivacyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PrivacyApi apiInstance = new PrivacyApi(defaultClient);
        String requestId = "requestId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            api.cancelTheRegistrationOfGdprRequestById(requestId)
                .apiToken(apiToken)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyApi#cancelTheRegistrationOfGdprRequestById");
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
| **requestId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listGdprRequests

> ListGdprRequestsResponse listGdprRequests().apiToken(apiToken).token(token).limit(limit).execute();

List GDPR requests

## List GDPR requests

Retrieves a list of GDPR requests of all types.

https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-list-gdpr-requests
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PrivacyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PrivacyApi apiInstance = new PrivacyApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListGdprRequestsResponse result = api.listGdprRequests()
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyApi#listGdprRequests");
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

[**ListGdprRequestsResponse**](ListGdprRequestsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## registerGdprRequest

> RegisterGdprRequestResponse registerGdprRequest().apiToken(apiToken).registerGdprRequestData(registerGdprRequestData).execute();

Register a GDPR request

## Register a GDPR request

Registers a specific type of GDPR request to meet the GDPR's requirements.

> __Note__: Currently, only delete and access of the user data are supported. The features for the [right to restriction of processing](https://gdpr-info.eu/art-18-gdpr/) and [right to object](https://gdpr-info.eu/art-21-gdpr/) will be available soon.

https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-register-a-gdpr-request

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PrivacyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PrivacyApi apiInstance = new PrivacyApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        RegisterGdprRequestData registerGdprRequestData = new RegisterGdprRequestData(); // RegisterGdprRequestData | 
        try {
            RegisterGdprRequestResponse result = api.registerGdprRequest()
                .apiToken(apiToken)
                .registerGdprRequestData(registerGdprRequestData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyApi#registerGdprRequest");
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
| **registerGdprRequestData** | [**RegisterGdprRequestData**](RegisterGdprRequestData.md)|  | [optional] |

### Return type

[**RegisterGdprRequestResponse**](RegisterGdprRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewGdprRequestById

> ViewGdprRequestByIdResponse viewGdprRequestById(requestId).apiToken(apiToken).execute();

View a GDPR request

## View a GDPR request

Retrieves a specific GDPR request.

https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-view-a-gdpr-request
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PrivacyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PrivacyApi apiInstance = new PrivacyApi(defaultClient);
        String requestId = "requestId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewGdprRequestByIdResponse result = api.viewGdprRequestById(requestId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivacyApi#viewGdprRequestById");
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
| **requestId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ViewGdprRequestByIdResponse**](ViewGdprRequestByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

