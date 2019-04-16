package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Subscribe;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectSubscribeService {

  @GET("project/{projectid}/subscribe")
  Call<TypeCollection<Subscribe>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/subscribe")
  Call<TypeCollection<Subscribe>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

//  @GET("project/{projectid}/subscribe/{id}")
//  Call<Subscribe> get(@Path("projectid") String projectid,@Path("id") String id);
//
//  @POST("project/{projectid}/subscribe")
//  Call<Subscribe> create(@Path("projectid") String projectid,@Body Subscribe subscribe);
//
//  @PUT("project/{projectid}/subscribe/{id}")
//  Call<Subscribe> update(@Path("projectid") String projectid,@Path("id") String id, @Body Subscribe subscribe);
//
//  @DELETE("project/{projectid}/subscribe/{id}")
//  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
