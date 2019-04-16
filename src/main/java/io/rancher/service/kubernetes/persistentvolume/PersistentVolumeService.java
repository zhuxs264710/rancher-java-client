package io.rancher.service.kubernetes.persistentvolume;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.kubernetes.volumes.persistentvolume.PersistentVolume;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PersistentVolumeService {

  @GET("persistentVolume")
  Call<TypeCollection<PersistentVolume>> list(@Path("clusterId") String clusterId);

  @GET("persistentVolume")
  Call<TypeCollection<PersistentVolume>> list(@Path("clusterId") String clusterId,@QueryMap Filters filters);

  @GET("persistentVolume/{id}")
  Call<PersistentVolume> get(@Path("clusterId") String clusterId,@Path("id") String id);

  @POST("persistentVolume")
  Call<PersistentVolume> create(@Path("clusterId") String clusterId,@Body PersistentVolume persistentVolume);

  @PUT("persistentVolume/{id}")
  Call<PersistentVolume> update(@Path("clusterId") String clusterId,@Path("id") String id, @Body PersistentVolume persistentVolume);

  @DELETE("persistentVolume/{id}")
  Call<Response> delete(@Path("clusterId") String clusterId,@Path("id") String id);
  
}
