package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.OcCreateChannelData;
import org.openapitools.client.model.OcDeleteChannelByUrl200Response;
import org.openapitools.client.model.OcListChannelsResponse;
import org.openapitools.client.model.OcListOperatorsResponse;
import org.openapitools.client.model.OcListParticipantsResponse;
import org.openapitools.client.model.OcRegisterOperatorsData;
import org.openapitools.client.model.OcUpdateChannelByUrlData;
import org.openapitools.client.model.SendBirdOpenChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
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


private ApiResponse<Void> ocCancelTheRegistrationOfOperatorsWithHttpInfo(String channelUrl, List<String> operatorIds, String apiToken, Boolean deleteAll) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocCancelTheRegistrationOfOperators");
    }
    
    // verify the required parameter 'operatorIds' is set
    if (operatorIds == null) {
      throw new ApiException(400, "Missing the required parameter 'operatorIds' when calling ocCancelTheRegistrationOfOperators");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/operators"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "operator_ids", operatorIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete_all", deleteAll));

    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("OpenChannelApi.ocCancelTheRegistrationOfOperators", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIocCancelTheRegistrationOfOperatorsRequest {
    private String channelUrl;
    private List<String> operatorIds;
    private String apiToken;
    private Boolean deleteAll;

    private APIocCancelTheRegistrationOfOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set operatorIds
     * @param operatorIds  (required)
     * @return APIocCancelTheRegistrationOfOperatorsRequest
     */
    public APIocCancelTheRegistrationOfOperatorsRequest operatorIds(List<String> operatorIds) {
      this.operatorIds = operatorIds;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocCancelTheRegistrationOfOperatorsRequest
     */
    public APIocCancelTheRegistrationOfOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set deleteAll
     * @param deleteAll  (optional)
     * @return APIocCancelTheRegistrationOfOperatorsRequest
     */
    public APIocCancelTheRegistrationOfOperatorsRequest deleteAll(Boolean deleteAll) {
      this.deleteAll = deleteAll;
      return this;
    }

    /**
     * Execute ocCancelTheRegistrationOfOperators request
     
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
     * Execute ocCancelTheRegistrationOfOperators request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return ocCancelTheRegistrationOfOperatorsWithHttpInfo(channelUrl, operatorIds, apiToken, deleteAll);
    }
  }

  /**
   * Cancel the registration of operators
   * ## Cancel the registration of operators  Cancels the registration of operators from an open channel but leave them as participants.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-cancel-the-registration-of-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to cancel the registration of operators.
   * @param channelUrl  (required)
   * @return ocCancelTheRegistrationOfOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocCancelTheRegistrationOfOperatorsRequest ocCancelTheRegistrationOfOperators(String channelUrl) throws ApiException {
    return new APIocCancelTheRegistrationOfOperatorsRequest(channelUrl);
  }

private ApiResponse<SendBirdOpenChannel> ocCreateChannelWithHttpInfo(String apiToken, OcCreateChannelData ocCreateChannelData) throws ApiException {
    Object localVarPostBody = ocCreateChannelData;
    
    // create path and map variables
    String localVarPath = "/v3/open_channels";

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

    GenericType<SendBirdOpenChannel> localVarReturnType = new GenericType<SendBirdOpenChannel>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocCreateChannel", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocCreateChannelRequest {
    private String apiToken;
    private OcCreateChannelData ocCreateChannelData;

    private APIocCreateChannelRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocCreateChannelRequest
     */
    public APIocCreateChannelRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set ocCreateChannelData
     * @param ocCreateChannelData  (optional)
     * @return APIocCreateChannelRequest
     */
    public APIocCreateChannelRequest ocCreateChannelData(OcCreateChannelData ocCreateChannelData) {
      this.ocCreateChannelData = ocCreateChannelData;
      return this;
    }

    /**
     * Execute ocCreateChannel request
     * @return SendBirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocCreateChannel request with HTTP info returned
     * @return ApiResponse&lt;SendBirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return ocCreateChannelWithHttpInfo(apiToken, ocCreateChannelData);
    }
  }

  /**
   * Create a channel
   * ## Create a channel  Creates an open channel.  &gt;__Note__: Classic open channels created before the deprecation date of March 2021 will maintain their original form and functions. However, new applications created after December 15, 2020, will be able to create dynamic partitioning open channels only.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel
   * @return ocCreateChannelRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocCreateChannelRequest ocCreateChannel() throws ApiException {
    return new APIocCreateChannelRequest();
  }

private ApiResponse<OcDeleteChannelByUrl200Response> ocDeleteChannelByUrlWithHttpInfo(String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocDeleteChannelByUrl");
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
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocDeleteChannelByUrl", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocDeleteChannelByUrlRequest {
    private String channelUrl;
    private String apiToken;

    private APIocDeleteChannelByUrlRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocDeleteChannelByUrlRequest
     */
    public APIocDeleteChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute ocDeleteChannelByUrl request
     * @return OcDeleteChannelByUrl200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcDeleteChannelByUrl200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocDeleteChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return ocDeleteChannelByUrlWithHttpInfo(channelUrl, apiToken);
    }
  }

  /**
   * Delete a channel
   * ## Delete a channel  Deletes an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-delete-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return ocDeleteChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocDeleteChannelByUrlRequest ocDeleteChannelByUrl(String channelUrl) throws ApiException {
    return new APIocDeleteChannelByUrlRequest(channelUrl);
  }

private ApiResponse<OcListChannelsResponse> ocListChannelsWithHttpInfo(String apiToken, String token, Integer limit, String customTypes, String nameContains, String urlContains, Boolean showFrozen, Boolean showMetadata, String customType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/open_channels";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_types", customTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name_contains", nameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url_contains", urlContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_frozen", showFrozen));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_metadata", showMetadata));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_type", customType));

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

    GenericType<OcListChannelsResponse> localVarReturnType = new GenericType<OcListChannelsResponse>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocListChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocListChannelsRequest {
    private String apiToken;
    private String token;
    private Integer limit;
    private String customTypes;
    private String nameContains;
    private String urlContains;
    private Boolean showFrozen;
    private Boolean showMetadata;
    private String customType;

    private APIocListChannelsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set customTypes
     * @param customTypes  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest customTypes(String customTypes) {
      this.customTypes = customTypes;
      return this;
    }

    /**
     * Set nameContains
     * @param nameContains  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest nameContains(String nameContains) {
      this.nameContains = nameContains;
      return this;
    }

    /**
     * Set urlContains
     * @param urlContains  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest urlContains(String urlContains) {
      this.urlContains = urlContains;
      return this;
    }

    /**
     * Set showFrozen
     * @param showFrozen  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest showFrozen(Boolean showFrozen) {
      this.showFrozen = showFrozen;
      return this;
    }

    /**
     * Set showMetadata
     * @param showMetadata  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest showMetadata(Boolean showMetadata) {
      this.showMetadata = showMetadata;
      return this;
    }

    /**
     * Set customType
     * @param customType  (optional)
     * @return APIocListChannelsRequest
     */
    public APIocListChannelsRequest customType(String customType) {
      this.customType = customType;
      return this;
    }

    /**
     * Execute ocListChannels request
     * @return OcListChannelsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcListChannelsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocListChannels request with HTTP info returned
     * @return ApiResponse&lt;OcListChannelsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcListChannelsResponse> executeWithHttpInfo() throws ApiException {
      return ocListChannelsWithHttpInfo(apiToken, token, limit, customTypes, nameContains, urlContains, showFrozen, showMetadata, customType);
    }
  }

  /**
   * List channels
   * ## List channels  Retrieves a list of open channels. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-channels ----------------------------
   * @return ocListChannelsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocListChannelsRequest ocListChannels() throws ApiException {
    return new APIocListChannelsRequest();
  }

private ApiResponse<OcListOperatorsResponse> ocListOperatorsWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocListOperators");
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
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OcListOperatorsResponse> localVarReturnType = new GenericType<OcListOperatorsResponse>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocListOperators", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocListOperatorsRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIocListOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocListOperatorsRequest
     */
    public APIocListOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIocListOperatorsRequest
     */
    public APIocListOperatorsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIocListOperatorsRequest
     */
    public APIocListOperatorsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute ocListOperators request
     * @return OcListOperatorsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcListOperatorsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocListOperators request with HTTP info returned
     * @return ApiResponse&lt;OcListOperatorsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcListOperatorsResponse> executeWithHttpInfo() throws ApiException {
      return ocListOperatorsWithHttpInfo(channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List operators
   * ## List operators  Retrieves a list of operators of an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-operators ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of operators.
   * @param channelUrl  (required)
   * @return ocListOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocListOperatorsRequest ocListOperators(String channelUrl) throws ApiException {
    return new APIocListOperatorsRequest(channelUrl);
  }

private ApiResponse<OcListParticipantsResponse> ocListParticipantsWithHttpInfo(String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocListParticipants");
    }
    
    // create path and map variables
    String localVarPath = "/v3/open_channels/{channel_url}/participants"
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()));

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

    GenericType<OcListParticipantsResponse> localVarReturnType = new GenericType<OcListParticipantsResponse>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocListParticipants", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocListParticipantsRequest {
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIocListParticipantsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocListParticipantsRequest
     */
    public APIocListParticipantsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIocListParticipantsRequest
     */
    public APIocListParticipantsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIocListParticipantsRequest
     */
    public APIocListParticipantsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute ocListParticipants request
     * @return OcListParticipantsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcListParticipantsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocListParticipants request with HTTP info returned
     * @return ApiResponse&lt;OcListParticipantsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcListParticipantsResponse> executeWithHttpInfo() throws ApiException {
      return ocListParticipantsWithHttpInfo(channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List participants
   * ## List participants  Retrieves a list of the participants of an open channel. A participant refers to a user who has entered the open channel and is currently online.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-participants ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of participants in.
   * @param channelUrl  (required)
   * @return ocListParticipantsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocListParticipantsRequest ocListParticipants(String channelUrl) throws ApiException {
    return new APIocListParticipantsRequest(channelUrl);
  }

private ApiResponse<OcDeleteChannelByUrl200Response> ocRegisterOperatorsWithHttpInfo(String channelUrl, String apiToken, OcRegisterOperatorsData ocRegisterOperatorsData) throws ApiException {
    Object localVarPostBody = ocRegisterOperatorsData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocRegisterOperators");
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

    GenericType<OcDeleteChannelByUrl200Response> localVarReturnType = new GenericType<OcDeleteChannelByUrl200Response>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocRegisterOperators", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocRegisterOperatorsRequest {
    private String channelUrl;
    private String apiToken;
    private OcRegisterOperatorsData ocRegisterOperatorsData;

    private APIocRegisterOperatorsRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocRegisterOperatorsRequest
     */
    public APIocRegisterOperatorsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set ocRegisterOperatorsData
     * @param ocRegisterOperatorsData  (optional)
     * @return APIocRegisterOperatorsRequest
     */
    public APIocRegisterOperatorsRequest ocRegisterOperatorsData(OcRegisterOperatorsData ocRegisterOperatorsData) {
      this.ocRegisterOperatorsData = ocRegisterOperatorsData;
      return this;
    }

    /**
     * Execute ocRegisterOperators request
     * @return OcDeleteChannelByUrl200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public OcDeleteChannelByUrl200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocRegisterOperators request with HTTP info returned
     * @return ApiResponse&lt;OcDeleteChannelByUrl200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<OcDeleteChannelByUrl200Response> executeWithHttpInfo() throws ApiException {
      return ocRegisterOperatorsWithHttpInfo(channelUrl, apiToken, ocRegisterOperatorsData);
    }
  }

  /**
   * Register operators
   * ## Register operators  Registers one or more operators to an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-register-operators ----------------------------
   * @param channelUrl  (required)
   * @return ocRegisterOperatorsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocRegisterOperatorsRequest ocRegisterOperators(String channelUrl) throws ApiException {
    return new APIocRegisterOperatorsRequest(channelUrl);
  }

private ApiResponse<SendBirdOpenChannel> ocUpdateChannelByUrlWithHttpInfo(String channelUrl, String apiToken, OcUpdateChannelByUrlData ocUpdateChannelByUrlData) throws ApiException {
    Object localVarPostBody = ocUpdateChannelByUrlData;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocUpdateChannelByUrl");
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

    GenericType<SendBirdOpenChannel> localVarReturnType = new GenericType<SendBirdOpenChannel>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocUpdateChannelByUrl", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocUpdateChannelByUrlRequest {
    private String channelUrl;
    private String apiToken;
    private OcUpdateChannelByUrlData ocUpdateChannelByUrlData;

    private APIocUpdateChannelByUrlRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocUpdateChannelByUrlRequest
     */
    public APIocUpdateChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set ocUpdateChannelByUrlData
     * @param ocUpdateChannelByUrlData  (optional)
     * @return APIocUpdateChannelByUrlRequest
     */
    public APIocUpdateChannelByUrlRequest ocUpdateChannelByUrlData(OcUpdateChannelByUrlData ocUpdateChannelByUrlData) {
      this.ocUpdateChannelByUrlData = ocUpdateChannelByUrlData;
      return this;
    }

    /**
     * Execute ocUpdateChannelByUrl request
     * @return SendBirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocUpdateChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;SendBirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return ocUpdateChannelByUrlWithHttpInfo(channelUrl, apiToken, ocUpdateChannelByUrlData);
    }
  }

  /**
   * Update a channel
   * ## Update a channel  Updates information on an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return ocUpdateChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocUpdateChannelByUrlRequest ocUpdateChannelByUrl(String channelUrl) throws ApiException {
    return new APIocUpdateChannelByUrlRequest(channelUrl);
  }

private ApiResponse<SendBirdOpenChannel> ocViewChannelByUrlWithHttpInfo(String channelUrl, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling ocViewChannelByUrl");
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
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SendBirdOpenChannel> localVarReturnType = new GenericType<SendBirdOpenChannel>() {};

    return apiClient.invokeAPI("OpenChannelApi.ocViewChannelByUrl", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIocViewChannelByUrlRequest {
    private String channelUrl;
    private String apiToken;

    private APIocViewChannelByUrlRequest(String channelUrl) {
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIocViewChannelByUrlRequest
     */
    public APIocViewChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute ocViewChannelByUrl request
     * @return SendBirdOpenChannel
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdOpenChannel execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute ocViewChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;SendBirdOpenChannel&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdOpenChannel> executeWithHttpInfo() throws ApiException {
      return ocViewChannelByUrlWithHttpInfo(channelUrl, apiToken);
    }
  }

  /**
   * View a channel
   * ## View a channel  Retrieves information on a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-channel ----------------------------
   * @param channelUrl  (required)
   * @return ocViewChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIocViewChannelByUrlRequest ocViewChannelByUrl(String channelUrl) throws ApiException {
    return new APIocViewChannelByUrlRequest(channelUrl);
  }
}
