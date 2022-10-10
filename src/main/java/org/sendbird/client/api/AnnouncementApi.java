package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.GetDetailedOpenRateOfAnnouncementByIdResponse;
import org.openapitools.client.model.GetDetailedOpenRateOfAnnouncementGroupResponse;
import org.openapitools.client.model.GetDetailedOpenStatusOfAnnouncementByIdResponse;
import org.openapitools.client.model.ViewAnnouncementByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
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
   * Get detailed open rate of an announcement
   * ## Get detailed open rate of an announcement  Retrieves the detailed open rate information of an announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement ----------------------------   &#x60;unique_id&#x60;      Type: string      Description: Specifies the unique ID of the announcement to get its open rate.
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @return GetDetailedOpenRateOfAnnouncementByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GetDetailedOpenRateOfAnnouncementByIdResponse getDetailedOpenRateOfAnnouncementById(String apiToken, String uniqueId) throws ApiException {
    return getDetailedOpenRateOfAnnouncementByIdWithHttpInfo(apiToken, uniqueId).getData();
  }

  /**
   * Get detailed open rate of an announcement
   * ## Get detailed open rate of an announcement  Retrieves the detailed open rate information of an announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-rate-of-an-announcement ----------------------------   &#x60;unique_id&#x60;      Type: string      Description: Specifies the unique ID of the announcement to get its open rate.
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @return ApiResponse&lt;GetDetailedOpenRateOfAnnouncementByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetDetailedOpenRateOfAnnouncementByIdResponse> getDetailedOpenRateOfAnnouncementByIdWithHttpInfo(String apiToken, String uniqueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getDetailedOpenRateOfAnnouncementById");
    }
    
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

    return apiClient.invokeAPI("AnnouncementApi.getDetailedOpenRateOfAnnouncementById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
   * Get detailed open status of an announcement
   * ## Get detailed open status of an announcement  Retrieves the detailed open status information of a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-status-of-an-announcement ----------------------------
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @param limit  (optional)
   * @param next  (optional)
   * @param uniqueIds  (optional)
   * @param channelUrls  (optional)
   * @param hasOpened  (optional)
   * @return GetDetailedOpenStatusOfAnnouncementByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public GetDetailedOpenStatusOfAnnouncementByIdResponse getDetailedOpenStatusOfAnnouncementById(String apiToken, String uniqueId, Integer limit, String next, List<String> uniqueIds, List<String> channelUrls, Boolean hasOpened) throws ApiException {
    return getDetailedOpenStatusOfAnnouncementByIdWithHttpInfo(apiToken, uniqueId, limit, next, uniqueIds, channelUrls, hasOpened).getData();
  }

  /**
   * Get detailed open status of an announcement
   * ## Get detailed open status of an announcement  Retrieves the detailed open status information of a specific announcement.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-detailed-open-status-of-an-announcement ----------------------------
   * @param apiToken  (required)
   * @param uniqueId  (required)
   * @param limit  (optional)
   * @param next  (optional)
   * @param uniqueIds  (optional)
   * @param channelUrls  (optional)
   * @param hasOpened  (optional)
   * @return ApiResponse&lt;GetDetailedOpenStatusOfAnnouncementByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetDetailedOpenStatusOfAnnouncementByIdResponse> getDetailedOpenStatusOfAnnouncementByIdWithHttpInfo(String apiToken, String uniqueId, Integer limit, String next, List<String> uniqueIds, List<String> channelUrls, Boolean hasOpened) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling getDetailedOpenStatusOfAnnouncementById");
    }
    
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

    return apiClient.invokeAPI("AnnouncementApi.getDetailedOpenStatusOfAnnouncementById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
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
