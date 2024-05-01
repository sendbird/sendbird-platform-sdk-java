package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiResponse;
import org.sendbird.client.Configuration;
import org.sendbird.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ChooseWhichEventsToSubscribeToData;
import org.openapitools.client.model.ChooseWhichEventsToSubscribeToResponse;
import org.openapitools.client.model.RetrieveListOfSubscribedEventsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-30T22:30:42.640512+09:00[Asia/Seoul]")
public class WebhookApi {
  private ApiClient apiClient;

  public WebhookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhookApi(ApiClient apiClient) {
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


private ApiResponse<ChooseWhichEventsToSubscribeToResponse> chooseWhichEventsToSubscribeToWithHttpInfo(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData) throws ApiException {
    Object localVarPostBody = chooseWhichEventsToSubscribeToData;
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/webhook";

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

    GenericType<ChooseWhichEventsToSubscribeToResponse> localVarReturnType = new GenericType<ChooseWhichEventsToSubscribeToResponse>() {};

    return apiClient.invokeAPI("WebhookApi.chooseWhichEventsToSubscribeTo", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIchooseWhichEventsToSubscribeToRequest {
    private String apiToken;
    private ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData;

    private APIchooseWhichEventsToSubscribeToRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIchooseWhichEventsToSubscribeToRequest
     */
    public APIchooseWhichEventsToSubscribeToRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set chooseWhichEventsToSubscribeToData
     * @param chooseWhichEventsToSubscribeToData  (optional)
     * @return APIchooseWhichEventsToSubscribeToRequest
     */
    public APIchooseWhichEventsToSubscribeToRequest chooseWhichEventsToSubscribeToData(ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData) {
      this.chooseWhichEventsToSubscribeToData = chooseWhichEventsToSubscribeToData;
      return this;
    }

    /**
     * Execute chooseWhichEventsToSubscribeTo request
     * @return ChooseWhichEventsToSubscribeToResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ChooseWhichEventsToSubscribeToResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute chooseWhichEventsToSubscribeTo request with HTTP info returned
     * @return ApiResponse&lt;ChooseWhichEventsToSubscribeToResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ChooseWhichEventsToSubscribeToResponse> executeWithHttpInfo() throws ApiException {
      return chooseWhichEventsToSubscribeToWithHttpInfo(apiToken, chooseWhichEventsToSubscribeToData);
    }
  }

  /**
   * Choose which events to subscribe to
   * ## Choose which events to subscribe to  Chooses which events for your webhook server to receive payloads for. By subscribing to specific events based on your own needs, you can control the number of HTTP requests to your webhook server.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-choose-which-events-to-subscribe-to
   * @return chooseWhichEventsToSubscribeToRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIchooseWhichEventsToSubscribeToRequest chooseWhichEventsToSubscribeTo() throws ApiException {
    return new APIchooseWhichEventsToSubscribeToRequest();
  }

private ApiResponse<RetrieveListOfSubscribedEventsResponse> retrieveListOfSubscribedEventsWithHttpInfo(String apiToken, Boolean displayAllWebhookCategories) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/applications/settings/webhook";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "display_all_webhook_categories", displayAllWebhookCategories));

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

    GenericType<RetrieveListOfSubscribedEventsResponse> localVarReturnType = new GenericType<RetrieveListOfSubscribedEventsResponse>() {};

    return apiClient.invokeAPI("WebhookApi.retrieveListOfSubscribedEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrieveListOfSubscribedEventsRequest {
    private String apiToken;
    private Boolean displayAllWebhookCategories;

    private APIretrieveListOfSubscribedEventsRequest() {
    }

    /**
     * Set apiToken
     * @param apiToken  (optional)
     * @return APIretrieveListOfSubscribedEventsRequest
     */
    public APIretrieveListOfSubscribedEventsRequest apiToken(String apiToken) {
      this.apiToken = apiToken;
      return this;
    }

    /**
     * Set displayAllWebhookCategories
     * @param displayAllWebhookCategories  (optional)
     * @return APIretrieveListOfSubscribedEventsRequest
     */
    public APIretrieveListOfSubscribedEventsRequest displayAllWebhookCategories(Boolean displayAllWebhookCategories) {
      this.displayAllWebhookCategories = displayAllWebhookCategories;
      return this;
    }

    /**
     * Execute retrieveListOfSubscribedEvents request
     * @return RetrieveListOfSubscribedEventsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>
     
     */
    
    public RetrieveListOfSubscribedEventsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrieveListOfSubscribedEvents request with HTTP info returned
     * @return ApiResponse&lt;RetrieveListOfSubscribedEventsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<RetrieveListOfSubscribedEventsResponse> executeWithHttpInfo() throws ApiException {
      return retrieveListOfSubscribedEventsWithHttpInfo(apiToken, displayAllWebhookCategories);
    }
  }

  /**
   * Retrieve a list of subscribed events
   * ## Retrieve a list of subscribed events  Retrieves a list of events for your webhook server to receive payloads for.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-retrieve-a-list-of-subscribed-events ----------------------------
   * @return retrieveListOfSubscribedEventsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrieveListOfSubscribedEventsRequest retrieveListOfSubscribedEvents() throws ApiException {
    return new APIretrieveListOfSubscribedEventsRequest();
  }
}
