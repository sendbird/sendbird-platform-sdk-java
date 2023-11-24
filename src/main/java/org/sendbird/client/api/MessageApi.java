package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.AddEmojiCategoriesResponse;
import org.openapitools.client.model.AddEmojisData;
import org.openapitools.client.model.AddEmojisResponse;
import org.openapitools.client.model.AddExtraDataToMessageData;
import org.openapitools.client.model.AddExtraDataToMessageResponse;
import org.openapitools.client.model.AddReactionToAMessageData;
import org.openapitools.client.model.AddReactionToAMessageResponse;
import org.openapitools.client.model.EnableReactionsData;
import org.openapitools.client.model.EnableReactionsResponse;
import org.openapitools.client.model.GcMarkAllMessagesAsDeliveredData;
import org.openapitools.client.model.GcMarkAllMessagesAsDeliveredResponse;
import org.openapitools.client.model.GcMarkAllMessagesAsReadData;
import org.openapitools.client.model.GcViewNumberOfEachMembersUnreadMessagesResponse;
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponse;
import org.openapitools.client.model.ListAnnouncementsResponse;
import org.openapitools.client.model.ListEmojisResponse;
import org.openapitools.client.model.ListMessagesResponse;
import org.openapitools.client.model.ListReactionsOfMessageResponse;
import org.openapitools.client.model.RemoveReactionFromAMessageResponse;
import org.openapitools.client.model.SendBirdEmoji;
import org.openapitools.client.model.SendBirdEmojiCategory;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendMessageData;
import org.openapitools.client.model.TranslateMessageIntoOtherLanguagesData;
import org.openapitools.client.model.UpdateEmojiCategoryUrlByIdData;
import org.openapitools.client.model.UpdateEmojiUrlByKeyData;
import org.openapitools.client.model.UpdateExtraDataInMessageData;
import org.openapitools.client.model.UpdateExtraDataInMessageResponse;
import org.openapitools.client.model.UpdateMessageByIdData;
import org.openapitools.client.model.UseDefaultEmojisData;
import org.openapitools.client.model.UseDefaultEmojisResponse;
import org.openapitools.client.model.ViewTotalNumberOfMessagesInChannelResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:44:31.188701+09:00[Asia/Seoul]")
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


