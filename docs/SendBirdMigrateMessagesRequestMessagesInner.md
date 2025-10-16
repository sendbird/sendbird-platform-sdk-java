

# SendBirdMigrateMessagesRequestMessagesInner

## oneOf schemas
* [SendBirdMigrateMessagesAdminMessageRequest](SendBirdMigrateMessagesAdminMessageRequest.md)
* [SendBirdMigrateMessagesFileMessageRequest](SendBirdMigrateMessagesFileMessageRequest.md)
* [SendBirdMigrateMessagesTextMessageRequest](SendBirdMigrateMessagesTextMessageRequest.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendBirdMigrateMessagesRequestMessagesInner;
import org.openapitools.client.model.SendBirdMigrateMessagesAdminMessageRequest;
import org.openapitools.client.model.SendBirdMigrateMessagesFileMessageRequest;
import org.openapitools.client.model.SendBirdMigrateMessagesTextMessageRequest;

public class Example {
    public static void main(String[] args) {
        SendBirdMigrateMessagesRequestMessagesInner exampleSendBirdMigrateMessagesRequestMessagesInner = new SendBirdMigrateMessagesRequestMessagesInner();

        // create a new SendBirdMigrateMessagesAdminMessageRequest
        SendBirdMigrateMessagesAdminMessageRequest exampleSendBirdMigrateMessagesAdminMessageRequest = new SendBirdMigrateMessagesAdminMessageRequest();
        // set SendBirdMigrateMessagesRequestMessagesInner to SendBirdMigrateMessagesAdminMessageRequest
        exampleSendBirdMigrateMessagesRequestMessagesInner.setActualInstance(exampleSendBirdMigrateMessagesAdminMessageRequest);
        // to get back the SendBirdMigrateMessagesAdminMessageRequest set earlier
        SendBirdMigrateMessagesAdminMessageRequest testSendBirdMigrateMessagesAdminMessageRequest = (SendBirdMigrateMessagesAdminMessageRequest) exampleSendBirdMigrateMessagesRequestMessagesInner.getActualInstance();

        // create a new SendBirdMigrateMessagesFileMessageRequest
        SendBirdMigrateMessagesFileMessageRequest exampleSendBirdMigrateMessagesFileMessageRequest = new SendBirdMigrateMessagesFileMessageRequest();
        // set SendBirdMigrateMessagesRequestMessagesInner to SendBirdMigrateMessagesFileMessageRequest
        exampleSendBirdMigrateMessagesRequestMessagesInner.setActualInstance(exampleSendBirdMigrateMessagesFileMessageRequest);
        // to get back the SendBirdMigrateMessagesFileMessageRequest set earlier
        SendBirdMigrateMessagesFileMessageRequest testSendBirdMigrateMessagesFileMessageRequest = (SendBirdMigrateMessagesFileMessageRequest) exampleSendBirdMigrateMessagesRequestMessagesInner.getActualInstance();

        // create a new SendBirdMigrateMessagesTextMessageRequest
        SendBirdMigrateMessagesTextMessageRequest exampleSendBirdMigrateMessagesTextMessageRequest = new SendBirdMigrateMessagesTextMessageRequest();
        // set SendBirdMigrateMessagesRequestMessagesInner to SendBirdMigrateMessagesTextMessageRequest
        exampleSendBirdMigrateMessagesRequestMessagesInner.setActualInstance(exampleSendBirdMigrateMessagesTextMessageRequest);
        // to get back the SendBirdMigrateMessagesTextMessageRequest set earlier
        SendBirdMigrateMessagesTextMessageRequest testSendBirdMigrateMessagesTextMessageRequest = (SendBirdMigrateMessagesTextMessageRequest) exampleSendBirdMigrateMessagesRequestMessagesInner.getActualInstance();
    }
}
```


