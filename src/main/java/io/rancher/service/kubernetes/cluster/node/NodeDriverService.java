package io.rancher.service.kubernetes.cluster.node;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.node.NodeDriver;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeDriverService {

  @GET("nodeDriver")
  Call<TypeCollection<NodeDriver>> list();

  @GET("nodeDriver")
  Call<TypeCollection<NodeDriver>> list(@QueryMap Filters filters);

  @GET("nodeDriver/{id}")
  Call<NodeDriver> get(@Path("id") String id);

  @POST("nodeDriver")
  Call<NodeDriver> create(@Body NodeDriver nodeDriver);

  @PUT("nodeDriver/{id}")
  Call<NodeDriver> update(@Path("id") String id, @Body NodeDriver nodeDriver);

  @DELETE("nodeDriver/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("nodeDriver/{id}?action=activate")
  Call<NodeDriver> activate(@Path("id") String id);
  
  @POST("nodeDriver/{id}?action=deactivate")
  Call<NodeDriver> deactivate(@Path("id") String id);
  
}
