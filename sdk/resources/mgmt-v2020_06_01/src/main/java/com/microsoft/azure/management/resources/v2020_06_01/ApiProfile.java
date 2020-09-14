/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApiProfile model.
 */
public class ApiProfile {
    /**
     * The profile version.
     */
    @JsonProperty(value = "profileVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String profileVersion;

    /**
     * The API version.
     */
    @JsonProperty(value = "apiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String apiVersion;

    /**
     * Get the profile version.
     *
     * @return the profileVersion value
     */
    public String profileVersion() {
        return this.profileVersion;
    }

    /**
     * Get the API version.
     *
     * @return the apiVersion value
     */
    public String apiVersion() {
        return this.apiVersion;
    }

}
