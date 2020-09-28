/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.DomainAvailabilityCheckResultInner;

/**
 * Type representing DomainAvailabilityCheckResult.
 */
public interface DomainAvailabilityCheckResult extends HasInner<DomainAvailabilityCheckResultInner>, HasManager<AppServiceManager> {
    /**
     * @return the available value.
     */
    Boolean available();

    /**
     * @return the domainType value.
     */
    DomainType domainType();

    /**
     * @return the name value.
     */
    String name();

}
