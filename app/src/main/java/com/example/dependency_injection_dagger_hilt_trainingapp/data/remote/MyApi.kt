package com.example.dependency_injection_dagger_hilt_trainingapp.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("test")
    suspend fun doNetworkCall()
}