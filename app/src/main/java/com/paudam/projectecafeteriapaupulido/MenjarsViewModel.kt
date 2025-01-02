package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenjarsViewModel: ViewModel() {

    private val _menjars = MutableLiveData<Int>()
    val menjars: LiveData<Int> get() = _menjars

    //Magdalenas
    private val _magdalenas = MutableLiveData<Int>()
    val magdalenas: LiveData<Int> get() = _magdalenas

    private val _magdalenasQ = MutableLiveData<Int>()
    val magdalenasQ: LiveData<Int> get() = _magdalenasQ

    private val _magdalenasP = MutableLiveData<Int>()
    val magdalenasP: LiveData<Int> get() = _magdalenasP

    private val _magdalenasT = MutableLiveData<Int>()
    val magdalenasT: LiveData<Int> get() = _magdalenasT

    fun updateMadalenas(quant: Int, preu: Int):Int {
        _magdalenasQ.value = quant
        _magdalenasP.value = preu
        val totalMagdalenas = (_magdalenasQ.value ?: 0) * (_magdalenasP.value ?: 0)
        _magdalenasT.value = totalMagdalenas
        return totalMagdalenas
    }


    //Croissants
    private val _croissant = MutableLiveData<Int>()
    val croissant: LiveData<Int> get() = _croissant

    private val _croissantQ = MutableLiveData<Int>()
    val croissantQ: LiveData<Int> get() = _croissantQ

    private val _croissantP = MutableLiveData<Int>()
    val croissantP: LiveData<Int> get() = _croissantP

    private val _croissantT = MutableLiveData<Int>()
    val croissantT: LiveData<Int> get() = _croissantT

    fun updateCroissants(quant: Int, preu: Int): Int {
        _croissantQ.value = quant
        _croissantP.value = preu
        val totalCroissant = (_croissantQ.value ?: 0) * (_croissantP.value ?: 0)
        _croissantT.value = totalCroissant
        return totalCroissant
    }


    //Entrepa
    private val _entrepa = MutableLiveData<Int>()
    val entrepa: LiveData<Int> get() = _entrepa

    private val _entrepaQ = MutableLiveData<Int>()
    val entrepaQ: LiveData<Int> get() = _entrepaQ

    private val _entrepaP = MutableLiveData<Int>()
    val entrepaP: LiveData<Int> get() = _entrepaP

    private val _entrepaT = MutableLiveData<Int>()
    val entrepaT: LiveData<Int> get() = _entrepaT

    fun updateEntrepa(quant: Int, preu: Int): Int {
        _entrepaQ.value = quant
        _entrepaP.value = preu
        val totalEntrepa = (_entrepaQ.value ?: 0) * (_entrepaP.value ?: 0)
        _entrepaT.value = totalEntrepa
        return totalEntrepa
    }


    fun totalMenjars(): Int {
        val sumaTotal = (_magdalenasT.value ?: 0) + (_croissantT.value ?: 0) + (_entrepaT.value ?: 0)
        _menjars.value = sumaTotal
        return sumaTotal
    }


}