package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.AcceptAnInvitationRequest;
import org.openapitools.client.model.CheckIfMemberResponse;
import org.openapitools.client.model.CreateAGroupChannelRequest;
import org.openapitools.client.model.GetAGroupChannelResponse;
import org.openapitools.client.model.GroupChannelListMembersResponse;
import org.openapitools.client.model.GroupChatListChannelsResponse;
import org.openapitools.client.model.HideAChannelRequest;
import org.openapitools.client.model.InviteAsMembersRequest;
import org.openapitools.client.model.InviteAsMembersResponse;
import org.openapitools.client.model.JoinAChannelRequest;
import org.openapitools.client.model.LeaveAChannelRequest;
import org.openapitools.client.model.ListOperatorsResponse;
import org.openapitools.client.model.RegisterOperatorsToAGroupChannelRequest;
import org.openapitools.client.model.ResetChatHistoryRequest;
import org.openapitools.client.model.ResetChatHistoryResponse;
import org.openapitools.client.model.SendbirdGroupChannelDetail;
import org.openapitools.client.model.StartTypingIndicatorsRequest;
import org.openapitools.client.model.UpdateAGroupChannelRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-16T10:11:20.822211+07:00[Asia/Jakarta]")
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


private ApiResponse<SendbirdGroupChannelDetail> acceptAnInvitationWithHttpInfo(String channelUrl, String apiToken, AcceptAnInvitationRequest acceptAnInvitationRequest) throws ApiException {
    Object localVarPostBody = acceptAnInvitationRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling acceptAnInvitation");
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

    return apiClient.invokeAPI("GroupChannelApi.acceptAnInvitation", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIacceptAnInvitationRequest {
    private String channelUrl;
    private String apiToken;
    private AcceptAnInvitationRequest acceptAnInvitationRequest;

    private APIacceptAnInvitationRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIacceptAnInvitationRequest
     */
    public APIacceptAnInvitationRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set acceptAnInvitationRequest
     * @param acceptAnInvitationRequest  (optional)
     * @return APIacceptAnInvitationRequest
     */
    public APIacceptAnInvitationRequest acceptAnInvitationRequest(AcceptAnInvitationRequest acceptAnInvitationRequest) {
      this.acceptAnInvitationRequest = acceptAnInvitationRequest;
      return this;
    }

    /**
     * Execute acceptAnInvitation request
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
     * Execute acceptAnInvitation request with HTTP info returned
     * @return ApiResponse&lt;SendbirdGroupChannelDetail&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdGroupChannelDetail> executeWithHttpInfo() throws ApiException {
      return acceptAnInvitationWithHttpInfo(channelUrl, apiToken, acceptAnInvitationRequest);
    }
  }

  /**
   * Accept an invitation
   * ## Accept an invitation  Accepts an invitation from a group channel for a user to join. A single user may join up to 2,000 group channels, and any invitation to a user who is at capacity will be automatically canceled. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.  &gt; **Note**: This action is only available when the &#x60;auto_accept&#x60; property of an application is set to **false**. You can change the value of the property using the [update default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/update-default-invitation-preference) action, or the [update channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-channel-invitation-preference) action.      [https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/accept-an-invitation-channel#1-accept-an-invitation](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/accept-an-invitation-channel#1-accept-an-invitation)
   * @param channelUrl (Required)  (required)
   * @return acceptAnInvitationRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIacceptAnInvitationRequest acceptAnInvitation(String channelUrl) throws ApiException {
    return new APIacceptAnInvitationRequest(channelUrl);
  }

private ApiResponse<Object> cancelTheRegistrationOfOperatorsWithHttpInfo(String channelUrl, String operatorIds, Boolean deleteAll, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling cancelTheRegistrationOfOperators");
    }
    
    // verify the required parameter 'operatorIds' is set
    if (operatorIds == null) {
      throw new ApiException(400, "Missing the required parameter 'operatorIds' when calling cancelTheRegistrationOfOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/operators"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operator_ids", operatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete_all", deleteAll));

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

    return apiClient.invokeAPI("GroupChannelApi.cancelTheRegistrationOfOperators", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcancelTheRegistrationOfOperatorsRequest {
    private String channelUrl;
    private String operatorIds;
    private Boolean deleteAll;
    private String apiToken;

    private APIcancelTheRegistrationOfOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set operatorIds
     * @param operatorIds Specifies an array of one or more operator IDs to unregister from the channel. The operators in this array remain as participants of the channel after losing their operational roles. Urlencoding each operator ID is recommended. An example of a Urlencoded array would be ?operator_ids&#x3D;urlencoded_id_1,urlencoded_id_2. (required)
     * @return APIcancelTheRegistrationOfOperatorsRequest
     */
    public APIcancelTheRegistrationOfOperatorsRequest operatorIds(String operatorIds) {
      this.operatorIds = operatorIds;
      return this;
    }

    /**
     * Set deleteAll
     * @param deleteAll  (optional)
     * @return APIcancelTheRegistrationOfOperatorsRequest
     */
    public APIcancelTheRegistrationOfOperatorsRequest deleteAll(Boolean deleteAll) {
      this.deleteAll = deleteAll;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcancelTheRegistrationOfOperatorsRequest
     */
    public APIcancelTheRegistrationOfOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute cancelTheRegistrationOfOperators request
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
     * Execute cancelTheRegistrationOfOperators request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return cancelTheRegistrationOfOperatorsWithHttpInfo(channelUrl, operatorIds, deleteAll, apiToken);
    }
  }

  /**
   * Cancel the registration of operators
   * ## Unregister operators from a group channel  You can unregister operators in a group channel but keep them in the channel as members using this API.  https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/unregister-operators-from-a-group-channel#1-unregister-operators-from-a-group-channel  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to cancel the registration of operators.
   * @param channelUrl (Required)  (required)
   * @return cancelTheRegistrationOfOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcancelTheRegistrationOfOperatorsRequest cancelTheRegistrationOfOperators(String channelUrl) throws ApiException {
    return new APIcancelTheRegistrationOfOperatorsRequest(channelUrl);
  }

private ApiResponse<CheckIfMemberResponse> checkIfMemberWithHttpInfo(String channelUrl, String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling checkIfMember");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling checkIfMember");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CheckIfMemberResponse> localVarReturnType = new GenericType<CheckIfMemberResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.checkIfMember", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcheckIfMemberRequest {
    private String channelUrl;
    private String userId;
    private String apiToken;

    private APIcheckIfMemberRequest(String channelUrl, String userId) {
      this.channelUrl = channelUrl;
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcheckIfMemberRequest
     */
    public APIcheckIfMemberRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute checkIfMember request
     * @return CheckIfMemberResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CheckIfMemberResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute checkIfMember request with HTTP info returned
     * @return ApiResponse&lt;CheckIfMemberResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CheckIfMemberResponse> executeWithHttpInfo() throws ApiException {
      return checkIfMemberWithHttpInfo(channelUrl, userId, apiToken);
    }
  }

  /**
   * Check if member
   * ## Check if user is a member  Checks if a user is a member of a group channel.  &gt; **Note**: See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.      [https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/check-if-user-is-a-member#1-check-if-user-is-a-member](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/check-if-user-is-a-member#1-check-if-user-is-a-member)
   * @param channelUrl (Required)  (required)
   * @param userId (Required)  (required)
   * @return checkIfMemberRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcheckIfMemberRequest checkIfMember(String channelUrl, String userId) throws ApiException {
    return new APIcheckIfMemberRequest(channelUrl, userId);
  }

private ApiResponse<SendbirdGroupChannelDetail> createAGroupChannelWithHttpInfo(String apiToken, CreateAGroupChannelRequest createAGroupChannelRequest) throws ApiException {
    Object localVarPostBody = createAGroupChannelRequest;
    
    // create path and map variables
    String localVarPath = "/v3/group_channels";

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

    return apiClient.invokeAPI("GroupChannelApi.createAGroupChannel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateAGroupChannelRequest {
    private String apiToken;
    private CreateAGroupChannelRequest createAGroupChannelRequest;

    private APIcreateAGroupChannelRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateAGroupChannelRequest
     */
    public APIcreateAGroupChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createAGroupChannelRequest
     * @param createAGroupChannelRequest  (optional)
     * @return APIcreateAGroupChannelRequest
     */
    public APIcreateAGroupChannelRequest createAGroupChannelRequest(CreateAGroupChannelRequest createAGroupChannelRequest) {
      this.createAGroupChannelRequest = createAGroupChannelRequest;
      return this;
    }

    /**
     * Execute createAGroupChannel request
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
     * Execute createAGroupChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdGroupChannelDetail&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdGroupChannelDetail> executeWithHttpInfo() throws ApiException {
      return createAGroupChannelWithHttpInfo(apiToken, createAGroupChannelRequest);
    }
  }

  /**
   * Create a group channel
   * ## Create a group channel  You can create a group channel for 1-to-1 and 1-to-N conversations. By default, group channels are used for conversations between up to 100 members. This number can stretch up to tens of thousands in Supergroup channels. Group channels can either be private and invite only, or public. They support typing indicators, unread count and read receipts, allowing for an interactive chat experience. A user can join up to 2000 group channels, and higher numbers would negatively impact the performance for the end user. The Chat history is turned off by default and its settings can be changed on Sendbird Dashboard by going to Settings &gt; Chat &gt; Channels &gt; Group channels &gt; Chat history. To learn more about group channels, see Channel Overview.  &gt; If you are seeing the error message Maximum \&quot;channel join\&quot; count reached., then consider deleting channels that are no longer used. For situations where an agent connects with many customers such as support, delivery logistics or sales, we recommend using Sendbird Desk.  https://sendbird.com/docs/chat/platform-api/v3/channel/creating-a-channel/create-a-group-channel#1-create-a-group-channel
   * @return createAGroupChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateAGroupChannelRequest createAGroupChannel() throws ApiException {
    return new APIcreateAGroupChannelRequest();
  }

private ApiResponse<Object> deleteAGroupChannelWithHttpInfo(String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteAGroupChannel");
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

    return apiClient.invokeAPI("GroupChannelApi.deleteAGroupChannel", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteAGroupChannelRequest {
    private String channelUrl;
    private String apiToken;

    private APIdeleteAGroupChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteAGroupChannelRequest
     */
    public APIdeleteAGroupChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteAGroupChannel request
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
     * Execute deleteAGroupChannel request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAGroupChannelWithHttpInfo(channelUrl, apiToken);
    }
  }

  /**
   * Delete a group channel
   * ## Delete a group channel  You can delete a group channel or a Supergroup channel using this API. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.  [https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/delete-a-group-channel#1-delete-a-group-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/delete-a-group-channel#1-delete-a-group-channel)
   * @param channelUrl  (required)
   * @return deleteAGroupChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAGroupChannelRequest deleteAGroupChannel(String channelUrl) throws ApiException {
    return new APIdeleteAGroupChannelRequest(channelUrl);
  }

private ApiResponse<GetAGroupChannelResponse> getAGroupChannelWithHttpInfo(String channelUrl, Boolean showDeliveryReceipt, Boolean showReadReceipt, Boolean showMember, String memberActiveMode, String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling getAGroupChannel");
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "member_active_mode", memberActiveMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

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

    GenericType<GetAGroupChannelResponse> localVarReturnType = new GenericType<GetAGroupChannelResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.getAGroupChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetAGroupChannelRequest {
    private String channelUrl;
    private Boolean showDeliveryReceipt;
    private Boolean showReadReceipt;
    private Boolean showMember;
    private String memberActiveMode;
    private String userId;
    private String apiToken;

    private APIgetAGroupChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set showDeliveryReceipt
     * @param showDeliveryReceipt  (optional)
     * @return APIgetAGroupChannelRequest
     */
    public APIgetAGroupChannelRequest showDeliveryReceipt(Boolean showDeliveryReceipt) {
      this.showDeliveryReceipt = showDeliveryReceipt;
      return this;
    }

    /**
     * Set showReadReceipt
     * @param showReadReceipt  (optional)
     * @return APIgetAGroupChannelRequest
     */
    public APIgetAGroupChannelRequest showReadReceipt(Boolean showReadReceipt) {
      this.showReadReceipt = showReadReceipt;
      return this;
    }

    /**
     * Set showMember
     * @param showMember  (optional)
     * @return APIgetAGroupChannelRequest
     */
    public APIgetAGroupChannelRequest showMember(Boolean showMember) {
      this.showMember = showMember;
      return this;
    }

    /**
     * Set memberActiveMode
     * @param memberActiveMode Restricts the member list to members who are activated or deactivated in the channel. This parameter is only effective if the parameter show_member is true. Acceptable values are all, activated, and deactivated. (default: all) (optional)
     * @return APIgetAGroupChannelRequest
     */
    public APIgetAGroupChannelRequest memberActiveMode(String memberActiveMode) {
      this.memberActiveMode = memberActiveMode;
      return this;
    }

    /**
     * Set userId
     * @param userId  (optional)
     * @return APIgetAGroupChannelRequest
     */
    public APIgetAGroupChannelRequest userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetAGroupChannelRequest
     */
    public APIgetAGroupChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getAGroupChannel request
     * @return GetAGroupChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetAGroupChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAGroupChannel request with HTTP info returned
     * @return ApiResponse&lt;GetAGroupChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetAGroupChannelResponse> executeWithHttpInfo() throws ApiException {
      return getAGroupChannelWithHttpInfo(channelUrl, showDeliveryReceipt, showReadReceipt, showMember, memberActiveMode, userId, apiToken);
    }
  }

  /**
   * Get a group channel
   * ## Get a group channel  This action retrieves information about a specific [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel). You can use the optional query parameters to determine whether to include delivery receipt, read receipt, or member information in the response.  https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/get-a-group-channel#1-get-a-group-channel  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to retrieve.
   * @param channelUrl  (required)
   * @return getAGroupChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetAGroupChannelRequest getAGroupChannel(String channelUrl) throws ApiException {
    return new APIgetAGroupChannelRequest(channelUrl);
  }

private ApiResponse<Object> hideAChannelWithHttpInfo(String channelUrl, String apiToken, HideAChannelRequest hideAChannelRequest) throws ApiException {
    Object localVarPostBody = hideAChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling hideAChannel");
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

    return apiClient.invokeAPI("GroupChannelApi.hideAChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIhideAChannelRequest {
    private String channelUrl;
    private String apiToken;
    private HideAChannelRequest hideAChannelRequest;

    private APIhideAChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIhideAChannelRequest
     */
    public APIhideAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set hideAChannelRequest
     * @param hideAChannelRequest  (optional)
     * @return APIhideAChannelRequest
     */
    public APIhideAChannelRequest hideAChannelRequest(HideAChannelRequest hideAChannelRequest) {
      this.hideAChannelRequest = hideAChannelRequest;
      return this;
    }

    /**
     * Execute hideAChannel request
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
     * Execute hideAChannel request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return hideAChannelWithHttpInfo(channelUrl, apiToken, hideAChannelRequest);
    }
  }

  /**
   * Hide a channel
   * ## Hide a channel  This action allows you to hide a [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) from a user&#39;s channel list. Hiding a channel gives users the ability to archive channels so that they can focus on channels that need the most attention.  With this API, you can allow users to hide a channel from themselves or from all channel members. You can also determine whether to have the channel remain hidden when a new message is sent to the channel. Note that only group channels can be hidden.  [https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/hide-a-channel#1-hide-a-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/hide-a-channel#1-hide-a-channel)
   * @param channelUrl (Required)  (required)
   * @return hideAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIhideAChannelRequest hideAChannel(String channelUrl) throws ApiException {
    return new APIhideAChannelRequest(channelUrl);
  }

private ApiResponse<InviteAsMembersResponse> inviteAsMembersWithHttpInfo(String channelUrl, String apiToken, InviteAsMembersRequest inviteAsMembersRequest) throws ApiException {
    Object localVarPostBody = inviteAsMembersRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling inviteAsMembers");
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

    GenericType<InviteAsMembersResponse> localVarReturnType = new GenericType<InviteAsMembersResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.inviteAsMembers", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIinviteAsMembersRequest {
    private String channelUrl;
    private String apiToken;
    private InviteAsMembersRequest inviteAsMembersRequest;

    private APIinviteAsMembersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIinviteAsMembersRequest
     */
    public APIinviteAsMembersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set inviteAsMembersRequest
     * @param inviteAsMembersRequest  (optional)
     * @return APIinviteAsMembersRequest
     */
    public APIinviteAsMembersRequest inviteAsMembersRequest(InviteAsMembersRequest inviteAsMembersRequest) {
      this.inviteAsMembersRequest = inviteAsMembersRequest;
      return this;
    }

    /**
     * Execute inviteAsMembers request
     * @return InviteAsMembersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public InviteAsMembersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute inviteAsMembers request with HTTP info returned
     * @return ApiResponse&lt;InviteAsMembersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<InviteAsMembersResponse> executeWithHttpInfo() throws ApiException {
      return inviteAsMembersWithHttpInfo(channelUrl, apiToken, inviteAsMembersRequest);
    }
  }

  /**
   * Invite as members
   * ## Invite as members  Invites one or more users as members to a group channel. Users can join a group channel immediately after receiving an invitation, without having to accept it. To give users an option to accept or decline an invitation, see [update default channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/setting-up-channels/update-default-invitation-preference) or [update channel invitation preference](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-channel-invitation-preference). See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.  &gt; **Note**: By default, [blocked users](https://sendbird.com/docs/chat/platform-api/v3/moderation/blocking-users/block-users) are included when sending invitations. If you wish to exclude blocked users, [contact our sales team](https://get.sendbird.com/talk-to-sales.html).      [https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel#1-invite-as-members](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel#1-invite-as-members)
   * @param channelUrl (Required)  (required)
   * @return inviteAsMembersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIinviteAsMembersRequest inviteAsMembers(String channelUrl) throws ApiException {
    return new APIinviteAsMembersRequest(channelUrl);
  }

private ApiResponse<SendbirdGroupChannelDetail> joinAChannelWithHttpInfo(String channelUrl, String apiToken, JoinAChannelRequest joinAChannelRequest) throws ApiException {
    Object localVarPostBody = joinAChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling joinAChannel");
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

    return apiClient.invokeAPI("GroupChannelApi.joinAChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIjoinAChannelRequest {
    private String channelUrl;
    private String apiToken;
    private JoinAChannelRequest joinAChannelRequest;

    private APIjoinAChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIjoinAChannelRequest
     */
    public APIjoinAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set joinAChannelRequest
     * @param joinAChannelRequest  (optional)
     * @return APIjoinAChannelRequest
     */
    public APIjoinAChannelRequest joinAChannelRequest(JoinAChannelRequest joinAChannelRequest) {
      this.joinAChannelRequest = joinAChannelRequest;
      return this;
    }

    /**
     * Execute joinAChannel request
     * @return SendbirdGroupChannelDetail
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Join a channel </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdGroupChannelDetail execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute joinAChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdGroupChannelDetail&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Join a channel </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdGroupChannelDetail> executeWithHttpInfo() throws ApiException {
      return joinAChannelWithHttpInfo(channelUrl, apiToken, joinAChannelRequest);
    }
  }

  /**
   * Join a channel
   * ## Join a channel  This API allows a user to join a [public](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#4-group-channel-types) group channel. Users can only join public group channels where the &#x60;is_public&#x60; property is set to &#x60;true&#x60; using this API. A single user can join up to 2,000 group channels, and a user who reaches the capacity can’t join a new channel. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.  [https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/join-a-channel#1-join-a-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/join-a-channel#1-join-a-channel)
   * @param channelUrl (Required)  (required)
   * @return joinAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIjoinAChannelRequest joinAChannel(String channelUrl) throws ApiException {
    return new APIjoinAChannelRequest(channelUrl);
  }

private ApiResponse<Object> leaveAChannelWithHttpInfo(String channelUrl, String apiToken, LeaveAChannelRequest leaveAChannelRequest) throws ApiException {
    Object localVarPostBody = leaveAChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling leaveAChannel");
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("GroupChannelApi.leaveAChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIleaveAChannelRequest {
    private String channelUrl;
    private String apiToken;
    private LeaveAChannelRequest leaveAChannelRequest;

    private APIleaveAChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIleaveAChannelRequest
     */
    public APIleaveAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set leaveAChannelRequest
     * @param leaveAChannelRequest  (optional)
     * @return APIleaveAChannelRequest
     */
    public APIleaveAChannelRequest leaveAChannelRequest(LeaveAChannelRequest leaveAChannelRequest) {
      this.leaveAChannelRequest = leaveAChannelRequest;
      return this;
    }

    /**
     * Execute leaveAChannel request
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
     * Execute leaveAChannel request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return leaveAChannelWithHttpInfo(channelUrl, apiToken, leaveAChannelRequest);
    }
  }

  /**
   * Leave a channel
   * ## Leave a channel  Makes one or more members leave a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-leave-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return leaveAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIleaveAChannelRequest leaveAChannel(String channelUrl) throws ApiException {
    return new APIleaveAChannelRequest(channelUrl);
  }

private ApiResponse<GroupChatListChannelsResponse> listChannelsWithHttpInfo(String apiToken, String token, Integer limit, String distinctMode, String publicMode, String superMode, Long createdAfter, Long createdBefore, Boolean showEmpty, Boolean showMember, Boolean showDeliveryReceipt, Boolean showReadReceipt, Boolean showMetadata, Boolean showFrozen, String order, String metadataOrderKey, String customTypes, String customTypeStartswith, String channelUrls, String name, String nameContains, String nameStartswith, String membersExactlyIn, String membersIncludeIn, String queryType, String membersNickname, String membersNicknameContains, String metadataKey, String metadataValues, String metadataValueStartswith, String metacounterKey, String metacounterValues, String metacounterValueGt, String metacounterValueGte, String metacounterValueLt, String metacounterValueLte, Boolean includeSortedMetaarrayInLastMessage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listChannels");
    }
    
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

    GenericType<GroupChatListChannelsResponse> localVarReturnType = new GenericType<GroupChatListChannelsResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.listChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistChannelsRequest {
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

    private APIlistChannelsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token Specifies a page token that indicates the starting index of a chunk of results. If not specified, the index is set as 0. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10) (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set distinctMode
     * @param distinctMode  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest distinctMode(String distinctMode) {
      this.distinctMode = distinctMode;
      return this;
    }

    /**
     * Set publicMode
     * @param publicMode  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest publicMode(String publicMode) {
      this.publicMode = publicMode;
      return this;
    }

    /**
     * Set superMode
     * @param superMode  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest superMode(String superMode) {
      this.superMode = superMode;
      return this;
    }

    /**
     * Set createdAfter
     * @param createdAfter Restricts the search scope to only retrieve group channels which have been created after the specified time, in Unix milliseconds format. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest createdAfter(Long createdAfter) {
      this.createdAfter = createdAfter;
      return this;
    }

    /**
     * Set createdBefore
     * @param createdBefore Restricts the search scope to only retrieve group channels which have been created before the specified time, in Unix milliseconds format. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest createdBefore(Long createdBefore) {
      this.createdBefore = createdBefore;
      return this;
    }

    /**
     * Set showEmpty
     * @param showEmpty  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest showEmpty(Boolean showEmpty) {
      this.showEmpty = showEmpty;
      return this;
    }

    /**
     * Set showMember
     * @param showMember  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest showMember(Boolean showMember) {
      this.showMember = showMember;
      return this;
    }

    /**
     * Set showDeliveryReceipt
     * @param showDeliveryReceipt  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest showDeliveryReceipt(Boolean showDeliveryReceipt) {
      this.showDeliveryReceipt = showDeliveryReceipt;
      return this;
    }

    /**
     * Set showReadReceipt
     * @param showReadReceipt  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest showReadReceipt(Boolean showReadReceipt) {
      this.showReadReceipt = showReadReceipt;
      return this;
    }

    /**
     * Set showMetadata
     * @param showMetadata  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest showMetadata(Boolean showMetadata) {
      this.showMetadata = showMetadata;
      return this;
    }

    /**
     * Set showFrozen
     * @param showFrozen  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest showFrozen(Boolean showFrozen) {
      this.showFrozen = showFrozen;
      return this;
    }

    /**
     * Set order
     * @param order  (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set metadataOrderKey
     * @param metadataOrderKey Specifies the key of an item in metadata. When a value of the order parameter is set to metadata_value_alphabetical, the results are alphabetically sorted by the value of the item specified by the key. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metadataOrderKey(String metadataOrderKey) {
      this.metadataOrderKey = metadataOrderKey;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes Specifies a comma-separated string of one or more custom types to filter group channels. URL encoding each type is recommended. If not specified, all channels are returned, regardless of their custom type. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set customTypeStartswith
     * @param customTypeStartswith Searches for group channels with the custom type which starts with the specified value. URL encoding the value is recommended. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest customTypeStartswith(String customTypeStartswith) {
      this.customTypeStartswith = customTypeStartswith;
      return this;
    }

    /**
     * Set channelUrls
     * @param channelUrls Specifies a comma-separated string of one or more group channel URLs to restrict the search scope. URL encoding each channel URL is recommended. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest channelUrls(String channelUrls) {
      this.channelUrls = channelUrls;
      return this;
    }

    /**
     * Set name
     * @param name Specifies one or more group channel names. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set nameContains
     * @param nameContains Searches for group channels whose names contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest nameContains(String nameContains) {
      this.nameContains = nameContains;
      return this;
    }

    /**
     * Set nameStartswith
     * @param nameStartswith Searches for group channels whose names start with the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest nameStartswith(String nameStartswith) {
      this.nameStartswith = nameStartswith;
      return this;
    }

    /**
     * Set membersExactlyIn
     * @param membersExactlyIn Searches for group channels with all the specified users as members. The parameter value should consist of user IDs separated by commas.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest membersExactlyIn(String membersExactlyIn) {
      this.membersExactlyIn = membersExactlyIn;
      return this;
    }

    /**
     * Set membersIncludeIn
     * @param membersIncludeIn Searches for group channels that include one or more users as members among the specified users. The value should consist of user IDs separated by commas or %2C. You can specify up to 60 user IDs.  Only user IDs that match those of existing users are used for channel search. URL encoding each ID is recommended. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest membersIncludeIn(String membersIncludeIn) {
      this.membersIncludeIn = membersIncludeIn;
      return this;
    }

    /**
     * Set queryType
     * @param queryType Specifies a logical condition applied to the members_include_in parameter. Acceptable values are either AND or OR. For example, if you specify three members, A, B, and C, in members_include_in, the value of AND returns all channels that include every one of {A. B, C} as members. The value of OR returns channels that include {A}, plus those that include {B}, plus those that include {C}. (Default: AND) (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest queryType(String queryType) {
      this.queryType = queryType;
      return this;
    }

    /**
     * Set membersNickname
     * @param membersNickname Searches for group channels with members whose nicknames match the specified value. URL encoding the value is recommended. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest membersNickname(String membersNickname) {
      this.membersNickname = membersNickname;
      return this;
    }

    /**
     * Set membersNicknameContains
     * @param membersNicknameContains Searches for group channels with members whose nicknames contain the specified value. Note that this parameter is case-insensitive. URL encoding the value is recommended.  * We recommend using at least three characters for the parameter value for better search efficiency when you design and implement related features. If you would like to allow one or two characters for searching, use members_nickname instead to prevent performance issues. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest membersNicknameContains(String membersNicknameContains) {
      this.membersNicknameContains = membersNicknameContains;
      return this;
    }

    /**
     * Set metadataKey
     * @param metadataKey Searches for group channels with metadata containing an item with the specified value as its key. To use this parameter, either the metadata_values parameter or the metadata_value_startswith parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metadataKey(String metadataKey) {
      this.metadataKey = metadataKey;
      return this;
    }

    /**
     * Set metadataValues
     * @param metadataValues Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the value of that item matches one or more values specified by this parameter. The string should be specified with multiple values separated by commas. URL encoding each value is recommended. To use this parameter, the metadata_key parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metadataValues(String metadataValues) {
      this.metadataValues = metadataValues;
      return this;
    }

    /**
     * Set metadataValueStartswith
     * @param metadataValueStartswith Searches for group channels with metadata containing an item with the key specified by the metadata_key parameter, and the values of that item that start with the specified value of this parameter. URL encoding the value is recommended. To use this parameter, the metadata_key parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metadataValueStartswith(String metadataValueStartswith) {
      this.metadataValueStartswith = metadataValueStartswith;
      return this;
    }

    /**
     * Set metacounterKey
     * @param metacounterKey Searches for group channels with metacounter containing an item with the specified value as its key. To use this parameter, either the metacounter_values parameter or one of the metacounter_value_gt, metacounter_value_gte, metacounter_value_lt, and metacounter_value_lte parameters should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metacounterKey(String metacounterKey) {
      this.metacounterKey = metacounterKey;
      return this;
    }

    /**
     * Set metacounterValues
     * @param metacounterValues Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is equal to one or more values specified by this parameter. The string should be specified with multiple values separated by commas. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metacounterValues(String metacounterValues) {
      this.metacounterValues = metacounterValues;
      return this;
    }

    /**
     * Set metacounterValueGt
     * @param metacounterValueGt Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metacounterValueGt(String metacounterValueGt) {
      this.metacounterValueGt = metacounterValueGt;
      return this;
    }

    /**
     * Set metacounterValueGte
     * @param metacounterValueGte Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is greater than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metacounterValueGte(String metacounterValueGte) {
      this.metacounterValueGte = metacounterValueGte;
      return this;
    }

    /**
     * Set metacounterValueLt
     * @param metacounterValueLt Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metacounterValueLt(String metacounterValueLt) {
      this.metacounterValueLt = metacounterValueLt;
      return this;
    }

    /**
     * Set metacounterValueLte
     * @param metacounterValueLte Searches for group channels with metacounter containing an item with the key specified by the metadata_key parameter, where the value of that item is lower than or equal to the value specified by this parameter. To use this parameter, the metacounter_key parameter should be specified. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest metacounterValueLte(String metacounterValueLte) {
      this.metacounterValueLte = metacounterValueLte;
      return this;
    }

    /**
     * Set includeSortedMetaarrayInLastMessage
     * @param includeSortedMetaarrayInLastMessage Determines whether to include the sorted_metaarray as one of the last_message’s properties in the response. (optional)
     * @return APIlistChannelsRequest
     */
    public APIlistChannelsRequest includeSortedMetaarrayInLastMessage(Boolean includeSortedMetaarrayInLastMessage) {
      this.includeSortedMetaarrayInLastMessage = includeSortedMetaarrayInLastMessage;
      return this;
    }

    /**
     * Execute listChannels request
     * @return GroupChatListChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GroupChatListChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listChannels request with HTTP info returned
     * @return ApiResponse&lt;GroupChatListChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GroupChatListChannelsResponse> executeWithHttpInfo() throws ApiException {
      return listChannelsWithHttpInfo(apiToken, token, limit, distinctMode, publicMode, superMode, createdAfter, createdBefore, showEmpty, showMember, showDeliveryReceipt, showReadReceipt, showMetadata, showFrozen, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, includeSortedMetaarrayInLastMessage);
    }
  }

  /**
   * List channels
   * ## List group channels  This action retrieves a list of [group channels](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel). You can use various query parameters to determine the search scope and select what kind of information you want to receive about the queried channels.  If you want to retrieve a list of group channels that a specific user has joined, use the [list group channels by user](https://sendbird.com/docs/chat/platform-api/v3/user/managing-joined-group-channels/list-group-channels-by-user) action under the User section.  https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-group-channels#1-list-group-channels
   * @return listChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistChannelsRequest listChannels() throws ApiException {
    return new APIlistChannelsRequest();
  }

private ApiResponse<GroupChannelListMembersResponse> listMembersWithHttpInfo(String channelUrl, String token, Integer limit, String userId, Boolean showDeliveryReceipt, Boolean showReadReceipt, Boolean showMemberIsMuted, String order, String operatorFilter, String memberStateFilter, String mutedMemberFilter, String memberActiveModeFilter, String nicknameStartswith, Boolean includePushPreference, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listMembers");
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_delivery_receipt", showDeliveryReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_read_receipt", showReadReceipt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_member_is_muted", showMemberIsMuted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operator_filter", operatorFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "member_state_filter", memberStateFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "muted_member_filter", mutedMemberFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "member_active_mode_filter", memberActiveModeFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname_startswith", nicknameStartswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_push_preference", includePushPreference));

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

    GenericType<GroupChannelListMembersResponse> localVarReturnType = new GenericType<GroupChannelListMembersResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.listMembers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistMembersRequest {
    private String channelUrl;
    private String token;
    private Integer limit;
    private String userId;
    private Boolean showDeliveryReceipt;
    private Boolean showReadReceipt;
    private Boolean showMemberIsMuted;
    private String order;
    private String operatorFilter;
    private String memberStateFilter;
    private String mutedMemberFilter;
    private String memberActiveModeFilter;
    private String nicknameStartswith;
    private Boolean includePushPreference;
    private String apiToken;

    private APIlistMembersRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10) (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set userId
     * @param userId Specifies the unique ID of a user. If &#x60;user_id&#x60; is provided, the response will include two additional boolean properties about each user in the members list. - &#x60;is_blocking_me&#x60;: Indicates whether the listed user is blocking the user specified in the user_id parameter. - &#x60;is_blocked_by_me&#x60;: Indicates whether the listed user is blocked by the user specified in the user_id parameter. (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set showDeliveryReceipt
     * @param showDeliveryReceipt  (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest showDeliveryReceipt(Boolean showDeliveryReceipt) {
      this.showDeliveryReceipt = showDeliveryReceipt;
      return this;
    }

    /**
     * Set showReadReceipt
     * @param showReadReceipt  (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest showReadReceipt(Boolean showReadReceipt) {
      this.showReadReceipt = showReadReceipt;
      return this;
    }

    /**
     * Set showMemberIsMuted
     * @param showMemberIsMuted  (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest showMemberIsMuted(Boolean showMemberIsMuted) {
      this.showMemberIsMuted = showMemberIsMuted;
      return this;
    }

    /**
     * Set order
     * @param order Specifies the method to sort a list of results. Acceptable values are the following: - &#x60;member_nickname_alphabetical&#x60; (default): sorts by the member nicknames in alphabetical order. - &#x60;operator_then_member_alphabetical&#x60;: sorts by the operational role and member nickname in alphabetical order where channel operators are listed before channel members. (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set operatorFilter
     * @param operatorFilter Restricts the search scope to only retrieve operators or non-operator members of the channel. Acceptable values are the following: - &#x60;all&#x60; (default): no filter is applied to the list. - &#x60;operator&#x60;: only channel operators are retrieved. - &#x60;nonoperator&#x60;: all channel members, except channel operators, are retrieved. (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest operatorFilter(String operatorFilter) {
      this.operatorFilter = operatorFilter;
      return this;
    }

    /**
     * Set memberStateFilter
     * @param memberStateFilter Restricts the search scope to retrieve members based on if they have accepted an invitation or if they were invited by a friend. Acceptable values are &#x60;invited_only&#x60;, &#x60;joined_only&#x60;, &#x60;invited_by_friend&#x60;, &#x60;invited_by_non_friend&#x60;, and &#x60;all&#x60;. (Default: &#x60;all&#x60;) (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest memberStateFilter(String memberStateFilter) {
      this.memberStateFilter = memberStateFilter;
      return this;
    }

    /**
     * Set mutedMemberFilter
     * @param mutedMemberFilter Restricts the search scope to retrieve members who are muted or unmuted in the channel. Acceptable values are &#x60;all&#x60;, &#x60;muted&#x60;, and &#x60;unmuted&#x60;. (Default: &#x60;all&#x60;) (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest mutedMemberFilter(String mutedMemberFilter) {
      this.mutedMemberFilter = mutedMemberFilter;
      return this;
    }

    /**
     * Set memberActiveModeFilter
     * @param memberActiveModeFilter Restricts the search scope to retrieve members who are activated or deactivated in the channel. Acceptable values are &#x60;all&#x60;, &#x60;activated&#x60;, and &#x60;deactivated&#x60;. (default: &#x60;activated&#x60;) (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest memberActiveModeFilter(String memberActiveModeFilter) {
      this.memberActiveModeFilter = memberActiveModeFilter;
      return this;
    }

    /**
     * Set nicknameStartswith
     * @param nicknameStartswith Searches for members whose nicknames start with the specified value. Urlencoding the value is recommended. (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest nicknameStartswith(String nicknameStartswith) {
      this.nicknameStartswith = nicknameStartswith;
      return this;
    }

    /**
     * Set includePushPreference
     * @param includePushPreference Determines whether to include information about the push preference of each member, such as &#x60;push_enabled&#x60;, &#x60;push_trigger_option&#x60;, and &#x60;do_not_disturb&#x60;. (Default: &#x60;false&#x60;) (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest includePushPreference(Boolean includePushPreference) {
      this.includePushPreference = includePushPreference;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistMembersRequest
     */
    public APIlistMembersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listMembers request
     * @return GroupChannelListMembersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GroupChannelListMembersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMembers request with HTTP info returned
     * @return ApiResponse&lt;GroupChannelListMembersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GroupChannelListMembersResponse> executeWithHttpInfo() throws ApiException {
      return listMembersWithHttpInfo(channelUrl, token, limit, userId, showDeliveryReceipt, showReadReceipt, showMemberIsMuted, order, operatorFilter, memberStateFilter, mutedMemberFilter, memberActiveModeFilter, nicknameStartswith, includePushPreference, apiToken);
    }
  }

  /**
   * List members
   * ## List members  Retrieves a list of members of a group channel.  &gt; **Note**: See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.      [https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/list-members-of-a-group-channel#1-list-members-of-a-group-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-users/list-members-of-a-group-channel#1-list-members-of-a-group-channel)  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to retrieve a list of members of.
   * @param channelUrl (Required)  (required)
   * @return listMembersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMembersRequest listMembers(String channelUrl) throws ApiException {
    return new APIlistMembersRequest(channelUrl);
  }

private ApiResponse<ListOperatorsResponse> listOperatorsWithHttpInfo(String channelUrl, String token, Integer limit, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listOperators");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ListOperatorsResponse> localVarReturnType = new GenericType<ListOperatorsResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.listOperators", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistOperatorsRequest {
    private String channelUrl;
    private String token;
    private Integer limit;
    private String apiToken;

    private APIlistOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistOperatorsRequest
     */
    public APIlistOperatorsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit Specifies the number of results to return per page. Acceptable values are 1 to 100, inclusive. (Default: 10) (optional)
     * @return APIlistOperatorsRequest
     */
    public APIlistOperatorsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistOperatorsRequest
     */
    public APIlistOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listOperators request
     * @return ListOperatorsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListOperatorsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listOperators request with HTTP info returned
     * @return ApiResponse&lt;ListOperatorsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListOperatorsResponse> executeWithHttpInfo() throws ApiException {
      return listOperatorsWithHttpInfo(channelUrl, token, limit, apiToken);
    }
  }

  /**
   * List operators
   * ## List operators  You can retrieve a list of operators of a group channel using this API.  https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/list-operators-of-a-group-channel#1-list-operators-of-a-group-channel  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to retrieve a list of operators.
   * @param channelUrl (Required)  (required)
   * @return listOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistOperatorsRequest listOperators(String channelUrl) throws ApiException {
    return new APIlistOperatorsRequest(channelUrl);
  }

private ApiResponse<Object> registerOperatorsToAGroupChannelWithHttpInfo(String channelUrl, String apiToken, RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest) throws ApiException {
    Object localVarPostBody = registerOperatorsToAGroupChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling registerOperatorsToAGroupChannel");
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

    return apiClient.invokeAPI("GroupChannelApi.registerOperatorsToAGroupChannel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIregisterOperatorsToAGroupChannelRequest {
    private String channelUrl;
    private String apiToken;
    private RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest;

    private APIregisterOperatorsToAGroupChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIregisterOperatorsToAGroupChannelRequest
     */
    public APIregisterOperatorsToAGroupChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set registerOperatorsToAGroupChannelRequest
     * @param registerOperatorsToAGroupChannelRequest  (optional)
     * @return APIregisterOperatorsToAGroupChannelRequest
     */
    public APIregisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest(RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest) {
      this.registerOperatorsToAGroupChannelRequest = registerOperatorsToAGroupChannelRequest;
      return this;
    }

    /**
     * Execute registerOperatorsToAGroupChannel request
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
     * Execute registerOperatorsToAGroupChannel request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return registerOperatorsToAGroupChannelWithHttpInfo(channelUrl, apiToken, registerOperatorsToAGroupChannelRequest);
    }
  }

  /**
   * Register operators to a group channel
   * ## Register operators to a group channel  You can register one or more operators to a group channel using this API.  https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/register-operators-to-a-group-channel#1-register-operators-to-a-group-channel
   * @param channelUrl (Required)  (required)
   * @return registerOperatorsToAGroupChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIregisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannel(String channelUrl) throws ApiException {
    return new APIregisterOperatorsToAGroupChannelRequest(channelUrl);
  }

private ApiResponse<ResetChatHistoryResponse> resetChatHistoryWithHttpInfo(String channelUrl, String apiToken, ResetChatHistoryRequest resetChatHistoryRequest) throws ApiException {
    Object localVarPostBody = resetChatHistoryRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling resetChatHistory");
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

    GenericType<ResetChatHistoryResponse> localVarReturnType = new GenericType<ResetChatHistoryResponse>() {};

    return apiClient.invokeAPI("GroupChannelApi.resetChatHistory", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIresetChatHistoryRequest {
    private String channelUrl;
    private String apiToken;
    private ResetChatHistoryRequest resetChatHistoryRequest;

    private APIresetChatHistoryRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIresetChatHistoryRequest
     */
    public APIresetChatHistoryRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set resetChatHistoryRequest
     * @param resetChatHistoryRequest  (optional)
     * @return APIresetChatHistoryRequest
     */
    public APIresetChatHistoryRequest resetChatHistoryRequest(ResetChatHistoryRequest resetChatHistoryRequest) {
      this.resetChatHistoryRequest = resetChatHistoryRequest;
      return this;
    }

    /**
     * Execute resetChatHistory request
     * @return ResetChatHistoryResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ResetChatHistoryResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute resetChatHistory request with HTTP info returned
     * @return ApiResponse&lt;ResetChatHistoryResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ResetChatHistoryResponse> executeWithHttpInfo() throws ApiException {
      return resetChatHistoryWithHttpInfo(channelUrl, apiToken, resetChatHistoryRequest);
    }
  }

  /**
   * Reset chat history
   * ## Reset chat history  This action resets the properties related to a specific user&#39;s chat history in a [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel), clearing existing messages in a channel from only the specified user&#39;s end. Because this action doesn&#39;t delete messages from the Sendbird database, other members in the channel can still retrieve and see the messages.  This action clears the messages for the specified user by updating the &#x60;last_message&#x60; and &#x60;read_receipt&#x60; properties of the [group channel resource](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#4-list-of-properties-for-group-channels) in addition to other internally managed data such as the count of a user&#39;s unread messages.  Using the &#x60;reset_all&#x60; property, you can also reset the properties related to the chat history of all members in a group channel.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/reset-chat-history#1-reset-chat-history
   * @param channelUrl (Required)  (required)
   * @return resetChatHistoryRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIresetChatHistoryRequest resetChatHistory(String channelUrl) throws ApiException {
    return new APIresetChatHistoryRequest(channelUrl);
  }

private ApiResponse<Object> startTypingIndicatorsWithHttpInfo(String channelUrl, String apiToken, StartTypingIndicatorsRequest startTypingIndicatorsRequest) throws ApiException {
    Object localVarPostBody = startTypingIndicatorsRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling startTypingIndicators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/typing"
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("GroupChannelApi.startTypingIndicators", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIstartTypingIndicatorsRequest {
    private String channelUrl;
    private String apiToken;
    private StartTypingIndicatorsRequest startTypingIndicatorsRequest;

    private APIstartTypingIndicatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIstartTypingIndicatorsRequest
     */
    public APIstartTypingIndicatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set startTypingIndicatorsRequest
     * @param startTypingIndicatorsRequest  (optional)
     * @return APIstartTypingIndicatorsRequest
     */
    public APIstartTypingIndicatorsRequest startTypingIndicatorsRequest(StartTypingIndicatorsRequest startTypingIndicatorsRequest) {
      this.startTypingIndicatorsRequest = startTypingIndicatorsRequest;
      return this;
    }

    /**
     * Execute startTypingIndicators request
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
     * Execute startTypingIndicators request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return startTypingIndicatorsWithHttpInfo(channelUrl, apiToken, startTypingIndicatorsRequest);
    }
  }

  /**
   * Start typing indicators
   * ## Start typing indicators  You can start showing a typing indicator using this API. Seeing whether other users are typing can help a more interactive conversation environment by showing real-time engagement of other users.  If you&#39;re looking for an easy way to show typing indicators on your app, check out Sendbird UIKit for a ready-to-use UI feature that can be customized to fit your needs.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-typing-indicators/start-typing-indicators#1-start-typing-indicators  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to set typing indicators.
   * @param channelUrl (Required)  (required)
   * @return startTypingIndicatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIstartTypingIndicatorsRequest startTypingIndicators(String channelUrl) throws ApiException {
    return new APIstartTypingIndicatorsRequest(channelUrl);
  }

private ApiResponse<Object> stopTypingIndicatorsWithHttpInfo(String channelUrl, String apiToken, StartTypingIndicatorsRequest startTypingIndicatorsRequest) throws ApiException {
    Object localVarPostBody = startTypingIndicatorsRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling stopTypingIndicators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/typing"
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("GroupChannelApi.stopTypingIndicators", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIstopTypingIndicatorsRequest {
    private String channelUrl;
    private String apiToken;
    private StartTypingIndicatorsRequest startTypingIndicatorsRequest;

    private APIstopTypingIndicatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIstopTypingIndicatorsRequest
     */
    public APIstopTypingIndicatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set startTypingIndicatorsRequest
     * @param startTypingIndicatorsRequest  (optional)
     * @return APIstopTypingIndicatorsRequest
     */
    public APIstopTypingIndicatorsRequest startTypingIndicatorsRequest(StartTypingIndicatorsRequest startTypingIndicatorsRequest) {
      this.startTypingIndicatorsRequest = startTypingIndicatorsRequest;
      return this;
    }

    /**
     * Execute stopTypingIndicators request
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
     * Execute stopTypingIndicators request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return stopTypingIndicatorsWithHttpInfo(channelUrl, apiToken, startTypingIndicatorsRequest);
    }
  }

  /**
   * Stop typing indicators
   * ## Stop typing indicators  You can stop showing a typing indicator using this API. To signal that a user is no longer typing, you can let the indicator disappear when the user sends a message or completely deletes the message text.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-typing-indicators/stop-typing-indicators#1-stop-typing-indicators  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to set typing indicators.
   * @param channelUrl (Required)  (required)
   * @return stopTypingIndicatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIstopTypingIndicatorsRequest stopTypingIndicators(String channelUrl) throws ApiException {
    return new APIstopTypingIndicatorsRequest(channelUrl);
  }

private ApiResponse<Object> unhideAChannelWithHttpInfo(String channelUrl, String userId, Boolean shouldUnhideAll, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling unhideAChannel");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling unhideAChannel");
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

    return apiClient.invokeAPI("GroupChannelApi.unhideAChannel", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIunhideAChannelRequest {
    private String channelUrl;
    private String userId;
    private Boolean shouldUnhideAll;
    private String apiToken;

    private APIunhideAChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set userId
     * @param userId (Required)  (required)
     * @return APIunhideAChannelRequest
     */
    public APIunhideAChannelRequest userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set shouldUnhideAll
     * @param shouldUnhideAll  (optional)
     * @return APIunhideAChannelRequest
     */
    public APIunhideAChannelRequest shouldUnhideAll(Boolean shouldUnhideAll) {
      this.shouldUnhideAll = shouldUnhideAll;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIunhideAChannelRequest
     */
    public APIunhideAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute unhideAChannel request
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
     * Execute unhideAChannel request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return unhideAChannelWithHttpInfo(channelUrl, userId, shouldUnhideAll, apiToken);
    }
  }

  /**
   * Unhide a channel
   * ## Unhide a channel  This action lets a hidden [group channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-group-channel) reappear on the channel list of a specific user or every member in the group channel. Hiding or unhiding a channel lets users organize their channel list based on those that require the most attention. Note that only group channels can be hidden or unhidden.  [https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/unhide-a-channel#1-unhide-a-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/unhide-a-channel#1-unhide-a-channel)  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to unhide or unarchive.
   * @param channelUrl (Required)  (required)
   * @return unhideAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIunhideAChannelRequest unhideAChannel(String channelUrl) throws ApiException {
    return new APIunhideAChannelRequest(channelUrl);
  }

private ApiResponse<SendbirdGroupChannelDetail> updateAGroupChannelWithHttpInfo(String channelUrl, String apiToken, UpdateAGroupChannelRequest updateAGroupChannelRequest) throws ApiException {
    Object localVarPostBody = updateAGroupChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateAGroupChannel");
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

    return apiClient.invokeAPI("GroupChannelApi.updateAGroupChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateAGroupChannelRequest {
    private String channelUrl;
    private String apiToken;
    private UpdateAGroupChannelRequest updateAGroupChannelRequest;

    private APIupdateAGroupChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateAGroupChannelRequest
     */
    public APIupdateAGroupChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateAGroupChannelRequest
     * @param updateAGroupChannelRequest  (optional)
     * @return APIupdateAGroupChannelRequest
     */
    public APIupdateAGroupChannelRequest updateAGroupChannelRequest(UpdateAGroupChannelRequest updateAGroupChannelRequest) {
      this.updateAGroupChannelRequest = updateAGroupChannelRequest;
      return this;
    }

    /**
     * Execute updateAGroupChannel request
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
     * Execute updateAGroupChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdGroupChannelDetail&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdGroupChannelDetail> executeWithHttpInfo() throws ApiException {
      return updateAGroupChannelWithHttpInfo(channelUrl, apiToken, updateAGroupChannelRequest);
    }
  }

  /**
   * Update a group channel
   * ## Update a group channel  You can update information about a group channel or a Supergroup channel using this API. You can&#39;t make any changes to the members of a channel with this API. To change members, see [invite as members](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel) instead. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-a-group-channel#1-update-a-group-channel
   * @param channelUrl  (required)
   * @return updateAGroupChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAGroupChannelRequest updateAGroupChannel(String channelUrl) throws ApiException {
    return new APIupdateAGroupChannelRequest(channelUrl);
  }
}
