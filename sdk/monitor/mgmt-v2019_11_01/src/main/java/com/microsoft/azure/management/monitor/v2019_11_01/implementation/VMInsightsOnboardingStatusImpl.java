/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.management.monitor.v2019_11_01.VMInsightsOnboardingStatus;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.monitor.v2019_11_01.DataContainer;
import com.microsoft.azure.management.monitor.v2019_11_01.DataStatus;
import com.microsoft.azure.management.monitor.v2019_11_01.OnboardingStatus;

class VMInsightsOnboardingStatusImpl extends WrapperImpl<VMInsightsOnboardingStatusInner> implements VMInsightsOnboardingStatus {
    private final MonitorManager manager;
    VMInsightsOnboardingStatusImpl(VMInsightsOnboardingStatusInner inner, MonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public List<DataContainer> data() {
        return this.inner().data();
    }

    @Override
    public DataStatus dataStatus() {
        return this.inner().dataStatus();
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
    public OnboardingStatus onboardingStatus() {
        return this.inner().onboardingStatus();
    }

    @Override
    public String resourceId() {
        return this.inner().resourceId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
