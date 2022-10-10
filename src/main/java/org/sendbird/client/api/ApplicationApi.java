package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.AddApnsPushConfigurationData;
import org.openapitools.client.model.AddApnsPushConfigurationResponse;
import org.openapitools.client.model.AddFcmPushConfigurationData;
import org.openapitools.client.model.AddFcmPushConfigurationResponse;
import org.openapitools.client.model.AddHmsPushConfigurationData;
import org.openapitools.client.model.AddHmsPushConfigurationResponse;
import org.openapitools.client.model.AddIpToWhitelistData;
import org.openapitools.client.model.AddIpToWhitelistResponse;
import org.openapitools.client.model.BanUsersInChannelsWithCustomChannelTypeData;
import org.openapitools.client.model.CustomTypeListBannedUsersResponse;
import org.openapitools.client.model.DeleteAllowedIpsFromWhitelistResponse;
import org.openapitools.client.model.DeleteApnsCertificateByIdResponse;
import org.openapitools.client.model.GenerateSecondaryApiTokenData;
import org.openapitools.client.model.GenerateSecondaryApiTokenResponse;
import org.openapitools.client.model.ListMutedUsersInChannelsWithCustomChannelType200Response;
import org.openapitools.client.model.ListPushConfigurationsResponse;
import org.openapitools.client.model.ListPushNotificationContentTemplatesResponse;
import org.openapitools.client.model.ListSecondaryApiTokensResponse;
import org.openapitools.client.model.MuteUsersInChannelsWithCustomChannelTypeData;
import org.openapitools.client.model.RemovePushConfigurationByIdResponse;
import org.openapitools.client.model.RetrieveIpWhitelistResponse;
import org.openapitools.client.model.RevokeSecondaryApiTokenByTokenResponse;
import org.openapitools.client.model.SendBirdChannelResponse;
import org.openapitools.client.model.SetDomainFilterData;
import org.openapitools.client.model.UpdateApnsPushConfigurationByIdData;
import org.openapitools.client.model.UpdateApnsPushConfigurationByIdResponse;
import org.openapitools.client.model.UpdateDefaultChannelInvitationPreferenceData;
import org.openapitools.client.model.UpdateDefaultChannelInvitationPreferenceResponse;
import org.openapitools.client.model.UpdateFcmPushConfigurationByIdData;
import org.openapitools.client.model.UpdateFcmPushConfigurationByIdResponse;
import org.openapitools.client.model.UpdateHmsPushConfigurationByIdData;
import org.openapitools.client.model.UpdateHmsPushConfigurationByIdResponse;
import org.openapitools.client.model.UpdatePushNotificationContentTemplateData;
import org.openapitools.client.model.UpdatePushNotificationContentTemplateResponse;
import org.openapitools.client.model.ViewDefaultChannelInvitationPreferenceResponse;
import org.openapitools.client.model.ViewPushConfigurationByIdResponse;
import org.openapitools.client.model.ViewPushNotificationContentTemplateResponse;
import org.openapitools.client.model.ViewSecondaryApiTokenByTokenResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class ApplicationApi {
  private ApiClient apiClient;

  public ApplicationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add an APNs push configuration
   * ## Add an APNs push configuration  Registers an APNs (Apple Push Notification service) push configuration for your client app. To send push notifications to iOS devices, your should first register the APNs push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: To upload a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-apns-push-configuration
   * @param apiToken  (required)
   * @param addApnsPushConfigurationData  (optional)
   * @return AddApnsPushConfigurationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddApnsPushConfigurationResponse addApnsPushConfiguration(String apiToken, AddApnsPushConfigurationData addApnsPushConfigurationData) throws ApiException {
    return addApnsPushConfigurationWithHttpInfo(apiToken, addApnsPushConfigurationData).getData();
  }

  /**
   * Add an APNs push configuration
   * ## Add an APNs push configuration  Registers an APNs (Apple Push Notification service) push configuration for your client app. To send push notifications to iOS devices, your should first register the APNs push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: To upload a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-apns-push-configuration
   * @param apiToken  (required)
   * @param addApnsPushConfigurationData  (optional)
   * @return ApiResponse&lt;AddApnsPushConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddApnsPushConfigurationResponse> addApnsPushConfigurationWithHttpInfo(String apiToken, AddApnsPushConfigurationData addApnsPushConfigurationData) throws ApiException {
    Object localVarPostBody = addApnsPushConfigurationData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addApnsPushConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/apns";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AddApnsPushConfigurationResponse> localVarReturnType = new GenericType<AddApnsPushConfigurationResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.addApnsPushConfiguration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add a FCM push configuration
   * ## Add a FCM push configuration  Registers a FCM (Firebase Cloud Messaging) push configuration for your client app. To send push notifications to Android devices, you should first register the FCM push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-a-fcm-push-configuration
   * @param apiToken  (required)
   * @param addFcmPushConfigurationData  (optional)
   * @return AddFcmPushConfigurationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddFcmPushConfigurationResponse addFcmPushConfiguration(String apiToken, AddFcmPushConfigurationData addFcmPushConfigurationData) throws ApiException {
    return addFcmPushConfigurationWithHttpInfo(apiToken, addFcmPushConfigurationData).getData();
  }

  /**
   * Add a FCM push configuration
   * ## Add a FCM push configuration  Registers a FCM (Firebase Cloud Messaging) push configuration for your client app. To send push notifications to Android devices, you should first register the FCM push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-a-fcm-push-configuration
   * @param apiToken  (required)
   * @param addFcmPushConfigurationData  (optional)
   * @return ApiResponse&lt;AddFcmPushConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddFcmPushConfigurationResponse> addFcmPushConfigurationWithHttpInfo(String apiToken, AddFcmPushConfigurationData addFcmPushConfigurationData) throws ApiException {
    Object localVarPostBody = addFcmPushConfigurationData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addFcmPushConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/fcm";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AddFcmPushConfigurationResponse> localVarReturnType = new GenericType<AddFcmPushConfigurationResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.addFcmPushConfiguration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add an HMS push configuration
   * ## Add an HMS push configuration  Registers an HMS (Huawei Mobile Services) push configuration for your client app. To send push notifications to Android devices for HMS, you should first register the HMS push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-hms-push-configuration
   * @param apiToken  (required)
   * @param addHmsPushConfigurationData  (optional)
   * @return AddHmsPushConfigurationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddHmsPushConfigurationResponse addHmsPushConfiguration(String apiToken, AddHmsPushConfigurationData addHmsPushConfigurationData) throws ApiException {
    return addHmsPushConfigurationWithHttpInfo(apiToken, addHmsPushConfigurationData).getData();
  }

  /**
   * Add an HMS push configuration
   * ## Add an HMS push configuration  Registers an HMS (Huawei Mobile Services) push configuration for your client app. To send push notifications to Android devices for HMS, you should first register the HMS push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-hms-push-configuration
   * @param apiToken  (required)
   * @param addHmsPushConfigurationData  (optional)
   * @return ApiResponse&lt;AddHmsPushConfigurationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddHmsPushConfigurationResponse> addHmsPushConfigurationWithHttpInfo(String apiToken, AddHmsPushConfigurationData addHmsPushConfigurationData) throws ApiException {
    Object localVarPostBody = addHmsPushConfigurationData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addHmsPushConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/hms";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AddHmsPushConfigurationResponse> localVarReturnType = new GenericType<AddHmsPushConfigurationResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.addHmsPushConfiguration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Add an IP to a whitelist
   * ## Add an IP to a whitelist  Adds IP addresses and ranges to your Sendbird application settings. Both currently added and any previously added IPs are granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-ip-to-a-whitelist
   * @param apiToken  (required)
   * @param addIpToWhitelistData  (optional)
   * @return AddIpToWhitelistResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddIpToWhitelistResponse addIpToWhitelist(String apiToken, AddIpToWhitelistData addIpToWhitelistData) throws ApiException {
    return addIpToWhitelistWithHttpInfo(apiToken, addIpToWhitelistData).getData();
  }

  /**
   * Add an IP to a whitelist
   * ## Add an IP to a whitelist  Adds IP addresses and ranges to your Sendbird application settings. Both currently added and any previously added IPs are granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-ip-to-a-whitelist
   * @param apiToken  (required)
   * @param addIpToWhitelistData  (optional)
   * @return ApiResponse&lt;AddIpToWhitelistResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddIpToWhitelistResponse> addIpToWhitelistWithHttpInfo(String apiToken, AddIpToWhitelistData addIpToWhitelistData) throws ApiException {
    Object localVarPostBody = addIpToWhitelistData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addIpToWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/ip_whitelist";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AddIpToWhitelistResponse> localVarReturnType = new GenericType<AddIpToWhitelistResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.addIpToWhitelist", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Ban users in channels with a custom channel type
   * ## Ban specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param banUsersInChannelsWithCustomChannelTypeData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object banUsersInChannelsWithCustomChannelType(String apiToken, String customType, BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData) throws ApiException {
    return banUsersInChannelsWithCustomChannelTypeWithHttpInfo(apiToken, customType, banUsersInChannelsWithCustomChannelTypeData).getData();
  }

  /**
   * Ban users in channels with a custom channel type
   * ## Ban specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param banUsersInChannelsWithCustomChannelTypeData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> banUsersInChannelsWithCustomChannelTypeWithHttpInfo(String apiToken, String customType, BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData) throws ApiException {
    Object localVarPostBody = banUsersInChannelsWithCustomChannelTypeData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling banUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'customType' is set
    if (customType == null) {
      throw new ApiException(400, "Missing the required parameter 'customType' when calling banUsersInChannelsWithCustomChannelType");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings_by_channel_custom_type/{custom_type}/ban"
      .replaceAll("\\{" + "custom_type" + "\\}", apiClient.escapeString(customType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("ApplicationApi.banUsersInChannelsWithCustomChannelType", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete allowed IPs from a whitelist
   * ## Delete allowed IPs from a whitelist  Deletes allowed IPs from the whitelist by specifying their IP addresses or ranges. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-allowed-ips-from-a-whitelist
   * @param apiToken  (required)
   * @param ipWhitelistAddresses  (required)
   * @return DeleteAllowedIpsFromWhitelistResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public DeleteAllowedIpsFromWhitelistResponse deleteAllowedIpsFromWhitelist(String apiToken, List<String> ipWhitelistAddresses) throws ApiException {
    return deleteAllowedIpsFromWhitelistWithHttpInfo(apiToken, ipWhitelistAddresses).getData();
  }

  /**
   * Delete allowed IPs from a whitelist
   * ## Delete allowed IPs from a whitelist  Deletes allowed IPs from the whitelist by specifying their IP addresses or ranges. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-allowed-ips-from-a-whitelist
   * @param apiToken  (required)
   * @param ipWhitelistAddresses  (required)
   * @return ApiResponse&lt;DeleteAllowedIpsFromWhitelistResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteAllowedIpsFromWhitelistResponse> deleteAllowedIpsFromWhitelistWithHttpInfo(String apiToken, List<String> ipWhitelistAddresses) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteAllowedIpsFromWhitelist");
    }
    
    // verify the required parameter 'ipWhitelistAddresses' is set
    if (ipWhitelistAddresses == null) {
      throw new ApiException(400, "Missing the required parameter 'ipWhitelistAddresses' when calling deleteAllowedIpsFromWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/ip_whitelist";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ip_whitelist_addresses", ipWhitelistAddresses));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DeleteAllowedIpsFromWhitelistResponse> localVarReturnType = new GenericType<DeleteAllowedIpsFromWhitelistResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.deleteAllowedIpsFromWhitelist", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an APNs certificate
   * ## Delete an APNs certificate  Deletes a specific APNs certificate.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-an-apns-certificate ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @return DeleteApnsCertificateByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public DeleteApnsCertificateByIdResponse deleteApnsCertificateById(String apiToken, String providerId) throws ApiException {
    return deleteApnsCertificateByIdWithHttpInfo(apiToken, providerId).getData();
  }

  /**
   * Delete an APNs certificate
   * ## Delete an APNs certificate  Deletes a specific APNs certificate.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-an-apns-certificate ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @return ApiResponse&lt;DeleteApnsCertificateByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteApnsCertificateByIdResponse> deleteApnsCertificateByIdWithHttpInfo(String apiToken, String providerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteApnsCertificateById");
    }
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling deleteApnsCertificateById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/apns/cert/{provider_id}"
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DeleteApnsCertificateByIdResponse> localVarReturnType = new GenericType<DeleteApnsCertificateByIdResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.deleteApnsCertificateById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Generate a secondary API token
   * ## Generate a secondary API token  Generates a new secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-generate-a-secondary-api-token
   * @param apiToken  (required)
   * @param generateSecondaryApiTokenData  (optional)
   * @return GenerateSecondaryApiTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GenerateSecondaryApiTokenResponse generateSecondaryApiToken(String apiToken, GenerateSecondaryApiTokenData generateSecondaryApiTokenData) throws ApiException {
    return generateSecondaryApiTokenWithHttpInfo(apiToken, generateSecondaryApiTokenData).getData();
  }

  /**
   * Generate a secondary API token
   * ## Generate a secondary API token  Generates a new secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-generate-a-secondary-api-token
   * @param apiToken  (required)
   * @param generateSecondaryApiTokenData  (optional)
   * @return ApiResponse&lt;GenerateSecondaryApiTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GenerateSecondaryApiTokenResponse> generateSecondaryApiTokenWithHttpInfo(String apiToken, GenerateSecondaryApiTokenData generateSecondaryApiTokenData) throws ApiException {
    Object localVarPostBody = generateSecondaryApiTokenData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling generateSecondaryApiToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/api_tokens";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GenerateSecondaryApiTokenResponse> localVarReturnType = new GenericType<GenerateSecondaryApiTokenResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.generateSecondaryApiToken", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List banned users in channels with a custom channel type
   * ## Retrieves a list of users banned from channels with the specified custom channel type.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return CustomTypeListBannedUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public CustomTypeListBannedUsersResponse listBannedUsersInChannelsWithCustomChannelType(String apiToken, String customType, String token, Integer limit) throws ApiException {
    return listBannedUsersInChannelsWithCustomChannelTypeWithHttpInfo(apiToken, customType, token, limit).getData();
  }

  /**
   * List banned users in channels with a custom channel type
   * ## Retrieves a list of users banned from channels with the specified custom channel type.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;CustomTypeListBannedUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomTypeListBannedUsersResponse> listBannedUsersInChannelsWithCustomChannelTypeWithHttpInfo(String apiToken, String customType, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listBannedUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'customType' is set
    if (customType == null) {
      throw new ApiException(400, "Missing the required parameter 'customType' when calling listBannedUsersInChannelsWithCustomChannelType");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings_by_channel_custom_type/{custom_type}/ban"
      .replaceAll("\\{" + "custom_type" + "\\}", apiClient.escapeString(customType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CustomTypeListBannedUsersResponse> localVarReturnType = new GenericType<CustomTypeListBannedUsersResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.listBannedUsersInChannelsWithCustomChannelType", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List muted users in channels with a custom channel type
   * ## Retrieves a list of the muted users in channels with a custom channel type.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ListMutedUsersInChannelsWithCustomChannelType200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListMutedUsersInChannelsWithCustomChannelType200Response listMutedUsersInChannelsWithCustomChannelType(String apiToken, String customType, String token, Integer limit) throws ApiException {
    return listMutedUsersInChannelsWithCustomChannelTypeWithHttpInfo(apiToken, customType, token, limit).getData();
  }

  /**
   * List muted users in channels with a custom channel type
   * ## Retrieves a list of the muted users in channels with a custom channel type.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;ListMutedUsersInChannelsWithCustomChannelType200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListMutedUsersInChannelsWithCustomChannelType200Response> listMutedUsersInChannelsWithCustomChannelTypeWithHttpInfo(String apiToken, String customType, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listMutedUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'customType' is set
    if (customType == null) {
      throw new ApiException(400, "Missing the required parameter 'customType' when calling listMutedUsersInChannelsWithCustomChannelType");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings_by_channel_custom_type/{custom_type}/mute"
      .replaceAll("\\{" + "custom_type" + "\\}", apiClient.escapeString(customType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListMutedUsersInChannelsWithCustomChannelType200Response> localVarReturnType = new GenericType<ListMutedUsersInChannelsWithCustomChannelType200Response>() {};

    return apiClient.invokeAPI("ApplicationApi.listMutedUsersInChannelsWithCustomChannelType", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List push configurations
   * ## List push configurations  Retrieves a list of an application&#39;s registered push configurations.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-configurations ----------------------------
   * @param apiToken  (required)
   * @param pushType  (required)
   * @return ListPushConfigurationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListPushConfigurationsResponse listPushConfigurations(String apiToken, String pushType) throws ApiException {
    return listPushConfigurationsWithHttpInfo(apiToken, pushType).getData();
  }

  /**
   * List push configurations
   * ## List push configurations  Retrieves a list of an application&#39;s registered push configurations.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-configurations ----------------------------
   * @param apiToken  (required)
   * @param pushType  (required)
   * @return ApiResponse&lt;ListPushConfigurationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPushConfigurationsResponse> listPushConfigurationsWithHttpInfo(String apiToken, String pushType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listPushConfigurations");
    }
    
    // verify the required parameter 'pushType' is set
    if (pushType == null) {
      throw new ApiException(400, "Missing the required parameter 'pushType' when calling listPushConfigurations");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/{push_type}"
      .replaceAll("\\{" + "push_type" + "\\}", apiClient.escapeString(pushType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListPushConfigurationsResponse> localVarReturnType = new GenericType<ListPushConfigurationsResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.listPushConfigurations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List push notification content templates
   * ## List push notification content templates  Retrieves a list of push notification content templates of an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-notification-content-templates
   * @param apiToken  (required)
   * @return ListPushNotificationContentTemplatesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListPushNotificationContentTemplatesResponse listPushNotificationContentTemplates(String apiToken) throws ApiException {
    return listPushNotificationContentTemplatesWithHttpInfo(apiToken).getData();
  }

  /**
   * List push notification content templates
   * ## List push notification content templates  Retrieves a list of push notification content templates of an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-notification-content-templates
   * @param apiToken  (required)
   * @return ApiResponse&lt;ListPushNotificationContentTemplatesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPushNotificationContentTemplatesResponse> listPushNotificationContentTemplatesWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listPushNotificationContentTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/message_templates";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListPushNotificationContentTemplatesResponse> localVarReturnType = new GenericType<ListPushNotificationContentTemplatesResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.listPushNotificationContentTemplates", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List secondary API tokens
   * ## List secondary API tokens  Retrieves a list of secondary API tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-secondary-api-tokens
   * @param apiToken  (required)
   * @return ListSecondaryApiTokensResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListSecondaryApiTokensResponse listSecondaryApiTokens(String apiToken) throws ApiException {
    return listSecondaryApiTokensWithHttpInfo(apiToken).getData();
  }

  /**
   * List secondary API tokens
   * ## List secondary API tokens  Retrieves a list of secondary API tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-secondary-api-tokens
   * @param apiToken  (required)
   * @return ApiResponse&lt;ListSecondaryApiTokensResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListSecondaryApiTokensResponse> listSecondaryApiTokensWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listSecondaryApiTokens");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/api_tokens";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListSecondaryApiTokensResponse> localVarReturnType = new GenericType<ListSecondaryApiTokensResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.listSecondaryApiTokens", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Mute users in channels with a custom channel type
   * ## Mutes specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param muteUsersInChannelsWithCustomChannelTypeData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object muteUsersInChannelsWithCustomChannelType(String apiToken, String customType, MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData) throws ApiException {
    return muteUsersInChannelsWithCustomChannelTypeWithHttpInfo(apiToken, customType, muteUsersInChannelsWithCustomChannelTypeData).getData();
  }

  /**
   * Mute users in channels with a custom channel type
   * ## Mutes specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param muteUsersInChannelsWithCustomChannelTypeData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> muteUsersInChannelsWithCustomChannelTypeWithHttpInfo(String apiToken, String customType, MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData) throws ApiException {
    Object localVarPostBody = muteUsersInChannelsWithCustomChannelTypeData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling muteUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'customType' is set
    if (customType == null) {
      throw new ApiException(400, "Missing the required parameter 'customType' when calling muteUsersInChannelsWithCustomChannelType");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings_by_channel_custom_type/{custom_type}/mute"
      .replaceAll("\\{" + "custom_type" + "\\}", apiClient.escapeString(customType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("ApplicationApi.muteUsersInChannelsWithCustomChannelType", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove a push configuration
   * ## Remove a push configuration  Removes a specific push configuration from an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-remove-a-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param pushType  (required)
   * @param providerId  (required)
   * @return RemovePushConfigurationByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RemovePushConfigurationByIdResponse removePushConfigurationById(String apiToken, String pushType, String providerId) throws ApiException {
    return removePushConfigurationByIdWithHttpInfo(apiToken, pushType, providerId).getData();
  }

  /**
   * Remove a push configuration
   * ## Remove a push configuration  Removes a specific push configuration from an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-remove-a-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param pushType  (required)
   * @param providerId  (required)
   * @return ApiResponse&lt;RemovePushConfigurationByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RemovePushConfigurationByIdResponse> removePushConfigurationByIdWithHttpInfo(String apiToken, String pushType, String providerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling removePushConfigurationById");
    }
    
    // verify the required parameter 'pushType' is set
    if (pushType == null) {
      throw new ApiException(400, "Missing the required parameter 'pushType' when calling removePushConfigurationById");
    }
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling removePushConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/{push_type}/{provider_id}"
      .replaceAll("\\{" + "push_type" + "\\}", apiClient.escapeString(pushType.toString()))
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RemovePushConfigurationByIdResponse> localVarReturnType = new GenericType<RemovePushConfigurationByIdResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.removePushConfigurationById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an IP whitelist
   * ## Retrieve an IP whitelist  Retrieves a list of all the IP ranges and addresses that have access to your Sendbird application. This list is called an IP whitelist and its addresses are granted API access when the IP whitelist API enables [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notations.  If you specify which IP addresses or ranges to include in the whitelist, any unlisted foreign IP addresses will be denied access. If you don&#39;t specify any IP address or range to include in the whitelist, all IP addresses will be granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-retrieve-an-ip-whitelist
   * @param apiToken  (required)
   * @return RetrieveIpWhitelistResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveIpWhitelistResponse retrieveIpWhitelist(String apiToken) throws ApiException {
    return retrieveIpWhitelistWithHttpInfo(apiToken).getData();
  }

  /**
   * Retrieve an IP whitelist
   * ## Retrieve an IP whitelist  Retrieves a list of all the IP ranges and addresses that have access to your Sendbird application. This list is called an IP whitelist and its addresses are granted API access when the IP whitelist API enables [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notations.  If you specify which IP addresses or ranges to include in the whitelist, any unlisted foreign IP addresses will be denied access. If you don&#39;t specify any IP address or range to include in the whitelist, all IP addresses will be granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-retrieve-an-ip-whitelist
   * @param apiToken  (required)
   * @return ApiResponse&lt;RetrieveIpWhitelistResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveIpWhitelistResponse> retrieveIpWhitelistWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling retrieveIpWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/ip_whitelist";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RetrieveIpWhitelistResponse> localVarReturnType = new GenericType<RetrieveIpWhitelistResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.retrieveIpWhitelist", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Revoke a secondary API token
   * ## Revoke a secondary API token  Revokes a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-revoke-a-secondary-api-token
   * @param apiToken  (required)
   * @param apiToken2  (required)
   * @return RevokeSecondaryApiTokenByTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RevokeSecondaryApiTokenByTokenResponse revokeSecondaryApiTokenByToken(String apiToken, String apiToken2) throws ApiException {
    return revokeSecondaryApiTokenByTokenWithHttpInfo(apiToken, apiToken2).getData();
  }

  /**
   * Revoke a secondary API token
   * ## Revoke a secondary API token  Revokes a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-revoke-a-secondary-api-token
   * @param apiToken  (required)
   * @param apiToken2  (required)
   * @return ApiResponse&lt;RevokeSecondaryApiTokenByTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RevokeSecondaryApiTokenByTokenResponse> revokeSecondaryApiTokenByTokenWithHttpInfo(String apiToken, String apiToken2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling revokeSecondaryApiTokenByToken");
    }
    
    // verify the required parameter 'apiToken2' is set
    if (apiToken2 == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken2' when calling revokeSecondaryApiTokenByToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/api_tokens/{api_token}"
      .replaceAll("\\{" + "api_token" + "\\}", apiClient.escapeString(apiToken2.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RevokeSecondaryApiTokenByTokenResponse> localVarReturnType = new GenericType<RevokeSecondaryApiTokenByTokenResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.revokeSecondaryApiTokenByToken", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Message moderation
   * ## 
   * @param apiToken  (required)
   * @param customType  (required)
   * @param setDomainFilterData  (optional)
   * @return SendBirdChannelResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdChannelResponse setDomainFilter(String apiToken, String customType, SetDomainFilterData setDomainFilterData) throws ApiException {
    return setDomainFilterWithHttpInfo(apiToken, customType, setDomainFilterData).getData();
  }

  /**
   * Message moderation
   * ## 
   * @param apiToken  (required)
   * @param customType  (required)
   * @param setDomainFilterData  (optional)
   * @return ApiResponse&lt;SendBirdChannelResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdChannelResponse> setDomainFilterWithHttpInfo(String apiToken, String customType, SetDomainFilterData setDomainFilterData) throws ApiException {
    Object localVarPostBody = setDomainFilterData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling setDomainFilter");
    }
    
    // verify the required parameter 'customType' is set
    if (customType == null) {
      throw new ApiException(400, "Missing the required parameter 'customType' when calling setDomainFilter");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings_global/{custom_type}"
      .replaceAll("\\{" + "custom_type" + "\\}", apiClient.escapeString(customType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendBirdChannelResponse> localVarReturnType = new GenericType<SendBirdChannelResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.setDomainFilter", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Unban users in channels with a custom channel type
   * ## Unban specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param userIds  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object unbanUsersInChannelsWithCustomChannelType(String apiToken, String customType, List<String> userIds) throws ApiException {
    return unbanUsersInChannelsWithCustomChannelTypeWithHttpInfo(apiToken, customType, userIds).getData();
  }

  /**
   * Unban users in channels with a custom channel type
   * ## Unban specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param userIds  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> unbanUsersInChannelsWithCustomChannelTypeWithHttpInfo(String apiToken, String customType, List<String> userIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling unbanUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'customType' is set
    if (customType == null) {
      throw new ApiException(400, "Missing the required parameter 'customType' when calling unbanUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'userIds' is set
    if (userIds == null) {
      throw new ApiException(400, "Missing the required parameter 'userIds' when calling unbanUsersInChannelsWithCustomChannelType");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings_by_channel_custom_type/{custom_type}/ban"
      .replaceAll("\\{" + "custom_type" + "\\}", apiClient.escapeString(customType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "user_ids", userIds));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("ApplicationApi.unbanUsersInChannelsWithCustomChannelType", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Unmute users in channels with a custom channel type
   * ## Unmute specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param userIds  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object unmuteUsersInChannelsWithCustomChannelType(String apiToken, String customType, List<String> userIds) throws ApiException {
    return unmuteUsersInChannelsWithCustomChannelTypeWithHttpInfo(apiToken, customType, userIds).getData();
  }

  /**
   * Unmute users in channels with a custom channel type
   * ## Unmute specified users in channels with a custom channel type at once.
   * @param apiToken  (required)
   * @param customType  (required)
   * @param userIds  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> unmuteUsersInChannelsWithCustomChannelTypeWithHttpInfo(String apiToken, String customType, List<String> userIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling unmuteUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'customType' is set
    if (customType == null) {
      throw new ApiException(400, "Missing the required parameter 'customType' when calling unmuteUsersInChannelsWithCustomChannelType");
    }
    
    // verify the required parameter 'userIds' is set
    if (userIds == null) {
      throw new ApiException(400, "Missing the required parameter 'userIds' when calling unmuteUsersInChannelsWithCustomChannelType");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings_by_channel_custom_type/{custom_type}/mute"
      .replaceAll("\\{" + "custom_type" + "\\}", apiClient.escapeString(customType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "user_ids", userIds));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("ApplicationApi.unmuteUsersInChannelsWithCustomChannelType", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an APNs push configuration
   * ## Update an APNs push configuration  Updates a specific APNs (Apple Push Notification service) push configuration for your client app. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: If your HTTP request body contains a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to upload to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests) .  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-apns-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @param updateApnsPushConfigurationByIdData  (optional)
   * @return UpdateApnsPushConfigurationByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateApnsPushConfigurationByIdResponse updateApnsPushConfigurationById(String apiToken, String providerId, UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData) throws ApiException {
    return updateApnsPushConfigurationByIdWithHttpInfo(apiToken, providerId, updateApnsPushConfigurationByIdData).getData();
  }

  /**
   * Update an APNs push configuration
   * ## Update an APNs push configuration  Updates a specific APNs (Apple Push Notification service) push configuration for your client app. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: If your HTTP request body contains a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to upload to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests) .  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-apns-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @param updateApnsPushConfigurationByIdData  (optional)
   * @return ApiResponse&lt;UpdateApnsPushConfigurationByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateApnsPushConfigurationByIdResponse> updateApnsPushConfigurationByIdWithHttpInfo(String apiToken, String providerId, UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData) throws ApiException {
    Object localVarPostBody = updateApnsPushConfigurationByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateApnsPushConfigurationById");
    }
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling updateApnsPushConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/apns/{provider_id}"
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UpdateApnsPushConfigurationByIdResponse> localVarReturnType = new GenericType<UpdateApnsPushConfigurationByIdResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.updateApnsPushConfigurationById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update default channel invitation preference
   * ## Update default channel invitation preference  Updates the default channel invitation preference of an application.  &gt; __Note__: Using the [update channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can update the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference
   * @param apiToken  (required)
   * @param updateDefaultChannelInvitationPreferenceData  (optional)
   * @return UpdateDefaultChannelInvitationPreferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateDefaultChannelInvitationPreferenceResponse updateDefaultChannelInvitationPreference(String apiToken, UpdateDefaultChannelInvitationPreferenceData updateDefaultChannelInvitationPreferenceData) throws ApiException {
    return updateDefaultChannelInvitationPreferenceWithHttpInfo(apiToken, updateDefaultChannelInvitationPreferenceData).getData();
  }

  /**
   * Update default channel invitation preference
   * ## Update default channel invitation preference  Updates the default channel invitation preference of an application.  &gt; __Note__: Using the [update channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can update the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference
   * @param apiToken  (required)
   * @param updateDefaultChannelInvitationPreferenceData  (optional)
   * @return ApiResponse&lt;UpdateDefaultChannelInvitationPreferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateDefaultChannelInvitationPreferenceResponse> updateDefaultChannelInvitationPreferenceWithHttpInfo(String apiToken, UpdateDefaultChannelInvitationPreferenceData updateDefaultChannelInvitationPreferenceData) throws ApiException {
    Object localVarPostBody = updateDefaultChannelInvitationPreferenceData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateDefaultChannelInvitationPreference");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/default_channel_invitation_preference";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UpdateDefaultChannelInvitationPreferenceResponse> localVarReturnType = new GenericType<UpdateDefaultChannelInvitationPreferenceResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.updateDefaultChannelInvitationPreference", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a FCM push configuration
   * ## Update a FCM push configuration  Updates a specific FCM (Firebase Cloud Messaging) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-fcm-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @param updateFcmPushConfigurationByIdData  (optional)
   * @return UpdateFcmPushConfigurationByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateFcmPushConfigurationByIdResponse updateFcmPushConfigurationById(String apiToken, String providerId, UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData) throws ApiException {
    return updateFcmPushConfigurationByIdWithHttpInfo(apiToken, providerId, updateFcmPushConfigurationByIdData).getData();
  }

  /**
   * Update a FCM push configuration
   * ## Update a FCM push configuration  Updates a specific FCM (Firebase Cloud Messaging) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-fcm-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @param updateFcmPushConfigurationByIdData  (optional)
   * @return ApiResponse&lt;UpdateFcmPushConfigurationByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateFcmPushConfigurationByIdResponse> updateFcmPushConfigurationByIdWithHttpInfo(String apiToken, String providerId, UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData) throws ApiException {
    Object localVarPostBody = updateFcmPushConfigurationByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateFcmPushConfigurationById");
    }
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling updateFcmPushConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/fcm/{provider_id}"
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UpdateFcmPushConfigurationByIdResponse> localVarReturnType = new GenericType<UpdateFcmPushConfigurationByIdResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.updateFcmPushConfigurationById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an HMS push configuration
   * ## Update an HMS push configuration  Updates a specific HMS (Huawei Mobile Services) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-hms-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @param updateHmsPushConfigurationByIdData  (optional)
   * @return UpdateHmsPushConfigurationByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateHmsPushConfigurationByIdResponse updateHmsPushConfigurationById(String apiToken, String providerId, UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData) throws ApiException {
    return updateHmsPushConfigurationByIdWithHttpInfo(apiToken, providerId, updateHmsPushConfigurationByIdData).getData();
  }

  /**
   * Update an HMS push configuration
   * ## Update an HMS push configuration  Updates a specific HMS (Huawei Mobile Services) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-hms-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param providerId  (required)
   * @param updateHmsPushConfigurationByIdData  (optional)
   * @return ApiResponse&lt;UpdateHmsPushConfigurationByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateHmsPushConfigurationByIdResponse> updateHmsPushConfigurationByIdWithHttpInfo(String apiToken, String providerId, UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData) throws ApiException {
    Object localVarPostBody = updateHmsPushConfigurationByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateHmsPushConfigurationById");
    }
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling updateHmsPushConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/hms/{provider_id}"
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UpdateHmsPushConfigurationByIdResponse> localVarReturnType = new GenericType<UpdateHmsPushConfigurationByIdResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.updateHmsPushConfigurationById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a push notification content template
   * ## Update a push notification content template  Updates a specific push notification content template of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-push-notification-content-template ----------------------------
   * @param apiToken  (required)
   * @param templateName  (required)
   * @param updatePushNotificationContentTemplateData  (optional)
   * @return UpdatePushNotificationContentTemplateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdatePushNotificationContentTemplateResponse updatePushNotificationContentTemplate(String apiToken, String templateName, UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData) throws ApiException {
    return updatePushNotificationContentTemplateWithHttpInfo(apiToken, templateName, updatePushNotificationContentTemplateData).getData();
  }

  /**
   * Update a push notification content template
   * ## Update a push notification content template  Updates a specific push notification content template of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-push-notification-content-template ----------------------------
   * @param apiToken  (required)
   * @param templateName  (required)
   * @param updatePushNotificationContentTemplateData  (optional)
   * @return ApiResponse&lt;UpdatePushNotificationContentTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdatePushNotificationContentTemplateResponse> updatePushNotificationContentTemplateWithHttpInfo(String apiToken, String templateName, UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData) throws ApiException {
    Object localVarPostBody = updatePushNotificationContentTemplateData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updatePushNotificationContentTemplate");
    }
    
    // verify the required parameter 'templateName' is set
    if (templateName == null) {
      throw new ApiException(400, "Missing the required parameter 'templateName' when calling updatePushNotificationContentTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/message_templates/{template_name}"
      .replaceAll("\\{" + "template_name" + "\\}", apiClient.escapeString(templateName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UpdatePushNotificationContentTemplateResponse> localVarReturnType = new GenericType<UpdatePushNotificationContentTemplateResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.updatePushNotificationContentTemplate", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View default channel invitation preference
   * ## View default channel invitation preference  Retrieves the default channel invitation preference of an application.  &gt; __Note__: Using the [view channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference) action, you can retrieve the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference
   * @param apiToken  (required)
   * @return ViewDefaultChannelInvitationPreferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewDefaultChannelInvitationPreferenceResponse viewDefaultChannelInvitationPreference(String apiToken) throws ApiException {
    return viewDefaultChannelInvitationPreferenceWithHttpInfo(apiToken).getData();
  }

  /**
   * View default channel invitation preference
   * ## View default channel invitation preference  Retrieves the default channel invitation preference of an application.  &gt; __Note__: Using the [view channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference) action, you can retrieve the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference
   * @param apiToken  (required)
   * @return ApiResponse&lt;ViewDefaultChannelInvitationPreferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewDefaultChannelInvitationPreferenceResponse> viewDefaultChannelInvitationPreferenceWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewDefaultChannelInvitationPreference");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/default_channel_invitation_preference";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewDefaultChannelInvitationPreferenceResponse> localVarReturnType = new GenericType<ViewDefaultChannelInvitationPreferenceResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.viewDefaultChannelInvitationPreference", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a push configuration
   * ## View a push configuration  Retrieves a specific push configuration of an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param pushType  (required)
   * @param providerId  (required)
   * @return ViewPushConfigurationByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewPushConfigurationByIdResponse viewPushConfigurationById(String apiToken, String pushType, String providerId) throws ApiException {
    return viewPushConfigurationByIdWithHttpInfo(apiToken, pushType, providerId).getData();
  }

  /**
   * View a push configuration
   * ## View a push configuration  Retrieves a specific push configuration of an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-configuration ----------------------------
   * @param apiToken  (required)
   * @param pushType  (required)
   * @param providerId  (required)
   * @return ApiResponse&lt;ViewPushConfigurationByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewPushConfigurationByIdResponse> viewPushConfigurationByIdWithHttpInfo(String apiToken, String pushType, String providerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewPushConfigurationById");
    }
    
    // verify the required parameter 'pushType' is set
    if (pushType == null) {
      throw new ApiException(400, "Missing the required parameter 'pushType' when calling viewPushConfigurationById");
    }
    
    // verify the required parameter 'providerId' is set
    if (providerId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerId' when calling viewPushConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/{push_type}/{provider_id}"
      .replaceAll("\\{" + "push_type" + "\\}", apiClient.escapeString(pushType.toString()))
      .replaceAll("\\{" + "provider_id" + "\\}", apiClient.escapeString(providerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewPushConfigurationByIdResponse> localVarReturnType = new GenericType<ViewPushConfigurationByIdResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.viewPushConfigurationById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a push notification content template
   * ## View a push notification content template  Retrieves information on a specific push notification content templates of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-notification-content-template ----------------------------
   * @param apiToken  (required)
   * @param templateName  (required)
   * @return ViewPushNotificationContentTemplateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewPushNotificationContentTemplateResponse viewPushNotificationContentTemplate(String apiToken, String templateName) throws ApiException {
    return viewPushNotificationContentTemplateWithHttpInfo(apiToken, templateName).getData();
  }

  /**
   * View a push notification content template
   * ## View a push notification content template  Retrieves information on a specific push notification content templates of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-notification-content-template ----------------------------
   * @param apiToken  (required)
   * @param templateName  (required)
   * @return ApiResponse&lt;ViewPushNotificationContentTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewPushNotificationContentTemplateResponse> viewPushNotificationContentTemplateWithHttpInfo(String apiToken, String templateName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewPushNotificationContentTemplate");
    }
    
    // verify the required parameter 'templateName' is set
    if (templateName == null) {
      throw new ApiException(400, "Missing the required parameter 'templateName' when calling viewPushNotificationContentTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/message_templates/{template_name}"
      .replaceAll("\\{" + "template_name" + "\\}", apiClient.escapeString(templateName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewPushNotificationContentTemplateResponse> localVarReturnType = new GenericType<ViewPushNotificationContentTemplateResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.viewPushNotificationContentTemplate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a secondary API token
   * ## View a secondary API token  Retrieves the information on a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-secondary-api-token
   * @param apiToken  (required)
   * @param apiToken2  (required)
   * @return ViewSecondaryApiTokenByTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewSecondaryApiTokenByTokenResponse viewSecondaryApiTokenByToken(String apiToken, String apiToken2) throws ApiException {
    return viewSecondaryApiTokenByTokenWithHttpInfo(apiToken, apiToken2).getData();
  }

  /**
   * View a secondary API token
   * ## View a secondary API token  Retrieves the information on a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-secondary-api-token
   * @param apiToken  (required)
   * @param apiToken2  (required)
   * @return ApiResponse&lt;ViewSecondaryApiTokenByTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewSecondaryApiTokenByTokenResponse> viewSecondaryApiTokenByTokenWithHttpInfo(String apiToken, String apiToken2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewSecondaryApiTokenByToken");
    }
    
    // verify the required parameter 'apiToken2' is set
    if (apiToken2 == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken2' when calling viewSecondaryApiTokenByToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/api_tokens/{api_token}"
      .replaceAll("\\{" + "api_token" + "\\}", apiClient.escapeString(apiToken2.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewSecondaryApiTokenByTokenResponse> localVarReturnType = new GenericType<ViewSecondaryApiTokenByTokenResponse>() {};

    return apiClient.invokeAPI("ApplicationApi.viewSecondaryApiTokenByToken", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
