package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.SendBirdPoll;
import org.openapitools.client.model.SendBirdPollOption;
import org.openapitools.client.model.V3PollsGetRequest;
import org.openapitools.client.model.V3PollsPollIdDeleteRequest;
import org.openapitools.client.model.V3PollsPollIdDeleteRequest1;
import org.openapitools.client.model.V3PollsPollIdOptionsOptionIdDeleteRequest;
import org.openapitools.client.model.V3PollsPollIdOptionsOptionIdVotersGet200Response;
import org.openapitools.client.model.V3PollsPollIdOptionsOptionIdVotersGetRequest;
import org.openapitools.client.model.V3PollsPollIdVotePutRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T21:00:42.844610+09:00[Asia/Seoul]")
public class PollApi {
  private ApiClient apiClient;

  public PollApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PollApi(ApiClient apiClient) {
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


private ApiResponse<SendBirdPoll> v3PollsGetWithHttpInfo(String apiToken, String channelUrl, String channelType, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/polls"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()))
      .replaceAll("\\{" + "limit" + "\\}", apiClient.escapeString(limit.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsGetRequest {
    private String apiToken;
    private String channelUrl;
    private String channelType;
    private String token;
    private Integer limit;

    private APIv3PollsGetRequest(String channelUrl, String channelType, String token, Integer limit) {
      this.channelUrl = channelUrl;
      this.channelType = channelType;
      this.token = token;
      this.limit = limit;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsGetRequest
     */
    public APIv3PollsGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3PollsGet request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsGet request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsGetWithHttpInfo(apiToken, channelUrl, channelType, token, limit);
    }
  }

  /**
   * List polls
   * ## List polls This action retrieves a paginated list of both open and closed polls in an application or a specific channel. To retrieve polls in a specific channel, the channel_url must be specified. https://sendbird.com/docs/chat/v3/platform-api/message/polls/list-polls  -----------------------------
   * @param channelUrl  (required)
   * @param channelType  (required)
   * @param token  (required)
   * @param limit  (required)
   * @return v3PollsGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsGetRequest v3PollsGet(String channelUrl, String channelType, String token, Integer limit) throws ApiException {
    return new APIv3PollsGetRequest(channelUrl, channelType, token, limit);
  }

private ApiResponse<SendBirdPoll> v3PollsPollIdClosePutWithHttpInfo(Integer pollId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdClosePut");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}/close"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdClosePut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdClosePutRequest {
    private Integer pollId;
    private String apiToken;

    private APIv3PollsPollIdClosePutRequest(Integer pollId) {
      this.pollId = pollId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdClosePutRequest
     */
    public APIv3PollsPollIdClosePutRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3PollsPollIdClosePut request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdClosePut request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdClosePutWithHttpInfo(pollId, apiToken);
    }
  }

  /**
   * Close a poll
   * ## Close a poll This action closes a poll and prevents users from voting any further. https://sendbird.com/docs/chat/v3/platform-api/message/polls/close-a-poll -----------------------------  
   * @param pollId  (required)
   * @return v3PollsPollIdClosePutRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdClosePutRequest v3PollsPollIdClosePut(Integer pollId) throws ApiException {
    return new APIv3PollsPollIdClosePutRequest(pollId);
  }

private ApiResponse<Object> v3PollsPollIdDeleteWithHttpInfo(Integer pollId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()));

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

    return apiClient.invokeAPI("PollApi.v3PollsPollIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdDeleteRequest {
    private Integer pollId;
    private String apiToken;

    private APIv3PollsPollIdDeleteRequest(Integer pollId) {
      this.pollId = pollId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdDeleteRequest
     */
    public APIv3PollsPollIdDeleteRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3PollsPollIdDelete request
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
     * Execute v3PollsPollIdDelete request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdDeleteWithHttpInfo(pollId, apiToken);
    }
  }

