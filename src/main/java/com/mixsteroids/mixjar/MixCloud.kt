package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.services.MixCloudServiceImpl

class MixCloud() {
    val mixCloudInterface:MixCloudInterface

    init {
        mixCloudInterface = MixCloudServiceImpl()
    }

    /**
     * search the mixcloud api
     * @param searchString the search item
     * @param type the type of item being searched could be cloudcast, upload, user or tag
     * @param page this is the offset for paging. it starts at 0.
     * @return SearchResponse
     * @see SearchResponse
     */
    fun search(searchString: String?, type:String?, page: Int):SearchResponse?{
        return mixCloudInterface.search(searchString, type, page)
    }

    /**
     * gets a specific shoe.
     * @param entertainer name of the entertainer
     * @param show get the name of the specific show you need
     * @param page the page offset value.
     * @return ShowResponse
     * @see ShowResponse
     */
    fun getShow(entertainer:String,show:String,page:Int): ShowResponse? {
        return mixCloudInterface.getShow(entertainer, show,page)
    }

    /**
     * get favorited shows
     * @param entertainer the name of the entertainer.
     * @param show the name of the show
     * @param page the integer offset of the page.
     * @return ShowFavoriteResponse
     * @see ShowFavoritesResponse
     */
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

    /**
     * gets user info
     * @param username the username of the user you want details of
     */
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

    /**
     * Follows a user
     * @param username username of person to follow
     * @param accessToken the authentication access token
     * @return returns FollowResponse
     * @see FollowResponse
     */
    fun followUser(username: String, accessToken:String): FollowResponse? {
        return mixCloudInterface.followUser(username, accessToken)
    }

    /**
     * Favorites a cloudcast
     * @param username username of the person whose cloudcast you want to favorite
     * @param show name of the show you want to favorite.
     * @param accessToken the authentication access token
     * @return returns FavoritingResponse
     * @see FavoritingResponse
     */
    fun favorite(username: String, show: String, accessToken: String):FavoritingResponse?{
        return mixCloudInterface.favoriting(username, show, accessToken)
    }

    /**
     * Reposts a cloudcast in your feed
     * @param username username of the person whose cloudcast you want to reposts
     * @param show the name of the cloudcast
     * @param accessToken the authentication access token.
     * @return RepostingResponse
     * @see RepostingResponse
     */
    fun repost(username: String, show: String, accessToken: String): RepostingResponse?{
        return mixCloudInterface.reposting(username, show, accessToken)
    }

    /**
     * Adds a cloudcast to listen later
     * @param username username of the person whose cloudcast you want to add to listen later
     * @param show the name of the show that you want to add to listen later
     * @param accessToken the authentication access token.
     * @return ListenLaterResponse
     * @see ListenLaterResponse
     */
    fun listenLater(username: String, show: String, accessToken: String):ListenLaterResponse?{
        return mixCloudInterface.listenLater(username, show, accessToken)
    }
}