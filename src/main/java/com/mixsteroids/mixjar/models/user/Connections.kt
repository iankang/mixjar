package com.mixsteroids.mixjar.models.user

import com.google.gson.annotations.SerializedName


data class Connections (

	@SerializedName("cloudcasts") val cloudcasts : String,
	@SerializedName("comments") val comments : String,
	@SerializedName("favorites") val favorites : String,
	@SerializedName("feed") val feed : String,
	@SerializedName("followers") val followers : String,
	@SerializedName("following") val following : String,
	@SerializedName("listens") val listens : String,
	@SerializedName("playlists") val playlists : String
)