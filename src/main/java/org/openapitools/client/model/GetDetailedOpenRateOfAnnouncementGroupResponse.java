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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GetDetailedOpenRateOfAnnouncementGroupResponse
 */
@JsonPropertyOrder({
  GetDetailedOpenRateOfAnnouncementGroupResponse.JSON_PROPERTY_UNIQUE_ID,
  GetDetailedOpenRateOfAnnouncementGroupResponse.JSON_PROPERTY_ANNOUNCEMENT_GROUP,
  GetDetailedOpenRateOfAnnouncementGroupResponse.JSON_PROPERTY_OPEN_COUNTS,
  GetDetailedOpenRateOfAnnouncementGroupResponse.JSON_PROPERTY_OPEN_RATES,
  GetDetailedOpenRateOfAnnouncementGroupResponse.JSON_PROPERTY_CUMULATIVE_OPEN_COUNTS,
  GetDetailedOpenRateOfAnnouncementGroupResponse.JSON_PROPERTY_CUMULATIVE_OPEN_RATES
})
@JsonTypeName("getDetailedOpenRateOfAnnouncementGroupResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-12T18:55:03.914006+09:00[Asia/Seoul]")
public class GetDetailedOpenRateOfAnnouncementGroupResponse {
  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private String uniqueId;

  public static final String JSON_PROPERTY_ANNOUNCEMENT_GROUP = "announcement_group";
  private String announcementGroup;

  public static final String JSON_PROPERTY_OPEN_COUNTS = "open_counts";
  private List<BigDecimal> openCounts = null;

  public static final String JSON_PROPERTY_OPEN_RATES = "open_rates";
  private List<BigDecimal> openRates = null;

  public static final String JSON_PROPERTY_CUMULATIVE_OPEN_COUNTS = "cumulative_open_counts";
  private List<BigDecimal> cumulativeOpenCounts = null;

  public static final String JSON_PROPERTY_CUMULATIVE_OPEN_RATES = "cumulative_open_rates";
  private List<BigDecimal> cumulativeOpenRates = null;

  public GetDetailedOpenRateOfAnnouncementGroupResponse() { 
  }

  public GetDetailedOpenRateOfAnnouncementGroupResponse uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Get uniqueId
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public GetDetailedOpenRateOfAnnouncementGroupResponse announcementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
    return this;
  }

   /**
   * Get announcementGroup
   * @return announcementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnouncementGroup() {
    return announcementGroup;
  }


  @JsonProperty(JSON_PROPERTY_ANNOUNCEMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnouncementGroup(String announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public GetDetailedOpenRateOfAnnouncementGroupResponse openCounts(List<BigDecimal> openCounts) {
    this.openCounts = openCounts;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementGroupResponse addOpenCountsItem(BigDecimal openCountsItem) {
    if (this.openCounts == null) {
      this.openCounts = new ArrayList<>();
    }
    this.openCounts.add(openCountsItem);
    return this;
  }

   /**
   * Get openCounts
   * @return openCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BigDecimal> getOpenCounts() {
    return openCounts;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenCounts(List<BigDecimal> openCounts) {
    this.openCounts = openCounts;
  }


  public GetDetailedOpenRateOfAnnouncementGroupResponse openRates(List<BigDecimal> openRates) {
    this.openRates = openRates;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementGroupResponse addOpenRatesItem(BigDecimal openRatesItem) {
    if (this.openRates == null) {
      this.openRates = new ArrayList<>();
    }
    this.openRates.add(openRatesItem);
    return this;
  }

   /**
   * Get openRates
   * @return openRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BigDecimal> getOpenRates() {
    return openRates;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenRates(List<BigDecimal> openRates) {
    this.openRates = openRates;
  }


  public GetDetailedOpenRateOfAnnouncementGroupResponse cumulativeOpenCounts(List<BigDecimal> cumulativeOpenCounts) {
    this.cumulativeOpenCounts = cumulativeOpenCounts;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementGroupResponse addCumulativeOpenCountsItem(BigDecimal cumulativeOpenCountsItem) {
    if (this.cumulativeOpenCounts == null) {
      this.cumulativeOpenCounts = new ArrayList<>();
    }
    this.cumulativeOpenCounts.add(cumulativeOpenCountsItem);
    return this;
  }

   /**
   * Get cumulativeOpenCounts
   * @return cumulativeOpenCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUMULATIVE_OPEN_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BigDecimal> getCumulativeOpenCounts() {
    return cumulativeOpenCounts;
  }


  @JsonProperty(JSON_PROPERTY_CUMULATIVE_OPEN_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCumulativeOpenCounts(List<BigDecimal> cumulativeOpenCounts) {
    this.cumulativeOpenCounts = cumulativeOpenCounts;
  }


  public GetDetailedOpenRateOfAnnouncementGroupResponse cumulativeOpenRates(List<BigDecimal> cumulativeOpenRates) {
    this.cumulativeOpenRates = cumulativeOpenRates;
    return this;
  }

  public GetDetailedOpenRateOfAnnouncementGroupResponse addCumulativeOpenRatesItem(BigDecimal cumulativeOpenRatesItem) {
    if (this.cumulativeOpenRates == null) {
      this.cumulativeOpenRates = new ArrayList<>();
    }
    this.cumulativeOpenRates.add(cumulativeOpenRatesItem);
    return this;
  }

   /**
   * Get cumulativeOpenRates
   * @return cumulativeOpenRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUMULATIVE_OPEN_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BigDecimal> getCumulativeOpenRates() {
    return cumulativeOpenRates;
  }


  @JsonProperty(JSON_PROPERTY_CUMULATIVE_OPEN_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCumulativeOpenRates(List<BigDecimal> cumulativeOpenRates) {
    this.cumulativeOpenRates = cumulativeOpenRates;
  }


  /**
   * Return true if this getDetailedOpenRateOfAnnouncementGroupResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedOpenRateOfAnnouncementGroupResponse getDetailedOpenRateOfAnnouncementGroupResponse = (GetDetailedOpenRateOfAnnouncementGroupResponse) o;
    return Objects.equals(this.uniqueId, getDetailedOpenRateOfAnnouncementGroupResponse.uniqueId) &&
        Objects.equals(this.announcementGroup, getDetailedOpenRateOfAnnouncementGroupResponse.announcementGroup) &&
        Objects.equals(this.openCounts, getDetailedOpenRateOfAnnouncementGroupResponse.openCounts) &&
        Objects.equals(this.openRates, getDetailedOpenRateOfAnnouncementGroupResponse.openRates) &&
        Objects.equals(this.cumulativeOpenCounts, getDetailedOpenRateOfAnnouncementGroupResponse.cumulativeOpenCounts) &&
        Objects.equals(this.cumulativeOpenRates, getDetailedOpenRateOfAnnouncementGroupResponse.cumulativeOpenRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, announcementGroup, openCounts, openRates, cumulativeOpenCounts, cumulativeOpenRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenRateOfAnnouncementGroupResponse {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
    sb.append("    openCounts: ").append(toIndentedString(openCounts)).append("\n");
    sb.append("    openRates: ").append(toIndentedString(openRates)).append("\n");
    sb.append("    cumulativeOpenCounts: ").append(toIndentedString(cumulativeOpenCounts)).append("\n");
    sb.append("    cumulativeOpenRates: ").append(toIndentedString(cumulativeOpenRates)).append("\n");
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

