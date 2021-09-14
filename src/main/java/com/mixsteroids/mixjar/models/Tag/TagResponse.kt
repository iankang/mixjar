package com.mixsteroids.mixjar.models.Tag

import com.google.gson.annotations.SerializedName

data class Tag (
    @SerializedName("key") val key : String,
    @SerializedName("url") val url : String,
    @SerializedName("name") val name : String
)
