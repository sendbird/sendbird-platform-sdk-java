# GroupChannelApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gcAcceptInvitation**](GroupChannelApi.md#gcAcceptInvitation) | **PUT** /v3/group_channels/{channel_url}/accept | Accept an invitation |
| [**gcCancelTheRegistrationOfOperators**](GroupChannelApi.md#gcCancelTheRegistrationOfOperators) | **DELETE** /v3/group_channels/{channel_url}/operators | Cancel the registration of operators |
| [**gcCheckIfMemberById**](GroupChannelApi.md#gcCheckIfMemberById) | **GET** /v3/group_channels/{channel_url}/members/{user_id} | Check if member |
| [**gcCreateChannel**](GroupChannelApi.md#gcCreateChannel) | **POST** /v3/group_channels | Create a channel |
| [**gcDeclineInvitation**](GroupChannelApi.md#gcDeclineInvitation) | **PUT** /v3/group_channels/{channel_url}/decline | Decline an invitation |
| [**gcDeleteChannelByUrl**](GroupChannelApi.md#gcDeleteChannelByUrl) | **DELETE** /v3/group_channels/{channel_url} | Delete a channel |
| [**gcHideOrArchiveChannel**](GroupChannelApi.md#gcHideOrArchiveChannel) | **PUT** /v3/group_channels/{channel_url}/hide | Hide or archive a channel |
| [**gcInviteAsMembers**](GroupChannelApi.md#gcInviteAsMembers) | **POST** /v3/group_channels/{channel_url}/invite | Invite as members |
| [**gcJoinChannel**](GroupChannelApi.md#gcJoinChannel) | **PUT** /v3/group_channels/{channel_url}/join | Join a channel |
| [**gcLeaveChannel**](GroupChannelApi.md#gcLeaveChannel) | **PUT** /v3/group_channels/{channel_url}/leave | Leave a channel |
| [**gcListChannels**](GroupChannelApi.md#gcListChannels) | **GET** /v3/group_channels | List channels |
| [**gcListMembers**](GroupChannelApi.md#gcListMembers) | **GET** /v3/group_channels/{channel_url}/members | List members |
| [**gcListOperators**](GroupChannelApi.md#gcListOperators) | **GET** /v3/group_channels/{channel_url}/operators | List operators |
| [**gcRegisterOperators**](GroupChannelApi.md#gcRegisterOperators) | **POST** /v3/group_channels/{channel_url}/operators | Register operators |
| [**gcResetChatHistory**](GroupChannelApi.md#gcResetChatHistory) | **PUT** /v3/group_channels/{channel_url}/reset_user_history | Reset chat history |
| [**gcStartTypingIndicators**](GroupChannelApi.md#gcStartTypingIndicators) | **POST** /v3/group_channels/{channel_url}/typing | Start typing indicators |
| [**gcStopTypingIndicators**](GroupChannelApi.md#gcStopTypingIndicators) | **DELETE** /v3/group_channels/{channel_url}/typing | Stop typing indicators |
| [**gcUnhideOrUnarchiveChannel**](GroupChannelApi.md#gcUnhideOrUnarchiveChannel) | **DELETE** /v3/group_channels/{channel_url}/hide | Unhide or unarchive a channel |
| [**gcUpdateChannelByUrl**](GroupChannelApi.md#gcUpdateChannelByUrl) | **PUT** /v3/group_channels/{channel_url} | Update a channel |
| [**gcViewChannelByUrl**](GroupChannelApi.md#gcViewChannelByUrl) | **GET** /v3/group_channels/{channel_url} | View a channel |



## gcAcceptInvitation

> SendBirdGroupChannel gcAcceptInvitation(channelUrl).apiToken(apiToken).gcAcceptInvitationData(gcAcceptInvitationData).execute();

Accept an invitation

## Accept an invitation

Accepts an invitation from a [private](#4-private-vs-public) group channel for a user to join. Since a user is allowed to join up to 2,000 group channels, the invitation to a user who already belongs to a maximum number of group channels will be canceled automatically.

> __Note__: This action is effective only when the `auto_accept` property of an application is set to false. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, or [update a user's channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-accept-an-invitation
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
        GcAcceptInvitationData gcAcceptInvitationData = new GcAcceptInvitationData(); // GcAcceptInvitationData | 
        try {
            SendBirdGroupChannel result = api.gcAcceptInvitation(channelUrl)
                .apiToken(apiToken)
                .gcAcceptInvitationData(gcAcceptInvitationData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcAcceptInvitation");
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
| **gcAcceptInvitationData** | [**GcAcceptInvitationData**](GcAcceptInvitationData.md)|  | [optional] |

### Return type

[**SendBirdGroupChannel**](SendBirdGroupChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcCancelTheRegistrationOfOperators

> OcDeleteChannelByUrl200Response gcCancelTheRegistrationOfOperators(channelUrl).operatorIds(operatorIds).apiToken(apiToken).deleteAll(deleteAll).execute();

Cancel the registration of operators

## Cancel the registration of operators

Cancels the registration of operators from a group channel but leave them as members.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-cancel-the-registration-of-operators
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        List<String> operatorIds = Arrays.asList(); // List<String> | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        Boolean deleteAll = true; // Boolean | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcCancelTheRegistrationOfOperators(channelUrl)
                .operatorIds(operatorIds)
                .apiToken(apiToken)
                .deleteAll(deleteAll)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcCancelTheRegistrationOfOperators");
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
| **operatorIds** | **List&lt;String&gt;**|  | |
| **apiToken** | **String**|  | [optional] |
| **deleteAll** | **Boolean**|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcCheckIfMemberById

> GcCheckIfMemberByIdResponse gcCheckIfMemberById(channelUrl, userId).apiToken(apiToken).execute();

Check if member

## Check if member

Checks whether the user is a member of the group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-check-if-member
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
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GcCheckIfMemberByIdResponse result = api.gcCheckIfMemberById(channelUrl, userId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcCheckIfMemberById");
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

### Return type

[**GcCheckIfMemberByIdResponse**](GcCheckIfMemberByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcCreateChannel

> SendBirdGroupChannel gcCreateChannel().apiToken(apiToken).gcCreateChannelData(gcCreateChannelData).execute();

Create a channel

## Create a channel

Creates a new group channel.

> If you are creating a 1-on-1 direct messaging channel for a user, it is recommended that you turn on the `distinct` property. If the property is turned off, a user can create a new channel even if they have had the previous chat between them, and therefore can't see previously sent messages or data in the new channel. On the other hand, if the `distinct` property is turned on, every 1-on-1 conversation between the same two users occurs within the same channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel

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
        GcCreateChannelData gcCreateChannelData = new GcCreateChannelData(); // GcCreateChannelData | 
        try {
            SendBirdGroupChannel result = api.gcCreateChannel()
                .apiToken(apiToken)
                .gcCreateChannelData(gcCreateChannelData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcCreateChannel");
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
| **gcCreateChannelData** | [**GcCreateChannelData**](GcCreateChannelData.md)|  | [optional] |

### Return type

[**SendBirdGroupChannel**](SendBirdGroupChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcDeclineInvitation

> OcDeleteChannelByUrl200Response gcDeclineInvitation(channelUrl).apiToken(apiToken).gcDeclineInvitationData(gcDeclineInvitationData).execute();

Decline an invitation

## Decline an invitation

Declines an invitation for a user to not join a [private](#4-private-vs-public) group channel.

> __Note__: This action is effective only when the `auto_accept` property of an application is set to false. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, or [update a user's channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-decline-an-invitation
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
        GcDeclineInvitationData gcDeclineInvitationData = new GcDeclineInvitationData(); // GcDeclineInvitationData | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcDeclineInvitation(channelUrl)
                .apiToken(apiToken)
                .gcDeclineInvitationData(gcDeclineInvitationData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcDeclineInvitation");
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
| **gcDeclineInvitationData** | [**GcDeclineInvitationData**](GcDeclineInvitationData.md)|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcDeleteChannelByUrl

> OcDeleteChannelByUrl200Response gcDeleteChannelByUrl(channelUrl).apiToken(apiToken).execute();

Delete a channel

## Delete a channel

Deletes a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-delete-a-channel
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
        try {
            OcDeleteChannelByUrl200Response result = api.gcDeleteChannelByUrl(channelUrl)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcDeleteChannelByUrl");
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

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcHideOrArchiveChannel

> OcDeleteChannelByUrl200Response gcHideOrArchiveChannel(channelUrl).apiToken(apiToken).gcHideOrArchiveChannelData(gcHideOrArchiveChannelData).execute();

Hide or archive a channel

## Hide or archive a channel

Hides or archives a channel from the channel list of either a specific user or entire channel members. Normally, a hidden channel comes back and shows up in the channel list when a member in the channel sends a new message. This automatically-triggered behavior is intended for users who want to temporarily remove a channel from their list because [leaving the channel](#2-leave-the-channel) would delete all the past messages and stored data.

You can also leave out a channel from the list and archive the channel. The channel doesn't appear even when receiving a new message from other member.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-hide-or-archive-a-channel
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
        GcHideOrArchiveChannelData gcHideOrArchiveChannelData = new GcHideOrArchiveChannelData(); // GcHideOrArchiveChannelData | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcHideOrArchiveChannel(channelUrl)
                .apiToken(apiToken)
                .gcHideOrArchiveChannelData(gcHideOrArchiveChannelData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcHideOrArchiveChannel");
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
| **gcHideOrArchiveChannelData** | [**GcHideOrArchiveChannelData**](GcHideOrArchiveChannelData.md)|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcInviteAsMembers

> SendBirdGroupChannel gcInviteAsMembers(channelUrl).apiToken(apiToken).gcInviteAsMembersData(gcInviteAsMembersData).execute();

Invite as members

## Invite as members

Invites one or more users as members into the group channel.

> __Note__: By default, users in your application automatically join a [private](#4-private-vs-public) group channel promptly from an invitation without having to accept it. If you want to give them the option to decide whether to accept or decline an invitation, you should set the value of channel invitation preference to false through the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action. Or using the [update a user's channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can also allow the option individually by user.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members
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
        GcInviteAsMembersData gcInviteAsMembersData = new GcInviteAsMembersData(); // GcInviteAsMembersData | 
        try {
            SendBirdGroupChannel result = api.gcInviteAsMembers(channelUrl)
                .apiToken(apiToken)
                .gcInviteAsMembersData(gcInviteAsMembersData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcInviteAsMembers");
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
| **gcInviteAsMembersData** | [**GcInviteAsMembersData**](GcInviteAsMembersData.md)|  | [optional] |

### Return type

[**SendBirdGroupChannel**](SendBirdGroupChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcJoinChannel

> gcJoinChannel(channelUrl).apiToken(apiToken).gcJoinChannelData(gcJoinChannelData).execute();

Join a channel

## Join a channel

Allows a user to join a [public](#4-private-vs-public) group channel. Since a user is allowed to join up to 2,000 group channels, a user who already belongs to a maximum number of group channels can't join a new channel.

> __Note__: This action is only permitted for public group channels where the `is_public` property is true.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-join-a-channel
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
        GcJoinChannelData gcJoinChannelData = new GcJoinChannelData(); // GcJoinChannelData | 
        try {
            api.gcJoinChannel(channelUrl)
                .apiToken(apiToken)
                .gcJoinChannelData(gcJoinChannelData)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcJoinChannel");
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
| **gcJoinChannelData** | [**GcJoinChannelData**](GcJoinChannelData.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcLeaveChannel

> OcDeleteChannelByUrl200Response gcLeaveChannel(channelUrl).apiToken(apiToken).gcLeaveChannelData(gcLeaveChannelData).execute();

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
        GcLeaveChannelData gcLeaveChannelData = new GcLeaveChannelData(); // GcLeaveChannelData | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcLeaveChannel(channelUrl)
                .apiToken(apiToken)
                .gcLeaveChannelData(gcLeaveChannelData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcLeaveChannel");
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
| **gcLeaveChannelData** | [**GcLeaveChannelData**](GcLeaveChannelData.md)|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcListChannels

> GcListChannelsResponse gcListChannels().apiToken(apiToken).token(token).limit(limit).distinctMode(distinctMode).publicMode(publicMode).superMode(superMode).createdAfter(createdAfter).createdBefore(createdBefore).showEmpty(showEmpty).showMember(showMember).showDeliveryReceipt(showDeliveryReceipt).showReadReceipt(showReadReceipt).showMetadata(showMetadata).showFrozen(showFrozen).order(order).metadataOrderKey(metadataOrderKey).customTypes(customTypes).customTypeStartswith(customTypeStartswith).channelUrls(channelUrls).name(name).nameContains(nameContains).nameStartswith(nameStartswith).membersExactlyIn(membersExactlyIn).membersIncludeIn(membersIncludeIn).queryType(queryType).membersNickname(membersNickname).membersNicknameContains(membersNicknameContains).metadataKey(metadataKey).metadataValues(metadataValues).metadataValueStartswith(metadataValueStartswith).metacounterKey(metacounterKey).metacounterValues(metacounterValues).metacounterValueGt(metacounterValueGt).metacounterValueGte(metacounterValueGte).metacounterValueLt(metacounterValueLt).metacounterValueLte(metacounterValueLte).includeSortedMetaarrayInLastMessage(includeSortedMetaarrayInLastMessage).customType(customType).readReceipt(readReceipt).member(member).isDistinct(isDistinct).membersIn(membersIn).userId(userId).execute();

List channels

## List channels

Retrieves a list of group channels in the application.

> __Note__: If you want to get a list of a specific user's group channels, use the [list my group channels](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels) action instead.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-channels
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
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String distinctMode = "distinctMode_example"; // String | 
        String publicMode = "publicMode_example"; // String | 
        String superMode = "superMode_example"; // String | 
        Integer createdAfter = 56; // Integer | 
        Integer createdBefore = 56; // Integer | 
        Boolean showEmpty = true; // Boolean | 
        Boolean showMember = true; // Boolean | 
        Boolean showDeliveryReceipt = true; // Boolean | 
        Boolean showReadReceipt = true; // Boolean | 
        Boolean showMetadata = true; // Boolean | 
        Boolean showFrozen = true; // Boolean | 
        String order = "order_example"; // String | 
        String metadataOrderKey = "metadataOrderKey_example"; // String | 
        String customTypes = "customTypes_example"; // String | 
        String customTypeStartswith = "customTypeStartswith_example"; // String | 
        String channelUrls = "channelUrls_example"; // String | 
        String name = "name_example"; // String | 
        String nameContains = "nameContains_example"; // String | 
        String nameStartswith = "nameStartswith_example"; // String | 
        String membersExactlyIn = "membersExactlyIn_example"; // String | 
        String membersIncludeIn = "membersIncludeIn_example"; // String | 
        String queryType = "queryType_example"; // String | 
        String membersNickname = "membersNickname_example"; // String | 
        String membersNicknameContains = "membersNicknameContains_example"; // String | 
        String metadataKey = "metadataKey_example"; // String | 
        String metadataValues = "metadataValues_example"; // String | 
        String metadataValueStartswith = "metadataValueStartswith_example"; // String | 
        String metacounterKey = "metacounterKey_example"; // String | 
        String metacounterValues = "metacounterValues_example"; // String | 
        String metacounterValueGt = "metacounterValueGt_example"; // String | 
        String metacounterValueGte = "metacounterValueGte_example"; // String | 
        String metacounterValueLt = "metacounterValueLt_example"; // String | 
        String metacounterValueLte = "metacounterValueLte_example"; // String | 
        Boolean includeSortedMetaarrayInLastMessage = true; // Boolean | 
        String customType = "customType_example"; // String | 
        Boolean readReceipt = true; // Boolean | 
        Boolean member = true; // Boolean | 
        Boolean isDistinct = true; // Boolean | 
        String membersIn = "membersIn_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            GcListChannelsResponse result = api.gcListChannels()
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
                .userId(userId)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcListChannels");
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
| **distinctMode** | **String**|  | [optional] |
| **publicMode** | **String**|  | [optional] |
| **superMode** | **String**|  | [optional] |
| **createdAfter** | **Integer**|  | [optional] |
| **createdBefore** | **Integer**|  | [optional] |
| **showEmpty** | **Boolean**|  | [optional] |
| **showMember** | **Boolean**|  | [optional] |
| **showDeliveryReceipt** | **Boolean**|  | [optional] |
| **showReadReceipt** | **Boolean**|  | [optional] |
| **showMetadata** | **Boolean**|  | [optional] |
| **showFrozen** | **Boolean**|  | [optional] |
| **order** | **String**|  | [optional] |
| **metadataOrderKey** | **String**|  | [optional] |
| **customTypes** | **String**|  | [optional] |
| **customTypeStartswith** | **String**|  | [optional] |
| **channelUrls** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **nameContains** | **String**|  | [optional] |
| **nameStartswith** | **String**|  | [optional] |
| **membersExactlyIn** | **String**|  | [optional] |
| **membersIncludeIn** | **String**|  | [optional] |
| **queryType** | **String**|  | [optional] |
| **membersNickname** | **String**|  | [optional] |
| **membersNicknameContains** | **String**|  | [optional] |
| **metadataKey** | **String**|  | [optional] |
| **metadataValues** | **String**|  | [optional] |
| **metadataValueStartswith** | **String**|  | [optional] |
| **metacounterKey** | **String**|  | [optional] |
| **metacounterValues** | **String**|  | [optional] |
| **metacounterValueGt** | **String**|  | [optional] |
| **metacounterValueGte** | **String**|  | [optional] |
| **metacounterValueLt** | **String**|  | [optional] |
| **metacounterValueLte** | **String**|  | [optional] |
| **includeSortedMetaarrayInLastMessage** | **Boolean**|  | [optional] |
| **customType** | **String**|  | [optional] |
| **readReceipt** | **Boolean**|  | [optional] |
| **member** | **Boolean**|  | [optional] |
| **isDistinct** | **Boolean**|  | [optional] |
| **membersIn** | **String**|  | [optional] |
| **userId** | **String**|  | [optional] |

### Return type

[**GcListChannelsResponse**](GcListChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcListMembers

> GcListMembersResponse gcListMembers(channelUrl).apiToken(apiToken).token(token).limit(limit).showDeliveryReceipt(showDeliveryReceipt).showReadReceipt(showReadReceipt).order(order).operatorFilter(operatorFilter).memberStateFilter(memberStateFilter).mutedMemberFilter(mutedMemberFilter).nicknameStartswith(nicknameStartswith).execute();

List members

## List members

Retrieves a list of members of a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-members
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        Boolean showDeliveryReceipt = true; // Boolean | 
        Boolean showReadReceipt = true; // Boolean | 
        String order = "order_example"; // String | 
        String operatorFilter = "operatorFilter_example"; // String | 
        String memberStateFilter = "memberStateFilter_example"; // String | 
        String mutedMemberFilter = "mutedMemberFilter_example"; // String | 
        String nicknameStartswith = "nicknameStartswith_example"; // String | 
        try {
            GcListMembersResponse result = api.gcListMembers(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .showDeliveryReceipt(showDeliveryReceipt)
                .showReadReceipt(showReadReceipt)
                .order(order)
                .operatorFilter(operatorFilter)
                .memberStateFilter(memberStateFilter)
                .mutedMemberFilter(mutedMemberFilter)
                .nicknameStartswith(nicknameStartswith)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcListMembers");
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **showDeliveryReceipt** | **Boolean**|  | [optional] |
| **showReadReceipt** | **Boolean**|  | [optional] |
| **order** | **String**|  | [optional] |
| **operatorFilter** | **String**|  | [optional] |
| **memberStateFilter** | **String**|  | [optional] |
| **mutedMemberFilter** | **String**|  | [optional] |
| **nicknameStartswith** | **String**|  | [optional] |

### Return type

[**GcListMembersResponse**](GcListMembersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcListOperators

> GcListOperatorsResponse gcListOperators(channelUrl).apiToken(apiToken).token(token).limit(limit).execute();

List operators

## List operators

Retrieves a list of operators of a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-operators
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            GcListOperatorsResponse result = api.gcListOperators(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcListOperators");
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
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**GcListOperatorsResponse**](GcListOperatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcRegisterOperators

> GcRegisterOperatorsResponse gcRegisterOperators(channelUrl).apiToken(apiToken).gcRegisterOperatorsData(gcRegisterOperatorsData).execute();

Register operators

## Register operators

Registers one or more operators to a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-register-operators
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
        GcRegisterOperatorsData gcRegisterOperatorsData = new GcRegisterOperatorsData(); // GcRegisterOperatorsData | 
        try {
            GcRegisterOperatorsResponse result = api.gcRegisterOperators(channelUrl)
                .apiToken(apiToken)
                .gcRegisterOperatorsData(gcRegisterOperatorsData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcRegisterOperators");
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
| **gcRegisterOperatorsData** | [**GcRegisterOperatorsData**](GcRegisterOperatorsData.md)|  | [optional] |

### Return type

[**GcRegisterOperatorsResponse**](GcRegisterOperatorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcResetChatHistory

> GcResetChatHistoryResponse gcResetChatHistory(channelUrl).apiToken(apiToken).gcResetChatHistoryData(gcResetChatHistoryData).execute();

Reset chat history

## Reset chat history

Resets the properties related to a user's chat history in a group channel, then clears the existing messages in the channel on the user's side only. A user can no longer see the messages in a group channel once this action is called, but those messages are not deleted from the database of the Sendbird system. All other members in the channel can retrieve and see the messages.

This action simply clears the messages for the user by updating the `last_message` and `read_receipt` properties of the [channel](#2-types-of-a-channel-3-resource-representation) resource in addition to other internally managed data such as the number of the user's unread message.

Using the `reset_all` property, you can also reset the properties related to all users' chat history in a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-reset-chat-history
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
        GcResetChatHistoryData gcResetChatHistoryData = new GcResetChatHistoryData(); // GcResetChatHistoryData | 
        try {
            GcResetChatHistoryResponse result = api.gcResetChatHistory(channelUrl)
                .apiToken(apiToken)
                .gcResetChatHistoryData(gcResetChatHistoryData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcResetChatHistory");
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
| **gcResetChatHistoryData** | [**GcResetChatHistoryData**](GcResetChatHistoryData.md)|  | [optional] |

### Return type

[**GcResetChatHistoryResponse**](GcResetChatHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcStartTypingIndicators

> OcDeleteChannelByUrl200Response gcStartTypingIndicators(channelUrl).apiToken(apiToken).gcTypingIndicatorsData(gcTypingIndicatorsData).execute();

Start typing indicators

## Start typing indicators

You can start showing a typing indicator using this API. Seeing whether other users are typing can help a more interactive conversation environment by showing real-time engagement of other users.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-typing-indicators/start-typing-indicators
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        GcTypingIndicatorsData gcTypingIndicatorsData = new GcTypingIndicatorsData(); // GcTypingIndicatorsData | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcStartTypingIndicators(channelUrl)
                .apiToken(apiToken)
                .gcTypingIndicatorsData(gcTypingIndicatorsData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcStartTypingIndicators");
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
| **gcTypingIndicatorsData** | [**GcTypingIndicatorsData**](GcTypingIndicatorsData.md)|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcStopTypingIndicators

> OcDeleteChannelByUrl200Response gcStopTypingIndicators(channelUrl).apiToken(apiToken).gcTypingIndicatorsData(gcTypingIndicatorsData).execute();

Stop typing indicators

## Stop typing indicators

You can stop showing a typing indicator using this API. To signal that a user is no longer typing, you can let the indicator disappear when the user sends a message or completely deletes the message text.

https://sendbird.com/docs/chat/platform-api/v3/channel/managing-typing-indicators/stop-typing-indicators
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        GcTypingIndicatorsData gcTypingIndicatorsData = new GcTypingIndicatorsData(); // GcTypingIndicatorsData | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcStopTypingIndicators(channelUrl)
                .apiToken(apiToken)
                .gcTypingIndicatorsData(gcTypingIndicatorsData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcStopTypingIndicators");
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
| **gcTypingIndicatorsData** | [**GcTypingIndicatorsData**](GcTypingIndicatorsData.md)|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcUnhideOrUnarchiveChannel

> OcDeleteChannelByUrl200Response gcUnhideOrUnarchiveChannel(channelUrl).userId(userId).apiToken(apiToken).shouldUnhideAll(shouldUnhideAll).execute();

Unhide or unarchive a channel

## Unhide or unarchive a channel

Makes a hidden or archived channel reappear in the channel list of either a specific user or entire channel members.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unhide-or-unarchive-a-channel
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        Boolean shouldUnhideAll = true; // Boolean | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcUnhideOrUnarchiveChannel(channelUrl)
                .userId(userId)
                .apiToken(apiToken)
                .shouldUnhideAll(shouldUnhideAll)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcUnhideOrUnarchiveChannel");
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
| **shouldUnhideAll** | **Boolean**|  | [optional] |

### Return type

[**OcDeleteChannelByUrl200Response**](OcDeleteChannelByUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcUpdateChannelByUrl

> SendBirdGroupChannel gcUpdateChannelByUrl(channelUrl).apiToken(apiToken).gcUpdateChannelByUrlData(gcUpdateChannelByUrlData).execute();

Update a channel

## Update a channel

Updates information on a group channel.

> __Note__: You can't change the members of the channel here. To do so, see [invite as members](#2-invite-as-members) action below.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-channel
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
        GcUpdateChannelByUrlData gcUpdateChannelByUrlData = new GcUpdateChannelByUrlData(); // GcUpdateChannelByUrlData | 
        try {
            SendBirdGroupChannel result = api.gcUpdateChannelByUrl(channelUrl)
                .apiToken(apiToken)
                .gcUpdateChannelByUrlData(gcUpdateChannelByUrlData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcUpdateChannelByUrl");
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
| **gcUpdateChannelByUrlData** | [**GcUpdateChannelByUrlData**](GcUpdateChannelByUrlData.md)|  | [optional] |

### Return type

[**SendBirdGroupChannel**](SendBirdGroupChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## gcViewChannelByUrl

> SendBirdGroupChannel gcViewChannelByUrl(channelUrl).apiToken(apiToken).showDeliveryReceipt(showDeliveryReceipt).showReadReceipt(showReadReceipt).showMember(showMember).readReceipt(readReceipt).member(member).execute();

View a channel

## View a channel

Retrieves information on a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-channel
----------------------------

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
        String apiToken = "{{API_TOKEN}}"; // String | 
        Boolean showDeliveryReceipt = true; // Boolean | 
        Boolean showReadReceipt = true; // Boolean | 
        Boolean showMember = true; // Boolean | 
        Boolean readReceipt = true; // Boolean | 
        Boolean member = true; // Boolean | 
        try {
            SendBirdGroupChannel result = api.gcViewChannelByUrl(channelUrl)
                .apiToken(apiToken)
                .showDeliveryReceipt(showDeliveryReceipt)
                .showReadReceipt(showReadReceipt)
                .showMember(showMember)
                .readReceipt(readReceipt)
                .member(member)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcViewChannelByUrl");
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
| **showDeliveryReceipt** | **Boolean**|  | [optional] |
| **showReadReceipt** | **Boolean**|  | [optional] |
| **showMember** | **Boolean**|  | [optional] |
| **readReceipt** | **Boolean**|  | [optional] |
| **member** | **Boolean**|  | [optional] |

### Return type

[**SendBirdGroupChannel**](SendBirdGroupChannel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

