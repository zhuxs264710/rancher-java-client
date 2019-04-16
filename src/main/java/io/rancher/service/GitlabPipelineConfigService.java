package io.rancher.service;

import io.rancher.type.gitlab.GitlabPipelineConfig;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface GitlabPipelineConfigService {

//	  @GET("project/{projectid}/gitlabPipelineConfig")
//	  Call<TypeCollection<GitlabPipelineConfig>> list(@Path("projectid") String projectid);
//
//	  @GET("project/{projectid}/gitlabPipelineConfig")
//	  Call<TypeCollection<GitlabPipelineConfig>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

	  @GET("project/{projectid}/gitlabPipelineConfig/{id}")
	  Call<GitlabPipelineConfig> get(@Path("projectid") String projectid,@Path("id") String id);

	//  @POST("project/{projectid}/gitlabPipelineConfig")
	//  Call<GitlabPipelineConfig> create(@Path("projectid") String projectid,@Body GitlabPipelineConfig gitlabPipelineConfig);

	  @PUT("project/{projectid}/gitlabPipelineConfig/{id}")
	  Call<GitlabPipelineConfig> update(@Path("projectid") String projectid,@Path("id") String id, @Body GitlabPipelineConfig gitlabPipelineConfig);

//	  @DELETE("project/{projectid}/gitlabPipelineConfig/{id}")
//	  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
}
