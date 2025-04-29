package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.CreateAChannelMetadataRequest;
import org.openapitools.client.model.CreateAChannelMetadataResponse;
import org.openapitools.client.model.UpdateAChannelMetadataRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-29T07:36:12.748535+07:00[Asia/Jakarta]")
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


private ApiResponse<CreateAChannelMetadataResponse> createAChannelMetadataWithHttpInfo(String channelType, String channelUrl, String apiToken, CreateAChannelMetadataRequest createAChannelMetadataRequest) throws ApiException {
    Object localVarPostBody = createAChannelMetadataRequest;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling createAChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling createAChannelMetadata");
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

    GenericType<CreateAChannelMetadataResponse> localVarReturnType = new GenericType<CreateAChannelMetadataResponse>() {};

    return apiClient.invokeAPI("MetadataApi.createAChannelMetadata", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateAChannelMetadataRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;
    private CreateAChannelMetadataRequest createAChannelMetadataRequest;

    private APIcreateAChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateAChannelMetadataRequest
     */
    public APIcreateAChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createAChannelMetadataRequest
     * @param createAChannelMetadataRequest  (optional)
     * @return APIcreateAChannelMetadataRequest
     */
    public APIcreateAChannelMetadataRequest createAChannelMetadataRequest(CreateAChannelMetadataRequest createAChannelMetadataRequest) {
      this.createAChannelMetadataRequest = createAChannelMetadataRequest;
      return this;
    }

    /**
     * Execute createAChannelMetadata request
     * @return CreateAChannelMetadataResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public CreateAChannelMetadataResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;CreateAChannelMetadataResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<CreateAChannelMetadataResponse> executeWithHttpInfo() throws ApiException {
      return createAChannelMetadataWithHttpInfo(channelType, channelUrl, apiToken, createAChannelMetadataRequest);
    }
  }

  /**
   * Create a channel metadata
   * ## Create a channel metadata  Creates a channel metadata&#39;s items to store in a channel.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-create-metadata#1-create-metadata ----------------------------
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return createAChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateAChannelMetadataRequest createAChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIcreateAChannelMetadataRequest(channelType, channelUrl);
  }

private ApiResponse<Object> deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataWithHttpInfo(String channelType, String channelUrl, String key, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata");
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

    return apiClient.invokeAPI("MetadataApi.deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest {
    private String channelType;
    private String channelUrl;
    private String key;
    private String apiToken;

    private APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set key
     * @param key  (optional)
     * @return APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest
     */
    public APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest
     */
    public APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata request
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
     * Execute deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataWithHttpInfo(channelType, channelUrl, key, apiToken);
    }
  }

  /**
   * Delete a channel metadata - When deleting all items of a channel metadata
   * ## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-delete-metadata#1-delete-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest deleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIdeleteAChannelMetadataWhenDeletingAllItemsOfAChannelMetadataRequest(channelType, channelUrl);
  }

private ApiResponse<Object> updateAChannelMetadataWithHttpInfo(String channelType, String channelUrl, String apiToken, UpdateAChannelMetadataRequest updateAChannelMetadataRequest) throws ApiException {
    Object localVarPostBody = updateAChannelMetadataRequest;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling updateAChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateAChannelMetadata");
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

    return apiClient.invokeAPI("MetadataApi.updateAChannelMetadata", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateAChannelMetadataRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;
    private UpdateAChannelMetadataRequest updateAChannelMetadataRequest;

    private APIupdateAChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateAChannelMetadataRequest
     */
    public APIupdateAChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateAChannelMetadataRequest
     * @param updateAChannelMetadataRequest  (optional)
     * @return APIupdateAChannelMetadataRequest
     */
    public APIupdateAChannelMetadataRequest updateAChannelMetadataRequest(UpdateAChannelMetadataRequest updateAChannelMetadataRequest) {
      this.updateAChannelMetadataRequest = updateAChannelMetadataRequest;
      return this;
    }

    /**
     * Execute updateAChannelMetadata request
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
     * Execute updateAChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return updateAChannelMetadataWithHttpInfo(channelType, channelUrl, apiToken, updateAChannelMetadataRequest);
    }
  }

  /**
   * Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata
   * ## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-update-metadata#1-update-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return updateAChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAChannelMetadataRequest updateAChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIupdateAChannelMetadataRequest(channelType, channelUrl);
  }

private ApiResponse<Object> viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataWithHttpInfo(String channelType, String channelUrl, String key, String keys, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata");
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

    return apiClient.invokeAPI("MetadataApi.viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest {
    private String channelType;
    private String channelUrl;
    private String key;
    private String keys;
    private String apiToken;

    private APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set key
     * @param key  (optional)
     * @return APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest
     */
    public APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set keys
     * @param keys In a query string, specifies an array of one or more keys of the metadata items. If not specified, all items of the metadata are returned. If specified, only the items that match the parameter values are returned. URL encoding each key is recommended. (optional)
     * @return APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest
     */
    public APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest keys(String keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest
     */
    public APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata request
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
     * Execute viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataWithHttpInfo(channelType, channelUrl, key, keys, apiToken);
    }
  }

  /**
   * View a channel metadata - When retrieving all items of a channel metadata
   * ## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-metadata/channel-get-metadata#1-get-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
   * @param channelType (Required)  (required)
   * @param channelUrl (Required)  (required)
   * @return viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest viewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadata(String channelType, String channelUrl) throws ApiException {
    return new APIviewAChannelMetadataWhenRetrievingAllItemsOfAChannelMetadataRequest(channelType, channelUrl);
  }
}
