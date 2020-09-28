/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DiskStorageAccountTypes.
 */
public final class DiskStorageAccountTypes extends ExpandableStringEnum<DiskStorageAccountTypes> {
    /** Static value Standard_LRS for DiskStorageAccountTypes. */
    public static final DiskStorageAccountTypes STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Premium_LRS for DiskStorageAccountTypes. */
    public static final DiskStorageAccountTypes PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value StandardSSD_LRS for DiskStorageAccountTypes. */
    public static final DiskStorageAccountTypes STANDARD_SSD_LRS = fromString("StandardSSD_LRS");

    /** Static value UltraSSD_LRS for DiskStorageAccountTypes. */
    public static final DiskStorageAccountTypes ULTRA_SSD_LRS = fromString("UltraSSD_LRS");

    /**
     * Creates or finds a DiskStorageAccountTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding DiskStorageAccountTypes
     */
    @JsonCreator
    public static DiskStorageAccountTypes fromString(String name) {
        return fromString(name, DiskStorageAccountTypes.class);
    }

    /**
     * @return known DiskStorageAccountTypes values
     */
    public static Collection<DiskStorageAccountTypes> values() {
        return values(DiskStorageAccountTypes.class);
    }
}
