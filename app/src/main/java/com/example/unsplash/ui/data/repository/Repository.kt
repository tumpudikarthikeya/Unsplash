package com.example.unsplash.ui.data.repository

import com.example.unsplash.ui.di.NetworkModule
import com.example.unsplash.ui.model.UnSplashImage

class Repository {
    private val unSplashInstance = NetworkModule.provideUnSplashAPI()
    suspend fun getAllImages() : List<UnSplashImage> {
        return unSplashInstance.getAllImages(page = 1 , perPage = 10)
    }
}