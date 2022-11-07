package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.CreateChannelMetacounterData;
import org.openapitools.client.model.CreateChannelMetadataData;
import org.openapitools.client.model.CreateChannelMetadataResponse;
import org.openapitools.client.model.CreateUserMetadataData;
import org.openapitools.client.model.CreateUserMetadataResponse;
import org.openapitools.client.model.UpdateChannelMetacounterData;
import org.openapitools.client.model.UpdateChannelMetadataData;
import org.openapitools.client.model.UpdateUserMetadataData;
import org.openapitools.client.model.UpdateUserMetadataResponse;
import org.openapitools.client.model.ViewUserMetadataResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T15:23:06.856887Z[Europe/London]")
public class MetadataApi {
  private ApiClient apiClient;

  public MetadataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetadataApi(ApiClient apiClient) {
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


private ApiResponse<Object> createChannelMetacounterWithHttpInfo(String apiToken, String channelType, String channelUrl, CreateChannelMetacounterData createChannelMetacounterData) throws ApiException {
    Object localVarPostBody = createChannelMetacounterData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling createChannelMetacounter");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling createChannelMetacounter");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling createChannelMetacounter");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metacounter"
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("MetadataApi.createChannelMetacounter", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateChannelMetacounterRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private CreateChannelMetacounterData createChannelMetacounterData;

    private APIcreateChannelMetacounterRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIcreateChannelMetacounterRequest
     */
    public APIcreateChannelMetacounterRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createChannelMetacounterData
     * @param createChannelMetacounterData  (optional)
     * @return APIcreateChannelMetacounterRequest
     */
    public APIcreateChannelMetacounterRequest createChannelMetacounterData(CreateChannelMetacounterData createChannelMetacounterData) {
      this.createChannelMetacounterData = createChannelMetacounterData;
      return this;
    }

    /**
     * Execute createChannelMetacounter request
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
     * Execute createChannelMetacounter request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return createChannelMetacounterWithHttpInfo(apiToken, channelType, channelUrl, createChannelMetacounterData);
    }
  }

  /**
   * Create a channel metacounter
   * ## Create a channel metacounter  Creates a channel metacounter&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metacounter ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return createChannelMetacounterRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateChannelMetacounterRequest createChannelMetacounter(String channelType, String channelUrl) throws ApiException {
    return new APIcreateChannelMetacounterRequest(channelType, channelUrl);
  }

private ApiResponse<CreateChannelMetadataResponse> createChannelMetadataWithHttpInfo(String apiToken, String channelType, String channelUrl, CreateChannelMetadataData createChannelMetadataData) throws ApiException {
    Object localVarPostBody = createChannelMetadataData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling createChannelMetadata");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling createChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling createChannelMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metadata"
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

    GenericType<CreateChannelMetadataResponse> localVarReturnType = new GenericType<CreateChannelMetadataResponse>() {};

    return apiClient.invokeAPI("MetadataApi.createChannelMetadata", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateChannelMetadataRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private CreateChannelMetadataData createChannelMetadataData;

    private APIcreateChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIcreateChannelMetadataRequest
     */
    public APIcreateChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createChannelMetadataData
     * @param createChannelMetadataData  (optional)
     * @return APIcreateChannelMetadataRequest
     */
    public APIcreateChannelMetadataRequest createChannelMetadataData(CreateChannelMetadataData createChannelMetadataData) {
      this.createChannelMetadataData = createChannelMetadataData;
      return this;
    }

    /**
     * Execute createChannelMetadata request
     * @return CreateChannelMetadataResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CreateChannelMetadataResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;CreateChannelMetadataResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CreateChannelMetadataResponse> executeWithHttpInfo() throws ApiException {
      return createChannelMetadataWithHttpInfo(apiToken, channelType, channelUrl, createChannelMetadataData);
    }
  }

  /**
   * Create a channel metadata
   * ## Create a channel metadata  Creates a channel metadata&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metadata ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return createChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateChannelMetadataRequest createChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIcreateChannelMetadataRequest(channelType, channelUrl);
  }

private ApiResponse<CreateUserMetadataResponse> createUserMetadataWithHttpInfo(String apiToken, String userId, CreateUserMetadataData createUserMetadataData) throws ApiException {
    Object localVarPostBody = createUserMetadataData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling createUserMetadata");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createUserMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/metadata"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<CreateUserMetadataResponse> localVarReturnType = new GenericType<CreateUserMetadataResponse>() {};

    return apiClient.invokeAPI("MetadataApi.createUserMetadata", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateUserMetadataRequest {
    private String apiToken;
    private String userId;
    private CreateUserMetadataData createUserMetadataData;

    private APIcreateUserMetadataRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIcreateUserMetadataRequest
     */
    public APIcreateUserMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createUserMetadataData
     * @param createUserMetadataData  (optional)
     * @return APIcreateUserMetadataRequest
     */
    public APIcreateUserMetadataRequest createUserMetadataData(CreateUserMetadataData createUserMetadataData) {
      this.createUserMetadataData = createUserMetadataData;
      return this;
    }

    /**
     * Execute createUserMetadata request
     * @return CreateUserMetadataResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CreateUserMetadataResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createUserMetadata request with HTTP info returned
     * @return ApiResponse&lt;CreateUserMetadataResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CreateUserMetadataResponse> executeWithHttpInfo() throws ApiException {
      return createUserMetadataWithHttpInfo(apiToken, userId, createUserMetadataData);
    }
  }

  /**
   * Create a user metadata
   * ## Create a user metadata  Creates a user metadata&#39;s items to store in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-user-metadata ----------------------------
   * @param userId  (required)
   * @return createUserMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateUserMetadataRequest createUserMetadata(String userId) throws ApiException {
    return new APIcreateUserMetadataRequest(userId);
  }

private ApiResponse<Void> deleteChannelMetacounterWithHttpInfo(String apiToken, String channelType, String channelUrl) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteChannelMetacounter");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling deleteChannelMetacounter");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteChannelMetacounter");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metacounter"
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
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("MetadataApi.deleteChannelMetacounter", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteChannelMetacounterRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;

    private APIdeleteChannelMetacounterRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIdeleteChannelMetacounterRequest
     */
    public APIdeleteChannelMetacounterRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteChannelMetacounter request
     
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
     * Execute deleteChannelMetacounter request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteChannelMetacounterWithHttpInfo(apiToken, channelType, channelUrl);
    }
  }

