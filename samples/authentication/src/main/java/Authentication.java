import org.openapitools.client.model.CreateUserTokenResponse;
import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

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
