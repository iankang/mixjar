package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.show.ShowResponse
import com.mixsteroids.mixjar.models.user.UserResponse

interface MixCloudInterface {
    fun getShow(entertainer:String, show:String): ShowResponse?

    fun getUser(username:String): UserResponse?
}