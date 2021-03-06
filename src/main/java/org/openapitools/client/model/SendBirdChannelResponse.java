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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdGroupChannelCreatedBy;
import org.openapitools.client.model.SendBirdGroupChannelDisappearingMessage;
import org.openapitools.client.model.SendBirdGroupChannelSmsFallback;
import org.openapitools.client.model.SendBirdMember;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdOpenChannel;
import org.openapitools.client.model.SendBirdUser;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.sendbird.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-21T17:39:57.479198+01:00[Europe/London]")
public class SendBirdChannelResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SendBirdChannelResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SendBirdChannelResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SendBirdChannelResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SendBirdGroupChannel> adapterSendBirdGroupChannel = gson.getDelegateAdapter(this, TypeToken.get(SendBirdGroupChannel.class));
            final TypeAdapter<SendBirdOpenChannel> adapterSendBirdOpenChannel = gson.getDelegateAdapter(this, TypeToken.get(SendBirdOpenChannel.class));

            return (TypeAdapter<T>) new TypeAdapter<SendBirdChannelResponse>() {
                @Override
                public void write(JsonWriter out, SendBirdChannelResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SendBirdGroupChannel`
                    if (value.getActualInstance() instanceof SendBirdGroupChannel) {
                        JsonObject obj = adapterSendBirdGroupChannel.toJsonTree((SendBirdGroupChannel)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SendBirdOpenChannel`
                    if (value.getActualInstance() instanceof SendBirdOpenChannel) {
                        JsonObject obj = adapterSendBirdOpenChannel.toJsonTree((SendBirdOpenChannel)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: SendBirdGroupChannel, SendBirdOpenChannel");
                }

                @Override
                public SendBirdChannelResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize SendBirdGroupChannel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SendBirdGroupChannel.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SendBirdGroupChannel'");
                        SendBirdChannelResponse ret = new SendBirdChannelResponse();
                        ret.setActualInstance(adapterSendBirdGroupChannel.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SendBirdGroupChannel'", e);
                    }

                    // deserialize SendBirdOpenChannel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SendBirdOpenChannel.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'SendBirdOpenChannel'");
                        SendBirdChannelResponse ret = new SendBirdChannelResponse();
                        ret.setActualInstance(adapterSendBirdOpenChannel.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SendBirdOpenChannel'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for SendBirdChannelResponse: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SendBirdChannelResponse() {
        super("anyOf", Boolean.FALSE);
    }

    public SendBirdChannelResponse(SendBirdGroupChannel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SendBirdChannelResponse(SendBirdOpenChannel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SendBirdGroupChannel", new GenericType<SendBirdGroupChannel>() {
        });
        schemas.put("SendBirdOpenChannel", new GenericType<SendBirdOpenChannel>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SendBirdChannelResponse.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * SendBirdGroupChannel, SendBirdOpenChannel
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SendBirdGroupChannel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SendBirdOpenChannel) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SendBirdGroupChannel, SendBirdOpenChannel");
    }

    /**
     * Get the actual instance, which can be the following:
     * SendBirdGroupChannel, SendBirdOpenChannel
     *
     * @return The actual instance (SendBirdGroupChannel, SendBirdOpenChannel)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SendBirdGroupChannel`. If the actual instance is not `SendBirdGroupChannel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SendBirdGroupChannel`
     * @throws ClassCastException if the instance is not `SendBirdGroupChannel`
     */
    public SendBirdGroupChannel getSendBirdGroupChannel() throws ClassCastException {
        return (SendBirdGroupChannel)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SendBirdOpenChannel`. If the actual instance is not `SendBirdOpenChannel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SendBirdOpenChannel`
     * @throws ClassCastException if the instance is not `SendBirdOpenChannel`
     */
    public SendBirdOpenChannel getSendBirdOpenChannel() throws ClassCastException {
        return (SendBirdOpenChannel)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdChannelResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with SendBirdGroupChannel
    try {
      SendBirdGroupChannel.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with SendBirdOpenChannel
    try {
      SendBirdOpenChannel.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for SendBirdChannelResponse with anyOf schemas: SendBirdGroupChannel, SendBirdOpenChannel. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SendBirdChannelResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdChannelResponse
  * @throws IOException if the JSON string is invalid with respect to SendBirdChannelResponse
  */
  public static SendBirdChannelResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdChannelResponse.class);
  }

 /**
  * Convert an instance of SendBirdChannelResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

