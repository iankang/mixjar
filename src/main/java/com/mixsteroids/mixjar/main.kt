package com.mixsteroids.mixjar

fun main() {
    val mixCloudServiceImpl = MixCloud()
    val hearThisAt = HearThisAt()
//    val search = mixCloudServiceImpl.search("mc-fullstop","user",0)
//    println(search)
    //exclusive
//    val item1 = mixCloudServiceImpl.getShow("DJ_Jukess","thehypeaugust-nsg-vs-wstrn-mix-dj_jukess")

    val item1 = mixCloudServiceImpl.getShow("mixmastermorrissdfasdf","mixmaster-morris-steinski-new-york")
//    val item =  mixCloudServiceImpl.getUser("ian-kangethe")
//    println("actualItem: ${item?.toString()}")
    println("getShow: $item1")
//    val item = mixCloudServiceImpl.getUserFeed("ian-kangethe",1)
//    val cloud = mixCloudServiceImpl.getUserCloudCast("The_Fixx",0)
//    println(cloud)
//    mixCloudServiceImpl.getCity("nairobi");
//    mixCloudServiceImpl.getUserFeed("ndungujan23",3)F
//    mixCloudServiceImpl.getUserComments("ndungujan23",0)
//    mixCloudServiceImpl.getUserFollowers("ndungujan23",0)
//    mixCloudServiceImpl.getUserFollowing("ndungujan23",2)
//    mixCloudServiceImpl.getUserListens("ndungujan23",2)
//    mixCloudServiceImpl.getUserPlaylists("ndungujan23",0)
//    val fav = mixCloudServiceImpl.getShowFavorites("spartacus","party-time",8, 0)
//    println(fav)
//    mixCloudServiceImpl.getShowListeners("spartacus","party-time",1)
//    mixCloudServiceImpl.getShowComments("spartacus","party-time",0)
//    mixCloudServiceImpl.getShowSimilar("spartacus","party-time",0)
//    mixCloudServiceImpl.getTag("reggae")
//    mixCloudServiceImpl.getLatestTag("dancehall",0)
//    mixCloudServiceImpl.getPopularTag("dancehall",0)
//    mixCloudServiceImpl.getTagAndCityPopular("dancehall","nairobi",1)
//    mixCloudServiceImpl.getTagAndCityLatest("dancehall","nairobi",1)
//    val follow = mixCloudServiceImpl.followUser("DeejayRigz", "PsPeUhK4H9nKWqm6EFZYzQBzB9KCF2YG")
//    val repost = mixCloudServiceImpl.repost("spartacus","party-time","PsPeUhK4H9nKWqm6EFZYzQBzB9KCF2YG")
//    val listenLater = mixCloudServiceImpl.listenLater("spartacus","party-time","PsPeUhK4H9nKWqm6EFZYzQBzB9KCF2YG")
//    val favorite = mixCloudServiceImpl.favorite("spartacus","party-time","PsPeUhK4H9nKWqm6EFZYzQBzB9KCF2YG")

//    print(favorite)

//    val feed = hearThisAt.getFeed(0,20,10,null,null, "2021-05-05","2021-12-12")
//    val genres = hearThisAt.getAllGenres()
//    println(genres?.size)
//    val genreList = hearThisAt.getGenreList("Acoustic",0,10)
//    println(genreList)
//    val artist = hearThisAt.getSingleArtist("shawne")
//    println(artist)
//    val artistsList = hearThisAt.getArtistsLists("shawne","likes",0,18)
//    println(artistsList)
//    val track = hearThisAt.getSingleTrack("shawne","shawne-back-to-the-roots-2-05072014")
//    println(track)
//    val playlist = hearThisAt.getSinglePlaylist("shawne","playlists",1,5)
//    println(playlist)
//    val search = hearThisAt.search("","ajlfasjdflkas",1, 5,null)
//    println(search)
//    val login = hearThisAt.login("ianngech@yahoo.com","kangethe")
//    println(login)

}
