package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    // Crear un LiveData
    private val _liveData = MutableLiveData<String>()
    val liveData: LiveData<String> get() = _liveData

    // Método para actualizar el LiveData

    fun updateLiveData(value: String) {
        _liveData.value = value
    }
}