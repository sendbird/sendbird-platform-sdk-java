# GroupChannelApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptAnInvitation**](GroupChannelApi.md#acceptAnInvitation) | **PUT** /v3/group_channels/{channel_url}/accept | Accept an invitation |
| [**cancelTheRegistrationOfOperators**](GroupChannelApi.md#cancelTheRegistrationOfOperators) | **DELETE** /v3/group_channels/{channel_url}/operators | Cancel the registration of operators |
| [**checkIfMember**](GroupChannelApi.md#checkIfMember) | **GET** /v3/group_channels/{channel_url}/members/{user_id} | Check if member |
| [**createAGroupChannel**](GroupChannelApi.md#createAGroupChannel) | **POST** /v3/group_channels | Create a group channel |
| [**deleteAGroupChannel**](GroupChannelApi.md#deleteAGroupChannel) | **DELETE** /v3/group_channels/{channel_url} | Delete a group channel |
| [**getAGroupChannel**](GroupChannelApi.md#getAGroupChannel) | **GET** /v3/group_channels/{channel_url} | Get a group channel |
| [**hideAChannel**](GroupChannelApi.md#hideAChannel) | **PUT** /v3/group_channels/{channel_url}/hide | Hide a channel |
| [**inviteAsMembers**](GroupChannelApi.md#inviteAsMembers) | **POST** /v3/group_channels/{channel_url}/invite | Invite as members |
| [**joinAChannel**](GroupChannelApi.md#joinAChannel) | **PUT** /v3/group_channels/{channel_url}/join | Join a channel |
| [**leaveAChannel**](GroupChannelApi.md#leaveAChannel) | **PUT** /v3/group_channels/{channel_url}/leave | Leave a channel |
| [**listChannels**](GroupChannelApi.md#listChannels) | **GET** /v3/group_channels | List channels |
| [**listMembers**](GroupChannelApi.md#listMembers) | **GET** /v3/group_channels/{channel_url}/members | List members |
| [**listOperators**](GroupChannelApi.md#listOperators) | **GET** /v3/group_channels/{channel_url}/operators | List operators |
| [**registerOperatorsToAGroupChannel**](GroupChannelApi.md#registerOperatorsToAGroupChannel) | **POST** /v3/group_channels/{channel_url}/operators | Register operators to a group channel |
| [**resetChatHistory**](GroupChannelApi.md#resetChatHistory) | **PUT** /v3/group_channels/{channel_url}/reset_user_history | Reset chat history |
| [**startTypingIndicators**](GroupChannelApi.md#startTypingIndicators) | **POST** /v3/group_channels/{channel_url}/typing | Start typing indicators |
| [**stopTypingIndicators**](GroupChannelApi.md#stopTypingIndicators) | **DELETE** /v3/group_channels/{channel_url}/typing | Stop typing indicators |
| [**unhideAChannel**](GroupChannelApi.md#unhideAChannel) | **DELETE** /v3/group_channels/{channel_url}/hide | Unhide a channel |
| [**updateAGroupChannel**](GroupChannelApi.md#updateAGroupChannel) | **PUT** /v3/group_channels/{channel_url} | Update a group channel |



## acceptAnInvitation

> SendbirdGroupChannelDetail acceptAnInvitation(channelUrl).apiToken(apiToken).acceptAnInvitationRequest(acceptAnInvitationRequest).execute();

Accept an invitation

## Accept an invitation

Accepts an invitation from a group channel for a user to join. A single user may join up to 2,000 group channels, and any invitation to a user who is at capacity will be automatically canceled. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.

> **Note**: This action is only available when the `auto_accept` property of an application is set to **false**. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/update-default-invitation-preference) action, or the [update channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-channel-invitation-preference) action. 
  

[https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/accept-an-invitation-channel#1-accept-an-invitation](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/accept-an-invitation-channel#1-accept-an-invitation)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        AcceptAnInvitationRequest acceptAnInvitationRequest = new AcceptAnInvitationRequest(); // AcceptAnInvitationRequest | 
        try {
            SendbirdGroupChannelDetail result = api.acceptAnInvitation(channelUrl)
                .apiToken(apiToken)
                .acceptAnInvitationRequest(acceptAnInvitationRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#acceptAnInvitation");
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
| **acceptAnInvitationRequest** | [**AcceptAnInvitationRequest**](AcceptAnInvitationRequest.md)|  | [optional] |

### Return type

[**SendbirdGroupChannelDetail**](SendbirdGroupChannelDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## cancelTheRegistrationOfOperators

> Object cancelTheRegistrationOfOperators(channelUrl).operatorIds(operatorIds).deleteAll(deleteAll).apiToken(apiToken).execute();

Cancel the registration of operators

## Unregister operators from a group channel

You can unregister operators in a group channel but keep them in the channel as members using this API.

https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/unregister-operators-from-a-group-channel#1-unregister-operators-from-a-group-channel

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to cancel the registration of operators.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String operatorIds = "operatorIds_example"; // String | Specifies an array of one or more operator IDs to unregister from the channel. The operators in this array remain as participants of the channel after losing their operational roles. Urlencoding each operator ID is recommended. An example of a Urlencoded array would be ?operator_ids=urlencoded_id_1,urlencoded_id_2.
        Boolean deleteAll = true; // Boolean | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.cancelTheRegistrationOfOperators(channelUrl)
                .operatorIds(operatorIds)
                .deleteAll(deleteAll)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#cancelTheRegistrationOfOperators");
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
| **operatorIds** | **String**| Specifies an array of one or more operator IDs to unregister from the channel. The operators in this array remain as participants of the channel after losing their operational roles. Urlencoding each operator ID is recommended. An example of a Urlencoded array would be ?operator_ids&#x3D;urlencoded_id_1,urlencoded_id_2. | |
| **deleteAll** | **Boolean**|  | [optional] |
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


## checkIfMember

> CheckIfMemberResponse checkIfMember(channelUrl, userId).apiToken(apiToken).execute();

Check if member

## Check if user is a member

Checks if a user is a member of a group channel.

> **Note**: See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types. 
  

[https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/check-if-user-is-a-member#1-check-if-user-is-a-member](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/check-if-user-is-a-member#1-check-if-user-is-a-member)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String userId = "userId_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            CheckIfMemberResponse result = api.checkIfMember(channelUrl, userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#checkIfMember");
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
| **userId** | **String**| (Required)  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**CheckIfMemberResponse**](CheckIfMemberResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## createAGroupChannel

> SendbirdGroupChannelDetail createAGroupChannel().apiToken(apiToken).createAGroupChannelRequest(createAGroupChannelRequest).execute();

Create a group channel

## Create a group channel

You can create a group channel for 1-to-1 and 1-to-N conversations. By default, group channels are used for conversations between up to 100 members. This number can stretch up to tens of thousands in Supergroup channels. Group channels can either be private and invite only, or public. They support typing indicators, unread count and read receipts, allowing for an interactive chat experience. A user can join up to 2000 group channels, and higher numbers would negatively impact the performance for the end user. The Chat history is turned off by default and its settings can be changed on Sendbird Dashboard by going to Settings > Chat > Channels > Group channels > Chat history. To learn more about group channels, see Channel Overview.

> If you are seeing the error message Maximum "channel join" count reached., then consider deleting channels that are no longer used. For situations where an agent connects with many customers such as support, delivery logistics or sales, we recommend using Sendbird Desk.

https://sendbird.com/docs/chat/platform-api/v3/channel/creating-a-channel/create-a-group-channel#1-create-a-group-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        CreateAGroupChannelRequest createAGroupChannelRequest = new CreateAGroupChannelRequest(); // CreateAGroupChannelRequest | 
        try {
            SendbirdGroupChannelDetail result = api.createAGroupChannel()
                .apiToken(apiToken)
                .createAGroupChannelRequest(createAGroupChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#createAGroupChannel");
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
| **createAGroupChannelRequest** | [**CreateAGroupChannelRequest**](CreateAGroupChannelRequest.md)|  | [optional] |

### Return type

[**SendbirdGroupChannelDetail**](SendbirdGroupChannelDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteAGroupChannel

> Object deleteAGroupChannel(channelUrl).apiToken(apiToken).execute();

Delete a group channel

## Delete a group channel

You can delete a group channel or a Supergroup channel using this API. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.

[https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/delete-a-group-channel#1-delete-a-group-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/delete-a-group-channel#1-delete-a-group-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.deleteAGroupChannel(channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#deleteAGroupChannel");
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
| **channelUrl** | **String**|  | |
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


## getAGroupChannel

> GetAGroupChannelResponse getAGroupChannel(channelUrl).showDeliveryReceipt(showDeliveryReceipt).showReadReceipt(showReadReceipt).showMember(showMember).memberActiveMode(memberActiveMode).userId(userId).apiToken(apiToken).execute();

Get a group channel

## Get a group channel

This action retrieves information about a specific [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel). You can use the optional query parameters to determine whether to include delivery receipt, read receipt, or member information in the response.

https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/get-a-group-channel#1-get-a-group-channel

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to retrieve.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        Boolean showDeliveryReceipt = true; // Boolean | 
        Boolean showReadReceipt = true; // Boolean | 
        Boolean showMember = true; // Boolean | 
        String memberActiveMode = "all"; // String | Restricts the member list to members who are activated or deactivated in the channel. This parameter is only effective if the parameter show_member is true. Acceptable values are all, activated, and deactivated. (default: all)
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GetAGroupChannelResponse result = api.getAGroupChannel(channelUrl)
                .showDeliveryReceipt(showDeliveryReceipt)
                .showReadReceipt(showReadReceipt)
                .showMember(showMember)
                .memberActiveMode(memberActiveMode)
                .userId(userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#getAGroupChannel");
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
| **channelUrl** | **String**|  | |
| **showDeliveryReceipt** | **Boolean**|  | [optional] |
| **showReadReceipt** | **Boolean**|  | [optional] |
| **showMember** | **Boolean**|  | [optional] |
| **memberActiveMode** | **String**| Restricts the member list to members who are activated or deactivated in the channel. This parameter is only effective if the parameter show_member is true. Acceptable values are all, activated, and deactivated. (default: all) | [optional] [enum: all, activated, deactivated] |
| **userId** | **String**|  | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**GetAGroupChannelResponse**](GetAGroupChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## hideAChannel

> Object hideAChannel(channelUrl).apiToken(apiToken).hideAChannelRequest(hideAChannelRequest).execute();

Hide a channel

## Hide a channel

This action allows you to hide a [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) from a user's channel list. Hiding a channel gives users the ability to archive channels so that they can focus on channels that need the most attention.

With this API, you can allow users to hide a channel from themselves or from all channel members. You can also determine whether to have the channel remain hidden when a new message is sent to the channel. Note that only group channels can be hidden.

[https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/hide-a-channel#1-hide-a-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/hide-a-channel#1-hide-a-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        HideAChannelRequest hideAChannelRequest = new HideAChannelRequest(); // HideAChannelRequest | 
        try {
            Object result = api.hideAChannel(channelUrl)
                .apiToken(apiToken)
                .hideAChannelRequest(hideAChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#hideAChannel");
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
| **hideAChannelRequest** | [**HideAChannelRequest**](HideAChannelRequest.md)|  | [optional] |

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


## inviteAsMembers

> InviteAsMembersResponse inviteAsMembers(channelUrl).apiToken(apiToken).inviteAsMembersRequest(inviteAsMembersRequest).execute();

Invite as members

## Invite as members

Invites one or more users as members to a group channel. Users can join a group channel immediately after receiving an invitation, without having to accept it. To give users an option to accept or decline an invitation, see [update default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/update-default-invitation-preference) or [update channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-channel-invitation-preference). See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.

> **Note**: By default, [blocked users](https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/block-users) are included when sending invitations. If you wish to exclude blocked users, [contact our sales team](https://get.sendbird.com/talk-to-sales.html). 
  

[https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel#1-invite-as-members](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel#1-invite-as-members)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        InviteAsMembersRequest inviteAsMembersRequest = new InviteAsMembersRequest(); // InviteAsMembersRequest | 
        try {
            InviteAsMembersResponse result = api.inviteAsMembers(channelUrl)
                .apiToken(apiToken)
                .inviteAsMembersRequest(inviteAsMembersRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#inviteAsMembers");
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
| **inviteAsMembersRequest** | [**InviteAsMembersRequest**](InviteAsMembersRequest.md)|  | [optional] |

### Return type

[**InviteAsMembersResponse**](InviteAsMembersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## joinAChannel

> SendbirdGroupChannelDetail joinAChannel(channelUrl).apiToken(apiToken).joinAChannelRequest(joinAChannelRequest).execute();

Join a channel

## Join a channel

This API allows a user to join a [public](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#4-group-channel-types) group channel. Users can only join public group channels where the `is_public` property is set to `true` using this API. A single user can join up to 2,000 group channels, and a user who reaches the capacity can’t join a new channel. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.

[https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/join-a-channel#1-join-a-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/join-a-channel#1-join-a-channel)

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        JoinAChannelRequest joinAChannelRequest = new JoinAChannelRequest(); // JoinAChannelRequest | 
        try {
            SendbirdGroupChannelDetail result = api.joinAChannel(channelUrl)
                .apiToken(apiToken)
                .joinAChannelRequest(joinAChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#joinAChannel");
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
| **joinAChannelRequest** | [**JoinAChannelRequest**](JoinAChannelRequest.md)|  | [optional] |

### Return type

[**SendbirdGroupChannelDetail**](SendbirdGroupChannelDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Join a channel |  -  |


## leaveAChannel

> Object leaveAChannel(channelUrl).apiToken(apiToken).leaveAChannelRequest(leaveAChannelRequest).execute();

Leave a channel

## Leave a channel

Makes one or more members leave a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-leave-a-channel
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        LeaveAChannelRequest leaveAChannelRequest = new LeaveAChannelRequest(); // LeaveAChannelRequest | 
        try {
            Object result = api.leaveAChannel(channelUrl)
                .apiToken(apiToken)
                .leaveAChannelRequest(leaveAChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#leaveAChannel");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **leaveAChannelRequest** | [**LeaveAChannelRequest**](LeaveAChannelRequest.md)|  | [optional] |

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


## listChannels

> GroupChatListChannelsResponse listChannels().apiToken(apiToken).token(token).limit(limit).distinctMode(distinctMode).publicMode(publicMode).superMode(superMode).createdAfter(createdAfter).createdBefore(createdBefore).showEmpty(showEmpty).showMember(showMember).showDeliveryReceipt(showDeliveryReceipt).showReadReceipt(showReadReceipt).showMetadata(showMetadata).showFrozen(showFrozen).order(order).metadataOrderKey(metadataOrderKey).customTypes(customTypes).customTypeStartswith(customTypeStartswith).channelUrls(channelUrls).name(name).nameContains(nameContains).nameStartswith(nameStartswith).membersExactlyIn(membersExactlyIn).membersIncludeIn(membersIncludeIn).queryType(queryType).membersNickname(membersNickname).membersNicknameContains(membersNicknameContains).metadataKey(metadataKey).metadataValues(metadataValues).metadataValueStartswith(metadataValueStartswith).metacounterKey(metacounterKey).metacounterValues(metacounterValues).metacounterValueGt(metacounterValueGt).metacounterValueGte(metacounterValueGte).metacounterValueLt(metacounterValueLt).metacounterValueLte(metacounterValueLte).includeSortedMetaarrayInLastMessage(includeSortedMetaarrayInLastMessage).execute();

List channels

## List group channels

This action retrieves a list of [group channels](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel). You can use various query parameters to determine the search scope and select what kind of information you want to receive about the queried channels.

If you want to retrieve a list of group channels that a specific user has joined, use the [list group channels by user](https://sendbird.com/docs/chat/platform-api/v3/user/managing-joined-group-channels/list-group-channels-by-user) action under the User section.

https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-group-channels#1-list-group-channels

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
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
        try {
            GroupChatListChannelsResponse result = api.listChannels()
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
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#listChannels");
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

### Return type

[**GroupChatListChannelsResponse**](GroupChatListChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listMembers

> GroupChannelListMembersResponse listMembers(channelUrl).token(token).limit(limit).userId(userId).showDeliveryReceipt(showDeliveryReceipt).showReadReceipt(showReadReceipt).showMemberIsMuted(showMemberIsMuted).order(order).operatorFilter(operatorFilter).memberStateFilter(memberStateFilter).mutedMemberFilter(mutedMemberFilter).memberActiveModeFilter(memberActiveModeFilter).nicknameStartswith(nicknameStartswith).includePushPreference(includePushPreference).apiToken(apiToken).execute();

List members

## List members

Retrieves a list of members of a group channel.

> **Note**: See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types. 
  

[https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/list-members-of-a-group-channel#1-list-members-of-a-group-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/list-members-of-a-group-channel#1-list-members-of-a-group-channel)

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to retrieve a list of members of.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10)
        String userId = "userId_example"; // String | Specifies the unique ID of a user. If `user_id` is provided, the response will include two additional boolean properties about each user in the members list. - `is_blocking_me`: Indicates whether the listed user is blocking the user specified in the user_id parameter. - `is_blocked_by_me`: Indicates whether the listed user is blocked by the user specified in the user_id parameter.
        Boolean showDeliveryReceipt = true; // Boolean | 
        Boolean showReadReceipt = true; // Boolean | 
        Boolean showMemberIsMuted = true; // Boolean | 
        String order = "member_nickname_alphabetical"; // String | Specifies the method to sort a list of results. Acceptable values are the following: - `member_nickname_alphabetical` (default): sorts by the member nicknames in alphabetical order. - `operator_then_member_alphabetical`: sorts by the operational role and member nickname in alphabetical order where channel operators are listed before channel members.
        String operatorFilter = "all"; // String | Restricts the search scope to only retrieve operators or non-operator members of the channel. Acceptable values are the following: - `all` (default): no filter is applied to the list. - `operator`: only channel operators are retrieved. - `nonoperator`: all channel members, except channel operators, are retrieved.
        String memberStateFilter = "all"; // String | Restricts the search scope to retrieve members based on if they have accepted an invitation or if they were invited by a friend. Acceptable values are `invited_only`, `joined_only`, `invited_by_friend`, `invited_by_non_friend`, and `all`. (Default: `all`)
        String mutedMemberFilter = "all"; // String | Restricts the search scope to retrieve members who are muted or unmuted in the channel. Acceptable values are `all`, `muted`, and `unmuted`. (Default: `all`)
        String memberActiveModeFilter = "activated"; // String | Restricts the search scope to retrieve members who are activated or deactivated in the channel. Acceptable values are `all`, `activated`, and `deactivated`. (default: `activated`)
        String nicknameStartswith = "nicknameStartswith_example"; // String | Searches for members whose nicknames start with the specified value. Urlencoding the value is recommended.
        Boolean includePushPreference = true; // Boolean | Determines whether to include information about the push preference of each member, such as `push_enabled`, `push_trigger_option`, and `do_not_disturb`. (Default: `false`)
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GroupChannelListMembersResponse result = api.listMembers(channelUrl)
                .token(token)
                .limit(limit)
                .userId(userId)
                .showDeliveryReceipt(showDeliveryReceipt)
                .showReadReceipt(showReadReceipt)
                .showMemberIsMuted(showMemberIsMuted)
                .order(order)
                .operatorFilter(operatorFilter)
                .memberStateFilter(memberStateFilter)
                .mutedMemberFilter(mutedMemberFilter)
                .memberActiveModeFilter(memberActiveModeFilter)
                .nicknameStartswith(nicknameStartswith)
                .includePushPreference(includePushPreference)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#listMembers");
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**| Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10) | [optional] |
| **userId** | **String**| Specifies the unique ID of a user. If &#x60;user_id&#x60; is provided, the response will include two additional boolean properties about each user in the members list. - &#x60;is_blocking_me&#x60;: Indicates whether the listed user is blocking the user specified in the user_id parameter. - &#x60;is_blocked_by_me&#x60;: Indicates whether the listed user is blocked by the user specified in the user_id parameter. | [optional] |
| **showDeliveryReceipt** | **Boolean**|  | [optional] |
| **showReadReceipt** | **Boolean**|  | [optional] |
| **showMemberIsMuted** | **Boolean**|  | [optional] |
| **order** | **String**| Specifies the method to sort a list of results. Acceptable values are the following: - &#x60;member_nickname_alphabetical&#x60; (default): sorts by the member nicknames in alphabetical order. - &#x60;operator_then_member_alphabetical&#x60;: sorts by the operational role and member nickname in alphabetical order where channel operators are listed before channel members. | [optional] [enum: member_nickname_alphabetical, operator_then_member_alphabetical] |
| **operatorFilter** | **String**| Restricts the search scope to only retrieve operators or non-operator members of the channel. Acceptable values are the following: - &#x60;all&#x60; (default): no filter is applied to the list. - &#x60;operator&#x60;: only channel operators are retrieved. - &#x60;nonoperator&#x60;: all channel members, except channel operators, are retrieved. | [optional] [enum: all, operator, nonoperator] |
| **memberStateFilter** | **String**| Restricts the search scope to retrieve members based on if they have accepted an invitation or if they were invited by a friend. Acceptable values are &#x60;invited_only&#x60;, &#x60;joined_only&#x60;, &#x60;invited_by_friend&#x60;, &#x60;invited_by_non_friend&#x60;, and &#x60;all&#x60;. (Default: &#x60;all&#x60;) | [optional] [enum: all, invited_only, joined_only, invited_by_friend, invited_by_non_friend] |
| **mutedMemberFilter** | **String**| Restricts the search scope to retrieve members who are muted or unmuted in the channel. Acceptable values are &#x60;all&#x60;, &#x60;muted&#x60;, and &#x60;unmuted&#x60;. (Default: &#x60;all&#x60;) | [optional] [enum: all, muted, unmuted] |
| **memberActiveModeFilter** | **String**| Restricts the search scope to retrieve members who are activated or deactivated in the channel. Acceptable values are &#x60;all&#x60;, &#x60;activated&#x60;, and &#x60;deactivated&#x60;. (default: &#x60;activated&#x60;) | [optional] [enum: activated, deactivated] |
| **nicknameStartswith** | **String**| Searches for members whose nicknames start with the specified value. Urlencoding the value is recommended. | [optional] |
| **includePushPreference** | **Boolean**| Determines whether to include information about the push preference of each member, such as &#x60;push_enabled&#x60;, &#x60;push_trigger_option&#x60;, and &#x60;do_not_disturb&#x60;. (Default: &#x60;false&#x60;) | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**GroupChannelListMembersResponse**](GroupChannelListMembersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listOperators

> ListOperatorsResponse listOperators(channelUrl).token(token).limit(limit).apiToken(apiToken).execute();

List operators

## List operators

You can retrieve a list of operators of a group channel using this API.

https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/list-operators-of-a-group-channel#1-list-operators-of-a-group-channel

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to retrieve a list of operators.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10)
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListOperatorsResponse result = api.listOperators(channelUrl)
                .token(token)
                .limit(limit)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#listOperators");
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**| Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10) | [optional] |
| **apiToken** | **String**|  | [optional] |

### Return type

[**ListOperatorsResponse**](ListOperatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## registerOperatorsToAGroupChannel

> Object registerOperatorsToAGroupChannel(channelUrl).apiToken(apiToken).registerOperatorsToAGroupChannelRequest(registerOperatorsToAGroupChannelRequest).execute();

Register operators to a group channel

## Register operators to a group channel

You can register one or more operators to a group channel using this API.

https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/register-operators-to-a-group-channel#1-register-operators-to-a-group-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest = new RegisterOperatorsToAGroupChannelRequest(); // RegisterOperatorsToAGroupChannelRequest | 
        try {
            Object result = api.registerOperatorsToAGroupChannel(channelUrl)
                .apiToken(apiToken)
                .registerOperatorsToAGroupChannelRequest(registerOperatorsToAGroupChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#registerOperatorsToAGroupChannel");
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
| **registerOperatorsToAGroupChannelRequest** | [**RegisterOperatorsToAGroupChannelRequest**](RegisterOperatorsToAGroupChannelRequest.md)|  | [optional] |

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


## resetChatHistory

> ResetChatHistoryResponse resetChatHistory(channelUrl).apiToken(apiToken).resetChatHistoryRequest(resetChatHistoryRequest).execute();

Reset chat history

## Reset chat history

This action resets the properties related to a specific user's chat history in a [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel), clearing existing messages in a channel from only the specified user's end. Because this action doesn't delete messages from the Sendbird database, other members in the channel can still retrieve and see the messages.

This action clears the messages for the specified user by updating the `last_message` and `read_receipt` properties of the [group channel resource](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#4-list-of-properties-for-group-channels) in addition to other internally managed data such as the count of a user's unread messages.

Using the `reset_all` property, you can also reset the properties related to the chat history of all members in a group channel.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/reset-chat-history#1-reset-chat-history

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        ResetChatHistoryRequest resetChatHistoryRequest = new ResetChatHistoryRequest(); // ResetChatHistoryRequest | 
        try {
            ResetChatHistoryResponse result = api.resetChatHistory(channelUrl)
                .apiToken(apiToken)
                .resetChatHistoryRequest(resetChatHistoryRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#resetChatHistory");
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
| **resetChatHistoryRequest** | [**ResetChatHistoryRequest**](ResetChatHistoryRequest.md)|  | [optional] |

### Return type

[**ResetChatHistoryResponse**](ResetChatHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## startTypingIndicators

> Object startTypingIndicators(channelUrl).apiToken(apiToken).startTypingIndicatorsRequest(startTypingIndicatorsRequest).execute();

Start typing indicators

## Start typing indicators

You can start showing a typing indicator using this API. Seeing whether other users are typing can help a more interactive conversation environment by showing real-time engagement of other users.

If you're looking for an easy way to show typing indicators on your app, check out Sendbird UIKit for a ready-to-use UI feature that can be customized to fit your needs.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-typing-indicators/start-typing-indicators#1-start-typing-indicators

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to set typing indicators.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        StartTypingIndicatorsRequest startTypingIndicatorsRequest = new StartTypingIndicatorsRequest(); // StartTypingIndicatorsRequest | 
        try {
            Object result = api.startTypingIndicators(channelUrl)
                .apiToken(apiToken)
                .startTypingIndicatorsRequest(startTypingIndicatorsRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#startTypingIndicators");
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
| **startTypingIndicatorsRequest** | [**StartTypingIndicatorsRequest**](StartTypingIndicatorsRequest.md)|  | [optional] |

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


## stopTypingIndicators

> Object stopTypingIndicators(channelUrl).apiToken(apiToken).startTypingIndicatorsRequest(startTypingIndicatorsRequest).execute();

Stop typing indicators

## Stop typing indicators

You can stop showing a typing indicator using this API. To signal that a user is no longer typing, you can let the indicator disappear when the user sends a message or completely deletes the message text.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-typing-indicators/stop-typing-indicators#1-stop-typing-indicators

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to set typing indicators.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String apiToken = "{{API_TOKEN}}"; // String | 
        StartTypingIndicatorsRequest startTypingIndicatorsRequest = new StartTypingIndicatorsRequest(); // StartTypingIndicatorsRequest | 
        try {
            Object result = api.stopTypingIndicators(channelUrl)
                .apiToken(apiToken)
                .startTypingIndicatorsRequest(startTypingIndicatorsRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#stopTypingIndicators");
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
| **startTypingIndicatorsRequest** | [**StartTypingIndicatorsRequest**](StartTypingIndicatorsRequest.md)|  | [optional] |

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


## unhideAChannel

> Object unhideAChannel(channelUrl).userId(userId).shouldUnhideAll(shouldUnhideAll).apiToken(apiToken).execute();

Unhide a channel

## Unhide a channel

This action lets a hidden [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) reappear on the channel list of a specific user or every member in the group channel. Hiding or unhiding a channel lets users organize their channel list based on those that require the most attention. Note that only group channels can be hidden or unhidden.

[https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/unhide-a-channel#1-unhide-a-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/unhide-a-channel#1-unhide-a-channel)

`channel_url`  
Type: string  
Description: Specifies the URL of the channel to unhide or unarchive.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | (Required) 
        String userId = "userId_example"; // String | (Required) 
        Boolean shouldUnhideAll = true; // Boolean | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.unhideAChannel(channelUrl)
                .userId(userId)
                .shouldUnhideAll(shouldUnhideAll)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#unhideAChannel");
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
| **userId** | **String**| (Required)  | |
| **shouldUnhideAll** | **Boolean**|  | [optional] |
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


## updateAGroupChannel

> SendbirdGroupChannelDetail updateAGroupChannel(channelUrl).apiToken(apiToken).updateAGroupChannelRequest(updateAGroupChannelRequest).execute();

Update a group channel

## Update a group channel

You can update information about a group channel or a Supergroup channel using this API. You can't make any changes to the members of a channel with this API. To change members, see [invite as members](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel) instead. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-a-group-channel#1-update-a-group-channel

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateAGroupChannelRequest updateAGroupChannelRequest = new UpdateAGroupChannelRequest(); // UpdateAGroupChannelRequest | 
        try {
            SendbirdGroupChannelDetail result = api.updateAGroupChannel(channelUrl)
                .apiToken(apiToken)
                .updateAGroupChannelRequest(updateAGroupChannelRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#updateAGroupChannel");
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **updateAGroupChannelRequest** | [**UpdateAGroupChannelRequest**](UpdateAGroupChannelRequest.md)|  | [optional] |

### Return type

[**SendbirdGroupChannelDetail**](SendbirdGroupChannelDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

