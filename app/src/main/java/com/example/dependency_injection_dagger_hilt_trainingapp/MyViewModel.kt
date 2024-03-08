package com.example.dependency_injection_dagger_hilt_trainingapp

import androidx.lifecycle.ViewModel
import com.example.dependency_injection_dagger_hilt_trainingapp.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
) : ViewModel() {
}