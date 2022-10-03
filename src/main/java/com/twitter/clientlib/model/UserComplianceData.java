/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.twitter.clientlib.model.UserComplianceSchema;
import com.twitter.clientlib.model.UserDeleteComplianceSchema;
import com.twitter.clientlib.model.UserProfileModificationComplianceSchema;
import com.twitter.clientlib.model.UserProfileModificationObjectSchema;
import com.twitter.clientlib.model.UserProtectComplianceSchema;
import com.twitter.clientlib.model.UserScrubGeoObjectSchema;
import com.twitter.clientlib.model.UserScrubGeoSchema;
import com.twitter.clientlib.model.UserSuspendComplianceSchema;
import com.twitter.clientlib.model.UserTakedownComplianceSchema;
import com.twitter.clientlib.model.UserUndeleteComplianceSchema;
import com.twitter.clientlib.model.UserUnprotectComplianceSchema;
import com.twitter.clientlib.model.UserUnsuspendComplianceSchema;
import com.twitter.clientlib.model.UserWithheldComplianceSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import com.twitter.clientlib.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserComplianceData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UserComplianceData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UserComplianceData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UserComplianceData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UserDeleteComplianceSchema> adapterUserDeleteComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserDeleteComplianceSchema.class));
            final TypeAdapter<UserProfileModificationComplianceSchema> adapterUserProfileModificationComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserProfileModificationComplianceSchema.class));
            final TypeAdapter<UserProtectComplianceSchema> adapterUserProtectComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserProtectComplianceSchema.class));
            final TypeAdapter<UserScrubGeoSchema> adapterUserScrubGeoSchema = gson.getDelegateAdapter(this, TypeToken.get(UserScrubGeoSchema.class));
            final TypeAdapter<UserSuspendComplianceSchema> adapterUserSuspendComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserSuspendComplianceSchema.class));
            final TypeAdapter<UserUndeleteComplianceSchema> adapterUserUndeleteComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserUndeleteComplianceSchema.class));
            final TypeAdapter<UserUnprotectComplianceSchema> adapterUserUnprotectComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserUnprotectComplianceSchema.class));
            final TypeAdapter<UserUnsuspendComplianceSchema> adapterUserUnsuspendComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserUnsuspendComplianceSchema.class));
            final TypeAdapter<UserWithheldComplianceSchema> adapterUserWithheldComplianceSchema = gson.getDelegateAdapter(this, TypeToken.get(UserWithheldComplianceSchema.class));

            return (TypeAdapter<T>) new TypeAdapter<UserComplianceData>() {
                @Override
                public void write(JsonWriter out, UserComplianceData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UserDeleteComplianceSchema`
                    if (value.getActualInstance() instanceof UserDeleteComplianceSchema) {
                        JsonObject obj = adapterUserDeleteComplianceSchema.toJsonTree((UserDeleteComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserProfileModificationComplianceSchema`
                    if (value.getActualInstance() instanceof UserProfileModificationComplianceSchema) {
                        JsonObject obj = adapterUserProfileModificationComplianceSchema.toJsonTree((UserProfileModificationComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserProtectComplianceSchema`
                    if (value.getActualInstance() instanceof UserProtectComplianceSchema) {
                        JsonObject obj = adapterUserProtectComplianceSchema.toJsonTree((UserProtectComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserScrubGeoSchema`
                    if (value.getActualInstance() instanceof UserScrubGeoSchema) {
                        JsonObject obj = adapterUserScrubGeoSchema.toJsonTree((UserScrubGeoSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserSuspendComplianceSchema`
                    if (value.getActualInstance() instanceof UserSuspendComplianceSchema) {
                        JsonObject obj = adapterUserSuspendComplianceSchema.toJsonTree((UserSuspendComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserUndeleteComplianceSchema`
                    if (value.getActualInstance() instanceof UserUndeleteComplianceSchema) {
                        JsonObject obj = adapterUserUndeleteComplianceSchema.toJsonTree((UserUndeleteComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserUnprotectComplianceSchema`
                    if (value.getActualInstance() instanceof UserUnprotectComplianceSchema) {
                        JsonObject obj = adapterUserUnprotectComplianceSchema.toJsonTree((UserUnprotectComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserUnsuspendComplianceSchema`
                    if (value.getActualInstance() instanceof UserUnsuspendComplianceSchema) {
                        JsonObject obj = adapterUserUnsuspendComplianceSchema.toJsonTree((UserUnsuspendComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UserWithheldComplianceSchema`
                    if (value.getActualInstance() instanceof UserWithheldComplianceSchema) {
                        JsonObject obj = adapterUserWithheldComplianceSchema.toJsonTree((UserWithheldComplianceSchema)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UserDeleteComplianceSchema, UserProfileModificationComplianceSchema, UserProtectComplianceSchema, UserScrubGeoSchema, UserSuspendComplianceSchema, UserUndeleteComplianceSchema, UserUnprotectComplianceSchema, UserUnsuspendComplianceSchema, UserWithheldComplianceSchema");
                }

                @Override
                public UserComplianceData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UserDeleteComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserDeleteComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserDeleteComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserDeleteComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserDeleteComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserDeleteComplianceSchema'", e);
                    }

                    // deserialize UserProfileModificationComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserProfileModificationComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserProfileModificationComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserProfileModificationComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserProfileModificationComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserProfileModificationComplianceSchema'", e);
                    }

                    // deserialize UserProtectComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserProtectComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserProtectComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserProtectComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserProtectComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserProtectComplianceSchema'", e);
                    }

                    // deserialize UserScrubGeoSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserScrubGeoSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserScrubGeoSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserScrubGeoSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserScrubGeoSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserScrubGeoSchema'", e);
                    }

                    // deserialize UserSuspendComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserSuspendComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserSuspendComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserSuspendComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserSuspendComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserSuspendComplianceSchema'", e);
                    }

                    // deserialize UserUndeleteComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserUndeleteComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserUndeleteComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserUndeleteComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserUndeleteComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserUndeleteComplianceSchema'", e);
                    }

                    // deserialize UserUnprotectComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserUnprotectComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserUnprotectComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserUnprotectComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserUnprotectComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserUnprotectComplianceSchema'", e);
                    }

                    // deserialize UserUnsuspendComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserUnsuspendComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserUnsuspendComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserUnsuspendComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserUnsuspendComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserUnsuspendComplianceSchema'", e);
                    }

                    // deserialize UserWithheldComplianceSchema
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UserWithheldComplianceSchema.validateJsonObject(jsonObject);
                        actualAdapter = adapterUserWithheldComplianceSchema;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UserWithheldComplianceSchema'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UserWithheldComplianceSchema failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UserWithheldComplianceSchema'", e);
                    }

                    if (match == 1) {
                        UserComplianceData ret = new UserComplianceData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UserComplianceData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UserComplianceData() {
        super("oneOf", Boolean.FALSE);
    }

    public UserComplianceData(UserDeleteComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserProfileModificationComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserProtectComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserScrubGeoSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserSuspendComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserUndeleteComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserUnprotectComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserUnsuspendComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UserComplianceData(UserWithheldComplianceSchema o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UserDeleteComplianceSchema", new GenericType<UserDeleteComplianceSchema>() {
        });
        schemas.put("UserProfileModificationComplianceSchema", new GenericType<UserProfileModificationComplianceSchema>() {
        });
        schemas.put("UserProtectComplianceSchema", new GenericType<UserProtectComplianceSchema>() {
        });
        schemas.put("UserScrubGeoSchema", new GenericType<UserScrubGeoSchema>() {
        });
        schemas.put("UserSuspendComplianceSchema", new GenericType<UserSuspendComplianceSchema>() {
        });
        schemas.put("UserUndeleteComplianceSchema", new GenericType<UserUndeleteComplianceSchema>() {
        });
        schemas.put("UserUnprotectComplianceSchema", new GenericType<UserUnprotectComplianceSchema>() {
        });
        schemas.put("UserUnsuspendComplianceSchema", new GenericType<UserUnsuspendComplianceSchema>() {
        });
        schemas.put("UserWithheldComplianceSchema", new GenericType<UserWithheldComplianceSchema>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UserComplianceData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UserDeleteComplianceSchema, UserProfileModificationComplianceSchema, UserProtectComplianceSchema, UserScrubGeoSchema, UserSuspendComplianceSchema, UserUndeleteComplianceSchema, UserUnprotectComplianceSchema, UserUnsuspendComplianceSchema, UserWithheldComplianceSchema
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UserDeleteComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserProfileModificationComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserProtectComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserScrubGeoSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserSuspendComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserUndeleteComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserUnprotectComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserUnsuspendComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UserWithheldComplianceSchema) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UserDeleteComplianceSchema, UserProfileModificationComplianceSchema, UserProtectComplianceSchema, UserScrubGeoSchema, UserSuspendComplianceSchema, UserUndeleteComplianceSchema, UserUnprotectComplianceSchema, UserUnsuspendComplianceSchema, UserWithheldComplianceSchema");
    }

    /**
     * Get the actual instance, which can be the following:
     * UserDeleteComplianceSchema, UserProfileModificationComplianceSchema, UserProtectComplianceSchema, UserScrubGeoSchema, UserSuspendComplianceSchema, UserUndeleteComplianceSchema, UserUnprotectComplianceSchema, UserUnsuspendComplianceSchema, UserWithheldComplianceSchema
     *
     * @return The actual instance (UserDeleteComplianceSchema, UserProfileModificationComplianceSchema, UserProtectComplianceSchema, UserScrubGeoSchema, UserSuspendComplianceSchema, UserUndeleteComplianceSchema, UserUnprotectComplianceSchema, UserUnsuspendComplianceSchema, UserWithheldComplianceSchema)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserDeleteComplianceSchema`. If the actual instance is not `UserDeleteComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserDeleteComplianceSchema`
     * @throws ClassCastException if the instance is not `UserDeleteComplianceSchema`
     */
    public UserDeleteComplianceSchema getUserDeleteComplianceSchema() throws ClassCastException {
        return (UserDeleteComplianceSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserProfileModificationComplianceSchema`. If the actual instance is not `UserProfileModificationComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserProfileModificationComplianceSchema`
     * @throws ClassCastException if the instance is not `UserProfileModificationComplianceSchema`
     */
    public UserProfileModificationComplianceSchema getUserProfileModificationComplianceSchema() throws ClassCastException {
        return (UserProfileModificationComplianceSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserProtectComplianceSchema`. If the actual instance is not `UserProtectComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserProtectComplianceSchema`
     * @throws ClassCastException if the instance is not `UserProtectComplianceSchema`
     */
    public UserProtectComplianceSchema getUserProtectComplianceSchema() throws ClassCastException {
        return (UserProtectComplianceSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserScrubGeoSchema`. If the actual instance is not `UserScrubGeoSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserScrubGeoSchema`
     * @throws ClassCastException if the instance is not `UserScrubGeoSchema`
     */
    public UserScrubGeoSchema getUserScrubGeoSchema() throws ClassCastException {
        return (UserScrubGeoSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserSuspendComplianceSchema`. If the actual instance is not `UserSuspendComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserSuspendComplianceSchema`
     * @throws ClassCastException if the instance is not `UserSuspendComplianceSchema`
     */
    public UserSuspendComplianceSchema getUserSuspendComplianceSchema() throws ClassCastException {
        return (UserSuspendComplianceSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserUndeleteComplianceSchema`. If the actual instance is not `UserUndeleteComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserUndeleteComplianceSchema`
     * @throws ClassCastException if the instance is not `UserUndeleteComplianceSchema`
     */
    public UserUndeleteComplianceSchema getUserUndeleteComplianceSchema() throws ClassCastException {
        return (UserUndeleteComplianceSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserUnprotectComplianceSchema`. If the actual instance is not `UserUnprotectComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserUnprotectComplianceSchema`
     * @throws ClassCastException if the instance is not `UserUnprotectComplianceSchema`
     */
    public UserUnprotectComplianceSchema getUserUnprotectComplianceSchema() throws ClassCastException {
        return (UserUnprotectComplianceSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserUnsuspendComplianceSchema`. If the actual instance is not `UserUnsuspendComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserUnsuspendComplianceSchema`
     * @throws ClassCastException if the instance is not `UserUnsuspendComplianceSchema`
     */
    public UserUnsuspendComplianceSchema getUserUnsuspendComplianceSchema() throws ClassCastException {
        return (UserUnsuspendComplianceSchema)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UserWithheldComplianceSchema`. If the actual instance is not `UserWithheldComplianceSchema`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UserWithheldComplianceSchema`
     * @throws ClassCastException if the instance is not `UserWithheldComplianceSchema`
     */
    public UserWithheldComplianceSchema getUserWithheldComplianceSchema() throws ClassCastException {
        return (UserWithheldComplianceSchema)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserComplianceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with UserDeleteComplianceSchema
    try {
      UserDeleteComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserDeleteComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserProfileModificationComplianceSchema
    try {
      UserProfileModificationComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserProfileModificationComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserProtectComplianceSchema
    try {
      UserProtectComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserProtectComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserScrubGeoSchema
    try {
      UserScrubGeoSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserScrubGeoSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserSuspendComplianceSchema
    try {
      UserSuspendComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserSuspendComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserUndeleteComplianceSchema
    try {
      UserUndeleteComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserUndeleteComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserUnprotectComplianceSchema
    try {
      UserUnprotectComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserUnprotectComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserUnsuspendComplianceSchema
    try {
      UserUnsuspendComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserUnsuspendComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UserWithheldComplianceSchema
    try {
      UserWithheldComplianceSchema.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UserWithheldComplianceSchema failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UserComplianceData with oneOf schemas: UserDeleteComplianceSchema, UserProfileModificationComplianceSchema, UserProtectComplianceSchema, UserScrubGeoSchema, UserSuspendComplianceSchema, UserUndeleteComplianceSchema, UserUnprotectComplianceSchema, UserUnsuspendComplianceSchema, UserWithheldComplianceSchema. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of UserComplianceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserComplianceData
  * @throws IOException if the JSON string is invalid with respect to UserComplianceData
  */
  public static UserComplianceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserComplianceData.class);
  }

 /**
  * Convert an instance of UserComplianceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
