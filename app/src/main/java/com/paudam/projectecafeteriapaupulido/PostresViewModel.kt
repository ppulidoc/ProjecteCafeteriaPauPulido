package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class PostresViewModel: ViewModel() {

    private val _postres = MutableLiveData<Int>()
    val postres: LiveData<Int> get() = _postres

    //Trufes
    private val _trufes = MutableLiveData<Int>()
    val trufes: LiveData<Int> get() = _trufes

    private val _trufesQ = MutableLiveData<Int>()
    val trufesQ: LiveData<Int> get() = _trufesQ

    private val _trufesP = MutableLiveData<Int>()
    val trufesP: LiveData<Int> get() = _trufesP

    private val _trufesT = MutableLiveData<Int>()
    val trufesT: LiveData<Int> get() = _trufesT

    fun updateTrufes(quant: Int, preu: Int): Int{
        _trufesQ.value = quant
        _trufesP.value = preu
        val totalTrufes = (_trufesQ.value ?: 0) * (_trufesP.value ?: 0)
        _trufesT.value = totalTrufes
        return totalTrufes
    }

    //Flam

    private val _flam = MutableLiveData<Int>()
    val flam: LiveData<Int> get() = _flam

    private val _flamQ = MutableLiveData<Int>()
    val flamQ: LiveData<Int> get() = _flamQ

    private val _flamP = MutableLiveData<Int>()
    val flamP: LiveData<Int> get() = _flamP

    private val _flamT = MutableLiveData<Int>()
    val flamT: LiveData<Int> get() = _flamT

    fun updateFlam(quant: Int, preu: Int):Int {
        _flamQ.value = quant
        _flamP.value = preu
        val totalFlams = (_flamQ.value ?: 0) * (_flamP.value ?: 0)
        _flamT.value = totalFlams
        return totalFlams
    }

    fun totalPostres(): Int {
        val sumaTotal = (_trufesT.value ?: 0) + (flamT.value ?: 0)
        _postres.value = sumaTotal
        return sumaTotal

    }

}