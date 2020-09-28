// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.implementation;

import com.azure.communication.sms.models.SendMessageRequest;
import com.azure.communication.sms.models.SendSmsResponse;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Sms. */
public final class SmsImpl {
    /** The proxy service used to perform REST calls. */
    private final SmsService service;

    /** The service client containing this operation class. */
    private final AzureCommunicationSMSServiceImpl client;

    /**
     * Initializes an instance of SmsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SmsImpl(AzureCommunicationSMSServiceImpl client) {
        this.service = RestProxy.create(SmsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationSMSServiceSms to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationSM")
    private interface SmsService {
        @Post("/sms")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<SendSmsResponse>> send(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") SendMessageRequest sendMessageRequest,
                Context context);
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     *
     * @param sendMessageRequest Represents the properties of a send message request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful send Sms request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SendSmsResponse>> sendWithResponseAsync(SendMessageRequest sendMessageRequest) {
        return FluxUtil.withContext(
                context ->
                        service.send(
                                this.client.getEndpoint(), this.client.getApiVersion(), sendMessageRequest, context));
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     *
     * @param sendMessageRequest Represents the properties of a send message request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful send Sms request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SendSmsResponse>> sendWithResponseAsync(
            SendMessageRequest sendMessageRequest, Context context) {
        return service.send(this.client.getEndpoint(), this.client.getApiVersion(), sendMessageRequest, context);
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     *
     * @param sendMessageRequest Represents the properties of a send message request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful send Sms request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SendSmsResponse> sendAsync(SendMessageRequest sendMessageRequest) {
        return sendWithResponseAsync(sendMessageRequest)
                .flatMap(
                        (Response<SendSmsResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     *
     * @param sendMessageRequest Represents the properties of a send message request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful send Sms request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SendSmsResponse> sendAsync(SendMessageRequest sendMessageRequest, Context context) {
        return sendWithResponseAsync(sendMessageRequest, context)
                .flatMap(
                        (Response<SendSmsResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     *
     * @param sendMessageRequest Represents the properties of a send message request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful send Sms request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SendSmsResponse send(SendMessageRequest sendMessageRequest) {
        return sendAsync(sendMessageRequest).block();
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     *
     * @param sendMessageRequest Represents the properties of a send message request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful send Sms request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SendSmsResponse send(SendMessageRequest sendMessageRequest, Context context) {
        return sendAsync(sendMessageRequest, context).block();
    }
}
