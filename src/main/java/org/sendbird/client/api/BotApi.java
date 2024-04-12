package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.CreateBotData;
import org.openapitools.client.model.CreateBotResponse;
import org.openapitools.client.model.JoinChannelsData;
import org.openapitools.client.model.JoinChannelsResponse;
import org.openapitools.client.model.ListBotsResponse;
import org.openapitools.client.model.SendBirdBotsMessageResponse;
import org.openapitools.client.model.SendBotSMessageData;
import org.openapitools.client.model.UpdateBotByIdData;
import org.openapitools.client.model.UpdateBotByIdResponse;
import org.openapitools.client.model.ViewBotByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T17:36:06.761039+09:00[Asia/Seoul]")
public class BotApi {
  private ApiClient apiClient;

  public BotApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BotApi(ApiClient apiClient) {
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


private ApiResponse<CreateBotResponse> createBotWithHttpInfo(String apiToken, CreateBotData createBotData) throws ApiException {
    Object localVarPostBody = createBotData;
    
    // create path and map variables
    String localVarPath = "/v3/bots";

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

    GenericType<CreateBotResponse> localVarReturnType = new GenericType<CreateBotResponse>() {};

    return apiClient.invokeAPI("BotApi.createBot", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateBotRequest {
    private String apiToken;
    private CreateBotData createBotData;

    private APIcreateBotRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateBotRequest
     */
    public APIcreateBotRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createBotData
     * @param createBotData  (optional)
     * @return APIcreateBotRequest
     */
    public APIcreateBotRequest createBotData(CreateBotData createBotData) {
      this.createBotData = createBotData;
      return this;
    }

    /**
     * Execute createBot request
     * @return CreateBotResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CreateBotResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createBot request with HTTP info returned
     * @return ApiResponse&lt;CreateBotResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CreateBotResponse> executeWithHttpInfo() throws ApiException {
      return createBotWithHttpInfo(apiToken, createBotData);
    }
  }

  /**
   * Create a bot
   * ## Create a bot  Creates a new bot within the application. Creating a bot is similar to creating a normal user, except that a callback URL is specified in order for the bot to receive events.  &gt; __Note__: The bot must [join](#2-join-channels) a group channel first to interact with users. In group channels, you can invite a bot through the [invite as members](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members) action instead.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-create-a-bot
   * @return createBotRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateBotRequest createBot() throws ApiException {
    return new APIcreateBotRequest();
  }

private ApiResponse<Object> deleteBotByIdWithHttpInfo(String botUserid, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling deleteBotById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}"
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()));

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

    return apiClient.invokeAPI("BotApi.deleteBotById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteBotByIdRequest {
    private String botUserid;
    private String apiToken;

    private APIdeleteBotByIdRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteBotByIdRequest
     */
    public APIdeleteBotByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteBotById request
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
     * Execute deleteBotById request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteBotByIdWithHttpInfo(botUserid, apiToken);
    }
  }

  /**
   * Delete a bot
   * ## Delete a bot  Deletes a bot from an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-delete-a-bot ----------------------------
   * @param botUserid  (required)
   * @return deleteBotByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteBotByIdRequest deleteBotById(String botUserid) throws ApiException {
    return new APIdeleteBotByIdRequest(botUserid);
  }

private ApiResponse<JoinChannelsResponse> joinChannelsWithHttpInfo(String botUserid, String apiToken, JoinChannelsData joinChannelsData) throws ApiException {
    Object localVarPostBody = joinChannelsData;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling joinChannels");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}/channels"
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()));

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

    GenericType<JoinChannelsResponse> localVarReturnType = new GenericType<JoinChannelsResponse>() {};

    return apiClient.invokeAPI("BotApi.joinChannels", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIjoinChannelsRequest {
    private String botUserid;
    private String apiToken;
    private JoinChannelsData joinChannelsData;

    private APIjoinChannelsRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIjoinChannelsRequest
     */
    public APIjoinChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set joinChannelsData
     * @param joinChannelsData  (optional)
     * @return APIjoinChannelsRequest
     */
    public APIjoinChannelsRequest joinChannelsData(JoinChannelsData joinChannelsData) {
      this.joinChannelsData = joinChannelsData;
      return this;
    }

    /**
     * Execute joinChannels request
     * @return JoinChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public JoinChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute joinChannels request with HTTP info returned
     * @return ApiResponse&lt;JoinChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<JoinChannelsResponse> executeWithHttpInfo() throws ApiException {
      return joinChannelsWithHttpInfo(botUserid, apiToken, joinChannelsData);
    }
  }

  /**
   * Join channels
   * ## Join channels  Makes a bot join one or more channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-join-channels ----------------------------
   * @param botUserid  (required)
   * @return joinChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIjoinChannelsRequest joinChannels(String botUserid) throws ApiException {
    return new APIjoinChannelsRequest(botUserid);
  }

private ApiResponse<Void> leaveChannelsWithHttpInfo(String botUserid, String apiToken, String channelUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling leaveChannels");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}/channels"
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel_url", channelUrl));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("BotApi.leaveChannels", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIleaveChannelsRequest {
    private String botUserid;
    private String apiToken;
    private String channelUrl;

    private APIleaveChannelsRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIleaveChannelsRequest
     */
    public APIleaveChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set channelUrl
     * @param channelUrl  (optional)
     * @return APIleaveChannelsRequest
     */
    public APIleaveChannelsRequest channelUrl(String channelUrl) {
      this.channelUrl = channelUrl;
      return this;
    }

    /**
     * Execute leaveChannels request
     
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
     * Execute leaveChannels request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return leaveChannelsWithHttpInfo(botUserid, apiToken, channelUrl);
    }
  }

  /**
   * Leave channels - When leaving all channels
   * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
   * @param botUserid  (required)
   * @return leaveChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIleaveChannelsRequest leaveChannels(String botUserid) throws ApiException {
    return new APIleaveChannelsRequest(botUserid);
  }

private ApiResponse<Object> leaveChannelsByUrlWithHttpInfo(String botUserid, String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling leaveChannelsByUrl");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling leaveChannelsByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}/channels/{channel_url}"
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()))
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("BotApi.leaveChannelsByUrl", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIleaveChannelsByUrlRequest {
    private String botUserid;
    private String channelUrl;
    private String apiToken;

    private APIleaveChannelsByUrlRequest(String botUserid, String channelUrl) {
      this.botUserid = botUserid;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIleaveChannelsByUrlRequest
     */
    public APIleaveChannelsByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute leaveChannelsByUrl request
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
     * Execute leaveChannelsByUrl request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return leaveChannelsByUrlWithHttpInfo(botUserid, channelUrl, apiToken);
    }
  }

