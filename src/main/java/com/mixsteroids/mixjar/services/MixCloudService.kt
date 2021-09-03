package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.models.ShowResponse
import com.mixsteroids.mixjar.utils.Mixcloud
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MixCloudService {

    @GET("{entertainer}/{showname}")
   fun getShow(@Path("entertainer") entertainer:String, @Path("showname") showName:String): Call<ShowResponse>


}