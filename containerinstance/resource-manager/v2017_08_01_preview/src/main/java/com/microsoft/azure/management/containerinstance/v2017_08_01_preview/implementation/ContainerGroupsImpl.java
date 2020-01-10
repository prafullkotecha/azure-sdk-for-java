/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.containerinstance.v2017_08_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.ContainerGroups;
import com.microsoft.azure.management.containerinstance.v2017_08_01_preview.ContainerGroup;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ContainerGroupsImpl extends GroupableResourcesCoreImpl<ContainerGroup, ContainerGroupImpl, ContainerGroupInner, ContainerGroupsInner, ContainerInstanceManager>  implements ContainerGroups {
    protected ContainerGroupsImpl(ContainerInstanceManager manager) {
        super(manager.inner().containerGroups(), manager);
    }

    @Override
    protected Observable<ContainerGroupInner> getInnerAsync(String resourceGroupName, String name) {
        ContainerGroupsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ContainerGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<ContainerGroup> listByResourceGroup(String resourceGroupName) {
        ContainerGroupsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ContainerGroup> listByResourceGroupAsync(String resourceGroupName) {
        ContainerGroupsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ContainerGroupInner>, Iterable<ContainerGroupInner>>() {
            @Override
            public Iterable<ContainerGroupInner> call(Page<ContainerGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ContainerGroupInner, ContainerGroup>() {
            @Override
            public ContainerGroup call(ContainerGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ContainerGroup> list() {
        ContainerGroupsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ContainerGroup> listAsync() {
        ContainerGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ContainerGroupInner>, Iterable<ContainerGroupInner>>() {
            @Override
            public Iterable<ContainerGroupInner> call(Page<ContainerGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ContainerGroupInner, ContainerGroup>() {
            @Override
            public ContainerGroup call(ContainerGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ContainerGroupImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ContainerGroupImpl wrapModel(ContainerGroupInner inner) {
        return  new ContainerGroupImpl(inner.name(), inner, manager());
    }

    @Override
    protected ContainerGroupImpl wrapModel(String name) {
        return new ContainerGroupImpl(name, new ContainerGroupInner(), this.manager());
    }

}