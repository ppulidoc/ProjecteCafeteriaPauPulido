package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GlobalViewModel: ViewModel() {

    private val _pedido = MutableLiveData<Pedido>()
    val pedido: LiveData<Pedido> = _pedido


    private val _menjars = MutableLiveData<Int>()
    val menjars: LiveData<Int> = _menjars

    private val _begudes = MutableLiveData<Int>()
    val begudes: LiveData<Int> = _begudes

    private val _postres = MutableLiveData<Int>()
    val postres: LiveData<Int> = _postres

    private val _total = MutableLiveData<Int>()
    val total: LiveData<Int> = _total

}