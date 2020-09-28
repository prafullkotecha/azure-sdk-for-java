// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appplatform.fluent.models.AppResourceInner;
import com.azure.resourcemanager.appplatform.models.CustomDomainValidateResult;
import com.azure.resourcemanager.appplatform.models.ResourceUploadDefinition;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AppsClient. */
public interface AppsClient {
    /**
     * Get an App and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param syncStatus Indicates whether sync status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an App and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AppResourceInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String appName, String syncStatus);

    /**
     * Get an App and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param syncStatus Indicates whether sync status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an App and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AppResourceInner> getAsync(String resourceGroupName, String serviceName, String appName, String syncStatus);

    /**
     * Get an App and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an App and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AppResourceInner> getAsync(String resourceGroupName, String serviceName, String appName);

    /**
     * Get an App and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an App and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResourceInner get(String resourceGroupName, String serviceName, String appName);

    /**
     * Get an App and its properties.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param syncStatus Indicates whether sync status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an App and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AppResourceInner> getWithResponse(
        String resourceGroupName, String serviceName, String appName, String syncStatus, Context context);

    /**
     * Create a new App or update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Create a new App or update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<AppResourceInner>, AppResourceInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Create a new App or update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppResourceInner>, AppResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Create a new App or update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppResourceInner>, AppResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource, Context context);

    /**
     * Create a new App or update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AppResourceInner> createOrUpdateAsync(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Create a new App or update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResourceInner createOrUpdate(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Create a new App or update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResourceInner createOrUpdate(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource, Context context);

    /**
     * Operation to delete an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String serviceName, String appName);

    /**
     * Operation to delete an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serviceName, String appName);

    /**
     * Operation to delete an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceName, String appName);

    /**
     * Operation to delete an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serviceName, String appName, Context context);

    /**
     * Operation to delete an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serviceName, String appName);

    /**
     * Operation to delete an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String appName);

    /**
     * Operation to delete an App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String appName, Context context);

    /**
     * Operation to update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Operation to update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<AppResourceInner>, AppResourceInner> beginUpdateAsync(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Operation to update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppResourceInner>, AppResourceInner> beginUpdate(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Operation to update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AppResourceInner>, AppResourceInner> beginUpdate(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource, Context context);

    /**
     * Operation to update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AppResourceInner> updateAsync(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Operation to update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResourceInner update(String resourceGroupName, String serviceName, String appName, AppResourceInner appResource);

    /**
     * Operation to update an exiting App.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param appResource App resource payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return app resource payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AppResourceInner update(
        String resourceGroupName, String serviceName, String appName, AppResourceInner appResource, Context context);

    /**
     * Handles requests to list all resources in a Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of App resources and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AppResourceInner> listAsync(String resourceGroupName, String serviceName);

    /**
     * Handles requests to list all resources in a Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of App resources and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppResourceInner> list(String resourceGroupName, String serviceName);

    /**
     * Handles requests to list all resources in a Service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of App resources and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AppResourceInner> list(String resourceGroupName, String serviceName, Context context);

    /**
     * Get an resource upload URL for an App, which may be artifacts or source archive.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an resource upload URL for an App, which may be artifacts or source archive.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ResourceUploadDefinition>> getResourceUploadUrlWithResponseAsync(
        String resourceGroupName, String serviceName, String appName);

    /**
     * Get an resource upload URL for an App, which may be artifacts or source archive.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an resource upload URL for an App, which may be artifacts or source archive.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ResourceUploadDefinition> getResourceUploadUrlAsync(
        String resourceGroupName, String serviceName, String appName);

    /**
     * Get an resource upload URL for an App, which may be artifacts or source archive.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an resource upload URL for an App, which may be artifacts or source archive.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceUploadDefinition getResourceUploadUrl(String resourceGroupName, String serviceName, String appName);

    /**
     * Get an resource upload URL for an App, which may be artifacts or source archive.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an resource upload URL for an App, which may be artifacts or source archive.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceUploadDefinition> getResourceUploadUrlWithResponse(
        String resourceGroupName, String serviceName, String appName, Context context);

    /**
     * Check the resource name is valid as well as not in use.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param name Name to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for custom domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CustomDomainValidateResult>> validateDomainWithResponseAsync(
        String resourceGroupName, String serviceName, String appName, String name);

    /**
     * Check the resource name is valid as well as not in use.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param name Name to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for custom domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CustomDomainValidateResult> validateDomainAsync(
        String resourceGroupName, String serviceName, String appName, String name);

    /**
     * Check the resource name is valid as well as not in use.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param name Name to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for custom domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomDomainValidateResult validateDomain(
        String resourceGroupName, String serviceName, String appName, String name);

    /**
     * Check the resource name is valid as well as not in use.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param name Name to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return validation result for custom domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomDomainValidateResult> validateDomainWithResponse(
        String resourceGroupName, String serviceName, String appName, String name, Context context);
}
