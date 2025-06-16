

# MigrateMessagesRequestMessagesInner

## oneOf schemas
* [MigrateMessagesAdminMessageRequest](MigrateMessagesAdminMessageRequest.md)
* [MigrateMessagesFileMessageRequest](MigrateMessagesFileMessageRequest.md)
* [MigrateMessagesTextMessageRequest](MigrateMessagesTextMessageRequest.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.MigrateMessagesRequestMessagesInner;
import org.openapitools.client.model.MigrateMessagesAdminMessageRequest;
import org.openapitools.client.model.MigrateMessagesFileMessageRequest;
import org.openapitools.client.model.MigrateMessagesTextMessageRequest;

public class Example {
    public static void main(String[] args) {
        MigrateMessagesRequestMessagesInner exampleMigrateMessagesRequestMessagesInner = new MigrateMessagesRequestMessagesInner();

        // create a new MigrateMessagesAdminMessageRequest
        MigrateMessagesAdminMessageRequest exampleMigrateMessagesAdminMessageRequest = new MigrateMessagesAdminMessageRequest();
        // set MigrateMessagesRequestMessagesInner to MigrateMessagesAdminMessageRequest
        exampleMigrateMessagesRequestMessagesInner.setActualInstance(exampleMigrateMessagesAdminMessageRequest);
        // to get back the MigrateMessagesAdminMessageRequest set earlier
        MigrateMessagesAdminMessageRequest testMigrateMessagesAdminMessageRequest = (MigrateMessagesAdminMessageRequest) exampleMigrateMessagesRequestMessagesInner.getActualInstance();

        // create a new MigrateMessagesFileMessageRequest
        MigrateMessagesFileMessageRequest exampleMigrateMessagesFileMessageRequest = new MigrateMessagesFileMessageRequest();
        // set MigrateMessagesRequestMessagesInner to MigrateMessagesFileMessageRequest
        exampleMigrateMessagesRequestMessagesInner.setActualInstance(exampleMigrateMessagesFileMessageRequest);
        // to get back the MigrateMessagesFileMessageRequest set earlier
        MigrateMessagesFileMessageRequest testMigrateMessagesFileMessageRequest = (MigrateMessagesFileMessageRequest) exampleMigrateMessagesRequestMessagesInner.getActualInstance();

        // create a new MigrateMessagesTextMessageRequest
        MigrateMessagesTextMessageRequest exampleMigrateMessagesTextMessageRequest = new MigrateMessagesTextMessageRequest();
        // set MigrateMessagesRequestMessagesInner to MigrateMessagesTextMessageRequest
        exampleMigrateMessagesRequestMessagesInner.setActualInstance(exampleMigrateMessagesTextMessageRequest);
        // to get back the MigrateMessagesTextMessageRequest set earlier
        MigrateMessagesTextMessageRequest testMigrateMessagesTextMessageRequest = (MigrateMessagesTextMessageRequest) exampleMigrateMessagesRequestMessagesInner.getActualInstance();
    }
}
```


