// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MediaJobState. */
public enum MediaJobState {
    /** Enum value Canceled. */
    CANCELED("Canceled"),

    /** Enum value Canceling. */
    CANCELING("Canceling"),

    /** Enum value Error. */
    ERROR("Error"),

    /** Enum value Finished. */
    FINISHED("Finished"),

    /** Enum value Processing. */
    PROCESSING("Processing"),

    /** Enum value Queued. */
    QUEUED("Queued"),

    /** Enum value Scheduled. */
    SCHEDULED("Scheduled");

    /** The actual serialized value for a MediaJobState instance. */
    private final String value;

    MediaJobState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MediaJobState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MediaJobState object, or null if unable to parse.
     */
    @JsonCreator
    public static MediaJobState fromString(String value) {
        MediaJobState[] items = MediaJobState.values();
        for (MediaJobState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
