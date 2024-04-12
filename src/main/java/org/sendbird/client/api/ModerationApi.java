package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.BanFromChannelsWithCustomChannelTypesData;
import org.openapitools.client.model.BlockUserData;
import org.openapitools.client.model.BlockUserResponse;
import org.openapitools.client.model.GcBanUserData;
import org.openapitools.client.model.GcBanUserResponse;
import org.openapitools.client.model.GcFreezeChannelData;
import org.openapitools.client.model.GcListBannedUsersResponse;
import org.openapitools.client.model.GcListMutedUsersResponse;
import org.openapitools.client.model.GcMuteUserData;
import org.openapitools.client.model.GcUpdateBanByIdData;
import org.openapitools.client.model.GcUpdateBanByIdResponse;
import org.openapitools.client.model.GcViewBanByIdResponse;
import org.openapitools.client.model.GcViewMuteByIdResponse;
import org.openapitools.client.model.ListBannedChannelsResponse;
import org.openapitools.client.model.ListBlockedUsersResponse;
import org.openapitools.client.model.ListMutedChannelsResponse;
import org.openapitools.client.model.MuteInChannelsWithCustomChannelTypesData;
import org.openapitools.client.model.OcBanUserData;
import org.openapitools.client.model.OcBanUserResponse;
import org.openapitools.client.model.OcDeleteChannelByUrl200Response;
import org.openapitools.client.model.OcFreezeChannelData;
import org.openapitools.client.model.OcListBannedUsersResponse;
import org.openapitools.client.model.OcListMutedUsersResponse;
import org.openapitools.client.model.OcMuteUserData;
import org.openapitools.client.model.OcUpdateBanByIdData;
import org.openapitools.client.model.OcUpdateBanByIdResponse;
import org.openapitools.client.model.OcViewBanByIdResponse;
import org.openapitools.client.model.OcViewMuteByIdResponse;
import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdOpenChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
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


