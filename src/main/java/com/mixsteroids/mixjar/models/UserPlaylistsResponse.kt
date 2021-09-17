package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName


data class UserPlaylistsResponse (

	@SerializedName("data") val data : List<UserPlaylistsResponseData>,
	@SerializedName("paging") val paging : UserPlaylistsResponsePaging,
	@SerializedName("name") val name : String
)

data class UserPlaylistsResponseData (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("owner") val owner : UserPlaylistsResponseOwner,
	@SerializedName("slug") val slug : String
)

data class UserPlaylistsResponseOwner (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("username") val username : String,
	@SerializedName("pictures") val pictures : UserPlaylistsResponsePictures
)
data class UserPlaylistsResponsePaging (

	@SerializedName("next") val next : String,
	@SerializedName("previous") val previous : String
)

data class UserPlaylistsResponsePictures (

	@SerializedName("small") val small : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("medium_mobile") val medium_mobile : String,
	@SerializedName("medium") val medium : String,
	@SerializedName("large") val large : String,
	@SerializedName("320wx320h") val small320wx320h : String,
	@SerializedName("extra_large") val extra_large : String,
	@SerializedName("640wx640h") val small640wx640h : String
)
