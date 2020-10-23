/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18.implementation;

import com.microsoft.azure.management.kusto.v2020_09_18.AzureResourceSku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.kusto.v2020_09_18.AzureCapacity;
import com.microsoft.azure.management.kusto.v2020_09_18.AzureSku;

class AzureResourceSkuImpl extends WrapperImpl<AzureResourceSkuInner> implements AzureResourceSku {
    private final KustoManager manager;

    AzureResourceSkuImpl(AzureResourceSkuInner inner,  KustoManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }



    @Override
    public AzureCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public AzureSku sku() {
        return this.inner().sku();
    }

}
