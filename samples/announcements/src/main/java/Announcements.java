import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.client.model.*;
import org.sendbird.client.ApiException;
import org.sendbird.client.api.*;
import java.util.UUID;

public class Announcements {
    public void  sendAnnouncement(){

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);
        Announcement announcement = new Announcement(defaultClient);

        SendBirdUser createUserResultA = user.createUser();
        SendBirdUser createUserResultB = user.createUser();

        List<String> userIds=new ArrayList<String>();
        userIds.add(createUserResultA.getUserId());
        userIds.add(createUserResultB.getUserId());

        SendBirdGroupChannel createChannelResult = groupChannel.createChannel(userIds);
        List<String> targetList=new ArrayList<String>();
        targetList.add(createChannelResult.getChannelUrl());
        // active premium in Sendbird dashboard
        announcement.scheduleAnnouncement("Test", "ADMM", createUserResultA.getUserId(), "Test", "target_channels", targetList, "all");
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
            GcListChannelsResponse result = apiInstance.gcListChannels().apiToken(apiToken).limit(10).distinctMode("all").showEmpty(true).nameStartswith(nameStartswith).execute();
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
        gcCreateChannelData.name("SB::test-gc::Java::e2e::"+UUID.randomUUID().toString());

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
        System.out.println("constructor");
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
            apiInstance.deleteUserById(userId).apiToken(apiToken);
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

            ListUsersResponse result = apiInstance.listUsers().apiToken(apiToken).nicknameStartswith(nicknameStartswith).execute();
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

class Announcement {
    ApiClient defaultClient;
    String apiToken;
    AnnouncementApi apiInstance;

    public Announcement(ApiClient defaultClient) {
        System.out.println("constructor");
        apiInstance = new AnnouncementApi(defaultClient);
        apiToken = Config.apiToken;
    }

    public ScheduleAnnouncementResponse scheduleAnnouncement(String message, String type, String userId, String content, String targetAt, List<String> targetList, String channelType){
        ScheduleAnnouncementData scheduleAnnouncementData = new ScheduleAnnouncementData();
        ScheduleAnnouncementDataMessage scheduleAnnouncementDataMessage = new ScheduleAnnouncementDataMessage();

        scheduleAnnouncementDataMessage.type(type);
        scheduleAnnouncementDataMessage.userId(userId);
        scheduleAnnouncementDataMessage.content(content);


        scheduleAnnouncementData.message(scheduleAnnouncementDataMessage);
        scheduleAnnouncementData.messageType(type);
        scheduleAnnouncementData.userId(userId);
        scheduleAnnouncementData.content(content);
        scheduleAnnouncementData.targetAt(targetAt);
        scheduleAnnouncementData.targetList(targetList);
        scheduleAnnouncementData.targetChannelType(channelType);

        System.out.println(scheduleAnnouncementData);

        try {
            ScheduleAnnouncementResponse result = apiInstance.scheduleAnnouncement().apiToken(apiToken).scheduleAnnouncementData(scheduleAnnouncementData).execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#scheduleAnnouncement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        return null;
    }
}