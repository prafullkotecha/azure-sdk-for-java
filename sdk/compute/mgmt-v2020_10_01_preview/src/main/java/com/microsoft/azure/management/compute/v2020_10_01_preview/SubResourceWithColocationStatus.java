/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * The SubResourceWithColocationStatus model.
 */
public class SubResourceWithColocationStatus extends SubResource {
    /**
     * Describes colocation status of a resource in the Proximity Placement
     * Group.
     */
    @JsonProperty(value = "colocationStatus")
    private InstanceViewStatus colocationStatus;

    /**
     * Get describes colocation status of a resource in the Proximity Placement Group.
     *
     * @return the colocationStatus value
     */
    public InstanceViewStatus colocationStatus() {
        return this.colocationStatus;
    }

    /**
     * Set describes colocation status of a resource in the Proximity Placement Group.
     *
     * @param colocationStatus the colocationStatus value to set
     * @return the SubResourceWithColocationStatus object itself.
     */
    public SubResourceWithColocationStatus withColocationStatus(InstanceViewStatus colocationStatus) {
        this.colocationStatus = colocationStatus;
        return this;
    }

}
