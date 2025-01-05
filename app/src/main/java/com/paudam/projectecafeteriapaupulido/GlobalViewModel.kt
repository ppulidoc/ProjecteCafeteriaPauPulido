package com.paudam.projectecafeteriapaupulido

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GlobalViewModel: ViewModel() {

    //Menjar
    private val _menjars = MutableLiveData<Int>()
    val menjars: LiveData<Int> = _menjars

    private val _magdalenas = MutableLiveData<Int>()
    val magdalenas: LiveData<Int> = _magdalenas

    private val _croissant = MutableLiveData<Int>()
    val croissant: LiveData<Int> = _croissant

    private val _entrepans = MutableLiveData<Int>()
    val entrepans: LiveData<Int> = _entrepans


    //Begudes
    private val _begudes = MutableLiveData<Int>()
    val begudes: LiveData<Int> = _begudes

    private val _cafe = MutableLiveData<Int>()
    val cafe: LiveData<Int> = _cafe

    private val _xoco = MutableLiveData<Int>()
    val xoco: LiveData<Int> = _xoco

    private val _suc = MutableLiveData<Int>()
    val suc: LiveData<Int> = _suc



    //Postres
    private val _postres = MutableLiveData<Int>()
    val postres: LiveData<Int> = _postres

    private val _trufes = MutableLiveData<Int>()
    val trufes: LiveData<Int> = _trufes

    private val _flam = MutableLiveData<Int>()
    val flam: LiveData<Int> = _flam


    //Total
    private val _total = MutableLiveData<Int>()
    val total: LiveData<Int> = _total


    //Menjar funcions
    fun obtainMagPreuTotal(preuMagTot: Int): Int {
        _magdalenas.value = preuMagTot
       return preuMagTot
    }
    fun pintarPreuMag(): Int? {
        var preu = _magdalenas.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainCroisPreuTotal(preuCroisTot: Int): Int {
        _croissant.value = preuCroisTot
        return preuCroisTot
    }
    fun pintarPreuCrois(): Int? {
        var preu = _croissant.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainEPreuTotal(preuEntrepaTot: Int): Int {
        _entrepans.value = preuEntrepaTot
        return preuEntrepaTot
    }
    fun pintarPreuE(): Int? {
        var preu = _entrepans.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainMenjar(total: Int) {
       _menjars.value = total

    }


    //Begudes funcions
    fun obtainCafePreuTotal(preuCafeTot: Int): Int {
        _cafe.value = preuCafeTot
        return preuCafeTot
    }
    fun pintarPreuCafe(): Int? {
        var preu = _cafe.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainXocoPreuTotal(preuXocoTot: Int): Int {
        _xoco.value = preuXocoTot
        return preuXocoTot
    }
    fun pintarPreuXoco(): Int? {
        var preu = _xoco.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainSucPreuTotal(preuSucTot: Int): Int {
        _suc.value = preuSucTot
        return preuSucTot
    }
    fun pintarPreuSuc(): Int? {
        var preu = _suc.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainBegudes(total: Int) {
        _begudes.value = total
    }



    //Funcions Postres
    fun obtainTrufesPreuTotal(preuTrufesTot: Int): Int {
        _trufes.value = preuTrufesTot
        return preuTrufesTot
    }
    fun pintarPreuTrufes(): Int? {
        var preu = _trufes.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainFlamPreuTotal(preuFlamTot: Int): Int {
        _flam.value = preuFlamTot
        return preuFlamTot
    }
    fun pintarPreuFlam(): Int? {
        var preu = _flam.value
        if (preu == null){
            preu = 0
        }
        return preu
    }

    fun obtainPostres(total: Int) {
        _postres.value = total
    }


    //Otras funciones
    fun obtainPreuFinal(): Int {
        val total = (_menjars.value ?: 0) + (_begudes.value ?: 0) + (_postres.value ?: 0)
        _total.value = total
        return total
    }


    // Función para actualizar el total
    fun updateTotal(newTotal: Int) {
        _total.value = (_total.value ?: 0) + (newTotal)
    }

    // Función para obtener el total actual
    fun getTotal(): Int {
        return _total.value ?: 0
    }




}