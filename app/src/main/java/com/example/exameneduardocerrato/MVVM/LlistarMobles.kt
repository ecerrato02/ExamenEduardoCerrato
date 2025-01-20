package com.example.exameneduardocerrato.MVVM

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.exameneduardocerrato.Data.Mobles
import com.example.exameneduardocerrato.Data.Repository

class LlistarMobles : ViewModel() {

    // MutableLiveData!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private var _llista_moble: LiveData<List<Mobles>>?=null
    val llista_moble: LiveData<List<Mobles>>?
        get()=_llista_moble


    //funció obtenirMobles

    fun llistarMoble(context: Context) {
        _llista_moble = Repository.obtenirMoble(context)
    }
}