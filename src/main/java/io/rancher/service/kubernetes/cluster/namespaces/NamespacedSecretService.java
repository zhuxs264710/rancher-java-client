package io.rancher.service.kubernetes.cluster.namespaces;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.namespaces.NamespacedSecret;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedSecretService {

  @GET("project/{projectid}/namespacedSecret")
  Call<TypeCollection<NamespacedSecret>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/namespacedSecret")
  Call<TypeCollection<NamespacedSecret>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/namespacedSecret/{id}")
  Call<NamespacedSecret> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/namespacedSecret")
  Call<NamespacedSecret> create(@Path("projectid") String projectid,@Body NamespacedSecret namespacedSecret);

  @PUT("project/{projectid}/namespacedSecret/{id}")
  Call<NamespacedSecret> update(@Path("projectid") String projectid,@Path("id") String id, @Body NamespacedSecret namespacedSecret);

  @DELETE("project/{projectid}/namespacedSecret/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
