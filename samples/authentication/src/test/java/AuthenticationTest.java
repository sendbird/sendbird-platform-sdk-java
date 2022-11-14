import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthenticationTest {

    @Test
    @DisplayName("generate session token")
    void testGenerateSessionToken() {
        Authentication auth = new Authentication();
        auth.generateSessionToken();
    }

    @AfterAll
    public static void tearDown() {
        "AbstractBaseTest.tearDown");
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);

        ListUsersResponse users = user.listUsers("SB::test-user::Java::e2e::");

        for (int i = 0; i < users.getUsers().size(); i++) {
            String userIdToDelete = users.getUsers().get(i).getUserId();
            user.deleteUserById(userIdToDelete);
        }

    }


}