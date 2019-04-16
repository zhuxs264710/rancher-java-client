package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalRoleBinding;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GlobalRoleBindingService {

  @GET("globalRoleBinding")
  Call<TypeCollection<GlobalRoleBinding>> list();

  @GET("globalRoleBinding")
  Call<TypeCollection<GlobalRoleBinding>> list(@QueryMap Filters filters);

  @GET("globalRoleBinding/{id}")
  Call<GlobalRoleBinding> get(@Path("id") String id);

  @POST("globalRoleBinding")
  Call<GlobalRoleBinding> create(@Body GlobalRoleBinding globalRoleBinding);

  @PUT("globalRoleBinding/{id}")
  Call<GlobalRoleBinding> update(@Path("id") String id, @Body GlobalRoleBinding globalRoleBinding);

  @DELETE("globalRoleBinding/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
