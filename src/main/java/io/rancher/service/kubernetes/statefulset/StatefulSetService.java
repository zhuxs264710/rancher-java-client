package io.rancher.service.kubernetes.statefulset;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.statefulset.StatefulSet;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StatefulSetService {

  @GET("project/{projectid}/statefulSet")
  Call<TypeCollection<StatefulSet>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/statefulSet")
  Call<TypeCollection<StatefulSet>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/statefulSet/{id}")
  Call<StatefulSet> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/statefulSet")
  Call<StatefulSet> create(@Path("projectid") String projectid,@Body StatefulSet statefulSet);

  @PUT("project/{projectid}/workload/{id}")
  Call<StatefulSet> update(@Path("projectid") String projectid,@Path("id") String id, @Body StatefulSet statefulSet);

  @DELETE("project/{projectid}/workload/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
