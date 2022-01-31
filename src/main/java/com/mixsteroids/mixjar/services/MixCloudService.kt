package com.mixsteroids.mixjar.services


import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.utils.Mixcloud.LIMIT_VALUE
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface MixCloudService {
    /**
     * @param searchString the searchstring you want to find
     * @param
     */
    @GET("search/")
    fun search(
        @Query("q") searchString: String?,
        @Query("type") type: String? = "cloudcast",
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<SearchResponse?>


    @GET("{user}/?metadata=1")
    fun getUser(@Path("user") username: String): Single<UserResponse?>

    /**
     * gets Users uploaded mixes known as cloudcasts.
     * @param username username of the user from whom you want their uploads.
     *
     */
    @GET("{user}/cloudcasts")
    fun getUserCloudCasts(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserCloudCastResponse>

    @GET("{user}/comments")
    fun getUserComments(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserCommentsResponse>

    @GET("{user}/favorites")
    fun getUserFavorites(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserFavoritesResponse>

    @GET("{user}/feed")
    fun getUserFeed(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserFeedResponse>

    @GET("{user}/followers")
    fun getUserFollowers(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserFollowersResponse>

    @GET("{user}/following")
    fun getUserFollowing(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserFollowingResponse>

    @GET("{user}/listens")
    fun getUserListens(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserListensResponse>

    @GET("{user}/playlists")
    fun getUserPlaylists(
        @Path("user") username: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<UserPlaylistsResponse>


    @GET("{entertainer}/{showname}/?metadata=1")
    fun getShow(
        @Path("entertainer") entertainer: String,
        @Path("showname") showName: String
    ): Single<ShowResponse>

    @GET("{entertainer}/{showname}/favorites/")
    fun getShowFavorites(
        @Path("entertainer") entertainer: String,
        @Path("showname") showName: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<ShowFavoritesResponse>

    @GET("{entertainer}/{showname}/listeners/")
    fun getShowListeners(
        @Path("entertainer") entertainer: String,
        @Path("showname") showName: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<ShowListenersResponse>

    @GET("{entertainer}/{showname}/comments/")
    fun getShowComments(
        @Path("entertainer") entertainer: String,
        @Path("showname") showName: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<ShowCommentsResponse>

    @GET("{entertainer}/{showname}/similar/")
    fun getShowSimilar(
        @Path("entertainer") entertainer: String,
        @Path("showname") showName: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<ShowSimilarResponse>

    @GET("discover/{tag}/?metadata=1")
    fun getTag(@Path("tag") tag: String): Single<TagResponse>

    @GET("discover/{tag}/popular/")
    fun getPopularTag(
        @Path("tag") tag: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<PopularTagResponse>

    @GET("discover/{tag}/latest/")
    fun getLatestTag(
        @Path("tag") tag: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<LatestTagResponse>

    @GET("discover/city:{city}/?metadata=1")
    fun getCity(@Path("city") city: String): Single<CityResponse>

    @GET("discover/city:{city}/popular/")
    fun getCityPopular(
        @Path("city") city: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<CityPopularResponse>

    @GET("discover/city:{city}/latest/")
    fun getCityLatest(
        @Path("city") city: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<CityLatestResponse>

    @GET("discover/{tag}+city:{city}/?metadata=1")
    fun getTagAndCity(@Path("tag") tag: String, @Path("city") city: String): Single<TagAndCityResponse>

    @GET("discover/{tag}+city:{city}/popular/")
    fun getTagAndCityPopular(
        @Path("tag") tag: String,
        @Path("city") city: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<CityAndTagPopularResponse>

    @GET("discover/{tag}+city:{city}/latest/")
    fun getTagAndCityLatest(
        @Path("tag") tag: String,
        @Path("city") city: String,
        @Query("limit") limit: Int = LIMIT_VALUE,
        @Query("offset") offset: Int = 0
    ): Single<CityAndTagLatestResponse>

    @POST("{user}/follow/")
    fun followUser(
        @Path("user") user:String,
        @Query("access_token") accessToken:String
    ): Single<FollowResponse>

    @POST("{user}/{show}/favorite/")
    fun favoriting(
        @Path("user") username: String,
        @Path("show") showName: String,
        @Query("access_token") accessToken:String
    ):Single<FavoritingResponse>

    @POST("{user}/{show}/repost/")
    fun reposting(
        @Path("user") username: String,
        @Path("show") showName: String,
        @Query("access_token") accessToken:String
    ):Single<RepostingResponse>

    @POST("{user}/{show}/listen-later/")
    fun listenLater(
        @Path("user") username: String,
        @Path("show") showName: String,
        @Query("access_token") accessToken:String
    ):Single<ListenLaterResponse>

}