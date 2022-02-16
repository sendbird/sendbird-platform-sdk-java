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
import org.openapitools.client.model.Function;

/**
 * SBObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T16:47:24.427118Z[Europe/London]")
public class SBObject {
  public static final String SERIALIZED_NAME_CONSTRUCTOR = "constructor";
  @SerializedName(SERIALIZED_NAME_CONSTRUCTOR)
  private Function constructor;

  public SBObject() { 
  }

  public SBObject constructor(Function constructor) {
    
    this.constructor = constructor;
    return this;
  }

   /**
   * Get constructor
   * @return constructor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Function getConstructor() {
    return constructor;
  }


  public void setConstructor(Function constructor) {
    this.constructor = constructor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBObject sbObject = (SBObject) o;
    return Objects.equals(this.constructor, sbObject.constructor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constructor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBObject {\n");
    sb.append("    constructor: ").append(toIndentedString(constructor)).append("\n");
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

