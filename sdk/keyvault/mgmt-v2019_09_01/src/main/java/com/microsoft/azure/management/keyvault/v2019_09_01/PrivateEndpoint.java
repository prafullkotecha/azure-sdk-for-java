/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private endpoint object properties.
 */
public class PrivateEndpoint {
    /**
     * Full identifier of the private endpoint resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get full identifier of the private endpoint resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
