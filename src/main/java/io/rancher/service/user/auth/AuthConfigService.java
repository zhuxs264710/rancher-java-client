package io.rancher.service.user.auth;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.user.auth.AuthConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AuthConfigService {

  @GET("authConfig")
  Call<TypeCollection<AuthConfig>> list();

  @GET("authConfig")
  Call<TypeCollection<AuthConfig>> list(@QueryMap Filters filters);

  @GET("authConfig/{id}")
  Call<AuthConfig> get(@Path("id") String id);

//  @POST("authConfig")
//  Call<AuthConfig> create(@Body AuthConfig authConfig);

  @PUT("authConfig/{id}")
  Call<AuthConfig> update(@Path("id") String id, @Body AuthConfig authConfig);

  @DELETE("authConfig/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
