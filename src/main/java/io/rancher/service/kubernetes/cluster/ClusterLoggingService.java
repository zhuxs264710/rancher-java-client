package io.rancher.service.kubernetes.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.ClusterLogging;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterLoggingService {

  @GET("clusterLogging")
  Call<TypeCollection<ClusterLogging>> list();

  @GET("clusterLogging")
  Call<TypeCollection<ClusterLogging>> list(@QueryMap Filters filters);

  @GET("clusterLogging/{id}")
  Call<ClusterLogging> get(@Path("id") String id);

  @POST("clusterLogging")
  Call<ClusterLogging> create(@Body ClusterLogging clusterLogging);

  @PUT("clusterLogging/{id}")
  Call<ClusterLogging> update(@Path("id") String id, @Body ClusterLogging clusterLogging);

  @DELETE("clusterLogging/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
