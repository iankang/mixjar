package com.mixsteroids.mixjar.models


import com.google.gson.annotations.SerializedName

data class ShowResponse(

    @SerializedName("key") val key: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("tags") val tags: List<ShowResponseTags?>?,
    @SerializedName("created_time") val created_time: String?,
    @SerializedName("updated_time") val updated_time: String?,
    @SerializedName("play_count") val play_count: Int?,
    @SerializedName("favorite_count") val favorite_count: Int?,
    @SerializedName("comment_count") val comment_count: Int?,
    @SerializedName("listener_count") val listener_count: Int?,
    @SerializedName("repost_count") val repost_count: Int?,
    @SerializedName("pictures") val pictures: ShowResponsePictures?,
    @SerializedName("slug") val slug: String?,
    @SerializedName("user") val user: ShowResponseUser?,
    @SerializedName("is_exclusive") val is_exclusive: Boolean? = false,
    @SerializedName("audio_length") val audio_length: Int?,
    @SerializedName("description") val description: String?,
    @SerializedName("sections") val sections: List<String?>?,
    @SerializedName("picture_primary_color") val picture_primary_color: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("metadata") val metadata: ShowResponseMetadata?
) {
    constructor(showResponse: ShowResponse?) : this(
        showResponse?.key,
        showResponse?.url,
        showResponse?.name,
        showResponse?.tags,
        showResponse?.created_time,
        showResponse?.updated_time,
        showResponse?.play_count,
        showResponse?.favorite_count,
        showResponse?.comment_count,
        showResponse?.listener_count,
        showResponse?.repost_count,
        showResponse?.pictures,
        showResponse?.slug,
        showResponse?.user,
        showResponse?.is_exclusive ?: false,
        showResponse?.audio_length,
        showResponse?.description,
        showResponse?.sections,
        showResponse?.picture_primary_color,
        showResponse?.type,
        showResponse?.metadata
    )

    constructor() : this(
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )
}

data class ShowResponseConnections(
    @SerializedName("favorites") val favorites: String?,
    @SerializedName("listeners") val listeners: String?,
    @SerializedName("comments") val comments: String?,
    @SerializedName("similar") val similar: String?
)

data class ShowResponseMetadata(

    @SerializedName("connections") val connections: ShowResponseConnections?
)

data class ShowResponsePictures(

    @SerializedName("small") val small: String?,
    @SerializedName("thumbnail") val thumbnail: String?,
    @SerializedName("medium_mobile") val medium_mobile: String?,
    @SerializedName("medium") val medium: String?,
    @SerializedName("large") val large: String?,
    @SerializedName("320wx320h") val small_320: String?,
    @SerializedName("extra_large") val extra_large: String?,
    @SerializedName("640wx640h") val large_640: String?
)

data class ShowResponseTags(

    @SerializedName("key") val key: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("type") val type: String?
)

data class ShowResponseUser(

    @SerializedName("key") val key: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("username") val username: String?,
    @SerializedName("pictures") val pictures: ShowResponsePictures?,
    @SerializedName("type") val type: String?
)