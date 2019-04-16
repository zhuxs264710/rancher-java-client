package io.rancher.service;

import io.rancher.type.gitlab.GitlabProvider;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface GitlabProviderService {

//	  @GET("project/{projectid}/gitlabProvider")
//	  Call<TypeCollection<GitlabProvider>> list(@Path("projectid") String projectid);
//
//	  @GET("project/{projectid}/gitlabProvider")
//	  Call<TypeCollection<GitlabProvider>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

	  @GET("project/{projectid}/gitlabProvider/{id}")
	  Call<GitlabProvider> get(@Path("projectid") String projectid,@Path("id") String id);

	//  @POST("project/{projectid}/gitlabProvider")
	//  Call<GitlabProvider> create(@Path("projectid") String projectid,@Body GitlabProvider gitlabProvider);

//	  @PUT("project/{projectid}/gitlabProvider/{id}")
//	  Call<GitlabProvider> update(@Path("projectid") String projectid,@Path("id") String id, @Body GitlabProvider gitlabProvider);

//	  @DELETE("project/{projectid}/gitlabProvider/{id}")
//	  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
}
