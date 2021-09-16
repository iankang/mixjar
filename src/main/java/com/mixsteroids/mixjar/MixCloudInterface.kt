package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*


interface MixCloudInterface {
    fun getShow(entertainer:String, show:String): ShowResponse?

    fun getUser(username:String): UserResponse?

    fun getUserCloudCasts(username: String): UserCloudCastResponse?

    fun getUserComments(username: String):UserCommentsResponse?

    fun getUserFavorites(username: String):UserFavoritesResponse?

    fun getUserFeed(username: String):UserFeedResponse?

    fun getUserFollowers(username: String):UserFollowersResponse?

    fun getUserFollowing(username: String):UserFollowingResponse?

    fun getUserListens(username: String):UserListensResponse?

    fun getUserPlaylists(username: String):UserPlaylistsResponse?

    fun getTag(tag:String): TagResponse?

    fun getCity(city:String): CityResponse?

    fun getTagAndCity(tag:String, city:String):TagAndCityResponse?
}