package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName

data class UserFeedResponse (

        @SerializedName("data") var data : List<UserFeedData>,
        @SerializedName("paging") var paging : UserFeedPaging,
        @SerializedName("name") var name : String

    )

data class UserFeedPictures (

    @SerializedName("small") var small : String,
    @SerializedName("thumbnail") var thumbnail : String,
    @SerializedName("medium_mobile") var mediumMobile : String,
    @SerializedName("medium") var medium : String,
    @SerializedName("large") var large : String,
    @SerializedName("320wx320h") var small320wx320h : String,
    @SerializedName("extra_large") var extraLarge : String,
    @SerializedName("640wx640h") var small640wx640h : String

)

data class UserFeedCloudcasts (

    @SerializedName("key") val key : String,
    @SerializedName("url") val url : String,
    @SerializedName("name") val name : String,
    @SerializedName("tags") val tags : List<UserFeedTags>,
    @SerializedName("created_time") val created_time : String,
    @SerializedName("updated_time") val updated_time : String,
    @SerializedName("play_count") val play_count : Int,
    @SerializedName("favorite_count") val favorite_count : Int,
    @SerializedName("comment_count") val comment_count : Int,
    @SerializedName("listener_count") val listener_count : Int,
    @SerializedName("repost_count") val repost_count : Int,
    @SerializedName("pictures") val pictures : UserFeedPictures,
    @SerializedName("slug") val slug : String,
    @SerializedName("user") val user : UserFeedUser,
    @SerializedName("audio_length") val audio_length : Int
)

data class UserFeedData (

    @SerializedName("key") val key : String,
    @SerializedName("url") val url : String,
    @SerializedName("from") val from : UserFeedFrom,
    @SerializedName("type") val type : String,
    @SerializedName("created_time") val created_time : String,
    @SerializedName("cloudcasts") val cloudcasts : List<UserFeedCloudcasts>,
    @SerializedName("title") val title : String
)

data class UserFeedFrom (

    @SerializedName("key") val key : String,
    @SerializedName("url") val url : String,
    @SerializedName("name") val name : String,
    @SerializedName("username") val username : String,
    @SerializedName("pictures") val pictures : UserFeedPictures
)

data class UserFeedPaging (

    @SerializedName("next") val next : String,
    @SerializedName("previous") val previous : String
)

data class UserFeedTags (

    @SerializedName("key") val key : String,
    @SerializedName("url") val url : String,
    @SerializedName("name") val name : String
)

data class UserFeedUser (

    @SerializedName("key") val key : String,
    @SerializedName("url") val url : String,
    @SerializedName("name") val name : String,
    @SerializedName("username") val username : String,
    @SerializedName("pictures") val pictures : UserFeedPictures
)
