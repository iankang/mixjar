package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*


interface MixCloudInterface {
    fun search(searchString: String?, type:String?, page: Int):SearchResponse?

    fun getShow(entertainer:String, show:String,page: Int): ShowResponse?

    fun getShowFavorites(entertainer:String, show:String,page:Int): ShowFavoritesResponse?

    fun getShowListeners(entertainer:String, show:String, page:Int): ShowListenersResponse?

    fun getShowComments(entertainer:String, show:String, page:Int): ShowCommentsResponse?

    fun getShowSimilar(entertainer:String, show:String, page:Int): ShowSimilarResponse?

    fun getUser(username:String): UserResponse?

    fun getUserCloudCasts(username: String, page:Int): UserCloudCastResponse?

    fun getUserComments(username: String, page:Int):UserCommentsResponse?

    fun getUserFavorites(username: String, page:Int):UserFavoritesResponse?

    fun getUserFeed(username: String,page:Int):UserFeedResponse?

    fun getUserFollowers(username: String, page:Int):UserFollowersResponse?

    fun getUserFollowing(username: String, page:Int):UserFollowingResponse?

    fun getUserListens(username: String, page:Int):UserListensResponse?

    fun getUserPlaylists(username: String,page:Int):UserPlaylistsResponse?

    fun getTag(tag:String): TagResponse?

    fun getLatestTag(tag: String,page: Int):LatestTagResponse?

    fun getPopularTag(tag: String,page: Int):PopularTagResponse?

    fun getCity(city:String): CityResponse?

    fun getCityPopular(city:String,page: Int):CityPopularResponse?

    fun getCityLatest(city: String,page: Int):CityLatestResponse?

    fun getTagAndCity(tag:String, city:String):TagAndCityResponse?

    fun getTagAndCityPopular(tag:String, city:String,page: Int):CityAndTagPopularResponse?

    fun getTagAndCityLatest(tag:String, city:String,page: Int):CityAndTagLatestResponse?

}