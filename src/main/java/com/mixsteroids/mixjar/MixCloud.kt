package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.show.ShowResponse
import com.mixsteroids.mixjar.models.tag.CityResponse
import com.mixsteroids.mixjar.models.tag.TagAndCityResponse
import com.mixsteroids.mixjar.models.tag.TagResponse
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

    fun getTags(tag:String):TagResponse?{
        return mixCloudInterface.getTag(tag)
    }
    fun getCity(city:String):CityResponse?{
        return mixCloudInterface.getCity(city)
    }
    fun getTagAndCity(tag: String,city: String):TagAndCityResponse?{
        return mixCloudInterface.getTagAndCity(tag, city)
    }
}