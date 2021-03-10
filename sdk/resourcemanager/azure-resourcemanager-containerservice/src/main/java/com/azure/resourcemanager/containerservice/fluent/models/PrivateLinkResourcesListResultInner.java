// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of private link resources. */
@Fluent
public final class PrivateLinkResourcesListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesListResultInner.class);

    /*
     * The collection value.
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkResourceInner> value;

    /**
     * Get the value property: The collection value.
     *
     * @return the value value.
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection value.
     *
     * @param value the value value to set.
     * @return the PrivateLinkResourcesListResultInner object itself.
     */
    public PrivateLinkResourcesListResultInner withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
        return this;
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
