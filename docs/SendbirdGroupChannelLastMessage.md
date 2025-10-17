

# SendbirdGroupChannelLastMessage

## oneOf schemas
* [SendbirdMessageResponse](SendbirdMessageResponse.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendbirdGroupChannelLastMessage;
import org.openapitools.client.model.SendbirdMessageResponse;

public class Example {
    public static void main(String[] args) {
        SendbirdGroupChannelLastMessage exampleSendbirdGroupChannelLastMessage = new SendbirdGroupChannelLastMessage();

        // create a new SendbirdMessageResponse
        SendbirdMessageResponse exampleSendbirdMessageResponse = new SendbirdMessageResponse();
        // set SendbirdGroupChannelLastMessage to SendbirdMessageResponse
        exampleSendbirdGroupChannelLastMessage.setActualInstance(exampleSendbirdMessageResponse);
        // to get back the SendbirdMessageResponse set earlier
        SendbirdMessageResponse testSendbirdMessageResponse = (SendbirdMessageResponse) exampleSendbirdGroupChannelLastMessage.getActualInstance();
    }
}
```


