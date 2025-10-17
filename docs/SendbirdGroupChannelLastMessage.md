

# SendBirdGroupChannelLastMessage

## oneOf schemas
* [SendBirdMessageResponse](SendBirdMessageResponse.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendBirdGroupChannelLastMessage;
import org.openapitools.client.model.SendBirdMessageResponse;

public class Example {
    public static void main(String[] args) {
        SendBirdGroupChannelLastMessage exampleSendBirdGroupChannelLastMessage = new SendBirdGroupChannelLastMessage();

        // create a new SendBirdMessageResponse
        SendBirdMessageResponse exampleSendBirdMessageResponse = new SendBirdMessageResponse();
        // set SendBirdGroupChannelLastMessage to SendBirdMessageResponse
        exampleSendBirdGroupChannelLastMessage.setActualInstance(exampleSendBirdMessageResponse);
        // to get back the SendBirdMessageResponse set earlier
        SendBirdMessageResponse testSendBirdMessageResponse = (SendBirdMessageResponse) exampleSendBirdGroupChannelLastMessage.getActualInstance();
    }
}
```


