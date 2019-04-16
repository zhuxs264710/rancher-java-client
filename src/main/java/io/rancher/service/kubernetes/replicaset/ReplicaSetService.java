package io.rancher.service.kubernetes.replicaset;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.replicaset.ReplicaSet;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ReplicaSetService {

  @GET("project/{projectid}/replicaSet")
  Call<TypeCollection<ReplicaSet>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/replicaSet")
  Call<TypeCollection<ReplicaSet>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/replicaSet/{id}")
  Call<ReplicaSet> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/replicaSet")
  Call<ReplicaSet> create(@Path("projectid") String projectid,@Body ReplicaSet replicaSet);

  @PUT("project/{projectid}/replicaSet/{id}")
  Call<ReplicaSet> update(@Path("projectid") String projectid,@Path("id") String id, @Body ReplicaSet replicaSet);

  @DELETE("project/{projectid}/replicaSet/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
