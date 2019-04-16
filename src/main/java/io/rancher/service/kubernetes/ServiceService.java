package io.rancher.service.kubernetes;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceService {

  @GET("project/{projectid}/service")
  Call<TypeCollection<Service>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/service")
  Call<TypeCollection<Service>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/service/{id}")
  Call<Service> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/service")
  Call<Service> create(@Path("projectid") String projectid,@Body Service service);

  @PUT("project/{projectid}/service/{id}")
  Call<Service> update(@Path("projectid") String projectid,@Path("id") String id, @Body Service service);

  @DELETE("project/{projectid}/service/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
