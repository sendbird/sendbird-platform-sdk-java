

# SendBirdGroupChannel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelUrl** | **String** |  |  [optional] |
|**coverUrl** | **String** |  |  [optional] |
|**createdAt** | **Long** |  |  [optional] |
|**createdBy** | [**SendBirdGroupChannelCreatedBy**](SendBirdGroupChannelCreatedBy.md) |  |  [optional] |
|**creator** | [**SendBirdUser**](SendBirdUser.md) |  |  [optional] |
|**customType** | **String** |  |  [optional] |
|**data** | **String** |  |  [optional] |
|**disappearingMessage** | [**SendBirdGroupChannelDisappearingMessage**](SendBirdGroupChannelDisappearingMessage.md) |  |  [optional] |
|**freeze** | **Boolean** |  |  [optional] |
|**ignoreProfanityFilter** | **Boolean** |  |  [optional] |
|**hiddenState** | [**HiddenStateEnum**](#HiddenStateEnum) |  |  [optional] |
|**invitedAt** | **Long** |  |  [optional] |
|**inviter** | [**SendBirdUser**](SendBirdUser.md) |  |  [optional] |
|**isAccessCodeRequired** | **Boolean** |  |  [optional] |
|**isBroadcast** | **Boolean** |  |  [optional] |
|**isCreated** | **Boolean** |  |  [optional] |
|**isDiscoverable** | **Boolean** |  |  [optional] |
|**isDistinct** | **Boolean** |  |  [optional] |
|**isEphemeral** | **Boolean** |  |  [optional] |
|**isHidden** | **Boolean** |  |  [optional] |
|**isPublic** | **Boolean** |  |  [optional] |
|**isPushEnabled** | **Boolean** |  |  [optional] |
|**isSuper** | **Boolean** |  |  [optional] |
|**joinedAt** | **Long** |  |  [optional] |
|**joinedMemberCount** | **Long** |  |  [optional] |
|**lastMessage** | [**SendBirdMessageResponse**](SendBirdMessageResponse.md) |  |  [optional] |
|**maxLengthMessage** | **Long** |  |  [optional] |
|**memberCount** | **Long** |  |  [optional] |
|**members** | [**List&lt;SendBirdMember&gt;**](SendBirdMember.md) |  |  [optional] |
|**messageOffsetTimestamp** | **Long** |  |  [optional] |
|**messageSurvivalSeconds** | **Long** |  |  [optional] |
|**myCountPreference** | **String** |  |  [optional] |
|**myLastRead** | **Long** |  |  [optional] |
|**myMemberState** | [**MyMemberStateEnum**](#MyMemberStateEnum) |  |  [optional] |
|**myMutedState** | [**MyMutedStateEnum**](#MyMutedStateEnum) |  |  [optional] |
|**myPushTriggerOption** | [**MyPushTriggerOptionEnum**](#MyPushTriggerOptionEnum) |  |  [optional] |
|**myRole** | [**MyRoleEnum**](#MyRoleEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**operators** | **List&lt;Object&gt;** |  |  [optional] |
|**smsFallback** | [**SendBirdGroupChannelSmsFallback**](SendBirdGroupChannelSmsFallback.md) |  |  [optional] |
|**unreadMentionCount** | **Long** |  |  [optional] |
|**unreadMessageCount** | **Long** |  |  [optional] |
|**channel** | [**SendBirdGroupChannelChannel**](SendBirdGroupChannelChannel.md) |  |  [optional] |
|**readReceipt** | **Map&lt;String, Long&gt;** |  |  [optional] |



## Enum: HiddenStateEnum

| Name | Value |
|---- | -----|
| HIDDEN_ALLOW_AUTO_UNHIDE | &quot;hidden_allow_auto_unhide&quot; |
| HIDDEN_PREVENT_AUTO_UNHIDE | &quot;hidden_prevent_auto_unhide&quot; |
| UNHIDDEN | &quot;unhidden&quot; |



## Enum: MyMemberStateEnum

| Name | Value |
|---- | -----|
| INVITED | &quot;invited&quot; |
| JOINED | &quot;joined&quot; |
| NONE | &quot;none&quot; |



## Enum: MyMutedStateEnum

| Name | Value |
|---- | -----|
| MUTED | &quot;muted&quot; |
| UNMUTED | &quot;unmuted&quot; |



## Enum: MyPushTriggerOptionEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| DEFAULT | &quot;default&quot; |
| MENTION_ONLY | &quot;mention_only&quot; |
| FALSE | &quot;false&quot; |



## Enum: MyRoleEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| NONE | &quot;none&quot; |
| OPERATOR | &quot;operator&quot; |



