package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.SendBirdScheduleAnAnnouncementRequest;
import org.openapitools.client.model.SendBirdScheduleAnAnnouncementResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-10-17T09:07:44.254699+09:00[Asia/Seoul]")
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


private ApiResponse<SendBirdScheduleAnAnnouncementResponse> scheduleAnAnnouncementWithHttpInfo(String apiToken, SendBirdScheduleAnAnnouncementRequest sendBirdScheduleAnAnnouncementRequest) throws ApiException {
    Object localVarPostBody = sendBirdScheduleAnAnnouncementRequest;
    
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

    GenericType<SendBirdScheduleAnAnnouncementResponse> localVarReturnType = new GenericType<SendBirdScheduleAnAnnouncementResponse>() {};

    return apiClient.invokeAPI("AnnouncementApi.scheduleAnAnnouncement", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIscheduleAnAnnouncementRequest {
    private String apiToken;
    private SendBirdScheduleAnAnnouncementRequest sendBirdScheduleAnAnnouncementRequest;

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
     * Set sendBirdScheduleAnAnnouncementRequest
     * @param sendBirdScheduleAnAnnouncementRequest  (optional)
     * @return APIscheduleAnAnnouncementRequest
     */
    public APIscheduleAnAnnouncementRequest sendBirdScheduleAnAnnouncementRequest(SendBirdScheduleAnAnnouncementRequest sendBirdScheduleAnAnnouncementRequest) {
      this.sendBirdScheduleAnAnnouncementRequest = sendBirdScheduleAnAnnouncementRequest;
      return this;
    }

    /**
     * Execute scheduleAnAnnouncement request
     * @return SendBirdScheduleAnAnnouncementResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public SendBirdScheduleAnAnnouncementResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute scheduleAnAnnouncement request with HTTP info returned
     * @return ApiResponse&lt;SendBirdScheduleAnAnnouncementResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<SendBirdScheduleAnAnnouncementResponse> executeWithHttpInfo() throws ApiException {
      return scheduleAnAnnouncementWithHttpInfo(apiToken, sendBirdScheduleAnAnnouncementRequest);
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
