/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mariadb.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mariadb.v2020_01_01.FirewallRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.mariadb.v2020_01_01.FirewallRule;

class FirewallRulesImpl extends WrapperImpl<FirewallRulesInner> implements FirewallRules {
    private final MariaDBManager manager;

    FirewallRulesImpl(MariaDBManager manager) {
        super(manager.inner().firewallRules());
        this.manager = manager;
    }

    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    public FirewallRuleImpl define(String name) {
        return wrapModel(name);
    }

    private FirewallRuleImpl wrapModel(FirewallRuleInner inner) {
        return  new FirewallRuleImpl(inner, manager());
    }

    private FirewallRuleImpl wrapModel(String name) {
        return new FirewallRuleImpl(name, this.manager());
    }

    @Override
    public Observable<FirewallRule> listByServerAsync(String resourceGroupName, String serverName) {
        FirewallRulesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<FirewallRuleInner>, Observable<FirewallRuleInner>>() {
            @Override
            public Observable<FirewallRuleInner> call(List<FirewallRuleInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<FirewallRuleInner, FirewallRule>() {
            @Override
            public FirewallRule call(FirewallRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<FirewallRule> getAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        FirewallRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, firewallRuleName)
        .flatMap(new Func1<FirewallRuleInner, Observable<FirewallRule>>() {
            @Override
            public Observable<FirewallRule> call(FirewallRuleInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((FirewallRule)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String firewallRuleName) {
        FirewallRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, firewallRuleName).toCompletable();
    }

}
