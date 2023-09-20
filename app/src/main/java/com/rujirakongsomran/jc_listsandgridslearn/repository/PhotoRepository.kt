package com.rujirakongsomran.jc_listsandgridslearn.repository

import com.rujirakongsomran.jc_listsandgridslearn.model.Photo

class PhotoRepository {
    fun getAllData() =
        listOf(
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2017/09/25/13/12/puppy-2785074_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2016/02/18/18/37/puppy-1207816_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2015/11/17/13/13/puppy-1047521_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2018/05/11/08/11/dog-3389729_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2017/07/31/21/15/dog-2561134_1280.jpg"),
            Photo(imageUrl = "https://cdn.pixabay.com/photo/2014/04/05/11/40/dog-316598_1280.jpg"),
        )
}