/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.peering.v2019_08_01_preview.PeeringServiceLocation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class PeeringServiceLocationImpl extends WrapperImpl<PeeringServiceLocationInner> implements PeeringServiceLocation {
    private final PeeringManager manager;

    PeeringServiceLocationImpl(PeeringServiceLocationInner inner,  PeeringManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PeeringManager manager() {
        return this.manager;
    }



    @Override
    public String azureRegion() {
        return this.inner().azureRegion();
    }

    @Override
    public String country() {
        return this.inner().country();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}