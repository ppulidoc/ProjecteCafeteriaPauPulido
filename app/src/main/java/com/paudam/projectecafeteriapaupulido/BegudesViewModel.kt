package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BegudesViewModel: ViewModel() {

    private val _begudes = MutableLiveData<Pedido>()
    val begudes: LiveData<Pedido> = _begudes



}