package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.AddExtraDataToAMessageRequest;
import org.openapitools.client.model.AddExtraDataToAMessageResponse;
import org.openapitools.client.model.GetTotalNumberOfMessagesInAChannelResponse;
import org.openapitools.client.model.ListMessagesResponse;
import org.openapitools.client.model.MarkChannelMessagesAsReadRequest;
import org.openapitools.client.model.MigrateMessagesRequest;
import org.openapitools.client.model.SendAMessageRequest;
import org.openapitools.client.model.SendbirdMessageResponse;
import org.openapitools.client.model.UpdateAMessageRequest;
import org.openapitools.client.model.UpdateExtraDataInAMessageRequest;
import org.openapitools.client.model.UpdateExtraDataInAMessageResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-16T11:20:47.026559+07:00[Asia/Jakarta]")
public class MessageApi {
  private ApiClient apiClient;

  public MessageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessageApi(ApiClient apiClient) {
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


private ApiResponse<AddExtraDataToAMessageResponse> addExtraDataToAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, AddExtraDataToAMessageRequest addExtraDataToAMessageRequest) throws ApiException {
    Object localVarPostBody = addExtraDataToAMessageRequest;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling addExtraDataToAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling addExtraDataToAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling addExtraDataToAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    GenericType<AddExtraDataToAMessageResponse> localVarReturnType = new GenericType<AddExtraDataToAMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.addExtraDataToAMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIaddExtraDataToAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private AddExtraDataToAMessageRequest addExtraDataToAMessageRequest;

    private APIaddExtraDataToAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddExtraDataToAMessageRequest
     */
    public APIaddExtraDataToAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addExtraDataToAMessageRequest
     * @param addExtraDataToAMessageRequest  (optional)
     * @return APIaddExtraDataToAMessageRequest
     */
    public APIaddExtraDataToAMessageRequest addExtraDataToAMessageRequest(AddExtraDataToAMessageRequest addExtraDataToAMessageRequest) {
      this.addExtraDataToAMessageRequest = addExtraDataToAMessageRequest;
      return this;
    }

    /**
     * Execute addExtraDataToAMessage request
     * @return AddExtraDataToAMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddExtraDataToAMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addExtraDataToAMessage request with HTTP info returned
     * @return ApiResponse&lt;AddExtraDataToAMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddExtraDataToAMessageResponse> executeWithHttpInfo() throws ApiException {
      return addExtraDataToAMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, addExtraDataToAMessageRequest);
    }
  }

  /**
   * Add extra data to a message
   * ## Add extra data to a message  Adds one or more key-values items which store additional information for a message.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/message-add-metadata#1-add-metadata ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @param messageId (Required)  (required)
   * @return addExtraDataToAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddExtraDataToAMessageRequest addExtraDataToAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIaddExtraDataToAMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<Object> deleteAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling deleteAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling deleteAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    return apiClient.invokeAPI("MessageApi.deleteAMessage", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;

    private APIdeleteAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteAMessageRequest
     */
    public APIdeleteAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteAMessage request
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
     * Execute deleteAMessage request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken);
    }
  }

  /**
   * Delete a message
   * ## Delete a message  Deletes a message from a channel.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/delete-a-message#1-delete-a-message ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @param messageId (Required)  (required)
   * @return deleteAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAMessageRequest deleteAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIdeleteAMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<SendbirdMessageResponse> getAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, Boolean includeReactions, Boolean includeThreadInfo, Boolean includeParentMessageInfo, Boolean includePollDetails, Boolean withSortedMetaArray, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling getAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling getAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling getAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_reactions", includeReactions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_thread_info", includeThreadInfo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_parent_message_info", includeParentMessageInfo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_poll_details", includePollDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_sorted_meta_array", withSortedMetaArray));

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

    GenericType<SendbirdMessageResponse> localVarReturnType = new GenericType<SendbirdMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.getAMessage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private Boolean includeReactions;
    private Boolean includeThreadInfo;
    private Boolean includeParentMessageInfo;
    private Boolean includePollDetails;
    private Boolean withSortedMetaArray;
    private String apiToken;

    private APIgetAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set includeReactions
     * @param includeReactions  (optional)
     * @return APIgetAMessageRequest
     */
    public APIgetAMessageRequest includeReactions(Boolean includeReactions) {
      this.includeReactions = includeReactions;
      return this;
    }

    /**
     * Set includeThreadInfo
     * @param includeThreadInfo  (optional)
     * @return APIgetAMessageRequest
     */
    public APIgetAMessageRequest includeThreadInfo(Boolean includeThreadInfo) {
      this.includeThreadInfo = includeThreadInfo;
      return this;
    }

    /**
     * Set includeParentMessageInfo
     * @param includeParentMessageInfo  (optional)
     * @return APIgetAMessageRequest
     */
    public APIgetAMessageRequest includeParentMessageInfo(Boolean includeParentMessageInfo) {
      this.includeParentMessageInfo = includeParentMessageInfo;
      return this;
    }

    /**
     * Set includePollDetails
     * @param includePollDetails Determines whether to include all properties of a poll resource with a full list of options in the results. If set to false, a selection of poll resource properties consisting of id, title, close_at, created_at, updated_at, status, and message_id are returned. (Default: false) * To use this property, the polls feature should be turned on in Settings &gt; Chat &gt; Features on Sendbird Dashboard. (optional)
     * @return APIgetAMessageRequest
     */
    public APIgetAMessageRequest includePollDetails(Boolean includePollDetails) {
      this.includePollDetails = includePollDetails;
      return this;
    }

    /**
     * Set withSortedMetaArray
     * @param withSortedMetaArray  (optional)
     * @return APIgetAMessageRequest
     */
    public APIgetAMessageRequest withSortedMetaArray(Boolean withSortedMetaArray) {
      this.withSortedMetaArray = withSortedMetaArray;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetAMessageRequest
     */
    public APIgetAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getAMessage request
     * @return SendbirdMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAMessage request with HTTP info returned
     * @return ApiResponse&lt;SendbirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return getAMessageWithHttpInfo(channelType, channelUrl, messageId, includeReactions, includeThreadInfo, includeParentMessageInfo, includePollDetails, withSortedMetaArray, apiToken);
    }
  }

  /**
   * Get a message
   * ## Get a message  Retrieves information on a specific message.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/get-a-message#1-get-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to retrieve.
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @param messageId (Required)  (required)
   * @return getAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetAMessageRequest getAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIgetAMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<GetTotalNumberOfMessagesInAChannelResponse> getTotalNumberOfMessagesInAChannelWithHttpInfo(String channelType, String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling getTotalNumberOfMessagesInAChannel");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling getTotalNumberOfMessagesInAChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/total_count"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
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

    GenericType<GetTotalNumberOfMessagesInAChannelResponse> localVarReturnType = new GenericType<GetTotalNumberOfMessagesInAChannelResponse>() {};

    return apiClient.invokeAPI("MessageApi.getTotalNumberOfMessagesInAChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetTotalNumberOfMessagesInAChannelRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;

    private APIgetTotalNumberOfMessagesInAChannelRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetTotalNumberOfMessagesInAChannelRequest
     */
    public APIgetTotalNumberOfMessagesInAChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getTotalNumberOfMessagesInAChannel request
     * @return GetTotalNumberOfMessagesInAChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetTotalNumberOfMessagesInAChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getTotalNumberOfMessagesInAChannel request with HTTP info returned
     * @return ApiResponse&lt;GetTotalNumberOfMessagesInAChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetTotalNumberOfMessagesInAChannelResponse> executeWithHttpInfo() throws ApiException {
      return getTotalNumberOfMessagesInAChannelWithHttpInfo(channelType, channelUrl, apiToken);
    }
  }

  /**
   * Get total number of messages in a channel
   * ## Get total number of messages in a channel  Retrieves the total number of messages in a specific channel.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/get-total-number-of-messages-in-a-channel#1-get-total-number-of-messages-in-a-channel ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return getTotalNumberOfMessagesInAChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetTotalNumberOfMessagesInAChannelRequest getTotalNumberOfMessagesInAChannel(String channelType, String channelUrl) throws ApiException {
    return new APIgetTotalNumberOfMessagesInAChannelRequest(channelType, channelUrl);
  }

private ApiResponse<ListMessagesResponse> listMessagesWithHttpInfo(String channelType, String channelUrl, Long messageTs, Long messageId, Integer prevLimit, Integer nextLimit, Boolean include, Boolean reverse, String senderId, String senderIds, String operatorFilter, String customTypes, String messageType, Boolean includingRemoved, Boolean includeReactions, String includeReplyType, Boolean includeParentMessageInfo, Boolean includeThreadInfo, Boolean includePollDetails, Boolean withSortedMetaArray, Boolean showSubchannelMessagesOnly, String userId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling listMessages");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listMessages");
    }
    
    // verify the required parameter 'messageTs' is set
    if (messageTs == null) {
      throw new ApiException(400, "Missing the required parameter 'messageTs' when calling listMessages");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling listMessages");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message_ts", messageTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message_id", messageId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "prev_limit", prevLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next_limit", nextLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sender_id", senderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sender_ids", senderIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operator_filter", operatorFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message_type", messageType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "including_removed", includingRemoved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_reactions", includeReactions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_reply_type", includeReplyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_parent_message_info", includeParentMessageInfo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_thread_info", includeThreadInfo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_poll_details", includePollDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_sorted_meta_array", withSortedMetaArray));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_subchannel_messages_only", showSubchannelMessagesOnly));
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

    GenericType<ListMessagesResponse> localVarReturnType = new GenericType<ListMessagesResponse>() {};

    return apiClient.invokeAPI("MessageApi.listMessages", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistMessagesRequest {
    private String channelType;
    private String channelUrl;
    private Long messageTs;
    private Long messageId;
    private Integer prevLimit;
    private Integer nextLimit;
    private Boolean include;
    private Boolean reverse;
    private String senderId;
    private String senderIds;
    private String operatorFilter;
    private String customTypes;
    private String messageType;
    private Boolean includingRemoved;
    private Boolean includeReactions;
    private String includeReplyType;
    private Boolean includeParentMessageInfo;
    private Boolean includeThreadInfo;
    private Boolean includePollDetails;
    private Boolean withSortedMetaArray;
    private Boolean showSubchannelMessagesOnly;
    private String userId;
    private String apiToken;

    private APIlistMessagesRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set messageTs
     * @param messageTs Specifies the timestamp to be the reference point of the query in Unix milliseconds. Either this or the message_id parameter below should be specified in your query URL to retrieve a list. It fetches messages that were sent prior to and after the specified message_ts and the default value for both prev_limit and next_limit is 15. (required)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest messageTs(Long messageTs) {
      this.messageTs = messageTs;
      return this;
    }

    /**
     * Set messageId
     * @param messageId Specifies the unique ID of the message to be the reference point of the query. Either this or the message_ts parameter above should be specified in your query URL to retrieve a list. It fetches messages that were sent prior to and after the specified message_id and the default value for both prev_limit and next_limit is 15. (required)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest messageId(Long messageId) {
      this.messageId = messageId;
      return this;
    }

    /**
     * Set prevLimit
     * @param prevLimit Specifies the number of previously sent messages to retrieve before message_ts. For example, if message_ts&#x3D;1484202848298, then prev_limit&#x3D;50 returns 50 messages sent by 1484202848297 (message_ts - 1). Acceptable values range from 0 to 200. (Default: 15) (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest prevLimit(Integer prevLimit) {
      this.prevLimit = prevLimit;
      return this;
    }

    /**
     * Set nextLimit
     * @param nextLimit Specifies the number of sent messages to retrieve after message_ts. For example, if message_ts&#x3D;1484202848298, then next_limit&#x3D;50 returns 50 messages sent from 1484202848299 (message_ts + 1). Acceptable values range from 0 to 200. (Default: 15) (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest nextLimit(Integer nextLimit) {
      this.nextLimit = nextLimit;
      return this;
    }

    /**
     * Set include
     * @param include Determines whether to include messages sent exactly on the specified message_ts in the results. (Default: true) (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest include(Boolean include) {
      this.include = include;
      return this;
    }

    /**
     * Set reverse
     * @param reverse Determines whether to sort the results in reverse chronological order. If set to true, messages appear in reverse chronological order where the newest comes first and the oldest last. (Default: false) (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest reverse(Boolean reverse) {
      this.reverse = reverse;
      return this;
    }

    /**
     * Set senderId
     * @param senderId Restricts the search scope to only retrieve messages sent by the user with the specified ID. (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest senderId(String senderId) {
      this.senderId = senderId;
      return this;
    }

    /**
     * Set senderIds
     * @param senderIds Restricts the search scope to only retrieve messages sent by one or more users with the specified IDs listed in a comma-separated string. (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest senderIds(String senderIds) {
      this.senderIds = senderIds;
      return this;
    }

    /**
     * Set operatorFilter
     * @param operatorFilter  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest operatorFilter(String operatorFilter) {
      this.operatorFilter = operatorFilter;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes Specifies a comma-separated string of one or more custom message types to retrieve. The value set to this parameter can serve as a filter as follows: - A string of specific custom types: Messages with the corresponding custom types are returned. - Empty like &amp;custom_types&#x3D;&amp;...: Messages whose custom_type property is empty or has a value of null are returned. - An asterisk (\\*) (default): All messages are returned regardless of their custom_type. (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set messageType
     * @param messageType  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest messageType(String messageType) {
      this.messageType = messageType;
      return this;
    }

    /**
     * Set includingRemoved
     * @param includingRemoved  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest includingRemoved(Boolean includingRemoved) {
      this.includingRemoved = includingRemoved;
      return this;
    }

    /**
     * Set includeReactions
     * @param includeReactions  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest includeReactions(Boolean includeReactions) {
      this.includeReactions = includeReactions;
      return this;
    }

    /**
     * Set includeReplyType
     * @param includeReplyType One of following values: NONE, ALL, ONLY_REPLY_TO_CHANNEL (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest includeReplyType(String includeReplyType) {
      this.includeReplyType = includeReplyType;
      return this;
    }

    /**
     * Set includeParentMessageInfo
     * @param includeParentMessageInfo  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest includeParentMessageInfo(Boolean includeParentMessageInfo) {
      this.includeParentMessageInfo = includeParentMessageInfo;
      return this;
    }

    /**
     * Set includeThreadInfo
     * @param includeThreadInfo  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest includeThreadInfo(Boolean includeThreadInfo) {
      this.includeThreadInfo = includeThreadInfo;
      return this;
    }

    /**
     * Set includePollDetails
     * @param includePollDetails Determines whether to include all properties of a poll resource with a full list of options in the results. If set to false, a selection of poll resource properties consisting of id, title, close_at, created_at, updated_at, status, and message_id are returned. (Default: false) * To use this property, the polls feature should be turned on in Settings &gt; Chat &gt; Features on Sendbird Dashboard. (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest includePollDetails(Boolean includePollDetails) {
      this.includePollDetails = includePollDetails;
      return this;
    }

    /**
     * Set withSortedMetaArray
     * @param withSortedMetaArray Determines whether to include the sorted_metaarray property in the response. (Default: false) (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest withSortedMetaArray(Boolean withSortedMetaArray) {
      this.withSortedMetaArray = withSortedMetaArray;
      return this;
    }

    /**
     * Set showSubchannelMessagesOnly
     * @param showSubchannelMessagesOnly  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest showSubchannelMessagesOnly(Boolean showSubchannelMessagesOnly) {
      this.showSubchannelMessagesOnly = showSubchannelMessagesOnly;
      return this;
    }

    /**
     * Set userId
     * @param userId  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listMessages request
     * @return ListMessagesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListMessagesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listMessages request with HTTP info returned
     * @return ApiResponse&lt;ListMessagesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListMessagesResponse> executeWithHttpInfo() throws ApiException {
      return listMessagesWithHttpInfo(channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, includeReplyType, includeParentMessageInfo, includeThreadInfo, includePollDetails, withSortedMetaArray, showSubchannelMessagesOnly, userId, apiToken);
    }
  }

  /**
   * List messages
   * ## List messages  You can retrieve a list of past messages of a specific channel with this API.  By default, this action returns a list of messages in the order they were created. Replies in threaded messages are also listed in the chronological order of their creation like other messages, not grouped with their parent messages.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/list-messages#1-list-messages  &#x60;channel_type&#x60;   Type: string   Description: Specifies the type of the channel. Either open_channels or group_channels.   &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to retrieve a list of past messages.
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return listMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMessagesRequest listMessages(String channelType, String channelUrl) throws ApiException {
    return new APIlistMessagesRequest(channelType, channelUrl);
  }

private ApiResponse<Object> markChannelMessagesAsReadWithHttpInfo(String channelUrl, String apiToken, MarkChannelMessagesAsReadRequest markChannelMessagesAsReadRequest) throws ApiException {
    Object localVarPostBody = markChannelMessagesAsReadRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling markChannelMessagesAsRead");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/messages/mark_as_read"
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

    return apiClient.invokeAPI("MessageApi.markChannelMessagesAsRead", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APImarkChannelMessagesAsReadRequest {
    private String channelUrl;
    private String apiToken;
    private MarkChannelMessagesAsReadRequest markChannelMessagesAsReadRequest;

    private APImarkChannelMessagesAsReadRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APImarkChannelMessagesAsReadRequest
     */
    public APImarkChannelMessagesAsReadRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set markChannelMessagesAsReadRequest
     * @param markChannelMessagesAsReadRequest  (optional)
     * @return APImarkChannelMessagesAsReadRequest
     */
    public APImarkChannelMessagesAsReadRequest markChannelMessagesAsReadRequest(MarkChannelMessagesAsReadRequest markChannelMessagesAsReadRequest) {
      this.markChannelMessagesAsReadRequest = markChannelMessagesAsReadRequest;
      return this;
    }

    /**
     * Execute markChannelMessagesAsRead request
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
     * Execute markChannelMessagesAsRead request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return markChannelMessagesAsReadWithHttpInfo(channelUrl, apiToken, markChannelMessagesAsReadRequest);
    }
  }

  /**
   * Mark all messages as read
   * ## Mark all messages as read  Marks all messages in a group channel as read for a specific user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/platform-api/v3/message/read-receipts/mark-all-messages-as-read-message#1-mark-all-messages-as-read
   * @param channelUrl (Required)  (required)
   * @return markChannelMessagesAsReadRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APImarkChannelMessagesAsReadRequest markChannelMessagesAsRead(String channelUrl) throws ApiException {
    return new APImarkChannelMessagesAsReadRequest(channelUrl);
  }

private ApiResponse<Object> migrateMessagesWithHttpInfo(String targetChannelUrl, String apiToken, MigrateMessagesRequest migrateMessagesRequest) throws ApiException {
    Object localVarPostBody = migrateMessagesRequest;
    
    // verify the required parameter 'targetChannelUrl' is set
    if (targetChannelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'targetChannelUrl' when calling migrateMessages");
    }
    
    // create path and map variables
    String localVarPath = "/v3/migration/{target_channel_url}"
      .replaceAll("\\{" + "target_channel_url" + "\\}", apiClient.escapeString(targetChannelUrl.toString()));

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

    return apiClient.invokeAPI("MessageApi.migrateMessages", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APImigrateMessagesRequest {
    private String targetChannelUrl;
    private String apiToken;
    private MigrateMessagesRequest migrateMessagesRequest;

    private APImigrateMessagesRequest(String targetChannelUrl) {
      this.targetChannelUrl = targetChannelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APImigrateMessagesRequest
     */
    public APImigrateMessagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set migrateMessagesRequest
     * @param migrateMessagesRequest  (optional)
     * @return APImigrateMessagesRequest
     */
    public APImigrateMessagesRequest migrateMessagesRequest(MigrateMessagesRequest migrateMessagesRequest) {
      this.migrateMessagesRequest = migrateMessagesRequest;
      return this;
    }

    /**
     * Execute migrateMessages request
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
     * Execute migrateMessages request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return migrateMessagesWithHttpInfo(targetChannelUrl, apiToken, migrateMessagesRequest);
    }
  }

  /**
   * Migrate messages
   * ## Migrate messages  Using our migration API, you can migrate the messages from another system into a Sendbird system&#39;s [channel](https://sendbird.com/docs/chat/v3/platform-api/guides/channel-types) which consists of users, messages, and other chat-related data.  &gt; To turn on this feature, [contact our support team](https://dashboard.sendbird.com/settings/contact_us).      There are three things to do in advance before the migration. Follow the instructions below:  1. Register the users of your current chat solution to your Sendbird application. You can migrate the users into the Sendbird system using the [user creation API](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user).      2. Create either an [open](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel) or a [group](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel) channel to migrate the messages of your chat solution. The Sendbird system doesn&#39;t create a channel for your migration automatically.      3. The maximum number of migrated messages per call is 100. To avoid the failure during your migration, you must adjust the number of messages to process at once via the API.       https://sendbird.com/docs/chat/platform-api/v3/message/migration/migrate-messages#1-migrate-messages
   * @param targetChannelUrl (Required)  (required)
   * @return migrateMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APImigrateMessagesRequest migrateMessages(String targetChannelUrl) throws ApiException {
    return new APImigrateMessagesRequest(targetChannelUrl);
  }

private ApiResponse<Object> removeExtraDataFromAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String keys, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling removeExtraDataFromAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling removeExtraDataFromAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling removeExtraDataFromAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keys", keys));

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

    return apiClient.invokeAPI("MessageApi.removeExtraDataFromAMessage", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIremoveExtraDataFromAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String keys;
    private String apiToken;

    private APIremoveExtraDataFromAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set keys
     * @param keys  (optional)
     * @return APIremoveExtraDataFromAMessageRequest
     */
    public APIremoveExtraDataFromAMessageRequest keys(String keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveExtraDataFromAMessageRequest
     */
    public APIremoveExtraDataFromAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute removeExtraDataFromAMessage request
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
     * Execute removeExtraDataFromAMessage request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return removeExtraDataFromAMessageWithHttpInfo(channelType, channelUrl, messageId, keys, apiToken);
    }
  }

  /**
   * Remove extra data from a message
   * ## Remove extra data from a message  Removes specific items from a message by their keys.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/message-remove-metadata#1-remove-metadata ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @param messageId (Required)  (required)
   * @return removeExtraDataFromAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveExtraDataFromAMessageRequest removeExtraDataFromAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIremoveExtraDataFromAMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<SendbirdMessageResponse> sendAMessageWithHttpInfo(String channelType, String channelUrl, String apiToken, SendAMessageRequest sendAMessageRequest) throws ApiException {
    Object localVarPostBody = sendAMessageRequest;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling sendAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling sendAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
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

    GenericType<SendbirdMessageResponse> localVarReturnType = new GenericType<SendbirdMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.sendAMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIsendAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;
    private SendAMessageRequest sendAMessageRequest;

    private APIsendAMessageRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIsendAMessageRequest
     */
    public APIsendAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set sendAMessageRequest
     * @param sendAMessageRequest  (optional)
     * @return APIsendAMessageRequest
     */
    public APIsendAMessageRequest sendAMessageRequest(SendAMessageRequest sendAMessageRequest) {
      this.sendAMessageRequest = sendAMessageRequest;
      return this;
    }

    /**
     * Execute sendAMessage request
     * @return SendbirdMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute sendAMessage request with HTTP info returned
     * @return ApiResponse&lt;SendbirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return sendAMessageWithHttpInfo(channelType, channelUrl, apiToken, sendAMessageRequest);
    }
  }

  /**
   * Send a message
   * ## Send a message  You can use this action to send a text message, a file message, or an admin message to a specific channel. Sendbird Chat SDKs and the platform API allows you to upload any type of files in messages to the Sendbird server. See [Message Overview](https://sendbird.com/docs/chat/platform-api/v3/message/message-overview) for more information on each message type. Messages are sent between client devices running the Sendbird Chat SDK or UIKit as well as programmatically from businesses to their customers. For instance, a delivery app can automatically send a message like \&quot;Arriving in one minute!\&quot; on behalf of a delivery driver.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/send-a-message#1-send-a-message ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return sendAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIsendAMessageRequest sendAMessage(String channelType, String channelUrl) throws ApiException {
    return new APIsendAMessageRequest(channelType, channelUrl);
  }

private ApiResponse<SendbirdMessageResponse> updateAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, UpdateAMessageRequest updateAMessageRequest) throws ApiException {
    Object localVarPostBody = updateAMessageRequest;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling updateAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    GenericType<SendbirdMessageResponse> localVarReturnType = new GenericType<SendbirdMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.updateAMessage", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private UpdateAMessageRequest updateAMessageRequest;

    private APIupdateAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateAMessageRequest
     */
    public APIupdateAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateAMessageRequest
     * @param updateAMessageRequest  (optional)
     * @return APIupdateAMessageRequest
     */
    public APIupdateAMessageRequest updateAMessageRequest(UpdateAMessageRequest updateAMessageRequest) {
      this.updateAMessageRequest = updateAMessageRequest;
      return this;
    }

    /**
     * Execute updateAMessage request
     * @return SendbirdMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAMessage request with HTTP info returned
     * @return ApiResponse&lt;SendbirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return updateAMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, updateAMessageRequest);
    }
  }

  /**
   * Update a message
   * ## Update a message  Updates specific information on a message.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/update-a-message#1-update-a-message ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @param messageId (Required)  (required)
   * @return updateAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAMessageRequest updateAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIupdateAMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<UpdateExtraDataInAMessageResponse> updateExtraDataInAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, UpdateExtraDataInAMessageRequest updateExtraDataInAMessageRequest) throws ApiException {
    Object localVarPostBody = updateExtraDataInAMessageRequest;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateExtraDataInAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateExtraDataInAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling updateExtraDataInAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/sorted_metaarray"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    GenericType<UpdateExtraDataInAMessageResponse> localVarReturnType = new GenericType<UpdateExtraDataInAMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.updateExtraDataInAMessage", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateExtraDataInAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private UpdateExtraDataInAMessageRequest updateExtraDataInAMessageRequest;

    private APIupdateExtraDataInAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateExtraDataInAMessageRequest
     */
    public APIupdateExtraDataInAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateExtraDataInAMessageRequest
     * @param updateExtraDataInAMessageRequest  (optional)
     * @return APIupdateExtraDataInAMessageRequest
     */
    public APIupdateExtraDataInAMessageRequest updateExtraDataInAMessageRequest(UpdateExtraDataInAMessageRequest updateExtraDataInAMessageRequest) {
      this.updateExtraDataInAMessageRequest = updateExtraDataInAMessageRequest;
      return this;
    }

    /**
     * Execute updateExtraDataInAMessage request
     * @return UpdateExtraDataInAMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateExtraDataInAMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateExtraDataInAMessage request with HTTP info returned
     * @return ApiResponse&lt;UpdateExtraDataInAMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateExtraDataInAMessageResponse> executeWithHttpInfo() throws ApiException {
      return updateExtraDataInAMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, updateExtraDataInAMessageRequest);
    }
  }

  /**
   * Update extra data in a message
   * ## Update extra data in a message  Updates the values of specific items by their keys.  https://sendbird.com/docs/chat/platform-api/v3/message/messaging-basics/message-update-metadata#1-update-metadata ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @param messageId (Required)  (required)
   * @return updateExtraDataInAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateExtraDataInAMessageRequest updateExtraDataInAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIupdateExtraDataInAMessageRequest(channelType, channelUrl, messageId);
  }
}
