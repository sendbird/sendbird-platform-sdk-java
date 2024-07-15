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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListReportsOnMessageByIdResponseReportLogsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * ListReportsOnUserByIdResponse
 */
@JsonPropertyOrder({
  ListReportsOnUserByIdResponse.JSON_PROPERTY_REPORT_LOGS,
  ListReportsOnUserByIdResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("listReportsOnUserByIdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T20:36:02.608219+09:00[Asia/Seoul]")
public class ListReportsOnUserByIdResponse {
  public static final String JSON_PROPERTY_REPORT_LOGS = "report_logs";
  private List<ListReportsOnMessageByIdResponseReportLogsInner> reportLogs = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public ListReportsOnUserByIdResponse() { 
  }

  public ListReportsOnUserByIdResponse reportLogs(List<ListReportsOnMessageByIdResponseReportLogsInner> reportLogs) {
    this.reportLogs = reportLogs;
    return this;
  }

  public ListReportsOnUserByIdResponse addReportLogsItem(ListReportsOnMessageByIdResponseReportLogsInner reportLogsItem) {
    if (this.reportLogs == null) {
      this.reportLogs = new ArrayList<>();
    }
    this.reportLogs.add(reportLogsItem);
    return this;
  }

   /**
   * Get reportLogs
   * @return reportLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListReportsOnMessageByIdResponseReportLogsInner> getReportLogs() {
    return reportLogs;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportLogs(List<ListReportsOnMessageByIdResponseReportLogsInner> reportLogs) {
    this.reportLogs = reportLogs;
  }


  public ListReportsOnUserByIdResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  /**
   * Return true if this listReportsOnUserByIdResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListReportsOnUserByIdResponse listReportsOnUserByIdResponse = (ListReportsOnUserByIdResponse) o;
    return Objects.equals(this.reportLogs, listReportsOnUserByIdResponse.reportLogs) &&
        Objects.equals(this.next, listReportsOnUserByIdResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportLogs, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListReportsOnUserByIdResponse {\n");
    sb.append("    reportLogs: ").append(toIndentedString(reportLogs)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

