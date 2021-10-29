package com.mixsteroids.mixjar.models


import com.google.gson.annotations.SerializedName

data class TagResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : Metadata
){
	constructor(tagResponse: TagResponse):this(
		tagResponse.key,
		tagResponse.url,
		tagResponse.name,
		tagResponse.type,
		tagResponse.metadata
	)
}
data class CityResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : Metadata
){
	constructor(cityResponse: CityResponse):this(
		cityResponse.key,
		cityResponse.url,
		cityResponse.name,
		cityResponse.type,
		cityResponse.metadata
	)
}
data class TagAndCityResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : Metadata
){
	constructor(tagAndCityResponse: TagAndCityResponse):this(
		tagAndCityResponse.key,
		tagAndCityResponse.url,
		tagAndCityResponse.name,
		tagAndCityResponse.type,
		tagAndCityResponse.metadata
	)
}


data class Metadata (

	@SerializedName("connections") val connections : Connections
)

data class Connections (

	@SerializedName("popular") val popular : String,
	@SerializedName("latest") val latest : String
)