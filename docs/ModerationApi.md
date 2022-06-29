# ModerationApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**banFromChannelsWithCustomChannelTypes**](ModerationApi.md#banFromChannelsWithCustomChannelTypes) | **POST** /v3/users/{user_id}/banned_channel_custom_types | Ban from channels with custom channel types |
| [**blockUser**](ModerationApi.md#blockUser) | **POST** /v3/users/{user_id}/block | Block a user |
| [**gcBanUser**](ModerationApi.md#gcBanUser) | **POST** /v3/group_channels/{channel_url}/ban | Ban a user |
| [**gcFreezeChannel**](ModerationApi.md#gcFreezeChannel) | **PUT** /v3/group_channels/{channel_url}/freeze | Freeze a channel |
| [**gcListBannedUsers**](ModerationApi.md#gcListBannedUsers) | **GET** /v3/group_channels/{channel_url}/ban | List banned users |
| [**gcListMutedUsers**](ModerationApi.md#gcListMutedUsers) | **GET** /v3/group_channels/{channel_url}/mute | List muted users |
| [**gcMuteUser**](ModerationApi.md#gcMuteUser) | **POST** /v3/group_channels/{channel_url}/mute | Mute a user |
| [**gcUnbanUserById**](ModerationApi.md#gcUnbanUserById) | **DELETE** /v3/group_channels/{channel_url}/ban/{banned_user_id} | Unban a user |
| [**gcUnmuteUserById**](ModerationApi.md#gcUnmuteUserById) | **DELETE** /v3/group_channels/{channel_url}/mute/{muted_user_id} | Unmute a user |
| [**gcUpdateBanById**](ModerationApi.md#gcUpdateBanById) | **PUT** /v3/group_channels/{channel_url}/ban/{banned_user_id} | Update a ban |
| [**gcViewBanById**](ModerationApi.md#gcViewBanById) | **GET** /v3/group_channels/{channel_url}/ban/{banned_user_id} | View a ban |
| [**gcViewMuteById**](ModerationApi.md#gcViewMuteById) | **GET** /v3/group_channels/{channel_url}/mute/{muted_user_id} | View a mute |
| [**listBannedChannels**](ModerationApi.md#listBannedChannels) | **GET** /v3/users/{user_id}/ban | List banned channels |
| [**listBlockedUsers**](ModerationApi.md#listBlockedUsers) | **GET** /v3/users/{user_id}/block | List blocked users |
| [**listMutedChannels**](ModerationApi.md#listMutedChannels) | **GET** /v3/users/{user_id}/mute | List muted channels |
| [**muteInChannelsWithCustomChannelTypes**](ModerationApi.md#muteInChannelsWithCustomChannelTypes) | **POST** /v3/users/{user_id}/muted_channel_custom_types | Mute in channels with custom channel types |
| [**ocBanUser**](ModerationApi.md#ocBanUser) | **POST** /v3/open_channels/{channel_url}/ban | Ban a user |
| [**ocFreezeChannel**](ModerationApi.md#ocFreezeChannel) | **PUT** /v3/open_channels/{channel_url}/freeze | Freeze a channel |
| [**ocListBannedUsers**](ModerationApi.md#ocListBannedUsers) | **GET** /v3/open_channels/{channel_url}/ban | List banned users |
| [**ocListMutedUsers**](ModerationApi.md#ocListMutedUsers) | **GET** /v3/open_channels/{channel_url}/mute | List muted users |
| [**ocMuteUser**](ModerationApi.md#ocMuteUser) | **POST** /v3/open_channels/{channel_url}/mute | Mute a user |
| [**ocUnbanUserById**](ModerationApi.md#ocUnbanUserById) | **DELETE** /v3/open_channels/{channel_url}/ban/{banned_user_id} | Unban a user |
| [**ocUnmuteUserById**](ModerationApi.md#ocUnmuteUserById) | **DELETE** /v3/open_channels/{channel_url}/mute/{muted_user_id} | Unmute a user |
| [**ocUpdateBanById**](ModerationApi.md#ocUpdateBanById) | **PUT** /v3/open_channels/{channel_url}/ban/{banned_user_id} | Update a ban |
| [**ocViewBanById**](ModerationApi.md#ocViewBanById) | **GET** /v3/open_channels/{channel_url}/ban/{banned_user_id} | View a ban |
| [**ocViewMuteById**](ModerationApi.md#ocViewMuteById) | **GET** /v3/open_channels/{channel_url}/mute/{muted_user_id} | View a mute |
| [**unblockUserById**](ModerationApi.md#unblockUserById) | **DELETE** /v3/users/{user_id}/block/{target_id} | Unblock a user |


<a name="banFromChannelsWithCustomChannelTypes"></a>
# **banFromChannelsWithCustomChannelTypes**
> Object banFromChannelsWithCustomChannelTypes(apiToken, userId, banFromChannelsWithCustomChannelTypesData)

Ban from channels with custom channel types

## Ban from channels with custom channel types  Bans a user from channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-ban-from-channels-with-custom-channel-types ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData = new BanFromChannelsWithCustomChannelTypesData(); // BanFromChannelsWithCustomChannelTypesData | 
    try {
      Object result = apiInstance.banFromChannelsWithCustomChannelTypes(apiToken, userId, banFromChannelsWithCustomChannelTypesData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#banFromChannelsWithCustomChannelTypes");
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
| **userId** | **String**|  | |
| **banFromChannelsWithCustomChannelTypesData** | [**BanFromChannelsWithCustomChannelTypesData**](BanFromChannelsWithCustomChannelTypesData.md)|  | [optional] |

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

<a name="blockUser"></a>
# **blockUser**
> BlockUserResponse blockUser(apiToken, userId, blockUserData)

Block a user

## Block a user  Allows a user to block another user. A user doesn&#39;t receive messages from someone they have blocked anymore. Also, blocking someone doesn&#39;t alert them that they have been blocked. Blocked users still can send messages as normal in the channel: however, they can&#39;t receive any messages from the users who have blocked them.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-block-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    BlockUserData blockUserData = new BlockUserData(); // BlockUserData | 
    try {
      BlockUserResponse result = apiInstance.blockUser(apiToken, userId, blockUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#blockUser");
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
| **userId** | **String**|  | |
| **blockUserData** | [**BlockUserData**](BlockUserData.md)|  | [optional] |

### Return type

[**BlockUserResponse**](BlockUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="gcBanUser"></a>
# **gcBanUser**
> GcBanUserResponse gcBanUser(apiToken, channelUrl, gcBanUserData)

Ban a user

## Ban a user  Bans a user from a group channel. A banned user is immediately expelled from a channel and allowed to join the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-ban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    GcBanUserData gcBanUserData = new GcBanUserData(); // GcBanUserData | 
    try {
      GcBanUserResponse result = apiInstance.gcBanUser(apiToken, channelUrl, gcBanUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcBanUser");
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
| **channelUrl** | **String**|  | |
| **gcBanUserData** | [**GcBanUserData**](GcBanUserData.md)|  | [optional] |

### Return type

[**GcBanUserResponse**](GcBanUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="gcFreezeChannel"></a>
# **gcFreezeChannel**
> SendBirdGroupChannel gcFreezeChannel(apiToken, channelUrl, gcFreezeChannelData)

Freeze a channel

## Freeze a channel  Freezes or unfreezes a group channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-freeze-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    GcFreezeChannelData gcFreezeChannelData = new GcFreezeChannelData(); // GcFreezeChannelData | 
    try {
      SendBirdGroupChannel result = apiInstance.gcFreezeChannel(apiToken, channelUrl, gcFreezeChannelData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcFreezeChannel");
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
| **channelUrl** | **String**|  | |
| **gcFreezeChannelData** | [**GcFreezeChannelData**](GcFreezeChannelData.md)|  | [optional] |

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

<a name="gcListBannedUsers"></a>
# **gcListBannedUsers**
> GcListBannedUsersResponse gcListBannedUsers(apiToken, channelUrl, token, limit)

List banned users

## List banned users  Retrieves a list of the banned users from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      GcListBannedUsersResponse result = apiInstance.gcListBannedUsers(apiToken, channelUrl, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcListBannedUsers");
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
| **channelUrl** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**GcListBannedUsersResponse**](GcListBannedUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="gcListMutedUsers"></a>
# **gcListMutedUsers**
> GcListMutedUsersResponse gcListMutedUsers(apiToken, channelUrl, token, limit)

List muted users

## List muted users  Retrieves a list of the muted users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      GcListMutedUsersResponse result = apiInstance.gcListMutedUsers(apiToken, channelUrl, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcListMutedUsers");
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
| **channelUrl** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**GcListMutedUsersResponse**](GcListMutedUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="gcMuteUser"></a>
# **gcMuteUser**
> SendBirdGroupChannel gcMuteUser(apiToken, channelUrl, gcMuteUserData)

Mute a user

## Mute a user  Mutes a user in a group channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-mute-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    GcMuteUserData gcMuteUserData = new GcMuteUserData(); // GcMuteUserData | 
    try {
      SendBirdGroupChannel result = apiInstance.gcMuteUser(apiToken, channelUrl, gcMuteUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcMuteUser");
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
| **channelUrl** | **String**|  | |
| **gcMuteUserData** | [**GcMuteUserData**](GcMuteUserData.md)|  | [optional] |

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

<a name="gcUnbanUserById"></a>
# **gcUnbanUserById**
> OcDeleteChannelByUrl200Response gcUnbanUserById(apiToken, channelUrl, bannedUserId)

Unban a user

## Unban a user  Unbans a user from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    try {
      OcDeleteChannelByUrl200Response result = apiInstance.gcUnbanUserById(apiToken, channelUrl, bannedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcUnbanUserById");
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |

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

<a name="gcUnmuteUserById"></a>
# **gcUnmuteUserById**
> OcDeleteChannelByUrl200Response gcUnmuteUserById(apiToken, channelUrl, mutedUserId)

Unmute a user

## Unmute a user  Unmutes a user within a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unmute-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    try {
      OcDeleteChannelByUrl200Response result = apiInstance.gcUnmuteUserById(apiToken, channelUrl, mutedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcUnmuteUserById");
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |

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

<a name="gcUpdateBanById"></a>
# **gcUpdateBanById**
> GcUpdateBanByIdResponse gcUpdateBanById(apiToken, channelUrl, bannedUserId, gcUpdateBanByIdData)

Update a ban

## Update a ban  Updates details of a ban imposed on a user. You can change the length of the ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    GcUpdateBanByIdData gcUpdateBanByIdData = new GcUpdateBanByIdData(); // GcUpdateBanByIdData | 
    try {
      GcUpdateBanByIdResponse result = apiInstance.gcUpdateBanById(apiToken, channelUrl, bannedUserId, gcUpdateBanByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcUpdateBanById");
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
| **gcUpdateBanByIdData** | [**GcUpdateBanByIdData**](GcUpdateBanByIdData.md)|  | [optional] |

### Return type

[**GcUpdateBanByIdResponse**](GcUpdateBanByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="gcViewBanById"></a>
# **gcViewBanById**
> GcViewBanByIdResponse gcViewBanById(apiToken, channelUrl, bannedUserId)

View a ban

## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    try {
      GcViewBanByIdResponse result = apiInstance.gcViewBanById(apiToken, channelUrl, bannedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcViewBanById");
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |

### Return type

[**GcViewBanByIdResponse**](GcViewBanByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="gcViewMuteById"></a>
# **gcViewMuteById**
> GcViewMuteByIdResponse gcViewMuteById(apiToken, channelUrl, mutedUserId)

View a mute

## View a mute  Checks if a user is muted in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-mute ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    try {
      GcViewMuteByIdResponse result = apiInstance.gcViewMuteById(apiToken, channelUrl, mutedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#gcViewMuteById");
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |

### Return type

[**GcViewMuteByIdResponse**](GcViewMuteByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="listBannedChannels"></a>
# **listBannedChannels**
> ListBannedChannelsResponse listBannedChannels(apiToken, userId, token, limit)

List banned channels

## List banned channels  Retrieves a list of open and group channels with additional information where a user is banned.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-banned-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListBannedChannelsResponse result = apiInstance.listBannedChannels(apiToken, userId, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#listBannedChannels");
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
| **userId** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListBannedChannelsResponse**](ListBannedChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="listBlockedUsers"></a>
# **listBlockedUsers**
> ListBlockedUsersResponse listBlockedUsers(apiToken, userId, token, limit, userIds, metadatakey, metadatavaluesIn)

List blocked users

## List blocked users  Retrieves a list of other users that a user has blocked.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-blocked-users ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String userIds = "userIds_example"; // String | 
    String metadatakey = "metadatakey_example"; // String | 
    String metadatavaluesIn = "metadatavaluesIn_example"; // String | 
    try {
      ListBlockedUsersResponse result = apiInstance.listBlockedUsers(apiToken, userId, token, limit, userIds, metadatakey, metadatavaluesIn);
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
| **apiToken** | **String**|  | |
| **userId** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **userIds** | **String**|  | [optional] |
| **metadatakey** | **String**|  | [optional] |
| **metadatavaluesIn** | **String**|  | [optional] |

### Return type

[**ListBlockedUsersResponse**](ListBlockedUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="listMutedChannels"></a>
# **listMutedChannels**
> ListMutedChannelsResponse listMutedChannels(apiToken, userId, token, limit)

List muted channels

## List muted channels  Retrieves a list of open and group channels with additional information where a user is muted.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-muted-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListMutedChannelsResponse result = apiInstance.listMutedChannels(apiToken, userId, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#listMutedChannels");
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
| **userId** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListMutedChannelsResponse**](ListMutedChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="muteInChannelsWithCustomChannelTypes"></a>
# **muteInChannelsWithCustomChannelTypes**
> Object muteInChannelsWithCustomChannelTypes(apiToken, userId, muteInChannelsWithCustomChannelTypesData)

Mute in channels with custom channel types

## Mute in channels with custom channel types  Mutes a user in channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mute-in-channels-with-custom-channel-types ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData = new MuteInChannelsWithCustomChannelTypesData(); // MuteInChannelsWithCustomChannelTypesData | 
    try {
      Object result = apiInstance.muteInChannelsWithCustomChannelTypes(apiToken, userId, muteInChannelsWithCustomChannelTypesData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#muteInChannelsWithCustomChannelTypes");
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
| **userId** | **String**|  | |
| **muteInChannelsWithCustomChannelTypesData** | [**MuteInChannelsWithCustomChannelTypesData**](MuteInChannelsWithCustomChannelTypesData.md)|  | [optional] |

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

<a name="ocBanUser"></a>
# **ocBanUser**
> OcBanUserResponse ocBanUser(apiToken, channelUrl, ocBanUserData)

Ban a user

## Ban a user  Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    OcBanUserData ocBanUserData = new OcBanUserData(); // OcBanUserData | 
    try {
      OcBanUserResponse result = apiInstance.ocBanUser(apiToken, channelUrl, ocBanUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocBanUser");
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
| **channelUrl** | **String**|  | |
| **ocBanUserData** | [**OcBanUserData**](OcBanUserData.md)|  | [optional] |

### Return type

[**OcBanUserResponse**](OcBanUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ocFreezeChannel"></a>
# **ocFreezeChannel**
> SendBirdOpenChannel ocFreezeChannel(apiToken, channelUrl, ocFreezeChannelData)

Freeze a channel

## Freeze a channel  Freezes or unfreezes an open channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    OcFreezeChannelData ocFreezeChannelData = new OcFreezeChannelData(); // OcFreezeChannelData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocFreezeChannel(apiToken, channelUrl, ocFreezeChannelData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocFreezeChannel");
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
| **channelUrl** | **String**|  | |
| **ocFreezeChannelData** | [**OcFreezeChannelData**](OcFreezeChannelData.md)|  | [optional] |

### Return type

[**SendBirdOpenChannel**](SendBirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ocListBannedUsers"></a>
# **ocListBannedUsers**
> OcListBannedUsersResponse ocListBannedUsers(apiToken, channelUrl, token, limit)

List banned users

## List banned users  Retrieves a list of banned users from a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      OcListBannedUsersResponse result = apiInstance.ocListBannedUsers(apiToken, channelUrl, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocListBannedUsers");
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
| **channelUrl** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**OcListBannedUsersResponse**](OcListBannedUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ocListMutedUsers"></a>
# **ocListMutedUsers**
> OcListMutedUsersResponse ocListMutedUsers(apiToken, channelUrl, token, limit)

List muted users

## List muted users  Retrieves a list of muted users in the channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      OcListMutedUsersResponse result = apiInstance.ocListMutedUsers(apiToken, channelUrl, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocListMutedUsers");
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
| **channelUrl** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**OcListMutedUsersResponse**](OcListMutedUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ocMuteUser"></a>
# **ocMuteUser**
> SendBirdOpenChannel ocMuteUser(apiToken, channelUrl, ocMuteUserData)

Mute a user

## Mute a user  Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    OcMuteUserData ocMuteUserData = new OcMuteUserData(); // OcMuteUserData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocMuteUser(apiToken, channelUrl, ocMuteUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocMuteUser");
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
| **channelUrl** | **String**|  | |
| **ocMuteUserData** | [**OcMuteUserData**](OcMuteUserData.md)|  | [optional] |

### Return type

[**SendBirdOpenChannel**](SendBirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ocUnbanUserById"></a>
# **ocUnbanUserById**
> OcDeleteChannelByUrl200Response ocUnbanUserById(apiToken, channelUrl, bannedUserId)

Unban a user

## Unban a user  Unbans a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    try {
      OcDeleteChannelByUrl200Response result = apiInstance.ocUnbanUserById(apiToken, channelUrl, bannedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocUnbanUserById");
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |

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

<a name="ocUnmuteUserById"></a>
# **ocUnmuteUserById**
> OcDeleteChannelByUrl200Response ocUnmuteUserById(apiToken, channelUrl, mutedUserId)

Unmute a user

## Unmute a user  Unmutes a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    try {
      OcDeleteChannelByUrl200Response result = apiInstance.ocUnmuteUserById(apiToken, channelUrl, mutedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocUnmuteUserById");
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |

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

<a name="ocUpdateBanById"></a>
# **ocUpdateBanById**
> OcUpdateBanByIdResponse ocUpdateBanById(apiToken, channelUrl, bannedUserId, ocUpdateBanByIdData)

Update a ban

## Update a ban  Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    OcUpdateBanByIdData ocUpdateBanByIdData = new OcUpdateBanByIdData(); // OcUpdateBanByIdData | 
    try {
      OcUpdateBanByIdResponse result = apiInstance.ocUpdateBanById(apiToken, channelUrl, bannedUserId, ocUpdateBanByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocUpdateBanById");
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
| **ocUpdateBanByIdData** | [**OcUpdateBanByIdData**](OcUpdateBanByIdData.md)|  | [optional] |

### Return type

[**OcUpdateBanByIdResponse**](OcUpdateBanByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ocViewBanById"></a>
# **ocViewBanById**
> OcViewBanByIdResponse ocViewBanById(apiToken, channelUrl, bannedUserId)

View a ban

## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    try {
      OcViewBanByIdResponse result = apiInstance.ocViewBanById(apiToken, channelUrl, bannedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocViewBanById");
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |

### Return type

[**OcViewBanByIdResponse**](OcViewBanByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="ocViewMuteById"></a>
# **ocViewMuteById**
> OcViewMuteByIdResponse ocViewMuteById(apiToken, channelUrl, mutedUserId)

View a mute

## View a mute  Checks if a user is muted in an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    try {
      OcViewMuteByIdResponse result = apiInstance.ocViewMuteById(apiToken, channelUrl, mutedUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#ocViewMuteById");
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |

### Return type

[**OcViewMuteByIdResponse**](OcViewMuteByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a name="unblockUserById"></a>
# **unblockUserById**
> Object unblockUserById(apiToken, userId, targetId)

Unblock a user

## Unblock a user  Unblocks the user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-unblock-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.ModerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    ModerationApi apiInstance = new ModerationApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String targetId = "targetId_example"; // String | 
    try {
      Object result = apiInstance.unblockUserById(apiToken, userId, targetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModerationApi#unblockUserById");
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
| **userId** | **String**|  | |
| **targetId** | **String**|  | |

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

