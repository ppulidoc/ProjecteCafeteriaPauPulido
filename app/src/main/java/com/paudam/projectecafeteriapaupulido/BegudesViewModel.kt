package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BegudesViewModel: ViewModel() {

    private val _begudes = MutableLiveData<Int>()
    val begudes: LiveData<Int> get() = _begudes


    //Cafe
    private val _cafe = MutableLiveData<Int>()
    val cafe: LiveData<Int> get() = _cafe

    private val _cafeQ = MutableLiveData<Int>()
    val cafeQ: LiveData<Int> get() = _cafeQ

    private val _cafeP = MutableLiveData<Int>()
    val cafeP: LiveData<Int> get() = _cafeP

    private val _cafeT = MutableLiveData<Int>()
    val cafeT: LiveData<Int> get() = _cafeT

    fun updateCafe(quant: Int, preu: Int): Int {
        _cafeQ.value = quant
        _cafeP.value = preu
        val totalCafe = (_cafeQ.value ?: 0) * (_cafeP.value ?: 0)
        _cafeT.value = totalCafe
        return totalCafe
    }


    //Suc
    private val _suc = MutableLiveData<Int>()
    val suc: LiveData<Int> get() = _suc

    private val _sucQ = MutableLiveData<Int>()
    val sucQ: LiveData<Int> get() = _sucQ

    private val _sucP = MutableLiveData<Int>()
    val sucP: LiveData<Int> get() = _sucP

    private val _sucT = MutableLiveData<Int>()
    val sucT: LiveData<Int> get() = _sucT

    fun updateSuc(quant: Int, preu: Int): Int {
        _sucQ.value = quant
        _sucP.value = preu
        val totalSuc= (_sucQ.value ?: 0) * (_sucP.value ?: 0)
        _sucT.value = totalSuc
        return totalSuc
    }


    //Xoco
    private val _xoco = MutableLiveData<Int>()
    val xoco: LiveData<Int> get() = _xoco

    private val _xocoQ = MutableLiveData<Int>()
    val xocoQ: LiveData<Int> get() = _xocoQ

    private val _xocoP = MutableLiveData<Int>()
    val xocoP: LiveData<Int> get() = _xocoP

    private val _xocoT = MutableLiveData<Int>()
    val xocoT: LiveData<Int> get() = _xocoT

    fun updateXoco(quant: Int, preu: Int):Int {
        _xocoQ.value = quant
        _xocoP.value = preu
        val totalXoco = (_xocoQ.value ?: 0) * (_xocoP.value ?: 0)
        _xocoT.value = totalXoco
        return totalXoco
    }


    fun totalBegudes(): Int {
        val sumaTotal = (_cafeT.value ?: 0) + (_sucT.value ?: 0) + (_xocoT.value ?: 0)
        _begudes.value = sumaTotal
        return sumaTotal

    }



}