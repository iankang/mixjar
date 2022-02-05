package com.mixsteroids.mixjar.models

data class ListenLaterResponse(
    val result: ListenLaterResult?
) {
    constructor(followResponse: ListenLaterResponse?) : this(
        followResponse?.result
    )

    constructor() : this(followResponse = null)
}

data class ListenLaterResult(
    val message: String?, val success: Boolean?
)