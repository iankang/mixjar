package com.mixsteroids.mixjar.models.user

import com.google.gson.annotations.SerializedName


data class Metadata (

	@SerializedName("connections") val connections : Connections
)