package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.MixCloudInterface
import com.mixsteroids.mixjar.models.*

import com.mixsteroids.mixjar.network.Network
import retrofit2.create

class MixCloudServiceImpl :MixCloudInterface{
    private val network = Network()
    private val mixCloudApi = network.getMixCloudRetrofitInstance().create<MixCloudService>()

     override fun getShow(entertainer:String, show:String,page: Int): ShowResponse?{
         val showCall = mixCloudApi.getShow(entertainer,show,offset = getOffsetFromPage(page)!!)
         return executeRequest(showCall)
     }

    override fun getShowFavorites(entertainer: String, show: String, page: Int): ShowFavoritesResponse {
        val showFavoritesCall = mixCloudApi.getShowFavorites(entertainer,show,offset = getOffsetFromPage(page)!!)
        return executeRequest(showFavoritesCall)!!
    }

    override fun getShowListeners(entertainer: String, show: String, page: Int): ShowListenersResponse? {
        val showListenersCall = mixCloudApi.getShowListeners(entertainer,show,offset = getOffsetFromPage(page)!!)
        return executeRequest(showListenersCall)
    }

    override fun getShowComments(entertainer: String, show: String, page: Int): ShowCommentsResponse? {
        val showCommentsCall = mixCloudApi.getShowComments(entertainer,show,offset = getOffsetFromPage(page)!!)
        return executeRequest(showCommentsCall)
    }

    override fun getShowSimilar(entertainer: String, show: String, page: Int): ShowSimilarResponse? {
        val showSimilarCall = mixCloudApi.getShowSimilar(entertainer,show,offset = getOffsetFromPage(page)!!)
        return executeRequest(showSimilarCall)
    }

    override fun getUser(username:String): UserResponse? {
        val userCall = mixCloudApi.getUser(username)
       return executeRequest(userCall)
    }

    override fun getUserCloudCasts(username: String, page:Int): UserCloudCastResponse? {
        val cloudCastCall = mixCloudApi.getUserCloudCasts(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(cloudCastCall)
    }

    override fun getUserComments(username: String, page:Int): UserCommentsResponse? {
        val userCommentsCall = mixCloudApi.getUserComments(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(userCommentsCall)
    }

    override fun getUserFavorites(username: String, page:Int): UserFavoritesResponse? {
        val userFavorites = mixCloudApi.getUserFavorites(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(userFavorites)
    }

    override fun getUserFeed(username: String, page:Int): UserFeedResponse? {
         val userFeedCall = mixCloudApi.getUserFeed(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(userFeedCall)
    }

    override fun getUserFollowers(username: String, page:Int): UserFollowersResponse? {
        val userFollowersCall = mixCloudApi.getUserFollowers(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(userFollowersCall)
    }

    override fun getUserFollowing(username: String, page:Int): UserFollowingResponse? {
        val userFollowingCall = mixCloudApi.getUserFollowing(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(userFollowingCall)
    }

    override fun getUserListens(username: String, page:Int): UserListensResponse? {
        val userListensCall = mixCloudApi.getUserListens(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(userListensCall)
    }

    override fun getUserPlaylists(username: String, page:Int): UserPlaylistsResponse? {
        val userPlaylistCall = mixCloudApi.getUserPlaylists(username,offset = getOffsetFromPage(page)!!)
        return executeRequest(userPlaylistCall)
    }

    override fun getTag(tag: String): TagResponse? {
        val tagCall= mixCloudApi.getTag(tag)
        return executeRequest(tagCall)
    }

    override fun getLatestTag(tag: String, page: Int): LatestTagResponse? {
        val latestTagCall = mixCloudApi.getLatestTag(tag,offset = getOffsetFromPage(page)!!)
        return executeRequest(latestTagCall)
    }

    override fun getPopularTag(tag: String, page: Int): PopularTagResponse? {
        val popularTagCall = mixCloudApi.getPopularTag(tag,offset = getOffsetFromPage(page)!!)
        return executeRequest(popularTagCall)
    }

    override fun getCity(city: String): CityResponse? {
       val cityCall = mixCloudApi.getCity(city)
        return executeRequest(cityCall)
    }

    override fun getCityPopular(city: String, page: Int): CityPopularResponse? {
        val cityPopularCall = mixCloudApi.getCityPopular(city,offset = getOffsetFromPage(page)!!)
        return executeRequest(cityPopularCall)
    }

    override fun getCityLatest(city: String, page: Int): CityLatestResponse? {
        val cityLatest = mixCloudApi.getCityLatest(city,offset = getOffsetFromPage(page)!!)
        return executeRequest(cityLatest)
    }

    override fun getTagAndCity(tag: String, city: String): TagAndCityResponse? {
       val tagAndCityCall = mixCloudApi.getTagAndCity(tag, city)
        return executeRequest(tagAndCityCall)
    }


}