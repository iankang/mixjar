package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.MixCloudInterface
import com.mixsteroids.mixjar.models.show.ShowResponse
import com.mixsteroids.mixjar.models.user.UserResponse
import com.mixsteroids.mixjar.network.Network
import retrofit2.create

class MixCloudServiceImpl :MixCloudInterface{
    private val network = Network()
    val mixCloudApi = network.getMixCloudRetrofitInstance().create<MixCloudService>()

     override fun getShow(entertainer:String, show:String): ShowResponse?{
         val showCall = mixCloudApi.getShow(entertainer,show)
         return executeRequest(showCall)
     }
    override fun getUser(username:String):UserResponse? {
        val userCall = mixCloudApi.getUser(username)
       return executeRequest(userCall)
    }


}