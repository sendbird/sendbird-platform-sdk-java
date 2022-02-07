

# UpdateAnnouncementByIdData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uniqueId** | **String** | Specifies the unique ID of the announcement to update. | 
**action** | **String** | Specifies an action to take on the announcement. If this property is updated, other specified properties in the request are not effective. Acceptable values are limited to remove, pause, resume, and cancel. The [Announcement actions](#2-update-an-announcement-3-how-to-change-announcement-status) table explains each action in detail. |  [optional]
**announcementGroup** | **String** | Specifies the name of an announcement group to retrieve. If not specified, all announcements are returned, regardless of their group. |  [optional]
**createChannel** | **Boolean** | Determines whether to create a new channel if there is no existing channel that matches with the target options including target_at and target_list. |  [optional]
**createChannelOptionsName** | **String** | Specifies the name of the channel. (Default: Group Channel) |  [optional]
**createChannelOptionsCoverUrl** | **String** | Specifies the URL of the cover image. |  [optional]
**createChannelOptionsCustomType** | **String** | Specifies the custom channel type. |  [optional]
**createChannelOptionsData** | **String** | Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string. |  [optional]
**createChannelOptionsDistinct** | **String** | Determines whether to create a [distinct](/docs/chat/v3/platform-api/guides/channel-types#2-group-channel) channel. (Default: true) |  [optional]
**messageUserId** | **String** | Specifies the unique ID of the announcement sender. |  [optional]
**messageContent** | **String** | Specifies the content of the message. |  [optional]
**messageData** | **String** | Specifies additional message information such as custom font size, font type or &#x60;JSON&#x60; formatted string. |  [optional]
**enablePush** | **Boolean** | Determines whether to turn on push notification for the announcement. If set to true, push notifications will be sent for announcements. |  [optional]
**scheduledAt** | **Integer** | Specifies the time to start the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. (Default: current timestamp) |  [optional]
**endAt** | **Integer** | Specifies the time to permanently end the announcement, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format, even if the announcement is not sent to all its targets. |  [optional]
**ceaseAt** | **String** | Specifies the time to temporarily put the announcement on hold in UTC. The string is represented in HHMM format. This property should be specified in conjunction with the resume_at below. |  [optional]
**resumeAt** | **String** | Specifies the time to automatically resume the on-hold announcement in UTC. The string is represented in HHMM format. This property should be specified in conjunction with the cease_at above. |  [optional]



