package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.StorageClass;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StorageClassService {

  @GET("cluster/{clusterId}/storageClass")
  Call<TypeCollection<StorageClass>> list(@Path("clusterId") String clusterId);

  @GET("cluster/{clusterId}/storageClass")
  Call<TypeCollection<StorageClass>> list(@Path("clusterId") String clusterId,@QueryMap Filters filters);

  @GET("cluster/{clusterId}/storageClass/{id}")
  Call<StorageClass> get(@Path("clusterId") String clusterId,@Path("id") String id);

  @POST("cluster/{clusterId}/storageClass")
  Call<StorageClass> create(@Path("clusterId") String clusterId,@Body StorageClass storageClass);

  @PUT("cluster/{clusterId}/storageClass/{id}")
  Call<StorageClass> update(@Path("clusterId") String clusterId,@Path("id") String id, @Body StorageClass storageClass);

  @DELETE("cluster/{clusterId}/storageClass/{id}")
  Call<Response> delete(@Path("clusterId") String clusterId,@Path("id") String id);
  
}
