

# SendTextMessageRequestBodyPushMessageTemplate

Specifies the content of a push notification customized for the message. This property only applies to group channels. To choose from a push notification content template within your Sendbird application, specify a string value of default or alternative. To create a new push notification content tailored to the message being sent, use the properties listed below to specify its title and body in a nested object format. * This property overrides the application's default push notification content template or the preference chosen by the user.

## oneOf schemas
* [SendAMessageRequestPushMessageTemplateOneOf](SendAMessageRequestPushMessageTemplateOneOf.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SendTextMessageRequestBodyPushMessageTemplate;
import org.openapitools.client.model.SendAMessageRequestPushMessageTemplateOneOf;
import org.openapitools.client.model.String;

public class Example {
    public static void main(String[] args) {
        SendTextMessageRequestBodyPushMessageTemplate exampleSendTextMessageRequestBodyPushMessageTemplate = new SendTextMessageRequestBodyPushMessageTemplate();

        // create a new SendAMessageRequestPushMessageTemplateOneOf
        SendAMessageRequestPushMessageTemplateOneOf exampleSendAMessageRequestPushMessageTemplateOneOf = new SendAMessageRequestPushMessageTemplateOneOf();
        // set SendTextMessageRequestBodyPushMessageTemplate to SendAMessageRequestPushMessageTemplateOneOf
        exampleSendTextMessageRequestBodyPushMessageTemplate.setActualInstance(exampleSendAMessageRequestPushMessageTemplateOneOf);
        // to get back the SendAMessageRequestPushMessageTemplateOneOf set earlier
        SendAMessageRequestPushMessageTemplateOneOf testSendAMessageRequestPushMessageTemplateOneOf = (SendAMessageRequestPushMessageTemplateOneOf) exampleSendTextMessageRequestBodyPushMessageTemplate.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set SendTextMessageRequestBodyPushMessageTemplate to String
        exampleSendTextMessageRequestBodyPushMessageTemplate.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleSendTextMessageRequestBodyPushMessageTemplate.getActualInstance();
    }
}
```


