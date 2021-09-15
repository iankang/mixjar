package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.show.ShowResponse
import com.mixsteroids.mixjar.models.tag.CityResponse
import com.mixsteroids.mixjar.models.tag.TagAndCityResponse
import com.mixsteroids.mixjar.models.tag.TagResponse
import com.mixsteroids.mixjar.models.user.UserResponse
import com.mixsteroids.mixjar.models.userCloudCast.UserCloudCastResponse

interface MixCloudInterface {
    fun getShow(entertainer:String, show:String): ShowResponse?

    fun getUser(username:String): UserResponse?

    fun getUserCloudCasts(username: String):UserCloudCastResponse?

    fun getTag(tag:String): TagResponse?

    fun getCity(city:String):CityResponse?

    fun getTagAndCity(tag:String, city:String):TagAndCityResponse?
}