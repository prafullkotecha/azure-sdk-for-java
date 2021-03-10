/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MonitorManager;
import java.util.List;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.AzureMonitorPrivateLinkScopeInner;

/**
 * Type representing AzureMonitorPrivateLinkScope.
 */
public interface AzureMonitorPrivateLinkScope extends HasInner<AzureMonitorPrivateLinkScopeInner>, Resource, GroupableResourceCore<MonitorManager, AzureMonitorPrivateLinkScopeInner>, HasResourceGroup, Refreshable<AzureMonitorPrivateLinkScope>, Updatable<AzureMonitorPrivateLinkScope.Update>, HasManager<MonitorManager> {
    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the AzureMonitorPrivateLinkScope definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AzureMonitorPrivateLinkScope definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AzureMonitorPrivateLinkScope definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AzureMonitorPrivateLinkScope definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AzureMonitorPrivateLinkScope>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a AzureMonitorPrivateLinkScope update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AzureMonitorPrivateLinkScope>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of AzureMonitorPrivateLinkScope update stages.
     */
    interface UpdateStages {
    }
}
