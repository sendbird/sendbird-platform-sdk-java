/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * UpdateUserByIdData
 */
@JsonPropertyOrder({
  UpdateUserByIdData.JSON_PROPERTY_USER_ID,
  UpdateUserByIdData.JSON_PROPERTY_NICKNAME,
  UpdateUserByIdData.JSON_PROPERTY_PROFILE_URL,
  UpdateUserByIdData.JSON_PROPERTY_PROFILE_FILE,
  UpdateUserByIdData.JSON_PROPERTY_ISSUE_ACCESS_TOKEN,
  UpdateUserByIdData.JSON_PROPERTY_ISSUE_SESSION_TOKEN,
  UpdateUserByIdData.JSON_PROPERTY_SESSION_TOKEN_EXPIRES_AT,
  UpdateUserByIdData.JSON_PROPERTY_IS_ACTIVE,
  UpdateUserByIdData.JSON_PROPERTY_LAST_SEEN_AT,
  UpdateUserByIdData.JSON_PROPERTY_DISCOVERY_KEYS,
  UpdateUserByIdData.JSON_PROPERTY_PREFERRED_LANGUAGES,
  UpdateUserByIdData.JSON_PROPERTY_LEAVE_ALL_WHEN_DEACTIVATED
})
@JsonTypeName("updateUserByIdData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T12:02:53.103168+01:00[Europe/London]")
public class UpdateUserByIdData {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_PROFILE_URL = "profile_url";
  private String profileUrl;

  public static final String JSON_PROPERTY_PROFILE_FILE = "profile_file";
  private File profileFile;

  public static final String JSON_PROPERTY_ISSUE_ACCESS_TOKEN = "issue_access_token";
  private Boolean issueAccessToken;

  public static final String JSON_PROPERTY_ISSUE_SESSION_TOKEN = "issue_session_token";
  private Boolean issueSessionToken;

  public static final String JSON_PROPERTY_SESSION_TOKEN_EXPIRES_AT = "session_token_expires_at";
  private Integer sessionTokenExpiresAt;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_LAST_SEEN_AT = "last_seen_at";
  private Integer lastSeenAt;

  public static final String JSON_PROPERTY_DISCOVERY_KEYS = "discovery_keys";
  private List<String> discoveryKeys = null;

  public static final String JSON_PROPERTY_PREFERRED_LANGUAGES = "preferred_languages";
  private List<String> preferredLanguages = null;

  public static final String JSON_PROPERTY_LEAVE_ALL_WHEN_DEACTIVATED = "leave_all_when_deactivated";
  private Boolean leaveAllWhenDeactivated;

  public UpdateUserByIdData() { 
  }

