// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Report for a custom model training document. */
@Fluent
public final class TrainingDocumentInfo {
    /*
     * Training document name.
     */
    @JsonProperty(value = "documentName", required = true)
    private String documentName;

    /*
     * Total number of pages trained.
     */
    @JsonProperty(value = "pages", required = true)
    private int pages;

    /*
     * List of errors.
     */
    @JsonProperty(value = "errors", required = true)
    private List<ErrorInformation> errors;

    /*
     * Status of the training operation.
     */
    @JsonProperty(value = "status", required = true)
    private TrainStatus status;

    /**
     * Get the documentName property: Training document name.
     *
     * @return the documentName value.
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * Set the documentName property: Training document name.
     *
     * @param documentName the documentName value to set.
     * @return the TrainingDocumentInfo object itself.
     */
    public TrainingDocumentInfo setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * Get the pages property: Total number of pages trained.
     *
     * @return the pages value.
     */
    public int getPages() {
        return this.pages;
    }

    /**
     * Set the pages property: Total number of pages trained.
     *
     * @param pages the pages value to set.
     * @return the TrainingDocumentInfo object itself.
     */
    public TrainingDocumentInfo setPages(int pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get the errors property: List of errors.
     *
     * @return the errors value.
     */
    public List<ErrorInformation> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: List of errors.
     *
     * @param errors the errors value to set.
     * @return the TrainingDocumentInfo object itself.
     */
    public TrainingDocumentInfo setErrors(List<ErrorInformation> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the status property: Status of the training operation.
     *
     * @return the status value.
     */
    public TrainStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the training operation.
     *
     * @param status the status value to set.
     * @return the TrainingDocumentInfo object itself.
     */
    public TrainingDocumentInfo setStatus(TrainStatus status) {
        this.status = status;
        return this;
    }
}