  /**
   * Delete a poll
   * ## Delete a poll This action deletes a poll. Once a poll is deleted, you can&#39;t retrieve its data. https://sendbird.com/docs/chat/v3/platform-api/message/polls/delete-a-poll -----------------------------  
   * @param pollId  (required)
   * @return v3PollsPollIdDeleteRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdDeleteRequest v3PollsPollIdDelete(Integer pollId) throws ApiException {
    return new APIv3PollsPollIdDeleteRequest(pollId);
  }

private ApiResponse<SendBirdPoll> v3PollsPollIdGetWithHttpInfo(Integer pollId, String apiToken, V3PollsPollIdDeleteRequest v3PollsPollIdDeleteRequest) throws ApiException {
    Object localVarPostBody = v3PollsPollIdDeleteRequest;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdGetRequest {
    private Integer pollId;
    private String apiToken;
    private V3PollsPollIdDeleteRequest v3PollsPollIdDeleteRequest;

    private APIv3PollsPollIdGetRequest(Integer pollId) {
      this.pollId = pollId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdGetRequest
     */
    public APIv3PollsPollIdGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3PollsPollIdDeleteRequest
     * @param v3PollsPollIdDeleteRequest  (optional)
     * @return APIv3PollsPollIdGetRequest
     */
    public APIv3PollsPollIdGetRequest v3PollsPollIdDeleteRequest(V3PollsPollIdDeleteRequest v3PollsPollIdDeleteRequest) {
      this.v3PollsPollIdDeleteRequest = v3PollsPollIdDeleteRequest;
      return this;
    }

