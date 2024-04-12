

# SendBirdMember


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionStatus** | **String** |  |  [optional] |
|**friendDiscoveryKey** | **String** |  |  [optional] |
|**friendName** | **String** |  |  [optional] |
|**isActive** | **Boolean** |  |  [optional] |
|**isMuted** | **Boolean** |  |  [optional] |
|**lastSeenAt** | **Long** |  |  [optional] |
|**nickname** | **String** |  |  [optional] |
|**plainProfileUrl** | **String** |  |  [optional] |
|**preferredLanguages** | **List&lt;String&gt;** |  |  [optional] |
|**profileUrl** | **String** |  |  [optional] |
|**requireAuth** | **Boolean** |  |  [optional] |
|**requireAuthForProfileImage** | **Boolean** |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**isOnline** | **Boolean** |  |  [optional] |
|**mutedEndAt** | **BigDecimal** |  |  [optional] |
|**mutedDescription** | **String** |  |  [optional] |
|**restrictionInfo** | [**SendBirdRestrictionInfo**](SendBirdRestrictionInfo.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**userId** | **String** |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| NONE | &quot;none&quot; |
| OPERATOR | &quot;operator&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| INVITED | &quot;invited&quot; |
| JOINED | &quot;joined&quot; |



