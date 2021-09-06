package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.show.ShowResponse
import com.mixsteroids.mixjar.models.user.UserResponse
import com.mixsteroids.mixjar.services.MixCloudServiceImpl

class MixCloud {
   private val mixCloudInterface:MixCloudInterface = MixCloudServiceImpl()

    fun getShows(entertainer:String,show:String): ShowResponse? {
        return mixCloudInterface.getShow(entertainer, show)
    }

    fun getUsers(username:String): UserResponse? {
        return mixCloudInterface.getUser(username)
    }
}