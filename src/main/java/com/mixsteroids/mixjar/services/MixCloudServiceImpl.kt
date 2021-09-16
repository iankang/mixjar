package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.MixCloudInterface
import com.mixsteroids.mixjar.models.*

import com.mixsteroids.mixjar.network.Network
import retrofit2.create

class MixCloudServiceImpl :MixCloudInterface{
    private val network = Network()
    private val mixCloudApi = network.getMixCloudRetrofitInstance().create<MixCloudService>()

     override fun getShow(entertainer:String, show:String): ShowResponse?{
         val showCall = mixCloudApi.getShow(entertainer,show)
         return executeRequest(showCall)
     }
    override fun getUser(username:String): UserResponse? {
        val userCall = mixCloudApi.getUser(username)
       return executeRequest(userCall)
    }

    override fun getUserCloudCasts(username: String): UserCloudCastResponse? {
        val cloudCastCall = mixCloudApi.getUserCloudCasts(username)
        return executeRequest(cloudCastCall)
    }

    override fun getUserComments(username: String): UserCommentsResponse? {
        val userCommentsCall = mixCloudApi.getUserComments(username)
        return executeRequest(userCommentsCall)
    }

    override fun getUserFavorites(username: String): UserFavoritesResponse? {
        val userFavorites = mixCloudApi.getUserFavorites(username)
        return executeRequest(userFavorites)
    }

    override fun getUserFeed(username: String): UserFeedResponse? {
         val userFeedCall = mixCloudApi.getUserFeed(username)
        return executeRequest(userFeedCall)
    }

    override fun getUserFollowers(username: String): UserFollowersResponse? {
        val userFollowersCall = mixCloudApi.getUserFollowers(username)
        return executeRequest(userFollowersCall)
    }

    override fun getUserFollowing(username: String): UserFollowingResponse? {
        val userFollowingCall = mixCloudApi.getUserFollowing(username)
        return executeRequest(userFollowingCall)
    }

    override fun getUserListens(username: String): UserListensResponse? {
        val userListensCall = mixCloudApi.getUserListens(username)
        return executeRequest(userListensCall)
    }

    override fun getUserPlaylists(username: String): UserPlaylistsResponse? {
        val userPlaylistCall = mixCloudApi.getUserPlaylists(username)
        return executeRequest(userPlaylistCall)
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