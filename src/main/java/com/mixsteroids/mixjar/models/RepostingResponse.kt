package com.mixsteroids.mixjar.models

data class RepostingResponse(
    val result: ListenLaterResult?
){
    constructor(repostingResponse: RepostingResponse?):this(
        repostingResponse?.result
    )

    constructor():this(repostingResponse = null)
}

data class RepostingResult(
    val message: String?,
    val success: Boolean?
)