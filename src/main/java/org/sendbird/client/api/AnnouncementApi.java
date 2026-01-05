package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ScheduleAnAnnouncementRequest;
import org.openapitools.client.model.ScheduleAnAnnouncementResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-05T16:00:24.119682+09:00[Asia/Seoul]")
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


private ApiResponse<ScheduleAnAnnouncementResponse> scheduleAnAnnouncementWithHttpInfo(String apiToken, ScheduleAnAnnouncementRequest scheduleAnAnnouncementRequest) throws ApiException {
    Object localVarPostBody = scheduleAnAnnouncementRequest;
    
    // create path and map variables
    String localVarPath = "/v3/announcements";

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

    GenericType<ScheduleAnAnnouncementResponse> localVarReturnType = new GenericType<ScheduleAnAnnouncementResponse>() {};

    return apiClient.invokeAPI("AnnouncementApi.scheduleAnAnnouncement", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIscheduleAnAnnouncementRequest {
    private String apiToken;
    private ScheduleAnAnnouncementRequest scheduleAnAnnouncementRequest;

    private APIscheduleAnAnnouncementRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIscheduleAnAnnouncementRequest
     */
    public APIscheduleAnAnnouncementRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set scheduleAnAnnouncementRequest
     * @param scheduleAnAnnouncementRequest  (optional)
     * @return APIscheduleAnAnnouncementRequest
     */
    public APIscheduleAnAnnouncementRequest scheduleAnAnnouncementRequest(ScheduleAnAnnouncementRequest scheduleAnAnnouncementRequest) {
      this.scheduleAnAnnouncementRequest = scheduleAnAnnouncementRequest;
      return this;
    }

    /**
     * Execute scheduleAnAnnouncement request
     * @return ScheduleAnAnnouncementResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ScheduleAnAnnouncementResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute scheduleAnAnnouncement request with HTTP info returned
     * @return ApiResponse&lt;ScheduleAnAnnouncementResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ScheduleAnAnnouncementResponse> executeWithHttpInfo() throws ApiException {
      return scheduleAnAnnouncementWithHttpInfo(apiToken, scheduleAnAnnouncementRequest);
    }
  }

  /**
   * Schedule an announcement
   * ## Schedule an announcement  Creates an announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).  [https://sendbird.com/docs/chat/platform-api/v3/message/announcements/create-an-announcement#1-create-an-announcement](https://sendbird.com/docs/chat/platform-api/v3/message/announcements/create-an-announcement#1-create-an-announcement)
   * @return scheduleAnAnnouncementRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIscheduleAnAnnouncementRequest scheduleAnAnnouncement() throws ApiException {
    return new APIscheduleAnAnnouncementRequest();
  }
}
