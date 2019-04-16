package io.rancher.service.kubernetes.configmap;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.configmap.ConfigMap;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ConfigMapService {

  @GET("project/{projectid}/configMap")
  Call<TypeCollection<ConfigMap>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/configMap")
  Call<TypeCollection<ConfigMap>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/configMap/{id}")
  Call<ConfigMap> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/configMap")
  Call<ConfigMap> create(@Path("projectid") String projectid,@Body ConfigMap configMap);

  @PUT("project/{projectid}/configMap/{id}")
  Call<ConfigMap> update(@Path("projectid") String projectid,@Path("id") String id, @Body ConfigMap configMap);

  @DELETE("project/{projectid}/configMap/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
