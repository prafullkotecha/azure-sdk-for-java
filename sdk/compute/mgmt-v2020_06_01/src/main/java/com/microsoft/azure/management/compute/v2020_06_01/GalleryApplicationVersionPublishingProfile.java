/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The publishing profile of a gallery Image Version.
 */
public class GalleryApplicationVersionPublishingProfile extends GalleryArtifactPublishingProfileBase {
    /**
     * The source property.
     */
    @JsonProperty(value = "source", required = true)
    private UserArtifactSource source;

    /**
     * Optional. May be used to help process this file. The type of file
     * contained in the source, e.g. zip, json, etc.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * Optional. Whether or not this application reports health.
     */
    @JsonProperty(value = "enableHealthCheck")
    private Boolean enableHealthCheck;

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public UserArtifactSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withSource(UserArtifactSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get optional. May be used to help process this file. The type of file contained in the source, e.g. zip, json, etc.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set optional. May be used to help process this file. The type of file contained in the source, e.g. zip, json, etc.
     *
     * @param contentType the contentType value to set
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get optional. Whether or not this application reports health.
     *
     * @return the enableHealthCheck value
     */
    public Boolean enableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * Set optional. Whether or not this application reports health.
     *
     * @param enableHealthCheck the enableHealthCheck value to set
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }

}
