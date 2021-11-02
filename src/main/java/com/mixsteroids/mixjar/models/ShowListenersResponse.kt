package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName


data class ShowListenersResponse (

	@SerializedName("data") val data : List<ShowListenersResponseData?>?,
	@SerializedName("paging") val paging : ShowListenersResponsePaging?,
	@SerializedName("name") val name : String?
){
	constructor(showListenersResponse: ShowListenersResponse?):
			this(
				showListenersResponse?.data,
				showListenersResponse?.paging,
				showListenersResponse?.name
			)
}

data class ShowListenersResponseData (

	@SerializedName("key") val key : String?,
	@SerializedName("url") val url : String?,
	@SerializedName("name") val name : String?,
	@SerializedName("username") val username : String?,
	@SerializedName("pictures") val pictures : ShowListenersResponsePictures?,
	@SerializedName("listen_time") val listen_time : String?
)

data class ShowListenersResponsePaging (

	@SerializedName("next") val next : String?,
	@SerializedName("previous") val previous : String?
)

data class ShowListenersResponsePictures (

	@SerializedName("small") val small : String?,
	@SerializedName("thumbnail") val thumbnail : String?,
	@SerializedName("medium_mobile") val medium_mobile : String?,
	@SerializedName("medium") val medium : String?,
	@SerializedName("large") val large : String?,
	@SerializedName("320wx320h") val picture320wx320h : String?,
	@SerializedName("extra_large") val extra_large : String?,
	@SerializedName("640wx640h") val picture640wx640h : String?
)