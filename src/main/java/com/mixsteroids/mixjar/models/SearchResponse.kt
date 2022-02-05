package com.mixsteroids.mixjar.models

data class SearchResponse(
    var data: List<Data>? = null,
    var paging: Paging? = null
){
    constructor(searchCloudcastResponse: SearchResponse?):this(
        searchCloudcastResponse?.data,
        searchCloudcastResponse?.paging
    )

    constructor():this(searchCloudcastResponse = SearchResponse(null,null))
}

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
){
    constructor(data: Data?):this(
        data?.audioLength,
        data?.commentCount,
        data?.createdTime,
        data?.favoriteCount,
        data?.key,
        data?.listenerCount,
        data?.name,
        data?.pictures,
        data?.playCount,
        data?.repostCount,
        data?.slug,
        data?.tags,
        data?.updatedTime,
        data?.url,
        data?.user
    )
}

data class Paging(
    var next: String? = null
){
    constructor(paging: Paging?):this(
        paging?.next
    )
}

data class Pictures(
    var extraLarge: String? = null,
    var large: String? = null,
    var medium: String? = null,
    var mediumMobile: String? = null,
    var small: String? = null,
    var thumbnail: String? = null
){
    constructor(pictures: Pictures?):this(
        pictures?.extraLarge,
        pictures?.large,
        pictures?.medium,
        pictures?.mediumMobile,
        pictures?.small,
        pictures?.thumbnail
    )
}

data class PicturesX(
    var extraLarge: String? = null,
    var large: String? = null,
    var medium: String? = null,
    var mediumMobile: String? = null,
    var small: String? = null,
    var thumbnail: String? = null
){
    constructor(pictures: PicturesX?):this(
        pictures?.extraLarge,
        pictures?.large,
        pictures?.medium,
        pictures?.mediumMobile,
        pictures?.small,
        pictures?.thumbnail
    )
}

data class Tag(
    var key: String? = null,
    var name: String? = null,
    var url: String? = null
){
    constructor(tag: Tag?):this(
        tag?.key,
        tag?.name,
        tag?.url
    )
}

data class User(
    var key: String? = null,
    var name: String? = null,
    var pictures: PicturesX? = null,
    var url: String? = null,
    var username: String? = null
){
    constructor(user: User?):this(
        user?.key,
        user?.name,
        user?.pictures,
        user?.url,
        user?.username
    )
}