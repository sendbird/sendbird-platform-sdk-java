

# SendBirdChannelResponse

## anyOf schemas
* [SendBirdGroupChannel](SendBirdGroupChannel.md)
* [SendBirdOpenChannel](SendBirdOpenChannel.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendBirdChannelResponse;
import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdOpenChannel;

public class Example {
    public static void main(String[] args) {
        SendBirdChannelResponse exampleSendBirdChannelResponse = new SendBirdChannelResponse();

        // create a new SendBirdGroupChannel
        SendBirdGroupChannel exampleSendBirdGroupChannel = new SendBirdGroupChannel();
        // set SendBirdChannelResponse to SendBirdGroupChannel
        exampleSendBirdChannelResponse.setActualInstance(exampleSendBirdGroupChannel);
        // to get back the SendBirdGroupChannel set earlier
        SendBirdGroupChannel testSendBirdGroupChannel = (SendBirdGroupChannel) exampleSendBirdChannelResponse.getActualInstance();

        // create a new SendBirdOpenChannel
        SendBirdOpenChannel exampleSendBirdOpenChannel = new SendBirdOpenChannel();
        // set SendBirdChannelResponse to SendBirdOpenChannel
        exampleSendBirdChannelResponse.setActualInstance(exampleSendBirdOpenChannel);
        // to get back the SendBirdOpenChannel set earlier
        SendBirdOpenChannel testSendBirdOpenChannel = (SendBirdOpenChannel) exampleSendBirdChannelResponse.getActualInstance();
    }
}
```


