

# GcUpdateChannelByUrlData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelUrl** | **String** | Specifies the URL of the channel to update. |  |
|**name** | **String** | Specifies the name of the channel, or the channel topic. The length is limited to 191 characters. |  |
|**coverUrl** | **String** | Specifies the unique URL of the cover image. The length is limited to 2,048 characters. |  |
|**coverFile** | **File** | Uploads the cover image file for the channel. |  |
|**customType** | **String** | Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views. |  |
|**data** | **String** | Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string. |  |
|**isDistinct** | **Boolean** | Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the current channel members users or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)&lt;br /&gt;&lt;br /&gt; Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name. |  |
|**isPublic** | **Boolean** | Determines whether to allow a user to join the channel without an invitation. (Default: false) |  |
|**accessCode** | **String** | This property can be used only when the channel operator wants to set an access code for a public group channel. If specified, the is_access_code_required property of the channel resource is then set to true, and the channel begins to require the specified access code to a user who attempts to join. |  |
|**operatorIds** | **List&lt;String&gt;** | Specifies an array of one or more IDs of users to register as operators of the channel. If the operators are not members of the channel yet, they need an [invitation](#2-invite-as-members) to [join](#2-join-a-channel) a privte group channel while they don&#39;t need any to join a [public](#-3-private-vs-public) group channel. The maximum allowed number of operators per channel is 100. |  |



