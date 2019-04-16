package io.rancher.service.kubernetes;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.ServiceAccountToken;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ServiceAccountTokenService {

  @GET("project/{projectid}/serviceAccountToken")
  Call<TypeCollection<ServiceAccountToken>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/serviceAccountToken")
  Call<TypeCollection<ServiceAccountToken>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/serviceAccountToken/{id}")
  Call<ServiceAccountToken> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/serviceAccountToken")
  Call<ServiceAccountToken> create(@Path("projectid") String projectid,@Body ServiceAccountToken serviceAccountToken);

  @PUT("project/{projectid}/serviceAccountToken/{id}")
  Call<ServiceAccountToken> update(@Path("projectid") String projectid,@Path("id") String id, @Body ServiceAccountToken serviceAccountToken);

  @DELETE("project/{projectid}/serviceAccountToken/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
