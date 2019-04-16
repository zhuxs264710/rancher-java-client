package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SourceCodeProviderConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SourceCodeProviderConfigService {

  @GET("project/{projectid}/sourceCodeProviderConfig")
  Call<TypeCollection<SourceCodeProviderConfig>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/sourceCodeProviderConfig")
  Call<TypeCollection<SourceCodeProviderConfig>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/sourceCodeProviderConfig/{id}")
  Call<SourceCodeProviderConfig> get(@Path("projectid") String projectid,@Path("id") String id);

//  @POST("project/{projectid}/sourceCodeProviderConfig")
//  Call<SourceCodeProviderConfig> create(@Path("projectid") String projectid,@Body SourceCodeProviderConfig sourceCodeProviderConfig);

  @PUT("project/{projectid}/sourceCodeProviderConfig/{id}")
  Call<SourceCodeProviderConfig> update(@Path("projectid") String projectid,@Path("id") String id, @Body SourceCodeProviderConfig sourceCodeProviderConfig);

  @DELETE("project/{projectid}/sourceCodeProviderConfig/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
