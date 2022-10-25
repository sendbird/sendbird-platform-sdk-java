import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

public class UserManagement {
    public SendBirdUser manageUser(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        SendBirdUser createUserResult = user.createUser();
        SendBirdUser updatedUserResult = user.updateUserById(createUserResult.getUserId(), "updated-nickname");
        user.deleteUserById(updatedUserResult.getUserId());
        return updatedUserResult;
    }
}
