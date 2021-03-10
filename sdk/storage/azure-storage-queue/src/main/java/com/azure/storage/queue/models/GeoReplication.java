// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The GeoReplication model. */
@JacksonXmlRootElement(localName = "GeoReplication")
@Fluent
public final class GeoReplication {
    /*
     * The status of the secondary location
     */
    @JsonProperty(value = "Status", required = true)
    private GeoReplicationStatus status;

    /*
     * A GMT date/time value, to the second. All primary writes preceding this
     * value are guaranteed to be available for read operations at the
     * secondary. Primary writes after this point in time may or may not be
     * available for reads.
     */
    @JsonProperty(value = "LastSyncTime", required = true)
    private DateTimeRfc1123 lastSyncTime;

    /**
     * Get the status property: The status of the secondary location.
     *
     * @return the status value.
     */
    public GeoReplicationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the secondary location.
     *
     * @param status the status value to set.
     * @return the GeoReplication object itself.
     */
    public GeoReplication setStatus(GeoReplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the lastSyncTime property: A GMT date/time value, to the second. All primary writes preceding this value are
     * guaranteed to be available for read operations at the secondary. Primary writes after this point in time may or
     * may not be available for reads.
     *
     * @return the lastSyncTime value.
     */
    public OffsetDateTime getLastSyncTime() {
        if (this.lastSyncTime == null) {
            return null;
        }
        return this.lastSyncTime.getDateTime();
    }

    /**
     * Set the lastSyncTime property: A GMT date/time value, to the second. All primary writes preceding this value are
     * guaranteed to be available for read operations at the secondary. Primary writes after this point in time may or
     * may not be available for reads.
     *
     * @param lastSyncTime the lastSyncTime value to set.
     * @return the GeoReplication object itself.
     */
    public GeoReplication setLastSyncTime(OffsetDateTime lastSyncTime) {
        if (lastSyncTime == null) {
            this.lastSyncTime = null;
        } else {
            this.lastSyncTime = new DateTimeRfc1123(lastSyncTime);
        }
        return this;
    }
}
