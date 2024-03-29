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
import org.openapitools.client.model.BanFromChannelsWithCustomChannelTypesData;
import org.openapitools.client.model.BlockUserData;
import org.openapitools.client.model.BlockUserResponse;
import org.openapitools.client.model.GcBanUserData;
import org.openapitools.client.model.GcBanUserResponse;
import org.openapitools.client.model.GcFreezeChannelData;
import org.openapitools.client.model.GcListBannedUsersResponse;
import org.openapitools.client.model.GcListMutedUsersResponse;
import org.openapitools.client.model.GcMuteUserData;
import org.openapitools.client.model.GcUpdateBanByIdData;
import org.openapitools.client.model.GcUpdateBanByIdResponse;
import org.openapitools.client.model.GcViewBanByIdResponse;
import org.openapitools.client.model.GcViewMuteByIdResponse;
import org.openapitools.client.model.ListBannedChannelsResponse;
import org.openapitools.client.model.ListBlockedUsersResponse;
import org.openapitools.client.model.ListMutedChannelsResponse;
import org.openapitools.client.model.MuteInChannelsWithCustomChannelTypesData;
import org.openapitools.client.model.OcBanUserData;
import org.openapitools.client.model.OcBanUserResponse;
import org.openapitools.client.model.OcDeleteChannelByUrl200Response;
import org.openapitools.client.model.OcFreezeChannelData;
import org.openapitools.client.model.OcListBannedUsersResponse;
import org.openapitools.client.model.OcListMutedUsersResponse;
import org.openapitools.client.model.OcMuteUserData;
import org.openapitools.client.model.OcUpdateBanByIdData;
import org.openapitools.client.model.OcUpdateBanByIdResponse;
import org.openapitools.client.model.OcViewBanByIdResponse;
import org.openapitools.client.model.OcViewMuteByIdResponse;
import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdOpenChannel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModerationApi
 */
public class ModerationApiTest {

    private final ModerationApi api = new ModerationApi();

