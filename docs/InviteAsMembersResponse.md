

# InviteAsMembersResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelUrl** | **String** |  |  |
|**countPreference** | [**CountPreferenceEnum**](#CountPreferenceEnum) |  |  [optional] |
|**coverUrl** | **String** |  |  [optional] |
|**createdAt** | **Long** |  |  [optional] |
|**createdBy** | [**SendbirdBasicUserInfo**](SendbirdBasicUserInfo.md) |  |  [optional] |
|**customType** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**deliveryReceipt** | **Object** |  |  [optional] |
|**disappearingMessage** | [**SendbirdDisappearingMessage**](SendbirdDisappearingMessage.md) |  |  [optional] |
|**freeze** | **Boolean** |  |  [optional] |
|**hasAiBot** | **Boolean** |  |  [optional] |
|**hasBot** | **Boolean** |  |  [optional] |
|**hiddenState** | [**HiddenStateEnum**](#HiddenStateEnum) |  |  [optional] |
|**ignoreProfanityFilter** | **Boolean** |  |  [optional] |
|**invitedAt** | **Long** |  |  [optional] |
|**inviter** | [**SendbirdBasicUserInfo**](SendbirdBasicUserInfo.md) |  |  [optional] |
|**isAccessCodeRequired** | **Boolean** |  |  [optional] |
|**isBroadcast** | **Boolean** |  |  [optional] |
|**isDiscoverable** | **Boolean** |  |  [optional] |
|**isDistinct** | **Boolean** |  |  [optional] |
|**isEphemeral** | **Boolean** |  |  [optional] |
|**isExclusive** | **Boolean** |  |  [optional] |
|**isHidden** | **Boolean** |  |  [optional] |
|**isMuted** | **Boolean** |  |  [optional] |
|**isPublic** | **Boolean** |  |  [optional] |
|**isPushEnabled** | **Boolean** |  |  [optional] |
|**isSuper** | **Boolean** |  |  [optional] |
|**joinedMemberCount** | **Integer** |  |  [optional] |
|**joinedTs** | **Long** |  |  [optional] |
|**lastMessage** | [**SendbirdGroupChannelLastMessage**](SendbirdGroupChannelLastMessage.md) |  |  [optional] |
|**maxLengthMessage** | **Integer** |  |  [optional] |
|**memberCount** | **Integer** |  |  [optional] |
|**memberState** | [**MemberStateEnum**](#MemberStateEnum) |  |  [optional] |
|**members** | [**List&lt;SendbirdMember&gt;**](SendbirdMember.md) |  |  [optional] |
|**messageSurvivalSeconds** | **Integer** |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**myRole** | [**MyRoleEnum**](#MyRoleEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**pushTriggerOption** | **SendbirdPushTriggerOption** |  |  [optional] |
|**readReceipt** | **Map&lt;String, Long&gt;** |  |  [optional] |
|**smsFallback** | [**SendbirdSmsFallback**](SendbirdSmsFallback.md) |  |  [optional] |
|**tsMessageOffset** | **Long** |  |  [optional] |
|**unreadMentionCount** | **Integer** |  |  [optional] |
|**unreadMessageCount** | **Integer** |  |  [optional] |
|**userLastRead** | **Long** |  |  [optional] |
|**operators** | [**List&lt;SendbirdUser&gt;**](SendbirdUser.md) |  |  [optional] |



## Enum: CountPreferenceEnum

| Name | Value |
|---- | -----|
| FALSE | &quot;false&quot; |
| ALL | &quot;all&quot; |
| UNREAD_MESSAGE_COUNT_ONLY | &quot;unread_message_count_only&quot; |
| UNREAD_MENTIONED_COUNT_ONLY | &quot;unread_mentioned_count_only&quot; |



## Enum: HiddenStateEnum

| Name | Value |
|---- | -----|
| HIDDEN_ALLOW_AUTO_UNHIDE | &quot;hidden_allow_auto_unhide&quot; |
| HIDDEN_PREVENT_AUTO_UNHIDE | &quot;hidden_prevent_auto_unhide&quot; |
| UNHIDDEN | &quot;unhidden&quot; |



## Enum: MemberStateEnum

| Name | Value |
|---- | -----|
| INVITED | &quot;invited&quot; |
| JOINED | &quot;joined&quot; |
| NONE | &quot;none&quot; |



## Enum: MyRoleEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| NONE | &quot;none&quot; |
| OPERATOR | &quot;operator&quot; |



