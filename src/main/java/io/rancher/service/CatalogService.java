package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Catalog;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CatalogService {

  @GET("catalog")
  Call<TypeCollection<Catalog>> list();

  @GET("catalog")
  Call<TypeCollection<Catalog>> list(@QueryMap Filters filters);

  @GET("catalog/{id}")
  Call<Catalog> get(@Path("id") String id);

  @POST("catalog")
  Call<Catalog> create(@Body Catalog catalog);

  @PUT("catalog/{id}")
  Call<Catalog> update(@Path("id") String id, @Body Catalog catalog);

  @DELETE("catalog/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
