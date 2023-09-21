package com.example.unsplash.ui.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unsplash.ui.data.repository.Repository
import com.example.unsplash.ui.model.UnSplashImage
import kotlinx.coroutines.launch

class unSplashViewModel : ViewModel() {

    private val repository = Repository()
    private val _UnSplashImages = MutableLiveData<List<UnSplashImage>>()
    val UnSplashImages : LiveData<List<UnSplashImage>> = _UnSplashImages
    fun fetchImages() {
        viewModelScope.launch {
            try {
                val images = repository.getAllImages()
                _UnSplashImages.value = images
            }catch (e :Exception) {
                println(e)
            }
        }
    }
}