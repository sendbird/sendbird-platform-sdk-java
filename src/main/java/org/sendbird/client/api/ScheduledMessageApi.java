package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;
import org.openapitools.client.model.V3ScheduledMessagesCountGet200Response;
import org.openapitools.client.model.V3ScheduledMessagesGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
public class ScheduledMessageApi {
  private ApiClient apiClient;

  public ScheduledMessageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScheduledMessageApi(ApiClient apiClient) {
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


private ApiResponse<Object> v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostWithHttpInfo(String channelType, String channelUrl, Long scheduledMessageId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost");
    }
    
    // verify the required parameter 'scheduledMessageId' is set
    if (scheduledMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledMessageId' when calling v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/scheduled_messages/{scheduled_message_id}/send_now"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "scheduled_message_id" + "\\}", apiClient.escapeString(scheduledMessageId.toString()));

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

    return apiClient.invokeAPI("ScheduledMessageApi.v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostRequest {
    private String channelType;
    private String channelUrl;
    private Long scheduledMessageId;
    private String apiToken;

    private APIv3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostRequest(String channelType, String channelUrl, Long scheduledMessageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.scheduledMessageId = scheduledMessageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostRequest
     */
    public APIv3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost request
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
     * Execute v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostWithHttpInfo(channelType, channelUrl, scheduledMessageId, apiToken);
    }
  }

  /**
   * Send a scheduled message immediately
   * ## Send a scheduled message immediately This action sends a scheduled message immediately. A user can only send their own scheduled messages immediately. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/send-a-scheduled-message-immediately -----------------------------  
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param scheduledMessageId  (required)
   * @return v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostRequest v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost(String channelType, String channelUrl, Long scheduledMessageId) throws ApiException {
    return new APIv3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostRequest(channelType, channelUrl, scheduledMessageId);
  }

private ApiResponse<V3ScheduledMessagesGet200Response> v3GroupChannelsChannelUrlScheduledMessagesPostWithHttpInfo(String channelUrl, String apiToken, V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest) throws ApiException {
    Object localVarPostBody = v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling v3GroupChannelsChannelUrlScheduledMessagesPost");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/scheduled_messages"
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

    GenericType<V3ScheduledMessagesGet200Response> localVarReturnType = new GenericType<V3ScheduledMessagesGet200Response>() {};

    return apiClient.invokeAPI("ScheduledMessageApi.v3GroupChannelsChannelUrlScheduledMessagesPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest {
    private String channelUrl;
    private String apiToken;
    private V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;

    private APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest
     */
    public APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest
     * @param v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest  (optional)
     * @return APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest
     */
    public APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest) {
      this.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest = v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;
      return this;
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesPost request
     * @return V3ScheduledMessagesGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3ScheduledMessagesGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesPost request with HTTP info returned
     * @return ApiResponse&lt;V3ScheduledMessagesGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3ScheduledMessagesGet200Response> executeWithHttpInfo() throws ApiException {
      return v3GroupChannelsChannelUrlScheduledMessagesPostWithHttpInfo(channelUrl, apiToken, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest);
    }
  }

  /**
   * Create a scheduled message
   * ## Create a scheduled message This action creates a new scheduled message. If a user leaves the channel before the scheduled time for the message to be sent, the scheduled message will be removed. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/create-a-scheduled-message -----------------------------  
   * @param channelUrl  (required)
   * @return v3GroupChannelsChannelUrlScheduledMessagesPostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest v3GroupChannelsChannelUrlScheduledMessagesPost(String channelUrl) throws ApiException {
    return new APIv3GroupChannelsChannelUrlScheduledMessagesPostRequest(channelUrl);
  }

private ApiResponse<V3ScheduledMessagesGet200Response> v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteWithHttpInfo(String channelUrl, Long scheduledMessageId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete");
    }
    
    // verify the required parameter 'scheduledMessageId' is set
    if (scheduledMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledMessageId' when calling v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/scheduled_messages/{scheduled_message_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "scheduled_message_id" + "\\}", apiClient.escapeString(scheduledMessageId.toString()));

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

    GenericType<V3ScheduledMessagesGet200Response> localVarReturnType = new GenericType<V3ScheduledMessagesGet200Response>() {};

    return apiClient.invokeAPI("ScheduledMessageApi.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest {
    private String channelUrl;
    private Long scheduledMessageId;
    private String apiToken;

    private APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(String channelUrl, Long scheduledMessageId) {
      this.channelUrl = channelUrl;
      this.scheduledMessageId = scheduledMessageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest
     */
    public APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete request
     * @return V3ScheduledMessagesGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3ScheduledMessagesGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete request with HTTP info returned
     * @return ApiResponse&lt;V3ScheduledMessagesGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3ScheduledMessagesGet200Response> executeWithHttpInfo() throws ApiException {
      return v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteWithHttpInfo(channelUrl, scheduledMessageId, apiToken);
    }
  }

