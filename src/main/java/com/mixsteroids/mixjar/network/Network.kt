package com.mixsteroids.mixjar.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.mixsteroids.mixjar.utils.Mixcloud.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import java.util.concurrent.TimeUnit

class Network {

    private fun getLoggingInterceptor(): HttpLoggingInterceptor {
        var loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.HEADERS
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    private fun getOkHttpClient():OkHttpClient{
        return OkHttpClient.Builder()
//            .addInterceptor(getLoggingInterceptor())
            .readTimeout(2,TimeUnit.MINUTES)
            .connectTimeout(2,TimeUnit.MINUTES)
            .build()
    }

    private fun getGson():Gson{
        return GsonBuilder()
            .setLenient()
            .serializeNulls()
            .create()
    }

    fun getMixCloudRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(getGson()))
            .client(getOkHttpClient())
            .build()

    }
}