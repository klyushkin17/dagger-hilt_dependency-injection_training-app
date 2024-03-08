package com.example.dependency_injection_dagger_hilt_trainingapp.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}