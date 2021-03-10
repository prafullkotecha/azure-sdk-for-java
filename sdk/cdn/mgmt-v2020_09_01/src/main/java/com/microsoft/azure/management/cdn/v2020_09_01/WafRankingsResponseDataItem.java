/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WafRankingsResponseDataItem model.
 */
public class WafRankingsResponseDataItem {
    /**
     * The groupValues property.
     */
    @JsonProperty(value = "groupValues")
    private List<String> groupValues;

    /**
     * The metrics property.
     */
    @JsonProperty(value = "metrics")
    private List<WafRankingsResponseDataItemMetricsItem> metrics;

    /**
     * Get the groupValues value.
     *
     * @return the groupValues value
     */
    public List<String> groupValues() {
        return this.groupValues;
    }

    /**
     * Set the groupValues value.
     *
     * @param groupValues the groupValues value to set
     * @return the WafRankingsResponseDataItem object itself.
     */
    public WafRankingsResponseDataItem withGroupValues(List<String> groupValues) {
        this.groupValues = groupValues;
        return this;
    }

    /**
     * Get the metrics value.
     *
     * @return the metrics value
     */
    public List<WafRankingsResponseDataItemMetricsItem> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics value.
     *
     * @param metrics the metrics value to set
     * @return the WafRankingsResponseDataItem object itself.
     */
    public WafRankingsResponseDataItem withMetrics(List<WafRankingsResponseDataItemMetricsItem> metrics) {
        this.metrics = metrics;
        return this;
    }

}
