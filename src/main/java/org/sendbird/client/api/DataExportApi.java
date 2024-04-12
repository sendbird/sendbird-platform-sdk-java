package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ListDataExportsByMessageChannelOrUserResponse;
import org.openapitools.client.model.RegisterAndScheduleDataExportData;
import org.openapitools.client.model.RegisterAndScheduleDataExportResponse;
import org.openapitools.client.model.ViewDataExportByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class DataExportApi {
  private ApiClient apiClient;

  public DataExportApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataExportApi(ApiClient apiClient) {
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


private ApiResponse<ListDataExportsByMessageChannelOrUserResponse> listDataExportsByMessageChannelOrUserWithHttpInfo(String dataType, String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dataType' is set
    if (dataType == null) {
      throw new ApiException(400, "Missing the required parameter 'dataType' when calling listDataExportsByMessageChannelOrUser");
    }
    
    // create path and map variables
    String localVarPath = "/v3/export/{data_type}"
      .replaceAll("\\{" + "data_type" + "\\}", apiClient.escapeString(dataType.toString()));

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

    GenericType<ListDataExportsByMessageChannelOrUserResponse> localVarReturnType = new GenericType<ListDataExportsByMessageChannelOrUserResponse>() {};

    return apiClient.invokeAPI("DataExportApi.listDataExportsByMessageChannelOrUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistDataExportsByMessageChannelOrUserRequest {
    private String dataType;
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistDataExportsByMessageChannelOrUserRequest(String dataType) {
      this.dataType = dataType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistDataExportsByMessageChannelOrUserRequest
     */
    public APIlistDataExportsByMessageChannelOrUserRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistDataExportsByMessageChannelOrUserRequest
     */
    public APIlistDataExportsByMessageChannelOrUserRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistDataExportsByMessageChannelOrUserRequest
     */
    public APIlistDataExportsByMessageChannelOrUserRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listDataExportsByMessageChannelOrUser request
     * @return ListDataExportsByMessageChannelOrUserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListDataExportsByMessageChannelOrUserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listDataExportsByMessageChannelOrUser request with HTTP info returned
     * @return ApiResponse&lt;ListDataExportsByMessageChannelOrUserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListDataExportsByMessageChannelOrUserResponse> executeWithHttpInfo() throws ApiException {
      return listDataExportsByMessageChannelOrUserWithHttpInfo(dataType, apiToken, token, limit);
    }
  }

  /**
   * List data exports by message, channel, or user
   * ## List data exports by message, channel, or user  Retrieves a list of message, channel or user data exports  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-list-data-exports-by-message,-channel,-or-user ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a data export to retrieve. Acceptable values are messages, channels, users, and failed_webhooks.
   * @param dataType  (required)
   * @return listDataExportsByMessageChannelOrUserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistDataExportsByMessageChannelOrUserRequest listDataExportsByMessageChannelOrUser(String dataType) throws ApiException {
    return new APIlistDataExportsByMessageChannelOrUserRequest(dataType);
  }

private ApiResponse<RegisterAndScheduleDataExportResponse> registerAndScheduleDataExportWithHttpInfo(String dataType, String apiToken, RegisterAndScheduleDataExportData registerAndScheduleDataExportData) throws ApiException {
    Object localVarPostBody = registerAndScheduleDataExportData;
    
    // verify the required parameter 'dataType' is set
    if (dataType == null) {
      throw new ApiException(400, "Missing the required parameter 'dataType' when calling registerAndScheduleDataExport");
    }
    
    // create path and map variables
    String localVarPath = "/v3/export/{data_type}"
      .replaceAll("\\{" + "data_type" + "\\}", apiClient.escapeString(dataType.toString()));

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

    GenericType<RegisterAndScheduleDataExportResponse> localVarReturnType = new GenericType<RegisterAndScheduleDataExportResponse>() {};

    return apiClient.invokeAPI("DataExportApi.registerAndScheduleDataExport", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIregisterAndScheduleDataExportRequest {
    private String dataType;
    private String apiToken;
    private RegisterAndScheduleDataExportData registerAndScheduleDataExportData;

    private APIregisterAndScheduleDataExportRequest(String dataType) {
      this.dataType = dataType;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIregisterAndScheduleDataExportRequest
     */
    public APIregisterAndScheduleDataExportRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set registerAndScheduleDataExportData
     * @param registerAndScheduleDataExportData  (optional)
     * @return APIregisterAndScheduleDataExportRequest
     */
    public APIregisterAndScheduleDataExportRequest registerAndScheduleDataExportData(RegisterAndScheduleDataExportData registerAndScheduleDataExportData) {
      this.registerAndScheduleDataExportData = registerAndScheduleDataExportData;
      return this;
    }

    /**
     * Execute registerAndScheduleDataExport request
     * @return RegisterAndScheduleDataExportResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RegisterAndScheduleDataExportResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute registerAndScheduleDataExport request with HTTP info returned
     * @return ApiResponse&lt;RegisterAndScheduleDataExportResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RegisterAndScheduleDataExportResponse> executeWithHttpInfo() throws ApiException {
      return registerAndScheduleDataExportWithHttpInfo(dataType, apiToken, registerAndScheduleDataExportData);
    }
  }

  /**
   * Register and schedule a data export
   * ## Register and schedule a data export  Registers and schedules a message, channel, or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-register-and-schedule-a-data-export ----------------------------
   * @param dataType  (required)
   * @return registerAndScheduleDataExportRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIregisterAndScheduleDataExportRequest registerAndScheduleDataExport(String dataType) throws ApiException {
    return new APIregisterAndScheduleDataExportRequest(dataType);
  }

private ApiResponse<ViewDataExportByIdResponse> viewDataExportByIdWithHttpInfo(String dataType, String requestId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dataType' is set
    if (dataType == null) {
      throw new ApiException(400, "Missing the required parameter 'dataType' when calling viewDataExportById");
    }
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling viewDataExportById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/export/{data_type}/{request_id}"
      .replaceAll("\\{" + "data_type" + "\\}", apiClient.escapeString(dataType.toString()))
      .replaceAll("\\{" + "request_id" + "\\}", apiClient.escapeString(requestId.toString()));

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

    GenericType<ViewDataExportByIdResponse> localVarReturnType = new GenericType<ViewDataExportByIdResponse>() {};

    return apiClient.invokeAPI("DataExportApi.viewDataExportById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewDataExportByIdRequest {
    private String dataType;
    private String requestId;
    private String apiToken;

    private APIviewDataExportByIdRequest(String dataType, String requestId) {
      this.dataType = dataType;
      this.requestId = requestId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewDataExportByIdRequest
     */
    public APIviewDataExportByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewDataExportById request
     * @return ViewDataExportByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewDataExportByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewDataExportById request with HTTP info returned
     * @return ApiResponse&lt;ViewDataExportByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewDataExportByIdResponse> executeWithHttpInfo() throws ApiException {
      return viewDataExportByIdWithHttpInfo(dataType, requestId, apiToken);
    }
  }

  /**
   * View a data export
   * ## View a data export  Retrieves information on a message, channel or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-view-a-data-export ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a targeted data export. Acceptable values are messages, channels,  users, and failed_webhooks.  &#x60;request_id&#x60;      Type: string      Description: Specifies the unique ID of a data export to retrieve.
   * @param dataType  (required)
   * @param requestId  (required)
   * @return viewDataExportByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewDataExportByIdRequest viewDataExportById(String dataType, String requestId) throws ApiException {
    return new APIviewDataExportByIdRequest(dataType, requestId);
  }
}
