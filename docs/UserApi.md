# UserApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addARegistrationOrDeviceToken**](UserApi.md#addARegistrationOrDeviceToken) | **POST** /v3/users/{user_id}/push/{token_type} | Add a registration or device token |
| [**chooseAPushNotificationContentTemplate**](UserApi.md#chooseAPushNotificationContentTemplate) | **PUT** /v3/users/{user_id}/push/template | Choose a push notification content template |
| [**createAUser**](UserApi.md#createAUser) | **POST** /v3/users | Create a user |
| [**createUserToken**](UserApi.md#createUserToken) | **POST** /v3/users/{user_id}/token | Create user token |
| [**deleteAUser**](UserApi.md#deleteAUser) | **DELETE** /v3/users/{user_id} | Delete a user |
| [**getChannelInvitationPreference**](UserApi.md#getChannelInvitationPreference) | **GET** /v3/users/{user_id}/channel_invitation_preference | Get channel invitation preference |
| [**leaveMyGroupChannels**](UserApi.md#leaveMyGroupChannels) | **PUT** /v3/users/{user_id}/my_group_channels/leave | Leave my group channels |
| [**listMyGroupChannels**](UserApi.md#listMyGroupChannels) | **GET** /v3/users/{user_id}/my_group_channels | List my group channels |
| [**listRegistrationOrDeviceTokens**](UserApi.md#listRegistrationOrDeviceTokens) | **GET** /v3/users/{user_id}/push/{token_type} | List registration or device tokens |
| [**listUsers**](UserApi.md#listUsers) | **GET** /v3/users | List users |
| [**markAllMessagesAsRead**](UserApi.md#markAllMessagesAsRead) | **PUT** /v3/users/{user_id}/mark_as_read_all | Mark all messages as read |
| [**removeARegistrationOrDeviceToken**](UserApi.md#removeARegistrationOrDeviceToken) | **DELETE** /v3/users/{user_id}/push/{token_type}/{token} | Remove a registration or device token - When unregistering a specific token |
| [**removeARegistrationOrDeviceTokenFromAnOwner**](UserApi.md#removeARegistrationOrDeviceTokenFromAnOwner) | **DELETE** /v3/push/device_tokens/{token_type}/{token} | Remove a registration or device token from an owner |
| [**removeAllRegistrationOrDeviceToken**](UserApi.md#removeAllRegistrationOrDeviceToken) | **DELETE** /v3/users/{user_id}/push | Remove a registration or device token - When unregistering all device tokens |
| [**resetPushPreferences**](UserApi.md#resetPushPreferences) | **DELETE** /v3/users/{user_id}/push_preference | Reset push preferences |
| [**updateAUser**](UserApi.md#updateAUser) | **PUT** /v3/users/{user_id} | Update a user |
| [**updateChannelInvitationPreference**](UserApi.md#updateChannelInvitationPreference) | **PUT** /v3/users/{user_id}/channel_invitation_preference | Update channel invitation preference |
| [**updateCountPreferenceOfAChannel**](UserApi.md#updateCountPreferenceOfAChannel) | **PUT** /v3/users/{user_id}/count_preference/{channel_url} | Update count preference of a channel |
| [**updatePushPreferences**](UserApi.md#updatePushPreferences) | **PUT** /v3/users/{user_id}/push_preference | Update push preferences |
| [**updatePushPreferencesForAChannel**](UserApi.md#updatePushPreferencesForAChannel) | **PUT** /v3/users/{user_id}/push_preference/{channel_url} | Update push preferences for a channel |
| [**viewAUser**](UserApi.md#viewAUser) | **GET** /v3/users/{user_id} | View a user |
| [**viewCountPreferenceOfAChannel**](UserApi.md#viewCountPreferenceOfAChannel) | **GET** /v3/users/{user_id}/count_preference/{channel_url} | View count preference of a channel |
| [**viewNumberOfChannelsWithUnreadMessages**](UserApi.md#viewNumberOfChannelsWithUnreadMessages) | **GET** /v3/users/{user_id}/unread_channel_count | View number of channels with unread messages |
| [**viewNumberOfUnreadMessages**](UserApi.md#viewNumberOfUnreadMessages) | **GET** /v3/users/{user_id}/unread_message_count | View number of unread messages |
| [**viewPushPreferences**](UserApi.md#viewPushPreferences) | **GET** /v3/users/{user_id}/push_preference | View push preferences |
| [**viewPushPreferencesForAChannel**](UserApi.md#viewPushPreferencesForAChannel) | **GET** /v3/users/{user_id}/push_preference/{channel_url} | View push preferences for a channel |
| [**viewWhoOwnsARegistrationOrDeviceToken**](UserApi.md#viewWhoOwnsARegistrationOrDeviceToken) | **GET** /v3/push/device_tokens/{token_type}/{token} | View who owns a registration or device token |



## addARegistrationOrDeviceToken

> AddARegistrationOrDeviceTokenResponse addARegistrationOrDeviceToken(userId, tokenType).apiToken(apiToken).addARegistrationOrDeviceTokenRequest(addARegistrationOrDeviceTokenRequest).execute();

Add a registration or device token

## Add a registration or device token

> __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.

To send notification requests to push notification services on behalf of your server, adds a specific user's FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in `token_type`: `gcm`, `huawei`, or `apns`.

A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.

> __Note__: For more information on the registration token and device token, visit the Google's [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei's [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple's [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String tokenType = "gcm"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        AddARegistrationOrDeviceTokenRequest addARegistrationOrDeviceTokenRequest = new AddARegistrationOrDeviceTokenRequest(); // AddARegistrationOrDeviceTokenRequest | 
        try {
            AddARegistrationOrDeviceTokenResponse result = api.addARegistrationOrDeviceToken(userId, tokenType)
                .apiToken(apiToken)
                .addARegistrationOrDeviceTokenRequest(addARegistrationOrDeviceTokenRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#addARegistrationOrDeviceToken");
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
| **tokenType** | **String**| (Required)  | [enum: gcm, huawei, apns] |
| **apiToken** | **String**|  | [optional] |
| **addARegistrationOrDeviceTokenRequest** | [**AddARegistrationOrDeviceTokenRequest**](AddARegistrationOrDeviceTokenRequest.md)|  | [optional] |

### Return type

[**AddARegistrationOrDeviceTokenResponse**](AddARegistrationOrDeviceTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## chooseAPushNotificationContentTemplate

> ChooseAPushNotificationContentTemplateResponse chooseAPushNotificationContentTemplate(userId).apiToken(apiToken).chooseAPushNotificationContentTemplateRequest(chooseAPushNotificationContentTemplateRequest).execute();

Choose a push notification content template

## Choose a push notification content template

Users can choose a template to determine how push notifications appear to them. Push notification content templates are pre-formatted forms that can be customized to display your own push notification messages on a user's device. Sendbird provides two types: `default` and `alternative`. Go to **Settings** > **Chat** > **Push notifications** > **Push notification content templates** on [Sendbird Dashboard](https://dashboard.sendbird.com/auth/signin) to customize the templates.

If the `push_message_template` property is specified when [sending a message](https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/send-a-message), the content template customized for the message takes precedence over the user's choice.

> **Note**: Push notifications are only available for group channels. 
  

https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/choose-a-push-notification-content-template#1-choose-a-push-notification-content-template

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        ChooseAPushNotificationContentTemplateRequest chooseAPushNotificationContentTemplateRequest = new ChooseAPushNotificationContentTemplateRequest(); // ChooseAPushNotificationContentTemplateRequest | 
        try {
            ChooseAPushNotificationContentTemplateResponse result = api.chooseAPushNotificationContentTemplate(userId)
                .apiToken(apiToken)
                .chooseAPushNotificationContentTemplateRequest(chooseAPushNotificationContentTemplateRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#chooseAPushNotificationContentTemplate");
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
| **chooseAPushNotificationContentTemplateRequest** | [**ChooseAPushNotificationContentTemplateRequest**](ChooseAPushNotificationContentTemplateRequest.md)|  | [optional] |

### Return type

[**ChooseAPushNotificationContentTemplateResponse**](ChooseAPushNotificationContentTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## createAUser

> SendbirdUser createAUser().apiToken(apiToken).createAUserRequest(createAUserRequest).execute();

Create a user

## Create a user

You should create a user in your Sendbird application to initiate conversations in channels. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on. Users are at the core of all conversations. Sendbird applications are made up of users who chat in either Open Channels or Group Channels. Using this API, it is possible to have fine grained control over your users and what those users can do. To learn more about users, see [User overview](https://sendbird.com/docs/chat/platform-api/v3/user/user-overview#2-resource-representation).

https://sendbird.com/docs/chat/platform-api/v3/user/creating-users/create-a-user#1-create-a-user

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        CreateAUserRequest createAUserRequest = new CreateAUserRequest(); // CreateAUserRequest | 
        try {
            SendbirdUser result = api.createAUser()
                .apiToken(apiToken)
                .createAUserRequest(createAUserRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createAUser");
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
| **createAUserRequest** | [**CreateAUserRequest**](CreateAUserRequest.md)|  | [optional] |

### Return type

[**SendbirdUser**](SendbirdUser.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## createUserToken

> CreateUserTokenResponse createUserToken(userId).apiToken(apiToken).createUserTokenRequest(createUserTokenRequest).execute();

Create user token

## Create user token

This action issues a session token for user authentication. Session tokens provide an efficient stateless authentication method by not storing the tokens in the Sendbird database, and thus improving the server's performance. See [access token vs. session token](https://sendbird.com/docs/chat/platform-api/v3/user/creating-users/create-a-user#2-access-token-vs-session-token) to learn more about authenticating users.

> **Note**: The endpoint `/users/{user_id}` is deprecated. Use `/users/{user_id}/token` for greater efficiency. 
  

https://sendbird.com/docs/chat/platform-api/v3/user/managing-session-tokens/issue-a-session-token#1-issue-a-session-token

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        CreateUserTokenRequest createUserTokenRequest = new CreateUserTokenRequest(); // CreateUserTokenRequest | 
        try {
            CreateUserTokenResponse result = api.createUserToken(userId)
                .apiToken(apiToken)
                .createUserTokenRequest(createUserTokenRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUserToken");
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
| **createUserTokenRequest** | [**CreateUserTokenRequest**](CreateUserTokenRequest.md)|  | [optional] |

### Return type

[**CreateUserTokenResponse**](CreateUserTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteAUser

> Object deleteAUser(userId).apiToken(apiToken).execute();

Delete a user

## Delete a user

You can delete a user from your Sendbird application using this API.

> **Note**: This API deletes user data and metadata, except for their messages. If you wish to delete user data including their messages, use the [GDPR request](https://sendbird.com/docs/chat/platform-api/v3/privacy/privacy-overview). 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/delete-a-user#1-delete-a-user](https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/delete-a-user#1-delete-a-user)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.deleteAUser(userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#deleteAUser");
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


## getChannelInvitationPreference

> GetChannelInvitationPreferenceResponse getChannelInvitationPreference(userId).apiToken(apiToken).execute();

Get channel invitation preference

## Get channel invitation preference

This action retrieves a user's [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) invitation preference. Users are subject to both user-specific and application-wide invitation preferences. Of the two, the invitation preference set for a specific user takes precedence over [the default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/get-default-invitation-preference).

[https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/get-channel-invitation-preference#1-get-channel-invitation-preference](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/get-channel-invitation-preference#1-get-channel-invitation-preference)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetChannelInvitationPreferenceResponse result = api.getChannelInvitationPreference(userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getChannelInvitationPreference");
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

### Return type

[**GetChannelInvitationPreferenceResponse**](GetChannelInvitationPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## leaveMyGroupChannels

> Object leaveMyGroupChannels(userId).apiToken(apiToken).leaveMyGroupChannelsRequest(leaveMyGroupChannelsRequest).execute();

Leave my group channels

## Leave my group channels

This action allows a user to leave all group channels or channels with a specific custom type. This API is useful if you want to let a user leave a set of channels at once. To let a user leave only one of their group channels, use the [leave a channel API](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/leave-a-channel) instead.

Since this API can't be called for a deactivated user, ensure that the [<code>leave_all_when_deactivated</code>](https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/update-a-user#2-request-body) property of the user is set to its default value of `true` to let the user leave all joined group channels upon deactivation.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-joined-group-channels/leave-group-channels#1-leave-group-channels

`user_id`  
Type: string  
Description: Specifies the unique ID of the user to leave all joined group channels.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        LeaveMyGroupChannelsRequest leaveMyGroupChannelsRequest = new LeaveMyGroupChannelsRequest(); // LeaveMyGroupChannelsRequest | 
        try {
            Object result = api.leaveMyGroupChannels(userId)
                .apiToken(apiToken)
                .leaveMyGroupChannelsRequest(leaveMyGroupChannelsRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#leaveMyGroupChannels");
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
| **leaveMyGroupChannelsRequest** | [**LeaveMyGroupChannelsRequest**](LeaveMyGroupChannelsRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listMyGroupChannels

> ListMyGroupChannelsResponse listMyGroupChannels(userId).apiToken(apiToken).token(token).limit(limit).distinctMode(distinctMode).publicMode(publicMode).superMode(superMode).createdAfter(createdAfter).createdBefore(createdBefore).showEmpty(showEmpty).showMember(showMember).showDeliveryReceipt(showDeliveryReceipt).showReadReceipt(showReadReceipt).showMetadata(showMetadata).showFrozen(showFrozen).order(order).metadataOrderKey(metadataOrderKey).customTypes(customTypes).customTypeStartswith(customTypeStartswith).channelUrls(channelUrls).name(name).nameContains(nameContains).nameStartswith(nameStartswith).membersExactlyIn(membersExactlyIn).membersIncludeIn(membersIncludeIn).queryType(queryType).membersNickname(membersNickname).membersNicknameContains(membersNicknameContains).metadataKey(metadataKey).metadataValues(metadataValues).metadataValueStartswith(metadataValueStartswith).metacounterKey(metacounterKey).metacounterValues(metacounterValues).metacounterValueGt(metacounterValueGt).metacounterValueGte(metacounterValueGte).metacounterValueLt(metacounterValueLt).metacounterValueLte(metacounterValueLte).includeSortedMetaarrayInLastMessage(includeSortedMetaarrayInLastMessage).customType(customType).readReceipt(readReceipt).member(member).isDistinct(isDistinct).membersIn(membersIn).userId2(userId2).execute();

List my group channels

## List my group channels

This action retrieves a list of [group channels](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) that a specific user has joined. You can use various query parameters to determine the search scope and select what kind of information you want to receive about the queried channels.

If you're looking to retrieve a list of group channels in a specific application, visit the [list group channels](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-group-channels) page under the Channel section.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-joined-group-channels/list-group-channels-by-user#1-list-group-channels-by-user

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
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | Specifies a page token that indicates the starting index of a chunk of results. If not specified, the index is set as 0.
        Integer limit = 10; // Integer | Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10)
        String distinctMode = "all"; // String | 
        String publicMode = "all"; // String | 
        String superMode = "all"; // String | 
        Long createdAfter = 1234567890123L; // Long | Restricts the search scope to only retrieve group channels which have been created after the specified time, in Unix milliseconds format.
        Long createdBefore = 1234567890123L; // Long | Restricts the search scope to only retrieve group channels which have been created before the specified time, in Unix milliseconds format.
        Boolean showEmpty = false; // Boolean | 
        Boolean showMember = false; // Boolean | 
        Boolean showDeliveryReceipt = false; // Boolean | 
        Boolean showReadReceipt = false; // Boolean | 
        Boolean showMetadata = false; // Boolean | 
        Boolean showFrozen = false; // Boolean | 
        String order = "chronological"; // String | 
        String metadataOrderKey = "metadataOrderKey_example"; // String | Specifies the key of an item in metadata. When a value of the order parameter is set to metadata_value_alphabetical, the results are alphabetically sorted by the value of the item specified by the key.
        String customTypes = "customTypes_example"; // String | Specifies a comma-separated string of one or more custom types to filter group channels. URL encoding each type is recommended. If not specified, all channels are returned, regardless of their custom type.
        String customTypeStartswith = "customTypeStartswith_example"; // String | Searches for group channels with the custom type which starts with the specified value. URL encoding the value is recommended.
        String channelUrls = "channelUrls_example"; // String | Specifies a comma-separated string of one or more group channel URLs to restrict the search scope. URL encoding each channel URL is recommended.
        String name = "name_example"; // String | Specifies one or more group channel names.
        String nameContains = "nameContains_example"; // String | Searches for group channels whose names contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended.
        String nameStartswith = "nameStartswith_example"; // String | Searches for group channels whose names start with the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended.
        String membersExactlyIn = "membersExactlyIn_example"; // String | Searches for group channels with all the specified users as members. The parameter value should consist of user IDs separated by commas.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended.
        String membersIncludeIn = "membersIncludeIn_example"; // String | Searches for group channels that include one or more users as members among the specified users. The value should consist of user IDs separated by commas or %2C. You can specify up to 60 user IDs.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended.
        String queryType = "queryType_example"; // String | Specifies a logical condition applied to the members_include_in parameter. Acceptable values are either AND or OR. For example, if you specify three members, A, B, and C, in members_include_in, the value of AND returns all channels that include every one of {A. B, C} as members. The value of OR returns channels that include {A}, plus those that include {B}, plus those that include {C}. (Default: AND)
        String membersNickname = "membersNickname_example"; // String | Searches for group channels with members whose nicknames match the specified value. URL encoding the value is recommended.
        String membersNicknameContains = "membersNicknameContains_example"; // String | Searches for group channels with members whose nicknames contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended.  * We recommend using at least three characters for the parameter value for better search efficiency when you design and implement related features. If you would like to allow one or two characters for searching, use members_nickname instead to prevent performance issues.
        String metadataKey = "metadataKey_example"; // String | Searches for group channels with metadata containing an item with the specified value as its key. To use this parameter, either the metadata_values parameter or the metadata_value_startswith parameter should be specified.
        String metadataValues = "metadataValues_example"; // String | Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the value of that item matches one or more values specified by this parameter. The string should be specified with multiple values separated by commas. URL encoding each value is recommended. To use this parameter, the metadata_key parameter should be specified.
        String metadataValueStartswith = "metadataValueStartswith_example"; // String | Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the values of that item that start with the specified value of this parameter. URL encoding the value is recommended. To use this parameter, the metadata_key parameter should be specified.
        String metacounterKey = "metacounterKey_example"; // String | Searches for group channels with metacounter containing an item with the specified value as its key. To use this parameter, either the metacounter_values parameter or one of the metacounter_value_gt, metacounter_value_gte, metacounter_value_lt, and metacounter_value_lte parameters should be specified.
        String metacounterValues = "metacounterValues_example"; // String | Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is equal to one or more values specified by this parameter. The string should be specified with multiple values separated by commas. To use this parameter, the metacounter_key parameter should be specified.
        String metacounterValueGt = "metacounterValueGt_example"; // String | Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified.
        String metacounterValueGte = "metacounterValueGte_example"; // String | Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified.
        String metacounterValueLt = "metacounterValueLt_example"; // String | Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified.
        String metacounterValueLte = "metacounterValueLte_example"; // String | Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified.
        Boolean includeSortedMetaarrayInLastMessage = false; // Boolean | Determines whether to include the sorted_metaarray as one of the last_message’s properties in the response.
        String customType = "ANNOUNCEMENT"; // String | (Deprecated) Returns channels whose custom_type matches the given value. If this field is not specified, all channels are returned, regardless of their custom type. The string passed here must be urlencoded.
        Boolean readReceipt = false; // Boolean | (Deprecated) Superseded by show_read_receipt.
        Boolean member = true; // Boolean | (Deprecated) Superseded by show_member.
        Boolean isDistinct = true; // Boolean | (Deprecated) Superseded by distinct_mode.
        String membersIn = "membersIn_example"; // String | (Deprecated) Superseded by members_exactly_in.
        String userId2 = "userId_example"; // String | (Deprecated) Restricts the search scope to only retrieve the target user's group channels. It's recommended to use the list group channels by user action instead.
        try {
            ListMyGroupChannelsResponse result = api.listMyGroupChannels(userId)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .distinctMode(distinctMode)
                .publicMode(publicMode)
                .superMode(superMode)
                .createdAfter(createdAfter)
                .createdBefore(createdBefore)
                .showEmpty(showEmpty)
                .showMember(showMember)
                .showDeliveryReceipt(showDeliveryReceipt)
                .showReadReceipt(showReadReceipt)
                .showMetadata(showMetadata)
                .showFrozen(showFrozen)
                .order(order)
                .metadataOrderKey(metadataOrderKey)
                .customTypes(customTypes)
                .customTypeStartswith(customTypeStartswith)
                .channelUrls(channelUrls)
                .name(name)
                .nameContains(nameContains)
                .nameStartswith(nameStartswith)
                .membersExactlyIn(membersExactlyIn)
                .membersIncludeIn(membersIncludeIn)
                .queryType(queryType)
                .membersNickname(membersNickname)
                .membersNicknameContains(membersNicknameContains)
                .metadataKey(metadataKey)
                .metadataValues(metadataValues)
                .metadataValueStartswith(metadataValueStartswith)
                .metacounterKey(metacounterKey)
                .metacounterValues(metacounterValues)
                .metacounterValueGt(metacounterValueGt)
                .metacounterValueGte(metacounterValueGte)
                .metacounterValueLt(metacounterValueLt)
                .metacounterValueLte(metacounterValueLte)
                .includeSortedMetaarrayInLastMessage(includeSortedMetaarrayInLastMessage)
                .customType(customType)
                .readReceipt(readReceipt)
                .member(member)
                .isDistinct(isDistinct)
                .membersIn(membersIn)
                .userId2(userId2)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#listMyGroupChannels");
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
| **apiToken** | **String**|  | |
| **token** | **String**| Specifies a page token that indicates the starting index of a chunk of results. If not specified, the index is set as 0. | [optional] |
| **limit** | **Integer**| Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10) | [optional] |
| **distinctMode** | **String**|  | [optional] [enum: all, distinct, nondistinct] |
| **publicMode** | **String**|  | [optional] [enum: all, private, public] |
| **superMode** | **String**|  | [optional] [enum: all, super, nonsuper] |
| **createdAfter** | **Long**| Restricts the search scope to only retrieve group channels which have been created after the specified time, in Unix milliseconds format. | [optional] |
| **createdBefore** | **Long**| Restricts the search scope to only retrieve group channels which have been created before the specified time, in Unix milliseconds format. | [optional] |
| **showEmpty** | **Boolean**|  | [optional] |
| **showMember** | **Boolean**|  | [optional] |
| **showDeliveryReceipt** | **Boolean**|  | [optional] |
| **showReadReceipt** | **Boolean**|  | [optional] |
| **showMetadata** | **Boolean**|  | [optional] |
| **showFrozen** | **Boolean**|  | [optional] |
| **order** | **String**|  | [optional] [enum: chronological, latest_last_message, channel_name_alphabetical, metadata_value_alphabetical] |
| **metadataOrderKey** | **String**| Specifies the key of an item in metadata. When a value of the order parameter is set to metadata_value_alphabetical, the results are alphabetically sorted by the value of the item specified by the key. | [optional] |
| **customTypes** | **String**| Specifies a comma-separated string of one or more custom types to filter group channels. URL encoding each type is recommended. If not specified, all channels are returned, regardless of their custom type. | [optional] |
| **customTypeStartswith** | **String**| Searches for group channels with the custom type which starts with the specified value. URL encoding the value is recommended. | [optional] |
| **channelUrls** | **String**| Specifies a comma-separated string of one or more group channel URLs to restrict the search scope. URL encoding each channel URL is recommended. | [optional] |
| **name** | **String**| Specifies one or more group channel names. | [optional] |
| **nameContains** | **String**| Searches for group channels whose names contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended. | [optional] |
| **nameStartswith** | **String**| Searches for group channels whose names start with the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended. | [optional] |
| **membersExactlyIn** | **String**| Searches for group channels with all the specified users as members. The parameter value should consist of user IDs separated by commas.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended. | [optional] |
| **membersIncludeIn** | **String**| Searches for group channels that include one or more users as members among the specified users. The value should consist of user IDs separated by commas or %2C. You can specify up to 60 user IDs.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended. | [optional] |
| **queryType** | **String**| Specifies a logical condition applied to the members_include_in parameter. Acceptable values are either AND or OR. For example, if you specify three members, A, B, and C, in members_include_in, the value of AND returns all channels that include every one of {A. B, C} as members. The value of OR returns channels that include {A}, plus those that include {B}, plus those that include {C}. (Default: AND) | [optional] |
| **membersNickname** | **String**| Searches for group channels with members whose nicknames match the specified value. URL encoding the value is recommended. | [optional] |
| **membersNicknameContains** | **String**| Searches for group channels with members whose nicknames contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended.  * We recommend using at least three characters for the parameter value for better search efficiency when you design and implement related features. If you would like to allow one or two characters for searching, use members_nickname instead to prevent performance issues. | [optional] |
| **metadataKey** | **String**| Searches for group channels with metadata containing an item with the specified value as its key. To use this parameter, either the metadata_values parameter or the metadata_value_startswith parameter should be specified. | [optional] |
| **metadataValues** | **String**| Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the value of that item matches one or more values specified by this parameter. The string should be specified with multiple values separated by commas. URL encoding each value is recommended. To use this parameter, the metadata_key parameter should be specified. | [optional] |
| **metadataValueStartswith** | **String**| Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the values of that item that start with the specified value of this parameter. URL encoding the value is recommended. To use this parameter, the metadata_key parameter should be specified. | [optional] |
| **metacounterKey** | **String**| Searches for group channels with metacounter containing an item with the specified value as its key. To use this parameter, either the metacounter_values parameter or one of the metacounter_value_gt, metacounter_value_gte, metacounter_value_lt, and metacounter_value_lte parameters should be specified. | [optional] |
| **metacounterValues** | **String**| Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is equal to one or more values specified by this parameter. The string should be specified with multiple values separated by commas. To use this parameter, the metacounter_key parameter should be specified. | [optional] |
| **metacounterValueGt** | **String**| Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. | [optional] |
| **metacounterValueGte** | **String**| Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. | [optional] |
| **metacounterValueLt** | **String**| Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. | [optional] |
| **metacounterValueLte** | **String**| Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. | [optional] |
| **includeSortedMetaarrayInLastMessage** | **Boolean**| Determines whether to include the sorted_metaarray as one of the last_message’s properties in the response. | [optional] |
| **customType** | **String**| (Deprecated) Returns channels whose custom_type matches the given value. If this field is not specified, all channels are returned, regardless of their custom type. The string passed here must be urlencoded. | [optional] |
| **readReceipt** | **Boolean**| (Deprecated) Superseded by show_read_receipt. | [optional] |
| **member** | **Boolean**| (Deprecated) Superseded by show_member. | [optional] |
| **isDistinct** | **Boolean**| (Deprecated) Superseded by distinct_mode. | [optional] |
| **membersIn** | **String**| (Deprecated) Superseded by members_exactly_in. | [optional] |
| **userId2** | **String**| (Deprecated) Restricts the search scope to only retrieve the target user&#39;s group channels. It&#39;s recommended to use the list group channels by user action instead. | [optional] |

### Return type

[**ListMyGroupChannelsResponse**](ListMyGroupChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listRegistrationOrDeviceTokens

> ListRegistrationOrDeviceTokensResponse listRegistrationOrDeviceTokens(userId, tokenType).apiToken(apiToken).execute();

List registration or device tokens

## List registration or device tokens

Retrieves a list of a user's registration or device tokens. You can pass `gcm`, `huawei`, or `apns` for FCM registration token, HMS device token, or APNs device token, respectively, in the `token_type` parameter for the push notification service you are using.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/list-registration-or-device-tokens#1-list-registration-or-device-tokens

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String tokenType = "gcm"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListRegistrationOrDeviceTokensResponse result = api.listRegistrationOrDeviceTokens(userId, tokenType)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#listRegistrationOrDeviceTokens");
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
| **tokenType** | **String**| (Required)  | [enum: gcm, huawei, apns] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ListRegistrationOrDeviceTokensResponse**](ListRegistrationOrDeviceTokensResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listUsers

> ListUsersResponse listUsers().token(token).limit(limit).activeMode(activeMode).showBot(showBot).userIds(userIds).nickname(nickname).nicknameStartswith(nicknameStartswith).metadatakey(metadatakey).metadatavaluesIn(metadatavaluesIn).apiToken(apiToken).execute();

List users

## List users

You can retrieve a list of users in your Sendbird application using this API. You can generate a customized list using various parameter combinations.

https://sendbird.com/docs/chat/platform-api/v3/user/listing-users/list-users#1-list-users

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String activeMode = "activated"; // String | Specifies the activation status of the users in the list. Acceptable values are `activated`, `deactivated`, and `all`. (Default: `activated`)
        Boolean showBot = true; // Boolean | Determines whether to include bots in the list. (Default: true)
        String userIds = "userIds_example"; // String | Specifies the user IDs. The value should be a comma-separated string that consists of multiple urlencoded user IDs. An example of a urlencoded string is ?user_ids=urlencoded_id_1,urlencoded_id_2. * The maximum number of user IDs in this parameter is 250. If you exceed the maximum number, your request may receive an HTTP 414 error indicating that the request URL is longer than what Sendbird server can interpret.
        String nickname = "nickname_example"; // String | 
        String nicknameStartswith = "nicknameStartswith_example"; // String | 
        String metadatakey = "metadatakey_example"; // String | 
        String metadatavaluesIn = "metadatavaluesIn_example"; // String | Searches for blocked users with metadata containing an item with the key specified by the metadatakey parameter above, and the value of that item matches one or more values specified by this parameter. The string should be specified with multiple urlencoded metadata values separated by commas (for example, `?metadatavalues_in=urlencoded_value_1, urlencoded_value_2`). This parameter should be specified in conjunction with the `metadatakey` above.
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListUsersResponse result = api.listUsers()
                .token(token)
                .limit(limit)
                .activeMode(activeMode)
                .showBot(showBot)
                .userIds(userIds)
                .nickname(nickname)
                .nicknameStartswith(nicknameStartswith)
                .metadatakey(metadatakey)
                .metadatavaluesIn(metadatavaluesIn)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#listUsers");
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **activeMode** | **String**| Specifies the activation status of the users in the list. Acceptable values are &#x60;activated&#x60;, &#x60;deactivated&#x60;, and &#x60;all&#x60;. (Default: &#x60;activated&#x60;) | [optional] [enum: activated, deactivated, all] |
| **showBot** | **Boolean**| Determines whether to include bots in the list. (Default: true) | [optional] |
| **userIds** | **String**| Specifies the user IDs. The value should be a comma-separated string that consists of multiple urlencoded user IDs. An example of a urlencoded string is ?user_ids&#x3D;urlencoded_id_1,urlencoded_id_2. * The maximum number of user IDs in this parameter is 250. If you exceed the maximum number, your request may receive an HTTP 414 error indicating that the request URL is longer than what Sendbird server can interpret. | [optional] |
| **nickname** | **String**|  | [optional] |
| **nicknameStartswith** | **String**|  | [optional] |
| **metadatakey** | **String**|  | [optional] |
| **metadatavaluesIn** | **String**| Searches for blocked users with metadata containing an item with the key specified by the metadatakey parameter above, and the value of that item matches one or more values specified by this parameter. The string should be specified with multiple urlencoded metadata values separated by commas (for example, &#x60;?metadatavalues_in&#x3D;urlencoded_value_1, urlencoded_value_2&#x60;). This parameter should be specified in conjunction with the &#x60;metadatakey&#x60; above. | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ListUsersResponse**](ListUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## markAllMessagesAsRead

> Object markAllMessagesAsRead(userId).apiToken(apiToken).markAllMessagesAsReadRequest(markAllMessagesAsReadRequest).execute();

Mark all messages as read

## Mark all messages as read

This action marks all of a user's unread messages as read in certain group channels. If channels aren't specified, the user's unread messages in all group channels are marked as read.

https://sendbird.com/docs/chat/platform-api/v3/user/marking-messages-as-read/mark-all-of-a-users-messages-as-read#1-mark-all-of-a-user-s-messages-as-read

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        MarkAllMessagesAsReadRequest markAllMessagesAsReadRequest = new MarkAllMessagesAsReadRequest(); // MarkAllMessagesAsReadRequest | 
        try {
            Object result = api.markAllMessagesAsRead(userId)
                .apiToken(apiToken)
                .markAllMessagesAsReadRequest(markAllMessagesAsReadRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#markAllMessagesAsRead");
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
| **markAllMessagesAsReadRequest** | [**MarkAllMessagesAsReadRequest**](MarkAllMessagesAsReadRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## removeARegistrationOrDeviceToken

> RemoveARegistrationOrDeviceTokenResponse removeARegistrationOrDeviceToken(userId, tokenType, token).apiToken(apiToken).execute();

Remove a registration or device token - When unregistering a specific token

## Remove a registration or device token

Removes a user's specific registration or device token or all tokens. You can pass `gcm`, `huawei`, or `apns` for FCM registration token, HMS device token, or APNs device token, respectively, in the `token_type` parameter for the push notification service you are using.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/remove-a-registration-or-device-token#1-remove-a-registration-or-device-token

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String tokenType = "gcm"; // String | (Required) 
        String token = "token_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            RemoveARegistrationOrDeviceTokenResponse result = api.removeARegistrationOrDeviceToken(userId, tokenType, token)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#removeARegistrationOrDeviceToken");
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
| **tokenType** | **String**| (Required)  | [enum: gcm, huawei, apns] |
| **token** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**RemoveARegistrationOrDeviceTokenResponse**](RemoveARegistrationOrDeviceTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## removeARegistrationOrDeviceTokenFromAnOwner

> List&lt;MarkChannelMessagesAsReadRequest&gt; removeARegistrationOrDeviceTokenFromAnOwner(tokenType, token).apiToken(apiToken).execute();

Remove a registration or device token from an owner

## Remove a registration or device token from an owner

Removes a registration or device token from a user who is the owner of the token. You can pass `gcm`, `huawei`, or `apns` for FCM registration token, HMS device token, or APNs device token, respectively, in the `token_type` parameter for the push notification service you are using.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/remove-a-registration-or-device-token-from-an-owner#1-remove-a-registration-or-device-token-from-an-owner

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String tokenType = "tokenType_example"; // String | (Required) 
        String token = "token_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            List<MarkChannelMessagesAsReadRequest> result = api.removeARegistrationOrDeviceTokenFromAnOwner(tokenType, token)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#removeARegistrationOrDeviceTokenFromAnOwner");
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
| **tokenType** | **String**| (Required)  | |
| **token** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**List&lt;MarkChannelMessagesAsReadRequest&gt;**](MarkChannelMessagesAsReadRequest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## removeAllRegistrationOrDeviceToken

> RemoveAllRegistrationOrDeviceTokenResponse removeAllRegistrationOrDeviceToken(userId).apiToken(apiToken).execute();

Remove a registration or device token - When unregistering all device tokens

## Remove a registration or device token

Removes a user's specific registration or device token or all tokens. You can pass `gcm`, `huawei`, or `apns` for FCM registration token, HMS device token, or APNs device token, respectively, in the `token_type` parameter for the push notification service you are using.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/remove-a-registration-or-device-token#1-remove-a-registration-or-device-token

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            RemoveAllRegistrationOrDeviceTokenResponse result = api.removeAllRegistrationOrDeviceToken(userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#removeAllRegistrationOrDeviceToken");
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

### Return type

[**RemoveAllRegistrationOrDeviceTokenResponse**](RemoveAllRegistrationOrDeviceTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## resetPushPreferences

> Object resetPushPreferences(userId).apiToken(apiToken).execute();

Reset push preferences

## Reset push preferences

You can reset a user's notifications preferences. The values are reset to the default as the following.

- The values for the `do_not_disturb` and `snooze_enabled` properties are set to `false`.
    
- The values of the parameters associated with the time frame are all set to `0`.
    
- The value for the `timezone` property is set to `UTC`.
    
- The value for the `push_sound` property is set to `default`.
    

> **Note**: Push notifications are only available for group channels. 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/reset-push-notification-preferences#1-reset-push-notification-preferences](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/reset-push-notification-preferences#1-reset-push-notification-preferences)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.resetPushPreferences(userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#resetPushPreferences");
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


## updateAUser

> SendbirdUser updateAUser(userId).apiToken(apiToken).updateAUserRequest(updateAUserRequest).execute();

Update a user

## Update a user

You can update information about a user using this API. In addition to changing a user's nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.

You can also deactivate or reactivate a user using this API request. If the `leave_all_when_deactivated` is set to `true`, a user leaves all joined group channels and becomes deactivated.

> **Note**: Issuing session tokens through the `/users/{user_id}` endpoint is now deprecated and it&apos;s replaced with [&lt;code&gt;/users/{user_id}/token&lt;/code&gt;](https://sendbird.com/docs/chat/platform-api/v3/user/managing-session-tokens/issue-a-session-token) endpoint for greater efficiency. For those who are currently using the old endpoint, you can start issuing tokens using the new endpoint. 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/update-a-user#1-update-a-user](https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/update-a-user#1-update-a-user)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateAUserRequest updateAUserRequest = new UpdateAUserRequest(); // UpdateAUserRequest | 
        try {
            SendbirdUser result = api.updateAUser(userId)
                .apiToken(apiToken)
                .updateAUserRequest(updateAUserRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateAUser");
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
| **updateAUserRequest** | [**UpdateAUserRequest**](UpdateAUserRequest.md)|  | [optional] |

### Return type

[**SendbirdUser**](SendbirdUser.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateChannelInvitationPreference

> UpdateChannelInvitationPreferenceResponse updateChannelInvitationPreference(userId).apiToken(apiToken).updateChannelInvitationPreferenceRequest(updateChannelInvitationPreferenceRequest).execute();

Update channel invitation preference

## Update channel invitation preference

This action updates a user's [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) invitation preference. Updating the [application's default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/update-default-invitation-preference) won't override existing users' individual channel invitation preferences. The changed preference only affects the users created after the update.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-channel-invitation-preference#1-update-channel-invitation-preference

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateChannelInvitationPreferenceRequest updateChannelInvitationPreferenceRequest = new UpdateChannelInvitationPreferenceRequest(); // UpdateChannelInvitationPreferenceRequest | 
        try {
            UpdateChannelInvitationPreferenceResponse result = api.updateChannelInvitationPreference(userId)
                .apiToken(apiToken)
                .updateChannelInvitationPreferenceRequest(updateChannelInvitationPreferenceRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateChannelInvitationPreference");
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
| **updateChannelInvitationPreferenceRequest** | [**UpdateChannelInvitationPreferenceRequest**](UpdateChannelInvitationPreferenceRequest.md)|  | [optional] |

### Return type

[**UpdateChannelInvitationPreferenceResponse**](UpdateChannelInvitationPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateCountPreferenceOfAChannel

> UpdateCountPreferenceOfChannelByUrlResponse updateCountPreferenceOfAChannel(userId, channelUrl).apiToken(apiToken).updateCountPreferenceOfAChannelRequest(updateCountPreferenceOfAChannelRequest).execute();

Update count preference of a channel

## Update count preference of a channel

This action updates a user's count preference of a specific group channel. The count preference allows a user to either update the number of unread messages or the number of unread mentioned messages, or both in a specific group channel.

If you want to retrieve the total number count of a specific group channel, go to the [get count preference of a channel](https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-count-preference-of-a-channel) page.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/update-count-preference-of-a-channel#1-update-count-preference-of-a-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateCountPreferenceOfAChannelRequest updateCountPreferenceOfAChannelRequest = new UpdateCountPreferenceOfAChannelRequest(); // UpdateCountPreferenceOfAChannelRequest | 
        try {
            UpdateCountPreferenceOfChannelByUrlResponse result = api.updateCountPreferenceOfAChannel(userId, channelUrl)
                .apiToken(apiToken)
                .updateCountPreferenceOfAChannelRequest(updateCountPreferenceOfAChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updateCountPreferenceOfAChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **updateCountPreferenceOfAChannelRequest** | [**UpdateCountPreferenceOfAChannelRequest**](UpdateCountPreferenceOfAChannelRequest.md)|  | [optional] |

### Return type

[**UpdateCountPreferenceOfChannelByUrlResponse**](UpdateCountPreferenceOfChannelByUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updatePushPreferences

> UpdatePushPreferencesResponse updatePushPreferences(userId).apiToken(apiToken).updatePushPreferencesRequest(updatePushPreferencesRequest).execute();

Update push preferences

## Update push preferences

You can update a user's notifications preferences. A push notification is a message that is immediately delivered to a user's device when the device is either idle or running the client app in the background.

> **Note**: Push notifications are only available for group channels. 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences#1-update-push-notification-preferences](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences#1-update-push-notification-preferences)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdatePushPreferencesRequest updatePushPreferencesRequest = new UpdatePushPreferencesRequest(); // UpdatePushPreferencesRequest | 
        try {
            UpdatePushPreferencesResponse result = api.updatePushPreferences(userId)
                .apiToken(apiToken)
                .updatePushPreferencesRequest(updatePushPreferencesRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updatePushPreferences");
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
| **updatePushPreferencesRequest** | [**UpdatePushPreferencesRequest**](UpdatePushPreferencesRequest.md)|  | [optional] |

### Return type

[**UpdatePushPreferencesResponse**](UpdatePushPreferencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updatePushPreferencesForAChannel

> UpdatePushPreferencesForAChannelResponse updatePushPreferencesForAChannel(userId, channelUrl).apiToken(apiToken).updatePushPreferencesForAChannelRequest(updatePushPreferencesForAChannelRequest).execute();

Update push preferences for a channel

## Update push preferences for a channel

You can update a user's notifications preferences for a specific channel. A push notification is a message that is immediately delivered to a user's device when the device is either idle or running the client app in the background.

> **Note**: Push notifications are only available for group channels. 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences-for-a-channel#1-update-push-notification-preferences-for-a-channel](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences-for-a-channel#1-update-push-notification-preferences-for-a-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdatePushPreferencesForAChannelRequest updatePushPreferencesForAChannelRequest = new UpdatePushPreferencesForAChannelRequest(); // UpdatePushPreferencesForAChannelRequest | 
        try {
            UpdatePushPreferencesForAChannelResponse result = api.updatePushPreferencesForAChannel(userId, channelUrl)
                .apiToken(apiToken)
                .updatePushPreferencesForAChannelRequest(updatePushPreferencesForAChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#updatePushPreferencesForAChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |
| **updatePushPreferencesForAChannelRequest** | [**UpdatePushPreferencesForAChannelRequest**](UpdatePushPreferencesForAChannelRequest.md)|  | [optional] |

### Return type

[**UpdatePushPreferencesForAChannelResponse**](UpdatePushPreferencesForAChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewAUser

> SendbirdUser viewAUser(userId).includeUnreadCount(includeUnreadCount).customTypes(customTypes).superMode(superMode).apiToken(apiToken).execute();

View a user

## View a user

You can retrieve information about a user using this API.

https://sendbird.com/docs/chat/platform-api/v3/user/listing-users/get-a-user#1-get-a-user

`user_id`  
Type: string  
Description: Specifies the unique ID of the user to retrieve.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        Boolean includeUnreadCount = true; // Boolean | 
        String customTypes = "customTypes_example"; // String | 
        String superMode = "all"; // String | Restricts the search scope to retrieve only Supergroup or non-Supergroup channels. Acceptable values are `all`, `super`, and `nonsuper`. This parameter should be specified in conjunction with `include_unread_count` above. (Default: `all`)
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            SendbirdUser result = api.viewAUser(userId)
                .includeUnreadCount(includeUnreadCount)
                .customTypes(customTypes)
                .superMode(superMode)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#viewAUser");
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
| **includeUnreadCount** | **Boolean**|  | [optional] |
| **customTypes** | **String**|  | [optional] |
| **superMode** | **String**| Restricts the search scope to retrieve only Supergroup or non-Supergroup channels. Acceptable values are &#x60;all&#x60;, &#x60;super&#x60;, and &#x60;nonsuper&#x60;. This parameter should be specified in conjunction with &#x60;include_unread_count&#x60; above. (Default: &#x60;all&#x60;) | [optional] [enum: all, super, nonsuper] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**SendbirdUser**](SendbirdUser.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewCountPreferenceOfAChannel

> ViewCountPreferenceOfAChannelResponse viewCountPreferenceOfAChannel(userId, channelUrl).apiToken(apiToken).execute();

View count preference of a channel

## View count preference of a channel

This action retrieves a user's count preference of a specific group channel. The count preference allows a user to either retrieve the number of unread messages or unread mentioned messages, or both in a specific group channel.

If you want to update the total number count of a specific group channel, visit the [update count preference of a channel](https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/update-count-preference-of-a-channel).

https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-count-preference-of-a-channel#1-get-count-preference-of-a-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewCountPreferenceOfAChannelResponse result = api.viewCountPreferenceOfAChannel(userId, channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#viewCountPreferenceOfAChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ViewCountPreferenceOfAChannelResponse**](ViewCountPreferenceOfAChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewNumberOfChannelsWithUnreadMessages

> ViewNumberOfChannelsWithUnreadMessagesResponse viewNumberOfChannelsWithUnreadMessages(userId).customTypes(customTypes).superMode(superMode).apiToken(apiToken).execute();

View number of channels with unread messages

## View number of channels with unread messages

This action retrieves the total number of group channels in which a user has unread messages. You can use various query parameters to determine the search scope of group channels.

https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-number-of-channels-with-unread-messages#1-get-number-of-channels-with-unread-messages

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String customTypes = "customTypes_example"; // String | 
        String superMode = "all"; // String | Restricts the search scope to either Supergroup channels or non-Supergroup channels or both. Acceptable values are all, super, and nonsuper. (Default: all)
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewNumberOfChannelsWithUnreadMessagesResponse result = api.viewNumberOfChannelsWithUnreadMessages(userId)
                .customTypes(customTypes)
                .superMode(superMode)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#viewNumberOfChannelsWithUnreadMessages");
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
| **customTypes** | **String**|  | [optional] |
| **superMode** | **String**| Restricts the search scope to either Supergroup channels or non-Supergroup channels or both. Acceptable values are all, super, and nonsuper. (Default: all) | [optional] [enum: all, super, nonsuper] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ViewNumberOfChannelsWithUnreadMessagesResponse**](ViewNumberOfChannelsWithUnreadMessagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewNumberOfUnreadMessages

> ViewNumberOfUnreadMessagesResponse viewNumberOfUnreadMessages(userId).customTypes(customTypes).superMode(superMode).apiToken(apiToken).execute();

View number of unread messages

## View number of unread messages

This action retrieves a user's total number of unread messages in group channels.

> **Note**: The unread count feature is only available for group channels. 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-number-of-unread-messages#1-get-number-of-unread-messages](https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-number-of-unread-messages#1-get-number-of-unread-messages)

`user_id`  
Type: string  
Description: Specifies the unique ID of a user.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String customTypes = "customTypes_example"; // String | Specifies a comma-separated string of one or more custom types to filter group channels. URL encoding each type is recommended. If not specified, all channels are returned, regardless of their custom type.
        String superMode = "superMode_example"; // String | Restricts the search scope to either Supergroup channels or non-Supergroup channels or both. Acceptable values are `all`, `super`, and `nonsuper`. (Default: `all`)
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewNumberOfUnreadMessagesResponse result = api.viewNumberOfUnreadMessages(userId)
                .customTypes(customTypes)
                .superMode(superMode)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#viewNumberOfUnreadMessages");
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
| **customTypes** | **String**| Specifies a comma-separated string of one or more custom types to filter group channels. URL encoding each type is recommended. If not specified, all channels are returned, regardless of their custom type. | [optional] |
| **superMode** | **String**| Restricts the search scope to either Supergroup channels or non-Supergroup channels or both. Acceptable values are &#x60;all&#x60;, &#x60;super&#x60;, and &#x60;nonsuper&#x60;. (Default: &#x60;all&#x60;) | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ViewNumberOfUnreadMessagesResponse**](ViewNumberOfUnreadMessagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewPushPreferences

> ViewPushPreferencesResponse viewPushPreferences(userId).apiToken(apiToken).execute();

View push preferences

## View push preferences

You can retrieves a user's notifications preferences. A push notification is a message that is immediately delivered to a user's device when the device is either idle or running the client app in the background.

> **Note**: Push notifications are only available for group channels. 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences#1-get-push-notification-preferences](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences#1-get-push-notification-preferences)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewPushPreferencesResponse result = api.viewPushPreferences(userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#viewPushPreferences");
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

### Return type

[**ViewPushPreferencesResponse**](ViewPushPreferencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewPushPreferencesForAChannel

> ViewPushPreferencesForAChannelResponse viewPushPreferencesForAChannel(userId, channelUrl).apiToken(apiToken).execute();

View push preferences for a channel

## View push preferences for a channel

You can retrieve a user's notifications preferences for a specific channel. A push notification is a message that is immediately delivered to a user's device when the device is either idle or running the client app in the background. These notifications preferences can be configured.

> **Note**: Push notifications are only available for group channels. 
  

[https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences-for-a-channel#1-get-push-notification-preferences-for-a-channel](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences-for-a-channel#1-get-push-notification-preferences-for-a-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String userId = "userId_example"; // String | (Required) 
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewPushPreferencesForAChannelResponse result = api.viewPushPreferencesForAChannel(userId, channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#viewPushPreferencesForAChannel");
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
| **channelUrl** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ViewPushPreferencesForAChannelResponse**](ViewPushPreferencesForAChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewWhoOwnsARegistrationOrDeviceToken

> List&lt;MarkChannelMessagesAsReadRequest&gt; viewWhoOwnsARegistrationOrDeviceToken(tokenType, token).apiToken(apiToken).execute();

View who owns a registration or device token

## View who owns a registration or device token

Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in `token_type`: `gcm`, `huawei`, or `apns`, depending on which push service you are using.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        UserApi apiInstance = new UserApi(defaultClient);
        String tokenType = "tokenType_example"; // String | (Required) 
        String token = "token_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            List<MarkChannelMessagesAsReadRequest> result = api.viewWhoOwnsARegistrationOrDeviceToken(tokenType, token)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#viewWhoOwnsARegistrationOrDeviceToken");
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
| **tokenType** | **String**| (Required)  | |
| **token** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**List&lt;MarkChannelMessagesAsReadRequest&gt;**](MarkChannelMessagesAsReadRequest.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

