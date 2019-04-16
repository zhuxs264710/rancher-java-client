package io.rancher.service.kubernetes.pod;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.pod.PodSecurityPolicyTemplateProjectBinding;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodSecurityPolicyTemplateProjectBindingService {

  @GET("podSecurityPolicyTemplateProjectBinding")
  Call<TypeCollection<PodSecurityPolicyTemplateProjectBinding>> list();

  @GET("podSecurityPolicyTemplateProjectBinding")
  Call<TypeCollection<PodSecurityPolicyTemplateProjectBinding>> list(@QueryMap Filters filters);

//  @GET("podSecurityPolicyTemplateProjectBinding/{id}")
//  Call<PodSecurityPolicyTemplateProjectBinding> get(@Path("id") String id);

  @POST("podSecurityPolicyTemplateProjectBinding")
  Call<PodSecurityPolicyTemplateProjectBinding> create(@Body PodSecurityPolicyTemplateProjectBinding podSecurityPolicyTemplateProjectBinding);

//  @PUT("podSecurityPolicyTemplateProjectBinding/{id}")
//  Call<PodSecurityPolicyTemplateProjectBinding> update(@Path("id") String id, @Body PodSecurityPolicyTemplateProjectBinding podSecurityPolicyTemplateProjectBinding);

//  @DELETE("podSecurityPolicyTemplateProjectBinding/{id}")
//  Call<Response> delete(@Path("id") String id);
  
}
