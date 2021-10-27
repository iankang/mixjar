package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.services.MixCloudServiceImpl

class MixCloud() {
    private val mixCloudInterface:MixCloudInterface

    init {
        mixCloudInterface = MixCloudServiceImpl()
    }

    fun getShow(entertainer:String,show:String,page:Int): ShowResponse? {
        return mixCloudInterface.getShow(entertainer, show,page)
    }

    fun getShowFavorites(entertainer: String,show: String,page: Int):ShowFavoritesResponse?{
        return mixCloudInterface.getShowFavorites(entertainer, show, page)
    }

    fun getShowListeners(entertainer: String,show: String,page: Int):ShowListenersResponse?{
        return mixCloudInterface.getShowListeners(entertainer, show, page)
    }

    fun getShowComments(entertainer: String,show: String,page: Int):ShowCommentsResponse?{
        return mixCloudInterface.getShowComments(entertainer, show, page)
    }

    fun getShowSimilar(entertainer: String,show: String,page: Int):ShowSimilarResponse?{
        return mixCloudInterface.getShowSimilar(entertainer, show, page)
    }


    fun getUser(username:String): UserResponse? {
        return mixCloudInterface.getUser(username)
    }

    fun getUserCloudCast(username: String,page: Int):UserCloudCastResponse?{
        return mixCloudInterface.getUserCloudCasts(username,page)
    }

    fun getUserComments(username: String,page: Int):UserCommentsResponse?{
        return mixCloudInterface.getUserComments(username,page)
    }

    fun getUserFavorites(username: String,page: Int):UserFavoritesResponse?{
        return mixCloudInterface.getUserFavorites(username,page)
    }

    fun getUserFeed(username: String,page: Int):UserFeedResponse?{
        return mixCloudInterface.getUserFeed(username,page)
    }

    fun getUserFollowers(username: String,page: Int):UserFollowersResponse?{
        return mixCloudInterface.getUserFollowers(username,page)
    }

    fun getUserFollowing(username: String,page: Int):UserFollowingResponse?{
        return mixCloudInterface.getUserFollowing(username,page)
    }

    fun getUserListens(username: String,page: Int):UserListensResponse?{
        return mixCloudInterface.getUserListens(username,page)
    }

    fun getUserPlaylists(username: String,page: Int):UserPlaylistsResponse?{
        return mixCloudInterface.getUserPlaylists(username,page)
    }

    fun getTag(tag:String): TagResponse?{
        return mixCloudInterface.getTag(tag)
    }

    fun getPopularTag(tag:String, page: Int):PopularTagResponse?{
        return mixCloudInterface.getPopularTag(tag, page)
    }

    fun getLatestTag(tag: String,page: Int):LatestTagResponse?{
        return mixCloudInterface.getLatestTag(tag, page)
    }
    fun getCity(city:String): CityResponse?{
        return mixCloudInterface.getCity(city)
    }
    fun getTagAndCity(tag: String,city: String):TagAndCityResponse?{
        return mixCloudInterface.getTagAndCity(tag, city)
    }

    fun getTagAndCityPopular(tag: String,city: String,page: Int):CityAndTagPopularResponse?{
        return mixCloudInterface.getTagAndCityPopular(tag, city, page)
    }

    fun getTagAndCityLatest(tag: String,city: String,page: Int):CityAndTagLatestResponse?{
        return mixCloudInterface.getTagAndCityLatest(tag, city, page)
    }

}