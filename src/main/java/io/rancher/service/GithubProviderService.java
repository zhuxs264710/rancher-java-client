package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.github.GithubProvider;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GithubProviderService {

//	  @GET("project/{projectid}/githubProvider")
//	  Call<TypeCollection<GithubProvider>> list(@Path("projectid") String projectid);
//
//	  @GET("project/{projectid}/githubProvider")
//	  Call<TypeCollection<GithubProvider>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

	  @GET("project/{projectid}/githubProvider/{id}")
	  Call<GithubProvider> get(@Path("projectid") String projectid,@Path("id") String id);

	//  @POST("project/{projectid}/githubProvider")
	//  Call<GithubProvider> create(@Path("projectid") String projectid,@Body GithubProvider githubProvider);

//	  @PUT("project/{projectid}/githubProvider/{id}")
//	  Call<GithubProvider> update(@Path("projectid") String projectid,@Path("id") String id, @Body GithubProvider githubProvider);

//	  @DELETE("project/{projectid}/githubProvider/{id}")
//	  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
}
