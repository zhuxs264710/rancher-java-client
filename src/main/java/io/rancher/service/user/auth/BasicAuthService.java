package io.rancher.service.user.auth;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.user.auth.BasicAuth;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BasicAuthService {

  @GET("project/{projectid}/basicAuth")
  Call<TypeCollection<BasicAuth>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/basicAuth")
  Call<TypeCollection<BasicAuth>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/basicAuth/{id}")
  Call<BasicAuth> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/basicAuth")
  Call<BasicAuth> create(@Path("projectid") String projectid,@Body BasicAuth basicAuth);

  @PUT("project/{projectid}/basicAuth/{id}")
  Call<BasicAuth> update(@Path("projectid") String projectid,@Path("id") String id, @Body BasicAuth basicAuth);

  @DELETE("project/{projectid}/basicAuth/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
