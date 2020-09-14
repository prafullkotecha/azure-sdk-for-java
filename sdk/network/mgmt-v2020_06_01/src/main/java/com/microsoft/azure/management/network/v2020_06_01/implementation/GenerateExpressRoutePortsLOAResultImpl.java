/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.management.network.v2020_06_01.GenerateExpressRoutePortsLOAResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class GenerateExpressRoutePortsLOAResultImpl extends WrapperImpl<GenerateExpressRoutePortsLOAResultInner> implements GenerateExpressRoutePortsLOAResult {
    private final NetworkManager manager;
    GenerateExpressRoutePortsLOAResultImpl(GenerateExpressRoutePortsLOAResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public String encodedContent() {
        return this.inner().encodedContent();
    }

}
