package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.CreateAnOpenChannelRequest;
import org.openapitools.client.model.ListOpenChannelsResponse;
import org.openapitools.client.model.ListOperatorsResponse;
import org.openapitools.client.model.RegisterOperatorsToAGroupChannelRequest;
import org.openapitools.client.model.SendbirdOpenChannel;
import org.openapitools.client.model.UpdateAnOpenChannelRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-07T12:17:09.099818+09:00[Asia/Seoul]")
public class OpenChannelApi {
  private ApiClient apiClient;

  public OpenChannelApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OpenChannelApi(ApiClient apiClient) {
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


private ApiResponse<SendbirdOpenChannel> createAnOpenChannelWithHttpInfo(String apiToken, CreateAnOpenChannelRequest createAnOpenChannelRequest) throws ApiException {
    Object localVarPostBody = createAnOpenChannelRequest;
    
    // create path and map variables
    String localVarPath = "/v3/open_channels";

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

    GenericType<SendbirdOpenChannel> localVarReturnType = new GenericType<SendbirdOpenChannel>() {};

    return apiClient.invokeAPI("OpenChannelApi.createAnOpenChannel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIcreateAnOpenChannelRequest {
    private String apiToken;
    private CreateAnOpenChannelRequest createAnOpenChannelRequest;

    private APIcreateAnOpenChannelRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcreateAnOpenChannelRequest
     */
    public APIcreateAnOpenChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set createAnOpenChannelRequest
     * @param createAnOpenChannelRequest  (optional)
     * @return APIcreateAnOpenChannelRequest
     */
    public APIcreateAnOpenChannelRequest createAnOpenChannelRequest(CreateAnOpenChannelRequest createAnOpenChannelRequest) {
      this.createAnOpenChannelRequest = createAnOpenChannelRequest;
      return this;
    }

    /**
     * Execute createAnOpenChannel request
     * @return SendbirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAnOpenChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return createAnOpenChannelWithHttpInfo(apiToken, createAnOpenChannelRequest);
    }
  }

  /**
   * Create an open channel
   * ## Create an open channel  You can create an [open channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel) that facilitates conversations for millions of users. Open channels allow a seamless chat experience possible for all participants by using [dynamic partitioning](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#4-how-dynamic-partitioning-works) which creates subchannels that each handle up to tens of thousands of participants.  Because users don&#39;t need invitations to join open channels, short-lived live events like concerts or live streams that don&#39;t require a sustained membership are good use cases for open channels.  [https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel)
   * @return createAnOpenChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcreateAnOpenChannelRequest createAnOpenChannel() throws ApiException {
    return new APIcreateAnOpenChannelRequest();
  }

private ApiResponse<Object> deleteAnOpenChannelWithHttpInfo(String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling deleteAnOpenChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("OpenChannelApi.deleteAnOpenChannel", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIdeleteAnOpenChannelRequest {
    private String channelUrl;
    private String apiToken;

    private APIdeleteAnOpenChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIdeleteAnOpenChannelRequest
     */
    public APIdeleteAnOpenChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute deleteAnOpenChannel request
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
     * Execute deleteAnOpenChannel request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAnOpenChannelWithHttpInfo(channelUrl, apiToken);
    }
  }

  /**
   * Delete an open channel
   * ## Delete an open channel  You can delete an open channel using this API. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/delete-an-open-channel#1-delete-an-open-channel
   * @param channelUrl (Required)  (required)
   * @return deleteAnOpenChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteAnOpenChannelRequest deleteAnOpenChannel(String channelUrl) throws ApiException {
    return new APIdeleteAnOpenChannelRequest(channelUrl);
  }

private ApiResponse<SendbirdOpenChannel> getAnOpenChannelWithHttpInfo(String channelUrl, String apiToken, Boolean includeOperators) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling getAnOpenChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_operators", includeOperators));

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

    GenericType<SendbirdOpenChannel> localVarReturnType = new GenericType<SendbirdOpenChannel>() {};

    return apiClient.invokeAPI("OpenChannelApi.getAnOpenChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetAnOpenChannelRequest {
    private String channelUrl;
    private String apiToken;
    private Boolean includeOperators;

    private APIgetAnOpenChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetAnOpenChannelRequest
     */
    public APIgetAnOpenChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set includeOperators
     * @param includeOperators Determines whether to include a list of operators in the response. (Default: false) (optional)
     * @return APIgetAnOpenChannelRequest
     */
    public APIgetAnOpenChannelRequest includeOperators(Boolean includeOperators) {
      this.includeOperators = includeOperators;
      return this;
    }

    /**
     * Execute getAnOpenChannel request
     * @return SendbirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAnOpenChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return getAnOpenChannelWithHttpInfo(channelUrl, apiToken, includeOperators);
    }
  }

  /**
   * Get an open channel
   * ## Get an open channel  This action retrieves information about a specific [open channel](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel).  [https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/get-an-open-channel#1-get-an-open-channel](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/get-an-open-channel#1-get-an-open-channel)
   * @param channelUrl (Required)  (required)
   * @return getAnOpenChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetAnOpenChannelRequest getAnOpenChannel(String channelUrl) throws ApiException {
    return new APIgetAnOpenChannelRequest(channelUrl);
  }

private ApiResponse<ListOperatorsResponse> listChannelOperatorsWithHttpInfo(String channelUrl, String token, Integer limit, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listChannelOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/operators"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<ListOperatorsResponse> localVarReturnType = new GenericType<ListOperatorsResponse>() {};

    return apiClient.invokeAPI("OpenChannelApi.listChannelOperators", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistChannelOperatorsRequest {
    private String channelUrl;
    private String token;
    private Integer limit;
    private String apiToken;

    private APIlistChannelOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistChannelOperatorsRequest
     */
    public APIlistChannelOperatorsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistChannelOperatorsRequest
     */
    public APIlistChannelOperatorsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistChannelOperatorsRequest
     */
    public APIlistChannelOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listChannelOperators request
     * @return ListOperatorsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListOperatorsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listChannelOperators request with HTTP info returned
     * @return ApiResponse&lt;ListOperatorsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListOperatorsResponse> executeWithHttpInfo() throws ApiException {
      return listChannelOperatorsWithHttpInfo(channelUrl, token, limit, apiToken);
    }
  }

