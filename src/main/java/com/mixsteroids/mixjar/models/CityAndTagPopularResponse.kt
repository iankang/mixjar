package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName


data class CityAndTagPopularResponse (

	@SerializedName("data") val data : List<CityAndTagPopularResponseData>,
	@SerializedName("paging") val paging : CityAndTagPopularResponsePaging
)
data class CityAndTagPopularResponseData (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("tags") val tags : List<CityAndTagPopularResponseTags>,
	@SerializedName("created_time") val created_time : String,
	@SerializedName("updated_time") val updated_time : String,
	@SerializedName("play_count") val play_count : Int,
	@SerializedName("favorite_count") val favorite_count : Int,
	@SerializedName("comment_count") val comment_count : Int,
	@SerializedName("listener_count") val listener_count : Int,
	@SerializedName("repost_count") val repost_count : Int,
	@SerializedName("pictures") val pictures : CityAndTagPopularResponsePictures,
	@SerializedName("slug") val slug : String,
	@SerializedName("user") val user : CityAndTagPopularResponseUser,
	@SerializedName("audio_length") val audio_length : Int
)

data class CityAndTagPopularResponsePaging (
	@SerializedName("next") val next : String,
	@SerializedName("previous") val previous : String
)

data class CityAndTagPopularResponsePictures (

	@SerializedName("small") val small : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("medium_mobile") val medium_mobile : String,
	@SerializedName("medium") val medium : String,
	@SerializedName("large") val large : String,
	@SerializedName("320wx320h") val picture320wx320h : String,
	@SerializedName("extra_large") val extra_large : String,
	@SerializedName("640wx640h") val picture640wx640h : String
)

data class CityAndTagPopularResponseTags (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String
)

data class CityAndTagPopularResponseUser (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("username") val username : String,
	@SerializedName("pictures") val pictures : CityAndTagPopularResponsePictures
)