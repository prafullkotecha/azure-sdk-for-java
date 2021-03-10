/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.PrivateLinkResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SynapseManager;

/**
 * Type representing PrivateLinkHubPrivateLinkResource.
 */
public interface PrivateLinkHubPrivateLinkResource extends HasInner<PrivateLinkResourceInner>, Indexable, Refreshable<PrivateLinkHubPrivateLinkResource>, HasManager<SynapseManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    PrivateLinkResourceProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
