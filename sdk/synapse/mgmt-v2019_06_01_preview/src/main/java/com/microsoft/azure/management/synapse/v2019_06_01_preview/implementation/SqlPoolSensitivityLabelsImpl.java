/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SensitivityLabelSource;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSensitivityLabels;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SensitivityLabels;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.CurrentSensitivityLabels;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.RecommendedSensitivityLabels;

class SqlPoolSensitivityLabelsImpl extends WrapperImpl<SqlPoolSensitivityLabelsInner> implements SqlPoolSensitivityLabels {
    private final SynapseManager manager;

    SqlPoolSensitivityLabelsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolSensitivityLabels());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public SensitivityLabelsImpl define(String name) {
        return wrapModel(name);
    }

    private SensitivityLabelsImpl wrapModel(SensitivityLabelInner inner) {
        return  new SensitivityLabelsImpl(inner, manager());
    }

    private SensitivityLabelsImpl wrapModel(String name) {
        return new SensitivityLabelsImpl(name, this.manager());
    }

    @Override
    public Completable enableRecommendationAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName, String columnName) {
        SqlPoolSensitivityLabelsInner client = this.inner();
        return client.enableRecommendationAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName).toCompletable();
    }

    @Override
    public Completable disableRecommendationAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName, String columnName) {
        SqlPoolSensitivityLabelsInner client = this.inner();
        return client.disableRecommendationAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName).toCompletable();
    }

    @Override
    public Observable<SensitivityLabels> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName, String columnName, SensitivityLabelSource sensitivityLabelSource) {
        SqlPoolSensitivityLabelsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName, sensitivityLabelSource)
        .flatMap(new Func1<SensitivityLabelInner, Observable<SensitivityLabels>>() {
            @Override
            public Observable<SensitivityLabels> call(SensitivityLabelInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SensitivityLabels)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName, String columnName) {
        SqlPoolSensitivityLabelsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName).toCompletable();
    }

    private CurrentSensitivityLabelsImpl wrapCurrentSensitivityLabelsModel(SensitivityLabelInner inner) {
        return  new CurrentSensitivityLabelsImpl(inner, manager());
    }

    private RecommendedSensitivityLabelsImpl wrapRecommendedSensitivityLabelsModel(SensitivityLabelInner inner) {
        return  new RecommendedSensitivityLabelsImpl(inner, manager());
    }

    @Override
    public Observable<CurrentSensitivityLabels> listCurrentAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolSensitivityLabelsInner client = this.inner();
        return client.listCurrentAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<SensitivityLabelInner>, Iterable<SensitivityLabelInner>>() {
            @Override
            public Iterable<SensitivityLabelInner> call(Page<SensitivityLabelInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SensitivityLabelInner, CurrentSensitivityLabels>() {
            @Override
            public CurrentSensitivityLabels call(SensitivityLabelInner inner) {
                return wrapCurrentSensitivityLabelsModel(inner);
            }
        });
    }

    @Override
    public Observable<RecommendedSensitivityLabels> listRecommendedAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolSensitivityLabelsInner client = this.inner();
        return client.listRecommendedAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<SensitivityLabelInner>, Iterable<SensitivityLabelInner>>() {
            @Override
            public Iterable<SensitivityLabelInner> call(Page<SensitivityLabelInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SensitivityLabelInner, RecommendedSensitivityLabels>() {
            @Override
            public RecommendedSensitivityLabels call(SensitivityLabelInner inner) {
                return wrapRecommendedSensitivityLabelsModel(inner);
            }
        });
    }

}
