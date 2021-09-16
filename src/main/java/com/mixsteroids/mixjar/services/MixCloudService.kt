package com.mixsteroids.mixjar.services


import com.mixsteroids.mixjar.models.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MixCloudService {
   @GET("{user}/?metadata=1")
   fun getUser(@Path("user")username:String):Call<UserResponse>

   @GET("{user}/cloudcasts")
   fun getUserCloudCasts(@Path("user")username: String):Call<UserCloudCastResponse>

   @GET("{user}/comments")
   fun getUserComments(@Path("user")username: String):Call<UserCommentsResponse>

   @GET("{user}/favorites")
   fun getUserFavorites(@Path("user")username: String):Call<UserFavoritesResponse>

   @GET("{user}/feed")
   fun getUserFeed(@Path("user")username: String):Call<UserFeedResponse>

   @GET("{user}/followers")
   fun getUserFollowers(@Path("user")username: String):Call<UserFollowersResponse>

   @GET("{user}/following")
   fun getUserFollowing(@Path("user")username: String):Call<UserFollowingResponse>

   @GET("{user}/listens")
   fun getUserListens(@Path("user")username: String):Call<UserListensResponse>

   @GET("{user}/playlists")
   fun getUserPlaylists(@Path("user")username: String):Call<UserPlaylistsResponse>


   @GET("{entertainer}/{showname}/?metadata=1")
   fun getShow(@Path("entertainer") entertainer:String, @Path("showname") showName:String): Call<ShowResponse>

   @GET("discover/{tag}/?metadata=1")
   fun getTag(@Path("tag") tag:String):Call<TagResponse>

   @GET("discover/city:{city}/?metadata=1")
   fun getCity(@Path("city") city:String):Call<CityResponse>

   @GET("discover/{tag}+city:{city}/?metadata=1")
   fun getTagAndCity(@Path("tag")tag:String,@Path("city") city: String):Call<TagAndCityResponse>
}