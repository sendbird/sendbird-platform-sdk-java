package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.AddARegistrationOrDeviceTokenRequest;
import org.openapitools.client.model.AddARegistrationOrDeviceTokenResponse;
import org.openapitools.client.model.ChooseAPushNotificationContentTemplateRequest;
import org.openapitools.client.model.ChooseAPushNotificationContentTemplateResponse;
import org.openapitools.client.model.CreateAUserRequest;
import org.openapitools.client.model.CreateUserTokenRequest;
import org.openapitools.client.model.CreateUserTokenResponse;
import org.openapitools.client.model.GetChannelInvitationPreferenceResponse;
import org.openapitools.client.model.LeaveMyGroupChannelsRequest;
import org.openapitools.client.model.ListMyGroupChannelsResponse;
import org.openapitools.client.model.ListRegistrationOrDeviceTokensResponse;
import org.openapitools.client.model.ListUsersResponse;
import org.openapitools.client.model.MarkAllMessagesAsReadRequest;
import org.openapitools.client.model.MarkChannelMessagesAsReadRequest;
import org.openapitools.client.model.RemoveARegistrationOrDeviceTokenResponse;
import org.openapitools.client.model.RemoveAllRegistrationOrDeviceTokenResponse;
import org.openapitools.client.model.SendbirdUser;
import org.openapitools.client.model.UpdateAUserRequest;
import org.openapitools.client.model.UpdateChannelInvitationPreferenceRequest;
import org.openapitools.client.model.UpdateChannelInvitationPreferenceResponse;
import org.openapitools.client.model.UpdateCountPreferenceOfAChannelRequest;
import org.openapitools.client.model.UpdateCountPreferenceOfChannelByUrlResponse;
import org.openapitools.client.model.UpdatePushPreferencesForAChannelRequest;
import org.openapitools.client.model.UpdatePushPreferencesForAChannelResponse;
import org.openapitools.client.model.UpdatePushPreferencesRequest;
import org.openapitools.client.model.UpdatePushPreferencesResponse;
import org.openapitools.client.model.ViewCountPreferenceOfAChannelResponse;
import org.openapitools.client.model.ViewNumberOfChannelsWithUnreadMessagesResponse;
import org.openapitools.client.model.ViewNumberOfUnreadMessagesResponse;
import org.openapitools.client.model.ViewPushPreferencesForAChannelResponse;
import org.openapitools.client.model.ViewPushPreferencesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-29T07:36:12.748535+07:00[Asia/Jakarta]")
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


