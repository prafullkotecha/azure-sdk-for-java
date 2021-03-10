/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.NatRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NatRules.
 */
public interface NatRules extends SupportsCreating<VpnGatewayNatRule.DefinitionStages.Blank>, HasInner<NatRulesInner> {
    /**
     * Retrieves the details of a nat ruleGet.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnGatewayNatRule> getAsync(String resourceGroupName, String gatewayName, String natRuleName);

    /**
     * Retrieves all nat rules for a particular virtual wan vpn gateway.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnGatewayNatRule> listByVpnGatewayAsync(final String resourceGroupName, final String gatewayName);

    /**
     * Deletes a nat rule.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param natRuleName The name of the nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String gatewayName, String natRuleName);

}
