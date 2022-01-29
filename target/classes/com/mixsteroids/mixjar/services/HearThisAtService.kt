package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.models.*
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface HearThisAtService {

    @GET("/Feed")
    fun getFeed(
        @Query("page") page: Int,
        @Query("count") count: Int,
        @Query("duration") duration: Int,
        @Query("type") type: String?,
        @Query("category") category: String?,
        @Query("show-feed-start") showFeedStart: String,
        @Query("show-feed-end") showFeedEnd: String
    ): Single<HearthisAtFeedResponse>


    @GET("/categories")
    fun getAllGenres(): Single<HearThisAtGenresResponse>

    @GET("categories/{categoryName}")
    fun getGenreList(
        @Path("categoryName") categoryName: String,
        @Query("page") page: Int,
        @Query("count") count: Int,
        @Query("duration") duration: Int?
    ): Single<GenreList>

    @GET("{artistName}")
    fun getSingleArtist(
        @Path("artistName") artistName: String
    ): Single<SingleArtistResponse>


    @GET("{artistName}/")
    fun getArtistsLists(
        @Path("artistName") artistName: String,
        @Query("type") type: String?,
        @Query("page") page:Int?,
        @Query("count") count: Int?
    ):Single<ArtistListResponse>

    @GET("{artistName}/{trackName}")
    fun getSingleTrack(
        @Path("artistName") artistName:String,
        @Path("trackName") trackName:String
    ):Single<SingleTrackResponse>

    @GET("{artistName}/")
    fun getSinglePlaylist(
        @Path("artistName") artistName: String,
        @Query("type") type:String,
        @Query("page") page: Int?,
        @Query("count") count: Int?
    ):Single<SinglePlaylist>

    @GET("search")
    fun Search(
        @Query("type") type:String,
        @Query("t") t:String,
        @Query("page") page:Int?,
        @Query("count")count:Int?,
        @Query("duration") duration:Int?
    ):Single<HearthisAtSearchResponse>

    @POST("login")
    fun login(
        @Query("email") email:String,
        @Query("password") password:String
    ):Single<HearthisatLoginResponse>
}