// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger that runs every time the selected Blob container changes. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobTrigger")
@JsonFlatten
@Fluent
public class BlobTrigger extends MultiplePipelineTrigger {
    /*
     * The path of the container/folder that will trigger the pipeline.
     */
    @JsonProperty(value = "typeProperties.folderPath", required = true)
    private String folderPath;

    /*
     * The max number of parallel files to handle when it is triggered.
     */
    @JsonProperty(value = "typeProperties.maxConcurrency", required = true)
    private int maxConcurrency;

    /*
     * The Azure Storage linked service reference.
     */
    @JsonProperty(value = "typeProperties.linkedService", required = true)
    private LinkedServiceReference linkedService;

    /**
     * Get the folderPath property: The path of the container/folder that will trigger the pipeline.
     *
     * @return the folderPath value.
     */
    public String getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The path of the container/folder that will trigger the pipeline.
     *
     * @param folderPath the folderPath value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger setFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     *
     * @return the maxConcurrency value.
     */
    public int getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     *
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger setMaxConcurrency(int maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get the linkedService property: The Azure Storage linked service reference.
     *
     * @return the linkedService value.
     */
    public LinkedServiceReference getLinkedService() {
        return this.linkedService;
    }

    /**
     * Set the linkedService property: The Azure Storage linked service reference.
     *
     * @param linkedService the linkedService value to set.
     * @return the BlobTrigger object itself.
     */
    public BlobTrigger setLinkedService(LinkedServiceReference linkedService) {
        this.linkedService = linkedService;
        return this;
    }
}
