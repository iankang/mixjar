package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.services.HearThisAtServiceImpl
import com.mixsteroids.mixjar.services.contracts.HearThisAtInterface

class HearThisAt {

    val hearThisAtInterface: HearThisAtInterface

    init {
        hearThisAtInterface = HearThisAtServiceImpl()
    }

    /**
     * get the hearthisat feed
     * @param page page to show
     * @param count entries per page (max: 20)
     * @param duration duration (+/- 5 minutes)
     * @param type empty / popular / new
     * @param category empty / house / drumandbass / etc. - see genre API
     * @param showFeedStart 	2021-12-05	Start Date
     * @param showFeedEnd       2021-12-12	End Date
     * @return HearThisAtFeedResponse
     * @see HearthisAtFeedResponse
     */
    fun getFeed(
        page:Int,
        count:Int,
        duration:Int,
        type:String?,
        category: String?,
        showFeedStart:String,
        showFeedEnd:String
    ): HearthisAtFeedResponse? {
        return hearThisAtInterface.getFeed(page, count, duration, type, category, showFeedStart, showFeedEnd)
    }

    /**
     * gets all available genres
     * @return HearThisAtGenresResponse
     * @see HearThisAtGenresResponse
     */
    fun getAllGenres(): HearThisAtGenresResponse? {
        return hearThisAtInterface.getAllGenres()
    }

    /**
     * gets tracks based on genres
     * @param categoryName name of genre
     * @param count entries per page.
     * @param page page to show
     */
    fun getGenreList(
        categoryName:String,
        page: Int,
        count:Int,
        duration: Int?
    ):GenreList?{
        return hearThisAtInterface.getGenreList(categoryName, page, count,duration)
    }

    /**
     * gets a single artist
     * @param artistName name of the artist
     * @return SingleArtistResponse
     * @see SingleArtistResponse
     */
    fun getSingleArtist(artistName:String):SingleArtistResponse?{
        return hearThisAtInterface.getSingleArtist(artistName)
    }

    /**
     * gets all artists lists
     * @param artistName name of the artist
     * @param type choose list type: likes / playlists / tracks
     * @param page page to show
     * @param count entries per page (max: 20)
     * @return ArtistListResponse
     * @see ArtistListResponse
     */
    fun getArtistsLists(
        artistName: String,
        type: String?,
        page: Int?,
        count: Int?
    ):ArtistListResponse?{
        return hearThisAtInterface.getArtistsList(artistName, type, page, count)
    }


    /**
     * get single track information
     * @param artistName name of artist
     * @param trackName name of track
     * @return SingleTrackResponse
     * @see SingleTrackResponse
     */
    fun getSingleTrack(
        artistName:String,
        trackName:String
    ):SingleTrackResponse?{
        return hearThisAtInterface.getSingleTrack(artistName, trackName)
    }

    /**
     * get single playlist
     * @param artistName name of artist
     * @param types playlists
     * @param page page to show
     * @param count entries per page (max: 20)
     * @return SinglePlaylist
     * @see SinglePlaylist
     */
    fun getSinglePlaylist(
        artistName: String,
        types: String,
        page: Int?,
        count: Int?
    ):SinglePlaylist?{
        return  hearThisAtInterface.getSinglePlaylist(artistName, types, page, count)
    }
}