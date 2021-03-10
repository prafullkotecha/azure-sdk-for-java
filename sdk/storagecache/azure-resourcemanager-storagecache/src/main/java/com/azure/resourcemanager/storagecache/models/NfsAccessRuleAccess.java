// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NfsAccessRuleAccess. */
public final class NfsAccessRuleAccess extends ExpandableStringEnum<NfsAccessRuleAccess> {
    /** Static value no for NfsAccessRuleAccess. */
    public static final NfsAccessRuleAccess NO = fromString("no");

    /** Static value ro for NfsAccessRuleAccess. */
    public static final NfsAccessRuleAccess RO = fromString("ro");

    /** Static value rw for NfsAccessRuleAccess. */
    public static final NfsAccessRuleAccess RW = fromString("rw");

    /**
     * Creates or finds a NfsAccessRuleAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NfsAccessRuleAccess.
     */
    @JsonCreator
    public static NfsAccessRuleAccess fromString(String name) {
        return fromString(name, NfsAccessRuleAccess.class);
    }

    /** @return known NfsAccessRuleAccess values. */
    public static Collection<NfsAccessRuleAccess> values() {
        return values(NfsAccessRuleAccess.class);
    }
}
