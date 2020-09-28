// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.fluent.models.EdgeNodeInner;

/** An instance of this class provides access to all the operations defined in EdgeNodesClient. */
public interface EdgeNodesClient {
    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list CDN edgenodes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<EdgeNodeInner> listAsync();

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list CDN edgenodes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EdgeNodeInner> list();

    /**
     * Edgenodes are the global Point of Presence (POP) locations used to deliver CDN content to end users.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list CDN edgenodes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EdgeNodeInner> list(Context context);
}
