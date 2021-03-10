// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.security.attestation.models.CloudErrorException;
import com.azure.security.attestation.models.PolicyCertificatesModifyResponse;
import com.azure.security.attestation.models.PolicyCertificatesResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicyCertificates. */
public final class PolicyCertificatesImpl {
    /** The proxy service used to perform REST calls. */
    private final PolicyCertificatesService service;

    /** The service client containing this operation class. */
    private final AttestationClientImpl client;

    /**
     * Initializes an instance of PolicyCertificatesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PolicyCertificatesImpl(AttestationClientImpl client) {
        this.service =
                RestProxy.create(
                        PolicyCertificatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AttestationClientPolicyCertificates to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{instanceUrl}")
    @ServiceInterface(name = "AttestationClientPol")
    private interface PolicyCertificatesService {
        @Get("/certificates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<PolicyCertificatesResponse>> get(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Post("/certificates:add")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<PolicyCertificatesModifyResponse>> add(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") String policyCertificateToAdd,
                Context context);

        @Post("/certificates:remove")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<PolicyCertificatesModifyResponse>> remove(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") String policyCertificateToRemove,
                Context context);
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyCertificatesResponse>> getWithResponseAsync() {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        return FluxUtil.withContext(
                context -> service.get(this.client.getInstanceUrl(), this.client.getApiVersion(), context));
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyCertificatesResponse>> getWithResponseAsync(Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        return service.get(this.client.getInstanceUrl(), this.client.getApiVersion(), context);
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyCertificatesResponse> getAsync() {
        return getWithResponseAsync()
                .flatMap(
                        (Response<PolicyCertificatesResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyCertificatesResponse> getAsync(Context context) {
        return getWithResponseAsync(context)
                .flatMap(
                        (Response<PolicyCertificatesResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyCertificatesResponse get() {
        return getAsync().block();
    }

    /**
     * Retrieves the set of certificates used to express policy for the current tenant.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyCertificatesResponse> getWithResponse(Context context) {
        return getWithResponseAsync(context).block();
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyCertificatesModifyResponse>> addWithResponseAsync(String policyCertificateToAdd) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (policyCertificateToAdd == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter policyCertificateToAdd is required and cannot be null."));
        }
        return FluxUtil.withContext(
                context ->
                        service.add(
                                this.client.getInstanceUrl(),
                                this.client.getApiVersion(),
                                policyCertificateToAdd,
                                context));
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyCertificatesModifyResponse>> addWithResponseAsync(
            String policyCertificateToAdd, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (policyCertificateToAdd == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter policyCertificateToAdd is required and cannot be null."));
        }
        return service.add(this.client.getInstanceUrl(), this.client.getApiVersion(), policyCertificateToAdd, context);
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyCertificatesModifyResponse> addAsync(String policyCertificateToAdd) {
        return addWithResponseAsync(policyCertificateToAdd)
                .flatMap(
                        (Response<PolicyCertificatesModifyResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyCertificatesModifyResponse> addAsync(String policyCertificateToAdd, Context context) {
        return addWithResponseAsync(policyCertificateToAdd, context)
                .flatMap(
                        (Response<PolicyCertificatesModifyResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyCertificatesModifyResponse add(String policyCertificateToAdd) {
        return addAsync(policyCertificateToAdd).block();
    }

    /**
     * Adds a new attestation policy certificate to the set of policy management certificates.
     *
     * @param policyCertificateToAdd An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyCertificatesModifyResponse> addWithResponse(String policyCertificateToAdd, Context context) {
        return addWithResponseAsync(policyCertificateToAdd, context).block();
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyCertificatesModifyResponse>> removeWithResponseAsync(String policyCertificateToRemove) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (policyCertificateToRemove == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter policyCertificateToRemove is required and cannot be null."));
        }
        return FluxUtil.withContext(
                context ->
                        service.remove(
                                this.client.getInstanceUrl(),
                                this.client.getApiVersion(),
                                policyCertificateToRemove,
                                context));
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyCertificatesModifyResponse>> removeWithResponseAsync(
            String policyCertificateToRemove, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (policyCertificateToRemove == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter policyCertificateToRemove is required and cannot be null."));
        }
        return service.remove(
                this.client.getInstanceUrl(), this.client.getApiVersion(), policyCertificateToRemove, context);
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyCertificatesModifyResponse> removeAsync(String policyCertificateToRemove) {
        return removeWithResponseAsync(policyCertificateToRemove)
                .flatMap(
                        (Response<PolicyCertificatesModifyResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PolicyCertificatesModifyResponse> removeAsync(String policyCertificateToRemove, Context context) {
        return removeWithResponseAsync(policyCertificateToRemove, context)
                .flatMap(
                        (Response<PolicyCertificatesModifyResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PolicyCertificatesModifyResponse remove(String policyCertificateToRemove) {
        return removeAsync(policyCertificateToRemove).block();
    }

    /**
     * Removes the specified policy management certificate. Note that the final policy management certificate cannot be
     * removed.
     *
     * @param policyCertificateToRemove An RFC 7519 Json Web Token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy management API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PolicyCertificatesModifyResponse> removeWithResponse(
            String policyCertificateToRemove, Context context) {
        return removeWithResponseAsync(policyCertificateToRemove, context).block();
    }
}
