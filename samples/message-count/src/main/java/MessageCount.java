import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.api.AnnouncementApi;
import org.sendbird.client.api.GroupChannelApi;
import org.sendbird.client.api.MessageApi;
import org.sendbird.client.api.UserApi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MessageCount {
    public BigDecimal countUnreadMessages(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);
        Message message = new Message(defaultClient);

        SendBirdUser createUserResultA = user.createUser();
        SendBirdUser createUserResultB = user.createUser();
        List<String> userIds=new ArrayList<String>();
        userIds.add(createUserResultA.getUserId());
        userIds.add(createUserResultB.getUserId());

        SendBirdGroupChannel createChannelResult = groupChannel.createChannel(userIds);
        SendBirdMessageResponse result = message.sendMessage("group_channels",createChannelResult.getChannelUrl(), createUserResultB.getUserId(), "yo", "MESG");
        GcViewNumberOfEachMembersUnreadMessagesResponse unreadMessages = message.membersUnreadMessageCount(createChannelResult.getChannelUrl(), createUserResultA.getUserId());

        return  unreadMessages.getUnread().get(createUserResultA.getUserId());
    }
}

class GroupChannel {
    ApiClient defaultClient;
    String apiToken;
    GroupChannelApi apiInstance;
    public GroupChannel(ApiClient defaultClient){
        apiInstance = new GroupChannelApi(defaultClient);
        apiToken = Config.apiToken;

    }

    public OcDeleteChannelByUrl200Response deleteChannelByUrl(String channelUrl){

        try {
            OcDeleteChannelByUrl200Response result = apiInstance.gcDeleteChannelByUrl(channelUrl).apiToken(apiToken).execute();
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


    public GcListChannelsResponse listChannels(String nameStartswith){

        try {
            GcListChannelsResponse result = apiInstance.gcListChannels().apiToken(apiToken).distinctMode("all").showEmpty(true).showMember(true).nameStartswith(nameStartswith).execute();
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
        gcCreateChannelData.name("SB::test-gc::Java::e2e::"+ UUID.randomUUID().toString());


        gcCreateChannelData.userIds(userIds);
        gcCreateChannelData.isDistinct(false);

        try {
            SendBirdGroupChannel result = apiInstance.gcCreateChannel().apiToken(apiToken).gcCreateChannelData(gcCreateChannelData).execute();
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

        apiInstance = new UserApi(defaultClient);
        apiToken = Config.apiToken;

    }
    public SendBirdUser createUser(){
        CreateUserData createUserData = new CreateUserData(); // CreateUserData |
        createUserData.userId(UUID.randomUUID().toString());
        createUserData.nickname("SB::test-user::Java::e2e::"+UUID.randomUUID().toString());
        try {
            SendBirdUser result = apiInstance.createUser().apiToken(apiToken).createUserData(createUserData).execute();
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
            apiInstance.deleteUserById(userId).apiToken(apiToken).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }

    public ListUsersResponse listUsers(String nicknameStartswith){

        try {

            ListUsersResponse result = apiInstance.listUsers().apiToken(apiToken).activeMode("activated").nicknameStartswith(nicknameStartswith).execute();
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

class Message {
    ApiClient defaultClient;
    String apiToken;
    MessageApi apiInstance;
    public Message(ApiClient defaultClient){
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
            SendBirdMessageResponse result = apiInstance.sendMessage(channelType, channelUrl).apiToken(apiToken).sendMessageData(sendMessageData).execute();
            result);
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


    public GcViewNumberOfEachMembersUnreadMessagesResponse membersUnreadMessageCount(String channelUrl, String userIds){

        try {
            GcViewNumberOfEachMembersUnreadMessagesResponse result = apiInstance.gcViewNumberOfEachMembersUnreadMessages(channelUrl).apiToken(apiToken).userIds(userIds).execute();
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
