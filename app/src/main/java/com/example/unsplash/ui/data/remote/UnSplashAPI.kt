package com.example.unsplash.ui.data.remote

import com.example.unsplash.ui.model.UnSplashImage
import com.example.unsplash.ui.util.Constants.unsplashapikey
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnSplashAPI {
    @Headers("Authorization: Client-ID $unsplashapikey")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page :Int,
        @Query("per_page") perPage :Int
    ):List<UnSplashImage>
}