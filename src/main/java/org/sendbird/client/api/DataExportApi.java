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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
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

  /**
   * List data exports by message, channel, or user
   * ## List data exports by message, channel, or user  Retrieves a list of message, channel or user data exports  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-list-data-exports-by-message,-channel,-or-user ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a data export to retrieve. Acceptable values are messages, channels, users, and failed_webhooks.
   * @param apiToken  (required)
   * @param dataType  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ListDataExportsByMessageChannelOrUserResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ListDataExportsByMessageChannelOrUserResponse listDataExportsByMessageChannelOrUser(String apiToken, String dataType, String token, Integer limit) throws ApiException {
    return listDataExportsByMessageChannelOrUserWithHttpInfo(apiToken, dataType, token, limit).getData();
  }

  /**
   * List data exports by message, channel, or user
   * ## List data exports by message, channel, or user  Retrieves a list of message, channel or user data exports  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-list-data-exports-by-message,-channel,-or-user ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a data export to retrieve. Acceptable values are messages, channels, users, and failed_webhooks.
   * @param apiToken  (required)
   * @param dataType  (required)
   * @param token  (optional)
   * @param limit  (optional)
   * @return ApiResponse&lt;ListDataExportsByMessageChannelOrUserResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListDataExportsByMessageChannelOrUserResponse> listDataExportsByMessageChannelOrUserWithHttpInfo(String apiToken, String dataType, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling listDataExportsByMessageChannelOrUser");
    }
    
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
  /**
   * Register and schedule a data export
   * ## Register and schedule a data export  Registers and schedules a message, channel, or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-register-and-schedule-a-data-export ----------------------------
   * @param apiToken  (required)
   * @param dataType  (required)
   * @param registerAndScheduleDataExportData  (optional)
   * @return RegisterAndScheduleDataExportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RegisterAndScheduleDataExportResponse registerAndScheduleDataExport(String apiToken, String dataType, RegisterAndScheduleDataExportData registerAndScheduleDataExportData) throws ApiException {
    return registerAndScheduleDataExportWithHttpInfo(apiToken, dataType, registerAndScheduleDataExportData).getData();
  }

  /**
   * Register and schedule a data export
   * ## Register and schedule a data export  Registers and schedules a message, channel, or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-register-and-schedule-a-data-export ----------------------------
   * @param apiToken  (required)
   * @param dataType  (required)
   * @param registerAndScheduleDataExportData  (optional)
   * @return ApiResponse&lt;RegisterAndScheduleDataExportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RegisterAndScheduleDataExportResponse> registerAndScheduleDataExportWithHttpInfo(String apiToken, String dataType, RegisterAndScheduleDataExportData registerAndScheduleDataExportData) throws ApiException {
    Object localVarPostBody = registerAndScheduleDataExportData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling registerAndScheduleDataExport");
    }
    
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
  /**
   * View a data export
   * ## View a data export  Retrieves information on a message, channel or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-view-a-data-export ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a targeted data export. Acceptable values are messages, channels,  users, and failed_webhooks.  &#x60;request_id&#x60;      Type: string      Description: Specifies the unique ID of a data export to retrieve.
   * @param apiToken  (required)
   * @param dataType  (required)
   * @param requestId  (required)
   * @return ViewDataExportByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ViewDataExportByIdResponse viewDataExportById(String apiToken, String dataType, String requestId) throws ApiException {
    return viewDataExportByIdWithHttpInfo(apiToken, dataType, requestId).getData();
  }

  /**
   * View a data export
   * ## View a data export  Retrieves information on a message, channel or user data export.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-export#2-view-a-data-export ----------------------------   &#x60;data_type&#x60;      Type: string      Description: Specifies the type of a targeted data export. Acceptable values are messages, channels,  users, and failed_webhooks.  &#x60;request_id&#x60;      Type: string      Description: Specifies the unique ID of a data export to retrieve.
   * @param apiToken  (required)
   * @param dataType  (required)
   * @param requestId  (required)
   * @return ApiResponse&lt;ViewDataExportByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ViewDataExportByIdResponse> viewDataExportByIdWithHttpInfo(String apiToken, String dataType, String requestId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling viewDataExportById");
    }
    
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
}
