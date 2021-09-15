package com.mixsteroids.mixjar.models.show
import com.mixsteroids.mixjar.models.show.Connections
import com.google.gson.annotations.SerializedName


data class Metadata (

	@SerializedName("connections") val connections : Connections
)