  /**
   * Delete a channel metacounter - When deleting all items of a channel metacounter
   * ## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return deleteChannelMetacounterRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteChannelMetacounterRequest deleteChannelMetacounter(String channelType, String channelUrl) throws ApiException {
    return new APIdeleteChannelMetacounterRequest(channelType, channelUrl);
  }

private ApiResponse<Void> deleteChannelMetacounterByKeyWithHttpInfo(String apiToken, String channelType, String channelUrl, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteChannelMetacounterByKey");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling deleteChannelMetacounterByKey");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteChannelMetacounterByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteChannelMetacounterByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metacounter/{key}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    return apiClient.invokeAPI("MetadataApi.deleteChannelMetacounterByKey", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteChannelMetacounterByKeyRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;

    private APIdeleteChannelMetacounterByKeyRequest(String channelType, String channelUrl, String key) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIdeleteChannelMetacounterByKeyRequest
     */
    public APIdeleteChannelMetacounterByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteChannelMetacounterByKey request
     
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
     * Execute deleteChannelMetacounterByKey request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteChannelMetacounterByKeyWithHttpInfo(apiToken, channelType, channelUrl, key);
    }
  }

  /**
   * Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key
   * ## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param key  (required)
   * @return deleteChannelMetacounterByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteChannelMetacounterByKeyRequest deleteChannelMetacounterByKey(String channelType, String channelUrl, String key) throws ApiException {
    return new APIdeleteChannelMetacounterByKeyRequest(channelType, channelUrl, key);
  }

private ApiResponse<Void> deleteChannelMetadataWithHttpInfo(String apiToken, String channelType, String channelUrl, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteChannelMetadata");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling deleteChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteChannelMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metadata"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("MetadataApi.deleteChannelMetadata", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteChannelMetadataRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;

    private APIdeleteChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIdeleteChannelMetadataRequest
     */
    public APIdeleteChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set key
     * @param key  (optional)
     * @return APIdeleteChannelMetadataRequest
     */
    public APIdeleteChannelMetadataRequest key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Execute deleteChannelMetadata request
     
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
     * Execute deleteChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteChannelMetadataWithHttpInfo(apiToken, channelType, channelUrl, key);
    }
  }

  /**
   * Delete a channel metadata - When deleting all items of a channel metadata
   * ## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return deleteChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteChannelMetadataRequest deleteChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIdeleteChannelMetadataRequest(channelType, channelUrl);
  }

private ApiResponse<Void> deleteChannelMetadataByKeyWithHttpInfo(String apiToken, String channelType, String channelUrl, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteChannelMetadataByKey");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling deleteChannelMetadataByKey");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteChannelMetadataByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteChannelMetadataByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metadata/{key}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    return apiClient.invokeAPI("MetadataApi.deleteChannelMetadataByKey", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteChannelMetadataByKeyRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;

    private APIdeleteChannelMetadataByKeyRequest(String channelType, String channelUrl, String key) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIdeleteChannelMetadataByKeyRequest
     */
    public APIdeleteChannelMetadataByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteChannelMetadataByKey request
     
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
     * Execute deleteChannelMetadataByKey request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteChannelMetadataByKeyWithHttpInfo(apiToken, channelType, channelUrl, key);
    }
  }

  /**
   * Delete a channel metadata - When deleting a specific item of a channel metadata by its key
   * ## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param key  (required)
   * @return deleteChannelMetadataByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteChannelMetadataByKeyRequest deleteChannelMetadataByKey(String channelType, String channelUrl, String key) throws ApiException {
    return new APIdeleteChannelMetadataByKeyRequest(channelType, channelUrl, key);
  }

private ApiResponse<Void> deleteUserMetadataWithHttpInfo(String apiToken, String userId, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteUserMetadata");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/metadata"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("MetadataApi.deleteUserMetadata", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteUserMetadataRequest {
    private String apiToken;
    private String userId;
    private String key;

    private APIdeleteUserMetadataRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIdeleteUserMetadataRequest
     */
    public APIdeleteUserMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set key
     * @param key  (optional)
     * @return APIdeleteUserMetadataRequest
     */
    public APIdeleteUserMetadataRequest key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Execute deleteUserMetadata request
     
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
     * Execute deleteUserMetadata request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteUserMetadataWithHttpInfo(apiToken, userId, key);
    }
  }

  /**
   * Delete a user metadata - When deleting all items of a user metadata
   * ## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.
   * @param userId  (required)
   * @return deleteUserMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteUserMetadataRequest deleteUserMetadata(String userId) throws ApiException {
    return new APIdeleteUserMetadataRequest(userId);
  }

private ApiResponse<Void> deleteUserMetadataByKeyWithHttpInfo(String apiToken, String userId, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling deleteUserMetadataByKey");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserMetadataByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteUserMetadataByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/metadata/{key}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    return apiClient.invokeAPI("MetadataApi.deleteUserMetadataByKey", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteUserMetadataByKeyRequest {
    private String apiToken;
    private String userId;
    private String key;

    private APIdeleteUserMetadataByKeyRequest(String userId, String key) {
      this.userId = userId;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIdeleteUserMetadataByKeyRequest
     */
    public APIdeleteUserMetadataByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteUserMetadataByKey request
     
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
     * Execute deleteUserMetadataByKey request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteUserMetadataByKeyWithHttpInfo(apiToken, userId, key);
    }
  }

  /**
   * Delete a user metadata - When deleting a specific item of a user metadata by its key
   * ## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.
   * @param userId  (required)
   * @param key  (required)
   * @return deleteUserMetadataByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteUserMetadataByKeyRequest deleteUserMetadataByKey(String userId, String key) throws ApiException {
    return new APIdeleteUserMetadataByKeyRequest(userId, key);
  }

private ApiResponse<Object> updateChannelMetacounterWithHttpInfo(String apiToken, String channelType, String channelUrl, UpdateChannelMetacounterData updateChannelMetacounterData) throws ApiException {
    Object localVarPostBody = updateChannelMetacounterData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateChannelMetacounter");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateChannelMetacounter");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateChannelMetacounter");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metacounter"
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("MetadataApi.updateChannelMetacounter", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateChannelMetacounterRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private UpdateChannelMetacounterData updateChannelMetacounterData;

    private APIupdateChannelMetacounterRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIupdateChannelMetacounterRequest
     */
    public APIupdateChannelMetacounterRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateChannelMetacounterData
     * @param updateChannelMetacounterData  (optional)
     * @return APIupdateChannelMetacounterRequest
     */
    public APIupdateChannelMetacounterRequest updateChannelMetacounterData(UpdateChannelMetacounterData updateChannelMetacounterData) {
      this.updateChannelMetacounterData = updateChannelMetacounterData;
      return this;
    }

    /**
     * Execute updateChannelMetacounter request
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
     * Execute updateChannelMetacounter request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return updateChannelMetacounterWithHttpInfo(apiToken, channelType, channelUrl, updateChannelMetacounterData);
    }
  }

  /**
   * Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter
   * ## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return updateChannelMetacounterRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateChannelMetacounterRequest updateChannelMetacounter(String channelType, String channelUrl) throws ApiException {
    return new APIupdateChannelMetacounterRequest(channelType, channelUrl);
  }

private ApiResponse<Map<String, String>> updateChannelMetacounterByKeyWithHttpInfo(String apiToken, String channelType, String channelUrl, String key, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateChannelMetacounterByKey");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateChannelMetacounterByKey");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateChannelMetacounterByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling updateChannelMetacounterByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metacounter/{key}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.updateChannelMetacounterByKey", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateChannelMetacounterByKeyRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;
    private Object body;

    private APIupdateChannelMetacounterByKeyRequest(String channelType, String channelUrl, String key) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIupdateChannelMetacounterByKeyRequest
     */
    public APIupdateChannelMetacounterByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIupdateChannelMetacounterByKeyRequest
     */
    public APIupdateChannelMetacounterByKeyRequest body(Object body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateChannelMetacounterByKey request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateChannelMetacounterByKey request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return updateChannelMetacounterByKeyWithHttpInfo(apiToken, channelType, channelUrl, key, body);
    }
  }

  /**
   * Update a channel metacounter - When updating a specific item of a channel metacounter by its key
   * ## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param key  (required)
   * @return updateChannelMetacounterByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateChannelMetacounterByKeyRequest updateChannelMetacounterByKey(String channelType, String channelUrl, String key) throws ApiException {
    return new APIupdateChannelMetacounterByKeyRequest(channelType, channelUrl, key);
  }

private ApiResponse<Map<String, String>> updateChannelMetadataWithHttpInfo(String apiToken, String channelType, String channelUrl, UpdateChannelMetadataData updateChannelMetadataData) throws ApiException {
    Object localVarPostBody = updateChannelMetadataData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateChannelMetadata");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateChannelMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metadata"
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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.updateChannelMetadata", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateChannelMetadataRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private UpdateChannelMetadataData updateChannelMetadataData;

    private APIupdateChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIupdateChannelMetadataRequest
     */
    public APIupdateChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateChannelMetadataData
     * @param updateChannelMetadataData  (optional)
     * @return APIupdateChannelMetadataRequest
     */
    public APIupdateChannelMetadataRequest updateChannelMetadataData(UpdateChannelMetadataData updateChannelMetadataData) {
      this.updateChannelMetadataData = updateChannelMetadataData;
      return this;
    }

    /**
     * Execute updateChannelMetadata request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return updateChannelMetadataWithHttpInfo(apiToken, channelType, channelUrl, updateChannelMetadataData);
    }
  }

  /**
   * Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata
   * ## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return updateChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateChannelMetadataRequest updateChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIupdateChannelMetadataRequest(channelType, channelUrl);
  }

private ApiResponse<Map<String, String>> updateChannelMetadataByKeyWithHttpInfo(String apiToken, String channelType, String channelUrl, String key, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateChannelMetadataByKey");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateChannelMetadataByKey");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateChannelMetadataByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling updateChannelMetadataByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metadata/{key}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.updateChannelMetadataByKey", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateChannelMetadataByKeyRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;
    private Object body;

    private APIupdateChannelMetadataByKeyRequest(String channelType, String channelUrl, String key) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIupdateChannelMetadataByKeyRequest
     */
    public APIupdateChannelMetadataByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIupdateChannelMetadataByKeyRequest
     */
    public APIupdateChannelMetadataByKeyRequest body(Object body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateChannelMetadataByKey request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateChannelMetadataByKey request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return updateChannelMetadataByKeyWithHttpInfo(apiToken, channelType, channelUrl, key, body);
    }
  }

  /**
   * Update a channel metadata - When updating a specific item of a channel metadata by its key
   * ## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param key  (required)
   * @return updateChannelMetadataByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateChannelMetadataByKeyRequest updateChannelMetadataByKey(String channelType, String channelUrl, String key) throws ApiException {
    return new APIupdateChannelMetadataByKeyRequest(channelType, channelUrl, key);
  }

private ApiResponse<UpdateUserMetadataResponse> updateUserMetadataWithHttpInfo(String apiToken, String userId, UpdateUserMetadataData updateUserMetadataData) throws ApiException {
    Object localVarPostBody = updateUserMetadataData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateUserMetadata");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/metadata"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<UpdateUserMetadataResponse> localVarReturnType = new GenericType<UpdateUserMetadataResponse>() {};

    return apiClient.invokeAPI("MetadataApi.updateUserMetadata", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateUserMetadataRequest {
    private String apiToken;
    private String userId;
    private UpdateUserMetadataData updateUserMetadataData;

    private APIupdateUserMetadataRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIupdateUserMetadataRequest
     */
    public APIupdateUserMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateUserMetadataData
     * @param updateUserMetadataData  (optional)
     * @return APIupdateUserMetadataRequest
     */
    public APIupdateUserMetadataRequest updateUserMetadataData(UpdateUserMetadataData updateUserMetadataData) {
      this.updateUserMetadataData = updateUserMetadataData;
      return this;
    }

    /**
     * Execute updateUserMetadata request
     * @return UpdateUserMetadataResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateUserMetadataResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateUserMetadata request with HTTP info returned
     * @return ApiResponse&lt;UpdateUserMetadataResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateUserMetadataResponse> executeWithHttpInfo() throws ApiException {
      return updateUserMetadataWithHttpInfo(apiToken, userId, updateUserMetadataData);
    }
  }

  /**
   * Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata
   * ## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.
   * @param userId  (required)
   * @return updateUserMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateUserMetadataRequest updateUserMetadata(String userId) throws ApiException {
    return new APIupdateUserMetadataRequest(userId);
  }

private ApiResponse<Map<String, String>> updateUserMetadataByKeyWithHttpInfo(String apiToken, String userId, String key, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling updateUserMetadataByKey");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserMetadataByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling updateUserMetadataByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/metadata/{key}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.updateUserMetadataByKey", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateUserMetadataByKeyRequest {
    private String apiToken;
    private String userId;
    private String key;
    private Object body;

    private APIupdateUserMetadataByKeyRequest(String userId, String key) {
      this.userId = userId;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIupdateUserMetadataByKeyRequest
     */
    public APIupdateUserMetadataByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set body
     * @param body  (optional)
     * @return APIupdateUserMetadataByKeyRequest
     */
    public APIupdateUserMetadataByKeyRequest body(Object body) {
      this.body = body;
      return this;
    }

    /**
     * Execute updateUserMetadataByKey request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateUserMetadataByKey request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return updateUserMetadataByKeyWithHttpInfo(apiToken, userId, key, body);
    }
  }

  /**
   * Update a user metadata - When updating a specific item of a user metadata by its key
   * ## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.
   * @param userId  (required)
   * @param key  (required)
   * @return updateUserMetadataByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateUserMetadataByKeyRequest updateUserMetadataByKey(String userId, String key) throws ApiException {
    return new APIupdateUserMetadataByKeyRequest(userId, key);
  }

private ApiResponse<Map<String, String>> viewChannelMetacounterWithHttpInfo(String apiToken, String channelType, String channelUrl, String key, List<String> keys) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewChannelMetacounter");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewChannelMetacounter");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewChannelMetacounter");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metacounter"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.viewChannelMetacounter", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewChannelMetacounterRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;
    private List<String> keys;

    private APIviewChannelMetacounterRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIviewChannelMetacounterRequest
     */
    public APIviewChannelMetacounterRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set key
     * @param key  (optional)
     * @return APIviewChannelMetacounterRequest
     */
    public APIviewChannelMetacounterRequest key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set keys
     * @param keys  (optional)
     * @return APIviewChannelMetacounterRequest
     */
    public APIviewChannelMetacounterRequest keys(List<String> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Execute viewChannelMetacounter request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewChannelMetacounter request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return viewChannelMetacounterWithHttpInfo(apiToken, channelType, channelUrl, key, keys);
    }
  }

  /**
   * View a channel metacounter - When retrieving all items of a channel metacounter
   * ## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return viewChannelMetacounterRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewChannelMetacounterRequest viewChannelMetacounter(String channelType, String channelUrl) throws ApiException {
    return new APIviewChannelMetacounterRequest(channelType, channelUrl);
  }

private ApiResponse<Object> viewChannelMetacounterByKeyWithHttpInfo(String apiToken, String channelType, String channelUrl, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewChannelMetacounterByKey");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewChannelMetacounterByKey");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewChannelMetacounterByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling viewChannelMetacounterByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metacounter/{key}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    return apiClient.invokeAPI("MetadataApi.viewChannelMetacounterByKey", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewChannelMetacounterByKeyRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;

    private APIviewChannelMetacounterByKeyRequest(String channelType, String channelUrl, String key) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIviewChannelMetacounterByKeyRequest
     */
    public APIviewChannelMetacounterByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewChannelMetacounterByKey request
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
     * Execute viewChannelMetacounterByKey request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return viewChannelMetacounterByKeyWithHttpInfo(apiToken, channelType, channelUrl, key);
    }
  }

  /**
   * View a channel metacounter - When retrieving a specific item of a channel metacounter by its key
   * ## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param key  (required)
   * @return viewChannelMetacounterByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewChannelMetacounterByKeyRequest viewChannelMetacounterByKey(String channelType, String channelUrl, String key) throws ApiException {
    return new APIviewChannelMetacounterByKeyRequest(channelType, channelUrl, key);
  }

private ApiResponse<Map<String, String>> viewChannelMetadataWithHttpInfo(String apiToken, String channelType, String channelUrl, String key, List<String> keys) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewChannelMetadata");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewChannelMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metadata"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.viewChannelMetadata", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewChannelMetadataRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;
    private List<String> keys;

    private APIviewChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIviewChannelMetadataRequest
     */
    public APIviewChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set key
     * @param key  (optional)
     * @return APIviewChannelMetadataRequest
     */
    public APIviewChannelMetadataRequest key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set keys
     * @param keys  (optional)
     * @return APIviewChannelMetadataRequest
     */
    public APIviewChannelMetadataRequest keys(List<String> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Execute viewChannelMetadata request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return viewChannelMetadataWithHttpInfo(apiToken, channelType, channelUrl, key, keys);
    }
  }

  /**
   * View a channel metadata - When retrieving all items of a channel metadata
   * ## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return viewChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewChannelMetadataRequest viewChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIviewChannelMetadataRequest(channelType, channelUrl);
  }

private ApiResponse<Map<String, String>> viewChannelMetadataByKeyWithHttpInfo(String apiToken, String channelType, String channelUrl, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewChannelMetadataByKey");
    }
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewChannelMetadataByKey");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewChannelMetadataByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling viewChannelMetadataByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/{channel_type}/{channel_url}/metadata/{key}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.viewChannelMetadataByKey", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewChannelMetadataByKeyRequest {
    private String apiToken;
    private String channelType;
    private String channelUrl;
    private String key;

    private APIviewChannelMetadataByKeyRequest(String channelType, String channelUrl, String key) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIviewChannelMetadataByKeyRequest
     */
    public APIviewChannelMetadataByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewChannelMetadataByKey request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewChannelMetadataByKey request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return viewChannelMetadataByKeyWithHttpInfo(apiToken, channelType, channelUrl, key);
    }
  }

  /**
   * View a channel metadata - When retrieving a specific item of a channel metadata by its key
   * ## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param key  (required)
   * @return viewChannelMetadataByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewChannelMetadataByKeyRequest viewChannelMetadataByKey(String channelType, String channelUrl, String key) throws ApiException {
    return new APIviewChannelMetadataByKeyRequest(channelType, channelUrl, key);
  }

private ApiResponse<ViewUserMetadataResponse> viewUserMetadataWithHttpInfo(String apiToken, String userId, String key, List<String> keys) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewUserMetadata");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewUserMetadata");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/metadata"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
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

    GenericType<ViewUserMetadataResponse> localVarReturnType = new GenericType<ViewUserMetadataResponse>() {};

    return apiClient.invokeAPI("MetadataApi.viewUserMetadata", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewUserMetadataRequest {
    private String apiToken;
    private String userId;
    private String key;
    private List<String> keys;

    private APIviewUserMetadataRequest(String userId) {
      this.userId = userId;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIviewUserMetadataRequest
     */
    public APIviewUserMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set key
     * @param key  (optional)
     * @return APIviewUserMetadataRequest
     */
    public APIviewUserMetadataRequest key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set keys
     * @param keys  (optional)
     * @return APIviewUserMetadataRequest
     */
    public APIviewUserMetadataRequest keys(List<String> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Execute viewUserMetadata request
     * @return ViewUserMetadataResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewUserMetadataResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewUserMetadata request with HTTP info returned
     * @return ApiResponse&lt;ViewUserMetadataResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewUserMetadataResponse> executeWithHttpInfo() throws ApiException {
      return viewUserMetadataWithHttpInfo(apiToken, userId, key, keys);
    }
  }

  /**
   * View a user metadata - When retrieving all items of a user metadata
   * ## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.
   * @param userId  (required)
   * @return viewUserMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewUserMetadataRequest viewUserMetadata(String userId) throws ApiException {
    return new APIviewUserMetadataRequest(userId);
  }

private ApiResponse<Map<String, String>> viewUserMetadataByKeyWithHttpInfo(String apiToken, String userId, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewUserMetadataByKey");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling viewUserMetadataByKey");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling viewUserMetadataByKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/users/{user_id}/metadata/{key}"
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

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

    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};

    return apiClient.invokeAPI("MetadataApi.viewUserMetadataByKey", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewUserMetadataByKeyRequest {
    private String apiToken;
    private String userId;
    private String key;

    private APIviewUserMetadataByKeyRequest(String userId, String key) {
      this.userId = userId;
      this.key = key;
    }

    /**
     * Set apiToken
     * @param apiToken  (required)
     * @return APIviewUserMetadataByKeyRequest
     */
    public APIviewUserMetadataByKeyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewUserMetadataByKey request
     * @return Map&lt;String, String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Map<String, String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewUserMetadataByKey request with HTTP info returned
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Map<String, String>> executeWithHttpInfo() throws ApiException {
      return viewUserMetadataByKeyWithHttpInfo(apiToken, userId, key);
    }
  }

  /**
   * View a user metadata - When retrieving a specific item of a user metadata by its key
   * ## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.
   * @param userId  (required)
   * @param key  (required)
   * @return viewUserMetadataByKeyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewUserMetadataByKeyRequest viewUserMetadataByKey(String userId, String key) throws ApiException {
    return new APIviewUserMetadataByKeyRequest(userId, key);
  }
}
