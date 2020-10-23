/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Private endpoint connection item.
 */
@JsonFlatten
public class PrivateEndpointConnectionItem {
    /**
     * Properties of the private endpoint object.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /**
     * Approval state of the private link connection.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * Provisioning state of the private endpoint connection. Possible values
     * include: 'Succeeded', 'Creating', 'Updating', 'Deleting', 'Failed',
     * 'Disconnected'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private PrivateEndpointConnectionProvisioningState provisioningState;

    /**
     * Get properties of the private endpoint object.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set properties of the private endpoint object.
     *
     * @param privateEndpoint the privateEndpoint value to set
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get approval state of the private link connection.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set approval state of the private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Updating', 'Deleting', 'Failed', 'Disconnected'.
     *
     * @return the provisioningState value
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the private endpoint connection. Possible values include: 'Succeeded', 'Creating', 'Updating', 'Deleting', 'Failed', 'Disconnected'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
