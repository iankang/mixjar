package com.mixsteroids.mixjar.models

data class SearchCloudcastResponse(
    var data: List<Data>? = null,
    var paging: Paging? = null
)

data class Data(
    var audioLength: Int? = null,
    var commentCount: Int? = null,
    var createdTime: String? = null,
    var favoriteCount: Int? = null,
    var key: String? = null,
    var listenerCount: Int? = null,
    var name: String? = null,
    var pictures: Pictures? = null,
    var playCount: Int? = null,
    var repostCount: Int? = null,
    var slug: String? = null,
    var tags: List<Tag>? = null,
    var updatedTime: String? = null,
    var url: String? = null,
    var user: User? = null
)

data class Paging(
    var next: String? = null
)

data class Pictures(
    var `1024wx1024h`: String? = null,
    var `320wx320h`: String? = null,
    var `640wx640h`: String? = null,
    var `768wx768h`: String? = null,
    var extraLarge: String? = null,
    var large: String? = null,
    var medium: String? = null,
    var mediumMobile: String? = null,
    var small: String? = null,
    var thumbnail: String? = null
)

data class PicturesX(
    var `320wx320h`: String? = null,
    var `640wx640h`: String? = null,
    var extraLarge: String? = null,
    var large: String? = null,
    var medium: String? = null,
    var mediumMobile: String? = null,
    var small: String? = null,
    var thumbnail: String? = null
)

data class Tag(
    var key: String? = null,
    var name: String? = null,
    var url: String? = null
)

data class User(
    var key: String? = null,
    var name: String? = null,
    var pictures: PicturesX? = null,
    var url: String? = null,
    var username: String? = null
)