private ApiResponse<Object> banFromChannelsWithCustomChannelTypesWithHttpInfo(String userId, String apiToken, BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData) throws ApiException {
    Object localVarPostBody = banFromChannelsWithCustomChannelTypesData;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling banFromChannelsWithCustomChannelTypes");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/banned_channel_custom_types"
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

    return apiClient.invokeAPI("ModerationApi.banFromChannelsWithCustomChannelTypes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIbanFromChannelsWithCustomChannelTypesRequest {
    private String userId;
    private String apiToken;
    private BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData;

    private APIbanFromChannelsWithCustomChannelTypesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIbanFromChannelsWithCustomChannelTypesRequest
     */
    public APIbanFromChannelsWithCustomChannelTypesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set banFromChannelsWithCustomChannelTypesData
     * @param banFromChannelsWithCustomChannelTypesData  (optional)
     * @return APIbanFromChannelsWithCustomChannelTypesRequest
     */
    public APIbanFromChannelsWithCustomChannelTypesRequest banFromChannelsWithCustomChannelTypesData(BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData) {
      this.banFromChannelsWithCustomChannelTypesData = banFromChannelsWithCustomChannelTypesData;
      return this;
    }

    /**
     * Execute banFromChannelsWithCustomChannelTypes request
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
     * Execute banFromChannelsWithCustomChannelTypes request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return banFromChannelsWithCustomChannelTypesWithHttpInfo(userId, apiToken, banFromChannelsWithCustomChannelTypesData);
    }
  }

  /**
   * Ban from channels with custom channel types
   * ## Ban from channels with custom channel types  Bans a user from channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-ban-from-channels-with-custom-channel-types ----------------------------
   * @param userId  (required)
   * @return banFromChannelsWithCustomChannelTypesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIbanFromChannelsWithCustomChannelTypesRequest banFromChannelsWithCustomChannelTypes(String userId) throws ApiException {
    return new APIbanFromChannelsWithCustomChannelTypesRequest(userId);
  }

private ApiResponse<BlockUserResponse> blockUserWithHttpInfo(String userId, String apiToken, BlockUserData blockUserData) throws ApiException {
    Object localVarPostBody = blockUserData;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling blockUser");
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

    GenericType<BlockUserResponse> localVarReturnType = new GenericType<BlockUserResponse>() {};

    return apiClient.invokeAPI("ModerationApi.blockUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIblockUserRequest {
    private String userId;
    private String apiToken;
    private BlockUserData blockUserData;

    private APIblockUserRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIblockUserRequest
     */
    public APIblockUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set blockUserData
     * @param blockUserData  (optional)
     * @return APIblockUserRequest
     */
    public APIblockUserRequest blockUserData(BlockUserData blockUserData) {
      this.blockUserData = blockUserData;
      return this;
    }

    /**
     * Execute blockUser request
     * @return BlockUserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public BlockUserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute blockUser request with HTTP info returned
     * @return ApiResponse&lt;BlockUserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<BlockUserResponse> executeWithHttpInfo() throws ApiException {
      return blockUserWithHttpInfo(userId, apiToken, blockUserData);
    }
  }

  /**
   * Block a user
   * ## Block a user  Allows a user to block another user. A user doesn&#39;t receive messages from someone they have blocked anymore. Also, blocking someone doesn&#39;t alert them that they have been blocked. Blocked users still can send messages as normal in the channel: however, they can&#39;t receive any messages from the users who have blocked them.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-block-a-user ----------------------------
   * @param userId  (required)
   * @return blockUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIblockUserRequest blockUser(String userId) throws ApiException {
    return new APIblockUserRequest(userId);
  }

private ApiResponse<GcBanUserResponse> gcBanUserWithHttpInfo(String channelUrl, String apiToken, GcBanUserData gcBanUserData) throws ApiException {
    Object localVarPostBody = gcBanUserData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcBanUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/ban"
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

    GenericType<GcBanUserResponse> localVarReturnType = new GenericType<GcBanUserResponse>() {};

    return apiClient.invokeAPI("ModerationApi.gcBanUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcBanUserRequest {
    private String channelUrl;
    private String apiToken;
    private GcBanUserData gcBanUserData;

    private APIgcBanUserRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcBanUserRequest
     */
    public APIgcBanUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcBanUserData
     * @param gcBanUserData  (optional)
     * @return APIgcBanUserRequest
     */
    public APIgcBanUserRequest gcBanUserData(GcBanUserData gcBanUserData) {
      this.gcBanUserData = gcBanUserData;
      return this;
    }

    /**
     * Execute gcBanUser request
     * @return GcBanUserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcBanUserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcBanUser request with HTTP info returned
     * @return ApiResponse&lt;GcBanUserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcBanUserResponse> executeWithHttpInfo() throws ApiException {
      return gcBanUserWithHttpInfo(channelUrl, apiToken, gcBanUserData);
    }
  }

  /**
   * Ban a user
   * ## Ban a user  Bans a user from a group channel. A banned user is immediately expelled from a channel and allowed to join the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-ban-a-user ----------------------------
   * @param channelUrl  (required)
   * @return gcBanUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcBanUserRequest gcBanUser(String channelUrl) throws ApiException {
    return new APIgcBanUserRequest(channelUrl);
  }

private ApiResponse<SendBirdGroupChannel> gcFreezeChannelWithHttpInfo(String channelUrl, String apiToken, GcFreezeChannelData gcFreezeChannelData) throws ApiException {
    Object localVarPostBody = gcFreezeChannelData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcFreezeChannel");
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

    GenericType<SendBirdGroupChannel> localVarReturnType = new GenericType<SendBirdGroupChannel>() {};

    return apiClient.invokeAPI("ModerationApi.gcFreezeChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcFreezeChannelRequest {
    private String channelUrl;
    private String apiToken;
    private GcFreezeChannelData gcFreezeChannelData;

    private APIgcFreezeChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcFreezeChannelRequest
     */
    public APIgcFreezeChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcFreezeChannelData
     * @param gcFreezeChannelData  (optional)
     * @return APIgcFreezeChannelRequest
     */
    public APIgcFreezeChannelRequest gcFreezeChannelData(GcFreezeChannelData gcFreezeChannelData) {
      this.gcFreezeChannelData = gcFreezeChannelData;
      return this;
    }

    /**
     * Execute gcFreezeChannel request
     * @return SendBirdGroupChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdGroupChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcFreezeChannel request with HTTP info returned
     * @return ApiResponse&lt;SendBirdGroupChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdGroupChannel> executeWithHttpInfo() throws ApiException {
      return gcFreezeChannelWithHttpInfo(channelUrl, apiToken, gcFreezeChannelData);
    }
  }

  /**
   * Freeze a channel
   * ## Freeze a channel  Freezes or unfreezes a group channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-freeze-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return gcFreezeChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcFreezeChannelRequest gcFreezeChannel(String channelUrl) throws ApiException {
    return new APIgcFreezeChannelRequest(channelUrl);
  }

private ApiResponse<GcListBannedUsersResponse> gcListBannedUsersWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcListBannedUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/ban"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<GcListBannedUsersResponse> localVarReturnType = new GenericType<GcListBannedUsersResponse>() {};

    return apiClient.invokeAPI("ModerationApi.gcListBannedUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcListBannedUsersRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIgcListBannedUsersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcListBannedUsersRequest
     */
    public APIgcListBannedUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIgcListBannedUsersRequest
     */
    public APIgcListBannedUsersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIgcListBannedUsersRequest
     */
    public APIgcListBannedUsersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute gcListBannedUsers request
     * @return GcListBannedUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcListBannedUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcListBannedUsers request with HTTP info returned
     * @return ApiResponse&lt;GcListBannedUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcListBannedUsersResponse> executeWithHttpInfo() throws ApiException {
      return gcListBannedUsersWithHttpInfo(channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List banned users
   * ## List banned users  Retrieves a list of the banned users from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
   * @param channelUrl  (required)
   * @return gcListBannedUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcListBannedUsersRequest gcListBannedUsers(String channelUrl) throws ApiException {
    return new APIgcListBannedUsersRequest(channelUrl);
  }

private ApiResponse<GcListMutedUsersResponse> gcListMutedUsersWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcListMutedUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/mute"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<GcListMutedUsersResponse> localVarReturnType = new GenericType<GcListMutedUsersResponse>() {};

    return apiClient.invokeAPI("ModerationApi.gcListMutedUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcListMutedUsersRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIgcListMutedUsersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcListMutedUsersRequest
     */
    public APIgcListMutedUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIgcListMutedUsersRequest
     */
    public APIgcListMutedUsersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIgcListMutedUsersRequest
     */
    public APIgcListMutedUsersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute gcListMutedUsers request
     * @return GcListMutedUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcListMutedUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcListMutedUsers request with HTTP info returned
     * @return ApiResponse&lt;GcListMutedUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcListMutedUsersResponse> executeWithHttpInfo() throws ApiException {
      return gcListMutedUsersWithHttpInfo(channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List muted users
   * ## List muted users  Retrieves a list of the muted users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
   * @param channelUrl  (required)
   * @return gcListMutedUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcListMutedUsersRequest gcListMutedUsers(String channelUrl) throws ApiException {
    return new APIgcListMutedUsersRequest(channelUrl);
  }

private ApiResponse<SendBirdGroupChannel> gcMuteUserWithHttpInfo(String channelUrl, String apiToken, GcMuteUserData gcMuteUserData) throws ApiException {
    Object localVarPostBody = gcMuteUserData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcMuteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/mute"
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

    GenericType<SendBirdGroupChannel> localVarReturnType = new GenericType<SendBirdGroupChannel>() {};

    return apiClient.invokeAPI("ModerationApi.gcMuteUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcMuteUserRequest {
    private String channelUrl;
    private String apiToken;
    private GcMuteUserData gcMuteUserData;

    private APIgcMuteUserRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcMuteUserRequest
     */
    public APIgcMuteUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcMuteUserData
     * @param gcMuteUserData  (optional)
     * @return APIgcMuteUserRequest
     */
    public APIgcMuteUserRequest gcMuteUserData(GcMuteUserData gcMuteUserData) {
      this.gcMuteUserData = gcMuteUserData;
      return this;
    }

    /**
     * Execute gcMuteUser request
     * @return SendBirdGroupChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdGroupChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcMuteUser request with HTTP info returned
     * @return ApiResponse&lt;SendBirdGroupChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdGroupChannel> executeWithHttpInfo() throws ApiException {
      return gcMuteUserWithHttpInfo(channelUrl, apiToken, gcMuteUserData);
    }
  }

  /**
   * Mute a user
   * ## Mute a user  Mutes a user in a group channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-mute-a-user ----------------------------
   * @param channelUrl  (required)
   * @return gcMuteUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcMuteUserRequest gcMuteUser(String channelUrl) throws ApiException {
    return new APIgcMuteUserRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcUnbanUserByIdWithHttpInfo(String channelUrl, String bannedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcUnbanUserById");
    }
    
    // verify the required parameter 'bannedUserId' is set
    if (bannedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'bannedUserId' when calling gcUnbanUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/ban/{banned_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "banned_user_id" + "\\}", apiClient.escapeString(bannedUserId.toString()));

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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("ModerationApi.gcUnbanUserById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcUnbanUserByIdRequest {
    private String channelUrl;
    private String bannedUserId;
    private String apiToken;

    private APIgcUnbanUserByIdRequest(String channelUrl, String bannedUserId) {
      this.channelUrl = channelUrl;
      this.bannedUserId = bannedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcUnbanUserByIdRequest
     */
    public APIgcUnbanUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute gcUnbanUserById request
     * @return OcDeleteChannelByUrl200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcDeleteChannelByUrl200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcUnbanUserById request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcUnbanUserByIdWithHttpInfo(channelUrl, bannedUserId, apiToken);
    }
  }

  /**
   * Unban a user
   * ## Unban a user  Unbans a user from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unban-a-user ----------------------------
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return gcUnbanUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcUnbanUserByIdRequest gcUnbanUserById(String channelUrl, String bannedUserId) throws ApiException {
    return new APIgcUnbanUserByIdRequest(channelUrl, bannedUserId);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcUnmuteUserByIdWithHttpInfo(String channelUrl, String mutedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcUnmuteUserById");
    }
    
    // verify the required parameter 'mutedUserId' is set
    if (mutedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'mutedUserId' when calling gcUnmuteUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/mute/{muted_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "muted_user_id" + "\\}", apiClient.escapeString(mutedUserId.toString()));

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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("ModerationApi.gcUnmuteUserById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcUnmuteUserByIdRequest {
    private String channelUrl;
    private String mutedUserId;
    private String apiToken;

    private APIgcUnmuteUserByIdRequest(String channelUrl, String mutedUserId) {
      this.channelUrl = channelUrl;
      this.mutedUserId = mutedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcUnmuteUserByIdRequest
     */
    public APIgcUnmuteUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute gcUnmuteUserById request
     * @return OcDeleteChannelByUrl200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcDeleteChannelByUrl200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcUnmuteUserById request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcUnmuteUserByIdWithHttpInfo(channelUrl, mutedUserId, apiToken);
    }
  }

  /**
   * Unmute a user
   * ## Unmute a user  Unmutes a user within a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unmute-a-user ----------------------------
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return gcUnmuteUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcUnmuteUserByIdRequest gcUnmuteUserById(String channelUrl, String mutedUserId) throws ApiException {
    return new APIgcUnmuteUserByIdRequest(channelUrl, mutedUserId);
  }

private ApiResponse<GcUpdateBanByIdResponse> gcUpdateBanByIdWithHttpInfo(String channelUrl, String bannedUserId, String apiToken, GcUpdateBanByIdData gcUpdateBanByIdData) throws ApiException {
    Object localVarPostBody = gcUpdateBanByIdData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcUpdateBanById");
    }
    
    // verify the required parameter 'bannedUserId' is set
    if (bannedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'bannedUserId' when calling gcUpdateBanById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/ban/{banned_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "banned_user_id" + "\\}", apiClient.escapeString(bannedUserId.toString()));

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

    GenericType<GcUpdateBanByIdResponse> localVarReturnType = new GenericType<GcUpdateBanByIdResponse>() {};

    return apiClient.invokeAPI("ModerationApi.gcUpdateBanById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcUpdateBanByIdRequest {
    private String channelUrl;
    private String bannedUserId;
    private String apiToken;
    private GcUpdateBanByIdData gcUpdateBanByIdData;

    private APIgcUpdateBanByIdRequest(String channelUrl, String bannedUserId) {
      this.channelUrl = channelUrl;
      this.bannedUserId = bannedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcUpdateBanByIdRequest
     */
    public APIgcUpdateBanByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcUpdateBanByIdData
     * @param gcUpdateBanByIdData  (optional)
     * @return APIgcUpdateBanByIdRequest
     */
    public APIgcUpdateBanByIdRequest gcUpdateBanByIdData(GcUpdateBanByIdData gcUpdateBanByIdData) {
      this.gcUpdateBanByIdData = gcUpdateBanByIdData;
      return this;
    }

    /**
     * Execute gcUpdateBanById request
     * @return GcUpdateBanByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcUpdateBanByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcUpdateBanById request with HTTP info returned
     * @return ApiResponse&lt;GcUpdateBanByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcUpdateBanByIdResponse> executeWithHttpInfo() throws ApiException {
      return gcUpdateBanByIdWithHttpInfo(channelUrl, bannedUserId, apiToken, gcUpdateBanByIdData);
    }
  }

  /**
   * Update a ban
   * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of the ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-ban ----------------------------
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return gcUpdateBanByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcUpdateBanByIdRequest gcUpdateBanById(String channelUrl, String bannedUserId) throws ApiException {
    return new APIgcUpdateBanByIdRequest(channelUrl, bannedUserId);
  }

private ApiResponse<GcViewBanByIdResponse> gcViewBanByIdWithHttpInfo(String channelUrl, String bannedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcViewBanById");
    }
    
    // verify the required parameter 'bannedUserId' is set
    if (bannedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'bannedUserId' when calling gcViewBanById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/ban/{banned_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "banned_user_id" + "\\}", apiClient.escapeString(bannedUserId.toString()));

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

    GenericType<GcViewBanByIdResponse> localVarReturnType = new GenericType<GcViewBanByIdResponse>() {};

    return apiClient.invokeAPI("ModerationApi.gcViewBanById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcViewBanByIdRequest {
    private String channelUrl;
    private String bannedUserId;
    private String apiToken;

    private APIgcViewBanByIdRequest(String channelUrl, String bannedUserId) {
      this.channelUrl = channelUrl;
      this.bannedUserId = bannedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcViewBanByIdRequest
     */
    public APIgcViewBanByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute gcViewBanById request
     * @return GcViewBanByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcViewBanByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcViewBanById request with HTTP info returned
     * @return ApiResponse&lt;GcViewBanByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcViewBanByIdResponse> executeWithHttpInfo() throws ApiException {
      return gcViewBanByIdWithHttpInfo(channelUrl, bannedUserId, apiToken);
    }
  }

  /**
   * View a ban
   * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-ban ----------------------------
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return gcViewBanByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcViewBanByIdRequest gcViewBanById(String channelUrl, String bannedUserId) throws ApiException {
    return new APIgcViewBanByIdRequest(channelUrl, bannedUserId);
  }

private ApiResponse<GcViewMuteByIdResponse> gcViewMuteByIdWithHttpInfo(String channelUrl, String mutedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcViewMuteById");
    }
    
    // verify the required parameter 'mutedUserId' is set
    if (mutedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'mutedUserId' when calling gcViewMuteById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/mute/{muted_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "muted_user_id" + "\\}", apiClient.escapeString(mutedUserId.toString()));

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

    GenericType<GcViewMuteByIdResponse> localVarReturnType = new GenericType<GcViewMuteByIdResponse>() {};

    return apiClient.invokeAPI("ModerationApi.gcViewMuteById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcViewMuteByIdRequest {
    private String channelUrl;
    private String mutedUserId;
    private String apiToken;

    private APIgcViewMuteByIdRequest(String channelUrl, String mutedUserId) {
      this.channelUrl = channelUrl;
      this.mutedUserId = mutedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcViewMuteByIdRequest
     */
    public APIgcViewMuteByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute gcViewMuteById request
     * @return GcViewMuteByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcViewMuteByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcViewMuteById request with HTTP info returned
     * @return ApiResponse&lt;GcViewMuteByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcViewMuteByIdResponse> executeWithHttpInfo() throws ApiException {
      return gcViewMuteByIdWithHttpInfo(channelUrl, mutedUserId, apiToken);
    }
  }

  /**
   * View a mute
   * ## View a mute  Checks if a user is muted in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-mute ----------------------------
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return gcViewMuteByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcViewMuteByIdRequest gcViewMuteById(String channelUrl, String mutedUserId) throws ApiException {
    return new APIgcViewMuteByIdRequest(channelUrl, mutedUserId);
  }

private ApiResponse<ListBannedChannelsResponse> listBannedChannelsWithHttpInfo(String userId, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listBannedChannels");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/ban"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<ListBannedChannelsResponse> localVarReturnType = new GenericType<ListBannedChannelsResponse>() {};

    return apiClient.invokeAPI("ModerationApi.listBannedChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistBannedChannelsRequest {
    private String userId;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistBannedChannelsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistBannedChannelsRequest
     */
    public APIlistBannedChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistBannedChannelsRequest
     */
    public APIlistBannedChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistBannedChannelsRequest
     */
    public APIlistBannedChannelsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listBannedChannels request
     * @return ListBannedChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListBannedChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listBannedChannels request with HTTP info returned
     * @return ApiResponse&lt;ListBannedChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListBannedChannelsResponse> executeWithHttpInfo() throws ApiException {
      return listBannedChannelsWithHttpInfo(userId, apiToken, token, limit);
    }
  }

  /**
   * List banned channels
   * ## List banned channels  Retrieves a list of open and group channels with additional information where a user is banned.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-banned-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param userId  (required)
   * @return listBannedChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistBannedChannelsRequest listBannedChannels(String userId) throws ApiException {
    return new APIlistBannedChannelsRequest(userId);
  }

private ApiResponse<ListBlockedUsersResponse> listBlockedUsersWithHttpInfo(String userId, String apiToken, String token, Integer limit, String userIds, String metadatakey, String metadatavaluesIn) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_ids", userIds));
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

    GenericType<ListBlockedUsersResponse> localVarReturnType = new GenericType<ListBlockedUsersResponse>() {};

    return apiClient.invokeAPI("ModerationApi.listBlockedUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistBlockedUsersRequest {
    private String userId;
    private String apiToken;
    private String token;
    private Integer limit;
    private String userIds;
    private String metadatakey;
    private String metadatavaluesIn;

    private APIlistBlockedUsersRequest(String userId) {
      this.userId = userId;
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
     * @param userIds  (optional)
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
      return listBlockedUsersWithHttpInfo(userId, apiToken, token, limit, userIds, metadatakey, metadatavaluesIn);
    }
  }

  /**
   * List blocked users
   * ## List blocked users  Retrieves a list of other users that a user has blocked.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-blocked-users ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param userId  (required)
   * @return listBlockedUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistBlockedUsersRequest listBlockedUsers(String userId) throws ApiException {
    return new APIlistBlockedUsersRequest(userId);
  }

private ApiResponse<ListMutedChannelsResponse> listMutedChannelsWithHttpInfo(String userId, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling listMutedChannels");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/mute"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<ListMutedChannelsResponse> localVarReturnType = new GenericType<ListMutedChannelsResponse>() {};

    return apiClient.invokeAPI("ModerationApi.listMutedChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistMutedChannelsRequest {
    private String userId;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistMutedChannelsRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistMutedChannelsRequest
     */
    public APIlistMutedChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistMutedChannelsRequest
     */
    public APIlistMutedChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistMutedChannelsRequest
     */
    public APIlistMutedChannelsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listMutedChannels request
     * @return ListMutedChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMutedChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMutedChannels request with HTTP info returned
     * @return ApiResponse&lt;ListMutedChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMutedChannelsResponse> executeWithHttpInfo() throws ApiException {
      return listMutedChannelsWithHttpInfo(userId, apiToken, token, limit);
    }
  }

  /**
   * List muted channels
   * ## List muted channels  Retrieves a list of open and group channels with additional information where a user is muted.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-muted-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param userId  (required)
   * @return listMutedChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMutedChannelsRequest listMutedChannels(String userId) throws ApiException {
    return new APIlistMutedChannelsRequest(userId);
  }

private ApiResponse<Object> muteInChannelsWithCustomChannelTypesWithHttpInfo(String userId, String apiToken, MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData) throws ApiException {
    Object localVarPostBody = muteInChannelsWithCustomChannelTypesData;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling muteInChannelsWithCustomChannelTypes");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/muted_channel_custom_types"
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

    return apiClient.invokeAPI("ModerationApi.muteInChannelsWithCustomChannelTypes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APImuteInChannelsWithCustomChannelTypesRequest {
    private String userId;
    private String apiToken;
    private MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData;

    private APImuteInChannelsWithCustomChannelTypesRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APImuteInChannelsWithCustomChannelTypesRequest
     */
    public APImuteInChannelsWithCustomChannelTypesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set muteInChannelsWithCustomChannelTypesData
     * @param muteInChannelsWithCustomChannelTypesData  (optional)
     * @return APImuteInChannelsWithCustomChannelTypesRequest
     */
    public APImuteInChannelsWithCustomChannelTypesRequest muteInChannelsWithCustomChannelTypesData(MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData) {
      this.muteInChannelsWithCustomChannelTypesData = muteInChannelsWithCustomChannelTypesData;
      return this;
    }

    /**
     * Execute muteInChannelsWithCustomChannelTypes request
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
     * Execute muteInChannelsWithCustomChannelTypes request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return muteInChannelsWithCustomChannelTypesWithHttpInfo(userId, apiToken, muteInChannelsWithCustomChannelTypesData);
    }
  }

  /**
   * Mute in channels with custom channel types
   * ## Mute in channels with custom channel types  Mutes a user in channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mute-in-channels-with-custom-channel-types ----------------------------
   * @param userId  (required)
   * @return muteInChannelsWithCustomChannelTypesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APImuteInChannelsWithCustomChannelTypesRequest muteInChannelsWithCustomChannelTypes(String userId) throws ApiException {
    return new APImuteInChannelsWithCustomChannelTypesRequest(userId);
  }

private ApiResponse<OcBanUserResponse> ocBanUserWithHttpInfo(String channelUrl, String apiToken, OcBanUserData ocBanUserData) throws ApiException {
    Object localVarPostBody = ocBanUserData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocBanUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/ban"
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

    GenericType<OcBanUserResponse> localVarReturnType = new GenericType<OcBanUserResponse>() {};

    return apiClient.invokeAPI("ModerationApi.ocBanUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocBanUserRequest {
    private String channelUrl;
    private String apiToken;
    private OcBanUserData ocBanUserData;

    private APIocBanUserRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocBanUserRequest
     */
    public APIocBanUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set ocBanUserData
     * @param ocBanUserData  (optional)
     * @return APIocBanUserRequest
     */
    public APIocBanUserRequest ocBanUserData(OcBanUserData ocBanUserData) {
      this.ocBanUserData = ocBanUserData;
      return this;
    }

    /**
     * Execute ocBanUser request
     * @return OcBanUserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcBanUserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocBanUser request with HTTP info returned
     * @return ApiResponse&lt;OcBanUserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcBanUserResponse> executeWithHttpInfo() throws ApiException {
      return ocBanUserWithHttpInfo(channelUrl, apiToken, ocBanUserData);
    }
  }

  /**
   * Ban a user
   * ## Ban a user  Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user ----------------------------
   * @param channelUrl  (required)
   * @return ocBanUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocBanUserRequest ocBanUser(String channelUrl) throws ApiException {
    return new APIocBanUserRequest(channelUrl);
  }

private ApiResponse<SendBirdOpenChannel> ocFreezeChannelWithHttpInfo(String channelUrl, String apiToken, OcFreezeChannelData ocFreezeChannelData) throws ApiException {
    Object localVarPostBody = ocFreezeChannelData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocFreezeChannel");
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

    GenericType<SendBirdOpenChannel> localVarReturnType = new GenericType<SendBirdOpenChannel>() {};

    return apiClient.invokeAPI("ModerationApi.ocFreezeChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocFreezeChannelRequest {
    private String channelUrl;
    private String apiToken;
    private OcFreezeChannelData ocFreezeChannelData;

    private APIocFreezeChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocFreezeChannelRequest
     */
    public APIocFreezeChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set ocFreezeChannelData
     * @param ocFreezeChannelData  (optional)
     * @return APIocFreezeChannelRequest
     */
    public APIocFreezeChannelRequest ocFreezeChannelData(OcFreezeChannelData ocFreezeChannelData) {
      this.ocFreezeChannelData = ocFreezeChannelData;
      return this;
    }

    /**
     * Execute ocFreezeChannel request
     * @return SendBirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocFreezeChannel request with HTTP info returned
     * @return ApiResponse&lt;SendBirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return ocFreezeChannelWithHttpInfo(channelUrl, apiToken, ocFreezeChannelData);
    }
  }

  /**
   * Freeze a channel
   * ## Freeze a channel  Freezes or unfreezes an open channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return ocFreezeChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocFreezeChannelRequest ocFreezeChannel(String channelUrl) throws ApiException {
    return new APIocFreezeChannelRequest(channelUrl);
  }

private ApiResponse<OcListBannedUsersResponse> ocListBannedUsersWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocListBannedUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/ban"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<OcListBannedUsersResponse> localVarReturnType = new GenericType<OcListBannedUsersResponse>() {};

    return apiClient.invokeAPI("ModerationApi.ocListBannedUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocListBannedUsersRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIocListBannedUsersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocListBannedUsersRequest
     */
    public APIocListBannedUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIocListBannedUsersRequest
     */
    public APIocListBannedUsersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIocListBannedUsersRequest
     */
    public APIocListBannedUsersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute ocListBannedUsers request
     * @return OcListBannedUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcListBannedUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocListBannedUsers request with HTTP info returned
     * @return ApiResponse&lt;OcListBannedUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcListBannedUsersResponse> executeWithHttpInfo() throws ApiException {
      return ocListBannedUsersWithHttpInfo(channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List banned users
   * ## List banned users  Retrieves a list of banned users from a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
   * @param channelUrl  (required)
   * @return ocListBannedUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocListBannedUsersRequest ocListBannedUsers(String channelUrl) throws ApiException {
    return new APIocListBannedUsersRequest(channelUrl);
  }

private ApiResponse<OcListMutedUsersResponse> ocListMutedUsersWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocListMutedUsers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/mute"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<OcListMutedUsersResponse> localVarReturnType = new GenericType<OcListMutedUsersResponse>() {};

    return apiClient.invokeAPI("ModerationApi.ocListMutedUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocListMutedUsersRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIocListMutedUsersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocListMutedUsersRequest
     */
    public APIocListMutedUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIocListMutedUsersRequest
     */
    public APIocListMutedUsersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIocListMutedUsersRequest
     */
    public APIocListMutedUsersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute ocListMutedUsers request
     * @return OcListMutedUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcListMutedUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocListMutedUsers request with HTTP info returned
     * @return ApiResponse&lt;OcListMutedUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcListMutedUsersResponse> executeWithHttpInfo() throws ApiException {
      return ocListMutedUsersWithHttpInfo(channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List muted users
   * ## List muted users  Retrieves a list of muted users in the channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
   * @param channelUrl  (required)
   * @return ocListMutedUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocListMutedUsersRequest ocListMutedUsers(String channelUrl) throws ApiException {
    return new APIocListMutedUsersRequest(channelUrl);
  }

private ApiResponse<SendBirdOpenChannel> ocMuteUserWithHttpInfo(String channelUrl, String apiToken, OcMuteUserData ocMuteUserData) throws ApiException {
    Object localVarPostBody = ocMuteUserData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocMuteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/mute"
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

    GenericType<SendBirdOpenChannel> localVarReturnType = new GenericType<SendBirdOpenChannel>() {};

    return apiClient.invokeAPI("ModerationApi.ocMuteUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocMuteUserRequest {
    private String channelUrl;
    private String apiToken;
    private OcMuteUserData ocMuteUserData;

    private APIocMuteUserRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocMuteUserRequest
     */
    public APIocMuteUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set ocMuteUserData
     * @param ocMuteUserData  (optional)
     * @return APIocMuteUserRequest
     */
    public APIocMuteUserRequest ocMuteUserData(OcMuteUserData ocMuteUserData) {
      this.ocMuteUserData = ocMuteUserData;
      return this;
    }

    /**
     * Execute ocMuteUser request
     * @return SendBirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocMuteUser request with HTTP info returned
     * @return ApiResponse&lt;SendBirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return ocMuteUserWithHttpInfo(channelUrl, apiToken, ocMuteUserData);
    }
  }

  /**
   * Mute a user
   * ## Mute a user  Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user
   * @param channelUrl  (required)
   * @return ocMuteUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocMuteUserRequest ocMuteUser(String channelUrl) throws ApiException {
    return new APIocMuteUserRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> ocUnbanUserByIdWithHttpInfo(String channelUrl, String bannedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocUnbanUserById");
    }
    
    // verify the required parameter 'bannedUserId' is set
    if (bannedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'bannedUserId' when calling ocUnbanUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/ban/{banned_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "banned_user_id" + "\\}", apiClient.escapeString(bannedUserId.toString()));

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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("ModerationApi.ocUnbanUserById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocUnbanUserByIdRequest {
    private String channelUrl;
    private String bannedUserId;
    private String apiToken;

    private APIocUnbanUserByIdRequest(String channelUrl, String bannedUserId) {
      this.channelUrl = channelUrl;
      this.bannedUserId = bannedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocUnbanUserByIdRequest
     */
    public APIocUnbanUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute ocUnbanUserById request
     * @return OcDeleteChannelByUrl200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcDeleteChannelByUrl200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocUnbanUserById request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return ocUnbanUserByIdWithHttpInfo(channelUrl, bannedUserId, apiToken);
    }
  }

  /**
   * Unban a user
   * ## Unban a user  Unbans a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user ----------------------------
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return ocUnbanUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocUnbanUserByIdRequest ocUnbanUserById(String channelUrl, String bannedUserId) throws ApiException {
    return new APIocUnbanUserByIdRequest(channelUrl, bannedUserId);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> ocUnmuteUserByIdWithHttpInfo(String channelUrl, String mutedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocUnmuteUserById");
    }
    
    // verify the required parameter 'mutedUserId' is set
    if (mutedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'mutedUserId' when calling ocUnmuteUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/mute/{muted_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "muted_user_id" + "\\}", apiClient.escapeString(mutedUserId.toString()));

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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("ModerationApi.ocUnmuteUserById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocUnmuteUserByIdRequest {
    private String channelUrl;
    private String mutedUserId;
    private String apiToken;

    private APIocUnmuteUserByIdRequest(String channelUrl, String mutedUserId) {
      this.channelUrl = channelUrl;
      this.mutedUserId = mutedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocUnmuteUserByIdRequest
     */
    public APIocUnmuteUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute ocUnmuteUserById request
     * @return OcDeleteChannelByUrl200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcDeleteChannelByUrl200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocUnmuteUserById request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return ocUnmuteUserByIdWithHttpInfo(channelUrl, mutedUserId, apiToken);
    }
  }

  /**
   * Unmute a user
   * ## Unmute a user  Unmutes a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user ----------------------------
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return ocUnmuteUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocUnmuteUserByIdRequest ocUnmuteUserById(String channelUrl, String mutedUserId) throws ApiException {
    return new APIocUnmuteUserByIdRequest(channelUrl, mutedUserId);
  }

private ApiResponse<OcUpdateBanByIdResponse> ocUpdateBanByIdWithHttpInfo(String channelUrl, String bannedUserId, String apiToken, OcUpdateBanByIdData ocUpdateBanByIdData) throws ApiException {
    Object localVarPostBody = ocUpdateBanByIdData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocUpdateBanById");
    }
    
    // verify the required parameter 'bannedUserId' is set
    if (bannedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'bannedUserId' when calling ocUpdateBanById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/ban/{banned_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "banned_user_id" + "\\}", apiClient.escapeString(bannedUserId.toString()));

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

    GenericType<OcUpdateBanByIdResponse> localVarReturnType = new GenericType<OcUpdateBanByIdResponse>() {};

    return apiClient.invokeAPI("ModerationApi.ocUpdateBanById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocUpdateBanByIdRequest {
    private String channelUrl;
    private String bannedUserId;
    private String apiToken;
    private OcUpdateBanByIdData ocUpdateBanByIdData;

    private APIocUpdateBanByIdRequest(String channelUrl, String bannedUserId) {
      this.channelUrl = channelUrl;
      this.bannedUserId = bannedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocUpdateBanByIdRequest
     */
    public APIocUpdateBanByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set ocUpdateBanByIdData
     * @param ocUpdateBanByIdData  (optional)
     * @return APIocUpdateBanByIdRequest
     */
    public APIocUpdateBanByIdRequest ocUpdateBanByIdData(OcUpdateBanByIdData ocUpdateBanByIdData) {
      this.ocUpdateBanByIdData = ocUpdateBanByIdData;
      return this;
    }

    /**
     * Execute ocUpdateBanById request
     * @return OcUpdateBanByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcUpdateBanByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocUpdateBanById request with HTTP info returned
     * @return ApiResponse&lt;OcUpdateBanByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcUpdateBanByIdResponse> executeWithHttpInfo() throws ApiException {
      return ocUpdateBanByIdWithHttpInfo(channelUrl, bannedUserId, apiToken, ocUpdateBanByIdData);
    }
  }

  /**
   * Update a ban
   * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban ----------------------------
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return ocUpdateBanByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocUpdateBanByIdRequest ocUpdateBanById(String channelUrl, String bannedUserId) throws ApiException {
    return new APIocUpdateBanByIdRequest(channelUrl, bannedUserId);
  }

private ApiResponse<OcViewBanByIdResponse> ocViewBanByIdWithHttpInfo(String channelUrl, String bannedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocViewBanById");
    }
    
    // verify the required parameter 'bannedUserId' is set
    if (bannedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'bannedUserId' when calling ocViewBanById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/ban/{banned_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "banned_user_id" + "\\}", apiClient.escapeString(bannedUserId.toString()));

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

    GenericType<OcViewBanByIdResponse> localVarReturnType = new GenericType<OcViewBanByIdResponse>() {};

    return apiClient.invokeAPI("ModerationApi.ocViewBanById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocViewBanByIdRequest {
    private String channelUrl;
    private String bannedUserId;
    private String apiToken;

    private APIocViewBanByIdRequest(String channelUrl, String bannedUserId) {
      this.channelUrl = channelUrl;
      this.bannedUserId = bannedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocViewBanByIdRequest
     */
    public APIocViewBanByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute ocViewBanById request
     * @return OcViewBanByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcViewBanByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocViewBanById request with HTTP info returned
     * @return ApiResponse&lt;OcViewBanByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcViewBanByIdResponse> executeWithHttpInfo() throws ApiException {
      return ocViewBanByIdWithHttpInfo(channelUrl, bannedUserId, apiToken);
    }
  }

  /**
   * View a ban
   * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban ----------------------------
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return ocViewBanByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocViewBanByIdRequest ocViewBanById(String channelUrl, String bannedUserId) throws ApiException {
    return new APIocViewBanByIdRequest(channelUrl, bannedUserId);
  }

private ApiResponse<OcViewMuteByIdResponse> ocViewMuteByIdWithHttpInfo(String channelUrl, String mutedUserId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocViewMuteById");
    }
    
    // verify the required parameter 'mutedUserId' is set
    if (mutedUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'mutedUserId' when calling ocViewMuteById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/mute/{muted_user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "muted_user_id" + "\\}", apiClient.escapeString(mutedUserId.toString()));

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

    GenericType<OcViewMuteByIdResponse> localVarReturnType = new GenericType<OcViewMuteByIdResponse>() {};

    return apiClient.invokeAPI("ModerationApi.ocViewMuteById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocViewMuteByIdRequest {
    private String channelUrl;
    private String mutedUserId;
    private String apiToken;

    private APIocViewMuteByIdRequest(String channelUrl, String mutedUserId) {
      this.channelUrl = channelUrl;
      this.mutedUserId = mutedUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocViewMuteByIdRequest
     */
    public APIocViewMuteByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute ocViewMuteById request
     * @return OcViewMuteByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcViewMuteByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocViewMuteById request with HTTP info returned
     * @return ApiResponse&lt;OcViewMuteByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcViewMuteByIdResponse> executeWithHttpInfo() throws ApiException {
      return ocViewMuteByIdWithHttpInfo(channelUrl, mutedUserId, apiToken);
    }
  }

  /**
   * View a mute
   * ## View a mute  Checks if a user is muted in an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute ----------------------------
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return ocViewMuteByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocViewMuteByIdRequest ocViewMuteById(String channelUrl, String mutedUserId) throws ApiException {
    return new APIocViewMuteByIdRequest(channelUrl, mutedUserId);
  }

private ApiResponse<Object> unblockUserByIdWithHttpInfo(String userId, String targetId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling unblockUserById");
    }
    
    // verify the required parameter 'targetId' is set
    if (targetId == null) {
      throw new ApiException(400, "Missing the required parameter 'targetId' when calling unblockUserById");
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

    return apiClient.invokeAPI("ModerationApi.unblockUserById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIunblockUserByIdRequest {
    private String userId;
    private String targetId;
    private String apiToken;

    private APIunblockUserByIdRequest(String userId, String targetId) {
      this.userId = userId;
      this.targetId = targetId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIunblockUserByIdRequest
     */
    public APIunblockUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute unblockUserById request
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
     * Execute unblockUserById request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return unblockUserByIdWithHttpInfo(userId, targetId, apiToken);
    }
  }

  /**
   * Unblock a user
   * ## Unblock a user  Unblocks the user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-unblock-a-user ----------------------------
   * @param userId  (required)
   * @param targetId  (required)
   * @return unblockUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIunblockUserByIdRequest unblockUserById(String userId, String targetId) throws ApiException {
    return new APIunblockUserByIdRequest(userId, targetId);
  }
}
