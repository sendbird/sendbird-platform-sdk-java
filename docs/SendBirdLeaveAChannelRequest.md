

# SendBirdLeaveAChannelRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userIds** | **List&lt;String&gt;** | Specifies an array of one or more IDs of the users to leave the channel. |  |
|**shouldLeaveAll** | **Boolean** | Determines whether to make all members leave the channel. (Default: false) |  [optional] |
|**shouldRemoveOperatorStatus** | **Boolean** | Determines whether to remove a user from the channel&#39;s operator list if the user who is leaving the channel is an operator. (Default: false) |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Specifies the reason for leaving a channel. Acceptable values are admin_removed, admin_deleted, admin_deactivated, left_by_own_choice, and channel_operator_removed. |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| LEFT_BY_OWN_CHOICE | &quot;LEFT_BY_OWN_CHOICE&quot; |
| CHANNEL_OPERATOR_REMOVED | &quot;CHANNEL_OPERATOR_REMOVED&quot; |
| ADMIN_REMOVED | &quot;ADMIN_REMOVED&quot; |
| ADMIN_DELETED | &quot;ADMIN_DELETED&quot; |
| ADMIN_DEACTIVATED | &quot;ADMIN_DEACTIVATED&quot; |



