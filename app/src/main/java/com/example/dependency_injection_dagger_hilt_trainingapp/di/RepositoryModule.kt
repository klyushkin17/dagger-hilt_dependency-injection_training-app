package com.example.dependency_injection_dagger_hilt_trainingapp.di

import com.example.dependency_injection_dagger_hilt_trainingapp.data.repository.MyRepositoryImpl
import com.example.dependency_injection_dagger_hilt_trainingapp.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository
}