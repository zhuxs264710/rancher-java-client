package io.rancher.service.kubernetes.cronjob;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cronjob.CronJob;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CronJobService {

  @GET("project/{projectid}/cronJob")
  Call<TypeCollection<CronJob>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/cronJob")
  Call<TypeCollection<CronJob>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/cronJob/{id}")
  Call<CronJob> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/cronJob")
  Call<CronJob> create(@Path("projectid") String projectid,@Body CronJob cronJob);

  @PUT("project/{projectid}/cronJob/{id}")
  Call<CronJob> update(@Path("projectid") String projectid,@Path("id") String id, @Body CronJob cronJob);

  @DELETE("project/{projectid}/cronJob/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
