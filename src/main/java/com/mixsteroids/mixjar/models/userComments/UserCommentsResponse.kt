package com.mixsteroids.mixjar.models.userComments

import com.google.gson.annotations.SerializedName


data class UserCommentsResponse (

	@SerializedName("data") val data : List<Data>,
	@SerializedName("paging") val paging : Paging,
	@SerializedName("name") val name : String
)