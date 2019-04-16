package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Subscribe;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterSubscribeService {

  @GET("cluster/{clusterid}/subscribe")
  Call<TypeCollection<Subscribe>> list(@Path("clusterid") String projectid);

  @GET("cluster/{clusterid}/subscribe")
  Call<TypeCollection<Subscribe>> list(@Path("clusterid") String projectid,@QueryMap Filters filters);

  @GET("cluster/{clusterid}/subscribe/{id}")
  Call<Subscribe> get(@Path("clusterid") String projectid,@Path("id") String id);

  @POST("cluster/{clusterid}/subscribe")
  Call<Subscribe> create(@Path("clusterid") String projectid,@Body Subscribe subscribe);

  @PUT("cluster/{clusterid}/subscribe/{id}")
  Call<Subscribe> update(@Path("clusterid") String projectid,@Path("id") String id, @Body Subscribe subscribe);

  @DELETE("cluster/{clusterid}/subscribe/{id}")
  Call<Response> delete(@Path("clusterid") String projectid,@Path("id") String id);
  
}
