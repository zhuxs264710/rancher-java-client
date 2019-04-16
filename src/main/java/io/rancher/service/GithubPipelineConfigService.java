package io.rancher.service;

import io.rancher.type.github.GithubPipelineConfig;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface GithubPipelineConfigService {

//	  @GET("project/{projectid}/githubPipelineConfig")
//	  Call<TypeCollection<GithubPipelineConfig>> list(@Path("projectid") String projectid);
//
//	  @GET("project/{projectid}/githubPipelineConfig")
//	  Call<TypeCollection<GithubPipelineConfig>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

	  @GET("project/{projectid}/githubPipelineConfig/{id}")
	  Call<GithubPipelineConfig> get(@Path("projectid") String projectid,@Path("id") String id);

	//  @POST("project/{projectid}/githubPipelineConfig")
	//  Call<GithubPipelineConfig> create(@Path("projectid") String projectid,@Body GithubPipelineConfig githubPipelineConfig);

	  @PUT("project/{projectid}/githubPipelineConfig/{id}")
	  Call<GithubPipelineConfig> update(@Path("projectid") String projectid,@Path("id") String id, @Body GithubPipelineConfig githubPipelineConfig);

//	  @DELETE("project/{projectid}/githubPipelineConfig/{id}")
//	  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
}
