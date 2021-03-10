/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontendEndpoints;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.frontdoor.v2020_05_01.CustomHttpsConfiguration;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontendEndpoint;

class FrontendEndpointsImpl extends WrapperImpl<FrontendEndpointsInner> implements FrontendEndpoints {
    private final NetworkManager manager;

    FrontendEndpointsImpl(NetworkManager manager) {
        super(manager.inner().frontendEndpoints());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private FrontendEndpointImpl wrapModel(FrontendEndpointInner inner) {
        return  new FrontendEndpointImpl(inner, manager());
    }

    @Override
    public Completable enableHttpsAsync(String resourceGroupName, String frontDoorName, String frontendEndpointName, CustomHttpsConfiguration customHttpsConfiguration) {
        FrontendEndpointsInner client = this.inner();
        return client.enableHttpsAsync(resourceGroupName, frontDoorName, frontendEndpointName, customHttpsConfiguration).toCompletable();
    }

    @Override
    public Completable disableHttpsAsync(String resourceGroupName, String frontDoorName, String frontendEndpointName) {
        FrontendEndpointsInner client = this.inner();
        return client.disableHttpsAsync(resourceGroupName, frontDoorName, frontendEndpointName).toCompletable();
    }

    @Override
    public Observable<FrontendEndpoint> listByFrontDoorAsync(final String resourceGroupName, final String frontDoorName) {
        FrontendEndpointsInner client = this.inner();
        return client.listByFrontDoorAsync(resourceGroupName, frontDoorName)
        .flatMapIterable(new Func1<Page<FrontendEndpointInner>, Iterable<FrontendEndpointInner>>() {
            @Override
            public Iterable<FrontendEndpointInner> call(Page<FrontendEndpointInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FrontendEndpointInner, FrontendEndpoint>() {
            @Override
            public FrontendEndpoint call(FrontendEndpointInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<FrontendEndpoint> getAsync(String resourceGroupName, String frontDoorName, String frontendEndpointName) {
        FrontendEndpointsInner client = this.inner();
        return client.getAsync(resourceGroupName, frontDoorName, frontendEndpointName)
        .flatMap(new Func1<FrontendEndpointInner, Observable<FrontendEndpoint>>() {
            @Override
            public Observable<FrontendEndpoint> call(FrontendEndpointInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((FrontendEndpoint)wrapModel(inner));
                }
            }
       });
    }

}
