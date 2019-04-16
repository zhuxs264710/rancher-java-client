package io.rancher.service.docker;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.docker.DockerCredential;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DockerCredentialService {

  @GET("project/{projectid}/dockerCredential")
  Call<TypeCollection<DockerCredential>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/dockerCredential")
  Call<TypeCollection<DockerCredential>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/dockerCredential/{id}")
  Call<DockerCredential> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/dockerCredential")
  Call<DockerCredential> create(@Path("projectid") String projectid,@Body DockerCredential dockerCredential);

  @PUT("project/{projectid}/dockerCredential/{id}")
  Call<DockerCredential> update(@Path("projectid") String projectid,@Path("id") String id, @Body DockerCredential dockerCredential);

  @DELETE("project/{projectid}/dockerCredential/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
