package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ProjectNetworkPolicy;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectNetworkPolicyService {

  @GET("projectNetworkPolicy")
  Call<TypeCollection<ProjectNetworkPolicy>> list();

  @GET("projectNetworkPolicy")
  Call<TypeCollection<ProjectNetworkPolicy>> list(@QueryMap Filters filters);

  @GET("projectNetworkPolicy/{id}")
  Call<ProjectNetworkPolicy> get(@Path("id") String id);

//  @POST("projectNetworkPolicy")
//  Call<ProjectNetworkPolicy> create(@Body ProjectNetworkPolicy projectNetworkPolicy);
//
//  @PUT("projectNetworkPolicy/{id}")
//  Call<ProjectNetworkPolicy> update(@Path("id") String id, @Body ProjectNetworkPolicy projectNetworkPolicy);
//
//  @DELETE("projectNetworkPolicy/{id}")
//  Call<Response> delete(@Path("id") String id);
  
}
