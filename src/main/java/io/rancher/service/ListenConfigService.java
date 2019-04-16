package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ListenConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ListenConfigService {

  @GET("listenConfig")
  Call<TypeCollection<ListenConfig>> list();

  @GET("listenConfig")
  Call<TypeCollection<ListenConfig>> list(@QueryMap Filters filters);

  @GET("listenConfig/{id}")
  Call<ListenConfig> get(@Path("id") String id);

  @POST("listenConfig")
  Call<ListenConfig> create(@Body ListenConfig listenConfig);

  @PUT("listenConfig/{id}")
  Call<ListenConfig> update(@Path("id") String id, @Body ListenConfig listenConfig);

  @DELETE("listenConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
