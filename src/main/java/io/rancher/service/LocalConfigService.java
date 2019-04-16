package io.rancher.service;

import io.rancher.type.LocalConfig;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface LocalConfigService {

//	  @GET("localConfig")
//	  Call<TypeCollection<LocalConfig>> list();
//
//	  @GET("localConfig")
//	  Call<TypeCollection<LocalConfig>> list(@QueryMap Filters filters);

	  @GET("localConfig/{id}")
	  Call<LocalConfig> get(@Path("id") String id);

	//  @POST("localConfig")
	//  Call<LocalConfig> create(@Body LocalConfig localConfig);

//	  @PUT("localConfig/{id}")
//	  Call<LocalConfig> update(@Path("id") String id, @Body LocalConfig localConfig);

//	  @DELETE("localConfig/{id}")
//	  Call<Response> delete(@Path("id") String id);
}
