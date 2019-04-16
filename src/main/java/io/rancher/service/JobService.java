package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.job.Job;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface JobService {

  @GET("project/{projectid}/job")
  Call<TypeCollection<Job>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/job")
  Call<TypeCollection<Job>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/job/{id}")
  Call<Job> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/job")
  Call<Job> create(@Path("projectid") String projectid,@Body Job job);

  @PUT("project/{projectid}/job/{id}")
  Call<Job> update(@Path("projectid") String projectid,@Path("id") String id, @Body Job job);

  @DELETE("project/{projectid}/job/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
