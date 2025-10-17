

# SendbirdMessageResponseExtendedMessagePayload

## oneOf schemas
* [SendbirdExtendedMessagePayload](SendbirdExtendedMessagePayload.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendbirdMessageResponseExtendedMessagePayload;
import org.openapitools.client.model.SendbirdExtendedMessagePayload;

public class Example {
    public static void main(String[] args) {
        SendbirdMessageResponseExtendedMessagePayload exampleSendbirdMessageResponseExtendedMessagePayload = new SendbirdMessageResponseExtendedMessagePayload();

        // create a new SendbirdExtendedMessagePayload
        SendbirdExtendedMessagePayload exampleSendbirdExtendedMessagePayload = new SendbirdExtendedMessagePayload();
        // set SendbirdMessageResponseExtendedMessagePayload to SendbirdExtendedMessagePayload
        exampleSendbirdMessageResponseExtendedMessagePayload.setActualInstance(exampleSendbirdExtendedMessagePayload);
        // to get back the SendbirdExtendedMessagePayload set earlier
        SendbirdExtendedMessagePayload testSendbirdExtendedMessagePayload = (SendbirdExtendedMessagePayload) exampleSendbirdMessageResponseExtendedMessagePayload.getActualInstance();
    }
}
```


