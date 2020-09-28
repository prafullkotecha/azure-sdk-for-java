// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.VpnSiteInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VpnSitesClient. */
public interface VpnSitesClient
    extends InnerSupportsGet<VpnSiteInner>, InnerSupportsListing<VpnSiteInner>, InnerSupportsDelete<Void> {
    /**
     * Retrieves the details of a VPN site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<VpnSiteInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String vpnSiteName);

    /**
     * Retrieves the details of a VPN site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VpnSiteInner> getByResourceGroupAsync(String resourceGroupName, String vpnSiteName);

    /**
     * Retrieves the details of a VPN site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnSiteInner getByResourceGroup(String resourceGroupName, String vpnSiteName);

    /**
     * Retrieves the details of a VPN site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnSiteInner> getByResourceGroupWithResponse(
        String resourceGroupName, String vpnSiteName, Context context);

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being created or updated.
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters);

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being created or updated.
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<VpnSiteInner>, VpnSiteInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters);

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being created or updated.
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnSiteInner>, VpnSiteInner> beginCreateOrUpdate(
        String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters);

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being created or updated.
     * @param vpnSiteParameters VpnSite Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnSiteInner>, VpnSiteInner> beginCreateOrUpdate(
        String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters, Context context);

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being created or updated.
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VpnSiteInner> createOrUpdateAsync(
        String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters);

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being created or updated.
     * @param vpnSiteParameters VpnSite Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnSiteInner createOrUpdate(String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters);

    /**
     * Creates a VpnSite resource if it doesn't exist else updates the existing VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being created or updated.
     * @param vpnSiteParameters VpnSite Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnSiteInner createOrUpdate(
        String resourceGroupName, String vpnSiteName, VpnSiteInner vpnSiteParameters, Context context);

    /**
     * Updates VpnSite tags.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being updated.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<VpnSiteInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String vpnSiteName, Map<String, String> tags);

    /**
     * Updates VpnSite tags.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being updated.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VpnSiteInner> updateTagsAsync(String resourceGroupName, String vpnSiteName, Map<String, String> tags);

    /**
     * Updates VpnSite tags.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VpnSiteInner> updateTagsAsync(String resourceGroupName, String vpnSiteName);

    /**
     * Updates VpnSite tags.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnSiteInner updateTags(String resourceGroupName, String vpnSiteName);

    /**
     * Updates VpnSite tags.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being updated.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSite Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnSiteInner> updateTagsWithResponse(
        String resourceGroupName, String vpnSiteName, Map<String, String> tags, Context context);

    /**
     * Deletes a VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String vpnSiteName);

    /**
     * Deletes a VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String vpnSiteName);

    /**
     * Deletes a VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vpnSiteName);

    /**
     * Deletes a VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vpnSiteName, Context context);

    /**
     * Deletes a VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String vpnSiteName);

    /**
     * Deletes a VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vpnSiteName);

    /**
     * Deletes a VpnSite.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite being deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vpnSiteName, Context context);

    /**
     * Lists all the vpnSites in a resource group.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSites.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VpnSiteInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all the vpnSites in a resource group.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSites.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the vpnSites in a resource group.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSites.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the VpnSites in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSites.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VpnSiteInner> listAsync();

    /**
     * Lists all the VpnSites in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSites.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteInner> list();

    /**
     * Lists all the VpnSites in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSites.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteInner> list(Context context);
}
