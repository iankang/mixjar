package com.mixsteroids.mixjar.models.tag

import com.google.gson.annotations.SerializedName


data class Connections (

	@SerializedName("popular") val popular : String,
	@SerializedName("latest") val latest : String
)