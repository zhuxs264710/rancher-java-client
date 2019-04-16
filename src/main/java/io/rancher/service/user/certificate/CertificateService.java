package io.rancher.service.user.certificate;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.user.certificate.Certificate;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CertificateService {

  @GET("project/{projectid}/certificate")
  Call<TypeCollection<Certificate>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/certificate")
  Call<TypeCollection<Certificate>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/certificate/{id}")
  Call<Certificate> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/certificate")
  Call<Certificate> create(@Path("projectid") String projectid,@Body Certificate certificate);

  @PUT("project/{projectid}/certificate/{id}")
  Call<Certificate> update(@Path("projectid") String projectid,@Path("id") String id, @Body Certificate certificate);

  @DELETE("project/{projectid}/certificate/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
