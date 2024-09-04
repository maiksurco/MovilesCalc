package com.example.navegacionjpc.api

import retrofit2.Call
import retrofit2.http.GET
import com.example.navegacionjpc.modelo.User

interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<User>>
}