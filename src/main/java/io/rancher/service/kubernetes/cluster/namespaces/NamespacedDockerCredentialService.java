package io.rancher.service.kubernetes.cluster.namespaces;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.namespaces.NamespacedDockerCredential;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedDockerCredentialService {

  @GET("project/{projectid}/namespacedDockerCredential")
  Call<TypeCollection<NamespacedDockerCredential>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/namespacedDockerCredential")
  Call<TypeCollection<NamespacedDockerCredential>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/namespacedDockerCredential/{id}")
  Call<NamespacedDockerCredential> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/namespacedDockerCredential")
  Call<NamespacedDockerCredential> create(@Path("projectid") String projectid,@Body NamespacedDockerCredential namespacedDockerCredential);

  @PUT("project/{projectid}/namespacedDockerCredential/{id}")
  Call<NamespacedDockerCredential> update(@Path("projectid") String projectid,@Path("id") String id, @Body NamespacedDockerCredential namespacedDockerCredential);

  @DELETE("project/{projectid}/namespacedDockerCredential/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
