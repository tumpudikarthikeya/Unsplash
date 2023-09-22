package com.example.unsplash.ui.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.unsplash.ui.model.UnsplashRemoteKeys

@Dao
interface unsplashRemoteKeysDao {

    @Query("select * from unsplash_remote_keys where id = :id")
    suspend fun getRemoteKeys(id :String) :UnsplashRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("Delete from unsplash_remote_keys")
    suspend fun deleteAllKeys()
}