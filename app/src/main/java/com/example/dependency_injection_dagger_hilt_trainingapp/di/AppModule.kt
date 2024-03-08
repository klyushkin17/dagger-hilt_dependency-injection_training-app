package com.example.dependency_injection_dagger_hilt_trainingapp.di

import androidx.navigation.Navigator
import com.example.dependency_injection_dagger_hilt_trainingapp.MyApp
import com.example.dependency_injection_dagger_hilt_trainingapp.data.remote.MyApi
import com.example.dependency_injection_dagger_hilt_trainingapp.data.repository.MyRepositoryImpl
import com.example.dependency_injection_dagger_hilt_trainingapp.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("http://text.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(
        api: MyApi,
        app: MyApp,
        @Named("hello1") hello1: String
    ): MyRepository{
        return MyRepositoryImpl(api, app)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"


}