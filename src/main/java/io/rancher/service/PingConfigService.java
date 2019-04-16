package io.rancher.service;

import io.rancher.type.PingConfig;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PingConfigService {

//	  @GET("pingConfig")
//	  Call<TypeCollection<PingConfig>> list();
//
//	  @GET("pingConfig")
//	  Call<TypeCollection<PingConfig>> list(@QueryMap Filters filters);

	  @GET("pingConfig/{id}")
	  Call<PingConfig> get(@Path("id") String id);

	//  @POST("pingConfig")
	//  Call<PingConfig> create(@Body PingConfig pingConfig);

	  @PUT("pingConfig/{id}")
	  Call<PingConfig> update(@Path("id") String id, @Body PingConfig pingConfig);

//	  @DELETE("pingConfig/{id}")
//	  Call<Response> delete(@Path("id") String id);
}
