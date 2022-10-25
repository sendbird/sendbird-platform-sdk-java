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
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBotSMessageData;
import org.openapitools.client.model.UpdateBotByIdData;
import org.openapitools.client.model.UpdateBotByIdResponse;
import org.openapitools.client.model.ViewBotByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
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

  /**
   * Create a bot
   * ## Create a bot  Creates a new bot within the application. Creating a bot is similar to creating a normal user, except that a callback URL is specified in order for the bot to receive events.  &gt; __Note__: The bot must [join](#2-join-channels) a group channel first to interact with users. In group channels, you can invite a bot through the [invite as members](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members) action instead.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-create-a-bot
   * @param apiToken  (required)
   * @param createBotData  (optional)
   * @return CreateBotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public CreateBotResponse createBot(String apiToken, CreateBotData createBotData) throws ApiException {
    return createBotWithHttpInfo(apiToken, createBotData).getData();
  }

  /**
   * Create a bot
   * ## Create a bot  Creates a new bot within the application. Creating a bot is similar to creating a normal user, except that a callback URL is specified in order for the bot to receive events.  &gt; __Note__: The bot must [join](#2-join-channels) a group channel first to interact with users. In group channels, you can invite a bot through the [invite as members](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-invite-as-members) action instead.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-create-a-bot
   * @param apiToken  (required)
   * @param createBotData  (optional)
   * @return ApiResponse&lt;CreateBotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateBotResponse> createBotWithHttpInfo(String apiToken, CreateBotData createBotData) throws ApiException {
    Object localVarPostBody = createBotData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling createBot");
    }
    
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
  /**
   * Delete a bot
   * ## Delete a bot  Deletes a bot from an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-delete-a-bot ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object deleteBotById(String apiToken, String botUserid) throws ApiException {
    return deleteBotByIdWithHttpInfo(apiToken, botUserid).getData();
  }

  /**
   * Delete a bot
   * ## Delete a bot  Deletes a bot from an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-delete-a-bot ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deleteBotByIdWithHttpInfo(String apiToken, String botUserid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteBotById");
    }
    
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
  /**
   * Join channels
   * ## Join channels  Makes a bot join one or more channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-join-channels ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param joinChannelsData  (optional)
   * @return JoinChannelsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public JoinChannelsResponse joinChannels(String apiToken, String botUserid, JoinChannelsData joinChannelsData) throws ApiException {
    return joinChannelsWithHttpInfo(apiToken, botUserid, joinChannelsData).getData();
  }

  /**
   * Join channels
   * ## Join channels  Makes a bot join one or more channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-join-channels ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param joinChannelsData  (optional)
   * @return ApiResponse&lt;JoinChannelsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<JoinChannelsResponse> joinChannelsWithHttpInfo(String apiToken, String botUserid, JoinChannelsData joinChannelsData) throws ApiException {
    Object localVarPostBody = joinChannelsData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling joinChannels");
    }
    
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
  /**
   * Leave channels - When leaving all channels
   * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param channelUrl  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public void leaveChannels(String apiToken, String botUserid, String channelUrl) throws ApiException {
    leaveChannelsWithHttpInfo(apiToken, botUserid, channelUrl);
  }

  /**
   * Leave channels - When leaving all channels
   * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param channelUrl  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> leaveChannelsWithHttpInfo(String apiToken, String botUserid, String channelUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling leaveChannels");
    }
    
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
  /**
   * Leave channels - When leaving a channel by its channel URL
   * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param channelUrl  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object leaveChannelsByUrl(String apiToken, String botUserid, String channelUrl) throws ApiException {
    return leaveChannelsByUrlWithHttpInfo(apiToken, botUserid, channelUrl).getData();
  }

  /**
   * Leave channels - When leaving a channel by its channel URL
   * ## Leave channels  Makes a bot leave one or more group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-leave-channels ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param channelUrl  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> leaveChannelsByUrlWithHttpInfo(String apiToken, String botUserid, String channelUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling leaveChannelsByUrl");
    }
    
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
  /**
   * List bots
   * ## List bots  Retrieves a list of all bots within an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ListBotsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListBotsResponse listBots(String apiToken, String token, Integer limit) throws ApiException {
    return listBotsWithHttpInfo(apiToken, token, limit).getData();
  }

  /**
   * List bots
   * ## List bots  Retrieves a list of all bots within an application.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;ListBotsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListBotsResponse> listBotsWithHttpInfo(String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listBots");
    }
    
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
  /**
   * Send a bot&#39;s message
   * ## Send a bot&#39;s message  Sends a bot&#39;s message to a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-send-a-bot-s-message ----------------------------   &#x60;bot_userid&#x60;      Type: string      Description: Specifies the ID of the bot to send a message.
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param sendBotSMessageData  (optional)
   * @return SendBirdMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdMessageResponse sendBotsMessage(String apiToken, String botUserid, SendBotSMessageData sendBotSMessageData) throws ApiException {
    return sendBotsMessageWithHttpInfo(apiToken, botUserid, sendBotSMessageData).getData();
  }

  /**
   * Send a bot&#39;s message
   * ## Send a bot&#39;s message  Sends a bot&#39;s message to a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-send-a-bot-s-message ----------------------------   &#x60;bot_userid&#x60;      Type: string      Description: Specifies the ID of the bot to send a message.
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param sendBotSMessageData  (optional)
   * @return ApiResponse&lt;SendBirdMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdMessageResponse> sendBotsMessageWithHttpInfo(String apiToken, String botUserid, SendBotSMessageData sendBotSMessageData) throws ApiException {
    Object localVarPostBody = sendBotSMessageData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling sendBotsMessage");
    }
    
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

    GenericType<SendBirdMessageResponse> localVarReturnType = new GenericType<SendBirdMessageResponse>() {};

    return apiClient.invokeAPI("BotApi.sendBotsMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a bot
   * ## Update a bot  Updates information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-update-a-bot ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param updateBotByIdData  (optional)
   * @return UpdateBotByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateBotByIdResponse updateBotById(String apiToken, String botUserid, UpdateBotByIdData updateBotByIdData) throws ApiException {
    return updateBotByIdWithHttpInfo(apiToken, botUserid, updateBotByIdData).getData();
  }

  /**
   * Update a bot
   * ## Update a bot  Updates information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-update-a-bot ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @param updateBotByIdData  (optional)
   * @return ApiResponse&lt;UpdateBotByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateBotByIdResponse> updateBotByIdWithHttpInfo(String apiToken, String botUserid, UpdateBotByIdData updateBotByIdData) throws ApiException {
    Object localVarPostBody = updateBotByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateBotById");
    }
    
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
  /**
   * View a bot
   * ## View a bot  Retrieves information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-view-a-bot ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @return ViewBotByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewBotByIdResponse viewBotById(String apiToken, String botUserid) throws ApiException {
    return viewBotByIdWithHttpInfo(apiToken, botUserid).getData();
  }

  /**
   * View a bot
   * ## View a bot  Retrieves information on a bot.  https://sendbird.com/docs/chat/v3/platform-api/guides/bot-interface#2-view-a-bot ----------------------------
   * @param apiToken  (required)
   * @param botUserid  (required)
   * @return ApiResponse&lt;ViewBotByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewBotByIdResponse> viewBotByIdWithHttpInfo(String apiToken, String botUserid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewBotById");
    }
    
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
}
