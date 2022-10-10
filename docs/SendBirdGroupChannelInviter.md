

# SendBirdGroupChannelInviter

## anyOf schemas
* [SendBirdUser](SendBirdUser.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import org.openapitools.client.model.SendBirdGroupChannelInviter;
import org.openapitools.client.model.SendBirdUser;

public class Example {
    public static void main(String[] args) {
        SendBirdGroupChannelInviter exampleSendBirdGroupChannelInviter = new SendBirdGroupChannelInviter();

        // create a new SendBirdUser
        SendBirdUser exampleSendBirdUser = new SendBirdUser();
        // set SendBirdGroupChannelInviter to SendBirdUser
        exampleSendBirdGroupChannelInviter.setActualInstance(exampleSendBirdUser);
        // to get back the SendBirdUser set earlier
        SendBirdUser testSendBirdUser = (SendBirdUser) exampleSendBirdGroupChannelInviter.getActualInstance();
    }
}
```


