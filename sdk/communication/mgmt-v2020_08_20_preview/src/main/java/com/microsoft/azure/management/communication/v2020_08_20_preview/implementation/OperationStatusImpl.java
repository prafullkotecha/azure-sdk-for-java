/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.communication.v2020_08_20_preview.implementation;

import com.microsoft.azure.management.communication.v2020_08_20_preview.OperationStatus;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.communication.v2020_08_20_preview.ErrorResponseError;
import com.microsoft.azure.management.communication.v2020_08_20_preview.Status;

class OperationStatusImpl extends IndexableRefreshableWrapperImpl<OperationStatus, OperationStatusInner> implements OperationStatus {
    private final CommunicationManager manager;
    private String location;
    private String operationId;

    OperationStatusImpl(OperationStatusInner inner,  CommunicationManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operationStatuses");
    }

    @Override
    public CommunicationManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<OperationStatusInner> getInnerAsync() {
        OperationStatusesInner client = this.manager().inner().operationStatuses();
        return client.getAsync(this.location, this.operationId);
    }



    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public ErrorResponseError error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Double percentComplete() {
        return this.inner().percentComplete();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public Status status() {
        return this.inner().status();
    }

}
