package io.rancher.service.pipeline;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.pipeline.PipelineExecution;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PipelineExecutionService {

  @GET("project/{projectid}/pipelineExecution")
  Call<TypeCollection<PipelineExecution>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/pipelineExecution")
  Call<TypeCollection<PipelineExecution>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/pipelineExecution/{id}")
  Call<PipelineExecution> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/pipelineExecution")
  Call<PipelineExecution> create(@Path("projectid") String projectid,@Body PipelineExecution pipelineExecution);

  @PUT("project/{projectid}/pipelineExecution/{id}")
  Call<PipelineExecution> update(@Path("projectid") String projectid,@Path("id") String id, @Body PipelineExecution pipelineExecution);

  @DELETE("project/{projectid}/pipelineExecution/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
