package com.example.unsplash.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import coil.compose.AsyncImage
import com.example.unsplash.ui.model.UnSplashImage


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun unSplash( viewModel: unSplashViewModel =  hiltViewModel() ) {

    val getAllImages = viewModel.getAllImages.collectAsLazyPagingItems()
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Images")}
            )
        }
    ) {

        display(getAllImages)

    }

}

@Composable
fun display(allImages: LazyPagingItems<UnSplashImage>) {

    LazyColumn(modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {

        items(allImages.itemSnapshotList) {
            AsyncImage(model = it?.urls?.regular , contentDescription = "")
        }
    }



}
