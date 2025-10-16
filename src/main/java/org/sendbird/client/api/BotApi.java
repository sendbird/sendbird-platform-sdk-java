package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.client.model.SendBirdCreateABotRequest;
import org.openapitools.client.model.SendBirdCreateABotResponse;
import org.openapitools.client.model.SendBirdJoinChannelsRequest;
import org.openapitools.client.model.SendBirdListBotsResponse;
import org.openapitools.client.model.SendBirdSendABotMessageResponse;
import org.openapitools.client.model.SendBirdSendbirdExtendedMessagePayload;
import org.openapitools.client.model.SendBirdSendbirdGroupChannelDetail;
import org.openapitools.client.model.SendBirdSendbirdSortedMetaarrayInner;
import org.openapitools.client.model.SendBirdUpdateBotByIdData;
import org.openapitools.client.model.SendBirdUpdateBotByIdResponse;
import org.openapitools.client.model.SendBirdViewBotByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-10-17T08:54:05.631950+09:00[Asia/Seoul]")
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


private ApiResponse<SendBirdCreateABotResponse> createABotWithHttpInfo(String apiToken, SendBirdCreateABotRequest sendBirdCreateABotRequest) throws ApiException {
    Object localVarPostBody = sendBirdCreateABotRequest;
    
    // create path and map variables
    String localVarPath = "/v3/bots";

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

    GenericType<SendBirdCreateABotResponse> localVarReturnType = new GenericType<SendBirdCreateABotResponse>() {};

    return apiClient.invokeAPI("BotApi.createABot", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateABotRequest {
    private String apiToken;
    private SendBirdCreateABotRequest sendBirdCreateABotRequest;

    private APIcreateABotRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateABotRequest
     */
    public APIcreateABotRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set sendBirdCreateABotRequest
     * @param sendBirdCreateABotRequest  (optional)
     * @return APIcreateABotRequest
     */
    public APIcreateABotRequest sendBirdCreateABotRequest(SendBirdCreateABotRequest sendBirdCreateABotRequest) {
      this.sendBirdCreateABotRequest = sendBirdCreateABotRequest;
      return this;
    }

    /**
     * Execute createABot request
     * @return SendBirdCreateABotResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdCreateABotResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createABot request with HTTP info returned
     * @return ApiResponse&lt;SendBirdCreateABotResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdCreateABotResponse> executeWithHttpInfo() throws ApiException {
      return createABotWithHttpInfo(apiToken, sendBirdCreateABotRequest);
    }
  }

  /**
   * Create a bot
   * ## Create a bot  Creates a new bot within an application. Creating a bot is similar to creating a normal user, except a callback URL should be specified for a bot to receive events.  &gt; **Note**: The bot must first [join a group channel](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/join-channels) to interact with users. In group channels, you can also invite a bot through the [invite as members](https://sendbird.com/docs/chat/platform-api/v3/channel/inviting-a-user/invite-as-members-channel) action.      [https://sendbird.com/docs/chat/platform-api/v3/bot/creating-a-bot/create-a-bot#1-create-a-bot](https://sendbird.com/docs/chat/platform-api/v3/bot/creating-a-bot/create-a-bot#1-create-a-bot)
   * @return createABotRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateABotRequest createABot() throws ApiException {
    return new APIcreateABotRequest();
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

private ApiResponse<SendBirdSendbirdGroupChannelDetail> joinChannelsWithHttpInfo(String botUserid, String apiToken, SendBirdJoinChannelsRequest sendBirdJoinChannelsRequest) throws ApiException {
    Object localVarPostBody = sendBirdJoinChannelsRequest;
    
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

    GenericType<SendBirdSendbirdGroupChannelDetail> localVarReturnType = new GenericType<SendBirdSendbirdGroupChannelDetail>() {};

    return apiClient.invokeAPI("BotApi.joinChannels", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIjoinChannelsRequest {
    private String botUserid;
    private String apiToken;
    private SendBirdJoinChannelsRequest sendBirdJoinChannelsRequest;

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
     * Set sendBirdJoinChannelsRequest
     * @param sendBirdJoinChannelsRequest  (optional)
     * @return APIjoinChannelsRequest
     */
    public APIjoinChannelsRequest sendBirdJoinChannelsRequest(SendBirdJoinChannelsRequest sendBirdJoinChannelsRequest) {
      this.sendBirdJoinChannelsRequest = sendBirdJoinChannelsRequest;
      return this;
    }

    /**
     * Execute joinChannels request
     * @return SendBirdSendbirdGroupChannelDetail
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdSendbirdGroupChannelDetail execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute joinChannels request with HTTP info returned
     * @return ApiResponse&lt;SendBirdSendbirdGroupChannelDetail&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdSendbirdGroupChannelDetail> executeWithHttpInfo() throws ApiException {
      return joinChannelsWithHttpInfo(botUserid, apiToken, sendBirdJoinChannelsRequest);
    }
  }

  /**
   * Join channels
   * ## Join channels  Makes a bot join one or more group channels.  [https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/join-channels#1-join-channels](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/join-channels#1-join-channels)
   * @param botUserid (Required)  (required)
   * @return joinChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIjoinChannelsRequest joinChannels(String botUserid) throws ApiException {
    return new APIjoinChannelsRequest(botUserid);
  }

private ApiResponse<Object> leaveAGroupChannelWithHttpInfo(String channelUrl, String botUserid, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling leaveAGroupChannel");
    }
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling leaveAGroupChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/bots/{bot_userid}/channels/{channel_url}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "bot_userid" + "\\}", apiClient.escapeString(botUserid.toString()));

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

    return apiClient.invokeAPI("BotApi.leaveAGroupChannel", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIleaveAGroupChannelRequest {
    private String channelUrl;
    private String botUserid;
    private String apiToken;

    private APIleaveAGroupChannelRequest(String channelUrl, String botUserid) {
      this.channelUrl = channelUrl;
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIleaveAGroupChannelRequest
     */
    public APIleaveAGroupChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute leaveAGroupChannel request
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
     * Execute leaveAGroupChannel request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return leaveAGroupChannelWithHttpInfo(channelUrl, botUserid, apiToken);
    }
  }

  /**
   * Leave channels - When leaving a specific channel
   * ## Leave channels  Makes a bot leave a specific channel  [https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels)
   * @param channelUrl  (required)
   * @param botUserid (Required)  (required)
   * @return leaveAGroupChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIleaveAGroupChannelRequest leaveAGroupChannel(String channelUrl, String botUserid) throws ApiException {
    return new APIleaveAGroupChannelRequest(channelUrl, botUserid);
  }

private ApiResponse<Object> leaveGroupChannelsWithHttpInfo(String botUserid, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling leaveGroupChannels");
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

    return apiClient.invokeAPI("BotApi.leaveGroupChannels", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIleaveGroupChannelsRequest {
    private String botUserid;
    private String apiToken;

    private APIleaveGroupChannelsRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIleaveGroupChannelsRequest
     */
    public APIleaveGroupChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute leaveGroupChannels request
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
     * Execute leaveGroupChannels request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return leaveGroupChannelsWithHttpInfo(botUserid, apiToken);
    }
  }

  /**
   * Leave channels - When leaving all channels
   * ## Leave channels  Makes a bot leave all group channels.  [https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels](https://sendbird.com/docs/chat/platform-api/v3/bot/managing-a-bot/leave-channels#1-leave-channels)
   * @param botUserid (Required)  (required)
   * @return leaveGroupChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIleaveGroupChannelsRequest leaveGroupChannels(String botUserid) throws ApiException {
    return new APIleaveGroupChannelsRequest(botUserid);
  }

private ApiResponse<SendBirdListBotsResponse> listBotsWithHttpInfo(String token, Integer limit, String apiToken) throws ApiException {
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendBirdListBotsResponse> localVarReturnType = new GenericType<SendBirdListBotsResponse>() {};

    return apiClient.invokeAPI("BotApi.listBots", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistBotsRequest {
    private String token;
    private Integer limit;
    private String apiToken;

    private APIlistBotsRequest() {
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
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistBotsRequest
     */
    public APIlistBotsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listBots request
     * @return SendBirdListBotsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdListBotsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listBots request with HTTP info returned
     * @return ApiResponse&lt;SendBirdListBotsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdListBotsResponse> executeWithHttpInfo() throws ApiException {
      return listBotsWithHttpInfo(token, limit, apiToken);
    }
  }

  /**
   * List bots
   * ## List bots  Retrieves a list of all bots within an application.  https://sendbird.com/docs/chat/platform-api/v3/bot/listing-bots/list-bots#1-list-bots
   * @return listBotsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistBotsRequest listBots() throws ApiException {
    return new APIlistBotsRequest();
  }

private ApiResponse<SendBirdSendABotMessageResponse> sendABotMessageWithHttpInfo(String botUserid, String messageType, String channelUrl, String apiToken, String message, List<String> mentioned, SendBirdSendbirdExtendedMessagePayload extendedMessagePayload, File _file, Boolean requireAuth, String mentionType, List<String> mentionedUserIds, Boolean isSilent, List<SendBirdSendbirdSortedMetaarrayInner> sortedMetaarray, String apnsBundleId, Object appleCriticalAlertOptions, String sound, BigDecimal volume, Long createdAt, String customType, String data, String dedupId, Boolean markAsRead, Boolean sendPush) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling sendABotMessage");
    }
    
    // verify the required parameter 'messageType' is set
    if (messageType == null) {
      throw new ApiException(400, "Missing the required parameter 'messageType' when calling sendABotMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling sendABotMessage");
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    if (messageType != null)
      localVarFormParams.put("message_type", messageType);
if (channelUrl != null)
      localVarFormParams.put("channel_url", channelUrl);
if (message != null)
      localVarFormParams.put("message", message);
if (mentioned != null)
      localVarFormParams.put("mentioned", mentioned);
if (extendedMessagePayload != null)
      localVarFormParams.put("extended_message_payload", extendedMessagePayload);
if (_file != null)
      localVarFormParams.put("file", _file);
if (requireAuth != null)
      localVarFormParams.put("require_auth", requireAuth);
if (mentionType != null)
      localVarFormParams.put("mention_type", mentionType);
if (mentionedUserIds != null)
      localVarFormParams.put("mentioned_user_ids", mentionedUserIds);
if (isSilent != null)
      localVarFormParams.put("is_silent", isSilent);
if (sortedMetaarray != null)
      localVarFormParams.put("sorted_metaarray", sortedMetaarray);
if (apnsBundleId != null)
      localVarFormParams.put("apns_bundle_id", apnsBundleId);
if (appleCriticalAlertOptions != null)
      localVarFormParams.put("apple_critical_alert_options", appleCriticalAlertOptions);
if (sound != null)
      localVarFormParams.put("sound", sound);
if (volume != null)
      localVarFormParams.put("volume", volume);
if (createdAt != null)
      localVarFormParams.put("created_at", createdAt);
if (customType != null)
      localVarFormParams.put("custom_type", customType);
if (data != null)
      localVarFormParams.put("data", data);
if (dedupId != null)
      localVarFormParams.put("dedup_id", dedupId);
if (markAsRead != null)
      localVarFormParams.put("mark_as_read", markAsRead);
if (sendPush != null)
      localVarFormParams.put("send_push", sendPush);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendBirdSendABotMessageResponse> localVarReturnType = new GenericType<SendBirdSendABotMessageResponse>() {};

    return apiClient.invokeAPI("BotApi.sendABotMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIsendABotMessageRequest {
    private String botUserid;
    private String messageType;
    private String channelUrl;
    private String apiToken;
    private String message;
    private List<String> mentioned;
    private SendBirdSendbirdExtendedMessagePayload extendedMessagePayload;
    private File _file;
    private Boolean requireAuth;
    private String mentionType;
    private List<String> mentionedUserIds;
    private Boolean isSilent;
    private List<SendBirdSendbirdSortedMetaarrayInner> sortedMetaarray;
    private String apnsBundleId;
    private Object appleCriticalAlertOptions;
    private String sound;
    private BigDecimal volume;
    private Long createdAt;
    private String customType;
    private String data;
    private String dedupId;
    private Boolean markAsRead;
    private Boolean sendPush;

    private APIsendABotMessageRequest(String botUserid) {
      this.botUserid = botUserid;
    }

    /**
     * Set messageType
     * @param messageType Specifies the type of message to send. MESG for text message, FILE for file message. (required)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest messageType(String messageType) {
      this.messageType = messageType;
      return this;
    }

    /**
     * Set channelUrl
     * @param channelUrl Specifies the URL of the channel to send the message to. (required)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest channelUrl(String channelUrl) {
      this.channelUrl = channelUrl;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set message
     * @param message Specifies the content of the message. * This property is required when message_type is MESG. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest message(String message) {
      this.message = message;
      return this;
    }

    /**
     * Set mentioned
     * @param mentioned * This property is available when message_type is MESG. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest mentioned(List<String> mentioned) {
      this.mentioned = mentioned;
      return this;
    }

    /**
     * Set extendedMessagePayload
     * @param extendedMessagePayload  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest extendedMessagePayload(SendBirdSendbirdExtendedMessagePayload extendedMessagePayload) {
      this.extendedMessagePayload = extendedMessagePayload;
      return this;
    }

    /**
     * Set _file
     * @param _file When sending a single file with a message, specifies the data of the file to upload to the Sendbird server in raw binary format. When sending a request containing a file, change the value of the content-type header to multipart/form-data;boundary&#x3D;{your_unique_boundary_string} in the request. * This property is required when message_type is FILE. * This doesn&#39;t allow a converted base64-encoded string from a file as its value. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest _file(File _file) {
      this._file = _file;
      return this;
    }

    /**
     * Set requireAuth
     * @param requireAuth Determines whether to require an authentication key to verify if the file is being properly accessed. Only the user who uploaded the file or users who are in the channel where the file was uploaded should have access. The authentication key managed internally by the Sendbird system is generated every time a user logs in to the Sendbird server and is valid for three days starting from the last login. If set to false, Sendbird tries to access a file without any key. To access encrypted files, such as the files in the Sendbird server which are by default encrypted, the property must be set to true. (Default: false) The require_auth parameter only works if the file or URL is managed by Sendbird, which means that when you upload files using multipart format or provide URLs that point to the files hosted on the Sendbird server. However, if the file is hosted on a server or service that is not managed by Sendbird, access control and authentication for the file should be handled by the respective server or service hosting the file. * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest requireAuth(Boolean requireAuth) {
      this.requireAuth = requireAuth;
      return this;
    }

    /**
     * Set mentionType
     * @param mentionType * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest mentionType(String mentionType) {
      this.mentionType = mentionType;
      return this;
    }

    /**
     * Set mentionedUserIds
     * @param mentionedUserIds * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest mentionedUserIds(List<String> mentionedUserIds) {
      this.mentionedUserIds = mentionedUserIds;
      return this;
    }

    /**
     * Set isSilent
     * @param isSilent * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest isSilent(Boolean isSilent) {
      this.isSilent = isSilent;
      return this;
    }

    /**
     * Set sortedMetaarray
     * @param sortedMetaarray  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest sortedMetaarray(List<SendBirdSendbirdSortedMetaarrayInner> sortedMetaarray) {
      this.sortedMetaarray = sortedMetaarray;
      return this;
    }

    /**
     * Set apnsBundleId
     * @param apnsBundleId * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest apnsBundleId(String apnsBundleId) {
      this.apnsBundleId = apnsBundleId;
      return this;
    }

    /**
     * Set appleCriticalAlertOptions
     * @param appleCriticalAlertOptions * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest appleCriticalAlertOptions(Object appleCriticalAlertOptions) {
      this.appleCriticalAlertOptions = appleCriticalAlertOptions;
      return this;
    }

    /**
     * Set sound
     * @param sound * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest sound(String sound) {
      this.sound = sound;
      return this;
    }

    /**
     * Set volume
     * @param volume * This property is available when message_type is FILE. (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest volume(BigDecimal volume) {
      this.volume = volume;
      return this;
    }

    /**
     * Set createdAt
     * @param createdAt  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest createdAt(Long createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Set customType
     * @param customType  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest customType(String customType) {
      this.customType = customType;
      return this;
    }

    /**
     * Set data
     * @param data  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest data(String data) {
      this.data = data;
      return this;
    }

    /**
     * Set dedupId
     * @param dedupId  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest dedupId(String dedupId) {
      this.dedupId = dedupId;
      return this;
    }

    /**
     * Set markAsRead
     * @param markAsRead  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest markAsRead(Boolean markAsRead) {
      this.markAsRead = markAsRead;
      return this;
    }

    /**
     * Set sendPush
     * @param sendPush  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest sendPush(Boolean sendPush) {
      this.sendPush = sendPush;
      return this;
    }

    /**
     * Execute sendABotMessage request
     * @return SendBirdSendABotMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdSendABotMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute sendABotMessage request with HTTP info returned
     * @return ApiResponse&lt;SendBirdSendABotMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdSendABotMessageResponse> executeWithHttpInfo() throws ApiException {
      return sendABotMessageWithHttpInfo(botUserid, messageType, channelUrl, apiToken, message, mentioned, extendedMessagePayload, _file, requireAuth, mentionType, mentionedUserIds, isSilent, sortedMetaarray, apnsBundleId, appleCriticalAlertOptions, sound, volume, createdAt, customType, data, dedupId, markAsRead, sendPush);
    }
  }

  /**
   * Send a bot&#39;s message
   * ## Send a bot message  Sends a bot message to a group channel.  [https://sendbird.com/docs/chat/platform-api/v3/bot/sending-a-bot-message/send-a-bot-message#1-send-a-bot-message](https://sendbird.com/docs/chat/platform-api/v3/bot/sending-a-bot-message/send-a-bot-message#1-send-a-bot-message)  &#x60;bot_userid&#x60;   Type: string   Description: Specifies the ID of the bot to send a message.
   * @param botUserid (Required)  (required)
   * @return sendABotMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIsendABotMessageRequest sendABotMessage(String botUserid) throws ApiException {
    return new APIsendABotMessageRequest(botUserid);
  }

private ApiResponse<SendBirdUpdateBotByIdResponse> updateBotByIdWithHttpInfo(String botUserid, String apiToken, SendBirdUpdateBotByIdData sendBirdUpdateBotByIdData) throws ApiException {
    Object localVarPostBody = sendBirdUpdateBotByIdData;
    
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

    GenericType<SendBirdUpdateBotByIdResponse> localVarReturnType = new GenericType<SendBirdUpdateBotByIdResponse>() {};

    return apiClient.invokeAPI("BotApi.updateBotById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateBotByIdRequest {
    private String botUserid;
    private String apiToken;
    private SendBirdUpdateBotByIdData sendBirdUpdateBotByIdData;

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
     * Set sendBirdUpdateBotByIdData
     * @param sendBirdUpdateBotByIdData  (optional)
     * @return APIupdateBotByIdRequest
     */
    public APIupdateBotByIdRequest sendBirdUpdateBotByIdData(SendBirdUpdateBotByIdData sendBirdUpdateBotByIdData) {
      this.sendBirdUpdateBotByIdData = sendBirdUpdateBotByIdData;
      return this;
    }

    /**
     * Execute updateBotById request
     * @return SendBirdUpdateBotByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdUpdateBotByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateBotById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdUpdateBotByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdUpdateBotByIdResponse> executeWithHttpInfo() throws ApiException {
      return updateBotByIdWithHttpInfo(botUserid, apiToken, sendBirdUpdateBotByIdData);
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

private ApiResponse<SendBirdViewBotByIdResponse> viewBotByIdWithHttpInfo(String botUserid, String apiToken) throws ApiException {
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

    GenericType<SendBirdViewBotByIdResponse> localVarReturnType = new GenericType<SendBirdViewBotByIdResponse>() {};

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
     * @return SendBirdViewBotByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdViewBotByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewBotById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdViewBotByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdViewBotByIdResponse> executeWithHttpInfo() throws ApiException {
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
