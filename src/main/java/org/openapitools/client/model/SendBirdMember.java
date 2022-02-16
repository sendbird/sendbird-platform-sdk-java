/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SBObject;
import org.openapitools.client.model.SendBirdRestrictionInfo;

/**
 * SendBirdMember
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T16:47:24.427118Z[Europe/London]")
public class SendBirdMember {
  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "connection_status";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private String connectionStatus;

  public static final String SERIALIZED_NAME_FRIEND_DISCOVERY_KEY = "friend_discovery_key";
  @SerializedName(SERIALIZED_NAME_FRIEND_DISCOVERY_KEY)
  private String friendDiscoveryKey;

  public static final String SERIALIZED_NAME_FRIEND_NAME = "friend_name";
  @SerializedName(SERIALIZED_NAME_FRIEND_NAME)
  private String friendName;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_BLOCKED_BY_ME = "is_blocked_by_me";
  @SerializedName(SERIALIZED_NAME_IS_BLOCKED_BY_ME)
  private Boolean isBlockedByMe;

  public static final String SERIALIZED_NAME_IS_BLOCKING_ME = "is_blocking_me";
  @SerializedName(SERIALIZED_NAME_IS_BLOCKING_ME)
  private Boolean isBlockingMe;

  public static final String SERIALIZED_NAME_IS_MUTED = "is_muted";
  @SerializedName(SERIALIZED_NAME_IS_MUTED)
  private Boolean isMuted;

  public static final String SERIALIZED_NAME_LAST_SEEN_AT = "last_seen_at";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN_AT)
  private Integer lastSeenAt;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private SBObject metaData;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PLAIN_PROFILE_URL = "plain_profile_url";
  @SerializedName(SERIALIZED_NAME_PLAIN_PROFILE_URL)
  private String plainProfileUrl;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGES = "preferred_languages";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGES)
  private List<String> preferredLanguages = null;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_REQUIRE_AUTH = "require_auth";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH)
  private Boolean requireAuth;

  public static final String SERIALIZED_NAME_RESTRICTION_INFO = "restriction_info";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_INFO)
  private SendBirdRestrictionInfo restrictionInfo;

  /**
   * Gets or Sets role
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    NONE("none"),
    
    OPERATOR("operator");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INVITED("invited"),
    
    JOINED("joined");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public SendBirdMember() { 
  }

  public SendBirdMember connectionStatus(String connectionStatus) {
    
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionStatus() {
    return connectionStatus;
  }


  public void setConnectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
  }


  public SendBirdMember friendDiscoveryKey(String friendDiscoveryKey) {
    
    this.friendDiscoveryKey = friendDiscoveryKey;
    return this;
  }

   /**
   * Get friendDiscoveryKey
   * @return friendDiscoveryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFriendDiscoveryKey() {
    return friendDiscoveryKey;
  }


  public void setFriendDiscoveryKey(String friendDiscoveryKey) {
    this.friendDiscoveryKey = friendDiscoveryKey;
  }


  public SendBirdMember friendName(String friendName) {
    
    this.friendName = friendName;
    return this;
  }

   /**
   * Get friendName
   * @return friendName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFriendName() {
    return friendName;
  }


  public void setFriendName(String friendName) {
    this.friendName = friendName;
  }


  public SendBirdMember isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public SendBirdMember isBlockedByMe(Boolean isBlockedByMe) {
    
    this.isBlockedByMe = isBlockedByMe;
    return this;
  }

   /**
   * Get isBlockedByMe
   * @return isBlockedByMe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBlockedByMe() {
    return isBlockedByMe;
  }


  public void setIsBlockedByMe(Boolean isBlockedByMe) {
    this.isBlockedByMe = isBlockedByMe;
  }


  public SendBirdMember isBlockingMe(Boolean isBlockingMe) {
    
    this.isBlockingMe = isBlockingMe;
    return this;
  }

   /**
   * Get isBlockingMe
   * @return isBlockingMe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBlockingMe() {
    return isBlockingMe;
  }


  public void setIsBlockingMe(Boolean isBlockingMe) {
    this.isBlockingMe = isBlockingMe;
  }


  public SendBirdMember isMuted(Boolean isMuted) {
    
    this.isMuted = isMuted;
    return this;
  }

   /**
   * Get isMuted
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMuted() {
    return isMuted;
  }


  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }


  public SendBirdMember lastSeenAt(Integer lastSeenAt) {
    
    this.lastSeenAt = lastSeenAt;
    return this;
  }

   /**
   * Get lastSeenAt
   * @return lastSeenAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastSeenAt() {
    return lastSeenAt;
  }


  public void setLastSeenAt(Integer lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }


  public SendBirdMember metaData(SBObject metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SBObject getMetaData() {
    return metaData;
  }


  public void setMetaData(SBObject metaData) {
    this.metaData = metaData;
  }


  public SendBirdMember nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public SendBirdMember plainProfileUrl(String plainProfileUrl) {
    
    this.plainProfileUrl = plainProfileUrl;
    return this;
  }

   /**
   * Get plainProfileUrl
   * @return plainProfileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlainProfileUrl() {
    return plainProfileUrl;
  }


  public void setPlainProfileUrl(String plainProfileUrl) {
    this.plainProfileUrl = plainProfileUrl;
  }


  public SendBirdMember preferredLanguages(List<String> preferredLanguages) {
    
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public SendBirdMember addPreferredLanguagesItem(String preferredLanguagesItem) {
    if (this.preferredLanguages == null) {
      this.preferredLanguages = new ArrayList<String>();
    }
    this.preferredLanguages.add(preferredLanguagesItem);
    return this;
  }

   /**
   * Get preferredLanguages
   * @return preferredLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPreferredLanguages() {
    return preferredLanguages;
  }


  public void setPreferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }


  public SendBirdMember profileUrl(String profileUrl) {
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Get profileUrl
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public SendBirdMember requireAuth(Boolean requireAuth) {
    
    this.requireAuth = requireAuth;
    return this;
  }

   /**
   * Get requireAuth
   * @return requireAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequireAuth() {
    return requireAuth;
  }


  public void setRequireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
  }


  public SendBirdMember restrictionInfo(SendBirdRestrictionInfo restrictionInfo) {
    
    this.restrictionInfo = restrictionInfo;
    return this;
  }

   /**
   * Get restrictionInfo
   * @return restrictionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdRestrictionInfo getRestrictionInfo() {
    return restrictionInfo;
  }


  public void setRestrictionInfo(SendBirdRestrictionInfo restrictionInfo) {
    this.restrictionInfo = restrictionInfo;
  }


  public SendBirdMember role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public SendBirdMember state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public SendBirdMember userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdMember sendBirdMember = (SendBirdMember) o;
    return Objects.equals(this.connectionStatus, sendBirdMember.connectionStatus) &&
        Objects.equals(this.friendDiscoveryKey, sendBirdMember.friendDiscoveryKey) &&
        Objects.equals(this.friendName, sendBirdMember.friendName) &&
        Objects.equals(this.isActive, sendBirdMember.isActive) &&
        Objects.equals(this.isBlockedByMe, sendBirdMember.isBlockedByMe) &&
        Objects.equals(this.isBlockingMe, sendBirdMember.isBlockingMe) &&
        Objects.equals(this.isMuted, sendBirdMember.isMuted) &&
        Objects.equals(this.lastSeenAt, sendBirdMember.lastSeenAt) &&
        Objects.equals(this.metaData, sendBirdMember.metaData) &&
        Objects.equals(this.nickname, sendBirdMember.nickname) &&
        Objects.equals(this.plainProfileUrl, sendBirdMember.plainProfileUrl) &&
        Objects.equals(this.preferredLanguages, sendBirdMember.preferredLanguages) &&
        Objects.equals(this.profileUrl, sendBirdMember.profileUrl) &&
        Objects.equals(this.requireAuth, sendBirdMember.requireAuth) &&
        Objects.equals(this.restrictionInfo, sendBirdMember.restrictionInfo) &&
        Objects.equals(this.role, sendBirdMember.role) &&
        Objects.equals(this.state, sendBirdMember.state) &&
        Objects.equals(this.userId, sendBirdMember.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionStatus, friendDiscoveryKey, friendName, isActive, isBlockedByMe, isBlockingMe, isMuted, lastSeenAt, metaData, nickname, plainProfileUrl, preferredLanguages, profileUrl, requireAuth, restrictionInfo, role, state, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdMember {\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    friendDiscoveryKey: ").append(toIndentedString(friendDiscoveryKey)).append("\n");
    sb.append("    friendName: ").append(toIndentedString(friendName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isBlockedByMe: ").append(toIndentedString(isBlockedByMe)).append("\n");
    sb.append("    isBlockingMe: ").append(toIndentedString(isBlockingMe)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    plainProfileUrl: ").append(toIndentedString(plainProfileUrl)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    requireAuth: ").append(toIndentedString(requireAuth)).append("\n");
    sb.append("    restrictionInfo: ").append(toIndentedString(restrictionInfo)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

