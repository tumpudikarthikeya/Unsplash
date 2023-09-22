package com.example.unsplash.ui.di

import android.content.Context
import androidx.room.Room
import com.example.unsplash.ui.data.local.dao.DataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): DataBase {
        return Room.databaseBuilder(
            context,
            DataBase::class.java,
            "DataBase"
        ).build()
    }

}