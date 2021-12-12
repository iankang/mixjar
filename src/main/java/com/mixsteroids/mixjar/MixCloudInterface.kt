package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*


interface MixCloudInterface {

    fun search(searchString: String?, type:String?, page: Int):SearchResponse?

    fun search(searchString: String?, type:String?,limit:Int, page: Int):SearchResponse?

    fun getShow(entertainer:String, show:String,page: Int): ShowResponse?

    fun getShow(entertainer:String, show:String,linit:Int,page: Int): ShowResponse?

    fun getShowFavorites(entertainer:String, show:String,page:Int): ShowFavoritesResponse?

    fun getShowFavorites(entertainer:String, show:String,limit: Int,page:Int): ShowFavoritesResponse?

    fun getShowListeners(entertainer:String, show:String, page:Int): ShowListenersResponse?

    fun getShowListeners(entertainer:String, show:String,limit: Int, page:Int): ShowListenersResponse?

    fun getShowComments(entertainer:String, show:String, page:Int): ShowCommentsResponse?

    fun getShowComments(entertainer:String, show:String,limit: Int, page:Int): ShowCommentsResponse?

    fun getShowSimilar(entertainer:String, show:String, page:Int): ShowSimilarResponse?

    fun getShowSimilar(entertainer:String, show:String,limit: Int, page:Int): ShowSimilarResponse?

    fun getUser(username:String): UserResponse?

    fun getUserCloudCasts(username: String, page:Int): UserCloudCastResponse?

    fun getUserCloudCasts(username: String, limit: Int, page:Int): UserCloudCastResponse?

    fun getUserComments(username: String, page:Int):UserCommentsResponse?

    fun getUserComments(username: String,limit: Int, page:Int):UserCommentsResponse?

    fun getUserFavorites(username: String, page:Int):UserFavoritesResponse?

    fun getUserFavorites(username: String, limit: Int, page:Int):UserFavoritesResponse?

    fun getUserFeed(username: String,page:Int):UserFeedResponse?

    fun getUserFeed(username: String,limit: Int, page:Int):UserFeedResponse?

    fun getUserFollowers(username: String, page:Int):UserFollowersResponse?

    fun getUserFollowers(username: String,limit: Int, page:Int):UserFollowersResponse?

    fun getUserFollowing(username: String, page:Int):UserFollowingResponse?

    fun getUserFollowing(username: String,limit: Int, page:Int):UserFollowingResponse?

    fun getUserListens(username: String, page:Int):UserListensResponse?

    fun getUserListens(username: String, limit: Int, page:Int):UserListensResponse?

    fun getUserPlaylists(username: String,page:Int):UserPlaylistsResponse?

    fun getUserPlaylists(username: String,limit: Int,page:Int):UserPlaylistsResponse?

    fun getTag(tag:String): TagResponse?

    fun getLatestTag(tag: String,page: Int):LatestTagResponse?

    fun getLatestTag(tag: String,limit: Int,page: Int):LatestTagResponse?

    fun getPopularTag(tag: String,page: Int):PopularTagResponse?

    fun getPopularTag(tag: String,limit: Int,page: Int):PopularTagResponse?

    fun getCity(city:String): CityResponse?

    fun getCityPopular(city:String,page: Int):CityPopularResponse?

    fun getCityPopular(city:String,limit: Int,page: Int):CityPopularResponse?

    fun getCityLatest(city: String,page: Int):CityLatestResponse?

    fun getCityLatest(city: String,limit: Int,page: Int):CityLatestResponse?

    fun getTagAndCity(tag:String, city:String):TagAndCityResponse?

    fun getTagAndCityPopular(tag:String, city:String,page: Int):CityAndTagPopularResponse?

    fun getTagAndCityPopular(tag:String, city:String,limit: Int,page: Int):CityAndTagPopularResponse?

    fun getTagAndCityLatest(tag:String, city:String,limit: Int,page: Int):CityAndTagLatestResponse?

    fun getTagAndCityLatest(tag:String, city:String,page: Int):CityAndTagLatestResponse?

    fun followUser(username: String, accessToken:String):FollowResponse?

    fun favoriting(username: String, show: String, accessToken: String): FavoritingResponse?

    fun reposting(username: String, show: String, accessToken: String):RepostingResponse?

    fun listenLater(username: String, show: String, accessToken: String):ListenLaterResponse?

}