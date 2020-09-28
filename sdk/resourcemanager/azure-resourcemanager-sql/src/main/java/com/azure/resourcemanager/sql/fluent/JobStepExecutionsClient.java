// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.JobExecutionInner;
import java.time.OffsetDateTime;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobStepExecutionsClient. */
public interface JobStepExecutionsClient {
    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobExecutionInner> listByJobExecutionAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top);

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobExecutionInner> listByJobExecutionAsync(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId);

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobExecutionInner> listByJobExecution(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top,
        Context context);

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobExecutionInner> listByJobExecution(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId);

    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a step execution of a job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobExecutionInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName);

    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a step execution of a job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobExecutionInner> getAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName);

    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a step execution of a job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobExecutionInner get(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName);

    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a step execution of a job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobExecutionInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName,
        Context context);
}
