package io.rancher.service.kubernetes.pod;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.pod.PodSecurityPolicyTemplate;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodSecurityPolicyTemplateService {

  @GET("podSecurityPolicyTemplate")
  Call<TypeCollection<PodSecurityPolicyTemplate>> list();

  @GET("podSecurityPolicyTemplate")
  Call<TypeCollection<PodSecurityPolicyTemplate>> list(@QueryMap Filters filters);

  @GET("podSecurityPolicyTemplate/{id}")
  Call<PodSecurityPolicyTemplate> get(@Path("id") String id);

  @POST("podSecurityPolicyTemplate")
  Call<PodSecurityPolicyTemplate> create(@Body PodSecurityPolicyTemplate podSecurityPolicyTemplate);

  @PUT("podSecurityPolicyTemplate/{id}")
  Call<PodSecurityPolicyTemplate> update(@Path("id") String id, @Body PodSecurityPolicyTemplate podSecurityPolicyTemplate);

  @DELETE("podSecurityPolicyTemplate/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
