package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SourceCodeProvider;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SourceCodeProviderService {

  @GET("project/{projectid}/sourceCodeProvider")
  Call<TypeCollection<SourceCodeProvider>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/sourceCodeProvider")
  Call<TypeCollection<SourceCodeProvider>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/sourceCodeProvider/{id}")
  Call<SourceCodeProvider> get(@Path("projectid") String projectid,@Path("id") String id);

//  @POST("project/{projectid}/sourceCodeProvider")
//  Call<SourceCodeProvider> create(@Path("projectid") String projectid,@Body SourceCodeProvider sourceCodeProvider);

  @PUT("project/{projectid}/sourceCodeProvider/{id}")
  Call<SourceCodeProvider> update(@Path("projectid") String projectid,@Path("id") String id, @Body SourceCodeProvider sourceCodeProvider);

  @DELETE("project/{projectid}/sourceCodeProvider/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
