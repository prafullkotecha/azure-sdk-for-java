/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Binding resource properties payload.
 */
public class BindingResourceProperties {
    /**
     * The name of the bound resource.
     */
    @JsonProperty(value = "resourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceName;

    /**
     * The standard Azure resource type of the bound resource.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The Azure resource id of the bound resource.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The key of the bound resource.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Binding parameters of the Binding resource.
     */
    @JsonProperty(value = "bindingParameters")
    private Map<String, Object> bindingParameters;

    /**
     * The generated Spring Boot property file for this binding. The secret
     * will be deducted.
     */
    @JsonProperty(value = "generatedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private String generatedProperties;

    /**
     * Creation time of the Binding resource.
     */
    @JsonProperty(value = "createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private String createdAt;

    /**
     * Update time of the Binding resource.
     */
    @JsonProperty(value = "updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private String updatedAt;

    /**
     * Get the name of the bound resource.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the standard Azure resource type of the bound resource.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the Azure resource id of the bound resource.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the Azure resource id of the bound resource.
     *
     * @param resourceId the resourceId value to set
     * @return the BindingResourceProperties object itself.
     */
    public BindingResourceProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the key of the bound resource.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key of the bound resource.
     *
     * @param key the key value to set
     * @return the BindingResourceProperties object itself.
     */
    public BindingResourceProperties withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get binding parameters of the Binding resource.
     *
     * @return the bindingParameters value
     */
    public Map<String, Object> bindingParameters() {
        return this.bindingParameters;
    }

    /**
     * Set binding parameters of the Binding resource.
     *
     * @param bindingParameters the bindingParameters value to set
     * @return the BindingResourceProperties object itself.
     */
    public BindingResourceProperties withBindingParameters(Map<String, Object> bindingParameters) {
        this.bindingParameters = bindingParameters;
        return this;
    }

    /**
     * Get the generated Spring Boot property file for this binding. The secret will be deducted.
     *
     * @return the generatedProperties value
     */
    public String generatedProperties() {
        return this.generatedProperties;
    }

    /**
     * Get creation time of the Binding resource.
     *
     * @return the createdAt value
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Get update time of the Binding resource.
     *
     * @return the updatedAt value
     */
    public String updatedAt() {
        return this.updatedAt;
    }

}