private ApiResponse<AddEmojiCategoriesResponse> addEmojiCategoriesWithHttpInfo(String apiToken, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v3/emoji_categories";

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

    GenericType<AddEmojiCategoriesResponse> localVarReturnType = new GenericType<AddEmojiCategoriesResponse>() {};

    return apiClient.invokeAPI("MessageApi.addEmojiCategories", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIaddEmojiCategoriesRequest {
    private String apiToken;
    private Object body;

    private APIaddEmojiCategoriesRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddEmojiCategoriesRequest
     */
    public APIaddEmojiCategoriesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIaddEmojiCategoriesRequest
     */
    public APIaddEmojiCategoriesRequest body(Object body) {
      this.body = body;
      return this;
    }

    /**
     * Execute addEmojiCategories request
     * @return AddEmojiCategoriesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddEmojiCategoriesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addEmojiCategories request with HTTP info returned
     * @return ApiResponse&lt;AddEmojiCategoriesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddEmojiCategoriesResponse> executeWithHttpInfo() throws ApiException {
      return addEmojiCategoriesWithHttpInfo(apiToken, body);
    }
  }

  /**
   * Add emoji categories
   * ## Add emoji categories  Adds a list of one or more new emoji categories to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emoji-categories
   * @return addEmojiCategoriesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddEmojiCategoriesRequest addEmojiCategories() throws ApiException {
    return new APIaddEmojiCategoriesRequest();
  }

private ApiResponse<AddEmojisResponse> addEmojisWithHttpInfo(String apiToken, AddEmojisData addEmojisData) throws ApiException {
    Object localVarPostBody = addEmojisData;
    
    // create path and map variables
    String localVarPath = "/v3/emojis";

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

    GenericType<AddEmojisResponse> localVarReturnType = new GenericType<AddEmojisResponse>() {};

    return apiClient.invokeAPI("MessageApi.addEmojis", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIaddEmojisRequest {
    private String apiToken;
    private AddEmojisData addEmojisData;

    private APIaddEmojisRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddEmojisRequest
     */
    public APIaddEmojisRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addEmojisData
     * @param addEmojisData  (optional)
     * @return APIaddEmojisRequest
     */
    public APIaddEmojisRequest addEmojisData(AddEmojisData addEmojisData) {
      this.addEmojisData = addEmojisData;
      return this;
    }

    /**
     * Execute addEmojis request
     * @return AddEmojisResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddEmojisResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addEmojis request with HTTP info returned
     * @return ApiResponse&lt;AddEmojisResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddEmojisResponse> executeWithHttpInfo() throws ApiException {
      return addEmojisWithHttpInfo(apiToken, addEmojisData);
    }
  }

  /**
   * Add emojis
   * ## Add emojis  Adds a list of one or more new emojis to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emojis
   * @return addEmojisRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddEmojisRequest addEmojis() throws ApiException {
    return new APIaddEmojisRequest();
  }

private ApiResponse<AddExtraDataToMessageResponse> addExtraDataToMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, AddExtraDataToMessageData addExtraDataToMessageData) throws ApiException {
    Object localVarPostBody = addExtraDataToMessageData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling addExtraDataToMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling addExtraDataToMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling addExtraDataToMessage");
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

    GenericType<AddExtraDataToMessageResponse> localVarReturnType = new GenericType<AddExtraDataToMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.addExtraDataToMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIaddExtraDataToMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private AddExtraDataToMessageData addExtraDataToMessageData;

    private APIaddExtraDataToMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddExtraDataToMessageRequest
     */
    public APIaddExtraDataToMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addExtraDataToMessageData
     * @param addExtraDataToMessageData  (optional)
     * @return APIaddExtraDataToMessageRequest
     */
    public APIaddExtraDataToMessageRequest addExtraDataToMessageData(AddExtraDataToMessageData addExtraDataToMessageData) {
      this.addExtraDataToMessageData = addExtraDataToMessageData;
      return this;
    }

    /**
     * Execute addExtraDataToMessage request
     * @return AddExtraDataToMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddExtraDataToMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addExtraDataToMessage request with HTTP info returned
     * @return ApiResponse&lt;AddExtraDataToMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddExtraDataToMessageResponse> executeWithHttpInfo() throws ApiException {
      return addExtraDataToMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, addExtraDataToMessageData);
    }
  }

  /**
   * Add extra data to a message
   * ## Add extra data to a message  Adds one or more key-values items which store additional information for a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-extra-data-to-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return addExtraDataToMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddExtraDataToMessageRequest addExtraDataToMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIaddExtraDataToMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<AddReactionToAMessageResponse> addReactionToAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, AddReactionToAMessageData addReactionToAMessageData) throws ApiException {
    Object localVarPostBody = addReactionToAMessageData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling addReactionToAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling addReactionToAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling addReactionToAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/reactions"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    GenericType<AddReactionToAMessageResponse> localVarReturnType = new GenericType<AddReactionToAMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.addReactionToAMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIaddReactionToAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private AddReactionToAMessageData addReactionToAMessageData;

    private APIaddReactionToAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIaddReactionToAMessageRequest
     */
    public APIaddReactionToAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set addReactionToAMessageData
     * @param addReactionToAMessageData  (optional)
     * @return APIaddReactionToAMessageRequest
     */
    public APIaddReactionToAMessageRequest addReactionToAMessageData(AddReactionToAMessageData addReactionToAMessageData) {
      this.addReactionToAMessageData = addReactionToAMessageData;
      return this;
    }

    /**
     * Execute addReactionToAMessage request
     * @return AddReactionToAMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AddReactionToAMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute addReactionToAMessage request with HTTP info returned
     * @return ApiResponse&lt;AddReactionToAMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<AddReactionToAMessageResponse> executeWithHttpInfo() throws ApiException {
      return addReactionToAMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, addReactionToAMessageData);
    }
  }

  /**
   * Add a reaction to a message
   * ## Add a reaction to a message  Adds a specific reaction to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-a-reaction-to-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return addReactionToAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIaddReactionToAMessageRequest addReactionToAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIaddReactionToAMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<Void> deleteEmojiByKeyWithHttpInfo(String emojiKey, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emojiKey' is set
    if (emojiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'emojiKey' when calling deleteEmojiByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/emojis/{emoji_key}"
      .replaceAll("\\{" + "emoji_key" + "\\}", apiClient.escapeString(emojiKey.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("MessageApi.deleteEmojiByKey", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteEmojiByKeyRequest {
    private String emojiKey;
    private String apiToken;

    private APIdeleteEmojiByKeyRequest(String emojiKey) {
      this.emojiKey = emojiKey;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteEmojiByKeyRequest
     */
    public APIdeleteEmojiByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteEmojiByKey request
     
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
     * Execute deleteEmojiByKey request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteEmojiByKeyWithHttpInfo(emojiKey, apiToken);
    }
  }

  /**
   * Delete an emoji
   * ## Delete an emoji  Deletes an emoji from the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji ----------------------------
   * @param emojiKey  (required)
   * @return deleteEmojiByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteEmojiByKeyRequest deleteEmojiByKey(String emojiKey) throws ApiException {
    return new APIdeleteEmojiByKeyRequest(emojiKey);
  }

private ApiResponse<Object> deleteEmojiCategoryByIdWithHttpInfo(String emojiCategoryId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emojiCategoryId' is set
    if (emojiCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'emojiCategoryId' when calling deleteEmojiCategoryById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/emoji_categories/{emoji_category_id}"
      .replaceAll("\\{" + "emoji_category_id" + "\\}", apiClient.escapeString(emojiCategoryId.toString()));

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

    return apiClient.invokeAPI("MessageApi.deleteEmojiCategoryById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteEmojiCategoryByIdRequest {
    private String emojiCategoryId;
    private String apiToken;

    private APIdeleteEmojiCategoryByIdRequest(String emojiCategoryId) {
      this.emojiCategoryId = emojiCategoryId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteEmojiCategoryByIdRequest
     */
    public APIdeleteEmojiCategoryByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteEmojiCategoryById request
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
     * Execute deleteEmojiCategoryById request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteEmojiCategoryByIdWithHttpInfo(emojiCategoryId, apiToken);
    }
  }

  /**
   * Delete an emoji category
   * ## Delete an emoji category  Deletes an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji-category ----------------------------
   * @param emojiCategoryId  (required)
   * @return deleteEmojiCategoryByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteEmojiCategoryByIdRequest deleteEmojiCategoryById(String emojiCategoryId) throws ApiException {
    return new APIdeleteEmojiCategoryByIdRequest(emojiCategoryId);
  }

private ApiResponse<Object> deleteMessageByIdWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling deleteMessageById");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteMessageById");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling deleteMessageById");
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

    return apiClient.invokeAPI("MessageApi.deleteMessageById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteMessageByIdRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;

    private APIdeleteMessageByIdRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteMessageByIdRequest
     */
    public APIdeleteMessageByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteMessageById request
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
     * Execute deleteMessageById request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteMessageByIdWithHttpInfo(channelType, channelUrl, messageId, apiToken);
    }
  }

  /**
   * Delete a message
   * ## Delete a message  Deletes a message from a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-delete-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return deleteMessageByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteMessageByIdRequest deleteMessageById(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIdeleteMessageByIdRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<EnableReactionsResponse> enableReactionsWithHttpInfo(String apiToken, EnableReactionsData enableReactionsData) throws ApiException {
    Object localVarPostBody = enableReactionsData;
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/reactions";

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

    GenericType<EnableReactionsResponse> localVarReturnType = new GenericType<EnableReactionsResponse>() {};

    return apiClient.invokeAPI("MessageApi.enableReactions", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIenableReactionsRequest {
    private String apiToken;
    private EnableReactionsData enableReactionsData;

    private APIenableReactionsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIenableReactionsRequest
     */
    public APIenableReactionsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set enableReactionsData
     * @param enableReactionsData  (optional)
     * @return APIenableReactionsRequest
     */
    public APIenableReactionsRequest enableReactionsData(EnableReactionsData enableReactionsData) {
      this.enableReactionsData = enableReactionsData;
      return this;
    }

    /**
     * Execute enableReactions request
     * @return EnableReactionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public EnableReactionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute enableReactions request with HTTP info returned
     * @return ApiResponse&lt;EnableReactionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<EnableReactionsResponse> executeWithHttpInfo() throws ApiException {
      return enableReactionsWithHttpInfo(apiToken, enableReactionsData);
    }
  }

  /**
   * Enable reactions
   * ## Enable reactions  Turn on or off reactions in a Sendbird application.  &gt; __Note__: This action also allows reactions in UIKit.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-enable-reactions
   * @return enableReactionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIenableReactionsRequest enableReactions() throws ApiException {
    return new APIenableReactionsRequest();
  }

private ApiResponse<GcMarkAllMessagesAsDeliveredResponse> gcMarkAllMessagesAsDeliveredWithHttpInfo(String channelUrl, String apiToken, GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData) throws ApiException {
    Object localVarPostBody = gcMarkAllMessagesAsDeliveredData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcMarkAllMessagesAsDelivered");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/messages/mark_as_delivered"
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

    GenericType<GcMarkAllMessagesAsDeliveredResponse> localVarReturnType = new GenericType<GcMarkAllMessagesAsDeliveredResponse>() {};

    return apiClient.invokeAPI("MessageApi.gcMarkAllMessagesAsDelivered", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcMarkAllMessagesAsDeliveredRequest {
    private String channelUrl;
    private String apiToken;
    private GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData;

    private APIgcMarkAllMessagesAsDeliveredRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcMarkAllMessagesAsDeliveredRequest
     */
    public APIgcMarkAllMessagesAsDeliveredRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcMarkAllMessagesAsDeliveredData
     * @param gcMarkAllMessagesAsDeliveredData  (optional)
     * @return APIgcMarkAllMessagesAsDeliveredRequest
     */
    public APIgcMarkAllMessagesAsDeliveredRequest gcMarkAllMessagesAsDeliveredData(GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData) {
      this.gcMarkAllMessagesAsDeliveredData = gcMarkAllMessagesAsDeliveredData;
      return this;
    }

    /**
     * Execute gcMarkAllMessagesAsDelivered request
     * @return GcMarkAllMessagesAsDeliveredResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcMarkAllMessagesAsDeliveredResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcMarkAllMessagesAsDelivered request with HTTP info returned
     * @return ApiResponse&lt;GcMarkAllMessagesAsDeliveredResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcMarkAllMessagesAsDeliveredResponse> executeWithHttpInfo() throws ApiException {
      return gcMarkAllMessagesAsDeliveredWithHttpInfo(channelUrl, apiToken, gcMarkAllMessagesAsDeliveredData);
    }
  }

  /**
   * Mark all messages as delivered
   * ## Mark all messages as delivered  Marks all messages in a group channel as delivered for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-delivered ----------------------------
   * @param channelUrl  (required)
   * @return gcMarkAllMessagesAsDeliveredRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcMarkAllMessagesAsDeliveredRequest gcMarkAllMessagesAsDelivered(String channelUrl) throws ApiException {
    return new APIgcMarkAllMessagesAsDeliveredRequest(channelUrl);
  }

private ApiResponse<Object> gcMarkAllMessagesAsReadWithHttpInfo(String channelUrl, String apiToken, GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData) throws ApiException {
    Object localVarPostBody = gcMarkAllMessagesAsReadData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcMarkAllMessagesAsRead");
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

    return apiClient.invokeAPI("MessageApi.gcMarkAllMessagesAsRead", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcMarkAllMessagesAsReadRequest {
    private String channelUrl;
    private String apiToken;
    private GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData;

    private APIgcMarkAllMessagesAsReadRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcMarkAllMessagesAsReadRequest
     */
    public APIgcMarkAllMessagesAsReadRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set gcMarkAllMessagesAsReadData
     * @param gcMarkAllMessagesAsReadData  (optional)
     * @return APIgcMarkAllMessagesAsReadRequest
     */
    public APIgcMarkAllMessagesAsReadRequest gcMarkAllMessagesAsReadData(GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData) {
      this.gcMarkAllMessagesAsReadData = gcMarkAllMessagesAsReadData;
      return this;
    }

    /**
     * Execute gcMarkAllMessagesAsRead request
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
     * Execute gcMarkAllMessagesAsRead request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return gcMarkAllMessagesAsReadWithHttpInfo(channelUrl, apiToken, gcMarkAllMessagesAsReadData);
    }
  }

  /**
   * Mark all messages as read
   * ## Mark all messages as read  Marks all messages in a group channel as read for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-read ----------------------------
   * @param channelUrl  (required)
   * @return gcMarkAllMessagesAsReadRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcMarkAllMessagesAsReadRequest gcMarkAllMessagesAsRead(String channelUrl) throws ApiException {
    return new APIgcMarkAllMessagesAsReadRequest(channelUrl);
  }

private ApiResponse<GcViewNumberOfEachMembersUnreadMessagesResponse> gcViewNumberOfEachMembersUnreadMessagesWithHttpInfo(String channelUrl, String apiToken, String userIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling gcViewNumberOfEachMembersUnreadMessages");
    }
    
    // create path and map variables
    String localVarPath = "/v3/group_channels/{channel_url}/messages/unread_count"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_ids", userIds));

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

    GenericType<GcViewNumberOfEachMembersUnreadMessagesResponse> localVarReturnType = new GenericType<GcViewNumberOfEachMembersUnreadMessagesResponse>() {};

    return apiClient.invokeAPI("MessageApi.gcViewNumberOfEachMembersUnreadMessages", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgcViewNumberOfEachMembersUnreadMessagesRequest {
    private String channelUrl;
    private String apiToken;
    private String userIds;

    private APIgcViewNumberOfEachMembersUnreadMessagesRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgcViewNumberOfEachMembersUnreadMessagesRequest
     */
    public APIgcViewNumberOfEachMembersUnreadMessagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set userIds
     * @param userIds  (optional)
     * @return APIgcViewNumberOfEachMembersUnreadMessagesRequest
     */
    public APIgcViewNumberOfEachMembersUnreadMessagesRequest userIds(String userIds) {
      this.userIds = userIds;
      return this;
    }

    /**
     * Execute gcViewNumberOfEachMembersUnreadMessages request
     * @return GcViewNumberOfEachMembersUnreadMessagesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GcViewNumberOfEachMembersUnreadMessagesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute gcViewNumberOfEachMembersUnreadMessages request with HTTP info returned
     * @return ApiResponse&lt;GcViewNumberOfEachMembersUnreadMessagesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GcViewNumberOfEachMembersUnreadMessagesResponse> executeWithHttpInfo() throws ApiException {
      return gcViewNumberOfEachMembersUnreadMessagesWithHttpInfo(channelUrl, apiToken, userIds);
    }
  }

  /**
   * View number of each member&#39;s unread messages
   * ## View number of each member&#39;s unread messages  Retrieves the total number of each member&#39;s unread messages in a group channel. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-number-of-each-member-s-unread-messages ----------------------------
   * @param channelUrl  (required)
   * @return gcViewNumberOfEachMembersUnreadMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgcViewNumberOfEachMembersUnreadMessagesRequest gcViewNumberOfEachMembersUnreadMessages(String channelUrl) throws ApiException {
    return new APIgcViewNumberOfEachMembersUnreadMessagesRequest(channelUrl);
  }

private ApiResponse<SendBirdEmoji> getEmojiByKeyWithHttpInfo(String emojiKey, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emojiKey' is set
    if (emojiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'emojiKey' when calling getEmojiByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/emojis/{emoji_key}"
      .replaceAll("\\{" + "emoji_key" + "\\}", apiClient.escapeString(emojiKey.toString()));

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

    GenericType<SendBirdEmoji> localVarReturnType = new GenericType<SendBirdEmoji>() {};

    return apiClient.invokeAPI("MessageApi.getEmojiByKey", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetEmojiByKeyRequest {
    private String emojiKey;
    private String apiToken;

    private APIgetEmojiByKeyRequest(String emojiKey) {
      this.emojiKey = emojiKey;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetEmojiByKeyRequest
     */
    public APIgetEmojiByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getEmojiByKey request
     * @return SendBirdEmoji
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdEmoji execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getEmojiByKey request with HTTP info returned
     * @return ApiResponse&lt;SendBirdEmoji&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdEmoji> executeWithHttpInfo() throws ApiException {
      return getEmojiByKeyWithHttpInfo(emojiKey, apiToken);
    }
  }

  /**
   * Get an emoji
   * ## Get an emoji  Retrieves an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji ----------------------------
   * @param emojiKey  (required)
   * @return getEmojiByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetEmojiByKeyRequest getEmojiByKey(String emojiKey) throws ApiException {
    return new APIgetEmojiByKeyRequest(emojiKey);
  }

private ApiResponse<SendBirdEmojiCategory> getEmojiCategoryByIdWithHttpInfo(String emojiCategoryId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emojiCategoryId' is set
    if (emojiCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'emojiCategoryId' when calling getEmojiCategoryById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/emoji_categories/{emoji_category_id}"
      .replaceAll("\\{" + "emoji_category_id" + "\\}", apiClient.escapeString(emojiCategoryId.toString()));

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

    GenericType<SendBirdEmojiCategory> localVarReturnType = new GenericType<SendBirdEmojiCategory>() {};

    return apiClient.invokeAPI("MessageApi.getEmojiCategoryById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetEmojiCategoryByIdRequest {
    private String emojiCategoryId;
    private String apiToken;

    private APIgetEmojiCategoryByIdRequest(String emojiCategoryId) {
      this.emojiCategoryId = emojiCategoryId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetEmojiCategoryByIdRequest
     */
    public APIgetEmojiCategoryByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getEmojiCategoryById request
     * @return SendBirdEmojiCategory
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdEmojiCategory execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getEmojiCategoryById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdEmojiCategory&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdEmojiCategory> executeWithHttpInfo() throws ApiException {
      return getEmojiCategoryByIdWithHttpInfo(emojiCategoryId, apiToken);
    }
  }

  /**
   * Get an emoji category
   * ## Get an emoji category  Retrieves an emoji category with the specified ID, including its emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji-category ----------------------------   &#x60;emoji_category_id&#x60;      Type: int      Description: Specifies the unique ID of the emoji category to retrieve.
   * @param emojiCategoryId  (required)
   * @return getEmojiCategoryByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetEmojiCategoryByIdRequest getEmojiCategoryById(String emojiCategoryId) throws ApiException {
    return new APIgetEmojiCategoryByIdRequest(emojiCategoryId);
  }

private ApiResponse<ListAllEmojisAndEmojiCategoriesResponse> listAllEmojisAndEmojiCategoriesWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/emoji_categories";

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

    GenericType<ListAllEmojisAndEmojiCategoriesResponse> localVarReturnType = new GenericType<ListAllEmojisAndEmojiCategoriesResponse>() {};

    return apiClient.invokeAPI("MessageApi.listAllEmojisAndEmojiCategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistAllEmojisAndEmojiCategoriesRequest {
    private String apiToken;

    private APIlistAllEmojisAndEmojiCategoriesRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistAllEmojisAndEmojiCategoriesRequest
     */
    public APIlistAllEmojisAndEmojiCategoriesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listAllEmojisAndEmojiCategories request
     * @return ListAllEmojisAndEmojiCategoriesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListAllEmojisAndEmojiCategoriesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAllEmojisAndEmojiCategories request with HTTP info returned
     * @return ApiResponse&lt;ListAllEmojisAndEmojiCategoriesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListAllEmojisAndEmojiCategoriesResponse> executeWithHttpInfo() throws ApiException {
      return listAllEmojisAndEmojiCategoriesWithHttpInfo(apiToken);
    }
  }

  /**
   * List all emojis and emoji categories
   * ## List all emojis and emoji categories  Retrieves a list of all emoji categories registered to the application, including their emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-all-emojis-and-emoji-categories
   * @return listAllEmojisAndEmojiCategoriesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAllEmojisAndEmojiCategoriesRequest listAllEmojisAndEmojiCategories() throws ApiException {
    return new APIlistAllEmojisAndEmojiCategoriesRequest();
  }

private ApiResponse<ListAnnouncementsResponse> listAnnouncementsWithHttpInfo(String apiToken, String token, Integer limit, String order, String status, String announcementGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/announcements";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "announcement_group", announcementGroup));

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

    GenericType<ListAnnouncementsResponse> localVarReturnType = new GenericType<ListAnnouncementsResponse>() {};

    return apiClient.invokeAPI("MessageApi.listAnnouncements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistAnnouncementsRequest {
    private String apiToken;
    private String token;
    private Integer limit;
    private String order;
    private String status;
    private String announcementGroup;

    private APIlistAnnouncementsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistAnnouncementsRequest
     */
    public APIlistAnnouncementsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistAnnouncementsRequest
     */
    public APIlistAnnouncementsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistAnnouncementsRequest
     */
    public APIlistAnnouncementsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set order
     * @param order  (optional)
     * @return APIlistAnnouncementsRequest
     */
    public APIlistAnnouncementsRequest order(String order) {
      this.order = order;
      return this;
    }

    /**
     * Set status
     * @param status  (optional)
     * @return APIlistAnnouncementsRequest
     */
    public APIlistAnnouncementsRequest status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set announcementGroup
     * @param announcementGroup  (optional)
     * @return APIlistAnnouncementsRequest
     */
    public APIlistAnnouncementsRequest announcementGroup(String announcementGroup) {
      this.announcementGroup = announcementGroup;
      return this;
    }

    /**
     * Execute listAnnouncements request
     * @return ListAnnouncementsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListAnnouncementsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAnnouncements request with HTTP info returned
     * @return ApiResponse&lt;ListAnnouncementsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListAnnouncementsResponse> executeWithHttpInfo() throws ApiException {
      return listAnnouncementsWithHttpInfo(apiToken, token, limit, order, status, announcementGroup);
    }
  }

  /**
   * List announcements
   * ## List announcements  Retrieves a list of announcements.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcements ----------------------------
   * @return listAnnouncementsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAnnouncementsRequest listAnnouncements() throws ApiException {
    return new APIlistAnnouncementsRequest();
  }

private ApiResponse<ListEmojisResponse> listEmojisWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/emojis";

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

    GenericType<ListEmojisResponse> localVarReturnType = new GenericType<ListEmojisResponse>() {};

    return apiClient.invokeAPI("MessageApi.listEmojis", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistEmojisRequest {
    private String apiToken;

    private APIlistEmojisRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistEmojisRequest
     */
    public APIlistEmojisRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listEmojis request
     * @return ListEmojisResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListEmojisResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listEmojis request with HTTP info returned
     * @return ApiResponse&lt;ListEmojisResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListEmojisResponse> executeWithHttpInfo() throws ApiException {
      return listEmojisWithHttpInfo(apiToken);
    }
  }

  /**
   * List emojis
   * ## List emojis  Retrieves a list of all emojis registered to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-emojis
   * @return listEmojisRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistEmojisRequest listEmojis() throws ApiException {
    return new APIlistEmojisRequest();
  }

private ApiResponse<ListMessagesResponse> listMessagesWithHttpInfo(String channelType, String channelUrl, String apiToken, String messageTs, Integer messageId, Integer prevLimit, Integer nextLimit, Boolean include, Boolean reverse, String senderId, String senderIds, String operatorFilter, String customTypes, String messageType, Boolean includingRemoved, Boolean includeReactions, Boolean withSortedMetaArray, Boolean showSubchannelMessagesOnly, String userId, String customType, Boolean withMetaArray) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling listMessages");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listMessages");
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_sorted_meta_array", withSortedMetaArray));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_subchannel_messages_only", showSubchannelMessagesOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_type", customType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_meta_array", withMetaArray));

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

    GenericType<ListMessagesResponse> localVarReturnType = new GenericType<ListMessagesResponse>() {};

    return apiClient.invokeAPI("MessageApi.listMessages", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistMessagesRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;
    private String messageTs;
    private Integer messageId;
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
    private Boolean withSortedMetaArray;
    private Boolean showSubchannelMessagesOnly;
    private String userId;
    private String customType;
    private Boolean withMetaArray;

    private APIlistMessagesRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
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
     * Set messageTs
     * @param messageTs  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest messageTs(String messageTs) {
      this.messageTs = messageTs;
      return this;
    }

    /**
     * Set messageId
     * @param messageId  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest messageId(Integer messageId) {
      this.messageId = messageId;
      return this;
    }

    /**
     * Set prevLimit
     * @param prevLimit  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest prevLimit(Integer prevLimit) {
      this.prevLimit = prevLimit;
      return this;
    }

    /**
     * Set nextLimit
     * @param nextLimit  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest nextLimit(Integer nextLimit) {
      this.nextLimit = nextLimit;
      return this;
    }

    /**
     * Set include
     * @param include  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest include(Boolean include) {
      this.include = include;
      return this;
    }

    /**
     * Set reverse
     * @param reverse  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest reverse(Boolean reverse) {
      this.reverse = reverse;
      return this;
    }

    /**
     * Set senderId
     * @param senderId  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest senderId(String senderId) {
      this.senderId = senderId;
      return this;
    }

    /**
     * Set senderIds
     * @param senderIds  (optional)
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
     * @param customTypes  (optional)
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
     * Set withSortedMetaArray
     * @param withSortedMetaArray  (optional)
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
     * Set customType
     * @param customType  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest customType(String customType) {
      this.customType = customType;
      return this;
    }

    /**
     * Set withMetaArray
     * @param withMetaArray  (optional)
     * @return APIlistMessagesRequest
     */
    public APIlistMessagesRequest withMetaArray(Boolean withMetaArray) {
      this.withMetaArray = withMetaArray;
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
      return listMessagesWithHttpInfo(channelType, channelUrl, apiToken, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray);
    }
  }

  /**
   * List messages
   * ## List messages  Retrieves a list of past messages of a channel.  &gt; This message retrieval is one of Sendbird&#39;s [premium features](https://sendbird.com/docs/chat/v3/platform-api/guides/application#-3-sendbird-s-premium-features). Contact our [sales team](https://get.sendbird.com/talk-to-sales.html) for further assistance.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-messages ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of past messages.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return listMessagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistMessagesRequest listMessages(String channelType, String channelUrl) throws ApiException {
    return new APIlistMessagesRequest(channelType, channelUrl);
  }

private ApiResponse<ListReactionsOfMessageResponse> listReactionsOfMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, Boolean listUsers) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling listReactionsOfMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listReactionsOfMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling listReactionsOfMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/reactions"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "list_users", listUsers));

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

    GenericType<ListReactionsOfMessageResponse> localVarReturnType = new GenericType<ListReactionsOfMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.listReactionsOfMessage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistReactionsOfMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private Boolean listUsers;

    private APIlistReactionsOfMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistReactionsOfMessageRequest
     */
    public APIlistReactionsOfMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set listUsers
     * @param listUsers  (optional)
     * @return APIlistReactionsOfMessageRequest
     */
    public APIlistReactionsOfMessageRequest listUsers(Boolean listUsers) {
      this.listUsers = listUsers;
      return this;
    }

    /**
     * Execute listReactionsOfMessage request
     * @return ListReactionsOfMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListReactionsOfMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listReactionsOfMessage request with HTTP info returned
     * @return ApiResponse&lt;ListReactionsOfMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListReactionsOfMessageResponse> executeWithHttpInfo() throws ApiException {
      return listReactionsOfMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, listUsers);
    }
  }

  /**
   * List reactions of a message
   * ## List reactions of a message  Retrieves a list of reactions made to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-reactions-of-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to add a reaction to.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return listReactionsOfMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistReactionsOfMessageRequest listReactionsOfMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIlistReactionsOfMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<Void> migrateMessagesByUrlWithHttpInfo(String targetChannelUrl, String apiToken, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'targetChannelUrl' is set
    if (targetChannelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'targetChannelUrl' when calling migrateMessagesByUrl");
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
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("MessageApi.migrateMessagesByUrl", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APImigrateMessagesByUrlRequest {
    private String targetChannelUrl;
    private String apiToken;
    private Object body;

    private APImigrateMessagesByUrlRequest(String targetChannelUrl) {
      this.targetChannelUrl = targetChannelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APImigrateMessagesByUrlRequest
     */
    public APImigrateMessagesByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APImigrateMessagesByUrlRequest
     */
    public APImigrateMessagesByUrlRequest body(Object body) {
      this.body = body;
      return this;
    }

    /**
     * Execute migrateMessagesByUrl request
     
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
     * Execute migrateMessagesByUrl request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return migrateMessagesByUrlWithHttpInfo(targetChannelUrl, apiToken, body);
    }
  }

  /**
   * Migrate messages
   * ## Migrate messages  Using our migration API, you can migrate the messages from another system into a Sendbird system&#39;s [channel](https://sendbird.com/docs/chat/v3/platform-api/guides/channel-types) which consists of users, messages, and other chat-related data.  &gt; To turn on this feature, [contact our support team](https://dashboard.sendbird.com/settings/contact_us).  There are three things to do in advance before the migration. Follow the instructions below:  1. Register the users of your current chat solution to your Sendbird application. You can migrate the users into the Sendbird system using the [user creation API](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user). 2. Create either an [open](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel) or a [group](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel) channel to migrate the messages of your chat solution. The Sendbird system doesn&#39;t create a channel for your migration automatically. 3. The maximum number of migrated messages per call is 100. To avoid the failure during your migration, you must adjust the number of messages to process at once via the API.  https://sendbird.com/docs/chat/v3/platform-api/guides/migration#2-migrate-messages ----------------------------
   * @param targetChannelUrl  (required)
   * @return migrateMessagesByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APImigrateMessagesByUrlRequest migrateMessagesByUrl(String targetChannelUrl) throws ApiException {
    return new APImigrateMessagesByUrlRequest(targetChannelUrl);
  }

private ApiResponse<Object> removeExtraDataFromMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, List<String> keys) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling removeExtraDataFromMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling removeExtraDataFromMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling removeExtraDataFromMessage");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "keys", keys));

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

    return apiClient.invokeAPI("MessageApi.removeExtraDataFromMessage", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIremoveExtraDataFromMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private List<String> keys;

    private APIremoveExtraDataFromMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveExtraDataFromMessageRequest
     */
    public APIremoveExtraDataFromMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set keys
     * @param keys  (optional)
     * @return APIremoveExtraDataFromMessageRequest
     */
    public APIremoveExtraDataFromMessageRequest keys(List<String> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Execute removeExtraDataFromMessage request
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
     * Execute removeExtraDataFromMessage request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return removeExtraDataFromMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, keys);
    }
  }

  /**
   * Remove extra data from a message
   * ## Remove extra data from a message  Removes specific items from a message by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-extra-data-from-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return removeExtraDataFromMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveExtraDataFromMessageRequest removeExtraDataFromMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIremoveExtraDataFromMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<RemoveReactionFromAMessageResponse> removeReactionFromAMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, String userId, String reaction) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling removeReactionFromAMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling removeReactionFromAMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling removeReactionFromAMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/reactions"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reaction", reaction));

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

    GenericType<RemoveReactionFromAMessageResponse> localVarReturnType = new GenericType<RemoveReactionFromAMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.removeReactionFromAMessage", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIremoveReactionFromAMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private String userId;
    private String reaction;

    private APIremoveReactionFromAMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIremoveReactionFromAMessageRequest
     */
    public APIremoveReactionFromAMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set userId
     * @param userId  (optional)
     * @return APIremoveReactionFromAMessageRequest
     */
    public APIremoveReactionFromAMessageRequest userId(String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Set reaction
     * @param reaction  (optional)
     * @return APIremoveReactionFromAMessageRequest
     */
    public APIremoveReactionFromAMessageRequest reaction(String reaction) {
      this.reaction = reaction;
      return this;
    }

    /**
     * Execute removeReactionFromAMessage request
     * @return RemoveReactionFromAMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RemoveReactionFromAMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute removeReactionFromAMessage request with HTTP info returned
     * @return ApiResponse&lt;RemoveReactionFromAMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RemoveReactionFromAMessageResponse> executeWithHttpInfo() throws ApiException {
      return removeReactionFromAMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, userId, reaction);
    }
  }

  /**
   * Remove a reaction from a message
   * ## Remove a reaction from a message  Removes a specific reaction from a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-a-reaction-from-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return removeReactionFromAMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIremoveReactionFromAMessageRequest removeReactionFromAMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIremoveReactionFromAMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<SendBirdMessageResponse> sendMessageWithHttpInfo(String channelType, String channelUrl, String apiToken, SendMessageData sendMessageData) throws ApiException {
    Object localVarPostBody = sendMessageData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling sendMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling sendMessage");
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

    return apiClient.invokeAPI("MessageApi.sendMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIsendMessageRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;
    private SendMessageData sendMessageData;

    private APIsendMessageRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIsendMessageRequest
     */
    public APIsendMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set sendMessageData
     * @param sendMessageData  (optional)
     * @return APIsendMessageRequest
     */
    public APIsendMessageRequest sendMessageData(SendMessageData sendMessageData) {
      this.sendMessageData = sendMessageData;
      return this;
    }

    /**
     * Execute sendMessage request
     * @return SendBirdMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute sendMessage request with HTTP info returned
     * @return ApiResponse&lt;SendBirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return sendMessageWithHttpInfo(channelType, channelUrl, apiToken, sendMessageData);
    }
  }

  /**
   * Send a message
   * ## Send a message  Sends a message to a channel. You can send a text message, a file message, and an admin message.  &gt;__Note__: With Sendbird Chat SDKs and the platform API, any type of files in messages can be uploaded to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-send-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return sendMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIsendMessageRequest sendMessage(String channelType, String channelUrl) throws ApiException {
    return new APIsendMessageRequest(channelType, channelUrl);
  }

private ApiResponse<SendBirdMessageResponse> translateMessageIntoOtherLanguagesWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, TranslateMessageIntoOtherLanguagesData translateMessageIntoOtherLanguagesData) throws ApiException {
    Object localVarPostBody = translateMessageIntoOtherLanguagesData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling translateMessageIntoOtherLanguages");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling translateMessageIntoOtherLanguages");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling translateMessageIntoOtherLanguages");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/messages/{message_id}/translation"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    return apiClient.invokeAPI("MessageApi.translateMessageIntoOtherLanguages", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APItranslateMessageIntoOtherLanguagesRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private TranslateMessageIntoOtherLanguagesData translateMessageIntoOtherLanguagesData;

    private APItranslateMessageIntoOtherLanguagesRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APItranslateMessageIntoOtherLanguagesRequest
     */
    public APItranslateMessageIntoOtherLanguagesRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set translateMessageIntoOtherLanguagesData
     * @param translateMessageIntoOtherLanguagesData  (optional)
     * @return APItranslateMessageIntoOtherLanguagesRequest
     */
    public APItranslateMessageIntoOtherLanguagesRequest translateMessageIntoOtherLanguagesData(TranslateMessageIntoOtherLanguagesData translateMessageIntoOtherLanguagesData) {
      this.translateMessageIntoOtherLanguagesData = translateMessageIntoOtherLanguagesData;
      return this;
    }

    /**
     * Execute translateMessageIntoOtherLanguages request
     * @return SendBirdMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute translateMessageIntoOtherLanguages request with HTTP info returned
     * @return ApiResponse&lt;SendBirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return translateMessageIntoOtherLanguagesWithHttpInfo(channelType, channelUrl, messageId, apiToken, translateMessageIntoOtherLanguagesData);
    }
  }

  /**
   * Translate a message into other languages
   * ## Translate a message into other languages  Translates a message into specific languages. Only text messages of which type is MESG can be translated into other languages.  &gt; __Note__: Message translation is powered by [Google Cloud Translation API recognition engine](https://cloud.google.com/translate/). Find language codes supported by the engine in the [Miscellaneous](https://sendbird.com/docs/chat/v3/platform-api/guides/Miscellaneous) page or visit the [Language Support](https://cloud.google.com/translate/docs/languages) for Google Cloud Translation.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-translate-a-message-into-other-languages ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return translateMessageIntoOtherLanguagesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APItranslateMessageIntoOtherLanguagesRequest translateMessageIntoOtherLanguages(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APItranslateMessageIntoOtherLanguagesRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<SendBirdEmojiCategory> updateEmojiCategoryUrlByIdWithHttpInfo(String emojiCategoryId, String apiToken, UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData) throws ApiException {
    Object localVarPostBody = updateEmojiCategoryUrlByIdData;
    
    // verify the required parameter 'emojiCategoryId' is set
    if (emojiCategoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'emojiCategoryId' when calling updateEmojiCategoryUrlById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/emoji_categories/{emoji_category_id}"
      .replaceAll("\\{" + "emoji_category_id" + "\\}", apiClient.escapeString(emojiCategoryId.toString()));

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

    GenericType<SendBirdEmojiCategory> localVarReturnType = new GenericType<SendBirdEmojiCategory>() {};

    return apiClient.invokeAPI("MessageApi.updateEmojiCategoryUrlById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateEmojiCategoryUrlByIdRequest {
    private String emojiCategoryId;
    private String apiToken;
    private UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData;

    private APIupdateEmojiCategoryUrlByIdRequest(String emojiCategoryId) {
      this.emojiCategoryId = emojiCategoryId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateEmojiCategoryUrlByIdRequest
     */
    public APIupdateEmojiCategoryUrlByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateEmojiCategoryUrlByIdData
     * @param updateEmojiCategoryUrlByIdData  (optional)
     * @return APIupdateEmojiCategoryUrlByIdRequest
     */
    public APIupdateEmojiCategoryUrlByIdRequest updateEmojiCategoryUrlByIdData(UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData) {
      this.updateEmojiCategoryUrlByIdData = updateEmojiCategoryUrlByIdData;
      return this;
    }

    /**
     * Execute updateEmojiCategoryUrlById request
     * @return SendBirdEmojiCategory
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdEmojiCategory execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateEmojiCategoryUrlById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdEmojiCategory&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdEmojiCategory> executeWithHttpInfo() throws ApiException {
      return updateEmojiCategoryUrlByIdWithHttpInfo(emojiCategoryId, apiToken, updateEmojiCategoryUrlByIdData);
    }
  }

  /**
   * Update an emoji category URL
   * ## Update an emoji category URL  Updates the URL of an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-category-url ----------------------------
   * @param emojiCategoryId  (required)
   * @return updateEmojiCategoryUrlByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateEmojiCategoryUrlByIdRequest updateEmojiCategoryUrlById(String emojiCategoryId) throws ApiException {
    return new APIupdateEmojiCategoryUrlByIdRequest(emojiCategoryId);
  }

private ApiResponse<SendBirdEmoji> updateEmojiUrlByKeyWithHttpInfo(String emojiKey, String apiToken, UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData) throws ApiException {
    Object localVarPostBody = updateEmojiUrlByKeyData;
    
    // verify the required parameter 'emojiKey' is set
    if (emojiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'emojiKey' when calling updateEmojiUrlByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/emojis/{emoji_key}"
      .replaceAll("\\{" + "emoji_key" + "\\}", apiClient.escapeString(emojiKey.toString()));

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

    GenericType<SendBirdEmoji> localVarReturnType = new GenericType<SendBirdEmoji>() {};

    return apiClient.invokeAPI("MessageApi.updateEmojiUrlByKey", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateEmojiUrlByKeyRequest {
    private String emojiKey;
    private String apiToken;
    private UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData;

    private APIupdateEmojiUrlByKeyRequest(String emojiKey) {
      this.emojiKey = emojiKey;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateEmojiUrlByKeyRequest
     */
    public APIupdateEmojiUrlByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateEmojiUrlByKeyData
     * @param updateEmojiUrlByKeyData  (optional)
     * @return APIupdateEmojiUrlByKeyRequest
     */
    public APIupdateEmojiUrlByKeyRequest updateEmojiUrlByKeyData(UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData) {
      this.updateEmojiUrlByKeyData = updateEmojiUrlByKeyData;
      return this;
    }

    /**
     * Execute updateEmojiUrlByKey request
     * @return SendBirdEmoji
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdEmoji execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateEmojiUrlByKey request with HTTP info returned
     * @return ApiResponse&lt;SendBirdEmoji&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdEmoji> executeWithHttpInfo() throws ApiException {
      return updateEmojiUrlByKeyWithHttpInfo(emojiKey, apiToken, updateEmojiUrlByKeyData);
    }
  }

  /**
   * Update an emoji URL
   * ## Update an emoji URL  Updates the image URL of an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-url ----------------------------
   * @param emojiKey  (required)
   * @return updateEmojiUrlByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateEmojiUrlByKeyRequest updateEmojiUrlByKey(String emojiKey) throws ApiException {
    return new APIupdateEmojiUrlByKeyRequest(emojiKey);
  }

private ApiResponse<UpdateExtraDataInMessageResponse> updateExtraDataInMessageWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, UpdateExtraDataInMessageData updateExtraDataInMessageData) throws ApiException {
    Object localVarPostBody = updateExtraDataInMessageData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateExtraDataInMessage");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateExtraDataInMessage");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling updateExtraDataInMessage");
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

    GenericType<UpdateExtraDataInMessageResponse> localVarReturnType = new GenericType<UpdateExtraDataInMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.updateExtraDataInMessage", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateExtraDataInMessageRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private UpdateExtraDataInMessageData updateExtraDataInMessageData;

    private APIupdateExtraDataInMessageRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateExtraDataInMessageRequest
     */
    public APIupdateExtraDataInMessageRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateExtraDataInMessageData
     * @param updateExtraDataInMessageData  (optional)
     * @return APIupdateExtraDataInMessageRequest
     */
    public APIupdateExtraDataInMessageRequest updateExtraDataInMessageData(UpdateExtraDataInMessageData updateExtraDataInMessageData) {
      this.updateExtraDataInMessageData = updateExtraDataInMessageData;
      return this;
    }

    /**
     * Execute updateExtraDataInMessage request
     * @return UpdateExtraDataInMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateExtraDataInMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateExtraDataInMessage request with HTTP info returned
     * @return ApiResponse&lt;UpdateExtraDataInMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateExtraDataInMessageResponse> executeWithHttpInfo() throws ApiException {
      return updateExtraDataInMessageWithHttpInfo(channelType, channelUrl, messageId, apiToken, updateExtraDataInMessageData);
    }
  }

  /**
   * Update extra data in a message
   * ## Update extra data in a message  Updates the values of specific items by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-extra-data-in-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return updateExtraDataInMessageRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateExtraDataInMessageRequest updateExtraDataInMessage(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIupdateExtraDataInMessageRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<SendBirdMessageResponse> updateMessageByIdWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, UpdateMessageByIdData updateMessageByIdData) throws ApiException {
    Object localVarPostBody = updateMessageByIdData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateMessageById");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateMessageById");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling updateMessageById");
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

    return apiClient.invokeAPI("MessageApi.updateMessageById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateMessageByIdRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private UpdateMessageByIdData updateMessageByIdData;

    private APIupdateMessageByIdRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateMessageByIdRequest
     */
    public APIupdateMessageByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateMessageByIdData
     * @param updateMessageByIdData  (optional)
     * @return APIupdateMessageByIdRequest
     */
    public APIupdateMessageByIdRequest updateMessageByIdData(UpdateMessageByIdData updateMessageByIdData) {
      this.updateMessageByIdData = updateMessageByIdData;
      return this;
    }

    /**
     * Execute updateMessageById request
     * @return SendBirdMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateMessageById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return updateMessageByIdWithHttpInfo(channelType, channelUrl, messageId, apiToken, updateMessageByIdData);
    }
  }

  /**
   * Update a message
   * ## Update a message  Updates information on a message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return updateMessageByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateMessageByIdRequest updateMessageById(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIupdateMessageByIdRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<UseDefaultEmojisResponse> useDefaultEmojisWithHttpInfo(String apiToken, UseDefaultEmojisData useDefaultEmojisData) throws ApiException {
    Object localVarPostBody = useDefaultEmojisData;
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/use_default_emoji";

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

    GenericType<UseDefaultEmojisResponse> localVarReturnType = new GenericType<UseDefaultEmojisResponse>() {};

    return apiClient.invokeAPI("MessageApi.useDefaultEmojis", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIuseDefaultEmojisRequest {
    private String apiToken;
    private UseDefaultEmojisData useDefaultEmojisData;

    private APIuseDefaultEmojisRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIuseDefaultEmojisRequest
     */
    public APIuseDefaultEmojisRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set useDefaultEmojisData
     * @param useDefaultEmojisData  (optional)
     * @return APIuseDefaultEmojisRequest
     */
    public APIuseDefaultEmojisRequest useDefaultEmojisData(UseDefaultEmojisData useDefaultEmojisData) {
      this.useDefaultEmojisData = useDefaultEmojisData;
      return this;
    }

    /**
     * Execute useDefaultEmojis request
     * @return UseDefaultEmojisResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UseDefaultEmojisResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute useDefaultEmojis request with HTTP info returned
     * @return ApiResponse&lt;UseDefaultEmojisResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UseDefaultEmojisResponse> executeWithHttpInfo() throws ApiException {
      return useDefaultEmojisWithHttpInfo(apiToken, useDefaultEmojisData);
    }
  }

  /**
   * Use default emojis
   * ## Use default emojis  Determines whether to use the 7 default emojis initially provided.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-use-default-emojis
   * @return useDefaultEmojisRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIuseDefaultEmojisRequest useDefaultEmojis() throws ApiException {
    return new APIuseDefaultEmojisRequest();
  }

private ApiResponse<SendBirdMessageResponse> viewMessageByIdWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, Boolean withSortedMetaArray, Boolean withMetaArray) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewMessageById");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewMessageById");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling viewMessageById");
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_sorted_meta_array", withSortedMetaArray));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "with_meta_array", withMetaArray));

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

    GenericType<SendBirdMessageResponse> localVarReturnType = new GenericType<SendBirdMessageResponse>() {};

    return apiClient.invokeAPI("MessageApi.viewMessageById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewMessageByIdRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private Boolean withSortedMetaArray;
    private Boolean withMetaArray;

    private APIviewMessageByIdRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewMessageByIdRequest
     */
    public APIviewMessageByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set withSortedMetaArray
     * @param withSortedMetaArray  (optional)
     * @return APIviewMessageByIdRequest
     */
    public APIviewMessageByIdRequest withSortedMetaArray(Boolean withSortedMetaArray) {
      this.withSortedMetaArray = withSortedMetaArray;
      return this;
    }

    /**
     * Set withMetaArray
     * @param withMetaArray  (optional)
     * @return APIviewMessageByIdRequest
     */
    public APIviewMessageByIdRequest withMetaArray(Boolean withMetaArray) {
      this.withMetaArray = withMetaArray;
      return this;
    }

    /**
     * Execute viewMessageById request
     * @return SendBirdMessageResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdMessageResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewMessageById request with HTTP info returned
     * @return ApiResponse&lt;SendBirdMessageResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdMessageResponse> executeWithHttpInfo() throws ApiException {
      return viewMessageByIdWithHttpInfo(channelType, channelUrl, messageId, apiToken, withSortedMetaArray, withMetaArray);
    }
  }

  /**
   * View a message
   * ## View a message  Retrieves information on a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to retrieve.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return viewMessageByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewMessageByIdRequest viewMessageById(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIviewMessageByIdRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<ViewTotalNumberOfMessagesInChannelResponse> viewTotalNumberOfMessagesInChannelWithHttpInfo(String channelType, String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewTotalNumberOfMessagesInChannel");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewTotalNumberOfMessagesInChannel");
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
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewTotalNumberOfMessagesInChannelResponse> localVarReturnType = new GenericType<ViewTotalNumberOfMessagesInChannelResponse>() {};

    return apiClient.invokeAPI("MessageApi.viewTotalNumberOfMessagesInChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewTotalNumberOfMessagesInChannelRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;

    private APIviewTotalNumberOfMessagesInChannelRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewTotalNumberOfMessagesInChannelRequest
     */
    public APIviewTotalNumberOfMessagesInChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewTotalNumberOfMessagesInChannel request
     * @return ViewTotalNumberOfMessagesInChannelResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewTotalNumberOfMessagesInChannelResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewTotalNumberOfMessagesInChannel request with HTTP info returned
     * @return ApiResponse&lt;ViewTotalNumberOfMessagesInChannelResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewTotalNumberOfMessagesInChannelResponse> executeWithHttpInfo() throws ApiException {
      return viewTotalNumberOfMessagesInChannelWithHttpInfo(channelType, channelUrl, apiToken);
    }
  }

  /**
   * View total number of messages in a channel
   * ## View total number of messages in a channel  Retrieves the total number of messages in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-total-number-of-messages-in-a-channel ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return viewTotalNumberOfMessagesInChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewTotalNumberOfMessagesInChannelRequest viewTotalNumberOfMessagesInChannel(String channelType, String channelUrl) throws ApiException {
    return new APIviewTotalNumberOfMessagesInChannelRequest(channelType, channelUrl);
  }
}
