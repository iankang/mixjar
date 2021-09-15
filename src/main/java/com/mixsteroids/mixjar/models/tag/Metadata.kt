package com.mixsteroids.mixjar.models.tag

import com.google.gson.annotations.SerializedName


data class Metadata (

	@SerializedName("connections") val connections : Connections
)