  /**
   * Cancel a scheduled message
   * ## Cancel a scheduled message This action cancels a message that a user has scheduled to send at a later time. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/cancel-a-scheduled-message -----------------------------                      
   * @param channelUrl  (required)
   * @param scheduledMessageId  (required)
   * @return v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete(String channelUrl, Long scheduledMessageId) throws ApiException {
    return new APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(channelUrl, scheduledMessageId);
  }

private ApiResponse<V3ScheduledMessagesGet200Response> v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetWithHttpInfo(String channelUrl, Long scheduledMessageId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet");
    }
    
    // verify the required parameter 'scheduledMessageId' is set
    if (scheduledMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledMessageId' when calling v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/scheduled_messages/{scheduled_message_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "scheduled_message_id" + "\\}", apiClient.escapeString(scheduledMessageId.toString()));

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

    GenericType<V3ScheduledMessagesGet200Response> localVarReturnType = new GenericType<V3ScheduledMessagesGet200Response>() {};

    return apiClient.invokeAPI("ScheduledMessageApi.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetRequest {
    private String channelUrl;
    private Long scheduledMessageId;
    private String apiToken;

    private APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetRequest(String channelUrl, Long scheduledMessageId) {
      this.channelUrl = channelUrl;
      this.scheduledMessageId = scheduledMessageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetRequest
     */
    public APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet request
     * @return V3ScheduledMessagesGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3ScheduledMessagesGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet request with HTTP info returned
     * @return ApiResponse&lt;V3ScheduledMessagesGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3ScheduledMessagesGet200Response> executeWithHttpInfo() throws ApiException {
      return v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetWithHttpInfo(channelUrl, scheduledMessageId, apiToken);
    }
  }

  /**
   * View a scheduled message
   * ## View a scheduled message This action retrieves information on a specific scheduled message. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/view-a-scheduled-message -----------------------------                      
   * @param channelUrl  (required)
   * @param scheduledMessageId  (required)
   * @return v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet(String channelUrl, Long scheduledMessageId) throws ApiException {
    return new APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetRequest(channelUrl, scheduledMessageId);
  }

private ApiResponse<V3ScheduledMessagesGet200Response> v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostWithHttpInfo(String channelUrl, Long scheduledMessageId, String apiToken, V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest) throws ApiException {
    Object localVarPostBody = v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost");
    }
    
    // verify the required parameter 'scheduledMessageId' is set
    if (scheduledMessageId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduledMessageId' when calling v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/scheduled_messages/{scheduled_message_id}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "scheduled_message_id" + "\\}", apiClient.escapeString(scheduledMessageId.toString()));

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

    GenericType<V3ScheduledMessagesGet200Response> localVarReturnType = new GenericType<V3ScheduledMessagesGet200Response>() {};

    return apiClient.invokeAPI("ScheduledMessageApi.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest {
    private String channelUrl;
    private Long scheduledMessageId;
    private String apiToken;
    private V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;

    private APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest(String channelUrl, Long scheduledMessageId) {
      this.channelUrl = channelUrl;
      this.scheduledMessageId = scheduledMessageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest
     */
    public APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest
     * @param v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest  (optional)
     * @return APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest
     */
    public APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest) {
      this.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest = v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;
      return this;
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost request
     * @return V3ScheduledMessagesGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3ScheduledMessagesGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost request with HTTP info returned
     * @return ApiResponse&lt;V3ScheduledMessagesGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3ScheduledMessagesGet200Response> executeWithHttpInfo() throws ApiException {
      return v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostWithHttpInfo(channelUrl, scheduledMessageId, apiToken, v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest);
    }
  }

  /**
   * Update a scheduled message
   * ## Update a scheduled message This action updates information on a specific scheduled message. You can’t change the message type. Update operation should be done at least 5 minutes prior to the original scheduled time. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/update-a-scheduled-message -----------------------------      
   * @param channelUrl  (required)
   * @param scheduledMessageId  (required)
   * @return v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost(String channelUrl, Long scheduledMessageId) throws ApiException {
    return new APIv3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostRequest(channelUrl, scheduledMessageId);
  }

private ApiResponse<V3ScheduledMessagesCountGet200Response> v3ScheduledMessagesCountGetWithHttpInfo(String apiToken, String channelType, String channelUrl, String senderId, List<Object> status, String messageType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/scheduled_messages/count"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "sender_id" + "\\}", apiClient.escapeString(senderId.toString()))
      .replaceAll("\\{" + "status[]" + "\\}", apiClient.escapeString(status.toString()))
      .replaceAll("\\{" + "message_type" + "\\}", apiClient.escapeString(messageType.toString()));

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

    GenericType<V3ScheduledMessagesCountGet200Response> localVarReturnType = new GenericType<V3ScheduledMessagesCountGet200Response>() {};

    return apiClient.invokeAPI("ScheduledMessageApi.v3ScheduledMessagesCountGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3ScheduledMessagesCountGetRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String senderId;
    private List<Object> status;
    private String messageType;

    private APIv3ScheduledMessagesCountGetRequest(String channelType, String channelUrl, String senderId, List<Object> status, String messageType) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.senderId = senderId;
      this.status = status;
      this.messageType = messageType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3ScheduledMessagesCountGetRequest
     */
    public APIv3ScheduledMessagesCountGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3ScheduledMessagesCountGet request
     * @return V3ScheduledMessagesCountGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3ScheduledMessagesCountGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3ScheduledMessagesCountGet request with HTTP info returned
     * @return ApiResponse&lt;V3ScheduledMessagesCountGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3ScheduledMessagesCountGet200Response> executeWithHttpInfo() throws ApiException {
      return v3ScheduledMessagesCountGetWithHttpInfo(apiToken, channelType, channelUrl, senderId, status, messageType);
    }
  }

  /**
   * View number of scheduled messages
   * ## View number of scheduled messages This action retrieves the total number of scheduled messages that a user has. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/view-number-of-scheduled-messages -----------------------------  
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param senderId  (required)
   * @param status  (required)
   * @param messageType  (required)
   * @return v3ScheduledMessagesCountGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3ScheduledMessagesCountGetRequest v3ScheduledMessagesCountGet(String channelType, String channelUrl, String senderId, List<Object> status, String messageType) throws ApiException {
    return new APIv3ScheduledMessagesCountGetRequest(channelType, channelUrl, senderId, status, messageType);
  }

private ApiResponse<V3ScheduledMessagesGet200Response> v3ScheduledMessagesGetWithHttpInfo(String apiToken, String channelType, String channelUrl, String senderId, String token, Integer limit, String order, Boolean reverse, List<Object> status, String messageType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/scheduled_messages"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "sender_id" + "\\}", apiClient.escapeString(senderId.toString()))
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()))
      .replaceAll("\\{" + "limit" + "\\}", apiClient.escapeString(limit.toString()))
      .replaceAll("\\{" + "order" + "\\}", apiClient.escapeString(order.toString()))
      .replaceAll("\\{" + "reverse" + "\\}", apiClient.escapeString(reverse.toString()))
      .replaceAll("\\{" + "status[]" + "\\}", apiClient.escapeString(status.toString()))
      .replaceAll("\\{" + "message_type" + "\\}", apiClient.escapeString(messageType.toString()));

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

    GenericType<V3ScheduledMessagesGet200Response> localVarReturnType = new GenericType<V3ScheduledMessagesGet200Response>() {};

    return apiClient.invokeAPI("ScheduledMessageApi.v3ScheduledMessagesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3ScheduledMessagesGetRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String senderId;
    private String token;
    private Integer limit;
    private String order;
    private Boolean reverse;
    private List<Object> status;
    private String messageType;

    private APIv3ScheduledMessagesGetRequest(String channelType, String channelUrl, String senderId, String token, Integer limit, String order, Boolean reverse, List<Object> status, String messageType) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.senderId = senderId;
      this.token = token;
      this.limit = limit;
      this.order = order;
      this.reverse = reverse;
      this.status = status;
      this.messageType = messageType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3ScheduledMessagesGetRequest
     */
    public APIv3ScheduledMessagesGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3ScheduledMessagesGet request
     * @return V3ScheduledMessagesGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3ScheduledMessagesGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3ScheduledMessagesGet request with HTTP info returned
     * @return ApiResponse&lt;V3ScheduledMessagesGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3ScheduledMessagesGet200Response> executeWithHttpInfo() throws ApiException {
      return v3ScheduledMessagesGetWithHttpInfo(apiToken, channelType, channelUrl, senderId, token, limit, order, reverse, status, messageType);
    }
  }

  /**
   * List scheduled messages
   * ## List scheduled messages This action retrieves a list of scheduled messages. A user can only see the list of their own scheduled messages. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/list-scheduled-messages -----------------------------  
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param senderId  (required)
   * @param token  (required)
   * @param limit  (required)
   * @param order  (required)
   * @param reverse  (required)
   * @param status  (required)
   * @param messageType  (required)
   * @return v3ScheduledMessagesGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3ScheduledMessagesGetRequest v3ScheduledMessagesGet(String channelType, String channelUrl, String senderId, String token, Integer limit, String order, Boolean reverse, List<Object> status, String messageType) throws ApiException {
    return new APIv3ScheduledMessagesGetRequest(channelType, channelUrl, senderId, token, limit, order, reverse, status, messageType);
  }
}
