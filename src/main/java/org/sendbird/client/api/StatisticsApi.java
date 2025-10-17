package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ViewNumberOfDailyActiveUsersResponse;
import org.openapitools.client.model.ViewNumberOfMonthlyActiveUsersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-10-17T09:43:55.483942+09:00[Asia/Seoul]")
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


private ApiResponse<ViewNumberOfDailyActiveUsersResponse> viewNumberOfDailyActiveUsersWithHttpInfo(String date, String apiToken) throws ApiException {
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private String date;
    private String apiToken;

    private APIviewNumberOfDailyActiveUsersRequest() {
    }

    /**
     * Set date
     * @param date YYYY-MM-DD (optional)
     * @return APIviewNumberOfDailyActiveUsersRequest
     */
    public APIviewNumberOfDailyActiveUsersRequest date(String date) {
      this.date = date;
      return this;
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
      return viewNumberOfDailyActiveUsersWithHttpInfo(date, apiToken);
    }
  }

  /**
   * View number of daily active users
   * ## View number of daily active users  Retrieves the number of daily active users of an application.  &gt; **Note**: This metric is scheduled to be calculated every 30 minutes, starting at 00:00 UTC, with the first update at 00:30 UTC.      [https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-daily-active-users#1-get-number-of-daily-active-users](https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-daily-active-users#1-get-number-of-daily-active-users)
   * @return viewNumberOfDailyActiveUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfDailyActiveUsersRequest viewNumberOfDailyActiveUsers() throws ApiException {
    return new APIviewNumberOfDailyActiveUsersRequest();
  }

private ApiResponse<ViewNumberOfMonthlyActiveUsersResponse> viewNumberOfMonthlyActiveUsersWithHttpInfo(String date, String apiToken) throws ApiException {
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
      localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

    
    
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
    private String date;
    private String apiToken;

    private APIviewNumberOfMonthlyActiveUsersRequest() {
    }

    /**
     * Set date
     * @param date YYYY-MM-DD (optional)
     * @return APIviewNumberOfMonthlyActiveUsersRequest
     */
    public APIviewNumberOfMonthlyActiveUsersRequest date(String date) {
      this.date = date;
      return this;
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
      return viewNumberOfMonthlyActiveUsersWithHttpInfo(date, apiToken);
    }
  }

  /**
   * View number of monthly active users
   * ## View number of monthly active users  Retrieves the number of monthly active users of an application.  &gt; **Note**: This metric is scheduled to be calculated every 30 minutes, starting at 00:00 UTC, with the first update at 00:30 UTC.      [https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-monthly-active-users#1-get-number-of-monthly-active-users](https://sendbird.com/docs/chat/platform-api/v3/statistics/daus-and-maus/get-number-of-monthly-active-users#1-get-number-of-monthly-active-users)
   * @return viewNumberOfMonthlyActiveUsersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewNumberOfMonthlyActiveUsersRequest viewNumberOfMonthlyActiveUsers() throws ApiException {
    return new APIviewNumberOfMonthlyActiveUsersRequest();
  }
}
