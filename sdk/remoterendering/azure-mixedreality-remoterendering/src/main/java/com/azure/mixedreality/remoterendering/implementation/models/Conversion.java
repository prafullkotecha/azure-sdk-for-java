// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of the conversion. */
@Fluent
public final class Conversion {
    /*
     * The ID of the conversion supplied when the conversion was created.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Conversion settings describe the origin of input files and destination
     * of output files.
     */
    @JsonProperty(value = "settings", required = true)
    private ConversionSettings settings;

    /*
     * Information about the output of a successful conversion. Only present
     * when the status of the conversion is 'Succeeded'.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private ConversionOutput output;

    /*
     * The error object containing details about the conversion failure.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /*
     * The status of the conversion. Terminal states are 'Cancelled', 'Failed',
     * and 'Succeeded'.
     */
    @JsonProperty(value = "status", required = true)
    private ConversionStatus status;

    /*
     * The time when the conversion was created. Date and time in ISO 8601
     * format.
     */
    @JsonProperty(value = "creationTime", required = true)
    private OffsetDateTime creationTime;

    /**
     * Creates an instance of Conversion class.
     *
     * @param id the id value to set.
     * @param settings the settings value to set.
     * @param error the error value to set.
     * @param status the status value to set.
     * @param creationTime the creationTime value to set.
     */
    @JsonCreator
    public Conversion(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "settings", required = true) ConversionSettings settings,
            @JsonProperty(value = "error", required = true) Error error,
            @JsonProperty(value = "status", required = true) ConversionStatus status,
            @JsonProperty(value = "creationTime", required = true) OffsetDateTime creationTime) {
        this.id = id;
        this.settings = settings;
        this.error = error;
        this.status = status;
        this.creationTime = creationTime;
    }

    /**
     * Get the id property: The ID of the conversion supplied when the conversion was created.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the settings property: Conversion settings describe the origin of input files and destination of output
     * files.
     *
     * @return the settings value.
     */
    public ConversionSettings getSettings() {
        return this.settings;
    }

    /**
     * Get the output property: Information about the output of a successful conversion. Only present when the status of
     * the conversion is 'Succeeded'.
     *
     * @return the output value.
     */
    public ConversionOutput getOutput() {
        return this.output;
    }

    /**
     * Get the error property: The error object containing details about the conversion failure.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Get the status property: The status of the conversion. Terminal states are 'Cancelled', 'Failed', and
     * 'Succeeded'.
     *
     * @return the status value.
     */
    public ConversionStatus getStatus() {
        return this.status;
    }

    /**
     * Get the creationTime property: The time when the conversion was created. Date and time in ISO 8601 format.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }
}
