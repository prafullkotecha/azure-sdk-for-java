// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsIdentity;
import com.azure.resourcemanager.digitaltwins.models.DigitalTwinsResource;
import com.azure.resourcemanager.digitaltwins.models.ProvisioningState;
import com.azure.resourcemanager.digitaltwins.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The description of the DigitalTwins service. */
@JsonFlatten
@Fluent
public class DigitalTwinsDescriptionInner extends DigitalTwinsResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DigitalTwinsDescriptionInner.class);

    /*
     * Time when DigitalTwinsInstance was created.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Time when DigitalTwinsInstance was updated.
     */
    @JsonProperty(value = "properties.lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTime;

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Api endpoint to work with DigitalTwinsInstance.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The privateEndpointConnections property.
     */
    @JsonProperty(value = "properties.privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Public network access for the DigitalTwinsInstance.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Get the createdTime property: Time when DigitalTwinsInstance was created.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the lastUpdatedTime property: Time when DigitalTwinsInstance was updated.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hostname property: Api endpoint to work with DigitalTwinsInstance.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the privateEndpointConnections property: The privateEndpointConnections property.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: The privateEndpointConnections property.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the DigitalTwinsDescriptionInner object itself.
     */
    public DigitalTwinsDescriptionInner withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Public network access for the DigitalTwinsInstance.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Public network access for the DigitalTwinsInstance.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DigitalTwinsDescriptionInner object itself.
     */
    public DigitalTwinsDescriptionInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DigitalTwinsDescriptionInner withIdentity(DigitalTwinsIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DigitalTwinsDescriptionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DigitalTwinsDescriptionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
