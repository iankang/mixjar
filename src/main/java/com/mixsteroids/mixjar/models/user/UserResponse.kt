package com.mixsteroids.mixjar.models.user

import com.google.gson.annotations.SerializedName


data class UserResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("username") val username : String,
	@SerializedName("pictures") val pictures : Pictures,
	@SerializedName("biog") val biog : String,
	@SerializedName("created_time") val created_time : String,
	@SerializedName("updated_time") val updated_time : String,
	@SerializedName("follower_count") val follower_count : Int,
	@SerializedName("following_count") val following_count : Int,
	@SerializedName("cloudcast_count") val cloudcast_count : Int,
	@SerializedName("favorite_count") val favorite_count : Int,
	@SerializedName("listen_count") val listen_count : Int,
	@SerializedName("is_pro") val is_pro : Boolean,
	@SerializedName("is_premium") val is_premium : Boolean,
	@SerializedName("city") val city : String,
	@SerializedName("country") val country : String,
	@SerializedName("cover_pictures") val cover_pictures : CoverPictures,
	@SerializedName("picture_primary_color") val picture_primary_color : Int,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : Metadata
)