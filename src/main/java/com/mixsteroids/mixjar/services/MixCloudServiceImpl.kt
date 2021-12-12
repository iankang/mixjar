package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.services.contracts.MixCloudInterface
import com.mixsteroids.mixjar.models.*

import com.mixsteroids.mixjar.network.Network
import org.slf4j.LoggerFactory
import retrofit2.create

class MixCloudServiceImpl : MixCloudInterface {

    private val LOGGER: org.slf4j.Logger? = LoggerFactory.getLogger(MixCloudServiceImpl::class.java)

    private val network = Network()
    private val mixCloudApi = network.getMixCloudRetrofitInstance().create<MixCloudService>()

    override fun search(searchString: String?, type: String?, page: Int): SearchResponse? {
        val searchCall = mixCloudApi.search(searchString, type, offset = getOffsetFromPage(page)!!)
        var searchResponse: SearchResponse? = null
        searchCall.subscribe { searchResponseZ,throwable ->
            if(throwable == null){
                searchResponse = SearchResponse(searchResponseZ)
            }else{
                println(throwable.message)
            }
        }
        return searchResponse
    }

    override fun search(searchString: String?, type: String?, limit: Int, page: Int): SearchResponse? {
        val searchCall = mixCloudApi.search(searchString, type, limit= limit,offset = getOffsetFromPage(page)!!)
        var searchResponse: SearchResponse? = null
        searchCall.subscribe { searchResponseZ,throwable ->
            if(throwable == null){
                searchResponse = SearchResponse(searchResponseZ)
            }else{
                println(throwable.message)
            }
        }
        return searchResponse
    }


