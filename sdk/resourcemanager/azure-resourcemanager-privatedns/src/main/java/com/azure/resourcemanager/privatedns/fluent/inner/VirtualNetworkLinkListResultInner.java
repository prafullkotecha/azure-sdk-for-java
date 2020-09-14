// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualNetworkLinkListResult model. */
@Fluent
public final class VirtualNetworkLinkListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkLinkListResultInner.class);

    /*
     * Information about the virtual network links to the Private DNS zones.
     */
    @JsonProperty(value = "value")
    private List<VirtualNetworkLinkInner> value;

    /*
     * The continuation token for the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Information about the virtual network links to the Private DNS zones.
     *
     * @return the value value.
     */
    public List<VirtualNetworkLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about the virtual network links to the Private DNS zones.
     *
     * @param value the value value to set.
     * @return the VirtualNetworkLinkListResultInner object itself.
     */
    public VirtualNetworkLinkListResultInner withValue(List<VirtualNetworkLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token for the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
