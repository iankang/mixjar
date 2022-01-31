package com.mixsteroids.mixjar.models


import com.google.gson.annotations.SerializedName

data class SingleTrackResponse(
    @SerializedName("artwork_url")
    var artworkUrl: String?,
    @SerializedName("artwork_url_retina")
    var artworkUrlRetina: String?,
    @SerializedName("background_url")
    var backgroundUrl: String?,
    @SerializedName("bpm")
    var bpm: String?,
    @SerializedName("comment_count")
    var commentCount: String?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("description")
    var description: String?,
    @SerializedName("download_count")
    var downloadCount: String?,
    @SerializedName("download_filename")
    var downloadFilename: String?,
    @SerializedName("download_url")
    var downloadUrl: String?,
    @SerializedName("downloadable")
    var downloadable: Int?,
    @SerializedName("duration")
    var duration: String?,
    @SerializedName("fan_exclusive_download")
    var fanExclusiveDownload: Int?,
    @SerializedName("fan_exclusive_play")
    var fanExclusivePlay: Int?,
    @SerializedName("favorited")
    var favorited: Boolean?,
    @SerializedName("favoritings_count")
    var favoritingsCount: String?,
    @SerializedName("genre")
    var genre: String?,
    @SerializedName("genre_slush")
    var genreSlush: String?,
    @SerializedName("geo")
    var geo: String?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("key")
    var key: String?,
    @SerializedName("license")
    var license: String?,
    @SerializedName("liked")
    var liked: Boolean?,
    @SerializedName("permalink")
    var permalink: String?,
    @SerializedName("permalink_url")
    var permalinkUrl: String?,
    @SerializedName("playback_count")
    var playbackCount: String?,
    @SerializedName("played")
    var played: Boolean?,
    @SerializedName("preview_url")
    var previewUrl: String?,
    @SerializedName("private")
    var `private`: String?,
    @SerializedName("release_date")
    var releaseDate: String?,
    @SerializedName("release_timestamp")
    var releaseTimestamp: Int?,
    @SerializedName("reshared")
    var reshared: Boolean?,
    @SerializedName("reshares_count")
    var resharesCount: String?,
    @SerializedName("stream_url")
    var streamUrl: String?,
    @SerializedName("taged_artists")
    var tagedArtists: String?,
    @SerializedName("tags")
    var tags: String?,
    @SerializedName("thumb")
    var thumb: String?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("type")
    var type: String?,
    @SerializedName("uri")
    var uri: String?,
    @SerializedName("user")
    var user: HearthisAtUser?,
    @SerializedName("user_id")
    var userId: String?,
    @SerializedName("version")
    var version: String?,
    @SerializedName("waveform_data")
    var waveformData: String?,
    @SerializedName("waveform_url")
    var waveformUrl: String?
){
    constructor():this(null,null,null,null,null,null,null,null,null,null,
    null,null,null,null,null,null,null,null,null,null,null,null,
    null,null,null,null,null,null,null,null,null,null,null,null,null,
    null,null,null,null,null,null,null,null,null,null)
}

//data class HearthisAtUser(
//    @SerializedName("avatar_url")
//    var avatarUrl: String?,
//    @SerializedName("caption")
//    var caption: String?,
//    @SerializedName("id")
//    var id: String?,
//    @SerializedName("permalink")
//    var permalink: String?,
//    @SerializedName("permalink_url")
//    var permalinkUrl: String?,
//    @SerializedName("uri")
//    var uri: String?,
//    @SerializedName("username")
//    var username: String
//)