    /**
     * Execute v3PollsPollIdGet request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdGet request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdGetWithHttpInfo(pollId, apiToken, v3PollsPollIdDeleteRequest);
    }
  }

  /**
   * Get a poll
   * ## Get a poll This action retrieves information on a specific poll. https://sendbird.com/docs/chat/v3/platform-api/message/polls/get-a-poll -----------------------------
   * @param pollId  (required)
   * @return v3PollsPollIdGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdGetRequest v3PollsPollIdGet(Integer pollId) throws ApiException {
    return new APIv3PollsPollIdGetRequest(pollId);
  }

private ApiResponse<Object> v3PollsPollIdOptionsOptionIdDeleteWithHttpInfo(Integer pollId, Integer optionId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdOptionsOptionIdDelete");
    }
    
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling v3PollsPollIdOptionsOptionIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}/options/{option_id}"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()))
      .replaceAll("\\{" + "option_id" + "\\}", apiClient.escapeString(optionId.toString()));

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

    return apiClient.invokeAPI("PollApi.v3PollsPollIdOptionsOptionIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdOptionsOptionIdDeleteRequest {
    private Integer pollId;
    private Integer optionId;
    private String apiToken;

    private APIv3PollsPollIdOptionsOptionIdDeleteRequest(Integer pollId, Integer optionId) {
      this.pollId = pollId;
      this.optionId = optionId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdOptionsOptionIdDeleteRequest
     */
    public APIv3PollsPollIdOptionsOptionIdDeleteRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3PollsPollIdOptionsOptionIdDelete request
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
     * Execute v3PollsPollIdOptionsOptionIdDelete request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdOptionsOptionIdDeleteWithHttpInfo(pollId, optionId, apiToken);
    }
  }

  /**
   * Delete a poll option
   * ## Delete a poll option This action deletes an option from a poll. https://sendbird.com/docs/chat/v3/platform-api/message/polls/delete-a-poll-option ----------------------------- 
   * @param pollId  (required)
   * @param optionId  (required)
   * @return v3PollsPollIdOptionsOptionIdDeleteRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDelete(Integer pollId, Integer optionId) throws ApiException {
    return new APIv3PollsPollIdOptionsOptionIdDeleteRequest(pollId, optionId);
  }

private ApiResponse<SendBirdPollOption> v3PollsPollIdOptionsOptionIdGetWithHttpInfo(Integer pollId, Integer optionId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdOptionsOptionIdGet");
    }
    
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling v3PollsPollIdOptionsOptionIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}/options/{option_id}"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()))
      .replaceAll("\\{" + "option_id" + "\\}", apiClient.escapeString(optionId.toString()));

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

    GenericType<SendBirdPollOption> localVarReturnType = new GenericType<SendBirdPollOption>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdOptionsOptionIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdOptionsOptionIdGetRequest {
    private Integer pollId;
    private Integer optionId;
    private String apiToken;

    private APIv3PollsPollIdOptionsOptionIdGetRequest(Integer pollId, Integer optionId) {
      this.pollId = pollId;
      this.optionId = optionId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdOptionsOptionIdGetRequest
     */
    public APIv3PollsPollIdOptionsOptionIdGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3PollsPollIdOptionsOptionIdGet request
     * @return SendBirdPollOption
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPollOption execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdOptionsOptionIdGet request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPollOption&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPollOption> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdOptionsOptionIdGetWithHttpInfo(pollId, optionId, apiToken);
    }
  }

  /**
   * Get a poll option
   * ## Get a poll option This action retrieves a poll option. https://sendbird.com/docs/chat/v3/platform-api/message/polls/get-a-poll-option -----------------------------  
   * @param pollId  (required)
   * @param optionId  (required)
   * @return v3PollsPollIdOptionsOptionIdGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdOptionsOptionIdGetRequest v3PollsPollIdOptionsOptionIdGet(Integer pollId, Integer optionId) throws ApiException {
    return new APIv3PollsPollIdOptionsOptionIdGetRequest(pollId, optionId);
  }

private ApiResponse<SendBirdPoll> v3PollsPollIdOptionsOptionIdPutWithHttpInfo(Integer pollId, Integer optionId, String apiToken, V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest) throws ApiException {
    Object localVarPostBody = v3PollsPollIdOptionsOptionIdDeleteRequest;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdOptionsOptionIdPut");
    }
    
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling v3PollsPollIdOptionsOptionIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}/options/{option_id}"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()))
      .replaceAll("\\{" + "option_id" + "\\}", apiClient.escapeString(optionId.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdOptionsOptionIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdOptionsOptionIdPutRequest {
    private Integer pollId;
    private Integer optionId;
    private String apiToken;
    private V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest;

    private APIv3PollsPollIdOptionsOptionIdPutRequest(Integer pollId, Integer optionId) {
      this.pollId = pollId;
      this.optionId = optionId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdOptionsOptionIdPutRequest
     */
    public APIv3PollsPollIdOptionsOptionIdPutRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3PollsPollIdOptionsOptionIdDeleteRequest
     * @param v3PollsPollIdOptionsOptionIdDeleteRequest  (optional)
     * @return APIv3PollsPollIdOptionsOptionIdPutRequest
     */
    public APIv3PollsPollIdOptionsOptionIdPutRequest v3PollsPollIdOptionsOptionIdDeleteRequest(V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest) {
      this.v3PollsPollIdOptionsOptionIdDeleteRequest = v3PollsPollIdOptionsOptionIdDeleteRequest;
      return this;
    }

    /**
     * Execute v3PollsPollIdOptionsOptionIdPut request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdOptionsOptionIdPut request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdOptionsOptionIdPutWithHttpInfo(pollId, optionId, apiToken, v3PollsPollIdOptionsOptionIdDeleteRequest);
    }
  }

  /**
   * Update a poll option
   * ## Update a poll option This action updates the content of a poll option. Voting for an option doesn&#39;t update the option. https://sendbird.com/docs/chat/v3/platform-api/message/polls/update-a-poll-option -----------------------------  
   * @param pollId  (required)
   * @param optionId  (required)
   * @return v3PollsPollIdOptionsOptionIdPutRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdOptionsOptionIdPutRequest v3PollsPollIdOptionsOptionIdPut(Integer pollId, Integer optionId) throws ApiException {
    return new APIv3PollsPollIdOptionsOptionIdPutRequest(pollId, optionId);
  }

private ApiResponse<V3PollsPollIdOptionsOptionIdVotersGet200Response> v3PollsPollIdOptionsOptionIdVotersGetWithHttpInfo(Integer pollId, Integer optionId, String apiToken, V3PollsPollIdOptionsOptionIdVotersGetRequest v3PollsPollIdOptionsOptionIdVotersGetRequest) throws ApiException {
    Object localVarPostBody = v3PollsPollIdOptionsOptionIdVotersGetRequest;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdOptionsOptionIdVotersGet");
    }
    
    // verify the required parameter 'optionId' is set
    if (optionId == null) {
      throw new ApiException(400, "Missing the required parameter 'optionId' when calling v3PollsPollIdOptionsOptionIdVotersGet");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}/options/{option_id}/voters"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()))
      .replaceAll("\\{" + "option_id" + "\\}", apiClient.escapeString(optionId.toString()));

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

    GenericType<V3PollsPollIdOptionsOptionIdVotersGet200Response> localVarReturnType = new GenericType<V3PollsPollIdOptionsOptionIdVotersGet200Response>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdOptionsOptionIdVotersGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdOptionsOptionIdVotersGetRequest {
    private Integer pollId;
    private Integer optionId;
    private String apiToken;
    private V3PollsPollIdOptionsOptionIdVotersGetRequest v3PollsPollIdOptionsOptionIdVotersGetRequest;

    private APIv3PollsPollIdOptionsOptionIdVotersGetRequest(Integer pollId, Integer optionId) {
      this.pollId = pollId;
      this.optionId = optionId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdOptionsOptionIdVotersGetRequest
     */
    public APIv3PollsPollIdOptionsOptionIdVotersGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3PollsPollIdOptionsOptionIdVotersGetRequest
     * @param v3PollsPollIdOptionsOptionIdVotersGetRequest  (optional)
     * @return APIv3PollsPollIdOptionsOptionIdVotersGetRequest
     */
    public APIv3PollsPollIdOptionsOptionIdVotersGetRequest v3PollsPollIdOptionsOptionIdVotersGetRequest(V3PollsPollIdOptionsOptionIdVotersGetRequest v3PollsPollIdOptionsOptionIdVotersGetRequest) {
      this.v3PollsPollIdOptionsOptionIdVotersGetRequest = v3PollsPollIdOptionsOptionIdVotersGetRequest;
      return this;
    }

    /**
     * Execute v3PollsPollIdOptionsOptionIdVotersGet request
     * @return V3PollsPollIdOptionsOptionIdVotersGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3PollsPollIdOptionsOptionIdVotersGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdOptionsOptionIdVotersGet request with HTTP info returned
     * @return ApiResponse&lt;V3PollsPollIdOptionsOptionIdVotersGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3PollsPollIdOptionsOptionIdVotersGet200Response> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdOptionsOptionIdVotersGetWithHttpInfo(pollId, optionId, apiToken, v3PollsPollIdOptionsOptionIdVotersGetRequest);
    }
  }

  /**
   * List voters of a poll option
   * ## List voters of a poll option This action retrieves a list of users who voted for a poll option. https://sendbird.com/docs/chat/v3/platform-api/message/polls/list-voters-of-a-poll-option  -----------------------------  
   * @param pollId  (required)
   * @param optionId  (required)
   * @return v3PollsPollIdOptionsOptionIdVotersGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdOptionsOptionIdVotersGetRequest v3PollsPollIdOptionsOptionIdVotersGet(Integer pollId, Integer optionId) throws ApiException {
    return new APIv3PollsPollIdOptionsOptionIdVotersGetRequest(pollId, optionId);
  }

private ApiResponse<SendBirdPoll> v3PollsPollIdOptionsPostWithHttpInfo(Integer pollId, String apiToken, V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest) throws ApiException {
    Object localVarPostBody = v3PollsPollIdOptionsOptionIdDeleteRequest;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdOptionsPost");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}/options"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdOptionsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdOptionsPostRequest {
    private Integer pollId;
    private String apiToken;
    private V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest;

    private APIv3PollsPollIdOptionsPostRequest(Integer pollId) {
      this.pollId = pollId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdOptionsPostRequest
     */
    public APIv3PollsPollIdOptionsPostRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3PollsPollIdOptionsOptionIdDeleteRequest
     * @param v3PollsPollIdOptionsOptionIdDeleteRequest  (optional)
     * @return APIv3PollsPollIdOptionsPostRequest
     */
    public APIv3PollsPollIdOptionsPostRequest v3PollsPollIdOptionsOptionIdDeleteRequest(V3PollsPollIdOptionsOptionIdDeleteRequest v3PollsPollIdOptionsOptionIdDeleteRequest) {
      this.v3PollsPollIdOptionsOptionIdDeleteRequest = v3PollsPollIdOptionsOptionIdDeleteRequest;
      return this;
    }

    /**
     * Execute v3PollsPollIdOptionsPost request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdOptionsPost request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdOptionsPostWithHttpInfo(pollId, apiToken, v3PollsPollIdOptionsOptionIdDeleteRequest);
    }
  }

  /**
   * Add a poll option
   * ## Add a poll option This action adds a new option to a poll. https://sendbird.com/docs/chat/v3/platform-api/message/polls/add-a-poll-option -----------------------------  
   * @param pollId  (required)
   * @return v3PollsPollIdOptionsPostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdOptionsPostRequest v3PollsPollIdOptionsPost(Integer pollId) throws ApiException {
    return new APIv3PollsPollIdOptionsPostRequest(pollId);
  }

private ApiResponse<SendBirdPoll> v3PollsPollIdPutWithHttpInfo(Integer pollId, String apiToken, V3PollsPollIdDeleteRequest1 v3PollsPollIdDeleteRequest1) throws ApiException {
    Object localVarPostBody = v3PollsPollIdDeleteRequest1;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdPutRequest {
    private Integer pollId;
    private String apiToken;
    private V3PollsPollIdDeleteRequest1 v3PollsPollIdDeleteRequest1;

    private APIv3PollsPollIdPutRequest(Integer pollId) {
      this.pollId = pollId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdPutRequest
     */
    public APIv3PollsPollIdPutRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3PollsPollIdDeleteRequest1
     * @param v3PollsPollIdDeleteRequest1  (optional)
     * @return APIv3PollsPollIdPutRequest
     */
    public APIv3PollsPollIdPutRequest v3PollsPollIdDeleteRequest1(V3PollsPollIdDeleteRequest1 v3PollsPollIdDeleteRequest1) {
      this.v3PollsPollIdDeleteRequest1 = v3PollsPollIdDeleteRequest1;
      return this;
    }

    /**
     * Execute v3PollsPollIdPut request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdPut request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdPutWithHttpInfo(pollId, apiToken, v3PollsPollIdDeleteRequest1);
    }
  }

  /**
   * Update a poll
   * ## Update a poll This action updates information of a poll. To change the content of a poll option, see the update a poll option page. https://sendbird.com/docs/chat/v3/platform-api/message/polls/update-a-poll -----------------------------  
   * @param pollId  (required)
   * @return v3PollsPollIdPutRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdPutRequest v3PollsPollIdPut(Integer pollId) throws ApiException {
    return new APIv3PollsPollIdPutRequest(pollId);
  }

private ApiResponse<SendBirdPoll> v3PollsPollIdVotePutWithHttpInfo(Integer pollId, String apiToken, V3PollsPollIdVotePutRequest v3PollsPollIdVotePutRequest) throws ApiException {
    Object localVarPostBody = v3PollsPollIdVotePutRequest;
    
    // verify the required parameter 'pollId' is set
    if (pollId == null) {
      throw new ApiException(400, "Missing the required parameter 'pollId' when calling v3PollsPollIdVotePut");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls/{poll_id}/vote"
      .replaceAll("\\{" + "poll_id" + "\\}", apiClient.escapeString(pollId.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPollIdVotePut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPollIdVotePutRequest {
    private Integer pollId;
    private String apiToken;
    private V3PollsPollIdVotePutRequest v3PollsPollIdVotePutRequest;

    private APIv3PollsPollIdVotePutRequest(Integer pollId) {
      this.pollId = pollId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPollIdVotePutRequest
     */
    public APIv3PollsPollIdVotePutRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3PollsPollIdVotePutRequest
     * @param v3PollsPollIdVotePutRequest  (optional)
     * @return APIv3PollsPollIdVotePutRequest
     */
    public APIv3PollsPollIdVotePutRequest v3PollsPollIdVotePutRequest(V3PollsPollIdVotePutRequest v3PollsPollIdVotePutRequest) {
      this.v3PollsPollIdVotePutRequest = v3PollsPollIdVotePutRequest;
      return this;
    }

    /**
     * Execute v3PollsPollIdVotePut request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPollIdVotePut request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsPollIdVotePutWithHttpInfo(pollId, apiToken, v3PollsPollIdVotePutRequest);
    }
  }

  /**
   * Cast or cancel a vote
   * ## Cast or cancel a vote This action adds or removes a vote from a poll option, changing the number of votes given to each option. Use this action to override a previous vote and update the user&#39;s final choice of poll options. https://sendbird.com/docs/chat/v3/platform-api/message/polls/cast-or-cancel-a-vote -----------------------------  
   * @param pollId  (required)
   * @return v3PollsPollIdVotePutRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPollIdVotePutRequest v3PollsPollIdVotePut(Integer pollId) throws ApiException {
    return new APIv3PollsPollIdVotePutRequest(pollId);
  }

private ApiResponse<SendBirdPoll> v3PollsPostWithHttpInfo(String title, List<String> options, String apiToken, V3PollsGetRequest v3PollsGetRequest) throws ApiException {
    Object localVarPostBody = v3PollsGetRequest;
    
    // verify the required parameter 'title' is set
    if (title == null) {
      throw new ApiException(400, "Missing the required parameter 'title' when calling v3PollsPost");
    }
    
    // verify the required parameter 'options' is set
    if (options == null) {
      throw new ApiException(400, "Missing the required parameter 'options' when calling v3PollsPost");
    }
    
    // create path and map variables
    String localVarPath = "/v3/polls"
      .replaceAll("\\{" + "title" + "\\}", apiClient.escapeString(title.toString()))
      .replaceAll("\\{" + "options" + "\\}", apiClient.escapeString(options.toString()));

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

    GenericType<SendBirdPoll> localVarReturnType = new GenericType<SendBirdPoll>() {};

    return apiClient.invokeAPI("PollApi.v3PollsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3PollsPostRequest {
    private String title;
    private List<String> options;
    private String apiToken;
    private V3PollsGetRequest v3PollsGetRequest;

    private APIv3PollsPostRequest(String title, List<String> options) {
      this.title = title;
      this.options = options;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3PollsPostRequest
     */
    public APIv3PollsPostRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3PollsGetRequest
     * @param v3PollsGetRequest  (optional)
     * @return APIv3PollsPostRequest
     */
    public APIv3PollsPostRequest v3PollsGetRequest(V3PollsGetRequest v3PollsGetRequest) {
      this.v3PollsGetRequest = v3PollsGetRequest;
      return this;
    }

    /**
     * Execute v3PollsPost request
     * @return SendBirdPoll
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdPoll execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3PollsPost request with HTTP info returned
     * @return ApiResponse&lt;SendBirdPoll&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdPoll> executeWithHttpInfo() throws ApiException {
      return v3PollsPostWithHttpInfo(title, options, apiToken, v3PollsGetRequest);
    }
  }

  /**
   * Create a poll
   * ## Create a poll This action creates a poll with at least one option.You can configure various settings for your poll, including when the poll will close and whether to allow voting for multiple options. After creating a poll, to share the poll with other users in a channel, the poll must be sent as a message. https://sendbird.com/docs/chat/v3/platform-api/message/polls/create-a-poll -----------------------------
   * @param title  (required)
   * @param options  (required)
   * @return v3PollsPostRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3PollsPostRequest v3PollsPost(String title, List<String> options) throws ApiException {
    return new APIv3PollsPostRequest(title, options);
  }
}
