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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
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

  /**
   * Ban from channels with custom channel types
   * ## Ban from channels with custom channel types  Bans a user from channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-ban-from-channels-with-custom-channel-types ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param banFromChannelsWithCustomChannelTypesData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object banFromChannelsWithCustomChannelTypes(String apiToken, String userId, BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData) throws ApiException {
    return banFromChannelsWithCustomChannelTypesWithHttpInfo(apiToken, userId, banFromChannelsWithCustomChannelTypesData).getData();
  }

  /**
   * Ban from channels with custom channel types
   * ## Ban from channels with custom channel types  Bans a user from channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-ban-from-channels-with-custom-channel-types ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param banFromChannelsWithCustomChannelTypesData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> banFromChannelsWithCustomChannelTypesWithHttpInfo(String apiToken, String userId, BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData) throws ApiException {
    Object localVarPostBody = banFromChannelsWithCustomChannelTypesData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling banFromChannelsWithCustomChannelTypes");
    }
    
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
  /**
   * Block a user
   * ## Block a user  Allows a user to block another user. A user doesn&#39;t receive messages from someone they have blocked anymore. Also, blocking someone doesn&#39;t alert them that they have been blocked. Blocked users still can send messages as normal in the channel: however, they can&#39;t receive any messages from the users who have blocked them.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-block-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param blockUserData  (optional)
   * @return BlockUserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public BlockUserResponse blockUser(String apiToken, String userId, BlockUserData blockUserData) throws ApiException {
    return blockUserWithHttpInfo(apiToken, userId, blockUserData).getData();
  }

  /**
   * Block a user
   * ## Block a user  Allows a user to block another user. A user doesn&#39;t receive messages from someone they have blocked anymore. Also, blocking someone doesn&#39;t alert them that they have been blocked. Blocked users still can send messages as normal in the channel: however, they can&#39;t receive any messages from the users who have blocked them.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-block-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param blockUserData  (optional)
   * @return ApiResponse&lt;BlockUserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BlockUserResponse> blockUserWithHttpInfo(String apiToken, String userId, BlockUserData blockUserData) throws ApiException {
    Object localVarPostBody = blockUserData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling blockUser");
    }
    
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
  /**
   * Ban a user
   * ## Ban a user  Bans a user from a group channel. A banned user is immediately expelled from a channel and allowed to join the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-ban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcBanUserData  (optional)
   * @return GcBanUserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcBanUserResponse gcBanUser(String apiToken, String channelUrl, GcBanUserData gcBanUserData) throws ApiException {
    return gcBanUserWithHttpInfo(apiToken, channelUrl, gcBanUserData).getData();
  }

  /**
   * Ban a user
   * ## Ban a user  Bans a user from a group channel. A banned user is immediately expelled from a channel and allowed to join the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-ban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcBanUserData  (optional)
   * @return ApiResponse&lt;GcBanUserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcBanUserResponse> gcBanUserWithHttpInfo(String apiToken, String channelUrl, GcBanUserData gcBanUserData) throws ApiException {
    Object localVarPostBody = gcBanUserData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcBanUser");
    }
    
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
  /**
   * Freeze a channel
   * ## Freeze a channel  Freezes or unfreezes a group channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-freeze-a-channel ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcFreezeChannelData  (optional)
   * @return SendBirdGroupChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdGroupChannel gcFreezeChannel(String apiToken, String channelUrl, GcFreezeChannelData gcFreezeChannelData) throws ApiException {
    return gcFreezeChannelWithHttpInfo(apiToken, channelUrl, gcFreezeChannelData).getData();
  }

  /**
   * Freeze a channel
   * ## Freeze a channel  Freezes or unfreezes a group channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-freeze-a-channel ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcFreezeChannelData  (optional)
   * @return ApiResponse&lt;SendBirdGroupChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdGroupChannel> gcFreezeChannelWithHttpInfo(String apiToken, String channelUrl, GcFreezeChannelData gcFreezeChannelData) throws ApiException {
    Object localVarPostBody = gcFreezeChannelData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcFreezeChannel");
    }
    
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
  /**
   * List banned users
   * ## List banned users  Retrieves a list of the banned users from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return GcListBannedUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcListBannedUsersResponse gcListBannedUsers(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    return gcListBannedUsersWithHttpInfo(apiToken, channelUrl, token, limit).getData();
  }

  /**
   * List banned users
   * ## List banned users  Retrieves a list of the banned users from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;GcListBannedUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcListBannedUsersResponse> gcListBannedUsersWithHttpInfo(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcListBannedUsers");
    }
    
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
  /**
   * List muted users
   * ## List muted users  Retrieves a list of the muted users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return GcListMutedUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcListMutedUsersResponse gcListMutedUsers(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    return gcListMutedUsersWithHttpInfo(apiToken, channelUrl, token, limit).getData();
  }

  /**
   * List muted users
   * ## List muted users  Retrieves a list of the muted users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;GcListMutedUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcListMutedUsersResponse> gcListMutedUsersWithHttpInfo(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcListMutedUsers");
    }
    
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
  /**
   * Mute a user
   * ## Mute a user  Mutes a user in a group channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-mute-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcMuteUserData  (optional)
   * @return SendBirdGroupChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdGroupChannel gcMuteUser(String apiToken, String channelUrl, GcMuteUserData gcMuteUserData) throws ApiException {
    return gcMuteUserWithHttpInfo(apiToken, channelUrl, gcMuteUserData).getData();
  }

  /**
   * Mute a user
   * ## Mute a user  Mutes a user in a group channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-mute-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcMuteUserData  (optional)
   * @return ApiResponse&lt;SendBirdGroupChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdGroupChannel> gcMuteUserWithHttpInfo(String apiToken, String channelUrl, GcMuteUserData gcMuteUserData) throws ApiException {
    Object localVarPostBody = gcMuteUserData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcMuteUser");
    }
    
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
  /**
   * Unban a user
   * ## Unban a user  Unbans a user from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return OcDeleteChannelByUrl200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcDeleteChannelByUrl200Response gcUnbanUserById(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    return gcUnbanUserByIdWithHttpInfo(apiToken, channelUrl, bannedUserId).getData();
  }

  /**
   * Unban a user
   * ## Unban a user  Unbans a user from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcDeleteChannelByUrl200Response> gcUnbanUserByIdWithHttpInfo(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcUnbanUserById");
    }
    
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
  /**
   * Unmute a user
   * ## Unmute a user  Unmutes a user within a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unmute-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return OcDeleteChannelByUrl200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcDeleteChannelByUrl200Response gcUnmuteUserById(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    return gcUnmuteUserByIdWithHttpInfo(apiToken, channelUrl, mutedUserId).getData();
  }

  /**
   * Unmute a user
   * ## Unmute a user  Unmutes a user within a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unmute-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcDeleteChannelByUrl200Response> gcUnmuteUserByIdWithHttpInfo(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcUnmuteUserById");
    }
    
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
  /**
   * Update a ban
   * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of the ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @param gcUpdateBanByIdData  (optional)
   * @return GcUpdateBanByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcUpdateBanByIdResponse gcUpdateBanById(String apiToken, String channelUrl, String bannedUserId, GcUpdateBanByIdData gcUpdateBanByIdData) throws ApiException {
    return gcUpdateBanByIdWithHttpInfo(apiToken, channelUrl, bannedUserId, gcUpdateBanByIdData).getData();
  }

  /**
   * Update a ban
   * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of the ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @param gcUpdateBanByIdData  (optional)
   * @return ApiResponse&lt;GcUpdateBanByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcUpdateBanByIdResponse> gcUpdateBanByIdWithHttpInfo(String apiToken, String channelUrl, String bannedUserId, GcUpdateBanByIdData gcUpdateBanByIdData) throws ApiException {
    Object localVarPostBody = gcUpdateBanByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcUpdateBanById");
    }
    
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
  /**
   * View a ban
   * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return GcViewBanByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcViewBanByIdResponse gcViewBanById(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    return gcViewBanByIdWithHttpInfo(apiToken, channelUrl, bannedUserId).getData();
  }

  /**
   * View a ban
   * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return ApiResponse&lt;GcViewBanByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcViewBanByIdResponse> gcViewBanByIdWithHttpInfo(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcViewBanById");
    }
    
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
  /**
   * View a mute
   * ## View a mute  Checks if a user is muted in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-mute ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return GcViewMuteByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcViewMuteByIdResponse gcViewMuteById(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    return gcViewMuteByIdWithHttpInfo(apiToken, channelUrl, mutedUserId).getData();
  }

  /**
   * View a mute
   * ## View a mute  Checks if a user is muted in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-mute ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return ApiResponse&lt;GcViewMuteByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcViewMuteByIdResponse> gcViewMuteByIdWithHttpInfo(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcViewMuteById");
    }
    
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
  /**
   * List banned channels
   * ## List banned channels  Retrieves a list of open and group channels with additional information where a user is banned.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-banned-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ListBannedChannelsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListBannedChannelsResponse listBannedChannels(String apiToken, String userId, String token, Integer limit) throws ApiException {
    return listBannedChannelsWithHttpInfo(apiToken, userId, token, limit).getData();
  }

  /**
   * List banned channels
   * ## List banned channels  Retrieves a list of open and group channels with additional information where a user is banned.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-banned-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;ListBannedChannelsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListBannedChannelsResponse> listBannedChannelsWithHttpInfo(String apiToken, String userId, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listBannedChannels");
    }
    
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
  /**
   * List blocked users
   * ## List blocked users  Retrieves a list of other users that a user has blocked.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-blocked-users ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param userIds  (optional)
   * @param metadatakey  (optional)
   * @param metadatavaluesIn  (optional)
   * @return ListBlockedUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListBlockedUsersResponse listBlockedUsers(String apiToken, String userId, String token, Integer limit, String userIds, String metadatakey, String metadatavaluesIn) throws ApiException {
    return listBlockedUsersWithHttpInfo(apiToken, userId, token, limit, userIds, metadatakey, metadatavaluesIn).getData();
  }

  /**
   * List blocked users
   * ## List blocked users  Retrieves a list of other users that a user has blocked.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-blocked-users ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param userIds  (optional)
   * @param metadatakey  (optional)
   * @param metadatavaluesIn  (optional)
   * @return ApiResponse&lt;ListBlockedUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListBlockedUsersResponse> listBlockedUsersWithHttpInfo(String apiToken, String userId, String token, Integer limit, String userIds, String metadatakey, String metadatavaluesIn) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listBlockedUsers");
    }
    
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
  /**
   * List muted channels
   * ## List muted channels  Retrieves a list of open and group channels with additional information where a user is muted.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-muted-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ListMutedChannelsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListMutedChannelsResponse listMutedChannels(String apiToken, String userId, String token, Integer limit) throws ApiException {
    return listMutedChannelsWithHttpInfo(apiToken, userId, token, limit).getData();
  }

  /**
   * List muted channels
   * ## List muted channels  Retrieves a list of open and group channels with additional information where a user is muted.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-muted-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
   * @param apiToken  (required)
   * @param userId  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;ListMutedChannelsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListMutedChannelsResponse> listMutedChannelsWithHttpInfo(String apiToken, String userId, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listMutedChannels");
    }
    
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
  /**
   * Mute in channels with custom channel types
   * ## Mute in channels with custom channel types  Mutes a user in channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mute-in-channels-with-custom-channel-types ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param muteInChannelsWithCustomChannelTypesData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object muteInChannelsWithCustomChannelTypes(String apiToken, String userId, MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData) throws ApiException {
    return muteInChannelsWithCustomChannelTypesWithHttpInfo(apiToken, userId, muteInChannelsWithCustomChannelTypesData).getData();
  }

  /**
   * Mute in channels with custom channel types
   * ## Mute in channels with custom channel types  Mutes a user in channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mute-in-channels-with-custom-channel-types ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param muteInChannelsWithCustomChannelTypesData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> muteInChannelsWithCustomChannelTypesWithHttpInfo(String apiToken, String userId, MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData) throws ApiException {
    Object localVarPostBody = muteInChannelsWithCustomChannelTypesData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling muteInChannelsWithCustomChannelTypes");
    }
    
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
  /**
   * Ban a user
   * ## Ban a user  Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param ocBanUserData  (optional)
   * @return OcBanUserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcBanUserResponse ocBanUser(String apiToken, String channelUrl, OcBanUserData ocBanUserData) throws ApiException {
    return ocBanUserWithHttpInfo(apiToken, channelUrl, ocBanUserData).getData();
  }

  /**
   * Ban a user
   * ## Ban a user  Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param ocBanUserData  (optional)
   * @return ApiResponse&lt;OcBanUserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcBanUserResponse> ocBanUserWithHttpInfo(String apiToken, String channelUrl, OcBanUserData ocBanUserData) throws ApiException {
    Object localVarPostBody = ocBanUserData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocBanUser");
    }
    
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
  /**
   * Freeze a channel
   * ## Freeze a channel  Freezes or unfreezes an open channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param ocFreezeChannelData  (optional)
   * @return SendBirdOpenChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdOpenChannel ocFreezeChannel(String apiToken, String channelUrl, OcFreezeChannelData ocFreezeChannelData) throws ApiException {
    return ocFreezeChannelWithHttpInfo(apiToken, channelUrl, ocFreezeChannelData).getData();
  }

  /**
   * Freeze a channel
   * ## Freeze a channel  Freezes or unfreezes an open channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param ocFreezeChannelData  (optional)
   * @return ApiResponse&lt;SendBirdOpenChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdOpenChannel> ocFreezeChannelWithHttpInfo(String apiToken, String channelUrl, OcFreezeChannelData ocFreezeChannelData) throws ApiException {
    Object localVarPostBody = ocFreezeChannelData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocFreezeChannel");
    }
    
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
  /**
   * List banned users
   * ## List banned users  Retrieves a list of banned users from a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return OcListBannedUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcListBannedUsersResponse ocListBannedUsers(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    return ocListBannedUsersWithHttpInfo(apiToken, channelUrl, token, limit).getData();
  }

  /**
   * List banned users
   * ## List banned users  Retrieves a list of banned users from a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;OcListBannedUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcListBannedUsersResponse> ocListBannedUsersWithHttpInfo(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocListBannedUsers");
    }
    
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
  /**
   * List muted users
   * ## List muted users  Retrieves a list of muted users in the channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return OcListMutedUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcListMutedUsersResponse ocListMutedUsers(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    return ocListMutedUsersWithHttpInfo(apiToken, channelUrl, token, limit).getData();
  }

  /**
   * List muted users
   * ## List muted users  Retrieves a list of muted users in the channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;OcListMutedUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcListMutedUsersResponse> ocListMutedUsersWithHttpInfo(String apiToken, String channelUrl, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocListMutedUsers");
    }
    
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
  /**
   * Mute a user
   * ## Mute a user  Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param ocMuteUserData  (optional)
   * @return SendBirdOpenChannel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdOpenChannel ocMuteUser(String apiToken, String channelUrl, OcMuteUserData ocMuteUserData) throws ApiException {
    return ocMuteUserWithHttpInfo(apiToken, channelUrl, ocMuteUserData).getData();
  }

  /**
   * Mute a user
   * ## Mute a user  Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param ocMuteUserData  (optional)
   * @return ApiResponse&lt;SendBirdOpenChannel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdOpenChannel> ocMuteUserWithHttpInfo(String apiToken, String channelUrl, OcMuteUserData ocMuteUserData) throws ApiException {
    Object localVarPostBody = ocMuteUserData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocMuteUser");
    }
    
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
  /**
   * Unban a user
   * ## Unban a user  Unbans a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return OcDeleteChannelByUrl200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcDeleteChannelByUrl200Response ocUnbanUserById(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    return ocUnbanUserByIdWithHttpInfo(apiToken, channelUrl, bannedUserId).getData();
  }

  /**
   * Unban a user
   * ## Unban a user  Unbans a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcDeleteChannelByUrl200Response> ocUnbanUserByIdWithHttpInfo(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocUnbanUserById");
    }
    
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
  /**
   * Unmute a user
   * ## Unmute a user  Unmutes a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return OcDeleteChannelByUrl200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcDeleteChannelByUrl200Response ocUnmuteUserById(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    return ocUnmuteUserByIdWithHttpInfo(apiToken, channelUrl, mutedUserId).getData();
  }

  /**
   * Unmute a user
   * ## Unmute a user  Unmutes a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcDeleteChannelByUrl200Response> ocUnmuteUserByIdWithHttpInfo(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocUnmuteUserById");
    }
    
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
  /**
   * Update a ban
   * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @param ocUpdateBanByIdData  (optional)
   * @return OcUpdateBanByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcUpdateBanByIdResponse ocUpdateBanById(String apiToken, String channelUrl, String bannedUserId, OcUpdateBanByIdData ocUpdateBanByIdData) throws ApiException {
    return ocUpdateBanByIdWithHttpInfo(apiToken, channelUrl, bannedUserId, ocUpdateBanByIdData).getData();
  }

  /**
   * Update a ban
   * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @param ocUpdateBanByIdData  (optional)
   * @return ApiResponse&lt;OcUpdateBanByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcUpdateBanByIdResponse> ocUpdateBanByIdWithHttpInfo(String apiToken, String channelUrl, String bannedUserId, OcUpdateBanByIdData ocUpdateBanByIdData) throws ApiException {
    Object localVarPostBody = ocUpdateBanByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocUpdateBanById");
    }
    
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
  /**
   * View a ban
   * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return OcViewBanByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcViewBanByIdResponse ocViewBanById(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    return ocViewBanByIdWithHttpInfo(apiToken, channelUrl, bannedUserId).getData();
  }

  /**
   * View a ban
   * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param bannedUserId  (required)
   * @return ApiResponse&lt;OcViewBanByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcViewBanByIdResponse> ocViewBanByIdWithHttpInfo(String apiToken, String channelUrl, String bannedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocViewBanById");
    }
    
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
  /**
   * View a mute
   * ## View a mute  Checks if a user is muted in an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return OcViewMuteByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public OcViewMuteByIdResponse ocViewMuteById(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    return ocViewMuteByIdWithHttpInfo(apiToken, channelUrl, mutedUserId).getData();
  }

  /**
   * View a mute
   * ## View a mute  Checks if a user is muted in an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param mutedUserId  (required)
   * @return ApiResponse&lt;OcViewMuteByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OcViewMuteByIdResponse> ocViewMuteByIdWithHttpInfo(String apiToken, String channelUrl, String mutedUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling ocViewMuteById");
    }
    
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
  /**
   * Unblock a user
   * ## Unblock a user  Unblocks the user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-unblock-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param targetId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object unblockUserById(String apiToken, String userId, String targetId) throws ApiException {
    return unblockUserByIdWithHttpInfo(apiToken, userId, targetId).getData();
  }

  /**
   * Unblock a user
   * ## Unblock a user  Unblocks the user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-unblock-a-user ----------------------------
   * @param apiToken  (required)
   * @param userId  (required)
   * @param targetId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> unblockUserByIdWithHttpInfo(String apiToken, String userId, String targetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling unblockUserById");
    }
    
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
}
