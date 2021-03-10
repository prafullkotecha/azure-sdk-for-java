// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** uploadSession. */
@Fluent
public final class MicrosoftGraphUploadSession {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphUploadSession.class);

    /*
     * The date and time in UTC that the upload session will expire. The
     * complete file must be uploaded before this expiration time is reached.
     */
    @JsonProperty(value = "expirationDateTime")
    private OffsetDateTime expirationDateTime;

    /*
     * A collection of byte ranges that the server is missing for the file.
     * These ranges are zero indexed and of the format 'start-end' (e.g. '0-26'
     * to indicate the first 27 bytes of the file). When uploading files as
     * Outlook attachments, instead of a collection of ranges, this property
     * always indicates a single value '{start}', the location in the file
     * where the next upload should begin.
     */
    @JsonProperty(value = "nextExpectedRanges")
    private List<String> nextExpectedRanges;

    /*
     * The URL endpoint that accepts PUT requests for byte ranges of the file.
     */
    @JsonProperty(value = "uploadUrl")
    private String uploadUrl;

    /*
     * uploadSession
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the expirationDateTime property: The date and time in UTC that the upload session will expire. The complete
     * file must be uploaded before this expiration time is reached.
     *
     * @return the expirationDateTime value.
     */
    public OffsetDateTime expirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: The date and time in UTC that the upload session will expire. The complete
     * file must be uploaded before this expiration time is reached.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the MicrosoftGraphUploadSession object itself.
     */
    public MicrosoftGraphUploadSession withExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the nextExpectedRanges property: A collection of byte ranges that the server is missing for the file. These
     * ranges are zero indexed and of the format 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file).
     * When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a
     * single value '{start}', the location in the file where the next upload should begin.
     *
     * @return the nextExpectedRanges value.
     */
    public List<String> nextExpectedRanges() {
        return this.nextExpectedRanges;
    }

    /**
     * Set the nextExpectedRanges property: A collection of byte ranges that the server is missing for the file. These
     * ranges are zero indexed and of the format 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file).
     * When uploading files as Outlook attachments, instead of a collection of ranges, this property always indicates a
     * single value '{start}', the location in the file where the next upload should begin.
     *
     * @param nextExpectedRanges the nextExpectedRanges value to set.
     * @return the MicrosoftGraphUploadSession object itself.
     */
    public MicrosoftGraphUploadSession withNextExpectedRanges(List<String> nextExpectedRanges) {
        this.nextExpectedRanges = nextExpectedRanges;
        return this;
    }

    /**
     * Get the uploadUrl property: The URL endpoint that accepts PUT requests for byte ranges of the file.
     *
     * @return the uploadUrl value.
     */
    public String uploadUrl() {
        return this.uploadUrl;
    }

    /**
     * Set the uploadUrl property: The URL endpoint that accepts PUT requests for byte ranges of the file.
     *
     * @param uploadUrl the uploadUrl value to set.
     * @return the MicrosoftGraphUploadSession object itself.
     */
    public MicrosoftGraphUploadSession withUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }

    /**
     * Get the additionalProperties property: uploadSession.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: uploadSession.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphUploadSession object itself.
     */
    public MicrosoftGraphUploadSession withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
