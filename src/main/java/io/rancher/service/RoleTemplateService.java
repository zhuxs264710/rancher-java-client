package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RoleTemplate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface RoleTemplateService {

  @GET("roleTemplate")
  Call<TypeCollection<RoleTemplate>> list();

  @GET("roleTemplate")
  Call<TypeCollection<RoleTemplate>> list(@QueryMap Filters filters);

  @GET("roleTemplate/{id}")
  Call<RoleTemplate> get(@Path("id") String id);

  @POST("roleTemplate")
  Call<RoleTemplate> create(@Body RoleTemplate roleTemplate);

  @PUT("roleTemplate/{id}")
  Call<RoleTemplate> update(@Path("id") String id, @Body RoleTemplate roleTemplate);

  @DELETE("roleTemplate/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
