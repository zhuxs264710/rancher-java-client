package io.rancher.service.kubernetes.cluster.namespaces;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.namespaces.NamespacedServiceAccountToken;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedServiceAccountTokenService {

  @GET("project/{projectid}/namespacedServiceAccountToken")
  Call<TypeCollection<NamespacedServiceAccountToken>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/namespacedServiceAccountToken")
  Call<TypeCollection<NamespacedServiceAccountToken>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/namespacedServiceAccountToken/{id}")
  Call<NamespacedServiceAccountToken> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/namespacedServiceAccountToken")
  Call<NamespacedServiceAccountToken> create(@Path("projectid") String projectid,@Body NamespacedServiceAccountToken namespacedServiceAccountToken);

  @PUT("project/{projectid}/namespacedServiceAccountToken/{id}")
  Call<NamespacedServiceAccountToken> update(@Path("projectid") String projectid,@Path("id") String id, @Body NamespacedServiceAccountToken namespacedServiceAccountToken);

  @DELETE("project/{projectid}/namespacedServiceAccountToken/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
