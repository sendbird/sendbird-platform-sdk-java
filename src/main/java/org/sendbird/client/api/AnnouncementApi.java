package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.GetDetailedOpenRateOfAnnouncementGroupResponse;
import org.openapitools.client.model.GetStatisticsDailyResponse;
import org.openapitools.client.model.GetStatisticsMonthlyResponse;
import org.openapitools.client.model.GetStatisticsResponse;
import org.openapitools.client.model.ListAnnouncementGroupsResponse;
import org.openapitools.client.model.ScheduleAnnouncementData;
import org.openapitools.client.model.ScheduleAnnouncementResponse;
import org.openapitools.client.model.UpdateAnnouncementByIdData;
import org.openapitools.client.model.UpdateAnnouncementByIdResponse;
import org.openapitools.client.model.ViewAnnouncementByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-21T13:07:19.585435+09:00[Asia/Seoul]")
public class AnnouncementApi {
  private ApiClient apiClient;

  public AnnouncementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnnouncementApi(ApiClient apiClient) {
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


private ApiResponse<GetDetailedOpenRateOfAnnouncementGroupResponse> getDetailedOpenRateOfAnnouncementGroupWithHttpInfo(String announcementGroup, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'announcementGroup' is set
    if (announcementGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'announcementGroup' when calling getDetailedOpenRateOfAnnouncementGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v3/announcement_open_rate_by_group/{announcement_group}"
      .replaceAll("\\{" + "announcement_group" + "\\}", apiClient.escapeString(announcementGroup.toString()));

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

    GenericType<GetDetailedOpenRateOfAnnouncementGroupResponse> localVarReturnType = new GenericType<GetDetailedOpenRateOfAnnouncementGroupResponse>() {};

    return apiClient.invokeAPI("AnnouncementApi.getDetailedOpenRateOfAnnouncementGroup", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetDetailedOpenRateOfAnnouncementGroupRequest {
    private String announcementGroup;
    private String apiToken;

    private APIgetDetailedOpenRateOfAnnouncementGroupRequest(String announcementGroup) {
      this.announcementGroup = announcementGroup;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetDetailedOpenRateOfAnnouncementGroupRequest
     */
    public APIgetDetailedOpenRateOfAnnouncementGroupRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getDetailedOpenRateOfAnnouncementGroup request
     * @return GetDetailedOpenRateOfAnnouncementGroupResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetDetailedOpenRateOfAnnouncementGroupResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDetailedOpenRateOfAnnouncementGroup request with HTTP info returned
     * @return ApiResponse&lt;GetDetailedOpenRateOfAnnouncementGroupResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetDetailedOpenRateOfAnnouncementGroupResponse> executeWithHttpInfo() throws ApiException {
      return getDetailedOpenRateOfAnnouncementGroupWithHttpInfo(announcementGroup, apiToken);
    }
  }

  /**
   * Get detailed open rate of an announcement group
   * ## Get detailed open rate of an announcement group  Retrieves the detailed open rate information of an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement-group ----------------------------
   * @param announcementGroup  (required)
   * @return getDetailedOpenRateOfAnnouncementGroupRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetDetailedOpenRateOfAnnouncementGroupRequest getDetailedOpenRateOfAnnouncementGroup(String announcementGroup) throws ApiException {
    return new APIgetDetailedOpenRateOfAnnouncementGroupRequest(announcementGroup);
  }

private ApiResponse<GetStatisticsResponse> getStatisticsWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

    return apiClient.invokeAPI("AnnouncementApi.getStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetStatisticsRequest {
    private String apiToken;

    private APIgetStatisticsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetStatisticsRequest
     */
    public APIgetStatisticsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getStatistics request
     * @return GetStatisticsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetStatisticsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getStatistics request with HTTP info returned
     * @return ApiResponse&lt;GetStatisticsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetStatisticsResponse> executeWithHttpInfo() throws ApiException {
      return getStatisticsWithHttpInfo(apiToken);
    }
  }

  /**
   * Get statistics - weekly
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @return getStatisticsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetStatisticsRequest getStatistics() throws ApiException {
    return new APIgetStatisticsRequest();
  }

private ApiResponse<GetStatisticsDailyResponse> getStatisticsDailyWithHttpInfo(String startDate, String endDate, String startWeek, String endWeek, String startMonth, String endMonth, String apiToken, String announcementGroup) throws ApiException {
    Object localVarPostBody = null;
    
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

    return apiClient.invokeAPI("AnnouncementApi.getStatisticsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetStatisticsDailyRequest {
    private String startDate;
    private String endDate;
    private String startWeek;
    private String endWeek;
    private String startMonth;
    private String endMonth;
    private String apiToken;
    private String announcementGroup;

    private APIgetStatisticsDailyRequest() {
    }

    /**
     * Set startDate
     * @param startDate  (required)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest startDate(String startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * Set endDate
     * @param endDate  (required)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest endDate(String endDate) {
      this.endDate = endDate;
      return this;
    }

    /**
     * Set startWeek
     * @param startWeek  (required)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest startWeek(String startWeek) {
      this.startWeek = startWeek;
      return this;
    }

    /**
     * Set endWeek
     * @param endWeek  (required)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest endWeek(String endWeek) {
      this.endWeek = endWeek;
      return this;
    }

    /**
     * Set startMonth
     * @param startMonth  (required)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest startMonth(String startMonth) {
      this.startMonth = startMonth;
      return this;
    }

    /**
     * Set endMonth
     * @param endMonth  (required)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest endMonth(String endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set announcementGroup
     * @param announcementGroup  (optional)
     * @return APIgetStatisticsDailyRequest
     */
    public APIgetStatisticsDailyRequest announcementGroup(String announcementGroup) {
      this.announcementGroup = announcementGroup;
      return this;
    }

    /**
     * Execute getStatisticsDaily request
     * @return GetStatisticsDailyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetStatisticsDailyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getStatisticsDaily request with HTTP info returned
     * @return ApiResponse&lt;GetStatisticsDailyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetStatisticsDailyResponse> executeWithHttpInfo() throws ApiException {
      return getStatisticsDailyWithHttpInfo(startDate, endDate, startWeek, endWeek, startMonth, endMonth, apiToken, announcementGroup);
    }
  }

  /**
   * Get statistics - daily
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @return getStatisticsDailyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetStatisticsDailyRequest getStatisticsDaily() throws ApiException {
    return new APIgetStatisticsDailyRequest();
  }

private ApiResponse<GetStatisticsMonthlyResponse> getStatisticsMonthlyWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
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

    return apiClient.invokeAPI("AnnouncementApi.getStatisticsMonthly", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetStatisticsMonthlyRequest {
    private String apiToken;

    private APIgetStatisticsMonthlyRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIgetStatisticsMonthlyRequest
     */
    public APIgetStatisticsMonthlyRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute getStatisticsMonthly request
     * @return GetStatisticsMonthlyResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public GetStatisticsMonthlyResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getStatisticsMonthly request with HTTP info returned
     * @return ApiResponse&lt;GetStatisticsMonthlyResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<GetStatisticsMonthlyResponse> executeWithHttpInfo() throws ApiException {
      return getStatisticsMonthlyWithHttpInfo(apiToken);
    }
  }

  /**
   * Get statistics - monthly
   * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
   * @return getStatisticsMonthlyRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetStatisticsMonthlyRequest getStatisticsMonthly() throws ApiException {
    return new APIgetStatisticsMonthlyRequest();
  }

private ApiResponse<ListAnnouncementGroupsResponse> listAnnouncementGroupsWithHttpInfo(String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
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

    return apiClient.invokeAPI("AnnouncementApi.listAnnouncementGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistAnnouncementGroupsRequest {
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistAnnouncementGroupsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistAnnouncementGroupsRequest
     */
    public APIlistAnnouncementGroupsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistAnnouncementGroupsRequest
     */
    public APIlistAnnouncementGroupsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistAnnouncementGroupsRequest
     */
    public APIlistAnnouncementGroupsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listAnnouncementGroups request
     * @return ListAnnouncementGroupsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListAnnouncementGroupsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAnnouncementGroups request with HTTP info returned
     * @return ApiResponse&lt;ListAnnouncementGroupsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListAnnouncementGroupsResponse> executeWithHttpInfo() throws ApiException {
      return listAnnouncementGroupsWithHttpInfo(apiToken, token, limit);
    }
  }

  /**
   * List announcement groups
   * ## List announcement groups  Retrieves a list of announcement groups.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups ----------------------------
   * @return listAnnouncementGroupsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAnnouncementGroupsRequest listAnnouncementGroups() throws ApiException {
    return new APIlistAnnouncementGroupsRequest();
  }

private ApiResponse<ScheduleAnnouncementResponse> scheduleAnnouncementWithHttpInfo(String apiToken, ScheduleAnnouncementData scheduleAnnouncementData) throws ApiException {
    Object localVarPostBody = scheduleAnnouncementData;
    
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

    return apiClient.invokeAPI("AnnouncementApi.scheduleAnnouncement", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIscheduleAnnouncementRequest {
    private String apiToken;
    private ScheduleAnnouncementData scheduleAnnouncementData;

    private APIscheduleAnnouncementRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIscheduleAnnouncementRequest
     */
    public APIscheduleAnnouncementRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set scheduleAnnouncementData
     * @param scheduleAnnouncementData  (optional)
     * @return APIscheduleAnnouncementRequest
     */
    public APIscheduleAnnouncementRequest scheduleAnnouncementData(ScheduleAnnouncementData scheduleAnnouncementData) {
      this.scheduleAnnouncementData = scheduleAnnouncementData;
      return this;
    }

    /**
     * Execute scheduleAnnouncement request
     * @return ScheduleAnnouncementResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ScheduleAnnouncementResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute scheduleAnnouncement request with HTTP info returned
     * @return ApiResponse&lt;ScheduleAnnouncementResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ScheduleAnnouncementResponse> executeWithHttpInfo() throws ApiException {
      return scheduleAnnouncementWithHttpInfo(apiToken, scheduleAnnouncementData);
    }
  }

  /**
   * Schedule an announcement
   * ## Schedule an announcement  Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement
   * @return scheduleAnnouncementRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIscheduleAnnouncementRequest scheduleAnnouncement() throws ApiException {
    return new APIscheduleAnnouncementRequest();
  }

private ApiResponse<UpdateAnnouncementByIdResponse> updateAnnouncementByIdWithHttpInfo(String uniqueId, String apiToken, UpdateAnnouncementByIdData updateAnnouncementByIdData) throws ApiException {
    Object localVarPostBody = updateAnnouncementByIdData;
    
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

    return apiClient.invokeAPI("AnnouncementApi.updateAnnouncementById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateAnnouncementByIdRequest {
    private String uniqueId;
    private String apiToken;
    private UpdateAnnouncementByIdData updateAnnouncementByIdData;

    private APIupdateAnnouncementByIdRequest(String uniqueId) {
      this.uniqueId = uniqueId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIupdateAnnouncementByIdRequest
     */
    public APIupdateAnnouncementByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set updateAnnouncementByIdData
     * @param updateAnnouncementByIdData  (optional)
     * @return APIupdateAnnouncementByIdRequest
     */
    public APIupdateAnnouncementByIdRequest updateAnnouncementByIdData(UpdateAnnouncementByIdData updateAnnouncementByIdData) {
      this.updateAnnouncementByIdData = updateAnnouncementByIdData;
      return this;
    }

    /**
     * Execute updateAnnouncementById request
     * @return UpdateAnnouncementByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UpdateAnnouncementByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAnnouncementById request with HTTP info returned
     * @return ApiResponse&lt;UpdateAnnouncementByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UpdateAnnouncementByIdResponse> executeWithHttpInfo() throws ApiException {
      return updateAnnouncementByIdWithHttpInfo(uniqueId, apiToken, updateAnnouncementByIdData);
    }
  }

  /**
   * Update an announcement
   * ## Update an announcement  Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.  &gt;__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn&#39;t started yet.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement ----------------------------
   * @param uniqueId  (required)
   * @return updateAnnouncementByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateAnnouncementByIdRequest updateAnnouncementById(String uniqueId) throws ApiException {
    return new APIupdateAnnouncementByIdRequest(uniqueId);
  }

private ApiResponse<ViewAnnouncementByIdResponse> viewAnnouncementByIdWithHttpInfo(String uniqueId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'uniqueId' is set
    if (uniqueId == null) {
      throw new ApiException(400, "Missing the required parameter 'uniqueId' when calling viewAnnouncementById");
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ViewAnnouncementByIdResponse> localVarReturnType = new GenericType<ViewAnnouncementByIdResponse>() {};

    return apiClient.invokeAPI("AnnouncementApi.viewAnnouncementById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewAnnouncementByIdRequest {
    private String uniqueId;
    private String apiToken;

    private APIviewAnnouncementByIdRequest(String uniqueId) {
      this.uniqueId = uniqueId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewAnnouncementByIdRequest
     */
    public APIviewAnnouncementByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewAnnouncementById request
     * @return ViewAnnouncementByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewAnnouncementByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewAnnouncementById request with HTTP info returned
     * @return ApiResponse&lt;ViewAnnouncementByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewAnnouncementByIdResponse> executeWithHttpInfo() throws ApiException {
      return viewAnnouncementByIdWithHttpInfo(uniqueId, apiToken);
    }
  }

  /**
   * View an announcement
   * ## View an announcement  Retrieves information on a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-view-an-announcement ----------------------------
   * @param uniqueId  (required)
   * @return viewAnnouncementByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewAnnouncementByIdRequest viewAnnouncementById(String uniqueId) throws ApiException {
    return new APIviewAnnouncementByIdRequest(uniqueId);
  }
}
