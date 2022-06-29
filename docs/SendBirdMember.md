

# SendBirdMember


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionStatus** | **String** |  |  [optional] |
|**friendDiscoveryKey** | **String** |  |  [optional] |
|**friendName** | **String** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**isBlockedByMe** | **Boolean** |  |  [optional] |
|**isBlockingMe** | **Boolean** |  |  [optional] |
|**isMuted** | **Boolean** |  |  [optional] |
|**lastSeenAt** | **Integer** |  |  [optional] |
|**metaData** | [**SBObject**](SBObject.md) |  |  [optional] |
|**nickname** | **String** |  |  [optional] |
|**plainProfileUrl** | **String** |  |  [optional] |
|**preferredLanguages** | **List&lt;String&gt;** |  |  [optional] |
|**profileUrl** | **String** |  |  [optional] |
|**requireAuth** | **Boolean** |  |  [optional] |
|**restrictionInfo** | [**SendBirdRestrictionInfo**](SendBirdRestrictionInfo.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**userId** | **String** |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| OPERATOR | &quot;operator&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INVITED | &quot;invited&quot; |
| JOINED | &quot;joined&quot; |



