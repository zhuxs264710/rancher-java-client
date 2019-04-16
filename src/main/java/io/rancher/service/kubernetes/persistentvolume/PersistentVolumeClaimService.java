package io.rancher.service.kubernetes.persistentvolume;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.volumes.persistentvolume.PersistentVolumeClaim;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PersistentVolumeClaimService {

  @GET("project/{projectid}/persistentVolumeClaim")
  Call<TypeCollection<PersistentVolumeClaim>> list(@Path("projectid") String projectid);

  @GET("project/{projectid}/persistentVolumeClaim")
  Call<TypeCollection<PersistentVolumeClaim>> list(@Path("projectid") String projectid,@QueryMap Filters filters);

  @GET("project/{projectid}/persistentVolumeClaim/{id}")
  Call<PersistentVolumeClaim> get(@Path("projectid") String projectid,@Path("id") String id);

  @POST("project/{projectid}/persistentVolumeClaim")
  Call<PersistentVolumeClaim> create(@Path("projectid") String projectid,@Body PersistentVolumeClaim persistentVolumeClaim);

  @PUT("project/{projectid}/persistentVolumeClaim/{id}")
  Call<PersistentVolumeClaim> update(@Path("projectid") String projectid,@Path("id") String id, @Body PersistentVolumeClaim persistentVolumeClaim);

  @DELETE("project/{projectid}/persistentVolumeClaim/{id}")
  Call<Response> delete(@Path("projectid") String projectid,@Path("id") String id);
  
}
