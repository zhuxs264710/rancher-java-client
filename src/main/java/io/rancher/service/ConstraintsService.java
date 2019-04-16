//package io.rancher.service;
//
//import io.rancher.base.Filters;
//import io.rancher.base.TypeCollection;
//import io.rancher.type.Constraints;
//
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
//public interface ConstraintsService {
//
//  @GET("constraints")
//  Call<TypeCollection<Constraints>> list();
//
//  @GET("constraints")
//  Call<TypeCollection<Constraints>> list(@QueryMap Filters filters);
//
//  @GET("constraints/{id}")
//  Call<Constraints> get(@Path("id") String id);
//
//  @POST("constraints")
//  Call<Constraints> create(@Body Constraints constraints);
//
//  @PUT("constraints/{id}")
//  Call<Constraints> update(@Path("id") String id, @Body Constraints constraints);
//
//  @DELETE("constraints/{id}")
//  Call<Response> delete(@Path("id") String id);
//  
//}
