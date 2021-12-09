package com.mixsteroids.mixjar.models

data class ListenLaterResponse(
    val result: ListenLaterResult?
){
    constructor(followResponse: ListenLaterResponse?):this(
        followResponse?.result
    )
}

data class ListenLaterResult(
    val message: String?,
    val success: Boolean?
)