  public UpdateUserByIdData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user to update.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user to update.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UpdateUserByIdData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Specifies the user&#39;s nickname. The length is limited to 80 characters.
   * @return nickname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the user's nickname. The length is limited to 80 characters.")
  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNickname() {
    return nickname;
  }


  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public UpdateUserByIdData profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Specifies the URL of the user&#39;s profile image. The length is limited to 2,048 characters.&lt;br /&gt;&lt;br /&gt; The [domain filter](/docs/chat/v3/platform-api/guides/filter-and-moderation#2-domain-filter) filters out the request if the value of this property matches the filter&#39;s domain set.
   * @return profileUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the user's profile image. The length is limited to 2,048 characters.<br /><br /> The [domain filter](/docs/chat/v3/platform-api/guides/filter-and-moderation#2-domain-filter) filters out the request if the value of this property matches the filter's domain set.")
  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileUrl() {
    return profileUrl;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public UpdateUserByIdData profileFile(File profileFile) {
    this.profileFile = profileFile;
    return this;
  }

   /**
   * Uploads the file of the user&#39;s profile image. An acceptable image is limited to &#x60;JPG&#x60; (.jpg), &#x60;JPEG&#x60; (.jpeg), or &#x60;PNG&#x60; (.png) file of up to 25 MB.
   * @return profileFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uploads the file of the user's profile image. An acceptable image is limited to `JPG` (.jpg), `JPEG` (.jpeg), or `PNG` (.png) file of up to 25 MB.")
  @JsonProperty(JSON_PROPERTY_PROFILE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getProfileFile() {
    return profileFile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileFile(File profileFile) {
    this.profileFile = profileFile;
  }


  public UpdateUserByIdData issueAccessToken(Boolean issueAccessToken) {
    this.issueAccessToken = issueAccessToken;
    return this;
  }

   /**
   * Determines whether to revoke the existing access token and create a new one for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, an access token is not required when the user logs in. (Default: false)
   * @return issueAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to revoke the existing access token and create a new one for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, an access token is not required when the user logs in. (Default: false)")
  @JsonProperty(JSON_PROPERTY_ISSUE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIssueAccessToken() {
    return issueAccessToken;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueAccessToken(Boolean issueAccessToken) {
    this.issueAccessToken = issueAccessToken;
  }


  public UpdateUserByIdData issueSessionToken(Boolean issueSessionToken) {
    this.issueSessionToken = issueSessionToken;
    return this;
  }

   /**
   * Determines whether to add a new session token for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, a session token is not required when the user logs in. (Default: false)
   * @return issueSessionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to add a new session token for the user. If true, an opaque string token is issued and provided upon creation, which should be passed whenever the user logs in. If false, a session token is not required when the user logs in. (Default: false)")
  @JsonProperty(JSON_PROPERTY_ISSUE_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIssueSessionToken() {
    return issueSessionToken;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueSessionToken(Boolean issueSessionToken) {
    this.issueSessionToken = issueSessionToken;
  }


  public UpdateUserByIdData sessionTokenExpiresAt(Integer sessionTokenExpiresAt) {
    this.sessionTokenExpiresAt = sessionTokenExpiresAt;
    return this;
  }

   /**
   * Specifies the time for the issued session token to expire in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The length should be 13. If not specified and the issue_session_token property above is true, the value of this property is set to the sum of the current timestamp and 604800000 by default, which indicates that the token will be valid for the next 7 days starting from the current timestamp.
   * @return sessionTokenExpiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time for the issued session token to expire in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format. The length should be 13. If not specified and the issue_session_token property above is true, the value of this property is set to the sum of the current timestamp and 604800000 by default, which indicates that the token will be valid for the next 7 days starting from the current timestamp.")
  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSessionTokenExpiresAt() {
    return sessionTokenExpiresAt;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionTokenExpiresAt(Integer sessionTokenExpiresAt) {
    this.sessionTokenExpiresAt = sessionTokenExpiresAt;
  }


  public UpdateUserByIdData isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Determines whether to activate or deactivate the user within the application.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to activate or deactivate the user within the application.")
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public UpdateUserByIdData lastSeenAt(Integer lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

   /**
   * Specifies the time when the user goes offline, to indicate when they were last online, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.
   * @return lastSeenAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the time when the user goes offline, to indicate when they were last online, in [Unix milliseconds](/docs/chat/v3/platform-api/guides/miscellaneous#2-timestamps) format.")
  @JsonProperty(JSON_PROPERTY_LAST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastSeenAt() {
    return lastSeenAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeenAt(Integer lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }


  public UpdateUserByIdData discoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
    return this;
  }

  public UpdateUserByIdData addDiscoveryKeysItem(String discoveryKeysItem) {
    if (this.discoveryKeys == null) {
      this.discoveryKeys = new ArrayList<>();
    }
    this.discoveryKeys.add(discoveryKeysItem);
    return this;
  }

   /**
   * Specifies an array of unique keys of the user which is provided to Sendbird server for discovering friends. By using the keys, the server can identify and match the user with other users.
   * @return discoveryKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of unique keys of the user which is provided to Sendbird server for discovering friends. By using the keys, the server can identify and match the user with other users.")
  @JsonProperty(JSON_PROPERTY_DISCOVERY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDiscoveryKeys() {
    return discoveryKeys;
  }


  @JsonProperty(JSON_PROPERTY_DISCOVERY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
  }


  public UpdateUserByIdData preferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public UpdateUserByIdData addPreferredLanguagesItem(String preferredLanguagesItem) {
    if (this.preferredLanguages == null) {
      this.preferredLanguages = new ArrayList<>();
    }
    this.preferredLanguages.add(preferredLanguagesItem);
    return this;
  }

   /**
   * Specifies an array of one or more [language codes](/docs/chat/v3/platform-api/guides/miscellaneous#2-language-codes-for-auto-translation) to translate notification messages to preferred languages. Up to 4 languages can be set for the user. If messages are sent in one of the preferred languages, notification messages won&#39;t be translated. If messages are sent in a language other than the preferred languages, notification messages will be translated into the first language in the array. In addition, the messages translated into other preferred languages will be provided in the &#x60;sendbird&#x60; property of a notification message payload.
   * @return preferredLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies an array of one or more [language codes](/docs/chat/v3/platform-api/guides/miscellaneous#2-language-codes-for-auto-translation) to translate notification messages to preferred languages. Up to 4 languages can be set for the user. If messages are sent in one of the preferred languages, notification messages won't be translated. If messages are sent in a language other than the preferred languages, notification messages will be translated into the first language in the array. In addition, the messages translated into other preferred languages will be provided in the `sendbird` property of a notification message payload.")
  @JsonProperty(JSON_PROPERTY_PREFERRED_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPreferredLanguages() {
    return preferredLanguages;
  }


  @JsonProperty(JSON_PROPERTY_PREFERRED_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }


  public UpdateUserByIdData leaveAllWhenDeactivated(Boolean leaveAllWhenDeactivated) {
    this.leaveAllWhenDeactivated = leaveAllWhenDeactivated;
    return this;
  }

   /**
   * Determines whether the user leaves all joined group channels upon deactivation. Note that this value is true by default. Use in conjunction with the is_active property above.
   * @return leaveAllWhenDeactivated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the user leaves all joined group channels upon deactivation. Note that this value is true by default. Use in conjunction with the is_active property above.")
  @JsonProperty(JSON_PROPERTY_LEAVE_ALL_WHEN_DEACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLeaveAllWhenDeactivated() {
    return leaveAllWhenDeactivated;
  }


  @JsonProperty(JSON_PROPERTY_LEAVE_ALL_WHEN_DEACTIVATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeaveAllWhenDeactivated(Boolean leaveAllWhenDeactivated) {
    this.leaveAllWhenDeactivated = leaveAllWhenDeactivated;
  }


  /**
   * Return true if this updateUserByIdData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserByIdData updateUserByIdData = (UpdateUserByIdData) o;
    return Objects.equals(this.userId, updateUserByIdData.userId) &&
        Objects.equals(this.nickname, updateUserByIdData.nickname) &&
        Objects.equals(this.profileUrl, updateUserByIdData.profileUrl) &&
        Objects.equals(this.profileFile, updateUserByIdData.profileFile) &&
        Objects.equals(this.issueAccessToken, updateUserByIdData.issueAccessToken) &&
        Objects.equals(this.issueSessionToken, updateUserByIdData.issueSessionToken) &&
        Objects.equals(this.sessionTokenExpiresAt, updateUserByIdData.sessionTokenExpiresAt) &&
        Objects.equals(this.isActive, updateUserByIdData.isActive) &&
        Objects.equals(this.lastSeenAt, updateUserByIdData.lastSeenAt) &&
        Objects.equals(this.discoveryKeys, updateUserByIdData.discoveryKeys) &&
        Objects.equals(this.preferredLanguages, updateUserByIdData.preferredLanguages) &&
        Objects.equals(this.leaveAllWhenDeactivated, updateUserByIdData.leaveAllWhenDeactivated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, nickname, profileUrl, profileFile, issueAccessToken, issueSessionToken, sessionTokenExpiresAt, isActive, lastSeenAt, discoveryKeys, preferredLanguages, leaveAllWhenDeactivated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserByIdData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    profileFile: ").append(toIndentedString(profileFile)).append("\n");
    sb.append("    issueAccessToken: ").append(toIndentedString(issueAccessToken)).append("\n");
    sb.append("    issueSessionToken: ").append(toIndentedString(issueSessionToken)).append("\n");
    sb.append("    sessionTokenExpiresAt: ").append(toIndentedString(sessionTokenExpiresAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    discoveryKeys: ").append(toIndentedString(discoveryKeys)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    leaveAllWhenDeactivated: ").append(toIndentedString(leaveAllWhenDeactivated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

