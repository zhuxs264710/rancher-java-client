package io.rancher.service.kubernetes.cluster.node;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.node.Node;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeService {

  @GET("cluster/{clusterId}/nodes")
  Call<TypeCollection<Node>> list(@Path("clusterId") String clusterId);

  @GET("cluster/{clusterId}/nodes")
  Call<TypeCollection<Node>> list(@Path("clusterId") String clusterId,@QueryMap Filters filters);

  @GET("cluster/{clusterId}/nodes/{id}")
  Call<Node> get(@Path("clusterId") String clusterId,@Path("id") String id);

  @POST("cluster/{clusterId}/nodes")
  Call<Node> create(@Path("clusterId") String clusterId,@Body Node node);

  @PUT("cluster/{clusterId}/nodes/{id}")
  Call<Node> update(@Path("clusterId") String clusterId,@Path("id") String id, @Body Node node);

  @DELETE("cluster/{clusterId}/nodes/{id}")
  Call<Response> delete(@Path("clusterId") String clusterId,@Path("id") String id);
  
}
