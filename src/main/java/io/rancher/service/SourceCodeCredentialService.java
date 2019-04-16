package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SourceCodeCredential;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SourceCodeCredentialService {

  @GET("project/{projectid}/sourceCodeCredential")
  Call<TypeCollection<SourceCodeCredential>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/sourceCodeCredential")
  Call<TypeCollection<SourceCodeCredential>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/sourceCodeCredential/{id}")
  Call<SourceCodeCredential> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/sourceCodeCredential")
  Call<SourceCodeCredential> create(@Path("projectid") String projectid,@Body SourceCodeCredential sourceCodeCredential);

//  @PUT("project/{projectid}/sourceCodeCredential/{id}")
//  Call<SourceCodeCredential> update(@Path("projectid") String projectid,@Path("id") String id, @Body SourceCodeCredential sourceCodeCredential);

  @DELETE("project/{projectid}/sourceCodeCredential/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
