package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName


data class UserFollowersResponse (

	@SerializedName("data") val data : List<UserFollowersData>?,
	@SerializedName("paging") val paging : UserFollowersPaging?,
	@SerializedName("name") val name : String?
){
	constructor(userFollowersResponse: UserFollowersResponse?):this(
		userFollowersResponse?.data,
		userFollowersResponse?.paging,
		userFollowersResponse?.name
	)
}

data class UserFollowersData (

	@SerializedName("key") val key : String?,
	@SerializedName("url") val url : String?,
	@SerializedName("name") val name : String?,
	@SerializedName("username") val username : String?,
	@SerializedName("pictures") val pictures : UserFollowersPictures?
)

data class UserFollowersPaging (

	@SerializedName("next") val next : String?,
	@SerializedName("previous") val previous : String?
)

data class UserFollowersPictures (

	@SerializedName("small") val small : String?,
	@SerializedName("thumbnail") val thumbnail : String?,
	@SerializedName("medium_mobile") val medium_mobile : String?,
	@SerializedName("medium") val medium : String?,
	@SerializedName("large") val large : String?,
	@SerializedName("320wx320h") val small320wx320h : String?,
	@SerializedName("extra_large") val extra_large : String?,
	@SerializedName("640wx640h") val small640wx640h : String?
)