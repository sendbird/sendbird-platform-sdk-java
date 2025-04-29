

# SendAMessageRequest

## oneOf schemas
* [SendAdminMessageRequestBody](SendAdminMessageRequestBody.md)
* [SendFileMessageRequestBody](SendFileMessageRequestBody.md)
* [SendTextMessageRequestBody](SendTextMessageRequestBody.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendAMessageRequest;
import org.openapitools.client.model.SendAdminMessageRequestBody;
import org.openapitools.client.model.SendFileMessageRequestBody;
import org.openapitools.client.model.SendTextMessageRequestBody;

public class Example {
    public static void main(String[] args) {
        SendAMessageRequest exampleSendAMessageRequest = new SendAMessageRequest();

        // create a new SendAdminMessageRequestBody
        SendAdminMessageRequestBody exampleSendAdminMessageRequestBody = new SendAdminMessageRequestBody();
        // set SendAMessageRequest to SendAdminMessageRequestBody
        exampleSendAMessageRequest.setActualInstance(exampleSendAdminMessageRequestBody);
        // to get back the SendAdminMessageRequestBody set earlier
        SendAdminMessageRequestBody testSendAdminMessageRequestBody = (SendAdminMessageRequestBody) exampleSendAMessageRequest.getActualInstance();

        // create a new SendFileMessageRequestBody
        SendFileMessageRequestBody exampleSendFileMessageRequestBody = new SendFileMessageRequestBody();
        // set SendAMessageRequest to SendFileMessageRequestBody
        exampleSendAMessageRequest.setActualInstance(exampleSendFileMessageRequestBody);
        // to get back the SendFileMessageRequestBody set earlier
        SendFileMessageRequestBody testSendFileMessageRequestBody = (SendFileMessageRequestBody) exampleSendAMessageRequest.getActualInstance();

        // create a new SendTextMessageRequestBody
        SendTextMessageRequestBody exampleSendTextMessageRequestBody = new SendTextMessageRequestBody();
        // set SendAMessageRequest to SendTextMessageRequestBody
        exampleSendAMessageRequest.setActualInstance(exampleSendTextMessageRequestBody);
        // to get back the SendTextMessageRequestBody set earlier
        SendTextMessageRequestBody testSendTextMessageRequestBody = (SendTextMessageRequestBody) exampleSendAMessageRequest.getActualInstance();
    }
}
```


