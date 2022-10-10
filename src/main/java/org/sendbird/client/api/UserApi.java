package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.AddRegistrationOrDeviceTokenData;
import org.openapitools.client.model.AddRegistrationOrDeviceTokenResponse;
import org.openapitools.client.model.ChoosePushNotificationContentTemplateResponse;
import org.openapitools.client.model.CreateUserData;
import org.openapitools.client.model.CreateUserTokenData;
import org.openapitools.client.model.CreateUserTokenResponse;
import org.openapitools.client.model.LeaveMyGroupChannelsData;
import org.openapitools.client.model.ListMyGroupChannelsResponse;
import org.openapitools.client.model.ListRegistrationOrDeviceTokensResponse;
import org.openapitools.client.model.ListUsersResponse;
import org.openapitools.client.model.MarkAllMessagesAsReadData;
import org.openapitools.client.model.RegisterAsOperatorToChannelsWithCustomChannelTypesData;
import org.openapitools.client.model.RemoveRegistrationOrDeviceTokenByTokenResponse;
import org.openapitools.client.model.RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse;
import org.openapitools.client.model.RemoveRegistrationOrDeviceTokenResponse;
import org.openapitools.client.model.ResetPushPreferencesResponse;
import org.openapitools.client.model.SendBirdUser;
import org.openapitools.client.model.UpdateChannelInvitationPreferenceData;
import org.openapitools.client.model.UpdateChannelInvitationPreferenceResponse;
import org.openapitools.client.model.UpdateCountPreferenceOfChannelByUrlData;
import org.openapitools.client.model.UpdateCountPreferenceOfChannelByUrlResponse;
import org.openapitools.client.model.UpdatePushPreferencesData;
import org.openapitools.client.model.UpdatePushPreferencesForChannelByUrlData;
import org.openapitools.client.model.UpdatePushPreferencesForChannelByUrlResponse;
import org.openapitools.client.model.UpdatePushPreferencesResponse;
import org.openapitools.client.model.UpdateUserByIdData;
import org.openapitools.client.model.ViewChannelInvitationPreferenceResponse;
import org.openapitools.client.model.ViewCountPreferenceOfChannelByUrlResponse;
import org.openapitools.client.model.ViewNumberOfChannelsByJoinStatusResponse;
import org.openapitools.client.model.ViewNumberOfChannelsWithUnreadMessagesResponse;
import org.openapitools.client.model.ViewNumberOfUnreadItemsResponse;
import org.openapitools.client.model.ViewNumberOfUnreadMessagesResponse;
import org.openapitools.client.model.ViewPushPreferencesForChannelByUrlResponse;
import org.openapitools.client.model.ViewPushPreferencesResponse;
import org.openapitools.client.model.ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
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
   * Add a registration or device token
   * ## Add a registration or device token  &gt; __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.  To send notification requests to push notification services on behalf of your server, adds a specific user&#39;s FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.  &gt; __Note__: For more information on the registration token and device token, visit the Google&#39;s [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei&#39;s [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple&#39;s [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param tokenType  (required)
   * @param addRegistrationOrDeviceTokenData  (optional)
   * @return AddRegistrationOrDeviceTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddRegistrationOrDeviceTokenResponse addRegistrationOrDeviceToken(String apiToken, String userId, String tokenType, AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData) throws ApiException {
    return addRegistrationOrDeviceTokenWithHttpInfo(apiToken, userId, tokenType, addRegistrationOrDeviceTokenData).getData();
  }

  /**
   * Add a registration or device token
   * ## Add a registration or device token  &gt; __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.  To send notification requests to push notification services on behalf of your server, adds a specific user&#39;s FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.  &gt; __Note__: For more information on the registration token and device token, visit the Google&#39;s [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei&#39;s [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple&#39;s [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param tokenType  (required)
   * @param addRegistrationOrDeviceTokenData  (optional)
   * @return ApiResponse&lt;AddRegistrationOrDeviceTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddRegistrationOrDeviceTokenResponse> addRegistrationOrDeviceTokenWithHttpInfo(String apiToken, String userId, String tokenType, AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData) throws ApiException {
    Object localVarPostBody = addRegistrationOrDeviceTokenData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addRegistrationOrDeviceToken");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addRegistrationOrDeviceToken");
    }
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling addRegistrationOrDeviceToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push/{token_type}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "token_type" + "\\}", apiClient.escapeString(tokenType.toString()));

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

    GenericType<AddRegistrationOrDeviceTokenResponse> localVarReturnType = new GenericType<AddRegistrationOrDeviceTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.addRegistrationOrDeviceToken", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Choose a push notification content template
   * ## Choose a push notification content template  Chooses a push notification content template of a user&#39;s own. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-choose-a-push-notification-content-template ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param body  (optional)
   * @return ChoosePushNotificationContentTemplateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ChoosePushNotificationContentTemplateResponse choosePushNotificationContentTemplate(String apiToken, String userId, Object body) throws ApiException {
    return choosePushNotificationContentTemplateWithHttpInfo(apiToken, userId, body).getData();
  }

  /**
   * Choose a push notification content template
   * ## Choose a push notification content template  Chooses a push notification content template of a user&#39;s own. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-choose-a-push-notification-content-template ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param body  (optional)
   * @return ApiResponse&lt;ChoosePushNotificationContentTemplateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChoosePushNotificationContentTemplateResponse> choosePushNotificationContentTemplateWithHttpInfo(String apiToken, String userId, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling choosePushNotificationContentTemplate");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling choosePushNotificationContentTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push/template"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<ChoosePushNotificationContentTemplateResponse> localVarReturnType = new GenericType<ChoosePushNotificationContentTemplateResponse>() {};

    return apiClient.invokeAPI("UserApi.choosePushNotificationContentTemplate", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a user
   * ## Create a user  Creates a new user in the application. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user
   * @param apiToken  (required)
   * @param createUserData  (optional)
   * @return SendBirdUser
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdUser createUser(String apiToken, CreateUserData createUserData) throws ApiException {
    return createUserWithHttpInfo(apiToken, createUserData).getData();
  }

  /**
   * Create a user
   * ## Create a user  Creates a new user in the application. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user
   * @param apiToken  (required)
   * @param createUserData  (optional)
   * @return ApiResponse&lt;SendBirdUser&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdUser> createUserWithHttpInfo(String apiToken, CreateUserData createUserData) throws ApiException {
    Object localVarPostBody = createUserData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users";

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

    GenericType<SendBirdUser> localVarReturnType = new GenericType<SendBirdUser>() {};

    return apiClient.invokeAPI("UserApi.createUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create user token
   * ## Create user token
   * @param apiToken  (required)
   * @param userId  (required)
   * @param createUserTokenData  (optional)
   * @return CreateUserTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public CreateUserTokenResponse createUserToken(String apiToken, String userId, CreateUserTokenData createUserTokenData) throws ApiException {
    return createUserTokenWithHttpInfo(apiToken, userId, createUserTokenData).getData();
  }

  /**
   * Create user token
   * ## Create user token
   * @param apiToken  (required)
   * @param userId  (required)
   * @param createUserTokenData  (optional)
   * @return ApiResponse&lt;CreateUserTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateUserTokenResponse> createUserTokenWithHttpInfo(String apiToken, String userId, CreateUserTokenData createUserTokenData) throws ApiException {
    Object localVarPostBody = createUserTokenData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling createUserToken");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createUserToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/token"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<CreateUserTokenResponse> localVarReturnType = new GenericType<CreateUserTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.createUserToken", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a user
   * ## Delete a user  Deletes a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-delete-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object deleteUserById(String apiToken, String userId) throws ApiException {
    return deleteUserByIdWithHttpInfo(apiToken, userId).getData();
  }

  /**
   * Delete a user
   * ## Delete a user  Deletes a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-delete-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deleteUserByIdWithHttpInfo(String apiToken, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteUserById");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("UserApi.deleteUserById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Leave my group channels
   * ## Leave my group channels  Makes a user leave all joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-leave-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to leave all joined group channels.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param leaveMyGroupChannelsData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object leaveMyGroupChannels(String apiToken, String userId, LeaveMyGroupChannelsData leaveMyGroupChannelsData) throws ApiException {
    return leaveMyGroupChannelsWithHttpInfo(apiToken, userId, leaveMyGroupChannelsData).getData();
  }

  /**
   * Leave my group channels
   * ## Leave my group channels  Makes a user leave all joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-leave-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to leave all joined group channels.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param leaveMyGroupChannelsData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> leaveMyGroupChannelsWithHttpInfo(String apiToken, String userId, LeaveMyGroupChannelsData leaveMyGroupChannelsData) throws ApiException {
    Object localVarPostBody = leaveMyGroupChannelsData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling leaveMyGroupChannels");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling leaveMyGroupChannels");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/my_group_channels/leave"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    return apiClient.invokeAPI("UserApi.leaveMyGroupChannels", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List my group channels
   * ## List my group channels  Retrieves all group channels that the user has joined. You can create a request based on various query parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param distinctMode  (optional)
   * @param publicMode  (optional)
   * @param superMode  (optional)
   * @param hiddenMode  (optional)
   * @param memberStateFilter  (optional)
   * @param unreadFilter  (optional)
   * @param createdAfter  (optional)
   * @param createdBefore  (optional)
   * @param showEmpty  (optional)
   * @param showFrozen  (optional)
   * @param showMember  (optional)
   * @param showDeliveryReceipt  (optional)
   * @param showReadReceipt  (optional)
   * @param order  (optional)
   * @param metadataOrderKey  (optional)
   * @param customTypes  (optional)
   * @param customTypeStartswith  (optional)
   * @param channelUrls  (optional)
   * @param name  (optional)
   * @param nameContains  (optional)
   * @param nameStartswith  (optional)
   * @param membersExactlyIn  (optional)
   * @param membersIncludeIn  (optional)
   * @param queryType  (optional)
   * @param membersNickname  (optional)
   * @param membersNicknameContains  (optional)
   * @param searchQuery  (optional)
   * @param searchFields  (optional)
   * @param metadataKey  (optional)
   * @param metadataValues  (optional)
   * @param metadataValueStartswith  (optional)
   * @param metacounterKey  (optional)
   * @param metacounterValues  (optional)
   * @param metacounterValueGt  (optional)
   * @param metacounterValueGte  (optional)
   * @param metacounterValueLt  (optional)
   * @param metacounterValueLte  (optional)
   * @param customType  (optional)
   * @return ListMyGroupChannelsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListMyGroupChannelsResponse listMyGroupChannels(String apiToken, String userId, String token, Integer limit, String distinctMode, String publicMode, String superMode, String hiddenMode, String memberStateFilter, String unreadFilter, Integer createdAfter, Integer createdBefore, Boolean showEmpty, Boolean showFrozen, Boolean showMember, Boolean showDeliveryReceipt, Boolean showReadReceipt, String order, String metadataOrderKey, String customTypes, String customTypeStartswith, String channelUrls, String name, String nameContains, String nameStartswith, String membersExactlyIn, String membersIncludeIn, String queryType, String membersNickname, String membersNicknameContains, String searchQuery, String searchFields, String metadataKey, String metadataValues, String metadataValueStartswith, String metacounterKey, String metacounterValues, String metacounterValueGt, String metacounterValueGte, String metacounterValueLt, String metacounterValueLte, String customType) throws ApiException {
    return listMyGroupChannelsWithHttpInfo(apiToken, userId, token, limit, distinctMode, publicMode, superMode, hiddenMode, memberStateFilter, unreadFilter, createdAfter, createdBefore, showEmpty, showFrozen, showMember, showDeliveryReceipt, showReadReceipt, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, searchQuery, searchFields, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, customType).getData();
  }

  /**
   * List my group channels
   * ## List my group channels  Retrieves all group channels that the user has joined. You can create a request based on various query parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param distinctMode  (optional)
   * @param publicMode  (optional)
   * @param superMode  (optional)
   * @param hiddenMode  (optional)
   * @param memberStateFilter  (optional)
   * @param unreadFilter  (optional)
   * @param createdAfter  (optional)
   * @param createdBefore  (optional)
   * @param showEmpty  (optional)
   * @param showFrozen  (optional)
   * @param showMember  (optional)
   * @param showDeliveryReceipt  (optional)
   * @param showReadReceipt  (optional)
   * @param order  (optional)
   * @param metadataOrderKey  (optional)
   * @param customTypes  (optional)
   * @param customTypeStartswith  (optional)
   * @param channelUrls  (optional)
   * @param name  (optional)
   * @param nameContains  (optional)
   * @param nameStartswith  (optional)
   * @param membersExactlyIn  (optional)
   * @param membersIncludeIn  (optional)
   * @param queryType  (optional)
   * @param membersNickname  (optional)
   * @param membersNicknameContains  (optional)
   * @param searchQuery  (optional)
   * @param searchFields  (optional)
   * @param metadataKey  (optional)
   * @param metadataValues  (optional)
   * @param metadataValueStartswith  (optional)
   * @param metacounterKey  (optional)
   * @param metacounterValues  (optional)
   * @param metacounterValueGt  (optional)
   * @param metacounterValueGte  (optional)
   * @param metacounterValueLt  (optional)
   * @param metacounterValueLte  (optional)
   * @param customType  (optional)
   * @return ApiResponse&lt;ListMyGroupChannelsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListMyGroupChannelsResponse> listMyGroupChannelsWithHttpInfo(String apiToken, String userId, String token, Integer limit, String distinctMode, String publicMode, String superMode, String hiddenMode, String memberStateFilter, String unreadFilter, Integer createdAfter, Integer createdBefore, Boolean showEmpty, Boolean showFrozen, Boolean showMember, Boolean showDeliveryReceipt, Boolean showReadReceipt, String order, String metadataOrderKey, String customTypes, String customTypeStartswith, String channelUrls, String name, String nameContains, String nameStartswith, String membersExactlyIn, String membersIncludeIn, String queryType, String membersNickname, String membersNicknameContains, String searchQuery, String searchFields, String metadataKey, String metadataValues, String metadataValueStartswith, String metacounterKey, String metacounterValues, String metacounterValueGt, String metacounterValueGte, String metacounterValueLt, String metacounterValueLte, String customType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listMyGroupChannels");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listMyGroupChannels");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/my_group_channels"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "distinct_mode", distinctMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "public_mode", publicMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "super_mode", superMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hidden_mode", hiddenMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "member_state_filter", memberStateFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unread_filter", unreadFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_after", createdAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_before", createdBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_empty", showEmpty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_frozen", showFrozen));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_member", showMember));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_delivery_receipt", showDeliveryReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_read_receipt", showReadReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadata_order_key", metadataOrderKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_type_startswith", customTypeStartswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel_urls", channelUrls));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name_contains", nameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name_startswith", nameStartswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_exactly_in", membersExactlyIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_include_in", membersIncludeIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query_type", queryType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_nickname", membersNickname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_nickname_contains", membersNicknameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_query", searchQuery));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_fields", searchFields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadata_key", metadataKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadata_values", metadataValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadata_value_startswith", metadataValueStartswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_key", metacounterKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_values", metacounterValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_gt", metacounterValueGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_gte", metacounterValueGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_lt", metacounterValueLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_lte", metacounterValueLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_type", customType));

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

    GenericType<ListMyGroupChannelsResponse> localVarReturnType = new GenericType<ListMyGroupChannelsResponse>() {};

    return apiClient.invokeAPI("UserApi.listMyGroupChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List registration or device tokens
   * ## List registration or device tokens  Retrieves a list of a specific user&#39;s FCM registration tokens, HMS device tokens, or APNs device tokens. You can specify either &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; in the &#x60;token_type&#x60; parameter, depending on which push notification service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-registration-or-device-tokens ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param tokenType  (required)
   * @return ListRegistrationOrDeviceTokensResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListRegistrationOrDeviceTokensResponse listRegistrationOrDeviceTokens(String apiToken, String userId, String tokenType) throws ApiException {
    return listRegistrationOrDeviceTokensWithHttpInfo(apiToken, userId, tokenType).getData();
  }

  /**
   * List registration or device tokens
   * ## List registration or device tokens  Retrieves a list of a specific user&#39;s FCM registration tokens, HMS device tokens, or APNs device tokens. You can specify either &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; in the &#x60;token_type&#x60; parameter, depending on which push notification service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-registration-or-device-tokens ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param tokenType  (required)
   * @return ApiResponse&lt;ListRegistrationOrDeviceTokensResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRegistrationOrDeviceTokensResponse> listRegistrationOrDeviceTokensWithHttpInfo(String apiToken, String userId, String tokenType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listRegistrationOrDeviceTokens");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listRegistrationOrDeviceTokens");
    }
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling listRegistrationOrDeviceTokens");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push/{token_type}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "token_type" + "\\}", apiClient.escapeString(tokenType.toString()));

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

    GenericType<ListRegistrationOrDeviceTokensResponse> localVarReturnType = new GenericType<ListRegistrationOrDeviceTokensResponse>() {};

    return apiClient.invokeAPI("UserApi.listRegistrationOrDeviceTokens", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List users
   * ## List users  Retrieves a list of users in your application. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-users ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param activeMode  (optional)
   * @param showBot  (optional)
   * @param userIds  (optional)
   * @param nickname  (optional)
   * @param nicknameStartswith  (optional)
   * @param metadatakey  (optional)
   * @param metadatavaluesIn  (optional)
   * @return ListUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListUsersResponse listUsers(String apiToken, String token, Integer limit, String activeMode, Boolean showBot, String userIds, String nickname, String nicknameStartswith, String metadatakey, String metadatavaluesIn) throws ApiException {
    return listUsersWithHttpInfo(apiToken, token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn).getData();
  }

  /**
   * List users
   * ## List users  Retrieves a list of users in your application. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-users ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param activeMode  (optional)
   * @param showBot  (optional)
   * @param userIds  (optional)
   * @param nickname  (optional)
   * @param nicknameStartswith  (optional)
   * @param metadatakey  (optional)
   * @param metadatavaluesIn  (optional)
   * @return ApiResponse&lt;ListUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListUsersResponse> listUsersWithHttpInfo(String apiToken, String token, Integer limit, String activeMode, Boolean showBot, String userIds, String nickname, String nicknameStartswith, String metadatakey, String metadatavaluesIn) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active_mode", activeMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_bot", showBot));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_ids", userIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname", nickname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname_startswith", nicknameStartswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadatakey", metadatakey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadatavalues_in", metadatavaluesIn));

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

    GenericType<ListUsersResponse> localVarReturnType = new GenericType<ListUsersResponse>() {};

    return apiClient.invokeAPI("UserApi.listUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Mark all messages as read
   * ## Mark all messages as read  Marks all of a user&#39;s unread messages as read in the joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mark-all-messages-as-read ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param markAllMessagesAsReadData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object markAllMessagesAsRead(String apiToken, String userId, MarkAllMessagesAsReadData markAllMessagesAsReadData) throws ApiException {
    return markAllMessagesAsReadWithHttpInfo(apiToken, userId, markAllMessagesAsReadData).getData();
  }

  /**
   * Mark all messages as read
   * ## Mark all messages as read  Marks all of a user&#39;s unread messages as read in the joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mark-all-messages-as-read ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param markAllMessagesAsReadData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> markAllMessagesAsReadWithHttpInfo(String apiToken, String userId, MarkAllMessagesAsReadData markAllMessagesAsReadData) throws ApiException {
    Object localVarPostBody = markAllMessagesAsReadData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling markAllMessagesAsRead");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling markAllMessagesAsRead");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/mark_as_read_all"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    return apiClient.invokeAPI("UserApi.markAllMessagesAsRead", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Register as an operator to channels with custom channel types
   * ## Register as an operator to channels with custom channel types  Registers a user as an operator to channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-register-as-an-operator-to-channels-with-custom-channel-types ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param registerAsOperatorToChannelsWithCustomChannelTypesData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object registerAsOperatorToChannelsWithCustomChannelTypes(String apiToken, String userId, RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData) throws ApiException {
    return registerAsOperatorToChannelsWithCustomChannelTypesWithHttpInfo(apiToken, userId, registerAsOperatorToChannelsWithCustomChannelTypesData).getData();
  }

  /**
   * Register as an operator to channels with custom channel types
   * ## Register as an operator to channels with custom channel types  Registers a user as an operator to channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-register-as-an-operator-to-channels-with-custom-channel-types ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param registerAsOperatorToChannelsWithCustomChannelTypesData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> registerAsOperatorToChannelsWithCustomChannelTypesWithHttpInfo(String apiToken, String userId, RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData) throws ApiException {
    Object localVarPostBody = registerAsOperatorToChannelsWithCustomChannelTypesData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling registerAsOperatorToChannelsWithCustomChannelTypes");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling registerAsOperatorToChannelsWithCustomChannelTypes");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/operating_channel_custom_types"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    return apiClient.invokeAPI("UserApi.registerAsOperatorToChannelsWithCustomChannelTypes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove a registration or device token - When unregistering all device tokens
   * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return RemoveRegistrationOrDeviceTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RemoveRegistrationOrDeviceTokenResponse removeRegistrationOrDeviceToken(String apiToken, String userId) throws ApiException {
    return removeRegistrationOrDeviceTokenWithHttpInfo(apiToken, userId).getData();
  }

  /**
   * Remove a registration or device token - When unregistering all device tokens
   * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ApiResponse&lt;RemoveRegistrationOrDeviceTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RemoveRegistrationOrDeviceTokenResponse> removeRegistrationOrDeviceTokenWithHttpInfo(String apiToken, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling removeRegistrationOrDeviceToken");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeRegistrationOrDeviceToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<RemoveRegistrationOrDeviceTokenResponse> localVarReturnType = new GenericType<RemoveRegistrationOrDeviceTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.removeRegistrationOrDeviceToken", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove a registration or device token - When unregistering a specific token
   * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param tokenType  (required)
   * @param token  (required)
   * @return RemoveRegistrationOrDeviceTokenByTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RemoveRegistrationOrDeviceTokenByTokenResponse removeRegistrationOrDeviceTokenByToken(String apiToken, String userId, String tokenType, String token) throws ApiException {
    return removeRegistrationOrDeviceTokenByTokenWithHttpInfo(apiToken, userId, tokenType, token).getData();
  }

  /**
   * Remove a registration or device token - When unregistering a specific token
   * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param tokenType  (required)
   * @param token  (required)
   * @return ApiResponse&lt;RemoveRegistrationOrDeviceTokenByTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RemoveRegistrationOrDeviceTokenByTokenResponse> removeRegistrationOrDeviceTokenByTokenWithHttpInfo(String apiToken, String userId, String tokenType, String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling removeRegistrationOrDeviceTokenByToken");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeRegistrationOrDeviceTokenByToken");
    }
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling removeRegistrationOrDeviceTokenByToken");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling removeRegistrationOrDeviceTokenByToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push/{token_type}/{token}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "token_type" + "\\}", apiClient.escapeString(tokenType.toString()))
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

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

    GenericType<RemoveRegistrationOrDeviceTokenByTokenResponse> localVarReturnType = new GenericType<RemoveRegistrationOrDeviceTokenByTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.removeRegistrationOrDeviceTokenByToken", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove a registration or device token from an owner
   * ## Remove a registration or device token from an owner  Removes a registration or device token from a user who owns it. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token-from-an-owner ----------------------------
   * @param apiToken  (required)
   * @param tokenType  (required)
   * @param token  (required)
   * @return RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse removeRegistrationOrDeviceTokenFromOwnerByToken(String apiToken, String tokenType, String token) throws ApiException {
    return removeRegistrationOrDeviceTokenFromOwnerByTokenWithHttpInfo(apiToken, tokenType, token).getData();
  }

  /**
   * Remove a registration or device token from an owner
   * ## Remove a registration or device token from an owner  Removes a registration or device token from a user who owns it. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token-from-an-owner ----------------------------
   * @param apiToken  (required)
   * @param tokenType  (required)
   * @param token  (required)
   * @return ApiResponse&lt;RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse> removeRegistrationOrDeviceTokenFromOwnerByTokenWithHttpInfo(String apiToken, String tokenType, String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling removeRegistrationOrDeviceTokenFromOwnerByToken");
    }
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling removeRegistrationOrDeviceTokenFromOwnerByToken");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling removeRegistrationOrDeviceTokenFromOwnerByToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/push/device_tokens/{token_type}/{token}"
      .replaceAll("\\{" + "token_type" + "\\}", apiClient.escapeString(tokenType.toString()))
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

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

    GenericType<RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse> localVarReturnType = new GenericType<RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.removeRegistrationOrDeviceTokenFromOwnerByToken", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Reset push preferences
   * ## Reset push preferences  Resets a user&#39;s push preferences. After performing this action,   &#x60;do_not_disturb&#x60; and &#x60;snooze_enabled&#x60; are set to false.  The values of the parameters associated with the time frame are all set to 0.  &#x60;timezone&#x60; is reset to &#x60;UTC&#x60;.  &#x60;push_sound&#x60; is reset to &#x60;default&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-reset-push-preferences ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ResetPushPreferencesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ResetPushPreferencesResponse resetPushPreferences(String apiToken, String userId) throws ApiException {
    return resetPushPreferencesWithHttpInfo(apiToken, userId).getData();
  }

  /**
   * Reset push preferences
   * ## Reset push preferences  Resets a user&#39;s push preferences. After performing this action,   &#x60;do_not_disturb&#x60; and &#x60;snooze_enabled&#x60; are set to false.  The values of the parameters associated with the time frame are all set to 0.  &#x60;timezone&#x60; is reset to &#x60;UTC&#x60;.  &#x60;push_sound&#x60; is reset to &#x60;default&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-reset-push-preferences ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ApiResponse&lt;ResetPushPreferencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResetPushPreferencesResponse> resetPushPreferencesWithHttpInfo(String apiToken, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling resetPushPreferences");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling resetPushPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push_preference"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<ResetPushPreferencesResponse> localVarReturnType = new GenericType<ResetPushPreferencesResponse>() {};

    return apiClient.invokeAPI("UserApi.resetPushPreferences", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update channel invitation preference
   * ## Update channel invitation preference  Updates the channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, you can update the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference
   * @param apiToken  (required)
   * @param userId  (required)
   * @param updateChannelInvitationPreferenceData  (optional)
   * @return UpdateChannelInvitationPreferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateChannelInvitationPreferenceResponse updateChannelInvitationPreference(String apiToken, String userId, UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData) throws ApiException {
    return updateChannelInvitationPreferenceWithHttpInfo(apiToken, userId, updateChannelInvitationPreferenceData).getData();
  }

  /**
   * Update channel invitation preference
   * ## Update channel invitation preference  Updates the channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, you can update the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference
   * @param apiToken  (required)
   * @param userId  (required)
   * @param updateChannelInvitationPreferenceData  (optional)
   * @return ApiResponse&lt;UpdateChannelInvitationPreferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateChannelInvitationPreferenceResponse> updateChannelInvitationPreferenceWithHttpInfo(String apiToken, String userId, UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData) throws ApiException {
    Object localVarPostBody = updateChannelInvitationPreferenceData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateChannelInvitationPreference");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateChannelInvitationPreference");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/channel_invitation_preference"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UpdateChannelInvitationPreferenceResponse> localVarReturnType = new GenericType<UpdateChannelInvitationPreferenceResponse>() {};

    return apiClient.invokeAPI("UserApi.updateChannelInvitationPreference", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update count preference of a channel
   * ## Update count preference of a channel  Updates count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-count-preference-of-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @param updateCountPreferenceOfChannelByUrlData  (optional)
   * @return UpdateCountPreferenceOfChannelByUrlResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateCountPreferenceOfChannelByUrlResponse updateCountPreferenceOfChannelByUrl(String apiToken, String userId, String channelUrl, UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData) throws ApiException {
    return updateCountPreferenceOfChannelByUrlWithHttpInfo(apiToken, userId, channelUrl, updateCountPreferenceOfChannelByUrlData).getData();
  }

  /**
   * Update count preference of a channel
   * ## Update count preference of a channel  Updates count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-count-preference-of-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @param updateCountPreferenceOfChannelByUrlData  (optional)
   * @return ApiResponse&lt;UpdateCountPreferenceOfChannelByUrlResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateCountPreferenceOfChannelByUrlResponse> updateCountPreferenceOfChannelByUrlWithHttpInfo(String apiToken, String userId, String channelUrl, UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData) throws ApiException {
    Object localVarPostBody = updateCountPreferenceOfChannelByUrlData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateCountPreferenceOfChannelByUrl");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateCountPreferenceOfChannelByUrl");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateCountPreferenceOfChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/count_preference/{channel_url}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<UpdateCountPreferenceOfChannelByUrlResponse> localVarReturnType = new GenericType<UpdateCountPreferenceOfChannelByUrlResponse>() {};

    return apiClient.invokeAPI("UserApi.updateCountPreferenceOfChannelByUrl", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update push preferences
   * ## Update push preferences  Updates a user&#39;s push preferences. Through this action, you can set &#x60;do_not_disturb&#x60; for a user, and update the time frame in which the setting applies.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param updatePushPreferencesData  (optional)
   * @return UpdatePushPreferencesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdatePushPreferencesResponse updatePushPreferences(String apiToken, String userId, UpdatePushPreferencesData updatePushPreferencesData) throws ApiException {
    return updatePushPreferencesWithHttpInfo(apiToken, userId, updatePushPreferencesData).getData();
  }

  /**
   * Update push preferences
   * ## Update push preferences  Updates a user&#39;s push preferences. Through this action, you can set &#x60;do_not_disturb&#x60; for a user, and update the time frame in which the setting applies.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param updatePushPreferencesData  (optional)
   * @return ApiResponse&lt;UpdatePushPreferencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdatePushPreferencesResponse> updatePushPreferencesWithHttpInfo(String apiToken, String userId, UpdatePushPreferencesData updatePushPreferencesData) throws ApiException {
    Object localVarPostBody = updatePushPreferencesData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updatePushPreferences");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updatePushPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push_preference"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UpdatePushPreferencesResponse> localVarReturnType = new GenericType<UpdatePushPreferencesResponse>() {};

    return apiClient.invokeAPI("UserApi.updatePushPreferences", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update push preferences for a channel
   * ## Update push preferences for a channel  Updates push preferences for a user&#39;s specific group channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences-for-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @param updatePushPreferencesForChannelByUrlData  (optional)
   * @return UpdatePushPreferencesForChannelByUrlResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdatePushPreferencesForChannelByUrlResponse updatePushPreferencesForChannelByUrl(String apiToken, String userId, String channelUrl, UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData) throws ApiException {
    return updatePushPreferencesForChannelByUrlWithHttpInfo(apiToken, userId, channelUrl, updatePushPreferencesForChannelByUrlData).getData();
  }

  /**
   * Update push preferences for a channel
   * ## Update push preferences for a channel  Updates push preferences for a user&#39;s specific group channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences-for-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @param updatePushPreferencesForChannelByUrlData  (optional)
   * @return ApiResponse&lt;UpdatePushPreferencesForChannelByUrlResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdatePushPreferencesForChannelByUrlResponse> updatePushPreferencesForChannelByUrlWithHttpInfo(String apiToken, String userId, String channelUrl, UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData) throws ApiException {
    Object localVarPostBody = updatePushPreferencesForChannelByUrlData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updatePushPreferencesForChannelByUrl");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updatePushPreferencesForChannelByUrl");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updatePushPreferencesForChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push_preference/{channel_url}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<UpdatePushPreferencesForChannelByUrlResponse> localVarReturnType = new GenericType<UpdatePushPreferencesForChannelByUrlResponse>() {};

    return apiClient.invokeAPI("UserApi.updatePushPreferencesForChannelByUrl", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a user
   * ## Update a user  Updates information on a user. In addition to changing a user&#39;s nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.  You can also deactivate or reactivate a user. If the &#x60;leave_all_when_deactivated&#x60; is true (which it is by default), a user leaves all joined group channels when deactivated.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param updateUserByIdData  (optional)
   * @return SendBirdUser
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdUser updateUserById(String apiToken, String userId, UpdateUserByIdData updateUserByIdData) throws ApiException {
    return updateUserByIdWithHttpInfo(apiToken, userId, updateUserByIdData).getData();
  }

  /**
   * Update a user
   * ## Update a user  Updates information on a user. In addition to changing a user&#39;s nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.  You can also deactivate or reactivate a user. If the &#x60;leave_all_when_deactivated&#x60; is true (which it is by default), a user leaves all joined group channels when deactivated.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param updateUserByIdData  (optional)
   * @return ApiResponse&lt;SendBirdUser&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdUser> updateUserByIdWithHttpInfo(String apiToken, String userId, UpdateUserByIdData updateUserByIdData) throws ApiException {
    Object localVarPostBody = updateUserByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateUserById");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<SendBirdUser> localVarReturnType = new GenericType<SendBirdUser>() {};

    return apiClient.invokeAPI("UserApi.updateUserById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View channel invitation preference
   * ## View channel invitation preference  Retrieves channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [view default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference) action, you can retrieve the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ViewChannelInvitationPreferenceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewChannelInvitationPreferenceResponse viewChannelInvitationPreference(String apiToken, String userId) throws ApiException {
    return viewChannelInvitationPreferenceWithHttpInfo(apiToken, userId).getData();
  }

  /**
   * View channel invitation preference
   * ## View channel invitation preference  Retrieves channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [view default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference) action, you can retrieve the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ApiResponse&lt;ViewChannelInvitationPreferenceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewChannelInvitationPreferenceResponse> viewChannelInvitationPreferenceWithHttpInfo(String apiToken, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewChannelInvitationPreference");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewChannelInvitationPreference");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/channel_invitation_preference"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<ViewChannelInvitationPreferenceResponse> localVarReturnType = new GenericType<ViewChannelInvitationPreferenceResponse>() {};

    return apiClient.invokeAPI("UserApi.viewChannelInvitationPreference", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View count preference of a channel
   * ## View count preference of a channel  Retrieves count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-count-preference-of-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return ViewCountPreferenceOfChannelByUrlResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewCountPreferenceOfChannelByUrlResponse viewCountPreferenceOfChannelByUrl(String apiToken, String userId, String channelUrl) throws ApiException {
    return viewCountPreferenceOfChannelByUrlWithHttpInfo(apiToken, userId, channelUrl).getData();
  }

  /**
   * View count preference of a channel
   * ## View count preference of a channel  Retrieves count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-count-preference-of-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return ApiResponse&lt;ViewCountPreferenceOfChannelByUrlResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewCountPreferenceOfChannelByUrlResponse> viewCountPreferenceOfChannelByUrlWithHttpInfo(String apiToken, String userId, String channelUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewCountPreferenceOfChannelByUrl");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewCountPreferenceOfChannelByUrl");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewCountPreferenceOfChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/count_preference/{channel_url}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<ViewCountPreferenceOfChannelByUrlResponse> localVarReturnType = new GenericType<ViewCountPreferenceOfChannelByUrlResponse>() {};

    return apiClient.invokeAPI("UserApi.viewCountPreferenceOfChannelByUrl", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View number of channels by join status
   * ## View number of channels by join status  Retrieves the number of a user&#39;s group channels by their join status.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-by-join-status ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param state  (optional)
   * @return ViewNumberOfChannelsByJoinStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfChannelsByJoinStatusResponse viewNumberOfChannelsByJoinStatus(String apiToken, String userId, String state) throws ApiException {
    return viewNumberOfChannelsByJoinStatusWithHttpInfo(apiToken, userId, state).getData();
  }

  /**
   * View number of channels by join status
   * ## View number of channels by join status  Retrieves the number of a user&#39;s group channels by their join status.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-by-join-status ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param state  (optional)
   * @return ApiResponse&lt;ViewNumberOfChannelsByJoinStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfChannelsByJoinStatusResponse> viewNumberOfChannelsByJoinStatusWithHttpInfo(String apiToken, String userId, String state) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfChannelsByJoinStatus");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewNumberOfChannelsByJoinStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/group_channel_count"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));

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

    GenericType<ViewNumberOfChannelsByJoinStatusResponse> localVarReturnType = new GenericType<ViewNumberOfChannelsByJoinStatusResponse>() {};

    return apiClient.invokeAPI("UserApi.viewNumberOfChannelsByJoinStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View number of channels with unread messages
   * ## View number of channels with unread messages  Retrieves the total number of a user&#39;s group channels with unread messages.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-with-unread-messages ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param customTypes  (optional)
   * @param superMode  (optional)
   * @return ViewNumberOfChannelsWithUnreadMessagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfChannelsWithUnreadMessagesResponse viewNumberOfChannelsWithUnreadMessages(String apiToken, String userId, List<String> customTypes, String superMode) throws ApiException {
    return viewNumberOfChannelsWithUnreadMessagesWithHttpInfo(apiToken, userId, customTypes, superMode).getData();
  }

  /**
   * View number of channels with unread messages
   * ## View number of channels with unread messages  Retrieves the total number of a user&#39;s group channels with unread messages.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-with-unread-messages ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param customTypes  (optional)
   * @param superMode  (optional)
   * @return ApiResponse&lt;ViewNumberOfChannelsWithUnreadMessagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfChannelsWithUnreadMessagesResponse> viewNumberOfChannelsWithUnreadMessagesWithHttpInfo(String apiToken, String userId, List<String> customTypes, String superMode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfChannelsWithUnreadMessages");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewNumberOfChannelsWithUnreadMessages");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/unread_channel_count"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "super_mode", superMode));

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

    GenericType<ViewNumberOfChannelsWithUnreadMessagesResponse> localVarReturnType = new GenericType<ViewNumberOfChannelsWithUnreadMessagesResponse>() {};

    return apiClient.invokeAPI("UserApi.viewNumberOfChannelsWithUnreadMessages", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View number of unread items
   * ## View number of unread items  Retrieves a set of total numbers of a user&#39;s unread messages, unread mentioned messages, or received invitations in either super or non-super group channels. This action is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-items ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param customType  (optional)
   * @param itemKeys  (optional)
   * @return ViewNumberOfUnreadItemsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfUnreadItemsResponse viewNumberOfUnreadItems(String apiToken, String userId, String customType, String itemKeys) throws ApiException {
    return viewNumberOfUnreadItemsWithHttpInfo(apiToken, userId, customType, itemKeys).getData();
  }

  /**
   * View number of unread items
   * ## View number of unread items  Retrieves a set of total numbers of a user&#39;s unread messages, unread mentioned messages, or received invitations in either super or non-super group channels. This action is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-items ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param customType  (optional)
   * @param itemKeys  (optional)
   * @return ApiResponse&lt;ViewNumberOfUnreadItemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfUnreadItemsResponse> viewNumberOfUnreadItemsWithHttpInfo(String apiToken, String userId, String customType, String itemKeys) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfUnreadItems");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewNumberOfUnreadItems");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/unread_item_count"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_type", customType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "item_keys", itemKeys));

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

    GenericType<ViewNumberOfUnreadItemsResponse> localVarReturnType = new GenericType<ViewNumberOfUnreadItemsResponse>() {};

    return apiClient.invokeAPI("UserApi.viewNumberOfUnreadItems", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View number of unread messages
   * ## View number of unread messages  Retrieves the total number of a user&#39;s currently unread messages in the group channels. The unread counts feature is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-messages ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param customTypes  (optional)
   * @param superMode  (optional)
   * @return ViewNumberOfUnreadMessagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfUnreadMessagesResponse viewNumberOfUnreadMessages(String apiToken, String userId, String customTypes, String superMode) throws ApiException {
    return viewNumberOfUnreadMessagesWithHttpInfo(apiToken, userId, customTypes, superMode).getData();
  }

  /**
   * View number of unread messages
   * ## View number of unread messages  Retrieves the total number of a user&#39;s currently unread messages in the group channels. The unread counts feature is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-messages ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param customTypes  (optional)
   * @param superMode  (optional)
   * @return ApiResponse&lt;ViewNumberOfUnreadMessagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfUnreadMessagesResponse> viewNumberOfUnreadMessagesWithHttpInfo(String apiToken, String userId, String customTypes, String superMode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfUnreadMessages");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewNumberOfUnreadMessages");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/unread_message_count"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "super_mode", superMode));

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

    GenericType<ViewNumberOfUnreadMessagesResponse> localVarReturnType = new GenericType<ViewNumberOfUnreadMessagesResponse>() {};

    return apiClient.invokeAPI("UserApi.viewNumberOfUnreadMessages", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View push preferences
   * ## View push preferences  Retrieves a user&#39;s push preferences about whether the user has set &#x60;do_not_disturb&#x60; to pause notifications for a certain period of time, and the time frame in which the user has applied the setting.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ViewPushPreferencesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewPushPreferencesResponse viewPushPreferences(String apiToken, String userId) throws ApiException {
    return viewPushPreferencesWithHttpInfo(apiToken, userId).getData();
  }

  /**
   * View push preferences
   * ## View push preferences  Retrieves a user&#39;s push preferences about whether the user has set &#x60;do_not_disturb&#x60; to pause notifications for a certain period of time, and the time frame in which the user has applied the setting.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @return ApiResponse&lt;ViewPushPreferencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewPushPreferencesResponse> viewPushPreferencesWithHttpInfo(String apiToken, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewPushPreferences");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewPushPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push_preference"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<ViewPushPreferencesResponse> localVarReturnType = new GenericType<ViewPushPreferencesResponse>() {};

    return apiClient.invokeAPI("UserApi.viewPushPreferences", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View push preferences for a channel
   * ## View push preferences for a channel  Retrieves whether a user has turned on notification messages for a specific channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences-for-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return ViewPushPreferencesForChannelByUrlResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewPushPreferencesForChannelByUrlResponse viewPushPreferencesForChannelByUrl(String apiToken, String userId, String channelUrl) throws ApiException {
    return viewPushPreferencesForChannelByUrlWithHttpInfo(apiToken, userId, channelUrl).getData();
  }

  /**
   * View push preferences for a channel
   * ## View push preferences for a channel  Retrieves whether a user has turned on notification messages for a specific channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences-for-a-channel ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return ApiResponse&lt;ViewPushPreferencesForChannelByUrlResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewPushPreferencesForChannelByUrlResponse> viewPushPreferencesForChannelByUrlWithHttpInfo(String apiToken, String userId, String channelUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewPushPreferencesForChannelByUrl");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewPushPreferencesForChannelByUrl");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewPushPreferencesForChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/push_preference/{channel_url}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<ViewPushPreferencesForChannelByUrlResponse> localVarReturnType = new GenericType<ViewPushPreferencesForChannelByUrlResponse>() {};

    return apiClient.invokeAPI("UserApi.viewPushPreferencesForChannelByUrl", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a user
   * ## View a user  Retrieves information on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-a-user ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param includeUnreadCount  (optional)
   * @param customTypes  (optional)
   * @param superMode  (optional)
   * @return SendBirdUser
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdUser viewUserById(String apiToken, String userId, Boolean includeUnreadCount, String customTypes, String superMode) throws ApiException {
    return viewUserByIdWithHttpInfo(apiToken, userId, includeUnreadCount, customTypes, superMode).getData();
  }

  /**
   * View a user
   * ## View a user  Retrieves information on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-a-user ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param includeUnreadCount  (optional)
   * @param customTypes  (optional)
   * @param superMode  (optional)
   * @return ApiResponse&lt;SendBirdUser&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdUser> viewUserByIdWithHttpInfo(String apiToken, String userId, Boolean includeUnreadCount, String customTypes, String superMode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewUserById");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_unread_count", includeUnreadCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "super_mode", superMode));

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

    GenericType<SendBirdUser> localVarReturnType = new GenericType<SendBirdUser>() {};

    return apiClient.invokeAPI("UserApi.viewUserById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View who owns a registration or device token
   * ## View who owns a registration or device token  Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param tokenType  (required)
   * @param token  (required)
   * @return List&lt;ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner> viewWhoOwnsRegistrationOrDeviceTokenByToken(String apiToken, String tokenType, String token) throws ApiException {
    return viewWhoOwnsRegistrationOrDeviceTokenByTokenWithHttpInfo(apiToken, tokenType, token).getData();
  }

  /**
   * View who owns a registration or device token
   * ## View who owns a registration or device token  Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token ----------------------------
   * @param apiToken  (required)
   * @param tokenType  (required)
   * @param token  (required)
   * @return ApiResponse&lt;List&lt;ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner>> viewWhoOwnsRegistrationOrDeviceTokenByTokenWithHttpInfo(String apiToken, String tokenType, String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewWhoOwnsRegistrationOrDeviceTokenByToken");
    }
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling viewWhoOwnsRegistrationOrDeviceTokenByToken");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling viewWhoOwnsRegistrationOrDeviceTokenByToken");
    }
    
    // create path and map variables
    String localVarPath = "/v3/push/device_tokens/{token_type}/{token}"
      .replaceAll("\\{" + "token_type" + "\\}", apiClient.escapeString(tokenType.toString()))
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

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

    GenericType<List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner>> localVarReturnType = new GenericType<List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner>>() {};

    return apiClient.invokeAPI("UserApi.viewWhoOwnsRegistrationOrDeviceTokenByToken", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
