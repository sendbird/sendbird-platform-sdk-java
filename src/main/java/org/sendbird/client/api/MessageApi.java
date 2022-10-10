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
import org.openapitools.client.model.GetStatisticsDailyResponse;
import org.openapitools.client.model.GetStatisticsMonthlyResponse;
import org.openapitools.client.model.GetStatisticsResponse;
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponse;
import org.openapitools.client.model.ListAnnouncementGroupsResponse;
import org.openapitools.client.model.ListAnnouncementsResponse;
import org.openapitools.client.model.ListEmojisResponse;
import org.openapitools.client.model.ListMessagesResponse;
import org.openapitools.client.model.ListReactionsOfMessageResponse;
import org.openapitools.client.model.RemoveReactionFromAMessageResponse;
import org.openapitools.client.model.ScheduleAnnouncementData;
import org.openapitools.client.model.ScheduleAnnouncementResponse;
import org.openapitools.client.model.SendBirdEmoji;
import org.openapitools.client.model.SendBirdEmojiCategory;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendMessageData;
import org.openapitools.client.model.TranslateMessageIntoOtherLanguagesData;
import org.openapitools.client.model.UpdateAnnouncementByIdData;
import org.openapitools.client.model.UpdateAnnouncementByIdResponse;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
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

  /**
   * Add emoji categories
   * ## Add emoji categories  Adds a list of one or more new emoji categories to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emoji-categories
   * @param apiToken  (required)
   * @param body  (optional)
   * @return AddEmojiCategoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddEmojiCategoriesResponse addEmojiCategories(String apiToken, Object body) throws ApiException {
    return addEmojiCategoriesWithHttpInfo(apiToken, body).getData();
  }

  /**
   * Add emoji categories
   * ## Add emoji categories  Adds a list of one or more new emoji categories to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emoji-categories
   * @param apiToken  (required)
   * @param body  (optional)
   * @return ApiResponse&lt;AddEmojiCategoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddEmojiCategoriesResponse> addEmojiCategoriesWithHttpInfo(String apiToken, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addEmojiCategories");
    }
    
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
  /**
   * Add emojis
   * ## Add emojis  Adds a list of one or more new emojis to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emojis
   * @param apiToken  (required)
   * @param addEmojisData  (optional)
   * @return AddEmojisResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddEmojisResponse addEmojis(String apiToken, AddEmojisData addEmojisData) throws ApiException {
    return addEmojisWithHttpInfo(apiToken, addEmojisData).getData();
  }

  /**
   * Add emojis
   * ## Add emojis  Adds a list of one or more new emojis to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emojis
   * @param apiToken  (required)
   * @param addEmojisData  (optional)
   * @return ApiResponse&lt;AddEmojisResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddEmojisResponse> addEmojisWithHttpInfo(String apiToken, AddEmojisData addEmojisData) throws ApiException {
    Object localVarPostBody = addEmojisData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addEmojis");
    }
    
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
  /**
   * Add extra data to a message
   * ## Add extra data to a message  Adds one or more key-values items which store additional information for a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-extra-data-to-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param addExtraDataToMessageData  (optional)
   * @return AddExtraDataToMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddExtraDataToMessageResponse addExtraDataToMessage(String apiToken, String channelType, String channelUrl, String messageId, AddExtraDataToMessageData addExtraDataToMessageData) throws ApiException {
    return addExtraDataToMessageWithHttpInfo(apiToken, channelType, channelUrl, messageId, addExtraDataToMessageData).getData();
  }

  /**
   * Add extra data to a message
   * ## Add extra data to a message  Adds one or more key-values items which store additional information for a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-extra-data-to-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param addExtraDataToMessageData  (optional)
   * @return ApiResponse&lt;AddExtraDataToMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddExtraDataToMessageResponse> addExtraDataToMessageWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, AddExtraDataToMessageData addExtraDataToMessageData) throws ApiException {
    Object localVarPostBody = addExtraDataToMessageData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addExtraDataToMessage");
    }
    
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
  /**
   * Add a reaction to a message
   * ## Add a reaction to a message  Adds a specific reaction to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-a-reaction-to-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param addReactionToAMessageData  (optional)
   * @return AddReactionToAMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public AddReactionToAMessageResponse addReactionToAMessage(String apiToken, String channelType, String channelUrl, String messageId, AddReactionToAMessageData addReactionToAMessageData) throws ApiException {
    return addReactionToAMessageWithHttpInfo(apiToken, channelType, channelUrl, messageId, addReactionToAMessageData).getData();
  }

  /**
   * Add a reaction to a message
   * ## Add a reaction to a message  Adds a specific reaction to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-a-reaction-to-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param addReactionToAMessageData  (optional)
   * @return ApiResponse&lt;AddReactionToAMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddReactionToAMessageResponse> addReactionToAMessageWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, AddReactionToAMessageData addReactionToAMessageData) throws ApiException {
    Object localVarPostBody = addReactionToAMessageData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling addReactionToAMessage");
    }
    
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
  /**
   * Delete an emoji
   * ## Delete an emoji  Deletes an emoji from the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji ----------------------------
   * @param apiToken  (required)
   * @param emojiKey  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public void deleteEmojiByKey(String apiToken, String emojiKey) throws ApiException {
    deleteEmojiByKeyWithHttpInfo(apiToken, emojiKey);
  }

  /**
   * Delete an emoji
   * ## Delete an emoji  Deletes an emoji from the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji ----------------------------
   * @param apiToken  (required)
   * @param emojiKey  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteEmojiByKeyWithHttpInfo(String apiToken, String emojiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteEmojiByKey");
    }
    
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
  /**
   * Delete an emoji category
   * ## Delete an emoji category  Deletes an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji-category ----------------------------
   * @param apiToken  (required)
   * @param emojiCategoryId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object deleteEmojiCategoryById(String apiToken, String emojiCategoryId) throws ApiException {
    return deleteEmojiCategoryByIdWithHttpInfo(apiToken, emojiCategoryId).getData();
  }

  /**
   * Delete an emoji category
   * ## Delete an emoji category  Deletes an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji-category ----------------------------
   * @param apiToken  (required)
   * @param emojiCategoryId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deleteEmojiCategoryByIdWithHttpInfo(String apiToken, String emojiCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteEmojiCategoryById");
    }
    
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
  /**
   * Delete a message
   * ## Delete a message  Deletes a message from a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-delete-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object deleteMessageById(String apiToken, String channelType, String channelUrl, String messageId) throws ApiException {
    return deleteMessageByIdWithHttpInfo(apiToken, channelType, channelUrl, messageId).getData();
  }

  /**
   * Delete a message
   * ## Delete a message  Deletes a message from a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-delete-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deleteMessageByIdWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteMessageById");
    }
    
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
  /**
   * Enable reactions
   * ## Enable reactions  Turn on or off reactions in a Sendbird application.  &gt; __Note__: This action also allows reactions in UIKit.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-enable-reactions
   * @param apiToken  (required)
   * @param enableReactionsData  (optional)
   * @return EnableReactionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public EnableReactionsResponse enableReactions(String apiToken, EnableReactionsData enableReactionsData) throws ApiException {
    return enableReactionsWithHttpInfo(apiToken, enableReactionsData).getData();
  }

  /**
   * Enable reactions
   * ## Enable reactions  Turn on or off reactions in a Sendbird application.  &gt; __Note__: This action also allows reactions in UIKit.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-enable-reactions
   * @param apiToken  (required)
   * @param enableReactionsData  (optional)
   * @return ApiResponse&lt;EnableReactionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EnableReactionsResponse> enableReactionsWithHttpInfo(String apiToken, EnableReactionsData enableReactionsData) throws ApiException {
    Object localVarPostBody = enableReactionsData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling enableReactions");
    }
    
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
  /**
   * Mark all messages as delivered
   * ## Mark all messages as delivered  Marks all messages in a group channel as delivered for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-delivered ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcMarkAllMessagesAsDeliveredData  (optional)
   * @return GcMarkAllMessagesAsDeliveredResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcMarkAllMessagesAsDeliveredResponse gcMarkAllMessagesAsDelivered(String apiToken, String channelUrl, GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData) throws ApiException {
    return gcMarkAllMessagesAsDeliveredWithHttpInfo(apiToken, channelUrl, gcMarkAllMessagesAsDeliveredData).getData();
  }

  /**
   * Mark all messages as delivered
   * ## Mark all messages as delivered  Marks all messages in a group channel as delivered for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-delivered ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcMarkAllMessagesAsDeliveredData  (optional)
   * @return ApiResponse&lt;GcMarkAllMessagesAsDeliveredResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcMarkAllMessagesAsDeliveredResponse> gcMarkAllMessagesAsDeliveredWithHttpInfo(String apiToken, String channelUrl, GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData) throws ApiException {
    Object localVarPostBody = gcMarkAllMessagesAsDeliveredData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcMarkAllMessagesAsDelivered");
    }
    
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
  /**
   * Mark all messages as read
   * ## Mark all messages as read  Marks all messages in a group channel as read for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-read ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcMarkAllMessagesAsReadData  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object gcMarkAllMessagesAsRead(String apiToken, String channelUrl, GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData) throws ApiException {
    return gcMarkAllMessagesAsReadWithHttpInfo(apiToken, channelUrl, gcMarkAllMessagesAsReadData).getData();
  }

  /**
   * Mark all messages as read
   * ## Mark all messages as read  Marks all messages in a group channel as read for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-read ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param gcMarkAllMessagesAsReadData  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> gcMarkAllMessagesAsReadWithHttpInfo(String apiToken, String channelUrl, GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData) throws ApiException {
    Object localVarPostBody = gcMarkAllMessagesAsReadData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcMarkAllMessagesAsRead");
    }
    
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
  /**
   * View number of each member&#39;s unread messages
   * ## View number of each member&#39;s unread messages  Retrieves the total number of each member&#39;s unread messages in a group channel. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-number-of-each-member-s-unread-messages ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param userIds  (optional)
   * @return GcViewNumberOfEachMembersUnreadMessagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GcViewNumberOfEachMembersUnreadMessagesResponse gcViewNumberOfEachMembersUnreadMessages(String apiToken, String channelUrl, String userIds) throws ApiException {
    return gcViewNumberOfEachMembersUnreadMessagesWithHttpInfo(apiToken, channelUrl, userIds).getData();
  }

  /**
   * View number of each member&#39;s unread messages
   * ## View number of each member&#39;s unread messages  Retrieves the total number of each member&#39;s unread messages in a group channel. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-number-of-each-member-s-unread-messages ----------------------------
   * @param apiToken  (required)
   * @param channelUrl  (required)
   * @param userIds  (optional)
   * @return ApiResponse&lt;GcViewNumberOfEachMembersUnreadMessagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcViewNumberOfEachMembersUnreadMessagesResponse> gcViewNumberOfEachMembersUnreadMessagesWithHttpInfo(String apiToken, String channelUrl, String userIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling gcViewNumberOfEachMembersUnreadMessages");
    }
    
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
  /**
   * Get an emoji
   * ## Get an emoji  Retrieves an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji ----------------------------
   * @param apiToken  (required)
   * @param emojiKey  (required)
   * @return SendBirdEmoji
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdEmoji getEmojiByKey(String apiToken, String emojiKey) throws ApiException {
    return getEmojiByKeyWithHttpInfo(apiToken, emojiKey).getData();
  }

  /**
   * Get an emoji
   * ## Get an emoji  Retrieves an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji ----------------------------
   * @param apiToken  (required)
   * @param emojiKey  (required)
   * @return ApiResponse&lt;SendBirdEmoji&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdEmoji> getEmojiByKeyWithHttpInfo(String apiToken, String emojiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getEmojiByKey");
    }
    
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
  /**
   * Get an emoji category
   * ## Get an emoji category  Retrieves an emoji category with the specified ID, including its emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji-category ----------------------------   &#x60;emoji_category_id&#x60;      Type: int      Description: Specifies the unique ID of the emoji category to retrieve.
   * @param apiToken  (required)
   * @param emojiCategoryId  (required)
   * @return SendBirdEmojiCategory
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdEmojiCategory getEmojiCategoryById(String apiToken, String emojiCategoryId) throws ApiException {
    return getEmojiCategoryByIdWithHttpInfo(apiToken, emojiCategoryId).getData();
  }

  /**
   * Get an emoji category
   * ## Get an emoji category  Retrieves an emoji category with the specified ID, including its emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji-category ----------------------------   &#x60;emoji_category_id&#x60;      Type: int      Description: Specifies the unique ID of the emoji category to retrieve.
   * @param apiToken  (required)
   * @param emojiCategoryId  (required)
   * @return ApiResponse&lt;SendBirdEmojiCategory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdEmojiCategory> getEmojiCategoryByIdWithHttpInfo(String apiToken, String emojiCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getEmojiCategoryById");
    }
    
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
  /**
   * Get statistics - weekly
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @param apiToken  (required)
   * @return GetStatisticsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GetStatisticsResponse getStatistics(String apiToken) throws ApiException {
    return getStatisticsWithHttpInfo(apiToken).getData();
  }

  /**
   * Get statistics - weekly
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @param apiToken  (required)
   * @return ApiResponse&lt;GetStatisticsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetStatisticsResponse> getStatisticsWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getStatistics");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcement_stats/weekly";

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

    GenericType<GetStatisticsResponse> localVarReturnType = new GenericType<GetStatisticsResponse>() {};

    return apiClient.invokeAPI("MessageApi.getStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get statistics - daily
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @param apiToken  (required)
   * @param startDate  (required)
   * @param endDate  (required)
   * @param startWeek  (required)
   * @param endWeek  (required)
   * @param startMonth  (required)
   * @param endMonth  (required)
   * @param announcementGroup  (optional)
   * @return GetStatisticsDailyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GetStatisticsDailyResponse getStatisticsDaily(String apiToken, String startDate, String endDate, String startWeek, String endWeek, String startMonth, String endMonth, String announcementGroup) throws ApiException {
    return getStatisticsDailyWithHttpInfo(apiToken, startDate, endDate, startWeek, endWeek, startMonth, endMonth, announcementGroup).getData();
  }

  /**
   * Get statistics - daily
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @param apiToken  (required)
   * @param startDate  (required)
   * @param endDate  (required)
   * @param startWeek  (required)
   * @param endWeek  (required)
   * @param startMonth  (required)
   * @param endMonth  (required)
   * @param announcementGroup  (optional)
   * @return ApiResponse&lt;GetStatisticsDailyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetStatisticsDailyResponse> getStatisticsDailyWithHttpInfo(String apiToken, String startDate, String endDate, String startWeek, String endWeek, String startMonth, String endMonth, String announcementGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getStatisticsDaily");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getStatisticsDaily");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getStatisticsDaily");
    }
    
    // verify the required parameter 'startWeek' is set
    if (startWeek == null) {
      throw new ApiException(400, "Missing the required parameter 'startWeek' when calling getStatisticsDaily");
    }
    
    // verify the required parameter 'endWeek' is set
    if (endWeek == null) {
      throw new ApiException(400, "Missing the required parameter 'endWeek' when calling getStatisticsDaily");
    }
    
    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getStatisticsDaily");
    }
    
    // verify the required parameter 'endMonth' is set
    if (endMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'endMonth' when calling getStatisticsDaily");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcement_stats/daily";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_week", startWeek));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_week", endWeek));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
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

    GenericType<GetStatisticsDailyResponse> localVarReturnType = new GenericType<GetStatisticsDailyResponse>() {};

    return apiClient.invokeAPI("MessageApi.getStatisticsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get statistics - monthly
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @param apiToken  (required)
   * @return GetStatisticsMonthlyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GetStatisticsMonthlyResponse getStatisticsMonthly(String apiToken) throws ApiException {
    return getStatisticsMonthlyWithHttpInfo(apiToken).getData();
  }

  /**
   * Get statistics - monthly
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @param apiToken  (required)
   * @return ApiResponse&lt;GetStatisticsMonthlyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetStatisticsMonthlyResponse> getStatisticsMonthlyWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getStatisticsMonthly");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcement_stats/monthly";

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

    GenericType<GetStatisticsMonthlyResponse> localVarReturnType = new GenericType<GetStatisticsMonthlyResponse>() {};

    return apiClient.invokeAPI("MessageApi.getStatisticsMonthly", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all emojis and emoji categories
   * ## List all emojis and emoji categories  Retrieves a list of all emoji categories registered to the application, including their emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-all-emojis-and-emoji-categories
   * @param apiToken  (required)
   * @return ListAllEmojisAndEmojiCategoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListAllEmojisAndEmojiCategoriesResponse listAllEmojisAndEmojiCategories(String apiToken) throws ApiException {
    return listAllEmojisAndEmojiCategoriesWithHttpInfo(apiToken).getData();
  }

  /**
   * List all emojis and emoji categories
   * ## List all emojis and emoji categories  Retrieves a list of all emoji categories registered to the application, including their emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-all-emojis-and-emoji-categories
   * @param apiToken  (required)
   * @return ApiResponse&lt;ListAllEmojisAndEmojiCategoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAllEmojisAndEmojiCategoriesResponse> listAllEmojisAndEmojiCategoriesWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listAllEmojisAndEmojiCategories");
    }
    
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
  /**
   * List announcement groups
   * ## List announcement groups  Retrieves a list of announcement groups.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ListAnnouncementGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListAnnouncementGroupsResponse listAnnouncementGroups(String apiToken, String token, Integer limit) throws ApiException {
    return listAnnouncementGroupsWithHttpInfo(apiToken, token, limit).getData();
  }

  /**
   * List announcement groups
   * ## List announcement groups  Retrieves a list of announcement groups.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;ListAnnouncementGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnnouncementGroupsResponse> listAnnouncementGroupsWithHttpInfo(String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listAnnouncementGroups");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcement_group";

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

    GenericType<ListAnnouncementGroupsResponse> localVarReturnType = new GenericType<ListAnnouncementGroupsResponse>() {};

    return apiClient.invokeAPI("MessageApi.listAnnouncementGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List announcements
   * ## List announcements  Retrieves a list of announcements.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcements ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param order  (optional)
   * @param status  (optional)
   * @param announcementGroup  (optional)
   * @return ListAnnouncementsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListAnnouncementsResponse listAnnouncements(String apiToken, String token, Integer limit, String order, String status, String announcementGroup) throws ApiException {
    return listAnnouncementsWithHttpInfo(apiToken, token, limit, order, status, announcementGroup).getData();
  }

  /**
   * List announcements
   * ## List announcements  Retrieves a list of announcements.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcements ----------------------------
   * @param apiToken  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @param order  (optional)
   * @param status  (optional)
   * @param announcementGroup  (optional)
   * @return ApiResponse&lt;ListAnnouncementsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAnnouncementsResponse> listAnnouncementsWithHttpInfo(String apiToken, String token, Integer limit, String order, String status, String announcementGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listAnnouncements");
    }
    
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
  /**
   * List emojis
   * ## List emojis  Retrieves a list of all emojis registered to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-emojis
   * @param apiToken  (required)
   * @return ListEmojisResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListEmojisResponse listEmojis(String apiToken) throws ApiException {
    return listEmojisWithHttpInfo(apiToken).getData();
  }

  /**
   * List emojis
   * ## List emojis  Retrieves a list of all emojis registered to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-emojis
   * @param apiToken  (required)
   * @return ApiResponse&lt;ListEmojisResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListEmojisResponse> listEmojisWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listEmojis");
    }
    
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
  /**
   * List messages
   * ## List messages  Retrieves a list of past messages of a channel.  &gt; This message retrieval is one of Sendbird&#39;s [premium features](https://sendbird.com/docs/chat/v3/platform-api/guides/application#-3-sendbird-s-premium-features). Contact our [sales team](https://get.sendbird.com/talk-to-sales.html) for further assistance.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-messages ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of past messages.
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageTs  (optional)
   * @param messageId  (optional)
   * @param prevLimit  (optional)
   * @param nextLimit  (optional)
   * @param include  (optional)
   * @param reverse  (optional)
   * @param senderId  (optional)
   * @param senderIds  (optional)
   * @param operatorFilter  (optional)
   * @param customTypes  (optional)
   * @param messageType  (optional)
   * @param includingRemoved  (optional)
   * @param includeReactions  (optional)
   * @param withSortedMetaArray  (optional)
   * @param showSubchannelMessagesOnly  (optional)
   * @param userId  (optional)
   * @param customType  (optional)
   * @param withMetaArray  (optional)
   * @return ListMessagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListMessagesResponse listMessages(String apiToken, String channelType, String channelUrl, String messageTs, Integer messageId, Integer prevLimit, Integer nextLimit, Boolean include, Boolean reverse, String senderId, String senderIds, String operatorFilter, String customTypes, String messageType, Boolean includingRemoved, Boolean includeReactions, Boolean withSortedMetaArray, Boolean showSubchannelMessagesOnly, String userId, String customType, Boolean withMetaArray) throws ApiException {
    return listMessagesWithHttpInfo(apiToken, channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray).getData();
  }

  /**
   * List messages
   * ## List messages  Retrieves a list of past messages of a channel.  &gt; This message retrieval is one of Sendbird&#39;s [premium features](https://sendbird.com/docs/chat/v3/platform-api/guides/application#-3-sendbird-s-premium-features). Contact our [sales team](https://get.sendbird.com/talk-to-sales.html) for further assistance.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-messages ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of past messages.
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageTs  (optional)
   * @param messageId  (optional)
   * @param prevLimit  (optional)
   * @param nextLimit  (optional)
   * @param include  (optional)
   * @param reverse  (optional)
   * @param senderId  (optional)
   * @param senderIds  (optional)
   * @param operatorFilter  (optional)
   * @param customTypes  (optional)
   * @param messageType  (optional)
   * @param includingRemoved  (optional)
   * @param includeReactions  (optional)
   * @param withSortedMetaArray  (optional)
   * @param showSubchannelMessagesOnly  (optional)
   * @param userId  (optional)
   * @param customType  (optional)
   * @param withMetaArray  (optional)
   * @return ApiResponse&lt;ListMessagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListMessagesResponse> listMessagesWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageTs, Integer messageId, Integer prevLimit, Integer nextLimit, Boolean include, Boolean reverse, String senderId, String senderIds, String operatorFilter, String customTypes, String messageType, Boolean includingRemoved, Boolean includeReactions, Boolean withSortedMetaArray, Boolean showSubchannelMessagesOnly, String userId, String customType, Boolean withMetaArray) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listMessages");
    }
    
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
  /**
   * List reactions of a message
   * ## List reactions of a message  Retrieves a list of reactions made to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-reactions-of-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to add a reaction to.
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param listUsers  (optional)
   * @return ListReactionsOfMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListReactionsOfMessageResponse listReactionsOfMessage(String apiToken, String channelType, String channelUrl, String messageId, Boolean listUsers) throws ApiException {
    return listReactionsOfMessageWithHttpInfo(apiToken, channelType, channelUrl, messageId, listUsers).getData();
  }

  /**
   * List reactions of a message
   * ## List reactions of a message  Retrieves a list of reactions made to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-reactions-of-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to add a reaction to.
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param listUsers  (optional)
   * @return ApiResponse&lt;ListReactionsOfMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListReactionsOfMessageResponse> listReactionsOfMessageWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, Boolean listUsers) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listReactionsOfMessage");
    }
    
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
  /**
   * Migrate messages
   * ## Migrate messages  Using our migration API, you can migrate the messages from another system into a Sendbird system&#39;s [channel](https://sendbird.com/docs/chat/v3/platform-api/guides/channel-types) which consists of users, messages, and other chat-related data.  &gt; To turn on this feature, [contact our support team](https://dashboard.sendbird.com/settings/contact_us).  There are three things to do in advance before the migration. Follow the instructions below:  1. Register the users of your current chat solution to your Sendbird application. You can migrate the users into the Sendbird system using the [user creation API](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user). 2. Create either an [open](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel) or a [group](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel) channel to migrate the messages of your chat solution. The Sendbird system doesn&#39;t create a channel for your migration automatically. 3. The maximum number of migrated messages per call is 100. To avoid the failure during your migration, you must adjust the number of messages to process at once via the API.  https://sendbird.com/docs/chat/v3/platform-api/guides/migration#2-migrate-messages ----------------------------
   * @param apiToken  (required)
   * @param targetChannelUrl  (required)
   * @param body  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public void migrateMessagesByUrl(String apiToken, String targetChannelUrl, Object body) throws ApiException {
    migrateMessagesByUrlWithHttpInfo(apiToken, targetChannelUrl, body);
  }

  /**
   * Migrate messages
   * ## Migrate messages  Using our migration API, you can migrate the messages from another system into a Sendbird system&#39;s [channel](https://sendbird.com/docs/chat/v3/platform-api/guides/channel-types) which consists of users, messages, and other chat-related data.  &gt; To turn on this feature, [contact our support team](https://dashboard.sendbird.com/settings/contact_us).  There are three things to do in advance before the migration. Follow the instructions below:  1. Register the users of your current chat solution to your Sendbird application. You can migrate the users into the Sendbird system using the [user creation API](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user). 2. Create either an [open](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel) or a [group](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel) channel to migrate the messages of your chat solution. The Sendbird system doesn&#39;t create a channel for your migration automatically. 3. The maximum number of migrated messages per call is 100. To avoid the failure during your migration, you must adjust the number of messages to process at once via the API.  https://sendbird.com/docs/chat/v3/platform-api/guides/migration#2-migrate-messages ----------------------------
   * @param apiToken  (required)
   * @param targetChannelUrl  (required)
   * @param body  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> migrateMessagesByUrlWithHttpInfo(String apiToken, String targetChannelUrl, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling migrateMessagesByUrl");
    }
    
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
  /**
   * Remove extra data from a message
   * ## Remove extra data from a message  Removes specific items from a message by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-extra-data-from-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param keys  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public Object removeExtraDataFromMessage(String apiToken, String channelType, String channelUrl, String messageId, List<String> keys) throws ApiException {
    return removeExtraDataFromMessageWithHttpInfo(apiToken, channelType, channelUrl, messageId, keys).getData();
  }

  /**
   * Remove extra data from a message
   * ## Remove extra data from a message  Removes specific items from a message by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-extra-data-from-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param keys  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> removeExtraDataFromMessageWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, List<String> keys) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling removeExtraDataFromMessage");
    }
    
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
  /**
   * Remove a reaction from a message
   * ## Remove a reaction from a message  Removes a specific reaction from a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-a-reaction-from-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param userId  (optional)
   * @param reaction  (optional)
   * @return RemoveReactionFromAMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RemoveReactionFromAMessageResponse removeReactionFromAMessage(String apiToken, String channelType, String channelUrl, String messageId, String userId, String reaction) throws ApiException {
    return removeReactionFromAMessageWithHttpInfo(apiToken, channelType, channelUrl, messageId, userId, reaction).getData();
  }

  /**
   * Remove a reaction from a message
   * ## Remove a reaction from a message  Removes a specific reaction from a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-a-reaction-from-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param userId  (optional)
   * @param reaction  (optional)
   * @return ApiResponse&lt;RemoveReactionFromAMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RemoveReactionFromAMessageResponse> removeReactionFromAMessageWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, String userId, String reaction) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling removeReactionFromAMessage");
    }
    
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
  /**
   * Schedule an announcement
   * ## Schedule an announcement  Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement
   * @param apiToken  (required)
   * @param scheduleAnnouncementData  (optional)
   * @return ScheduleAnnouncementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ScheduleAnnouncementResponse scheduleAnnouncement(String apiToken, ScheduleAnnouncementData scheduleAnnouncementData) throws ApiException {
    return scheduleAnnouncementWithHttpInfo(apiToken, scheduleAnnouncementData).getData();
  }

  /**
   * Schedule an announcement
   * ## Schedule an announcement  Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement
   * @param apiToken  (required)
   * @param scheduleAnnouncementData  (optional)
   * @return ApiResponse&lt;ScheduleAnnouncementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScheduleAnnouncementResponse> scheduleAnnouncementWithHttpInfo(String apiToken, ScheduleAnnouncementData scheduleAnnouncementData) throws ApiException {
    Object localVarPostBody = scheduleAnnouncementData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling scheduleAnnouncement");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcements";

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

    GenericType<ScheduleAnnouncementResponse> localVarReturnType = new GenericType<ScheduleAnnouncementResponse>() {};

    return apiClient.invokeAPI("MessageApi.scheduleAnnouncement", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send a message
   * ## Send a message  Sends a message to a channel. You can send a text message, a file message, and an admin message.  &gt;__Note__: With Sendbird Chat SDKs and the platform API, any type of files in messages can be uploaded to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-send-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param sendMessageData  (optional)
   * @return SendBirdMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdMessageResponse sendMessage(String apiToken, String channelType, String channelUrl, SendMessageData sendMessageData) throws ApiException {
    return sendMessageWithHttpInfo(apiToken, channelType, channelUrl, sendMessageData).getData();
  }

  /**
   * Send a message
   * ## Send a message  Sends a message to a channel. You can send a text message, a file message, and an admin message.  &gt;__Note__: With Sendbird Chat SDKs and the platform API, any type of files in messages can be uploaded to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-send-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param sendMessageData  (optional)
   * @return ApiResponse&lt;SendBirdMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdMessageResponse> sendMessageWithHttpInfo(String apiToken, String channelType, String channelUrl, SendMessageData sendMessageData) throws ApiException {
    Object localVarPostBody = sendMessageData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling sendMessage");
    }
    
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
  /**
   * Translate a message into other languages
   * ## Translate a message into other languages  Translates a message into specific languages. Only text messages of which type is MESG can be translated into other languages.  &gt; __Note__: Message translation is powered by [Google Cloud Translation API recognition engine](https://cloud.google.com/translate/). Find language codes supported by the engine in the [Miscellaneous](https://sendbird.com/docs/chat/v3/platform-api/guides/Miscellaneous) page or visit the [Language Support](https://cloud.google.com/translate/docs/languages) for Google Cloud Translation.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-translate-a-message-into-other-languages ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param translateMessageIntoOtherLanguagesData  (optional)
   * @return SendBirdMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdMessageResponse translateMessageIntoOtherLanguages(String apiToken, String channelType, String channelUrl, String messageId, TranslateMessageIntoOtherLanguagesData translateMessageIntoOtherLanguagesData) throws ApiException {
    return translateMessageIntoOtherLanguagesWithHttpInfo(apiToken, channelType, channelUrl, messageId, translateMessageIntoOtherLanguagesData).getData();
  }

  /**
   * Translate a message into other languages
   * ## Translate a message into other languages  Translates a message into specific languages. Only text messages of which type is MESG can be translated into other languages.  &gt; __Note__: Message translation is powered by [Google Cloud Translation API recognition engine](https://cloud.google.com/translate/). Find language codes supported by the engine in the [Miscellaneous](https://sendbird.com/docs/chat/v3/platform-api/guides/Miscellaneous) page or visit the [Language Support](https://cloud.google.com/translate/docs/languages) for Google Cloud Translation.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-translate-a-message-into-other-languages ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param translateMessageIntoOtherLanguagesData  (optional)
   * @return ApiResponse&lt;SendBirdMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdMessageResponse> translateMessageIntoOtherLanguagesWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, TranslateMessageIntoOtherLanguagesData translateMessageIntoOtherLanguagesData) throws ApiException {
    Object localVarPostBody = translateMessageIntoOtherLanguagesData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling translateMessageIntoOtherLanguages");
    }
    
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
  /**
   * Update an announcement
   * ## Update an announcement  Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.  &gt;__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn&#39;t started yet.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement ----------------------------
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @param updateAnnouncementByIdData  (optional)
   * @return UpdateAnnouncementByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateAnnouncementByIdResponse updateAnnouncementById(String apiToken, String uniqueId, UpdateAnnouncementByIdData updateAnnouncementByIdData) throws ApiException {
    return updateAnnouncementByIdWithHttpInfo(apiToken, uniqueId, updateAnnouncementByIdData).getData();
  }

  /**
   * Update an announcement
   * ## Update an announcement  Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.  &gt;__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn&#39;t started yet.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement ----------------------------
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @param updateAnnouncementByIdData  (optional)
   * @return ApiResponse&lt;UpdateAnnouncementByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateAnnouncementByIdResponse> updateAnnouncementByIdWithHttpInfo(String apiToken, String uniqueId, UpdateAnnouncementByIdData updateAnnouncementByIdData) throws ApiException {
    Object localVarPostBody = updateAnnouncementByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateAnnouncementById");
    }
    
    // verify the required parameter 'uniqueId' is set
    if (uniqueId == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueId' when calling updateAnnouncementById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcements/{unique_id}"
      .replaceAll("\\{" + "unique_id" + "\\}", apiClient.escapeString(uniqueId.toString()));

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

    GenericType<UpdateAnnouncementByIdResponse> localVarReturnType = new GenericType<UpdateAnnouncementByIdResponse>() {};

    return apiClient.invokeAPI("MessageApi.updateAnnouncementById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an emoji category URL
   * ## Update an emoji category URL  Updates the URL of an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-category-url ----------------------------
   * @param apiToken  (required)
   * @param emojiCategoryId  (required)
   * @param updateEmojiCategoryUrlByIdData  (optional)
   * @return SendBirdEmojiCategory
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdEmojiCategory updateEmojiCategoryUrlById(String apiToken, String emojiCategoryId, UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData) throws ApiException {
    return updateEmojiCategoryUrlByIdWithHttpInfo(apiToken, emojiCategoryId, updateEmojiCategoryUrlByIdData).getData();
  }

  /**
   * Update an emoji category URL
   * ## Update an emoji category URL  Updates the URL of an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-category-url ----------------------------
   * @param apiToken  (required)
   * @param emojiCategoryId  (required)
   * @param updateEmojiCategoryUrlByIdData  (optional)
   * @return ApiResponse&lt;SendBirdEmojiCategory&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdEmojiCategory> updateEmojiCategoryUrlByIdWithHttpInfo(String apiToken, String emojiCategoryId, UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData) throws ApiException {
    Object localVarPostBody = updateEmojiCategoryUrlByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateEmojiCategoryUrlById");
    }
    
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
  /**
   * Update an emoji URL
   * ## Update an emoji URL  Updates the image URL of an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-url ----------------------------
   * @param apiToken  (required)
   * @param emojiKey  (required)
   * @param updateEmojiUrlByKeyData  (optional)
   * @return SendBirdEmoji
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdEmoji updateEmojiUrlByKey(String apiToken, String emojiKey, UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData) throws ApiException {
    return updateEmojiUrlByKeyWithHttpInfo(apiToken, emojiKey, updateEmojiUrlByKeyData).getData();
  }

  /**
   * Update an emoji URL
   * ## Update an emoji URL  Updates the image URL of an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-url ----------------------------
   * @param apiToken  (required)
   * @param emojiKey  (required)
   * @param updateEmojiUrlByKeyData  (optional)
   * @return ApiResponse&lt;SendBirdEmoji&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdEmoji> updateEmojiUrlByKeyWithHttpInfo(String apiToken, String emojiKey, UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData) throws ApiException {
    Object localVarPostBody = updateEmojiUrlByKeyData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateEmojiUrlByKey");
    }
    
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
  /**
   * Update extra data in a message
   * ## Update extra data in a message  Updates the values of specific items by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-extra-data-in-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param updateExtraDataInMessageData  (optional)
   * @return UpdateExtraDataInMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UpdateExtraDataInMessageResponse updateExtraDataInMessage(String apiToken, String channelType, String channelUrl, String messageId, UpdateExtraDataInMessageData updateExtraDataInMessageData) throws ApiException {
    return updateExtraDataInMessageWithHttpInfo(apiToken, channelType, channelUrl, messageId, updateExtraDataInMessageData).getData();
  }

  /**
   * Update extra data in a message
   * ## Update extra data in a message  Updates the values of specific items by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-extra-data-in-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param updateExtraDataInMessageData  (optional)
   * @return ApiResponse&lt;UpdateExtraDataInMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateExtraDataInMessageResponse> updateExtraDataInMessageWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, UpdateExtraDataInMessageData updateExtraDataInMessageData) throws ApiException {
    Object localVarPostBody = updateExtraDataInMessageData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateExtraDataInMessage");
    }
    
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
  /**
   * Update a message
   * ## Update a message  Updates information on a message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param updateMessageByIdData  (optional)
   * @return SendBirdMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdMessageResponse updateMessageById(String apiToken, String channelType, String channelUrl, String messageId, UpdateMessageByIdData updateMessageByIdData) throws ApiException {
    return updateMessageByIdWithHttpInfo(apiToken, channelType, channelUrl, messageId, updateMessageByIdData).getData();
  }

  /**
   * Update a message
   * ## Update a message  Updates information on a message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-a-message ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param updateMessageByIdData  (optional)
   * @return ApiResponse&lt;SendBirdMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdMessageResponse> updateMessageByIdWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, UpdateMessageByIdData updateMessageByIdData) throws ApiException {
    Object localVarPostBody = updateMessageByIdData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateMessageById");
    }
    
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
  /**
   * Use default emojis
   * ## Use default emojis  Determines whether to use the 7 default emojis initially provided.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-use-default-emojis
   * @param apiToken  (required)
   * @param useDefaultEmojisData  (optional)
   * @return UseDefaultEmojisResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public UseDefaultEmojisResponse useDefaultEmojis(String apiToken, UseDefaultEmojisData useDefaultEmojisData) throws ApiException {
    return useDefaultEmojisWithHttpInfo(apiToken, useDefaultEmojisData).getData();
  }

  /**
   * Use default emojis
   * ## Use default emojis  Determines whether to use the 7 default emojis initially provided.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-use-default-emojis
   * @param apiToken  (required)
   * @param useDefaultEmojisData  (optional)
   * @return ApiResponse&lt;UseDefaultEmojisResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UseDefaultEmojisResponse> useDefaultEmojisWithHttpInfo(String apiToken, UseDefaultEmojisData useDefaultEmojisData) throws ApiException {
    Object localVarPostBody = useDefaultEmojisData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling useDefaultEmojis");
    }
    
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
  /**
   * View a message
   * ## View a message  Retrieves information on a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to retrieve.
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param withSortedMetaArray  (optional)
   * @param withMetaArray  (optional)
   * @return SendBirdMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public SendBirdMessageResponse viewMessageById(String apiToken, String channelType, String channelUrl, String messageId, Boolean withSortedMetaArray, Boolean withMetaArray) throws ApiException {
    return viewMessageByIdWithHttpInfo(apiToken, channelType, channelUrl, messageId, withSortedMetaArray, withMetaArray).getData();
  }

  /**
   * View a message
   * ## View a message  Retrieves information on a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to retrieve.
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @param withSortedMetaArray  (optional)
   * @param withMetaArray  (optional)
   * @return ApiResponse&lt;SendBirdMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendBirdMessageResponse> viewMessageByIdWithHttpInfo(String apiToken, String channelType, String channelUrl, String messageId, Boolean withSortedMetaArray, Boolean withMetaArray) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewMessageById");
    }
    
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
  /**
   * View total number of messages in a channel
   * ## View total number of messages in a channel  Retrieves the total number of messages in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-total-number-of-messages-in-a-channel ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return ViewTotalNumberOfMessagesInChannelResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewTotalNumberOfMessagesInChannelResponse viewTotalNumberOfMessagesInChannel(String apiToken, String channelType, String channelUrl) throws ApiException {
    return viewTotalNumberOfMessagesInChannelWithHttpInfo(apiToken, channelType, channelUrl).getData();
  }

  /**
   * View total number of messages in a channel
   * ## View total number of messages in a channel  Retrieves the total number of messages in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-total-number-of-messages-in-a-channel ----------------------------
   * @param apiToken  (required)
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return ApiResponse&lt;ViewTotalNumberOfMessagesInChannelResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewTotalNumberOfMessagesInChannelResponse> viewTotalNumberOfMessagesInChannelWithHttpInfo(String apiToken, String channelType, String channelUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewTotalNumberOfMessagesInChannel");
    }
    
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
}
