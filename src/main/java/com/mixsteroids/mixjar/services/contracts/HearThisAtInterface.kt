package com.mixsteroids.mixjar.services.contracts

import com.mixsteroids.mixjar.models.*
import io.reactivex.Single
import retrofit2.http.Path
import retrofit2.http.Query

interface HearThisAtInterface {

    fun getFeed(
        page:Int,
        count:Int,
        duration:Int,
        type:String?,
        category: String?,
        showFeedStart:String,
        showFeedEnd:String
    ):HearthisAtFeedResponse?


    fun getAllGenres():HearThisAtGenresResponse?

    fun getGenreList(
     categoryName:String,
     page: Int,
     count:Int,
     duration: Int?
    ):GenreList?

    fun getSingleArtist(
        artistName:String
    ):SingleArtistResponse?

    fun getArtistsList(
        artistName: String,
        type: String?,
        page:Int?,
        count: Int?
    ): ArtistListResponse?

    fun getSingleTrack(
        artistName:String,
        trackName:String
    ):SingleTrackResponse?

    fun getSinglePlaylist(
        artistName: String,
        types:String,
        page: Int?,
        count: Int?
    ):SinglePlaylist?
}