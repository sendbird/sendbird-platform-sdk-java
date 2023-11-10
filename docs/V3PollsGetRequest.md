

# V3PollsGetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Specifies the title of a poll. The length is limited to 2,048 characters. |  [optional] |
|**options** | **List&lt;String&gt;** | Specifies an array of poll options that a user can vote for. At least one option should be provided, and the length of each option is limited to 2,000 characters. |  [optional] |
|**allowUserSuggestion** | **Boolean** | Determines whether to allow users other than the creator of the poll to add new options to the poll. (Default is false) |  [optional] |
|**allowMultipleVotes** | **Boolean** | Determines whether to allow users to vote for multiple options. (Default is false) |  [optional] |
|**closeAt** | **Long** | Specifies when the poll closes and no longer accepts votes in Unix seconds. If the value of this property is -1, the poll is open indefinitely. |  [optional] |
|**createdBy** | **String** | Specifies the unique ID of the user who creates the poll. |  [optional] |
|**data** | **Object** | Specifies a JSON object of one or more key-value items to store additional poll information. |  [optional] |



