package com.example.exameneduardocerrato.MVVM

import android.content.Context
import com.example.exameneduardocerrato.Data.Mobles
import com.example.exameneduardocerrato.Data.Repository

class MoblesMVVM {
    fun afegirMoble(context: Context, nombre: String, precio: Int){
        var alumneVM =Mobles(nombre, precio)
        Repository.inserirMoble(context, alumneVM)
    }
}