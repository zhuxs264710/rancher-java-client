package io.rancher.service.user;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.user.SetPasswordInput;
import io.rancher.type.user.User;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface UserService {

  @GET("user")
  Call<TypeCollection<User>> list();

  @GET("user")
  Call<TypeCollection<User>> list(@QueryMap Filters filters);

  @GET("user/{id}")
  Call<User> get(@Path("id") String id);

  @POST("user")
  Call<User> create(@Body User user);

  @PUT("user/{id}")
  Call<User> update(@Path("id") String id, @Body User user);

  @DELETE("user/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("user/{id}?action=setpassword")
  Call<User> setpassword(@Path("id") String id, @Body SetPasswordInput setPasswordInput);
  
}
