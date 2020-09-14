/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2020_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage Profile properties of a server.
 */
public class StorageProfile {
    /**
     * Backup retention days for the server.
     */
    @JsonProperty(value = "backupRetentionDays")
    private Integer backupRetentionDays;

    /**
     * Enable Geo-redundant or not for server backup. Possible values include:
     * 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "geoRedundantBackup")
    private GeoRedundantBackup geoRedundantBackup;

    /**
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "storageMB")
    private Integer storageMB;

    /**
     * Enable Storage Auto Grow. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "storageAutogrow")
    private StorageAutogrow storageAutogrow;

    /**
     * Get backup retention days for the server.
     *
     * @return the backupRetentionDays value
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }

    /**
     * Set backup retention days for the server.
     *
     * @param backupRetentionDays the backupRetentionDays value to set
     * @return the StorageProfile object itself.
     */
    public StorageProfile withBackupRetentionDays(Integer backupRetentionDays) {
        this.backupRetentionDays = backupRetentionDays;
        return this;
    }

    /**
     * Get enable Geo-redundant or not for server backup. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the geoRedundantBackup value
     */
    public GeoRedundantBackup geoRedundantBackup() {
        return this.geoRedundantBackup;
    }

    /**
     * Set enable Geo-redundant or not for server backup. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param geoRedundantBackup the geoRedundantBackup value to set
     * @return the StorageProfile object itself.
     */
    public StorageProfile withGeoRedundantBackup(GeoRedundantBackup geoRedundantBackup) {
        this.geoRedundantBackup = geoRedundantBackup;
        return this;
    }

    /**
     * Get max storage allowed for a server.
     *
     * @return the storageMB value
     */
    public Integer storageMB() {
        return this.storageMB;
    }

    /**
     * Set max storage allowed for a server.
     *
     * @param storageMB the storageMB value to set
     * @return the StorageProfile object itself.
     */
    public StorageProfile withStorageMB(Integer storageMB) {
        this.storageMB = storageMB;
        return this;
    }

    /**
     * Get enable Storage Auto Grow. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the storageAutogrow value
     */
    public StorageAutogrow storageAutogrow() {
        return this.storageAutogrow;
    }

    /**
     * Set enable Storage Auto Grow. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param storageAutogrow the storageAutogrow value to set
     * @return the StorageProfile object itself.
     */
    public StorageProfile withStorageAutogrow(StorageAutogrow storageAutogrow) {
        this.storageAutogrow = storageAutogrow;
        return this;
    }

}
