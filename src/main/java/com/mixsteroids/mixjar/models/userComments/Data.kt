package com.mixsteroids.mixjar.models.userComments

import com.google.gson.annotations.SerializedName

data class Data (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("user") val user : User,
	@SerializedName("submit_date") val submit_date : String,
	@SerializedName("comment") val comment : String
)