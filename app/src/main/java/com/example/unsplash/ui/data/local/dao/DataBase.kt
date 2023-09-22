package com.example.unsplash.ui.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unsplash.ui.model.UnSplashImage
import com.example.unsplash.ui.model.UnsplashRemoteKeys

@Database(entities = [UnSplashImage::class , UnsplashRemoteKeys::class], version = 1 )
abstract class DataBase :RoomDatabase() {

    abstract fun unSplashImageDao(): unsplashImageDao
    abstract fun unSplashRemoteKeysDao() : unsplashRemoteKeysDao
}