    override fun getShow(entertainer: String, show: String, page: Int): ShowResponse? {
        val showCall = mixCloudApi.getShow(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showResponseRx:ShowResponse? = null
        showCall.subscribe { showResponse, throwable ->
            if(throwable == null) {
                showResponseRx = ShowResponse(showResponse)
            }else{
                println(throwable.message)
            }
        }
        return showResponseRx
    }

    override fun getShow(entertainer: String, show: String, linit: Int, page: Int): ShowResponse? {
        val showCall = mixCloudApi.getShow(entertainer, show,limit= linit, offset = getOffsetFromPage(page)!!)
        var showResponseRx:ShowResponse? = null
        showCall.subscribe { showResponse, throwable ->
            if(throwable == null) {
                showResponseRx = ShowResponse(showResponse)
            }else{
                println(throwable.message)
            }
        }
        return showResponseRx
    }

    override fun getShowFavorites(entertainer: String, show: String, page: Int): ShowFavoritesResponse? {
        val showFavoritesCall = mixCloudApi.getShowFavorites(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showFavoritesRx:ShowFavoritesResponse? = null
        showFavoritesCall.subscribe { showFavoritesResponse, throwable ->
            if(throwable == null) {
                showFavoritesRx = ShowFavoritesResponse(showFavoritesResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showFavoritesRx
    }

    override fun getShowFavorites(entertainer: String, show: String, limit: Int, page: Int): ShowFavoritesResponse? {
        val showFavoritesCall = mixCloudApi.getShowFavorites(entertainer, show,limit= limit, offset = getOffsetFromPage(page)!!)
        var showFavoritesRx:ShowFavoritesResponse? = null
        showFavoritesCall.subscribe { showFavoritesResponse, throwable ->
            if(throwable == null) {
                showFavoritesRx = ShowFavoritesResponse(showFavoritesResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showFavoritesRx
    }

    override fun getShowListeners(entertainer: String, show: String, page: Int): ShowListenersResponse? {
        val showListenersCall = mixCloudApi.getShowListeners(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showListenersRx:ShowListenersResponse? = null
        showListenersCall.subscribe { showListenersResponse, throwable ->
            if(throwable == null) {
                showListenersRx = ShowListenersResponse(showListenersResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showListenersRx
    }

    override fun getShowListeners(entertainer: String, show: String, limit: Int, page: Int): ShowListenersResponse? {
        val showListenersCall = mixCloudApi.getShowListeners(entertainer, show,limit= limit, offset = getOffsetFromPage(page)!!)
        var showListenersRx:ShowListenersResponse? = null
        showListenersCall.subscribe { showListenersResponse, throwable ->
            if(throwable == null) {
                showListenersRx = ShowListenersResponse(showListenersResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showListenersRx
    }

    override fun getShowComments(entertainer: String, show: String, page: Int): ShowCommentsResponse? {
        val showCommentsCall = mixCloudApi.getShowComments(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showCommentsResponseRx:ShowCommentsResponse? = null
        showCommentsCall.subscribe { showCommentsResponse, throwable ->
            if(throwable == null) {
                showCommentsResponseRx = ShowCommentsResponse(showCommentsResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showCommentsResponseRx
    }

    override fun getShowComments(entertainer: String, show: String, limit: Int, page: Int): ShowCommentsResponse? {
        val showCommentsCall = mixCloudApi.getShowComments(entertainer, show,limit= limit, offset = getOffsetFromPage(page)!!)
        var showCommentsResponseRx:ShowCommentsResponse? = null
        showCommentsCall.subscribe { showCommentsResponse, throwable ->
            if(throwable == null) {
                showCommentsResponseRx = ShowCommentsResponse(showCommentsResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showCommentsResponseRx
    }

    override fun getShowSimilar(entertainer: String, show: String, page: Int): ShowSimilarResponse? {
        val showSimilarCall = mixCloudApi.getShowSimilar(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showSimilarResponseRx:ShowSimilarResponse? = null
        showSimilarCall.subscribe { showSimilarResponse, throwable ->
            if(throwable == null) {
                showSimilarResponseRx = ShowSimilarResponse(showSimilarResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showSimilarResponseRx
    }

    override fun getShowSimilar(entertainer: String, show: String, limit: Int, page: Int): ShowSimilarResponse? {
        val showSimilarCall = mixCloudApi.getShowSimilar(entertainer, show,limit = limit, offset = getOffsetFromPage(page)!!)
        var showSimilarResponseRx:ShowSimilarResponse? = null
        showSimilarCall.subscribe { showSimilarResponse, throwable ->
            if(throwable == null) {
                showSimilarResponseRx = ShowSimilarResponse(showSimilarResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return showSimilarResponseRx
    }

    override fun getUser(username: String): UserResponse? {
        val userCall = mixCloudApi.getUser(username)
        var userResponselocal:UserResponse? = null
        userCall.subscribe { userResponse, throwable ->
            if(throwable == null) {
                userResponselocal = UserResponse(userResponse)
            }else{
                throw Error(throwable.message)
            }
        }
        return userResponselocal
    }

    override fun getUserCloudCasts(username: String, page: Int): UserCloudCastResponse? {
        val cloudCastCall = mixCloudApi.getUserCloudCasts(username, offset = getOffsetFromPage(page)!!)
        var userCloudCastResponseRx:UserCloudCastResponse? = null
        cloudCastCall.subscribe { userCloudCastResponse, throwable ->
            if(throwable == null) {
                userCloudCastResponseRx = UserCloudCastResponse(userCloudCastResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userCloudCastResponseRx
    }

    override fun getUserCloudCasts(username: String, limit: Int, page: Int): UserCloudCastResponse? {
        val cloudCastCall = mixCloudApi.getUserCloudCasts(username,limit = limit,offset = getOffsetFromPage(page)!!)
        var userCloudCastResponseRx:UserCloudCastResponse? = null
        cloudCastCall.subscribe { userCloudCastResponse, throwable ->
            if(throwable == null) {
                userCloudCastResponseRx = UserCloudCastResponse(userCloudCastResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userCloudCastResponseRx
    }

    override fun getUserComments(username: String, page: Int): UserCommentsResponse? {
        val userCommentsCall = mixCloudApi.getUserComments(username, offset = getOffsetFromPage(page)!!)
        var userCommentsResponseRx:UserCommentsResponse? = null
        userCommentsCall.subscribe { userCommentsResponse, throwable ->
            if(throwable == null) {
                userCommentsResponseRx = UserCommentsResponse(userCommentsResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userCommentsResponseRx
    }

    override fun getUserComments(username: String, limit: Int, page: Int): UserCommentsResponse? {
        val userCommentsCall = mixCloudApi.getUserComments(username,limit = limit, offset = getOffsetFromPage(page)!!)
        var userCommentsResponseRx:UserCommentsResponse? = null
        userCommentsCall.subscribe { userCommentsResponse, throwable ->
            if(throwable == null) {
                userCommentsResponseRx = UserCommentsResponse(userCommentsResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userCommentsResponseRx
    }

    override fun getUserFavorites(username: String, page: Int): UserFavoritesResponse? {
        val userFavorites = mixCloudApi.getUserFavorites(username, offset = getOffsetFromPage(page)!!)
        var userFavoritesResponseRx: UserFavoritesResponse? = null
        userFavorites.subscribe { userFavoritesResponse, throwable ->
            if(throwable == null) {
                userFavoritesResponseRx = UserFavoritesResponse(userFavoritesResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userFavoritesResponseRx
    }

    override fun getUserFavorites(username: String, limit: Int, page: Int): UserFavoritesResponse? {
        val userFavorites = mixCloudApi.getUserFavorites(username,limit=limit, offset = getOffsetFromPage(page)!!)
        var userFavoritesResponseRx: UserFavoritesResponse? = null
        userFavorites.subscribe { userFavoritesResponse, throwable ->
            if(throwable == null) {
                userFavoritesResponseRx = UserFavoritesResponse(userFavoritesResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userFavoritesResponseRx
    }

    override fun getUserFeed(username: String, page: Int): UserFeedResponse? {
        val userFeedCall = mixCloudApi.getUserFeed(username, offset = getOffsetFromPage(page)!!)
        var userFeedResponseRx:UserFeedResponse? = null
        userFeedCall.subscribe { userFeedResponse, throwable ->
            if(throwable == null) {
                userFeedResponseRx = UserFeedResponse(userFeedResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userFeedResponseRx
    }

    override fun getUserFeed(username: String, limit: Int, page: Int): UserFeedResponse? {
        val userFeedCall = mixCloudApi.getUserFeed(username,limit=limit, offset = getOffsetFromPage(page)!!)
        var userFeedResponseRx:UserFeedResponse? = null
        userFeedCall.subscribe { userFeedResponse, throwable ->
            if(throwable == null) {
                userFeedResponseRx = UserFeedResponse(userFeedResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userFeedResponseRx
    }

    override fun getUserFollowers(username: String, page: Int): UserFollowersResponse? {
        val userFollowersCall = mixCloudApi.getUserFollowers(username, offset = getOffsetFromPage(page)!!)
        var userFollowersResponseRx:UserFollowersResponse? = null
        userFollowersCall.subscribe { userFollowersResponse, throwable ->
            if(throwable == null) {
                userFollowersResponseRx = UserFollowersResponse(userFollowersResponse)
            }else{
                LOGGER?.error(throwable.message)
            }
        }
        return userFollowersResponseRx
    }

    override fun getUserFollowers(username: String, limit: Int, page: Int): UserFollowersResponse? {
        val userFollowersCall = mixCloudApi.getUserFollowers(username,limit = limit, offset = getOffsetFromPage(page)!!)
        var userFollowersResponseRx:UserFollowersResponse? = null
        userFollowersCall.subscribe { userFollowersResponse, throwable ->
            if(throwable == null) {
                userFollowersResponseRx = UserFollowersResponse(userFollowersResponse)
            }else{
                LOGGER?.error(throwable.message)
            }
        }
        return userFollowersResponseRx
    }

    override fun getUserFollowing(username: String, page: Int): UserFollowingResponse? {
        val userFollowingCall = mixCloudApi.getUserFollowing(username, offset = getOffsetFromPage(page)!!)
        var userFollowingResponseRx:UserFollowingResponse? = null
        userFollowingCall.subscribe { userFollowingResponse, throwable ->
            if(throwable == null) {
                userFollowingResponseRx = UserFollowingResponse(userFollowingResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userFollowingResponseRx
    }

    override fun getUserFollowing(username: String, limit: Int, page: Int): UserFollowingResponse? {
        val userFollowingCall = mixCloudApi.getUserFollowing(username,limit = limit, offset = getOffsetFromPage(page)!!)
        var userFollowingResponseRx:UserFollowingResponse? = null
        userFollowingCall.subscribe { userFollowingResponse, throwable ->
            if(throwable == null) {
                userFollowingResponseRx = UserFollowingResponse(userFollowingResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userFollowingResponseRx
    }

    override fun getUserListens(username: String, page: Int): UserListensResponse? {
        val userListensCall = mixCloudApi.getUserListens(username, offset = getOffsetFromPage(page)!!)
        var userListensResponseRx:UserListensResponse? = null
        userListensCall.subscribe { userListensResponse, throwable ->
            if(throwable == null) {
                userListensResponseRx = UserListensResponse(userListensResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userListensResponseRx
    }

    override fun getUserListens(username: String, limit: Int, page: Int): UserListensResponse? {
        val userListensCall = mixCloudApi.getUserListens(username, limit = limit,offset = getOffsetFromPage(page)!!)
        var userListensResponseRx:UserListensResponse? = null
        userListensCall.subscribe { userListensResponse, throwable ->
            if(throwable == null) {
                userListensResponseRx = UserListensResponse(userListensResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userListensResponseRx
    }

    override fun getUserPlaylists(username: String, page: Int): UserPlaylistsResponse? {
        val userPlaylistCall = mixCloudApi.getUserPlaylists(username, offset = getOffsetFromPage(page)!!)
        var userPlayListsResponseRx:UserPlaylistsResponse? = null
        userPlaylistCall.subscribe { userPlaylistsResponse, throwable ->
            if(throwable == null) {
                userPlayListsResponseRx = UserPlaylistsResponse(userPlaylistsResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userPlayListsResponseRx
    }

    override fun getUserPlaylists(username: String, limit: Int, page: Int): UserPlaylistsResponse? {
        val userPlaylistCall = mixCloudApi.getUserPlaylists(username,limit = limit, offset = getOffsetFromPage(page)!!)
        var userPlayListsResponseRx:UserPlaylistsResponse? = null
        userPlaylistCall.subscribe { userPlaylistsResponse, throwable ->
            if(throwable == null) {
                userPlayListsResponseRx = UserPlaylistsResponse(userPlaylistsResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return userPlayListsResponseRx
    }

    override fun getTag(tag: String): TagResponse? {
        val tagCall = mixCloudApi.getTag(tag)
        var tagResponseRx:TagResponse? = null
        tagCall.subscribe { tagResponse, throwable ->
            if(throwable == null) {
                tagResponseRx = TagResponse(tagResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return tagResponseRx
    }

    override fun getLatestTag(tag: String, page: Int): LatestTagResponse? {
        val latestTagCall = mixCloudApi.getLatestTag(tag, offset = getOffsetFromPage(page)!!)
        var latestTagResponseRx: LatestTagResponse? = null
        latestTagCall.subscribe { latestTagResponse, throwable ->
            if(throwable == null) {
                latestTagResponseRx = LatestTagResponse(latestTagResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return latestTagResponseRx
    }

    override fun getLatestTag(tag: String, limit: Int, page: Int): LatestTagResponse? {
        val latestTagCall = mixCloudApi.getLatestTag(tag,limit = limit, offset = getOffsetFromPage(page)!!)
        var latestTagResponseRx: LatestTagResponse? = null
        latestTagCall.subscribe { latestTagResponse, throwable ->
            if(throwable == null) {
                latestTagResponseRx = LatestTagResponse(latestTagResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return latestTagResponseRx
    }

    override fun getPopularTag(tag: String, page: Int): PopularTagResponse? {
        val popularTagCall = mixCloudApi.getPopularTag(tag, offset = getOffsetFromPage(page)!!)
        var popularTagResponseRx:PopularTagResponse? = null
        popularTagCall.subscribe { popularTagResponse, throwable ->
            if(throwable == null) {
                popularTagResponseRx = PopularTagResponse(popularTagResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return popularTagResponseRx
    }

    override fun getPopularTag(tag: String, limit: Int, page: Int): PopularTagResponse? {
        val popularTagCall = mixCloudApi.getPopularTag(tag, limit = limit, offset = getOffsetFromPage(page)!!)
        var popularTagResponseRx:PopularTagResponse? = null
        popularTagCall.subscribe { popularTagResponse, throwable ->
            if(throwable == null) {
                popularTagResponseRx = PopularTagResponse(popularTagResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return popularTagResponseRx
    }

    override fun getCity(city: String): CityResponse? {
        val cityCall = mixCloudApi.getCity(city)
        var cityResponseRx: CityResponse? = null
        cityCall.subscribe { cityResponse, throwable ->
            if(throwable == null) {
                cityResponseRx = CityResponse(cityResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return cityResponseRx
    }

    override fun getCityPopular(city: String, page: Int): CityPopularResponse? {
        val cityPopularCall = mixCloudApi.getCityPopular(city, offset = getOffsetFromPage(page)!!)
        var cityPopularResponseRx: CityPopularResponse? = null
        cityPopularCall.subscribe { cityPopularResponse, throwable ->
            if(throwable == null) {
                cityPopularResponseRx = CityPopularResponse(cityPopularResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return cityPopularResponseRx
    }

    override fun getCityPopular(city: String, limit: Int, page: Int): CityPopularResponse? {
        val cityPopularCall = mixCloudApi.getCityPopular(city, limit = limit,offset = getOffsetFromPage(page)!!)
        var cityPopularResponseRx: CityPopularResponse? = null
        cityPopularCall.subscribe { cityPopularResponse, throwable ->
            if(throwable == null) {
                cityPopularResponseRx = CityPopularResponse(cityPopularResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return cityPopularResponseRx
    }

    override fun getCityLatest(city: String, page: Int): CityLatestResponse? {
        val cityLatest = mixCloudApi.getCityLatest(city, offset = getOffsetFromPage(page)!!)
        var cityLatestResponseRx:CityLatestResponse? = null
        cityLatest.subscribe { cityLatestResponse, throwable ->
            if(throwable == null) {
                cityLatestResponseRx = CityLatestResponse(cityLatestResponse)
            }else{
                LOGGER?.error(throwable.message)
            }
        }
        return cityLatestResponseRx
    }

    override fun getCityLatest(city: String, limit: Int, page: Int): CityLatestResponse? {
        val cityLatest = mixCloudApi.getCityLatest(city,limit = limit, offset = getOffsetFromPage(page)!!)
        var cityLatestResponseRx:CityLatestResponse? = null
        cityLatest.subscribe { cityLatestResponse, throwable ->
            if(throwable == null) {
                cityLatestResponseRx = CityLatestResponse(cityLatestResponse)
            }else{
                LOGGER?.error(throwable.message)
            }
        }
        return cityLatestResponseRx
    }

    override fun getTagAndCity(tag: String, city: String): TagAndCityResponse? {
        val tagAndCityCall = mixCloudApi.getTagAndCity(tag, city)
        var tagAndCityResponseRx:TagAndCityResponse? = null
        tagAndCityCall.subscribe { tagAndCityResponse, throwable ->
            if(throwable == null) {
                tagAndCityResponseRx = TagAndCityResponse(tagAndCityResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return tagAndCityResponseRx
    }

    override fun getTagAndCityPopular(tag: String, city: String, page: Int): CityAndTagPopularResponse? {
        val tagAndCityPopularCall = mixCloudApi.getTagAndCityPopular(tag, city, offset = getOffsetFromPage(page)!!)
        var tagAndCityResponseRx:CityAndTagPopularResponse? = null
        tagAndCityPopularCall.subscribe { cityAndTagPopularResponse, throwable ->
            if(throwable == null) {
                tagAndCityResponseRx = CityAndTagPopularResponse(cityAndTagPopularResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return tagAndCityResponseRx
    }

    override fun getTagAndCityPopular(tag: String, city: String, limit: Int, page: Int): CityAndTagPopularResponse? {
        val tagAndCityPopularCall = mixCloudApi.getTagAndCityPopular(tag, city, limit = limit, offset = getOffsetFromPage(page)!!)
        var tagAndCityResponseRx:CityAndTagPopularResponse? = null
        tagAndCityPopularCall.subscribe { cityAndTagPopularResponse, throwable ->
            if(throwable == null) {
                tagAndCityResponseRx = CityAndTagPopularResponse(cityAndTagPopularResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return tagAndCityResponseRx
    }

 

    override fun getTagAndCityLatest(tag: String, city: String, page: Int): CityAndTagLatestResponse? {
        val tagAndCityLatestCall = mixCloudApi.getTagAndCityLatest(tag, city, offset = getOffsetFromPage(page)!!)
        var cityAndTagLatestResponseRx:CityAndTagLatestResponse? = null
        tagAndCityLatestCall.subscribe { cityAndTagLatestResponse, throwable ->
            if(throwable == null) {
                cityAndTagLatestResponseRx = CityAndTagLatestResponse(cityAndTagLatestResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return cityAndTagLatestResponseRx
    }

    override fun getTagAndCityLatest(tag: String, city: String, limit: Int, page: Int): CityAndTagLatestResponse? {
        val tagAndCityLatestCall = mixCloudApi.getTagAndCityLatest(tag, city,limit = limit, offset = getOffsetFromPage(page)!!)
        var cityAndTagLatestResponseRx:CityAndTagLatestResponse? = null
        tagAndCityLatestCall.subscribe { cityAndTagLatestResponse, throwable ->
            if(throwable == null) {
                cityAndTagLatestResponseRx = CityAndTagLatestResponse(cityAndTagLatestResponse)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return cityAndTagLatestResponseRx
    }

    override fun followUser(username: String, accessToken: String): FollowResponse? {
        val followUserCall = mixCloudApi.followUser(username,accessToken)
        var followResponse:FollowResponse? = null
        followUserCall.subscribe { followResponze,throwable ->
            if(throwable == null) {
                followResponse = FollowResponse(followResponze)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return followResponse
    }

    override fun favoriting(username: String, show: String, accessToken: String): FavoritingResponse? {
        val favoritingCall = mixCloudApi.favoriting(username,show,accessToken)
        var favoritingResponse:FavoritingResponse? = null
        favoritingCall.subscribe { favorite,throwable ->
            if(throwable == null){
                favoritingResponse = FavoritingResponse(favorite)
            }else{
                LOGGER?.error(throwable.message)
            }
        }
        return favoritingResponse
    }

    override fun reposting(username: String, show: String, accessToken: String): RepostingResponse? {
        val repostingCall = mixCloudApi.reposting(username,show,accessToken)
        var repostingResponse:RepostingResponse? = null
        repostingCall.subscribe { repost, throwable ->
            if(throwable == null){
                repostingResponse = RepostingResponse(repost)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return repostingResponse
    }

    override fun listenLater(username: String, show: String, accessToken: String): ListenLaterResponse? {
        val listenLaterCall = mixCloudApi.listenLater(username,show,accessToken)
        var listenLaterResponse:ListenLaterResponse? = null
        listenLaterCall.subscribe { listen,throwable ->
            if(throwable == null){
                listenLaterResponse = ListenLaterResponse(listen)
            }else{
                LOGGER?.error(throwable.localizedMessage)
            }
        }
        return listenLaterResponse
    }


}