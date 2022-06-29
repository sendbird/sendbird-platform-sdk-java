# UserApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRegistrationOrDeviceToken**](UserApi.md#addRegistrationOrDeviceToken) | **POST** /v3/users/{user_id}/push/{token_type} | Add a registration or device token
[**choosePushNotificationContentTemplate**](UserApi.md#choosePushNotificationContentTemplate) | **PUT** /v3/users/{user_id}/push/template | Choose a push notification content template
[**createChannelMetacounter**](UserApi.md#createChannelMetacounter) | **POST** /v3/{channel_type}/{channel_url}/metacounter | Create a channel metacounter
[**createChannelMetadata**](UserApi.md#createChannelMetadata) | **POST** /v3/{channel_type}/{channel_url}/metadata | Create a channel metadata
[**createUser**](UserApi.md#createUser) | **POST** /v3/users | Create a user
[**createUserMetadata**](UserApi.md#createUserMetadata) | **POST** /v3/users/{user_id}/metadata | Create a user metadata
[**deleteChannelMetacounter**](UserApi.md#deleteChannelMetacounter) | **DELETE** /v3/{channel_type}/{channel_url}/metacounter | Delete a channel metacounter - When deleting all items of a channel metacounter
[**deleteChannelMetacounterByKey**](UserApi.md#deleteChannelMetacounterByKey) | **DELETE** /v3/{channel_type}/{channel_url}/metacounter/{key} | Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key
[**deleteChannelMetadata**](UserApi.md#deleteChannelMetadata) | **DELETE** /v3/{channel_type}/{channel_url}/metadata | Delete a channel metadata - When deleting all items of a channel metadata
[**deleteChannelMetadataByKey**](UserApi.md#deleteChannelMetadataByKey) | **DELETE** /v3/{channel_type}/{channel_url}/metadata/{key} | Delete a channel metadata - When deleting a specific item of a channel metadata by its key
[**deleteUserById**](UserApi.md#deleteUserById) | **DELETE** /v3/users/{user_id} | Delete a user
[**deleteUserMetadata**](UserApi.md#deleteUserMetadata) | **DELETE** /v3/users/{user_id}/metadata | Delete a user metadata - When deleting all items of a user metadata
[**deleteUserMetadataByKey**](UserApi.md#deleteUserMetadataByKey) | **DELETE** /v3/users/{user_id}/metadata/{key} | Delete a user metadata - When deleting a specific item of a user metadata by its key
[**leaveMyGroupChannels**](UserApi.md#leaveMyGroupChannels) | **PUT** /v3/users/{user_id}/my_group_channels/leave | Leave my group channels
[**listMyGroupChannels**](UserApi.md#listMyGroupChannels) | **GET** /v3/users/{user_id}/my_group_channels | List my group channels
[**listRegistrationOrDeviceTokens**](UserApi.md#listRegistrationOrDeviceTokens) | **GET** /v3/users/{user_id}/push/{token_type} | List registration or device tokens
[**listUsers**](UserApi.md#listUsers) | **GET** /v3/users | List users
[**markAllMessagesAsRead**](UserApi.md#markAllMessagesAsRead) | **PUT** /v3/users/{user_id}/mark_as_read_all | Mark all messages as read
[**registerAsOperatorToChannelsWithCustomChannelTypes**](UserApi.md#registerAsOperatorToChannelsWithCustomChannelTypes) | **POST** /v3/users/{user_id}/operating_channel_custom_types | Register as an operator to channels with custom channel types
[**removeRegistrationOrDeviceToken**](UserApi.md#removeRegistrationOrDeviceToken) | **DELETE** /v3/users/{user_id}/push | Remove a registration or device token - When unregistering all device tokens
[**removeRegistrationOrDeviceTokenByToken**](UserApi.md#removeRegistrationOrDeviceTokenByToken) | **DELETE** /v3/users/{user_id}/push/{token_type}/{token} | Remove a registration or device token - When unregistering a specific token
[**removeRegistrationOrDeviceTokenFromOwnerByToken**](UserApi.md#removeRegistrationOrDeviceTokenFromOwnerByToken) | **DELETE** /v3/push/device_tokens/{token_type}/{token} | Remove a registration or device token from an owner
[**resetPushPreferences**](UserApi.md#resetPushPreferences) | **DELETE** /v3/users/{user_id}/push_preference | Reset push preferences
[**updateChannelInvitationPreference**](UserApi.md#updateChannelInvitationPreference) | **PUT** /v3/users/{user_id}/channel_invitation_preference | Update channel invitation preference
[**updateChannelMetacounter**](UserApi.md#updateChannelMetacounter) | **PUT** /v3/{channel_type}/{channel_url}/metacounter | Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter
[**updateChannelMetacounterByKey**](UserApi.md#updateChannelMetacounterByKey) | **PUT** /v3/{channel_type}/{channel_url}/metacounter/{key} | Update a channel metacounter - When updating a specific item of a channel metacounter by its key
[**updateChannelMetadata**](UserApi.md#updateChannelMetadata) | **PUT** /v3/{channel_type}/{channel_url}/metadata | Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata
[**updateChannelMetadataByKey**](UserApi.md#updateChannelMetadataByKey) | **PUT** /v3/{channel_type}/{channel_url}/metadata/{key} | Update a channel metadata - When updating a specific item of a channel metadata by its key
[**updateCountPreferenceOfChannelByUrl**](UserApi.md#updateCountPreferenceOfChannelByUrl) | **PUT** /v3/users/{user_id}/count_preference/{channel_url} | Update count preference of a channel
[**updatePushPreferences**](UserApi.md#updatePushPreferences) | **PUT** /v3/users/{user_id}/push_preference | Update push preferences
[**updatePushPreferencesForChannelByUrl**](UserApi.md#updatePushPreferencesForChannelByUrl) | **PUT** /v3/users/{user_id}/push_preference/{channel_url} | Update push preferences for a channel
[**updateUserById**](UserApi.md#updateUserById) | **PUT** /v3/users/{user_id} | Update a user
[**updateUserMetadata**](UserApi.md#updateUserMetadata) | **PUT** /v3/users/{user_id}/metadata | Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata
[**updateUserMetadataByKey**](UserApi.md#updateUserMetadataByKey) | **PUT** /v3/users/{user_id}/metadata/{key} | Update a user metadata - When updating a specific item of a user metadata by its key
[**viewChannelInvitationPreference**](UserApi.md#viewChannelInvitationPreference) | **GET** /v3/users/{user_id}/channel_invitation_preference | View channel invitation preference
[**viewCountPreferenceOfChannelByUrl**](UserApi.md#viewCountPreferenceOfChannelByUrl) | **GET** /v3/users/{user_id}/count_preference/{channel_url} | View count preference of a channel
[**viewNumberOfChannelsByJoinStatus**](UserApi.md#viewNumberOfChannelsByJoinStatus) | **GET** /v3/users/{user_id}/group_channel_count | View number of channels by join status
[**viewNumberOfChannelsWithUnreadMessages**](UserApi.md#viewNumberOfChannelsWithUnreadMessages) | **GET** /v3/users/{user_id}/unread_channel_count | View number of channels with unread messages
[**viewNumberOfUnreadItems**](UserApi.md#viewNumberOfUnreadItems) | **GET** /v3/users/{user_id}/unread_item_count | View number of unread items
[**viewNumberOfUnreadMessages**](UserApi.md#viewNumberOfUnreadMessages) | **GET** /v3/users/{user_id}/unread_message_count | View number of unread messages
[**viewPushPreferences**](UserApi.md#viewPushPreferences) | **GET** /v3/users/{user_id}/push_preference | View push preferences
[**viewPushPreferencesForChannelByUrl**](UserApi.md#viewPushPreferencesForChannelByUrl) | **GET** /v3/users/{user_id}/push_preference/{channel_url} | View push preferences for a channel
[**viewUserById**](UserApi.md#viewUserById) | **GET** /v3/users/{user_id} | View a user
[**viewWhoOwnsRegistrationOrDeviceTokenByToken**](UserApi.md#viewWhoOwnsRegistrationOrDeviceTokenByToken) | **GET** /v3/push/device_tokens/{token_type}/{token} | View who owns a registration or device token


<a name="addRegistrationOrDeviceToken"></a>
# **addRegistrationOrDeviceToken**
> AddRegistrationOrDeviceTokenResponse addRegistrationOrDeviceToken(apiToken, userId, tokenType, addRegistrationOrDeviceTokenData)

Add a registration or device token

## Add a registration or device token  &gt; __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.  To send notification requests to push notification services on behalf of your server, adds a specific user&#39;s FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.  &gt; __Note__: For more information on the registration token and device token, visit the Google&#39;s [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei&#39;s [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple&#39;s [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String tokenType = "tokenType_example"; // String | 
    AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData = new AddRegistrationOrDeviceTokenData(); // AddRegistrationOrDeviceTokenData | 
    try {
      AddRegistrationOrDeviceTokenResponse result = apiInstance.addRegistrationOrDeviceToken(apiToken, userId, tokenType, addRegistrationOrDeviceTokenData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#addRegistrationOrDeviceToken");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **tokenType** | **String**|  |
 **addRegistrationOrDeviceTokenData** | [**AddRegistrationOrDeviceTokenData**](AddRegistrationOrDeviceTokenData.md)|  | [optional]

### Return type

[**AddRegistrationOrDeviceTokenResponse**](AddRegistrationOrDeviceTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="choosePushNotificationContentTemplate"></a>
# **choosePushNotificationContentTemplate**
> ChoosePushNotificationContentTemplateResponse choosePushNotificationContentTemplate(apiToken, userId, body)

Choose a push notification content template

## Choose a push notification content template  Chooses a push notification content template of a user&#39;s own. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-choose-a-push-notification-content-template ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    Object body = null; // Object | 
    try {
      ChoosePushNotificationContentTemplateResponse result = apiInstance.choosePushNotificationContentTemplate(apiToken, userId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#choosePushNotificationContentTemplate");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **body** | **Object**|  | [optional]

### Return type

[**ChoosePushNotificationContentTemplateResponse**](ChoosePushNotificationContentTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createChannelMetacounter"></a>
# **createChannelMetacounter**
> Map&lt;String, SendBirdAdditionalProperties&gt; createChannelMetacounter(apiToken, channelType, channelUrl, createChannelMetacounterData)

Create a channel metacounter

## Create a channel metacounter  Creates a channel metacounter&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metacounter ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    CreateChannelMetacounterData createChannelMetacounterData = new CreateChannelMetacounterData(); // CreateChannelMetacounterData | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.createChannelMetacounter(apiToken, channelType, channelUrl, createChannelMetacounterData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createChannelMetacounter");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **createChannelMetacounterData** | [**CreateChannelMetacounterData**](CreateChannelMetacounterData.md)|  | [optional]

### Return type

[**Map&lt;String, SendBirdAdditionalProperties&gt;**](SendBirdAdditionalProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createChannelMetadata"></a>
# **createChannelMetadata**
> CreateChannelMetadataResponse createChannelMetadata(apiToken, channelType, channelUrl, createChannelMetadataData)

Create a channel metadata

## Create a channel metadata  Creates a channel metadata&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metadata ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    CreateChannelMetadataData createChannelMetadataData = new CreateChannelMetadataData(); // CreateChannelMetadataData | 
    try {
      CreateChannelMetadataResponse result = apiInstance.createChannelMetadata(apiToken, channelType, channelUrl, createChannelMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createChannelMetadata");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **createChannelMetadataData** | [**CreateChannelMetadataData**](CreateChannelMetadataData.md)|  | [optional]

### Return type

[**CreateChannelMetadataResponse**](CreateChannelMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="createUser"></a>
# **createUser**
> SendBirdUser createUser(apiToken, createUserData)

Create a user

## Create a user  Creates a new user in the application. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    CreateUserData createUserData = new CreateUserData(); // CreateUserData | 
    try {
      SendBirdUser result = apiInstance.createUser(apiToken, createUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
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
 **apiToken** | **String**|  |
 **createUserData** | [**CreateUserData**](CreateUserData.md)|  | [optional]

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

<a name="createUserMetadata"></a>
# **createUserMetadata**
> CreateUserMetadataResponse createUserMetadata(apiToken, userId, createUserMetadataData)

Create a user metadata

## Create a user metadata  Creates a user metadata&#39;s items to store in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-user-metadata ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    CreateUserMetadataData createUserMetadataData = new CreateUserMetadataData(); // CreateUserMetadataData | 
    try {
      CreateUserMetadataResponse result = apiInstance.createUserMetadata(apiToken, userId, createUserMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUserMetadata");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **createUserMetadataData** | [**CreateUserMetadataData**](CreateUserMetadataData.md)|  | [optional]

### Return type

[**CreateUserMetadataResponse**](CreateUserMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="deleteChannelMetacounter"></a>
# **deleteChannelMetacounter**
> deleteChannelMetacounter(apiToken, channelType, channelUrl)

Delete a channel metacounter - When deleting all items of a channel metacounter

## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      apiInstance.deleteChannelMetacounter(apiToken, channelType, channelUrl);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteChannelMetacounter");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |

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

<a name="deleteChannelMetacounterByKey"></a>
# **deleteChannelMetacounterByKey**
> deleteChannelMetacounterByKey(apiToken, channelType, channelUrl, key)

Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key

## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.deleteChannelMetacounterByKey(apiToken, channelType, channelUrl, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteChannelMetacounterByKey");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |

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

<a name="deleteChannelMetadata"></a>
# **deleteChannelMetadata**
> deleteChannelMetadata(apiToken, channelType, channelUrl, key)

Delete a channel metadata - When deleting all items of a channel metadata

## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.deleteChannelMetadata(apiToken, channelType, channelUrl, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteChannelMetadata");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  | [optional]

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

<a name="deleteChannelMetadataByKey"></a>
# **deleteChannelMetadataByKey**
> deleteChannelMetadataByKey(apiToken, channelType, channelUrl, key)

Delete a channel metadata - When deleting a specific item of a channel metadata by its key

## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.deleteChannelMetadataByKey(apiToken, channelType, channelUrl, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteChannelMetadataByKey");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |

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

<a name="deleteUserById"></a>
# **deleteUserById**
> Object deleteUserById(apiToken, userId)

Delete a user

## Delete a user  Deletes a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-delete-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    try {
      Object result = apiInstance.deleteUserById(apiToken, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserById");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |

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
**200** | Successful response |  -  |

<a name="deleteUserMetadata"></a>
# **deleteUserMetadata**
> deleteUserMetadata(apiToken, userId, key)

Delete a user metadata - When deleting all items of a user metadata

## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.deleteUserMetadata(apiToken, userId, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserMetadata");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **key** | **String**|  | [optional]

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

<a name="deleteUserMetadataByKey"></a>
# **deleteUserMetadataByKey**
> deleteUserMetadataByKey(apiToken, userId, key)

Delete a user metadata - When deleting a specific item of a user metadata by its key

## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    try {
      apiInstance.deleteUserMetadataByKey(apiToken, userId, key);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserMetadataByKey");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **key** | **String**|  |

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

<a name="leaveMyGroupChannels"></a>
# **leaveMyGroupChannels**
> Object leaveMyGroupChannels(apiToken, userId, leaveMyGroupChannelsData)

Leave my group channels

## Leave my group channels  Makes a user leave all joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-leave-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to leave all joined group channels.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    LeaveMyGroupChannelsData leaveMyGroupChannelsData = new LeaveMyGroupChannelsData(); // LeaveMyGroupChannelsData | 
    try {
      Object result = apiInstance.leaveMyGroupChannels(apiToken, userId, leaveMyGroupChannelsData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **leaveMyGroupChannelsData** | [**LeaveMyGroupChannelsData**](LeaveMyGroupChannelsData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="listMyGroupChannels"></a>
# **listMyGroupChannels**
> ListMyGroupChannelsResponse listMyGroupChannels(apiToken, userId, token, limit, distinctMode, publicMode, superMode, hiddenMode, memberStateFilter, unreadFilter, createdAfter, createdBefore, showEmpty, showFrozen, showMember, showDeliveryReceipt, showReadReceipt, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, searchQuery, searchFields, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, customType)

List my group channels

## List my group channels  Retrieves all group channels that the user has joined. You can create a request based on various query parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String distinctMode = "distinctMode_example"; // String | 
    String publicMode = "publicMode_example"; // String | 
    String superMode = "superMode_example"; // String | 
    String hiddenMode = "hiddenMode_example"; // String | 
    String memberStateFilter = "memberStateFilter_example"; // String | 
    String unreadFilter = "unreadFilter_example"; // String | 
    Integer createdAfter = 56; // Integer | 
    Integer createdBefore = 56; // Integer | 
    Boolean showEmpty = true; // Boolean | 
    Boolean showFrozen = true; // Boolean | 
    Boolean showMember = true; // Boolean | 
    Boolean showDeliveryReceipt = true; // Boolean | 
    Boolean showReadReceipt = true; // Boolean | 
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
    String searchQuery = "searchQuery_example"; // String | 
    String searchFields = "searchFields_example"; // String | 
    String metadataKey = "metadataKey_example"; // String | 
    String metadataValues = "metadataValues_example"; // String | 
    String metadataValueStartswith = "metadataValueStartswith_example"; // String | 
    String metacounterKey = "metacounterKey_example"; // String | 
    String metacounterValues = "metacounterValues_example"; // String | 
    String metacounterValueGt = "metacounterValueGt_example"; // String | 
    String metacounterValueGte = "metacounterValueGte_example"; // String | 
    String metacounterValueLt = "metacounterValueLt_example"; // String | 
    String metacounterValueLte = "metacounterValueLte_example"; // String | 
    String customType = "customType_example"; // String | 
    try {
      ListMyGroupChannelsResponse result = apiInstance.listMyGroupChannels(apiToken, userId, token, limit, distinctMode, publicMode, superMode, hiddenMode, memberStateFilter, unreadFilter, createdAfter, createdBefore, showEmpty, showFrozen, showMember, showDeliveryReceipt, showReadReceipt, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, searchQuery, searchFields, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, customType);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **distinctMode** | **String**|  | [optional]
 **publicMode** | **String**|  | [optional]
 **superMode** | **String**|  | [optional]
 **hiddenMode** | **String**|  | [optional]
 **memberStateFilter** | **String**|  | [optional]
 **unreadFilter** | **String**|  | [optional]
 **createdAfter** | **Integer**|  | [optional]
 **createdBefore** | **Integer**|  | [optional]
 **showEmpty** | **Boolean**|  | [optional]
 **showFrozen** | **Boolean**|  | [optional]
 **showMember** | **Boolean**|  | [optional]
 **showDeliveryReceipt** | **Boolean**|  | [optional]
 **showReadReceipt** | **Boolean**|  | [optional]
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
 **searchQuery** | **String**|  | [optional]
 **searchFields** | **String**|  | [optional]
 **metadataKey** | **String**|  | [optional]
 **metadataValues** | **String**|  | [optional]
 **metadataValueStartswith** | **String**|  | [optional]
 **metacounterKey** | **String**|  | [optional]
 **metacounterValues** | **String**|  | [optional]
 **metacounterValueGt** | **String**|  | [optional]
 **metacounterValueGte** | **String**|  | [optional]
 **metacounterValueLt** | **String**|  | [optional]
 **metacounterValueLte** | **String**|  | [optional]
 **customType** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="listRegistrationOrDeviceTokens"></a>
# **listRegistrationOrDeviceTokens**
> ListRegistrationOrDeviceTokensResponse listRegistrationOrDeviceTokens(apiToken, userId, tokenType)

List registration or device tokens

## List registration or device tokens  Retrieves a list of a specific user&#39;s FCM registration tokens, HMS device tokens, or APNs device tokens. You can specify either &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; in the &#x60;token_type&#x60; parameter, depending on which push notification service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-registration-or-device-tokens ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String tokenType = "tokenType_example"; // String | 
    try {
      ListRegistrationOrDeviceTokensResponse result = apiInstance.listRegistrationOrDeviceTokens(apiToken, userId, tokenType);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **tokenType** | **String**|  |

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
**200** | Successful response |  -  |

<a name="listUsers"></a>
# **listUsers**
> ListUsersResponse listUsers(apiToken, token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn)

List users

## List users  Retrieves a list of users in your application. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-users ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String activeMode = "activeMode_example"; // String | 
    Boolean showBot = true; // Boolean | 
    String userIds = "userIds_example"; // String | 
    String nickname = "nickname_example"; // String | 
    String nicknameStartswith = "nicknameStartswith_example"; // String | 
    String metadatakey = "metadatakey_example"; // String | 
    String metadatavaluesIn = "metadatavaluesIn_example"; // String | 
    try {
      ListUsersResponse result = apiInstance.listUsers(apiToken, token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **token** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **activeMode** | **String**|  | [optional]
 **showBot** | **Boolean**|  | [optional]
 **userIds** | **String**|  | [optional]
 **nickname** | **String**|  | [optional]
 **nicknameStartswith** | **String**|  | [optional]
 **metadatakey** | **String**|  | [optional]
 **metadatavaluesIn** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="markAllMessagesAsRead"></a>
# **markAllMessagesAsRead**
> Object markAllMessagesAsRead(apiToken, userId, markAllMessagesAsReadData)

Mark all messages as read

## Mark all messages as read  Marks all of a user&#39;s unread messages as read in the joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mark-all-messages-as-read ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    MarkAllMessagesAsReadData markAllMessagesAsReadData = new MarkAllMessagesAsReadData(); // MarkAllMessagesAsReadData | 
    try {
      Object result = apiInstance.markAllMessagesAsRead(apiToken, userId, markAllMessagesAsReadData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **markAllMessagesAsReadData** | [**MarkAllMessagesAsReadData**](MarkAllMessagesAsReadData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="registerAsOperatorToChannelsWithCustomChannelTypes"></a>
# **registerAsOperatorToChannelsWithCustomChannelTypes**
> Object registerAsOperatorToChannelsWithCustomChannelTypes(apiToken, userId, registerAsOperatorToChannelsWithCustomChannelTypesData)

Register as an operator to channels with custom channel types

## Register as an operator to channels with custom channel types  Registers a user as an operator to channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-register-as-an-operator-to-channels-with-custom-channel-types ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData = new RegisterAsOperatorToChannelsWithCustomChannelTypesData(); // RegisterAsOperatorToChannelsWithCustomChannelTypesData | 
    try {
      Object result = apiInstance.registerAsOperatorToChannelsWithCustomChannelTypes(apiToken, userId, registerAsOperatorToChannelsWithCustomChannelTypesData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#registerAsOperatorToChannelsWithCustomChannelTypes");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **registerAsOperatorToChannelsWithCustomChannelTypesData** | [**RegisterAsOperatorToChannelsWithCustomChannelTypesData**](RegisterAsOperatorToChannelsWithCustomChannelTypesData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="removeRegistrationOrDeviceToken"></a>
# **removeRegistrationOrDeviceToken**
> RemoveRegistrationOrDeviceTokenResponse removeRegistrationOrDeviceToken(apiToken, userId)

Remove a registration or device token - When unregistering all device tokens

## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    try {
      RemoveRegistrationOrDeviceTokenResponse result = apiInstance.removeRegistrationOrDeviceToken(apiToken, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeRegistrationOrDeviceToken");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |

### Return type

[**RemoveRegistrationOrDeviceTokenResponse**](RemoveRegistrationOrDeviceTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="removeRegistrationOrDeviceTokenByToken"></a>
# **removeRegistrationOrDeviceTokenByToken**
> RemoveRegistrationOrDeviceTokenByTokenResponse removeRegistrationOrDeviceTokenByToken(apiToken, userId, tokenType, token)

Remove a registration or device token - When unregistering a specific token

## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String tokenType = "tokenType_example"; // String | 
    String token = "token_example"; // String | 
    try {
      RemoveRegistrationOrDeviceTokenByTokenResponse result = apiInstance.removeRegistrationOrDeviceTokenByToken(apiToken, userId, tokenType, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeRegistrationOrDeviceTokenByToken");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **tokenType** | **String**|  |
 **token** | **String**|  |

### Return type

[**RemoveRegistrationOrDeviceTokenByTokenResponse**](RemoveRegistrationOrDeviceTokenByTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="removeRegistrationOrDeviceTokenFromOwnerByToken"></a>
# **removeRegistrationOrDeviceTokenFromOwnerByToken**
> RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse removeRegistrationOrDeviceTokenFromOwnerByToken(apiToken, tokenType, token)

Remove a registration or device token from an owner

## Remove a registration or device token from an owner  Removes a registration or device token from a user who owns it. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token-from-an-owner ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String tokenType = "tokenType_example"; // String | 
    String token = "token_example"; // String | 
    try {
      RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse result = apiInstance.removeRegistrationOrDeviceTokenFromOwnerByToken(apiToken, tokenType, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#removeRegistrationOrDeviceTokenFromOwnerByToken");
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
 **apiToken** | **String**|  |
 **tokenType** | **String**|  |
 **token** | **String**|  |

### Return type

[**RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse**](RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="resetPushPreferences"></a>
# **resetPushPreferences**
> ResetPushPreferencesResponse resetPushPreferences(apiToken, userId)

Reset push preferences

## Reset push preferences  Resets a user&#39;s push preferences. After performing this action,   &#x60;do_not_disturb&#x60; and &#x60;snooze_enabled&#x60; are set to false.  The values of the parameters associated with the time frame are all set to 0.  &#x60;timezone&#x60; is reset to &#x60;UTC&#x60;.  &#x60;push_sound&#x60; is reset to &#x60;default&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-reset-push-preferences ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    try {
      ResetPushPreferencesResponse result = apiInstance.resetPushPreferences(apiToken, userId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |

### Return type

[**ResetPushPreferencesResponse**](ResetPushPreferencesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateChannelInvitationPreference"></a>
# **updateChannelInvitationPreference**
> UpdateChannelInvitationPreferenceResponse updateChannelInvitationPreference(apiToken, userId, updateChannelInvitationPreferenceData)

Update channel invitation preference

## Update channel invitation preference  Updates the channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, you can update the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData = new UpdateChannelInvitationPreferenceData(); // UpdateChannelInvitationPreferenceData | 
    try {
      UpdateChannelInvitationPreferenceResponse result = apiInstance.updateChannelInvitationPreference(apiToken, userId, updateChannelInvitationPreferenceData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **updateChannelInvitationPreferenceData** | [**UpdateChannelInvitationPreferenceData**](UpdateChannelInvitationPreferenceData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="updateChannelMetacounter"></a>
# **updateChannelMetacounter**
> Map&lt;String, SendBirdAdditionalProperties&gt; updateChannelMetacounter(apiToken, channelType, channelUrl, updateChannelMetacounterData)

Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter

## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    UpdateChannelMetacounterData updateChannelMetacounterData = new UpdateChannelMetacounterData(); // UpdateChannelMetacounterData | 
    try {
      Map<String, SendBirdAdditionalProperties> result = apiInstance.updateChannelMetacounter(apiToken, channelType, channelUrl, updateChannelMetacounterData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateChannelMetacounter");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **updateChannelMetacounterData** | [**UpdateChannelMetacounterData**](UpdateChannelMetacounterData.md)|  | [optional]

### Return type

[**Map&lt;String, SendBirdAdditionalProperties&gt;**](SendBirdAdditionalProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateChannelMetacounterByKey"></a>
# **updateChannelMetacounterByKey**
> Map&lt;String, String&gt; updateChannelMetacounterByKey(apiToken, channelType, channelUrl, key, body)

Update a channel metacounter - When updating a specific item of a channel metacounter by its key

## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    Object body = null; // Object | 
    try {
      Map<String, String> result = apiInstance.updateChannelMetacounterByKey(apiToken, channelType, channelUrl, key, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateChannelMetacounterByKey");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **body** | **Object**|  | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateChannelMetadata"></a>
# **updateChannelMetadata**
> Map&lt;String, String&gt; updateChannelMetadata(apiToken, channelType, channelUrl, updateChannelMetadataData)

Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata

## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    UpdateChannelMetadataData updateChannelMetadataData = new UpdateChannelMetadataData(); // UpdateChannelMetadataData | 
    try {
      Map<String, String> result = apiInstance.updateChannelMetadata(apiToken, channelType, channelUrl, updateChannelMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateChannelMetadata");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **updateChannelMetadataData** | [**UpdateChannelMetadataData**](UpdateChannelMetadataData.md)|  | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateChannelMetadataByKey"></a>
# **updateChannelMetadataByKey**
> Map&lt;String, String&gt; updateChannelMetadataByKey(apiToken, channelType, channelUrl, key, body)

Update a channel metadata - When updating a specific item of a channel metadata by its key

## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String channelType = "channelType_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    String key = "key_example"; // String | 
    Object body = null; // Object | 
    try {
      Map<String, String> result = apiInstance.updateChannelMetadataByKey(apiToken, channelType, channelUrl, key, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateChannelMetadataByKey");
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
 **apiToken** | **String**|  |
 **channelType** | **String**|  |
 **channelUrl** | **String**|  |
 **key** | **String**|  |
 **body** | **Object**|  | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateCountPreferenceOfChannelByUrl"></a>
# **updateCountPreferenceOfChannelByUrl**
> UpdateCountPreferenceOfChannelByUrlResponse updateCountPreferenceOfChannelByUrl(apiToken, userId, channelUrl, updateCountPreferenceOfChannelByUrlData)

Update count preference of a channel

## Update count preference of a channel  Updates count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-count-preference-of-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData = new UpdateCountPreferenceOfChannelByUrlData(); // UpdateCountPreferenceOfChannelByUrlData | 
    try {
      UpdateCountPreferenceOfChannelByUrlResponse result = apiInstance.updateCountPreferenceOfChannelByUrl(apiToken, userId, channelUrl, updateCountPreferenceOfChannelByUrlData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateCountPreferenceOfChannelByUrl");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **channelUrl** | **String**|  |
 **updateCountPreferenceOfChannelByUrlData** | [**UpdateCountPreferenceOfChannelByUrlData**](UpdateCountPreferenceOfChannelByUrlData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="updatePushPreferences"></a>
# **updatePushPreferences**
> UpdatePushPreferencesResponse updatePushPreferences(apiToken, userId, updatePushPreferencesData)

Update push preferences

## Update push preferences  Updates a user&#39;s push preferences. Through this action, you can set &#x60;do_not_disturb&#x60; for a user, and update the time frame in which the setting applies.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    UpdatePushPreferencesData updatePushPreferencesData = new UpdatePushPreferencesData(); // UpdatePushPreferencesData | 
    try {
      UpdatePushPreferencesResponse result = apiInstance.updatePushPreferences(apiToken, userId, updatePushPreferencesData);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **updatePushPreferencesData** | [**UpdatePushPreferencesData**](UpdatePushPreferencesData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="updatePushPreferencesForChannelByUrl"></a>
# **updatePushPreferencesForChannelByUrl**
> UpdatePushPreferencesForChannelByUrlResponse updatePushPreferencesForChannelByUrl(apiToken, userId, channelUrl, updatePushPreferencesForChannelByUrlData)

Update push preferences for a channel

## Update push preferences for a channel  Updates push preferences for a user&#39;s specific group channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences-for-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData = new UpdatePushPreferencesForChannelByUrlData(); // UpdatePushPreferencesForChannelByUrlData | 
    try {
      UpdatePushPreferencesForChannelByUrlResponse result = apiInstance.updatePushPreferencesForChannelByUrl(apiToken, userId, channelUrl, updatePushPreferencesForChannelByUrlData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updatePushPreferencesForChannelByUrl");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **channelUrl** | **String**|  |
 **updatePushPreferencesForChannelByUrlData** | [**UpdatePushPreferencesForChannelByUrlData**](UpdatePushPreferencesForChannelByUrlData.md)|  | [optional]

### Return type

[**UpdatePushPreferencesForChannelByUrlResponse**](UpdatePushPreferencesForChannelByUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateUserById"></a>
# **updateUserById**
> SendBirdUser updateUserById(apiToken, userId, updateUserByIdData)

Update a user

## Update a user  Updates information on a user. In addition to changing a user&#39;s nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.  You can also deactivate or reactivate a user. If the &#x60;leave_all_when_deactivated&#x60; is true (which it is by default), a user leaves all joined group channels when deactivated.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    UpdateUserByIdData updateUserByIdData = new UpdateUserByIdData(); // UpdateUserByIdData | 
    try {
      SendBirdUser result = apiInstance.updateUserById(apiToken, userId, updateUserByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUserById");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **updateUserByIdData** | [**UpdateUserByIdData**](UpdateUserByIdData.md)|  | [optional]

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

<a name="updateUserMetadata"></a>
# **updateUserMetadata**
> UpdateUserMetadataResponse updateUserMetadata(apiToken, userId, updateUserMetadataData)

Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata

## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    UpdateUserMetadataData updateUserMetadataData = new UpdateUserMetadataData(); // UpdateUserMetadataData | 
    try {
      UpdateUserMetadataResponse result = apiInstance.updateUserMetadata(apiToken, userId, updateUserMetadataData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUserMetadata");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **updateUserMetadataData** | [**UpdateUserMetadataData**](UpdateUserMetadataData.md)|  | [optional]

### Return type

[**UpdateUserMetadataResponse**](UpdateUserMetadataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateUserMetadataByKey"></a>
# **updateUserMetadataByKey**
> Map&lt;String, String&gt; updateUserMetadataByKey(apiToken, userId, key, body)

Update a user metadata - When updating a specific item of a user metadata by its key

## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String key = "key_example"; // String | 
    Object body = null; // Object | 
    try {
      Map<String, String> result = apiInstance.updateUserMetadataByKey(apiToken, userId, key, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUserMetadataByKey");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **key** | **String**|  |
 **body** | **Object**|  | [optional]

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewChannelInvitationPreference"></a>
# **viewChannelInvitationPreference**
> ViewChannelInvitationPreferenceResponse viewChannelInvitationPreference(apiToken, userId)

View channel invitation preference

## View channel invitation preference  Retrieves channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [view default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference) action, you can retrieve the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    try {
      ViewChannelInvitationPreferenceResponse result = apiInstance.viewChannelInvitationPreference(apiToken, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewChannelInvitationPreference");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |

### Return type

[**ViewChannelInvitationPreferenceResponse**](ViewChannelInvitationPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewCountPreferenceOfChannelByUrl"></a>
# **viewCountPreferenceOfChannelByUrl**
> ViewCountPreferenceOfChannelByUrlResponse viewCountPreferenceOfChannelByUrl(apiToken, userId, channelUrl)

View count preference of a channel

## View count preference of a channel  Retrieves count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-count-preference-of-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      ViewCountPreferenceOfChannelByUrlResponse result = apiInstance.viewCountPreferenceOfChannelByUrl(apiToken, userId, channelUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewCountPreferenceOfChannelByUrl");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **channelUrl** | **String**|  |

### Return type

[**ViewCountPreferenceOfChannelByUrlResponse**](ViewCountPreferenceOfChannelByUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewNumberOfChannelsByJoinStatus"></a>
# **viewNumberOfChannelsByJoinStatus**
> ViewNumberOfChannelsByJoinStatusResponse viewNumberOfChannelsByJoinStatus(apiToken, userId, state)

View number of channels by join status

## View number of channels by join status  Retrieves the number of a user&#39;s group channels by their join status.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-by-join-status ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String state = "state_example"; // String | 
    try {
      ViewNumberOfChannelsByJoinStatusResponse result = apiInstance.viewNumberOfChannelsByJoinStatus(apiToken, userId, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewNumberOfChannelsByJoinStatus");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **state** | **String**|  | [optional]

### Return type

[**ViewNumberOfChannelsByJoinStatusResponse**](ViewNumberOfChannelsByJoinStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewNumberOfChannelsWithUnreadMessages"></a>
# **viewNumberOfChannelsWithUnreadMessages**
> ViewNumberOfChannelsWithUnreadMessagesResponse viewNumberOfChannelsWithUnreadMessages(apiToken, userId, customTypes, superMode)

View number of channels with unread messages

## View number of channels with unread messages  Retrieves the total number of a user&#39;s group channels with unread messages.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-with-unread-messages ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    List<String> customTypes = Arrays.asList(); // List<String> | 
    String superMode = "superMode_example"; // String | 
    try {
      ViewNumberOfChannelsWithUnreadMessagesResponse result = apiInstance.viewNumberOfChannelsWithUnreadMessages(apiToken, userId, customTypes, superMode);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **customTypes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **superMode** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="viewNumberOfUnreadItems"></a>
# **viewNumberOfUnreadItems**
> ViewNumberOfUnreadItemsResponse viewNumberOfUnreadItems(apiToken, userId, customType, itemKeys)

View number of unread items

## View number of unread items  Retrieves a set of total numbers of a user&#39;s unread messages, unread mentioned messages, or received invitations in either super or non-super group channels. This action is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-items ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String customType = "customType_example"; // String | 
    String itemKeys = "itemKeys_example"; // String | 
    try {
      ViewNumberOfUnreadItemsResponse result = apiInstance.viewNumberOfUnreadItems(apiToken, userId, customType, itemKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewNumberOfUnreadItems");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **customType** | **String**|  | [optional]
 **itemKeys** | **String**|  | [optional]

### Return type

[**ViewNumberOfUnreadItemsResponse**](ViewNumberOfUnreadItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewNumberOfUnreadMessages"></a>
# **viewNumberOfUnreadMessages**
> ViewNumberOfUnreadMessagesResponse viewNumberOfUnreadMessages(apiToken, userId, customTypes, superMode)

View number of unread messages

## View number of unread messages  Retrieves the total number of a user&#39;s currently unread messages in the group channels. The unread counts feature is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-messages ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String customTypes = "customTypes_example"; // String | 
    String superMode = "superMode_example"; // String | 
    try {
      ViewNumberOfUnreadMessagesResponse result = apiInstance.viewNumberOfUnreadMessages(apiToken, userId, customTypes, superMode);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **customTypes** | **String**|  | [optional]
 **superMode** | **String**|  | [optional]

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
**200** | Successful response |  -  |

<a name="viewPushPreferences"></a>
# **viewPushPreferences**
> ViewPushPreferencesResponse viewPushPreferences(apiToken, userId)

View push preferences

## View push preferences  Retrieves a user&#39;s push preferences about whether the user has set &#x60;do_not_disturb&#x60; to pause notifications for a certain period of time, and the time frame in which the user has applied the setting.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    try {
      ViewPushPreferencesResponse result = apiInstance.viewPushPreferences(apiToken, userId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**|  |
 **userId** | **String**|  |

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
**200** | Successful response |  -  |

<a name="viewPushPreferencesForChannelByUrl"></a>
# **viewPushPreferencesForChannelByUrl**
> ViewPushPreferencesForChannelByUrlResponse viewPushPreferencesForChannelByUrl(apiToken, userId, channelUrl)

View push preferences for a channel

## View push preferences for a channel  Retrieves whether a user has turned on notification messages for a specific channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences-for-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    String channelUrl = "channelUrl_example"; // String | 
    try {
      ViewPushPreferencesForChannelByUrlResponse result = apiInstance.viewPushPreferencesForChannelByUrl(apiToken, userId, channelUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewPushPreferencesForChannelByUrl");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **channelUrl** | **String**|  |

### Return type

[**ViewPushPreferencesForChannelByUrlResponse**](ViewPushPreferencesForChannelByUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="viewUserById"></a>
# **viewUserById**
> SendBirdUser viewUserById(apiToken, userId, includeUnreadCount, customTypes, superMode)

View a user

## View a user  Retrieves information on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-a-user ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String userId = "userId_example"; // String | 
    Boolean includeUnreadCount = true; // Boolean | 
    String customTypes = "customTypes_example"; // String | 
    String superMode = "superMode_example"; // String | 
    try {
      SendBirdUser result = apiInstance.viewUserById(apiToken, userId, includeUnreadCount, customTypes, superMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewUserById");
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
 **apiToken** | **String**|  |
 **userId** | **String**|  |
 **includeUnreadCount** | **Boolean**|  | [optional]
 **customTypes** | **String**|  | [optional]
 **superMode** | **String**|  | [optional]

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

<a name="viewWhoOwnsRegistrationOrDeviceTokenByToken"></a>
# **viewWhoOwnsRegistrationOrDeviceTokenByToken**
> List&lt;Object&gt; viewWhoOwnsRegistrationOrDeviceTokenByToken(apiToken, tokenType, token)

View who owns a registration or device token

## View who owns a registration or device token  Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    UserApi apiInstance = new UserApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String tokenType = "tokenType_example"; // String | 
    String token = "token_example"; // String | 
    try {
      List<Object> result = apiInstance.viewWhoOwnsRegistrationOrDeviceTokenByToken(apiToken, tokenType, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#viewWhoOwnsRegistrationOrDeviceTokenByToken");
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
 **apiToken** | **String**|  |
 **tokenType** | **String**|  |
 **token** | **String**|  |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

