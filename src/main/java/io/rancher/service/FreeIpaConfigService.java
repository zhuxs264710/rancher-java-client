package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FreeIpaConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface FreeIpaConfigService {

//	  @GET("freeIpaConfig")
//	  Call<TypeCollection<FreeIpaConfig>> list();
//
//	  @GET("freeIpaConfig")
//	  Call<TypeCollection<FreeIpaConfig>> list(@QueryMap Filters filters);

	  @GET("freeIpaConfig/{id}")
	  Call<FreeIpaConfig> get(@Path("id") String id);

	//  @POST("freeIpaConfig")
	//  Call<FreeIpaConfig> create(@Body FreeIpaConfig freeIpaConfig);

	  @PUT("freeIpaConfig/{id}")
	  Call<FreeIpaConfig> update(@Path("id") String id, @Body FreeIpaConfig freeIpaConfig);

//	  @DELETE("freeIpaConfig/{id}")
//	  Call<Response> delete(@Path("id") String id);
}
