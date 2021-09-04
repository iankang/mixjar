package com.mixsteroids.mixjar.models.show

import com.google.gson.annotations.SerializedName


data class User (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("username") val username : String,
	@SerializedName("pictures") val pictures : Pictures
){
	constructor():this(
		"",
		"",
		"",
		"",
		Pictures()
	)
}