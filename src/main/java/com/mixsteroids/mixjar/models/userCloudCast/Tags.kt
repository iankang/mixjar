package com.mixsteroids.mixjar.models.userCloudCast

import com.google.gson.annotations.SerializedName


data class Tags (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String
)