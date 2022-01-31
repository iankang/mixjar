package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.network.Network
import com.mixsteroids.mixjar.services.contracts.HearThisAtInterface
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import retrofit2.create

class HearThisAtServiceImpl: HearThisAtInterface {

    val LOGGER:Logger = LoggerFactory.getLogger(HearThisAtServiceImpl::class.java)

    private val network = Network()
    private val hearThisAtApi = network.getHearThisAtRetrofitInstance().create<HearThisAtService>()

    override fun getFeed(
        page: Int,
        count: Int,
        duration: Int,
        type: String?,
        category: String?,
        showFeedStart: String,
        showFeedEnd: String
    ): HearthisAtFeedResponse? {
        val feedCall =  hearThisAtApi.getFeed(page, count, duration, type, category, showFeedStart, showFeedEnd)
        var feedResponse :HearthisAtFeedResponse? = null
        feedCall.subscribe{feed, throwable ->
            if(throwable == null){
                feedResponse =  feed
            }else{
                LOGGER.error(throwable.message)
            }
        }
        return feedResponse
    }

    override fun getAllGenres(): HearThisAtGenresResponse? {
        val genresCall = hearThisAtApi.getAllGenres()
        var genreResponse:HearThisAtGenresResponse? = null
        genresCall.subscribe { genres, throwable ->
            if(throwable == null){
                genreResponse = genres
            }else{
                LOGGER.error(throwable.message)
            }
        }
        return genreResponse
    }

    override fun getGenreList(categoryName: String, page: Int, count: Int,duration: Int?): GenreList? {
        val genreListCall = hearThisAtApi.getGenreList(categoryName, page, count,duration)
        var genreListResponse:GenreList? = null
        genreListCall.subscribe { genres,throwable ->
            if(throwable == null){
                genreListResponse = genres
            }else{
                LOGGER.error(throwable.message)
            }
        }
        return genreListResponse
    }

    override fun getSingleArtist(artistName: String): SingleArtistResponse? {
        val singleArtistCall = hearThisAtApi.getSingleArtist(artistName)
        var singleArtistResponse:SingleArtistResponse? = null
        singleArtistCall.subscribe { single,throwable ->
            if(throwable == null){
                singleArtistResponse = single
            }else{
                LOGGER?.error(throwable.message)
            }
        }
        return singleArtistResponse
    }

    override fun getArtistsList(artistName: String, type: String?, page: Int?, count: Int?): ArtistListResponse? {
        val artistsListCall = hearThisAtApi.getArtistsLists(artistName, type, page, count)
        var artistListResponse:ArtistListResponse? = null
        artistsListCall.subscribe { artistList, throwable ->
            if(throwable == null){
                artistListResponse = artistList
            }else{
                LOGGER.error(throwable.message)
            }
        }
        return artistListResponse
    }

    override fun getSingleTrack(artistName: String, trackName: String): SingleTrackResponse? {
        val singleTrackCall= hearThisAtApi.getSingleTrack(artistName, trackName)
        var singleTrackResponse:SingleTrackResponse? = null
        singleTrackCall.subscribe { track, throwable ->
            if(throwable == null){
                singleTrackResponse = track
            }else{
                LOGGER.error(throwable.message)
            }
        }
        return singleTrackResponse
    }

    override fun getSinglePlaylist(artistName: String,types: String, page: Int?, count: Int?): SinglePlaylist? {
        val singlePlaylistCall = hearThisAtApi.getSinglePlaylist(artistName,types, page, count)
        var singlePlaylistResponse:SinglePlaylist? = null
        singlePlaylistCall.subscribe { playlist,throwable ->
            if(throwable == null){
                singlePlaylistResponse = playlist
            }else{
                LOGGER.error(throwable.message)
            }
        }
        return singlePlaylistResponse
    }

    override fun search(type: String, t: String, page: Int?, count: Int?, duration: Int?): HearthisAtSearchResponse? {
        val searchCall = hearThisAtApi.Search(type, t, page, count, duration)
        var searchResponse:HearthisAtSearchResponse? = HearthisAtSearchResponse()
        searchCall.subscribe { search,throwable ->
            if(throwable == null){
                searchResponse =  search


            }else{
                LOGGER.error(throwable.message)
            }
        }
        return searchResponse
    }

    override fun login(email: String, password: String): HearthisatLoginResponse? {
        val loginCall = hearThisAtApi.login(email, password)
        var loginResponse:HearthisatLoginResponse? = null
        loginCall.subscribe { login, throwable ->
            if(throwable == null){
                loginResponse = login
            }else{
                LOGGER.error(throwable.message)
            }
        }
        return loginResponse
    }


}