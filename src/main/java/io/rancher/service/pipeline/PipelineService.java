package io.rancher.service.pipeline;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.pipeline.Pipeline;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PipelineService {

  @GET("project/{projectid}/pipeline")
  Call<TypeCollection<Pipeline>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/pipeline")
  Call<TypeCollection<Pipeline>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/pipeline/{id}")
  Call<Pipeline> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/pipeline")
  Call<Pipeline> create(@Path("projectid") String projectid,@Body Pipeline pipeline);

  @PUT("project/{projectid}/pipeline/{id}")
  Call<Pipeline> update(@Path("projectid") String projectid,@Path("id") String id, @Body Pipeline pipeline);

  @DELETE("project/{projectid}/pipeline/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
