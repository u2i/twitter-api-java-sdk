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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * Poll options for a Tweet with a poll. This is mutually exclusive from Media and Quote Tweet Id.
 */
@ApiModel(description = "Poll options for a Tweet with a poll. This is mutually exclusive from Media and Quote Tweet Id.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetCreateRequestPoll {
  public static final String SERIALIZED_NAME_DURATION_MINUTES = "duration_minutes";
  @SerializedName(SERIALIZED_NAME_DURATION_MINUTES)
  private Integer durationMinutes;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = new ArrayList<>();

  /**
   * Settings to indicate who can reply to the Tweet.
   */
  @JsonAdapter(ReplySettingsEnum.Adapter.class)
  public enum ReplySettingsEnum {
    FOLLOWING("following"),
    
    MENTIONEDUSERS("mentionedUsers");

    private String value;

    ReplySettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReplySettingsEnum fromValue(String value) {
      for (ReplySettingsEnum b : ReplySettingsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReplySettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReplySettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReplySettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReplySettingsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPLY_SETTINGS = "reply_settings";
  @SerializedName(SERIALIZED_NAME_REPLY_SETTINGS)
  private ReplySettingsEnum replySettings;

  public TweetCreateRequestPoll() { 
  }

  public TweetCreateRequestPoll durationMinutes(Integer durationMinutes) {
    
    this.durationMinutes = durationMinutes;
    return this;
  }

   /**
   * Duration of the poll in minutes.
   * minimum: 5
   * maximum: 10080
   * @return durationMinutes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Duration of the poll in minutes.")

  public Integer getDurationMinutes() {
    return durationMinutes;
  }


  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  public TweetCreateRequestPoll options(List<String> options) {
    
    this.options = options;
    return this;
  }

  public TweetCreateRequestPoll addOptionsItem(String optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    this.options = options;
  }


  public TweetCreateRequestPoll replySettings(ReplySettingsEnum replySettings) {
    
    this.replySettings = replySettings;
    return this;
  }

   /**
   * Settings to indicate who can reply to the Tweet.
   * @return replySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Settings to indicate who can reply to the Tweet.")

  public ReplySettingsEnum getReplySettings() {
    return replySettings;
  }


  public void setReplySettings(ReplySettingsEnum replySettings) {
    this.replySettings = replySettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetCreateRequestPoll tweetCreateRequestPoll = (TweetCreateRequestPoll) o;
    return Objects.equals(this.durationMinutes, tweetCreateRequestPoll.durationMinutes) &&
        Objects.equals(this.options, tweetCreateRequestPoll.options) &&
        Objects.equals(this.replySettings, tweetCreateRequestPoll.replySettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMinutes, options, replySettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetCreateRequestPoll {\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    replySettings: ").append(toIndentedString(replySettings)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("duration_minutes");
    openapiFields.add("options");
    openapiFields.add("reply_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("duration_minutes");
    openapiRequiredFields.add("options");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetCreateRequestPoll
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (TweetCreateRequestPoll.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in TweetCreateRequestPoll is not found in the empty JSON string", TweetCreateRequestPoll.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TweetCreateRequestPoll.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
      }
      if (jsonObj.get("reply_settings") != null && !jsonObj.get("reply_settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply_settings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetCreateRequestPoll.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetCreateRequestPoll' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetCreateRequestPoll> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetCreateRequestPoll.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetCreateRequestPoll>() {
           @Override
           public void write(JsonWriter out, TweetCreateRequestPoll value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetCreateRequestPoll read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetCreateRequestPoll given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetCreateRequestPoll
  * @throws IOException if the JSON string is invalid with respect to TweetCreateRequestPoll
  */
  public static TweetCreateRequestPoll fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetCreateRequestPoll.class);
  }

 /**
  * Convert an instance of TweetCreateRequestPoll to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
