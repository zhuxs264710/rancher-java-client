package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateContent;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TemplateContentService {

  @GET("templateContent")
  Call<TypeCollection<TemplateContent>> list();

  @GET("templateContent")
  Call<TypeCollection<TemplateContent>> list(@QueryMap Filters filters);

  @GET("templateContent/{id}")
  Call<TemplateContent> get(@Path("id") String id);

  @POST("templateContent")
  Call<TemplateContent> create(@Body TemplateContent templateContent);

  @PUT("templateContent/{id}")
  Call<TemplateContent> update(@Path("id") String id, @Body TemplateContent templateContent);

  @DELETE("templateContent/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
