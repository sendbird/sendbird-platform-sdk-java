# OpenChannelApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ocBanUser**](OpenChannelApi.md#ocBanUser) | **POST** /v3/open_channels/{channel_url}/ban | Ban a user
[**ocCancelTheRegistrationOfOperators**](OpenChannelApi.md#ocCancelTheRegistrationOfOperators) | **DELETE** /v3/open_channels/{channel_url}/operators | Cancel the registration of operators
[**ocCreateChannel**](OpenChannelApi.md#ocCreateChannel) | **POST** /v3/open_channels | Create a channel
[**ocDeleteChannelByUrl**](OpenChannelApi.md#ocDeleteChannelByUrl) | **DELETE** /v3/open_channels/{channel_url} | Delete a channel
[**ocFreezeChannel**](OpenChannelApi.md#ocFreezeChannel) | **PUT** /v3/open_channels/{channel_url}/freeze | Freeze a channel
[**ocListBannedUsers**](OpenChannelApi.md#ocListBannedUsers) | **GET** /v3/open_channels/{channel_url}/ban | List banned users
[**ocListChannels**](OpenChannelApi.md#ocListChannels) | **GET** /v3/open_channels | List channels
[**ocListMutedUsers**](OpenChannelApi.md#ocListMutedUsers) | **GET** /v3/open_channels/{channel_url}/mute | List muted users
[**ocListOperators**](OpenChannelApi.md#ocListOperators) | **GET** /v3/open_channels/{channel_url}/operators | List operators
[**ocListParticipants**](OpenChannelApi.md#ocListParticipants) | **GET** /v3/open_channels/{channel_url}/participants | List participants
[**ocMuteUser**](OpenChannelApi.md#ocMuteUser) | **POST** /v3/open_channels/{channel_url}/mute | Mute a user
[**ocRegisterOperators**](OpenChannelApi.md#ocRegisterOperators) | **POST** /v3/open_channels/{channel_url}/operators | Register operators
[**ocUnbanUserById**](OpenChannelApi.md#ocUnbanUserById) | **DELETE** /v3/open_channels/{channel_url}/ban/{banned_user_id} | Unban a user
[**ocUnmuteUserById**](OpenChannelApi.md#ocUnmuteUserById) | **DELETE** /v3/open_channels/{channel_url}/mute/{muted_user_id} | Unmute a user
[**ocUpdateBanById**](OpenChannelApi.md#ocUpdateBanById) | **PUT** /v3/open_channels/{channel_url}/ban/{banned_user_id} | Update a ban
[**ocUpdateChannelByUrl**](OpenChannelApi.md#ocUpdateChannelByUrl) | **PUT** /v3/open_channels/{channel_url} | Update a channel
[**ocViewBanById**](OpenChannelApi.md#ocViewBanById) | **GET** /v3/open_channels/{channel_url}/ban/{banned_user_id} | View a ban
[**ocViewChannelByUrl**](OpenChannelApi.md#ocViewChannelByUrl) | **GET** /v3/open_channels/{channel_url} | View a channel
[**ocViewMuteById**](OpenChannelApi.md#ocViewMuteById) | **GET** /v3/open_channels/{channel_url}/mute/{muted_user_id} | View a mute


<a name="ocBanUser"></a>
# **ocBanUser**
> InlineResponse20033BannedList ocBanUser(channelUrl, apiToken, ocBanUserData)

Ban a user

## Ban a user  Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcBanUserData ocBanUserData = new OcBanUserData(); // OcBanUserData | 
    try {
      InlineResponse20033BannedList result = apiInstance.ocBanUser(channelUrl, apiToken, ocBanUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocBanUser");
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
 **ocBanUserData** | [**OcBanUserData**](OcBanUserData.md)|  | [optional]

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

<a name="ocCancelTheRegistrationOfOperators"></a>
# **ocCancelTheRegistrationOfOperators**
> ocCancelTheRegistrationOfOperators(channelUrl, operatorIds, apiToken, deleteAll)

Cancel the registration of operators

## Cancel the registration of operators  Cancels the registration of operators from an open channel but leave them as participants.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-cancel-the-registration-of-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to cancel the registration of operators.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    List<String> operatorIds = Arrays.asList(); // List<String> | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    Boolean deleteAll = true; // Boolean | 
    try {
      apiInstance.ocCancelTheRegistrationOfOperators(channelUrl, operatorIds, apiToken, deleteAll);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocCancelTheRegistrationOfOperators");
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

<a name="ocCreateChannel"></a>
# **ocCreateChannel**
> SendBirdOpenChannel ocCreateChannel(apiToken, ocCreateChannelData)

Create a channel

## Create a channel  Creates an open channel.  &gt;__Note__: Classic open channels created before the deprecation date of March 2021 will maintain their original form and functions. However, new applications created after December 15, 2020, will be able to create dynamic partitioning open channels only.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcCreateChannelData ocCreateChannelData = new OcCreateChannelData(); // OcCreateChannelData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocCreateChannel(apiToken, ocCreateChannelData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocCreateChannel");
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
 **ocCreateChannelData** | [**OcCreateChannelData**](OcCreateChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocDeleteChannelByUrl"></a>
# **ocDeleteChannelByUrl**
> ocDeleteChannelByUrl(channelUrl, apiToken)

Delete a channel

## Delete a channel  Deletes an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-delete-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.ocDeleteChannelByUrl(channelUrl, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocDeleteChannelByUrl");
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

<a name="ocFreezeChannel"></a>
# **ocFreezeChannel**
> SendBirdOpenChannel ocFreezeChannel(channelUrl, apiToken, ocFreezeChannelData)

Freeze a channel

## Freeze a channel  Freezes or unfreezes an open channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcFreezeChannelData ocFreezeChannelData = new OcFreezeChannelData(); // OcFreezeChannelData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocFreezeChannel(channelUrl, apiToken, ocFreezeChannelData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocFreezeChannel");
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
 **ocFreezeChannelData** | [**OcFreezeChannelData**](OcFreezeChannelData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocListBannedUsers"></a>
# **ocListBannedUsers**
> InlineResponse20033 ocListBannedUsers(channelUrl, apiToken, token, limit)

List banned users

## List banned users  Retrieves a list of banned users from a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20033 result = apiInstance.ocListBannedUsers(channelUrl, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocListBannedUsers");
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

<a name="ocListChannels"></a>
# **ocListChannels**
> InlineResponse20030 ocListChannels(apiToken, token, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, customType)

List channels

## List channels  Retrieves a list of open channels. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-channels ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    String customTypes = "customTypes_example"; // String | 
    String nameContains = "nameContains_example"; // String | 
    String urlContains = "urlContains_example"; // String | 
    Boolean showFrozen = true; // Boolean | 
    Boolean showMetadata = true; // Boolean | 
    String customType = "customType_example"; // String | 
    try {
      InlineResponse20030 result = apiInstance.ocListChannels(apiToken, token, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, customType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocListChannels");
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
 **customTypes** | **String**|  | [optional]
 **nameContains** | **String**|  | [optional]
 **urlContains** | **String**|  | [optional]
 **showFrozen** | **Boolean**|  | [optional]
 **showMetadata** | **Boolean**|  | [optional]
 **customType** | **String**|  | [optional]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="ocListMutedUsers"></a>
# **ocListMutedUsers**
> InlineResponse20031 ocListMutedUsers(channelUrl, apiToken, token, limit)

List muted users

## List muted users  Retrieves a list of muted users in the channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20031 result = apiInstance.ocListMutedUsers(channelUrl, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocListMutedUsers");
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

<a name="ocListOperators"></a>
# **ocListOperators**
> InlineResponse20034 ocListOperators(channelUrl, apiToken, token, limit)

List operators

## List operators  Retrieves a list of operators of an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of operators.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20034 result = apiInstance.ocListOperators(channelUrl, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocListOperators");
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

<a name="ocListParticipants"></a>
# **ocListParticipants**
> InlineResponse20032 ocListParticipants(channelUrl, apiToken, token, limit)

List participants

## List participants  Retrieves a list of the participants of an open channel. A participant refers to a user who has entered the open channel and is currently online.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-participants ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of participants in.

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    String token = "token_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InlineResponse20032 result = apiInstance.ocListParticipants(channelUrl, apiToken, token, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocListParticipants");
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

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="ocMuteUser"></a>
# **ocMuteUser**
> SendBirdOpenChannel ocMuteUser(channelUrl, apiToken, ocMuteUserData)

Mute a user

## Mute a user  Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcMuteUserData ocMuteUserData = new OcMuteUserData(); // OcMuteUserData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocMuteUser(channelUrl, apiToken, ocMuteUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocMuteUser");
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
 **ocMuteUserData** | [**OcMuteUserData**](OcMuteUserData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocRegisterOperators"></a>
# **ocRegisterOperators**
> ocRegisterOperators(channelUrl, apiToken, ocRegisterOperatorsData)

Register operators

## Register operators  Registers one or more operators to an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-register-operators ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcRegisterOperatorsData ocRegisterOperatorsData = new OcRegisterOperatorsData(); // OcRegisterOperatorsData | 
    try {
      apiInstance.ocRegisterOperators(channelUrl, apiToken, ocRegisterOperatorsData);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocRegisterOperators");
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
 **ocRegisterOperatorsData** | [**OcRegisterOperatorsData**](OcRegisterOperatorsData.md)|  | [optional]

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

<a name="ocUnbanUserById"></a>
# **ocUnbanUserById**
> ocUnbanUserById(channelUrl, bannedUserId, apiToken)

Unban a user

## Unban a user  Unbans a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.ocUnbanUserById(channelUrl, bannedUserId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocUnbanUserById");
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

<a name="ocUnmuteUserById"></a>
# **ocUnmuteUserById**
> ocUnmuteUserById(channelUrl, mutedUserId, apiToken)

Unmute a user

## Unmute a user  Unmutes a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      apiInstance.ocUnmuteUserById(channelUrl, mutedUserId, apiToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocUnmuteUserById");
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

<a name="ocUpdateBanById"></a>
# **ocUpdateBanById**
> SendBirdUser ocUpdateBanById(channelUrl, bannedUserId, apiToken, ocUpdateBanByIdData)

Update a ban

## Update a ban  Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcUpdateBanByIdData ocUpdateBanByIdData = new OcUpdateBanByIdData(); // OcUpdateBanByIdData | 
    try {
      SendBirdUser result = apiInstance.ocUpdateBanById(channelUrl, bannedUserId, apiToken, ocUpdateBanByIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocUpdateBanById");
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
 **ocUpdateBanByIdData** | [**OcUpdateBanByIdData**](OcUpdateBanByIdData.md)|  | [optional]

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

<a name="ocUpdateChannelByUrl"></a>
# **ocUpdateChannelByUrl**
> SendBirdOpenChannel ocUpdateChannelByUrl(channelUrl, apiToken, ocUpdateChannelByUrlData)

Update a channel

## Update a channel  Updates information on an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    OcUpdateChannelByUrlData ocUpdateChannelByUrlData = new OcUpdateChannelByUrlData(); // OcUpdateChannelByUrlData | 
    try {
      SendBirdOpenChannel result = apiInstance.ocUpdateChannelByUrl(channelUrl, apiToken, ocUpdateChannelByUrlData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocUpdateChannelByUrl");
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
 **ocUpdateChannelByUrlData** | [**OcUpdateChannelByUrlData**](OcUpdateChannelByUrlData.md)|  | [optional]

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
**200** | Successful response |  -  |

<a name="ocViewBanById"></a>
# **ocViewBanById**
> SendBirdUser ocViewBanById(channelUrl, bannedUserId, apiToken)

View a ban

## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String bannedUserId = "bannedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      SendBirdUser result = apiInstance.ocViewBanById(channelUrl, bannedUserId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocViewBanById");
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

<a name="ocViewChannelByUrl"></a>
# **ocViewChannelByUrl**
> SendBirdOpenChannel ocViewChannelByUrl(channelUrl, apiToken)

View a channel

## View a channel  Retrieves information on a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-channel ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      SendBirdOpenChannel result = apiInstance.ocViewChannelByUrl(channelUrl, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocViewChannelByUrl");
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

[**SendBirdOpenChannel**](SendBirdOpenChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="ocViewMuteById"></a>
# **ocViewMuteById**
> InlineResponse20035 ocViewMuteById(channelUrl, mutedUserId, apiToken)

View a mute

## View a mute  Checks if a user is muted in an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute ----------------------------

### Example
```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.models.*;
import org.sendbird.client.api.OpenChannelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

    OpenChannelApi apiInstance = new OpenChannelApi(defaultClient);
    String channelUrl = "channelUrl_example"; // String | 
    String mutedUserId = "mutedUserId_example"; // String | 
    String apiToken = "{{API_TOKEN}}"; // String | 
    try {
      InlineResponse20035 result = apiInstance.ocViewMuteById(channelUrl, mutedUserId, apiToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpenChannelApi#ocViewMuteById");
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

