// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.trafficmanager.models.HeatMapEndpoint;
import com.azure.resourcemanager.trafficmanager.models.TrafficFlow;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The HeatMapModel model. */
@JsonFlatten
@Fluent
public class HeatMapModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HeatMapModelInner.class);

    /*
     * The beginning of the time window for this HeatMap, inclusive.
     */
    @JsonProperty(value = "properties.startTime")
    private OffsetDateTime startTime;

    /*
     * The ending of the time window for this HeatMap, exclusive.
     */
    @JsonProperty(value = "properties.endTime")
    private OffsetDateTime endTime;

    /*
     * The endpoints used in this HeatMap calculation.
     */
    @JsonProperty(value = "properties.endpoints")
    private List<HeatMapEndpoint> endpoints;

    /*
     * The traffic flows produced in this HeatMap calculation.
     */
    @JsonProperty(value = "properties.trafficFlows")
    private List<TrafficFlow> trafficFlows;

    /*
     * Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the resource
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the startTime property: The beginning of the time window for this HeatMap, inclusive.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The beginning of the time window for this HeatMap, inclusive.
     *
     * @param startTime the startTime value to set.
     * @return the HeatMapModelInner object itself.
     */
    public HeatMapModelInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The ending of the time window for this HeatMap, exclusive.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The ending of the time window for this HeatMap, exclusive.
     *
     * @param endTime the endTime value to set.
     * @return the HeatMapModelInner object itself.
     */
    public HeatMapModelInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints used in this HeatMap calculation.
     *
     * @return the endpoints value.
     */
    public List<HeatMapEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints used in this HeatMap calculation.
     *
     * @param endpoints the endpoints value to set.
     * @return the HeatMapModelInner object itself.
     */
    public HeatMapModelInner withEndpoints(List<HeatMapEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the trafficFlows property: The traffic flows produced in this HeatMap calculation.
     *
     * @return the trafficFlows value.
     */
    public List<TrafficFlow> trafficFlows() {
        return this.trafficFlows;
    }

    /**
     * Set the trafficFlows property: The traffic flows produced in this HeatMap calculation.
     *
     * @param trafficFlows the trafficFlows value to set.
     * @return the HeatMapModelInner object itself.
     */
    public HeatMapModelInner withTrafficFlows(List<TrafficFlow> trafficFlows) {
        this.trafficFlows = trafficFlows;
        return this;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}.
     *
     * @param id the id value to set.
     * @return the HeatMapModelInner object itself.
     */
    public HeatMapModelInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the HeatMapModelInner object itself.
     */
    public HeatMapModelInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     *
     * @param type the type value to set.
     * @return the HeatMapModelInner object itself.
     */
    public HeatMapModelInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (trafficFlows() != null) {
            trafficFlows().forEach(e -> e.validate());
        }
    }
}
