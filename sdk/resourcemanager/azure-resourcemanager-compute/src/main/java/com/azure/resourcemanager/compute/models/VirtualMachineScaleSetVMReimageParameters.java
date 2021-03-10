// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Describes a Virtual Machine Scale Set VM Reimage Parameters. */
@Immutable
public final class VirtualMachineScaleSetVMReimageParameters extends VirtualMachineReimageParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMReimageParameters.class);

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetVMReimageParameters withTempDisk(Boolean tempDisk) {
        super.withTempDisk(tempDisk);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
