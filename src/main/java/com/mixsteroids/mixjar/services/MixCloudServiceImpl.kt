package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.models.ShowResponse
import com.mixsteroids.mixjar.network.Network
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MixCloudServiceImpl {
    private val network = Network()
     fun getShow(entertainer:String, show:String):ShowResponse?{
         val mixCloudAPi = network.getMixCloudRetrofitInstance().create(MixCloudService::class.java)
         val showCall = mixCloudAPi.getShow(entertainer,show)
         var showResponse:ShowResponse? = ShowResponse()
         showCall.enqueue(object : Callback<ShowResponse>{
             override fun onResponse(call: Call<ShowResponse>, response: Response<ShowResponse>) {
                if(response.isSuccessful){
                    showResponse = response.body()
                    println(showResponse)
                }else{
                    println("not successful"+response.code())
                }
             }

             override fun onFailure(p0: Call<ShowResponse>, p1: Throwable) {
                p1.printStackTrace()
             }
         })
         return showResponse
     }
}