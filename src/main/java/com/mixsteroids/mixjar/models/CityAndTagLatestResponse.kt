package com.mixsteroids.mixjar.models

import com.google.gson.annotations.SerializedName

data class CityAndTagLatestResponse(

    @SerializedName("data") val data: List<CityAndTagLatestResponseData?>?,
    @SerializedName("paging") val paging: CityAndTagLatestResponsePaging?
) {
    constructor(cityAndTagLatestResponse: CityAndTagLatestResponse?) : this(
        cityAndTagLatestResponse?.data, cityAndTagLatestResponse?.paging
    )

    constructor() : this(cityAndTagLatestResponse = CityAndTagLatestResponse(null, null))
}

data class CityAndTagLatestResponseData(

    @SerializedName("key") val key: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("tags") val tags: List<CityAndTagLatestResponseTags?>,
    @SerializedName("created_time") val created_time: String?,
    @SerializedName("updated_time") val updated_time: String?,
    @SerializedName("play_count") val play_count: Int?,
    @SerializedName("favorite_count") val favorite_count: Int?,
    @SerializedName("comment_count") val comment_count: Int?,
    @SerializedName("listener_count") val listener_count: Int?,
    @SerializedName("repost_count") val repost_count: Int?,
    @SerializedName("pictures") val pictures: CityAndTagLatestResponsePictures?,
    @SerializedName("slug") val slug: String?,
    @SerializedName("user") val user: CityAndTagLatestResponseUser?,
    @SerializedName("audio_length") val audio_length: Int?
)

data class CityAndTagLatestResponsePaging(

    @SerializedName("next") val next: String?, @SerializedName("previous") val previous: String?
)

data class CityAndTagLatestResponsePictures(

    @SerializedName("small") val small: String?,
    @SerializedName("thumbnail") val thumbnail: String?,
    @SerializedName("medium_mobile") val medium_mobile: String?,
    @SerializedName("medium") val medium: String?,
    @SerializedName("large") val large: String?,
    @SerializedName("320wx320h") val picture320wx320h: String?,
    @SerializedName("extra_large") val extra_large: String?,
    @SerializedName("640wx640h") val picture640wx640h: String?
)

data class CityAndTagLatestResponseTags(

    @SerializedName("key") val key: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("name") val name: String?
)

data class CityAndTagLatestResponseUser(

    @SerializedName("key") val key: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("username") val username: String?,
    @SerializedName("pictures") val pictures: CityAndTagLatestResponsePictures?
)