import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ModerationTest {

    @Test
    @DisplayName("freeze channel")
    void testFreezeChannel() {
        Moderate moderate = new Moderate();
        moderate.freezeChannel();
    }


    @Test
    @DisplayName("report message")
    void testReportMessage() {
        Moderate moderate = new Moderate();
        moderate.reportMessage();
    }

}