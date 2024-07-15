

# UpdateUserByIdData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | Specifies the unique ID of the user to update. |  |
|**nickname** | **String** | Specifies the user&#39;s nickname. The length is limited to 80 characters. |  [optional] |
|**profileUrl** | **String** | Specifies the URL of the user&#39;s profile image. The length is limited to 2,048 characters.&lt;br /&gt;&lt;br /&gt; The [domain filter](/docs/chat/v3/platform-api/guides/filter-and-moderation#2-domain-filter) filters out the request if the value of this property matches the filter&#39;s domain set. |  [optional] |
|**profileFile** | **File** | Uploads the file of the user&#39;s profile image. An acceptable image is limited to &#x60;JPG&#x60; (.jpg), &#x60;JPEG&#x60; (.jpeg), or &#x60;PNG&#x60; (.png) file of up to 25 MB. |  [optional] |
|**issueAccessToken** | **Boolean** | Determines whether to revoke the existing access token and create a new one for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, an access token is not required when the user logs in. (Default: false) |  [optional] |
|**issueSessionToken** | **Boolean** | Determines whether to add a new session token for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, a session token is not required when the user logs in. (Default: false) |  [optional] |
|**sessionTokenExpiresAt** | **Integer** | Specifies the time for the issued session token to expire in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The length should be 13. If not specified and the issue_session_token property above is true, the value of this property is set to the sum of the current timestamp and 604800000 by default, which indicates that the token will be valid for the next 7 days starting from the current timestamp. |  [optional] |
|**isActive** | **Boolean** | Determines whether to activate or deactivate the user within the application. |  [optional] |
|**lastSeenAt** | **Long** | Specifies the time when the user goes offline, to indicate when they were last online, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. |  [optional] |
|**discoveryKeys** | **List&lt;String&gt;** | Specifies an array of unique keys of the user which is provided to Sendbird server for discovering friends. By using the keys, the server can identify and match the user with other users. |  [optional] |
|**preferredLanguages** | **List&lt;String&gt;** | Specifies an array of one or more [language codes](/docs/chat/v3/platform-api/guides/miscellaneous#2-language-codes-for-auto-translation) to translate notification messages to preferred languages. Up to 4 languages can be set for the user. If messages are sent in one of the preferred languages, notification messages won&#39;t be translated. If messages are sent in a language other than the preferred languages, notification messages will be translated into the first language in the array. In addition, the messages translated into other preferred languages will be provided in the &#x60;sendbird&#x60; property of a notification message payload. |  [optional] |
|**leaveAllWhenDeactivated** | **Boolean** | Determines whether the user leaves all joined group channels upon deactivation. Note that this value is true by default. Use in conjunction with the is_active property above. |  [optional] |



