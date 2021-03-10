// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Usages. */
public interface Usages {
    /**
     * Fetches the usages of the vault.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return usage for vault.
     */
    PagedIterable<VaultUsage> listByVaults(String resourceGroupName, String vaultName);

    /**
     * Fetches the usages of the vault.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return usage for vault.
     */
    PagedIterable<VaultUsage> listByVaults(String resourceGroupName, String vaultName, Context context);
}
