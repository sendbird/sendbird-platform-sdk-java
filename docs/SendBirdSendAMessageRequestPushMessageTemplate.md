

# SendBirdSendAMessageRequestPushMessageTemplate

Specifies the content of a push notification customized for the message. This property only applies to group channels. To choose from a push notification content template within your Sendbird application, specify a string value of default or alternative. To create a new push notification content tailored to the message being sent, use the properties listed below to specify its title and body in a nested object format. * This property overrides the application's default push notification content template or the preference chosen by the user. * This property is available when message_type is MESG or ADMM.

## oneOf schemas
* [SendBirdSendAMessageRequestPushMessageTemplateOneOf](SendBirdSendAMessageRequestPushMessageTemplateOneOf.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendBirdSendAMessageRequestPushMessageTemplate;
import org.openapitools.client.model.SendBirdSendAMessageRequestPushMessageTemplateOneOf;
import org.openapitools.client.model.String;

public class Example {
    public static void main(String[] args) {
        SendBirdSendAMessageRequestPushMessageTemplate exampleSendBirdSendAMessageRequestPushMessageTemplate = new SendBirdSendAMessageRequestPushMessageTemplate();

        // create a new SendBirdSendAMessageRequestPushMessageTemplateOneOf
        SendBirdSendAMessageRequestPushMessageTemplateOneOf exampleSendBirdSendAMessageRequestPushMessageTemplateOneOf = new SendBirdSendAMessageRequestPushMessageTemplateOneOf();
        // set SendBirdSendAMessageRequestPushMessageTemplate to SendBirdSendAMessageRequestPushMessageTemplateOneOf
        exampleSendBirdSendAMessageRequestPushMessageTemplate.setActualInstance(exampleSendBirdSendAMessageRequestPushMessageTemplateOneOf);
        // to get back the SendBirdSendAMessageRequestPushMessageTemplateOneOf set earlier
        SendBirdSendAMessageRequestPushMessageTemplateOneOf testSendBirdSendAMessageRequestPushMessageTemplateOneOf = (SendBirdSendAMessageRequestPushMessageTemplateOneOf) exampleSendBirdSendAMessageRequestPushMessageTemplate.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set SendBirdSendAMessageRequestPushMessageTemplate to String
        exampleSendBirdSendAMessageRequestPushMessageTemplate.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSendBirdSendAMessageRequestPushMessageTemplate.getActualInstance();
    }
}
```


