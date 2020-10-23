/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_08_01.SkuName;
import com.microsoft.azure.management.databoxedge.v2019_08_01.SkuTier;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU type.
 */
public class SkuInner {
    /**
     * SKU name. Possible values include: 'Gateway', 'Edge', 'TEA_1Node',
     * 'TEA_1Node_UPS', 'TEA_1Node_Heater', 'TEA_1Node_UPS_Heater',
     * 'TEA_4Node_Heater', 'TEA_4Node_UPS_Heater', 'TMA'.
     */
    @JsonProperty(value = "name")
    private SkuName name;

    /**
     * The SKU tier. This is based on the SKU name. Possible values include:
     * 'Standard'.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * Get sKU name. Possible values include: 'Gateway', 'Edge', 'TEA_1Node', 'TEA_1Node_UPS', 'TEA_1Node_Heater', 'TEA_1Node_UPS_Heater', 'TEA_4Node_Heater', 'TEA_4Node_UPS_Heater', 'TMA'.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set sKU name. Possible values include: 'Gateway', 'Edge', 'TEA_1Node', 'TEA_1Node_UPS', 'TEA_1Node_Heater', 'TEA_1Node_UPS_Heater', 'TEA_4Node_Heater', 'TEA_4Node_UPS_Heater', 'TMA'.
     *
     * @param name the name value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the SKU tier. This is based on the SKU name. Possible values include: 'Standard'.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the SKU tier. This is based on the SKU name. Possible values include: 'Standard'.
     *
     * @param tier the tier value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

}
