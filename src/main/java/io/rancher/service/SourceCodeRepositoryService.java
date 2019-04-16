package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SourceCodeRepository;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SourceCodeRepositoryService {

  @GET("project/{projectid}/sourceCodeRepository")
  Call<TypeCollection<SourceCodeRepository>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/sourceCodeRepository")
  Call<TypeCollection<SourceCodeRepository>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/sourceCodeRepository/{id}")
  Call<SourceCodeRepository> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/sourceCodeRepository")
  Call<SourceCodeRepository> create(@Path("projectid") String projectid,@Body SourceCodeRepository sourceCodeRepository);

//  @PUT("project/{projectid}/sourceCodeRepository/{id}")
//  Call<SourceCodeRepository> update(@Path("projectid") String projectid,@Path("id") String id, @Body SourceCodeRepository sourceCodeRepository);

  @DELETE("project/{projectid}/sourceCodeRepository/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
