// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.CircuitConnectionStatus;
import com.azure.resourcemanager.network.models.Ipv6CircuitConnectionConfig;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Express Route Circuit Connection in an ExpressRouteCircuitPeering resource. */
@JsonFlatten
@Fluent
public class ExpressRouteCircuitConnectionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitConnectionInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     */
    @JsonProperty(value = "properties.expressRouteCircuitPeering")
    private SubResource expressRouteCircuitPeering;

    /*
     * Reference to Express Route Circuit Private Peering Resource of the
     * peered circuit.
     */
    @JsonProperty(value = "properties.peerExpressRouteCircuitPeering")
    private SubResource peerExpressRouteCircuitPeering;

    /*
     * /29 IP address space to carve out Customer addresses for tunnels.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /*
     * The authorization key.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /*
     * IPv6 Address PrefixProperties of the express route circuit connection.
     */
    @JsonProperty(value = "properties.ipv6CircuitConnectionConfig")
    private Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig;

    /*
     * Express Route Circuit connection state.
     */
    @JsonProperty(value = "properties.circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CircuitConnectionStatus circuitConnectionStatus;

    /*
     * The provisioning state of the express route circuit connection resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public SubResource expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value.
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }

    /**
     * Set the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withPeerExpressRouteCircuitPeering(
        SubResource peerExpressRouteCircuitPeering) {
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the authorizationKey property: The authorization key.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorization key.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route circuit
     * connection.
     *
     * @return the ipv6CircuitConnectionConfig value.
     */
    public Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig() {
        return this.ipv6CircuitConnectionConfig;
    }

    /**
     * Set the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route circuit
     * connection.
     *
     * @param ipv6CircuitConnectionConfig the ipv6CircuitConnectionConfig value to set.
     * @return the ExpressRouteCircuitConnectionInner object itself.
     */
    public ExpressRouteCircuitConnectionInner withIpv6CircuitConnectionConfig(
        Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig) {
        this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit connection state.
     *
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route circuit connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCircuitConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipv6CircuitConnectionConfig() != null) {
            ipv6CircuitConnectionConfig().validate();
        }
    }
}
