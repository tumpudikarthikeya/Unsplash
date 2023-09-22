package com.example.unsplash.ui.model


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity("UNSPLASH_IMAGE_TABLE")
data class UnSplashImage(
   @PrimaryKey(autoGenerate = false)
    val id : String,
    val likes : Int,
    @Embedded
    val user : User,
    @Embedded
    val urls : Urls
)
