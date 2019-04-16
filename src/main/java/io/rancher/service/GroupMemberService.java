package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GroupMember;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GroupMemberService {

  @GET("groupMember")
  Call<TypeCollection<GroupMember>> list();

  @GET("groupMember")
  Call<TypeCollection<GroupMember>> list(@QueryMap Filters filters);

  @GET("groupMember/{id}")
  Call<GroupMember> get(@Path("id") String id);

  @POST("groupMember")
  Call<GroupMember> create(@Body GroupMember groupMember);

  @PUT("groupMember/{id}")
  Call<GroupMember> update(@Path("id") String id, @Body GroupMember groupMember);

  @DELETE("groupMember/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
