

# SendBirdMessageResponseExtendedMessagePayload

## oneOf schemas
* [SendBirdExtendedMessagePayload](SendBirdExtendedMessagePayload.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendBirdMessageResponseExtendedMessagePayload;
import org.openapitools.client.model.SendBirdExtendedMessagePayload;

public class Example {
    public static void main(String[] args) {
        SendBirdMessageResponseExtendedMessagePayload exampleSendBirdMessageResponseExtendedMessagePayload = new SendBirdMessageResponseExtendedMessagePayload();

        // create a new SendBirdExtendedMessagePayload
        SendBirdExtendedMessagePayload exampleSendBirdExtendedMessagePayload = new SendBirdExtendedMessagePayload();
        // set SendBirdMessageResponseExtendedMessagePayload to SendBirdExtendedMessagePayload
        exampleSendBirdMessageResponseExtendedMessagePayload.setActualInstance(exampleSendBirdExtendedMessagePayload);
        // to get back the SendBirdExtendedMessagePayload set earlier
        SendBirdExtendedMessagePayload testSendBirdExtendedMessagePayload = (SendBirdExtendedMessagePayload) exampleSendBirdMessageResponseExtendedMessagePayload.getActualInstance();
    }
}
```


