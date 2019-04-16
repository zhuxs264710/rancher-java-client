package io.rancher.service.user;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.user.Token;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TokenService {

  @GET("token")
  Call<TypeCollection<Token>> list();

  @GET("token")
  Call<TypeCollection<Token>> list(@QueryMap Filters filters);

  @GET("token/{id}")
  Call<Token> get(@Path("id") String id);

  @POST("token")
  Call<Token> create(@Body Token token);

  @PUT("token/{id}")
  Call<Token> update(@Path("id") String id, @Body Token token);

  @DELETE("token/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
