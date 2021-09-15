package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.models.show.ShowResponse
import com.mixsteroids.mixjar.models.tag.*
import com.mixsteroids.mixjar.models.user.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MixCloudService {
    @GET("{entertainer}/{showname}/?metadata=1")
   fun getShow(@Path("entertainer") entertainer:String, @Path("showname") showName:String): Call<ShowResponse>

   @GET("{user}/?metadata=1")
   fun getUser(@Path("user")username:String):Call<UserResponse>

   @GET("discover/{tag}/?metadata=1")
   fun getTag(@Path("tag") tag:String):Call<TagResponse>

   @GET("discover/city:{city}/?metadata=1")
   fun getCity(@Path("city") city:String):Call<CityResponse>

   @GET("discover/{tag}+city:{city}/?metadata=1")
   fun getTagAndCity(@Path("tag")tag:String,@Path("city") city: String):Call<TagAndCityResponse>
}