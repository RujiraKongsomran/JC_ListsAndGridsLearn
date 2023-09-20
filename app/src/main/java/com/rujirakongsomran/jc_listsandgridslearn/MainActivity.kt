package com.rujirakongsomran.jc_listsandgridslearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.rujirakongsomran.jc_listsandgridslearn.model.Photo
import com.rujirakongsomran.jc_listsandgridslearn.repository.PhotoRepository

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val photoRepository = PhotoRepository()
            val getAllData = photoRepository.getAllData()
            PhotoGrid(photos = getAllData)

        }
    }

    @Composable
    fun PhotoGrid(photos: List<Photo>) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 128.dp)
        ) {
            items(photos) { photo ->
                PhotoItem(photo)
            }
        }
    }

    @Composable
    fun PhotoItem(photo: Photo) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(photo.imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = "",
            contentScale = ContentScale.Crop,
        )
    }
}
