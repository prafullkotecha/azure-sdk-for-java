/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceSkus.
 */
public class ResourceSkusInner {
    /** The Retrofit service to perform REST calls. */
    private ResourceSkusService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of ResourceSkusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ResourceSkusInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(ResourceSkusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceSkus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourceSkusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2020_12_01.ResourceSkus list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/skus")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2020_12_01.ResourceSkus listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ResourceSkuInner&gt; object if successful.
     */
    public PagedList<ResourceSkuInner> list() {
        ServiceResponse<Page<ResourceSkuInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<ResourceSkuInner>(response.body()) {
            @Override
            public Page<ResourceSkuInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ResourceSkuInner>> listAsync(final ListOperationCallback<ResourceSkuInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceSkuInner&gt; object
     */
    public Observable<Page<ResourceSkuInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<ResourceSkuInner>>, Page<ResourceSkuInner>>() {
                @Override
                public Page<ResourceSkuInner> call(ServiceResponse<Page<ResourceSkuInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceSkuInner&gt; object
     */
    public Observable<ServiceResponse<Page<ResourceSkuInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<ResourceSkuInner>>, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(ServiceResponse<Page<ResourceSkuInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ResourceSkuInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ResourceSkuInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-04-01";
        final String filter = null;
        return service.list(this.client.subscriptionId(), apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ResourceSkuInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ResourceSkuInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ResourceSkuInner&gt; object if successful.
     */
    public PagedList<ResourceSkuInner> list(final String filter) {
        ServiceResponse<Page<ResourceSkuInner>> response = listSinglePageAsync(filter).toBlocking().single();
        return new PagedList<ResourceSkuInner>(response.body()) {
            @Override
            public Page<ResourceSkuInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ResourceSkuInner>> listAsync(final String filter, final ListOperationCallback<ResourceSkuInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(filter),
            new Func1<String, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceSkuInner&gt; object
     */
    public Observable<Page<ResourceSkuInner>> listAsync(final String filter) {
        return listWithServiceResponseAsync(filter)
            .map(new Func1<ServiceResponse<Page<ResourceSkuInner>>, Page<ResourceSkuInner>>() {
                @Override
                public Page<ResourceSkuInner> call(ServiceResponse<Page<ResourceSkuInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceSkuInner&gt; object
     */
    public Observable<ServiceResponse<Page<ResourceSkuInner>>> listWithServiceResponseAsync(final String filter) {
        return listSinglePageAsync(filter)
            .concatMap(new Func1<ServiceResponse<Page<ResourceSkuInner>>, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(ServiceResponse<Page<ResourceSkuInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
    ServiceResponse<PageImpl1<ResourceSkuInner>> * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ResourceSkuInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ResourceSkuInner>>> listSinglePageAsync(final String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-04-01";
        return service.list(this.client.subscriptionId(), apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ResourceSkuInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ResourceSkuInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ResourceSkuInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ResourceSkuInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ResourceSkuInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ResourceSkuInner&gt; object if successful.
     */
    public PagedList<ResourceSkuInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ResourceSkuInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ResourceSkuInner>(response.body()) {
            @Override
            public Page<ResourceSkuInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ResourceSkuInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ResourceSkuInner>> serviceFuture, final ListOperationCallback<ResourceSkuInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceSkuInner&gt; object
     */
    public Observable<Page<ResourceSkuInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ResourceSkuInner>>, Page<ResourceSkuInner>>() {
                @Override
                public Page<ResourceSkuInner> call(ServiceResponse<Page<ResourceSkuInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ResourceSkuInner&gt; object
     */
    public Observable<ServiceResponse<Page<ResourceSkuInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ResourceSkuInner>>, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(ServiceResponse<Page<ResourceSkuInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
    ServiceResponse<PageImpl1<ResourceSkuInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ResourceSkuInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ResourceSkuInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ResourceSkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ResourceSkuInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ResourceSkuInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ResourceSkuInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ResourceSkuInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ResourceSkuInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ResourceSkuInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
