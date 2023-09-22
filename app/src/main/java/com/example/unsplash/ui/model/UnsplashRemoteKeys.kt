package com.example.unsplash.ui.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.unsplash.ui.util.Constants.UNSPLASH_REMOTE_KEYS

@Entity(UNSPLASH_REMOTE_KEYS)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id : String,
    val prevPage :Int?,
    val nextPage :Int?
)
