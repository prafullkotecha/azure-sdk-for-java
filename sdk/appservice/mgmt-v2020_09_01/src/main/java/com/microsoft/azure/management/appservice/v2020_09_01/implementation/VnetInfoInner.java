/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Virtual Network information contract.
 */
@JsonFlatten
public class VnetInfoInner extends ProxyOnlyResource {
    /**
     * The Virtual Network's resource ID.
     */
    @JsonProperty(value = "properties.vnetResourceId")
    private String vnetResourceId;

    /**
     * The client certificate thumbprint.
     */
    @JsonProperty(value = "properties.certThumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String certThumbprint;

    /**
     * A certificate file (.cer) blob containing the public key of the private
     * key used to authenticate a
     * Point-To-Site VPN connection.
     */
    @JsonProperty(value = "properties.certBlob")
    private String certBlob;

    /**
     * The routes that this Virtual Network connection uses.
     */
    @JsonProperty(value = "properties.routes", access = JsonProperty.Access.WRITE_ONLY)
    private List<VnetRouteInner> routes;

    /**
     * &lt;code&gt;true&lt;/code&gt; if a resync is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.resyncRequired", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean resyncRequired;

    /**
     * DNS servers to be used by this Virtual Network. This should be a
     * comma-separated list of IP addresses.
     */
    @JsonProperty(value = "properties.dnsServers")
    private String dnsServers;

    /**
     * Flag that is used to denote if this is VNET injection.
     */
    @JsonProperty(value = "properties.isSwift")
    private Boolean isSwift;

    /**
     * Get the Virtual Network's resource ID.
     *
     * @return the vnetResourceId value
     */
    public String vnetResourceId() {
        return this.vnetResourceId;
    }

    /**
     * Set the Virtual Network's resource ID.
     *
     * @param vnetResourceId the vnetResourceId value to set
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withVnetResourceId(String vnetResourceId) {
        this.vnetResourceId = vnetResourceId;
        return this;
    }

    /**
     * Get the client certificate thumbprint.
     *
     * @return the certThumbprint value
     */
    public String certThumbprint() {
        return this.certThumbprint;
    }

    /**
     * Get a certificate file (.cer) blob containing the public key of the private key used to authenticate a
     Point-To-Site VPN connection.
     *
     * @return the certBlob value
     */
    public String certBlob() {
        return this.certBlob;
    }

    /**
     * Set a certificate file (.cer) blob containing the public key of the private key used to authenticate a
     Point-To-Site VPN connection.
     *
     * @param certBlob the certBlob value to set
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withCertBlob(String certBlob) {
        this.certBlob = certBlob;
        return this;
    }

    /**
     * Get the routes that this Virtual Network connection uses.
     *
     * @return the routes value
     */
    public List<VnetRouteInner> routes() {
        return this.routes;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if a resync is required; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the resyncRequired value
     */
    public Boolean resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Get dNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     *
     * @return the dnsServers value
     */
    public String dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set dNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     *
     * @param dnsServers the dnsServers value to set
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withDnsServers(String dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get flag that is used to denote if this is VNET injection.
     *
     * @return the isSwift value
     */
    public Boolean isSwift() {
        return this.isSwift;
    }

    /**
     * Set flag that is used to denote if this is VNET injection.
     *
     * @param isSwift the isSwift value to set
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withIsSwift(Boolean isSwift) {
        this.isSwift = isSwift;
        return this;
    }

}
