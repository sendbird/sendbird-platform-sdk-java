

# SendBirdUpdatePushPreferencesForAChannelRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pushTriggerOption** | [**PushTriggerOptionEnum**](#PushTriggerOptionEnum) | The type of notifications trigger applies to group channels when a user is disconnected from Sendbird server. Acceptable values are the following: - default (default): Indicates that a user&#39;s notifications trigger setting applies to the specified channel. - all: Indicates that a user receives notifications for all new messages. - mention_only: Indicates that a user only receives notifications for mentioned messages. - off: Indicates that a user doesn&#39;t receive any notifications. |  |
|**pushSound** | **String** |  |  [optional] |



## Enum: PushTriggerOptionEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| ALL | &quot;all&quot; |
| MENTION_ONLY | &quot;mention_only&quot; |
| FALSE | &quot;false&quot; |



