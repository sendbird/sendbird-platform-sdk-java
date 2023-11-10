

# V3PollsPollIdVotePutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | Specifies the unique ID of a user who casts or cancels a vote. |  [optional] |
|**optionIds** | **List&lt;Integer&gt;** | Specifies the array of option IDs to cast or cancel votes. For example, if a user had voted for both Option 1 and Option 2 in a poll, you can specify this property&#39;s value as [1,2]. If the user wants to cancel the vote for Option 2 but keep the vote for Option 1, the value should be specified as [1]. If the user wants to cancel the votes for both poll options, the value should be specified as []. |  [optional] |



