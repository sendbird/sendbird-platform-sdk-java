

# UpdatePushNotificationContentTemplateData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateName** | **String** | Specifies the name of a push notification content template to update. Acceptable values are default and alternative. | 
**template** | **String** | The push notification content template of which content types to be updated and their detailed format. | 
**templateMESG** | **String** | Specifies a format for text messages. We support customization of two fields, which are the sender_name and message. These fields will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs. | 
**templateFILE** | **String** | Specifies a format for file messages. We support customization with variables including filename and file_type_friendly. When sending notification requests to FCM, HMS, or APNs, the filename will be replaced with the corresponding string value while the file_type_friendly will indicate the type of the file sent, such as &#x60;Audio&#x60;, &#x60;Image&#x60;, and &#x60;Video&#x60;. | 
**templateADMN** | **String** | Specifies a format for admin messages. We support customization of one field, which is the message. This field will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs. | 



