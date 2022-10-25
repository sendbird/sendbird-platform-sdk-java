import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.SendBirdUser;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageCountTest {
    @Test
    @DisplayName("count unread messages")
    void testCountUnreadMessages() {
        MessageCount messageCount = new MessageCount();
        BigDecimal unreadCount = messageCount.countUnreadMessages();
        System.out.println(unreadCount);
        assertEquals(unreadCount, BigDecimal.ONE);

    }

}