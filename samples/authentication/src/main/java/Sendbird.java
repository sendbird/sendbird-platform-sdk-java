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
        createUserData.nickname("SB::test-user::Java::e2e::"+UUID.randomUUID().toString());
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

    public ListUsersResponse listUsers(String nicknameStartswith){

        try {
            String token = null;
            Integer limit = 56;
            String activeMode = "activated";
            Boolean showBot = true;
            String userIds = null;
            String nickname = null;
//            String nicknameStartswith = null;
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