    /**
     * Ban from channels with custom channel types
     *
     * ## Ban from channels with custom channel types  Bans a user from channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-ban-from-channels-with-custom-channel-types ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void banFromChannelsWithCustomChannelTypesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //BanFromChannelsWithCustomChannelTypesData banFromChannelsWithCustomChannelTypesData = null;
        //Object response = api.banFromChannelsWithCustomChannelTypes(userId)
        //        .apiToken(apiToken)
        //        .banFromChannelsWithCustomChannelTypesData(banFromChannelsWithCustomChannelTypesData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Block a user
     *
     * ## Block a user  Allows a user to block another user. A user doesn&#39;t receive messages from someone they have blocked anymore. Also, blocking someone doesn&#39;t alert them that they have been blocked. Blocked users still can send messages as normal in the channel: however, they can&#39;t receive any messages from the users who have blocked them.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-block-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void blockUserTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //BlockUserData blockUserData = null;
        //BlockUserResponse response = api.blockUser(userId)
        //        .apiToken(apiToken)
        //        .blockUserData(blockUserData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Ban a user
     *
     * ## Ban a user  Bans a user from a group channel. A banned user is immediately expelled from a channel and allowed to join the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-ban-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcBanUserTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //GcBanUserData gcBanUserData = null;
        //GcBanUserResponse response = api.gcBanUser(channelUrl)
        //        .apiToken(apiToken)
        //        .gcBanUserData(gcBanUserData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Freeze a channel
     *
     * ## Freeze a channel  Freezes or unfreezes a group channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-freeze-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcFreezeChannelTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //GcFreezeChannelData gcFreezeChannelData = null;
        //SendBirdGroupChannel response = api.gcFreezeChannel(channelUrl)
        //        .apiToken(apiToken)
        //        .gcFreezeChannelData(gcFreezeChannelData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List banned users
     *
     * ## List banned users  Retrieves a list of the banned users from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcListBannedUsersTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String token = null;
        //Integer limit = null;
        //GcListBannedUsersResponse response = api.gcListBannedUsers(channelUrl)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List muted users
     *
     * ## List muted users  Retrieves a list of the muted users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcListMutedUsersTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String token = null;
        //Integer limit = null;
        //GcListMutedUsersResponse response = api.gcListMutedUsers(channelUrl)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Mute a user
     *
     * ## Mute a user  Mutes a user in a group channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-mute-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcMuteUserTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //GcMuteUserData gcMuteUserData = null;
        //SendBirdGroupChannel response = api.gcMuteUser(channelUrl)
        //        .apiToken(apiToken)
        //        .gcMuteUserData(gcMuteUserData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Unban a user
     *
     * ## Unban a user  Unbans a user from a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unban-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcUnbanUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String bannedUserId = null;
        //OcDeleteChannelByUrl200Response response = api.gcUnbanUserById(channelUrl, bannedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Unmute a user
     *
     * ## Unmute a user  Unmutes a user within a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-unmute-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcUnmuteUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String mutedUserId = null;
        //OcDeleteChannelByUrl200Response response = api.gcUnmuteUserById(channelUrl, mutedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a ban
     *
     * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of the ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-update-a-ban ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcUpdateBanByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String bannedUserId = null;
        //GcUpdateBanByIdData gcUpdateBanByIdData = null;
        //GcUpdateBanByIdResponse response = api.gcUpdateBanById(channelUrl, bannedUserId)
        //        .apiToken(apiToken)
        //        .gcUpdateBanByIdData(gcUpdateBanByIdData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View a ban
     *
     * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-ban ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcViewBanByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String bannedUserId = null;
        //GcViewBanByIdResponse response = api.gcViewBanById(channelUrl, bannedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View a mute
     *
     * ## View a mute  Checks if a user is muted in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-view-a-mute ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcViewMuteByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String mutedUserId = null;
        //GcViewMuteByIdResponse response = api.gcViewMuteById(channelUrl, mutedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List banned channels
     *
     * ## List banned channels  Retrieves a list of open and group channels with additional information where a user is banned.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-banned-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBannedChannelsTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String token = null;
        //Integer limit = null;
        //ListBannedChannelsResponse response = api.listBannedChannels(userId)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List blocked users
     *
     * ## List blocked users  Retrieves a list of other users that a user has blocked.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-blocked-users ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBlockedUsersTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String token = null;
        //Integer limit = null;
        //String userIds = null;
        //String metadatakey = null;
        //String metadatavaluesIn = null;
        //ListBlockedUsersResponse response = api.listBlockedUsers(userId)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .userIds(userIds)
        //        .metadatakey(metadatakey)
        //        .metadatavaluesIn(metadatavaluesIn)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List muted channels
     *
     * ## List muted channels  Retrieves a list of open and group channels with additional information where a user is muted.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-muted-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMutedChannelsTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String token = null;
        //Integer limit = null;
        //ListMutedChannelsResponse response = api.listMutedChannels(userId)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Mute in channels with custom channel types
     *
     * ## Mute in channels with custom channel types  Mutes a user in channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mute-in-channels-with-custom-channel-types ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void muteInChannelsWithCustomChannelTypesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //MuteInChannelsWithCustomChannelTypesData muteInChannelsWithCustomChannelTypesData = null;
        //Object response = api.muteInChannelsWithCustomChannelTypes(userId)
        //        .apiToken(apiToken)
        //        .muteInChannelsWithCustomChannelTypesData(muteInChannelsWithCustomChannelTypesData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Ban a user
     *
     * ## Ban a user  Bans a user from an open channel. A banned user is immediately expelled from a channel and allowed to participate in the channel again after a set time period.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-ban-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocBanUserTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //OcBanUserData ocBanUserData = null;
        //OcBanUserResponse response = api.ocBanUser(channelUrl)
        //        .apiToken(apiToken)
        //        .ocBanUserData(ocBanUserData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Freeze a channel
     *
     * ## Freeze a channel  Freezes or unfreezes an open channel.  &gt; __Note__: Only users designated as channel operators are allowed to talk when a channel is frozen.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-freeze-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocFreezeChannelTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //OcFreezeChannelData ocFreezeChannelData = null;
        //SendBirdOpenChannel response = api.ocFreezeChannel(channelUrl)
        //        .apiToken(apiToken)
        //        .ocFreezeChannelData(ocFreezeChannelData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List banned users
     *
     * ## List banned users  Retrieves a list of banned users from a specific open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-banned-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where to retrieve a list of banned users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocListBannedUsersTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String token = null;
        //Integer limit = null;
        //OcListBannedUsersResponse response = api.ocListBannedUsers(channelUrl)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List muted users
     *
     * ## List muted users  Retrieves a list of muted users in the channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-list-muted-users ----------------------------   &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of muted users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocListMutedUsersTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String token = null;
        //Integer limit = null;
        //OcListMutedUsersResponse response = api.ocListMutedUsers(channelUrl)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Mute a user
     *
     * ## Mute a user  Mutes a user in the channel. A muted user remains in the channel and is allowed to view the messages, but can&#39;t send any messages until unmuted.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-mute-a-user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocMuteUserTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //OcMuteUserData ocMuteUserData = null;
        //SendBirdOpenChannel response = api.ocMuteUser(channelUrl)
        //        .apiToken(apiToken)
        //        .ocMuteUserData(ocMuteUserData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Unban a user
     *
     * ## Unban a user  Unbans a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unban-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocUnbanUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String bannedUserId = null;
        //OcDeleteChannelByUrl200Response response = api.ocUnbanUserById(channelUrl, bannedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Unmute a user
     *
     * ## Unmute a user  Unmutes a user from an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-unmute-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocUnmuteUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String mutedUserId = null;
        //OcDeleteChannelByUrl200Response response = api.ocUnmuteUserById(channelUrl, mutedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a ban
     *
     * ## Update a ban  Updates details of a ban imposed on a user. You can change the length of a ban with this action, and also provide an updated description.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-update-a-ban ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocUpdateBanByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String bannedUserId = null;
        //OcUpdateBanByIdData ocUpdateBanByIdData = null;
        //OcUpdateBanByIdResponse response = api.ocUpdateBanById(channelUrl, bannedUserId)
        //        .apiToken(apiToken)
        //        .ocUpdateBanByIdData(ocUpdateBanByIdData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View a ban
     *
     * ## View a ban  Retrieves details of a ban imposed on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-ban ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocViewBanByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String bannedUserId = null;
        //OcViewBanByIdResponse response = api.ocViewBanById(channelUrl, bannedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View a mute
     *
     * ## View a mute  Checks if a user is muted in an open channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-view-a-mute ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ocViewMuteByIdTest() throws ApiException {
        //String apiToken = null;
        //String channelUrl = null;
        //String mutedUserId = null;
        //OcViewMuteByIdResponse response = api.ocViewMuteById(channelUrl, mutedUserId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Unblock a user
     *
     * ## Unblock a user  Unblocks the user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-unblock-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unblockUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String targetId = null;
        //Object response = api.unblockUserById(userId, targetId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

}
