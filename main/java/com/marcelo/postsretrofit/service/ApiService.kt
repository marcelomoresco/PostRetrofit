package com.marcelo.postsretrofit.service

import com.marcelo.postsretrofit.model.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/posts")
    fun getPosts():Call<MutableList<PostModel>>
}