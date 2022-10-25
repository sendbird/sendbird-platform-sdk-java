import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.SendBirdUser;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserManagementTest {


    @Test
    @DisplayName("manage users")
    void testManageUser() {
        UserManagement users = new UserManagement();
        SendBirdUser user = users.manageUser();

        System.out.println(user);
        assertEquals(user.getNickname(), "updated-nickname");
    }


}