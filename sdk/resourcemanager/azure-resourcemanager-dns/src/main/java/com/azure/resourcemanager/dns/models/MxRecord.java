// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An MX record. */
@Fluent
public final class MxRecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MxRecord.class);

    /*
     * The preference value for this MX record.
     */
    @JsonProperty(value = "preference")
    private Integer preference;

    /*
     * The domain name of the mail host for this MX record.
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * Get the preference property: The preference value for this MX record.
     *
     * @return the preference value.
     */
    public Integer preference() {
        return this.preference;
    }

    /**
     * Set the preference property: The preference value for this MX record.
     *
     * @param preference the preference value to set.
     * @return the MxRecord object itself.
     */
    public MxRecord withPreference(Integer preference) {
        this.preference = preference;
        return this;
    }

    /**
     * Get the exchange property: The domain name of the mail host for this MX record.
     *
     * @return the exchange value.
     */
    public String exchange() {
        return this.exchange;
    }

    /**
     * Set the exchange property: The domain name of the mail host for this MX record.
     *
     * @param exchange the exchange value to set.
     * @return the MxRecord object itself.
     */
    public MxRecord withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
