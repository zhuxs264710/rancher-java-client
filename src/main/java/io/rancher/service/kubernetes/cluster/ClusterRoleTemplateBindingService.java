package io.rancher.service.kubernetes.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.ClusterRoleTemplateBinding;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterRoleTemplateBindingService {

  @GET("clusterRoleTemplateBinding")
  Call<TypeCollection<ClusterRoleTemplateBinding>> list();

  @GET("clusterRoleTemplateBinding")
  Call<TypeCollection<ClusterRoleTemplateBinding>> list(@QueryMap Filters filters);

  @GET("clusterRoleTemplateBinding/{id}")
  Call<ClusterRoleTemplateBinding> get(@Path("id") String id);

  @POST("clusterRoleTemplateBinding")
  Call<ClusterRoleTemplateBinding> create(@Body ClusterRoleTemplateBinding clusterRoleTemplateBinding);

  @PUT("clusterRoleTemplateBinding/{id}")
  Call<ClusterRoleTemplateBinding> update(@Path("id") String id, @Body ClusterRoleTemplateBinding clusterRoleTemplateBinding);

  @DELETE("clusterRoleTemplateBinding/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
