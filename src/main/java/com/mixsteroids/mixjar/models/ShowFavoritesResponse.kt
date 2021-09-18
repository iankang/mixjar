package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName


data class ShowFavoritesResponse (

	@SerializedName("data") val data : List<ShowFavoritesResponseData>,
	@SerializedName("paging") val paging : ShowFavoritesResponsePaging
)

data class ShowFavoritesResponseData (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("username") val username : String,
	@SerializedName("pictures") val pictures : ShowFavoritesPictures
)

data class ShowFavoritesResponsePaging (

	@SerializedName("next") val next : String,
	@SerializedName("previous") val previous : String
)

data class ShowFavoritesPictures (

	@SerializedName("small") val small : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("medium_mobile") val medium_mobile : String,
	@SerializedName("medium") val medium : String,
	@SerializedName("large") val large : String,
	@SerializedName("320wx320h") val picture320wx320h : String,
	@SerializedName("extra_large") val extra_large : String,
	@SerializedName("640wx640h") val picture640wx640h : String
)