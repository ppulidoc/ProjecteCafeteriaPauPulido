package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GlobalViewModel: ViewModel() {


    private val _menjars = MutableLiveData<Int>()
    val menjars: LiveData<Int> = _menjars

    private val _begudes = MutableLiveData<Int>()
    val begudes: LiveData<Int> = _begudes

    private val _postres = MutableLiveData<Int>()
    val postres: LiveData<Int> = _postres

    private val _total = MutableLiveData<Int>()
    val total: LiveData<Int> = _total

    fun obtainMenjar(total: Int) {
       _menjars.value = total
    }
    fun obtainBegudes(total: Int) {
        _begudes.value = total
    }
    fun obtainPostres(total: Int) {
        _postres.value = total
    }

    fun obtainPreuFinal(): Int {
        val total = (_menjars.value ?: 0) + (_begudes.value ?: 0) + (_postres.value ?: 0)
        _total.value = total
        return total
    }


}