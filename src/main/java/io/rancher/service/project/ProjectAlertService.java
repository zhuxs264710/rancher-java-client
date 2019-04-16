package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ProjectAlert;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectAlertService {

  @GET("projectAlert")
  Call<TypeCollection<ProjectAlert>> list();

  @GET("projectAlert")
  Call<TypeCollection<ProjectAlert>> list(@QueryMap Filters filters);

  @GET("projectAlert/{id}")
  Call<ProjectAlert> get(@Path("id") String id);

  @POST("projectAlert")
  Call<ProjectAlert> create(@Body ProjectAlert projectAlert);

  @PUT("projectAlert/{id}")
  Call<ProjectAlert> update(@Path("id") String id, @Body ProjectAlert projectAlert);

  @DELETE("projectAlert/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
