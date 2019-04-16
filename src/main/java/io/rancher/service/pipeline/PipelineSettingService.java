package io.rancher.service.pipeline;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.pipeline.PipelineSetting;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PipelineSettingService {

  @GET("project/{projectid}/pipelineSetting")
  Call<TypeCollection<PipelineSetting>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/pipelineSetting")
  Call<TypeCollection<PipelineSetting>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/pipelineSetting/{id}")
  Call<PipelineSetting> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/pipelineSetting")
  Call<PipelineSetting> create(@Path("projectid") String projectid,@Body PipelineSetting pipelineSetting);

  @PUT("project/{projectid}/pipelineSetting/{id}")
  Call<PipelineSetting> update(@Path("projectid") String projectid,@Path("id") String id, @Body PipelineSetting pipelineSetting);

  @DELETE("project/{projectid}/pipelineSetting/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
