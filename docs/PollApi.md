# PollApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3PollsGet**](PollApi.md#v3PollsGet) | **GET** /v3/polls | List polls |
| [**v3PollsPollIdClosePut**](PollApi.md#v3PollsPollIdClosePut) | **PUT** /v3/polls/{poll_id}/close | Close a poll |
| [**v3PollsPollIdDelete**](PollApi.md#v3PollsPollIdDelete) | **DELETE** /v3/polls/{poll_id} | Delete a poll |
| [**v3PollsPollIdGet**](PollApi.md#v3PollsPollIdGet) | **GET** /v3/polls/{poll_id} | Get a poll |
| [**v3PollsPollIdOptionsOptionIdDelete**](PollApi.md#v3PollsPollIdOptionsOptionIdDelete) | **DELETE** /v3/polls/{poll_id}/options/{option_id} | Delete a poll option |
| [**v3PollsPollIdOptionsOptionIdGet**](PollApi.md#v3PollsPollIdOptionsOptionIdGet) | **GET** /v3/polls/{poll_id}/options/{option_id} | Get a poll option |
| [**v3PollsPollIdOptionsOptionIdPut**](PollApi.md#v3PollsPollIdOptionsOptionIdPut) | **PUT** /v3/polls/{poll_id}/options/{option_id} | Update a poll option |
| [**v3PollsPollIdOptionsOptionIdVotersGet**](PollApi.md#v3PollsPollIdOptionsOptionIdVotersGet) | **GET** /v3/polls/{poll_id}/options/{option_id}/voters | List voters of a poll option |
| [**v3PollsPollIdOptionsPost**](PollApi.md#v3PollsPollIdOptionsPost) | **POST** /v3/polls/{poll_id}/options | Add a poll option |
| [**v3PollsPollIdPut**](PollApi.md#v3PollsPollIdPut) | **PUT** /v3/polls/{poll_id} | Update a poll |
| [**v3PollsPollIdVotePut**](PollApi.md#v3PollsPollIdVotePut) | **PUT** /v3/polls/{poll_id}/vote | Cast or cancel a vote |
| [**v3PollsPost**](PollApi.md#v3PollsPost) | **POST** /v3/polls | Create a poll |



## v3PollsGet

> SendBirdPoll v3PollsGet(channelUrl, channelType, token, limit).apiToken(apiToken).execute();

List polls

## List polls
This action retrieves a paginated list of both open and closed polls in an application or a specific channel. To retrieve polls in a specific channel, the channel_url must be specified. https://sendbird.com/docs/chat/v3/platform-api/message/polls/list-polls 
-----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        String apiToken = "apiToken_example"; // String | 
        String channelUrl = "channelUrl_example"; // String | 
        String channelType = "channelType_example"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            SendBirdPoll result = api.v3PollsGet(channelUrl, channelType, token, limit)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsGet");
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
| **channelUrl** | **String**|  | [optional] |
| **channelType** | **String**|  | [optional] |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdClosePut

> SendBirdPoll v3PollsPollIdClosePut(pollId).apiToken(apiToken).execute();

Close a poll

## Close a poll
This action closes a poll and prevents users from voting any further. https://sendbird.com/docs/chat/v3/platform-api/message/polls/close-a-poll
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        try {
            SendBirdPoll result = api.v3PollsPollIdClosePut(pollId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdClosePut");
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
| **pollId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdDelete

> Object v3PollsPollIdDelete(pollId).apiToken(apiToken).execute();

Delete a poll

## Delete a poll
This action deletes a poll. Once a poll is deleted, you can't retrieve its data. https://sendbird.com/docs/chat/v3/platform-api/message/polls/delete-a-poll
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        try {
            Object result = api.v3PollsPollIdDelete(pollId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdDelete");
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
| **pollId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdGet

> SendBirdPoll v3PollsPollIdGet(pollId).apiToken(apiToken).v3PollsPollIdDeleteRequest(v3PollsPollIdDeleteRequest).execute();

Get a poll

## Get a poll
This action retrieves information on a specific poll.
https://sendbird.com/docs/chat/v3/platform-api/message/polls/get-a-poll
-----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        V3PollsPollIdDeleteRequest v3PollsPollIdDeleteRequest = new V3PollsPollIdDeleteRequest(); // V3PollsPollIdDeleteRequest | 
        try {
            SendBirdPoll result = api.v3PollsPollIdGet(pollId)
                .apiToken(apiToken)
                .v3PollsPollIdDeleteRequest(v3PollsPollIdDeleteRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdGet");
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
| **pollId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3PollsPollIdDeleteRequest** | [**V3PollsPollIdDeleteRequest**](V3PollsPollIdDeleteRequest.md)|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdOptionsOptionIdDelete

> Object v3PollsPollIdOptionsOptionIdDelete(pollId, optionId).apiToken(apiToken).execute();

Delete a poll option

## Delete a poll option
This action deletes an option from a poll. https://sendbird.com/docs/chat/v3/platform-api/message/polls/delete-a-poll-option ----------------------------- 

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        Integer optionId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        try {
            Object result = api.v3PollsPollIdOptionsOptionIdDelete(pollId, optionId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdOptionsOptionIdDelete");
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
| **pollId** | **Integer**|  | |
| **optionId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdOptionsOptionIdGet

> SendBirdPollOption v3PollsPollIdOptionsOptionIdGet(pollId, optionId).apiToken(apiToken).execute();

Get a poll option

## Get a poll option
This action retrieves a poll option. https://sendbird.com/docs/chat/v3/platform-api/message/polls/get-a-poll-option
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        Integer optionId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        try {
            SendBirdPollOption result = api.v3PollsPollIdOptionsOptionIdGet(pollId, optionId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdOptionsOptionIdGet");
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
| **pollId** | **Integer**|  | |
| **optionId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdPollOption**](SendBirdPollOption.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdOptionsOptionIdPut

> SendBirdPoll v3PollsPollIdOptionsOptionIdPut(pollId, optionId).apiToken(apiToken).v3PollsPollIdOptionsOptionIdDeleteRequest(v3PollsPollIdOptionsOptionIdDeleteRequest).execute();

Update a poll option

## Update a poll option
This action updates the content of a poll option. Voting for an option doesn't update the option. https://sendbird.com/docs/chat/v3/platform-api/message/polls/update-a-poll-option
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        Integer optionId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest = new V3PollsPollIdOptionsOptionIdDeleteRequest(); // V3PollsPollIdOptionsOptionIdDeleteRequest | 
        try {
            SendBirdPoll result = api.v3PollsPollIdOptionsOptionIdPut(pollId, optionId)
                .apiToken(apiToken)
                .v3PollsPollIdOptionsOptionIdDeleteRequest(v3PollsPollIdOptionsOptionIdDeleteRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdOptionsOptionIdPut");
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
| **pollId** | **Integer**|  | |
| **optionId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3PollsPollIdOptionsOptionIdDeleteRequest** | [**V3PollsPollIdOptionsOptionIdDeleteRequest**](V3PollsPollIdOptionsOptionIdDeleteRequest.md)|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdOptionsOptionIdVotersGet

> V3PollsPollIdOptionsOptionIdVotersGet200Response v3PollsPollIdOptionsOptionIdVotersGet(pollId, optionId).apiToken(apiToken).v3PollsPollIdOptionsOptionIdVotersGetRequest(v3PollsPollIdOptionsOptionIdVotersGetRequest).execute();

List voters of a poll option

## List voters of a poll option
This action retrieves a list of users who voted for a poll option. https://sendbird.com/docs/chat/v3/platform-api/message/polls/list-voters-of-a-poll-option 
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        Integer optionId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        V3PollsPollIdOptionsOptionIdVotersGetRequest v3PollsPollIdOptionsOptionIdVotersGetRequest = new V3PollsPollIdOptionsOptionIdVotersGetRequest(); // V3PollsPollIdOptionsOptionIdVotersGetRequest | 
        try {
            V3PollsPollIdOptionsOptionIdVotersGet200Response result = api.v3PollsPollIdOptionsOptionIdVotersGet(pollId, optionId)
                .apiToken(apiToken)
                .v3PollsPollIdOptionsOptionIdVotersGetRequest(v3PollsPollIdOptionsOptionIdVotersGetRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdOptionsOptionIdVotersGet");
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
| **pollId** | **Integer**|  | |
| **optionId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3PollsPollIdOptionsOptionIdVotersGetRequest** | [**V3PollsPollIdOptionsOptionIdVotersGetRequest**](V3PollsPollIdOptionsOptionIdVotersGetRequest.md)|  | [optional] |

### Return type

[**V3PollsPollIdOptionsOptionIdVotersGet200Response**](V3PollsPollIdOptionsOptionIdVotersGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdOptionsPost

> SendBirdPoll v3PollsPollIdOptionsPost(pollId).apiToken(apiToken).v3PollsPollIdOptionsOptionIdDeleteRequest(v3PollsPollIdOptionsOptionIdDeleteRequest).execute();

Add a poll option

## Add a poll option
This action adds a new option to a poll. https://sendbird.com/docs/chat/v3/platform-api/message/polls/add-a-poll-option
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest = new V3PollsPollIdOptionsOptionIdDeleteRequest(); // V3PollsPollIdOptionsOptionIdDeleteRequest | 
        try {
            SendBirdPoll result = api.v3PollsPollIdOptionsPost(pollId)
                .apiToken(apiToken)
                .v3PollsPollIdOptionsOptionIdDeleteRequest(v3PollsPollIdOptionsOptionIdDeleteRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdOptionsPost");
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
| **pollId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3PollsPollIdOptionsOptionIdDeleteRequest** | [**V3PollsPollIdOptionsOptionIdDeleteRequest**](V3PollsPollIdOptionsOptionIdDeleteRequest.md)|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdPut

> SendBirdPoll v3PollsPollIdPut(pollId).apiToken(apiToken).v3PollsPollIdDeleteRequest1(v3PollsPollIdDeleteRequest1).execute();

Update a poll

## Update a poll
This action updates information of a poll. To change the content of a poll option, see the update a poll option page. https://sendbird.com/docs/chat/v3/platform-api/message/polls/update-a-poll
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        V3PollsPollIdDeleteRequest1 v3PollsPollIdDeleteRequest1 = new V3PollsPollIdDeleteRequest1(); // V3PollsPollIdDeleteRequest1 | 
        try {
            SendBirdPoll result = api.v3PollsPollIdPut(pollId)
                .apiToken(apiToken)
                .v3PollsPollIdDeleteRequest1(v3PollsPollIdDeleteRequest1)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdPut");
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
| **pollId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3PollsPollIdDeleteRequest1** | [**V3PollsPollIdDeleteRequest1**](V3PollsPollIdDeleteRequest1.md)|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPollIdVotePut

> SendBirdPoll v3PollsPollIdVotePut(pollId).apiToken(apiToken).v3PollsPollIdVotePutRequest(v3PollsPollIdVotePutRequest).execute();

Cast or cancel a vote

## Cast or cancel a vote
This action adds or removes a vote from a poll option, changing the number of votes given to each option. Use this action to override a previous vote and update the user's final choice of poll options. https://sendbird.com/docs/chat/v3/platform-api/message/polls/cast-or-cancel-a-vote
-----------------------------  

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        Integer pollId = 56; // Integer | 
        String apiToken = "apiToken_example"; // String | 
        V3PollsPollIdVotePutRequest v3PollsPollIdVotePutRequest = new V3PollsPollIdVotePutRequest(); // V3PollsPollIdVotePutRequest | 
        try {
            SendBirdPoll result = api.v3PollsPollIdVotePut(pollId)
                .apiToken(apiToken)
                .v3PollsPollIdVotePutRequest(v3PollsPollIdVotePutRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPollIdVotePut");
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
| **pollId** | **Integer**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3PollsPollIdVotePutRequest** | [**V3PollsPollIdVotePutRequest**](V3PollsPollIdVotePutRequest.md)|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## v3PollsPost

> SendBirdPoll v3PollsPost(title, options).apiToken(apiToken).v3PollsGetRequest(v3PollsGetRequest).execute();

Create a poll

## Create a poll
This action creates a poll with at least one option.You can configure various settings for your poll, including when the poll will close and whether to allow voting for multiple options. After creating a poll, to share the poll with other users in a channel, the poll must be sent as a message. https://sendbird.com/docs/chat/v3/platform-api/message/polls/create-a-poll
-----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.PollApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        PollApi apiInstance = new PollApi(defaultClient);
        String title = "title_example"; // String | 
        List<String> options = Arrays.asList(); // List<String> | 
        String apiToken = "apiToken_example"; // String | 
        V3PollsGetRequest v3PollsGetRequest = new V3PollsGetRequest(); // V3PollsGetRequest | 
        try {
            SendBirdPoll result = api.v3PollsPost(title, options)
                .apiToken(apiToken)
                .v3PollsGetRequest(v3PollsGetRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PollApi#v3PollsPost");
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
| **title** | **String**|  | |
| **options** | **List&lt;String&gt;**|  | |
| **apiToken** | **String**|  | [optional] |
| **v3PollsGetRequest** | [**V3PollsGetRequest**](V3PollsGetRequest.md)|  | [optional] |

### Return type

[**SendBirdPoll**](SendBirdPoll.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

