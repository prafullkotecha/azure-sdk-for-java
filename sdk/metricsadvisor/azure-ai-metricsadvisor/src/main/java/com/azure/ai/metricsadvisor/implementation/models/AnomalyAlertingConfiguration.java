// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The AnomalyAlertingConfiguration model. */
@Fluent
public final class AnomalyAlertingConfiguration {
    /*
     * anomaly alerting configuration unique id
     */
    @JsonProperty(value = "anomalyAlertingConfigurationId")
    private UUID anomalyAlertingConfigurationId;

    /*
     * anomaly alerting configuration name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * anomaly alerting configuration description
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * cross metrics operator
     *
     * should be specified when setting up multiple metric alerting
     * configurations
     */
    @JsonProperty(value = "crossMetricsOperator")
    private AnomalyAlertingConfigurationCrossMetricsOperator crossMetricsOperator;

    /*
     * hook unique ids
     */
    @JsonProperty(value = "hookIds", required = true)
    private List<UUID> hookIds;

    /*
     * Anomaly alerting configurations
     */
    @JsonProperty(value = "metricAlertingConfigurations", required = true)
    private List<MetricAlertingConfiguration> metricAlertingConfigurations;

    /**
     * Get the anomalyAlertingConfigurationId property: anomaly alerting configuration unique id.
     *
     * @return the anomalyAlertingConfigurationId value.
     */
    public UUID getAnomalyAlertingConfigurationId() {
        return this.anomalyAlertingConfigurationId;
    }

    /**
     * Set the anomalyAlertingConfigurationId property: anomaly alerting configuration unique id.
     *
     * @param anomalyAlertingConfigurationId the anomalyAlertingConfigurationId value to set.
     * @return the AnomalyAlertingConfiguration object itself.
     */
    public AnomalyAlertingConfiguration setAnomalyAlertingConfigurationId(UUID anomalyAlertingConfigurationId) {
        this.anomalyAlertingConfigurationId = anomalyAlertingConfigurationId;
        return this;
    }

    /**
     * Get the name property: anomaly alerting configuration name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: anomaly alerting configuration name.
     *
     * @param name the name value to set.
     * @return the AnomalyAlertingConfiguration object itself.
     */
    public AnomalyAlertingConfiguration setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: anomaly alerting configuration description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: anomaly alerting configuration description.
     *
     * @param description the description value to set.
     * @return the AnomalyAlertingConfiguration object itself.
     */
    public AnomalyAlertingConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the crossMetricsOperator property: cross metrics operator
     *
     * <p>should be specified when setting up multiple metric alerting configurations.
     *
     * @return the crossMetricsOperator value.
     */
    public AnomalyAlertingConfigurationCrossMetricsOperator getCrossMetricsOperator() {
        return this.crossMetricsOperator;
    }

    /**
     * Set the crossMetricsOperator property: cross metrics operator
     *
     * <p>should be specified when setting up multiple metric alerting configurations.
     *
     * @param crossMetricsOperator the crossMetricsOperator value to set.
     * @return the AnomalyAlertingConfiguration object itself.
     */
    public AnomalyAlertingConfiguration setCrossMetricsOperator(
            AnomalyAlertingConfigurationCrossMetricsOperator crossMetricsOperator) {
        this.crossMetricsOperator = crossMetricsOperator;
        return this;
    }

    /**
     * Get the hookIds property: hook unique ids.
     *
     * @return the hookIds value.
     */
    public List<UUID> getHookIds() {
        return this.hookIds;
    }

    /**
     * Set the hookIds property: hook unique ids.
     *
     * @param hookIds the hookIds value to set.
     * @return the AnomalyAlertingConfiguration object itself.
     */
    public AnomalyAlertingConfiguration setHookIds(List<UUID> hookIds) {
        this.hookIds = hookIds;
        return this;
    }

    /**
     * Get the metricAlertingConfigurations property: Anomaly alerting configurations.
     *
     * @return the metricAlertingConfigurations value.
     */
    public List<MetricAlertingConfiguration> getMetricAlertingConfigurations() {
        return this.metricAlertingConfigurations;
    }

    /**
     * Set the metricAlertingConfigurations property: Anomaly alerting configurations.
     *
     * @param metricAlertingConfigurations the metricAlertingConfigurations value to set.
     * @return the AnomalyAlertingConfiguration object itself.
     */
    public AnomalyAlertingConfiguration setMetricAlertingConfigurations(
            List<MetricAlertingConfiguration> metricAlertingConfigurations) {
        this.metricAlertingConfigurations = metricAlertingConfigurations;
        return this;
    }
}
