package io.rancher.service.kubernetes.ingress;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.ingress.Ingress;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface IngressService {

  @GET("project/{projectid}/ingress")
  Call<TypeCollection<Ingress>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/ingress")
  Call<TypeCollection<Ingress>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/ingress/{id}")
  Call<Ingress> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/ingress")
  Call<Ingress> create(@Path("projectid") String projectid,@Body Ingress ingress);

  @PUT("project/{projectid}/ingress/{id}")
  Call<Ingress> update(@Path("projectid") String projectid,@Path("id") String id, @Body Ingress ingress);

  @DELETE("project/{projectid}/ingress/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
