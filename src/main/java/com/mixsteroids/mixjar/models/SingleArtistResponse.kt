package com.mixsteroids.mixjar.models

data class SingleArtistResponse(
    val avatar_url: String?,
    val background_url: String?,
    val description: String?,
    val followers_count: Int?,
    val following: Boolean?,
    val id: String?,
    val likes_count: Int?,
    val permalink: String?,
    val permalink_url: String?,
    val playlist_count: Int?,
    val track_count: Int?,
    val uri: String?,
    val username: String?
) {
    constructor() : this(
        null, null, null, null, null, null, null, null, null, null, null, null, null
    )
}