package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.App;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AppService {

  @GET("project/{projectid}/app")
  Call<TypeCollection<App>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/app")
  Call<TypeCollection<App>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/app/{id}")
  Call<App> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/app")
  Call<App> create(@Path("projectid") String projectid,@Body App app);

  @PUT("project/{projectid}/app/{id}")
  Call<App> update(@Path("projectid") String projectid,@Path("id") String id, @Body App app);

  @DELETE("project/{projectid}/app/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
