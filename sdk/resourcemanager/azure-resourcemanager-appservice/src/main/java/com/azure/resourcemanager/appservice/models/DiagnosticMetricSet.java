// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Class representing Diagnostic Metric information. */
@Fluent
public final class DiagnosticMetricSet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticMetricSet.class);

    /*
     * Name of the metric
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Metric's unit
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Start time of the period
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the period
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Presented time grain. Supported grains at the moment are PT1M, PT1H, P1D
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /*
     * Collection of metric values for the selected period based on the
     * {Microsoft.Web.Hosting.Administration.DiagnosticMetricSet.TimeGrain}
     */
    @JsonProperty(value = "values")
    private List<DiagnosticMetricSample> values;

    /**
     * Get the name property: Name of the metric.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the metric.
     *
     * @param name the name value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: Metric's unit.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Metric's unit.
     *
     * @param unit the unit value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the startTime property: Start time of the period.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the period.
     *
     * @param startTime the startTime value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the period.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the period.
     *
     * @param endTime the endTime value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the timeGrain property: Presented time grain. Supported grains at the moment are PT1M, PT1H, P1D.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: Presented time grain. Supported grains at the moment are PT1M, PT1H, P1D.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the values property: Collection of metric values for the selected period based on the
     * {Microsoft.Web.Hosting.Administration.DiagnosticMetricSet.TimeGrain}.
     *
     * @return the values value.
     */
    public List<DiagnosticMetricSample> values() {
        return this.values;
    }

    /**
     * Set the values property: Collection of metric values for the selected period based on the
     * {Microsoft.Web.Hosting.Administration.DiagnosticMetricSet.TimeGrain}.
     *
     * @param values the values value to set.
     * @return the DiagnosticMetricSet object itself.
     */
    public DiagnosticMetricSet withValues(List<DiagnosticMetricSample> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }
}
