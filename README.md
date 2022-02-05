# mixjar
This is an unofficial [Mixcloud Developer API](https://www.mixcloud.com/developers/) wrapper developed in kotlin for 
the purpose of easily consuming the API for use in JVM environments.

#Usage

Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
        ...
        maven { url 'https://jitpack.io' }
        }
    }

Add the dependency

	dependencies {
	        implementation 'com.github.iankang:mixjar:1.1.0'
	}

### Implementation Example

    val mixCloudServiceImpl = MixCloud()
    val item =  mixCloudServiceImpl.getUser("DjChief254")
    //you can now use your fresh item object 

## Language Used:
    * Kotlin

## Libraries Used.
These are the libraries used in the development of this wrapper.
Order does not denote significance.

1. [gson](https://github.com/google/gson)
2. [okhttp](https://square.github.io/okhttp/)
3. [retrofit](https://square.github.io/retrofit/)
4. [io.rest-assured](https://rest-assured.io/)

---

### Documentation


<details>
<summary>MixCloud</summary>
<br>
Below are the implemented functions for the mixcloud api.
<br><br>

#### `fun search(searchString: String?, type: String?, page: Int): SearchResponse?`

search the mixcloud api

* **Parameters:**
    * `searchString` — the search item
    * `type` — the type of item being searched could be cloudcast, upload, user or tag
    * `page` — this is the offset for paging. it starts at 0.
* **Returns:** SearchResponse
* **See also:** SearchResponse

#### `fun getShow(entertainer: String, show: String): ShowResponse?`

gets a specific shoe.

* **Parameters:**
    * `entertainer` — name of the entertainer
    * `show` — get the name of the specific show you need
    * `page` — the page offset value.
* **Returns:** ShowResponse
* **See also:** ShowResponse

#### `fun getShowFavorites(entertainer: String, show: String, page: Int): ShowFavoritesResponse?`

get favorited shows

* **Parameters:**
    * `entertainer` — the name of the entertainer.
    * `show` — the name of the show
    * `page` — the integer offset of the page.
* **Returns:** ShowFavoriteResponse
* **See also:** ShowFavoritesResponse

#### `fun getShowFavorites(entertainer: String, show: String, limit: Int, page: Int): ShowFavoritesResponse?`

get favorited shows with variable limit

* **Parameters:**
    * `entertainer` — the name of the entertainer.
    * `show` — the name of the show
    * `limit` — the number of items to load.
    * `page` — the integer offset of the page.
* **Returns:** ShowFavoriteResponse
* **See also:** ShowFavoritesResponse

#### `fun getShowListeners(entertainer: String, show: String, page: Int): ShowListenersResponse?`

Gets listeners of a show

* **Parameters:**
    * `entertainer` — the name of the entertainer
    * `show` — the name of the specific show
    * `page` — the page to load
* **Returns:** ShowListenersResponse
* **See also:** ShowListenersResponse

#### `fun getShowListeners(entertainer: String, show: String, limit: Int, page: Int): ShowListenersResponse?`

Gets listeners of a show with variable limit

* **Parameters:**
    * `entertainer` — the name of the entertainer
    * `show` — the name of the specific show
    * `limit` — the number of posts to load
    * `page` — the page to load
* **Returns:** ShowListenersResponse
* **See also:** ShowListenersResponse

#### `fun getShowComments(entertainer: String, show: String, page: Int): ShowCommentsResponse?`

Gets a show's comments

* **Parameters:**
    * `entertainer` — name of the entertainer.
    * `show` — name of the show.
    * `page` — the page to load.
* **Returns:** ShowCommentsResponse
* **See also:** ShowCommentsResponse

#### `fun getShowComments(entertainer: String, show: String, limit: Int, page: Int): ShowCommentsResponse?`

Gets a show's comments

* **Parameters:**
    * `entertainer` — name of the entertainer.
    * `show` — name of the show.
    * `limit` — the variable number of shows to load.
    * `page` — the page to load.
* **Returns:** ShowCommentsResponse
* **See also:** ShowCommentsResponse

#### `fun getShowSimilar(entertainer: String, show: String, limit: Int, page: Int): ShowSimilarResponse?`

Gets similar shows to the provided show

* **Parameters:**
    * `entertainer` — the name of the entertainer.
    * `show` — the name of the show.
    * `limit` — the number of posts to load.
    * `page` — the page number to load.
* **Returns:** ShowSimilarResponse
* **See also:** ShowSimilarResponse

#### `fun getShowSimilar(entertainer: String, show: String, page: Int): ShowSimilarResponse?`

Gets similar shows to the provided show

* **Parameters:**
    * `entertainer` — the name of the entertainer.
    * `show` — the name of the show.
    * `page` — the page number to load.
* **Returns:** ShowSimilarResponse
* **See also:** ShowSimilarResponse

#### `fun getUser(username: String): UserResponse?`

gets user info

* **Parameters:** `username` — the username of the user you want details of
* **Returns:** UserResponse
* **See also:** UserResponse

#### `fun getUserCloudCast(username: String, limit: Int, page: Int): UserCloudCastResponse?`

gets users uploaded cloudcasts

* **Parameters:**
    * `username` — name of the person who uploaded the cloudcast
    * `limit` — the number of posts to load.
    * `page` — the page number to load.
* **Returns:** UserCloudCastResponse.
* **See also:** UserCloudCastResponse

#### `fun getUserCloudCast(username: String, page: Int): UserCloudCastResponse?`

gets users uploaded cloudcasts

* **Parameters:**
    * `username` — name of the person who uploaded the cloudcast
    * `page` — the page number to load.
* **Returns:** UserCloudCastResponse.
* **See also:** UserCloudCastResponse

#### `fun getUserComments(username: String, limit: Int, page: Int): UserCommentsResponse?`

gets comments made by user

* **Parameters:**
    * `username` — username of user
    * `limit` — number of posts to load
    * `page` — page to load
* **Returns:** UserCommentsResponse
* **See also:** UserCommentsResponse

#### `fun getUserComments(username: String, page: Int): UserCommentsResponse?`

gets comments made by user

* **Parameters:**
    * `username` — username of user
    * `page` — page to load
* **Returns:** UserCommentsResponse
* **See also:** UserCommentsResponse

#### `fun getUserFavorites(username: String, limit: Int, page: Int): UserFavoritesResponse?`

gets users liked shows.

* **Parameters:**
    * `username` —
    * `limit` — number of posts to load
    * `page` — page of post to load
* **Returns:** UserFavoritesResponse
* **See also:** UserFavoritesResponse

#### `fun getUserFavorites(username: String, page: Int): UserFavoritesResponse?`

gets users liked shows.

* **Parameters:**
    * `username` —
    * `page` — page of post to load
* **Returns:** UserFavoritesResponse
* **See also:** UserFavoritesResponse

#### `fun getUserFeed(username: String, limit: Int, page: Int): UserFeedResponse?`

gets user's feed

* **Parameters:**
    * `username` —
    * `limit` — number of items to load
    * `page` — page of posts to load.
* **Returns:** UserFeedResponse
* **See also:** UserFeedResponse

#### `fun getUserFeed(username: String, page: Int): UserFeedResponse?`

gets user's feed

* **Parameters:**
    * `username` —
    * `limit` — number of items to load
    * `page` — page of posts to load.
* **Returns:** UserFeedResponse
* **See also:** UserFeedResponse

#### `fun getUserFollowers(username: String, limit: Int, page: Int): UserFollowersResponse?`

gets user's followers

* **Parameters:**
    * `username` —
    * `limit` — no. of posts to load
    * `page` — page of posts to load.
* **Returns:** UserFollowersResponse
* **See also:** UserFollowersResponse

#### `fun getUserFollowers(username: String, page: Int): UserFollowersResponse?`

gets user's followers

* **Parameters:**
    * `username` —
    * `page` — page of posts to load.
* **Returns:** UserFollowersResponse
* **See also:** UserFollowersResponse

#### `fun getUserFollowing(username: String, limit: Int, page: Int): UserFollowingResponse?`

gets users following this user.

* **Parameters:**
    * `username` —
    * `limit` — no. of posts
    * `page` — page of posts to load.
* **Returns:** UserFollowingResponse
* **See also:** UserFollowingResponse

#### `fun getUserFollowing(username: String, page: Int): UserFollowingResponse?`

gets users following this user.

* **Parameters:**
    * `username` —
    * `page` — page of posts to load.
* **Returns:** UserFollowingResponse
* **See also:** UserFollowingResponse

#### `fun getUserListens(username: String, limit: Int, page: Int): UserListensResponse?`

gets user's listened items

* **Parameters:**
    * `username` —
    * `limit` — no. of posts loaded
    * `page` — no of page to load
* **Returns:** UserListensResponse
* **See also:** UserListensResponse

#### `fun getUserListens(username: String, page: Int): UserListensResponse?`

gets user's listened items

* **Parameters:**
    * `username` —
    * `page` — no of page to load
* **Returns:** UserListensResponse
* **See also:** UserListensResponse

#### `fun getUserPlaylists(username: String, limit: Int, page: Int): UserPlaylistsResponse?`

gets user's playlists

* **Parameters:**
    * `username` —
    * `limit` — no. of posts to load
    * `page` — no. of page to load
* **Returns:** UserPlaylistsResponse
* **See also:** UserPlaylistsResponse

#### `fun getUserPlaylists(username: String, page: Int): UserPlaylistsResponse?`

gets user's playlists

* **Parameters:**
    * `username` —
    * `page` — no. of page to load
* **Returns:** UserPlaylistsResponse
* **See also:** UserPlaylistsResponse

#### `fun getUserPlaylistCloudCasts( username: String, playlistName: String, limit: Int, page: Int ): UserCloudCastResponse?`

gets cloudcasts' in a user's playlists

* **Parameters:**
    * `username` —
    * `limit` — no. of posts to load
    * `page` — no. of page to load
* **Returns:** UserPlaylistsResponse
* **See also:** UserPlaylistsResponse

#### `fun getUserPlaylistCloudCasts(username: String, playlistName: String, page: Int): UserCloudCastResponse?`

gets cloudcasts' in a user's playlists

* **Parameters:**
    * `username` —
    * `page` — no. of page to load
* **Returns:** UserPlaylistsResponse
* **See also:** UserPlaylistsResponse

#### `fun getTag(tag: String): TagResponse?`

get's tags

* **Parameters:** `tag` — the title of the tag
* **Returns:** TagResponse
* **See also:** TagResponse

#### `fun getPopularTag(tag: String, limit: Int, page: Int): PopularTagResponse?`

gets posts by popular tag

* **Parameters:**
    * `tag` — title of tag
    * `limit` — no of posts to load
    * `page` — page no. of posts to load.
* **Returns:** PopularTagResponse
* **See also:** PopularTagResponse

#### `fun getPopularTag(tag: String, page: Int): PopularTagResponse?`

gets posts by popular tag

* **Parameters:**
    * `tag` — title of tag
    * `page` — page no. of posts to load.
* **Returns:** PopularTagResponse
* **See also:** PopularTagResponse

#### `fun getLatestTag(tag: String, limit: Int, page: Int): LatestTagResponse?`

gets Posts by latest Tags.

* **Parameters:**
    * `tag` —
    * `limit` — no. of posts to load
    * `page` — page no. to load
* **Returns:** LatestTagResponse
* **See also:** LatestTagResponse

#### `fun getLatestTag(tag: String, page: Int): LatestTagResponse?`

gets Posts by latest Tags.

* **Parameters:**
    * `tag` —
    * `page` — page no. to load
* **Returns:** LatestTagResponse
* **See also:** LatestTagResponse

#### `fun getCity(city: String): CityResponse?`

gets posts by city.

* **Parameters:** `city` — name of city
* **Returns:** CityResponse
* **See also:** CityResponse

#### `fun getTagAndCity(tag: String, city: String): TagAndCityResponse?`

gets posts by both tag and city

* **Parameters:**
    * `tag` — title of tag
    * `city` — name of city
* **Returns:** TagAndCityResponse
* **See also:** TagAndCityResponse

#### `fun getTagAndCityPopular(tag: String, city: String, limit: Int, page: Int): CityAndTagPopularResponse?`

gets popular posts by tag and city

* **Parameters:**
    * `tag` — title of tag
    * `limit` — no of posts to load
    * `page` — page no. of posts to load.
* **Returns:** CityAndTagPopularResponse
* **See also:** CityAndTagPopularResponse

#### `fun getTagAndCityPopular(tag: String, city: String, page: Int): CityAndTagPopularResponse?`

gets popular posts by tag and city

* **Parameters:**
    * `tag` — title of tag
    * `page` — page no. of posts to load.
* **Returns:** CityAndTagPopularResponse
* **See also:** CityAndTagPopularResponse

#### `fun getTagAndCityLatest(tag: String, city: String, limit: Int, page: Int): CityAndTagLatestResponse?`

gets latest posts by both tag and city

* **Parameters:**
    * `tag` — title of tag
    * `city` — name of city
    * `limit` — number of posts to load
    * `page` — page no. of posts to load
* **Returns:** CityAndTagLatestResponse
* **See also:** CityAndTagLatestResponse

#### `fun getTagAndCityLatest(tag: String, city: String, page: Int): CityAndTagLatestResponse?`

gets latest posts by both tag and city

* **Parameters:**
    * `tag` — title of tag
    * `city` — name of city
    * `page` — page no. of posts to load
* **Returns:** CityAndTagLatestResponse
* **See also:** CityAndTagLatestResponse

#### `fun followUser(username: String, accessToken: String): FollowResponse?`

Follows a user

* **Parameters:**
    * `username` — username of person to follow
    * `accessToken` — the authentication access token
* **Returns:** returns FollowResponse
* **See also:** FollowResponse

#### `fun favorite(username: String, show: String, accessToken: String): FavoritingResponse?`

Favorites a cloudcast

* **Parameters:**
    * `username` — username of the person whose cloudcast you want to favorite
    * `show` — name of the show you want to favorite.
    * `accessToken` — the authentication access token
* **Returns:** returns FavoritingResponse
* **See also:** FavoritingResponse

#### `fun repost(username: String, show: String, accessToken: String): RepostingResponse?`

Reposts a cloudcast in your feed

* **Parameters:**
    * `username` — username of the person whose cloudcast you want to reposts
    * `show` — the name of the cloudcast
    * `accessToken` — the authentication access token.
* **Returns:** RepostingResponse
* **See also:** RepostingResponse

#### `fun listenLater(username: String, show: String, accessToken: String): ListenLaterResponse?`

Adds a cloudcast to listen later

* **Parameters:**
    * `username` — username of the person whose cloudcast you want to add to listen later
    * `show` — the name of the show that you want to add to listen later
    * `accessToken` — the authentication access token.
* **Returns:** ListenLaterResponse
* **See also:** ListenLaterResponse
</details>


<details>
<summary>HearThisAt</summary>
<br>
Below are the implemented functions for hearthisat.
<br><br>

###### `fun getFeed( page:Int, count:Int, duration:Int, type:String?, category: String?, showFeedStart:String, showFeedEnd:String ): HearthisAtFeedResponse?`

get the hearthisat feed

* **Parameters:**
    * `page` — page to show
    * `count` — entries per page (max: 20)
    * `duration` — duration (+/- 5 minutes)
    * `type` — empty / popular / new
    * `category` — empty / house / drumandbass / etc. - see genre API
    * `showFeedStart` — 2021-12-05	Start Date
    * `showFeedEnd` — 2021-12-12	End Date
* **Returns:** HearThisAtFeedResponse
* **See also:** HearthisAtFeedResponse

###### `fun getAllGenres(): HearThisAtGenresResponse?`

gets all available genres

* **Returns:** HearThisAtGenresResponse
* **See also:** HearThisAtGenresResponse

###### `fun getGenreList( categoryName:String, page: Int, count:Int, duration: Int? ):GenreList?`

gets tracks based on genres

* **Parameters:**
    * `categoryName` — name of genre
    * `count` — entries per page.
    * `page` — page to show

###### `fun getSingleArtist(artistName:String):SingleArtistResponse?`

gets a single artist

* **Parameters:** `artistName` — name of the artist
* **Returns:** SingleArtistResponse
* **See also:** SingleArtistResponse

###### `fun getArtistsLists( artistName: String, type: String?, page: Int?, count: Int? ):ArtistListResponse?`

gets all artists lists

* **Parameters:**
    * `artistName` — name of the artist
    * `type` — choose list type: likes / playlists / tracks
    * `page` — page to show
    * `count` — entries per page (max: 20)
* **Returns:** ArtistListResponse
* **See also:** ArtistListResponse

###### `fun getSingleTrack( artistName:String, trackName:String ):SingleTrackResponse?`

get single track information

* **Parameters:**
    * `artistName` — name of artist
    * `trackName` — name of track
* **Returns:** SingleTrackResponse
* **See also:** SingleTrackResponse

###### `fun getSinglePlaylist( artistName: String, types: String, page: Int?, count: Int? ):SinglePlaylist?`

get single playlist

* **Parameters:**
    * `artistName` — name of artist
    * `types` — playlists
    * `page` — page to show
    * `count` — entries per page (max: 20)
* **Returns:** SinglePlaylist
* **See also:** SinglePlaylist

###### `fun search( type:String, t:String, page:Int?, count:Int?, duration:Int? ):HearthisAtSearchResponse?`

search hearthisat repo

* **Parameters:**
    * `type` — tracks (or empty) / user / playlists
    * `t` — search query
    * `page` — page to show
    * `count` — entries per page (max: 20)
    * `duration` — duration (+/- 5 minutes)
* **Returns:** HearthisatSearchResponse
* **See also:** HearthisAtSearchResponse

###### `fun login( email:String, password:String ): HearthisatLoginResponse?`

login into hearthisat.

* **Parameters:**
    * `email` — email address to login
    * `password` — password address to login
* **Returns:** HearthisatLoginResponse
* **See also:** HearthisatLoginResponse

</details>

---

## Caveat

This is not yet complete and is not an official MixCloud wrapper.
send your thoughts and suggestions to ianngech@gmail.com

