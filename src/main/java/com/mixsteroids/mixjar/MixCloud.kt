package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.services.MixCloudServiceImpl

class MixCloud {
   private val mixCloudInterface:MixCloudInterface = MixCloudServiceImpl()

    fun getShows(entertainer:String,show:String): ShowResponse? {
        return mixCloudInterface.getShow(entertainer, show)
    }

    fun getUsers(username:String): UserResponse? {
        return mixCloudInterface.getUser(username)
    }

    fun getUserCloudCast(username: String):UserCloudCastResponse?{
        return mixCloudInterface.getUserCloudCasts(username)
    }

    fun getUserComments(username: String):UserCommentsResponse?{
        return mixCloudInterface.getUserComments(username)
    }

    fun getUserFavorites(username: String):UserFavoritesResponse?{
        return mixCloudInterface.getUserFavorites(username)
    }

    fun getUserFeed(username: String):UserFeedResponse?{
        return mixCloudInterface.getUserFeed(username)
    }

    fun getUserFollowers(username: String):UserFollowersResponse?{
        return mixCloudInterface.getUserFollowers(username)
    }

    fun getUserFollowing(username: String):UserFollowingResponse?{
        return mixCloudInterface.getUserFollowing(username)
    }

    fun getUserListens(username: String):UserListensResponse?{
        return mixCloudInterface.getUserListens(username)
    }

    fun getUserPlaylists(username: String):UserPlaylistsResponse?{
        return mixCloudInterface.getUserPlaylists(username)
    }

    fun getTags(tag:String): TagResponse?{
        return mixCloudInterface.getTag(tag)
    }
    fun getCity(city:String): CityResponse?{
        return mixCloudInterface.getCity(city)
    }
    fun getTagAndCity(tag: String,city: String):TagAndCityResponse?{
        return mixCloudInterface.getTagAndCity(tag, city)
    }
}