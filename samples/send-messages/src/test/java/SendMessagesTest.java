import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.SendBirdUser;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SendMessagesTest {
    @Test
    @DisplayName("send message")
    void testSendMessage() {
        SendMessages sendMessages = new SendMessages();
        sendMessages.sendMessage();
    }

    @Test
    @DisplayName("send file message")
    void testSendFileMessage() {
        SendMessages sendMessages = new SendMessages();
        sendMessages.sendFileMessage();
    }

}