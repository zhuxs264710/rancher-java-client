package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cloudprovider.azure.AzureADConfig;
import io.rancher.type.cloudprovider.azure.AzureADConfigTestOutput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AzureADConfigService {

//  @GET("azureADConfig")
//  Call<TypeCollection<AzureADConfig>> list();
//
//  @GET("azureADConfig")
//  Call<TypeCollection<AzureADConfig>> list(@QueryMap Filters filters);

  @GET("azureADConfig/{id}")
  Call<AzureADConfig> get(@Path("id") String id);

//  @POST("azureADConfig")
//  Call<AzureADConfig> create(@Body AzureADConfig azureADConfig);

  @PUT("azureADConfig/{id}")
  Call<AzureADConfig> update(@Path("id") String id, @Body AzureADConfig azureADConfig);

//  @DELETE("azureADConfig/{id}")
//  Call<Response> delete(@Path("id") String id);
  
  @POST("azureADConfig/{id}?action=configureTest")
  Call<AzureADConfigTestOutput> configureTest(@Path("id") String id, @Body AzureADConfig azureADConfig);
  
}
