package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.GetDetailedOpenRateOfAnnouncementByIdResponse;
import org.openapitools.client.model.GetDetailedOpenStatusOfAnnouncementByIdResponse;
import org.openapitools.client.model.RetrieveAdvancedAnalyticsMetricsResponse;
import org.openapitools.client.model.ViewNumberOfConcurrentConnectionsResponse;
import org.openapitools.client.model.ViewNumberOfDailyActiveUsersResponse;
import org.openapitools.client.model.ViewNumberOfMonthlyActiveUsersResponse;
import org.openapitools.client.model.ViewNumberOfPeakConnectionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class StatisticsApi {
  private ApiClient apiClient;

  public StatisticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatisticsApi(ApiClient apiClient) {
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


private ApiResponse<GetDetailedOpenRateOfAnnouncementByIdResponse> getDetailedOpenRateOfAnnouncementByIdWithHttpInfo(String uniqueId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueId' is set
    if (uniqueId == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueId' when calling getDetailedOpenRateOfAnnouncementById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcement_open_rate/{unique_id}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetDetailedOpenRateOfAnnouncementByIdResponse> localVarReturnType = new GenericType<GetDetailedOpenRateOfAnnouncementByIdResponse>() {};

    return apiClient.invokeAPI("StatisticsApi.getDetailedOpenRateOfAnnouncementById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetDetailedOpenRateOfAnnouncementByIdRequest {
    private String uniqueId;
    private String apiToken;

    private APIgetDetailedOpenRateOfAnnouncementByIdRequest(String uniqueId) {
      this.uniqueId = uniqueId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetDetailedOpenRateOfAnnouncementByIdRequest
     */
    public APIgetDetailedOpenRateOfAnnouncementByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getDetailedOpenRateOfAnnouncementById request
     * @return GetDetailedOpenRateOfAnnouncementByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetDetailedOpenRateOfAnnouncementByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDetailedOpenRateOfAnnouncementById request with HTTP info returned
     * @return ApiResponse&lt;GetDetailedOpenRateOfAnnouncementByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetDetailedOpenRateOfAnnouncementByIdResponse> executeWithHttpInfo() throws ApiException {
      return getDetailedOpenRateOfAnnouncementByIdWithHttpInfo(uniqueId, apiToken);
    }
  }

  /**
   * Get detailed open rate of an announcement
   * ## Get detailed open rate of an announcement  Retrieves the detailed open rate information of an announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement ----------------------------   &#x60;unique_id&#x60;      Type: string      Description: Specifies the unique ID of the announcement to get its open rate.
   * @param uniqueId  (required)
   * @return getDetailedOpenRateOfAnnouncementByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetDetailedOpenRateOfAnnouncementByIdRequest getDetailedOpenRateOfAnnouncementById(String uniqueId) throws ApiException {
    return new APIgetDetailedOpenRateOfAnnouncementByIdRequest(uniqueId);
  }

private ApiResponse<GetDetailedOpenStatusOfAnnouncementByIdResponse> getDetailedOpenStatusOfAnnouncementByIdWithHttpInfo(String uniqueId, String apiToken, Integer limit, String next, List<String> uniqueIds, List<String> channelUrls, Boolean hasOpened) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueId' is set
    if (uniqueId == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueId' when calling getDetailedOpenStatusOfAnnouncementById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcement_open_status/{unique_id}"
      .replaceAll("\\{" + "unique_id" + "\\}", apiClient.escapeString(uniqueId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "unique_ids", uniqueIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "channel_urls", channelUrls));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "has_opened", hasOpened));

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

    GenericType<GetDetailedOpenStatusOfAnnouncementByIdResponse> localVarReturnType = new GenericType<GetDetailedOpenStatusOfAnnouncementByIdResponse>() {};

    return apiClient.invokeAPI("StatisticsApi.getDetailedOpenStatusOfAnnouncementById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetDetailedOpenStatusOfAnnouncementByIdRequest {
    private String uniqueId;
    private String apiToken;
    private Integer limit;
    private String next;
    private List<String> uniqueIds;
    private List<String> channelUrls;
    private Boolean hasOpened;

    private APIgetDetailedOpenStatusOfAnnouncementByIdRequest(String uniqueId) {
      this.uniqueId = uniqueId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetDetailedOpenStatusOfAnnouncementByIdRequest
     */
    public APIgetDetailedOpenStatusOfAnnouncementByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIgetDetailedOpenStatusOfAnnouncementByIdRequest
     */
    public APIgetDetailedOpenStatusOfAnnouncementByIdRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set next
     * @param next  (optional)
     * @return APIgetDetailedOpenStatusOfAnnouncementByIdRequest
     */
    public APIgetDetailedOpenStatusOfAnnouncementByIdRequest next(String next) {
      this.next = next;
      return this;
    }

    /**
     * Set uniqueIds
     * @param uniqueIds  (optional)
     * @return APIgetDetailedOpenStatusOfAnnouncementByIdRequest
     */
    public APIgetDetailedOpenStatusOfAnnouncementByIdRequest uniqueIds(List<String> uniqueIds) {
      this.uniqueIds = uniqueIds;
      return this;
    }

    /**
     * Set channelUrls
     * @param channelUrls  (optional)
     * @return APIgetDetailedOpenStatusOfAnnouncementByIdRequest
     */
    public APIgetDetailedOpenStatusOfAnnouncementByIdRequest channelUrls(List<String> channelUrls) {
      this.channelUrls = channelUrls;
      return this;
    }

    /**
     * Set hasOpened
     * @param hasOpened  (optional)
     * @return APIgetDetailedOpenStatusOfAnnouncementByIdRequest
     */
    public APIgetDetailedOpenStatusOfAnnouncementByIdRequest hasOpened(Boolean hasOpened) {
      this.hasOpened = hasOpened;
      return this;
    }

    /**
     * Execute getDetailedOpenStatusOfAnnouncementById request
     * @return GetDetailedOpenStatusOfAnnouncementByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetDetailedOpenStatusOfAnnouncementByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDetailedOpenStatusOfAnnouncementById request with HTTP info returned
     * @return ApiResponse&lt;GetDetailedOpenStatusOfAnnouncementByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetDetailedOpenStatusOfAnnouncementByIdResponse> executeWithHttpInfo() throws ApiException {
      return getDetailedOpenStatusOfAnnouncementByIdWithHttpInfo(uniqueId, apiToken, limit, next, uniqueIds, channelUrls, hasOpened);
    }
  }

  /**
   * Get detailed open status of an announcement
   * ## Get detailed open status of an announcement  Retrieves the detailed open status information of a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-status-of-an-announcement ----------------------------
   * @param uniqueId  (required)
   * @return getDetailedOpenStatusOfAnnouncementByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetDetailedOpenStatusOfAnnouncementByIdRequest getDetailedOpenStatusOfAnnouncementById(String uniqueId) throws ApiException {
    return new APIgetDetailedOpenStatusOfAnnouncementByIdRequest(uniqueId);
  }

private ApiResponse<RetrieveAdvancedAnalyticsMetricsResponse> retrieveAdvancedAnalyticsMetricsWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/statistics/metric";

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

    GenericType<RetrieveAdvancedAnalyticsMetricsResponse> localVarReturnType = new GenericType<RetrieveAdvancedAnalyticsMetricsResponse>() {};

    return apiClient.invokeAPI("StatisticsApi.retrieveAdvancedAnalyticsMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrieveAdvancedAnalyticsMetricsRequest {
    private String apiToken;

    private APIretrieveAdvancedAnalyticsMetricsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIretrieveAdvancedAnalyticsMetricsRequest
     */
    public APIretrieveAdvancedAnalyticsMetricsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute retrieveAdvancedAnalyticsMetrics request
     * @return RetrieveAdvancedAnalyticsMetricsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RetrieveAdvancedAnalyticsMetricsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrieveAdvancedAnalyticsMetrics request with HTTP info returned
     * @return ApiResponse&lt;RetrieveAdvancedAnalyticsMetricsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RetrieveAdvancedAnalyticsMetricsResponse> executeWithHttpInfo() throws ApiException {
      return retrieveAdvancedAnalyticsMetricsWithHttpInfo(apiToken);
    }
  }

  /**
   * Retrieve Advanced analytics metrics
   * ## Retrieve Advanced analytics metrics  Retrieves Advanced analytics metrics based on the specified parameters. You can retrieve either daily or monthly metrics using the time_dimension parameter.  &gt;__Note__: Daily metrics are calculated and updated every three hours, starting at 1 a.m. in UTC. Meanwhile, monthly metrics are calculated after the last day of the month.  https://sendbird.com/docs/chat/v3/platform-api/guides/advanced-analytics#2-retrieve-advanced-analytics-metrics ----------------------------
   * @return retrieveAdvancedAnalyticsMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrieveAdvancedAnalyticsMetricsRequest retrieveAdvancedAnalyticsMetrics() throws ApiException {
    return new APIretrieveAdvancedAnalyticsMetricsRequest();
  }

private ApiResponse<ViewNumberOfConcurrentConnectionsResponse> viewNumberOfConcurrentConnectionsWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/applications/ccu";

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

    GenericType<ViewNumberOfConcurrentConnectionsResponse> localVarReturnType = new GenericType<ViewNumberOfConcurrentConnectionsResponse>() {};

    return apiClient.invokeAPI("StatisticsApi.viewNumberOfConcurrentConnections", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewNumberOfConcurrentConnectionsRequest {
    private String apiToken;

    private APIviewNumberOfConcurrentConnectionsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfConcurrentConnectionsRequest
     */
    public APIviewNumberOfConcurrentConnectionsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewNumberOfConcurrentConnections request
     * @return ViewNumberOfConcurrentConnectionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfConcurrentConnectionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfConcurrentConnections request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfConcurrentConnectionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfConcurrentConnectionsResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfConcurrentConnectionsWithHttpInfo(apiToken);
    }
  }

  /**
   * View number of concurrent connections
   * ## View number of concurrent connections  Retrieves the number of devices and opened browser tabs which are currently connected to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-concurrent-connections
   * @return viewNumberOfConcurrentConnectionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfConcurrentConnectionsRequest viewNumberOfConcurrentConnections() throws ApiException {
    return new APIviewNumberOfConcurrentConnectionsRequest();
  }

private ApiResponse<ViewNumberOfDailyActiveUsersResponse> viewNumberOfDailyActiveUsersWithHttpInfo(String apiToken, String date) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/applications/dau";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

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

    GenericType<ViewNumberOfDailyActiveUsersResponse> localVarReturnType = new GenericType<ViewNumberOfDailyActiveUsersResponse>() {};

    return apiClient.invokeAPI("StatisticsApi.viewNumberOfDailyActiveUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewNumberOfDailyActiveUsersRequest {
    private String apiToken;
    private String date;

    private APIviewNumberOfDailyActiveUsersRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfDailyActiveUsersRequest
     */
    public APIviewNumberOfDailyActiveUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set date
     * @param date  (optional)
     * @return APIviewNumberOfDailyActiveUsersRequest
     */
    public APIviewNumberOfDailyActiveUsersRequest date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Execute viewNumberOfDailyActiveUsers request
     * @return ViewNumberOfDailyActiveUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfDailyActiveUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfDailyActiveUsers request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfDailyActiveUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfDailyActiveUsersResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfDailyActiveUsersWithHttpInfo(apiToken, date);
    }
  }

  /**
   * View number of daily active users
   * ## View number of daily active users  Retrieves the number of daily active users of the application (DAU).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-daily-active-users ----------------------------
   * @return viewNumberOfDailyActiveUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfDailyActiveUsersRequest viewNumberOfDailyActiveUsers() throws ApiException {
    return new APIviewNumberOfDailyActiveUsersRequest();
  }

private ApiResponse<ViewNumberOfMonthlyActiveUsersResponse> viewNumberOfMonthlyActiveUsersWithHttpInfo(String apiToken, String date) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/applications/mau";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));

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

    GenericType<ViewNumberOfMonthlyActiveUsersResponse> localVarReturnType = new GenericType<ViewNumberOfMonthlyActiveUsersResponse>() {};

    return apiClient.invokeAPI("StatisticsApi.viewNumberOfMonthlyActiveUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewNumberOfMonthlyActiveUsersRequest {
    private String apiToken;
    private String date;

    private APIviewNumberOfMonthlyActiveUsersRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfMonthlyActiveUsersRequest
     */
    public APIviewNumberOfMonthlyActiveUsersRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set date
     * @param date  (optional)
     * @return APIviewNumberOfMonthlyActiveUsersRequest
     */
    public APIviewNumberOfMonthlyActiveUsersRequest date(String date) {
      this.date = date;
      return this;
    }

    /**
     * Execute viewNumberOfMonthlyActiveUsers request
     * @return ViewNumberOfMonthlyActiveUsersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfMonthlyActiveUsersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfMonthlyActiveUsers request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfMonthlyActiveUsersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfMonthlyActiveUsersResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfMonthlyActiveUsersWithHttpInfo(apiToken, date);
    }
  }

  /**
   * View number of monthly active users
   * ## View number of monthly active users  Retrieves the number of monthly active users of the application (MAU).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-monthly-active-users ----------------------------
   * @return viewNumberOfMonthlyActiveUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfMonthlyActiveUsersRequest viewNumberOfMonthlyActiveUsers() throws ApiException {
    return new APIviewNumberOfMonthlyActiveUsersRequest();
  }

private ApiResponse<ViewNumberOfPeakConnectionsResponse> viewNumberOfPeakConnectionsWithHttpInfo(String timeDimension, Integer startYear, Integer startMonth, Integer endYear, Integer endMonth, String apiToken, Integer startDay, Integer endDay) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timeDimension' is set
    if (timeDimension == null) {
      throw new ApiException(400, "Missing the required parameter 'timeDimension' when calling viewNumberOfPeakConnections");
    }
    
    // verify the required parameter 'startYear' is set
    if (startYear == null) {
      throw new ApiException(400, "Missing the required parameter 'startYear' when calling viewNumberOfPeakConnections");
    }
    
    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling viewNumberOfPeakConnections");
    }
    
    // verify the required parameter 'endYear' is set
    if (endYear == null) {
      throw new ApiException(400, "Missing the required parameter 'endYear' when calling viewNumberOfPeakConnections");
    }
    
    // verify the required parameter 'endMonth' is set
    if (endMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'endMonth' when calling viewNumberOfPeakConnections");
    }
    
    // create path and map variables
    String localVarPath = "/v3/applications/peak_connections";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time_dimension", timeDimension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_year", startYear));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_year", endYear));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_day", startDay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_day", endDay));

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

    GenericType<ViewNumberOfPeakConnectionsResponse> localVarReturnType = new GenericType<ViewNumberOfPeakConnectionsResponse>() {};

    return apiClient.invokeAPI("StatisticsApi.viewNumberOfPeakConnections", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewNumberOfPeakConnectionsRequest {
    private String timeDimension;
    private Integer startYear;
    private Integer startMonth;
    private Integer endYear;
    private Integer endMonth;
    private String apiToken;
    private Integer startDay;
    private Integer endDay;

    private APIviewNumberOfPeakConnectionsRequest() {
    }

    /**
     * Set timeDimension
     * @param timeDimension  (required)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest timeDimension(String timeDimension) {
      this.timeDimension = timeDimension;
      return this;
    }

    /**
     * Set startYear
     * @param startYear  (required)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest startYear(Integer startYear) {
      this.startYear = startYear;
      return this;
    }

    /**
     * Set startMonth
     * @param startMonth  (required)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest startMonth(Integer startMonth) {
      this.startMonth = startMonth;
      return this;
    }

    /**
     * Set endYear
     * @param endYear  (required)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest endYear(Integer endYear) {
      this.endYear = endYear;
      return this;
    }

    /**
     * Set endMonth
     * @param endMonth  (required)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest endMonth(Integer endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set startDay
     * @param startDay  (optional)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest startDay(Integer startDay) {
      this.startDay = startDay;
      return this;
    }

    /**
     * Set endDay
     * @param endDay  (optional)
     * @return APIviewNumberOfPeakConnectionsRequest
     */
    public APIviewNumberOfPeakConnectionsRequest endDay(Integer endDay) {
      this.endDay = endDay;
      return this;
    }

    /**
     * Execute viewNumberOfPeakConnections request
     * @return ViewNumberOfPeakConnectionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewNumberOfPeakConnectionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewNumberOfPeakConnections request with HTTP info returned
     * @return ApiResponse&lt;ViewNumberOfPeakConnectionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewNumberOfPeakConnectionsResponse> executeWithHttpInfo() throws ApiException {
      return viewNumberOfPeakConnectionsWithHttpInfo(timeDimension, startYear, startMonth, endYear, endMonth, apiToken, startDay, endDay);
    }
  }

  /**
   * View number of peak connections
   * ## View number of peak connections  Retrieves the number of concurrently connected devices to Sendbird server during the requested time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-peak-connections ----------------------------
   * @return viewNumberOfPeakConnectionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfPeakConnectionsRequest viewNumberOfPeakConnections() throws ApiException {
    return new APIviewNumberOfPeakConnectionsRequest();
  }
}
