/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerservice.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerservice.v2020_12_01.ResolvePrivateLinkServiceIds;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2020_12_01.PrivateLinkResource;

class ResolvePrivateLinkServiceIdsImpl extends WrapperImpl<ResolvePrivateLinkServiceIdsInner> implements ResolvePrivateLinkServiceIds {
    private final ContainerServiceManager manager;

    ResolvePrivateLinkServiceIdsImpl(ContainerServiceManager manager) {
        super(manager.inner().resolvePrivateLinkServiceIds());
        this.manager = manager;
    }

    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PrivateLinkResource> pOSTAsync(String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters) {
        ResolvePrivateLinkServiceIdsInner client = this.inner();
        return client.pOSTAsync(resourceGroupName, resourceName, parameters)
        .map(new Func1<PrivateLinkResourceInner, PrivateLinkResource>() {
            @Override
            public PrivateLinkResource call(PrivateLinkResourceInner inner) {
                return new PrivateLinkResourceImpl(inner, manager());
            }
        });
    }

}
