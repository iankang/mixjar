package com.mixsteroids.mixjar.models

data class FollowResponse(
    val result: Result?
){
    constructor(followResponse: FollowResponse?):this(
        followResponse?.result
    )
}

data class Result(
    val message: String?,
    val success: Boolean?
)