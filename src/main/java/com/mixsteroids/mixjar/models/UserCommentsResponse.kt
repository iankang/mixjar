package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName


data class UserCommentsResponse (

	@SerializedName("data") val data : List<UserCommentsResponseData?>?,
	@SerializedName("paging") val paging : UserCommentsResponsePaging?,
	@SerializedName("name") val name : String?
){
	constructor(userCommentsResponse: UserCommentsResponse?):this(
		userCommentsResponse?.data,
		userCommentsResponse?.paging,
		userCommentsResponse?.name
	)
}

data class UserCommentsResponseUser (

	@SerializedName("key") val key : String?,
	@SerializedName("url") val url : String?,
	@SerializedName("name") val name : String?,
	@SerializedName("username") val username : String?,
	@SerializedName("pictures") val pictures : UserCommentsResponsePictures?
)

data class UserCommentsResponsePictures (

	@SerializedName("small") val small : String?,
	@SerializedName("thumbnail") val thumbnail : String?,
	@SerializedName("medium_mobile") val medium_mobile : String?,
	@SerializedName("medium") val medium : String?,
	@SerializedName("large") val large : String?,
	@SerializedName("320wx320h") val small320wx320h : String?,
	@SerializedName("extra_large") val extra_large : String?,
	@SerializedName("640wx640h") val small640wx640h : String?
)


data class UserCommentsResponsePaging (

	@SerializedName("next") val next : String?,
	@SerializedName("previous") val previous : String?
)

data class UserCommentsResponseData (

	@SerializedName("key") val key : String?,
	@SerializedName("url") val url : String?,
	@SerializedName("user") val user : UserCommentsResponseUser?,
	@SerializedName("submit_date") val submit_date : String?,
	@SerializedName("comment") val comment : String?
)