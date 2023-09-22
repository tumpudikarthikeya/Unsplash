package com.example.unsplash.ui.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.unsplash.ui.data.repository.Repository
import com.example.unsplash.ui.model.UnSplashImage
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class unSplashViewModel @Inject constructor(
    repository: Repository
) :ViewModel()
     {

     val getAllImages = repository.getAllImages()

}