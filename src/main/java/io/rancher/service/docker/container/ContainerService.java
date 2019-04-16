//package io.rancher.service.docker.container;
//
//import io.rancher.base.Filters;
//import io.rancher.base.TypeCollection;
//import io.rancher.type.docker.container.Container;
//import retrofit2.Call;
//import retrofit2.Response;
//import retrofit2.http.Body;
//import retrofit2.http.DELETE;
//import retrofit2.http.GET;
//import retrofit2.http.POST;
//import retrofit2.http.PUT;
//import retrofit2.http.Path;
//import retrofit2.http.QueryMap;
//
//public interface ContainerService {
//
//  @GET("container")
//  Call<TypeCollection<Container>> list();
//
//  @GET("container")
//  Call<TypeCollection<Container>> list(@QueryMap Filters filters);
//
//  @GET("container/{id}")
//  Call<Container> get(@Path("id") String id);
//
//  @POST("container")
//  Call<Container> create(@Body Container container);
//
//  @PUT("container/{id}")
//  Call<Container> update(@Path("id") String id, @Body Container container);
//
//  @DELETE("container/{id}")
//  Call<Response> delete(@Path("id") String id);
//  
//}
