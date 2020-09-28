/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.SitePhpErrorLogFlag;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SitePhpErrorLogFlagImpl extends WrapperImpl<SitePhpErrorLogFlagInner> implements SitePhpErrorLogFlag {
    private final AppServiceManager manager;
    SitePhpErrorLogFlagImpl(SitePhpErrorLogFlagInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String localLogErrors() {
        return this.inner().localLogErrors();
    }

    @Override
    public String localLogErrorsMaxLength() {
        return this.inner().localLogErrorsMaxLength();
    }

    @Override
    public String masterLogErrors() {
        return this.inner().masterLogErrors();
    }

    @Override
    public String masterLogErrorsMaxLength() {
        return this.inner().masterLogErrorsMaxLength();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
