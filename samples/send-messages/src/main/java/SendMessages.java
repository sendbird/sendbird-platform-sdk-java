import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.api.AnnouncementApi;
import org.sendbird.client.api.GroupChannelApi;
import org.sendbird.client.api.MessageApi;
import org.sendbird.client.api.UserApi;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SendMessages {
    public void sendMessage(){

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
        List<String> targetList=new ArrayList<String>();
        targetList.add(createChannelResult.getChannelUrl());
        // active premium in Sendbird dashboard
        message.sendMessage("group_channels",createChannelResult.getChannelUrl(),createUserResultA.getUserId(), "yo", "MESG");

        ListMessagesResponse listMessagesResult = message.listMessages(createChannelResult.getChannelUrl());

    }

    public void  sendFileMessage(){

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
        List<String> targetList=new ArrayList<String>();
        targetList.add(createChannelResult.getChannelUrl());
        // active premium in Sendbird dashboard
        SendBirdMessageResponse result = message.sendFileMessage("group_channels",createChannelResult.getChannelUrl(),createUserResultA.getUserId(), "yo", "FILE");

        "send announcment");

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



    public SendBirdGroupChannel createChannel(List userIds){
        GcCreateChannelData gcCreateChannelData = new GcCreateChannelData();
        gcCreateChannelData.name("JAVA-SDK-GROUP");


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
        createUserData.nickname("nickname");
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
        sendMessageData);

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
            SendBirdMessageResponse result = apiInstance.sendMessage(channelType, channelUrl).apiToken(apiToken).sendMessageData(sendMessageData).execute();
            result);
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
        String channelType = "group_channels";

        try {
            ListMessagesResponse result = apiInstance.listMessages(channelType, channelUrl).apiToken(apiToken).execute();
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

}

