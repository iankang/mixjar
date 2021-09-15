package com.mixsteroids.mixjar.models.tag


import com.google.gson.annotations.SerializedName

data class TagResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : Metadata
)
data class CityResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : Metadata
)
data class TagAndCityResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : Metadata
)