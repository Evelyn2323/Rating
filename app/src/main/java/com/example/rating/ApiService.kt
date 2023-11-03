package com.example.rating

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("http://127.0.0.1:8000") // Cambia "login" por la URL de inicio de sesión de tu API
    fun login(@Body request: LoginRequest): Call<User>
}
