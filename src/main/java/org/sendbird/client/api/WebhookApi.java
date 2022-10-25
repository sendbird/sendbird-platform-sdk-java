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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
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

  /**
   * Choose which events to subscribe to
   * ## Choose which events to subscribe to  Chooses which events for your webhook server to receive payloads for. By subscribing to specific events based on your own needs, you can control the number of HTTP requests to your webhook server.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-choose-which-events-to-subscribe-to
   * @param apiToken  (required)
   * @param chooseWhichEventsToSubscribeToData  (optional)
   * @return ChooseWhichEventsToSubscribeToResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ChooseWhichEventsToSubscribeToResponse chooseWhichEventsToSubscribeTo(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData) throws ApiException {
    return chooseWhichEventsToSubscribeToWithHttpInfo(apiToken, chooseWhichEventsToSubscribeToData).getData();
  }

  /**
   * Choose which events to subscribe to
   * ## Choose which events to subscribe to  Chooses which events for your webhook server to receive payloads for. By subscribing to specific events based on your own needs, you can control the number of HTTP requests to your webhook server.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-choose-which-events-to-subscribe-to
   * @param apiToken  (required)
   * @param chooseWhichEventsToSubscribeToData  (optional)
   * @return ApiResponse&lt;ChooseWhichEventsToSubscribeToResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChooseWhichEventsToSubscribeToResponse> chooseWhichEventsToSubscribeToWithHttpInfo(String apiToken, ChooseWhichEventsToSubscribeToData chooseWhichEventsToSubscribeToData) throws ApiException {
    Object localVarPostBody = chooseWhichEventsToSubscribeToData;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling chooseWhichEventsToSubscribeTo");
    }
    
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
  /**
   * Retrieve a list of subscribed events
   * ## Retrieve a list of subscribed events  Retrieves a list of events for your webhook server to receive payloads for.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-retrieve-a-list-of-subscribed-events ----------------------------
   * @param apiToken  (required)
   * @param displayAllWebhookCategories  (optional)
   * @return RetrieveListOfSubscribedEventsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveListOfSubscribedEventsResponse retrieveListOfSubscribedEvents(String apiToken, Boolean displayAllWebhookCategories) throws ApiException {
    return retrieveListOfSubscribedEventsWithHttpInfo(apiToken, displayAllWebhookCategories).getData();
  }

  /**
   * Retrieve a list of subscribed events
   * ## Retrieve a list of subscribed events  Retrieves a list of events for your webhook server to receive payloads for.  https://sendbird.com/docs/chat/v3/platform-api/guides/webhooks#2-retrieve-a-list-of-subscribed-events ----------------------------
   * @param apiToken  (required)
   * @param displayAllWebhookCategories  (optional)
   * @return ApiResponse&lt;RetrieveListOfSubscribedEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveListOfSubscribedEventsResponse> retrieveListOfSubscribedEventsWithHttpInfo(String apiToken, Boolean displayAllWebhookCategories) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiToken' is set
    if (apiToken == null) {
      throw new ApiException(400, "Missing the required parameter 'apiToken' when calling retrieveListOfSubscribedEvents");
    }
    
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
}
