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



## banFromChannelsWithCustomChannelTypes

> Object banFromChannelsWithCustomChannelTypes(userId).apiToken(apiToken).banFromChannelsWithCustomChannelTypesData(banFromChannelsWithCustomChannelTypesData).execute();

Ban from channels with custom channel types

## Ban from channels with custom channel types

Bans a user from channels with particular custom channel types.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-ban-from-channels-with-custom-channel-types
----------------------------

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
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData = new BanFromChannelsWithCustomChannelTypesData(); // BanFromChannelsWithCustomChannelTypesData | 
        try {
            Object result = api.banFromChannelsWithCustomChannelTypes(userId)
                .apiToken(apiToken)
                .banFromChannelsWithCustomChannelTypesData(banFromChannelsWithCustomChannelTypesData)
                .execute();
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## blockUser

> BlockUserResponse blockUser(userId).apiToken(apiToken).blockUserData(blockUserData).execute();

Block a user

## Block a user

Allows a user to block another user. A user doesn't receive messages from someone they have blocked anymore. Also, blocking someone doesn't alert them that they have been blocked. Blocked users still can send messages as normal in the channel: however, they can't receive any messages from the users who have blocked them.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-block-a-user
----------------------------

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
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        BlockUserData blockUserData = new BlockUserData(); // BlockUserData | 
        try {
            BlockUserResponse result = api.blockUser(userId)
                .apiToken(apiToken)
                .blockUserData(blockUserData)
                .execute();
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## gcBanUser

> GcBanUserResponse gcBanUser(channelUrl).apiToken(apiToken).gcBanUserData(gcBanUserData).execute();

Ban a user

## Ban a user

Bans a user from a group channel. A banned user is immediately expelled from a channel and allowed to join the channel again after a set time period.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-ban-a-user
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        GcBanUserData gcBanUserData = new GcBanUserData(); // GcBanUserData | 
        try {
            GcBanUserResponse result = api.gcBanUser(channelUrl)
                .apiToken(apiToken)
                .gcBanUserData(gcBanUserData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## gcFreezeChannel

> SendBirdGroupChannel gcFreezeChannel(channelUrl).apiToken(apiToken).gcFreezeChannelData(gcFreezeChannelData).execute();

Freeze a channel

## Freeze a channel

Freezes or unfreezes a group channel.

> __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-freeze-a-channel
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        GcFreezeChannelData gcFreezeChannelData = new GcFreezeChannelData(); // GcFreezeChannelData | 
        try {
            SendBirdGroupChannel result = api.gcFreezeChannel(channelUrl)
                .apiToken(apiToken)
                .gcFreezeChannelData(gcFreezeChannelData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## gcListBannedUsers

> GcListBannedUsersResponse gcListBannedUsers(channelUrl).apiToken(apiToken).token(token).limit(limit).execute();

List banned users

## List banned users

Retrieves a list of the banned users from a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-banned-users
----------------------------

 `channel_url`
     Type: string
     Description: Specifies the URL of the channel where to retrieve a list of banned users.

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            GcListBannedUsersResponse result = api.gcListBannedUsers(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## gcListMutedUsers

> GcListMutedUsersResponse gcListMutedUsers(channelUrl).apiToken(apiToken).token(token).limit(limit).execute();

List muted users

## List muted users

Retrieves a list of the muted users in a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-muted-users
----------------------------

 `channel_url`
     Type: string
     Description: Specifies the URL of the channel to retrieve a list of muted users.

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            GcListMutedUsersResponse result = api.gcListMutedUsers(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## gcMuteUser

> SendBirdGroupChannel gcMuteUser(channelUrl).apiToken(apiToken).gcMuteUserData(gcMuteUserData).execute();

Mute a user

## Mute a user

Mutes a user in a group channel. A muted user remains in the channel and is allowed to view the messages, but can't send any messages until unmuted.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-mute-a-user
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        GcMuteUserData gcMuteUserData = new GcMuteUserData(); // GcMuteUserData | 
        try {
            SendBirdGroupChannel result = api.gcMuteUser(channelUrl)
                .apiToken(apiToken)
                .gcMuteUserData(gcMuteUserData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## gcUnbanUserById

> OcDeleteChannelByUrl200Response gcUnbanUserById(channelUrl, bannedUserId).apiToken(apiToken).execute();

Unban a user

## Unban a user

Unbans a user from a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unban-a-user
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String bannedUserId = "bannedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcUnbanUserById(channelUrl, bannedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
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


## gcUnmuteUserById

> OcDeleteChannelByUrl200Response gcUnmuteUserById(channelUrl, mutedUserId).apiToken(apiToken).execute();

Unmute a user

## Unmute a user

Unmutes a user within a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unmute-a-user
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String mutedUserId = "mutedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            OcDeleteChannelByUrl200Response result = api.gcUnmuteUserById(channelUrl, mutedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |
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


## gcUpdateBanById

> GcUpdateBanByIdResponse gcUpdateBanById(channelUrl, bannedUserId).apiToken(apiToken).gcUpdateBanByIdData(gcUpdateBanByIdData).execute();

Update a ban

## Update a ban

Updates details of a ban imposed on a user. You can change the length of the ban with this action, and also provide an updated description.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-ban
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String bannedUserId = "bannedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        GcUpdateBanByIdData gcUpdateBanByIdData = new GcUpdateBanByIdData(); // GcUpdateBanByIdData | 
        try {
            GcUpdateBanByIdResponse result = api.gcUpdateBanById(channelUrl, bannedUserId)
                .apiToken(apiToken)
                .gcUpdateBanByIdData(gcUpdateBanByIdData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## gcViewBanById

> GcViewBanByIdResponse gcViewBanById(channelUrl, bannedUserId).apiToken(apiToken).execute();

View a ban

## View a ban

Retrieves details of a ban imposed on a user.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-ban
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String bannedUserId = "bannedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GcViewBanByIdResponse result = api.gcViewBanById(channelUrl, bannedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

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


## gcViewMuteById

> GcViewMuteByIdResponse gcViewMuteById(channelUrl, mutedUserId).apiToken(apiToken).execute();

View a mute

## View a mute

Checks if a user is muted in a group channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-mute
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String mutedUserId = "mutedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            GcViewMuteByIdResponse result = api.gcViewMuteById(channelUrl, mutedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

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


## listBannedChannels

> ListBannedChannelsResponse listBannedChannels(userId).apiToken(apiToken).token(token).limit(limit).execute();

List banned channels

## List banned channels

Retrieves a list of open and group channels with additional information where a user is banned.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-banned-channels
----------------------------

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
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListBannedChannelsResponse result = api.listBannedChannels(userId)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## listBlockedUsers

> ListBlockedUsersResponse listBlockedUsers(userId).apiToken(apiToken).token(token).limit(limit).userIds(userIds).metadatakey(metadatakey).metadatavaluesIn(metadatavaluesIn).execute();

List blocked users

## List blocked users

Retrieves a list of other users that a user has blocked.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-blocked-users
----------------------------

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
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        String userIds = "userIds_example"; // String | 
        String metadatakey = "metadatakey_example"; // String | 
        String metadatavaluesIn = "metadatavaluesIn_example"; // String | 
        try {
            ListBlockedUsersResponse result = api.listBlockedUsers(userId)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .userIds(userIds)
                .metadatakey(metadatakey)
                .metadatavaluesIn(metadatavaluesIn)
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## listMutedChannels

> ListMutedChannelsResponse listMutedChannels(userId).apiToken(apiToken).token(token).limit(limit).execute();

List muted channels

## List muted channels

Retrieves a list of open and group channels with additional information where a user is muted.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-muted-channels
----------------------------

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
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListMutedChannelsResponse result = api.listMutedChannels(userId)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## muteInChannelsWithCustomChannelTypes

> Object muteInChannelsWithCustomChannelTypes(userId).apiToken(apiToken).muteInChannelsWithCustomChannelTypesData(muteInChannelsWithCustomChannelTypesData).execute();

Mute in channels with custom channel types

## Mute in channels with custom channel types

Mutes a user in channels with particular custom channel types.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mute-in-channels-with-custom-channel-types
----------------------------

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
        String userId = "userId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData = new MuteInChannelsWithCustomChannelTypesData(); // MuteInChannelsWithCustomChannelTypesData | 
        try {
            Object result = api.muteInChannelsWithCustomChannelTypes(userId)
                .apiToken(apiToken)
                .muteInChannelsWithCustomChannelTypesData(muteInChannelsWithCustomChannelTypesData)
                .execute();
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
| **userId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## ocBanUser

> OcBanUserResponse ocBanUser(channelUrl).apiToken(apiToken).ocBanUserData(ocBanUserData).execute();

Ban a user

## Ban a user

Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        OcBanUserData ocBanUserData = new OcBanUserData(); // OcBanUserData | 
        try {
            OcBanUserResponse result = api.ocBanUser(channelUrl)
                .apiToken(apiToken)
                .ocBanUserData(ocBanUserData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## ocFreezeChannel

> SendBirdOpenChannel ocFreezeChannel(channelUrl).apiToken(apiToken).ocFreezeChannelData(ocFreezeChannelData).execute();

Freeze a channel

## Freeze a channel

Freezes or unfreezes an open channel.

> __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        OcFreezeChannelData ocFreezeChannelData = new OcFreezeChannelData(); // OcFreezeChannelData | 
        try {
            SendBirdOpenChannel result = api.ocFreezeChannel(channelUrl)
                .apiToken(apiToken)
                .ocFreezeChannelData(ocFreezeChannelData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## ocListBannedUsers

> OcListBannedUsersResponse ocListBannedUsers(channelUrl).apiToken(apiToken).token(token).limit(limit).execute();

List banned users

## List banned users

Retrieves a list of banned users from a specific open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users
----------------------------

 `channel_url`
     Type: string
     Description: Specifies the URL of the channel where to retrieve a list of banned users.

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            OcListBannedUsersResponse result = api.ocListBannedUsers(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## ocListMutedUsers

> OcListMutedUsersResponse ocListMutedUsers(channelUrl).apiToken(apiToken).token(token).limit(limit).execute();

List muted users

## List muted users

Retrieves a list of muted users in the channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users
----------------------------

 `channel_url`
     Type: string
     Description: Specifies the URL of the channel to retrieve a list of muted users.

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            OcListMutedUsersResponse result = api.ocListMutedUsers(channelUrl)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## ocMuteUser

> SendBirdOpenChannel ocMuteUser(channelUrl).apiToken(apiToken).ocMuteUserData(ocMuteUserData).execute();

Mute a user

## Mute a user

Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can't send any messages until unmuted.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user

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
        String channelUrl = "channelUrl_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        OcMuteUserData ocMuteUserData = new OcMuteUserData(); // OcMuteUserData | 
        try {
            SendBirdOpenChannel result = api.ocMuteUser(channelUrl)
                .apiToken(apiToken)
                .ocMuteUserData(ocMuteUserData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## ocUnbanUserById

> OcDeleteChannelByUrl200Response ocUnbanUserById(channelUrl, bannedUserId).apiToken(apiToken).execute();

Unban a user

## Unban a user

Unbans a user from an open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String bannedUserId = "bannedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            OcDeleteChannelByUrl200Response result = api.ocUnbanUserById(channelUrl, bannedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
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


## ocUnmuteUserById

> OcDeleteChannelByUrl200Response ocUnmuteUserById(channelUrl, mutedUserId).apiToken(apiToken).execute();

Unmute a user

## Unmute a user

Unmutes a user from an open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String mutedUserId = "mutedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            OcDeleteChannelByUrl200Response result = api.ocUnmuteUserById(channelUrl, mutedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |
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


## ocUpdateBanById

> OcUpdateBanByIdResponse ocUpdateBanById(channelUrl, bannedUserId).apiToken(apiToken).ocUpdateBanByIdData(ocUpdateBanByIdData).execute();

Update a ban

## Update a ban

Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String bannedUserId = "bannedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        OcUpdateBanByIdData ocUpdateBanByIdData = new OcUpdateBanByIdData(); // OcUpdateBanByIdData | 
        try {
            OcUpdateBanByIdResponse result = api.ocUpdateBanById(channelUrl, bannedUserId)
                .apiToken(apiToken)
                .ocUpdateBanByIdData(ocUpdateBanByIdData)
                .execute();
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |
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


## ocViewBanById

> OcViewBanByIdResponse ocViewBanById(channelUrl, bannedUserId).apiToken(apiToken).execute();

View a ban

## View a ban

Retrieves details of a ban imposed on a user.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String bannedUserId = "bannedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            OcViewBanByIdResponse result = api.ocViewBanById(channelUrl, bannedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **bannedUserId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

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


## ocViewMuteById

> OcViewMuteByIdResponse ocViewMuteById(channelUrl, mutedUserId).apiToken(apiToken).execute();

View a mute

## View a mute

Checks if a user is muted in an open channel.

https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute
----------------------------

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
        String channelUrl = "channelUrl_example"; // String | 
        String mutedUserId = "mutedUserId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            OcViewMuteByIdResponse result = api.ocViewMuteById(channelUrl, mutedUserId)
                .apiToken(apiToken)
                .execute();
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
| **channelUrl** | **String**|  | |
| **mutedUserId** | **String**|  | |
| **apiToken** | **String**|  | [optional] |

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


## unblockUserById

> Object unblockUserById(userId, targetId).apiToken(apiToken).execute();

Unblock a user

## Unblock a user

Unblocks the user.

https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-unblock-a-user
----------------------------

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
        String userId = "userId_example"; // String | 
        String targetId = "targetId_example"; // String | 
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            Object result = api.unblockUserById(userId, targetId)
                .apiToken(apiToken)
                .execute();
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
| **userId** | **String**|  | |
| **targetId** | **String**|  | |
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

