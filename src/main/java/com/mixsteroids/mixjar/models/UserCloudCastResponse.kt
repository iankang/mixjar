package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName

data class UserCloudCastResponse (

	@SerializedName("data") val data : List<UserCloudCastResponseData?>?,
	@SerializedName("paging") val paging : UserCloudCastResponsePaging?,
	@SerializedName("name") val name : String?
){
	constructor(userCloudCastResponse: UserCloudCastResponse?):this(
		userCloudCastResponse?.data,
		userCloudCastResponse?.paging,
		userCloudCastResponse?.name
	)
	constructor():this(userCloudCastResponse = null)
}

data class UserCloudCastResponseUser (

	@SerializedName("key") val key : String?,
	@SerializedName("url") val url : String?,
	@SerializedName("name") val name : String?,
	@SerializedName("username") val username : String?,
	@SerializedName("pictures") val pictures : UserCloudCastResponsePictures?
)


data class UserCloudCastResponseTags (

	@SerializedName("key") val key : String?,
	@SerializedName("url") val url : String?,
	@SerializedName("name") val name : String?
)

data class UserCloudCastResponsePictures (

	@SerializedName("small") val small : String?,
	@SerializedName("thumbnail") val thumbnail : String?,
	@SerializedName("medium_mobile") val medium_mobile : String?,
	@SerializedName("medium") val medium : String?,
	@SerializedName("large") val large : String?,
	@SerializedName("320wx320h") val small320wx320h : String?,
	@SerializedName("extra_large") val extra_large : String?,
	@SerializedName("640wx640h") val small640wx640h : String?
)

data class UserCloudCastResponsePaging (

	@SerializedName("next") val next : String?,
	@SerializedName("previous") val previous : String?
)


data class UserCloudCastResponseData (

	@SerializedName("key") val key : String?,
	@SerializedName("url") val url : String?,
	@SerializedName("name") val name : String?,
	@SerializedName("tags") val tags : List<UserCloudCastResponseTags>?,
	@SerializedName("created_time") val created_time : String?,
	@SerializedName("updated_time") val updated_time : String?,
	@SerializedName("play_count") val play_count : Int?,
	@SerializedName("favorite_count") val favorite_count : Int?,
	@SerializedName("comment_count") val comment_count : Int?,
	@SerializedName("listener_count") val listener_count : Int?,
	@SerializedName("repost_count") val repost_count : Int?,
	@SerializedName("pictures") val pictures : UserCloudCastResponsePictures?,
	@SerializedName("slug") val slug : String?,
	@SerializedName("user") val user : UserCloudCastResponseUser?,
	@SerializedName("audio_length") val audio_length : Int?
)