  /**
   * List operators of an open channel
   * ## List operators of an open channel  You can retrieve a list of operators of an open channel using this API.  https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/list-operators-of-an-open-channel#1-list-operators-of-an-open-channel  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to retrieve a list of operators.
   * @param channelUrl (Required)  (required)
   * @return listChannelOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistChannelOperatorsRequest listChannelOperators(String channelUrl) throws ApiException {
    return new APIlistChannelOperatorsRequest(channelUrl);
  }

private ApiResponse<ListOpenChannelsResponse> listOpenChannelsWithHttpInfo(String token, String channelUrls, Integer limit, String customTypes, String nameContains, String urlContains, Boolean showFrozen, Boolean showMetadata, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/open_channels";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel_urls", channelUrls));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name_contains", nameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url_contains", urlContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_frozen", showFrozen));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_metadata", showMetadata));

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

    GenericType<ListOpenChannelsResponse> localVarReturnType = new GenericType<ListOpenChannelsResponse>() {};

    return apiClient.invokeAPI("OpenChannelApi.listOpenChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistOpenChannelsRequest {
    private String token;
    private String channelUrls;
    private Integer limit;
    private String customTypes;
    private String nameContains;
    private String urlContains;
    private Boolean showFrozen;
    private Boolean showMetadata;
    private String apiToken;

    private APIlistOpenChannelsRequest() {
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set channelUrls
     * @param channelUrls Specifies a comma-separated string of one or more open channel URLs to restrict the search scope. URL encoding each channel URL is recommended. (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest channelUrls(String channelUrls) {
      this.channelUrls = channelUrls;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes Specifies a comma-separated string of one or more custom types to filter open channels. Urlencoding each type is recommended (for example, ?custom_types&#x3D;urlencoded_type_1,urlencoded_type_2). If not specified, all channels are returned, regardless of their custom type. (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set nameContains
     * @param nameContains  (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest nameContains(String nameContains) {
      this.nameContains = nameContains;
      return this;
    }

    /**
     * Set urlContains
     * @param urlContains  (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest urlContains(String urlContains) {
      this.urlContains = urlContains;
      return this;
    }

    /**
     * Set showFrozen
     * @param showFrozen Determines whether to include frozen channels in the response. Frozen channels are channels where only channel operators are allowed to send messages. (Default: true) (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest showFrozen(Boolean showFrozen) {
      this.showFrozen = showFrozen;
      return this;
    }

    /**
     * Set showMetadata
     * @param showMetadata Determines whether to include channel metadata in the response. (Default: false) (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest showMetadata(Boolean showMetadata) {
      this.showMetadata = showMetadata;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistOpenChannelsRequest
     */
    public APIlistOpenChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute listOpenChannels request
     * @return ListOpenChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListOpenChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listOpenChannels request with HTTP info returned
     * @return ApiResponse&lt;ListOpenChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListOpenChannelsResponse> executeWithHttpInfo() throws ApiException {
      return listOpenChannelsWithHttpInfo(token, channelUrls, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, apiToken);
    }
  }

  /**
   * List open channels
   * ## List open channels  This action retrieves a list of [open channels](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel). You can use various query parameters to determine the search scope and select what kind of information you want to receive about the queried channels.  [https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-open-channels#1-list-open-channels](https://sendbird.com/docs/chat/platform-api/v3/channel/listing-channels-in-an-application/list-open-channels#1-list-open-channels)
   * @return listOpenChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistOpenChannelsRequest listOpenChannels() throws ApiException {
    return new APIlistOpenChannelsRequest();
  }

private ApiResponse<Object> registerOperatorsWithHttpInfo(String channelUrl, String apiToken, RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest) throws ApiException {
    Object localVarPostBody = registerOperatorsToAGroupChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling registerOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/operators"
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

    return apiClient.invokeAPI("OpenChannelApi.registerOperators", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIregisterOperatorsRequest {
    private String channelUrl;
    private String apiToken;
    private RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest;

    private APIregisterOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIregisterOperatorsRequest
     */
    public APIregisterOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set registerOperatorsToAGroupChannelRequest
     * @param registerOperatorsToAGroupChannelRequest  (optional)
     * @return APIregisterOperatorsRequest
     */
    public APIregisterOperatorsRequest registerOperatorsToAGroupChannelRequest(RegisterOperatorsToAGroupChannelRequest registerOperatorsToAGroupChannelRequest) {
      this.registerOperatorsToAGroupChannelRequest = registerOperatorsToAGroupChannelRequest;
      return this;
    }

    /**
     * Execute registerOperators request
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
     * Execute registerOperators request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return registerOperatorsWithHttpInfo(channelUrl, apiToken, registerOperatorsToAGroupChannelRequest);
    }
  }

  /**
   * Register operators to an open channel
   * ## Register operators to an open channel  You can register one or more operators to an open channel using this API.  https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/register-operators-to-an-open-channel#1-register-operators-to-an-open-channel
   * @param channelUrl (Required)  (required)
   * @return registerOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIregisterOperatorsRequest registerOperators(String channelUrl) throws ApiException {
    return new APIregisterOperatorsRequest(channelUrl);
  }

private ApiResponse<Object> unregisterOperatorsWithHttpInfo(String channelUrl, String operatorIds, Boolean deleteAll, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling unregisterOperators");
    }
    
    // verify the required parameter 'operatorIds' is set
    if (operatorIds == null) {
      throw new ApiException(400, "Missing the required parameter 'operatorIds' when calling unregisterOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/operators"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operator_ids", operatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete_all", deleteAll));

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

    return apiClient.invokeAPI("OpenChannelApi.unregisterOperators", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIunregisterOperatorsRequest {
    private String channelUrl;
    private String operatorIds;
    private Boolean deleteAll;
    private String apiToken;

    private APIunregisterOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set operatorIds
     * @param operatorIds Specifies an array of one or more operator IDs to unregister from the channel. The operators in this array remain as participants of the channel after losing their operational roles. Urlencoding each operator ID is recommended. An example of a Urlencoded array would be ?operator_ids&#x3D;urlencoded_id_1,urlencoded_id_2. (required)
     * @return APIunregisterOperatorsRequest
     */
    public APIunregisterOperatorsRequest operatorIds(String operatorIds) {
      this.operatorIds = operatorIds;
      return this;
    }

    /**
     * Set deleteAll
     * @param deleteAll Determines whether to unregister all operators and leave them as the participants of the channel. When this is set to true, the operator_ids property isn&#39;t effective and doesn&#39;t need to be specified in the request. (Default: false) (optional)
     * @return APIunregisterOperatorsRequest
     */
    public APIunregisterOperatorsRequest deleteAll(Boolean deleteAll) {
      this.deleteAll = deleteAll;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIunregisterOperatorsRequest
     */
    public APIunregisterOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute unregisterOperators request
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
     * Execute unregisterOperators request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return unregisterOperatorsWithHttpInfo(channelUrl, operatorIds, deleteAll, apiToken);
    }
  }

  /**
   * Unregister operators from an open channel
   * ## Unregister operators from an open channel  You can unregister operators in an open channel but keep them in the channel as participants using this API.  https://sendbird.com/docs/chat/platform-api/v3/user/assigning-a-user-role/unregister-operators-from-an-open-channel#1-unregister-operators-from-an-open-channel  &#x60;channel_url&#x60;   Type: string   Description: Specifies the URL of the channel to cancel the registration of operators.
   * @param channelUrl (Required)  (required)
   * @return unregisterOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIunregisterOperatorsRequest unregisterOperators(String channelUrl) throws ApiException {
    return new APIunregisterOperatorsRequest(channelUrl);
  }

private ApiResponse<SendbirdOpenChannel> updateAnOpenChannelWithHttpInfo(String channelUrl, String apiToken, UpdateAnOpenChannelRequest updateAnOpenChannelRequest) throws ApiException {
    Object localVarPostBody = updateAnOpenChannelRequest;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling updateAnOpenChannel");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}"
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

    GenericType<SendbirdOpenChannel> localVarReturnType = new GenericType<SendbirdOpenChannel>() {};

    return apiClient.invokeAPI("OpenChannelApi.updateAnOpenChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateAnOpenChannelRequest {
    private String channelUrl;
    private String apiToken;
    private UpdateAnOpenChannelRequest updateAnOpenChannelRequest;

    private APIupdateAnOpenChannelRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateAnOpenChannelRequest
     */
    public APIupdateAnOpenChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateAnOpenChannelRequest
     * @param updateAnOpenChannelRequest  (optional)
     * @return APIupdateAnOpenChannelRequest
     */
    public APIupdateAnOpenChannelRequest updateAnOpenChannelRequest(UpdateAnOpenChannelRequest updateAnOpenChannelRequest) {
      this.updateAnOpenChannelRequest = updateAnOpenChannelRequest;
      return this;
    }

    /**
     * Execute updateAnOpenChannel request
     * @return SendbirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendbirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAnOpenChannel request with HTTP info returned
     * @return ApiResponse&lt;SendbirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendbirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return updateAnOpenChannelWithHttpInfo(channelUrl, apiToken, updateAnOpenChannelRequest);
    }
  }

  /**
   * Update an open channel
   * ## Update an open channel  You can update information about an open channel using this API. You can add a cover image to a channel to better identify the channel or specify a custom channel type for grouping channels by custom type. See [this page](https://sendbird.com/docs/chat/platform-api/v3/channel/channel-overview#2-channel-types-3-open-channel-vs-group-channel-vs-supergroup-channel) to learn more about channel types.  https://sendbird.com/docs/chat/platform-api/v3/channel/managing-a-channel/update-an-open-channel#1-update-an-open-channel
   * @param channelUrl (Required)  (required)
   * @return updateAnOpenChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAnOpenChannelRequest updateAnOpenChannel(String channelUrl) throws ApiException {
    return new APIupdateAnOpenChannelRequest(channelUrl);
  }
}
