package io.rancher.service.kubernetes.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.ClusterAlert;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterAlertService {

  @GET("clusterAlert")
  Call<TypeCollection<ClusterAlert>> list();

  @GET("clusterAlert")
  Call<TypeCollection<ClusterAlert>> list(@QueryMap Filters filters);

  @GET("clusterAlert/{id}")
  Call<ClusterAlert> get(@Path("id") String id);

  @POST("clusterAlert")
  Call<ClusterAlert> create(@Body ClusterAlert clusterAlert);

  @PUT("clusterAlert/{id}")
  Call<ClusterAlert> update(@Path("id") String id, @Body ClusterAlert clusterAlert);

  @DELETE("clusterAlert/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
