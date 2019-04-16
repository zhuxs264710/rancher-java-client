package io.rancher.service.kubernetes.secret;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.secret.Secret;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SecretService {

  @GET("project/{projectid}/secret")
  Call<TypeCollection<Secret>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/secret")
  Call<TypeCollection<Secret>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/secret/{id}")
  Call<Secret> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/secret")
  Call<Secret> create(@Path("projectid") String projectid,@Body Secret secret);

  @PUT("project/{projectid}/secret/{id}")
  Call<Secret> update(@Path("projectid") String projectid,@Path("id") String id, @Body Secret secret);

  @DELETE("project/{projectid}/secret/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
