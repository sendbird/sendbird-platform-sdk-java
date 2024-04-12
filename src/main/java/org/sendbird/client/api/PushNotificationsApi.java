package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ListPushConfigurationsResponse;
import org.openapitools.client.model.V3ApplicationsPushSettingsGet200Response;
import org.openapitools.client.model.V3ApplicationsPushSettingsGetRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T19:00:24.771175+09:00[Asia/Seoul]")
public class PushNotificationsApi {
  private ApiClient apiClient;

  public PushNotificationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PushNotificationsApi(ApiClient apiClient) {
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


private ApiResponse<V3ApplicationsPushSettingsGet200Response> v3ApplicationsPushSettingsGetWithHttpInfo(String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/settings";

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

    GenericType<V3ApplicationsPushSettingsGet200Response> localVarReturnType = new GenericType<V3ApplicationsPushSettingsGet200Response>() {};

    return apiClient.invokeAPI("PushNotificationsApi.v3ApplicationsPushSettingsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3ApplicationsPushSettingsGetRequest {
    private String apiToken;

    private APIv3ApplicationsPushSettingsGetRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3ApplicationsPushSettingsGetRequest
     */
    public APIv3ApplicationsPushSettingsGetRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute v3ApplicationsPushSettingsGet request
     * @return V3ApplicationsPushSettingsGet200Response
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public V3ApplicationsPushSettingsGet200Response execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3ApplicationsPushSettingsGet request with HTTP info returned
     * @return ApiResponse&lt;V3ApplicationsPushSettingsGet200Response&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<V3ApplicationsPushSettingsGet200Response> executeWithHttpInfo() throws ApiException {
      return v3ApplicationsPushSettingsGetWithHttpInfo(apiToken);
    }
  }

  /**
   * Check push notifications
   * ## Check push notifications Shows whether the push notifications feature is turned on for an application. https://sendbird.com/docs/chat/v3/platform-api/application/managing-notifications/check-push-notifications -----------------------------  
   * @return v3ApplicationsPushSettingsGetRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3ApplicationsPushSettingsGetRequest v3ApplicationsPushSettingsGet() throws ApiException {
    return new APIv3ApplicationsPushSettingsGetRequest();
  }

private ApiResponse<ListPushConfigurationsResponse> v3ApplicationsPushSettingsPutWithHttpInfo(String apiToken, V3ApplicationsPushSettingsGetRequest v3ApplicationsPushSettingsGetRequest) throws ApiException {
    Object localVarPostBody = v3ApplicationsPushSettingsGetRequest;
    
    // create path and map variables
    String localVarPath = "/v3/applications/push/settings";

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

    GenericType<ListPushConfigurationsResponse> localVarReturnType = new GenericType<ListPushConfigurationsResponse>() {};

    return apiClient.invokeAPI("PushNotificationsApi.v3ApplicationsPushSettingsPut", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIv3ApplicationsPushSettingsPutRequest {
    private String apiToken;
    private V3ApplicationsPushSettingsGetRequest v3ApplicationsPushSettingsGetRequest;

    private APIv3ApplicationsPushSettingsPutRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIv3ApplicationsPushSettingsPutRequest
     */
    public APIv3ApplicationsPushSettingsPutRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set v3ApplicationsPushSettingsGetRequest
     * @param v3ApplicationsPushSettingsGetRequest  (optional)
     * @return APIv3ApplicationsPushSettingsPutRequest
     */
    public APIv3ApplicationsPushSettingsPutRequest v3ApplicationsPushSettingsGetRequest(V3ApplicationsPushSettingsGetRequest v3ApplicationsPushSettingsGetRequest) {
      this.v3ApplicationsPushSettingsGetRequest = v3ApplicationsPushSettingsGetRequest;
      return this;
    }

    /**
     * Execute v3ApplicationsPushSettingsPut request
     * @return ListPushConfigurationsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPushConfigurationsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute v3ApplicationsPushSettingsPut request with HTTP info returned
     * @return ApiResponse&lt;ListPushConfigurationsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPushConfigurationsResponse> executeWithHttpInfo() throws ApiException {
      return v3ApplicationsPushSettingsPutWithHttpInfo(apiToken, v3ApplicationsPushSettingsGetRequest);
    }
  }

  /**
   * Turn on push notifications
   * ## Turn on push notifications Determines whether to turn on the push notifications feature for an application. https://sendbird.com/docs/chat/v3/platform-api/application/managing-notifications/turn-on-push-notifications -----------------------------  
   * @return v3ApplicationsPushSettingsPutRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIv3ApplicationsPushSettingsPutRequest v3ApplicationsPushSettingsPut() throws ApiException {
    return new APIv3ApplicationsPushSettingsPutRequest();
  }
}
