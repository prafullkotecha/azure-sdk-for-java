// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties of the rule collection. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleCollectionType",
    defaultImpl = FirewallPolicyRuleCollection.class)
@JsonTypeName("FirewallPolicyRuleCollection")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FirewallPolicyNatRuleCollection", value = FirewallPolicyNatRuleCollection.class),
    @JsonSubTypes.Type(name = "FirewallPolicyFilterRuleCollection", value = FirewallPolicyFilterRuleCollection.class)
})
@Fluent
public class FirewallPolicyRuleCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyRuleCollection.class);

    /*
     * The name of the rule collection.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Priority of the Firewall Policy Rule Collection resource.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * Get the name property: The name of the rule collection.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the rule collection.
     *
     * @param name the name value to set.
     * @return the FirewallPolicyRuleCollection object itself.
     */
    public FirewallPolicyRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the priority property: Priority of the Firewall Policy Rule Collection resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the Firewall Policy Rule Collection resource.
     *
     * @param priority the priority value to set.
     * @return the FirewallPolicyRuleCollection object itself.
     */
    public FirewallPolicyRuleCollection withPriority(Integer priority) {
        this.priority = priority;
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
