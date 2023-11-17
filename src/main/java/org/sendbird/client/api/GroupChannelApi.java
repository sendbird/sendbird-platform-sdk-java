package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.GcAcceptInvitationData;
import org.openapitools.client.model.GcCheckIfMemberByIdResponse;
import org.openapitools.client.model.GcCreateChannelData;
import org.openapitools.client.model.GcDeclineInvitationData;
import org.openapitools.client.model.GcHideOrArchiveChannelData;
import org.openapitools.client.model.GcInviteAsMembersData;
import org.openapitools.client.model.GcJoinChannelData;
import org.openapitools.client.model.GcLeaveChannelData;
import org.openapitools.client.model.GcListChannelsResponse;
import org.openapitools.client.model.GcListMembersResponse;
import org.openapitools.client.model.GcListOperatorsResponse;
import org.openapitools.client.model.GcRegisterOperatorsData;
import org.openapitools.client.model.GcRegisterOperatorsResponse;
import org.openapitools.client.model.GcResetChatHistoryData;
import org.openapitools.client.model.GcResetChatHistoryResponse;
import org.openapitools.client.model.GcUpdateChannelByUrlData;
import org.openapitools.client.model.OcDeleteChannelByUrl200Response;
import org.openapitools.client.model.SendBirdGroupChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T12:28:02.899+09:00[Asia/Seoul]")
public class GroupChannelApi {
  private ApiClient apiClient;

