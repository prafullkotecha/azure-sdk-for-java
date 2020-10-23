/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.commerce.v2015_06_01_preview.implementation;

import java.util.UUID;
import org.joda.time.DateTime;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.InfoField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes the usageAggregation.
 */
@JsonFlatten
public class UsageAggregationInner {
    /**
     * Unique Id for the usage aggregate.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Name of the usage aggregate.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Type of the resource being returned.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The subscription identifier for the Azure user.
     */
    @JsonProperty(value = "properties.subscriptionId")
    private UUID subscriptionId;

    /**
     * Unique ID for the resource that was consumed (aka ResourceID).
     */
    @JsonProperty(value = "properties.meterId")
    private String meterId;

    /**
     * UTC start time for the usage bucket to which this usage aggregate
     * belongs.
     */
    @JsonProperty(value = "properties.usageStartTime")
    private DateTime usageStartTime;

    /**
     * UTC end time for the usage bucket to which this usage aggregate belongs.
     */
    @JsonProperty(value = "properties.usageEndTime")
    private DateTime usageEndTime;

    /**
     * The amount of the resource consumption that occurred in this time frame.
     */
    @JsonProperty(value = "properties.quantity")
    private Double quantity;

    /**
     * The unit in which the usage for this resource is being counted, e.g.
     * Hours, GB.
     */
    @JsonProperty(value = "properties.unit")
    private String unit;

    /**
     * Friendly name of the resource being consumed.
     */
    @JsonProperty(value = "properties.meterName")
    private String meterName;

    /**
     * Category of the consumed resource.
     */
    @JsonProperty(value = "properties.meterCategory")
    private String meterCategory;

    /**
     * Sub-category of the consumed resource.
     */
    @JsonProperty(value = "properties.meterSubCategory")
    private String meterSubCategory;

    /**
     * Region of the meterId used for billing purposes.
     */
    @JsonProperty(value = "properties.meterRegion")
    private String meterRegion;

    /**
     * Key-value pairs of instance details (legacy format).
     */
    @JsonProperty(value = "properties.infoFields")
    private InfoField infoFields;

    /**
     * Key-value pairs of instance details represented as a string.
     */
    @JsonProperty(value = "properties.instanceData")
    private String instanceData;

    /**
     * Get unique Id for the usage aggregate.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set unique Id for the usage aggregate.
     *
     * @param id the id value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get name of the usage aggregate.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the usage aggregate.
     *
     * @param name the name value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get type of the resource being returned.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the resource being returned.
     *
     * @param type the type value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the subscription identifier for the Azure user.
     *
     * @return the subscriptionId value
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscription identifier for the Azure user.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get unique ID for the resource that was consumed (aka ResourceID).
     *
     * @return the meterId value
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Set unique ID for the resource that was consumed (aka ResourceID).
     *
     * @param meterId the meterId value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withMeterId(String meterId) {
        this.meterId = meterId;
        return this;
    }

    /**
     * Get uTC start time for the usage bucket to which this usage aggregate belongs.
     *
     * @return the usageStartTime value
     */
    public DateTime usageStartTime() {
        return this.usageStartTime;
    }

    /**
     * Set uTC start time for the usage bucket to which this usage aggregate belongs.
     *
     * @param usageStartTime the usageStartTime value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withUsageStartTime(DateTime usageStartTime) {
        this.usageStartTime = usageStartTime;
        return this;
    }

    /**
     * Get uTC end time for the usage bucket to which this usage aggregate belongs.
     *
     * @return the usageEndTime value
     */
    public DateTime usageEndTime() {
        return this.usageEndTime;
    }

    /**
     * Set uTC end time for the usage bucket to which this usage aggregate belongs.
     *
     * @param usageEndTime the usageEndTime value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withUsageEndTime(DateTime usageEndTime) {
        this.usageEndTime = usageEndTime;
        return this;
    }

    /**
     * Get the amount of the resource consumption that occurred in this time frame.
     *
     * @return the quantity value
     */
    public Double quantity() {
        return this.quantity;
    }

    /**
     * Set the amount of the resource consumption that occurred in this time frame.
     *
     * @param quantity the quantity value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the unit in which the usage for this resource is being counted, e.g. Hours, GB.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit in which the usage for this resource is being counted, e.g. Hours, GB.
     *
     * @param unit the unit value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get friendly name of the resource being consumed.
     *
     * @return the meterName value
     */
    public String meterName() {
        return this.meterName;
    }

    /**
     * Set friendly name of the resource being consumed.
     *
     * @param meterName the meterName value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withMeterName(String meterName) {
        this.meterName = meterName;
        return this;
    }

    /**
     * Get category of the consumed resource.
     *
     * @return the meterCategory value
     */
    public String meterCategory() {
        return this.meterCategory;
    }

    /**
     * Set category of the consumed resource.
     *
     * @param meterCategory the meterCategory value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withMeterCategory(String meterCategory) {
        this.meterCategory = meterCategory;
        return this;
    }

    /**
     * Get sub-category of the consumed resource.
     *
     * @return the meterSubCategory value
     */
    public String meterSubCategory() {
        return this.meterSubCategory;
    }

    /**
     * Set sub-category of the consumed resource.
     *
     * @param meterSubCategory the meterSubCategory value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withMeterSubCategory(String meterSubCategory) {
        this.meterSubCategory = meterSubCategory;
        return this;
    }

    /**
     * Get region of the meterId used for billing purposes.
     *
     * @return the meterRegion value
     */
    public String meterRegion() {
        return this.meterRegion;
    }

    /**
     * Set region of the meterId used for billing purposes.
     *
     * @param meterRegion the meterRegion value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withMeterRegion(String meterRegion) {
        this.meterRegion = meterRegion;
        return this;
    }

    /**
     * Get key-value pairs of instance details (legacy format).
     *
     * @return the infoFields value
     */
    public InfoField infoFields() {
        return this.infoFields;
    }

    /**
     * Set key-value pairs of instance details (legacy format).
     *
     * @param infoFields the infoFields value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withInfoFields(InfoField infoFields) {
        this.infoFields = infoFields;
        return this;
    }

    /**
     * Get key-value pairs of instance details represented as a string.
     *
     * @return the instanceData value
     */
    public String instanceData() {
        return this.instanceData;
    }

    /**
     * Set key-value pairs of instance details represented as a string.
     *
     * @param instanceData the instanceData value to set
     * @return the UsageAggregationInner object itself.
     */
    public UsageAggregationInner withInstanceData(String instanceData) {
        this.instanceData = instanceData;
        return this;
    }

}
