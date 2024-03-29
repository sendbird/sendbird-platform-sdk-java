import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.ListUsersResponse;
import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserManagementTest {


    @Test
    @DisplayName("manage users")
    void testManageUser() {
        UserManagement users = new UserManagement();
        SendBirdUser user = users.manageUser();

        user);
        assertEquals(user.getNickname(), "updated-nickname");
    }


}