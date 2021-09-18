package com.mixsteroids.mixjar.models
import com.google.gson.annotations.SerializedName


data class UserResponse (

	@SerializedName("key") val key : String,
	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("username") val username : String,
	@SerializedName("pictures") val pictures : UserResponsePictures,
	@SerializedName("biog") val biog : String,
	@SerializedName("created_time") val created_time : String,
	@SerializedName("updated_time") val updated_time : String,
	@SerializedName("follower_count") val follower_count : Int,
	@SerializedName("following_count") val following_count : Int,
	@SerializedName("cloudcast_count") val cloudcast_count : Int,
	@SerializedName("favorite_count") val favorite_count : Int,
	@SerializedName("listen_count") val listen_count : Int,
	@SerializedName("is_pro") val is_pro : Boolean,
	@SerializedName("is_premium") val is_premium : Boolean,
	@SerializedName("city") val city : String,
	@SerializedName("country") val country : String,
	@SerializedName("cover_pictures") val cover_pictures : UserResponseCoverPictures,
	@SerializedName("picture_primary_color") val picture_primary_color : Int,
	@SerializedName("type") val type : String,
	@SerializedName("metadata") val metadata : UserResponseMetadata
)

data class UserResponsePictures (

	@SerializedName("small") val small : String,
	@SerializedName("thumbnail") val thumbnail : String,
	@SerializedName("medium_mobile") val medium_mobile : String,
	@SerializedName("medium") val medium : String,
	@SerializedName("large") val large : String,
	@SerializedName("320wx320h") val small320wx320h : String,
	@SerializedName("extra_large") val extra_large : String,
	@SerializedName("640wx640h") val medium640wx640h : String
)

data class UserResponseMetadata (

	@SerializedName("connections") val connections : UserResponseConnections
)

data class UserResponseCoverPictures (

	@SerializedName("835wx120h") val small835wx120h : String,
	@SerializedName("1113wx160h") val medium1113wx160h : String,
	@SerializedName("1670wx240h") val big1670wx240h : String
)

data class UserResponseConnections (

	@SerializedName("cloudcasts") val cloudcasts : String,
	@SerializedName("comments") val comments : String,
	@SerializedName("favorites") val favorites : String,
	@SerializedName("feed") val feed : String,
	@SerializedName("followers") val followers : String,
	@SerializedName("following") val following : String,
	@SerializedName("listens") val listens : String,
	@SerializedName("playlists") val playlists : String
)