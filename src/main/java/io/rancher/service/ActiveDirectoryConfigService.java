package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.volumes.ActiveDirectoryConfig;
import io.rancher.type.user.auth.AuthConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ActiveDirectoryConfigService {

//	  @GET("activeDirectoryConfig")
//	  Call<TypeCollection<ActiveDirectoryConfig>> list();
//
//	  @GET("activeDirectoryConfig")
//	  Call<TypeCollection<ActiveDirectoryConfig>> list(@QueryMap Filters filters);

	  @GET("activeDirectoryConfig/{id}")
	  Call<ActiveDirectoryConfig> get(@Path("id") String id);

	//  @POST("activeDirectoryConfig")
	//  Call<ActiveDirectoryConfig> create(@Body ActiveDirectoryConfig activeDirectoryConfig);

	  @PUT("activeDirectoryConfig/{id}")
	  Call<ActiveDirectoryConfig> update(@Path("id") String id, @Body ActiveDirectoryConfig activeDirectoryConfig);

//	  @DELETE("activeDirectoryConfig/{id}")
//	  Call<Response> delete(@Path("id") String id);
}
