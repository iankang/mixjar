package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.services.MixCloudServiceImpl
import com.mixsteroids.mixjar.services.contracts.MixCloudInterface

class MixCloud() {
    val mixCloudInterface: MixCloudInterface

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
    fun getShow(entertainer:String,show:String): ShowResponse? {
        return mixCloudInterface.getShow(entertainer, show)
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
    /**
     * get favorited shows with variable limit
     * @param entertainer the name of the entertainer.
     * @param show the name of the show
     * @param limit the number of items to load.
     * @param page the integer offset of the page.
     * @return ShowFavoriteResponse
     * @see ShowFavoritesResponse
     */
    fun getShowFavorites(entertainer: String,show: String,limit:Int,page: Int):ShowFavoritesResponse?{
        return mixCloudInterface.getShowFavorites(entertainer, show,limit, page)
    }

    /**
     * Gets listeners of a show
     * @param entertainer the name of the entertainer
     * @param show the name of the specific show
     * @param page the page to load
     * @return ShowListenersResponse
     * @see ShowListenersResponse
     */
    fun getShowListeners(entertainer: String,show: String,page: Int):ShowListenersResponse?{
        return mixCloudInterface.getShowListeners(entertainer, show, page)
    }

    /**
     * Gets listeners of a show with variable limit
     * @param entertainer the name of the entertainer
     * @param show the name of the specific show
     * @param limit the number of posts to load
     * @param page the page to load
     * @return ShowListenersResponse
     * @see ShowListenersResponse
     */
    fun getShowListeners(entertainer: String,show: String,limit: Int,page: Int):ShowListenersResponse?{
        return mixCloudInterface.getShowListeners(entertainer, show,limit, page)
    }

    /**
     * Gets a show's comments
     * @param entertainer name of the entertainer.
     * @param show name of the show.
     * @param page the page to load.
     * @return ShowCommentsResponse
     * @see ShowCommentsResponse
     */
    fun getShowComments(entertainer: String,show: String,page: Int):ShowCommentsResponse?{
        return mixCloudInterface.getShowComments(entertainer, show, page)
    }
    /**
     * Gets a show's comments
     * @param entertainer name of the entertainer.
     * @param show name of the show.
     * @param limit the variable number of shows to load.
     * @param page the page to load.
     * @return ShowCommentsResponse
     * @see ShowCommentsResponse
     */
    fun getShowComments(entertainer: String,show: String,limit: Int,page: Int):ShowCommentsResponse?{
        return mixCloudInterface.getShowComments(entertainer, show,limit, page)
    }

    /**
     * Gets similar shows to the provided show
     * @param entertainer the name of the entertainer.
     * @param show the name of the show.
     * @param limit the number of posts to load.
     * @param page the page number to load.
     * @return ShowSimilarResponse
     * @see ShowSimilarResponse
     */
    fun getShowSimilar(entertainer: String,show: String,limit: Int,page: Int):ShowSimilarResponse?{
        return mixCloudInterface.getShowSimilar(entertainer, show, limit,page)
    }
    /**
     * Gets similar shows to the provided show
     * @param entertainer the name of the entertainer.
     * @param show the name of the show.
     * @param page the page number to load.
     * @return ShowSimilarResponse
     * @see ShowSimilarResponse
     */
    fun getShowSimilar(entertainer: String,show: String,page: Int):ShowSimilarResponse?{
        return mixCloudInterface.getShowSimilar(entertainer, show, page)
    }

    /**
     * gets user info
     * @param username the username of the user you want details of
     * @return UserResponse
     * @see UserResponse
     */
    fun getUser(username:String): UserResponse? {
        return mixCloudInterface.getUser(username)
    }

    /**
     * gets users uploaded cloudcasts
     * @param username name of the person who uploaded the cloudcast
     * @param limit the number of posts to load.
     * @param page the page number to load.
     * @return UserCloudCastResponse.
     * @see UserCloudCastResponse
     */
    fun getUserCloudCast(username: String,limit: Int,page: Int):UserCloudCastResponse?{
        return mixCloudInterface.getUserCloudCasts(username,limit,page)
    }

    /**
     * gets users uploaded cloudcasts
     * @param username name of the person who uploaded the cloudcast
     * @param page the page number to load.
     * @return UserCloudCastResponse.
     * @see UserCloudCastResponse
     */
    fun getUserCloudCast(username: String,page: Int):UserCloudCastResponse?{
        return mixCloudInterface.getUserCloudCasts(username,page)
    }

    /**
     * gets comments made by user
     * @param username username of user
     * @param limit number of posts to load
     * @param page page to load
     * @return UserCommentsResponse
     * @see UserCommentsResponse
     */
    fun getUserComments(username: String,limit: Int,page: Int):UserCommentsResponse?{
        return mixCloudInterface.getUserComments(username,limit,page)
    }
    /**
     * gets comments made by user
     * @param username username of user
     * @param page page to load
     * @return UserCommentsResponse
     * @see UserCommentsResponse
     */
    fun getUserComments(username: String,page: Int):UserCommentsResponse?{
        return mixCloudInterface.getUserComments(username,page)
    }

    /**
     * gets users liked shows.
     * @param username
     * @param limit number of posts to load
     * @param page page of post to load
     * @return UserFavoritesResponse
     * @see UserFavoritesResponse
     */
    fun getUserFavorites(username: String,limit: Int,page: Int):UserFavoritesResponse?{
        return mixCloudInterface.getUserFavorites(username,limit,page)
    }
    /**
     * gets users liked shows.
     * @param username
     * @param page page of post to load
     * @return UserFavoritesResponse
     * @see UserFavoritesResponse
     */
    fun getUserFavorites(username: String,page: Int):UserFavoritesResponse?{
        return mixCloudInterface.getUserFavorites(username,page)
    }

    /**
     * gets user's feed
     * @param username
     * @param limit number of items to load
     * @param page page of posts to load.
     * @return UserFeedResponse
     * @see UserFeedResponse
     */
    fun getUserFeed(username: String,limit: Int,page: Int):UserFeedResponse?{
        return mixCloudInterface.getUserFeed(username,limit,page)
    }

    /**
     * gets user's feed
     * @param username
     * @param limit number of items to load
     * @param page page of posts to load.
     * @return UserFeedResponse
     * @see UserFeedResponse
     */
    fun getUserFeed(username: String,page: Int):UserFeedResponse?{
        return mixCloudInterface.getUserFeed(username,page)
    }

    /**
     * gets user's followers
     * @param username
     * @param limit no. of posts to load
     * @param page page of posts to load.
     * @return UserFollowersResponse
     * @see UserFollowersResponse
     */
    fun getUserFollowers(username: String,limit: Int,page: Int):UserFollowersResponse?{
        return mixCloudInterface.getUserFollowers(username,limit,page)
    }
  /**
     * gets user's followers
     * @param username
     * @param page page of posts to load.
     * @return UserFollowersResponse
     * @see UserFollowersResponse
     */
    fun getUserFollowers(username: String,page: Int):UserFollowersResponse?{
        return mixCloudInterface.getUserFollowers(username,page)
    }

    /**
     * gets users following this user.
     * @param username
     * @param limit no. of posts
     * @param page page of posts to load.
     * @return UserFollowingResponse
     * @see UserFollowingResponse
     */
    fun getUserFollowing(username: String,limit: Int,page: Int):UserFollowingResponse?{
        return mixCloudInterface.getUserFollowing(username,limit,page)
    }
    /**
     * gets users following this user.
     * @param username
     * @param page page of posts to load.
     * @return UserFollowingResponse
     * @see UserFollowingResponse
     */
    fun getUserFollowing(username: String,page: Int):UserFollowingResponse?{
        return mixCloudInterface.getUserFollowing(username,page)
    }

    /**
     * gets user's listened items
     * @param username
     * @param limit no. of posts loaded
     * @param page no of page to load
     * @return UserListensResponse
     * @see UserListensResponse
     */
    fun getUserListens(username: String,limit: Int,page: Int):UserListensResponse?{
        return mixCloudInterface.getUserListens(username,limit,page)
    }
    /**
     * gets user's listened items
     * @param username
     * @param page no of page to load
     * @return UserListensResponse
     * @see UserListensResponse
     */
    fun getUserListens(username: String,page: Int):UserListensResponse?{
        return mixCloudInterface.getUserListens(username,page)
    }

    /**
     * gets user's playlists
     * @param username
     * @param limit no. of posts to load
     * @param page no. of page to load
     * @return UserPlaylistsResponse
     * @see UserPlaylistsResponse
     */
    fun getUserPlaylists(username: String,limit: Int,page: Int):UserPlaylistsResponse?{
        return mixCloudInterface.getUserPlaylists(username,page)
    }
    /**
     * gets user's playlists
     * @param username
     * @param page no. of page to load
     * @return UserPlaylistsResponse
     * @see UserPlaylistsResponse
     */
    fun getUserPlaylists(username: String,page: Int):UserPlaylistsResponse?{
        return mixCloudInterface.getUserPlaylists(username,page)
    }

    /**
     * get's tags
     * @param tag the title of the tag
     * @return TagResponse
     * @see TagResponse
     */
    fun getTag(tag:String): TagResponse?{
        return mixCloudInterface.getTag(tag)
    }

    /**
     * gets posts by popular tag
     * @param tag title of tag
     * @param limit no of posts to load
     * @param page page no. of posts to load.
     * @return PopularTagResponse
     * @see PopularTagResponse
     */
    fun getPopularTag(tag:String, limit: Int,page: Int):PopularTagResponse?{
        return mixCloudInterface.getPopularTag(tag, limit,page)
    }

    /**
     * gets posts by popular tag
     * @param tag title of tag
     * @param page page no. of posts to load.
     * @return PopularTagResponse
     * @see PopularTagResponse
     */
    fun getPopularTag(tag:String, page: Int):PopularTagResponse?{
        return mixCloudInterface.getPopularTag(tag, page)
    }

    /**
     * gets Posts by latest Tags.
     * @param tag
     * @param limit no. of posts to load
     * @param page page no. to load
     * @return LatestTagResponse
     * @see LatestTagResponse
     */
    fun getLatestTag(tag: String,limit: Int,page: Int):LatestTagResponse?{
        return mixCloudInterface.getLatestTag(tag, limit,page)
    }
    /**
     * gets Posts by latest Tags.
     * @param tag
     * @param page page no. to load
     * @return LatestTagResponse
     * @see LatestTagResponse
     */
    fun getLatestTag(tag: String,page: Int):LatestTagResponse?{
        return mixCloudInterface.getLatestTag(tag, page)
    }

    /**
     * gets posts by city.
     * @param city name of city
     * @return CityResponse
     * @see CityResponse
     */
    fun getCity(city:String): CityResponse?{
        return mixCloudInterface.getCity(city)
    }

    /**
     * gets posts by both tag and city
     * @param tag title of tag
     * @param city name of city
     * @return TagAndCityResponse
     * @see TagAndCityResponse
     */
    fun getTagAndCity(tag: String,city: String):TagAndCityResponse?{
        return mixCloudInterface.getTagAndCity(tag, city)
    }

    /**
     * gets popular posts by tag and city
     * @param tag title of tag
     * @param limit no of posts to load
     * @param page page no. of posts to load.
     * @return CityAndTagPopularResponse
     * @see CityAndTagPopularResponse
     */
    fun getTagAndCityPopular(tag: String,city: String,limit: Int,page: Int):CityAndTagPopularResponse?{
        return mixCloudInterface.getTagAndCityPopular(tag, city,limit, page)
    }
    /**
     * gets popular posts by tag and city
     * @param tag title of tag
     * @param page page no. of posts to load.
     * @return CityAndTagPopularResponse
     * @see CityAndTagPopularResponse
     */
    fun getTagAndCityPopular(tag: String,city: String,page: Int):CityAndTagPopularResponse?{
        return mixCloudInterface.getTagAndCityPopular(tag, city, page)
    }

    /**
     * gets latest posts by both tag and city
     * @param tag title of tag
     * @param city name of city
     * @param limit number of posts to load
     * @param page page no. of posts to load
     * @return CityAndTagLatestResponse
     * @see CityAndTagLatestResponse
     */
    fun getTagAndCityLatest(tag: String,city: String,limit: Int,page: Int):CityAndTagLatestResponse?{
        return mixCloudInterface.getTagAndCityLatest(tag, city,limit, page)
    }
    /**
     * gets latest posts by both tag and city
     * @param tag title of tag
     * @param city name of city
     * @param page page no. of posts to load
     * @return CityAndTagLatestResponse
     * @see CityAndTagLatestResponse
     */
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