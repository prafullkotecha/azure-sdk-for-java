/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.ManagedRuleGroupDefinition;
import com.microsoft.azure.management.cdn.v2020_09_01.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Describes a managed rule set definition.
 */
@JsonFlatten
public class ManagedRuleSetDefinitionInner extends ProxyResource {
    /**
     * Provisioning state of the managed rule set.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Type of the managed rule set.
     */
    @JsonProperty(value = "properties.ruleSetType", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetType;

    /**
     * Version of the managed rule set type.
     */
    @JsonProperty(value = "properties.ruleSetVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetVersion;

    /**
     * Rule groups of the managed rule set.
     */
    @JsonProperty(value = "properties.ruleGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedRuleGroupDefinition> ruleGroups;

    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get provisioning state of the managed rule set.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get type of the managed rule set.
     *
     * @return the ruleSetType value
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Get version of the managed rule set type.
     *
     * @return the ruleSetVersion value
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Get rule groups of the managed rule set.
     *
     * @return the ruleGroups value
     */
    public List<ManagedRuleGroupDefinition> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Get the pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     *
     * @param sku the sku value to set
     * @return the ManagedRuleSetDefinitionInner object itself.
     */
    public ManagedRuleSetDefinitionInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
