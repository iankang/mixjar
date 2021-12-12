package com.mixsteroids.mixjar.models


import com.google.gson.annotations.SerializedName

class SinglePlaylist : ArrayList<SinglePlaylistItem>()

data class SinglePlaylistItem(
    @SerializedName("artwork_url")
    var artworkUrl: String,
    @SerializedName("description")
    var description: String,
    @SerializedName("id")
    var id: String,
    @SerializedName("permalink")
    var permalink: String,
    @SerializedName("permalink_url")
    var permalinkUrl: String,
    @SerializedName("privat")
    var privat: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("track_count")
    var trackCount: Int,
    @SerializedName("uri")
    var uri: String,
    @SerializedName("user")
    var user: UserX,
    @SerializedName("user_id")
    var userId: String
)
data class UserX(
    @SerializedName("avatar_url")
    var avatarUrl: String,
    @SerializedName("id")
    var id: String,
    @SerializedName("permalink")
    var permalink: String,
    @SerializedName("permalink_url")
    var permalinkUrl: String,
    @SerializedName("uri")
    var uri: String,
    @SerializedName("username")
    var username: String
)