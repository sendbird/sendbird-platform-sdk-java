# ApplicationApi

All URIs are relative to *https://api-APP_ID.sendbird.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addApnsPushConfiguration**](ApplicationApi.md#addApnsPushConfiguration) | **POST** /v3/applications/push/apns | Add an APNs push configuration |
| [**addFcmPushConfiguration**](ApplicationApi.md#addFcmPushConfiguration) | **POST** /v3/applications/push/fcm | Add a FCM push configuration |
| [**addHmsPushConfiguration**](ApplicationApi.md#addHmsPushConfiguration) | **POST** /v3/applications/push/hms | Add an HMS push configuration |
| [**addIpToWhitelist**](ApplicationApi.md#addIpToWhitelist) | **PUT** /v3/applications/settings/ip_whitelist | Add an IP to a whitelist |
| [**banUsersInChannelsWithCustomChannelType**](ApplicationApi.md#banUsersInChannelsWithCustomChannelType) | **POST** /v3/applications/settings_by_channel_custom_type/{custom_type}/ban | Ban users in channels with a custom channel type |
| [**configureAutoEventMessages**](ApplicationApi.md#configureAutoEventMessages) | **PUT** /v3/applications/settings/auto_event_message | Configure auto event message settings |
| [**deleteAllowedIpsFromWhitelist**](ApplicationApi.md#deleteAllowedIpsFromWhitelist) | **DELETE** /v3/applications/settings/ip_whitelist | Delete allowed IPs from a whitelist |
| [**deleteApnsCertificateById**](ApplicationApi.md#deleteApnsCertificateById) | **DELETE** /v3/applications/push/apns/cert/{provider_id} | Delete an APNs certificate |
| [**generateSecondaryApiToken**](ApplicationApi.md#generateSecondaryApiToken) | **POST** /v3/applications/api_tokens | Generate a secondary API token |
| [**listAutoEventMessages**](ApplicationApi.md#listAutoEventMessages) | **GET** /v3/applications/settings/auto_event_message | List auto event messages |
| [**listBannedUsersInChannelsWithCustomChannelType**](ApplicationApi.md#listBannedUsersInChannelsWithCustomChannelType) | **GET** /v3/applications/settings_by_channel_custom_type/{custom_type}/ban | List banned users in channels with a custom channel type |
| [**listMutedUsersInChannelsWithCustomChannelType**](ApplicationApi.md#listMutedUsersInChannelsWithCustomChannelType) | **GET** /v3/applications/settings_by_channel_custom_type/{custom_type}/mute | List muted users in channels with a custom channel type |
| [**listPushConfigurations**](ApplicationApi.md#listPushConfigurations) | **GET** /v3/applications/push/{push_type} | List push configurations |
| [**listPushNotificationContentTemplates**](ApplicationApi.md#listPushNotificationContentTemplates) | **GET** /v3/applications/push/message_templates | List push notification content templates |
| [**listSecondaryApiTokens**](ApplicationApi.md#listSecondaryApiTokens) | **GET** /v3/applications/api_tokens | List secondary API tokens |
| [**muteUsersInChannelsWithCustomChannelType**](ApplicationApi.md#muteUsersInChannelsWithCustomChannelType) | **POST** /v3/applications/settings_by_channel_custom_type/{custom_type}/mute | Mute users in channels with a custom channel type |
| [**removePushConfigurationById**](ApplicationApi.md#removePushConfigurationById) | **DELETE** /v3/applications/push/{push_type}/{provider_id} | Remove a push configuration |
| [**retrieveIpWhitelist**](ApplicationApi.md#retrieveIpWhitelist) | **GET** /v3/applications/settings/ip_whitelist | Retrieve an IP whitelist |
| [**revokeSecondaryApiTokenByToken**](ApplicationApi.md#revokeSecondaryApiTokenByToken) | **DELETE** /v3/applications/api_tokens/{api_token} | Revoke a secondary API token |
| [**setDomainFilter**](ApplicationApi.md#setDomainFilter) | **PUT** /v3/applications/settings_global/{custom_type} | Message moderation |
| [**unbanUsersInChannelsWithCustomChannelType**](ApplicationApi.md#unbanUsersInChannelsWithCustomChannelType) | **DELETE** /v3/applications/settings_by_channel_custom_type/{custom_type}/ban | Unban users in channels with a custom channel type |
| [**unmuteUsersInChannelsWithCustomChannelType**](ApplicationApi.md#unmuteUsersInChannelsWithCustomChannelType) | **DELETE** /v3/applications/settings_by_channel_custom_type/{custom_type}/mute | Unmute users in channels with a custom channel type |
| [**updateApnsPushConfigurationById**](ApplicationApi.md#updateApnsPushConfigurationById) | **PUT** /v3/applications/push/apns/{provider_id} | Update an APNs push configuration |
| [**updateDefaultChannelInvitationPreference**](ApplicationApi.md#updateDefaultChannelInvitationPreference) | **PUT** /v3/applications/default_channel_invitation_preference | Update default channel invitation preference |
| [**updateFcmPushConfigurationById**](ApplicationApi.md#updateFcmPushConfigurationById) | **PUT** /v3/applications/push/fcm/{provider_id} | Update a FCM push configuration |
| [**updateHmsPushConfigurationById**](ApplicationApi.md#updateHmsPushConfigurationById) | **PUT** /v3/applications/push/hms/{provider_id} | Update an HMS push configuration |
| [**updatePushNotificationContentTemplate**](ApplicationApi.md#updatePushNotificationContentTemplate) | **PUT** /v3/applications/push/message_templates/{template_name} | Update a push notification content template |
| [**viewDefaultChannelInvitationPreference**](ApplicationApi.md#viewDefaultChannelInvitationPreference) | **GET** /v3/applications/default_channel_invitation_preference | View default channel invitation preference |
| [**viewPushConfigurationById**](ApplicationApi.md#viewPushConfigurationById) | **GET** /v3/applications/push/{push_type}/{provider_id} | View a push configuration |
| [**viewPushNotificationContentTemplate**](ApplicationApi.md#viewPushNotificationContentTemplate) | **GET** /v3/applications/push/message_templates/{template_name} | View a push notification content template |
| [**viewSecondaryApiTokenByToken**](ApplicationApi.md#viewSecondaryApiTokenByToken) | **GET** /v3/applications/api_tokens/{api_token} | View a secondary API token |



## addApnsPushConfiguration

> AddApnsPushConfigurationResponse addApnsPushConfiguration().apiToken(apiToken).addApnsPushConfigurationData(addApnsPushConfigurationData).execute();

Add an APNs push configuration

## Add an APNs push configuration

Registers an APNs (Apple Push Notification service) push configuration for your client app. To send push notifications to iOS devices, your should first register the APNs push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings > Application > Notifications.

> __Note__: To upload a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests).

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-apns-push-configuration

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        AddApnsPushConfigurationData addApnsPushConfigurationData = new AddApnsPushConfigurationData(); // AddApnsPushConfigurationData | 
        try {
            AddApnsPushConfigurationResponse result = api.addApnsPushConfiguration()
                .apiToken(apiToken)
                .addApnsPushConfigurationData(addApnsPushConfigurationData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#addApnsPushConfiguration");
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
| **addApnsPushConfigurationData** | [**AddApnsPushConfigurationData**](AddApnsPushConfigurationData.md)|  | [optional] |

### Return type

[**AddApnsPushConfigurationResponse**](AddApnsPushConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## addFcmPushConfiguration

> AddFcmPushConfigurationResponse addFcmPushConfiguration().apiToken(apiToken).addFcmPushConfigurationData(addFcmPushConfigurationData).execute();

Add a FCM push configuration

## Add a FCM push configuration

Registers a FCM (Firebase Cloud Messaging) push configuration for your client app. To send push notifications to Android devices, you should first register the FCM push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings > Application > Notifications.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-a-fcm-push-configuration

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        AddFcmPushConfigurationData addFcmPushConfigurationData = new AddFcmPushConfigurationData(); // AddFcmPushConfigurationData | 
        try {
            AddFcmPushConfigurationResponse result = api.addFcmPushConfiguration()
                .apiToken(apiToken)
                .addFcmPushConfigurationData(addFcmPushConfigurationData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#addFcmPushConfiguration");
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
| **addFcmPushConfigurationData** | [**AddFcmPushConfigurationData**](AddFcmPushConfigurationData.md)|  | [optional] |

### Return type

[**AddFcmPushConfigurationResponse**](AddFcmPushConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## addHmsPushConfiguration

> AddHmsPushConfigurationResponse addHmsPushConfiguration().apiToken(apiToken).addHmsPushConfigurationData(addHmsPushConfigurationData).execute();

Add an HMS push configuration

## Add an HMS push configuration

Registers an HMS (Huawei Mobile Services) push configuration for your client app. To send push notifications to Android devices for HMS, you should first register the HMS push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings > Application > Notifications.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-hms-push-configuration

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        AddHmsPushConfigurationData addHmsPushConfigurationData = new AddHmsPushConfigurationData(); // AddHmsPushConfigurationData | 
        try {
            AddHmsPushConfigurationResponse result = api.addHmsPushConfiguration()
                .apiToken(apiToken)
                .addHmsPushConfigurationData(addHmsPushConfigurationData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#addHmsPushConfiguration");
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
| **addHmsPushConfigurationData** | [**AddHmsPushConfigurationData**](AddHmsPushConfigurationData.md)|  | [optional] |

### Return type

[**AddHmsPushConfigurationResponse**](AddHmsPushConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## addIpToWhitelist

> AddIpToWhitelistResponse addIpToWhitelist().apiToken(apiToken).addIpToWhitelistData(addIpToWhitelistData).execute();

Add an IP to a whitelist

## Add an IP to a whitelist

Adds IP addresses and ranges to your Sendbird application settings. Both currently added and any previously added IPs are granted API access. You can configure the IP whitelist under Settings > Security > Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-ip-to-a-whitelist

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        AddIpToWhitelistData addIpToWhitelistData = new AddIpToWhitelistData(); // AddIpToWhitelistData | 
        try {
            AddIpToWhitelistResponse result = api.addIpToWhitelist()
                .apiToken(apiToken)
                .addIpToWhitelistData(addIpToWhitelistData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#addIpToWhitelist");
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
| **addIpToWhitelistData** | [**AddIpToWhitelistData**](AddIpToWhitelistData.md)|  | [optional] |

### Return type

[**AddIpToWhitelistResponse**](AddIpToWhitelistResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## banUsersInChannelsWithCustomChannelType

> Object banUsersInChannelsWithCustomChannelType(customType).apiToken(apiToken).banUsersInChannelsWithCustomChannelTypeData(banUsersInChannelsWithCustomChannelTypeData).execute();

Ban users in channels with a custom channel type

## Ban specified users in channels with a custom channel type at once.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String customType = "customType_example"; // String | 
        BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData = new BanUsersInChannelsWithCustomChannelTypeData(); // BanUsersInChannelsWithCustomChannelTypeData | 
        try {
            Object result = api.banUsersInChannelsWithCustomChannelType(customType)
                .apiToken(apiToken)
                .banUsersInChannelsWithCustomChannelTypeData(banUsersInChannelsWithCustomChannelTypeData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#banUsersInChannelsWithCustomChannelType");
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
| **customType** | **String**|  | |
| **banUsersInChannelsWithCustomChannelTypeData** | [**BanUsersInChannelsWithCustomChannelTypeData**](BanUsersInChannelsWithCustomChannelTypeData.md)|  | [optional] |

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


## configureAutoEventMessages

> SendBirdAutoEventMessageSettings configureAutoEventMessages().apiToken(apiToken).configureAutoEventData(configureAutoEventData).execute();

Configure auto event message settings

## Configure auto event message settings

Determines whether to automatically send event messages to group channels when events take place in an application. You can choose which auto event message to receive on the Sendbird Dashboard

https://sendbird.com/docs/chat/v3/platform-api/application/managing-auto-event-messages/configure-auto-event-message-settings
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        ConfigureAutoEventData configureAutoEventData = new ConfigureAutoEventData(); // ConfigureAutoEventData | 
        try {
            SendBirdAutoEventMessageSettings result = api.configureAutoEventMessages()
                .apiToken(apiToken)
                .configureAutoEventData(configureAutoEventData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#configureAutoEventMessages");
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
| **configureAutoEventData** | [**ConfigureAutoEventData**](ConfigureAutoEventData.md)|  | [optional] |

### Return type

[**SendBirdAutoEventMessageSettings**](SendBirdAutoEventMessageSettings.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteAllowedIpsFromWhitelist

> DeleteAllowedIpsFromWhitelistResponse deleteAllowedIpsFromWhitelist().apiToken(apiToken).ipWhitelistAddresses(ipWhitelistAddresses).execute();

Delete allowed IPs from a whitelist

## Delete allowed IPs from a whitelist

Deletes allowed IPs from the whitelist by specifying their IP addresses or ranges. You can configure the IP whitelist under Settings > Security > Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-allowed-ips-from-a-whitelist

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        List<String> ipWhitelistAddresses = Arrays.asList(); // List<String> | 
        try {
            DeleteAllowedIpsFromWhitelistResponse result = api.deleteAllowedIpsFromWhitelist()
                .apiToken(apiToken)
                .ipWhitelistAddresses(ipWhitelistAddresses)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#deleteAllowedIpsFromWhitelist");
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
| **ipWhitelistAddresses** | **List&lt;String&gt;**|  | |

### Return type

[**DeleteAllowedIpsFromWhitelistResponse**](DeleteAllowedIpsFromWhitelistResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## deleteApnsCertificateById

> DeleteApnsCertificateByIdResponse deleteApnsCertificateById(providerId).apiToken(apiToken).execute();

Delete an APNs certificate

## Delete an APNs certificate

Deletes a specific APNs certificate.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-an-apns-certificate
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String providerId = "providerId_example"; // String | 
        try {
            DeleteApnsCertificateByIdResponse result = api.deleteApnsCertificateById(providerId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#deleteApnsCertificateById");
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
| **providerId** | **String**|  | |

### Return type

[**DeleteApnsCertificateByIdResponse**](DeleteApnsCertificateByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## generateSecondaryApiToken

> GenerateSecondaryApiTokenResponse generateSecondaryApiToken().apiToken(apiToken).generateSecondaryApiTokenData(generateSecondaryApiTokenData).execute();

Generate a secondary API token

## Generate a secondary API token

Generates a new secondary API token.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-generate-a-secondary-api-token

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        GenerateSecondaryApiTokenData generateSecondaryApiTokenData = new GenerateSecondaryApiTokenData(); // GenerateSecondaryApiTokenData | 
        try {
            GenerateSecondaryApiTokenResponse result = api.generateSecondaryApiToken()
                .apiToken(apiToken)
                .generateSecondaryApiTokenData(generateSecondaryApiTokenData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#generateSecondaryApiToken");
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
| **generateSecondaryApiTokenData** | [**GenerateSecondaryApiTokenData**](GenerateSecondaryApiTokenData.md)|  | [optional] |

### Return type

[**GenerateSecondaryApiTokenResponse**](GenerateSecondaryApiTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listAutoEventMessages

> SendBirdAutoEventMessageSettings listAutoEventMessages().apiToken(apiToken).execute();

List auto event messages

## List auto event messages

Retrieves a list of auto event messages that are sent in a specified application and indicates which ones are in use. Auto event messages are Admin messages that are automatically generated when a specific event occurs.

https://sendbird.com/docs/chat/v3/platform-api/application/managing-auto-event-messages/list-auto-event-messages
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            SendBirdAutoEventMessageSettings result = api.listAutoEventMessages()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#listAutoEventMessages");
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

### Return type

[**SendBirdAutoEventMessageSettings**](SendBirdAutoEventMessageSettings.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listBannedUsersInChannelsWithCustomChannelType

> CustomTypeListBannedUsersResponse listBannedUsersInChannelsWithCustomChannelType(customType).apiToken(apiToken).token(token).limit(limit).execute();

List banned users in channels with a custom channel type

## Retrieves a list of users banned from channels with the specified custom channel type.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String customType = "customType_example"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            CustomTypeListBannedUsersResponse result = api.listBannedUsersInChannelsWithCustomChannelType(customType)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#listBannedUsersInChannelsWithCustomChannelType");
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
| **customType** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**CustomTypeListBannedUsersResponse**](CustomTypeListBannedUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listMutedUsersInChannelsWithCustomChannelType

> ListMutedUsersInChannelsWithCustomChannelType200Response listMutedUsersInChannelsWithCustomChannelType(customType).apiToken(apiToken).token(token).limit(limit).execute();

List muted users in channels with a custom channel type

## Retrieves a list of the muted users in channels with a custom channel type.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String customType = "customType_example"; // String | 
        String token = "token_example"; // String | 
        Integer limit = 56; // Integer | 
        try {
            ListMutedUsersInChannelsWithCustomChannelType200Response result = api.listMutedUsersInChannelsWithCustomChannelType(customType)
                .apiToken(apiToken)
                .token(token)
                .limit(limit)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#listMutedUsersInChannelsWithCustomChannelType");
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
| **customType** | **String**|  | |
| **token** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListMutedUsersInChannelsWithCustomChannelType200Response**](ListMutedUsersInChannelsWithCustomChannelType200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listPushConfigurations

> ListPushConfigurationsResponse listPushConfigurations(pushType).apiToken(apiToken).execute();

List push configurations

## List push configurations

Retrieves a list of an application's registered push configurations.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-configurations
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String pushType = "pushType_example"; // String | 
        try {
            ListPushConfigurationsResponse result = api.listPushConfigurations(pushType)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#listPushConfigurations");
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
| **pushType** | **String**|  | |

### Return type

[**ListPushConfigurationsResponse**](ListPushConfigurationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listPushNotificationContentTemplates

> ListPushNotificationContentTemplatesResponse listPushNotificationContentTemplates().apiToken(apiToken).execute();

List push notification content templates

## List push notification content templates

Retrieves a list of push notification content templates of an application.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-notification-content-templates

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListPushNotificationContentTemplatesResponse result = api.listPushNotificationContentTemplates()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#listPushNotificationContentTemplates");
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

### Return type

[**ListPushNotificationContentTemplatesResponse**](ListPushNotificationContentTemplatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## listSecondaryApiTokens

> ListSecondaryApiTokensResponse listSecondaryApiTokens().apiToken(apiToken).execute();

List secondary API tokens

## List secondary API tokens

Retrieves a list of secondary API tokens.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-secondary-api-tokens

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ListSecondaryApiTokensResponse result = api.listSecondaryApiTokens()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#listSecondaryApiTokens");
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

### Return type

[**ListSecondaryApiTokensResponse**](ListSecondaryApiTokensResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## muteUsersInChannelsWithCustomChannelType

> Object muteUsersInChannelsWithCustomChannelType(customType).apiToken(apiToken).muteUsersInChannelsWithCustomChannelTypeData(muteUsersInChannelsWithCustomChannelTypeData).execute();

Mute users in channels with a custom channel type

## Mutes specified users in channels with a custom channel type at once.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String customType = "customType_example"; // String | 
        MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData = new MuteUsersInChannelsWithCustomChannelTypeData(); // MuteUsersInChannelsWithCustomChannelTypeData | 
        try {
            Object result = api.muteUsersInChannelsWithCustomChannelType(customType)
                .apiToken(apiToken)
                .muteUsersInChannelsWithCustomChannelTypeData(muteUsersInChannelsWithCustomChannelTypeData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#muteUsersInChannelsWithCustomChannelType");
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
| **customType** | **String**|  | |
| **muteUsersInChannelsWithCustomChannelTypeData** | [**MuteUsersInChannelsWithCustomChannelTypeData**](MuteUsersInChannelsWithCustomChannelTypeData.md)|  | [optional] |

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


## removePushConfigurationById

> RemovePushConfigurationByIdResponse removePushConfigurationById(pushType, providerId).apiToken(apiToken).execute();

Remove a push configuration

## Remove a push configuration

Removes a specific push configuration from an application. The type of a push configuration is either `fcm`, `huawei`, or `apns`.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-remove-a-push-configuration
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String pushType = "pushType_example"; // String | 
        String providerId = "providerId_example"; // String | 
        try {
            RemovePushConfigurationByIdResponse result = api.removePushConfigurationById(pushType, providerId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#removePushConfigurationById");
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
| **pushType** | **String**|  | |
| **providerId** | **String**|  | |

### Return type

[**RemovePushConfigurationByIdResponse**](RemovePushConfigurationByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## retrieveIpWhitelist

> RetrieveIpWhitelistResponse retrieveIpWhitelist().apiToken(apiToken).execute();

Retrieve an IP whitelist

## Retrieve an IP whitelist

Retrieves a list of all the IP ranges and addresses that have access to your Sendbird application. This list is called an IP whitelist and its addresses are granted API access when the IP whitelist API enables [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notations.

If you specify which IP addresses or ranges to include in the whitelist, any unlisted foreign IP addresses will be denied access. If you don't specify any IP address or range to include in the whitelist, all IP addresses will be granted API access. You can configure the IP whitelist under Settings > Security > Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-retrieve-an-ip-whitelist

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            RetrieveIpWhitelistResponse result = api.retrieveIpWhitelist()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#retrieveIpWhitelist");
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

### Return type

[**RetrieveIpWhitelistResponse**](RetrieveIpWhitelistResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## revokeSecondaryApiTokenByToken

> RevokeSecondaryApiTokenByTokenResponse revokeSecondaryApiTokenByToken(apiToken2).apiToken(apiToken).execute();

Revoke a secondary API token

## Revoke a secondary API token

Revokes a secondary API token.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-revoke-a-secondary-api-token

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String apiToken2 = "apiToken_example"; // String | 
        try {
            RevokeSecondaryApiTokenByTokenResponse result = api.revokeSecondaryApiTokenByToken(apiToken2)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#revokeSecondaryApiTokenByToken");
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
| **apiToken2** | **String**|  | |

### Return type

[**RevokeSecondaryApiTokenByTokenResponse**](RevokeSecondaryApiTokenByTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## setDomainFilter

> SendBirdChannelResponse setDomainFilter(customType).apiToken(apiToken).setDomainFilterData(setDomainFilterData).execute();

Message moderation

## 

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String customType = "customType_example"; // String | 
        SetDomainFilterData setDomainFilterData = new SetDomainFilterData(); // SetDomainFilterData | 
        try {
            SendBirdChannelResponse result = api.setDomainFilter(customType)
                .apiToken(apiToken)
                .setDomainFilterData(setDomainFilterData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#setDomainFilter");
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
| **customType** | **String**|  | |
| **setDomainFilterData** | [**SetDomainFilterData**](SetDomainFilterData.md)|  | [optional] |

### Return type

[**SendBirdChannelResponse**](SendBirdChannelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## unbanUsersInChannelsWithCustomChannelType

> Object unbanUsersInChannelsWithCustomChannelType(customType).apiToken(apiToken).userIds(userIds).execute();

Unban users in channels with a custom channel type

## Unban specified users in channels with a custom channel type at once.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String customType = "customType_example"; // String | 
        List<String> userIds = Arrays.asList(); // List<String> | 
        try {
            Object result = api.unbanUsersInChannelsWithCustomChannelType(customType)
                .apiToken(apiToken)
                .userIds(userIds)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#unbanUsersInChannelsWithCustomChannelType");
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
| **customType** | **String**|  | |
| **userIds** | **List&lt;String&gt;**|  | |

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


## unmuteUsersInChannelsWithCustomChannelType

> Object unmuteUsersInChannelsWithCustomChannelType(customType).apiToken(apiToken).userIds(userIds).execute();

Unmute users in channels with a custom channel type

## Unmute specified users in channels with a custom channel type at once.

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String customType = "customType_example"; // String | 
        List<String> userIds = Arrays.asList(); // List<String> | 
        try {
            Object result = api.unmuteUsersInChannelsWithCustomChannelType(customType)
                .apiToken(apiToken)
                .userIds(userIds)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#unmuteUsersInChannelsWithCustomChannelType");
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
| **customType** | **String**|  | |
| **userIds** | **List&lt;String&gt;**|  | |

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


## updateApnsPushConfigurationById

> UpdateApnsPushConfigurationByIdResponse updateApnsPushConfigurationById(providerId).apiToken(apiToken).updateApnsPushConfigurationByIdData(updateApnsPushConfigurationByIdData).execute();

Update an APNs push configuration

## Update an APNs push configuration

Updates a specific APNs (Apple Push Notification service) push configuration for your client app. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings > Application > Notifications.

> __Note__: If your HTTP request body contains a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to upload to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests) .

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-apns-push-configuration
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String providerId = "providerId_example"; // String | 
        UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData = new UpdateApnsPushConfigurationByIdData(); // UpdateApnsPushConfigurationByIdData | 
        try {
            UpdateApnsPushConfigurationByIdResponse result = api.updateApnsPushConfigurationById(providerId)
                .apiToken(apiToken)
                .updateApnsPushConfigurationByIdData(updateApnsPushConfigurationByIdData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#updateApnsPushConfigurationById");
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
| **providerId** | **String**|  | |
| **updateApnsPushConfigurationByIdData** | [**UpdateApnsPushConfigurationByIdData**](UpdateApnsPushConfigurationByIdData.md)|  | [optional] |

### Return type

[**UpdateApnsPushConfigurationByIdResponse**](UpdateApnsPushConfigurationByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateDefaultChannelInvitationPreference

> UpdateDefaultChannelInvitationPreferenceResponse updateDefaultChannelInvitationPreference().apiToken(apiToken).updateDefaultChannelInvitationPreferenceData(updateDefaultChannelInvitationPreferenceData).execute();

Update default channel invitation preference

## Update default channel invitation preference

Updates the default channel invitation preference of an application.

> __Note__: Using the [update channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can update the value of a specific user's channel invitation preference, which can be set individually by user.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        UpdateDefaultChannelInvitationPreferenceData updateDefaultChannelInvitationPreferenceData = new UpdateDefaultChannelInvitationPreferenceData(); // UpdateDefaultChannelInvitationPreferenceData | 
        try {
            UpdateDefaultChannelInvitationPreferenceResponse result = api.updateDefaultChannelInvitationPreference()
                .apiToken(apiToken)
                .updateDefaultChannelInvitationPreferenceData(updateDefaultChannelInvitationPreferenceData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#updateDefaultChannelInvitationPreference");
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
| **updateDefaultChannelInvitationPreferenceData** | [**UpdateDefaultChannelInvitationPreferenceData**](UpdateDefaultChannelInvitationPreferenceData.md)|  | [optional] |

### Return type

[**UpdateDefaultChannelInvitationPreferenceResponse**](UpdateDefaultChannelInvitationPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateFcmPushConfigurationById

> UpdateFcmPushConfigurationByIdResponse updateFcmPushConfigurationById(providerId).apiToken(apiToken).updateFcmPushConfigurationByIdData(updateFcmPushConfigurationByIdData).execute();

Update a FCM push configuration

## Update a FCM push configuration

Updates a specific FCM (Firebase Cloud Messaging) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings > Application > Notifications.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-fcm-push-configuration
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String providerId = "providerId_example"; // String | 
        UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData = new UpdateFcmPushConfigurationByIdData(); // UpdateFcmPushConfigurationByIdData | 
        try {
            UpdateFcmPushConfigurationByIdResponse result = api.updateFcmPushConfigurationById(providerId)
                .apiToken(apiToken)
                .updateFcmPushConfigurationByIdData(updateFcmPushConfigurationByIdData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#updateFcmPushConfigurationById");
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
| **providerId** | **String**|  | |
| **updateFcmPushConfigurationByIdData** | [**UpdateFcmPushConfigurationByIdData**](UpdateFcmPushConfigurationByIdData.md)|  | [optional] |

### Return type

[**UpdateFcmPushConfigurationByIdResponse**](UpdateFcmPushConfigurationByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updateHmsPushConfigurationById

> UpdateHmsPushConfigurationByIdResponse updateHmsPushConfigurationById(providerId).apiToken(apiToken).updateHmsPushConfigurationByIdData(updateHmsPushConfigurationByIdData).execute();

Update an HMS push configuration

## Update an HMS push configuration

Updates a specific HMS (Huawei Mobile Services) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings > Application > Notifications.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-hms-push-configuration
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String providerId = "providerId_example"; // String | 
        UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData = new UpdateHmsPushConfigurationByIdData(); // UpdateHmsPushConfigurationByIdData | 
        try {
            UpdateHmsPushConfigurationByIdResponse result = api.updateHmsPushConfigurationById(providerId)
                .apiToken(apiToken)
                .updateHmsPushConfigurationByIdData(updateHmsPushConfigurationByIdData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#updateHmsPushConfigurationById");
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
| **providerId** | **String**|  | |
| **updateHmsPushConfigurationByIdData** | [**UpdateHmsPushConfigurationByIdData**](UpdateHmsPushConfigurationByIdData.md)|  | [optional] |

### Return type

[**UpdateHmsPushConfigurationByIdResponse**](UpdateHmsPushConfigurationByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## updatePushNotificationContentTemplate

> UpdatePushNotificationContentTemplateResponse updatePushNotificationContentTemplate(templateName).apiToken(apiToken).updatePushNotificationContentTemplateData(updatePushNotificationContentTemplateData).execute();

Update a push notification content template

## Update a push notification content template

Updates a specific push notification content template of an application. The name of a content template is either `default` or `alternative`.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-push-notification-content-template
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String templateName = "templateName_example"; // String | 
        UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData = new UpdatePushNotificationContentTemplateData(); // UpdatePushNotificationContentTemplateData | 
        try {
            UpdatePushNotificationContentTemplateResponse result = api.updatePushNotificationContentTemplate(templateName)
                .apiToken(apiToken)
                .updatePushNotificationContentTemplateData(updatePushNotificationContentTemplateData)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#updatePushNotificationContentTemplate");
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
| **templateName** | **String**|  | |
| **updatePushNotificationContentTemplateData** | [**UpdatePushNotificationContentTemplateData**](UpdatePushNotificationContentTemplateData.md)|  | [optional] |

### Return type

[**UpdatePushNotificationContentTemplateResponse**](UpdatePushNotificationContentTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewDefaultChannelInvitationPreference

> ViewDefaultChannelInvitationPreferenceResponse viewDefaultChannelInvitationPreference().apiToken(apiToken).execute();

View default channel invitation preference

## View default channel invitation preference

Retrieves the default channel invitation preference of an application.

> __Note__: Using the [view channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference) action, you can retrieve the value of a specific user's channel invitation preference, which can be set individually by user.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        try {
            ViewDefaultChannelInvitationPreferenceResponse result = api.viewDefaultChannelInvitationPreference()
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#viewDefaultChannelInvitationPreference");
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

### Return type

[**ViewDefaultChannelInvitationPreferenceResponse**](ViewDefaultChannelInvitationPreferenceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewPushConfigurationById

> ViewPushConfigurationByIdResponse viewPushConfigurationById(pushType, providerId).apiToken(apiToken).execute();

View a push configuration

## View a push configuration

Retrieves a specific push configuration of an application. The type of a push configuration is either `fcm`, `huawei`, or `apns`.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-configuration
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String pushType = "pushType_example"; // String | 
        String providerId = "providerId_example"; // String | 
        try {
            ViewPushConfigurationByIdResponse result = api.viewPushConfigurationById(pushType, providerId)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#viewPushConfigurationById");
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
| **pushType** | **String**|  | |
| **providerId** | **String**|  | |

### Return type

[**ViewPushConfigurationByIdResponse**](ViewPushConfigurationByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewPushNotificationContentTemplate

> ViewPushNotificationContentTemplateResponse viewPushNotificationContentTemplate(templateName).apiToken(apiToken).execute();

View a push notification content template

## View a push notification content template

Retrieves information on a specific push notification content templates of an application. The name of a content template is either `default` or `alternative`.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-notification-content-template
----------------------------

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String templateName = "templateName_example"; // String | 
        try {
            ViewPushNotificationContentTemplateResponse result = api.viewPushNotificationContentTemplate(templateName)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#viewPushNotificationContentTemplate");
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
| **templateName** | **String**|  | |

### Return type

[**ViewPushNotificationContentTemplateResponse**](ViewPushNotificationContentTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## viewSecondaryApiTokenByToken

> ViewSecondaryApiTokenByTokenResponse viewSecondaryApiTokenByToken(apiToken2).apiToken(apiToken).execute();

View a secondary API token

## View a secondary API token

Retrieves the information on a secondary API token.

https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-secondary-api-token

### Example

```java
// Import classes:
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.model.*;
import org.sendbird.client.api.ApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-APP_ID.sendbird.com");

        ApplicationApi apiInstance = new ApplicationApi(defaultClient);
        String apiToken = "{{API_TOKEN}}"; // String | 
        String apiToken2 = "apiToken_example"; // String | 
        try {
            ViewSecondaryApiTokenByTokenResponse result = api.viewSecondaryApiTokenByToken(apiToken2)
                .apiToken(apiToken)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApplicationApi#viewSecondaryApiTokenByToken");
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
| **apiToken2** | **String**|  | |

### Return type

[**ViewSecondaryApiTokenByTokenResponse**](ViewSecondaryApiTokenByTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

