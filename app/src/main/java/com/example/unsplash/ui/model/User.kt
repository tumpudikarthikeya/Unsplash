package com.example.unsplash.ui.model

import androidx.room.Embedded
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userName :String,
   @Embedded
    val userLinks :UserLinks
)
