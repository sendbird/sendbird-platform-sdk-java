package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.RetrieveAdvancedAnalyticsMetricsResponse;
import org.openapitools.client.model.ViewNumberOfConcurrentConnectionsResponse;
import org.openapitools.client.model.ViewNumberOfDailyActiveUsersResponse;
import org.openapitools.client.model.ViewNumberOfMonthlyActiveUsersResponse;
import org.openapitools.client.model.ViewNumberOfPeakConnectionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
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

  /**
   * Retrieve Advanced analytics metrics
   * ## Retrieve Advanced analytics metrics  Retrieves Advanced analytics metrics based on the specified parameters. You can retrieve either daily or monthly metrics using the time_dimension parameter.  &gt;__Note__: Daily metrics are calculated and updated every three hours, starting at 1 a.m. in UTC. Meanwhile, monthly metrics are calculated after the last day of the month.  https://sendbird.com/docs/chat/v3/platform-api/guides/advanced-analytics#2-retrieve-advanced-analytics-metrics ----------------------------
   * @param apiToken  (required)
   * @return RetrieveAdvancedAnalyticsMetricsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveAdvancedAnalyticsMetricsResponse retrieveAdvancedAnalyticsMetrics(String apiToken) throws ApiException {
    return retrieveAdvancedAnalyticsMetricsWithHttpInfo(apiToken).getData();
  }

  /**
   * Retrieve Advanced analytics metrics
   * ## Retrieve Advanced analytics metrics  Retrieves Advanced analytics metrics based on the specified parameters. You can retrieve either daily or monthly metrics using the time_dimension parameter.  &gt;__Note__: Daily metrics are calculated and updated every three hours, starting at 1 a.m. in UTC. Meanwhile, monthly metrics are calculated after the last day of the month.  https://sendbird.com/docs/chat/v3/platform-api/guides/advanced-analytics#2-retrieve-advanced-analytics-metrics ----------------------------
   * @param apiToken  (required)
   * @return ApiResponse&lt;RetrieveAdvancedAnalyticsMetricsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveAdvancedAnalyticsMetricsResponse> retrieveAdvancedAnalyticsMetricsWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling retrieveAdvancedAnalyticsMetrics");
    }
    
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
  /**
   * View number of concurrent connections
   * ## View number of concurrent connections  Retrieves the number of devices and opened browser tabs which are currently connected to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-concurrent-connections
   * @param apiToken  (required)
   * @return ViewNumberOfConcurrentConnectionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfConcurrentConnectionsResponse viewNumberOfConcurrentConnections(String apiToken) throws ApiException {
    return viewNumberOfConcurrentConnectionsWithHttpInfo(apiToken).getData();
  }

  /**
   * View number of concurrent connections
   * ## View number of concurrent connections  Retrieves the number of devices and opened browser tabs which are currently connected to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-concurrent-connections
   * @param apiToken  (required)
   * @return ApiResponse&lt;ViewNumberOfConcurrentConnectionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfConcurrentConnectionsResponse> viewNumberOfConcurrentConnectionsWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfConcurrentConnections");
    }
    
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
  /**
   * View number of daily active users
   * ## View number of daily active users  Retrieves the number of daily active users of the application (DAU).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-daily-active-users ----------------------------
   * @param apiToken  (required)
   * @param date  (optional)
   * @return ViewNumberOfDailyActiveUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfDailyActiveUsersResponse viewNumberOfDailyActiveUsers(String apiToken, String date) throws ApiException {
    return viewNumberOfDailyActiveUsersWithHttpInfo(apiToken, date).getData();
  }

  /**
   * View number of daily active users
   * ## View number of daily active users  Retrieves the number of daily active users of the application (DAU).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-daily-active-users ----------------------------
   * @param apiToken  (required)
   * @param date  (optional)
   * @return ApiResponse&lt;ViewNumberOfDailyActiveUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfDailyActiveUsersResponse> viewNumberOfDailyActiveUsersWithHttpInfo(String apiToken, String date) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfDailyActiveUsers");
    }
    
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
  /**
   * View number of monthly active users
   * ## View number of monthly active users  Retrieves the number of monthly active users of the application (MAU).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-monthly-active-users ----------------------------
   * @param apiToken  (required)
   * @param date  (optional)
   * @return ViewNumberOfMonthlyActiveUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfMonthlyActiveUsersResponse viewNumberOfMonthlyActiveUsers(String apiToken, String date) throws ApiException {
    return viewNumberOfMonthlyActiveUsersWithHttpInfo(apiToken, date).getData();
  }

  /**
   * View number of monthly active users
   * ## View number of monthly active users  Retrieves the number of monthly active users of the application (MAU).  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-monthly-active-users ----------------------------
   * @param apiToken  (required)
   * @param date  (optional)
   * @return ApiResponse&lt;ViewNumberOfMonthlyActiveUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfMonthlyActiveUsersResponse> viewNumberOfMonthlyActiveUsersWithHttpInfo(String apiToken, String date) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfMonthlyActiveUsers");
    }
    
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
  /**
   * View number of peak connections
   * ## View number of peak connections  Retrieves the number of concurrently connected devices to Sendbird server during the requested time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-peak-connections ----------------------------
   * @param apiToken  (required)
   * @param timeDimension  (required)
   * @param startYear  (required)
   * @param startMonth  (required)
   * @param endYear  (required)
   * @param endMonth  (required)
   * @param startDay  (optional)
   * @param endDay  (optional)
   * @return ViewNumberOfPeakConnectionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewNumberOfPeakConnectionsResponse viewNumberOfPeakConnections(String apiToken, String timeDimension, Integer startYear, Integer startMonth, Integer endYear, Integer endMonth, Integer startDay, Integer endDay) throws ApiException {
    return viewNumberOfPeakConnectionsWithHttpInfo(apiToken, timeDimension, startYear, startMonth, endYear, endMonth, startDay, endDay).getData();
  }

  /**
   * View number of peak connections
   * ## View number of peak connections  Retrieves the number of concurrently connected devices to Sendbird server during the requested time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-number-of-peak-connections ----------------------------
   * @param apiToken  (required)
   * @param timeDimension  (required)
   * @param startYear  (required)
   * @param startMonth  (required)
   * @param endYear  (required)
   * @param endMonth  (required)
   * @param startDay  (optional)
   * @param endDay  (optional)
   * @return ApiResponse&lt;ViewNumberOfPeakConnectionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewNumberOfPeakConnectionsResponse> viewNumberOfPeakConnectionsWithHttpInfo(String apiToken, String timeDimension, Integer startYear, Integer startMonth, Integer endYear, Integer endMonth, Integer startDay, Integer endDay) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewNumberOfPeakConnections");
    }
    
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
}
