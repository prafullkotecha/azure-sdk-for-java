// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphDeviceEnrollmentType. */
public final class MicrosoftGraphDeviceEnrollmentType extends ExpandableStringEnum<MicrosoftGraphDeviceEnrollmentType> {
    /** Static value unknown for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType UNKNOWN = fromString("unknown");

    /** Static value userEnrollment for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType USER_ENROLLMENT = fromString("userEnrollment");

    /** Static value deviceEnrollmentManager for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType DEVICE_ENROLLMENT_MANAGER =
        fromString("deviceEnrollmentManager");

    /** Static value appleBulkWithUser for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType APPLE_BULK_WITH_USER = fromString("appleBulkWithUser");

    /** Static value appleBulkWithoutUser for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType APPLE_BULK_WITHOUT_USER = fromString("appleBulkWithoutUser");

    /** Static value windowsAzureADJoin for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType WINDOWS_AZURE_ADJOIN = fromString("windowsAzureADJoin");

    /** Static value windowsBulkUserless for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType WINDOWS_BULK_USERLESS = fromString("windowsBulkUserless");

    /** Static value windowsAutoEnrollment for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType WINDOWS_AUTO_ENROLLMENT =
        fromString("windowsAutoEnrollment");

    /** Static value windowsBulkAzureDomainJoin for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType WINDOWS_BULK_AZURE_DOMAIN_JOIN =
        fromString("windowsBulkAzureDomainJoin");

    /** Static value windowsCoManagement for MicrosoftGraphDeviceEnrollmentType. */
    public static final MicrosoftGraphDeviceEnrollmentType WINDOWS_CO_MANAGEMENT = fromString("windowsCoManagement");

    /**
     * Creates or finds a MicrosoftGraphDeviceEnrollmentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphDeviceEnrollmentType.
     */
    @JsonCreator
    public static MicrosoftGraphDeviceEnrollmentType fromString(String name) {
        return fromString(name, MicrosoftGraphDeviceEnrollmentType.class);
    }

    /** @return known MicrosoftGraphDeviceEnrollmentType values. */
    public static Collection<MicrosoftGraphDeviceEnrollmentType> values() {
        return values(MicrosoftGraphDeviceEnrollmentType.class);
    }
}
