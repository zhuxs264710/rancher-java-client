package io.rancher.service.kubernetes.cluster.namespaces;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.namespaces.NamespacedSshAuth;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedSshAuthService {

  @GET("project/{projectid}/namespacedSshAuth")
  Call<TypeCollection<NamespacedSshAuth>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/namespacedSshAuth")
  Call<TypeCollection<NamespacedSshAuth>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/namespacedSshAuth/{id}")
  Call<NamespacedSshAuth> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/namespacedSshAuth")
  Call<NamespacedSshAuth> create(@Path("projectid") String projectid,@Body NamespacedSshAuth namespacedSshAuth);

  @PUT("project/{projectid}/namespacedSshAuth/{id}")
  Call<NamespacedSshAuth> update(@Path("projectid") String projectid,@Path("id") String id, @Body NamespacedSshAuth namespacedSshAuth);

  @DELETE("project/{projectid}/namespacedSshAuth/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
