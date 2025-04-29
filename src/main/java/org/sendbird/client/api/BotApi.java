package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.CreateABotRequest;
import org.openapitools.client.model.CreateABotResponse;
import org.openapitools.client.model.JoinChannelsRequest;
import org.openapitools.client.model.ListBotsResponse;
import org.openapitools.client.model.SendABotMessageRequest;
import org.openapitools.client.model.SendbirdGroupChannelDetail;
import org.openapitools.client.model.SendbirdMessageResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-29T07:36:12.748535+07:00[Asia/Jakarta]")
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


private ApiResponse<CreateABotResponse> createABotWithHttpInfo(String apiToken, CreateABotRequest createABotRequest) throws ApiException {
    Object localVarPostBody = createABotRequest;
    
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

    GenericType<CreateABotResponse> localVarReturnType = new GenericType<CreateABotResponse>() {};

    return apiClient.invokeAPI("BotApi.createABot", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateABotRequest {
    private String apiToken;
    private CreateABotRequest createABotRequest;

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
     * Set createABotRequest
     * @param createABotRequest  (optional)
     * @return APIcreateABotRequest
     */
    public APIcreateABotRequest createABotRequest(CreateABotRequest createABotRequest) {
      this.createABotRequest = createABotRequest;
      return this;
    }

    /**
     * Execute createABot request
     * @return CreateABotResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CreateABotResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createABot request with HTTP info returned
     * @return ApiResponse&lt;CreateABotResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CreateABotResponse> executeWithHttpInfo() throws ApiException {
      return createABotWithHttpInfo(apiToken, createABotRequest);
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

private ApiResponse<SendbirdGroupChannelDetail> joinChannelsWithHttpInfo(String botUserid, String apiToken, JoinChannelsRequest joinChannelsRequest) throws ApiException {
    Object localVarPostBody = joinChannelsRequest;
    
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

    GenericType<SendbirdGroupChannelDetail> localVarReturnType = new GenericType<SendbirdGroupChannelDetail>() {};

    return apiClient.invokeAPI("BotApi.joinChannels", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIjoinChannelsRequest {
    private String botUserid;
    private String apiToken;
    private JoinChannelsRequest joinChannelsRequest;

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
     * Set joinChannelsRequest
     * @param joinChannelsRequest  (optional)
     * @return APIjoinChannelsRequest
     */
    public APIjoinChannelsRequest joinChannelsRequest(JoinChannelsRequest joinChannelsRequest) {
      this.joinChannelsRequest = joinChannelsRequest;
      return this;
    }

    /**
     * Execute joinChannels request
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
     * Execute joinChannels request with HTTP info returned
     * @return ApiResponse&lt;SendbirdGroupChannelDetail&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdGroupChannelDetail> executeWithHttpInfo() throws ApiException {
      return joinChannelsWithHttpInfo(botUserid, apiToken, joinChannelsRequest);
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

private ApiResponse<ListBotsResponse> listBotsWithHttpInfo(String token, Integer limit, String apiToken) throws ApiException {
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

    GenericType<ListBotsResponse> localVarReturnType = new GenericType<ListBotsResponse>() {};

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

private ApiResponse<SendbirdMessageResponse> sendABotMessageWithHttpInfo(String botUserid, String apiToken, SendABotMessageRequest sendABotMessageRequest) throws ApiException {
    Object localVarPostBody = sendABotMessageRequest;
    
    // verify the required parameter 'botUserid' is set
    if (botUserid == null) {
      throw new ApiException(400, "Missing the required parameter 'botUserid' when calling sendABotMessage");
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

    return apiClient.invokeAPI("BotApi.sendABotMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIsendABotMessageRequest {
    private String botUserid;
    private String apiToken;
    private SendABotMessageRequest sendABotMessageRequest;

    private APIsendABotMessageRequest(String botUserid) {
      this.botUserid = botUserid;
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
     * Set sendABotMessageRequest
     * @param sendABotMessageRequest  (optional)
     * @return APIsendABotMessageRequest
     */
    public APIsendABotMessageRequest sendABotMessageRequest(SendABotMessageRequest sendABotMessageRequest) {
      this.sendABotMessageRequest = sendABotMessageRequest;
      return this;
    }

    /**
     * Execute sendABotMessage request
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
     * Execute sendABotMessage request with HTTP info returned
     * @return ApiResponse&lt;SendbirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return sendABotMessageWithHttpInfo(botUserid, apiToken, sendABotMessageRequest);
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
}
