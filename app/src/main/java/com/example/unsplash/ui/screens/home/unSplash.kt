package com.example.unsplash.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kotlinx.coroutines.launch


@Composable
fun unSplash( viewModel: unSplashViewModel) {
    val images by viewModel.UnSplashImages.observeAsState(emptyList())
    LaunchedEffect(Unit) {
        viewModel.fetchImages()
    }
    Column {
        if (images.isEmpty()){
            Text(text = "Loading....")
        }
        else{
            images.forEach {
                AsyncImage(model = it.urls.regular,
                    contentDescription = "notLoaded" ,
                    modifier = Modifier.padding(20.dp))
            }
            Text(text = images.toString())
        }
    }
}