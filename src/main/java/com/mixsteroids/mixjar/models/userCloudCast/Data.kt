package com.mixsteroids.mixjar.models.userCloudCast

import com.google.gson.annotations.SerializedName


data class Data (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("tags") val tags : List<Tags>,
	@SerializedName("created_time") val created_time : String,
	@SerializedName("updated_time") val updated_time : String,
	@SerializedName("play_count") val play_count : Int,
	@SerializedName("favorite_count") val favorite_count : Int,
	@SerializedName("comment_count") val comment_count : Int,
	@SerializedName("listener_count") val listener_count : Int,
	@SerializedName("repost_count") val repost_count : Int,
	@SerializedName("pictures") val pictures : Pictures,
	@SerializedName("slug") val slug : String,
	@SerializedName("user") val user : User,
	@SerializedName("audio_length") val audio_length : Int
)