

# SendAMessageRequestPushMessageTemplate

Specifies the content of a push notification customized for the message. This property only applies to group channels. To choose from a push notification content template within your Sendbird application, specify a string value of default or alternative. To create a new push notification content tailored to the message being sent, use the properties listed below to specify its title and body in a nested object format. * This property overrides the application's default push notification content template or the preference chosen by the user. * This property is available when message_type is MESG or ADMM.

## oneOf schemas
* [SendAMessageRequestPushMessageTemplateOneOf](SendAMessageRequestPushMessageTemplateOneOf.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendAMessageRequestPushMessageTemplate;
import org.openapitools.client.model.SendAMessageRequestPushMessageTemplateOneOf;
import org.openapitools.client.model.String;

public class Example {
    public static void main(String[] args) {
        SendAMessageRequestPushMessageTemplate exampleSendAMessageRequestPushMessageTemplate = new SendAMessageRequestPushMessageTemplate();

        // create a new SendAMessageRequestPushMessageTemplateOneOf
        SendAMessageRequestPushMessageTemplateOneOf exampleSendAMessageRequestPushMessageTemplateOneOf = new SendAMessageRequestPushMessageTemplateOneOf();
        // set SendAMessageRequestPushMessageTemplate to SendAMessageRequestPushMessageTemplateOneOf
        exampleSendAMessageRequestPushMessageTemplate.setActualInstance(exampleSendAMessageRequestPushMessageTemplateOneOf);
        // to get back the SendAMessageRequestPushMessageTemplateOneOf set earlier
        SendAMessageRequestPushMessageTemplateOneOf testSendAMessageRequestPushMessageTemplateOneOf = (SendAMessageRequestPushMessageTemplateOneOf) exampleSendAMessageRequestPushMessageTemplate.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set SendAMessageRequestPushMessageTemplate to String
        exampleSendAMessageRequestPushMessageTemplate.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSendAMessageRequestPushMessageTemplate.getActualInstance();
    }
}
```


