package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.MixCloudInterface
import com.mixsteroids.mixjar.models.show.ShowResponse
import com.mixsteroids.mixjar.models.tag.CityResponse
import com.mixsteroids.mixjar.models.tag.TagAndCityResponse
import com.mixsteroids.mixjar.models.tag.TagResponse
import com.mixsteroids.mixjar.models.user.UserResponse
import com.mixsteroids.mixjar.models.userCloudCast.UserCloudCastResponse
import com.mixsteroids.mixjar.network.Network
import retrofit2.create

class MixCloudServiceImpl :MixCloudInterface{
    private val network = Network()
    private val mixCloudApi = network.getMixCloudRetrofitInstance().create<MixCloudService>()

     override fun getShow(entertainer:String, show:String): ShowResponse?{
         val showCall = mixCloudApi.getShow(entertainer,show)
         return executeRequest(showCall)
     }
    override fun getUser(username:String):UserResponse? {
        val userCall = mixCloudApi.getUser(username)
       return executeRequest(userCall)
    }

    override fun getUserCloudCasts(username: String): UserCloudCastResponse? {
        val cloudCastCall = mixCloudApi.getUserCloudCasts(username)
        return executeRequest(cloudCastCall)
    }

    override fun getTag(tag: String): TagResponse? {
        val tagCall= mixCloudApi.getTag(tag)
        return executeRequest(tagCall)
    }

    override fun getCity(city: String): CityResponse? {
       val cityCall = mixCloudApi.getCity(city)
        return executeRequest(cityCall)
    }

    override fun getTagAndCity(tag: String, city: String): TagAndCityResponse? {
       val tagAndCityCall = mixCloudApi.getTagAndCity(tag, city)
        return executeRequest(tagAndCityCall)
    }


}