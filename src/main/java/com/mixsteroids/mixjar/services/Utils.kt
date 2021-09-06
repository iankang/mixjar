package com.mixsteroids.mixjar.services

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

 fun <T : Any?> executeRequest(call: Call<T>):T?{
    var item : T? = null
    call.enqueue(object : Callback<T>{
        override fun onResponse(call: Call<T>, response: Response<T>) {
            if(response.isSuccessful){
                item = response.body()
                println(response)
            }
            else{
                println("Something went wrong with code: ${response.code()}")
            }
        }

        override fun onFailure(call: Call<T>, th: Throwable) {
            th.printStackTrace()
        }
    })
     return item
}