  public GroupChannelApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupChannelApi(ApiClient apiClient) {
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


private ApiResponse<SendBirdGroupChannel> gcAcceptInvitationWithHttpInfo(String channelUrl, String apiToken, GcAcceptInvitationData gcAcceptInvitationData) throws ApiException {
    Object localVarPostBody = gcAcceptInvitationData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcAcceptInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/accept"
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

    return apiClient.invokeAPI("GroupChannelApi.gcAcceptInvitation", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcAcceptInvitationRequest {
    private String channelUrl;
    private String apiToken;
    private GcAcceptInvitationData gcAcceptInvitationData;

    private APIgcAcceptInvitationRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcAcceptInvitationRequest
     */
    public APIgcAcceptInvitationRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcAcceptInvitationData
     * @param gcAcceptInvitationData  (optional)
     * @return APIgcAcceptInvitationRequest
     */
    public APIgcAcceptInvitationRequest gcAcceptInvitationData(GcAcceptInvitationData gcAcceptInvitationData) {
      this.gcAcceptInvitationData = gcAcceptInvitationData;
      return this;
    }

    /**
     * Execute gcAcceptInvitation request
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
     * Execute gcAcceptInvitation request with HTTP info returned
     * @return ApiResponse&lt;SendBirdGroupChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdGroupChannel> executeWithHttpInfo() throws ApiException {
      return gcAcceptInvitationWithHttpInfo(channelUrl, apiToken, gcAcceptInvitationData);
    }
  }

  /**
   * Accept an invitation
   * ## Accept an invitation  Accepts an invitation from a [private](#4-private-vs-public) group channel for a user to join. Since a user is allowed to join up to 2,000 group channels, the invitation to a user who already belongs to a maximum number of group channels will be canceled automatically.  &gt; __Note__: This action is effective only when the &#x60;auto_accept&#x60; property of an application is set to false. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, or [update a user&#39;s channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-accept-an-invitation ----------------------------
   * @param channelUrl  (required)
   * @return gcAcceptInvitationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcAcceptInvitationRequest gcAcceptInvitation(String channelUrl) throws ApiException {
    return new APIgcAcceptInvitationRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcCancelTheRegistrationOfOperatorsWithHttpInfo(String channelUrl, List<String> operatorIds, String apiToken, Boolean deleteAll) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcCancelTheRegistrationOfOperators");
    }
    
    // verify the required parameter 'operatorIds' is set
    if (operatorIds == null) {
      throw new ApiException(400, "Missing the required parameter 'operatorIds' when calling gcCancelTheRegistrationOfOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/operators"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "operator_ids", operatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete_all", deleteAll));

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

    return apiClient.invokeAPI("GroupChannelApi.gcCancelTheRegistrationOfOperators", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcCancelTheRegistrationOfOperatorsRequest {
    private String channelUrl;
    private List<String> operatorIds;
    private String apiToken;
    private Boolean deleteAll;

    private APIgcCancelTheRegistrationOfOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set operatorIds
     * @param operatorIds  (required)
     * @return APIgcCancelTheRegistrationOfOperatorsRequest
     */
    public APIgcCancelTheRegistrationOfOperatorsRequest operatorIds(List<String> operatorIds) {
      this.operatorIds = operatorIds;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcCancelTheRegistrationOfOperatorsRequest
     */
    public APIgcCancelTheRegistrationOfOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set deleteAll
     * @param deleteAll  (optional)
     * @return APIgcCancelTheRegistrationOfOperatorsRequest
     */
    public APIgcCancelTheRegistrationOfOperatorsRequest deleteAll(Boolean deleteAll) {
      this.deleteAll = deleteAll;
      return this;
    }

    /**
     * Execute gcCancelTheRegistrationOfOperators request
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
     * Execute gcCancelTheRegistrationOfOperators request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcCancelTheRegistrationOfOperatorsWithHttpInfo(channelUrl, operatorIds, apiToken, deleteAll);
    }
  }

  /**
   * Cancel the registration of operators
   * ## Cancel the registration of operators  Cancels the registration of operators from a group channel but leave them as members.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-cancel-the-registration-of-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to cancel the registration of operators.
   * @param channelUrl  (required)
   * @return gcCancelTheRegistrationOfOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcCancelTheRegistrationOfOperatorsRequest gcCancelTheRegistrationOfOperators(String channelUrl) throws ApiException {
    return new APIgcCancelTheRegistrationOfOperatorsRequest(channelUrl);
  }

private ApiResponse<GcCheckIfMemberByIdResponse> gcCheckIfMemberByIdWithHttpInfo(String channelUrl, String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcCheckIfMemberById");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling gcCheckIfMemberById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/members/{user_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
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

    GenericType<GcCheckIfMemberByIdResponse> localVarReturnType = new GenericType<GcCheckIfMemberByIdResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcCheckIfMemberById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcCheckIfMemberByIdRequest {
    private String channelUrl;
    private String userId;
    private String apiToken;

    private APIgcCheckIfMemberByIdRequest(String channelUrl, String userId) {
      this.channelUrl = channelUrl;
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcCheckIfMemberByIdRequest
     */
    public APIgcCheckIfMemberByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute gcCheckIfMemberById request
     * @return GcCheckIfMemberByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcCheckIfMemberByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcCheckIfMemberById request with HTTP info returned
     * @return ApiResponse&lt;GcCheckIfMemberByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcCheckIfMemberByIdResponse> executeWithHttpInfo() throws ApiException {
      return gcCheckIfMemberByIdWithHttpInfo(channelUrl, userId, apiToken);
    }
  }

  /**
   * Check if member
   * ## Check if member  Checks whether the user is a member of the group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-check-if-member ----------------------------
   * @param channelUrl  (required)
   * @param userId  (required)
   * @return gcCheckIfMemberByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcCheckIfMemberByIdRequest gcCheckIfMemberById(String channelUrl, String userId) throws ApiException {
    return new APIgcCheckIfMemberByIdRequest(channelUrl, userId);
  }

private ApiResponse<SendBirdGroupChannel> gcCreateChannelWithHttpInfo(String apiToken, GcCreateChannelData gcCreateChannelData) throws ApiException {
    Object localVarPostBody = gcCreateChannelData;
    
    // create path and map variables
    String localVarPath = "/v3/group_channels";

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

    return apiClient.invokeAPI("GroupChannelApi.gcCreateChannel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcCreateChannelRequest {
    private String apiToken;
    private GcCreateChannelData gcCreateChannelData;

    private APIgcCreateChannelRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcCreateChannelRequest
     */
    public APIgcCreateChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcCreateChannelData
     * @param gcCreateChannelData  (optional)
     * @return APIgcCreateChannelRequest
     */
    public APIgcCreateChannelRequest gcCreateChannelData(GcCreateChannelData gcCreateChannelData) {
      this.gcCreateChannelData = gcCreateChannelData;
      return this;
    }

    /**
     * Execute gcCreateChannel request
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
     * Execute gcCreateChannel request with HTTP info returned
     * @return ApiResponse&lt;SendBirdGroupChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdGroupChannel> executeWithHttpInfo() throws ApiException {
      return gcCreateChannelWithHttpInfo(apiToken, gcCreateChannelData);
    }
  }

  /**
   * Create a channel
   * ## Create a channel  Creates a new group channel.  &gt; If you are creating a 1-on-1 direct messaging channel for a user, it is recommended that you turn on the &#x60;distinct&#x60; property. If the property is turned off, a user can create a new channel even if they have had the previous chat between them, and therefore can&#39;t see previously sent messages or data in the new channel. On the other hand, if the &#x60;distinct&#x60; property is turned on, every 1-on-1 conversation between the same two users occurs within the same channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel
   * @return gcCreateChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcCreateChannelRequest gcCreateChannel() throws ApiException {
    return new APIgcCreateChannelRequest();
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcDeclineInvitationWithHttpInfo(String channelUrl, String apiToken, GcDeclineInvitationData gcDeclineInvitationData) throws ApiException {
    Object localVarPostBody = gcDeclineInvitationData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcDeclineInvitation");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/decline"
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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcDeclineInvitation", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcDeclineInvitationRequest {
    private String channelUrl;
    private String apiToken;
    private GcDeclineInvitationData gcDeclineInvitationData;

    private APIgcDeclineInvitationRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcDeclineInvitationRequest
     */
    public APIgcDeclineInvitationRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcDeclineInvitationData
     * @param gcDeclineInvitationData  (optional)
     * @return APIgcDeclineInvitationRequest
     */
    public APIgcDeclineInvitationRequest gcDeclineInvitationData(GcDeclineInvitationData gcDeclineInvitationData) {
      this.gcDeclineInvitationData = gcDeclineInvitationData;
      return this;
    }

    /**
     * Execute gcDeclineInvitation request
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
     * Execute gcDeclineInvitation request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcDeclineInvitationWithHttpInfo(channelUrl, apiToken, gcDeclineInvitationData);
    }
  }

  /**
   * Decline an invitation
   * ## Decline an invitation  Declines an invitation for a user to not join a [private](#4-private-vs-public) group channel.  &gt; __Note__: This action is effective only when the &#x60;auto_accept&#x60; property of an application is set to false. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, or [update a user&#39;s channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-decline-an-invitation ----------------------------
   * @param channelUrl  (required)
   * @return gcDeclineInvitationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcDeclineInvitationRequest gcDeclineInvitation(String channelUrl) throws ApiException {
    return new APIgcDeclineInvitationRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcDeleteChannelByUrlWithHttpInfo(String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcDeleteChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}"
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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcDeleteChannelByUrl", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcDeleteChannelByUrlRequest {
    private String channelUrl;
    private String apiToken;

    private APIgcDeleteChannelByUrlRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcDeleteChannelByUrlRequest
     */
    public APIgcDeleteChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute gcDeleteChannelByUrl request
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
     * Execute gcDeleteChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcDeleteChannelByUrlWithHttpInfo(channelUrl, apiToken);
    }
  }

  /**
   * Delete a channel
   * ## Delete a channel  Deletes a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-delete-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return gcDeleteChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcDeleteChannelByUrlRequest gcDeleteChannelByUrl(String channelUrl) throws ApiException {
    return new APIgcDeleteChannelByUrlRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcHideOrArchiveChannelWithHttpInfo(String channelUrl, String apiToken, GcHideOrArchiveChannelData gcHideOrArchiveChannelData) throws ApiException {
    Object localVarPostBody = gcHideOrArchiveChannelData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcHideOrArchiveChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/hide"
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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcHideOrArchiveChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcHideOrArchiveChannelRequest {
    private String channelUrl;
    private String apiToken;
    private GcHideOrArchiveChannelData gcHideOrArchiveChannelData;

    private APIgcHideOrArchiveChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcHideOrArchiveChannelRequest
     */
    public APIgcHideOrArchiveChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcHideOrArchiveChannelData
     * @param gcHideOrArchiveChannelData  (optional)
     * @return APIgcHideOrArchiveChannelRequest
     */
    public APIgcHideOrArchiveChannelRequest gcHideOrArchiveChannelData(GcHideOrArchiveChannelData gcHideOrArchiveChannelData) {
      this.gcHideOrArchiveChannelData = gcHideOrArchiveChannelData;
      return this;
    }

    /**
     * Execute gcHideOrArchiveChannel request
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
     * Execute gcHideOrArchiveChannel request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcHideOrArchiveChannelWithHttpInfo(channelUrl, apiToken, gcHideOrArchiveChannelData);
    }
  }

  /**
   * Hide or archive a channel
   * ## Hide or archive a channel  Hides or archives a channel from the channel list of either a specific user or entire channel members. Normally, a hidden channel comes back and shows up in the channel list when a member in the channel sends a new message. This automatically-triggered behavior is intended for users who want to temporarily remove a channel from their list because [leaving the channel](#2-leave-the-channel) would delete all the past messages and stored data.  You can also leave out a channel from the list and archive the channel. The channel doesn&#39;t appear even when receiving a new message from other member.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-hide-or-archive-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return gcHideOrArchiveChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcHideOrArchiveChannelRequest gcHideOrArchiveChannel(String channelUrl) throws ApiException {
    return new APIgcHideOrArchiveChannelRequest(channelUrl);
  }

private ApiResponse<SendBirdGroupChannel> gcInviteAsMembersWithHttpInfo(String channelUrl, String apiToken, GcInviteAsMembersData gcInviteAsMembersData) throws ApiException {
    Object localVarPostBody = gcInviteAsMembersData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcInviteAsMembers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/invite"
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

    return apiClient.invokeAPI("GroupChannelApi.gcInviteAsMembers", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcInviteAsMembersRequest {
    private String channelUrl;
    private String apiToken;
    private GcInviteAsMembersData gcInviteAsMembersData;

    private APIgcInviteAsMembersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcInviteAsMembersRequest
     */
    public APIgcInviteAsMembersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcInviteAsMembersData
     * @param gcInviteAsMembersData  (optional)
     * @return APIgcInviteAsMembersRequest
     */
    public APIgcInviteAsMembersRequest gcInviteAsMembersData(GcInviteAsMembersData gcInviteAsMembersData) {
      this.gcInviteAsMembersData = gcInviteAsMembersData;
      return this;
    }

    /**
     * Execute gcInviteAsMembers request
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
     * Execute gcInviteAsMembers request with HTTP info returned
     * @return ApiResponse&lt;SendBirdGroupChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdGroupChannel> executeWithHttpInfo() throws ApiException {
      return gcInviteAsMembersWithHttpInfo(channelUrl, apiToken, gcInviteAsMembersData);
    }
  }

  /**
   * Invite as members
   * ## Invite as members  Invites one or more users as members into the group channel.  &gt; __Note__: By default, users in your application automatically join a [private](#4-private-vs-public) group channel promptly from an invitation without having to accept it. If you want to give them the option to decide whether to accept or decline an invitation, you should set the value of channel invitation preference to false through the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action. Or using the [update a user&#39;s channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference) action, you can also allow the option individually by user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members ----------------------------
   * @param channelUrl  (required)
   * @return gcInviteAsMembersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcInviteAsMembersRequest gcInviteAsMembers(String channelUrl) throws ApiException {
    return new APIgcInviteAsMembersRequest(channelUrl);
  }

private ApiResponse<Void> gcJoinChannelWithHttpInfo(String channelUrl, String apiToken, GcJoinChannelData gcJoinChannelData) throws ApiException {
    Object localVarPostBody = gcJoinChannelData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcJoinChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/join"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("GroupChannelApi.gcJoinChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIgcJoinChannelRequest {
    private String channelUrl;
    private String apiToken;
    private GcJoinChannelData gcJoinChannelData;

    private APIgcJoinChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcJoinChannelRequest
     */
    public APIgcJoinChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcJoinChannelData
     * @param gcJoinChannelData  (optional)
     * @return APIgcJoinChannelRequest
     */
    public APIgcJoinChannelRequest gcJoinChannelData(GcJoinChannelData gcJoinChannelData) {
      this.gcJoinChannelData = gcJoinChannelData;
      return this;
    }

    /**
     * Execute gcJoinChannel request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcJoinChannel request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return gcJoinChannelWithHttpInfo(channelUrl, apiToken, gcJoinChannelData);
    }
  }

  /**
   * Join a channel
   * ## Join a channel  Allows a user to join a [public](#4-private-vs-public) group channel. Since a user is allowed to join up to 2,000 group channels, a user who already belongs to a maximum number of group channels can&#39;t join a new channel.  &gt; __Note__: This action is only permitted for public group channels where the &#x60;is_public&#x60; property is true.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-join-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return gcJoinChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcJoinChannelRequest gcJoinChannel(String channelUrl) throws ApiException {
    return new APIgcJoinChannelRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcLeaveChannelWithHttpInfo(String channelUrl, String apiToken, GcLeaveChannelData gcLeaveChannelData) throws ApiException {
    Object localVarPostBody = gcLeaveChannelData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcLeaveChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/leave"
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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcLeaveChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcLeaveChannelRequest {
    private String channelUrl;
    private String apiToken;
    private GcLeaveChannelData gcLeaveChannelData;

    private APIgcLeaveChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcLeaveChannelRequest
     */
    public APIgcLeaveChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcLeaveChannelData
     * @param gcLeaveChannelData  (optional)
     * @return APIgcLeaveChannelRequest
     */
    public APIgcLeaveChannelRequest gcLeaveChannelData(GcLeaveChannelData gcLeaveChannelData) {
      this.gcLeaveChannelData = gcLeaveChannelData;
      return this;
    }

    /**
     * Execute gcLeaveChannel request
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
     * Execute gcLeaveChannel request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcLeaveChannelWithHttpInfo(channelUrl, apiToken, gcLeaveChannelData);
    }
  }

  /**
   * Leave a channel
   * ## Leave a channel  Makes one or more members leave a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-leave-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return gcLeaveChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcLeaveChannelRequest gcLeaveChannel(String channelUrl) throws ApiException {
    return new APIgcLeaveChannelRequest(channelUrl);
  }

private ApiResponse<GcListChannelsResponse> gcListChannelsWithHttpInfo(String apiToken, String token, Integer limit, String distinctMode, String publicMode, String superMode, Integer createdAfter, Integer createdBefore, Boolean showEmpty, Boolean showMember, Boolean showDeliveryReceipt, Boolean showReadReceipt, Boolean showMetadata, Boolean showFrozen, String order, String metadataOrderKey, String customTypes, String customTypeStartswith, String channelUrls, String name, String nameContains, String nameStartswith, String membersExactlyIn, String membersIncludeIn, String queryType, String membersNickname, String membersNicknameContains, String metadataKey, String metadataValues, String metadataValueStartswith, String metacounterKey, String metacounterValues, String metacounterValueGt, String metacounterValueGte, String metacounterValueLt, String metacounterValueLte, Boolean includeSortedMetaarrayInLastMessage, String customType, Boolean readReceipt, Boolean member, Boolean isDistinct, String membersIn, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/group_channels";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

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

    GenericType<GcListChannelsResponse> localVarReturnType = new GenericType<GcListChannelsResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcListChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcListChannelsRequest {
    private String apiToken;
    private String token;
    private Integer limit;
    private String distinctMode;
    private String publicMode;
    private String superMode;
    private Integer createdAfter;
    private Integer createdBefore;
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
    private String userId;

    private APIgcListChannelsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set distinctMode
     * @param distinctMode  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest distinctMode(String distinctMode) {
      this.distinctMode = distinctMode;
      return this;
    }

    /**
     * Set publicMode
     * @param publicMode  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest publicMode(String publicMode) {
      this.publicMode = publicMode;
      return this;
    }

    /**
     * Set superMode
     * @param superMode  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
    }

    /**
     * Set createdAfter
     * @param createdAfter  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest createdAfter(Integer createdAfter) {
      this.createdAfter = createdAfter;
      return this;
    }

    /**
     * Set createdBefore
     * @param createdBefore  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest createdBefore(Integer createdBefore) {
      this.createdBefore = createdBefore;
      return this;
    }

    /**
     * Set showEmpty
     * @param showEmpty  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest showEmpty(Boolean showEmpty) {
      this.showEmpty = showEmpty;
      return this;
    }

    /**
     * Set showMember
     * @param showMember  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest showMember(Boolean showMember) {
      this.showMember = showMember;
      return this;
    }

    /**
     * Set showDeliveryReceipt
     * @param showDeliveryReceipt  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest showDeliveryReceipt(Boolean showDeliveryReceipt) {
      this.showDeliveryReceipt = showDeliveryReceipt;
      return this;
    }

    /**
     * Set showReadReceipt
     * @param showReadReceipt  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest showReadReceipt(Boolean showReadReceipt) {
      this.showReadReceipt = showReadReceipt;
      return this;
    }

    /**
     * Set showMetadata
     * @param showMetadata  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest showMetadata(Boolean showMetadata) {
      this.showMetadata = showMetadata;
      return this;
    }

    /**
     * Set showFrozen
     * @param showFrozen  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest showFrozen(Boolean showFrozen) {
      this.showFrozen = showFrozen;
      return this;
    }

    /**
     * Set order
     * @param order  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set metadataOrderKey
     * @param metadataOrderKey  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metadataOrderKey(String metadataOrderKey) {
      this.metadataOrderKey = metadataOrderKey;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set customTypeStartswith
     * @param customTypeStartswith  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest customTypeStartswith(String customTypeStartswith) {
      this.customTypeStartswith = customTypeStartswith;
      return this;
    }

    /**
     * Set channelUrls
     * @param channelUrls  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest channelUrls(String channelUrls) {
      this.channelUrls = channelUrls;
      return this;
    }

    /**
     * Set name
     * @param name  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set nameContains
     * @param nameContains  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest nameContains(String nameContains) {
      this.nameContains = nameContains;
      return this;
    }

    /**
     * Set nameStartswith
     * @param nameStartswith  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest nameStartswith(String nameStartswith) {
      this.nameStartswith = nameStartswith;
      return this;
    }

    /**
     * Set membersExactlyIn
     * @param membersExactlyIn  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest membersExactlyIn(String membersExactlyIn) {
      this.membersExactlyIn = membersExactlyIn;
      return this;
    }

    /**
     * Set membersIncludeIn
     * @param membersIncludeIn  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest membersIncludeIn(String membersIncludeIn) {
      this.membersIncludeIn = membersIncludeIn;
      return this;
    }

    /**
     * Set queryType
     * @param queryType  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest queryType(String queryType) {
      this.queryType = queryType;
      return this;
    }

    /**
     * Set membersNickname
     * @param membersNickname  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest membersNickname(String membersNickname) {
      this.membersNickname = membersNickname;
      return this;
    }

    /**
     * Set membersNicknameContains
     * @param membersNicknameContains  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest membersNicknameContains(String membersNicknameContains) {
      this.membersNicknameContains = membersNicknameContains;
      return this;
    }

    /**
     * Set metadataKey
     * @param metadataKey  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metadataKey(String metadataKey) {
      this.metadataKey = metadataKey;
      return this;
    }

    /**
     * Set metadataValues
     * @param metadataValues  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metadataValues(String metadataValues) {
      this.metadataValues = metadataValues;
      return this;
    }

    /**
     * Set metadataValueStartswith
     * @param metadataValueStartswith  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metadataValueStartswith(String metadataValueStartswith) {
      this.metadataValueStartswith = metadataValueStartswith;
      return this;
    }

    /**
     * Set metacounterKey
     * @param metacounterKey  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metacounterKey(String metacounterKey) {
      this.metacounterKey = metacounterKey;
      return this;
    }

    /**
     * Set metacounterValues
     * @param metacounterValues  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metacounterValues(String metacounterValues) {
      this.metacounterValues = metacounterValues;
      return this;
    }

    /**
     * Set metacounterValueGt
     * @param metacounterValueGt  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metacounterValueGt(String metacounterValueGt) {
      this.metacounterValueGt = metacounterValueGt;
      return this;
    }

    /**
     * Set metacounterValueGte
     * @param metacounterValueGte  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metacounterValueGte(String metacounterValueGte) {
      this.metacounterValueGte = metacounterValueGte;
      return this;
    }

    /**
     * Set metacounterValueLt
     * @param metacounterValueLt  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metacounterValueLt(String metacounterValueLt) {
      this.metacounterValueLt = metacounterValueLt;
      return this;
    }

    /**
     * Set metacounterValueLte
     * @param metacounterValueLte  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest metacounterValueLte(String metacounterValueLte) {
      this.metacounterValueLte = metacounterValueLte;
      return this;
    }

    /**
     * Set includeSortedMetaarrayInLastMessage
     * @param includeSortedMetaarrayInLastMessage  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest includeSortedMetaarrayInLastMessage(Boolean includeSortedMetaarrayInLastMessage) {
      this.includeSortedMetaarrayInLastMessage = includeSortedMetaarrayInLastMessage;
      return this;
    }

    /**
     * Set customType
     * @param customType  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest customType(String customType) {
      this.customType = customType;
      return this;
    }

    /**
     * Set readReceipt
     * @param readReceipt  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest readReceipt(Boolean readReceipt) {
      this.readReceipt = readReceipt;
      return this;
    }

    /**
     * Set member
     * @param member  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest member(Boolean member) {
      this.member = member;
      return this;
    }

    /**
     * Set isDistinct
     * @param isDistinct  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest isDistinct(Boolean isDistinct) {
      this.isDistinct = isDistinct;
      return this;
    }

    /**
     * Set membersIn
     * @param membersIn  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest membersIn(String membersIn) {
      this.membersIn = membersIn;
      return this;
    }

    /**
     * Set userId
     * @param userId  (optional)
     * @return APIgcListChannelsRequest
     */
    public APIgcListChannelsRequest userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Execute gcListChannels request
     * @return GcListChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcListChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcListChannels request with HTTP info returned
     * @return ApiResponse&lt;GcListChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcListChannelsResponse> executeWithHttpInfo() throws ApiException {
      return gcListChannelsWithHttpInfo(apiToken, token, limit, distinctMode, publicMode, superMode, createdAfter, createdBefore, showEmpty, showMember, showDeliveryReceipt, showReadReceipt, showMetadata, showFrozen, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, includeSortedMetaarrayInLastMessage, customType, readReceipt, member, isDistinct, membersIn, userId);
    }
  }

  /**
   * List channels
   * ## List channels  Retrieves a list of group channels in the application.  &gt; __Note__: If you want to get a list of a specific user&#39;s group channels, use the [list my group channels](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels) action instead.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-channels ----------------------------
   * @return gcListChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcListChannelsRequest gcListChannels() throws ApiException {
    return new APIgcListChannelsRequest();
  }

private ApiResponse<GcListMembersResponse> gcListMembersWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit, Boolean showDeliveryReceipt, Boolean showReadReceipt, String order, String operatorFilter, String memberStateFilter, String mutedMemberFilter, String nicknameStartswith) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcListMembers");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/members"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_delivery_receipt", showDeliveryReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_read_receipt", showReadReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operator_filter", operatorFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "member_state_filter", memberStateFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "muted_member_filter", mutedMemberFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname_startswith", nicknameStartswith));

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

    GenericType<GcListMembersResponse> localVarReturnType = new GenericType<GcListMembersResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcListMembers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcListMembersRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;
    private Boolean showDeliveryReceipt;
    private Boolean showReadReceipt;
    private String order;
    private String operatorFilter;
    private String memberStateFilter;
    private String mutedMemberFilter;
    private String nicknameStartswith;

    private APIgcListMembersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set showDeliveryReceipt
     * @param showDeliveryReceipt  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest showDeliveryReceipt(Boolean showDeliveryReceipt) {
      this.showDeliveryReceipt = showDeliveryReceipt;
      return this;
    }

    /**
     * Set showReadReceipt
     * @param showReadReceipt  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest showReadReceipt(Boolean showReadReceipt) {
      this.showReadReceipt = showReadReceipt;
      return this;
    }

    /**
     * Set order
     * @param order  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set operatorFilter
     * @param operatorFilter  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest operatorFilter(String operatorFilter) {
      this.operatorFilter = operatorFilter;
      return this;
    }

    /**
     * Set memberStateFilter
     * @param memberStateFilter  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest memberStateFilter(String memberStateFilter) {
      this.memberStateFilter = memberStateFilter;
      return this;
    }

    /**
     * Set mutedMemberFilter
     * @param mutedMemberFilter  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest mutedMemberFilter(String mutedMemberFilter) {
      this.mutedMemberFilter = mutedMemberFilter;
      return this;
    }

    /**
     * Set nicknameStartswith
     * @param nicknameStartswith  (optional)
     * @return APIgcListMembersRequest
     */
    public APIgcListMembersRequest nicknameStartswith(String nicknameStartswith) {
      this.nicknameStartswith = nicknameStartswith;
      return this;
    }

    /**
     * Execute gcListMembers request
     * @return GcListMembersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcListMembersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcListMembers request with HTTP info returned
     * @return ApiResponse&lt;GcListMembersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcListMembersResponse> executeWithHttpInfo() throws ApiException {
      return gcListMembersWithHttpInfo(channelUrl, apiToken, token, limit, showDeliveryReceipt, showReadReceipt, order, operatorFilter, memberStateFilter, mutedMemberFilter, nicknameStartswith);
    }
  }

  /**
   * List members
   * ## List members  Retrieves a list of members of a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-members ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of members of.
   * @param channelUrl  (required)
   * @return gcListMembersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcListMembersRequest gcListMembers(String channelUrl) throws ApiException {
    return new APIgcListMembersRequest(channelUrl);
  }

private ApiResponse<GcListOperatorsResponse> gcListOperatorsWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcListOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/operators"
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

    GenericType<GcListOperatorsResponse> localVarReturnType = new GenericType<GcListOperatorsResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcListOperators", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcListOperatorsRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIgcListOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcListOperatorsRequest
     */
    public APIgcListOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIgcListOperatorsRequest
     */
    public APIgcListOperatorsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIgcListOperatorsRequest
     */
    public APIgcListOperatorsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute gcListOperators request
     * @return GcListOperatorsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcListOperatorsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcListOperators request with HTTP info returned
     * @return ApiResponse&lt;GcListOperatorsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcListOperatorsResponse> executeWithHttpInfo() throws ApiException {
      return gcListOperatorsWithHttpInfo(channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List operators
   * ## List operators  Retrieves a list of operators of a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of operators.
   * @param channelUrl  (required)
   * @return gcListOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcListOperatorsRequest gcListOperators(String channelUrl) throws ApiException {
    return new APIgcListOperatorsRequest(channelUrl);
  }

private ApiResponse<GcRegisterOperatorsResponse> gcRegisterOperatorsWithHttpInfo(String channelUrl, String apiToken, GcRegisterOperatorsData gcRegisterOperatorsData) throws ApiException {
    Object localVarPostBody = gcRegisterOperatorsData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcRegisterOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/operators"
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

    GenericType<GcRegisterOperatorsResponse> localVarReturnType = new GenericType<GcRegisterOperatorsResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcRegisterOperators", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcRegisterOperatorsRequest {
    private String channelUrl;
    private String apiToken;
    private GcRegisterOperatorsData gcRegisterOperatorsData;

    private APIgcRegisterOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcRegisterOperatorsRequest
     */
    public APIgcRegisterOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcRegisterOperatorsData
     * @param gcRegisterOperatorsData  (optional)
     * @return APIgcRegisterOperatorsRequest
     */
    public APIgcRegisterOperatorsRequest gcRegisterOperatorsData(GcRegisterOperatorsData gcRegisterOperatorsData) {
      this.gcRegisterOperatorsData = gcRegisterOperatorsData;
      return this;
    }

    /**
     * Execute gcRegisterOperators request
     * @return GcRegisterOperatorsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcRegisterOperatorsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcRegisterOperators request with HTTP info returned
     * @return ApiResponse&lt;GcRegisterOperatorsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcRegisterOperatorsResponse> executeWithHttpInfo() throws ApiException {
      return gcRegisterOperatorsWithHttpInfo(channelUrl, apiToken, gcRegisterOperatorsData);
    }
  }

  /**
   * Register operators
   * ## Register operators  Registers one or more operators to a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-register-operators ----------------------------
   * @param channelUrl  (required)
   * @return gcRegisterOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcRegisterOperatorsRequest gcRegisterOperators(String channelUrl) throws ApiException {
    return new APIgcRegisterOperatorsRequest(channelUrl);
  }

private ApiResponse<GcResetChatHistoryResponse> gcResetChatHistoryWithHttpInfo(String channelUrl, String apiToken, GcResetChatHistoryData gcResetChatHistoryData) throws ApiException {
    Object localVarPostBody = gcResetChatHistoryData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcResetChatHistory");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/reset_user_history"
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

    GenericType<GcResetChatHistoryResponse> localVarReturnType = new GenericType<GcResetChatHistoryResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcResetChatHistory", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcResetChatHistoryRequest {
    private String channelUrl;
    private String apiToken;
    private GcResetChatHistoryData gcResetChatHistoryData;

    private APIgcResetChatHistoryRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcResetChatHistoryRequest
     */
    public APIgcResetChatHistoryRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcResetChatHistoryData
     * @param gcResetChatHistoryData  (optional)
     * @return APIgcResetChatHistoryRequest
     */
    public APIgcResetChatHistoryRequest gcResetChatHistoryData(GcResetChatHistoryData gcResetChatHistoryData) {
      this.gcResetChatHistoryData = gcResetChatHistoryData;
      return this;
    }

    /**
     * Execute gcResetChatHistory request
     * @return GcResetChatHistoryResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcResetChatHistoryResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcResetChatHistory request with HTTP info returned
     * @return ApiResponse&lt;GcResetChatHistoryResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcResetChatHistoryResponse> executeWithHttpInfo() throws ApiException {
      return gcResetChatHistoryWithHttpInfo(channelUrl, apiToken, gcResetChatHistoryData);
    }
  }

  /**
   * Reset chat history
   * ## Reset chat history  Resets the properties related to a user&#39;s chat history in a group channel, then clears the existing messages in the channel on the user&#39;s side only. A user can no longer see the messages in a group channel once this action is called, but those messages are not deleted from the database of the Sendbird system. All other members in the channel can retrieve and see the messages.  This action simply clears the messages for the user by updating the &#x60;last_message&#x60; and &#x60;read_receipt&#x60; properties of the [channel](#2-types-of-a-channel-3-resource-representation) resource in addition to other internally managed data such as the number of the user&#39;s unread message.  Using the &#x60;reset_all&#x60; property, you can also reset the properties related to all users&#39; chat history in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-reset-chat-history ----------------------------
   * @param channelUrl  (required)
   * @return gcResetChatHistoryRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcResetChatHistoryRequest gcResetChatHistory(String channelUrl) throws ApiException {
    return new APIgcResetChatHistoryRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> gcUnhideOrUnarchiveChannelWithHttpInfo(String channelUrl, String userId, String apiToken, Boolean shouldUnhideAll) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcUnhideOrUnarchiveChannel");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling gcUnhideOrUnarchiveChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/hide"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "should_unhide_all", shouldUnhideAll));

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

    return apiClient.invokeAPI("GroupChannelApi.gcUnhideOrUnarchiveChannel", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcUnhideOrUnarchiveChannelRequest {
    private String channelUrl;
    private String userId;
    private String apiToken;
    private Boolean shouldUnhideAll;

    private APIgcUnhideOrUnarchiveChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set userId
     * @param userId  (required)
     * @return APIgcUnhideOrUnarchiveChannelRequest
     */
    public APIgcUnhideOrUnarchiveChannelRequest userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcUnhideOrUnarchiveChannelRequest
     */
    public APIgcUnhideOrUnarchiveChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set shouldUnhideAll
     * @param shouldUnhideAll  (optional)
     * @return APIgcUnhideOrUnarchiveChannelRequest
     */
    public APIgcUnhideOrUnarchiveChannelRequest shouldUnhideAll(Boolean shouldUnhideAll) {
      this.shouldUnhideAll = shouldUnhideAll;
      return this;
    }

    /**
     * Execute gcUnhideOrUnarchiveChannel request
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
     * Execute gcUnhideOrUnarchiveChannel request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return gcUnhideOrUnarchiveChannelWithHttpInfo(channelUrl, userId, apiToken, shouldUnhideAll);
    }
  }

  /**
   * Unhide or unarchive a channel
   * ## Unhide or unarchive a channel  Makes a hidden or archived channel reappear in the channel list of either a specific user or entire channel members.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unhide-or-unarchive-a-channel ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to unhide or unarchive.
   * @param channelUrl  (required)
   * @return gcUnhideOrUnarchiveChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcUnhideOrUnarchiveChannelRequest gcUnhideOrUnarchiveChannel(String channelUrl) throws ApiException {
    return new APIgcUnhideOrUnarchiveChannelRequest(channelUrl);
  }

private ApiResponse<SendBirdGroupChannel> gcUpdateChannelByUrlWithHttpInfo(String channelUrl, String apiToken, GcUpdateChannelByUrlData gcUpdateChannelByUrlData) throws ApiException {
    Object localVarPostBody = gcUpdateChannelByUrlData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcUpdateChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}"
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

    return apiClient.invokeAPI("GroupChannelApi.gcUpdateChannelByUrl", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcUpdateChannelByUrlRequest {
    private String channelUrl;
    private String apiToken;
    private GcUpdateChannelByUrlData gcUpdateChannelByUrlData;

    private APIgcUpdateChannelByUrlRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcUpdateChannelByUrlRequest
     */
    public APIgcUpdateChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcUpdateChannelByUrlData
     * @param gcUpdateChannelByUrlData  (optional)
     * @return APIgcUpdateChannelByUrlRequest
     */
    public APIgcUpdateChannelByUrlRequest gcUpdateChannelByUrlData(GcUpdateChannelByUrlData gcUpdateChannelByUrlData) {
      this.gcUpdateChannelByUrlData = gcUpdateChannelByUrlData;
      return this;
    }

    /**
     * Execute gcUpdateChannelByUrl request
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
     * Execute gcUpdateChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;SendBirdGroupChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdGroupChannel> executeWithHttpInfo() throws ApiException {
      return gcUpdateChannelByUrlWithHttpInfo(channelUrl, apiToken, gcUpdateChannelByUrlData);
    }
  }

  /**
   * Update a channel
   * ## Update a channel  Updates information on a group channel.  &gt; __Note__: You can&#39;t change the members of the channel here. To do so, see [invite as members](#2-invite-as-members) action below.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return gcUpdateChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcUpdateChannelByUrlRequest gcUpdateChannelByUrl(String channelUrl) throws ApiException {
    return new APIgcUpdateChannelByUrlRequest(channelUrl);
  }

private ApiResponse<SendBirdGroupChannel> gcViewChannelByUrlWithHttpInfo(String channelUrl, String apiToken, Boolean showDeliveryReceipt, Boolean showReadReceipt, Boolean showMember, Boolean readReceipt, Boolean member) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcViewChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_delivery_receipt", showDeliveryReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_read_receipt", showReadReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_member", showMember));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_receipt", readReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "member", member));

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

    GenericType<SendBirdGroupChannel> localVarReturnType = new GenericType<SendBirdGroupChannel>() {};

    return apiClient.invokeAPI("GroupChannelApi.gcViewChannelByUrl", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcViewChannelByUrlRequest {
    private String channelUrl;
    private String apiToken;
    private Boolean showDeliveryReceipt;
    private Boolean showReadReceipt;
    private Boolean showMember;
    private Boolean readReceipt;
    private Boolean member;

    private APIgcViewChannelByUrlRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcViewChannelByUrlRequest
     */
    public APIgcViewChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set showDeliveryReceipt
     * @param showDeliveryReceipt  (optional)
     * @return APIgcViewChannelByUrlRequest
     */
    public APIgcViewChannelByUrlRequest showDeliveryReceipt(Boolean showDeliveryReceipt) {
      this.showDeliveryReceipt = showDeliveryReceipt;
      return this;
    }

    /**
     * Set showReadReceipt
     * @param showReadReceipt  (optional)
     * @return APIgcViewChannelByUrlRequest
     */
    public APIgcViewChannelByUrlRequest showReadReceipt(Boolean showReadReceipt) {
      this.showReadReceipt = showReadReceipt;
      return this;
    }

    /**
     * Set showMember
     * @param showMember  (optional)
     * @return APIgcViewChannelByUrlRequest
     */
    public APIgcViewChannelByUrlRequest showMember(Boolean showMember) {
      this.showMember = showMember;
      return this;
    }

    /**
     * Set readReceipt
     * @param readReceipt  (optional)
     * @return APIgcViewChannelByUrlRequest
     */
    public APIgcViewChannelByUrlRequest readReceipt(Boolean readReceipt) {
      this.readReceipt = readReceipt;
      return this;
    }

    /**
     * Set member
     * @param member  (optional)
     * @return APIgcViewChannelByUrlRequest
     */
    public APIgcViewChannelByUrlRequest member(Boolean member) {
      this.member = member;
      return this;
    }

    /**
     * Execute gcViewChannelByUrl request
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
     * Execute gcViewChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;SendBirdGroupChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdGroupChannel> executeWithHttpInfo() throws ApiException {
      return gcViewChannelByUrlWithHttpInfo(channelUrl, apiToken, showDeliveryReceipt, showReadReceipt, showMember, readReceipt, member);
    }
  }

  /**
   * View a channel
   * ## View a channel  Retrieves information on a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-channel ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve.
   * @param channelUrl  (required)
   * @return gcViewChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcViewChannelByUrlRequest gcViewChannelByUrl(String channelUrl) throws ApiException {
    return new APIgcViewChannelByUrlRequest(channelUrl);
  }
}
