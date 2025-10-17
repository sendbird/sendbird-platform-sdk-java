

# SendBirdCreateABotRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**botCallbackUrl** | **String** |  |  |
|**botNickname** | **String** | Specifies the bot&#39;s nickname. The length is limited to 80 characters. |  |
|**botProfileUrl** | **String** |  |  |
|**botType** | **String** |  |  |
|**botUserid** | **String** | Specifies the unique ID of a bot. The length is limited to 80 characters. |  |
|**isPrivacyMode** | **Boolean** | Determines whether to forward all or specific messages to the bot in channels where the bot is a member. If set to true, only messages starting with a \&quot;/\&quot; or mentioning the bot_userid are forwarded to the bot. If set to false, all messages are forwarded. This property can help protect the privacy of users&#39; chat logs by configuring the bot to only receive messages addressed to the bot. |  |
|**channelInvitationPreference** | **Integer** |  |  [optional] |
|**enableMarkAsRead** | **Boolean** |  |  [optional] |
|**showMember** | **Boolean** |  |  [optional] |



