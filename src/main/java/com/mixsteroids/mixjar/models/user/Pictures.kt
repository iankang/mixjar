package com.mixsteroids.mixjar.models.user

import com.google.gson.annotations.SerializedName


data class Pictures (

	@SerializedName("small") val small : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("medium_mobile") val medium_mobile : String,
	@SerializedName("medium") val medium : String,
	@SerializedName("large") val large : String,
	@SerializedName("320wx320h") val small320wx320h : String,
	@SerializedName("extra_large") val extra_large : String,
	@SerializedName("640wx640h") val small640wx640h : String
){
	constructor():this("","","","","","","","")
}