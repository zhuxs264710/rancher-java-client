package io.rancher.service.kubernetes.cluster.namespaces;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.namespaces.NamespacedBasicAuth;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedBasicAuthService {

  @GET("project/{projectid}/namespacedBasicAuth")
  Call<TypeCollection<NamespacedBasicAuth>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/namespacedBasicAuth")
  Call<TypeCollection<NamespacedBasicAuth>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/namespacedBasicAuth/{id}")
  Call<NamespacedBasicAuth> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/namespacedBasicAuth")
  Call<NamespacedBasicAuth> create(@Path("projectid") String projectid,@Body NamespacedBasicAuth namespacedBasicAuth);

  @PUT("project/{projectid}/namespacedBasicAuth/{id}")
  Call<NamespacedBasicAuth> update(@Path("projectid") String projectid,@Path("id") String id, @Body NamespacedBasicAuth namespacedBasicAuth);

  @DELETE("project/{projectid}/namespacedBasicAuth/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
