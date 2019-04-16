package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AdfsConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface AdfsConfigService {

//	  @GET("adfsConfig")
//	  Call<TypeCollection<AdfsConfig>> list();
//
//	  @GET("adfsConfig")
//	  Call<TypeCollection<AdfsConfig>> list(@QueryMap Filters filters);

	  @GET("adfsConfig/{id}")
	  Call<AdfsConfig> get(@Path("id") String id);

	//  @POST("adfsConfig")
	//  Call<AdfsConfig> create(@Body AdfsConfig adfsConfig);

	  @PUT("adfsConfig/{id}")
	  Call<AdfsConfig> update(@Path("id") String id, @Body AdfsConfig adfsConfig);

//	  @DELETE("adfsConfig/{id}")
//	  Call<Response> delete(@Path("id") String id);
}
