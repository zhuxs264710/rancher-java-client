package io.rancher.service.kubernetes.cluster.node;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.cluster.node.NodeTemplate;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NodeTemplateService {

  @GET("nodeTemplate")
  Call<TypeCollection<NodeTemplate>> list();

  @GET("nodeTemplate")
  Call<TypeCollection<NodeTemplate>> list(@QueryMap Filters filters);

  @GET("nodeTemplate/{id}")
  Call<NodeTemplate> get(@Path("id") String id);

  @POST("nodeTemplate")
  Call<NodeTemplate> create(@Body NodeTemplate nodeTemplate);

  @PUT("nodeTemplate/{id}")
  Call<NodeTemplate> update(@Path("id") String id, @Body NodeTemplate nodeTemplate);

  @DELETE("nodeTemplate/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
