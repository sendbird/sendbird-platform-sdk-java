package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ListReportsOnChannelByUrlResponse;
import org.openapitools.client.model.ListReportsOnMessageByIdResponse;
import org.openapitools.client.model.ListReportsOnUserByIdResponse;
import org.openapitools.client.model.ListReportsResponse;
import org.openapitools.client.model.ReportChannelByUrlData;
import org.openapitools.client.model.ReportChannelByUrlResponse;
import org.openapitools.client.model.ReportMessageByIdData;
import org.openapitools.client.model.ReportMessageByIdResponse;
import org.openapitools.client.model.ReportUserByIdData;
import org.openapitools.client.model.ReportUserByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class ReportApi {
  private ApiClient apiClient;

  public ReportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportApi(ApiClient apiClient) {
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


private ApiResponse<ListReportsResponse> listReportsWithHttpInfo(String apiToken, String token, Integer limit, Integer startTs, Integer endTs) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/report";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_ts", startTs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_ts", endTs));

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

    GenericType<ListReportsResponse> localVarReturnType = new GenericType<ListReportsResponse>() {};

    return apiClient.invokeAPI("ReportApi.listReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistReportsRequest {
    private String apiToken;
    private String token;
    private Integer limit;
    private Integer startTs;
    private Integer endTs;

    private APIlistReportsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistReportsRequest
     */
    public APIlistReportsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistReportsRequest
     */
    public APIlistReportsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistReportsRequest
     */
    public APIlistReportsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set startTs
     * @param startTs  (optional)
     * @return APIlistReportsRequest
     */
    public APIlistReportsRequest startTs(Integer startTs) {
      this.startTs = startTs;
      return this;
    }

    /**
     * Set endTs
     * @param endTs  (optional)
     * @return APIlistReportsRequest
     */
    public APIlistReportsRequest endTs(Integer endTs) {
      this.endTs = endTs;
      return this;
    }

    /**
     * Execute listReports request
     * @return ListReportsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListReportsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listReports request with HTTP info returned
     * @return ApiResponse&lt;ListReportsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListReportsResponse> executeWithHttpInfo() throws ApiException {
      return listReportsWithHttpInfo(apiToken, token, limit, startTs, endTs);
    }
  }

  /**
   * List reports
   * ## List reports  Retrieves a list of reports within an application regardless of object types.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports ----------------------------
   * @return listReportsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistReportsRequest listReports() throws ApiException {
    return new APIlistReportsRequest();
  }

private ApiResponse<ListReportsOnChannelByUrlResponse> listReportsOnChannelByUrlWithHttpInfo(String channelType, String channelUrl, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling listReportsOnChannelByUrl");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listReportsOnChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/report/{channel_type}/{channel_url}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
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

    GenericType<ListReportsOnChannelByUrlResponse> localVarReturnType = new GenericType<ListReportsOnChannelByUrlResponse>() {};

    return apiClient.invokeAPI("ReportApi.listReportsOnChannelByUrl", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistReportsOnChannelByUrlRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistReportsOnChannelByUrlRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistReportsOnChannelByUrlRequest
     */
    public APIlistReportsOnChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistReportsOnChannelByUrlRequest
     */
    public APIlistReportsOnChannelByUrlRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistReportsOnChannelByUrlRequest
     */
    public APIlistReportsOnChannelByUrlRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listReportsOnChannelByUrl request
     * @return ListReportsOnChannelByUrlResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListReportsOnChannelByUrlResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listReportsOnChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;ListReportsOnChannelByUrlResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListReportsOnChannelByUrlResponse> executeWithHttpInfo() throws ApiException {
      return listReportsOnChannelByUrlWithHttpInfo(channelType, channelUrl, apiToken, token, limit);
    }
  }

  /**
   * List reports on a channel
   * ## List reports on a channel  Retrieves a list of reports on a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-channel ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which is reported for offensive messages or inappropriate activities.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return listReportsOnChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistReportsOnChannelByUrlRequest listReportsOnChannelByUrl(String channelType, String channelUrl) throws ApiException {
    return new APIlistReportsOnChannelByUrlRequest(channelType, channelUrl);
  }

private ApiResponse<ListReportsOnMessageByIdResponse> listReportsOnMessageByIdWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling listReportsOnMessageById");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling listReportsOnMessageById");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling listReportsOnMessageById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/report/{channel_type}/{channel_url}/messages/{message_id}"
      .replaceAll("\\{" + "channel_type" + "\\}", apiClient.escapeString(channelType.toString()))
      .replaceAll("\\{" + "channel_url" + "\\}", apiClient.escapeString(channelUrl.toString()))
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    GenericType<ListReportsOnMessageByIdResponse> localVarReturnType = new GenericType<ListReportsOnMessageByIdResponse>() {};

    return apiClient.invokeAPI("ReportApi.listReportsOnMessageById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistReportsOnMessageByIdRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistReportsOnMessageByIdRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistReportsOnMessageByIdRequest
     */
    public APIlistReportsOnMessageByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistReportsOnMessageByIdRequest
     */
    public APIlistReportsOnMessageByIdRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistReportsOnMessageByIdRequest
     */
    public APIlistReportsOnMessageByIdRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listReportsOnMessageById request
     * @return ListReportsOnMessageByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListReportsOnMessageByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listReportsOnMessageById request with HTTP info returned
     * @return ApiResponse&lt;ListReportsOnMessageByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListReportsOnMessageByIdResponse> executeWithHttpInfo() throws ApiException {
      return listReportsOnMessageByIdWithHttpInfo(channelType, channelUrl, messageId, apiToken, token, limit);
    }
  }

  /**
   * List reports on a message
   * ## List reports on a message  Retrieves a list of reports on a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where the reported message is in.  &#x60;message_id&#x60;      Type: string      Description: Specifies the unique ID of the reported message.
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return listReportsOnMessageByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistReportsOnMessageByIdRequest listReportsOnMessageById(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIlistReportsOnMessageByIdRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<ListReportsOnUserByIdResponse> listReportsOnUserByIdWithHttpInfo(String offendingUserId, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'offendingUserId' is set
    if (offendingUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'offendingUserId' when calling listReportsOnUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/report/users/{offending_user_id}"
      .replaceAll("\\{" + "offending_user_id" + "\\}", apiClient.escapeString(offendingUserId.toString()));

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

    GenericType<ListReportsOnUserByIdResponse> localVarReturnType = new GenericType<ListReportsOnUserByIdResponse>() {};

    return apiClient.invokeAPI("ReportApi.listReportsOnUserById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistReportsOnUserByIdRequest {
    private String offendingUserId;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistReportsOnUserByIdRequest(String offendingUserId) {
      this.offendingUserId = offendingUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistReportsOnUserByIdRequest
     */
    public APIlistReportsOnUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistReportsOnUserByIdRequest
     */
    public APIlistReportsOnUserByIdRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistReportsOnUserByIdRequest
     */
    public APIlistReportsOnUserByIdRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listReportsOnUserById request
     * @return ListReportsOnUserByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListReportsOnUserByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listReportsOnUserById request with HTTP info returned
     * @return ApiResponse&lt;ListReportsOnUserByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListReportsOnUserByIdResponse> executeWithHttpInfo() throws ApiException {
      return listReportsOnUserByIdWithHttpInfo(offendingUserId, apiToken, token, limit);
    }
  }

  /**
   * List reports on a user
   * ## List reports on a user  Retrieves a list of reports on a user who sends an offensive message.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-user ----------------------------   &#x60;offending_user_id&#x60;      Type: string      Description: Specifies the unique ID of the user who has sent the message to report.
   * @param offendingUserId  (required)
   * @return listReportsOnUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistReportsOnUserByIdRequest listReportsOnUserById(String offendingUserId) throws ApiException {
    return new APIlistReportsOnUserByIdRequest(offendingUserId);
  }

private ApiResponse<ReportChannelByUrlResponse> reportChannelByUrlWithHttpInfo(String channelType, String channelUrl, String apiToken, ReportChannelByUrlData reportChannelByUrlData) throws ApiException {
    Object localVarPostBody = reportChannelByUrlData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling reportChannelByUrl");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling reportChannelByUrl");
    }
    
    // create path and map variables
    String localVarPath = "/v3/report/{channel_type}/{channel_url}"
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

    GenericType<ReportChannelByUrlResponse> localVarReturnType = new GenericType<ReportChannelByUrlResponse>() {};

    return apiClient.invokeAPI("ReportApi.reportChannelByUrl", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIreportChannelByUrlRequest {
    private String channelType;
    private String channelUrl;
    private String apiToken;
    private ReportChannelByUrlData reportChannelByUrlData;

    private APIreportChannelByUrlRequest(String channelType, String channelUrl) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIreportChannelByUrlRequest
     */
    public APIreportChannelByUrlRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set reportChannelByUrlData
     * @param reportChannelByUrlData  (optional)
     * @return APIreportChannelByUrlRequest
     */
    public APIreportChannelByUrlRequest reportChannelByUrlData(ReportChannelByUrlData reportChannelByUrlData) {
      this.reportChannelByUrlData = reportChannelByUrlData;
      return this;
    }

    /**
     * Execute reportChannelByUrl request
     * @return ReportChannelByUrlResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ReportChannelByUrlResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute reportChannelByUrl request with HTTP info returned
     * @return ApiResponse&lt;ReportChannelByUrlResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ReportChannelByUrlResponse> executeWithHttpInfo() throws ApiException {
      return reportChannelByUrlWithHttpInfo(channelType, channelUrl, apiToken, reportChannelByUrlData);
    }
  }

  /**
   * Report a channel
   * ## Report a channel  Reports a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-channel ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @return reportChannelByUrlRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIreportChannelByUrlRequest reportChannelByUrl(String channelType, String channelUrl) throws ApiException {
    return new APIreportChannelByUrlRequest(channelType, channelUrl);
  }

private ApiResponse<ReportMessageByIdResponse> reportMessageByIdWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken, ReportMessageByIdData reportMessageByIdData) throws ApiException {
    Object localVarPostBody = reportMessageByIdData;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling reportMessageById");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling reportMessageById");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling reportMessageById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/report/{channel_type}/{channel_url}/messages/{message_id}"
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

    GenericType<ReportMessageByIdResponse> localVarReturnType = new GenericType<ReportMessageByIdResponse>() {};

    return apiClient.invokeAPI("ReportApi.reportMessageById", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIreportMessageByIdRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;
    private ReportMessageByIdData reportMessageByIdData;

    private APIreportMessageByIdRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIreportMessageByIdRequest
     */
    public APIreportMessageByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set reportMessageByIdData
     * @param reportMessageByIdData  (optional)
     * @return APIreportMessageByIdRequest
     */
    public APIreportMessageByIdRequest reportMessageByIdData(ReportMessageByIdData reportMessageByIdData) {
      this.reportMessageByIdData = reportMessageByIdData;
      return this;
    }

    /**
     * Execute reportMessageById request
     * @return ReportMessageByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ReportMessageByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute reportMessageById request with HTTP info returned
     * @return ApiResponse&lt;ReportMessageByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ReportMessageByIdResponse> executeWithHttpInfo() throws ApiException {
      return reportMessageByIdWithHttpInfo(channelType, channelUrl, messageId, apiToken, reportMessageByIdData);
    }
  }

  /**
   * Report a message
   * ## Report a message  Reports a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return reportMessageByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIreportMessageByIdRequest reportMessageById(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIreportMessageByIdRequest(channelType, channelUrl, messageId);
  }

private ApiResponse<ReportUserByIdResponse> reportUserByIdWithHttpInfo(String offendingUserId, String apiToken, ReportUserByIdData reportUserByIdData) throws ApiException {
    Object localVarPostBody = reportUserByIdData;
    
    // verify the required parameter 'offendingUserId' is set
    if (offendingUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'offendingUserId' when calling reportUserById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/report/users/{offending_user_id}"
      .replaceAll("\\{" + "offending_user_id" + "\\}", apiClient.escapeString(offendingUserId.toString()));

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

    GenericType<ReportUserByIdResponse> localVarReturnType = new GenericType<ReportUserByIdResponse>() {};

    return apiClient.invokeAPI("ReportApi.reportUserById", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIreportUserByIdRequest {
    private String offendingUserId;
    private String apiToken;
    private ReportUserByIdData reportUserByIdData;

    private APIreportUserByIdRequest(String offendingUserId) {
      this.offendingUserId = offendingUserId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIreportUserByIdRequest
     */
    public APIreportUserByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set reportUserByIdData
     * @param reportUserByIdData  (optional)
     * @return APIreportUserByIdRequest
     */
    public APIreportUserByIdRequest reportUserByIdData(ReportUserByIdData reportUserByIdData) {
      this.reportUserByIdData = reportUserByIdData;
      return this;
    }

    /**
     * Execute reportUserById request
     * @return ReportUserByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ReportUserByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute reportUserById request with HTTP info returned
     * @return ApiResponse&lt;ReportUserByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ReportUserByIdResponse> executeWithHttpInfo() throws ApiException {
      return reportUserByIdWithHttpInfo(offendingUserId, apiToken, reportUserByIdData);
    }
  }

  /**
   * Report a user
   * ## Report a user  Reports a user who sends an offensive message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-user ----------------------------
   * @param offendingUserId  (required)
   * @return reportUserByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIreportUserByIdRequest reportUserById(String offendingUserId) throws ApiException {
    return new APIreportUserByIdRequest(offendingUserId);
  }

private ApiResponse<Object> viewModeratedMessageByIdWithHttpInfo(String channelType, String channelUrl, String messageId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelType' is set
    if (channelType == null) {
      throw new ApiException(400, "Missing the required parameter 'channelType' when calling viewModeratedMessageById");
    }
    
    // verify the required parameter 'channelUrl' is set
    if (channelUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'channelUrl' when calling viewModeratedMessageById");
    }
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling viewModeratedMessageById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/report/{channel_type}/{channel_url}/profanity_messages/{message_id}"
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

    return apiClient.invokeAPI("ReportApi.viewModeratedMessageById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewModeratedMessageByIdRequest {
    private String channelType;
    private String channelUrl;
    private String messageId;
    private String apiToken;

    private APIviewModeratedMessageByIdRequest(String channelType, String channelUrl, String messageId) {
      this.channelType = channelType;
      this.channelUrl = channelUrl;
      this.messageId = messageId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewModeratedMessageByIdRequest
     */
    public APIviewModeratedMessageByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewModeratedMessageById request
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
     * Execute viewModeratedMessageById request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return viewModeratedMessageByIdWithHttpInfo(channelType, channelUrl, messageId, apiToken);
    }
  }

  /**
   * View a moderated message
   * ## View a moderated message  Retrieves information on a message that has been moderated by the [profanity filter](https://sendbird.com/docs/chat/v3/platform-api/guides/filter-and-moderation#2-profanity-filter).  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-view-a-moderated-message ----------------------------
   * @param channelType  (required)
   * @param channelUrl  (required)
   * @param messageId  (required)
   * @return viewModeratedMessageByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewModeratedMessageByIdRequest viewModeratedMessageById(String channelType, String channelUrl, String messageId) throws ApiException {
    return new APIviewModeratedMessageByIdRequest(channelType, channelUrl, messageId);
  }
}
