package com.android.myapplication.retrofit.service

import com.android.myapplication.retrofit.model.TodoBean
import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Path


interface TodoApi {
    @GET("/todos/{id}")
    fun getTodos(
        @Path("id") id: Int
    ): Call<TodoBean>
}