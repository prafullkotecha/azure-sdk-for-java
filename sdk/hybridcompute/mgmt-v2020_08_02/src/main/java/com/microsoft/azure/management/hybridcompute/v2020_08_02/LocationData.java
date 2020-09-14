/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2020_08_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata pertaining to the geographic location of the resource.
 */
public class LocationData {
    /**
     * A canonical name for the geographic or physical location.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The city or locality where the resource is located.
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * The district, state, or province where the resource is located.
     */
    @JsonProperty(value = "district")
    private String district;

    /**
     * The country or region where the resource is located.
     */
    @JsonProperty(value = "countryOrRegion")
    private String countryOrRegion;

    /**
     * Get a canonical name for the geographic or physical location.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set a canonical name for the geographic or physical location.
     *
     * @param name the name value to set
     * @return the LocationData object itself.
     */
    public LocationData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the city or locality where the resource is located.
     *
     * @return the city value
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city or locality where the resource is located.
     *
     * @param city the city value to set
     * @return the LocationData object itself.
     */
    public LocationData withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the district, state, or province where the resource is located.
     *
     * @return the district value
     */
    public String district() {
        return this.district;
    }

    /**
     * Set the district, state, or province where the resource is located.
     *
     * @param district the district value to set
     * @return the LocationData object itself.
     */
    public LocationData withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * Get the country or region where the resource is located.
     *
     * @return the countryOrRegion value
     */
    public String countryOrRegion() {
        return this.countryOrRegion;
    }

    /**
     * Set the country or region where the resource is located.
     *
     * @param countryOrRegion the countryOrRegion value to set
     * @return the LocationData object itself.
     */
    public LocationData withCountryOrRegion(String countryOrRegion) {
        this.countryOrRegion = countryOrRegion;
        return this;
    }

}
