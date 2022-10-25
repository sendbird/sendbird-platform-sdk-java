import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class GroupChannel {
    ApiClient defaultClient;
    String apiToken;
    GroupChannelApi apiInstance;
    public GroupChannel(ApiClient defaultClient){
        apiInstance = new GroupChannelApi(defaultClient);
        apiToken = Config.apiToken;

    }

    public SendBirdGroupChannel viewChannelByUrl(String channelUrl){
        Boolean showDeliveryReceipt = false; // Boolean |
        Boolean showReadReceipt = false; // Boolean |
        Boolean showMember = true; // Boolean |
        Boolean readReceipt = true; // Boolean |
        Boolean member = true; // Boolean |
        try {
            SendBirdGroupChannel result = apiInstance.gcViewChannelByUrl(apiToken, channelUrl, showDeliveryReceipt, showReadReceipt, showMember, readReceipt, member);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcViewChannelByUrl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

        return null;
    }

    public GcListChannelsResponse listChannels(){
        String token = null; // String |
        Integer limit = 10; // Integer |
        String distinctMode = "distinct"; // String |
        String publicMode = null; // String |
        String superMode = null; // String |
        Integer createdAfter = null; // Integer |
        Integer createdBefore = null; // Integer |
        Boolean showEmpty = false; // Boolean |
        Boolean showMember = true; // Boolean |
        Boolean showDeliveryReceipt = false; // Boolean |
        Boolean showReadReceipt = true; // Boolean |
        Boolean showMetadata = true; // Boolean |
        Boolean showFrozen = false; // Boolean |
        String order = null; // String |
        String metadataOrderKey = null; // String |
        String customTypes = null; // String |
        String customTypeStartswith = null; // String |
        String channelUrls = null; // String |
        String name = null; // String |
        String nameContains = null; // String |
        String nameStartswith = null; // String |
        String membersExactlyIn = null; // String |
        String membersIncludeIn = null; // String |
        String queryType = null; // String |
        String membersNickname = null; // String |
        String membersNicknameContains = null; // String |
        String metadataKey = null; // String |
        String metadataValues = null; // String |
        String metadataValueStartswith = null; // String |
        String metacounterKey = null; // String |
        String metacounterValues = null; // String |
        String metacounterValueGt = null; // String |
        String metacounterValueGte = null; // String |
        String metacounterValueLt = null; // String |
        String metacounterValueLte = null; // String |
        Boolean includeSortedMetaarrayInLastMessage = true; // Boolean |
        String customType = null; // String |
        Boolean readReceipt = true; // Boolean |
        Boolean member = true; // Boolean |
        Boolean isDistinct = false; // Boolean |
        String membersIn = null; // String |
        String userId = null; // String |
        try {
            GcListChannelsResponse result = apiInstance.gcListChannels(apiToken, token, limit, distinctMode, publicMode, superMode, createdAfter, createdBefore, showEmpty, showMember, showDeliveryReceipt, showReadReceipt, showMetadata, showFrozen, order, metadataOrderKey, customTypes, customTypeStartswith, channelUrls, name, nameContains, nameStartswith, membersExactlyIn, membersIncludeIn, queryType, membersNickname, membersNicknameContains, metadataKey, metadataValues, metadataValueStartswith, metacounterKey, metacounterValues, metacounterValueGt, metacounterValueGte, metacounterValueLt, metacounterValueLte, includeSortedMetaarrayInLastMessage, customType, readReceipt, member, isDistinct, membersIn, userId);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcListChannels");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;

    }

    public SendBirdGroupChannel createChannel(List userIds){
        GcCreateChannelData gcCreateChannelData = new GcCreateChannelData();
        gcCreateChannelData.name("JAVA-SDK-GROUP");


        gcCreateChannelData.userIds(userIds);
        gcCreateChannelData.isDistinct(false);

        try {
            SendBirdGroupChannel result = apiInstance.gcCreateChannel(apiToken, gcCreateChannelData);
            return result;

        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcCreateChannel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

        return null;

    }

    public SendBirdGroupChannel createChannelWithUserObjects(SendBirdUser user){
        GcCreateChannelData gcCreateChannelData = new GcCreateChannelData();

        List<SendBirdUser> users=new ArrayList<SendBirdUser>();
        users.add(user);

        gcCreateChannelData.setUsers(users);
        try {
            SendBirdGroupChannel result = apiInstance.gcCreateChannel(apiToken, gcCreateChannelData);
            return result;

        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcCreateChannel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public SendBirdGroupChannel viewChannel(){
        try {
            Boolean showDeliveryReceipt=false;
            Boolean showReadReceipt=false;
            Boolean showMember=true;
            Boolean readReceipt=false;
            Boolean member=true;
            SendBirdGroupChannel result = apiInstance.gcViewChannelByUrl(apiToken, "sendbird_group_channel_37422_a4ed586747d860434545bcdfd9464b348bb08210",showDeliveryReceipt, showReadReceipt, showMember, readReceipt, member);
            return result;

        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcCreateChannel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }
}

class User {
    ApiClient defaultClient;
    String apiToken;
    UserApi apiInstance;
    public User(ApiClient defaultClient){
        System.out.println("constructor");
        apiInstance = new UserApi(defaultClient);
        apiToken = Config.apiToken;

    }
    public SendBirdUser createUser(){
        CreateUserData createUserData = new CreateUserData(); // CreateUserData |
        createUserData.userId(UUID.randomUUID().toString());
        createUserData.nickname("nickname");
        try {
            SendBirdUser result = apiInstance.createUser(apiToken, createUserData);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public SendBirdUser updateUserById(String userId, String nickname){
        UpdateUserByIdData updateUserByIdData = new UpdateUserByIdData();
        updateUserByIdData.nickname(nickname);
        try {
            SendBirdUser result = apiInstance.updateUserById(apiToken,userId, updateUserByIdData);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public SendBirdUser deleteUserById(String userId){

        try {
            apiInstance.deleteUserById(apiToken, userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public ListUsersResponse listUsers(){

        try {
            String token = null;
            Integer limit = 56;
            String activeMode = "activated";
            Boolean showBot = true;
            String userIds = null;
            String nickname = null;
            String nicknameStartswith = null;
            String metadatakey = null;
            String metadatavaluesIn = null;
            ListUsersResponse result = apiInstance.listUsers(apiToken, token, limit, activeMode, showBot, userIds, nickname, nicknameStartswith, metadatakey, metadatavaluesIn);
            return result;

        } catch (ApiException e) {
            System.err.println("Exception when calling GroupChannelApi#gcCreateChannel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public CreateUserTokenResponse createSessionToken(String userId){
        CreateUserTokenData createUserTokenRequest = new CreateUserTokenData(); // CreateUserData |

        try {
            CreateUserTokenResponse result = apiInstance.createUserToken(apiToken, userId, createUserTokenRequest);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public AddRegistrationOrDeviceTokenResponse addRegistrationOrDeviceToken(String userId){
        String tokenType = "apns"; // String |
        AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData = new AddRegistrationOrDeviceTokenData(); // AddRegistrationOrDeviceTokenData |
        addRegistrationOrDeviceTokenData.apnsDeviceToken("1234");
        try {
            AddRegistrationOrDeviceTokenResponse result = apiInstance.addRegistrationOrDeviceToken(apiToken, userId, tokenType, addRegistrationOrDeviceTokenData);
            System.out.println(result);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#addRegistrationOrDeviceToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }
}

class Message {
    ApiClient defaultClient;
    String apiToken;
    MessageApi apiInstance;
    public Message(ApiClient defaultClient){
        System.out.println("constructor");
        apiInstance = new MessageApi(defaultClient);
        apiToken = Config.apiToken;

    }

    public SendBirdMessageResponse sendMessage(String channelType, String channelUrl, String userId, String message, String messageType){

        SendMessageData sendMessageData = new SendMessageData();
        sendMessageData.channelType(channelType);
        sendMessageData.channelUrl(channelUrl);
        sendMessageData.userId(userId);
        sendMessageData.message(message);
        sendMessageData.messageType(messageType);

        try {
            SendBirdMessageResponse result = apiInstance.sendMessage(apiToken, channelType, channelUrl, sendMessageData);
            System.out.println(result);
            return  result;
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#sendMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public SendBirdMessageResponse sendFileMessage(String channelType, String channelUrl, String userId, String message, String messageType){

        SendMessageData sendMessageData = new SendMessageData();
        sendMessageData.channelType(channelType);
        // try file and url
        sendMessageData.url("https://assets.vercel.com/image/upload/v1661135356/front/next-conf-2022/og.png");
        sendMessageData.channelUrl(channelUrl);
        sendMessageData.userId(userId);
        sendMessageData.message(message);
        sendMessageData.messageType(messageType);

        try {
            SendBirdMessageResponse result = apiInstance.sendMessage(apiToken, channelType, channelUrl, sendMessageData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#sendMessage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public ListMessagesResponse listMessages(String channelUrl){
        String channelType = "group_channels"; // String |
        String messageTs = "0"; // Integer |
        Integer messageId = null; // Integer |
        Integer prevLimit = 56; // Integer |
        Integer nextLimit = 56; // Integer |
        Boolean include = true; // Boolean |
        Boolean reverse = true; // Boolean |
        String senderId = null; // String |
        String senderIds = null; // String |
        String operatorFilter = null; // String |
        String customTypes = null; // String |
        String messageType = "ADMM"; // String |
        Boolean includingRemoved = false; // Boolean |
        Boolean includeReactions = null; // Boolean |
        Boolean withSortedMetaArray = false; // Boolean |
        Boolean showSubchannelMessagesOnly = false; // Boolean |
        String userId = null; // String |
        String customType = null; // String |
        Boolean withMetaArray = false; // Boolean |
        try {
            ListMessagesResponse result = apiInstance.listMessages(apiToken, channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#listMessages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public GcViewNumberOfEachMembersUnreadMessagesResponse membersUnreadMessageCount(String channelUrl, String userIds){

        try {
            GcViewNumberOfEachMembersUnreadMessagesResponse result = apiInstance.gcViewNumberOfEachMembersUnreadMessages(apiToken, channelUrl, userIds);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#gcViewNumberOfEachMembersUnreadMessages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }
}

class Moderation {
    ApiClient defaultClient;
    String apiToken;
    ModerationApi apiInstance;
    public Moderation(ApiClient defaultClient){
        System.out.println("constructor");
        apiInstance = new ModerationApi(defaultClient);
        apiToken = Config.apiToken;

    }
    public SendBirdGroupChannel freezeChannel(String channelUrl){

        GcFreezeChannelData gcFreezeChannelData = new GcFreezeChannelData(); // GcFreezeChannelData |
        gcFreezeChannelData.freeze(true);
        try {
            SendBirdGroupChannel result = apiInstance.gcFreezeChannel(apiToken, channelUrl, gcFreezeChannelData);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling ModerationApi#gcFreezeChannel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }
}

class Report {
    ApiClient defaultClient;
    String apiToken;
    ReportApi apiInstance;
    public Report(ApiClient defaultClient){
        System.out.println("constructor");
        apiInstance = new ReportApi(defaultClient);
        apiToken = Config.apiToken;

    }
    public ReportMessageByIdResponse reportMessageById(String messageId, String channelUrl, String offendingUserId){

        String channelType = "group_channels"; // String |
        ReportMessageByIdData reportMessageByIdData = new ReportMessageByIdData(); // ReportMessageByIdData |
        reportMessageByIdData.offendingUserId(offendingUserId);
        reportMessageByIdData.reportCategory("spam");
        try {
            ReportMessageByIdResponse result = apiInstance.reportMessageById(apiToken, channelType, channelUrl, messageId, reportMessageByIdData);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportApi#reportMessageById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public ListReportsOnChannelByUrlResponse listReportsOnChannelByUrl(String channelUrl){
        String channelType = "group_channels"; // String |
        String token = null;
        Integer limit = 56; // Integer |
        try {
            ListReportsOnChannelByUrlResponse result = apiInstance.listReportsOnChannelByUrl(apiToken, channelType, channelUrl, token, limit);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportApi#listReportsOnChannelByUrl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }
}