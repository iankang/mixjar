package com.mixsteroids.mixjar.models

data class FavoritingResponse(
    val result: ListenLaterResult?
){
    constructor(followResponse: FavoritingResponse?):this(
        followResponse?.result
    )

    constructor():this(followResponse = null)
}

data class FavoritingResult(
    val message: String?,
    val success: Boolean?
)