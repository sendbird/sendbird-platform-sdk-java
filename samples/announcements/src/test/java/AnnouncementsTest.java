import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.SendBirdUser;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AnnouncementsTest {
    @Test
    @DisplayName("send announcement")
    void testSendAnnouncement() {
        Announcements announcements = new Announcements();
        announcements.sendAnnouncement();
    }

}