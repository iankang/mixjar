package com.mixsteroids.mixjar.models.userCloudCast

import com.google.gson.annotations.SerializedName


data class Paging (

	@SerializedName("next") val next : String,
	@SerializedName("previous") val previous : String
)