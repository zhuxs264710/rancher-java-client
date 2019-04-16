package io.rancher.service.kubernetes.deployment;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.deployment.Deployment;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DeploymentService {

  @GET("project/{projectid}/deployment")
  Call<TypeCollection<Deployment>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/deployment")
  Call<TypeCollection<Deployment>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/deployment/{id}")
  Call<Deployment> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/deployment")
  Call<Deployment> create(@Path("projectid") String projectid,@Body Deployment deployment);

  @PUT("project/{projectid}/deployment/{id}")
  Call<Deployment> update(@Path("projectid") String projectid,@Path("id") String id, @Body Deployment deployment);

  @DELETE("project/{projectid}/deployment/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
