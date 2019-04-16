package io.rancher.service.kubernetes.cluster.namespaces;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.namespaces.Namespace;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespaceService {

  @GET("cluster/{clusterId}/namespace")
  Call<TypeCollection<Namespace>> list(@Path("clusterId") String clusterId);

  @GET("cluster/{clusterId}/namespace")
  Call<TypeCollection<Namespace>> list(@Path("clusterId") String clusterId,@QueryMap Filters filters);

  @GET("cluster/{clusterId}/namespace/{id}")
  Call<Namespace> get(@Path("clusterId") String clusterId,@Path("id") String id);

  @POST("cluster/{clusterId}/namespace")
  Call<Namespace> create(@Path("clusterId") String clusterId,@Body Namespace namespace);

  @PUT("cluster/{clusterId}/namespace/{id}")
  Call<Namespace> update(@Path("clusterId") String clusterId,@Path("id") String id, @Body Namespace namespace);

  @DELETE("cluster/{clusterId}/namespace/{id}")
  Call<Response> delete(@Path("clusterId") String clusterId,@Path("id") String id);
  
}
