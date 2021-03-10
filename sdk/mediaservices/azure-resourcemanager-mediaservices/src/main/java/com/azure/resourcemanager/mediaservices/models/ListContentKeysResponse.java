// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.resourcemanager.mediaservices.fluent.models.ListContentKeysResponseInner;
import java.util.List;

/** An immutable client-side representation of ListContentKeysResponse. */
public interface ListContentKeysResponse {
    /**
     * Gets the contentKeys property: ContentKeys used by current Streaming Locator.
     *
     * @return the contentKeys value.
     */
    List<StreamingLocatorContentKey> contentKeys();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.ListContentKeysResponseInner object.
     *
     * @return the inner object.
     */
    ListContentKeysResponseInner innerModel();
}
