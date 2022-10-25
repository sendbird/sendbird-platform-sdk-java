import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.SendBirdUser;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthenticationTest {

    @Test
    @DisplayName("generate session token")
    void testGenerateSessionToken() {
        Authentication auth = new Authentication();
        auth.generateSessionToken();
    }


}