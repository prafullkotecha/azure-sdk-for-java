/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Used for updating a disk access resource.
 */
public class DiskAccessUpdate {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the DiskAccessUpdate object itself.
     */
    public DiskAccessUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
