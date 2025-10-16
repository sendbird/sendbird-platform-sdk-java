# ModerationApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockAUser**](ModerationApi.md#blockAUser) | **POST** /v3/users/{user_id}/block | Block a user |
| [**freezeAGroupChannel**](ModerationApi.md#freezeAGroupChannel) | **PUT** /v3/group_channels/{channel_url}/freeze | Freeze a group channel |
| [**freezeAnOpenChannel**](ModerationApi.md#freezeAnOpenChannel) | **PUT** /v3/open_channels/{channel_url}/freeze | Freeze an open channel |
| [**listBlockedUsers**](ModerationApi.md#listBlockedUsers) | **GET** /v3/users/{user_id}/block | List blocked users |
| [**unblockAUser**](ModerationApi.md#unblockAUser) | **DELETE** /v3/users/{user_id}/block/{target_id} | Unblock a user |



## blockAUser

> SendBirdBlockAUserResponse blockAUser(userId).apiToken(apiToken).sendBirdBlockAUserRequest(sendBirdBlockAUserRequest).execute();

Block a user

## Block a user

A user can block another user if the user doesn't wish to receive any messages or notifications from the blocked user in a 1-to-1 group channel. In a 1-to-N group channel, the user can still receive messages from the blocked user, but this depends on the UI settings of the chat view. In any case, notifications from the blocked user won't be delivered to the 1-to-N group channel. You can choose whether or not the user can view [which users are blocked](https://sendbird.com/docs/chat/platform-api/v3/moderation/listing-blocked-and-blocking-users/list-blocked-and-blocking-users) in the channel UI.

Sendbird application provides two blocking options: include or exclude blocked users when sending invitations, and turn on or off notifications from blocked users. [Explicit and classic block modes](https://sendbird.com/docs/chat/platform-api/v3/deprecated#2-explicit-and-classic-block-modes) have been deprecated and are only supported for customers who started using them before they were deprecated.

- **Include or exclude blocked users when sending invitations**: Determines whether or not to automatically filter out blocked users when a user invites a group of users to a new group channel. By default, blocked users are included when sending invitations. The value of this option can be changed by Sendbird if your Sendbird application isn't integrated with the client app. If you want to change the value, [contact our sales team](https://get.sendbird.com/talk-to-sales.html).
    
- **Turn on or off notifications from blocked users**: Determines whether or not to receive message notifications from the blocked user in a specific 1-to-N group channel where they are both members. By default, a user doesn't receive notifications from blocked users. The value of this option can be set individually per channel. If you want to use this option, [contact our sales team](https://get.sendbird.com/talk-to-sales.html).

> **Note**: To learn more about other available moderation tools, see [Moderation Overview](https://sendbird.com/docs/chat/platform-api/v3/moderation/moderation-overview#2-actions).  The following tables explain what happens to a user's chat experience when the user blocks another user in a 1-to-1 or 1-to-N group channel. In the case of a 1-to-1 group channel, the block mode is only maintained with the original members. If other than the original members are added, the rules for 1-to-N group channel begin to apply.

[https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/block-users#1-block-users](https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/block-users#1-block-users)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ModerationApi apiInstance = new ModerationApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        SendBirdBlockAUserRequest sendBirdBlockAUserRequest = new SendBirdBlockAUserRequest(); // SendBirdBlockAUserRequest | 
        try {
            SendBirdBlockAUserResponse result = api.blockAUser(userId)
                .apiToken(apiToken)
                .sendBirdBlockAUserRequest(sendBirdBlockAUserRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModerationApi#blockAUser");
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
| **userId** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **sendBirdBlockAUserRequest** | [**SendBirdBlockAUserRequest**](SendBirdBlockAUserRequest.md)|  | [optional] |

### Return type

[**SendBirdBlockAUserResponse**](SendBirdBlockAUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## freezeAGroupChannel

> SendBirdSendbirdGroupChannelDetail freezeAGroupChannel(channelUrl).apiToken(apiToken).sendBirdFreezeAGroupChannelRequest(sendBirdFreezeAGroupChannelRequest).execute();

Freeze a group channel

## Freeze a group channel

Freezes or unfreezes a group channel.

> **Note**: To learn more about other available moderation tools, see [Moderation Overview](https://sendbird.com/docs/chat/platform-api/v3/moderation/moderation-overview#2-actions). 
  

[https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-a-group-channel#1-freeze-a-group-channel](https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-a-group-channel#1-freeze-a-group-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ModerationApi apiInstance = new ModerationApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        SendBirdFreezeAGroupChannelRequest sendBirdFreezeAGroupChannelRequest = new SendBirdFreezeAGroupChannelRequest(); // SendBirdFreezeAGroupChannelRequest | 
        try {
            SendBirdSendbirdGroupChannelDetail result = api.freezeAGroupChannel(channelUrl)
                .apiToken(apiToken)
                .sendBirdFreezeAGroupChannelRequest(sendBirdFreezeAGroupChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModerationApi#freezeAGroupChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **sendBirdFreezeAGroupChannelRequest** | [**SendBirdFreezeAGroupChannelRequest**](SendBirdFreezeAGroupChannelRequest.md)|  | [optional] |

### Return type

[**SendBirdSendbirdGroupChannelDetail**](SendBirdSendbirdGroupChannelDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## freezeAnOpenChannel

> SendBirdSendbirdOpenChannel freezeAnOpenChannel(channelUrl).apiToken(apiToken).sendBirdFreezeAnOpenChannelRequest(sendBirdFreezeAnOpenChannelRequest).execute();

Freeze an open channel

## Freeze an open channel

Freezes or unfreezes an open channel.

> **Note**: To learn more about other available moderation tools, see [Moderation Overview](https://sendbird.com/docs/chat/platform-api/v3/moderation/moderation-overview#2-actions). 
  

[https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-an-open-channel#1-freeze-an-open-channel](https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-an-open-channel#1-freeze-an-open-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ModerationApi apiInstance = new ModerationApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        SendBirdFreezeAnOpenChannelRequest sendBirdFreezeAnOpenChannelRequest = new SendBirdFreezeAnOpenChannelRequest(); // SendBirdFreezeAnOpenChannelRequest | 
        try {
            SendBirdSendbirdOpenChannel result = api.freezeAnOpenChannel(channelUrl)
                .apiToken(apiToken)
                .sendBirdFreezeAnOpenChannelRequest(sendBirdFreezeAnOpenChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModerationApi#freezeAnOpenChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **sendBirdFreezeAnOpenChannelRequest** | [**SendBirdFreezeAnOpenChannelRequest**](SendBirdFreezeAnOpenChannelRequest.md)|  | [optional] |

### Return type

[**SendBirdSendbirdOpenChannel**](SendBirdSendbirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listBlockedUsers

> SendBirdListBlockedUsersResponse listBlockedUsers(userId)._list(_list).token(token).limit(limit).userIds(userIds).metadatakey(metadatakey).metadatavaluesIn(metadatavaluesIn).apiToken(apiToken).execute();

List blocked users

## List blocked by and blocking users

This action retrieves a list of users who are either blocked by a specific user or a list of users who are blocking a specific user.

[https://sendbird.com/docs/chat/platform-api/v3/moderation/listing-blocked-and-blocking-users/list-blocked-and-blocking-users#1-list-blocked-by-and-blocking-users](https://sendbird.com/docs/chat/platform-api/v3/moderation/listing-blocked-and-blocking-users/list-blocked-and-blocking-users#1-list-blocked-by-and-blocking-users)

`user_id`  
Type: string  
Description: Specifies the unique ID of the target user.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ModerationApi apiInstance = new ModerationApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String _list = "blocked_by_me"; // String | Specifies whether to retrieve a list of users who are blocked by the specified user or a list of users who are blocking the specified user. Acceptable values are blocked_by_me and blocking_me. The `me` in the values refers to the user specified in the parameter. (Default: blocked_by_me)
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String userIds = "userIds_example"; // String | Specifies the user IDs of the blocked or blocking users to search for. The value should be a comma-separated string that consists of multiple URL encoded user IDs.
        String metadatakey = "metadatakey_example"; // String | 
        String metadatavaluesIn = "metadatavaluesIn_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            SendBirdListBlockedUsersResponse result = api.listBlockedUsers(userId)
                ._list(_list)
                .token(token)
                .limit(limit)
                .userIds(userIds)
                .metadatakey(metadatakey)
                .metadatavaluesIn(metadatavaluesIn)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModerationApi#listBlockedUsers");
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
| **userId** | **String**| (Required)  | |
| **_list** | **String**| Specifies whether to retrieve a list of users who are blocked by the specified user or a list of users who are blocking the specified user. Acceptable values are blocked_by_me and blocking_me. The &#x60;me&#x60; in the values refers to the user specified in the parameter. (Default: blocked_by_me) | [optional] [enum: blocked_by_me, blocking_me] |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **userIds** | **String**| Specifies the user IDs of the blocked or blocking users to search for. The value should be a comma-separated string that consists of multiple URL encoded user IDs. | [optional] |
| **metadatakey** | **String**|  | [optional] |
| **metadatavaluesIn** | **String**|  | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendBirdListBlockedUsersResponse**](SendBirdListBlockedUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## unblockAUser

> Object unblockAUser(userId, targetId).apiToken(apiToken).execute();

Unblock a user

## Unblock a user

Unblocks the user.

https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/unblock-a-user#1-unblock-a-user

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ModerationApi apiInstance = new ModerationApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String targetId = "targetId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.unblockAUser(userId, targetId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModerationApi#unblockAUser");
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
| **userId** | **String**| (Required)  | |
| **targetId** | **String**| (Required)  | |
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

