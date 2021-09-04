package com.mixsteroids.mixjar.models.show

import com.google.gson.annotations.SerializedName


data class ShowResponse (

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
    @SerializedName("audio_length") val audio_length : Int,
    @SerializedName("description") val description : String,
    @SerializedName("sections") val sections : List<String>,
    @SerializedName("picture_primary_color") val picture_primary_color : Int
){
	constructor() : this("",
		"",
		"",
		emptyList(),
		"",
		"",
		0,
		0,
		0,
		0,
		0,
		Pictures(),
		"",
		User(),
		0,
		"",
		emptyList(),
		0
	)
}