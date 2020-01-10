/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Day of the week.
 */
public class Day {
    /**
     * Date of the month.
     */
    @JsonProperty(value = "date")
    private Integer dateProperty;

    /**
     * Whether Date is last date of month.
     */
    @JsonProperty(value = "isLast")
    private Boolean isLast;

    /**
     * Get date of the month.
     *
     * @return the dateProperty value
     */
    public Integer dateProperty() {
        return this.dateProperty;
    }

    /**
     * Set date of the month.
     *
     * @param dateProperty the dateProperty value to set
     * @return the Day object itself.
     */
    public Day withDateProperty(Integer dateProperty) {
        this.dateProperty = dateProperty;
        return this;
    }

    /**
     * Get whether Date is last date of month.
     *
     * @return the isLast value
     */
    public Boolean isLast() {
        return this.isLast;
    }

    /**
     * Set whether Date is last date of month.
     *
     * @param isLast the isLast value to set
     * @return the Day object itself.
     */
    public Day withIsLast(Boolean isLast) {
        this.isLast = isLast;
        return this;
    }

}