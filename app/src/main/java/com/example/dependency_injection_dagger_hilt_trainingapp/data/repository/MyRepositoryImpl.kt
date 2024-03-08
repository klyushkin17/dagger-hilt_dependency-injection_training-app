package com.example.dependency_injection_dagger_hilt_trainingapp.data.repository

import android.app.Application
import com.example.dependency_injection_dagger_hilt_trainingapp.data.remote.MyApi
import com.example.dependency_injection_dagger_hilt_trainingapp.domain.repository.MyRepository
import java.security.PrivateKey
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository{

    override suspend fun doNetworkCall() {
    }
}