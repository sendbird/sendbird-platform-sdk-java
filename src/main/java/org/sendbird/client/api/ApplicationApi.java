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
import org.openapitools.client.model.ConfigureAutoEventData;
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
import org.openapitools.client.model.SendBirdAutoEventMessageSettings;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
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


private ApiResponse<AddApnsPushConfigurationResponse> addApnsPushConfigurationWithHttpInfo(String apiToken, AddApnsPushConfigurationData addApnsPushConfigurationData) throws ApiException {
    Object localVarPostBody = addApnsPushConfigurationData;
    
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

  public class APIaddApnsPushConfigurationRequest {
    private String apiToken;
    private AddApnsPushConfigurationData addApnsPushConfigurationData;

    private APIaddApnsPushConfigurationRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddApnsPushConfigurationRequest
     */
    public APIaddApnsPushConfigurationRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addApnsPushConfigurationData
     * @param addApnsPushConfigurationData  (optional)
     * @return APIaddApnsPushConfigurationRequest
     */
    public APIaddApnsPushConfigurationRequest addApnsPushConfigurationData(AddApnsPushConfigurationData addApnsPushConfigurationData) {
      this.addApnsPushConfigurationData = addApnsPushConfigurationData;
      return this;
    }

    /**
     * Execute addApnsPushConfiguration request
     * @return AddApnsPushConfigurationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddApnsPushConfigurationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addApnsPushConfiguration request with HTTP info returned
     * @return ApiResponse&lt;AddApnsPushConfigurationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddApnsPushConfigurationResponse> executeWithHttpInfo() throws ApiException {
      return addApnsPushConfigurationWithHttpInfo(apiToken, addApnsPushConfigurationData);
    }
  }

  /**
   * Add an APNs push configuration
   * ## Add an APNs push configuration  Registers an APNs (Apple Push Notification service) push configuration for your client app. To send push notifications to iOS devices, your should first register the APNs push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: To upload a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-apns-push-configuration
   * @return addApnsPushConfigurationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddApnsPushConfigurationRequest addApnsPushConfiguration() throws ApiException {
    return new APIaddApnsPushConfigurationRequest();
  }

private ApiResponse<AddFcmPushConfigurationResponse> addFcmPushConfigurationWithHttpInfo(String apiToken, AddFcmPushConfigurationData addFcmPushConfigurationData) throws ApiException {
    Object localVarPostBody = addFcmPushConfigurationData;
    
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

  public class APIaddFcmPushConfigurationRequest {
    private String apiToken;
    private AddFcmPushConfigurationData addFcmPushConfigurationData;

    private APIaddFcmPushConfigurationRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddFcmPushConfigurationRequest
     */
    public APIaddFcmPushConfigurationRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addFcmPushConfigurationData
     * @param addFcmPushConfigurationData  (optional)
     * @return APIaddFcmPushConfigurationRequest
     */
    public APIaddFcmPushConfigurationRequest addFcmPushConfigurationData(AddFcmPushConfigurationData addFcmPushConfigurationData) {
      this.addFcmPushConfigurationData = addFcmPushConfigurationData;
      return this;
    }

    /**
     * Execute addFcmPushConfiguration request
     * @return AddFcmPushConfigurationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddFcmPushConfigurationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addFcmPushConfiguration request with HTTP info returned
     * @return ApiResponse&lt;AddFcmPushConfigurationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddFcmPushConfigurationResponse> executeWithHttpInfo() throws ApiException {
      return addFcmPushConfigurationWithHttpInfo(apiToken, addFcmPushConfigurationData);
    }
  }

  /**
   * Add a FCM push configuration
   * ## Add a FCM push configuration  Registers a FCM (Firebase Cloud Messaging) push configuration for your client app. To send push notifications to Android devices, you should first register the FCM push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-a-fcm-push-configuration
   * @return addFcmPushConfigurationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddFcmPushConfigurationRequest addFcmPushConfiguration() throws ApiException {
    return new APIaddFcmPushConfigurationRequest();
  }

private ApiResponse<AddHmsPushConfigurationResponse> addHmsPushConfigurationWithHttpInfo(String apiToken, AddHmsPushConfigurationData addHmsPushConfigurationData) throws ApiException {
    Object localVarPostBody = addHmsPushConfigurationData;
    
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

  public class APIaddHmsPushConfigurationRequest {
    private String apiToken;
    private AddHmsPushConfigurationData addHmsPushConfigurationData;

    private APIaddHmsPushConfigurationRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddHmsPushConfigurationRequest
     */
    public APIaddHmsPushConfigurationRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addHmsPushConfigurationData
     * @param addHmsPushConfigurationData  (optional)
     * @return APIaddHmsPushConfigurationRequest
     */
    public APIaddHmsPushConfigurationRequest addHmsPushConfigurationData(AddHmsPushConfigurationData addHmsPushConfigurationData) {
      this.addHmsPushConfigurationData = addHmsPushConfigurationData;
      return this;
    }

    /**
     * Execute addHmsPushConfiguration request
     * @return AddHmsPushConfigurationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddHmsPushConfigurationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addHmsPushConfiguration request with HTTP info returned
     * @return ApiResponse&lt;AddHmsPushConfigurationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddHmsPushConfigurationResponse> executeWithHttpInfo() throws ApiException {
      return addHmsPushConfigurationWithHttpInfo(apiToken, addHmsPushConfigurationData);
    }
  }

  /**
   * Add an HMS push configuration
   * ## Add an HMS push configuration  Registers an HMS (Huawei Mobile Services) push configuration for your client app. To send push notifications to Android devices for HMS, you should first register the HMS push configuration. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-hms-push-configuration
   * @return addHmsPushConfigurationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddHmsPushConfigurationRequest addHmsPushConfiguration() throws ApiException {
    return new APIaddHmsPushConfigurationRequest();
  }

private ApiResponse<AddIpToWhitelistResponse> addIpToWhitelistWithHttpInfo(String apiToken, AddIpToWhitelistData addIpToWhitelistData) throws ApiException {
    Object localVarPostBody = addIpToWhitelistData;
    
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

  public class APIaddIpToWhitelistRequest {
    private String apiToken;
    private AddIpToWhitelistData addIpToWhitelistData;

    private APIaddIpToWhitelistRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddIpToWhitelistRequest
     */
    public APIaddIpToWhitelistRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addIpToWhitelistData
     * @param addIpToWhitelistData  (optional)
     * @return APIaddIpToWhitelistRequest
     */
    public APIaddIpToWhitelistRequest addIpToWhitelistData(AddIpToWhitelistData addIpToWhitelistData) {
      this.addIpToWhitelistData = addIpToWhitelistData;
      return this;
    }

    /**
     * Execute addIpToWhitelist request
     * @return AddIpToWhitelistResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddIpToWhitelistResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addIpToWhitelist request with HTTP info returned
     * @return ApiResponse&lt;AddIpToWhitelistResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddIpToWhitelistResponse> executeWithHttpInfo() throws ApiException {
      return addIpToWhitelistWithHttpInfo(apiToken, addIpToWhitelistData);
    }
  }

  /**
   * Add an IP to a whitelist
   * ## Add an IP to a whitelist  Adds IP addresses and ranges to your Sendbird application settings. Both currently added and any previously added IPs are granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-add-an-ip-to-a-whitelist
   * @return addIpToWhitelistRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddIpToWhitelistRequest addIpToWhitelist() throws ApiException {
    return new APIaddIpToWhitelistRequest();
  }

private ApiResponse<Object> banUsersInChannelsWithCustomChannelTypeWithHttpInfo(String customType, String apiToken, BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData) throws ApiException {
    Object localVarPostBody = banUsersInChannelsWithCustomChannelTypeData;
    
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

  public class APIbanUsersInChannelsWithCustomChannelTypeRequest {
    private String customType;
    private String apiToken;
    private BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData;

    private APIbanUsersInChannelsWithCustomChannelTypeRequest(String customType) {
      this.customType = customType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIbanUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIbanUsersInChannelsWithCustomChannelTypeRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set banUsersInChannelsWithCustomChannelTypeData
     * @param banUsersInChannelsWithCustomChannelTypeData  (optional)
     * @return APIbanUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIbanUsersInChannelsWithCustomChannelTypeRequest banUsersInChannelsWithCustomChannelTypeData(BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData) {
      this.banUsersInChannelsWithCustomChannelTypeData = banUsersInChannelsWithCustomChannelTypeData;
      return this;
    }

    /**
     * Execute banUsersInChannelsWithCustomChannelType request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute banUsersInChannelsWithCustomChannelType request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return banUsersInChannelsWithCustomChannelTypeWithHttpInfo(customType, apiToken, banUsersInChannelsWithCustomChannelTypeData);
    }
  }

  /**
   * Ban users in channels with a custom channel type
   * ## Ban specified users in channels with a custom channel type at once.
   * @param customType  (required)
   * @return banUsersInChannelsWithCustomChannelTypeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIbanUsersInChannelsWithCustomChannelTypeRequest banUsersInChannelsWithCustomChannelType(String customType) throws ApiException {
    return new APIbanUsersInChannelsWithCustomChannelTypeRequest(customType);
  }

private ApiResponse<SendBirdAutoEventMessageSettings> configureAutoEventMessagesWithHttpInfo(String apiToken, ConfigureAutoEventData configureAutoEventData) throws ApiException {
    Object localVarPostBody = configureAutoEventData;
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/auto_event_message";

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

    GenericType<SendBirdAutoEventMessageSettings> localVarReturnType = new GenericType<SendBirdAutoEventMessageSettings>() {};

    return apiClient.invokeAPI("ApplicationApi.configureAutoEventMessages", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIconfigureAutoEventMessagesRequest {
    private String apiToken;
    private ConfigureAutoEventData configureAutoEventData;

    private APIconfigureAutoEventMessagesRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIconfigureAutoEventMessagesRequest
     */
    public APIconfigureAutoEventMessagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set configureAutoEventData
     * @param configureAutoEventData  (optional)
     * @return APIconfigureAutoEventMessagesRequest
     */
    public APIconfigureAutoEventMessagesRequest configureAutoEventData(ConfigureAutoEventData configureAutoEventData) {
      this.configureAutoEventData = configureAutoEventData;
      return this;
    }

    /**
     * Execute configureAutoEventMessages request
     * @return SendBirdAutoEventMessageSettings
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdAutoEventMessageSettings execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute configureAutoEventMessages request with HTTP info returned
     * @return ApiResponse&lt;SendBirdAutoEventMessageSettings&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdAutoEventMessageSettings> executeWithHttpInfo() throws ApiException {
      return configureAutoEventMessagesWithHttpInfo(apiToken, configureAutoEventData);
    }
  }

  /**
   * Configure auto event message settings
   * ## Configure auto event message settings  Determines whether to automatically send event messages to group channels when events take place in an application. You can choose which auto event message to receive on the Sendbird Dashboard  https://sendbird.com/docs/chat/v3/platform-api/application/managing-auto-event-messages/configure-auto-event-message-settings ----------------------------
   * @return configureAutoEventMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIconfigureAutoEventMessagesRequest configureAutoEventMessages() throws ApiException {
    return new APIconfigureAutoEventMessagesRequest();
  }

private ApiResponse<DeleteAllowedIpsFromWhitelistResponse> deleteAllowedIpsFromWhitelistWithHttpInfo(List<String> ipWhitelistAddresses, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIdeleteAllowedIpsFromWhitelistRequest {
    private List<String> ipWhitelistAddresses;
    private String apiToken;

    private APIdeleteAllowedIpsFromWhitelistRequest() {
    }

    /**
     * Set ipWhitelistAddresses
     * @param ipWhitelistAddresses  (required)
     * @return APIdeleteAllowedIpsFromWhitelistRequest
     */
    public APIdeleteAllowedIpsFromWhitelistRequest ipWhitelistAddresses(List<String> ipWhitelistAddresses) {
      this.ipWhitelistAddresses = ipWhitelistAddresses;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteAllowedIpsFromWhitelistRequest
     */
    public APIdeleteAllowedIpsFromWhitelistRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteAllowedIpsFromWhitelist request
     * @return DeleteAllowedIpsFromWhitelistResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DeleteAllowedIpsFromWhitelistResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAllowedIpsFromWhitelist request with HTTP info returned
     * @return ApiResponse&lt;DeleteAllowedIpsFromWhitelistResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<DeleteAllowedIpsFromWhitelistResponse> executeWithHttpInfo() throws ApiException {
      return deleteAllowedIpsFromWhitelistWithHttpInfo(ipWhitelistAddresses, apiToken);
    }
  }

  /**
   * Delete allowed IPs from a whitelist
   * ## Delete allowed IPs from a whitelist  Deletes allowed IPs from the whitelist by specifying their IP addresses or ranges. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-allowed-ips-from-a-whitelist
   * @return deleteAllowedIpsFromWhitelistRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAllowedIpsFromWhitelistRequest deleteAllowedIpsFromWhitelist() throws ApiException {
    return new APIdeleteAllowedIpsFromWhitelistRequest();
  }

private ApiResponse<DeleteApnsCertificateByIdResponse> deleteApnsCertificateByIdWithHttpInfo(String providerId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIdeleteApnsCertificateByIdRequest {
    private String providerId;
    private String apiToken;

    private APIdeleteApnsCertificateByIdRequest(String providerId) {
      this.providerId = providerId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteApnsCertificateByIdRequest
     */
    public APIdeleteApnsCertificateByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteApnsCertificateById request
     * @return DeleteApnsCertificateByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public DeleteApnsCertificateByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteApnsCertificateById request with HTTP info returned
     * @return ApiResponse&lt;DeleteApnsCertificateByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<DeleteApnsCertificateByIdResponse> executeWithHttpInfo() throws ApiException {
      return deleteApnsCertificateByIdWithHttpInfo(providerId, apiToken);
    }
  }

  /**
   * Delete an APNs certificate
   * ## Delete an APNs certificate  Deletes a specific APNs certificate.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-delete-an-apns-certificate ----------------------------
   * @param providerId  (required)
   * @return deleteApnsCertificateByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteApnsCertificateByIdRequest deleteApnsCertificateById(String providerId) throws ApiException {
    return new APIdeleteApnsCertificateByIdRequest(providerId);
  }

private ApiResponse<GenerateSecondaryApiTokenResponse> generateSecondaryApiTokenWithHttpInfo(String apiToken, GenerateSecondaryApiTokenData generateSecondaryApiTokenData) throws ApiException {
    Object localVarPostBody = generateSecondaryApiTokenData;
    
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

  public class APIgenerateSecondaryApiTokenRequest {
    private String apiToken;
    private GenerateSecondaryApiTokenData generateSecondaryApiTokenData;

    private APIgenerateSecondaryApiTokenRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgenerateSecondaryApiTokenRequest
     */
    public APIgenerateSecondaryApiTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set generateSecondaryApiTokenData
     * @param generateSecondaryApiTokenData  (optional)
     * @return APIgenerateSecondaryApiTokenRequest
     */
    public APIgenerateSecondaryApiTokenRequest generateSecondaryApiTokenData(GenerateSecondaryApiTokenData generateSecondaryApiTokenData) {
      this.generateSecondaryApiTokenData = generateSecondaryApiTokenData;
      return this;
    }

    /**
     * Execute generateSecondaryApiToken request
     * @return GenerateSecondaryApiTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GenerateSecondaryApiTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute generateSecondaryApiToken request with HTTP info returned
     * @return ApiResponse&lt;GenerateSecondaryApiTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GenerateSecondaryApiTokenResponse> executeWithHttpInfo() throws ApiException {
      return generateSecondaryApiTokenWithHttpInfo(apiToken, generateSecondaryApiTokenData);
    }
  }

  /**
   * Generate a secondary API token
   * ## Generate a secondary API token  Generates a new secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-generate-a-secondary-api-token
   * @return generateSecondaryApiTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgenerateSecondaryApiTokenRequest generateSecondaryApiToken() throws ApiException {
    return new APIgenerateSecondaryApiTokenRequest();
  }

private ApiResponse<SendBirdAutoEventMessageSettings> listAutoEventMessagesWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/auto_event_message";

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

    GenericType<SendBirdAutoEventMessageSettings> localVarReturnType = new GenericType<SendBirdAutoEventMessageSettings>() {};

    return apiClient.invokeAPI("ApplicationApi.listAutoEventMessages", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistAutoEventMessagesRequest {
    private String apiToken;

    private APIlistAutoEventMessagesRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistAutoEventMessagesRequest
     */
    public APIlistAutoEventMessagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listAutoEventMessages request
     * @return SendBirdAutoEventMessageSettings
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdAutoEventMessageSettings execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAutoEventMessages request with HTTP info returned
     * @return ApiResponse&lt;SendBirdAutoEventMessageSettings&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdAutoEventMessageSettings> executeWithHttpInfo() throws ApiException {
      return listAutoEventMessagesWithHttpInfo(apiToken);
    }
  }

  /**
   * List auto event messages
   * ## List auto event messages  Retrieves a list of auto event messages that are sent in a specified application and indicates which ones are in use. Auto event messages are Admin messages that are automatically generated when a specific event occurs.  https://sendbird.com/docs/chat/v3/platform-api/application/managing-auto-event-messages/list-auto-event-messages ----------------------------
   * @return listAutoEventMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAutoEventMessagesRequest listAutoEventMessages() throws ApiException {
    return new APIlistAutoEventMessagesRequest();
  }

private ApiResponse<CustomTypeListBannedUsersResponse> listBannedUsersInChannelsWithCustomChannelTypeWithHttpInfo(String customType, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistBannedUsersInChannelsWithCustomChannelTypeRequest {
    private String customType;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistBannedUsersInChannelsWithCustomChannelTypeRequest(String customType) {
      this.customType = customType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistBannedUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIlistBannedUsersInChannelsWithCustomChannelTypeRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistBannedUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIlistBannedUsersInChannelsWithCustomChannelTypeRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistBannedUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIlistBannedUsersInChannelsWithCustomChannelTypeRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listBannedUsersInChannelsWithCustomChannelType request
     * @return CustomTypeListBannedUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CustomTypeListBannedUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listBannedUsersInChannelsWithCustomChannelType request with HTTP info returned
     * @return ApiResponse&lt;CustomTypeListBannedUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CustomTypeListBannedUsersResponse> executeWithHttpInfo() throws ApiException {
      return listBannedUsersInChannelsWithCustomChannelTypeWithHttpInfo(customType, apiToken, token, limit);
    }
  }

  /**
   * List banned users in channels with a custom channel type
   * ## Retrieves a list of users banned from channels with the specified custom channel type.
   * @param customType  (required)
   * @return listBannedUsersInChannelsWithCustomChannelTypeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistBannedUsersInChannelsWithCustomChannelTypeRequest listBannedUsersInChannelsWithCustomChannelType(String customType) throws ApiException {
    return new APIlistBannedUsersInChannelsWithCustomChannelTypeRequest(customType);
  }

private ApiResponse<ListMutedUsersInChannelsWithCustomChannelType200Response> listMutedUsersInChannelsWithCustomChannelTypeWithHttpInfo(String customType, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistMutedUsersInChannelsWithCustomChannelTypeRequest {
    private String customType;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistMutedUsersInChannelsWithCustomChannelTypeRequest(String customType) {
      this.customType = customType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistMutedUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIlistMutedUsersInChannelsWithCustomChannelTypeRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistMutedUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIlistMutedUsersInChannelsWithCustomChannelTypeRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistMutedUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIlistMutedUsersInChannelsWithCustomChannelTypeRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listMutedUsersInChannelsWithCustomChannelType request
     * @return ListMutedUsersInChannelsWithCustomChannelType200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMutedUsersInChannelsWithCustomChannelType200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMutedUsersInChannelsWithCustomChannelType request with HTTP info returned
     * @return ApiResponse&lt;ListMutedUsersInChannelsWithCustomChannelType200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMutedUsersInChannelsWithCustomChannelType200Response> executeWithHttpInfo() throws ApiException {
      return listMutedUsersInChannelsWithCustomChannelTypeWithHttpInfo(customType, apiToken, token, limit);
    }
  }

  /**
   * List muted users in channels with a custom channel type
   * ## Retrieves a list of the muted users in channels with a custom channel type.
   * @param customType  (required)
   * @return listMutedUsersInChannelsWithCustomChannelTypeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMutedUsersInChannelsWithCustomChannelTypeRequest listMutedUsersInChannelsWithCustomChannelType(String customType) throws ApiException {
    return new APIlistMutedUsersInChannelsWithCustomChannelTypeRequest(customType);
  }

private ApiResponse<ListPushConfigurationsResponse> listPushConfigurationsWithHttpInfo(String pushType, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistPushConfigurationsRequest {
    private String pushType;
    private String apiToken;

    private APIlistPushConfigurationsRequest(String pushType) {
      this.pushType = pushType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistPushConfigurationsRequest
     */
    public APIlistPushConfigurationsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listPushConfigurations request
     * @return ListPushConfigurationsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPushConfigurationsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPushConfigurations request with HTTP info returned
     * @return ApiResponse&lt;ListPushConfigurationsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPushConfigurationsResponse> executeWithHttpInfo() throws ApiException {
      return listPushConfigurationsWithHttpInfo(pushType, apiToken);
    }
  }

  /**
   * List push configurations
   * ## List push configurations  Retrieves a list of an application&#39;s registered push configurations.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-configurations ----------------------------
   * @param pushType  (required)
   * @return listPushConfigurationsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPushConfigurationsRequest listPushConfigurations(String pushType) throws ApiException {
    return new APIlistPushConfigurationsRequest(pushType);
  }

private ApiResponse<ListPushNotificationContentTemplatesResponse> listPushNotificationContentTemplatesWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistPushNotificationContentTemplatesRequest {
    private String apiToken;

    private APIlistPushNotificationContentTemplatesRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistPushNotificationContentTemplatesRequest
     */
    public APIlistPushNotificationContentTemplatesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listPushNotificationContentTemplates request
     * @return ListPushNotificationContentTemplatesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPushNotificationContentTemplatesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPushNotificationContentTemplates request with HTTP info returned
     * @return ApiResponse&lt;ListPushNotificationContentTemplatesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPushNotificationContentTemplatesResponse> executeWithHttpInfo() throws ApiException {
      return listPushNotificationContentTemplatesWithHttpInfo(apiToken);
    }
  }

  /**
   * List push notification content templates
   * ## List push notification content templates  Retrieves a list of push notification content templates of an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-push-notification-content-templates
   * @return listPushNotificationContentTemplatesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPushNotificationContentTemplatesRequest listPushNotificationContentTemplates() throws ApiException {
    return new APIlistPushNotificationContentTemplatesRequest();
  }

private ApiResponse<ListSecondaryApiTokensResponse> listSecondaryApiTokensWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistSecondaryApiTokensRequest {
    private String apiToken;

    private APIlistSecondaryApiTokensRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistSecondaryApiTokensRequest
     */
    public APIlistSecondaryApiTokensRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listSecondaryApiTokens request
     * @return ListSecondaryApiTokensResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListSecondaryApiTokensResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listSecondaryApiTokens request with HTTP info returned
     * @return ApiResponse&lt;ListSecondaryApiTokensResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListSecondaryApiTokensResponse> executeWithHttpInfo() throws ApiException {
      return listSecondaryApiTokensWithHttpInfo(apiToken);
    }
  }

  /**
   * List secondary API tokens
   * ## List secondary API tokens  Retrieves a list of secondary API tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-list-secondary-api-tokens
   * @return listSecondaryApiTokensRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistSecondaryApiTokensRequest listSecondaryApiTokens() throws ApiException {
    return new APIlistSecondaryApiTokensRequest();
  }

private ApiResponse<Object> muteUsersInChannelsWithCustomChannelTypeWithHttpInfo(String customType, String apiToken, MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData) throws ApiException {
    Object localVarPostBody = muteUsersInChannelsWithCustomChannelTypeData;
    
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

  public class APImuteUsersInChannelsWithCustomChannelTypeRequest {
    private String customType;
    private String apiToken;
    private MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData;

    private APImuteUsersInChannelsWithCustomChannelTypeRequest(String customType) {
      this.customType = customType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APImuteUsersInChannelsWithCustomChannelTypeRequest
     */
    public APImuteUsersInChannelsWithCustomChannelTypeRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set muteUsersInChannelsWithCustomChannelTypeData
     * @param muteUsersInChannelsWithCustomChannelTypeData  (optional)
     * @return APImuteUsersInChannelsWithCustomChannelTypeRequest
     */
    public APImuteUsersInChannelsWithCustomChannelTypeRequest muteUsersInChannelsWithCustomChannelTypeData(MuteUsersInChannelsWithCustomChannelTypeData muteUsersInChannelsWithCustomChannelTypeData) {
      this.muteUsersInChannelsWithCustomChannelTypeData = muteUsersInChannelsWithCustomChannelTypeData;
      return this;
    }

    /**
     * Execute muteUsersInChannelsWithCustomChannelType request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute muteUsersInChannelsWithCustomChannelType request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return muteUsersInChannelsWithCustomChannelTypeWithHttpInfo(customType, apiToken, muteUsersInChannelsWithCustomChannelTypeData);
    }
  }

  /**
   * Mute users in channels with a custom channel type
   * ## Mutes specified users in channels with a custom channel type at once.
   * @param customType  (required)
   * @return muteUsersInChannelsWithCustomChannelTypeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APImuteUsersInChannelsWithCustomChannelTypeRequest muteUsersInChannelsWithCustomChannelType(String customType) throws ApiException {
    return new APImuteUsersInChannelsWithCustomChannelTypeRequest(customType);
  }

private ApiResponse<RemovePushConfigurationByIdResponse> removePushConfigurationByIdWithHttpInfo(String pushType, String providerId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIremovePushConfigurationByIdRequest {
    private String pushType;
    private String providerId;
    private String apiToken;

    private APIremovePushConfigurationByIdRequest(String pushType, String providerId) {
      this.pushType = pushType;
      this.providerId = providerId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremovePushConfigurationByIdRequest
     */
    public APIremovePushConfigurationByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removePushConfigurationById request
     * @return RemovePushConfigurationByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RemovePushConfigurationByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removePushConfigurationById request with HTTP info returned
     * @return ApiResponse&lt;RemovePushConfigurationByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RemovePushConfigurationByIdResponse> executeWithHttpInfo() throws ApiException {
      return removePushConfigurationByIdWithHttpInfo(pushType, providerId, apiToken);
    }
  }

  /**
   * Remove a push configuration
   * ## Remove a push configuration  Removes a specific push configuration from an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-remove-a-push-configuration ----------------------------
   * @param pushType  (required)
   * @param providerId  (required)
   * @return removePushConfigurationByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremovePushConfigurationByIdRequest removePushConfigurationById(String pushType, String providerId) throws ApiException {
    return new APIremovePushConfigurationByIdRequest(pushType, providerId);
  }

private ApiResponse<RetrieveIpWhitelistResponse> retrieveIpWhitelistWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIretrieveIpWhitelistRequest {
    private String apiToken;

    private APIretrieveIpWhitelistRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIretrieveIpWhitelistRequest
     */
    public APIretrieveIpWhitelistRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute retrieveIpWhitelist request
     * @return RetrieveIpWhitelistResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RetrieveIpWhitelistResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrieveIpWhitelist request with HTTP info returned
     * @return ApiResponse&lt;RetrieveIpWhitelistResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RetrieveIpWhitelistResponse> executeWithHttpInfo() throws ApiException {
      return retrieveIpWhitelistWithHttpInfo(apiToken);
    }
  }

  /**
   * Retrieve an IP whitelist
   * ## Retrieve an IP whitelist  Retrieves a list of all the IP ranges and addresses that have access to your Sendbird application. This list is called an IP whitelist and its addresses are granted API access when the IP whitelist API enables [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notations.  If you specify which IP addresses or ranges to include in the whitelist, any unlisted foreign IP addresses will be denied access. If you don&#39;t specify any IP address or range to include in the whitelist, all IP addresses will be granted API access. You can configure the IP whitelist under Settings &gt; Security &gt; Allowed IPs in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-retrieve-an-ip-whitelist
   * @return retrieveIpWhitelistRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrieveIpWhitelistRequest retrieveIpWhitelist() throws ApiException {
    return new APIretrieveIpWhitelistRequest();
  }

private ApiResponse<RevokeSecondaryApiTokenByTokenResponse> revokeSecondaryApiTokenByTokenWithHttpInfo(String apiToken2, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIrevokeSecondaryApiTokenByTokenRequest {
    private String apiToken2;
    private String apiToken;

    private APIrevokeSecondaryApiTokenByTokenRequest(String apiToken2) {
      this.apiToken2 = apiToken2;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIrevokeSecondaryApiTokenByTokenRequest
     */
    public APIrevokeSecondaryApiTokenByTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute revokeSecondaryApiTokenByToken request
     * @return RevokeSecondaryApiTokenByTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RevokeSecondaryApiTokenByTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute revokeSecondaryApiTokenByToken request with HTTP info returned
     * @return ApiResponse&lt;RevokeSecondaryApiTokenByTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RevokeSecondaryApiTokenByTokenResponse> executeWithHttpInfo() throws ApiException {
      return revokeSecondaryApiTokenByTokenWithHttpInfo(apiToken2, apiToken);
    }
  }

  /**
   * Revoke a secondary API token
   * ## Revoke a secondary API token  Revokes a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-revoke-a-secondary-api-token
   * @param apiToken2  (required)
   * @return revokeSecondaryApiTokenByTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIrevokeSecondaryApiTokenByTokenRequest revokeSecondaryApiTokenByToken(String apiToken2) throws ApiException {
    return new APIrevokeSecondaryApiTokenByTokenRequest(apiToken2);
  }

private ApiResponse<SendBirdChannelResponse> setDomainFilterWithHttpInfo(String customType, String apiToken, SetDomainFilterData setDomainFilterData) throws ApiException {
    Object localVarPostBody = setDomainFilterData;
    
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

  public class APIsetDomainFilterRequest {
    private String customType;
    private String apiToken;
    private SetDomainFilterData setDomainFilterData;

    private APIsetDomainFilterRequest(String customType) {
      this.customType = customType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIsetDomainFilterRequest
     */
    public APIsetDomainFilterRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set setDomainFilterData
     * @param setDomainFilterData  (optional)
     * @return APIsetDomainFilterRequest
     */
    public APIsetDomainFilterRequest setDomainFilterData(SetDomainFilterData setDomainFilterData) {
      this.setDomainFilterData = setDomainFilterData;
      return this;
    }

    /**
     * Execute setDomainFilter request
     * @return SendBirdChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute setDomainFilter request with HTTP info returned
     * @return ApiResponse&lt;SendBirdChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdChannelResponse> executeWithHttpInfo() throws ApiException {
      return setDomainFilterWithHttpInfo(customType, apiToken, setDomainFilterData);
    }
  }

  /**
   * Message moderation
   * ## 
   * @param customType  (required)
   * @return setDomainFilterRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIsetDomainFilterRequest setDomainFilter(String customType) throws ApiException {
    return new APIsetDomainFilterRequest(customType);
  }

private ApiResponse<Object> unbanUsersInChannelsWithCustomChannelTypeWithHttpInfo(String customType, List<String> userIds, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIunbanUsersInChannelsWithCustomChannelTypeRequest {
    private String customType;
    private List<String> userIds;
    private String apiToken;

    private APIunbanUsersInChannelsWithCustomChannelTypeRequest(String customType) {
      this.customType = customType;
    }

    /**
     * Set userIds
     * @param userIds  (required)
     * @return APIunbanUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIunbanUsersInChannelsWithCustomChannelTypeRequest userIds(List<String> userIds) {
      this.userIds = userIds;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIunbanUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIunbanUsersInChannelsWithCustomChannelTypeRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute unbanUsersInChannelsWithCustomChannelType request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute unbanUsersInChannelsWithCustomChannelType request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return unbanUsersInChannelsWithCustomChannelTypeWithHttpInfo(customType, userIds, apiToken);
    }
  }

  /**
   * Unban users in channels with a custom channel type
   * ## Unban specified users in channels with a custom channel type at once.
   * @param customType  (required)
   * @return unbanUsersInChannelsWithCustomChannelTypeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIunbanUsersInChannelsWithCustomChannelTypeRequest unbanUsersInChannelsWithCustomChannelType(String customType) throws ApiException {
    return new APIunbanUsersInChannelsWithCustomChannelTypeRequest(customType);
  }

private ApiResponse<Object> unmuteUsersInChannelsWithCustomChannelTypeWithHttpInfo(String customType, List<String> userIds, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIunmuteUsersInChannelsWithCustomChannelTypeRequest {
    private String customType;
    private List<String> userIds;
    private String apiToken;

    private APIunmuteUsersInChannelsWithCustomChannelTypeRequest(String customType) {
      this.customType = customType;
    }

    /**
     * Set userIds
     * @param userIds  (required)
     * @return APIunmuteUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIunmuteUsersInChannelsWithCustomChannelTypeRequest userIds(List<String> userIds) {
      this.userIds = userIds;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIunmuteUsersInChannelsWithCustomChannelTypeRequest
     */
    public APIunmuteUsersInChannelsWithCustomChannelTypeRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute unmuteUsersInChannelsWithCustomChannelType request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute unmuteUsersInChannelsWithCustomChannelType request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return unmuteUsersInChannelsWithCustomChannelTypeWithHttpInfo(customType, userIds, apiToken);
    }
  }

  /**
   * Unmute users in channels with a custom channel type
   * ## Unmute specified users in channels with a custom channel type at once.
   * @param customType  (required)
   * @return unmuteUsersInChannelsWithCustomChannelTypeRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIunmuteUsersInChannelsWithCustomChannelTypeRequest unmuteUsersInChannelsWithCustomChannelType(String customType) throws ApiException {
    return new APIunmuteUsersInChannelsWithCustomChannelTypeRequest(customType);
  }

private ApiResponse<UpdateApnsPushConfigurationByIdResponse> updateApnsPushConfigurationByIdWithHttpInfo(String providerId, String apiToken, UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData) throws ApiException {
    Object localVarPostBody = updateApnsPushConfigurationByIdData;
    
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

  public class APIupdateApnsPushConfigurationByIdRequest {
    private String providerId;
    private String apiToken;
    private UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData;

    private APIupdateApnsPushConfigurationByIdRequest(String providerId) {
      this.providerId = providerId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateApnsPushConfigurationByIdRequest
     */
    public APIupdateApnsPushConfigurationByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateApnsPushConfigurationByIdData
     * @param updateApnsPushConfigurationByIdData  (optional)
     * @return APIupdateApnsPushConfigurationByIdRequest
     */
    public APIupdateApnsPushConfigurationByIdRequest updateApnsPushConfigurationByIdData(UpdateApnsPushConfigurationByIdData updateApnsPushConfigurationByIdData) {
      this.updateApnsPushConfigurationByIdData = updateApnsPushConfigurationByIdData;
      return this;
    }

    /**
     * Execute updateApnsPushConfigurationById request
     * @return UpdateApnsPushConfigurationByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateApnsPushConfigurationByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateApnsPushConfigurationById request with HTTP info returned
     * @return ApiResponse&lt;UpdateApnsPushConfigurationByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateApnsPushConfigurationByIdResponse> executeWithHttpInfo() throws ApiException {
      return updateApnsPushConfigurationByIdWithHttpInfo(providerId, apiToken, updateApnsPushConfigurationByIdData);
    }
  }

  /**
   * Update an APNs push configuration
   * ## Update an APNs push configuration  Updates a specific APNs (Apple Push Notification service) push configuration for your client app. You can also register the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  &gt; __Note__: If your HTTP request body contains a [.p12](https://sendbird.com/docs/chat/v3/ios/guides/push-notifications#2-step-3-export-a-p12-file-and-upload-to-sendbird-dashboard) certificate file to upload to Sendbird server, you should send a [Multipart request](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api#2-headers-3-multipart-requests) .  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-apns-push-configuration ----------------------------
   * @param providerId  (required)
   * @return updateApnsPushConfigurationByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateApnsPushConfigurationByIdRequest updateApnsPushConfigurationById(String providerId) throws ApiException {
    return new APIupdateApnsPushConfigurationByIdRequest(providerId);
  }

private ApiResponse<UpdateDefaultChannelInvitationPreferenceResponse> updateDefaultChannelInvitationPreferenceWithHttpInfo(String apiToken, UpdateDefaultChannelInvitationPreferenceData updateDefaultChannelInvitationPreferenceData) throws ApiException {
    Object localVarPostBody = updateDefaultChannelInvitationPreferenceData;
    
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

  public class APIupdateDefaultChannelInvitationPreferenceRequest {
    private String apiToken;
    private UpdateDefaultChannelInvitationPreferenceData updateDefaultChannelInvitationPreferenceData;

    private APIupdateDefaultChannelInvitationPreferenceRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateDefaultChannelInvitationPreferenceRequest
     */
    public APIupdateDefaultChannelInvitationPreferenceRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateDefaultChannelInvitationPreferenceData
     * @param updateDefaultChannelInvitationPreferenceData  (optional)
     * @return APIupdateDefaultChannelInvitationPreferenceRequest
     */
    public APIupdateDefaultChannelInvitationPreferenceRequest updateDefaultChannelInvitationPreferenceData(UpdateDefaultChannelInvitationPreferenceData updateDefaultChannelInvitationPreferenceData) {
      this.updateDefaultChannelInvitationPreferenceData = updateDefaultChannelInvitationPreferenceData;
      return this;
    }

    /**
     * Execute updateDefaultChannelInvitationPreference request
     * @return UpdateDefaultChannelInvitationPreferenceResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateDefaultChannelInvitationPreferenceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateDefaultChannelInvitationPreference request with HTTP info returned
     * @return ApiResponse&lt;UpdateDefaultChannelInvitationPreferenceResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateDefaultChannelInvitationPreferenceResponse> executeWithHttpInfo() throws ApiException {
      return updateDefaultChannelInvitationPreferenceWithHttpInfo(apiToken, updateDefaultChannelInvitationPreferenceData);
    }
  }

  /**
   * Update default channel invitation preference
   * ## Update default channel invitation preference  Updates the default channel invitation preference of an application.  &gt; __Note__: Using the [update channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can update the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference
   * @return updateDefaultChannelInvitationPreferenceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateDefaultChannelInvitationPreferenceRequest updateDefaultChannelInvitationPreference() throws ApiException {
    return new APIupdateDefaultChannelInvitationPreferenceRequest();
  }

private ApiResponse<UpdateFcmPushConfigurationByIdResponse> updateFcmPushConfigurationByIdWithHttpInfo(String providerId, String apiToken, UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData) throws ApiException {
    Object localVarPostBody = updateFcmPushConfigurationByIdData;
    
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

  public class APIupdateFcmPushConfigurationByIdRequest {
    private String providerId;
    private String apiToken;
    private UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData;

    private APIupdateFcmPushConfigurationByIdRequest(String providerId) {
      this.providerId = providerId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateFcmPushConfigurationByIdRequest
     */
    public APIupdateFcmPushConfigurationByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateFcmPushConfigurationByIdData
     * @param updateFcmPushConfigurationByIdData  (optional)
     * @return APIupdateFcmPushConfigurationByIdRequest
     */
    public APIupdateFcmPushConfigurationByIdRequest updateFcmPushConfigurationByIdData(UpdateFcmPushConfigurationByIdData updateFcmPushConfigurationByIdData) {
      this.updateFcmPushConfigurationByIdData = updateFcmPushConfigurationByIdData;
      return this;
    }

    /**
     * Execute updateFcmPushConfigurationById request
     * @return UpdateFcmPushConfigurationByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateFcmPushConfigurationByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateFcmPushConfigurationById request with HTTP info returned
     * @return ApiResponse&lt;UpdateFcmPushConfigurationByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateFcmPushConfigurationByIdResponse> executeWithHttpInfo() throws ApiException {
      return updateFcmPushConfigurationByIdWithHttpInfo(providerId, apiToken, updateFcmPushConfigurationByIdData);
    }
  }

  /**
   * Update a FCM push configuration
   * ## Update a FCM push configuration  Updates a specific FCM (Firebase Cloud Messaging) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-fcm-push-configuration ----------------------------
   * @param providerId  (required)
   * @return updateFcmPushConfigurationByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateFcmPushConfigurationByIdRequest updateFcmPushConfigurationById(String providerId) throws ApiException {
    return new APIupdateFcmPushConfigurationByIdRequest(providerId);
  }

private ApiResponse<UpdateHmsPushConfigurationByIdResponse> updateHmsPushConfigurationByIdWithHttpInfo(String providerId, String apiToken, UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData) throws ApiException {
    Object localVarPostBody = updateHmsPushConfigurationByIdData;
    
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

  public class APIupdateHmsPushConfigurationByIdRequest {
    private String providerId;
    private String apiToken;
    private UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData;

    private APIupdateHmsPushConfigurationByIdRequest(String providerId) {
      this.providerId = providerId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateHmsPushConfigurationByIdRequest
     */
    public APIupdateHmsPushConfigurationByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateHmsPushConfigurationByIdData
     * @param updateHmsPushConfigurationByIdData  (optional)
     * @return APIupdateHmsPushConfigurationByIdRequest
     */
    public APIupdateHmsPushConfigurationByIdRequest updateHmsPushConfigurationByIdData(UpdateHmsPushConfigurationByIdData updateHmsPushConfigurationByIdData) {
      this.updateHmsPushConfigurationByIdData = updateHmsPushConfigurationByIdData;
      return this;
    }

    /**
     * Execute updateHmsPushConfigurationById request
     * @return UpdateHmsPushConfigurationByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateHmsPushConfigurationByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateHmsPushConfigurationById request with HTTP info returned
     * @return ApiResponse&lt;UpdateHmsPushConfigurationByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateHmsPushConfigurationByIdResponse> executeWithHttpInfo() throws ApiException {
      return updateHmsPushConfigurationByIdWithHttpInfo(providerId, apiToken, updateHmsPushConfigurationByIdData);
    }
  }

  /**
   * Update an HMS push configuration
   * ## Update an HMS push configuration  Updates a specific HMS (Huawei Mobile Services) push configuration for your client app. You can also update the configurations in your [dashboard](https://dashboard.sendbird.com) under Settings &gt; Application &gt; Notifications.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-an-hms-push-configuration ----------------------------
   * @param providerId  (required)
   * @return updateHmsPushConfigurationByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateHmsPushConfigurationByIdRequest updateHmsPushConfigurationById(String providerId) throws ApiException {
    return new APIupdateHmsPushConfigurationByIdRequest(providerId);
  }

private ApiResponse<UpdatePushNotificationContentTemplateResponse> updatePushNotificationContentTemplateWithHttpInfo(String templateName, String apiToken, UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData) throws ApiException {
    Object localVarPostBody = updatePushNotificationContentTemplateData;
    
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

  public class APIupdatePushNotificationContentTemplateRequest {
    private String templateName;
    private String apiToken;
    private UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData;

    private APIupdatePushNotificationContentTemplateRequest(String templateName) {
      this.templateName = templateName;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdatePushNotificationContentTemplateRequest
     */
    public APIupdatePushNotificationContentTemplateRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updatePushNotificationContentTemplateData
     * @param updatePushNotificationContentTemplateData  (optional)
     * @return APIupdatePushNotificationContentTemplateRequest
     */
    public APIupdatePushNotificationContentTemplateRequest updatePushNotificationContentTemplateData(UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData) {
      this.updatePushNotificationContentTemplateData = updatePushNotificationContentTemplateData;
      return this;
    }

    /**
     * Execute updatePushNotificationContentTemplate request
     * @return UpdatePushNotificationContentTemplateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdatePushNotificationContentTemplateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updatePushNotificationContentTemplate request with HTTP info returned
     * @return ApiResponse&lt;UpdatePushNotificationContentTemplateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdatePushNotificationContentTemplateResponse> executeWithHttpInfo() throws ApiException {
      return updatePushNotificationContentTemplateWithHttpInfo(templateName, apiToken, updatePushNotificationContentTemplateData);
    }
  }

  /**
   * Update a push notification content template
   * ## Update a push notification content template  Updates a specific push notification content template of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-a-push-notification-content-template ----------------------------
   * @param templateName  (required)
   * @return updatePushNotificationContentTemplateRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdatePushNotificationContentTemplateRequest updatePushNotificationContentTemplate(String templateName) throws ApiException {
    return new APIupdatePushNotificationContentTemplateRequest(templateName);
  }

private ApiResponse<ViewDefaultChannelInvitationPreferenceResponse> viewDefaultChannelInvitationPreferenceWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewDefaultChannelInvitationPreferenceRequest {
    private String apiToken;

    private APIviewDefaultChannelInvitationPreferenceRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewDefaultChannelInvitationPreferenceRequest
     */
    public APIviewDefaultChannelInvitationPreferenceRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewDefaultChannelInvitationPreference request
     * @return ViewDefaultChannelInvitationPreferenceResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewDefaultChannelInvitationPreferenceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewDefaultChannelInvitationPreference request with HTTP info returned
     * @return ApiResponse&lt;ViewDefaultChannelInvitationPreferenceResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewDefaultChannelInvitationPreferenceResponse> executeWithHttpInfo() throws ApiException {
      return viewDefaultChannelInvitationPreferenceWithHttpInfo(apiToken);
    }
  }

  /**
   * View default channel invitation preference
   * ## View default channel invitation preference  Retrieves the default channel invitation preference of an application.  &gt; __Note__: Using the [view channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference) action, you can retrieve the value of a specific user&#39;s channel invitation preference, which can be set individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference
   * @return viewDefaultChannelInvitationPreferenceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewDefaultChannelInvitationPreferenceRequest viewDefaultChannelInvitationPreference() throws ApiException {
    return new APIviewDefaultChannelInvitationPreferenceRequest();
  }

private ApiResponse<ViewPushConfigurationByIdResponse> viewPushConfigurationByIdWithHttpInfo(String pushType, String providerId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewPushConfigurationByIdRequest {
    private String pushType;
    private String providerId;
    private String apiToken;

    private APIviewPushConfigurationByIdRequest(String pushType, String providerId) {
      this.pushType = pushType;
      this.providerId = providerId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewPushConfigurationByIdRequest
     */
    public APIviewPushConfigurationByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewPushConfigurationById request
     * @return ViewPushConfigurationByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewPushConfigurationByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewPushConfigurationById request with HTTP info returned
     * @return ApiResponse&lt;ViewPushConfigurationByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewPushConfigurationByIdResponse> executeWithHttpInfo() throws ApiException {
      return viewPushConfigurationByIdWithHttpInfo(pushType, providerId, apiToken);
    }
  }

  /**
   * View a push configuration
   * ## View a push configuration  Retrieves a specific push configuration of an application. The type of a push configuration is either &#x60;fcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-configuration ----------------------------
   * @param pushType  (required)
   * @param providerId  (required)
   * @return viewPushConfigurationByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewPushConfigurationByIdRequest viewPushConfigurationById(String pushType, String providerId) throws ApiException {
    return new APIviewPushConfigurationByIdRequest(pushType, providerId);
  }

private ApiResponse<ViewPushNotificationContentTemplateResponse> viewPushNotificationContentTemplateWithHttpInfo(String templateName, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewPushNotificationContentTemplateRequest {
    private String templateName;
    private String apiToken;

    private APIviewPushNotificationContentTemplateRequest(String templateName) {
      this.templateName = templateName;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewPushNotificationContentTemplateRequest
     */
    public APIviewPushNotificationContentTemplateRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewPushNotificationContentTemplate request
     * @return ViewPushNotificationContentTemplateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewPushNotificationContentTemplateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewPushNotificationContentTemplate request with HTTP info returned
     * @return ApiResponse&lt;ViewPushNotificationContentTemplateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewPushNotificationContentTemplateResponse> executeWithHttpInfo() throws ApiException {
      return viewPushNotificationContentTemplateWithHttpInfo(templateName, apiToken);
    }
  }

  /**
   * Get a push notification content template
   * ## Get a push notification content template  Retrieves information on a specific push notification content templates of an application. The name of a content template is either &#x60;default&#x60; or &#x60;alternative&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-push-notification-content-template ----------------------------
   * @param templateName  (required)
   * @return viewPushNotificationContentTemplateRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewPushNotificationContentTemplateRequest viewPushNotificationContentTemplate(String templateName) throws ApiException {
    return new APIviewPushNotificationContentTemplateRequest(templateName);
  }

private ApiResponse<ViewSecondaryApiTokenByTokenResponse> viewSecondaryApiTokenByTokenWithHttpInfo(String apiToken2, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewSecondaryApiTokenByTokenRequest {
    private String apiToken2;
    private String apiToken;

    private APIviewSecondaryApiTokenByTokenRequest(String apiToken2) {
      this.apiToken2 = apiToken2;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewSecondaryApiTokenByTokenRequest
     */
    public APIviewSecondaryApiTokenByTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewSecondaryApiTokenByToken request
     * @return ViewSecondaryApiTokenByTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewSecondaryApiTokenByTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewSecondaryApiTokenByToken request with HTTP info returned
     * @return ApiResponse&lt;ViewSecondaryApiTokenByTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewSecondaryApiTokenByTokenResponse> executeWithHttpInfo() throws ApiException {
      return viewSecondaryApiTokenByTokenWithHttpInfo(apiToken2, apiToken);
    }
  }

  /**
   * View a secondary API token
   * ## View a secondary API token  Retrieves the information on a secondary API token.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-a-secondary-api-token
   * @param apiToken2  (required)
   * @return viewSecondaryApiTokenByTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewSecondaryApiTokenByTokenRequest viewSecondaryApiTokenByToken(String apiToken2) throws ApiException {
    return new APIviewSecondaryApiTokenByTokenRequest(apiToken2);
  }
}
