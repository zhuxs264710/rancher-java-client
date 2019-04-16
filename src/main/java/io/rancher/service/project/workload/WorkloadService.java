package io.rancher.service.project.workload;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.workload.Workload;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface WorkloadService {

  @GET("project/{projectid}/workload")
  Call<TypeCollection<Workload>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/workload")
  Call<TypeCollection<Workload>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/workload/{id}")
  Call<Workload> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/workload")
  Call<Workload> create(@Path("projectid") String projectid,@Body Workload workload);

  @PUT("project/{projectid}/workload/{id}")
  Call<Workload> update(@Path("projectid") String projectid,@Path("id") String id, @Body Workload workload);

  @DELETE("project/{projectid}/workload/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
