package com.mixsteroids.mixjar.models.show

import com.google.gson.annotations.SerializedName

data class Connections (
	@SerializedName("favorites") val favorites : String,
	@SerializedName("listeners") val listeners : String,
	@SerializedName("comments") val comments : String,
	@SerializedName("similar") val similar : String
)