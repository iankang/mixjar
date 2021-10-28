package com.mixsteroids.mixjar.services

import com.mixsteroids.mixjar.models.UserResponse
import io.reactivex.Single
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun <T : Any?> executeRequest(call: Call<T>): T? {
    var item: ItemData<T>? = null
    call.enqueue(object : Callback<T> {
        override fun onResponse(call: Call<T>, response: Response<T>) {
            if (response.isSuccessful) {
                item = ItemData(response.body())
                println(response.body())

            } else {
                println("Something went wrong with code: ${response.code()}")
            }
        }

        override fun onFailure(call: Call<T>, th: Throwable) {
            th.printStackTrace()
        }
    })
    return item?.t
}





fun getOffsetFromPage(page: Int): Int? {
    if (page >= 0 && page <= Int.MAX_VALUE) {
        return page.times(20)
    }
    return null
}

data class ItemData<T>(
    val t: T?,
)