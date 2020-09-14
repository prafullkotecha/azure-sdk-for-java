// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RedisLinkedServerWithPropertiesList model. */
@Fluent
public final class RedisLinkedServerWithPropertiesListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisLinkedServerWithPropertiesListInner.class);

    /*
     * List of linked servers (with properties) of a Redis cache.
     */
    @JsonProperty(value = "value")
    private List<RedisLinkedServerWithPropertiesInner> value;

    /*
     * Link for next set.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of linked servers (with properties) of a Redis cache.
     *
     * @return the value value.
     */
    public List<RedisLinkedServerWithPropertiesInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of linked servers (with properties) of a Redis cache.
     *
     * @param value the value value to set.
     * @return the RedisLinkedServerWithPropertiesListInner object itself.
     */
    public RedisLinkedServerWithPropertiesListInner withValue(List<RedisLinkedServerWithPropertiesInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next set.
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
