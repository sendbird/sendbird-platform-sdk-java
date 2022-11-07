import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.api.UserApi;

import java.util.UUID;

public class Authentication {
    public void generateSessionToken(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);

        SendBirdUser createUserResultA = user.createUser();
        CreateUserTokenResponse result = user.createSessionToken(createUserResultA.getUserId());
        System.out.println(result);
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
            String token = null;
            Integer limit = 56;
            String activeMode = "activated";
            Boolean showBot = true;
            String userIds = null;
            String nickname = null;
            String metadatakey = null;
            String metadatavaluesIn = null;
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

    public CreateUserTokenResponse createSessionToken(String userId){
        CreateUserTokenData createUserTokenRequest = new CreateUserTokenData(); // CreateUserData |

        try {
            CreateUserTokenResponse result = apiInstance.createUserToken(userId).apiToken(apiToken).createUserTokenData(createUserTokenRequest).execute();
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