  /**
   * Leave channels - When leaving a channel by its channel URL
   * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
   * @param botUserid  (required)
   * @param channelUrl  (required)
   * @return leaveChannelsByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIleaveChannelsByUrlRequest leaveChannelsByUrl(String botUserid, String channelUrl) throws ApiException {
    return new APIleaveChannelsByUrlRequest(botUserid, channelUrl);
  }

private ApiResponse<ListBotsResponse> listBotsWithHttpInfo(String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/bots";

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

    GenericType<ListBotsResponse> localVarReturnType = new GenericType<ListBotsResponse>() {};

    return apiClient.invokeAPI("BotApi.listBots", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistBotsRequest {
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistBotsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistBotsRequest
     */
    public APIlistBotsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistBotsRequest
     */
    public APIlistBotsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistBotsRequest
     */
    public APIlistBotsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listBots request
     * @return ListBotsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListBotsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listBots request with HTTP info returned
     * @return ApiResponse&lt;ListBotsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListBotsResponse> executeWithHttpInfo() throws ApiException {
      return listBotsWithHttpInfo(apiToken, token, limit);
    }
  }

  /**
   * List bots
   * ## List bots  Retrieves a list of all bots within an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots ----------------------------
   * @return listBotsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistBotsRequest listBots() throws ApiException {
    return new APIlistBotsRequest();
  }

private ApiResponse<SendBirdBotsMessageResponse> sendBotsMessageWithHttpInfo(String botUserid, String apiToken, SendBotSMessageData sendBotSMessageData) throws ApiException {
    Object localVarPostBody = sendBotSMessageData;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling sendBotsMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}/send"
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()));

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

    GenericType<SendBirdBotsMessageResponse> localVarReturnType = new GenericType<SendBirdBotsMessageResponse>() {};

    return apiClient.invokeAPI("BotApi.sendBotsMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIsendBotsMessageRequest {
    private String botUserid;
    private String apiToken;
    private SendBotSMessageData sendBotSMessageData;

    private APIsendBotsMessageRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIsendBotsMessageRequest
     */
    public APIsendBotsMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set sendBotSMessageData
     * @param sendBotSMessageData  (optional)
     * @return APIsendBotsMessageRequest
     */
    public APIsendBotsMessageRequest sendBotSMessageData(SendBotSMessageData sendBotSMessageData) {
      this.sendBotSMessageData = sendBotSMessageData;
      return this;
    }

    /**
     * Execute sendBotsMessage request
     * @return SendBirdBotsMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdBotsMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute sendBotsMessage request with HTTP info returned
     * @return ApiResponse&lt;SendBirdBotsMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdBotsMessageResponse> executeWithHttpInfo() throws ApiException {
      return sendBotsMessageWithHttpInfo(botUserid, apiToken, sendBotSMessageData);
    }
  }

  /**
   * Send a bot&#39;s message
   * ## Send a bot&#39;s message  Sends a bot&#39;s message to a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-send-a-bot-s-message ----------------------------   &#x60;bot_userid&#x60;      Type: string      Description: Specifies the ID of the bot to send a message.
   * @param botUserid  (required)
   * @return sendBotsMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIsendBotsMessageRequest sendBotsMessage(String botUserid) throws ApiException {
    return new APIsendBotsMessageRequest(botUserid);
  }

private ApiResponse<UpdateBotByIdResponse> updateBotByIdWithHttpInfo(String botUserid, String apiToken, UpdateBotByIdData updateBotByIdData) throws ApiException {
    Object localVarPostBody = updateBotByIdData;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling updateBotById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}"
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()));

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

    GenericType<UpdateBotByIdResponse> localVarReturnType = new GenericType<UpdateBotByIdResponse>() {};

    return apiClient.invokeAPI("BotApi.updateBotById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateBotByIdRequest {
    private String botUserid;
    private String apiToken;
    private UpdateBotByIdData updateBotByIdData;

    private APIupdateBotByIdRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateBotByIdRequest
     */
    public APIupdateBotByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateBotByIdData
     * @param updateBotByIdData  (optional)
     * @return APIupdateBotByIdRequest
     */
    public APIupdateBotByIdRequest updateBotByIdData(UpdateBotByIdData updateBotByIdData) {
      this.updateBotByIdData = updateBotByIdData;
      return this;
    }

    /**
     * Execute updateBotById request
     * @return UpdateBotByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateBotByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateBotById request with HTTP info returned
     * @return ApiResponse&lt;UpdateBotByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateBotByIdResponse> executeWithHttpInfo() throws ApiException {
      return updateBotByIdWithHttpInfo(botUserid, apiToken, updateBotByIdData);
    }
  }

  /**
   * Update a bot
   * ## Update a bot  Updates information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-update-a-bot ----------------------------
   * @param botUserid  (required)
   * @return updateBotByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateBotByIdRequest updateBotById(String botUserid) throws ApiException {
    return new APIupdateBotByIdRequest(botUserid);
  }

private ApiResponse<ViewBotByIdResponse> viewBotByIdWithHttpInfo(String botUserid, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling viewBotById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}"
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()));

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

    GenericType<ViewBotByIdResponse> localVarReturnType = new GenericType<ViewBotByIdResponse>() {};

    return apiClient.invokeAPI("BotApi.viewBotById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewBotByIdRequest {
    private String botUserid;
    private String apiToken;

    private APIviewBotByIdRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewBotByIdRequest
     */
    public APIviewBotByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewBotById request
     * @return ViewBotByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewBotByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewBotById request with HTTP info returned
     * @return ApiResponse&lt;ViewBotByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewBotByIdResponse> executeWithHttpInfo() throws ApiException {
      return viewBotByIdWithHttpInfo(botUserid, apiToken);
    }
  }

  /**
   * View a bot
   * ## View a bot  Retrieves information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-view-a-bot ----------------------------
   * @param botUserid  (required)
   * @return viewBotByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewBotByIdRequest viewBotById(String botUserid) throws ApiException {
    return new APIviewBotByIdRequest(botUserid);
  }
}
