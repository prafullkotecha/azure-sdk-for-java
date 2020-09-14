/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RouteTable route.
 */
public class HubRoute {
    /**
     * The name of the Route that is unique within a RouteTable. This name can
     * be used to access this route.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The type of destinations (eg: CIDR, ResourceId, Service).
     */
    @JsonProperty(value = "destinationType", required = true)
    private String destinationType;

    /**
     * List of all destinations.
     */
    @JsonProperty(value = "destinations", required = true)
    private List<String> destinations;

    /**
     * The type of next hop (eg: ResourceId).
     */
    @JsonProperty(value = "nextHopType", required = true)
    private String nextHopType;

    /**
     * NextHop resource ID.
     */
    @JsonProperty(value = "nextHop", required = true)
    private String nextHop;

    /**
     * Get the name of the Route that is unique within a RouteTable. This name can be used to access this route.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the Route that is unique within a RouteTable. This name can be used to access this route.
     *
     * @param name the name value to set
     * @return the HubRoute object itself.
     */
    public HubRoute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of destinations (eg: CIDR, ResourceId, Service).
     *
     * @return the destinationType value
     */
    public String destinationType() {
        return this.destinationType;
    }

    /**
     * Set the type of destinations (eg: CIDR, ResourceId, Service).
     *
     * @param destinationType the destinationType value to set
     * @return the HubRoute object itself.
     */
    public HubRoute withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * Get list of all destinations.
     *
     * @return the destinations value
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set list of all destinations.
     *
     * @param destinations the destinations value to set
     * @return the HubRoute object itself.
     */
    public HubRoute withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the type of next hop (eg: ResourceId).
     *
     * @return the nextHopType value
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the type of next hop (eg: ResourceId).
     *
     * @param nextHopType the nextHopType value to set
     * @return the HubRoute object itself.
     */
    public HubRoute withNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get nextHop resource ID.
     *
     * @return the nextHop value
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Set nextHop resource ID.
     *
     * @param nextHop the nextHop value to set
     * @return the HubRoute object itself.
     */
    public HubRoute withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

}
