/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2020_06_01.implementation.BackupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_06_01.implementation.NetAppManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing CapacityPoolNetAppAccountBackup.
 */
public interface CapacityPoolNetAppAccountBackup extends HasInner<BackupInner>, Indexable, Refreshable<CapacityPoolNetAppAccountBackup>, Updatable<CapacityPoolNetAppAccountBackup.Update>, HasManager<NetAppManager> {
    /**
     * @return the backupType value.
     */
    String backupType();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the label value.
     */
    String label();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the size value.
     */
    Long size();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CapacityPoolNetAppAccountBackup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVolume, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CapacityPoolNetAppAccountBackup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CapacityPoolNetAppAccountBackup definition.
         */
        interface Blank extends WithVolume {
        }

        /**
         * The stage of the capacitypoolnetappaccountbackup definition allowing to specify Volume.
         */
        interface WithVolume {
           /**
            * Specifies resourceGroupName, accountName, poolName, volumeName.
            * @param resourceGroupName The name of the resource group
            * @param accountName The name of the NetApp account
            * @param poolName The name of the capacity pool
            * @param volumeName The name of the volume
            * @return the next definition stage
            */
            WithLocation withExistingVolume(String resourceGroupName, String accountName, String poolName, String volumeName);
        }

        /**
         * The stage of the capacitypoolnetappaccountbackup definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the capacitypoolnetappaccountbackup definition allowing to specify Label.
         */
        interface WithLabel {
            /**
             * Specifies label.
             * @param label Label for backup
             * @return the next definition stage
             */
            WithCreate withLabel(String label);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CapacityPoolNetAppAccountBackup>, DefinitionStages.WithLabel {
        }
    }
    /**
     * The template for a CapacityPoolNetAppAccountBackup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CapacityPoolNetAppAccountBackup>, UpdateStages.WithLabel, UpdateStages.WithTags {
    }

    /**
     * Grouping of CapacityPoolNetAppAccountBackup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the capacitypoolnetappaccountbackup update allowing to specify Label.
         */
        interface WithLabel {
            /**
             * Specifies label.
             * @param label Label for backup
             * @return the next update stage
             */
            Update withLabel(String label);
        }

        /**
         * The stage of the capacitypoolnetappaccountbackup update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
