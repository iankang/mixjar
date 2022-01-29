package com.mixsteroids.mixjar.services.contracts

import com.mixsteroids.mixjar.models.*


interface HearThisAtInterface {

    fun getFeed(
        page:Int,
        count:Int,
        duration:Int,
        type:String?,
        category: String?,
        showFeedStart:String,
        showFeedEnd:String
    ): HearthisAtFeedResponse?


    fun getAllGenres(): HearThisAtGenresResponse?

    fun getGenreList(
     categoryName:String,
     page: Int,
     count:Int,
     duration: Int?
    ): GenreList?

    fun getSingleArtist(
        artistName:String
    ): SingleArtistResponse?

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

    fun search(
        type:String,
        t:String,
        page:Int?,
        count:Int?,
        duration:Int?
    ):HearthisAtSearchResponse?

    fun login(
        email:String,
        password:String
    ):HearthisatLoginResponse?
}