package com.mixsteroids.mixjar.services


import com.mixsteroids.mixjar.models.*
import com.mixsteroids.mixjar.utils.Mixcloud.LIMIT_VALUE
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MixCloudService {
   @GET("{user}/?metadata=1")
   fun getUser(@Path("user")username:String): Single<UserResponse>

   @GET("{user}/cloudcasts")
   fun getUserCloudCasts(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserCloudCastResponse>

   @GET("{user}/comments")
   fun getUserComments(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserCommentsResponse>

   @GET("{user}/favorites")
   fun getUserFavorites(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserFavoritesResponse>

   @GET("{user}/feed")
   fun getUserFeed(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserFeedResponse>

   @GET("{user}/followers")
   fun getUserFollowers(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserFollowersResponse>

   @GET("{user}/following")
   fun getUserFollowing(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserFollowingResponse>

   @GET("{user}/listens")
   fun getUserListens(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserListensResponse>

   @GET("{user}/playlists")
   fun getUserPlaylists(@Path("user")username: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<UserPlaylistsResponse>


   @GET("{entertainer}/{showname}/?metadata=1")
   fun getShow(@Path("entertainer") entertainer:String, @Path("showname") showName:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0): Call<ShowResponse>

   @GET("{entertainer}/{showname}/favorites/")
   fun getShowFavorites(@Path("entertainer") entertainer:String, @Path("showname") showName:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0): Call<ShowFavoritesResponse>

   @GET("{entertainer}/{showname}/listeners/")
   fun getShowListeners(@Path("entertainer") entertainer:String, @Path("showname") showName:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<ShowListenersResponse>

   @GET("{entertainer}/{showname}/comments/")
   fun getShowComments(@Path("entertainer") entertainer:String, @Path("showname") showName:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<ShowCommentsResponse>

   @GET("{entertainer}/{showname}/similar/")
   fun getShowSimilar(@Path("entertainer") entertainer:String, @Path("showname") showName:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<ShowSimilarResponse>

   @GET("discover/{tag}/?metadata=1")
   fun getTag(@Path("tag") tag:String):Call<TagResponse>

   @GET("discover/{tag}/popular/")
   fun getPopularTag(@Path("tag") tag:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<PopularTagResponse>

   @GET("discover/{tag}/latest/")
   fun getLatestTag(@Path("tag") tag:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<LatestTagResponse>

   @GET("discover/city:{city}/?metadata=1")
   fun getCity(@Path("city") city:String):Call<CityResponse>

   @GET("discover/city:{city}/popular/")
   fun getCityPopular(@Path("city") city:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<CityPopularResponse>

   @GET("discover/city:{city}/latest/")
   fun getCityLatest(@Path("city") city:String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<CityLatestResponse>

   @GET("discover/{tag}+city:{city}/?metadata=1")
   fun getTagAndCity(@Path("tag")tag:String,@Path("city") city: String):Call<TagAndCityResponse>

   @GET("discover/{tag}+city:{city}/popular/")
   fun getTagAndCityPopular(@Path("tag")tag:String,@Path("city") city: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<CityAndTagPopularResponse>

   @GET("discover/{tag}+city:{city}/latest/")
   fun getTagAndCityLatest(@Path("tag")tag:String,@Path("city") city: String,@Query("limit")limit:Int = LIMIT_VALUE, @Query("offset")offset:Int = 0):Call<CityAndTagLatestResponse>
}