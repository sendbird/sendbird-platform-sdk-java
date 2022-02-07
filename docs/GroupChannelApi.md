# GroupChannelApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gcAcceptInvitation**](GroupChannelApi.md#gcAcceptInvitation) | **PUT** /v3/group_channels/{channel_url}/accept | Accept an invitation
[**gcBanUser**](GroupChannelApi.md#gcBanUser) | **POST** /v3/group_channels/{channel_url}/ban | Ban a user
[**gcCancelTheRegistrationOfOperators**](GroupChannelApi.md#gcCancelTheRegistrationOfOperators) | **DELETE** /v3/group_channels/{channel_url}/operators | Cancel the registration of operators
[**gcCheckIfMemberById**](GroupChannelApi.md#gcCheckIfMemberById) | **GET** /v3/group_channels/{channel_url}/members/{user_id} | Check if member
[**gcCreateChannel**](GroupChannelApi.md#gcCreateChannel) | **POST** /v3/group_channels | Create a channel
[**gcDeclineInvitation**](GroupChannelApi.md#gcDeclineInvitation) | **PUT** /v3/group_channels/{channel_url}/decline | Decline an invitation
[**gcDeleteChannelByUrl**](GroupChannelApi.md#gcDeleteChannelByUrl) | **DELETE** /v3/group_channels/{channel_url} | Delete a channel
[**gcFreezeChannel**](GroupChannelApi.md#gcFreezeChannel) | **PUT** /v3/group_channels/{channel_url}/freeze | Freeze a channel
[**gcHideOrArchiveChannel**](GroupChannelApi.md#gcHideOrArchiveChannel) | **PUT** /v3/group_channels/{channel_url}/hide | Hide or archive a channel
[**gcInviteAsMembers**](GroupChannelApi.md#gcInviteAsMembers) | **POST** /v3/group_channels/{channel_url}/invite | Invite as members
[**gcJoinChannel**](GroupChannelApi.md#gcJoinChannel) | **PUT** /v3/group_channels/{channel_url}/join | Join a channel
[**gcLeaveChannel**](GroupChannelApi.md#gcLeaveChannel) | **PUT** /v3/group_channels/{channel_url}/leave | Leave a channel
[**gcListBannedUsers**](GroupChannelApi.md#gcListBannedUsers) | **GET** /v3/group_channels/{channel_url}/ban | List banned users
[**gcListChannels**](GroupChannelApi.md#gcListChannels) | **GET** /v3/group_channels | List channels
[**gcListMembers**](GroupChannelApi.md#gcListMembers) | **GET** /v3/group_channels/{channel_url}/members | List members
[**gcListMutedUsers**](GroupChannelApi.md#gcListMutedUsers) | **GET** /v3/group_channels/{channel_url}/mute | List muted users
[**gcListOperators**](GroupChannelApi.md#gcListOperators) | **GET** /v3/group_channels/{channel_url}/operators | List operators
[**gcMuteUser**](GroupChannelApi.md#gcMuteUser) | **POST** /v3/group_channels/{channel_url}/mute | Mute a user
[**gcRegisterOperators**](GroupChannelApi.md#gcRegisterOperators) | **POST** /v3/group_channels/{channel_url}/operators | Register operators
[**gcResetChatHistory**](GroupChannelApi.md#gcResetChatHistory) | **PUT** /v3/group_channels/{channel_url}/reset_user_history | Reset chat history
[**gcUnbanUserById**](GroupChannelApi.md#gcUnbanUserById) | **DELETE** /v3/group_channels/{channel_url}/ban/{banned_user_id} | Unban a user
[**gcUnhideOrUnarchiveChannel**](GroupChannelApi.md#gcUnhideOrUnarchiveChannel) | **DELETE** /v3/group_channels/{channel_url}/hide | Unhide or unarchive a channel
[**gcUnmuteUserById**](GroupChannelApi.md#gcUnmuteUserById) | **DELETE** /v3/group_channels/{channel_url}/mute/{muted_user_id} | Unmute a user
[**gcUpdateBanById**](GroupChannelApi.md#gcUpdateBanById) | **PUT** /v3/group_channels/{channel_url}/ban/{banned_user_id} | Update a ban
[**gcUpdateChannelByUrl**](GroupChannelApi.md#gcUpdateChannelByUrl) | **PUT** /v3/group_channels/{channel_url} | Update a channel
[**gcViewBanById**](GroupChannelApi.md#gcViewBanById) | **GET** /v3/group_channels/{channel_url}/ban/{banned_user_id} | View a ban
[**gcViewChannelByUrl**](GroupChannelApi.md#gcViewChannelByUrl) | **GET** /v3/group_channels/{channel_url} | View a channel
[**gcViewMuteById**](GroupChannelApi.md#gcViewMuteById) | **GET** /v3/group_channels/{channel_url}/mute/{muted_user_id} | View a mute


<a name="gcAcceptInvitation"></a>
# **gcAcceptInvitation**
> SendBirdGroupChannel gcAcceptInvitation(channelUrl, apiToken, gcAcceptInvitationData)

Accept an invitation

## Accept an invitation  Accepts an invitation from a [private](#4-private-vs-public) group channel for a user to join. Since a user is allowed to join up to 2,000 group channels, the invitation to a user who already belongs to a maximum number of group channels will be canceled automatically.  &gt; __Note__: This action is effective only when the &#x60;auto_accept&#x60; property of an application is set to false. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, or [update a user&#39;s channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-accept-an-invitation ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      SendBirdGroupChannel result = apiInstance.gcAcceptInvitation(channelUrl, apiToken, gcAcceptInvitationData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcAcceptInvitationData** | [**GcAcceptInvitationData**](GcAcceptInvitationData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcBanUser"></a>
# **gcBanUser**
> InlineResponse20033BannedList gcBanUser(channelUrl, apiToken, gcBanUserData)

Ban a user

## Ban a user  Bans a user from a group channel. A banned user is immediately expelled from a channel and allowed to join the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-ban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    GcBanUserData gcBanUserData = new GcBanUserData(); // GcBanUserData | 
    try {
      InlineResponse20033BannedList result = apiInstance.gcBanUser(channelUrl, apiToken, gcBanUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcBanUser");
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
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcBanUserData** | [**GcBanUserData**](GcBanUserData.md)|  | [optional]

### Return type

[**InlineResponse20033BannedList**](InlineResponse20033BannedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcCancelTheRegistrationOfOperators"></a>
# **gcCancelTheRegistrationOfOperators**
> gcCancelTheRegistrationOfOperators(channelUrl, operatorIds, apiToken, deleteAll)

Cancel the registration of operators

## Cancel the registration of operators  Cancels the registration of operators from a group channel but leave them as members.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-cancel-the-registration-of-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to cancel the registration of operators.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      apiInstance.gcCancelTheRegistrationOfOperators(channelUrl, operatorIds, apiToken, deleteAll);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **operatorIds** | [**List&lt;String&gt;**](String.md)|  |
 **apiToken** | **String**|  | [optional]
 **deleteAll** | **Boolean**|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcCheckIfMemberById"></a>
# **gcCheckIfMemberById**
> InlineResponse20037 gcCheckIfMemberById(channelUrl, userId, apiToken)

Check if member

## Check if member  Checks whether the user is a member of the group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-check-if-member ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      InlineResponse20037 result = apiInstance.gcCheckIfMemberById(channelUrl, userId, apiToken);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcCreateChannel"></a>
# **gcCreateChannel**
> SendBirdGroupChannel gcCreateChannel(apiToken, gcCreateChannelData)

Create a channel

## Create a channel  Creates a new group channel.  &gt; If you are creating a 1-on-1 direct messaging channel for a user, it is recommended that you turn on the &#x60;distinct&#x60; property. If the property is turned off, a user can create a new channel even if they have had the previous chat between them, and therefore can&#39;t see previously sent messages or data in the new channel. On the other hand, if the &#x60;distinct&#x60; property is turned on, every 1-on-1 conversation between the same two users occurs within the same channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    GcCreateChannelData gcCreateChannelData = new GcCreateChannelData(); // GcCreateChannelData | 
    try {
      SendBirdGroupChannel result = apiInstance.gcCreateChannel(apiToken, gcCreateChannelData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  | [optional]
 **gcCreateChannelData** | [**GcCreateChannelData**](GcCreateChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcDeclineInvitation"></a>
# **gcDeclineInvitation**
> gcDeclineInvitation(channelUrl, apiToken, gcDeclineInvitationData)

Decline an invitation

## Decline an invitation  Declines an invitation for a user to not join a [private](#4-private-vs-public) group channel.  &gt; __Note__: This action is effective only when the &#x60;auto_accept&#x60; property of an application is set to false. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, or [update a user&#39;s channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-decline-an-invitation ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      apiInstance.gcDeclineInvitation(channelUrl, apiToken, gcDeclineInvitationData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcDeclineInvitationData** | [**GcDeclineInvitationData**](GcDeclineInvitationData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcDeleteChannelByUrl"></a>
# **gcDeleteChannelByUrl**
> gcDeleteChannelByUrl(channelUrl, apiToken)

Delete a channel

## Delete a channel  Deletes a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-delete-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.gcDeleteChannelByUrl(channelUrl, apiToken);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcFreezeChannel"></a>
# **gcFreezeChannel**
> SendBirdGroupChannel gcFreezeChannel(channelUrl, apiToken, gcFreezeChannelData)

Freeze a channel

## Freeze a channel  Freezes or unfreezes a group channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-freeze-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    GcFreezeChannelData gcFreezeChannelData = new GcFreezeChannelData(); // GcFreezeChannelData | 
    try {
      SendBirdGroupChannel result = apiInstance.gcFreezeChannel(channelUrl, apiToken, gcFreezeChannelData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcFreezeChannel");
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
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcFreezeChannelData** | [**GcFreezeChannelData**](GcFreezeChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcHideOrArchiveChannel"></a>
# **gcHideOrArchiveChannel**
> gcHideOrArchiveChannel(channelUrl, apiToken, gcHideOrArchiveChannelData)

Hide or archive a channel

## Hide or archive a channel  Hides or archives a channel from the channel list of either a specific user or entire channel members. Normally, a hidden channel comes back and shows up in the channel list when a member in the channel sends a new message. This automatically-triggered behavior is intended for users who want to temporarily remove a channel from their list because [leaving the channel](#2-leave-the-channel) would delete all the past messages and stored data.  You can also leave out a channel from the list and archive the channel. The channel doesn&#39;t appear even when receiving a new message from other member.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-hide-or-archive-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      apiInstance.gcHideOrArchiveChannel(channelUrl, apiToken, gcHideOrArchiveChannelData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcHideOrArchiveChannelData** | [**GcHideOrArchiveChannelData**](GcHideOrArchiveChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcInviteAsMembers"></a>
# **gcInviteAsMembers**
> SendBirdGroupChannel gcInviteAsMembers(channelUrl, apiToken, gcInviteAsMembersData)

Invite as members

## Invite as members  Invites one or more users as members into the group channel.  &gt; __Note__: By default, users in your application automatically join a [private](#4-private-vs-public) group channel promptly from an invitation without having to accept it. If you want to give them the option to decide whether to accept or decline an invitation, you should set the value of channel invitation preference to false through the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action. Or using the [update a user&#39;s channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can also allow the option individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      SendBirdGroupChannel result = apiInstance.gcInviteAsMembers(channelUrl, apiToken, gcInviteAsMembersData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcInviteAsMembersData** | [**GcInviteAsMembersData**](GcInviteAsMembersData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcJoinChannel"></a>
# **gcJoinChannel**
> gcJoinChannel(channelUrl, apiToken, gcJoinChannelData)

Join a channel

## Join a channel  Allows a user to join a [public](#4-private-vs-public) group channel. Since a user is allowed to join up to 2,000 group channels, a user who already belongs to a maximum number of group channels can&#39;t join a new channel.  &gt; __Note__: This action is only permitted for public group channels where the &#x60;is_public&#x60; property is true.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-join-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      apiInstance.gcJoinChannel(channelUrl, apiToken, gcJoinChannelData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcJoinChannelData** | [**GcJoinChannelData**](GcJoinChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcLeaveChannel"></a>
# **gcLeaveChannel**
> gcLeaveChannel(channelUrl, apiToken, gcLeaveChannelData)

Leave a channel

## Leave a channel  Makes one or more members leave a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-leave-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      apiInstance.gcLeaveChannel(channelUrl, apiToken, gcLeaveChannelData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcLeaveChannelData** | [**GcLeaveChannelData**](GcLeaveChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcListBannedUsers"></a>
# **gcListBannedUsers**
> InlineResponse20033 gcListBannedUsers(channelUrl, apiToken, token, limit)

List banned users

## List banned users  Retrieves a list of the banned users from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      InlineResponse20033 result = apiInstance.gcListBannedUsers(channelUrl, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcListBannedUsers");
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
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcListChannels"></a>
# **gcListChannels**
> InlineResponse20017 gcListChannels(apiToken, token, limit, distinctMode, publicMode, superMode, createdAfter, createdBefore, showEmpty, showMember, showDeliveryReceipt, showReadReceipt, showMetadata, showFrozen, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, includeSortedMetaarrayInLastMessage, customType, readReceipt, member, isDistinct, membersIn, userId)

List channels

## List channels  Retrieves a list of group channels in the application.  &gt; __Note__: If you want to get a list of a specific user&#39;s group channels, use the [list my group channels](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels) action instead.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-channels ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      InlineResponse20017 result = apiInstance.gcListChannels(apiToken, token, limit, distinctMode, publicMode, superMode, createdAfter, createdBefore, showEmpty, showMember, showDeliveryReceipt, showReadReceipt, showMetadata, showFrozen, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, includeSortedMetaarrayInLastMessage, customType, readReceipt, member, isDistinct, membersIn, userId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **distinctMode** | **String**|  | [optional]
 **publicMode** | **String**|  | [optional]
 **superMode** | **String**|  | [optional]
 **createdAfter** | **Integer**|  | [optional]
 **createdBefore** | **Integer**|  | [optional]
 **showEmpty** | **Boolean**|  | [optional]
 **showMember** | **Boolean**|  | [optional]
 **showDeliveryReceipt** | **Boolean**|  | [optional]
 **showReadReceipt** | **Boolean**|  | [optional]
 **showMetadata** | **Boolean**|  | [optional]
 **showFrozen** | **Boolean**|  | [optional]
 **order** | **String**|  | [optional]
 **metadataOrderKey** | **String**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **customTypeStartswith** | **String**|  | [optional]
 **channelUrls** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **nameContains** | **String**|  | [optional]
 **nameStartswith** | **String**|  | [optional]
 **membersExactlyIn** | **String**|  | [optional]
 **membersIncludeIn** | **String**|  | [optional]
 **queryType** | **String**|  | [optional]
 **membersNickname** | **String**|  | [optional]
 **membersNicknameContains** | **String**|  | [optional]
 **metadataKey** | **String**|  | [optional]
 **metadataValues** | **String**|  | [optional]
 **metadataValueStartswith** | **String**|  | [optional]
 **metacounterKey** | **String**|  | [optional]
 **metacounterValues** | **String**|  | [optional]
 **metacounterValueGt** | **String**|  | [optional]
 **metacounterValueGte** | **String**|  | [optional]
 **metacounterValueLt** | **String**|  | [optional]
 **metacounterValueLte** | **String**|  | [optional]
 **includeSortedMetaarrayInLastMessage** | **Boolean**|  | [optional]
 **customType** | **String**|  | [optional]
 **readReceipt** | **Boolean**|  | [optional]
 **member** | **Boolean**|  | [optional]
 **isDistinct** | **Boolean**|  | [optional]
 **membersIn** | **String**|  | [optional]
 **userId** | **String**|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcListMembers"></a>
# **gcListMembers**
> InlineResponse20036 gcListMembers(channelUrl, apiToken, token, limit, showDeliveryReceipt, showReadReceipt, order, operatorFilter, memberStateFilter, mutedMemberFilter, nicknameStartswith)

List members

## List members  Retrieves a list of members of a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-members ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of members of.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      InlineResponse20036 result = apiInstance.gcListMembers(channelUrl, apiToken, token, limit, showDeliveryReceipt, showReadReceipt, order, operatorFilter, memberStateFilter, mutedMemberFilter, nicknameStartswith);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **showDeliveryReceipt** | **Boolean**|  | [optional]
 **showReadReceipt** | **Boolean**|  | [optional]
 **order** | **String**|  | [optional]
 **operatorFilter** | **String**|  | [optional]
 **memberStateFilter** | **String**|  | [optional]
 **mutedMemberFilter** | **String**|  | [optional]
 **nicknameStartswith** | **String**|  | [optional]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcListMutedUsers"></a>
# **gcListMutedUsers**
> InlineResponse20031 gcListMutedUsers(channelUrl, apiToken, token, limit)

List muted users

## List muted users  Retrieves a list of the muted users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      InlineResponse20031 result = apiInstance.gcListMutedUsers(channelUrl, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcListMutedUsers");
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
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcListOperators"></a>
# **gcListOperators**
> InlineResponse20034 gcListOperators(channelUrl, apiToken, token, limit)

List operators

## List operators  Retrieves a list of operators of a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of operators.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      InlineResponse20034 result = apiInstance.gcListOperators(channelUrl, apiToken, token, limit);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcMuteUser"></a>
# **gcMuteUser**
> SendBirdGroupChannel gcMuteUser(channelUrl, apiToken, gcMuteUserData)

Mute a user

## Mute a user  Mutes a user in a group channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-mute-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    GcMuteUserData gcMuteUserData = new GcMuteUserData(); // GcMuteUserData | 
    try {
      SendBirdGroupChannel result = apiInstance.gcMuteUser(channelUrl, apiToken, gcMuteUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcMuteUser");
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
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcMuteUserData** | [**GcMuteUserData**](GcMuteUserData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcRegisterOperators"></a>
# **gcRegisterOperators**
> InlineResponse20038 gcRegisterOperators(channelUrl, apiToken, gcRegisterOperatorsData)

Register operators

## Register operators  Registers one or more operators to a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-register-operators ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      InlineResponse20038 result = apiInstance.gcRegisterOperators(channelUrl, apiToken, gcRegisterOperatorsData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcRegisterOperatorsData** | [**GcRegisterOperatorsData**](GcRegisterOperatorsData.md)|  | [optional]

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcResetChatHistory"></a>
# **gcResetChatHistory**
> gcResetChatHistory(channelUrl, apiToken, gcResetChatHistoryData)

Reset chat history

## Reset chat history  Resets the properties related to a user&#39;s chat history in a group channel, then clears the existing messages in the channel on the user&#39;s side only. A user can no longer see the messages in a group channel once this action is called, but those messages are not deleted from the database of the Sendbird system. All other members in the channel can retrieve and see the messages.  This action simply clears the messages for the user by updating the &#x60;last_message&#x60; and &#x60;read_receipt&#x60; properties of the [channel](#2-types-of-a-channel-3-resource-representation) resource in addition to other internally managed data such as the number of the user&#39;s unread message.  Using the &#x60;reset_all&#x60; property, you can also reset the properties related to all users&#39; chat history in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-reset-chat-history ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      apiInstance.gcResetChatHistory(channelUrl, apiToken, gcResetChatHistoryData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcResetChatHistoryData** | [**GcResetChatHistoryData**](GcResetChatHistoryData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcUnbanUserById"></a>
# **gcUnbanUserById**
> gcUnbanUserById(channelUrl, bannedUserId, apiToken)

Unban a user

## Unban a user  Unbans a user from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.gcUnbanUserById(channelUrl, bannedUserId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcUnbanUserById");
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
 **channelUrl** | **String**|  |
 **bannedUserId** | **String**|  |
 **apiToken** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcUnhideOrUnarchiveChannel"></a>
# **gcUnhideOrUnarchiveChannel**
> gcUnhideOrUnarchiveChannel(channelUrl, userId, apiToken, shouldUnhideAll)

Unhide or unarchive a channel

## Unhide or unarchive a channel  Makes a hidden or archived channel reappear in the channel list of either a specific user or entire channel members.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unhide-or-unarchive-a-channel ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to unhide or unarchive.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      apiInstance.gcUnhideOrUnarchiveChannel(channelUrl, userId, apiToken, shouldUnhideAll);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **userId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **shouldUnhideAll** | **Boolean**|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcUnmuteUserById"></a>
# **gcUnmuteUserById**
> gcUnmuteUserById(channelUrl, mutedUserId, apiToken)

Unmute a user

## Unmute a user  Unmutes a user within a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unmute-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.gcUnmuteUserById(channelUrl, mutedUserId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcUnmuteUserById");
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
 **channelUrl** | **String**|  |
 **mutedUserId** | **String**|  |
 **apiToken** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcUpdateBanById"></a>
# **gcUpdateBanById**
> SendBirdUser gcUpdateBanById(channelUrl, bannedUserId, apiToken, gcUpdateBanByIdData)

Update a ban

## Update a ban  Updates details of a ban imposed on a user. You can change the length of the ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    GcUpdateBanByIdData gcUpdateBanByIdData = new GcUpdateBanByIdData(); // GcUpdateBanByIdData | 
    try {
      SendBirdUser result = apiInstance.gcUpdateBanById(channelUrl, bannedUserId, apiToken, gcUpdateBanByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcUpdateBanById");
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
 **channelUrl** | **String**|  |
 **bannedUserId** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcUpdateBanByIdData** | [**GcUpdateBanByIdData**](GcUpdateBanByIdData.md)|  | [optional]

### Return type

[**SendBirdUser**](SendBirdUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcUpdateChannelByUrl"></a>
# **gcUpdateChannelByUrl**
> SendBirdGroupChannel gcUpdateChannelByUrl(channelUrl, apiToken, gcUpdateChannelByUrlData)

Update a channel

## Update a channel  Updates information on a group channel.  &gt; __Note__: You can&#39;t change the members of the channel here. To do so, see [invite as members](#2-invite-as-members) action below.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      SendBirdGroupChannel result = apiInstance.gcUpdateChannelByUrl(channelUrl, apiToken, gcUpdateChannelByUrlData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **gcUpdateChannelByUrlData** | [**GcUpdateChannelByUrlData**](GcUpdateChannelByUrlData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcViewBanById"></a>
# **gcViewBanById**
> SendBirdUser gcViewBanById(channelUrl, bannedUserId, apiToken)

View a ban

## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      SendBirdUser result = apiInstance.gcViewBanById(channelUrl, bannedUserId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcViewBanById");
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
 **channelUrl** | **String**|  |
 **bannedUserId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**SendBirdUser**](SendBirdUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="gcViewChannelByUrl"></a>
# **gcViewChannelByUrl**
> SendBirdGroupChannel gcViewChannelByUrl(channelUrl, apiToken, showDeliveryReceipt, showReadReceipt, showMember, readReceipt, member)

View a channel

## View a channel  Retrieves information on a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-channel ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
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
      SendBirdGroupChannel result = apiInstance.gcViewChannelByUrl(channelUrl, apiToken, showDeliveryReceipt, showReadReceipt, showMember, readReceipt, member);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelUrl** | **String**|  |
 **apiToken** | **String**|  | [optional]
 **showDeliveryReceipt** | **Boolean**|  | [optional]
 **showReadReceipt** | **Boolean**|  | [optional]
 **showMember** | **Boolean**|  | [optional]
 **readReceipt** | **Boolean**|  | [optional]
 **member** | **Boolean**|  | [optional]

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
**200** | Successful response |  -  |

<a name="gcViewMuteById"></a>
# **gcViewMuteById**
> InlineResponse20035 gcViewMuteById(channelUrl, mutedUserId, apiToken)

View a mute

## View a mute  Checks if a user is muted in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-mute ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.GroupChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    GroupChannelApi apiInstance = new GroupChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20035 result = apiInstance.gcViewMuteById(channelUrl, mutedUserId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupChannelApi#gcViewMuteById");
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
 **channelUrl** | **String**|  |
 **mutedUserId** | **String**|  |
 **apiToken** | **String**|  | [optional]

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

