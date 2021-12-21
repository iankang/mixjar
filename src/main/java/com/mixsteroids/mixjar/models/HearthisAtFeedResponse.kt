package com.mixsteroids.mixjar.models

class HearthisAtFeedResponse : ArrayList<HearthisAtFeedResponseItem>()


data class HearthisAtFeedResponseItem(
    val artwork_url: String,
    val background_url: String,
    val comment_count: String,
    val created_at: String,
    val description: String,
    val download_count: String,
    val download_url: String,
    val downloadable: String,
    val duration: String,
    val favorited: Boolean,
    val favoritings_count: String,
    val genre: String,
    val genre_slush: String,
    val id: String,
    val permalink: String,
    val permalink_url: String,
    val playback_count: String,
    val stream_url: String,
    val title: String,
    val uri: String,
    val user: HearthisAtUser,
    val user_id: String,
    val waveform_data: String,
    val waveform_url: String
){

}

data class HearthisAtUser(
    val avatar_url: String,
    val id: String,
    val permalink: String,
    val permalink_url: String,
    val uri: String,
    val username: String
)