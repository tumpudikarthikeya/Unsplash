package com.example.unsplash.ui.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.unsplash.ui.model.UnSplashImage

@Dao
interface unsplashImageDao {

    @Query("select * from unsplash_image_table")
     fun getAllImages() :PagingSource<Int,UnSplashImage>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images: List<UnSplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}