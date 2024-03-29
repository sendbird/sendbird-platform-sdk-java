/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.sendbird.client.api;

import org.sendbird.client.*;
import org.sendbird.client.auth.*;
import org.openapitools.client.model.V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest;
import org.openapitools.client.model.V3ScheduledMessagesCountGet200Response;
import org.openapitools.client.model.V3ScheduledMessagesGet200Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScheduledMessageApi
 */
public class ScheduledMessageApiTest {

    private final ScheduledMessageApi api = new ScheduledMessageApi();

    /**
     * Send a scheduled message immediately
     *
     * ## Send a scheduled message immediately This action sends a scheduled message immediately. A user can only send their own scheduled messages immediately. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/send-a-scheduled-message-immediately -----------------------------  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPostTest() throws ApiException {
        //String channelType = null;
        //String channelUrl = null;
        //Long scheduledMessageId = null;
        //String apiToken = null;
        //Object response = api.v3ChannelTypeChannelUrlScheduledMessagesScheduledMessageIdSendNowPost(channelType, channelUrl, scheduledMessageId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Create a scheduled message
     *
     * ## Create a scheduled message This action creates a new scheduled message. If a user leaves the channel before the scheduled time for the message to be sent, the scheduled message will be removed. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/create-a-scheduled-message -----------------------------  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v3GroupChannelsChannelUrlScheduledMessagesPostTest() throws ApiException {
        //String channelUrl = null;
        //String apiToken = null;
        //V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest = null;
        //V3ScheduledMessagesGet200Response response = api.v3GroupChannelsChannelUrlScheduledMessagesPost(channelUrl)
        //        .apiToken(apiToken)
        //        .v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Cancel a scheduled message
     *
     * ## Cancel a scheduled message This action cancels a message that a user has scheduled to send at a later time. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/cancel-a-scheduled-message -----------------------------                      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteTest() throws ApiException {
        //String channelUrl = null;
        //Long scheduledMessageId = null;
        //String apiToken = null;
        //V3ScheduledMessagesGet200Response response = api.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDelete(channelUrl, scheduledMessageId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View a scheduled message
     *
     * ## View a scheduled message This action retrieves information on a specific scheduled message. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/view-a-scheduled-message -----------------------------                      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGetTest() throws ApiException {
        //String channelUrl = null;
        //Long scheduledMessageId = null;
        //String apiToken = null;
        //V3ScheduledMessagesGet200Response response = api.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdGet(channelUrl, scheduledMessageId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a scheduled message
     *
     * ## Update a scheduled message This action updates information on a specific scheduled message. You can’t change the message type. Update operation should be done at least 5 minutes prior to the original scheduled time. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/update-a-scheduled-message -----------------------------      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPostTest() throws ApiException {
        //String channelUrl = null;
        //Long scheduledMessageId = null;
        //String apiToken = null;
        //V3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest = null;
        //V3ScheduledMessagesGet200Response response = api.v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdPost(channelUrl, scheduledMessageId)
        //        .apiToken(apiToken)
        //        .v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest(v3GroupChannelsChannelUrlScheduledMessagesScheduledMessageIdDeleteRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View number of scheduled messages
     *
     * ## View number of scheduled messages This action retrieves the total number of scheduled messages that a user has. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/view-number-of-scheduled-messages -----------------------------  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v3ScheduledMessagesCountGetTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String senderId = null;
        //List<Object> status = null;
        //String messageType = null;
        //V3ScheduledMessagesCountGet200Response response = api.v3ScheduledMessagesCountGet(channelType, channelUrl, senderId, status, messageType)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List scheduled messages
     *
     * ## List scheduled messages This action retrieves a list of scheduled messages. A user can only see the list of their own scheduled messages. https://sendbird.com/docs/chat/v3/platform-api/message/scheduled-messages/list-scheduled-messages -----------------------------  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v3ScheduledMessagesGetTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String senderId = null;
        //String token = null;
        //Integer limit = null;
        //String order = null;
        //Boolean reverse = null;
        //List<Object> status = null;
        //String messageType = null;
        //V3ScheduledMessagesGet200Response response = api.v3ScheduledMessagesGet(channelType, channelUrl, senderId, token, limit, order, reverse, status, messageType)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

}
