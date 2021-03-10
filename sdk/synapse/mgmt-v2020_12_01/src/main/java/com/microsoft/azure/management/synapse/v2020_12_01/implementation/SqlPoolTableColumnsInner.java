/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

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
 * in SqlPoolTableColumns.
 */
public class SqlPoolTableColumnsInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolTableColumnsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolTableColumnsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolTableColumnsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolTableColumnsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolTableColumns to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolTableColumnsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTableColumns listByTableName" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/schemas/{schemaName}/tables/{tableName}/columns")
        Observable<Response<ResponseBody>> listByTableName(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("schemaName") String schemaName, @Path("tableName") String tableName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTableColumns listByTableNameNext" })
        @GET
        Observable<Response<ResponseBody>> listByTableNameNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolColumnInner&gt; object if successful.
     */
    public PagedList<SqlPoolColumnInner> listByTableName(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName) {
        ServiceResponse<Page<SqlPoolColumnInner>> response = listByTableNameSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName).toBlocking().single();
        return new PagedList<SqlPoolColumnInner>(response.body()) {
            @Override
            public Page<SqlPoolColumnInner> nextPage(String nextPageLink) {
                return listByTableNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolColumnInner>> listByTableNameAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName, final ListOperationCallback<SqlPoolColumnInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByTableNameSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(String nextPageLink) {
                    return listByTableNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolColumnInner&gt; object
     */
    public Observable<Page<SqlPoolColumnInner>> listByTableNameAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName) {
        return listByTableNameWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName)
            .map(new Func1<ServiceResponse<Page<SqlPoolColumnInner>>, Page<SqlPoolColumnInner>>() {
                @Override
                public Page<SqlPoolColumnInner> call(ServiceResponse<Page<SqlPoolColumnInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolColumnInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> listByTableNameWithServiceResponseAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName) {
        return listByTableNameSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolColumnInner>>, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(ServiceResponse<Page<SqlPoolColumnInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByTableNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolColumnInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> listByTableNameSinglePageAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (schemaName == null) {
            throw new IllegalArgumentException("Parameter schemaName is required and cannot be null.");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Parameter tableName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.listByTableName(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolColumnInner>> result = listByTableNameDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolColumnInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolColumnInner&gt; object if successful.
     */
    public PagedList<SqlPoolColumnInner> listByTableName(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName, final String filter) {
        ServiceResponse<Page<SqlPoolColumnInner>> response = listByTableNameSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, filter).toBlocking().single();
        return new PagedList<SqlPoolColumnInner>(response.body()) {
            @Override
            public Page<SqlPoolColumnInner> nextPage(String nextPageLink) {
                return listByTableNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolColumnInner>> listByTableNameAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName, final String filter, final ListOperationCallback<SqlPoolColumnInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByTableNameSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, filter),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(String nextPageLink) {
                    return listByTableNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolColumnInner&gt; object
     */
    public Observable<Page<SqlPoolColumnInner>> listByTableNameAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName, final String filter) {
        return listByTableNameWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, filter)
            .map(new Func1<ServiceResponse<Page<SqlPoolColumnInner>>, Page<SqlPoolColumnInner>>() {
                @Override
                public Page<SqlPoolColumnInner> call(ServiceResponse<Page<SqlPoolColumnInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolColumnInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> listByTableNameWithServiceResponseAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName, final String filter) {
        return listByTableNameSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, filter)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolColumnInner>>, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(ServiceResponse<Page<SqlPoolColumnInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByTableNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
    ServiceResponse<PageImpl<SqlPoolColumnInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<SqlPoolColumnInner>> * @param workspaceName The name of the workspace
    ServiceResponse<PageImpl<SqlPoolColumnInner>> * @param sqlPoolName SQL pool name
    ServiceResponse<PageImpl<SqlPoolColumnInner>> * @param schemaName The name of the schema.
    ServiceResponse<PageImpl<SqlPoolColumnInner>> * @param tableName The name of the table.
    ServiceResponse<PageImpl<SqlPoolColumnInner>> * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolColumnInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> listByTableNameSinglePageAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String tableName, final String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (schemaName == null) {
            throw new IllegalArgumentException("Parameter schemaName is required and cannot be null.");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Parameter tableName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByTableName(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolColumnInner>> result = listByTableNameDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolColumnInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SqlPoolColumnInner>> listByTableNameDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SqlPoolColumnInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SqlPoolColumnInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolColumnInner&gt; object if successful.
     */
    public PagedList<SqlPoolColumnInner> listByTableNameNext(final String nextPageLink) {
        ServiceResponse<Page<SqlPoolColumnInner>> response = listByTableNameNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SqlPoolColumnInner>(response.body()) {
            @Override
            public Page<SqlPoolColumnInner> nextPage(String nextPageLink) {
                return listByTableNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolColumnInner>> listByTableNameNextAsync(final String nextPageLink, final ServiceFuture<List<SqlPoolColumnInner>> serviceFuture, final ListOperationCallback<SqlPoolColumnInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByTableNameNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(String nextPageLink) {
                    return listByTableNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolColumnInner&gt; object
     */
    public Observable<Page<SqlPoolColumnInner>> listByTableNameNextAsync(final String nextPageLink) {
        return listByTableNameNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SqlPoolColumnInner>>, Page<SqlPoolColumnInner>>() {
                @Override
                public Page<SqlPoolColumnInner> call(ServiceResponse<Page<SqlPoolColumnInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolColumnInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> listByTableNameNextWithServiceResponseAsync(final String nextPageLink) {
        return listByTableNameNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolColumnInner>>, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(ServiceResponse<Page<SqlPoolColumnInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByTableNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets columns in a given table in a SQL pool.
     * Gets columns in a given table in a SQL pool.
     *
    ServiceResponse<PageImpl<SqlPoolColumnInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolColumnInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> listByTableNameNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByTableNameNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolColumnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolColumnInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolColumnInner>> result = listByTableNameNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolColumnInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SqlPoolColumnInner>> listByTableNameNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SqlPoolColumnInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SqlPoolColumnInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