private ApiResponse<AddARegistrationOrDeviceTokenResponse> addARegistrationOrDeviceTokenWithHttpInfo(String userId, String tokenType, String apiToken, AddARegistrationOrDeviceTokenRequest addARegistrationOrDeviceTokenRequest) throws ApiException {
    Object localVarPostBody = addARegistrationOrDeviceTokenRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addARegistrationOrDeviceToken");
    }
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling addARegistrationOrDeviceToken");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AddARegistrationOrDeviceTokenResponse> localVarReturnType = new GenericType<AddARegistrationOrDeviceTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.addARegistrationOrDeviceToken", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIaddARegistrationOrDeviceTokenRequest {
    private String userId;
    private String tokenType;
    private String apiToken;
    private AddARegistrationOrDeviceTokenRequest addARegistrationOrDeviceTokenRequest;

    private APIaddARegistrationOrDeviceTokenRequest(String userId, String tokenType) {
      this.userId = userId;
      this.tokenType = tokenType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddARegistrationOrDeviceTokenRequest
     */
    public APIaddARegistrationOrDeviceTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addARegistrationOrDeviceTokenRequest
     * @param addARegistrationOrDeviceTokenRequest  (optional)
     * @return APIaddARegistrationOrDeviceTokenRequest
     */
    public APIaddARegistrationOrDeviceTokenRequest addARegistrationOrDeviceTokenRequest(AddARegistrationOrDeviceTokenRequest addARegistrationOrDeviceTokenRequest) {
      this.addARegistrationOrDeviceTokenRequest = addARegistrationOrDeviceTokenRequest;
      return this;
    }

    /**
     * Execute addARegistrationOrDeviceToken request
     * @return AddARegistrationOrDeviceTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddARegistrationOrDeviceTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addARegistrationOrDeviceToken request with HTTP info returned
     * @return ApiResponse&lt;AddARegistrationOrDeviceTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddARegistrationOrDeviceTokenResponse> executeWithHttpInfo() throws ApiException {
      return addARegistrationOrDeviceTokenWithHttpInfo(userId, tokenType, apiToken, addARegistrationOrDeviceTokenRequest);
    }
  }

  /**
   * Add a registration or device token
   * ## Add a registration or device token  &gt; __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.  To send notification requests to push notification services on behalf of your server, adds a specific user&#39;s FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.  &gt; __Note__: For more information on the registration token and device token, visit the Google&#39;s [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei&#39;s [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple&#39;s [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token ----------------------------
   * @param userId (Required)  (required)
   * @param tokenType (Required)  (required)
   * @return addARegistrationOrDeviceTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddARegistrationOrDeviceTokenRequest addARegistrationOrDeviceToken(String userId, String tokenType) throws ApiException {
    return new APIaddARegistrationOrDeviceTokenRequest(userId, tokenType);
  }

private ApiResponse<ChooseAPushNotificationContentTemplateResponse> chooseAPushNotificationContentTemplateWithHttpInfo(String userId, String apiToken, ChooseAPushNotificationContentTemplateRequest chooseAPushNotificationContentTemplateRequest) throws ApiException {
    Object localVarPostBody = chooseAPushNotificationContentTemplateRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling chooseAPushNotificationContentTemplate");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ChooseAPushNotificationContentTemplateResponse> localVarReturnType = new GenericType<ChooseAPushNotificationContentTemplateResponse>() {};

    return apiClient.invokeAPI("UserApi.chooseAPushNotificationContentTemplate", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIchooseAPushNotificationContentTemplateRequest {
    private String userId;
    private String apiToken;
    private ChooseAPushNotificationContentTemplateRequest chooseAPushNotificationContentTemplateRequest;

    private APIchooseAPushNotificationContentTemplateRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIchooseAPushNotificationContentTemplateRequest
     */
    public APIchooseAPushNotificationContentTemplateRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set chooseAPushNotificationContentTemplateRequest
     * @param chooseAPushNotificationContentTemplateRequest  (optional)
     * @return APIchooseAPushNotificationContentTemplateRequest
     */
    public APIchooseAPushNotificationContentTemplateRequest chooseAPushNotificationContentTemplateRequest(ChooseAPushNotificationContentTemplateRequest chooseAPushNotificationContentTemplateRequest) {
      this.chooseAPushNotificationContentTemplateRequest = chooseAPushNotificationContentTemplateRequest;
      return this;
    }

    /**
     * Execute chooseAPushNotificationContentTemplate request
     * @return ChooseAPushNotificationContentTemplateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ChooseAPushNotificationContentTemplateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute chooseAPushNotificationContentTemplate request with HTTP info returned
     * @return ApiResponse&lt;ChooseAPushNotificationContentTemplateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ChooseAPushNotificationContentTemplateResponse> executeWithHttpInfo() throws ApiException {
      return chooseAPushNotificationContentTemplateWithHttpInfo(userId, apiToken, chooseAPushNotificationContentTemplateRequest);
    }
  }

  /**
   * Choose a push notification content template
   * ## Choose a push notification content template  Users can choose a template to determine how push notifications appear to them. Push notification content templates are pre-formatted forms that can be customized to display your own push notification messages on a user&#39;s device. Sendbird provides two types: &#x60;default&#x60; and &#x60;alternative&#x60;. Go to **Settings** &gt; **Chat** &gt; **Push notifications** &gt; **Push notification content templates** on [Sendbird Dashboard](https://dashboard.sendbird.com/auth/signin) to customize the templates.  If the &#x60;push_message_template&#x60; property is specified when [sending a message](https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/send-a-message), the content template customized for the message takes precedence over the user&#39;s choice.  &gt; **Note**: Push notifications are only available for group channels.      https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/choose-a-push-notification-content-template#1-choose-a-push-notification-content-template
   * @param userId (Required)  (required)
   * @return chooseAPushNotificationContentTemplateRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIchooseAPushNotificationContentTemplateRequest chooseAPushNotificationContentTemplate(String userId) throws ApiException {
    return new APIchooseAPushNotificationContentTemplateRequest(userId);
  }

private ApiResponse<SendbirdUser> createAUserWithHttpInfo(String apiToken, CreateAUserRequest createAUserRequest) throws ApiException {
    Object localVarPostBody = createAUserRequest;
    
    // create path and map variables
    String localVarPath = "/v3/users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendbirdUser> localVarReturnType = new GenericType<SendbirdUser>() {};

    return apiClient.invokeAPI("UserApi.createAUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateAUserRequest {
    private String apiToken;
    private CreateAUserRequest createAUserRequest;

    private APIcreateAUserRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateAUserRequest
     */
    public APIcreateAUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createAUserRequest
     * @param createAUserRequest  (optional)
     * @return APIcreateAUserRequest
     */
    public APIcreateAUserRequest createAUserRequest(CreateAUserRequest createAUserRequest) {
      this.createAUserRequest = createAUserRequest;
      return this;
    }

    /**
     * Execute createAUser request
     * @return SendbirdUser
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdUser execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAUser request with HTTP info returned
     * @return ApiResponse&lt;SendbirdUser&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdUser> executeWithHttpInfo() throws ApiException {
      return createAUserWithHttpInfo(apiToken, createAUserRequest);
    }
  }

  /**
   * Create a user
   * ## Create a user  You should create a user in your Sendbird application to initiate conversations in channels. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on. Users are at the core of all conversations. Sendbird applications are made up of users who chat in either Open Channels or Group Channels. Using this API, it is possible to have fine grained control over your users and what those users can do. To learn more about users, see [User overview](https://sendbird.com/docs/chat/platform-api/v3/user/user-overview#2-resource-representation).  https://sendbird.com/docs/chat/platform-api/v3/user/creating-users/create-a-user#1-create-a-user
   * @return createAUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateAUserRequest createAUser() throws ApiException {
    return new APIcreateAUserRequest();
  }

private ApiResponse<CreateUserTokenResponse> createUserTokenWithHttpInfo(String userId, String apiToken, CreateUserTokenRequest createUserTokenRequest) throws ApiException {
    Object localVarPostBody = createUserTokenRequest;
    
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private CreateUserTokenRequest createUserTokenRequest;

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
     * Set createUserTokenRequest
     * @param createUserTokenRequest  (optional)
     * @return APIcreateUserTokenRequest
     */
    public APIcreateUserTokenRequest createUserTokenRequest(CreateUserTokenRequest createUserTokenRequest) {
      this.createUserTokenRequest = createUserTokenRequest;
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
      return createUserTokenWithHttpInfo(userId, apiToken, createUserTokenRequest);
    }
  }

  /**
   * Create user token
   * ## Create user token  This action issues a session token for user authentication. Session tokens provide an efficient stateless authentication method by not storing the tokens in the Sendbird database, and thus improving the server&#39;s performance. See [access token vs. session token](https://sendbird.com/docs/chat/platform-api/v3/user/creating-users/create-a-user#2-access-token-vs-session-token) to learn more about authenticating users.  &gt; **Note**: The endpoint &#x60;/users/{user_id}&#x60; is deprecated. Use &#x60;/users/{user_id}/token&#x60; for greater efficiency.      https://sendbird.com/docs/chat/platform-api/v3/user/managing-session-tokens/issue-a-session-token#1-issue-a-session-token
   * @param userId (Required)  (required)
   * @return createUserTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateUserTokenRequest createUserToken(String userId) throws ApiException {
    return new APIcreateUserTokenRequest(userId);
  }

private ApiResponse<Object> deleteAUserWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteAUser");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("UserApi.deleteAUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteAUserRequest {
    private String userId;
    private String apiToken;

    private APIdeleteAUserRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteAUserRequest
     */
    public APIdeleteAUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteAUser request
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
     * Execute deleteAUser request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAUserWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * Delete a user
   * ## Delete a user  You can delete a user from your Sendbird application using this API.  &gt; **Note**: This API deletes user data and metadata, except for their messages. If you wish to delete user data including their messages, use the [GDPR request](https://sendbird.com/docs/chat/platform-api/v3/privacy/privacy-overview).      [https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/delete-a-user#1-delete-a-user](https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/delete-a-user#1-delete-a-user)
   * @param userId (Required)  (required)
   * @return deleteAUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAUserRequest deleteAUser(String userId) throws ApiException {
    return new APIdeleteAUserRequest(userId);
  }

private ApiResponse<GetChannelInvitationPreferenceResponse> getChannelInvitationPreferenceWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getChannelInvitationPreference");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetChannelInvitationPreferenceResponse> localVarReturnType = new GenericType<GetChannelInvitationPreferenceResponse>() {};

    return apiClient.invokeAPI("UserApi.getChannelInvitationPreference", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetChannelInvitationPreferenceRequest {
    private String userId;
    private String apiToken;

    private APIgetChannelInvitationPreferenceRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetChannelInvitationPreferenceRequest
     */
    public APIgetChannelInvitationPreferenceRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getChannelInvitationPreference request
     * @return GetChannelInvitationPreferenceResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetChannelInvitationPreferenceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getChannelInvitationPreference request with HTTP info returned
     * @return ApiResponse&lt;GetChannelInvitationPreferenceResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetChannelInvitationPreferenceResponse> executeWithHttpInfo() throws ApiException {
      return getChannelInvitationPreferenceWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * Get channel invitation preference
   * ## Get channel invitation preference  This action retrieves a user&#39;s [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) invitation preference. Users are subject to both user-specific and application-wide invitation preferences. Of the two, the invitation preference set for a specific user takes precedence over [the default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/get-default-invitation-preference).  [https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/get-channel-invitation-preference#1-get-channel-invitation-preference](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/get-channel-invitation-preference#1-get-channel-invitation-preference)
   * @param userId (Required)  (required)
   * @return getChannelInvitationPreferenceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetChannelInvitationPreferenceRequest getChannelInvitationPreference(String userId) throws ApiException {
    return new APIgetChannelInvitationPreferenceRequest(userId);
  }

private ApiResponse<Object> leaveMyGroupChannelsWithHttpInfo(String userId, String apiToken, LeaveMyGroupChannelsRequest leaveMyGroupChannelsRequest) throws ApiException {
    Object localVarPostBody = leaveMyGroupChannelsRequest;
    
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private LeaveMyGroupChannelsRequest leaveMyGroupChannelsRequest;

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
     * Set leaveMyGroupChannelsRequest
     * @param leaveMyGroupChannelsRequest  (optional)
     * @return APIleaveMyGroupChannelsRequest
     */
    public APIleaveMyGroupChannelsRequest leaveMyGroupChannelsRequest(LeaveMyGroupChannelsRequest leaveMyGroupChannelsRequest) {
      this.leaveMyGroupChannelsRequest = leaveMyGroupChannelsRequest;
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
      return leaveMyGroupChannelsWithHttpInfo(userId, apiToken, leaveMyGroupChannelsRequest);
    }
  }

  /**
   * Leave my group channels
   * ## Leave my group channels  This action allows a user to leave all group channels or channels with a specific custom type. This API is useful if you want to let a user leave a set of channels at once. To let a user leave only one of their group channels, use the [leave a channel API](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/leave-a-channel) instead.  Since this API can&#39;t be called for a deactivated user, ensure that the [&lt;code&gt;leave_all_when_deactivated&lt;/code&gt;](https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/update-a-user#2-request-body) property of the user is set to its default value of &#x60;true&#x60; to let the user leave all joined group channels upon deactivation.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-joined-group-channels/leave-group-channels#1-leave-group-channels  &#x60;user_id&#x60;   Type: string   Description: Specifies the unique ID of the user to leave all joined group channels.
   * @param userId (Required)  (required)
   * @return leaveMyGroupChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIleaveMyGroupChannelsRequest leaveMyGroupChannels(String userId) throws ApiException {
    return new APIleaveMyGroupChannelsRequest(userId);
  }

private ApiResponse<ListMyGroupChannelsResponse> listMyGroupChannelsWithHttpInfo(String userId, String apiToken, String token, Integer limit, String distinctMode, String publicMode, String superMode, Long createdAfter, Long createdBefore, Boolean showEmpty, Boolean showMember, Boolean showDeliveryReceipt, Boolean showReadReceipt, Boolean showMetadata, Boolean showFrozen, String order, String metadataOrderKey, String customTypes, String customTypeStartswith, String channelUrls, String name, String nameContains, String nameStartswith, String membersExactlyIn, String membersIncludeIn, String queryType, String membersNickname, String membersNicknameContains, String metadataKey, String metadataValues, String metadataValueStartswith, String metacounterKey, String metacounterValues, String metacounterValueGt, String metacounterValueGte, String metacounterValueLt, String metacounterValueLte, Boolean includeSortedMetaarrayInLastMessage, String customType, Boolean readReceipt, Boolean member, Boolean isDistinct, String membersIn, String userId2) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listMyGroupChannels");
    }
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listMyGroupChannels");
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_after", createdAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_before", createdBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_empty", showEmpty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_member", showMember));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_delivery_receipt", showDeliveryReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_read_receipt", showReadReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_metadata", showMetadata));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_frozen", showFrozen));
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadata_key", metadataKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadata_values", metadataValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metadata_value_startswith", metadataValueStartswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_key", metacounterKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_values", metacounterValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_gt", metacounterValueGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_gte", metacounterValueGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_lt", metacounterValueLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "metacounter_value_lte", metacounterValueLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_sorted_metaarray_in_last_message", includeSortedMetaarrayInLastMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_type", customType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_receipt", readReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "member", member));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "is_distinct", isDistinct));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_in", membersIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId2));

    if (apiToken != null)
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private Long createdAfter;
    private Long createdBefore;
    private Boolean showEmpty;
    private Boolean showMember;
    private Boolean showDeliveryReceipt;
    private Boolean showReadReceipt;
    private Boolean showMetadata;
    private Boolean showFrozen;
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
    private String metadataKey;
    private String metadataValues;
    private String metadataValueStartswith;
    private String metacounterKey;
    private String metacounterValues;
    private String metacounterValueGt;
    private String metacounterValueGte;
    private String metacounterValueLt;
    private String metacounterValueLte;
    private Boolean includeSortedMetaarrayInLastMessage;
    private String customType;
    private Boolean readReceipt;
    private Boolean member;
    private Boolean isDistinct;
    private String membersIn;
    private String userId2;

    private APIlistMyGroupChannelsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token Specifies a page token that indicates the starting index of a chunk of results. If not specified, the index is set as 0. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10) (optional)
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
     * Set createdAfter
     * @param createdAfter Restricts the search scope to only retrieve group channels which have been created after the specified time, in Unix milliseconds format. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest createdAfter(Long createdAfter) {
      this.createdAfter = createdAfter;
      return this;
    }

    /**
     * Set createdBefore
     * @param createdBefore Restricts the search scope to only retrieve group channels which have been created before the specified time, in Unix milliseconds format. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest createdBefore(Long createdBefore) {
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
     * Set showMetadata
     * @param showMetadata  (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest showMetadata(Boolean showMetadata) {
      this.showMetadata = showMetadata;
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
     * @param metadataOrderKey Specifies the key of an item in metadata. When a value of the order parameter is set to metadata_value_alphabetical, the results are alphabetically sorted by the value of the item specified by the key. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataOrderKey(String metadataOrderKey) {
      this.metadataOrderKey = metadataOrderKey;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes Specifies a comma-separated string of one or more custom types to filter group channels. URL encoding each type is recommended. If not specified, all channels are returned, regardless of their custom type. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set customTypeStartswith
     * @param customTypeStartswith Searches for group channels with the custom type which starts with the specified value. URL encoding the value is recommended. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest customTypeStartswith(String customTypeStartswith) {
      this.customTypeStartswith = customTypeStartswith;
      return this;
    }

    /**
     * Set channelUrls
     * @param channelUrls Specifies a comma-separated string of one or more group channel URLs to restrict the search scope. URL encoding each channel URL is recommended. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest channelUrls(String channelUrls) {
      this.channelUrls = channelUrls;
      return this;
    }

    /**
     * Set name
     * @param name Specifies one or more group channel names. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set nameContains
     * @param nameContains Searches for group channels whose names contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest nameContains(String nameContains) {
      this.nameContains = nameContains;
      return this;
    }

    /**
     * Set nameStartswith
     * @param nameStartswith Searches for group channels whose names start with the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest nameStartswith(String nameStartswith) {
      this.nameStartswith = nameStartswith;
      return this;
    }

    /**
     * Set membersExactlyIn
     * @param membersExactlyIn Searches for group channels with all the specified users as members. The parameter value should consist of user IDs separated by commas.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersExactlyIn(String membersExactlyIn) {
      this.membersExactlyIn = membersExactlyIn;
      return this;
    }

    /**
     * Set membersIncludeIn
     * @param membersIncludeIn Searches for group channels that include one or more users as members among the specified users. The value should consist of user IDs separated by commas or %2C. You can specify up to 60 user IDs.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersIncludeIn(String membersIncludeIn) {
      this.membersIncludeIn = membersIncludeIn;
      return this;
    }

    /**
     * Set queryType
     * @param queryType Specifies a logical condition applied to the members_include_in parameter. Acceptable values are either AND or OR. For example, if you specify three members, A, B, and C, in members_include_in, the value of AND returns all channels that include every one of {A. B, C} as members. The value of OR returns channels that include {A}, plus those that include {B}, plus those that include {C}. (Default: AND) (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest queryType(String queryType) {
      this.queryType = queryType;
      return this;
    }

    /**
     * Set membersNickname
     * @param membersNickname Searches for group channels with members whose nicknames match the specified value. URL encoding the value is recommended. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersNickname(String membersNickname) {
      this.membersNickname = membersNickname;
      return this;
    }

    /**
     * Set membersNicknameContains
     * @param membersNicknameContains Searches for group channels with members whose nicknames contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended.  * We recommend using at least three characters for the parameter value for better search efficiency when you design and implement related features. If you would like to allow one or two characters for searching, use members_nickname instead to prevent performance issues. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersNicknameContains(String membersNicknameContains) {
      this.membersNicknameContains = membersNicknameContains;
      return this;
    }

    /**
     * Set metadataKey
     * @param metadataKey Searches for group channels with metadata containing an item with the specified value as its key. To use this parameter, either the metadata_values parameter or the metadata_value_startswith parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataKey(String metadataKey) {
      this.metadataKey = metadataKey;
      return this;
    }

    /**
     * Set metadataValues
     * @param metadataValues Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the value of that item matches one or more values specified by this parameter. The string should be specified with multiple values separated by commas. URL encoding each value is recommended. To use this parameter, the metadata_key parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataValues(String metadataValues) {
      this.metadataValues = metadataValues;
      return this;
    }

    /**
     * Set metadataValueStartswith
     * @param metadataValueStartswith Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the values of that item that start with the specified value of this parameter. URL encoding the value is recommended. To use this parameter, the metadata_key parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metadataValueStartswith(String metadataValueStartswith) {
      this.metadataValueStartswith = metadataValueStartswith;
      return this;
    }

    /**
     * Set metacounterKey
     * @param metacounterKey Searches for group channels with metacounter containing an item with the specified value as its key. To use this parameter, either the metacounter_values parameter or one of the metacounter_value_gt, metacounter_value_gte, metacounter_value_lt, and metacounter_value_lte parameters should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterKey(String metacounterKey) {
      this.metacounterKey = metacounterKey;
      return this;
    }

    /**
     * Set metacounterValues
     * @param metacounterValues Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is equal to one or more values specified by this parameter. The string should be specified with multiple values separated by commas. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValues(String metacounterValues) {
      this.metacounterValues = metacounterValues;
      return this;
    }

    /**
     * Set metacounterValueGt
     * @param metacounterValueGt Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueGt(String metacounterValueGt) {
      this.metacounterValueGt = metacounterValueGt;
      return this;
    }

    /**
     * Set metacounterValueGte
     * @param metacounterValueGte Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueGte(String metacounterValueGte) {
      this.metacounterValueGte = metacounterValueGte;
      return this;
    }

    /**
     * Set metacounterValueLt
     * @param metacounterValueLt Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueLt(String metacounterValueLt) {
      this.metacounterValueLt = metacounterValueLt;
      return this;
    }

    /**
     * Set metacounterValueLte
     * @param metacounterValueLte Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest metacounterValueLte(String metacounterValueLte) {
      this.metacounterValueLte = metacounterValueLte;
      return this;
    }

    /**
     * Set includeSortedMetaarrayInLastMessage
     * @param includeSortedMetaarrayInLastMessage Determines whether to include the sorted_metaarray as one of the last_message’s properties in the response. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest includeSortedMetaarrayInLastMessage(Boolean includeSortedMetaarrayInLastMessage) {
      this.includeSortedMetaarrayInLastMessage = includeSortedMetaarrayInLastMessage;
      return this;
    }

    /**
     * Set customType
     * @param customType (Deprecated) Returns channels whose custom_type matches the given value. If this field is not specified, all channels are returned, regardless of their custom type. The string passed here must be urlencoded. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest customType(String customType) {
      this.customType = customType;
      return this;
    }

    /**
     * Set readReceipt
     * @param readReceipt (Deprecated) Superseded by show_read_receipt. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest readReceipt(Boolean readReceipt) {
      this.readReceipt = readReceipt;
      return this;
    }

    /**
     * Set member
     * @param member (Deprecated) Superseded by show_member. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest member(Boolean member) {
      this.member = member;
      return this;
    }

    /**
     * Set isDistinct
     * @param isDistinct (Deprecated) Superseded by distinct_mode. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest isDistinct(Boolean isDistinct) {
      this.isDistinct = isDistinct;
      return this;
    }

    /**
     * Set membersIn
     * @param membersIn (Deprecated) Superseded by members_exactly_in. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest membersIn(String membersIn) {
      this.membersIn = membersIn;
      return this;
    }

    /**
     * Set userId2
     * @param userId2 (Deprecated) Restricts the search scope to only retrieve the target user&#39;s group channels. It&#39;s recommended to use the list group channels by user action instead. (optional)
     * @return APIlistMyGroupChannelsRequest
     */
    public APIlistMyGroupChannelsRequest userId2(String userId2) {
      this.userId2 = userId2;
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
      return listMyGroupChannelsWithHttpInfo(userId, apiToken, token, limit, distinctMode, publicMode, superMode, createdAfter, createdBefore, showEmpty, showMember, showDeliveryReceipt, showReadReceipt, showMetadata, showFrozen, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, includeSortedMetaarrayInLastMessage, customType, readReceipt, member, isDistinct, membersIn, userId2);
    }
  }

  /**
   * List my group channels
   * ## List my group channels  This action retrieves a list of [group channels](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) that a specific user has joined. You can use various query parameters to determine the search scope and select what kind of information you want to receive about the queried channels.  If you&#39;re looking to retrieve a list of group channels in a specific application, visit the [list group channels](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-group-channels) page under the Channel section.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-joined-group-channels/list-group-channels-by-user#1-list-group-channels-by-user  &#x60;user_id&#x60;   Type: string   Description: Specifies the unique ID of the target user.
   * @param userId (Required)  (required)
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
   * ## List registration or device tokens  Retrieves a list of a user&#39;s registration or device tokens. You can pass &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; for FCM registration token, HMS device token, or APNs device token, respectively, in the &#x60;token_type&#x60; parameter for the push notification service you are using.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/list-registration-or-device-tokens#1-list-registration-or-device-tokens
   * @param userId (Required)  (required)
   * @param tokenType (Required)  (required)
   * @return listRegistrationOrDeviceTokensRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistRegistrationOrDeviceTokensRequest listRegistrationOrDeviceTokens(String userId, String tokenType) throws ApiException {
    return new APIlistRegistrationOrDeviceTokensRequest(userId, tokenType);
  }

private ApiResponse<ListUsersResponse> listUsersWithHttpInfo(String token, Integer limit, String activeMode, Boolean showBot, String userIds, String nickname, String nicknameStartswith, String metadatakey, String metadatavaluesIn, String apiToken) throws ApiException {
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private String token;
    private Integer limit;
    private String activeMode;
    private Boolean showBot;
    private String userIds;
    private String nickname;
    private String nicknameStartswith;
    private String metadatakey;
    private String metadatavaluesIn;
    private String apiToken;

    private APIlistUsersRequest() {
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
     * @param activeMode Specifies the activation status of the users in the list. Acceptable values are &#x60;activated&#x60;, &#x60;deactivated&#x60;, and &#x60;all&#x60;. (Default: &#x60;activated&#x60;) (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest activeMode(String activeMode) {
      this.activeMode = activeMode;
      return this;
    }

    /**
     * Set showBot
     * @param showBot Determines whether to include bots in the list. (Default: true) (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest showBot(Boolean showBot) {
      this.showBot = showBot;
      return this;
    }

    /**
     * Set userIds
     * @param userIds Specifies the user IDs. The value should be a comma-separated string that consists of multiple urlencoded user IDs. An example of a urlencoded string is ?user_ids&#x3D;urlencoded_id_1,urlencoded_id_2. * The maximum number of user IDs in this parameter is 250. If you exceed the maximum number, your request may receive an HTTP 414 error indicating that the request URL is longer than what Sendbird server can interpret. (optional)
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
     * @param metadatavaluesIn Searches for blocked users with metadata containing an item with the key specified by the metadatakey parameter above, and the value of that item matches one or more values specified by this parameter. The string should be specified with multiple urlencoded metadata values separated by commas (for example, &#x60;?metadatavalues_in&#x3D;urlencoded_value_1, urlencoded_value_2&#x60;). This parameter should be specified in conjunction with the &#x60;metadatakey&#x60; above. (optional)
     * @return APIlistUsersRequest
     */
    public APIlistUsersRequest metadatavaluesIn(String metadatavaluesIn) {
      this.metadatavaluesIn = metadatavaluesIn;
      return this;
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
      return listUsersWithHttpInfo(token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn, apiToken);
    }
  }

  /**
   * List users
   * ## List users  You can retrieve a list of users in your Sendbird application using this API. You can generate a customized list using various parameter combinations.  https://sendbird.com/docs/chat/platform-api/v3/user/listing-users/list-users#1-list-users
   * @return listUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistUsersRequest listUsers() throws ApiException {
    return new APIlistUsersRequest();
  }

private ApiResponse<Object> markAllMessagesAsReadWithHttpInfo(String userId, String apiToken, MarkAllMessagesAsReadRequest markAllMessagesAsReadRequest) throws ApiException {
    Object localVarPostBody = markAllMessagesAsReadRequest;
    
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private MarkAllMessagesAsReadRequest markAllMessagesAsReadRequest;

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
     * Set markAllMessagesAsReadRequest
     * @param markAllMessagesAsReadRequest  (optional)
     * @return APImarkAllMessagesAsReadRequest
     */
    public APImarkAllMessagesAsReadRequest markAllMessagesAsReadRequest(MarkAllMessagesAsReadRequest markAllMessagesAsReadRequest) {
      this.markAllMessagesAsReadRequest = markAllMessagesAsReadRequest;
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
      return markAllMessagesAsReadWithHttpInfo(userId, apiToken, markAllMessagesAsReadRequest);
    }
  }

  /**
   * Mark all messages as read
   * ## Mark all messages as read  This action marks all of a user&#39;s unread messages as read in certain group channels. If channels aren&#39;t specified, the user&#39;s unread messages in all group channels are marked as read.  https://sendbird.com/docs/chat/platform-api/v3/user/marking-messages-as-read/mark-all-of-a-users-messages-as-read#1-mark-all-of-a-user-s-messages-as-read
   * @param userId (Required)  (required)
   * @return markAllMessagesAsReadRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APImarkAllMessagesAsReadRequest markAllMessagesAsRead(String userId) throws ApiException {
    return new APImarkAllMessagesAsReadRequest(userId);
  }

private ApiResponse<RemoveARegistrationOrDeviceTokenResponse> removeARegistrationOrDeviceTokenWithHttpInfo(String userId, String tokenType, String token, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeARegistrationOrDeviceToken");
    }
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling removeARegistrationOrDeviceToken");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling removeARegistrationOrDeviceToken");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RemoveARegistrationOrDeviceTokenResponse> localVarReturnType = new GenericType<RemoveARegistrationOrDeviceTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.removeARegistrationOrDeviceToken", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIremoveARegistrationOrDeviceTokenRequest {
    private String userId;
    private String tokenType;
    private String token;
    private String apiToken;

    private APIremoveARegistrationOrDeviceTokenRequest(String userId, String tokenType, String token) {
      this.userId = userId;
      this.tokenType = tokenType;
      this.token = token;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveARegistrationOrDeviceTokenRequest
     */
    public APIremoveARegistrationOrDeviceTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removeARegistrationOrDeviceToken request
     * @return RemoveARegistrationOrDeviceTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RemoveARegistrationOrDeviceTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeARegistrationOrDeviceToken request with HTTP info returned
     * @return ApiResponse&lt;RemoveARegistrationOrDeviceTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RemoveARegistrationOrDeviceTokenResponse> executeWithHttpInfo() throws ApiException {
      return removeARegistrationOrDeviceTokenWithHttpInfo(userId, tokenType, token, apiToken);
    }
  }

  /**
   * Remove a registration or device token - When unregistering a specific token
   * ## Remove a registration or device token  Removes a user&#39;s specific registration or device token or all tokens. You can pass &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; for FCM registration token, HMS device token, or APNs device token, respectively, in the &#x60;token_type&#x60; parameter for the push notification service you are using.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/remove-a-registration-or-device-token#1-remove-a-registration-or-device-token
   * @param userId (Required)  (required)
   * @param tokenType (Required)  (required)
   * @param token (Required)  (required)
   * @return removeARegistrationOrDeviceTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveARegistrationOrDeviceTokenRequest removeARegistrationOrDeviceToken(String userId, String tokenType, String token) throws ApiException {
    return new APIremoveARegistrationOrDeviceTokenRequest(userId, tokenType, token);
  }

private ApiResponse<List<MarkChannelMessagesAsReadRequest>> removeARegistrationOrDeviceTokenFromAnOwnerWithHttpInfo(String tokenType, String token, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling removeARegistrationOrDeviceTokenFromAnOwner");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling removeARegistrationOrDeviceTokenFromAnOwner");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MarkChannelMessagesAsReadRequest>> localVarReturnType = new GenericType<List<MarkChannelMessagesAsReadRequest>>() {};

    return apiClient.invokeAPI("UserApi.removeARegistrationOrDeviceTokenFromAnOwner", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIremoveARegistrationOrDeviceTokenFromAnOwnerRequest {
    private String tokenType;
    private String token;
    private String apiToken;

    private APIremoveARegistrationOrDeviceTokenFromAnOwnerRequest(String tokenType, String token) {
      this.tokenType = tokenType;
      this.token = token;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveARegistrationOrDeviceTokenFromAnOwnerRequest
     */
    public APIremoveARegistrationOrDeviceTokenFromAnOwnerRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removeARegistrationOrDeviceTokenFromAnOwner request
     * @return List&lt;MarkChannelMessagesAsReadRequest&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<MarkChannelMessagesAsReadRequest> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeARegistrationOrDeviceTokenFromAnOwner request with HTTP info returned
     * @return ApiResponse&lt;List&lt;MarkChannelMessagesAsReadRequest&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<MarkChannelMessagesAsReadRequest>> executeWithHttpInfo() throws ApiException {
      return removeARegistrationOrDeviceTokenFromAnOwnerWithHttpInfo(tokenType, token, apiToken);
    }
  }

  /**
   * Remove a registration or device token from an owner
   * ## Remove a registration or device token from an owner  Removes a registration or device token from a user who is the owner of the token. You can pass &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; for FCM registration token, HMS device token, or APNs device token, respectively, in the &#x60;token_type&#x60; parameter for the push notification service you are using.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/remove-a-registration-or-device-token-from-an-owner#1-remove-a-registration-or-device-token-from-an-owner
   * @param tokenType (Required)  (required)
   * @param token (Required)  (required)
   * @return removeARegistrationOrDeviceTokenFromAnOwnerRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveARegistrationOrDeviceTokenFromAnOwnerRequest removeARegistrationOrDeviceTokenFromAnOwner(String tokenType, String token) throws ApiException {
    return new APIremoveARegistrationOrDeviceTokenFromAnOwnerRequest(tokenType, token);
  }

private ApiResponse<RemoveAllRegistrationOrDeviceTokenResponse> removeAllRegistrationOrDeviceTokenWithHttpInfo(String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeAllRegistrationOrDeviceToken");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RemoveAllRegistrationOrDeviceTokenResponse> localVarReturnType = new GenericType<RemoveAllRegistrationOrDeviceTokenResponse>() {};

    return apiClient.invokeAPI("UserApi.removeAllRegistrationOrDeviceToken", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIremoveAllRegistrationOrDeviceTokenRequest {
    private String userId;
    private String apiToken;

    private APIremoveAllRegistrationOrDeviceTokenRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveAllRegistrationOrDeviceTokenRequest
     */
    public APIremoveAllRegistrationOrDeviceTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removeAllRegistrationOrDeviceToken request
     * @return RemoveAllRegistrationOrDeviceTokenResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RemoveAllRegistrationOrDeviceTokenResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeAllRegistrationOrDeviceToken request with HTTP info returned
     * @return ApiResponse&lt;RemoveAllRegistrationOrDeviceTokenResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RemoveAllRegistrationOrDeviceTokenResponse> executeWithHttpInfo() throws ApiException {
      return removeAllRegistrationOrDeviceTokenWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * Remove a registration or device token - When unregistering all device tokens
   * ## Remove a registration or device token  Removes a user&#39;s specific registration or device token or all tokens. You can pass &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; for FCM registration token, HMS device token, or APNs device token, respectively, in the &#x60;token_type&#x60; parameter for the push notification service you are using.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-device-tokens/remove-a-registration-or-device-token#1-remove-a-registration-or-device-token
   * @param userId (Required)  (required)
   * @return removeAllRegistrationOrDeviceTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveAllRegistrationOrDeviceTokenRequest removeAllRegistrationOrDeviceToken(String userId) throws ApiException {
    return new APIremoveAllRegistrationOrDeviceTokenRequest(userId);
  }

private ApiResponse<Object> resetPushPreferencesWithHttpInfo(String userId, String apiToken) throws ApiException {
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

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
     * Execute resetPushPreferences request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return resetPushPreferencesWithHttpInfo(userId, apiToken);
    }
  }

  /**
   * Reset push preferences
   * ## Reset push preferences  You can reset a user&#39;s notifications preferences. The values are reset to the default as the following.  - The values for the &#x60;do_not_disturb&#x60; and &#x60;snooze_enabled&#x60; properties are set to &#x60;false&#x60;.      - The values of the parameters associated with the time frame are all set to &#x60;0&#x60;.      - The value for the &#x60;timezone&#x60; property is set to &#x60;UTC&#x60;.      - The value for the &#x60;push_sound&#x60; property is set to &#x60;default&#x60;.       &gt; **Note**: Push notifications are only available for group channels.      [https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/reset-push-notification-preferences#1-reset-push-notification-preferences](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/reset-push-notification-preferences#1-reset-push-notification-preferences)
   * @param userId (Required)  (required)
   * @return resetPushPreferencesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIresetPushPreferencesRequest resetPushPreferences(String userId) throws ApiException {
    return new APIresetPushPreferencesRequest(userId);
  }

private ApiResponse<SendbirdUser> updateAUserWithHttpInfo(String userId, String apiToken, UpdateAUserRequest updateAUserRequest) throws ApiException {
    Object localVarPostBody = updateAUserRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateAUser");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendbirdUser> localVarReturnType = new GenericType<SendbirdUser>() {};

    return apiClient.invokeAPI("UserApi.updateAUser", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateAUserRequest {
    private String userId;
    private String apiToken;
    private UpdateAUserRequest updateAUserRequest;

    private APIupdateAUserRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateAUserRequest
     */
    public APIupdateAUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateAUserRequest
     * @param updateAUserRequest  (optional)
     * @return APIupdateAUserRequest
     */
    public APIupdateAUserRequest updateAUserRequest(UpdateAUserRequest updateAUserRequest) {
      this.updateAUserRequest = updateAUserRequest;
      return this;
    }

    /**
     * Execute updateAUser request
     * @return SendbirdUser
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdUser execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAUser request with HTTP info returned
     * @return ApiResponse&lt;SendbirdUser&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdUser> executeWithHttpInfo() throws ApiException {
      return updateAUserWithHttpInfo(userId, apiToken, updateAUserRequest);
    }
  }

  /**
   * Update a user
   * ## Update a user  You can update information about a user using this API. In addition to changing a user&#39;s nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.  You can also deactivate or reactivate a user using this API request. If the &#x60;leave_all_when_deactivated&#x60; is set to &#x60;true&#x60;, a user leaves all joined group channels and becomes deactivated.  &gt; **Note**: Issuing session tokens through the &#x60;/users/{user_id}&#x60; endpoint is now deprecated and it&amp;apos;s replaced with [&amp;lt;code&amp;gt;/users/{user_id}/token&amp;lt;/code&amp;gt;](https://sendbird.com/docs/chat/platform-api/v3/user/managing-session-tokens/issue-a-session-token) endpoint for greater efficiency. For those who are currently using the old endpoint, you can start issuing tokens using the new endpoint.      [https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/update-a-user#1-update-a-user](https://sendbird.com/docs/chat/platform-api/v3/user/managing-users/update-a-user#1-update-a-user)
   * @param userId (Required)  (required)
   * @return updateAUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAUserRequest updateAUser(String userId) throws ApiException {
    return new APIupdateAUserRequest(userId);
  }

private ApiResponse<UpdateChannelInvitationPreferenceResponse> updateChannelInvitationPreferenceWithHttpInfo(String userId, String apiToken, UpdateChannelInvitationPreferenceRequest updateChannelInvitationPreferenceRequest) throws ApiException {
    Object localVarPostBody = updateChannelInvitationPreferenceRequest;
    
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private UpdateChannelInvitationPreferenceRequest updateChannelInvitationPreferenceRequest;

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
     * Set updateChannelInvitationPreferenceRequest
     * @param updateChannelInvitationPreferenceRequest  (optional)
     * @return APIupdateChannelInvitationPreferenceRequest
     */
    public APIupdateChannelInvitationPreferenceRequest updateChannelInvitationPreferenceRequest(UpdateChannelInvitationPreferenceRequest updateChannelInvitationPreferenceRequest) {
      this.updateChannelInvitationPreferenceRequest = updateChannelInvitationPreferenceRequest;
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
      return updateChannelInvitationPreferenceWithHttpInfo(userId, apiToken, updateChannelInvitationPreferenceRequest);
    }
  }

  /**
   * Update channel invitation preference
   * ## Update channel invitation preference  This action updates a user&#39;s [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) invitation preference. Updating the [application&#39;s default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/update-default-invitation-preference) won&#39;t override existing users&#39; individual channel invitation preferences. The changed preference only affects the users created after the update.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-channel-invitation-preference#1-update-channel-invitation-preference
   * @param userId (Required)  (required)
   * @return updateChannelInvitationPreferenceRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateChannelInvitationPreferenceRequest updateChannelInvitationPreference(String userId) throws ApiException {
    return new APIupdateChannelInvitationPreferenceRequest(userId);
  }

private ApiResponse<UpdateCountPreferenceOfChannelByUrlResponse> updateCountPreferenceOfAChannelWithHttpInfo(String userId, String channelUrl, String apiToken, UpdateCountPreferenceOfAChannelRequest updateCountPreferenceOfAChannelRequest) throws ApiException {
    Object localVarPostBody = updateCountPreferenceOfAChannelRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateCountPreferenceOfAChannel");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateCountPreferenceOfAChannel");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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

    return apiClient.invokeAPI("UserApi.updateCountPreferenceOfAChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateCountPreferenceOfAChannelRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;
    private UpdateCountPreferenceOfAChannelRequest updateCountPreferenceOfAChannelRequest;

    private APIupdateCountPreferenceOfAChannelRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateCountPreferenceOfAChannelRequest
     */
    public APIupdateCountPreferenceOfAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateCountPreferenceOfAChannelRequest
     * @param updateCountPreferenceOfAChannelRequest  (optional)
     * @return APIupdateCountPreferenceOfAChannelRequest
     */
    public APIupdateCountPreferenceOfAChannelRequest updateCountPreferenceOfAChannelRequest(UpdateCountPreferenceOfAChannelRequest updateCountPreferenceOfAChannelRequest) {
      this.updateCountPreferenceOfAChannelRequest = updateCountPreferenceOfAChannelRequest;
      return this;
    }

    /**
     * Execute updateCountPreferenceOfAChannel request
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
     * Execute updateCountPreferenceOfAChannel request with HTTP info returned
     * @return ApiResponse&lt;UpdateCountPreferenceOfChannelByUrlResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateCountPreferenceOfChannelByUrlResponse> executeWithHttpInfo() throws ApiException {
      return updateCountPreferenceOfAChannelWithHttpInfo(userId, channelUrl, apiToken, updateCountPreferenceOfAChannelRequest);
    }
  }

  /**
   * Update count preference of a channel
   * ## Update count preference of a channel  This action updates a user&#39;s count preference of a specific group channel. The count preference allows a user to either update the number of unread messages or the number of unread mentioned messages, or both in a specific group channel.  If you want to retrieve the total number count of a specific group channel, go to the [get count preference of a channel](https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-count-preference-of-a-channel) page.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/update-count-preference-of-a-channel#1-update-count-preference-of-a-channel
   * @param userId (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return updateCountPreferenceOfAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateCountPreferenceOfAChannelRequest updateCountPreferenceOfAChannel(String userId, String channelUrl) throws ApiException {
    return new APIupdateCountPreferenceOfAChannelRequest(userId, channelUrl);
  }

private ApiResponse<UpdatePushPreferencesResponse> updatePushPreferencesWithHttpInfo(String userId, String apiToken, UpdatePushPreferencesRequest updatePushPreferencesRequest) throws ApiException {
    Object localVarPostBody = updatePushPreferencesRequest;
    
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private UpdatePushPreferencesRequest updatePushPreferencesRequest;

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
     * Set updatePushPreferencesRequest
     * @param updatePushPreferencesRequest  (optional)
     * @return APIupdatePushPreferencesRequest
     */
    public APIupdatePushPreferencesRequest updatePushPreferencesRequest(UpdatePushPreferencesRequest updatePushPreferencesRequest) {
      this.updatePushPreferencesRequest = updatePushPreferencesRequest;
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
      return updatePushPreferencesWithHttpInfo(userId, apiToken, updatePushPreferencesRequest);
    }
  }

  /**
   * Update push preferences
   * ## Update push preferences  You can update a user&#39;s notifications preferences. A push notification is a message that is immediately delivered to a user&#39;s device when the device is either idle or running the client app in the background.  &gt; **Note**: Push notifications are only available for group channels.      [https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences#1-update-push-notification-preferences](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences#1-update-push-notification-preferences)
   * @param userId (Required)  (required)
   * @return updatePushPreferencesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdatePushPreferencesRequest updatePushPreferences(String userId) throws ApiException {
    return new APIupdatePushPreferencesRequest(userId);
  }

private ApiResponse<UpdatePushPreferencesForAChannelResponse> updatePushPreferencesForAChannelWithHttpInfo(String userId, String channelUrl, String apiToken, UpdatePushPreferencesForAChannelRequest updatePushPreferencesForAChannelRequest) throws ApiException {
    Object localVarPostBody = updatePushPreferencesForAChannelRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updatePushPreferencesForAChannel");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updatePushPreferencesForAChannel");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UpdatePushPreferencesForAChannelResponse> localVarReturnType = new GenericType<UpdatePushPreferencesForAChannelResponse>() {};

    return apiClient.invokeAPI("UserApi.updatePushPreferencesForAChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdatePushPreferencesForAChannelRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;
    private UpdatePushPreferencesForAChannelRequest updatePushPreferencesForAChannelRequest;

    private APIupdatePushPreferencesForAChannelRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdatePushPreferencesForAChannelRequest
     */
    public APIupdatePushPreferencesForAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updatePushPreferencesForAChannelRequest
     * @param updatePushPreferencesForAChannelRequest  (optional)
     * @return APIupdatePushPreferencesForAChannelRequest
     */
    public APIupdatePushPreferencesForAChannelRequest updatePushPreferencesForAChannelRequest(UpdatePushPreferencesForAChannelRequest updatePushPreferencesForAChannelRequest) {
      this.updatePushPreferencesForAChannelRequest = updatePushPreferencesForAChannelRequest;
      return this;
    }

    /**
     * Execute updatePushPreferencesForAChannel request
     * @return UpdatePushPreferencesForAChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdatePushPreferencesForAChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updatePushPreferencesForAChannel request with HTTP info returned
     * @return ApiResponse&lt;UpdatePushPreferencesForAChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdatePushPreferencesForAChannelResponse> executeWithHttpInfo() throws ApiException {
      return updatePushPreferencesForAChannelWithHttpInfo(userId, channelUrl, apiToken, updatePushPreferencesForAChannelRequest);
    }
  }

  /**
   * Update push preferences for a channel
   * ## Update push preferences for a channel  You can update a user&#39;s notifications preferences for a specific channel. A push notification is a message that is immediately delivered to a user&#39;s device when the device is either idle or running the client app in the background.  &gt; **Note**: Push notifications are only available for group channels.      [https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences-for-a-channel#1-update-push-notification-preferences-for-a-channel](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/update-push-notification-preferences-for-a-channel#1-update-push-notification-preferences-for-a-channel)
   * @param userId (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return updatePushPreferencesForAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdatePushPreferencesForAChannelRequest updatePushPreferencesForAChannel(String userId, String channelUrl) throws ApiException {
    return new APIupdatePushPreferencesForAChannelRequest(userId, channelUrl);
  }

private ApiResponse<SendbirdUser> viewAUserWithHttpInfo(String userId, Boolean includeUnreadCount, String customTypes, String superMode, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewAUser");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendbirdUser> localVarReturnType = new GenericType<SendbirdUser>() {};

    return apiClient.invokeAPI("UserApi.viewAUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewAUserRequest {
    private String userId;
    private Boolean includeUnreadCount;
    private String customTypes;
    private String superMode;
    private String apiToken;

    private APIviewAUserRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set includeUnreadCount
     * @param includeUnreadCount  (optional)
     * @return APIviewAUserRequest
     */
    public APIviewAUserRequest includeUnreadCount(Boolean includeUnreadCount) {
      this.includeUnreadCount = includeUnreadCount;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIviewAUserRequest
     */
    public APIviewAUserRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set superMode
     * @param superMode Restricts the search scope to retrieve only Supergroup or non-Supergroup channels. Acceptable values are &#x60;all&#x60;, &#x60;super&#x60;, and &#x60;nonsuper&#x60;. This parameter should be specified in conjunction with &#x60;include_unread_count&#x60; above. (Default: &#x60;all&#x60;) (optional)
     * @return APIviewAUserRequest
     */
    public APIviewAUserRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewAUserRequest
     */
    public APIviewAUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewAUser request
     * @return SendbirdUser
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdUser execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewAUser request with HTTP info returned
     * @return ApiResponse&lt;SendbirdUser&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdUser> executeWithHttpInfo() throws ApiException {
      return viewAUserWithHttpInfo(userId, includeUnreadCount, customTypes, superMode, apiToken);
    }
  }

  /**
   * View a user
   * ## View a user  You can retrieve information about a user using this API.  https://sendbird.com/docs/chat/platform-api/v3/user/listing-users/get-a-user#1-get-a-user  &#x60;user_id&#x60;   Type: string   Description: Specifies the unique ID of the user to retrieve.
   * @param userId (Required)  (required)
   * @return viewAUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewAUserRequest viewAUser(String userId) throws ApiException {
    return new APIviewAUserRequest(userId);
  }

private ApiResponse<ViewCountPreferenceOfAChannelResponse> viewCountPreferenceOfAChannelWithHttpInfo(String userId, String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewCountPreferenceOfAChannel");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewCountPreferenceOfAChannel");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewCountPreferenceOfAChannelResponse> localVarReturnType = new GenericType<ViewCountPreferenceOfAChannelResponse>() {};

    return apiClient.invokeAPI("UserApi.viewCountPreferenceOfAChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewCountPreferenceOfAChannelRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;

    private APIviewCountPreferenceOfAChannelRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewCountPreferenceOfAChannelRequest
     */
    public APIviewCountPreferenceOfAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewCountPreferenceOfAChannel request
     * @return ViewCountPreferenceOfAChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewCountPreferenceOfAChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewCountPreferenceOfAChannel request with HTTP info returned
     * @return ApiResponse&lt;ViewCountPreferenceOfAChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewCountPreferenceOfAChannelResponse> executeWithHttpInfo() throws ApiException {
      return viewCountPreferenceOfAChannelWithHttpInfo(userId, channelUrl, apiToken);
    }
  }

  /**
   * View count preference of a channel
   * ## View count preference of a channel  This action retrieves a user&#39;s count preference of a specific group channel. The count preference allows a user to either retrieve the number of unread messages or unread mentioned messages, or both in a specific group channel.  If you want to update the total number count of a specific group channel, visit the [update count preference of a channel](https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/update-count-preference-of-a-channel).  https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-count-preference-of-a-channel#1-get-count-preference-of-a-channel
   * @param userId (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return viewCountPreferenceOfAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewCountPreferenceOfAChannelRequest viewCountPreferenceOfAChannel(String userId, String channelUrl) throws ApiException {
    return new APIviewCountPreferenceOfAChannelRequest(userId, channelUrl);
  }

private ApiResponse<ViewNumberOfChannelsWithUnreadMessagesResponse> viewNumberOfChannelsWithUnreadMessagesWithHttpInfo(String userId, String customTypes, String superMode, String apiToken) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "super_mode", superMode));

    if (apiToken != null)
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private String customTypes;
    private String superMode;
    private String apiToken;

    private APIviewNumberOfChannelsWithUnreadMessagesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIviewNumberOfChannelsWithUnreadMessagesRequest
     */
    public APIviewNumberOfChannelsWithUnreadMessagesRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set superMode
     * @param superMode Restricts the search scope to either Supergroup channels or non-Supergroup channels or both. Acceptable values are all, super, and nonsuper. (Default: all) (optional)
     * @return APIviewNumberOfChannelsWithUnreadMessagesRequest
     */
    public APIviewNumberOfChannelsWithUnreadMessagesRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
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
      return viewNumberOfChannelsWithUnreadMessagesWithHttpInfo(userId, customTypes, superMode, apiToken);
    }
  }

  /**
   * View number of channels with unread messages
   * ## View number of channels with unread messages  This action retrieves the total number of group channels in which a user has unread messages. You can use various query parameters to determine the search scope of group channels.  https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-number-of-channels-with-unread-messages#1-get-number-of-channels-with-unread-messages
   * @param userId (Required)  (required)
   * @return viewNumberOfChannelsWithUnreadMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfChannelsWithUnreadMessagesRequest viewNumberOfChannelsWithUnreadMessages(String userId) throws ApiException {
    return new APIviewNumberOfChannelsWithUnreadMessagesRequest(userId);
  }

private ApiResponse<ViewNumberOfUnreadMessagesResponse> viewNumberOfUnreadMessagesWithHttpInfo(String userId, String customTypes, String superMode, String apiToken) throws ApiException {
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private String customTypes;
    private String superMode;
    private String apiToken;

    private APIviewNumberOfUnreadMessagesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set customTypes
     * @param customTypes Specifies a comma-separated string of one or more custom types to filter group channels. URL encoding each type is recommended. If not specified, all channels are returned, regardless of their custom type. (optional)
     * @return APIviewNumberOfUnreadMessagesRequest
     */
    public APIviewNumberOfUnreadMessagesRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set superMode
     * @param superMode Restricts the search scope to either Supergroup channels or non-Supergroup channels or both. Acceptable values are &#x60;all&#x60;, &#x60;super&#x60;, and &#x60;nonsuper&#x60;. (Default: &#x60;all&#x60;) (optional)
     * @return APIviewNumberOfUnreadMessagesRequest
     */
    public APIviewNumberOfUnreadMessagesRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
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
      return viewNumberOfUnreadMessagesWithHttpInfo(userId, customTypes, superMode, apiToken);
    }
  }

  /**
   * View number of unread messages
   * ## View number of unread messages  This action retrieves a user&#39;s total number of unread messages in group channels.  &gt; **Note**: The unread count feature is only available for group channels.      [https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-number-of-unread-messages#1-get-number-of-unread-messages](https://sendbird.com/docs/chat/platform-api/v3/user/managing-unread-count/get-number-of-unread-messages#1-get-number-of-unread-messages)  &#x60;user_id&#x60;   Type: string   Description: Specifies the unique ID of a user.
   * @param userId (Required)  (required)
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
   * ## View push preferences  You can retrieves a user&#39;s notifications preferences. A push notification is a message that is immediately delivered to a user&#39;s device when the device is either idle or running the client app in the background.  &gt; **Note**: Push notifications are only available for group channels.      [https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences#1-get-push-notification-preferences](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences#1-get-push-notification-preferences)
   * @param userId (Required)  (required)
   * @return viewPushPreferencesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewPushPreferencesRequest viewPushPreferences(String userId) throws ApiException {
    return new APIviewPushPreferencesRequest(userId);
  }

private ApiResponse<ViewPushPreferencesForAChannelResponse> viewPushPreferencesForAChannelWithHttpInfo(String userId, String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewPushPreferencesForAChannel");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewPushPreferencesForAChannel");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewPushPreferencesForAChannelResponse> localVarReturnType = new GenericType<ViewPushPreferencesForAChannelResponse>() {};

    return apiClient.invokeAPI("UserApi.viewPushPreferencesForAChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewPushPreferencesForAChannelRequest {
    private String userId;
    private String channelUrl;
    private String apiToken;

    private APIviewPushPreferencesForAChannelRequest(String userId, String channelUrl) {
      this.userId = userId;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewPushPreferencesForAChannelRequest
     */
    public APIviewPushPreferencesForAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewPushPreferencesForAChannel request
     * @return ViewPushPreferencesForAChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewPushPreferencesForAChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewPushPreferencesForAChannel request with HTTP info returned
     * @return ApiResponse&lt;ViewPushPreferencesForAChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewPushPreferencesForAChannelResponse> executeWithHttpInfo() throws ApiException {
      return viewPushPreferencesForAChannelWithHttpInfo(userId, channelUrl, apiToken);
    }
  }

  /**
   * View push preferences for a channel
   * ## View push preferences for a channel  You can retrieve a user&#39;s notifications preferences for a specific channel. A push notification is a message that is immediately delivered to a user&#39;s device when the device is either idle or running the client app in the background. These notifications preferences can be configured.  &gt; **Note**: Push notifications are only available for group channels.      [https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences-for-a-channel#1-get-push-notification-preferences-for-a-channel](https://sendbird.com/docs/chat/platform-api/v3/user/configuring-notification-preferences/get-push-notification-preferences-for-a-channel#1-get-push-notification-preferences-for-a-channel)
   * @param userId (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return viewPushPreferencesForAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewPushPreferencesForAChannelRequest viewPushPreferencesForAChannel(String userId, String channelUrl) throws ApiException {
    return new APIviewPushPreferencesForAChannelRequest(userId, channelUrl);
  }

private ApiResponse<List<MarkChannelMessagesAsReadRequest>> viewWhoOwnsARegistrationOrDeviceTokenWithHttpInfo(String tokenType, String token, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tokenType' is set
    if (tokenType == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenType' when calling viewWhoOwnsARegistrationOrDeviceToken");
    }
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling viewWhoOwnsARegistrationOrDeviceToken");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MarkChannelMessagesAsReadRequest>> localVarReturnType = new GenericType<List<MarkChannelMessagesAsReadRequest>>() {};

    return apiClient.invokeAPI("UserApi.viewWhoOwnsARegistrationOrDeviceToken", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewWhoOwnsARegistrationOrDeviceTokenRequest {
    private String tokenType;
    private String token;
    private String apiToken;

    private APIviewWhoOwnsARegistrationOrDeviceTokenRequest(String tokenType, String token) {
      this.tokenType = tokenType;
      this.token = token;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewWhoOwnsARegistrationOrDeviceTokenRequest
     */
    public APIviewWhoOwnsARegistrationOrDeviceTokenRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewWhoOwnsARegistrationOrDeviceToken request
     * @return List&lt;MarkChannelMessagesAsReadRequest&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<MarkChannelMessagesAsReadRequest> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewWhoOwnsARegistrationOrDeviceToken request with HTTP info returned
     * @return ApiResponse&lt;List&lt;MarkChannelMessagesAsReadRequest&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<List<MarkChannelMessagesAsReadRequest>> executeWithHttpInfo() throws ApiException {
      return viewWhoOwnsARegistrationOrDeviceTokenWithHttpInfo(tokenType, token, apiToken);
    }
  }

  /**
   * View who owns a registration or device token
   * ## View who owns a registration or device token  Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token ----------------------------
   * @param tokenType (Required)  (required)
   * @param token (Required)  (required)
   * @return viewWhoOwnsARegistrationOrDeviceTokenRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewWhoOwnsARegistrationOrDeviceTokenRequest viewWhoOwnsARegistrationOrDeviceToken(String tokenType, String token) throws ApiException {
    return new APIviewWhoOwnsARegistrationOrDeviceTokenRequest(tokenType, token);
  }
}
