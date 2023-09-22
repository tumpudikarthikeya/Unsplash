package com.example.unsplash.ui.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.unsplash.ui.data.local.dao.DataBase
import com.example.unsplash.ui.data.paging.UnsplashRemoteMediator
import com.example.unsplash.ui.data.remote.UnSplashAPI
import com.example.unsplash.ui.model.UnSplashImage
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val unSplashAPI: UnSplashAPI,
    private val dataBase: DataBase
) {
    @OptIn(ExperimentalPagingApi::class)
    fun getAllImages(): Flow<PagingData<UnSplashImage>> {
        val pagingSourceFactory = { dataBase.unSplashImageDao().getAllImages() }
        return Pager(
            config = PagingConfig(pageSize = 10),
            remoteMediator = UnsplashRemoteMediator(
                unSplashAPI = unSplashAPI,
                dataBase = dataBase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }
}