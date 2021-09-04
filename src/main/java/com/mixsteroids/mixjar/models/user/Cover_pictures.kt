package com.mixsteroids.mixjar.models.user

import com.google.gson.annotations.SerializedName


data class Cover_pictures (

	@SerializedName("835wx120h") val small835wx120h : String,
	@SerializedName("1113wx160h") val small1113wx160h : String,
	@SerializedName("1670wx240h") val small1670wx240h : String
){
	constructor():this("","","")
}