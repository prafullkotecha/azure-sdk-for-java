/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01.implementation;

import com.microsoft.azure.management.resources.v2019_10_01.DeploymentValidateResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_10_01.ErrorResponse;
import com.microsoft.azure.management.resources.v2019_10_01.DeploymentPropertiesExtended;

class DeploymentValidateResultImpl extends WrapperImpl<DeploymentValidateResultInner> implements DeploymentValidateResult {
    private final ResourcesManager manager;
    DeploymentValidateResultImpl(DeploymentValidateResultInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public ErrorResponse error() {
        return this.inner().error();
    }

    @Override
    public DeploymentPropertiesExtended properties() {
        return this.inner().properties();
    }

}
