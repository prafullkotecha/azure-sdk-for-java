// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AzureSkuTier. */
public final class AzureSkuTier extends ExpandableStringEnum<AzureSkuTier> {
    /** Static value Basic for AzureSkuTier. */
    public static final AzureSkuTier BASIC = fromString("Basic");

    /** Static value Standard for AzureSkuTier. */
    public static final AzureSkuTier STANDARD = fromString("Standard");

    /**
     * Creates or finds a AzureSkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureSkuTier.
     */
    @JsonCreator
    public static AzureSkuTier fromString(String name) {
        return fromString(name, AzureSkuTier.class);
    }

    /** @return known AzureSkuTier values. */
    public static Collection<AzureSkuTier> values() {
        return values(AzureSkuTier.class);
    }
}
