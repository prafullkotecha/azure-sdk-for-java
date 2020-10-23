/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import rx.Completable;
import com.microsoft.azure.management.network.v2018_11_01.implementation.VpnSitesConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VpnSitesConfigurations.
 */
public interface VpnSitesConfigurations extends HasInner<VpnSitesConfigurationsInner> {
    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWANName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request Parameters supplied to download vpn-sites configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable downloadAsync(String resourceGroupName, String virtualWANName, GetVpnSitesConfigurationRequest request);

}
