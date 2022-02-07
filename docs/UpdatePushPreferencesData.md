

# UpdatePushPreferencesData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | Specifies the unique ID of the target user. | 
**pushTriggerOption** | **String** | Determines the type of push notification trigger to apply to the user&#39;s joined group channels. Valid values are the following:&lt;br /&gt;- all (default): when disconnected from Sendbird server, the user receives notifications for all new messages including mentioned messages the user has been mentioned in.&lt;br /&gt;- mention_only: when disconnected from Sendbird server, the user only receives notifications for messages the user has been mentioned in.&lt;br /&gt;- off: the user doesn&#39;t receive any notifications. | 
**doNotDisturb** | **Boolean** | Determines whether to pause notification messages for the user during a specific time of day. (Default: false) | 
**startHour** | **Integer** | Specifies the hour to start pausing the notifications for Do Not Disturb of the user. | 
**startMin** | **Integer** | Specifies the minute of the hour to start pausing the notifications for Do Not Disturb of the user. | 
**endHour** | **Integer** | Specifies the hour to stop pausing the notifications for Do Not Disturb of the user. | 
**endMin** | **Integer** | Specifies the minute of the hour to stop pausing the notifications for Do Not Disturb of the user. | 
**snoozeEnabled** | **Boolean** | Determines whether to snooze notification messages for the user during a specific period of time. (Default: false) | 
**snoozeStartTs** | **Integer** | Specifies the timestamp of when to start snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps). | 
**snoozeEndTs** | **Integer** | Specifies the timestamp of when to end snoozing the notifications, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps). | 
**blockPushFromBots** | **Boolean** | Determines whether to block push notifications from [all bots](/docs/chat/v3/platform-api/guides/bot-interface#2-list-bots) within the application. If the push_blocked_bot_ids is specified, notifications only from the bots in the property are blocked. (Default: false) | 
**pushBlockedBotIds** | **List&lt;Integer&gt;** | Specifies an array of one or more IDs of bots whose push notifications are blocked. This property is effective only when the block_push_from_bots is set to true. | 
**timezone** | **String** | Specifies the timezone to be applied to push preferences with a value such as UTC, Asia/Seoul, Europe/London, etc. | 
**pushSound** | **String** | Specifies the name of a sound file to be played when a push notification is delivered to your client app. | 



