// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import com.azure.resourcemanager.sql.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.sql.fluent.models.ServerInner;
import com.azure.resourcemanager.sql.models.ServerUpdate;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServersClient. */
public interface ServersClient
    extends InnerSupportsGet<ServerInner>, InnerSupportsListing<ServerInner>, InnerSupportsDelete<Void> {
    /**
     * Gets a list of servers in a resource groups.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of servers in a resource groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServerInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets a list of servers in a resource groups.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of servers in a resource groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of servers in a resource groups.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of servers in a resource groups.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ServerInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String serverName);

    /**
     * Gets a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerInner> getByResourceGroupAsync(String resourceGroupName, String serverName);

    /**
     * Gets a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner getByResourceGroup(String resourceGroupName, String serverName);

    /**
     * Gets a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerInner> getByResourceGroupWithResponse(String resourceGroupName, String serverName, Context context);

    /**
     * Creates or updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, ServerInner parameters);

    /**
     * Creates or updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ServerInner>, ServerInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String serverName, ServerInner parameters);

    /**
     * Creates or updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerInner>, ServerInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, ServerInner parameters);

    /**
     * Creates or updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An Azure SQL Database server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerInner>, ServerInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, ServerInner parameters, Context context);

    /**
     * Creates or updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerInner> createOrUpdateAsync(String resourceGroupName, String serverName, ServerInner parameters);

    /**
     * Creates or updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner createOrUpdate(String resourceGroupName, String serverName, ServerInner parameters);

    /**
     * Creates or updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An Azure SQL Database server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner createOrUpdate(String resourceGroupName, String serverName, ServerInner parameters, Context context);

    /**
     * Deletes a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName);

    /**
     * Deletes a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serverName);

    /**
     * Deletes a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName);

    /**
     * Deletes a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, Context context);

    /**
     * Deletes a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName);

    /**
     * Deletes a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName);

    /**
     * Deletes a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, Context context);

    /**
     * Updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An update request for an Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String serverName, ServerUpdate parameters);

    /**
     * Updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An update request for an Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ServerInner>, ServerInner> beginUpdateAsync(
        String resourceGroupName, String serverName, ServerUpdate parameters);

    /**
     * Updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An update request for an Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerInner>, ServerInner> beginUpdate(
        String resourceGroupName, String serverName, ServerUpdate parameters);

    /**
     * Updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An update request for an Azure SQL Database server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerInner>, ServerInner> beginUpdate(
        String resourceGroupName, String serverName, ServerUpdate parameters, Context context);

    /**
     * Updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An update request for an Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServerInner> updateAsync(String resourceGroupName, String serverName, ServerUpdate parameters);

    /**
     * Updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An update request for an Azure SQL Database server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner update(String resourceGroupName, String serverName, ServerUpdate parameters);

    /**
     * Updates a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters An update request for an Azure SQL Database server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerInner update(String resourceGroupName, String serverName, ServerUpdate parameters, Context context);

    /**
     * Gets a list of all servers in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all servers in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServerInner> listAsync();

    /**
     * Gets a list of all servers in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all servers in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> list();

    /**
     * Gets a list of all servers in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all servers in the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerInner> list(Context context);

    /**
     * Determines whether a resource can be created with the specified name.
     *
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a name availability check.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(String name);

    /**
     * Determines whether a resource can be created with the specified name.
     *
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a name availability check.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CheckNameAvailabilityResponseInner> checkNameAvailabilityAsync(String name);

    /**
     * Determines whether a resource can be created with the specified name.
     *
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a name availability check.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseInner checkNameAvailability(String name);

    /**
     * Determines whether a resource can be created with the specified name.
     *
     * @param name The name parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a name availability check.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(String name, Context context);
}
