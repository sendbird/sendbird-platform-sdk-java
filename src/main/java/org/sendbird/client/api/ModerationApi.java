package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.BlockAUserRequest;
import org.openapitools.client.model.BlockAUserResponse;
import org.openapitools.client.model.FreezeAGroupChannelRequest;
import org.openapitools.client.model.FreezeAnOpenChannelRequest;
import org.openapitools.client.model.ListBlockedUsersResponse;
import org.openapitools.client.model.SendbirdGroupChannelDetail;
import org.openapitools.client.model.SendbirdOpenChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-07T12:17:09.099818+09:00[Asia/Seoul]")
public class ModerationApi {
  private ApiClient apiClient;

  public ModerationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ModerationApi(ApiClient apiClient) {
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


private ApiResponse<BlockAUserResponse> blockAUserWithHttpInfo(String userId, String apiToken, BlockAUserRequest blockAUserRequest) throws ApiException {
    Object localVarPostBody = blockAUserRequest;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling blockAUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/block"
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

    GenericType<BlockAUserResponse> localVarReturnType = new GenericType<BlockAUserResponse>() {};

    return apiClient.invokeAPI("ModerationApi.blockAUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIblockAUserRequest {
    private String userId;
    private String apiToken;
    private BlockAUserRequest blockAUserRequest;

    private APIblockAUserRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIblockAUserRequest
     */
    public APIblockAUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set blockAUserRequest
     * @param blockAUserRequest  (optional)
     * @return APIblockAUserRequest
     */
    public APIblockAUserRequest blockAUserRequest(BlockAUserRequest blockAUserRequest) {
      this.blockAUserRequest = blockAUserRequest;
      return this;
    }

    /**
     * Execute blockAUser request
     * @return BlockAUserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public BlockAUserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute blockAUser request with HTTP info returned
     * @return ApiResponse&lt;BlockAUserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<BlockAUserResponse> executeWithHttpInfo() throws ApiException {
      return blockAUserWithHttpInfo(userId, apiToken, blockAUserRequest);
    }
  }

  /**
   * Block a user
   * ## Block a user  A user can block another user if the user doesn&#39;t wish to receive any messages or notifications from the blocked user in a 1-to-1 group channel. In a 1-to-N group channel, the user can still receive messages from the blocked user, but this depends on the UI settings of the chat view. In any case, notifications from the blocked user won&#39;t be delivered to the 1-to-N group channel. You can choose whether or not the user can view [which users are blocked](https://sendbird.com/docs/chat/platform-api/v3/moderation/listing-blocked-and-blocking-users/list-blocked-and-blocking-users) in the channel UI.  Sendbird application provides two blocking options: include or exclude blocked users when sending invitations, and turn on or off notifications from blocked users. [Explicit and classic block modes](https://sendbird.com/docs/chat/platform-api/v3/deprecated#2-explicit-and-classic-block-modes) have been deprecated and are only supported for customers who started using them before they were deprecated.  - **Include or exclude blocked users when sending invitations**: Determines whether or not to automatically filter out blocked users when a user invites a group of users to a new group channel. By default, blocked users are included when sending invitations. The value of this option can be changed by Sendbird if your Sendbird application isn&#39;t integrated with the client app. If you want to change the value, [contact our sales team](https://get.sendbird.com/talk-to-sales.html).      - **Turn on or off notifications from blocked users**: Determines whether or not to receive message notifications from the blocked user in a specific 1-to-N group channel where they are both members. By default, a user doesn&#39;t receive notifications from blocked users. The value of this option can be set individually per channel. If you want to use this option, [contact our sales team](https://get.sendbird.com/talk-to-sales.html).  &gt; **Note**: To learn more about other available moderation tools, see [Moderation Overview](https://sendbird.com/docs/chat/platform-api/v3/moderation/moderation-overview#2-actions).  The following tables explain what happens to a user&#39;s chat experience when the user blocks another user in a 1-to-1 or 1-to-N group channel. In the case of a 1-to-1 group channel, the block mode is only maintained with the original members. If other than the original members are added, the rules for 1-to-N group channel begin to apply.  [https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/block-users#1-block-users](https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/block-users#1-block-users)
   * @param userId (Required)  (required)
   * @return blockAUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIblockAUserRequest blockAUser(String userId) throws ApiException {
    return new APIblockAUserRequest(userId);
  }

private ApiResponse<SendbirdGroupChannelDetail> freezeAGroupChannelWithHttpInfo(String channelUrl, String apiToken, FreezeAGroupChannelRequest freezeAGroupChannelRequest) throws ApiException {
    Object localVarPostBody = freezeAGroupChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling freezeAGroupChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/freeze"
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

    GenericType<SendbirdGroupChannelDetail> localVarReturnType = new GenericType<SendbirdGroupChannelDetail>() {};

    return apiClient.invokeAPI("ModerationApi.freezeAGroupChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIfreezeAGroupChannelRequest {
    private String channelUrl;
    private String apiToken;
    private FreezeAGroupChannelRequest freezeAGroupChannelRequest;

    private APIfreezeAGroupChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIfreezeAGroupChannelRequest
     */
    public APIfreezeAGroupChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set freezeAGroupChannelRequest
     * @param freezeAGroupChannelRequest  (optional)
     * @return APIfreezeAGroupChannelRequest
     */
    public APIfreezeAGroupChannelRequest freezeAGroupChannelRequest(FreezeAGroupChannelRequest freezeAGroupChannelRequest) {
      this.freezeAGroupChannelRequest = freezeAGroupChannelRequest;
      return this;
    }

    /**
     * Execute freezeAGroupChannel request
     * @return SendbirdGroupChannelDetail
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdGroupChannelDetail execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute freezeAGroupChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdGroupChannelDetail&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdGroupChannelDetail> executeWithHttpInfo() throws ApiException {
      return freezeAGroupChannelWithHttpInfo(channelUrl, apiToken, freezeAGroupChannelRequest);
    }
  }

  /**
   * Freeze a group channel
   * ## Freeze a group channel  Freezes or unfreezes a group channel.  &gt; **Note**: To learn more about other available moderation tools, see [Moderation Overview](https://sendbird.com/docs/chat/platform-api/v3/moderation/moderation-overview#2-actions).      [https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-a-group-channel#1-freeze-a-group-channel](https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-a-group-channel#1-freeze-a-group-channel)
   * @param channelUrl (Required)  (required)
   * @return freezeAGroupChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIfreezeAGroupChannelRequest freezeAGroupChannel(String channelUrl) throws ApiException {
    return new APIfreezeAGroupChannelRequest(channelUrl);
  }

private ApiResponse<SendbirdOpenChannel> freezeAnOpenChannelWithHttpInfo(String channelUrl, String apiToken, FreezeAnOpenChannelRequest freezeAnOpenChannelRequest) throws ApiException {
    Object localVarPostBody = freezeAnOpenChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling freezeAnOpenChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/freeze"
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

    GenericType<SendbirdOpenChannel> localVarReturnType = new GenericType<SendbirdOpenChannel>() {};

    return apiClient.invokeAPI("ModerationApi.freezeAnOpenChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIfreezeAnOpenChannelRequest {
    private String channelUrl;
    private String apiToken;
    private FreezeAnOpenChannelRequest freezeAnOpenChannelRequest;

    private APIfreezeAnOpenChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIfreezeAnOpenChannelRequest
     */
    public APIfreezeAnOpenChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set freezeAnOpenChannelRequest
     * @param freezeAnOpenChannelRequest  (optional)
     * @return APIfreezeAnOpenChannelRequest
     */
    public APIfreezeAnOpenChannelRequest freezeAnOpenChannelRequest(FreezeAnOpenChannelRequest freezeAnOpenChannelRequest) {
      this.freezeAnOpenChannelRequest = freezeAnOpenChannelRequest;
      return this;
    }

    /**
     * Execute freezeAnOpenChannel request
     * @return SendbirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute freezeAnOpenChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return freezeAnOpenChannelWithHttpInfo(channelUrl, apiToken, freezeAnOpenChannelRequest);
    }
  }

  /**
   * Freeze an open channel
   * ## Freeze an open channel  Freezes or unfreezes an open channel.  &gt; **Note**: To learn more about other available moderation tools, see [Moderation Overview](https://sendbird.com/docs/chat/platform-api/v3/moderation/moderation-overview#2-actions).      [https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-an-open-channel#1-freeze-an-open-channel](https://sendbird.com/docs/chat/platform-api/v3/moderation/freezing-a-channel/freeze-an-open-channel#1-freeze-an-open-channel)
   * @param channelUrl (Required)  (required)
   * @return freezeAnOpenChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIfreezeAnOpenChannelRequest freezeAnOpenChannel(String channelUrl) throws ApiException {
    return new APIfreezeAnOpenChannelRequest(channelUrl);
  }

private ApiResponse<ListBlockedUsersResponse> listBlockedUsersWithHttpInfo(String userId, String _list, String token, Integer limit, String userIds, String metadatakey, String metadatavaluesIn, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listBlockedUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/block"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "list", _list));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_ids", userIds));
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

    GenericType<ListBlockedUsersResponse> localVarReturnType = new GenericType<ListBlockedUsersResponse>() {};

    return apiClient.invokeAPI("ModerationApi.listBlockedUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistBlockedUsersRequest {
    private String userId;
    private String _list;
    private String token;
    private Integer limit;
    private String userIds;
    private String metadatakey;
    private String metadatavaluesIn;
    private String apiToken;

    private APIlistBlockedUsersRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set _list
     * @param _list Specifies whether to retrieve a list of users who are blocked by the specified user or a list of users who are blocking the specified user. Acceptable values are blocked_by_me and blocking_me. The &#x60;me&#x60; in the values refers to the user specified in the parameter. (Default: blocked_by_me) (optional)
     * @return APIlistBlockedUsersRequest
     */
    public APIlistBlockedUsersRequest _list(String _list) {
      this._list = _list;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistBlockedUsersRequest
     */
    public APIlistBlockedUsersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistBlockedUsersRequest
     */
    public APIlistBlockedUsersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set userIds
     * @param userIds Specifies the user IDs of the blocked or blocking users to search for. The value should be a comma-separated string that consists of multiple URL encoded user IDs. (optional)
     * @return APIlistBlockedUsersRequest
     */
    public APIlistBlockedUsersRequest userIds(String userIds) {
      this.userIds = userIds;
      return this;
    }

    /**
     * Set metadatakey
     * @param metadatakey  (optional)
     * @return APIlistBlockedUsersRequest
     */
    public APIlistBlockedUsersRequest metadatakey(String metadatakey) {
      this.metadatakey = metadatakey;
      return this;
    }

    /**
     * Set metadatavaluesIn
     * @param metadatavaluesIn  (optional)
     * @return APIlistBlockedUsersRequest
     */
    public APIlistBlockedUsersRequest metadatavaluesIn(String metadatavaluesIn) {
      this.metadatavaluesIn = metadatavaluesIn;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistBlockedUsersRequest
     */
    public APIlistBlockedUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listBlockedUsers request
     * @return ListBlockedUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListBlockedUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listBlockedUsers request with HTTP info returned
     * @return ApiResponse&lt;ListBlockedUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListBlockedUsersResponse> executeWithHttpInfo() throws ApiException {
      return listBlockedUsersWithHttpInfo(userId, _list, token, limit, userIds, metadatakey, metadatavaluesIn, apiToken);
    }
  }

  /**
   * List blocked users
   * ## List blocked by and blocking users  This action retrieves a list of users who are either blocked by a specific user or a list of users who are blocking a specific user.  [https://sendbird.com/docs/chat/platform-api/v3/moderation/listing-blocked-and-blocking-users/list-blocked-and-blocking-users#1-list-blocked-by-and-blocking-users](https://sendbird.com/docs/chat/platform-api/v3/moderation/listing-blocked-and-blocking-users/list-blocked-and-blocking-users#1-list-blocked-by-and-blocking-users)  &#x60;user_id&#x60;   Type: string   Description: Specifies the unique ID of the target user.
   * @param userId (Required)  (required)
   * @return listBlockedUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistBlockedUsersRequest listBlockedUsers(String userId) throws ApiException {
    return new APIlistBlockedUsersRequest(userId);
  }

private ApiResponse<Object> unblockAUserWithHttpInfo(String userId, String targetId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling unblockAUser");
    }
    
    // verify the required parameter 'targetId' is set
    if (targetId == null) {
      throw new ApiException(400, "Missing the required parameter 'targetId' when calling unblockAUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/block/{target_id}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "target_id" + "\\}", apiClient.escapeString(targetId.toString()));

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

    return apiClient.invokeAPI("ModerationApi.unblockAUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIunblockAUserRequest {
    private String userId;
    private String targetId;
    private String apiToken;

    private APIunblockAUserRequest(String userId, String targetId) {
      this.userId = userId;
      this.targetId = targetId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIunblockAUserRequest
     */
    public APIunblockAUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute unblockAUser request
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
     * Execute unblockAUser request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return unblockAUserWithHttpInfo(userId, targetId, apiToken);
    }
  }

  /**
   * Unblock a user
   * ## Unblock a user  Unblocks the user.  https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/unblock-a-user#1-unblock-a-user
   * @param userId (Required)  (required)
   * @param targetId (Required)  (required)
   * @return unblockAUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIunblockAUserRequest unblockAUser(String userId, String targetId) throws ApiException {
    return new APIunblockAUserRequest(userId, targetId);
  }
}
