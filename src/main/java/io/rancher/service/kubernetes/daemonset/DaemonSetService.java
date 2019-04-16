package io.rancher.service.kubernetes.daemonset;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.daemonset.DaemonSet;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DaemonSetService {

  @GET("project/{projectid}/daemonSet")
  Call<TypeCollection<DaemonSet>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/daemonSet")
  Call<TypeCollection<DaemonSet>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/daemonSet/{id}")
  Call<DaemonSet> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/daemonSet")
  Call<DaemonSet> create(@Path("projectid") String projectid,@Body DaemonSet daemonSet);

  @PUT("project/{projectid}/daemonSet/{id}")
  Call<DaemonSet> update(@Path("projectid") String projectid,@Path("id") String id, @Body DaemonSet daemonSet);

  @DELETE("project/{projectid}/daemonSet/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
