package io.rancher.service;

import io.rancher.type.github.GithubConfig;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface GithubConfigService {

//	  @GET("githubConfig")
//	  Call<TypeCollection<GithubConfig>> list();
//
//	  @GET("githubConfig")
//	  Call<TypeCollection<GithubConfig>> list(@QueryMap Filters filters);

	  @GET("githubConfig/{id}")
	  Call<GithubConfig> get(@Path("id") String id);

	//  @POST("githubConfig")
	//  Call<GithubConfig> create(@Body GithubConfig githubConfig);

	  @PUT("githubConfig/{id}")
	  Call<GithubConfig> update(@Path("id") String id, @Body GithubConfig githubConfig);

//	  @DELETE("githubConfig/{id}")
//	  Call<Response> delete(@Path("id") String id);
}
