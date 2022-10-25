import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


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
            ScheduleAnnouncementResponse result = apiInstance.scheduleAnnouncement(apiToken, scheduleAnnouncementData);
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