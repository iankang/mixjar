package com.mixsteroids.mixjar.models.userCloudCast

import com.google.gson.annotations.SerializedName

data class UserCloudCastResponse (

	@SerializedName("data") val data : List<Data>,
	@SerializedName("paging") val paging : Paging,
	@SerializedName("name") val name : String
)