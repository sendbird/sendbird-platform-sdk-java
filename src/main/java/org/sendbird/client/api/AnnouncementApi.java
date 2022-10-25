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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
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

  /**
   * Get detailed open rate of an announcement group
   * ## Get detailed open rate of an announcement group  Retrieves the detailed open rate information of an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement-group ----------------------------
   * @param apiToken  (required)
   * @param announcementGroup  (required)
   * @return GetDetailedOpenRateOfAnnouncementGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GetDetailedOpenRateOfAnnouncementGroupResponse getDetailedOpenRateOfAnnouncementGroup(String apiToken, String announcementGroup) throws ApiException {
    return getDetailedOpenRateOfAnnouncementGroupWithHttpInfo(apiToken, announcementGroup).getData();
  }

  /**
   * Get detailed open rate of an announcement group
   * ## Get detailed open rate of an announcement group  Retrieves the detailed open rate information of an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement-group ----------------------------
   * @param apiToken  (required)
   * @param announcementGroup  (required)
   * @return ApiResponse&lt;GetDetailedOpenRateOfAnnouncementGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetDetailedOpenRateOfAnnouncementGroupResponse> getDetailedOpenRateOfAnnouncementGroupWithHttpInfo(String apiToken, String announcementGroup) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getDetailedOpenRateOfAnnouncementGroup");
    }
    
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

    return apiClient.invokeAPI("AnnouncementApi.getStatistics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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

    return apiClient.invokeAPI("AnnouncementApi.getStatisticsDaily", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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

    return apiClient.invokeAPI("AnnouncementApi.getStatisticsMonthly", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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

    return apiClient.invokeAPI("AnnouncementApi.listAnnouncementGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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

    return apiClient.invokeAPI("AnnouncementApi.scheduleAnnouncement", localVarPath, "POST", localVarQueryParams, localVarPostBody,
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

    return apiClient.invokeAPI("AnnouncementApi.updateAnnouncementById", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View an announcement
   * ## View an announcement  Retrieves information on a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-view-an-announcement ----------------------------
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @return ViewAnnouncementByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewAnnouncementByIdResponse viewAnnouncementById(String apiToken, String uniqueId) throws ApiException {
    return viewAnnouncementByIdWithHttpInfo(apiToken, uniqueId).getData();
  }

  /**
   * View an announcement
   * ## View an announcement  Retrieves information on a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-view-an-announcement ----------------------------
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @return ApiResponse&lt;ViewAnnouncementByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewAnnouncementByIdResponse> viewAnnouncementByIdWithHttpInfo(String apiToken, String uniqueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewAnnouncementById");
    }
    
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
}
