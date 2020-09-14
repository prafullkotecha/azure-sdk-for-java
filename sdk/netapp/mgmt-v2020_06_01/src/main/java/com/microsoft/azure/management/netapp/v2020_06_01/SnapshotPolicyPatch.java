/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Snapshot policy Details for create and update.
 */
@JsonFlatten
public class SnapshotPolicyPatch {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * hourlySchedule.
     * Schedule for hourly snapshots.
     */
    @JsonProperty(value = "properties.hourlySchedule")
    private Object hourlySchedule;

    /**
     * dailySchedule.
     * Schedule for daily snapshots.
     */
    @JsonProperty(value = "properties.dailySchedule")
    private Object dailySchedule;

    /**
     * weeklySchedule.
     * Schedule for weekly snapshots.
     */
    @JsonProperty(value = "properties.weeklySchedule")
    private Object weeklySchedule;

    /**
     * monthlySchedule.
     * Schedule for monthly snapshots.
     */
    @JsonProperty(value = "properties.monthlySchedule")
    private Object monthlySchedule;

    /**
     * The property to decide policy is enabled or not.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get resource Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get schedule for hourly snapshots.
     *
     * @return the hourlySchedule value
     */
    public Object hourlySchedule() {
        return this.hourlySchedule;
    }

    /**
     * Set schedule for hourly snapshots.
     *
     * @param hourlySchedule the hourlySchedule value to set
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withHourlySchedule(Object hourlySchedule) {
        this.hourlySchedule = hourlySchedule;
        return this;
    }

    /**
     * Get schedule for daily snapshots.
     *
     * @return the dailySchedule value
     */
    public Object dailySchedule() {
        return this.dailySchedule;
    }

    /**
     * Set schedule for daily snapshots.
     *
     * @param dailySchedule the dailySchedule value to set
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withDailySchedule(Object dailySchedule) {
        this.dailySchedule = dailySchedule;
        return this;
    }

    /**
     * Get schedule for weekly snapshots.
     *
     * @return the weeklySchedule value
     */
    public Object weeklySchedule() {
        return this.weeklySchedule;
    }

    /**
     * Set schedule for weekly snapshots.
     *
     * @param weeklySchedule the weeklySchedule value to set
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withWeeklySchedule(Object weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
        return this;
    }

    /**
     * Get schedule for monthly snapshots.
     *
     * @return the monthlySchedule value
     */
    public Object monthlySchedule() {
        return this.monthlySchedule;
    }

    /**
     * Set schedule for monthly snapshots.
     *
     * @param monthlySchedule the monthlySchedule value to set
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withMonthlySchedule(Object monthlySchedule) {
        this.monthlySchedule = monthlySchedule;
        return this;
    }

    /**
     * Get the property to decide policy is enabled or not.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the property to decide policy is enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
