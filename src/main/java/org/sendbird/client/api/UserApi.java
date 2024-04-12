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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
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


private ApiResponse<AddRegistrationOrDeviceTokenResponse> addRegistrationOrDeviceTokenWithHttpInfo(String userId, String tokenType, String apiToken, AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData) throws ApiException {
    Object localVarPostBody = addRegistrationOrDeviceTokenData;
    
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

  public class APIaddRegistrationOrDeviceTokenRequest {
    private String userId;
    private String tokenType;
    private String apiToken;
    private AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData;

    private APIaddRegistrationOrDeviceTokenRequest(String userId, String tokenType) {
      this.userId = userId;
      this.tokenType = tokenType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddRegistrationOrDeviceTokenRequest
     */
    public APIaddRegistrationOrDeviceTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addRegistrationOrDeviceTokenData
     * @param addRegistrationOrDeviceTokenData  (optional)
     * @return APIaddRegistrationOrDeviceTokenRequest
     */
    public APIaddRegistrationOrDeviceTokenRequest addRegistrationOrDeviceTokenData(AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData) {
      this.addRegistrationOrDeviceTokenData = addRegistrationOrDeviceTokenData;
      return this;
    }

    /**
     * Execute addRegistrationOrDeviceToken request
     * @return AddRegistrationOrDeviceTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddRegistrationOrDeviceTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addRegistrationOrDeviceToken request with HTTP info returned
     * @return ApiResponse&lt;AddRegistrationOrDeviceTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddRegistrationOrDeviceTokenResponse> executeWithHttpInfo() throws ApiException {
      return addRegistrationOrDeviceTokenWithHttpInfo(userId, tokenType, apiToken, addRegistrationOrDeviceTokenData);
    }
  }

  /**
   * Add a registration or device token
   * ## Add a registration or device token  &gt; __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.  To send notification requests to push notification services on behalf of your server, adds a specific user&#39;s FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.  &gt; __Note__: For more information on the registration token and device token, visit the Google&#39;s [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei&#39;s [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple&#39;s [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token ----------------------------
   * @param userId  (required)
   * @param tokenType  (required)
   * @return addRegistrationOrDeviceTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddRegistrationOrDeviceTokenRequest addRegistrationOrDeviceToken(String userId, String tokenType) throws ApiException {
    return new APIaddRegistrationOrDeviceTokenRequest(userId, tokenType);
  }

private ApiResponse<ChoosePushNotificationContentTemplateResponse> choosePushNotificationContentTemplateWithHttpInfo(String userId, String apiToken, Object body) throws ApiException {
    Object localVarPostBody = body;
    
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

  public class APIchoosePushNotificationContentTemplateRequest {
    private String userId;
    private String apiToken;
    private Object body;

    private APIchoosePushNotificationContentTemplateRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIchoosePushNotificationContentTemplateRequest
     */
    public APIchoosePushNotificationContentTemplateRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIchoosePushNotificationContentTemplateRequest
     */
    public APIchoosePushNotificationContentTemplateRequest body(Object body) {
      this.body = body;
      return this;
    }

    /**
     * Execute choosePushNotificationContentTemplate request
     * @return ChoosePushNotificationContentTemplateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ChoosePushNotificationContentTemplateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute choosePushNotificationContentTemplate request with HTTP info returned
     * @return ApiResponse&lt;ChoosePushNotificationContentTemplateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ChoosePushNotificationContentTemplateResponse> executeWithHttpInfo() throws ApiException {
      return choosePushNotificationContentTemplateWithHttpInfo(userId, apiToken, body);
    }
  }

  /**
   * Choose a push notification content template
   * ## Choose a push notification content template  Chooses a push notification content template of a user&#39;s own. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-choose-a-push-notification-content-template ----------------------------
   * @param userId  (required)
   * @return choosePushNotificationContentTemplateRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIchoosePushNotificationContentTemplateRequest choosePushNotificationContentTemplate(String userId) throws ApiException {
    return new APIchoosePushNotificationContentTemplateRequest(userId);
  }

private ApiResponse<SendBirdUser> createUserWithHttpInfo(String apiToken, CreateUserData createUserData) throws ApiException {
    Object localVarPostBody = createUserData;
    
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

  public class APIcreateUserRequest {
    private String apiToken;
    private CreateUserData createUserData;

    private APIcreateUserRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateUserRequest
     */
    public APIcreateUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createUserData
     * @param createUserData  (optional)
     * @return APIcreateUserRequest
     */
    public APIcreateUserRequest createUserData(CreateUserData createUserData) {
      this.createUserData = createUserData;
      return this;
    }

    /**
     * Execute createUser request
     * @return SendBirdUser
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdUser execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createUser request with HTTP info returned
     * @return ApiResponse&lt;SendBirdUser&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdUser> executeWithHttpInfo() throws ApiException {
      return createUserWithHttpInfo(apiToken, createUserData);
    }
  }

  /**
   * Create a user
   * ## Create a user  Creates a new user in the application. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user
   * @return createUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateUserRequest createUser() throws ApiException {
    return new APIcreateUserRequest();
  }

private ApiResponse<CreateUserTokenResponse> createUserTokenWithHttpInfo(String userId, String apiToken, CreateUserTokenData createUserTokenData) throws ApiException {
    Object localVarPostBody = createUserTokenData;
    
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

  public class APIcreateUserTokenRequest {
    private String userId;
    private String apiToken;
    private CreateUserTokenData createUserTokenData;

    private APIcreateUserTokenRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateUserTokenRequest
     */
    public APIcreateUserTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createUserTokenData
     * @param createUserTokenData  (optional)
     * @return APIcreateUserTokenRequest
     */
    public APIcreateUserTokenRequest createUserTokenData(CreateUserTokenData createUserTokenData) {
      this.createUserTokenData = createUserTokenData;
      return this;
    }

    /**
     * Execute createUserToken request
     * @return CreateUserTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CreateUserTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createUserToken request with HTTP info returned
     * @return ApiResponse&lt;CreateUserTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CreateUserTokenResponse> executeWithHttpInfo() throws ApiException {
      return createUserTokenWithHttpInfo(userId, apiToken, createUserTokenData);
    }
  }

  /**
   * Create user token
   * ## Create user token
   * @param userId  (required)
   * @return createUserTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateUserTokenRequest createUserToken(String userId) throws ApiException {
    return new APIcreateUserTokenRequest(userId);
  }

private ApiResponse<Object> deleteUserByIdWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIdeleteUserByIdRequest {
    private String userId;
    private String apiToken;

    private APIdeleteUserByIdRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteUserByIdRequest
     */
    public APIdeleteUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteUserById request
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
     * Execute deleteUserById request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteUserByIdWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * Delete a user
   * ## Delete a user  Deletes a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-delete-a-user ----------------------------
   * @param userId  (required)
   * @return deleteUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteUserByIdRequest deleteUserById(String userId) throws ApiException {
    return new APIdeleteUserByIdRequest(userId);
  }

private ApiResponse<Object> leaveMyGroupChannelsWithHttpInfo(String userId, String apiToken, LeaveMyGroupChannelsData leaveMyGroupChannelsData) throws ApiException {
    Object localVarPostBody = leaveMyGroupChannelsData;
    
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

  public class APIleaveMyGroupChannelsRequest {
    private String userId;
    private String apiToken;
    private LeaveMyGroupChannelsData leaveMyGroupChannelsData;

    private APIleaveMyGroupChannelsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIleaveMyGroupChannelsRequest
     */
    public APIleaveMyGroupChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set leaveMyGroupChannelsData
     * @param leaveMyGroupChannelsData  (optional)
     * @return APIleaveMyGroupChannelsRequest
     */
    public APIleaveMyGroupChannelsRequest leaveMyGroupChannelsData(LeaveMyGroupChannelsData leaveMyGroupChannelsData) {
      this.leaveMyGroupChannelsData = leaveMyGroupChannelsData;
      return this;
    }

    /**
     * Execute leaveMyGroupChannels request
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
     * Execute leaveMyGroupChannels request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return leaveMyGroupChannelsWithHttpInfo(userId, apiToken, leaveMyGroupChannelsData);
    }
  }

  /**
   * Leave my group channels
   * ## Leave my group channels  Makes a user leave all joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-leave-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to leave all joined group channels.
   * @param userId  (required)
   * @return leaveMyGroupChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIleaveMyGroupChannelsRequest leaveMyGroupChannels(String userId) throws ApiException {
    return new APIleaveMyGroupChannelsRequest(userId);
  }

private ApiResponse<ListMyGroupChannelsResponse> listMyGroupChannelsWithHttpInfo(String userId, String apiToken, String token, Integer limit, String distinctMode, String publicMode, String superMode, String hiddenMode, String memberStateFilter, String unreadFilter, Integer createdAfter, Integer createdBefore, Boolean showEmpty, Boolean showFrozen, Boolean showMember, Boolean showDeliveryReceipt, Boolean showReadReceipt, String order, String metadataOrderKey, String customTypes, String customTypeStartswith, String channelUrls, String name, String nameContains, String nameStartswith, String membersExactlyIn, String membersIncludeIn, String queryType, String membersNickname, String membersNicknameContains, String searchQuery, String searchFields, String metadataKey, String metadataValues, String metadataValueStartswith, String metacounterKey, String metacounterValues, String metacounterValueGt, String metacounterValueGte, String metacounterValueLt, String metacounterValueLte, String customType) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistMyGroupChannelsRequest {
    private String userId;
    private String apiToken;
    private String token;
    private Integer limit;
    private String distinctMode;
    private String publicMode;
    private String superMode;
    private String hiddenMode;
    private String memberStateFilter;
    private String unreadFilter;
    private Integer createdAfter;
    private Integer createdBefore;
    private Boolean showEmpty;
    private Boolean showFrozen;
    private Boolean showMember;
    private Boolean showDeliveryReceipt;
    private Boolean showReadReceipt;
    private String order;
    private String metadataOrderKey;
    private String customTypes;
    private String customTypeStartswith;
    private String channelUrls;
    private String name;
    private String nameContains;
    private String nameStartswith;
    private String membersExactlyIn;
    private String membersIncludeIn;
    private String queryType;
    private String membersNickname;
    private String membersNicknameContains;
    private String searchQuery;
    private String searchFields;
    private String metadataKey;
    private String metadataValues;
    private String metadataValueStartswith;
    private String metacounterKey;
    private String metacounterValues;
    private String metacounterValueGt;
    private String metacounterValueGte;
    private String metacounterValueLt;
    private String metacounterValueLte;
    private String customType;

    private APIlistMyGroupChannelsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set distinctMode
     * @param distinctMode  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest distinctMode(String distinctMode) {
      this.distinctMode = distinctMode;
      return this;
    }

    /**
     * Set publicMode
     * @param publicMode  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest publicMode(String publicMode) {
      this.publicMode = publicMode;
      return this;
    }

    /**
     * Set superMode
     * @param superMode  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
    }

    /**
     * Set hiddenMode
     * @param hiddenMode  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest hiddenMode(String hiddenMode) {
      this.hiddenMode = hiddenMode;
      return this;
    }

    /**
     * Set memberStateFilter
     * @param memberStateFilter  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest memberStateFilter(String memberStateFilter) {
      this.memberStateFilter = memberStateFilter;
      return this;
    }

    /**
     * Set unreadFilter
     * @param unreadFilter  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest unreadFilter(String unreadFilter) {
      this.unreadFilter = unreadFilter;
      return this;
    }

    /**
     * Set createdAfter
     * @param createdAfter  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest createdAfter(Integer createdAfter) {
      this.createdAfter = createdAfter;
      return this;
    }

    /**
     * Set createdBefore
     * @param createdBefore  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest createdBefore(Integer createdBefore) {
      this.createdBefore = createdBefore;
      return this;
    }

    /**
     * Set showEmpty
     * @param showEmpty  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest showEmpty(Boolean showEmpty) {
      this.showEmpty = showEmpty;
      return this;
    }

    /**
     * Set showFrozen
     * @param showFrozen  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest showFrozen(Boolean showFrozen) {
      this.showFrozen = showFrozen;
      return this;
    }

    /**
     * Set showMember
     * @param showMember  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest showMember(Boolean showMember) {
      this.showMember = showMember;
      return this;
    }

    /**
     * Set showDeliveryReceipt
     * @param showDeliveryReceipt  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest showDeliveryReceipt(Boolean showDeliveryReceipt) {
      this.showDeliveryReceipt = showDeliveryReceipt;
      return this;
    }

    /**
     * Set showReadReceipt
     * @param showReadReceipt  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest showReadReceipt(Boolean showReadReceipt) {
      this.showReadReceipt = showReadReceipt;
      return this;
    }

    /**
     * Set order
     * @param order  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set metadataOrderKey
     * @param metadataOrderKey  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataOrderKey(String metadataOrderKey) {
      this.metadataOrderKey = metadataOrderKey;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set customTypeStartswith
     * @param customTypeStartswith  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest customTypeStartswith(String customTypeStartswith) {
      this.customTypeStartswith = customTypeStartswith;
      return this;
    }

    /**
     * Set channelUrls
     * @param channelUrls  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest channelUrls(String channelUrls) {
      this.channelUrls = channelUrls;
      return this;
    }

    /**
     * Set name
     * @param name  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set nameContains
     * @param nameContains  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest nameContains(String nameContains) {
      this.nameContains = nameContains;
      return this;
    }

    /**
     * Set nameStartswith
     * @param nameStartswith  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest nameStartswith(String nameStartswith) {
      this.nameStartswith = nameStartswith;
      return this;
    }

    /**
     * Set membersExactlyIn
     * @param membersExactlyIn  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersExactlyIn(String membersExactlyIn) {
      this.membersExactlyIn = membersExactlyIn;
      return this;
    }

    /**
     * Set membersIncludeIn
     * @param membersIncludeIn  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersIncludeIn(String membersIncludeIn) {
      this.membersIncludeIn = membersIncludeIn;
      return this;
    }

    /**
     * Set queryType
     * @param queryType  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest queryType(String queryType) {
      this.queryType = queryType;
      return this;
    }

    /**
     * Set membersNickname
     * @param membersNickname  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersNickname(String membersNickname) {
      this.membersNickname = membersNickname;
      return this;
    }

    /**
     * Set membersNicknameContains
     * @param membersNicknameContains  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersNicknameContains(String membersNicknameContains) {
      this.membersNicknameContains = membersNicknameContains;
      return this;
    }

    /**
     * Set searchQuery
     * @param searchQuery  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest searchQuery(String searchQuery) {
      this.searchQuery = searchQuery;
      return this;
    }

    /**
     * Set searchFields
     * @param searchFields  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest searchFields(String searchFields) {
      this.searchFields = searchFields;
      return this;
    }

    /**
     * Set metadataKey
     * @param metadataKey  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataKey(String metadataKey) {
      this.metadataKey = metadataKey;
      return this;
    }

    /**
     * Set metadataValues
     * @param metadataValues  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataValues(String metadataValues) {
      this.metadataValues = metadataValues;
      return this;
    }

    /**
     * Set metadataValueStartswith
     * @param metadataValueStartswith  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataValueStartswith(String metadataValueStartswith) {
      this.metadataValueStartswith = metadataValueStartswith;
      return this;
    }

    /**
     * Set metacounterKey
     * @param metacounterKey  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterKey(String metacounterKey) {
      this.metacounterKey = metacounterKey;
      return this;
    }

    /**
     * Set metacounterValues
     * @param metacounterValues  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValues(String metacounterValues) {
      this.metacounterValues = metacounterValues;
      return this;
    }

    /**
     * Set metacounterValueGt
     * @param metacounterValueGt  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueGt(String metacounterValueGt) {
      this.metacounterValueGt = metacounterValueGt;
      return this;
    }

    /**
     * Set metacounterValueGte
     * @param metacounterValueGte  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueGte(String metacounterValueGte) {
      this.metacounterValueGte = metacounterValueGte;
      return this;
    }

    /**
     * Set metacounterValueLt
     * @param metacounterValueLt  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueLt(String metacounterValueLt) {
      this.metacounterValueLt = metacounterValueLt;
      return this;
    }

    /**
     * Set metacounterValueLte
     * @param metacounterValueLte  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueLte(String metacounterValueLte) {
      this.metacounterValueLte = metacounterValueLte;
      return this;
    }

    /**
     * Set customType
     * @param customType  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest customType(String customType) {
      this.customType = customType;
      return this;
    }

    /**
     * Execute listMyGroupChannels request
     * @return ListMyGroupChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMyGroupChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMyGroupChannels request with HTTP info returned
     * @return ApiResponse&lt;ListMyGroupChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMyGroupChannelsResponse> executeWithHttpInfo() throws ApiException {
      return listMyGroupChannelsWithHttpInfo(userId, apiToken, token, limit, distinctMode, publicMode, superMode, hiddenMode, memberStateFilter, unreadFilter, createdAfter, createdBefore, showEmpty, showFrozen, showMember, showDeliveryReceipt, showReadReceipt, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, searchQuery, searchFields, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, customType);
    }
  }

  /**
   * List my group channels
   * ## List my group channels  Retrieves all group channels that the user has joined. You can create a request based on various query parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param userId  (required)
   * @return listMyGroupChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMyGroupChannelsRequest listMyGroupChannels(String userId) throws ApiException {
    return new APIlistMyGroupChannelsRequest(userId);
  }

private ApiResponse<ListRegistrationOrDeviceTokensResponse> listRegistrationOrDeviceTokensWithHttpInfo(String userId, String tokenType, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistRegistrationOrDeviceTokensRequest {
    private String userId;
    private String tokenType;
    private String apiToken;

    private APIlistRegistrationOrDeviceTokensRequest(String userId, String tokenType) {
      this.userId = userId;
      this.tokenType = tokenType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistRegistrationOrDeviceTokensRequest
     */
    public APIlistRegistrationOrDeviceTokensRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listRegistrationOrDeviceTokens request
     * @return ListRegistrationOrDeviceTokensResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListRegistrationOrDeviceTokensResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listRegistrationOrDeviceTokens request with HTTP info returned
     * @return ApiResponse&lt;ListRegistrationOrDeviceTokensResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListRegistrationOrDeviceTokensResponse> executeWithHttpInfo() throws ApiException {
      return listRegistrationOrDeviceTokensWithHttpInfo(userId, tokenType, apiToken);
    }
  }

  /**
   * List registration or device tokens
   * ## List registration or device tokens  Retrieves a list of a specific user&#39;s FCM registration tokens, HMS device tokens, or APNs device tokens. You can specify either &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; in the &#x60;token_type&#x60; parameter, depending on which push notification service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-registration-or-device-tokens ----------------------------
   * @param userId  (required)
   * @param tokenType  (required)
   * @return listRegistrationOrDeviceTokensRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistRegistrationOrDeviceTokensRequest listRegistrationOrDeviceTokens(String userId, String tokenType) throws ApiException {
    return new APIlistRegistrationOrDeviceTokensRequest(userId, tokenType);
  }

private ApiResponse<ListUsersResponse> listUsersWithHttpInfo(String apiToken, String token, Integer limit, String activeMode, Boolean showBot, String userIds, String nickname, String nicknameStartswith, String metadatakey, String metadatavaluesIn) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIlistUsersRequest {
    private String apiToken;
    private String token;
    private Integer limit;
    private String activeMode;
    private Boolean showBot;
    private String userIds;
    private String nickname;
    private String nicknameStartswith;
    private String metadatakey;
    private String metadatavaluesIn;

    private APIlistUsersRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set activeMode
     * @param activeMode  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest activeMode(String activeMode) {
      this.activeMode = activeMode;
      return this;
    }

    /**
     * Set showBot
     * @param showBot  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest showBot(Boolean showBot) {
      this.showBot = showBot;
      return this;
    }

    /**
     * Set userIds
     * @param userIds  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest userIds(String userIds) {
      this.userIds = userIds;
      return this;
    }

    /**
     * Set nickname
     * @param nickname  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest nickname(String nickname) {
      this.nickname = nickname;
      return this;
    }

    /**
     * Set nicknameStartswith
     * @param nicknameStartswith  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest nicknameStartswith(String nicknameStartswith) {
      this.nicknameStartswith = nicknameStartswith;
      return this;
    }

    /**
     * Set metadatakey
     * @param metadatakey  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest metadatakey(String metadatakey) {
      this.metadatakey = metadatakey;
      return this;
    }

    /**
     * Set metadatavaluesIn
     * @param metadatavaluesIn  (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest metadatavaluesIn(String metadatavaluesIn) {
      this.metadatavaluesIn = metadatavaluesIn;
      return this;
    }

    /**
     * Execute listUsers request
     * @return ListUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listUsers request with HTTP info returned
     * @return ApiResponse&lt;ListUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListUsersResponse> executeWithHttpInfo() throws ApiException {
      return listUsersWithHttpInfo(apiToken, token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn);
    }
  }

  /**
   * List users
   * ## List users  Retrieves a list of users in your application. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-users ----------------------------
   * @return listUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistUsersRequest listUsers() throws ApiException {
    return new APIlistUsersRequest();
  }

private ApiResponse<Object> markAllMessagesAsReadWithHttpInfo(String userId, String apiToken, MarkAllMessagesAsReadData markAllMessagesAsReadData) throws ApiException {
    Object localVarPostBody = markAllMessagesAsReadData;
    
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

  public class APImarkAllMessagesAsReadRequest {
    private String userId;
    private String apiToken;
    private MarkAllMessagesAsReadData markAllMessagesAsReadData;

    private APImarkAllMessagesAsReadRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APImarkAllMessagesAsReadRequest
     */
    public APImarkAllMessagesAsReadRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set markAllMessagesAsReadData
     * @param markAllMessagesAsReadData  (optional)
     * @return APImarkAllMessagesAsReadRequest
     */
    public APImarkAllMessagesAsReadRequest markAllMessagesAsReadData(MarkAllMessagesAsReadData markAllMessagesAsReadData) {
      this.markAllMessagesAsReadData = markAllMessagesAsReadData;
      return this;
    }

    /**
     * Execute markAllMessagesAsRead request
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
     * Execute markAllMessagesAsRead request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return markAllMessagesAsReadWithHttpInfo(userId, apiToken, markAllMessagesAsReadData);
    }
  }

  /**
   * Mark all messages as read
   * ## Mark all messages as read  Marks all of a user&#39;s unread messages as read in the joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mark-all-messages-as-read ----------------------------
   * @param userId  (required)
   * @return markAllMessagesAsReadRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APImarkAllMessagesAsReadRequest markAllMessagesAsRead(String userId) throws ApiException {
    return new APImarkAllMessagesAsReadRequest(userId);
  }

private ApiResponse<Object> registerAsOperatorToChannelsWithCustomChannelTypesWithHttpInfo(String userId, String apiToken, RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData) throws ApiException {
    Object localVarPostBody = registerAsOperatorToChannelsWithCustomChannelTypesData;
    
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

  public class APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest {
    private String userId;
    private String apiToken;
    private RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData;

    private APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest
     */
    public APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set registerAsOperatorToChannelsWithCustomChannelTypesData
     * @param registerAsOperatorToChannelsWithCustomChannelTypesData  (optional)
     * @return APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest
     */
    public APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest registerAsOperatorToChannelsWithCustomChannelTypesData(RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData) {
      this.registerAsOperatorToChannelsWithCustomChannelTypesData = registerAsOperatorToChannelsWithCustomChannelTypesData;
      return this;
    }

    /**
     * Execute registerAsOperatorToChannelsWithCustomChannelTypes request
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
     * Execute registerAsOperatorToChannelsWithCustomChannelTypes request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return registerAsOperatorToChannelsWithCustomChannelTypesWithHttpInfo(userId, apiToken, registerAsOperatorToChannelsWithCustomChannelTypesData);
    }
  }

  /**
   * Register as an operator to channels with custom channel types
   * ## Register as an operator to channels with custom channel types  Registers a user as an operator to channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-register-as-an-operator-to-channels-with-custom-channel-types ----------------------------
   * @param userId  (required)
   * @return registerAsOperatorToChannelsWithCustomChannelTypesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest registerAsOperatorToChannelsWithCustomChannelTypes(String userId) throws ApiException {
    return new APIregisterAsOperatorToChannelsWithCustomChannelTypesRequest(userId);
  }

private ApiResponse<RemoveRegistrationOrDeviceTokenResponse> removeRegistrationOrDeviceTokenWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIremoveRegistrationOrDeviceTokenRequest {
    private String userId;
    private String apiToken;

    private APIremoveRegistrationOrDeviceTokenRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveRegistrationOrDeviceTokenRequest
     */
    public APIremoveRegistrationOrDeviceTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removeRegistrationOrDeviceToken request
     * @return RemoveRegistrationOrDeviceTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RemoveRegistrationOrDeviceTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeRegistrationOrDeviceToken request with HTTP info returned
     * @return ApiResponse&lt;RemoveRegistrationOrDeviceTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RemoveRegistrationOrDeviceTokenResponse> executeWithHttpInfo() throws ApiException {
      return removeRegistrationOrDeviceTokenWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * Remove a registration or device token - When unregistering all device tokens
   * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
   * @param userId  (required)
   * @return removeRegistrationOrDeviceTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveRegistrationOrDeviceTokenRequest removeRegistrationOrDeviceToken(String userId) throws ApiException {
    return new APIremoveRegistrationOrDeviceTokenRequest(userId);
  }

private ApiResponse<RemoveRegistrationOrDeviceTokenByTokenResponse> removeRegistrationOrDeviceTokenByTokenWithHttpInfo(String userId, String tokenType, String token, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIremoveRegistrationOrDeviceTokenByTokenRequest {
    private String userId;
    private String tokenType;
    private String token;
    private String apiToken;

    private APIremoveRegistrationOrDeviceTokenByTokenRequest(String userId, String tokenType, String token) {
      this.userId = userId;
      this.tokenType = tokenType;
      this.token = token;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveRegistrationOrDeviceTokenByTokenRequest
     */
    public APIremoveRegistrationOrDeviceTokenByTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removeRegistrationOrDeviceTokenByToken request
     * @return RemoveRegistrationOrDeviceTokenByTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RemoveRegistrationOrDeviceTokenByTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeRegistrationOrDeviceTokenByToken request with HTTP info returned
     * @return ApiResponse&lt;RemoveRegistrationOrDeviceTokenByTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RemoveRegistrationOrDeviceTokenByTokenResponse> executeWithHttpInfo() throws ApiException {
      return removeRegistrationOrDeviceTokenByTokenWithHttpInfo(userId, tokenType, token, apiToken);
    }
  }

  /**
   * Remove a registration or device token - When unregistering a specific token
   * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
   * @param userId  (required)
   * @param tokenType  (required)
   * @param token  (required)
   * @return removeRegistrationOrDeviceTokenByTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveRegistrationOrDeviceTokenByTokenRequest removeRegistrationOrDeviceTokenByToken(String userId, String tokenType, String token) throws ApiException {
    return new APIremoveRegistrationOrDeviceTokenByTokenRequest(userId, tokenType, token);
  }

private ApiResponse<RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse> removeRegistrationOrDeviceTokenFromOwnerByTokenWithHttpInfo(String tokenType, String token, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIremoveRegistrationOrDeviceTokenFromOwnerByTokenRequest {
    private String tokenType;
    private String token;
    private String apiToken;

    private APIremoveRegistrationOrDeviceTokenFromOwnerByTokenRequest(String tokenType, String token) {
      this.tokenType = tokenType;
      this.token = token;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveRegistrationOrDeviceTokenFromOwnerByTokenRequest
     */
    public APIremoveRegistrationOrDeviceTokenFromOwnerByTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removeRegistrationOrDeviceTokenFromOwnerByToken request
     * @return RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeRegistrationOrDeviceTokenFromOwnerByToken request with HTTP info returned
     * @return ApiResponse&lt;RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse> executeWithHttpInfo() throws ApiException {
      return removeRegistrationOrDeviceTokenFromOwnerByTokenWithHttpInfo(tokenType, token, apiToken);
    }
  }

  /**
   * Remove a registration or device token from an owner
   * ## Remove a registration or device token from an owner  Removes a registration or device token from a user who owns it. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token-from-an-owner ----------------------------
   * @param tokenType  (required)
   * @param token  (required)
   * @return removeRegistrationOrDeviceTokenFromOwnerByTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveRegistrationOrDeviceTokenFromOwnerByTokenRequest removeRegistrationOrDeviceTokenFromOwnerByToken(String tokenType, String token) throws ApiException {
    return new APIremoveRegistrationOrDeviceTokenFromOwnerByTokenRequest(tokenType, token);
  }

private ApiResponse<ResetPushPreferencesResponse> resetPushPreferencesWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIresetPushPreferencesRequest {
    private String userId;
    private String apiToken;

    private APIresetPushPreferencesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIresetPushPreferencesRequest
     */
    public APIresetPushPreferencesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute resetPushPreferences request
     * @return ResetPushPreferencesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ResetPushPreferencesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute resetPushPreferences request with HTTP info returned
     * @return ApiResponse&lt;ResetPushPreferencesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ResetPushPreferencesResponse> executeWithHttpInfo() throws ApiException {
      return resetPushPreferencesWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * Reset push preferences
   * ## Reset push preferences  Resets a user&#39;s push preferences. After performing this action,   &#x60;do_not_disturb&#x60; and &#x60;snooze_enabled&#x60; are set to false.  The values of the parameters associated with the time frame are all set to 0.  &#x60;timezone&#x60; is reset to &#x60;UTC&#x60;.  &#x60;push_sound&#x60; is reset to &#x60;default&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-reset-push-preferences ----------------------------
   * @param userId  (required)
   * @return resetPushPreferencesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIresetPushPreferencesRequest resetPushPreferences(String userId) throws ApiException {
    return new APIresetPushPreferencesRequest(userId);
  }

private ApiResponse<UpdateChannelInvitationPreferenceResponse> updateChannelInvitationPreferenceWithHttpInfo(String userId, String apiToken, UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData) throws ApiException {
    Object localVarPostBody = updateChannelInvitationPreferenceData;
    
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

  public class APIupdateChannelInvitationPreferenceRequest {
    private String userId;
    private String apiToken;
    private UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData;

    private APIupdateChannelInvitationPreferenceRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateChannelInvitationPreferenceRequest
     */
    public APIupdateChannelInvitationPreferenceRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateChannelInvitationPreferenceData
     * @param updateChannelInvitationPreferenceData  (optional)
     * @return APIupdateChannelInvitationPreferenceRequest
     */
    public APIupdateChannelInvitationPreferenceRequest updateChannelInvitationPreferenceData(UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData) {
      this.updateChannelInvitationPreferenceData = updateChannelInvitationPreferenceData;
      return this;
    }

    /**
     * Execute updateChannelInvitationPreference request
     * @return UpdateChannelInvitationPreferenceResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateChannelInvitationPreferenceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateChannelInvitationPreference request with HTTP info returned
     * @return ApiResponse&lt;UpdateChannelInvitationPreferenceResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateChannelInvitationPreferenceResponse> executeWithHttpInfo() throws ApiException {
      return updateChannelInvitationPreferenceWithHttpInfo(userId, apiToken, updateChannelInvitationPreferenceData);
    }
  }

  /**
   * Update channel invitation preference
   * ## Update channel invitation preference  Updates the channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, you can update the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference
   * @param userId  (required)
   * @return updateChannelInvitationPreferenceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateChannelInvitationPreferenceRequest updateChannelInvitationPreference(String userId) throws ApiException {
    return new APIupdateChannelInvitationPreferenceRequest(userId);
  }

private ApiResponse<UpdateCountPreferenceOfChannelByUrlResponse> updateCountPreferenceOfChannelByUrlWithHttpInfo(String userId, String channelUrl, String apiToken, UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData) throws ApiException {
    Object localVarPostBody = updateCountPreferenceOfChannelByUrlData;
    
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

  public class APIupdateCountPreferenceOfChannelByUrlRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;
    private UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData;

    private APIupdateCountPreferenceOfChannelByUrlRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateCountPreferenceOfChannelByUrlRequest
     */
    public APIupdateCountPreferenceOfChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateCountPreferenceOfChannelByUrlData
     * @param updateCountPreferenceOfChannelByUrlData  (optional)
     * @return APIupdateCountPreferenceOfChannelByUrlRequest
     */
    public APIupdateCountPreferenceOfChannelByUrlRequest updateCountPreferenceOfChannelByUrlData(UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData) {
      this.updateCountPreferenceOfChannelByUrlData = updateCountPreferenceOfChannelByUrlData;
      return this;
    }

    /**
     * Execute updateCountPreferenceOfChannelByUrl request
     * @return UpdateCountPreferenceOfChannelByUrlResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateCountPreferenceOfChannelByUrlResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateCountPreferenceOfChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;UpdateCountPreferenceOfChannelByUrlResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateCountPreferenceOfChannelByUrlResponse> executeWithHttpInfo() throws ApiException {
      return updateCountPreferenceOfChannelByUrlWithHttpInfo(userId, channelUrl, apiToken, updateCountPreferenceOfChannelByUrlData);
    }
  }

  /**
   * Update count preference of a channel
   * ## Update count preference of a channel  Updates count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-count-preference-of-a-channel ----------------------------
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return updateCountPreferenceOfChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateCountPreferenceOfChannelByUrlRequest updateCountPreferenceOfChannelByUrl(String userId, String channelUrl) throws ApiException {
    return new APIupdateCountPreferenceOfChannelByUrlRequest(userId, channelUrl);
  }

private ApiResponse<UpdatePushPreferencesResponse> updatePushPreferencesWithHttpInfo(String userId, String apiToken, UpdatePushPreferencesData updatePushPreferencesData) throws ApiException {
    Object localVarPostBody = updatePushPreferencesData;
    
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

  public class APIupdatePushPreferencesRequest {
    private String userId;
    private String apiToken;
    private UpdatePushPreferencesData updatePushPreferencesData;

    private APIupdatePushPreferencesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdatePushPreferencesRequest
     */
    public APIupdatePushPreferencesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updatePushPreferencesData
     * @param updatePushPreferencesData  (optional)
     * @return APIupdatePushPreferencesRequest
     */
    public APIupdatePushPreferencesRequest updatePushPreferencesData(UpdatePushPreferencesData updatePushPreferencesData) {
      this.updatePushPreferencesData = updatePushPreferencesData;
      return this;
    }

    /**
     * Execute updatePushPreferences request
     * @return UpdatePushPreferencesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdatePushPreferencesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updatePushPreferences request with HTTP info returned
     * @return ApiResponse&lt;UpdatePushPreferencesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdatePushPreferencesResponse> executeWithHttpInfo() throws ApiException {
      return updatePushPreferencesWithHttpInfo(userId, apiToken, updatePushPreferencesData);
    }
  }

  /**
   * Update push preferences
   * ## Update push preferences  Updates a user&#39;s push preferences. Through this action, you can set &#x60;do_not_disturb&#x60; for a user, and update the time frame in which the setting applies.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences ----------------------------
   * @param userId  (required)
   * @return updatePushPreferencesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdatePushPreferencesRequest updatePushPreferences(String userId) throws ApiException {
    return new APIupdatePushPreferencesRequest(userId);
  }

private ApiResponse<UpdatePushPreferencesForChannelByUrlResponse> updatePushPreferencesForChannelByUrlWithHttpInfo(String userId, String channelUrl, String apiToken, UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData) throws ApiException {
    Object localVarPostBody = updatePushPreferencesForChannelByUrlData;
    
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

  public class APIupdatePushPreferencesForChannelByUrlRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;
    private UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData;

    private APIupdatePushPreferencesForChannelByUrlRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdatePushPreferencesForChannelByUrlRequest
     */
    public APIupdatePushPreferencesForChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updatePushPreferencesForChannelByUrlData
     * @param updatePushPreferencesForChannelByUrlData  (optional)
     * @return APIupdatePushPreferencesForChannelByUrlRequest
     */
    public APIupdatePushPreferencesForChannelByUrlRequest updatePushPreferencesForChannelByUrlData(UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData) {
      this.updatePushPreferencesForChannelByUrlData = updatePushPreferencesForChannelByUrlData;
      return this;
    }

    /**
     * Execute updatePushPreferencesForChannelByUrl request
     * @return UpdatePushPreferencesForChannelByUrlResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdatePushPreferencesForChannelByUrlResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updatePushPreferencesForChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;UpdatePushPreferencesForChannelByUrlResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdatePushPreferencesForChannelByUrlResponse> executeWithHttpInfo() throws ApiException {
      return updatePushPreferencesForChannelByUrlWithHttpInfo(userId, channelUrl, apiToken, updatePushPreferencesForChannelByUrlData);
    }
  }

  /**
   * Update push preferences for a channel
   * ## Update push preferences for a channel  Updates push preferences for a user&#39;s specific group channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences-for-a-channel ----------------------------
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return updatePushPreferencesForChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdatePushPreferencesForChannelByUrlRequest updatePushPreferencesForChannelByUrl(String userId, String channelUrl) throws ApiException {
    return new APIupdatePushPreferencesForChannelByUrlRequest(userId, channelUrl);
  }

private ApiResponse<SendBirdUser> updateUserByIdWithHttpInfo(String userId, String apiToken, UpdateUserByIdData updateUserByIdData) throws ApiException {
    Object localVarPostBody = updateUserByIdData;
    
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

  public class APIupdateUserByIdRequest {
    private String userId;
    private String apiToken;
    private UpdateUserByIdData updateUserByIdData;

    private APIupdateUserByIdRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateUserByIdRequest
     */
    public APIupdateUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateUserByIdData
     * @param updateUserByIdData  (optional)
     * @return APIupdateUserByIdRequest
     */
    public APIupdateUserByIdRequest updateUserByIdData(UpdateUserByIdData updateUserByIdData) {
      this.updateUserByIdData = updateUserByIdData;
      return this;
    }

    /**
     * Execute updateUserById request
     * @return SendBirdUser
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdUser execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateUserById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdUser&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdUser> executeWithHttpInfo() throws ApiException {
      return updateUserByIdWithHttpInfo(userId, apiToken, updateUserByIdData);
    }
  }

  /**
   * Update a user
   * ## Update a user  Updates information on a user. In addition to changing a user&#39;s nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.  You can also deactivate or reactivate a user. If the &#x60;leave_all_when_deactivated&#x60; is true (which it is by default), a user leaves all joined group channels when deactivated.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-a-user ----------------------------
   * @param userId  (required)
   * @return updateUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateUserByIdRequest updateUserById(String userId) throws ApiException {
    return new APIupdateUserByIdRequest(userId);
  }

private ApiResponse<ViewChannelInvitationPreferenceResponse> viewChannelInvitationPreferenceWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewChannelInvitationPreferenceRequest {
    private String userId;
    private String apiToken;

    private APIviewChannelInvitationPreferenceRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewChannelInvitationPreferenceRequest
     */
    public APIviewChannelInvitationPreferenceRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewChannelInvitationPreference request
     * @return ViewChannelInvitationPreferenceResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewChannelInvitationPreferenceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewChannelInvitationPreference request with HTTP info returned
     * @return ApiResponse&lt;ViewChannelInvitationPreferenceResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewChannelInvitationPreferenceResponse> executeWithHttpInfo() throws ApiException {
      return viewChannelInvitationPreferenceWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * View channel invitation preference
   * ## View channel invitation preference  Retrieves channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [view default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference) action, you can retrieve the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference
   * @param userId  (required)
   * @return viewChannelInvitationPreferenceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewChannelInvitationPreferenceRequest viewChannelInvitationPreference(String userId) throws ApiException {
    return new APIviewChannelInvitationPreferenceRequest(userId);
  }

private ApiResponse<ViewCountPreferenceOfChannelByUrlResponse> viewCountPreferenceOfChannelByUrlWithHttpInfo(String userId, String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewCountPreferenceOfChannelByUrlRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;

    private APIviewCountPreferenceOfChannelByUrlRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewCountPreferenceOfChannelByUrlRequest
     */
    public APIviewCountPreferenceOfChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewCountPreferenceOfChannelByUrl request
     * @return ViewCountPreferenceOfChannelByUrlResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewCountPreferenceOfChannelByUrlResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewCountPreferenceOfChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;ViewCountPreferenceOfChannelByUrlResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewCountPreferenceOfChannelByUrlResponse> executeWithHttpInfo() throws ApiException {
      return viewCountPreferenceOfChannelByUrlWithHttpInfo(userId, channelUrl, apiToken);
    }
  }

  /**
   * View count preference of a channel
   * ## View count preference of a channel  Retrieves count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-count-preference-of-a-channel ----------------------------
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return viewCountPreferenceOfChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewCountPreferenceOfChannelByUrlRequest viewCountPreferenceOfChannelByUrl(String userId, String channelUrl) throws ApiException {
    return new APIviewCountPreferenceOfChannelByUrlRequest(userId, channelUrl);
  }

private ApiResponse<ViewNumberOfChannelsByJoinStatusResponse> viewNumberOfChannelsByJoinStatusWithHttpInfo(String userId, String apiToken, String state) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewNumberOfChannelsByJoinStatusRequest {
    private String userId;
    private String apiToken;
    private String state;

    private APIviewNumberOfChannelsByJoinStatusRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfChannelsByJoinStatusRequest
     */
    public APIviewNumberOfChannelsByJoinStatusRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set state
     * @param state  (optional)
     * @return APIviewNumberOfChannelsByJoinStatusRequest
     */
    public APIviewNumberOfChannelsByJoinStatusRequest state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Execute viewNumberOfChannelsByJoinStatus request
     * @return ViewNumberOfChannelsByJoinStatusResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfChannelsByJoinStatusResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfChannelsByJoinStatus request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfChannelsByJoinStatusResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfChannelsByJoinStatusResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfChannelsByJoinStatusWithHttpInfo(userId, apiToken, state);
    }
  }

  /**
   * View number of channels by join status
   * ## View number of channels by join status  Retrieves the number of a user&#39;s group channels by their join status.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-by-join-status ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
   * @param userId  (required)
   * @return viewNumberOfChannelsByJoinStatusRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfChannelsByJoinStatusRequest viewNumberOfChannelsByJoinStatus(String userId) throws ApiException {
    return new APIviewNumberOfChannelsByJoinStatusRequest(userId);
  }

private ApiResponse<ViewNumberOfChannelsWithUnreadMessagesResponse> viewNumberOfChannelsWithUnreadMessagesWithHttpInfo(String userId, String apiToken, List<String> customTypes, String superMode) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewNumberOfChannelsWithUnreadMessagesRequest {
    private String userId;
    private String apiToken;
    private List<String> customTypes;
    private String superMode;

    private APIviewNumberOfChannelsWithUnreadMessagesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfChannelsWithUnreadMessagesRequest
     */
    public APIviewNumberOfChannelsWithUnreadMessagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIviewNumberOfChannelsWithUnreadMessagesRequest
     */
    public APIviewNumberOfChannelsWithUnreadMessagesRequest customTypes(List<String> customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set superMode
     * @param superMode  (optional)
     * @return APIviewNumberOfChannelsWithUnreadMessagesRequest
     */
    public APIviewNumberOfChannelsWithUnreadMessagesRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
    }

    /**
     * Execute viewNumberOfChannelsWithUnreadMessages request
     * @return ViewNumberOfChannelsWithUnreadMessagesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfChannelsWithUnreadMessagesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfChannelsWithUnreadMessages request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfChannelsWithUnreadMessagesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfChannelsWithUnreadMessagesResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfChannelsWithUnreadMessagesWithHttpInfo(userId, apiToken, customTypes, superMode);
    }
  }

  /**
   * View number of channels with unread messages
   * ## View number of channels with unread messages  Retrieves the total number of a user&#39;s group channels with unread messages.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-with-unread-messages ----------------------------
   * @param userId  (required)
   * @return viewNumberOfChannelsWithUnreadMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfChannelsWithUnreadMessagesRequest viewNumberOfChannelsWithUnreadMessages(String userId) throws ApiException {
    return new APIviewNumberOfChannelsWithUnreadMessagesRequest(userId);
  }

private ApiResponse<ViewNumberOfUnreadItemsResponse> viewNumberOfUnreadItemsWithHttpInfo(String userId, String apiToken, String customType, String itemKeys) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewNumberOfUnreadItemsRequest {
    private String userId;
    private String apiToken;
    private String customType;
    private String itemKeys;

    private APIviewNumberOfUnreadItemsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfUnreadItemsRequest
     */
    public APIviewNumberOfUnreadItemsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set customType
     * @param customType  (optional)
     * @return APIviewNumberOfUnreadItemsRequest
     */
    public APIviewNumberOfUnreadItemsRequest customType(String customType) {
      this.customType = customType;
      return this;
    }

    /**
     * Set itemKeys
     * @param itemKeys  (optional)
     * @return APIviewNumberOfUnreadItemsRequest
     */
    public APIviewNumberOfUnreadItemsRequest itemKeys(String itemKeys) {
      this.itemKeys = itemKeys;
      return this;
    }

    /**
     * Execute viewNumberOfUnreadItems request
     * @return ViewNumberOfUnreadItemsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfUnreadItemsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfUnreadItems request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfUnreadItemsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfUnreadItemsResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfUnreadItemsWithHttpInfo(userId, apiToken, customType, itemKeys);
    }
  }

  /**
   * View number of unread items
   * ## View number of unread items  Retrieves a set of total numbers of a user&#39;s unread messages, unread mentioned messages, or received invitations in either super or non-super group channels. This action is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-items ----------------------------
   * @param userId  (required)
   * @return viewNumberOfUnreadItemsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfUnreadItemsRequest viewNumberOfUnreadItems(String userId) throws ApiException {
    return new APIviewNumberOfUnreadItemsRequest(userId);
  }

private ApiResponse<ViewNumberOfUnreadMessagesResponse> viewNumberOfUnreadMessagesWithHttpInfo(String userId, String apiToken, String customTypes, String superMode) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewNumberOfUnreadMessagesRequest {
    private String userId;
    private String apiToken;
    private String customTypes;
    private String superMode;

    private APIviewNumberOfUnreadMessagesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfUnreadMessagesRequest
     */
    public APIviewNumberOfUnreadMessagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIviewNumberOfUnreadMessagesRequest
     */
    public APIviewNumberOfUnreadMessagesRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set superMode
     * @param superMode  (optional)
     * @return APIviewNumberOfUnreadMessagesRequest
     */
    public APIviewNumberOfUnreadMessagesRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
    }

    /**
     * Execute viewNumberOfUnreadMessages request
     * @return ViewNumberOfUnreadMessagesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfUnreadMessagesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfUnreadMessages request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfUnreadMessagesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfUnreadMessagesResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfUnreadMessagesWithHttpInfo(userId, apiToken, customTypes, superMode);
    }
  }

  /**
   * View number of unread messages
   * ## View number of unread messages  Retrieves the total number of a user&#39;s currently unread messages in the group channels. The unread counts feature is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-messages ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
   * @param userId  (required)
   * @return viewNumberOfUnreadMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfUnreadMessagesRequest viewNumberOfUnreadMessages(String userId) throws ApiException {
    return new APIviewNumberOfUnreadMessagesRequest(userId);
  }

private ApiResponse<ViewPushPreferencesResponse> viewPushPreferencesWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewPushPreferencesRequest {
    private String userId;
    private String apiToken;

    private APIviewPushPreferencesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewPushPreferencesRequest
     */
    public APIviewPushPreferencesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewPushPreferences request
     * @return ViewPushPreferencesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewPushPreferencesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewPushPreferences request with HTTP info returned
     * @return ApiResponse&lt;ViewPushPreferencesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewPushPreferencesResponse> executeWithHttpInfo() throws ApiException {
      return viewPushPreferencesWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * View push preferences
   * ## View push preferences  Retrieves a user&#39;s push preferences about whether the user has set &#x60;do_not_disturb&#x60; to pause notifications for a certain period of time, and the time frame in which the user has applied the setting.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences ----------------------------
   * @param userId  (required)
   * @return viewPushPreferencesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewPushPreferencesRequest viewPushPreferences(String userId) throws ApiException {
    return new APIviewPushPreferencesRequest(userId);
  }

private ApiResponse<ViewPushPreferencesForChannelByUrlResponse> viewPushPreferencesForChannelByUrlWithHttpInfo(String userId, String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewPushPreferencesForChannelByUrlRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;

    private APIviewPushPreferencesForChannelByUrlRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewPushPreferencesForChannelByUrlRequest
     */
    public APIviewPushPreferencesForChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewPushPreferencesForChannelByUrl request
     * @return ViewPushPreferencesForChannelByUrlResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewPushPreferencesForChannelByUrlResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewPushPreferencesForChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;ViewPushPreferencesForChannelByUrlResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewPushPreferencesForChannelByUrlResponse> executeWithHttpInfo() throws ApiException {
      return viewPushPreferencesForChannelByUrlWithHttpInfo(userId, channelUrl, apiToken);
    }
  }

  /**
   * View push preferences for a channel
   * ## View push preferences for a channel  Retrieves whether a user has turned on notification messages for a specific channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences-for-a-channel ----------------------------
   * @param userId  (required)
   * @param channelUrl  (required)
   * @return viewPushPreferencesForChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewPushPreferencesForChannelByUrlRequest viewPushPreferencesForChannelByUrl(String userId, String channelUrl) throws ApiException {
    return new APIviewPushPreferencesForChannelByUrlRequest(userId, channelUrl);
  }

private ApiResponse<SendBirdUser> viewUserByIdWithHttpInfo(String userId, String apiToken, Boolean includeUnreadCount, String customTypes, String superMode) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewUserByIdRequest {
    private String userId;
    private String apiToken;
    private Boolean includeUnreadCount;
    private String customTypes;
    private String superMode;

    private APIviewUserByIdRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewUserByIdRequest
     */
    public APIviewUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set includeUnreadCount
     * @param includeUnreadCount  (optional)
     * @return APIviewUserByIdRequest
     */
    public APIviewUserByIdRequest includeUnreadCount(Boolean includeUnreadCount) {
      this.includeUnreadCount = includeUnreadCount;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIviewUserByIdRequest
     */
    public APIviewUserByIdRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set superMode
     * @param superMode  (optional)
     * @return APIviewUserByIdRequest
     */
    public APIviewUserByIdRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
    }

    /**
     * Execute viewUserById request
     * @return SendBirdUser
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdUser execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewUserById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdUser&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdUser> executeWithHttpInfo() throws ApiException {
      return viewUserByIdWithHttpInfo(userId, apiToken, includeUnreadCount, customTypes, superMode);
    }
  }

  /**
   * View a user
   * ## View a user  Retrieves information on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-a-user ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve.
   * @param userId  (required)
   * @return viewUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewUserByIdRequest viewUserById(String userId) throws ApiException {
    return new APIviewUserByIdRequest(userId);
  }

private ApiResponse<List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner>> viewWhoOwnsRegistrationOrDeviceTokenByTokenWithHttpInfo(String tokenType, String token, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

  public class APIviewWhoOwnsRegistrationOrDeviceTokenByTokenRequest {
    private String tokenType;
    private String token;
    private String apiToken;

    private APIviewWhoOwnsRegistrationOrDeviceTokenByTokenRequest(String tokenType, String token) {
      this.tokenType = tokenType;
      this.token = token;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewWhoOwnsRegistrationOrDeviceTokenByTokenRequest
     */
    public APIviewWhoOwnsRegistrationOrDeviceTokenByTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewWhoOwnsRegistrationOrDeviceTokenByToken request
     * @return List&lt;ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewWhoOwnsRegistrationOrDeviceTokenByToken request with HTTP info returned
     * @return ApiResponse&lt;List&lt;ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner>> executeWithHttpInfo() throws ApiException {
      return viewWhoOwnsRegistrationOrDeviceTokenByTokenWithHttpInfo(tokenType, token, apiToken);
    }
  }

  /**
   * View who owns a registration or device token
   * ## View who owns a registration or device token  Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token ----------------------------
   * @param tokenType  (required)
   * @param token  (required)
   * @return viewWhoOwnsRegistrationOrDeviceTokenByTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewWhoOwnsRegistrationOrDeviceTokenByTokenRequest viewWhoOwnsRegistrationOrDeviceTokenByToken(String tokenType, String token) throws ApiException {
    return new APIviewWhoOwnsRegistrationOrDeviceTokenByTokenRequest(tokenType, token);
  }
}
