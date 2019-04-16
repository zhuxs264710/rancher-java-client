package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.SetPodSecurityPolicyTemplateInput;
import io.rancher.type.project.Project;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ProjectService {

  @GET("project")
  Call<TypeCollection<Project>> list();
  
  @GET("cluster/{clusterId}/project")
  Call<TypeCollection<Project>> listByClusterId(@Path("clusterId") String clusterId);

  @GET("project")
  Call<TypeCollection<Project>> list(@QueryMap Filters filters);

  @GET("project/{id}")
  Call<Project> get(@Path("id") String id);

  @POST("project")
  Call<Project> create(@Body Project project);

  @PUT("project/{id}")
  Call<Project> update(@Path("id") String id, @Body Project project);

  @DELETE("project/{id}")
  Call<Response> delete(@Path("id") String id);
  
  @POST("project/{id}?action=setpodsecuritypolicytemplate")
  Call<Project> setpodsecuritypolicytemplate(@Path("id") String id, @Body SetPodSecurityPolicyTemplateInput setPodSecurityPolicyTemplateInput);
  
}
