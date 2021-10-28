package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName


data class ShowCommentsResponse (

	@SerializedName("data") val data : List<ShowCommentsResponseData>,
	@SerializedName("paging") val paging : ShowCommentsResponsePaging,
	@SerializedName("name") val name : String
){
	constructor(showCommentsResponse: ShowCommentsResponse):this(
		showCommentsResponse.data,
		showCommentsResponse.paging,
		showCommentsResponse.name
	)
}

data class ShowCommentsResponseData (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("user") val user : ShowCommentsResponseUser,
	@SerializedName("submit_date") val submit_date : String,
	@SerializedName("comment") val comment : String
)

data class ShowCommentsResponsePaging (

	@SerializedName("next") val next : String,
	@SerializedName("previous") val previous : String
)
data class ShowCommentsResponseUser (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("username") val username : String,
	@SerializedName("pictures") val pictures : ShowCommentsResponsePictures
)

data class ShowCommentsResponsePictures (

	@SerializedName("small") val small : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("medium_mobile") val medium_mobile : String,
	@SerializedName("medium") val medium : String,
	@SerializedName("large") val large : String,
	@SerializedName("320wx320h") val picture320wx320h : String,
	@SerializedName("extra_large") val extra_large : String,
	@SerializedName("640wx640h") val picture640wx640h : String
)