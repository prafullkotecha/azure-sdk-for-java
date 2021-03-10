// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DynamicsAuthenticationType. */
public final class DynamicsAuthenticationType extends ExpandableStringEnum<DynamicsAuthenticationType> {
    /** Static value Office365 for DynamicsAuthenticationType. */
    public static final DynamicsAuthenticationType OFFICE365 = fromString("Office365");

    /** Static value Ifd for DynamicsAuthenticationType. */
    public static final DynamicsAuthenticationType IFD = fromString("Ifd");

    /** Static value AADServicePrincipal for DynamicsAuthenticationType. */
    public static final DynamicsAuthenticationType AADSERVICE_PRINCIPAL = fromString("AADServicePrincipal");

    /**
     * Creates or finds a DynamicsAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DynamicsAuthenticationType.
     */
    @JsonCreator
    public static DynamicsAuthenticationType fromString(String name) {
        return fromString(name, DynamicsAuthenticationType.class);
    }

    /** @return known DynamicsAuthenticationType values. */
    public static Collection<DynamicsAuthenticationType> values() {
        return values(DynamicsAuthenticationType.class);
    }
}
