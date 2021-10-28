package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.MixCloudInterface
import com.mixsteroids.mixjar.models.*

import com.mixsteroids.mixjar.network.Network
import retrofit2.create

class MixCloudServiceImpl : MixCloudInterface {
    private val network = Network()
    private val mixCloudApi = network.getMixCloudRetrofitInstance().create<MixCloudService>()

    override fun getShow(entertainer: String, show: String, page: Int): ShowResponse? {
        val showCall = mixCloudApi.getShow(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showResponseRx:ShowResponse? = null
        showCall.subscribe { showResponse, throwable ->
            showResponseRx = ShowResponse(showResponse)
        }
        return showResponseRx
    }

    override fun getShowFavorites(entertainer: String, show: String, page: Int): ShowFavoritesResponse? {
        val showFavoritesCall = mixCloudApi.getShowFavorites(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showFavoritesRx:ShowFavoritesResponse? = null
        showFavoritesCall.subscribe { showFavoritesResponse, throwable ->
            showFavoritesRx = ShowFavoritesResponse(showFavoritesResponse)
        }
        return showFavoritesRx
    }

    override fun getShowListeners(entertainer: String, show: String, page: Int): ShowListenersResponse? {
        val showListenersCall = mixCloudApi.getShowListeners(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showListenersRx:ShowListenersResponse? = null
        showListenersCall.subscribe { showListenersResponse, throwable ->
            showListenersRx = ShowListenersResponse(showListenersResponse)
        }
        return showListenersRx
    }

    override fun getShowComments(entertainer: String, show: String, page: Int): ShowCommentsResponse? {
        val showCommentsCall = mixCloudApi.getShowComments(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showCommentsResponseRx:ShowCommentsResponse? = null
        showCommentsCall.subscribe { showCommentsResponse, throwable ->
            showCommentsResponseRx = ShowCommentsResponse(showCommentsResponse)
        }
        return showCommentsResponseRx
    }

    override fun getShowSimilar(entertainer: String, show: String, page: Int): ShowSimilarResponse? {
        val showSimilarCall = mixCloudApi.getShowSimilar(entertainer, show, offset = getOffsetFromPage(page)!!)
        var showSimilarResponseRx:ShowSimilarResponse? = null
        showSimilarCall.subscribe { showSimilarResponse, throwable ->
            showSimilarResponseRx = ShowSimilarResponse(showSimilarResponse)
        }
        return showSimilarResponseRx
    }

    override fun getUser(username: String): UserResponse? {
        val userCall = mixCloudApi.getUser(username)
        var userResponselocal:UserResponse? = null
        userCall.subscribe { userResponse, throwable ->
            userResponselocal = UserResponse(userResponse)
        }
        return userResponselocal
    }

    override fun getUserCloudCasts(username: String, page: Int): UserCloudCastResponse? {
        val cloudCastCall = mixCloudApi.getUserCloudCasts(username, offset = getOffsetFromPage(page)!!)
        var userCloudCastResponseRx:UserCloudCastResponse? = null
        cloudCastCall.subscribe { userCloudCastResponse, throwable ->
            userCloudCastResponseRx = UserCloudCastResponse(userCloudCastResponse)
        }
        return userCloudCastResponseRx
    }

    override fun getUserComments(username: String, page: Int): UserCommentsResponse? {
        val userCommentsCall = mixCloudApi.getUserComments(username, offset = getOffsetFromPage(page)!!)
        var userCommentsResponseRx:UserCommentsResponse? = null
        userCommentsCall.subscribe { userCommentsResponse, throwable ->
            userCommentsResponseRx = UserCommentsResponse(userCommentsResponse)
        }
        return userCommentsResponseRx
    }

    override fun getUserFavorites(username: String, page: Int): UserFavoritesResponse? {
        val userFavorites = mixCloudApi.getUserFavorites(username, offset = getOffsetFromPage(page)!!)
        var userFavoritesResponseRx: UserFavoritesResponse? = null
        userFavorites.subscribe { userFavoritesResponse, throwable ->
            userFavoritesResponseRx = UserFavoritesResponse(userFavoritesResponse)
        }
        return userFavoritesResponseRx
    }

    override fun getUserFeed(username: String, page: Int): UserFeedResponse? {
        val userFeedCall = mixCloudApi.getUserFeed(username, offset = getOffsetFromPage(page)!!)
        var userFeedResponseRx:UserFeedResponse? = null
        userFeedCall.subscribe { userFeedResponse, throwable ->
            userFeedResponseRx = UserFeedResponse(userFeedResponse)
        }
        return userFeedResponseRx
    }

    override fun getUserFollowers(username: String, page: Int): UserFollowersResponse? {
        val userFollowersCall = mixCloudApi.getUserFollowers(username, offset = getOffsetFromPage(page)!!)
        var userFollowersResponseRx:UserFollowersResponse? = null
        userFollowersCall.subscribe { userFollowersResponse, throwable ->
            userFollowersResponseRx = UserFollowersResponse(userFollowersResponse)
        }
        return userFollowersResponseRx
    }

    override fun getUserFollowing(username: String, page: Int): UserFollowingResponse? {
        val userFollowingCall = mixCloudApi.getUserFollowing(username, offset = getOffsetFromPage(page)!!)
        var userFollowingResponseRx:UserFollowingResponse? = null
        userFollowingCall.subscribe { userFollowingResponse, throwable ->
            userFollowingResponseRx = UserFollowingResponse(userFollowingResponse)
        }
        return userFollowingResponseRx
    }

    override fun getUserListens(username: String, page: Int): UserListensResponse? {
        val userListensCall = mixCloudApi.getUserListens(username, offset = getOffsetFromPage(page)!!)
        var userListensResponseRx:UserListensResponse? = null
        userListensCall.subscribe { userListensResponse, throwable ->
            userListensResponseRx = UserListensResponse(userListensResponse)
        }
        return userListensResponseRx
    }

    override fun getUserPlaylists(username: String, page: Int): UserPlaylistsResponse? {
        val userPlaylistCall = mixCloudApi.getUserPlaylists(username, offset = getOffsetFromPage(page)!!)
        var userPlayListsResponseRx:UserPlaylistsResponse? = null
        userPlaylistCall.subscribe { userPlaylistsResponse, throwable ->
            userPlayListsResponseRx = UserPlaylistsResponse(userPlaylistsResponse)
        }
        return userPlayListsResponseRx
    }

    override fun getTag(tag: String): TagResponse? {
        val tagCall = mixCloudApi.getTag(tag)
        var tagResponseRx:TagResponse? = null
        tagCall.subscribe { tagResponse, throwable ->
            tagResponseRx = TagResponse(tagResponse)
        }
        return tagResponseRx
    }

    override fun getLatestTag(tag: String, page: Int): LatestTagResponse? {
        val latestTagCall = mixCloudApi.getLatestTag(tag, offset = getOffsetFromPage(page)!!)
        var latestTagResponseRx: LatestTagResponse? = null
        latestTagCall.subscribe { latestTagResponse, throwable ->
            latestTagResponseRx = LatestTagResponse(latestTagResponse)
        }
        return latestTagResponseRx
    }

    override fun getPopularTag(tag: String, page: Int): PopularTagResponse? {
        val popularTagCall = mixCloudApi.getPopularTag(tag, offset = getOffsetFromPage(page)!!)
        var popularTagResponseRx:PopularTagResponse? = null
        popularTagCall.subscribe { popularTagResponse, throwable ->
            popularTagResponseRx = PopularTagResponse(popularTagResponse)
        }
        return popularTagResponseRx
    }

    override fun getCity(city: String): CityResponse? {
        val cityCall = mixCloudApi.getCity(city)
        var cityResponseRx: CityResponse? = null
        cityCall.subscribe { cityResponse, throwable ->
            cityResponseRx = CityResponse(cityResponse)
        }
        return cityResponseRx
    }

    override fun getCityPopular(city: String, page: Int): CityPopularResponse? {
        val cityPopularCall = mixCloudApi.getCityPopular(city, offset = getOffsetFromPage(page)!!)
        var cityPopularResponseRx: CityPopularResponse? = null
        cityPopularCall.subscribe { cityPopularResponse, throwable ->
            cityPopularResponseRx = CityPopularResponse(cityPopularResponse)
        }
        return cityPopularResponseRx
    }

    override fun getCityLatest(city: String, page: Int): CityLatestResponse? {
        val cityLatest = mixCloudApi.getCityLatest(city, offset = getOffsetFromPage(page)!!)
        var cityLatestResponseRx:CityLatestResponse? = null
        cityLatest.subscribe { cityLatestResponse, throwable ->
            cityLatestResponseRx = CityLatestResponse(cityLatestResponse)
        }
        return cityLatestResponseRx
    }

    override fun getTagAndCity(tag: String, city: String): TagAndCityResponse? {
        val tagAndCityCall = mixCloudApi.getTagAndCity(tag, city)
        var tagAndCityResponseRx:TagAndCityResponse? = null
        tagAndCityCall.subscribe { tagAndCityResponse, throwable ->
            tagAndCityResponseRx = TagAndCityResponse(tagAndCityResponse)
        }
        return tagAndCityResponseRx
    }

    override fun getTagAndCityPopular(tag: String, city: String, page: Int): CityAndTagPopularResponse? {
        val tagAndCityPopularCall = mixCloudApi.getTagAndCityPopular(tag, city, offset = getOffsetFromPage(page)!!)
        var tagAndCityResponseRx:CityAndTagPopularResponse? = null
        tagAndCityPopularCall.subscribe { cityAndTagPopularResponse, throwable ->
            tagAndCityResponseRx = CityAndTagPopularResponse(cityAndTagPopularResponse)
        }
        return tagAndCityResponseRx
    }

    override fun getTagAndCityLatest(tag: String, city: String, page: Int): CityAndTagLatestResponse? {
        val tagAndCityLatestCall = mixCloudApi.getTagAndCityLatest(tag, city, offset = getOffsetFromPage(page)!!)
        var cityAndTagLatestResponseRx:CityAndTagLatestResponse? = null
        tagAndCityLatestCall.subscribe { cityAndTagLatestResponse, throwable ->
            cityAndTagLatestResponseRx = CityAndTagLatestResponse(cityAndTagLatestResponse)
        }
        return cityAndTagLatestResponseRx
    }


}