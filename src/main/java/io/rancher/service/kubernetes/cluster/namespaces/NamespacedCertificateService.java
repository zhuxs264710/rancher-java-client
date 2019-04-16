package io.rancher.service.kubernetes.cluster.namespaces;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.namespaces.NamespacedCertificate;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedCertificateService {

  @GET("project/{projectid}/namespacedCertificate")
  Call<TypeCollection<NamespacedCertificate>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/namespacedCertificate")
  Call<TypeCollection<NamespacedCertificate>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/namespacedCertificate/{id}")
  Call<NamespacedCertificate> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/namespacedCertificate")
  Call<NamespacedCertificate> create(@Path("projectid") String projectid,@Body NamespacedCertificate namespacedCertificate);

  @PUT("project/{projectid}/namespacedCertificate/{id}")
  Call<NamespacedCertificate> update(@Path("projectid") String projectid,@Path("id") String id, @Body NamespacedCertificate namespacedCertificate);

  @DELETE("project/{projectid}/namespacedCertificate/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
