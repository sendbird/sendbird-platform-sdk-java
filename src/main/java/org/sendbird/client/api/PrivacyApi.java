package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ListGdprRequestsResponse;
import org.openapitools.client.model.RegisterGdprRequestData;
import org.openapitools.client.model.RegisterGdprRequestResponse;
import org.openapitools.client.model.ViewGdprRequestByIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class PrivacyApi {
  private ApiClient apiClient;

  public PrivacyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PrivacyApi(ApiClient apiClient) {
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


private ApiResponse<Void> cancelTheRegistrationOfGdprRequestByIdWithHttpInfo(String requestId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling cancelTheRegistrationOfGdprRequestById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/privacy/gdpr/{request_id}"
      .replaceAll("\\{" + "request_id" + "\\}", apiClient.escapeString(requestId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apiToken != null)
      localVarHeaderParams.put("Api-Token", apiClient.parameterToString(apiToken));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("PrivacyApi.cancelTheRegistrationOfGdprRequestById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIcancelTheRegistrationOfGdprRequestByIdRequest {
    private String requestId;
    private String apiToken;

    private APIcancelTheRegistrationOfGdprRequestByIdRequest(String requestId) {
      this.requestId = requestId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIcancelTheRegistrationOfGdprRequestByIdRequest
     */
    public APIcancelTheRegistrationOfGdprRequestByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute cancelTheRegistrationOfGdprRequestById request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute cancelTheRegistrationOfGdprRequestById request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return cancelTheRegistrationOfGdprRequestByIdWithHttpInfo(requestId, apiToken);
    }
  }

  /**
   * Cancel the registration of a GDPR request
   * ## Cancel the registration of a GDPR request  Cancels the registration of a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-cancel-the-registration-of-a-gdpr-request ----------------------------
   * @param requestId  (required)
   * @return cancelTheRegistrationOfGdprRequestByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIcancelTheRegistrationOfGdprRequestByIdRequest cancelTheRegistrationOfGdprRequestById(String requestId) throws ApiException {
    return new APIcancelTheRegistrationOfGdprRequestByIdRequest(requestId);
  }

private ApiResponse<ListGdprRequestsResponse> listGdprRequestsWithHttpInfo(String apiToken, String token, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/privacy/gdpr";

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

    GenericType<ListGdprRequestsResponse> localVarReturnType = new GenericType<ListGdprRequestsResponse>() {};

    return apiClient.invokeAPI("PrivacyApi.listGdprRequests", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistGdprRequestsRequest {
    private String apiToken;
    private String token;
    private Integer limit;

    private APIlistGdprRequestsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIlistGdprRequestsRequest
     */
    public APIlistGdprRequestsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set token
     * @param token  (optional)
     * @return APIlistGdprRequestsRequest
     */
    public APIlistGdprRequestsRequest token(String token) {
      this.token = token;
      return this;
    }

    /**
     * Set limit
     * @param limit  (optional)
     * @return APIlistGdprRequestsRequest
     */
    public APIlistGdprRequestsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute listGdprRequests request
     * @return ListGdprRequestsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListGdprRequestsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listGdprRequests request with HTTP info returned
     * @return ApiResponse&lt;ListGdprRequestsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListGdprRequestsResponse> executeWithHttpInfo() throws ApiException {
      return listGdprRequestsWithHttpInfo(apiToken, token, limit);
    }
  }

  /**
   * List GDPR requests
   * ## List GDPR requests  Retrieves a list of GDPR requests of all types.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-list-gdpr-requests ----------------------------
   * @return listGdprRequestsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistGdprRequestsRequest listGdprRequests() throws ApiException {
    return new APIlistGdprRequestsRequest();
  }

private ApiResponse<RegisterGdprRequestResponse> registerGdprRequestWithHttpInfo(String apiToken, RegisterGdprRequestData registerGdprRequestData) throws ApiException {
    Object localVarPostBody = registerGdprRequestData;
    
    // create path and map variables
    String localVarPath = "/v3/privacy/gdpr";

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

    GenericType<RegisterGdprRequestResponse> localVarReturnType = new GenericType<RegisterGdprRequestResponse>() {};

    return apiClient.invokeAPI("PrivacyApi.registerGdprRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIregisterGdprRequestRequest {
    private String apiToken;
    private RegisterGdprRequestData registerGdprRequestData;

    private APIregisterGdprRequestRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIregisterGdprRequestRequest
     */
    public APIregisterGdprRequestRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set registerGdprRequestData
     * @param registerGdprRequestData  (optional)
     * @return APIregisterGdprRequestRequest
     */
    public APIregisterGdprRequestRequest registerGdprRequestData(RegisterGdprRequestData registerGdprRequestData) {
      this.registerGdprRequestData = registerGdprRequestData;
      return this;
    }

    /**
     * Execute registerGdprRequest request
     * @return RegisterGdprRequestResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RegisterGdprRequestResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute registerGdprRequest request with HTTP info returned
     * @return ApiResponse&lt;RegisterGdprRequestResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RegisterGdprRequestResponse> executeWithHttpInfo() throws ApiException {
      return registerGdprRequestWithHttpInfo(apiToken, registerGdprRequestData);
    }
  }

  /**
   * Register a GDPR request
   * ## Register a GDPR request  Registers a specific type of GDPR request to meet the GDPR&#39;s requirements.  &gt; __Note__: Currently, only delete and access of the user data are supported. The features for the [right to restriction of processing](https://gdpr-info.eu/art-18-gdpr/) and [right to object](https://gdpr-info.eu/art-21-gdpr/) will be available soon.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-register-a-gdpr-request
   * @return registerGdprRequestRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIregisterGdprRequestRequest registerGdprRequest() throws ApiException {
    return new APIregisterGdprRequestRequest();
  }

private ApiResponse<ViewGdprRequestByIdResponse> viewGdprRequestByIdWithHttpInfo(String requestId, String apiToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling viewGdprRequestById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/privacy/gdpr/{request_id}"
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

    GenericType<ViewGdprRequestByIdResponse> localVarReturnType = new GenericType<ViewGdprRequestByIdResponse>() {};

    return apiClient.invokeAPI("PrivacyApi.viewGdprRequestById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIviewGdprRequestByIdRequest {
    private String requestId;
    private String apiToken;

    private APIviewGdprRequestByIdRequest(String requestId) {
      this.requestId = requestId;
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIviewGdprRequestByIdRequest
     */
    public APIviewGdprRequestByIdRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Execute viewGdprRequestById request
     * @return ViewGdprRequestByIdResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ViewGdprRequestByIdResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute viewGdprRequestById request with HTTP info returned
     * @return ApiResponse&lt;ViewGdprRequestByIdResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ViewGdprRequestByIdResponse> executeWithHttpInfo() throws ApiException {
      return viewGdprRequestByIdWithHttpInfo(requestId, apiToken);
    }
  }

  /**
   * View a GDPR request
   * ## View a GDPR request  Retrieves a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-view-a-gdpr-request ----------------------------
   * @param requestId  (required)
   * @return viewGdprRequestByIdRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIviewGdprRequestByIdRequest viewGdprRequestById(String requestId) throws ApiException {
    return new APIviewGdprRequestByIdRequest(requestId);
  }
}
