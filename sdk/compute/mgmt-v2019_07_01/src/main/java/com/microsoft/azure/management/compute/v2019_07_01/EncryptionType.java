/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EncryptionType.
 */
public final class EncryptionType extends ExpandableStringEnum<EncryptionType> {
    /** Static value EncryptionAtRestWithPlatformKey for EncryptionType. */
    public static final EncryptionType ENCRYPTION_AT_REST_WITH_PLATFORM_KEY = fromString("EncryptionAtRestWithPlatformKey");

    /** Static value EncryptionAtRestWithCustomerKey for EncryptionType. */
    public static final EncryptionType ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY = fromString("EncryptionAtRestWithCustomerKey");

    /**
     * Creates or finds a EncryptionType from its string representation.
     * @param name a name to look for
     * @return the corresponding EncryptionType
     */
    @JsonCreator
    public static EncryptionType fromString(String name) {
        return fromString(name, EncryptionType.class);
    }

    /**
     * @return known EncryptionType values
     */
    public static Collection<EncryptionType> values() {
        return values(EncryptionType.class);
    }
}
