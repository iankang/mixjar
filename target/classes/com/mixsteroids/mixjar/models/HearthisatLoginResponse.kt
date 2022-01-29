package com.mixsteroids.mixjar.models


import com.google.gson.annotations.SerializedName

data class HearthisatLoginResponse(
    @SerializedName("allow_push")
    var allowPush: Int,
    @SerializedName("avatar_url")
    var avatarUrl: String,
    @SerializedName("background_url")
    var backgroundUrl: String,
    @SerializedName("caption")
    var caption: String,
    @SerializedName("description")
    var description: String,
    @SerializedName("email")
    var email: String,
    @SerializedName("followers_count")
    var followersCount: String,
    @SerializedName("following")
    var following: Boolean,
    @SerializedName("following_count")
    var followingCount: String,
    @SerializedName("geo")
    var geo: String,
    @SerializedName("id")
    var id: String,
    @SerializedName("key")
    var key: String,
    @SerializedName("likes_count")
    var likesCount: String,
    @SerializedName("locale")
    var locale: String,
    @SerializedName("720p_url")
    var pUrl: String,
    @SerializedName("permalink")
    var permalink: String,
    @SerializedName("permalink_url")
    var permalinkUrl: String,
    @SerializedName("playlist_count")
    var playlistCount: String,
    @SerializedName("premium")
    var premium: Boolean,
    @SerializedName("secret")
    var secret: String,
    @SerializedName("thumb_url")
    var thumbUrl: String,
    @SerializedName("track_count")
    var trackCount: String,
    @SerializedName("uri")
    var uri: String,
    @SerializedName("username")
    var username: String
)