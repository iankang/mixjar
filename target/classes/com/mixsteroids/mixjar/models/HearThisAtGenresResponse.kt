package com.mixsteroids.mixjar.models

class HearThisAtGenresResponse : ArrayList<HearThisAtGenresItem>()

data class HearThisAtGenresItem(
    val api_url: String,
    val id: String,
    val name: String,
    val url: String
)